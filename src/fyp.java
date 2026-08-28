public class fyp extends fyk<gum> {
   public fyp(gab $$0) {
      super($$0);
   }

   public static gah b() {
      gaj $$0 = new gaj();
      gal $$1 = $$0.a();
      $$1.a("head", gag.c().a(0, 0).a(-3.0F, -4.0F, -4.0F, 6.0F, 6.0F, 6.0F, new gaf(0.6F)), gad.a(0.0F, 6.0F, -8.0F));
      $$1.a("body", gag.c().a(28, 8).a(-4.0F, -10.0F, -7.0F, 8.0F, 16.0F, 6.0F, new gaf(1.75F)), gad.a(0.0F, 5.0F, 2.0F, (float) (Math.PI / 2), 0.0F, 0.0F));
      gag $$2 = gag.c().a(0, 16).a(-2.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, new gaf(0.5F));
      $$1.a("right_hind_leg", $$2, gad.a(-3.0F, 12.0F, 7.0F));
      $$1.a("left_hind_leg", $$2, gad.a(3.0F, 12.0F, 7.0F));
      $$1.a("right_front_leg", $$2, gad.a(-3.0F, 12.0F, -5.0F));
      $$1.a("left_front_leg", $$2, gad.a(3.0F, 12.0F, -5.0F));
      return gah.a($$0, 64, 32);
   }

   public void a(gum $$0) {
      this.c.c();
      this.c.c = this.c.c + $$0.a * 9.0F * $$0.ab;
      super.a($$0);
      this.c.e = $$0.b;
   }
}
