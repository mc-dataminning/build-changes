public class fyq extends fza<gwb> {
   private final gcc a;

   public fyq(gcc $$0) {
      super($$0);
      this.a = $$0.b("tail_fin");
   }

   public static gci a() {
      gck $$0 = new gck();
      gcm $$1 = $$0.a();
      int $$2 = 22;
      $$1.a("body", gch.c().a(0, 0).a(-1.0F, -2.0F, 0.0F, 2.0F, 4.0F, 7.0F), gce.a(0.0F, 22.0F, 0.0F));
      $$1.a("head", gch.c().a(11, 0).a(-1.0F, -2.0F, -3.0F, 2.0F, 4.0F, 3.0F), gce.a(0.0F, 22.0F, 0.0F));
      $$1.a("nose", gch.c().a(0, 0).a(-1.0F, -2.0F, -1.0F, 2.0F, 3.0F, 1.0F), gce.a(0.0F, 22.0F, -3.0F));
      $$1.a("right_fin", gch.c().a(22, 1).a(-2.0F, 0.0F, -1.0F, 2.0F, 0.0F, 2.0F), gce.a(-1.0F, 23.0F, 0.0F, 0.0F, 0.0F, (float) (-Math.PI / 4)));
      $$1.a("left_fin", gch.c().a(22, 4).a(0.0F, 0.0F, -1.0F, 2.0F, 0.0F, 2.0F), gce.a(1.0F, 23.0F, 0.0F, 0.0F, 0.0F, (float) (Math.PI / 4)));
      $$1.a("tail_fin", gch.c().a(22, 3).a(0.0F, -2.0F, 0.0F, 0.0F, 4.0F, 4.0F), gce.a(0.0F, 22.0F, 7.0F));
      $$1.a("top_fin", gch.c().a(20, -6).a(0.0F, -1.0F, -1.0F, 0.0F, 1.0F, 6.0F), gce.a(0.0F, 20.0F, 0.0F));
      return gci.a($$0, 32, 32);
   }

   public void a(gwb $$0) {
      super.a($$0);
      float $$1 = $$0.af ? 1.0F : 1.5F;
      this.a.f = -$$1 * 0.45F * azn.a(0.6F * $$0.p);
   }
}
