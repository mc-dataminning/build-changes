public class hdd implements hcl {
   public static final float a = 0.01F;
   public static final float b = 0.001F;
   public static final float c = 1.0E-4F;
   private static final int d = 0;
   private final gic e;
   private final heg f;
   private int g = 0;

   public hdd(gic $$0, heg $$1) {
      this.e = $$0;
      this.f = $$1;
   }

   @Override
   public void a() {
      this.g--;
      if (this.g <= 0 && this.e.bo()) {
         float $$0 = this.e.dV().A.i();
         if ($$0 < 1.0E-4F) {
            this.g = 0;
            this.f.a((hdb)(new hde.a(this.e, awn.C)));
         } else if ($$0 < 0.001F) {
            this.g = 0;
            this.f.a((hdb)(new hde.a(this.e, awn.B)));
         } else if ($$0 < 0.01F) {
            this.g = 0;
            this.f.a((hdb)(new hde.a(this.e, awn.A)));
         }
      }
   }
}
