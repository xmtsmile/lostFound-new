package io.xmt.lost.util;

/**
 * @Author fisheax
 * @Date 3/20/2017
 */
public class FileUtil
{
	/**
	 * 获取文件扩展名
	 * @param fileName
	 * @return
	 */
	public static String getFileExtName(String fileName)
	{
		int dotIndex = -1;
		if (fileName == null || "".equals(fileName.trim())
			|| (dotIndex = fileName.lastIndexOf(".")) == -1)
		{
			return "";
		}
		
		return fileName.substring(dotIndex + 1);
	}
}
