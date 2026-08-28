public class gik extends gin {
   private final gcc a;
   private final glq b = glq.j(gre.a);

   gik(gff $$0, double $$1, double $$2, double $$3) {
      super($$0, $$1, $$2, $$3);
      this.a = new gbp(flz.Q().aS().a(gei.aE));
      this.u = 0.0F;
      this.t = 30;
   }

   @Override
   public gir b() {
      return gir.d;
   }

   @Override
   public void a(fgl $$0, glg $$1, fli $$2, float $$3) {
      float $$4 = ((float)this.s + $$3) / (float)this.t;
      float $$5 = 0.05F + 0.5F * azu.a($$4 * (float) Math.PI);
      int $$6 = ayf.a($$5, 1.0F, 1.0F, 1.0F);
      $$0.a();
      $$0.a($$2.f());
      $$0.a(a.b.rotationDegrees(60.0F - 150.0F * $$4));
      float $$7 = 0.42553192F;
      $$0.b(0.42553192F, -0.42553192F, -0.42553192F);
      $$0.a(0.0F, -0.56F, 3.5F);
      fgp $$8 = $$1.getBuffer(this.b);
      this.a.a($$0, $$8, 15728880, hax.d, $$6);
      $$0.b();
   }

   @Override
   public void a(fgp $$0, fli $$1, float $$2) {
   }

   public static class a implements giq<lw> {
      public gin a(lw $$0, gff $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         return new gik($$1, $$2, $$3, $$4);
      }
   }
}
