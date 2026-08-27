import java.util.function.UnaryOperator;

public class mn {
   @Deprecated
   public static ahh a(String $$0) {
      return new ahh("minecraft", "block/" + $$0);
   }

   public static ahh b(String $$0) {
      return new ahh("minecraft", "item/" + $$0);
   }

   public static ahh a(cwy $$0, String $$1) {
      ahh $$2 = kd.e.b($$0);
      return $$2.a((UnaryOperator<String>)($$1x -> "block/" + $$1x + $$1));
   }

   public static ahh a(cwy $$0) {
      ahh $$1 = kd.e.b($$0);
      return $$1.d("block/");
   }

   public static ahh a(cnb $$0) {
      ahh $$1 = kd.h.b($$0);
      return $$1.d("item/");
   }

   public static ahh a(cnb $$0, String $$1) {
      ahh $$2 = kd.h.b($$0);
      return $$2.a((UnaryOperator<String>)($$1x -> "item/" + $$1x + $$1));
   }
}
