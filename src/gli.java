public class gli {
   private static final int a = 49;
   private static final int b = 3;
   private double c = 2000000.0;
   private int d = 1;
   private volatile long e = ag.d();

   public void a() {
      this.e = ag.d();
   }

   public void a(int $$0) {
      if ($$0 > 0) {
         double $$1 = (double)(ag.d() - this.e);
         double $$2 = $$1 / (double)$$0;
         double $$3 = azz.a($$2, this.c / 3.0, this.c * 3.0);
         this.c = (this.c * (double)this.d + $$3) / (double)(this.d + 1);
         this.d = Math.min(49, this.d + 1);
      }
   }

   public float b() {
      return (float)(7000000.0 / this.c);
   }
}
