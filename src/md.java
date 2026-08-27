import java.util.function.UnaryOperator;

public class md {
   @Deprecated
   public static afw a(String $$0) {
      return new afw("minecraft", "block/" + $$0);
   }

   public static afw b(String $$0) {
      return new afw("minecraft", "item/" + $$0);
   }

   public static afw a(cua $$0, String $$1) {
      afw $$2 = jy.f.b($$0);
      return $$2.a((UnaryOperator<String>)($$1x -> "block/" + $$1x + $$1));
   }

   public static afw a(cua $$0) {
      afw $$1 = jy.f.b($$0);
      return $$1.d("block/");
   }

   public static afw a(cke $$0) {
      afw $$1 = jy.i.b($$0);
      return $$1.d("item/");
   }

   public static afw a(cke $$0, String $$1) {
      afw $$2 = jy.i.b($$0);
      return $$2.a((UnaryOperator<String>)($$1x -> "item/" + $$1x + $$1));
   }
}
