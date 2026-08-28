public class gsy implements gsg {
   public static final float a = 0.01F;
   public static final float b = 0.001F;
   public static final float c = 1.0E-4F;
   private static final int d = 0;
   private final gcz e;
   private final gub f;
   private int g = 0;

   public gsy(gcz $$0, gub $$1) {
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
            this.f.a((gsw)(new gsz.a(this.e, avf.C)));
         } else if ($$0 < 0.001F) {
            this.g = 0;
            this.f.a((gsw)(new gsz.a(this.e, avf.B)));
         } else if ($$0 < 0.01F) {
            this.g = 0;
            this.f.a((gsw)(new gsz.a(this.e, avf.A)));
         }
      }
   }
}
