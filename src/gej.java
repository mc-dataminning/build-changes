public class gej extends gcc<has> {
   private final gfe a;

   public gej(gfe $$0) {
      super($$0);
      this.a = $$0.b("tail");
   }

   public static gfk a(gfi $$0) {
      gfm $$1 = new gfm();
      gfo $$2 = $$1.a();
      int $$3 = 22;
      $$2.a("body", gfj.c().a(0, 0).a(-1.0F, -1.5F, -3.0F, 2.0F, 3.0F, 6.0F, $$0), gfg.a(0.0F, 22.0F, 0.0F));
      $$2.a("tail", gfj.c().a(22, -6).a(0.0F, -1.5F, 0.0F, 0.0F, 3.0F, 6.0F, $$0), gfg.a(0.0F, 22.0F, 3.0F));
      $$2.a("right_fin", gfj.c().a(2, 16).a(-2.0F, -1.0F, 0.0F, 2.0F, 2.0F, 0.0F, $$0), gfg.a(-1.0F, 22.5F, 0.0F, 0.0F, (float) (Math.PI / 4), 0.0F));
      $$2.a("left_fin", gfj.c().a(2, 12).a(0.0F, -1.0F, 0.0F, 2.0F, 2.0F, 0.0F, $$0), gfg.a(1.0F, 22.5F, 0.0F, 0.0F, (float) (-Math.PI / 4), 0.0F));
      $$2.a("top_fin", gfj.c().a(10, -5).a(0.0F, -3.0F, 0.0F, 0.0F, 3.0F, 6.0F, $$0), gfg.a(0.0F, 20.5F, -3.0F));
      return gfk.a($$1, 32, 32);
   }

   public void a(has $$0) {
      super.a($$0);
      float $$1 = $$0.ak ? 1.0F : 1.5F;
      this.a.f = -$$1 * 0.45F * ayz.a(0.6F * $$0.u);
   }
}
