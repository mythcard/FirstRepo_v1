import java.util.Arrays;

public class stringSpace {
	public char[] replaceSpaces(char[] str, int length){
		int spaceCount =0, newLength, i =0;
		for(i=0; i< length; i++){
			if (str[i] == ' '){
				spaceCount++;
			}
		}
		System.out.println(Arrays.toString(str));
		newLength = length + spaceCount * 2;
		char[] str2    = new char[newLength];
		System.arraycopy(str, 0, str2, 0, str.length);
		for(i = length-1; i>=0 ; i--){
			if (str[i] == ' '){
				str2[newLength -1] = '0';
				str2[newLength -2] = '2';
				str2[newLength -3] = '%';
				newLength = newLength -3;
			}
			else{
				str2[newLength - 1] = str[i];
				newLength = newLength - 1;
			}
		}
		return str2;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] str2 = new char[100];
//		str = 'one exam';
		char[] str = {'O','n','e',' ','e','x','a','m'};
		int len = str.length;
//		System.out.println(len);
//		for(int k =0; k< len;k++){
//			System.out.println(str[k]);
//		}
		stringSpace s1 = new stringSpace();
		str2 = s1.replaceSpaces(str, len);
		int len1 = str2.length;
		for(int k =0; k< len1;k++){
			System.out.println(str2[k]);
		}
	}

}
