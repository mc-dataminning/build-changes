import java.util.function.UnaryOperator;

public class of {
   @Deprecated
   public static alb a(String $$0) {
      return alb.b("block/" + $$0);
   }

   public static alb b(String $$0) {
      return alb.b("item/" + $$0);
   }

   public static alb a(dgv $$0, String $$1) {
      alb $$2 = lu.e.b($$0);
      return $$2.a((UnaryOperator<String>)($$1x -> "block/" + $$1x + $$1));
   }

   public static alb a(dgv $$0) {
      alb $$1 = lu.e.b($$0);
      return $$1.f("block/");
   }

   public static alb a(cvg $$0) {
      alb $$1 = lu.g.b($$0);
      return $$1.f("item/");
   }

   public static alb a(cvg $$0, String $$1) {
      alb $$2 = lu.g.b($$0);
      return $$2.a((UnaryOperator<String>)($$1x -> "item/" + $$1x + $$1));
   }
}
