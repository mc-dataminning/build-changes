import java.util.function.UnaryOperator;

public class le {
   @Deprecated
   public static acq a(String $$0) {
      return new acq("minecraft", "block/" + $$0);
   }

   public static acq b(String $$0) {
      return new acq("minecraft", "item/" + $$0);
   }

   public static acq a(cpn $$0, String $$1) {
      acq $$2 = jb.f.b($$0);
      return $$2.a((UnaryOperator<String>)($$1x -> "block/" + $$1x + $$1));
   }

   public static acq a(cpn $$0) {
      acq $$1 = jb.f.b($$0);
      return $$1.d("block/");
   }

   public static acq a(cfu $$0) {
      acq $$1 = jb.i.b($$0);
      return $$1.d("item/");
   }

   public static acq a(cfu $$0, String $$1) {
      acq $$2 = jb.i.b($$0);
      return $$2.a((UnaryOperator<String>)($$1x -> "item/" + $$1x + $$1));
   }
}
