public class gxp extends gxs<hav, gef> {
   private final gdy a;
   private final har b = new har();

   public gxp(gva<hav, gef> $$0, gfy $$1) {
      super($$0);
      this.a = new gdy($$1.a(ggb.bP));
      this.b.c = gdy.a.e;
   }

   public void a(fgr $$0, gmx $$1, int $$2, hav $$3, float $$4, float $$5) {
      cif.b $$6 = $$3.aE;
      if ($$6 != null) {
         this.a($$0, $$1, $$2, $$3, $$6, $$4, $$5, true);
      }

      cif.b $$7 = $$3.aF;
      if ($$7 != null) {
         this.a($$0, $$1, $$2, $$3, $$7, $$4, $$5, false);
      }
   }

   private void a(fgr $$0, gmx $$1, int $$2, hav $$3, cif.b $$4, float $$5, float $$6, boolean $$7) {
      $$0.a();
      $$0.a($$7 ? 0.4F : -0.4F, $$3.N ? -1.3F : -1.5F, 0.0F);
      this.b.u = $$3.u;
      this.b.ad = $$3.ad;
      this.b.ae = $$3.ae;
      this.b.aa = $$5;
      this.b.ab = $$6;
      this.a.a(this.b);
      this.a.a($$0, $$1.getBuffer(this.a.a(guq.a($$4))), $$2, hfh.d);
      $$0.b();
   }
}
