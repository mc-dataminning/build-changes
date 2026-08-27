import java.util.function.UnaryOperator;

public class nh {
   @Deprecated
   public static ajv a(String $$0) {
      return new ajv("minecraft", "block/" + $$0);
   }

   public static ajv b(String $$0) {
      return new ajv("minecraft", "item/" + $$0);
   }

   public static ajv a(dch $$0, String $$1) {
      ajv $$2 = kt.e.b($$0);
      return $$2.a((UnaryOperator<String>)($$1x -> "block/" + $$1x + $$1));
   }

   public static ajv a(dch $$0) {
      ajv $$1 = kt.e.b($$0);
      return $$1.d("block/");
   }

   public static ajv a(crn $$0) {
      ajv $$1 = kt.h.b($$0);
      return $$1.d("item/");
   }

   public static ajv a(crn $$0, String $$1) {
      ajv $$2 = kt.h.b($$0);
      return $$2.a((UnaryOperator<String>)($$1x -> "item/" + $$1x + $$1));
   }
}
