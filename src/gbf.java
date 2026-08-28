public class gbf extends gbm<gxq> {
   public static final gex a = gex.scaling(0.5F);
   private final geo b;
   private final geo c;
   private final geo d;

   public gbf(geo $$0) {
      super($$0);
      this.b = $$0.b("body");
      this.c = this.b.b("tail");
      this.d = this.c.b("tail_fin");
   }

   public static geu a() {
      gew $$0 = new gew();
      gey $$1 = $$0.a();
      float $$2 = 18.0F;
      float $$3 = -8.0F;
      gey $$4 = $$1.a("body", get.c().a(22, 0).a(-4.0F, -7.0F, 0.0F, 8.0F, 7.0F, 13.0F), geq.a(0.0F, 22.0F, -5.0F));
      $$4.a("back_fin", get.c().a(51, 0).a(-0.5F, 0.0F, 8.0F, 1.0F, 4.0F, 5.0F), geq.b((float) (Math.PI / 3), 0.0F, 0.0F));
      $$4.a(
         "left_fin",
         get.c().a(48, 20).a().a(-0.5F, -4.0F, 0.0F, 1.0F, 4.0F, 7.0F),
         geq.a(2.0F, -2.0F, 4.0F, (float) (Math.PI / 3), 0.0F, (float) (Math.PI * 2.0 / 3.0))
      );
      $$4.a(
         "right_fin",
         get.c().a(48, 20).a(-0.5F, -4.0F, 0.0F, 1.0F, 4.0F, 7.0F),
         geq.a(-2.0F, -2.0F, 4.0F, (float) (Math.PI / 3), 0.0F, (float) (-Math.PI * 2.0 / 3.0))
      );
      gey $$5 = $$4.a("tail", get.c().a(0, 19).a(-2.0F, -2.5F, 0.0F, 4.0F, 5.0F, 11.0F), geq.a(0.0F, -2.5F, 11.0F, -0.10471976F, 0.0F, 0.0F));
      $$5.a("tail_fin", get.c().a(19, 20).a(-5.0F, -0.5F, 0.0F, 10.0F, 1.0F, 6.0F), geq.a(0.0F, 0.0F, 9.0F));
      gey $$6 = $$4.a("head", get.c().a(0, 0).a(-4.0F, -3.0F, -3.0F, 8.0F, 7.0F, 6.0F), geq.a(0.0F, -4.0F, -3.0F));
      $$6.a("nose", get.c().a(0, 13).a(-1.0F, 2.0F, -7.0F, 2.0F, 2.0F, 4.0F), geq.a);
      return geu.a($$0, 64, 64);
   }

   public void a(gxq $$0) {
      super.a($$0);
      this.b.e = $$0.V * (float) (Math.PI / 180.0);
      this.b.f = $$0.U * (float) (Math.PI / 180.0);
      if ($$0.a) {
         this.b.e = this.b.e + (-0.05F - 0.05F * bae.b($$0.p * 0.3F));
         this.c.e = -0.1F * bae.b($$0.p * 0.3F);
         this.d.e = -0.2F * bae.b($$0.p * 0.3F);
      }
   }
}
