public class gbf extends fza<gwb> {
   private final gcc a;

   public gbf(gcc $$0) {
      super($$0, gjh::f);
      this.a = $$0.b("tail");
   }

   public static gci a() {
      gck $$0 = new gck();
      gcm $$1 = $$0.a();
      float $$2 = 0.0F;
      float $$3 = 22.0F;
      float $$4 = -3.0F;
      $$1.a("body", gch.c().a(0, 0).a(-1.5F, -1.0F, 0.0F, 3.0F, 2.0F, 3.0F), gce.a(0.0F, 22.0F, -3.0F));
      $$1.a("tail", gch.c().a(0, 0).a(0.0F, -1.0F, 0.0F, 0.0F, 2.0F, 7.0F), gce.a(0.0F, 22.0F, 0.0F));
      return gci.a($$0, 16, 16);
   }

   public void a(gwb $$0) {
      super.a($$0);
      float $$1 = $$0.af ? 1.0F : 1.5F;
      this.a.f = -$$1 * 0.25F * azn.a(0.3F * $$0.p);
   }
}
