public class gdy extends gbm<hae> implements gbv, gdx {
   private final geo a;
   private final geo b;
   private final geo c;
   private final geo d;
   private final geo e;

   public gdy(geo $$0) {
      super($$0);
      this.a = $$0.b("head");
      this.b = this.a.b("hat");
      this.c = this.b.b("hat_rim");
      this.d = $$0.b("right_leg");
      this.e = $$0.b("left_leg");
   }

   public static gew a() {
      gew $$0 = new gew();
      gey $$1 = $$0.a();
      float $$2 = 0.5F;
      gey $$3 = $$1.a("head", get.c().a(0, 0).a(-4.0F, -10.0F, -4.0F, 8.0F, 10.0F, 8.0F), geq.a);
      gey $$4 = $$3.a("hat", get.c().a(32, 0).a(-4.0F, -10.0F, -4.0F, 8.0F, 10.0F, 8.0F, new ges(0.51F)), geq.a);
      $$4.a("hat_rim", get.c().a(30, 47).a(-8.0F, -8.0F, -6.0F, 16.0F, 16.0F, 1.0F), geq.b((float) (-Math.PI / 2), 0.0F, 0.0F));
      $$3.a("nose", get.c().a(24, 0).a(-1.0F, -1.0F, -6.0F, 2.0F, 4.0F, 2.0F), geq.a(0.0F, -2.0F, 0.0F));
      gey $$5 = $$1.a("body", get.c().a(16, 20).a(-4.0F, 0.0F, -3.0F, 8.0F, 12.0F, 6.0F), geq.a);
      $$5.a("jacket", get.c().a(0, 38).a(-4.0F, 0.0F, -3.0F, 8.0F, 20.0F, 6.0F, new ges(0.5F)), geq.a);
      $$1.a(
         "arms",
         get.c()
            .a(44, 22)
            .a(-8.0F, -2.0F, -2.0F, 4.0F, 8.0F, 4.0F)
            .a(44, 22)
            .a(4.0F, -2.0F, -2.0F, 4.0F, 8.0F, 4.0F, true)
            .a(40, 38)
            .a(-4.0F, 2.0F, -2.0F, 8.0F, 4.0F, 4.0F),
         geq.a(0.0F, 3.0F, -1.0F, -0.75F, 0.0F, 0.0F)
      );
      $$1.a("right_leg", get.c().a(0, 22).a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F), geq.a(-2.0F, 12.0F, 0.0F));
      $$1.a("left_leg", get.c().a(0, 22).a().a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F), geq.a(2.0F, 12.0F, 0.0F));
      return $$0;
   }

   public void a(hae $$0) {
      super.a($$0);
      this.a.f = $$0.U * (float) (Math.PI / 180.0);
      this.a.e = $$0.V * (float) (Math.PI / 180.0);
      if ($$0.a) {
         this.a.g = 0.3F * bae.a(0.45F * $$0.p);
         this.a.e = 0.4F;
      } else {
         this.a.g = 0.0F;
      }

      this.d.e = bae.b($$0.X * 0.6662F) * 1.4F * $$0.Y * 0.5F;
      this.e.e = bae.b($$0.X * 0.6662F + (float) Math.PI) * 1.4F * $$0.Y * 0.5F;
      this.d.f = 0.0F;
      this.e.f = 0.0F;
   }

   @Override
   public geo b() {
      return this.a;
   }

   @Override
   public void a(boolean $$0) {
      this.a.k = $$0;
      this.b.k = $$0;
      this.c.k = $$0;
   }
}
