import java.util.function.UnaryOperator;

public class mr {
   @Deprecated
   public static ajc a(String $$0) {
      return new ajc("minecraft", "block/" + $$0);
   }

   public static ajc b(String $$0) {
      return new ajc("minecraft", "item/" + $$0);
   }

   public static ajc a(czf $$0, String $$1) {
      ajc $$2 = kh.e.b($$0);
      return $$2.a((UnaryOperator<String>)($$1x -> "block/" + $$1x + $$1));
   }

   public static ajc a(czf $$0) {
      ajc $$1 = kh.e.b($$0);
      return $$1.d("block/");
   }

   public static ajc a(cpl $$0) {
      ajc $$1 = kh.h.b($$0);
      return $$1.d("item/");
   }

   public static ajc a(cpl $$0, String $$1) {
      ajc $$2 = kh.h.b($$0);
      return $$2.a((UnaryOperator<String>)($$1x -> "item/" + $$1x + $$1));
   }
}
