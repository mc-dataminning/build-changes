public class gcw<T extends gyt> extends gbm<T> {
   protected final geo b;
   protected final geo c;
   protected final geo d;
   protected final geo e;
   protected final geo f;
   protected final geo g;

   protected gcw(geo $$0) {
      super($$0);
      this.b = $$0.b("head");
      this.c = $$0.b("body");
      this.d = $$0.b("right_hind_leg");
      this.e = $$0.b("left_hind_leg");
      this.f = $$0.b("right_front_leg");
      this.g = $$0.b("left_front_leg");
   }

   public static gew a(int $$0, ges $$1) {
      gew $$2 = new gew();
      gey $$3 = $$2.a();
      $$3.a("head", get.c().a(0, 0).a(-4.0F, -4.0F, -8.0F, 8.0F, 8.0F, 8.0F, $$1), geq.a(0.0F, (float)(18 - $$0), -6.0F));
      $$3.a("body", get.c().a(28, 8).a(-5.0F, -10.0F, -7.0F, 10.0F, 16.0F, 8.0F, $$1), geq.a(0.0F, (float)(17 - $$0), 2.0F, (float) (Math.PI / 2), 0.0F, 0.0F));
      get $$4 = get.c().a(0, 16).a(-2.0F, 0.0F, -2.0F, 4.0F, (float)$$0, 4.0F, $$1);
      $$3.a("right_hind_leg", $$4, geq.a(-3.0F, (float)(24 - $$0), 7.0F));
      $$3.a("left_hind_leg", $$4, geq.a(3.0F, (float)(24 - $$0), 7.0F));
      $$3.a("right_front_leg", $$4, geq.a(-3.0F, (float)(24 - $$0), -5.0F));
      $$3.a("left_front_leg", $$4, geq.a(3.0F, (float)(24 - $$0), -5.0F));
      return $$2;
   }

   public void a(T $$0) {
      super.a($$0);
      this.b.e = $$0.V * (float) (Math.PI / 180.0);
      this.b.f = $$0.U * (float) (Math.PI / 180.0);
      float $$1 = $$0.X;
      float $$2 = $$0.Y;
      this.d.e = bae.b($$1 * 0.6662F) * 1.4F * $$2;
      this.e.e = bae.b($$1 * 0.6662F + (float) Math.PI) * 1.4F * $$2;
      this.f.e = bae.b($$1 * 0.6662F + (float) Math.PI) * 1.4F * $$2;
      this.g.e = bae.b($$1 * 0.6662F) * 1.4F * $$2;
   }
}
