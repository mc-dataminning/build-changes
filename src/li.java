import java.util.function.UnaryOperator;

public class li {
   @Deprecated
   public static aex a(String $$0) {
      return new aex("minecraft", "block/" + $$0);
   }

   public static aex b(String $$0) {
      return new aex("minecraft", "item/" + $$0);
   }

   public static aex a(csv $$0, String $$1) {
      aex $$2 = jd.f.b($$0);
      return $$2.a((UnaryOperator<String>)($$1x -> "block/" + $$1x + $$1));
   }

   public static aex a(csv $$0) {
      aex $$1 = jd.f.b($$0);
      return $$1.d("block/");
   }

   public static aex a(cja $$0) {
      aex $$1 = jd.i.b($$0);
      return $$1.d("item/");
   }

   public static aex a(cja $$0, String $$1) {
      aex $$2 = jd.i.b($$0);
      return $$2.a((UnaryOperator<String>)($$1x -> "item/" + $$1x + $$1));
   }
}
