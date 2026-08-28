public class gvx extends gwa<gzb, gcm> {
   private final gcf a;
   private final gyx b = new gyx();

   public gvx(gti<gzb, gcm> $$0, gef $$1) {
      super($$0);
      this.a = new gcf($$1.a(gei.bN));
      this.b.c = gcf.a.e;
   }

   public void a(fgl $$0, glg $$1, int $$2, gzb $$3, float $$4, float $$5) {
      cie.b $$6 = $$3.aE;
      if ($$6 != null) {
         this.a($$0, $$1, $$2, $$3, $$6, $$4, $$5, true);
      }

      cie.b $$7 = $$3.aF;
      if ($$7 != null) {
         this.a($$0, $$1, $$2, $$3, $$7, $$4, $$5, false);
      }
   }

   private void a(fgl $$0, glg $$1, int $$2, gzb $$3, cie.b $$4, float $$5, float $$6, boolean $$7) {
      $$0.a();
      $$0.a($$7 ? 0.4F : -0.4F, $$3.I ? -1.3F : -1.5F, 0.0F);
      this.b.p = $$3.p;
      this.b.X = $$3.X;
      this.b.Y = $$3.Y;
      this.b.U = $$5;
      this.b.V = $$6;
      this.a.a(this.b);
      this.a.a($$0, $$1.getBuffer(this.a.a(gsy.a($$4))), $$2, hax.d);
      $$0.b();
   }
}
