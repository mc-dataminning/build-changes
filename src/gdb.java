public class gdb extends gcw<gzn> {
   public gdb(geo $$0) {
      super($$0);
   }

   public static geu a() {
      gew $$0 = new gew();
      gey $$1 = $$0.a();
      $$1.a("head", get.c().a(0, 0).a(-3.0F, -4.0F, -4.0F, 6.0F, 6.0F, 6.0F, new ges(0.6F)), geq.a(0.0F, 6.0F, -8.0F));
      $$1.a("body", get.c().a(28, 8).a(-4.0F, -10.0F, -7.0F, 8.0F, 16.0F, 6.0F, new ges(1.75F)), geq.a(0.0F, 5.0F, 2.0F, (float) (Math.PI / 2), 0.0F, 0.0F));
      get $$2 = get.c().a(0, 16).a(-2.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, new ges(0.5F));
      $$1.a("right_hind_leg", $$2, geq.a(-3.0F, 12.0F, 7.0F));
      $$1.a("left_hind_leg", $$2, geq.a(3.0F, 12.0F, 7.0F));
      $$1.a("right_front_leg", $$2, geq.a(-3.0F, 12.0F, -5.0F));
      $$1.a("left_front_leg", $$2, geq.a(3.0F, 12.0F, -5.0F));
      return geu.a($$0, 64, 32);
   }

   public void a(gzn $$0) {
      super.a($$0);
      this.b.c = this.b.c + $$0.a * 9.0F * $$0.ab;
      this.b.e = $$0.b;
   }
}
