import java.util.function.UnaryOperator;

public class lg {
   @Deprecated
   public static aew a(String $$0) {
      return new aew("minecraft", "block/" + $$0);
   }

   public static aew b(String $$0) {
      return new aew("minecraft", "item/" + $$0);
   }

   public static aew a(csv $$0, String $$1) {
      aew $$2 = jb.f.b($$0);
      return $$2.a((UnaryOperator<String>)($$1x -> "block/" + $$1x + $$1));
   }

   public static aew a(csv $$0) {
      aew $$1 = jb.f.b($$0);
      return $$1.d("block/");
   }

   public static aew a(cja $$0) {
      aew $$1 = jb.i.b($$0);
      return $$1.d("item/");
   }

   public static aew a(cja $$0, String $$1) {
      aew $$2 = jb.i.b($$0);
      return $$2.a((UnaryOperator<String>)($$1x -> "item/" + $$1x + $$1));
   }
}
