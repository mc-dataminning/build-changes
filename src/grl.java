public class grl implements gqt {
   public static final float a = 0.01F;
   public static final float b = 0.001F;
   public static final float c = 1.0E-4F;
   private static final int d = 0;
   private final gbm e;
   private final gsn f;
   private int g = 0;

   public grl(gbm $$0, gsn $$1) {
      this.e = $$0;
      this.f = $$1;
   }

   @Override
   public void a() {
      this.g--;
      if (this.g <= 0 && this.e.bj()) {
         float $$0 = this.e.dP().z.i();
         if ($$0 < 1.0E-4F) {
            this.g = 0;
            this.f.a((grj)(new grm.a(this.e, avi.C)));
         } else if ($$0 < 0.001F) {
            this.g = 0;
            this.f.a((grj)(new grm.a(this.e, avi.B)));
         } else if ($$0 < 0.01F) {
            this.g = 0;
            this.f.a((grj)(new grm.a(this.e, avi.A)));
         }
      }
   }
}
