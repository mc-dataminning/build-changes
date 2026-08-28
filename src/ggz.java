public class ggz extends ghn<hfe> {
   private final gkr a;

   public ggz(gkr $$0) {
      super($$0);
      this.a = $$0.b("tail_fin");
   }

   public static gkx a() {
      gkz $$0 = new gkz();
      glb $$1 = $$0.a();
      int $$2 = 22;
      $$1.a("body", gkw.c().a(0, 0).a(-1.0F, -2.0F, 0.0F, 2.0F, 4.0F, 7.0F), gkt.a(0.0F, 22.0F, 0.0F));
      $$1.a("head", gkw.c().a(11, 0).a(-1.0F, -2.0F, -3.0F, 2.0F, 4.0F, 3.0F), gkt.a(0.0F, 22.0F, 0.0F));
      $$1.a("nose", gkw.c().a(0, 0).a(-1.0F, -2.0F, -1.0F, 2.0F, 3.0F, 1.0F), gkt.a(0.0F, 22.0F, -3.0F));
      $$1.a("right_fin", gkw.c().a(22, 1).a(-2.0F, 0.0F, -1.0F, 2.0F, 0.0F, 2.0F), gkt.a(-1.0F, 23.0F, 0.0F, 0.0F, 0.0F, (float) (-Math.PI / 4)));
      $$1.a("left_fin", gkw.c().a(22, 4).a(0.0F, 0.0F, -1.0F, 2.0F, 0.0F, 2.0F), gkt.a(1.0F, 23.0F, 0.0F, 0.0F, 0.0F, (float) (Math.PI / 4)));
      $$1.a("tail_fin", gkw.c().a(22, 3).a(0.0F, -2.0F, 0.0F, 0.0F, 4.0F, 4.0F), gkt.a(0.0F, 22.0F, 7.0F));
      $$1.a("top_fin", gkw.c().a(20, -6).a(0.0F, -1.0F, -1.0F, 0.0F, 1.0F, 6.0F), gkt.a(0.0F, 20.0F, 0.0F));
      return gkx.a($$0, 32, 32);
   }

   public void a(hfe $$0) {
      super.a($$0);
      float $$1 = $$0.an ? 1.0F : 1.5F;
      this.a.f = -$$1 * 0.45F * azz.a(0.6F * $$0.v);
   }
}
