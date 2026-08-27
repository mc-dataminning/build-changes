public class gdb extends gda {
   gdb(fzn $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6) {
      super($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      this.D *= 1.5F;
      this.t = (int)(Math.random() * 2.0) + 60;
   }

   @Override
   public float b(float $$0) {
      float $$1 = 1.0F - ((float)this.s + $$0) / ((float)this.t * 1.5F);
      return this.D * $$1;
   }

   @Override
   public void a() {
      this.d = this.g;
      this.e = this.h;
      this.f = this.i;
      if (this.s++ >= this.t) {
         this.k();
      } else {
         float $$0 = (float)this.s / (float)this.t;
         this.g = this.g + this.j * (double)$$0;
         this.h = this.h + this.k * (double)$$0;
         this.i = this.i + this.l * (double)$$0;
      }
   }

   public static class a implements gcx<le> {
      private final gdp a;
      private final float b;
      private final float c;
      private final float d;

      public a(gdp $$0, float $$1, float $$2, float $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
      }

      public gcu a(le $$0, fzn $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         gdb $$8 = new gdb($$1, $$2, $$3, $$4, $$5, $$6, $$7);
         float $$9 = $$1.A.i() * 0.6F + 0.4F;
         $$8.a(this.b * $$9, this.c * $$9, this.d * $$9);
         $$8.a(this.a);
         return $$8;
      }
   }
}
