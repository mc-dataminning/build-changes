public class gii extends gil {
   private final gca a;
   private final glo b = glo.i(grc.a);

   gii(gfd $$0, double $$1, double $$2, double $$3) {
      super($$0, $$1, $$2, $$3);
      this.a = new gbn(flz.Q().aS().a(geg.aB));
      this.u = 0.0F;
      this.t = 30;
   }

   @Override
   public gip b() {
      return gip.d;
   }

   @Override
   public void a(fgp $$0, fli $$1, float $$2) {
      float $$3 = ((float)this.s + $$2) / (float)this.t;
      float $$4 = 0.05F + 0.5F * bae.a($$3 * (float) Math.PI);
      int $$5 = ayp.a($$4, 1.0F, 1.0F, 1.0F);
      fgl $$6 = new fgl();
      $$6.a($$1.f());
      $$6.a(a.b.rotationDegrees(60.0F - 150.0F * $$3));
      float $$7 = 0.42553192F;
      $$6.b(0.42553192F, -0.42553192F, -0.42553192F);
      $$6.a(0.0F, -0.56F, 3.5F);
      gle.a $$8 = flz.Q().aR().c();
      fgp $$9 = $$8.getBuffer(this.b);
      this.a.a($$6, $$9, 15728880, hav.d, $$5);
      $$8.b();
   }

   public static class a implements gio<lw> {
      public gil a(lw $$0, gfd $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         return new gii($$1, $$2, $$3, $$4);
      }
   }
}
