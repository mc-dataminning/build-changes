import java.util.function.UnaryOperator;

public class nq {
   @Deprecated
   public static akf a(String $$0) {
      return new akf("minecraft", "block/" + $$0);
   }

   public static akf b(String $$0) {
      return new akf("minecraft", "item/" + $$0);
   }

   public static akf a(dcv $$0, String $$1) {
      akf $$2 = lc.e.b($$0);
      return $$2.a((UnaryOperator<String>)($$1x -> "block/" + $$1x + $$1));
   }

   public static akf a(dcv $$0) {
      akf $$1 = lc.e.b($$0);
      return $$1.d("block/");
   }

   public static akf a(cry $$0) {
      akf $$1 = lc.h.b($$0);
      return $$1.d("item/");
   }

   public static akf a(cry $$0, String $$1) {
      akf $$2 = lc.h.b($$0);
      return $$2.a((UnaryOperator<String>)($$1x -> "item/" + $$1x + $$1));
   }
}
