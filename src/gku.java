public class gku extends gkt {
   private final flm d;

   public gku(flm $$0) {
      this.d = $$0;
   }

   private static float a(boolean $$0, boolean $$1) {
      if ($$0 == $$1) {
         return 0.0F;
      } else {
         return $$0 ? 1.0F : -1.0F;
      }
   }

   @Override
   public void a() {
      this.a = new cou(this.d.v.e(), this.d.x.e(), this.d.w.e(), this.d.y.e(), this.d.z.e(), this.d.A.e(), this.d.B.e());
      this.c = a(this.a.a(), this.a.b());
      this.b = a(this.a.c(), this.a.d());
   }
}
