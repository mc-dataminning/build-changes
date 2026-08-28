public class gmx<T extends lz> extends gou {
   private final gop a;

   protected gmx(gkl $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6, T $$7, gop $$8) {
      super($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      this.B = 0.96F;
      this.C = true;
      this.a = $$8;
      this.j *= 0.1F;
      this.k *= 0.1F;
      this.l *= 0.1F;
      this.D = this.D * 0.75F * $$7.d();
      int $$9 = (int)(8.0 / (this.r.j() * 0.8 + 0.2));
      this.t = (int)Math.max((float)$$9 * $$7.d(), 1.0F);
      this.b($$8);
   }

   protected float a(float $$0, float $$1) {
      return (this.r.i() * 0.2F + 0.8F) * $$0 * $$1;
   }

   @Override
   public gny b() {
      return gny.b;
   }

   @Override
   public float b(float $$0) {
      return this.D * azm.a(((float)this.s + $$0) / (float)this.t * 32.0F, 0.0F, 1.0F);
   }

   @Override
   public void a() {
      super.a();
      this.b(this.a);
   }
}
