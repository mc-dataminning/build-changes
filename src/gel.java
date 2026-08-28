public class gel extends geo {
   private final fyf a;
   private final ghq b = ghq.i(gnc.a);

   gel(gbh $$0, double $$1, double $$2, double $$3) {
      super($$0, $$1, $$2, $$3);
      this.a = new fxs(fil.Q().aT().a(gak.aq));
      this.u = 0.0F;
      this.t = 30;
   }

   @Override
   public ges b() {
      return ges.d;
   }

   @Override
   public void a(fdi $$0, fhu $$1, float $$2) {
      float $$3 = ((float)this.s + $$2) / (float)this.t;
      float $$4 = 0.05F + 0.5F * azd.a($$3 * (float) Math.PI);
      int $$5 = axo.a($$4, 1.0F, 1.0F, 1.0F);
      fde $$6 = new fde();
      $$6.a($$1.f());
      $$6.a(a.b.rotationDegrees(60.0F - 150.0F * $$3));
      float $$7 = 0.42553192F;
      $$6.b(0.42553192F, -0.42553192F, -0.42553192F);
      $$6.a(0.0F, -0.56F, 3.5F);
      ghg.a $$8 = fil.Q().aS().c();
      fdi $$9 = $$8.getBuffer(this.b);
      this.a.a($$6, $$9, 15728880, gws.d, $$5);
      $$8.b();
   }

   public static class a implements ger<lr> {
      public geo a(lr $$0, gbh $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         return new gel($$1, $$2, $$3, $$4);
      }
   }
}
