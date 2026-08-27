public class fut extends fve {
   private final fuz a;

   protected fut(fra $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6, fuz $$7) {
      super($$0, $$1, $$2, $$3);
      this.u = 0.225F;
      this.B = 1.0F;
      this.a = $$7;
      this.j = $$4 + (Math.random() * 2.0 - 1.0) * 0.05F;
      this.k = $$5 + (Math.random() * 2.0 - 1.0) * 0.05F;
      this.l = $$6 + (Math.random() * 2.0 - 1.0) * 0.05F;
      this.D = 0.1F * (this.r.i() * this.r.i() * 1.0F + 1.0F);
      this.t = (int)(16.0 / ((double)this.r.i() * 0.8 + 0.2)) + 2;
      this.b($$7);
   }

   @Override
   public fui b() {
      return fui.b;
   }

   @Override
   public void a() {
      super.a();
      this.b(this.a);
      this.j *= 0.95F;
      this.k *= 0.9F;
      this.l *= 0.95F;
   }

   public static class a implements fuh<ke> {
      private final fuz a;

      public a(fuz $$0) {
         this.a = $$0;
      }

      public fue a(ke $$0, fra $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         fut $$8 = new fut($$1, $$2, $$3, $$4, $$5, $$6, $$7, this.a);
         $$8.a(0.923F, 0.964F, 0.999F);
         return $$8;
      }
   }
}
