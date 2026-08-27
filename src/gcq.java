public class gcq implements gby {
   public static final float a = 0.01F;
   public static final float b = 0.001F;
   public static final float c = 1.0E-4F;
   private static final int d = 0;
   private final fni e;
   private final gds f;
   private int g = 0;

   public gcq(fni $$0, gds $$1) {
      this.e = $$0;
      this.f = $$1;
   }

   @Override
   public void a() {
      this.g--;
      if (this.g <= 0 && this.e.bc()) {
         float $$0 = this.e.dL().z.i();
         if ($$0 < 1.0E-4F) {
            this.g = 0;
            this.f.a((gco)(new gcr.a(this.e, apf.C)));
         } else if ($$0 < 0.001F) {
            this.g = 0;
            this.f.a((gco)(new gcr.a(this.e, apf.B)));
         } else if ($$0 < 0.01F) {
            this.g = 0;
            this.f.a((gco)(new gcr.a(this.e, apf.A)));
         }
      }
   }
}
