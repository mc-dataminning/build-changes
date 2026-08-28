public class hbe extends hbh<hel, ghq> {
   private final ghj a;
   private final heh b = new heh();

   public hbe(gyq<hel, ghq> $$0, gjk $$1) {
      super($$0);
      this.a = new ghj($$1.a(gjn.cb));
      this.b.c = ghj.a.e;
   }

   public void a(fjy $$0, gqm $$1, int $$2, hel $$3, float $$4, float $$5) {
      cjt.b $$6 = $$3.aE;
      if ($$6 != null) {
         this.a($$0, $$1, $$2, $$3, $$6, $$4, $$5, true);
      }

      cjt.b $$7 = $$3.aF;
      if ($$7 != null) {
         this.a($$0, $$1, $$2, $$3, $$7, $$4, $$5, false);
      }
   }

   private void a(fjy $$0, gqm $$1, int $$2, hel $$3, cjt.b $$4, float $$5, float $$6, boolean $$7) {
      $$0.a();
      $$0.a($$7 ? 0.4F : -0.4F, $$3.N ? -1.3F : -1.5F, 0.0F);
      this.b.u = $$3.u;
      this.b.ad = $$3.ad;
      this.b.ae = $$3.ae;
      this.b.aa = $$5;
      this.b.ab = $$6;
      this.a.a(this.b);
      this.a.a($$0, $$1.getBuffer(this.a.a(gyg.a($$4))), $$2, hja.d);
      $$0.b();
   }
}
