public class hoz implements hoh {
   public static final float a = 0.01F;
   public static final float b = 0.001F;
   public static final float c = 1.0E-4F;
   private static final int d = 0;
   private final gqz e;
   private final hqd f;
   private int g = 0;

   public hoz(gqz $$0, hqd $$1) {
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
            this.f.a((hox)(new hpa.a(this.e, awp.C)));
         } else if ($$0 < 0.001F) {
            this.g = 0;
            this.f.a((hox)(new hpa.a(this.e, awp.B)));
         } else if ($$0 < 0.01F) {
            this.g = 0;
            this.f.a((hox)(new hpa.a(this.e, awp.A)));
         }
      }
   }
}
