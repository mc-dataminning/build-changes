import java.util.function.UnaryOperator;

public class oc {
   @Deprecated
   public static akr a(String $$0) {
      return akr.b("block/" + $$0);
   }

   public static akr b(String $$0) {
      return akr.b("item/" + $$0);
   }

   public static akr a(dfy $$0, String $$1) {
      akr $$2 = lt.e.b($$0);
      return $$2.a((UnaryOperator<String>)($$1x -> "block/" + $$1x + $$1));
   }

   public static akr a(dfy $$0) {
      akr $$1 = lt.e.b($$0);
      return $$1.f("block/");
   }

   public static akr a(cul $$0) {
      akr $$1 = lt.g.b($$0);
      return $$1.f("item/");
   }

   public static akr a(cul $$0, String $$1) {
      akr $$2 = lt.g.b($$0);
      return $$2.a((UnaryOperator<String>)($$1x -> "item/" + $$1x + $$1));
   }
}
