public class gwr extends gwu<gzx, gdh> {
   private final gda a;
   private final gzt b = new gzt();

   public gwr(guc<gzx, gdh> $$0, gfa $$1) {
      super($$0);
      this.a = new gda($$1.a(gfd.bN));
      this.b.c = gda.a.e;
   }

   public void a(ffv $$0, glz $$1, int $$2, gzx $$3, float $$4, float $$5) {
      chp.b $$6 = $$3.aE;
      if ($$6 != null) {
         this.a($$0, $$1, $$2, $$3, $$6, $$4, $$5, true);
      }

      chp.b $$7 = $$3.aF;
      if ($$7 != null) {
         this.a($$0, $$1, $$2, $$3, $$7, $$4, $$5, false);
      }
   }

   private void a(ffv $$0, glz $$1, int $$2, gzx $$3, chp.b $$4, float $$5, float $$6, boolean $$7) {
      $$0.a();
      $$0.a($$7 ? 0.4F : -0.4F, $$3.N ? -1.3F : -1.5F, 0.0F);
      this.b.u = $$3.u;
      this.b.ad = $$3.ad;
      this.b.ae = $$3.ae;
      this.b.aa = $$5;
      this.b.ab = $$6;
      this.a.a(this.b);
      this.a.a($$0, $$1.getBuffer(this.a.a(gts.a($$4))), $$2, hej.d);
      $$0.b();
   }
}
