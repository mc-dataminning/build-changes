public class hnj implements hmr {
   public static final float a = 0.01F;
   public static final float b = 0.001F;
   public static final float c = 1.0E-4F;
   private static final int d = 0;
   private final gpj e;
   private final hon f;
   private int g = 0;

   public hnj(gpj $$0, hon $$1) {
      this.e = $$0;
      this.f = $$1;
   }

   @Override
   public void a() {
      this.g--;
      if (this.g <= 0 && this.e.bl()) {
         float $$0 = this.e.dU().A.i();
         if ($$0 < 1.0E-4F) {
            this.g = 0;
            this.f.a((hnh)(new hnk.a(this.e, awn.C)));
         } else if ($$0 < 0.001F) {
            this.g = 0;
            this.f.a((hnh)(new hnk.a(this.e, awn.B)));
         } else if ($$0 < 0.01F) {
            this.g = 0;
            this.f.a((hnh)(new hnk.a(this.e, awn.A)));
         }
      }
   }
}
