public class gak {
   private final fby a;
   private final fzw b;
   private float c;
   private float d;

   public gak(fzw $$0) {
      this.b = $$0;
      this.a = fby.Q();
   }

   public void a(float $$0, float $$1) {
      float $$2 = (float)((double)$$0 * this.a.m.s().c());
      this.c = b(this.c + $$2 * 0.1F, 360.0F);
      this.d = b(this.d + $$2 * 0.001F, (float) (Math.PI * 2));
      this.b.a(this.a, 10.0F, -this.c, $$1);
   }

   public void a(float $$0) {
      this.a($$0, 1.0F);
   }

   private static float b(float $$0, float $$1) {
      return $$0 > $$1 ? $$0 - $$1 : $$0;
   }
}
