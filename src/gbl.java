public class gbl extends gbk {
   gbl(fxx $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6) {
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

   public static class a implements gbh<lm> {
      private final gbz a;

      public a(gbz $$0) {
         this.a = $$0;
      }

      public gbe a(lm $$0, fxx $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         gbl $$8 = new gbl($$1, $$2, $$3, $$4, $$5, $$6, $$7);
         $$8.a(this.a);
         return $$8;
      }
   }
}
