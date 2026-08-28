import java.util.function.UnaryOperator;

public class oj {
   @Deprecated
   public static alh a(String $$0) {
      return alh.b("block/" + $$0);
   }

   public static alh b(String $$0) {
      return alh.b("item/" + $$0);
   }

   public static alh a(dhy $$0, String $$1) {
      alh $$2 = lx.e.b($$0);
      return $$2.a((UnaryOperator<String>)($$1x -> "block/" + $$1x + $$1));
   }

   public static alh a(dhy $$0) {
      alh $$1 = lx.e.b($$0);
      return $$1.f("block/");
   }

   public static alh a(cvt $$0) {
      alh $$1 = lx.g.b($$0);
      return $$1.f("item/");
   }

   public static alh a(cvt $$0, String $$1) {
      alh $$2 = lx.g.b($$0);
      return $$2.a((UnaryOperator<String>)($$1x -> "item/" + $$1x + $$1));
   }
}
