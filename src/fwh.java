public class fwh extends fxb {
   private final fye a;
   private final fye b;
   private final fye c;

   public fwh(fye $$0) {
      this.a = $$0.b("head");
      this.b = this.a.b("left_ear");
      this.c = this.a.b("right_ear");
   }

   public static fym a() {
      fym $$0 = new fym();
      fwi.a(fyi.a, $$0);
      return $$0;
   }

   @Override
   public void a(float $$0, float $$1, float $$2) {
      this.a.f = $$1 * (float) (Math.PI / 180.0);
      this.a.e = $$2 * (float) (Math.PI / 180.0);
      float $$3 = 1.2F;
      this.b.g = (float)(-(Math.cos((double)($$0 * (float) Math.PI * 0.2F * 1.2F)) + 2.5)) * 0.2F;
      this.c.g = (float)(Math.cos((double)($$0 * (float) Math.PI * 0.2F)) + 2.5) * 0.2F;
   }

   @Override
   public void a(fbc $$0, fbg $$1, int $$2, int $$3, int $$4) {
      this.a.a($$0, $$1, $$2, $$3, $$4);
   }
}
