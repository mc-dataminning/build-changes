public class ggb extends gga {
   private final fip i;

   public ggb(fip $$0) {
      this.i = $$0;
   }

   private static float a(boolean $$0, boolean $$1) {
      if ($$0 == $$1) {
         return 0.0F;
      } else {
         return $$0 ? 1.0F : -1.0F;
      }
   }

   @Override
   public void a(boolean $$0, float $$1) {
      this.c = this.i.v.e();
      this.d = this.i.x.e();
      this.e = this.i.w.e();
      this.f = this.i.y.e();
      this.b = a(this.c, this.d);
      this.a = a(this.e, this.f);
      this.g = this.i.z.e();
      this.h = this.i.A.e();
      if ($$0) {
         this.a *= $$1;
         this.b *= $$1;
      }
   }
}
