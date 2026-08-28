public class gbr extends gcc<gzl> {
   private final gfe a;

   public gbr(gfe $$0) {
      super($$0);
      this.a = $$0.b("tail_fin");
   }

   public static gfk a() {
      gfm $$0 = new gfm();
      gfo $$1 = $$0.a();
      int $$2 = 22;
      $$1.a("body", gfj.c().a(0, 0).a(-1.0F, -2.0F, 0.0F, 2.0F, 4.0F, 7.0F), gfg.a(0.0F, 22.0F, 0.0F));
      $$1.a("head", gfj.c().a(11, 0).a(-1.0F, -2.0F, -3.0F, 2.0F, 4.0F, 3.0F), gfg.a(0.0F, 22.0F, 0.0F));
      $$1.a("nose", gfj.c().a(0, 0).a(-1.0F, -2.0F, -1.0F, 2.0F, 3.0F, 1.0F), gfg.a(0.0F, 22.0F, -3.0F));
      $$1.a("right_fin", gfj.c().a(22, 1).a(-2.0F, 0.0F, -1.0F, 2.0F, 0.0F, 2.0F), gfg.a(-1.0F, 23.0F, 0.0F, 0.0F, 0.0F, (float) (-Math.PI / 4)));
      $$1.a("left_fin", gfj.c().a(22, 4).a(0.0F, 0.0F, -1.0F, 2.0F, 0.0F, 2.0F), gfg.a(1.0F, 23.0F, 0.0F, 0.0F, 0.0F, (float) (Math.PI / 4)));
      $$1.a("tail_fin", gfj.c().a(22, 3).a(0.0F, -2.0F, 0.0F, 0.0F, 4.0F, 4.0F), gfg.a(0.0F, 22.0F, 7.0F));
      $$1.a("top_fin", gfj.c().a(20, -6).a(0.0F, -1.0F, -1.0F, 0.0F, 1.0F, 6.0F), gfg.a(0.0F, 20.0F, 0.0F));
      return gfk.a($$0, 32, 32);
   }

   public void a(gzl $$0) {
      super.a($$0);
      float $$1 = $$0.ak ? 1.0F : 1.5F;
      this.a.f = -$$1 * 0.45F * ayz.a(0.6F * $$0.u);
   }
}
