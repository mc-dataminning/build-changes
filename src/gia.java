public class gia extends ghv<her> {
   public gia(gjo $$0) {
      super($$0);
   }

   public static gju a() {
      gjw $$0 = new gjw();
      gjy $$1 = $$0.a();
      $$1.a("head", gjt.c().a(0, 0).a(-3.0F, -4.0F, -4.0F, 6.0F, 6.0F, 6.0F, new gjs(0.6F)), gjq.a(0.0F, 6.0F, -8.0F));
      $$1.a("body", gjt.c().a(28, 8).a(-4.0F, -10.0F, -7.0F, 8.0F, 16.0F, 6.0F, new gjs(1.75F)), gjq.a(0.0F, 5.0F, 2.0F, (float) (Math.PI / 2), 0.0F, 0.0F));
      gjt $$2 = gjt.c().a(0, 16).a(-2.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, new gjs(0.5F));
      $$1.a("right_hind_leg", $$2, gjq.a(-3.0F, 12.0F, 7.0F));
      $$1.a("left_hind_leg", $$2, gjq.a(3.0F, 12.0F, 7.0F));
      $$1.a("right_front_leg", $$2, gjq.a(-3.0F, 12.0F, -5.0F));
      $$1.a("left_front_leg", $$2, gjq.a(3.0F, 12.0F, -5.0F));
      return gju.a($$0, 64, 32);
   }

   public void a(her $$0) {
      super.a($$0);
      this.b.c = this.b.c + $$0.a * 9.0F * $$0.ag;
      this.b.e = $$0.b;
   }
}
