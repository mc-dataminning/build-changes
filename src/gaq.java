public class gaq extends gay {
   private final double a;
   private final int b;

   gaq(fxt $$0, double $$1, double $$2, double $$3, double $$4, int $$5, int $$6) {
      super($$0, $$1, $$2, $$3, 0.0, 0.0, 0.0);
      this.a = $$4;
      this.t = $$5;
      this.b = $$6;
   }

   @Override
   public void a() {
      if (this.s % (this.b + 1) == 0) {
         for (int $$0 = 0; $$0 < 3; $$0++) {
            double $$1 = this.g + (this.r.j() - this.r.j()) * this.a;
            double $$2 = this.h + (this.r.j() - this.r.j()) * this.a;
            double $$3 = this.i + (this.r.j() - this.r.j()) * this.a;
            this.c.a(li.x, $$1, $$2, $$3, (double)((float)this.s / (float)this.t), 0.0, 0.0);
         }
      }

      if (this.s++ == this.t) {
         this.k();
      }
   }

   public static class a implements gbd<lm> {
      private final double a;
      private final int b;
      private final int c;

      public a(double $$0, int $$1, int $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      public gba a(lm $$0, fxt $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         return new gaq($$1, $$2, $$3, $$4, this.a, this.b, this.c);
      }
   }
}
