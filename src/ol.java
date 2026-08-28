import java.util.function.UnaryOperator;

public class ol {
   @Deprecated
   public static all a(String $$0) {
      return all.b("block/" + $$0);
   }

   public static all b(String $$0) {
      return all.b("item/" + $$0);
   }

   public static all a(dij $$0, String $$1) {
      all $$2 = lz.e.b($$0);
      return $$2.a((UnaryOperator<String>)($$1x -> "block/" + $$1x + $$1));
   }

   public static all a(dij $$0) {
      all $$1 = lz.e.b($$0);
      return $$1.f("block/");
   }

   public static all a(cwb $$0) {
      all $$1 = lz.g.b($$0);
      return $$1.f("item/");
   }

   public static all a(cwb $$0, String $$1) {
      all $$2 = lz.g.b($$0);
      return $$2.a((UnaryOperator<String>)($$1x -> "item/" + $$1x + $$1));
   }
}
