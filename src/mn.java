import java.util.function.UnaryOperator;

public class mn {
   @Deprecated
   public static ahg a(String $$0) {
      return new ahg("minecraft", "block/" + $$0);
   }

   public static ahg b(String $$0) {
      return new ahg("minecraft", "item/" + $$0);
   }

   public static ahg a(cwq $$0, String $$1) {
      ahg $$2 = kd.e.b($$0);
      return $$2.a((UnaryOperator<String>)($$1x -> "block/" + $$1x + $$1));
   }

   public static ahg a(cwq $$0) {
      ahg $$1 = kd.e.b($$0);
      return $$1.d("block/");
   }

   public static ahg a(cmt $$0) {
      ahg $$1 = kd.h.b($$0);
      return $$1.d("item/");
   }

   public static ahg a(cmt $$0, String $$1) {
      ahg $$2 = kd.h.b($$0);
      return $$2.a((UnaryOperator<String>)($$1x -> "item/" + $$1x + $$1));
   }
}
