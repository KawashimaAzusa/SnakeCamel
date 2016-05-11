package snakecamel;

public class debug {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SnakeCamelUtil scu = new SnakeCamelUtil();
		System.out.println("a→"+scu.capitalize("a"));
		System.out.println("xyz→"+scu.capitalize("xyz"));
		System.out.println("A→"+scu.uncapitalize("A"));
		System.out.println("Xyz→"+scu.uncapitalize("Xyz"));
		System.out.println("abc→"+scu.snakeToCamelcase("abc"));
		System.out.println("abc_def→"+scu.snakeToCamelcase("abc_def"));
		System.out.println("abc_def_gh→"+scu.snakeToCamelcase("abc_def_gh"));
		System.out.println("abc__def__gh→"+scu.snakeToCamelcase("abc__def__gh"));
		System.out.println("_abc_def__→"+scu.snakeToCamelcase("_abc_def__"));
		System.out.println("Abc→"+scu.camelToSnakecase("Abc"));
		System.out.println("AbcDef→"+scu.camelToSnakecase("AbcDef"));
		System.out.println("AbcDefGh→"+scu.camelToSnakecase("abc_def_gh"));
	}

}
