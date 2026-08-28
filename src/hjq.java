public class hjq implements hiy {
   public static final float a = 0.01F;
   public static final float b = 0.001F;
   public static final float c = 1.0E-4F;
   private static final int d = 0;
   private final glv e;
   private final hku f;
   private int g = 0;

   public hjq(glv $$0, hku $$1) {
      this.e = $$0;
      this.f = $$1;
   }

   @Override
   public void a() {
      this.g--;
      if (this.g <= 0 && this.e.bm()) {
         float $$0 = this.e.dU().A.i();
         if ($$0 < 1.0E-4F) {
            this.g = 0;
            this.f.a((hjo)(new hjr.a(this.e, awa.C)));
         } else if ($$0 < 0.001F) {
            this.g = 0;
            this.f.a((hjo)(new hjr.a(this.e, awa.B)));
         } else if ($$0 < 0.01F) {
            this.g = 0;
            this.f.a((hjo)(new hjr.a(this.e, awa.A)));
         }
      }
   }
}
