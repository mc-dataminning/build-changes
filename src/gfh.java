public class gfh extends gda<hbq> {
   private final ggc a;

   public gfh(ggc $$0) {
      super($$0);
      this.a = $$0.b("tail");
   }

   public static ggi a(ggg $$0) {
      ggk $$1 = new ggk();
      ggm $$2 = $$1.a();
      int $$3 = 22;
      $$2.a("body", ggh.c().a(0, 0).a(-1.0F, -1.5F, -3.0F, 2.0F, 3.0F, 6.0F, $$0), gge.a(0.0F, 22.0F, 0.0F));
      $$2.a("tail", ggh.c().a(22, -6).a(0.0F, -1.5F, 0.0F, 0.0F, 3.0F, 6.0F, $$0), gge.a(0.0F, 22.0F, 3.0F));
      $$2.a("right_fin", ggh.c().a(2, 16).a(-2.0F, -1.0F, 0.0F, 2.0F, 2.0F, 0.0F, $$0), gge.a(-1.0F, 22.5F, 0.0F, 0.0F, (float) (Math.PI / 4), 0.0F));
      $$2.a("left_fin", ggh.c().a(2, 12).a(0.0F, -1.0F, 0.0F, 2.0F, 2.0F, 0.0F, $$0), gge.a(1.0F, 22.5F, 0.0F, 0.0F, (float) (-Math.PI / 4), 0.0F));
      $$2.a("top_fin", ggh.c().a(10, -5).a(0.0F, -3.0F, 0.0F, 0.0F, 3.0F, 6.0F, $$0), gge.a(0.0F, 20.5F, -3.0F));
      return ggi.a($$1, 32, 32);
   }

   public void a(hbq $$0) {
      super.a($$0);
      float $$1 = $$0.ak ? 1.0F : 1.5F;
      this.a.f = -$$1 * 0.45F * ayz.a(0.6F * $$0.u);
   }
}
