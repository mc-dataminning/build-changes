public class ghj extends ghn<hev> {
   public static final gla a = gla.scaling(0.5F);
   private final gkr b;
   private final gkr c;

   public ghj(gkr $$0) {
      super($$0);
      this.c = $$0.b("left_wing");
      this.b = $$0.b("right_wing");
   }

   public static gkx a() {
      gkz $$0 = new gkz();
      glb $$1 = $$0.a();
      gkv $$2 = new gkv(1.0F);
      $$1.a(
         "left_wing",
         gkw.c().a(22, 0).a(-10.0F, 0.0F, 0.0F, 10.0F, 20.0F, 2.0F, $$2),
         gkt.a(5.0F, 0.0F, 0.0F, (float) (Math.PI / 12), 0.0F, (float) (-Math.PI / 12))
      );
      $$1.a(
         "right_wing",
         gkw.c().a(22, 0).a().a(0.0F, 0.0F, 0.0F, 10.0F, 20.0F, 2.0F, $$2),
         gkt.a(-5.0F, 0.0F, 0.0F, (float) (Math.PI / 12), 0.0F, (float) (Math.PI / 12))
      );
      return gkx.a($$0, 64, 32);
   }

   public void a(hev $$0) {
      super.a($$0);
      this.c.c = $$0.Q ? 3.0F : 0.0F;
      this.c.e = $$0.V;
      this.c.g = $$0.X;
      this.c.f = $$0.W;
      this.b.f = -this.c.f;
      this.b.c = this.c.c;
      this.b.e = this.c.e;
      this.b.g = -this.c.g;
   }
}
