public class fwj extends fwg {
   private final fwb a;
   private static final int b = 8;

   protected fwj(fsa $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6, float $$7, fwb $$8) {
      super($$0, $$1, $$2, $$3, 0.0, 0.0, 0.0);
      this.a = $$8;
      this.B = 0.96F;
      this.u = -0.1F;
      this.C = true;
      this.j *= 0.0;
      this.k *= 0.9;
      this.l *= 0.0;
      this.j += $$4;
      this.k += $$5;
      this.l += $$6;
      this.D *= 0.75F * $$7;
      this.t = (int)(8.0F / aww.b(this.r, 0.5F, 1.0F) * $$7);
      this.t = Math.max(this.t, 1);
      this.b($$8);
      this.n = true;
   }

   @Override
   public fvk b() {
      return fvk.b;
   }

   @Override
   public int a(float $$0) {
      return 240;
   }

   @Override
   public fvt.a p() {
      return fvt.a.b;
   }

   @Override
   public void a() {
      super.a();
      this.b(this.a);
   }

   @Override
   public float b(float $$0) {
      return this.D * aww.a(((float)this.s + $$0) / (float)this.t * 32.0F, 0.0F, 1.0F);
   }

   public static class a implements fvj<kf> {
      private final fwb a;

      public a(fwb $$0) {
         this.a = $$0;
      }

      public fvg a(kf $$0, fsa $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         return new fwj($$1, $$2, $$3, $$4, $$5, $$6, $$7, 1.5F, this.a);
      }
   }
}
