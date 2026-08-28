public class hct extends hcw<hgb, gjg> {
   private final giz a;
   private final hfx b = new hfx();

   public hct(haf<hgb, gjg> $$0, gla $$1) {
      super($$0);
      this.a = new giz($$1.a(gld.cb));
      this.b.c = giz.a.e;
   }

   public void a(flo $$0, gsa $$1, int $$2, hgb $$3, float $$4, float $$5) {
      cke.b $$6 = $$3.aE;
      if ($$6 != null) {
         this.a($$0, $$1, $$2, $$3, $$6, $$4, $$5, true);
      }

      cke.b $$7 = $$3.aF;
      if ($$7 != null) {
         this.a($$0, $$1, $$2, $$3, $$7, $$4, $$5, false);
      }
   }

   private void a(flo $$0, gsa $$1, int $$2, hgb $$3, cke.b $$4, float $$5, float $$6, boolean $$7) {
      $$0.a();
      $$0.a($$7 ? 0.4F : -0.4F, $$3.N ? -1.3F : -1.5F, 0.0F);
      this.b.u = $$3.u;
      this.b.ad = $$3.ad;
      this.b.ae = $$3.ae;
      this.b.aa = $$5;
      this.b.ab = $$6;
      this.a.a(this.b);
      this.a.a($$0, $$1.getBuffer(this.a.a(gzv.a($$4))), $$2, hkq.d);
      $$0.b();
   }
}
