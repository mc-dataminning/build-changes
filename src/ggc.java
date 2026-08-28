public class ggc extends ggf {
   private final fzv a;
   private final gjh b = gjh.i(got.a);

   ggc(gcy $$0, double $$1, double $$2, double $$3) {
      super($$0, $$1, $$2, $$3);
      this.a = new fzi(fjx.Q().aS().a(gcb.aq));
      this.u = 0.0F;
      this.t = 30;
   }

   @Override
   public ggj b() {
      return ggj.d;
   }

   @Override
   public void a(feo $$0, fjg $$1, float $$2) {
      float $$3 = ((float)this.s + $$2) / (float)this.t;
      float $$4 = 0.05F + 0.5F * azn.a($$3 * (float) Math.PI);
      int $$5 = axy.a($$4, 1.0F, 1.0F, 1.0F);
      fek $$6 = new fek();
      $$6.a($$1.f());
      $$6.a(a.b.rotationDegrees(60.0F - 150.0F * $$3));
      float $$7 = 0.42553192F;
      $$6.b(0.42553192F, -0.42553192F, -0.42553192F);
      $$6.a(0.0F, -0.56F, 3.5F);
      gix.a $$8 = fjx.Q().aR().c();
      feo $$9 = $$8.getBuffer(this.b);
      this.a.a($$6, $$9, 15728880, gyk.d, $$5);
      $$8.b();
   }

   public static class a implements ggi<lw> {
      public ggf a(lw $$0, gcy $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         return new ggc($$1, $$2, $$3, $$4);
      }
   }
}
