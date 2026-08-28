import java.util.function.UnaryOperator;

public class ol {
   @Deprecated
   public static alj a(String $$0) {
      return alj.b("block/" + $$0);
   }

   public static alj b(String $$0) {
      return alj.b("item/" + $$0);
   }

   public static alj a(diq $$0, String $$1) {
      alj $$2 = lz.e.b($$0);
      return $$2.a((UnaryOperator<String>)($$1x -> "block/" + $$1x + $$1));
   }

   public static alj a(diq $$0) {
      alj $$1 = lz.e.b($$0);
      return $$1.f("block/");
   }

   public static alj a(cwi $$0) {
      alj $$1 = lz.g.b($$0);
      return $$1.f("item/");
   }

   public static alj a(cwi $$0, String $$1) {
      alj $$2 = lz.g.b($$0);
      return $$2.a((UnaryOperator<String>)($$1x -> "item/" + $$1x + $$1));
   }
}
