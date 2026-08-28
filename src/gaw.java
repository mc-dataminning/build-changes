public class gaw extends gax {
   protected final gcc a;

   public gaw(gcc $$0) {
      super($$0);
      this.a = $$0.b("head");
   }

   public static gck a() {
      gck $$0 = new gck();
      gcm $$1 = $$0.a();
      $$1.a("head", gch.c().a(0, 0).a(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F), gce.a);
      return $$0;
   }

   public static gci b() {
      gck $$0 = a();
      gcm $$1 = $$0.a();
      $$1.b("head").a("hat", gch.c().a(32, 0).a(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new gcg(0.25F)), gce.a);
      return gci.a($$0, 64, 64);
   }

   public static gci c() {
      gck $$0 = a();
      return gci.a($$0, 64, 32);
   }

   @Override
   public void a(float $$0, float $$1, float $$2) {
      this.a.f = $$1 * (float) (Math.PI / 180.0);
      this.a.e = $$2 * (float) (Math.PI / 180.0);
   }
}
