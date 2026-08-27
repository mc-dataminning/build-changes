import java.util.function.UnaryOperator;

public class le {
   @Deprecated
   public static aer a(String $$0) {
      return new aer("minecraft", "block/" + $$0);
   }

   public static aer b(String $$0) {
      return new aer("minecraft", "item/" + $$0);
   }

   public static aer a(csm $$0, String $$1) {
      aer $$2 = jb.f.b($$0);
      return $$2.a((UnaryOperator<String>)($$1x -> "block/" + $$1x + $$1));
   }

   public static aer a(csm $$0) {
      aer $$1 = jb.f.b($$0);
      return $$1.d("block/");
   }

   public static aer a(cit $$0) {
      aer $$1 = jb.i.b($$0);
      return $$1.d("item/");
   }

   public static aer a(cit $$0, String $$1) {
      aer $$2 = jb.i.b($$0);
      return $$2.a((UnaryOperator<String>)($$1x -> "item/" + $$1x + $$1));
   }
}
