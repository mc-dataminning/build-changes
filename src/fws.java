public class fws {
   private final eyk a;
   private final fwe b;
   private float c;
   private float d;

   public fws(fwe $$0) {
      this.b = $$0;
      this.a = eyk.P();
   }

   public void a(float $$0, float $$1) {
      float $$2 = (float)((double)$$0 * this.a.m.q().c());
      this.c = b(this.c + $$2 * 0.1F, 360.0F);
      this.d = b(this.d + $$2 * 0.001F, (float) (Math.PI * 2));
      this.b.a(this.a, 10.0F, -this.c, $$1);
   }

   private static float b(float $$0, float $$1) {
      return $$0 > $$1 ? $$0 - $$1 : $$0;
   }
}
