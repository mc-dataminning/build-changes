public class hbb extends hbh<hea, ghd> {
   private final ghd a;
   private final ghd b;
   private final has c;

   public hbb(gyq<hea, ghd> $$0, gjk $$1, has $$2) {
      super($$0);
      this.c = $$2;
      this.a = new ghd($$1.a(gjn.bH));
      this.b = new ghd($$1.a(gjn.bG));
   }

   public void a(fjy $$0, gqm $$1, int $$2, hea $$3, float $$4, float $$5) {
      czk $$6 = $$3.c;
      dht $$7 = $$6.a(kk.D);
      if ($$7 != null && $$7.d().isPresent()) {
         this.a($$0, $$1, $$3, $$6, $$7.d().get(), $$2);
      } else if ($$3.d) {
         this.a($$0, $$1, $$3, czk.k, dhs.m, $$2);
      }
   }

   private void a(fjy $$0, gqm $$1, hea $$2, czk $$3, alf<dhr> $$4, int $$5) {
      ghd $$6 = $$2.aj ? this.b : this.a;
      $$6.a($$2);
      this.c.a(hlp.d.f, $$4, $$6, $$3, $$0, $$1, $$5);
   }
}
