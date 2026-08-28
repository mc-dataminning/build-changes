public class gip extends gis {
   private final gch a;
   private final glv b = glv.j(grj.a);

   gip(gfk $$0, double $$1, double $$2, double $$3) {
      super($$0, $$1, $$2, $$3);
      this.a = new gbu(fmg.Q().aS().a(gen.aB));
      this.u = 0.0F;
      this.t = 30;
   }

   @Override
   public giw b() {
      return giw.d;
   }

   @Override
   public void a(fgw $$0, flp $$1, float $$2) {
      float $$3 = ((float)this.s + $$2) / (float)this.t;
      float $$4 = 0.05F + 0.5F * bae.a($$3 * (float) Math.PI);
      int $$5 = ayp.a($$4, 1.0F, 1.0F, 1.0F);
      fgs $$6 = new fgs();
      $$6.a($$1.f());
      $$6.a(a.b.rotationDegrees(60.0F - 150.0F * $$3));
      float $$7 = 0.42553192F;
      $$6.b(0.42553192F, -0.42553192F, -0.42553192F);
      $$6.a(0.0F, -0.56F, 3.5F);
      gll.a $$8 = fmg.Q().aR().c();
      fgw $$9 = $$8.getBuffer(this.b);
      this.a.a($$6, $$9, 15728880, hbc.d, $$5);
      $$8.b();
   }

   public static class a implements giv<lw> {
      public gis a(lw $$0, gfk $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         return new gip($$1, $$2, $$3, $$4);
      }
   }
}
