public class gkq implements gjy {
   public static final float a = 0.01F;
   public static final float b = 0.001F;
   public static final float c = 1.0E-4F;
   private static final int d = 0;
   private final fuv e;
   private final gls f;
   private int g = 0;

   public gkq(fuv $$0, gls $$1) {
      this.e = $$0;
      this.f = $$1;
   }

   @Override
   public void a() {
      this.g--;
      if (this.g <= 0 && this.e.be()) {
         float $$0 = this.e.dM().z.i();
         if ($$0 < 1.0E-4F) {
            this.g = 0;
            this.f.a((gko)(new gkr.a(this.e, atl.C)));
         } else if ($$0 < 0.001F) {
            this.g = 0;
            this.f.a((gko)(new gkr.a(this.e, atl.B)));
         } else if ($$0 < 0.01F) {
            this.g = 0;
            this.f.a((gko)(new gkr.a(this.e, atl.A)));
         }
      }
   }
}
