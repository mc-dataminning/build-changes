public class hop implements hnx {
   public static final float a = 0.01F;
   public static final float b = 0.001F;
   public static final float c = 1.0E-4F;
   private static final int d = 0;
   private final gqm e;
   private final hpt f;
   private int g = 0;

   public hop(gqm $$0, hpt $$1) {
      this.e = $$0;
      this.f = $$1;
   }

   @Override
   public void a() {
      this.g--;
      if (this.g <= 0 && this.e.bm()) {
         float $$0 = this.e.dV().A.i();
         if ($$0 < 1.0E-4F) {
            this.g = 0;
            this.f.a((hon)(new hoq.a(this.e, awy.C)));
         } else if ($$0 < 0.001F) {
            this.g = 0;
            this.f.a((hon)(new hoq.a(this.e, awy.B)));
         } else if ($$0 < 0.01F) {
            this.g = 0;
            this.f.a((hon)(new hoq.a(this.e, awy.A)));
         }
      }
   }
}
