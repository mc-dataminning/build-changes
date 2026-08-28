import java.util.List;

public record gtg(List<gsu> b) implements hnk {
   @Override
   public hng bake(gti $$0, hmz $$1, hnf $$2, hnb $$3) {
      return a(this.b, $$0, $$1.a(), $$2, $$3);
   }

   public static hng a(List<gsu> $$0, gti $$1, hnj $$2, hnf $$3, hnb $$4) {
      hng.a $$5 = new hng.a();

      for (gsu $$6 : $$0) {
         $$6.c().forEach(($$6x, $$7) -> {
            hkq $$8 = $$2.a($$1, $$7.c(), $$4);
            if ($$7.a() == null) {
               $$5.a(a($$6, $$7, $$8, $$6x, $$3));
            } else {
               $$5.a(jc.a($$3.a().c(), $$7.a()), a($$6, $$7, $$8, $$6x, $$3));
            }
         });
      }

      return $$5.a();
   }

   private static gst a(gsu $$0, gsv $$1, hkq $$2, jc $$3, hnf $$4) {
      return gtb.a($$0.a(), $$0.b(), $$1, $$2, $$3, $$4, $$0.d(), $$0.e(), $$0.f());
   }

   public List<gsu> a() {
      return this.b;
   }
}
