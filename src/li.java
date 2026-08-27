import java.util.function.UnaryOperator;

public class li {
   @Deprecated
   public static aey a(String $$0) {
      return new aey("minecraft", "block/" + $$0);
   }

   public static aey b(String $$0) {
      return new aey("minecraft", "item/" + $$0);
   }

   public static aey a(csx $$0, String $$1) {
      aey $$2 = jd.f.b($$0);
      return $$2.a((UnaryOperator<String>)($$1x -> "block/" + $$1x + $$1));
   }

   public static aey a(csx $$0) {
      aey $$1 = jd.f.b($$0);
      return $$1.d("block/");
   }

   public static aey a(cjc $$0) {
      aey $$1 = jd.i.b($$0);
      return $$1.d("item/");
   }

   public static aey a(cjc $$0, String $$1) {
      aey $$2 = jd.i.b($$0);
      return $$2.a((UnaryOperator<String>)($$1x -> "item/" + $$1x + $$1));
   }
}
