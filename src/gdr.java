public class gdr extends gdm<hae> {
   public gdr(gfe $$0) {
      super($$0);
   }

   public static gfk a() {
      gfm $$0 = new gfm();
      gfo $$1 = $$0.a();
      $$1.a("head", gfj.c().a(0, 0).a(-3.0F, -4.0F, -4.0F, 6.0F, 6.0F, 6.0F, new gfi(0.6F)), gfg.a(0.0F, 6.0F, -8.0F));
      $$1.a("body", gfj.c().a(28, 8).a(-4.0F, -10.0F, -7.0F, 8.0F, 16.0F, 6.0F, new gfi(1.75F)), gfg.a(0.0F, 5.0F, 2.0F, (float) (Math.PI / 2), 0.0F, 0.0F));
      gfj $$2 = gfj.c().a(0, 16).a(-2.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, new gfi(0.5F));
      $$1.a("right_hind_leg", $$2, gfg.a(-3.0F, 12.0F, 7.0F));
      $$1.a("left_hind_leg", $$2, gfg.a(3.0F, 12.0F, 7.0F));
      $$1.a("right_front_leg", $$2, gfg.a(-3.0F, 12.0F, -5.0F));
      $$1.a("left_front_leg", $$2, gfg.a(3.0F, 12.0F, -5.0F));
      return gfk.a($$0, 64, 32);
   }

   public void a(hae $$0) {
      super.a($$0);
      this.b.c = this.b.c + $$0.a * 9.0F * $$0.ag;
      this.b.e = $$0.b;
   }
}
