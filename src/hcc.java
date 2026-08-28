public class hcc implements hbk {
   public static final float a = 0.01F;
   public static final float b = 0.001F;
   public static final float c = 1.0E-4F;
   private static final int d = 0;
   private final ghd e;
   private final hdf f;
   private int g = 0;

   public hcc(ghd $$0, hdf $$1) {
      this.e = $$0;
      this.f = $$1;
   }

   @Override
   public void a() {
      this.g--;
      if (this.g <= 0 && this.e.bp()) {
         float $$0 = this.e.dX().A.i();
         if ($$0 < 1.0E-4F) {
            this.g = 0;
            this.f.a((hca)(new hcd.a(this.e, awl.C)));
         } else if ($$0 < 0.001F) {
            this.g = 0;
            this.f.a((hca)(new hcd.a(this.e, awl.B)));
         } else if ($$0 < 0.01F) {
            this.g = 0;
            this.f.a((hca)(new hcd.a(this.e, awl.A)));
         }
      }
   }
}
