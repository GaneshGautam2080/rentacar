package com.comit.rentacar.util;

public class Util {
	

		public static int parseId(String id) {
			
			return (id==null) ? 0:Integer.parseInt(id);
		}
		
		public static int parseYear(String year) {
			
			return (year==null) ? 0:Integer.parseInt(year);
		}

		public static int parseKm(String km) {
	
			return (km==null) ? 0:Integer.parseInt(km);
		}


}
