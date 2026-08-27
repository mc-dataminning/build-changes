public class gmo implements glw {
   public static final float a = 0.01F;
   public static final float b = 0.001F;
   public static final float c = 1.0E-4F;
   private static final int d = 0;
   private final fws e;
   private final gnq f;
   private int g = 0;

   public gmo(fws $$0, gnq $$1) {
      this.e = $$0;
      this.f = $$1;
   }

   @Override
   public void a() {
      this.g--;
      if (this.g <= 0 && this.e.bh()) {
         float $$0 = this.e.dM().z.i();
         if ($$0 < 1.0E-4F) {
            this.g = 0;
            this.f.a((gmm)(new gmp.a(this.e, aty.C)));
         } else if ($$0 < 0.001F) {
            this.g = 0;
            this.f.a((gmm)(new gmp.a(this.e, aty.B)));
         } else if ($$0 < 0.01F) {
            this.g = 0;
            this.f.a((gmm)(new gmp.a(this.e, aty.A)));
         }
      }
   }
}
