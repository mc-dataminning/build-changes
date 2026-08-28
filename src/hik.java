public class hik implements hhs {
   public static final float a = 0.01F;
   public static final float b = 0.001F;
   public static final float c = 1.0E-4F;
   private static final int d = 0;
   private final gkv e;
   private final hjo f;
   private int g = 0;

   public hik(gkv $$0, hjo $$1) {
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
            this.f.a((hii)(new hil.a(this.e, awa.C)));
         } else if ($$0 < 0.001F) {
            this.g = 0;
            this.f.a((hii)(new hil.a(this.e, awa.B)));
         } else if ($$0 < 0.01F) {
            this.g = 0;
            this.f.a((hii)(new hil.a(this.e, awa.A)));
         }
      }
   }
}
