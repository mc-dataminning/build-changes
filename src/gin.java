public class gin extends giq {
   private final gcf a;
   private final glt b = glt.i(grh.a);

   gin(gfi $$0, double $$1, double $$2, double $$3) {
      super($$0, $$1, $$2, $$3);
      this.a = new gbs(fme.Q().aS().a(gel.aB));
      this.u = 0.0F;
      this.t = 30;
   }

   @Override
   public giu b() {
      return giu.d;
   }

   @Override
   public void a(fgu $$0, fln $$1, float $$2) {
      float $$3 = ((float)this.s + $$2) / (float)this.t;
      float $$4 = 0.05F + 0.5F * bae.a($$3 * (float) Math.PI);
      int $$5 = ayp.a($$4, 1.0F, 1.0F, 1.0F);
      fgq $$6 = new fgq();
      $$6.a($$1.f());
      $$6.a(a.b.rotationDegrees(60.0F - 150.0F * $$3));
      float $$7 = 0.42553192F;
      $$6.b(0.42553192F, -0.42553192F, -0.42553192F);
      $$6.a(0.0F, -0.56F, 3.5F);
      glj.a $$8 = fme.Q().aR().c();
      fgu $$9 = $$8.getBuffer(this.b);
      this.a.a($$6, $$9, 15728880, hba.d, $$5);
      $$8.b();
   }

   public static class a implements git<lw> {
      public giq a(lw $$0, gfi $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         return new gin($$1, $$2, $$3, $$4);
      }
   }
}
