public class gbi extends gbm<gyl> {
   public static final gex a = gex.scaling(0.5F);
   private final geo b;
   private final geo c;

   public gbi(geo $$0) {
      super($$0);
      this.c = $$0.b("left_wing");
      this.b = $$0.b("right_wing");
   }

   public static geu a() {
      gew $$0 = new gew();
      gey $$1 = $$0.a();
      ges $$2 = new ges(1.0F);
      $$1.a(
         "left_wing",
         get.c().a(22, 0).a(-10.0F, 0.0F, 0.0F, 10.0F, 20.0F, 2.0F, $$2),
         geq.a(5.0F, 0.0F, 0.0F, (float) (Math.PI / 12), 0.0F, (float) (-Math.PI / 12))
      );
      $$1.a(
         "right_wing",
         get.c().a(22, 0).a().a(0.0F, 0.0F, 0.0F, 10.0F, 20.0F, 2.0F, $$2),
         geq.a(-5.0F, 0.0F, 0.0F, (float) (Math.PI / 12), 0.0F, (float) (Math.PI / 12))
      );
      return geu.a($$0, 64, 32);
   }

   public void a(gyl $$0) {
      super.a($$0);
      this.c.c = $$0.I ? 3.0F : 0.0F;
      this.c.e = $$0.N;
      this.c.g = $$0.P;
      this.c.f = $$0.O;
      this.b.f = -this.c.f;
      this.b.c = this.c.c;
      this.b.e = this.c.e;
      this.b.g = -this.c.g;
   }
}
