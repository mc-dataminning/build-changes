import java.util.function.UnaryOperator;

public class ob {
   @Deprecated
   public static akq a(String $$0) {
      return akq.b("block/" + $$0);
   }

   public static akq b(String $$0) {
      return akq.b("item/" + $$0);
   }

   public static akq a(dfw $$0, String $$1) {
      akq $$2 = lt.e.b($$0);
      return $$2.a((UnaryOperator<String>)($$1x -> "block/" + $$1x + $$1));
   }

   public static akq a(dfw $$0) {
      akq $$1 = lt.e.b($$0);
      return $$1.f("block/");
   }

   public static akq a(cuj $$0) {
      akq $$1 = lt.g.b($$0);
      return $$1.f("item/");
   }

   public static akq a(cuj $$0, String $$1) {
      akq $$2 = lt.g.b($$0);
      return $$2.a((UnaryOperator<String>)($$1x -> "item/" + $$1x + $$1));
   }
}
