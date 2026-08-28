public class gwo extends gwr<gzu, gdf> {
   private final gcy a;
   private final gzq b = new gzq();

   public gwo(gtz<gzu, gdf> $$0, gey $$1) {
      super($$0);
      this.a = new gcy($$1.a(gfb.bN));
      this.b.c = gcy.a.e;
   }

   public void a(ffu $$0, glx $$1, int $$2, gzu $$3, float $$4, float $$5) {
      chn.b $$6 = $$3.aE;
      if ($$6 != null) {
         this.a($$0, $$1, $$2, $$3, $$6, $$4, $$5, true);
      }

      chn.b $$7 = $$3.aF;
      if ($$7 != null) {
         this.a($$0, $$1, $$2, $$3, $$7, $$4, $$5, false);
      }
   }

   private void a(ffu $$0, glx $$1, int $$2, gzu $$3, chn.b $$4, float $$5, float $$6, boolean $$7) {
      $$0.a();
      $$0.a($$7 ? 0.4F : -0.4F, $$3.N ? -1.3F : -1.5F, 0.0F);
      this.b.u = $$3.u;
      this.b.ad = $$3.ad;
      this.b.ae = $$3.ae;
      this.b.aa = $$5;
      this.b.ab = $$6;
      this.a.a(this.b);
      this.a.a($$0, $$1.getBuffer(this.a.a(gtp.a($$4))), $$2, hea.d);
      $$0.b();
   }
}
