/*
 * TwentyFour.java
 * Copyright (C) 2014 Matheus Dal Mago <matheusdalmago10@hotmail.com>
 *
 * Distributed under terms of the MIT license.
 */

import java.util.ArrayList;
import java.util.Scanner;

public class TwentyFour {
	private final double CONSTANT = 24;
	private final boolean STOP; // if true, the program stops when find the
								// first group of occurrences
	private final char[] op = { '+', '-', '*', '/' };

	private int[] input;
	private int[][] permInput;
	private char[][] permOp;
	private int i; // auxiliary index

	private ArrayList<Double> ans;
	private ArrayList<String> equations;

	public TwentyFour(int[] input) {
		STOP = false;

		this.input = input;
		ans = new ArrayList<Double>();
		equations = new ArrayList<String>();

		calculatePermutations();
	}

	public void calculateEquations() {

		for (int i = 0; i < permInput.length; i++) {
			for (int j = 0; j < permOp.length; j++) {

				// ((0 x 0) x 0) x 0
				ans.add(solve(
						(solve((solve(permInput[i][0], permInput[i][1],
								permOp[j][0])), permInput[i][2], permOp[j][1])),
						permInput[i][3], permOp[j][2]));

				equations.add("((" + permInput[i][0] + "" + permOp[j][0] + ""
						+ permInput[i][1] + ")" + permOp[j][1] + ""
						+ +permInput[i][2] + ")" + permOp[j][2] + ""
						+ +permInput[i][3]);
				if (ans.contains(CONSTANT) && STOP)
					return;

				// (0 x 0) x (0 x 0)
				ans.add(solve(
						solve(permInput[i][0], permInput[i][1], permOp[j][0]),
						solve(permInput[i][2], permInput[i][3], permOp[j][2]),
						permOp[j][1]));

				equations.add("(" + permInput[i][0] + "" + permOp[j][0] + ""
						+ permInput[i][1] + ")" + permOp[j][1] + "("
						+ permInput[i][2] + "" + permOp[j][2] + ""
						+ permInput[i][3] + ")");
				if (ans.contains(CONSTANT) && STOP)
					return;

				// (0 x (0 x 0)) x 0
				ans.add(solve(
						solve(permInput[i][0],
								(solve(permInput[i][1], permInput[i][2],
										permOp[j][1])), permOp[j][0]),
						permInput[i][3], permOp[j][2]));

				equations.add("(" + permInput[i][0] + "" + permOp[j][0] + "("
						+ permInput[i][1] + "" + permOp[j][1] + ""
						+ permInput[i][2] + "))" + permOp[j][2] + ""
						+ permInput[i][3]);
				if (ans.contains(CONSTANT) && STOP)
					return;

				// 0 x ((0 x 0) x 0)
				ans.add(solve(
						permInput[i][0],
						solve(solve(permInput[i][1], permInput[i][2],
								permOp[j][1]), permInput[i][3], permOp[j][2]),
						permOp[j][0]));

				equations.add(permInput[i][0] + "" + permOp[j][0] + "(("
						+ permInput[i][1] + "" + permOp[j][1] + ""
						+ permInput[i][2] + ")" + permOp[j][2] + ""
						+ permInput[i][3] + ")");
				if (ans.contains(CONSTANT) && STOP)
					return;

				// 0 x (0 x (0 x 0))
				ans.add(solve(
						permInput[i][0],
						solve(permInput[i][1],
								solve(permInput[i][2], permInput[i][3],
										permOp[j][2]), permOp[j][1]),
						permOp[j][0]));

				equations.add(permInput[i][0] + "" + permOp[j][0] + "("
						+ permInput[i][1] + "" + permOp[j][1] + "("
						+ permInput[i][2] + "" + permOp[j][2] + ""
						+ permInput[i][3] + "))");
				if (ans.contains(CONSTANT) && STOP)
					return;
			}
		}
	}

	private double solve(double x, double y, char op) {
		switch (op) {
		case '+':
			return x + y;
		case '-':
			return x - y;
		case '*':
			return x * y;
		case '/':
			return x / y;
		default:
			System.out.println("Not supported operation: " + x + " " + op + " "
					+ y);
			System.exit(-1);
		}
        return 0;
	}

	private void calculatePermutations() {
		this.i = 0;
		permInput = new int[24][];
		permNumbers(new int[0], input);

		this.i = 0;
		permOp = new char[(int) Math.pow(op.length, input.length - 1)][];
		for (int i = 0; i < op.length; i++)
			permOp(new char[0], i);
	}

	private void permOp(char[] pre, int opNumber) {
		char[] op = new char[pre.length + 1];
		System.arraycopy(pre, 0, op, 0, pre.length);

		for (int j = 0; j < this.op.length; j++) {

			op[op.length - 1] = this.op[opNumber];

			if (op.length == this.input.length - 1) {
				permOp[this.i++] = op;
				return;
			} else
				permOp(op, j);
		}
	}

	private void permNumbers(int[] pre, int[] pos) {
		if (pos.length == 0)
			permInput[this.i++] = pre;
		else {
			for (int k = 0; k < pos.length; k++) {
				int[] i = new int[pre.length + 1];
				int[] j = new int[pos.length - 1];

				System.arraycopy(pre, 0, i, 0, pre.length);
				i[i.length - 1] = pos[k];

				System.arraycopy(pos, 0, j, 0, k);
				System.arraycopy(pos, k + 1, j, k, pos.length - k - 1);

				permNumbers(i, j);
			}
		}
	}

	public ArrayList<Double> getAns() {
		return ans;
	}

	public ArrayList<String> getEquations() {
		return equations;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int[] values = new int[4];

		System.out.println("Type four numbers:");

		int i = 0;
		while (i < 4) {
			values[i] = input.nextInt();
			if (values[i] == 0) {
				System.out
						.println("Number zero not supported\nType another number:");
			} else
				i++;
		}

		TwentyFour tf = new TwentyFour(values);
		tf.calculateEquations();

        ArrayList<Double> answer = tf.getAns();
        ArrayList<String> equations = tf.getEquations();

        boolean found = false;
        for (int j=0; j<answer.size(); j++){
            double x = Math.round(answer.get(j)*100);
            x/=100;

            if (x == 24.0 && !found){
                System.out.println(equations.get(j));
                found = true;
            }

        }
        if (! found)
            System.out.println("Pattern not found with these numbers");
    }
}
