public class fvb extends fve {
   private final foz a;
   private final fxy b = fxy.i(gcr.a);

   fvb(fry $$0, double $$1, double $$2, double $$3) {
      super($$0, $$1, $$2, $$3);
      this.a = new foj(ezg.Q().aR().a(frc.R));
      this.u = 0.0F;
      this.t = 30;
   }

   @Override
   public fvi b() {
      return fvi.e;
   }

   @Override
   public void a(eud $$0, eyr $$1, float $$2) {
      float $$3 = ((float)this.s + $$2) / (float)this.t;
      float $$4 = 0.05F + 0.5F * aww.a($$3 * (float) Math.PI);
      etz $$5 = new etz();
      $$5.a($$1.f());
      $$5.a(a.b.rotationDegrees(150.0F * $$3 - 60.0F));
      $$5.b(-1.0F, -1.0F, 1.0F);
      $$5.a(0.0F, -1.101F, 1.5F);
      fxq.a $$6 = ezg.Q().aQ().c();
      eud $$7 = $$6.getBuffer(this.b);
      this.a.a($$5, $$7, 15728880, giq.d, 1.0F, 1.0F, 1.0F, $$4);
      $$6.b();
   }

   public static class a implements fvh<kf> {
      public fve a(kf $$0, fry $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         return new fvb($$1, $$2, $$3, $$4);
      }
   }
}
