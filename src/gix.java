public class gix extends ghn<hec> {
   private final gkr a;
   private final gkr b;

   public gix(gkr $$0) {
      super($$0);
      this.a = $$0.b("left_fin");
      this.b = $$0.b("right_fin");
   }

   public static gkx a() {
      gkz $$0 = new gkz();
      glb $$1 = $$0.a();
      int $$2 = 23;
      $$1.a("body", gkw.c().a(0, 27).a(-1.5F, -2.0F, -1.5F, 3.0F, 2.0F, 3.0F), gkt.a(0.0F, 23.0F, 0.0F));
      $$1.a("right_eye", gkw.c().a(24, 6).a(-1.5F, 0.0F, -1.5F, 1.0F, 1.0F, 1.0F), gkt.a(0.0F, 20.0F, 0.0F));
      $$1.a("left_eye", gkw.c().a(28, 6).a(0.5F, 0.0F, -1.5F, 1.0F, 1.0F, 1.0F), gkt.a(0.0F, 20.0F, 0.0F));
      $$1.a("back_fin", gkw.c().a(-3, 0).a(-1.5F, 0.0F, 0.0F, 3.0F, 0.0F, 3.0F), gkt.a(0.0F, 22.0F, 1.5F));
      $$1.a("right_fin", gkw.c().a(25, 0).a(-1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 2.0F), gkt.a(-1.5F, 22.0F, -1.5F));
      $$1.a("left_fin", gkw.c().a(25, 0).a(0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 2.0F), gkt.a(1.5F, 22.0F, -1.5F));
      return gkx.a($$0, 32, 32);
   }

   @Override
   public void a(hec $$0) {
      super.a($$0);
      this.b.g = -0.2F + 0.4F * azz.a($$0.v * 0.2F);
      this.a.g = 0.2F - 0.4F * azz.a($$0.v * 0.2F);
   }
}
