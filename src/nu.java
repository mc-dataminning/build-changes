import java.util.function.UnaryOperator;

public class nu {
   @Deprecated
   public static akn a(String $$0) {
      return new akn("minecraft", "block/" + $$0);
   }

   public static akn b(String $$0) {
      return new akn("minecraft", "item/" + $$0);
   }

   public static akn a(dea $$0, String $$1) {
      akn $$2 = le.e.b($$0);
      return $$2.a((UnaryOperator<String>)($$1x -> "block/" + $$1x + $$1));
   }

   public static akn a(dea $$0) {
      akn $$1 = le.e.b($$0);
      return $$1.d("block/");
   }

   public static akn a(ctl $$0) {
      akn $$1 = le.h.b($$0);
      return $$1.d("item/");
   }

   public static akn a(ctl $$0, String $$1) {
      akn $$2 = le.h.b($$0);
      return $$2.a((UnaryOperator<String>)($$1x -> "item/" + $$1x + $$1));
   }
}
