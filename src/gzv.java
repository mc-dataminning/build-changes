public class gzv extends gzy<hdb, ggj> {
   private final ggc a;
   private final hcx b = new hcx();

   public gzv(gxh<hdb, ggj> $$0, gic $$1) {
      super($$0);
      this.a = new ggc($$1.a(gif.bX));
      this.b.c = ggc.a.e;
   }

   public void a(fiq $$0, gpd $$1, int $$2, hdb $$3, float $$4, float $$5) {
      cje.b $$6 = $$3.aE;
      if ($$6 != null) {
         this.a($$0, $$1, $$2, $$3, $$6, $$4, $$5, true);
      }

      cje.b $$7 = $$3.aF;
      if ($$7 != null) {
         this.a($$0, $$1, $$2, $$3, $$7, $$4, $$5, false);
      }
   }

   private void a(fiq $$0, gpd $$1, int $$2, hdb $$3, cje.b $$4, float $$5, float $$6, boolean $$7) {
      $$0.a();
      $$0.a($$7 ? 0.4F : -0.4F, $$3.N ? -1.3F : -1.5F, 0.0F);
      this.b.u = $$3.u;
      this.b.ad = $$3.ad;
      this.b.ae = $$3.ae;
      this.b.aa = $$5;
      this.b.ab = $$6;
      this.a.a(this.b);
      this.a.a($$0, $$1.getBuffer(this.a.a(gwx.a($$4))), $$2, hhp.d);
      $$0.b();
   }
}
