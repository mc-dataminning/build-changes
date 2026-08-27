public class gck implements gbs {
   public static final float a = 0.01F;
   public static final float b = 0.001F;
   public static final float c = 1.0E-4F;
   private static final int d = 0;
   private final fnc e;
   private final gdm f;
   private int g = 0;

   public gck(fnc $$0, gdm $$1) {
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
            this.f.a((gci)(new gcl.a(this.e, apg.C)));
         } else if ($$0 < 0.001F) {
            this.g = 0;
            this.f.a((gci)(new gcl.a(this.e, apg.B)));
         } else if ($$0 < 0.01F) {
            this.g = 0;
            this.f.a((gci)(new gcl.a(this.e, apg.A)));
         }
      }
   }
}
