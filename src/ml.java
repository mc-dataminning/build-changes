import java.util.function.UnaryOperator;

public class ml {
   @Deprecated
   public static ahd a(String $$0) {
      return new ahd("minecraft", "block/" + $$0);
   }

   public static ahd b(String $$0) {
      return new ahd("minecraft", "item/" + $$0);
   }

   public static ahd a(cwj $$0, String $$1) {
      ahd $$2 = kd.e.b($$0);
      return $$2.a((UnaryOperator<String>)($$1x -> "block/" + $$1x + $$1));
   }

   public static ahd a(cwj $$0) {
      ahd $$1 = kd.e.b($$0);
      return $$1.d("block/");
   }

   public static ahd a(cmm $$0) {
      ahd $$1 = kd.h.b($$0);
      return $$1.d("item/");
   }

   public static ahd a(cmm $$0, String $$1) {
      ahd $$2 = kd.h.b($$0);
      return $$2.a((UnaryOperator<String>)($$1x -> "item/" + $$1x + $$1));
   }
}
