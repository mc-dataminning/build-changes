public class gdk implements gcs {
   public static final float a = 0.01F;
   public static final float b = 0.001F;
   public static final float c = 1.0E-4F;
   private static final int d = 0;
   private final foc e;
   private final gem f;
   private int g = 0;

   public gdk(foc $$0, gem $$1) {
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
            this.f.a((gdi)(new gdl.a(this.e, aqd.C)));
         } else if ($$0 < 0.001F) {
            this.g = 0;
            this.f.a((gdi)(new gdl.a(this.e, aqd.B)));
         } else if ($$0 < 0.01F) {
            this.g = 0;
            this.f.a((gdi)(new gdl.a(this.e, aqd.A)));
         }
      }
   }
}
