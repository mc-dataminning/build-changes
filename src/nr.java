import java.util.function.UnaryOperator;

public class nr {
   @Deprecated
   public static akh a(String $$0) {
      return new akh("minecraft", "block/" + $$0);
   }

   public static akh b(String $$0) {
      return new akh("minecraft", "item/" + $$0);
   }

   public static akh a(dde $$0, String $$1) {
      akh $$2 = ld.e.b($$0);
      return $$2.a((UnaryOperator<String>)($$1x -> "block/" + $$1x + $$1));
   }

   public static akh a(dde $$0) {
      akh $$1 = ld.e.b($$0);
      return $$1.d("block/");
   }

   public static akh a(csu $$0) {
      akh $$1 = ld.h.b($$0);
      return $$1.d("item/");
   }

   public static akh a(csu $$0, String $$1) {
      akh $$2 = ld.h.b($$0);
      return $$2.a((UnaryOperator<String>)($$1x -> "item/" + $$1x + $$1));
   }
}
