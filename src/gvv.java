public class gvv extends gvy<gyz, gck> {
   private final gcd a;
   private final gyv b = new gyv();

   public gvv(gtg<gyz, gck> $$0, ged $$1) {
      super($$0);
      this.a = new gcd($$1.a(geg.bK));
      this.b.c = gcd.a.e;
   }

   public void a(fgl $$0, gle $$1, int $$2, gyz $$3, float $$4, float $$5) {
      cii.b $$6 = $$3.aE;
      if ($$6 != null) {
         this.a($$0, $$1, $$2, $$3, $$6, $$4, $$5, true);
      }

      cii.b $$7 = $$3.aF;
      if ($$7 != null) {
         this.a($$0, $$1, $$2, $$3, $$7, $$4, $$5, false);
      }
   }

   private void a(fgl $$0, gle $$1, int $$2, gyz $$3, cii.b $$4, float $$5, float $$6, boolean $$7) {
      $$0.a();
      $$0.a($$7 ? 0.4F : -0.4F, $$3.I ? -1.3F : -1.5F, 0.0F);
      this.b.p = $$3.p;
      this.b.X = $$3.X;
      this.b.Y = $$3.Y;
      this.b.U = $$5;
      this.b.V = $$6;
      this.a.a(this.b);
      this.a.a($$0, $$1.getBuffer(this.a.a(gsw.a($$4))), $$2, hav.d);
      $$0.b();
   }
}
