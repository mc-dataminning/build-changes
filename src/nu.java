import java.util.function.UnaryOperator;

public class nu {
   @Deprecated
   public static akm a(String $$0) {
      return new akm("minecraft", "block/" + $$0);
   }

   public static akm b(String $$0) {
      return new akm("minecraft", "item/" + $$0);
   }

   public static akm a(ddy $$0, String $$1) {
      akm $$2 = le.e.b($$0);
      return $$2.a((UnaryOperator<String>)($$1x -> "block/" + $$1x + $$1));
   }

   public static akm a(ddy $$0) {
      akm $$1 = le.e.b($$0);
      return $$1.d("block/");
   }

   public static akm a(ctj $$0) {
      akm $$1 = le.h.b($$0);
      return $$1.d("item/");
   }

   public static akm a(ctj $$0, String $$1) {
      akm $$2 = le.h.b($$0);
      return $$2.a((UnaryOperator<String>)($$1x -> "item/" + $$1x + $$1));
   }
}
