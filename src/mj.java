import java.util.function.UnaryOperator;

public class mj {
   @Deprecated
   public static agm a(String $$0) {
      return new agm("minecraft", "block/" + $$0);
   }

   public static agm b(String $$0) {
      return new agm("minecraft", "item/" + $$0);
   }

   public static agm a(cvf $$0, String $$1) {
      agm $$2 = kc.f.b($$0);
      return $$2.a((UnaryOperator<String>)($$1x -> "block/" + $$1x + $$1));
   }

   public static agm a(cvf $$0) {
      agm $$1 = kc.f.b($$0);
      return $$1.d("block/");
   }

   public static agm a(clj $$0) {
      agm $$1 = kc.i.b($$0);
      return $$1.d("item/");
   }

   public static agm a(clj $$0, String $$1) {
      agm $$2 = kc.i.b($$0);
      return $$2.a((UnaryOperator<String>)($$1x -> "item/" + $$1x + $$1));
   }
}
