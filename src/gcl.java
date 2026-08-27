public class gcl extends gdu {
   gcl(fzn $$0, double $$1, double $$2, double $$3) {
      super($$0, $$1, $$2, $$3, 0.0, 0.0, 0.0);
      this.C = true;
      this.B = 0.86F;
      this.j *= 0.01F;
      this.k *= 0.01F;
      this.l *= 0.01F;
      this.k += 0.1;
      this.D *= 1.5F;
      this.t = 16;
      this.n = false;
   }

   @Override
   public gcy b() {
      return gcy.b;
   }

   @Override
   public float b(float $$0) {
      return this.D * aym.a(((float)this.s + $$0) / (float)this.t * 32.0F, 0.0F, 1.0F);
   }

   public static class a implements gcx<le> {
      private final gdp a;

      public a(gdp $$0) {
         this.a = $$0;
      }

      public gcu a(le $$0, fzn $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         gcl $$8 = new gcl($$1, $$2, $$3 + 0.5, $$4);
         $$8.a(this.a);
         $$8.a(1.0F, 1.0F, 1.0F);
         return $$8;
      }
   }

   public static class b implements gcx<le> {
      private final gdp a;

      public b(gdp $$0) {
         this.a = $$0;
      }

      public gcu a(le $$0, fzn $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         gcl $$8 = new gcl($$1, $$2, $$3, $$4);
         $$8.a(this.a);
         return $$8;
      }
   }
}
