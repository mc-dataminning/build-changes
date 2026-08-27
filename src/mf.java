import java.util.function.UnaryOperator;

public class mf {
   @Deprecated
   public static agg a(String $$0) {
      return new agg("minecraft", "block/" + $$0);
   }

   public static agg b(String $$0) {
      return new agg("minecraft", "item/" + $$0);
   }

   public static agg a(cut $$0, String $$1) {
      agg $$2 = jy.f.b($$0);
      return $$2.a((UnaryOperator<String>)($$1x -> "block/" + $$1x + $$1));
   }

   public static agg a(cut $$0) {
      agg $$1 = jy.f.b($$0);
      return $$1.d("block/");
   }

   public static agg a(ckw $$0) {
      agg $$1 = jy.i.b($$0);
      return $$1.d("item/");
   }

   public static agg a(ckw $$0, String $$1) {
      agg $$2 = jy.i.b($$0);
      return $$2.a((UnaryOperator<String>)($$1x -> "item/" + $$1x + $$1));
   }
}
