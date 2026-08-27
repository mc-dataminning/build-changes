public class gbv implements gbd {
   public static final float a = 0.01F;
   public static final float b = 0.001F;
   public static final float c = 1.0E-4F;
   private static final int d = 0;
   private final fmn e;
   private final gcx f;
   private int g = 0;

   public gbv(fmn $$0, gcx $$1) {
      this.e = $$0;
      this.f = $$1;
   }

   @Override
   public void a() {
      this.g--;
      if (this.g <= 0 && this.e.bc()) {
         float $$0 = this.e.dK().z.i();
         if ($$0 < 1.0E-4F) {
            this.g = 0;
            this.f.a((gbt)(new gbw.a(this.e, aow.C)));
         } else if ($$0 < 0.001F) {
            this.g = 0;
            this.f.a((gbt)(new gbw.a(this.e, aow.B)));
         } else if ($$0 < 0.01F) {
            this.g = 0;
            this.f.a((gbt)(new gbw.a(this.e, aow.A)));
         }
      }
   }
}
