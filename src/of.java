import java.util.function.UnaryOperator;

public class of {
   @Deprecated
   public static alf a(String $$0) {
      return new alf("minecraft", "block/" + $$0);
   }

   public static alf b(String $$0) {
      return new alf("minecraft", "item/" + $$0);
   }

   public static alf a(dfb $$0, String $$1) {
      alf $$2 = lp.e.b($$0);
      return $$2.a((UnaryOperator<String>)($$1x -> "block/" + $$1x + $$1));
   }

   public static alf a(dfb $$0) {
      alf $$1 = lp.e.b($$0);
      return $$1.d("block/");
   }

   public static alf a(cum $$0) {
      alf $$1 = lp.h.b($$0);
      return $$1.d("item/");
   }

   public static alf a(cum $$0, String $$1) {
      alf $$2 = lp.h.b($$0);
      return $$2.a((UnaryOperator<String>)($$1x -> "item/" + $$1x + $$1));
   }
}
