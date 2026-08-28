import java.util.function.UnaryOperator;

public class of {
   @Deprecated
   public static alb a(String $$0) {
      return new alb("minecraft", "block/" + $$0);
   }

   public static alb b(String $$0) {
      return new alb("minecraft", "item/" + $$0);
   }

   public static alb a(deu $$0, String $$1) {
      alb $$2 = lp.e.b($$0);
      return $$2.a((UnaryOperator<String>)($$1x -> "block/" + $$1x + $$1));
   }

   public static alb a(deu $$0) {
      alb $$1 = lp.e.b($$0);
      return $$1.d("block/");
   }

   public static alb a(cuf $$0) {
      alb $$1 = lp.h.b($$0);
      return $$1.d("item/");
   }

   public static alb a(cuf $$0, String $$1) {
      alb $$2 = lp.h.b($$0);
      return $$2.a((UnaryOperator<String>)($$1x -> "item/" + $$1x + $$1));
   }
}
