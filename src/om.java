import java.util.function.UnaryOperator;

public class om {
   @Deprecated
   public static alp a(String $$0) {
      return alp.b("block/" + $$0);
   }

   public static alp b(String $$0) {
      return alp.b("item/" + $$0);
   }

   public static alp a(dkd $$0, String $$1) {
      alp $$2 = ma.e.b($$0);
      return $$2.a((UnaryOperator<String>)($$1x -> "block/" + $$1x + $$1));
   }

   public static alp a(dkd $$0) {
      alp $$1 = ma.e.b($$0);
      return $$1.f("block/");
   }

   public static alp a(cxc $$0) {
      alp $$1 = ma.g.b($$0);
      return $$1.f("item/");
   }

   public static alp a(cxc $$0, String $$1) {
      alp $$2 = ma.g.b($$0);
      return $$2.a((UnaryOperator<String>)($$1x -> "item/" + $$1x + $$1));
   }
}
