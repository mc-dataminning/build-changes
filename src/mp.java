import java.util.function.UnaryOperator;

public class mp {
   @Deprecated
   public static aiy a(String $$0) {
      return new aiy("minecraft", "block/" + $$0);
   }

   public static aiy b(String $$0) {
      return new aiy("minecraft", "item/" + $$0);
   }

   public static aiy a(cys $$0, String $$1) {
      aiy $$2 = kf.e.b($$0);
      return $$2.a((UnaryOperator<String>)($$1x -> "block/" + $$1x + $$1));
   }

   public static aiy a(cys $$0) {
      aiy $$1 = kf.e.b($$0);
      return $$1.d("block/");
   }

   public static aiy a(coy $$0) {
      aiy $$1 = kf.h.b($$0);
      return $$1.d("item/");
   }

   public static aiy a(coy $$0, String $$1) {
      aiy $$2 = kf.h.b($$0);
      return $$2.a((UnaryOperator<String>)($$1x -> "item/" + $$1x + $$1));
   }
}
