public class guo implements gtw {
   public static final float a = 0.01F;
   public static final float b = 0.001F;
   public static final float c = 1.0E-4F;
   private static final int d = 0;
   private final gei e;
   private final gvq f;
   private int g = 0;

   public guo(gei $$0, gvq $$1) {
      this.e = $$0;
      this.f = $$1;
   }

   @Override
   public void a() {
      this.g--;
      if (this.g <= 0 && this.e.bn()) {
         float $$0 = this.e.dU().A.i();
         if ($$0 < 1.0E-4F) {
            this.g = 0;
            this.f.a((gum)(new gup.a(this.e, avo.H)));
         } else if ($$0 < 0.001F) {
            this.g = 0;
            this.f.a((gum)(new gup.a(this.e, avo.G)));
         } else if ($$0 < 0.01F) {
            this.g = 0;
            this.f.a((gum)(new gup.a(this.e, avo.F)));
         }
      }
   }
}
