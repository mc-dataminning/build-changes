import java.util.function.UnaryOperator;

public class of {
   @Deprecated
   public static ale a(String $$0) {
      return new ale("minecraft", "block/" + $$0);
   }

   public static ale b(String $$0) {
      return new ale("minecraft", "item/" + $$0);
   }

   public static ale a(dey $$0, String $$1) {
      ale $$2 = lp.e.b($$0);
      return $$2.a((UnaryOperator<String>)($$1x -> "block/" + $$1x + $$1));
   }

   public static ale a(dey $$0) {
      ale $$1 = lp.e.b($$0);
      return $$1.d("block/");
   }

   public static ale a(cuj $$0) {
      ale $$1 = lp.h.b($$0);
      return $$1.d("item/");
   }

   public static ale a(cuj $$0, String $$1) {
      ale $$2 = lp.h.b($$0);
      return $$2.a((UnaryOperator<String>)($$1x -> "item/" + $$1x + $$1));
   }
}
