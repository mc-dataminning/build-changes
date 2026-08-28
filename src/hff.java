public class hff implements hen {
   public static final float a = 0.01F;
   public static final float b = 0.001F;
   public static final float c = 1.0E-4F;
   private static final int d = 0;
   private final gkc e;
   private final hgj f;
   private int g = 0;

   public hff(gkc $$0, hgj $$1) {
      this.e = $$0;
      this.f = $$1;
   }

   @Override
   public void a() {
      this.g--;
      if (this.g <= 0 && this.e.bo()) {
         float $$0 = this.e.dW().A.i();
         if ($$0 < 1.0E-4F) {
            this.g = 0;
            this.f.a((hfd)(new hfg.a(this.e, awv.C)));
         } else if ($$0 < 0.001F) {
            this.g = 0;
            this.f.a((hfd)(new hfg.a(this.e, awv.B)));
         } else if ($$0 < 0.01F) {
            this.g = 0;
            this.f.a((hfd)(new hfg.a(this.e, awv.A)));
         }
      }
   }
}
