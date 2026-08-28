import java.util.function.UnaryOperator;

public class of {
   @Deprecated
   public static alc a(String $$0) {
      return alc.b("block/" + $$0);
   }

   public static alc b(String $$0) {
      return alc.b("item/" + $$0);
   }

   public static alc a(dhj $$0, String $$1) {
      alc $$2 = lu.e.b($$0);
      return $$2.a((UnaryOperator<String>)($$1x -> "block/" + $$1x + $$1));
   }

   public static alc a(dhj $$0) {
      alc $$1 = lu.e.b($$0);
      return $$1.f("block/");
   }

   public static alc a(cvk $$0) {
      alc $$1 = lu.g.b($$0);
      return $$1.f("item/");
   }

   public static alc a(cvk $$0, String $$1) {
      alc $$2 = lu.g.b($$0);
      return $$2.a((UnaryOperator<String>)($$1x -> "item/" + $$1x + $$1));
   }
}
