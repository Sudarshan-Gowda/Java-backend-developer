package com.star.sud.exception;

import java.io.FileInputStream;

public class CompileTimeExceptionExample {

	public static void main(String[] args) {

	}

	void checkedExceptionWithoutTryCatch() {
		/*
		 * This constructor FileInputStream(File filename) throws FileNotFoundException
		 * which is a checked exception
		 */
		// FileInputStream fis = new FileInputStream("B:/myfile.txt");
		// int k;

		/*
		 * Method read() of FileInputStream class also throws a checked exception:
		 * IOException
		 */
		// while ((k = fis.read()) != -1) {
		// System.out.print((char) k);
		// }

		/*
		 * The method close() closes the file input stream It throws IOException
		 */
		// fis.close();
	}

	void checkedExceptionWithTryCatch() {

		try {

			/*
			 * This constructor FileInputStream(File filename) throws FileNotFoundException
			 * which is a checked exception
			 */
			FileInputStream fis = new FileInputStream("B:/myfile.txt");
			int k;

			/*
			 * Method read() of FileInputStream class also throws a checked exception:
			 * IOException
			 */
			while ((k = fis.read()) != -1) {
				System.out.print((char) k);
			}

			/*
			 * The method close() closes the file input stream It throws IOException
			 */
			fis.close();

		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
