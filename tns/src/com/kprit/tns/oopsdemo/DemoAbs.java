package com.kprit.tns.oopsdemo;

		public class DemoAbs extends ATM{

			@Override
			void withdraw() {
		        System.out.println("call respective bankserver");
			}

			@Override
			void credit() {
		        System.out.println("check account credentials to deposit");
			}

			@Override
			void ministatement() {
		        System.out.println("prints the transactions");
			}
			
			public static void main(String[] args) {
		         ATM obj=new DemoAbs();
		         obj.withdraw();
		         obj.credit();
		         obj.ministatement();
			}
		}

