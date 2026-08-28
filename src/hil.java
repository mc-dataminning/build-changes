public class hil implements hht {
   public static final float a = 0.01F;
   public static final float b = 0.001F;
   public static final float c = 1.0E-4F;
   private static final int d = 0;
   private final gkt e;
   private final hjp f;
   private int g = 0;

   public hil(gkt $$0, hjp $$1) {
      this.e = $$0;
      this.f = $$1;
   }

   @Override
   public void a() {
      this.g--;
      if (this.g <= 0 && this.e.bo()) {
         float $$0 = this.e.dW().A.i();
         if ($$0 < 1.0E-4F) {
            this.g = 0;
            this.f.a((hij)(new him.a(this.e, avz.C)));
         } else if ($$0 < 0.001F) {
            this.g = 0;
            this.f.a((hij)(new him.a(this.e, avz.B)));
         } else if ($$0 < 0.01F) {
            this.g = 0;
            this.f.a((hij)(new him.a(this.e, avz.A)));
         }
      }
   }
}
