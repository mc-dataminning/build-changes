public class gaq extends gav {
   gaq(fxq $$0, double $$1, double $$2, double $$3) {
      super($$0, $$1, $$2, $$3, 0.0, 0.0, 0.0);
      this.t = 8;
   }

   @Override
   public void a() {
      for (int $$0 = 0; $$0 < 6; $$0++) {
         double $$1 = this.g + (this.r.j() - this.r.j()) * 4.0;
         double $$2 = this.h + (this.r.j() - this.r.j()) * 4.0;
         double $$3 = this.i + (this.r.j() - this.r.j()) * 4.0;
         this.c.a(lj.w, $$1, $$2, $$3, (double)((float)this.s / (float)this.t), 0.0, 0.0);
      }

      this.s++;
      if (this.s == this.t) {
         this.k();
      }
   }

   public static class a implements gba<lm> {
      public gax a(lm $$0, fxq $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         return new gaq($$1, $$2, $$3, $$4);
      }
   }
}
