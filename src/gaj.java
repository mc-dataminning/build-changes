public class gaj extends fza<gvd> {
   private final gcc a;
   private final gcc b;

   public gaj(gcc $$0) {
      super($$0);
      this.a = $$0.b("left_fin");
      this.b = $$0.b("right_fin");
   }

   public static gci a() {
      gck $$0 = new gck();
      gcm $$1 = $$0.a();
      int $$2 = 23;
      $$1.a("body", gch.c().a(0, 27).a(-1.5F, -2.0F, -1.5F, 3.0F, 2.0F, 3.0F), gce.a(0.0F, 23.0F, 0.0F));
      $$1.a("right_eye", gch.c().a(24, 6).a(-1.5F, 0.0F, -1.5F, 1.0F, 1.0F, 1.0F), gce.a(0.0F, 20.0F, 0.0F));
      $$1.a("left_eye", gch.c().a(28, 6).a(0.5F, 0.0F, -1.5F, 1.0F, 1.0F, 1.0F), gce.a(0.0F, 20.0F, 0.0F));
      $$1.a("back_fin", gch.c().a(-3, 0).a(-1.5F, 0.0F, 0.0F, 3.0F, 0.0F, 3.0F), gce.a(0.0F, 22.0F, 1.5F));
      $$1.a("right_fin", gch.c().a(25, 0).a(-1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 2.0F), gce.a(-1.5F, 22.0F, -1.5F));
      $$1.a("left_fin", gch.c().a(25, 0).a(0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 2.0F), gce.a(1.5F, 22.0F, -1.5F));
      return gci.a($$0, 32, 32);
   }

   @Override
   public void a(gvd $$0) {
      super.a($$0);
      this.b.g = -0.2F + 0.4F * azn.a($$0.p * 0.2F);
      this.a.g = 0.2F - 0.4F * azn.a($$0.p * 0.2F);
   }
}
