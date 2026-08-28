public class hcd extends hcj<hff, gig> {
   private final gig a;
   private final gig b;
   private final hbu c;

   public hcd(gzs<hff, gig> $$0, gkn $$1, hbu $$2) {
      super($$0);
      this.c = $$2;
      this.a = new gig($$1.a(gkq.bH));
      this.b = new gig($$1.a(gkq.bG));
   }

   public void a(fld $$0, grn $$1, int $$2, hff $$3, float $$4, float $$5) {
      dak $$6 = $$3.c;
      dit $$7 = $$6.a(kl.D);
      if ($$7 != null && $$7.d().isPresent()) {
         this.a($$0, $$1, $$3, $$6, $$7.d().get(), $$2);
      } else if ($$3.d) {
         this.a($$0, $$1, $$3, dak.l, dis.m, $$2);
      }
   }

   private void a(fld $$0, grn $$1, hff $$2, dak $$3, alq<dir> $$4, int $$5) {
      gig $$6 = $$2.am ? this.b : this.a;
      $$6.a($$2);
      this.c.a(hmw.d.f, $$4, $$6, $$3, $$0, $$1, $$5);
   }
}
