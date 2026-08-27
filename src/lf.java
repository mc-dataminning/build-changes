import java.util.function.UnaryOperator;

public class lf {
   @Deprecated
   public static aep a(String $$0) {
      return new aep("minecraft", "block/" + $$0);
   }

   public static aep b(String $$0) {
      return new aep("minecraft", "item/" + $$0);
   }

   public static aep a(csk $$0, String $$1) {
      aep $$2 = jc.f.b($$0);
      return $$2.a((UnaryOperator<String>)($$1x -> "block/" + $$1x + $$1));
   }

   public static aep a(csk $$0) {
      aep $$1 = jc.f.b($$0);
      return $$1.d("block/");
   }

   public static aep a(cir $$0) {
      aep $$1 = jc.i.b($$0);
      return $$1.d("item/");
   }

   public static aep a(cir $$0, String $$1) {
      aep $$2 = jc.i.b($$0);
      return $$2.a((UnaryOperator<String>)($$1x -> "item/" + $$1x + $$1));
   }
}
