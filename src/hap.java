public class hap extends hav<hdo, ggr> {
   private final ggr a;
   private final ggr b;
   private final hag c;

   public hap(gye<hdo, ggr> $$0, giy $$1, hag $$2) {
      super($$0);
      this.c = $$2;
      this.a = new ggr($$1.a(gjb.bH));
      this.b = new ggr($$1.a(gjb.bG));
   }

   public void a(fjj $$0, gqa $$1, int $$2, hdo $$3, float $$4, float $$5) {
      czd $$6 = $$3.c;
      dhm $$7 = $$6.a(kj.D);
      if ($$7 != null && $$7.d().isPresent()) {
         this.a($$0, $$1, $$3, $$6, $$7.d().get(), $$2);
      } else if ($$3.d) {
         this.a($$0, $$1, $$3, czd.k, dhl.m, $$2);
      }
   }

   private void a(fjj $$0, gqa $$1, hdo $$2, czd $$3, alf<dhk> $$4, int $$5) {
      ggr $$6 = $$2.aj ? this.b : this.a;
      $$6.a($$2);
      this.c.a(hld.d.f, $$4, $$6, $$3, $$0, $$1, $$5);
   }
}
