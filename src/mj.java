import java.util.function.UnaryOperator;

public class mj {
   @Deprecated
   public static agt a(String $$0) {
      return new agt("minecraft", "block/" + $$0);
   }

   public static agt b(String $$0) {
      return new agt("minecraft", "item/" + $$0);
   }

   public static agt a(cvz $$0, String $$1) {
      agt $$2 = kb.e.b($$0);
      return $$2.a((UnaryOperator<String>)($$1x -> "block/" + $$1x + $$1));
   }

   public static agt a(cvz $$0) {
      agt $$1 = kb.e.b($$0);
      return $$1.d("block/");
   }

   public static agt a(cmc $$0) {
      agt $$1 = kb.h.b($$0);
      return $$1.d("item/");
   }

   public static agt a(cmc $$0, String $$1) {
      agt $$2 = kb.h.b($$0);
      return $$2.a((UnaryOperator<String>)($$1x -> "item/" + $$1x + $$1));
   }
}
