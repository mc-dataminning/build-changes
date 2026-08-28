public class gha extends ghb {
   protected final gig a;

   public gha(gig $$0) {
      super($$0);
      this.a = $$0.b("head");
   }

   public static gio a() {
      gio $$0 = new gio();
      giq $$1 = $$0.a();
      $$1.a("head", gil.c().a(0, 0).a(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F), gii.a);
      return $$0;
   }

   public static gim b() {
      gio $$0 = a();
      giq $$1 = $$0.a();
      $$1.b("head").a("hat", gil.c().a(32, 0).a(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new gik(0.25F)), gii.a);
      return gim.a($$0, 64, 64);
   }

   public static gim c() {
      gio $$0 = a();
      return gim.a($$0, 64, 32);
   }

   @Override
   public void a(float $$0, float $$1, float $$2) {
      this.a.f = $$1 * (float) (Math.PI / 180.0);
      this.a.e = $$2 * (float) (Math.PI / 180.0);
   }
}
