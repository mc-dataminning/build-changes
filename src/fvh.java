public class fvh extends fve {
   private final fuz a;
   private static final int b = 8;

   protected fvh(fra $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6, float $$7, fuz $$8) {
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
      this.t = (int)(8.0F / awm.b(this.r, 0.5F, 1.0F) * $$7);
      this.t = Math.max(this.t, 1);
      this.b($$8);
      this.n = true;
   }

   @Override
   public fui b() {
      return fui.b;
   }

   @Override
   public int a(float $$0) {
      return 240;
   }

   @Override
   public fur.a p() {
      return fur.a.b;
   }

   @Override
   public void a() {
      super.a();
      this.b(this.a);
   }

   @Override
   public float b(float $$0) {
      return this.D * awm.a(((float)this.s + $$0) / (float)this.t * 32.0F, 0.0F, 1.0F);
   }

   public static class a implements fuh<ke> {
      private final fuz a;

      public a(fuz $$0) {
         this.a = $$0;
      }

      public fue a(ke $$0, fra $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         return new fvh($$1, $$2, $$3, $$4, $$5, $$6, $$7, 1.5F, this.a);
      }
   }
}
