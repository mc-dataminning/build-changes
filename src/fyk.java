public class fyk<T extends gts> extends fxa<T> {
   protected final gab b;
   protected final gab c;
   protected final gab d;
   protected final gab e;
   protected final gab f;
   protected final gab g;
   protected final gab i;

   protected fyk(gab $$0) {
      this.b = $$0;
      this.c = $$0.b("head");
      this.d = $$0.b("body");
      this.e = $$0.b("right_hind_leg");
      this.f = $$0.b("left_hind_leg");
      this.g = $$0.b("right_front_leg");
      this.i = $$0.b("left_front_leg");
   }

   public static gaj a(int $$0, gaf $$1) {
      gaj $$2 = new gaj();
      gal $$3 = $$2.a();
      $$3.a("head", gag.c().a(0, 0).a(-4.0F, -4.0F, -8.0F, 8.0F, 8.0F, 8.0F, $$1), gad.a(0.0F, (float)(18 - $$0), -6.0F));
      $$3.a("body", gag.c().a(28, 8).a(-5.0F, -10.0F, -7.0F, 10.0F, 16.0F, 8.0F, $$1), gad.a(0.0F, (float)(17 - $$0), 2.0F, (float) (Math.PI / 2), 0.0F, 0.0F));
      gag $$4 = gag.c().a(0, 16).a(-2.0F, 0.0F, -2.0F, 4.0F, (float)$$0, 4.0F, $$1);
      $$3.a("right_hind_leg", $$4, gad.a(-3.0F, (float)(24 - $$0), 7.0F));
      $$3.a("left_hind_leg", $$4, gad.a(3.0F, (float)(24 - $$0), 7.0F));
      $$3.a("right_front_leg", $$4, gad.a(-3.0F, (float)(24 - $$0), -5.0F));
      $$3.a("left_front_leg", $$4, gad.a(3.0F, (float)(24 - $$0), -5.0F));
      return $$2;
   }

   public void a(T $$0) {
      this.c.e = $$0.V * (float) (Math.PI / 180.0);
      this.c.f = $$0.U * (float) (Math.PI / 180.0);
      float $$1 = $$0.X;
      float $$2 = $$0.Y;
      this.e.e = azc.b($$1 * 0.6662F) * 1.4F * $$2;
      this.f.e = azc.b($$1 * 0.6662F + (float) Math.PI) * 1.4F * $$2;
      this.g.e = azc.b($$1 * 0.6662F + (float) Math.PI) * 1.4F * $$2;
      this.i.e = azc.b($$1 * 0.6662F) * 1.4F * $$2;
   }

   @Override
   public gab a() {
      return this.b;
   }
}
