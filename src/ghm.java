public class ghm extends gii {
   private final gjo a;
   private final gjo b;
   private final gjo c;

   public ghm(gjo $$0) {
      super($$0);
      this.a = $$0.b("head");
      this.b = this.a.b("left_ear");
      this.c = this.a.b("right_ear");
   }

   public static gjw a() {
      gjw $$0 = new gjw();
      ghn.a(gjs.a, $$0);
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
}
