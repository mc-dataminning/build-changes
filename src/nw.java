import java.util.function.UnaryOperator;

public class nw {
   @Deprecated
   public static akt a(String $$0) {
      return new akt("minecraft", "block/" + $$0);
   }

   public static akt b(String $$0) {
      return new akt("minecraft", "item/" + $$0);
   }

   public static akt a(dfc $$0, String $$1) {
      akt $$2 = lh.e.b($$0);
      return $$2.a((UnaryOperator<String>)($$1x -> "block/" + $$1x + $$1));
   }

   public static akt a(dfc $$0) {
      akt $$1 = lh.e.b($$0);
      return $$1.d("block/");
   }

   public static akt a(cuc $$0) {
      akt $$1 = lh.h.b($$0);
      return $$1.d("item/");
   }

   public static akt a(cuc $$0, String $$1) {
      akt $$2 = lh.h.b($$0);
      return $$2.a((UnaryOperator<String>)($$1x -> "item/" + $$1x + $$1));
   }
}
