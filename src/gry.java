public class gry extends gsb<gvb, fyt> {
   private final fym a;
   private final gux b = new gux();

   public gry(gpk<gvb, fyt> $$0, gam $$1) {
      super($$0);
      this.a = new fym($$1.a(gap.br));
      this.b.c = fym.a.e;
   }

   public void a(fdi $$0, ghl $$1, int $$2, gvb $$3, float $$4, float $$5) {
      cgt.b $$6 = $$3.aE;
      if ($$6 != null) {
         this.a($$0, $$1, $$2, $$3, $$6, $$4, $$5, true);
      }

      cgt.b $$7 = $$3.aF;
      if ($$7 != null) {
         this.a($$0, $$1, $$2, $$3, $$7, $$4, $$5, false);
      }
   }

   private void a(fdi $$0, ghl $$1, int $$2, gvb $$3, cgt.b $$4, float $$5, float $$6, boolean $$7) {
      $$0.a();
      $$0.a($$7 ? 0.4F : -0.4F, $$3.I ? -1.3F : -1.5F, 0.0F);
      this.b.p = $$3.p;
      this.b.X = $$3.X;
      this.b.Y = $$3.Y;
      this.b.U = $$5;
      this.b.V = $$6;
      this.a.a(this.b);
      this.a.a($$0, $$1.getBuffer(this.a.a(gpb.a($$4))), $$2, gwx.d);
      $$0.b();
   }
}
