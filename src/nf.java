import java.util.function.UnaryOperator;

public class nf {
   @Deprecated
   public static ajt a(String $$0) {
      return new ajt("minecraft", "block/" + $$0);
   }

   public static ajt b(String $$0) {
      return new ajt("minecraft", "item/" + $$0);
   }

   public static ajt a(dby $$0, String $$1) {
      ajt $$2 = kr.e.b($$0);
      return $$2.a((UnaryOperator<String>)($$1x -> "block/" + $$1x + $$1));
   }

   public static ajt a(dby $$0) {
      ajt $$1 = kr.e.b($$0);
      return $$1.d("block/");
   }

   public static ajt a(cre $$0) {
      ajt $$1 = kr.h.b($$0);
      return $$1.d("item/");
   }

   public static ajt a(cre $$0, String $$1) {
      ajt $$2 = kr.h.b($$0);
      return $$2.a((UnaryOperator<String>)($$1x -> "item/" + $$1x + $$1));
   }
}
