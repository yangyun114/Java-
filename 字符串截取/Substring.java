public static void main(String[] args) {
		String img = "155555.jpg";
		int index = img.indexOf(".");
		String prefix = img.substring(0, index);
		String suffix = img.substring(index);
		StringBuffer sb = new StringBuffer(prefix);
		String unitImgCompress = sb.append("_compress").append(suffix).toString();
		System.out.println(unitImgCompress);
	}
