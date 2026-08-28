public class gfm extends gfp {
   private final fzf a;
   private final gir b = gir.i(god.a);

   gfm(gci $$0, double $$1, double $$2, double $$3) {
      super($$0, $$1, $$2, $$3);
      this.a = new fys(fji.Q().aS().a(gbl.aq));
      this.u = 0.0F;
      this.t = 30;
   }

   @Override
   public gft b() {
      return gft.d;
   }

   @Override
   public void a(fef $$0, fir $$1, float $$2) {
      float $$3 = ((float)this.s + $$2) / (float)this.t;
      float $$4 = 0.05F + 0.5F * azk.a($$3 * (float) Math.PI);
      int $$5 = axv.a($$4, 1.0F, 1.0F, 1.0F);
      feb $$6 = new feb();
      $$6.a($$1.f());
      $$6.a(a.b.rotationDegrees(60.0F - 150.0F * $$3));
      float $$7 = 0.42553192F;
      $$6.b(0.42553192F, -0.42553192F, -0.42553192F);
      $$6.a(0.0F, -0.56F, 3.5F);
      gih.a $$8 = fji.Q().aR().c();
      fef $$9 = $$8.getBuffer(this.b);
      this.a.a($$6, $$9, 15728880, gxu.d, $$5);
      $$8.b();
   }

   public static class a implements gfs<lv> {
      public gfp a(lv $$0, gci $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         return new gfm($$1, $$2, $$3, $$4);
      }
   }
}
