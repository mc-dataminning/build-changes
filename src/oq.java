import java.util.function.UnaryOperator;

public class oq {
   @Deprecated
   public static alz a(String $$0) {
      return alz.b("block/" + $$0);
   }

   public static alz b(String $$0) {
      return alz.b("item/" + $$0);
   }

   public static alz a(dke $$0, String $$1) {
      alz $$2 = ma.e.b($$0);
      return $$2.a((UnaryOperator<String>)($$1x -> "block/" + $$1x + $$1));
   }

   public static alz a(dke $$0) {
      alz $$1 = ma.e.b($$0);
      return $$1.f("block/");
   }

   public static alz a(cxg $$0) {
      alz $$1 = ma.g.b($$0);
      return $$1.f("item/");
   }

   public static alz a(cxg $$0, String $$1) {
      alz $$2 = ma.g.b($$0);
      return $$2.a((UnaryOperator<String>)($$1x -> "item/" + $$1x + $$1));
   }
}
