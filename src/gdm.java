public class gdm<T extends gzl> extends gcc<T> {
   protected final gfe b;
   protected final gfe c;
   protected final gfe d;
   protected final gfe e;
   protected final gfe f;
   protected final gfe g;

   protected gdm(gfe $$0) {
      super($$0);
      this.b = $$0.b("head");
      this.c = $$0.b("body");
      this.d = $$0.b("right_hind_leg");
      this.e = $$0.b("left_hind_leg");
      this.f = $$0.b("right_front_leg");
      this.g = $$0.b("left_front_leg");
   }

   public static gfm a(int $$0, gfi $$1) {
      gfm $$2 = new gfm();
      gfo $$3 = $$2.a();
      $$3.a("head", gfj.c().a(0, 0).a(-4.0F, -4.0F, -8.0F, 8.0F, 8.0F, 8.0F, $$1), gfg.a(0.0F, (float)(18 - $$0), -6.0F));
      $$3.a("body", gfj.c().a(28, 8).a(-5.0F, -10.0F, -7.0F, 10.0F, 16.0F, 8.0F, $$1), gfg.a(0.0F, (float)(17 - $$0), 2.0F, (float) (Math.PI / 2), 0.0F, 0.0F));
      gfj $$4 = gfj.c().a(0, 16).a(-2.0F, 0.0F, -2.0F, 4.0F, (float)$$0, 4.0F, $$1);
      $$3.a("right_hind_leg", $$4, gfg.a(-3.0F, (float)(24 - $$0), 7.0F));
      $$3.a("left_hind_leg", $$4, gfg.a(3.0F, (float)(24 - $$0), 7.0F));
      $$3.a("right_front_leg", $$4, gfg.a(-3.0F, (float)(24 - $$0), -5.0F));
      $$3.a("left_front_leg", $$4, gfg.a(3.0F, (float)(24 - $$0), -5.0F));
      return $$2;
   }

   public void a(T $$0) {
      super.a($$0);
      this.b.e = $$0.ab * (float) (Math.PI / 180.0);
      this.b.f = $$0.aa * (float) (Math.PI / 180.0);
      float $$1 = $$0.ad;
      float $$2 = $$0.ae;
      this.d.e = ayz.b($$1 * 0.6662F) * 1.4F * $$2;
      this.e.e = ayz.b($$1 * 0.6662F + (float) Math.PI) * 1.4F * $$2;
      this.f.e = ayz.b($$1 * 0.6662F + (float) Math.PI) * 1.4F * $$2;
      this.g.e = ayz.b($$1 * 0.6662F) * 1.4F * $$2;
   }
}
