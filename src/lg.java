import java.util.function.UnaryOperator;

public class lg {
   @Deprecated
   public static aeu a(String $$0) {
      return new aeu("minecraft", "block/" + $$0);
   }

   public static aeu b(String $$0) {
      return new aeu("minecraft", "item/" + $$0);
   }

   public static aeu a(csq $$0, String $$1) {
      aeu $$2 = jd.f.b($$0);
      return $$2.a((UnaryOperator<String>)($$1x -> "block/" + $$1x + $$1));
   }

   public static aeu a(csq $$0) {
      aeu $$1 = jd.f.b($$0);
      return $$1.d("block/");
   }

   public static aeu a(civ $$0) {
      aeu $$1 = jd.i.b($$0);
      return $$1.d("item/");
   }

   public static aeu a(civ $$0, String $$1) {
      aeu $$2 = jd.i.b($$0);
      return $$2.a((UnaryOperator<String>)($$1x -> "item/" + $$1x + $$1));
   }
}
