import java.util.function.UnaryOperator;

public class lg {
   @Deprecated
   public static aez a(String $$0) {
      return new aez("minecraft", "block/" + $$0);
   }

   public static aez b(String $$0) {
      return new aez("minecraft", "item/" + $$0);
   }

   public static aez a(ctc $$0, String $$1) {
      aez $$2 = jb.f.b($$0);
      return $$2.a((UnaryOperator<String>)($$1x -> "block/" + $$1x + $$1));
   }

   public static aez a(ctc $$0) {
      aez $$1 = jb.f.b($$0);
      return $$1.d("block/");
   }

   public static aez a(cjg $$0) {
      aez $$1 = jb.i.b($$0);
      return $$1.d("item/");
   }

   public static aez a(cjg $$0, String $$1) {
      aez $$2 = jb.i.b($$0);
      return $$2.a((UnaryOperator<String>)($$1x -> "item/" + $$1x + $$1));
   }
}
