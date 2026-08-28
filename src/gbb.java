public class gbb extends gbf<gye> {
   public static final geq a = geq.scaling(0.5F);
   private final geh b;
   private final geh c;

   public gbb(geh $$0) {
      super($$0);
      this.c = $$0.b("left_wing");
      this.b = $$0.b("right_wing");
   }

   public static gen a() {
      gep $$0 = new gep();
      ger $$1 = $$0.a();
      gel $$2 = new gel(1.0F);
      $$1.a(
         "left_wing",
         gem.c().a(22, 0).a(-10.0F, 0.0F, 0.0F, 10.0F, 20.0F, 2.0F, $$2),
         gej.a(5.0F, 0.0F, 0.0F, (float) (Math.PI / 12), 0.0F, (float) (-Math.PI / 12))
      );
      $$1.a(
         "right_wing",
         gem.c().a(22, 0).a().a(0.0F, 0.0F, 0.0F, 10.0F, 20.0F, 2.0F, $$2),
         gej.a(-5.0F, 0.0F, 0.0F, (float) (Math.PI / 12), 0.0F, (float) (Math.PI / 12))
      );
      return gen.a($$0, 64, 32);
   }

   public void a(gye $$0) {
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
