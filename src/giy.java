public class giy<T extends hfe> extends ghn<T> {
   protected final gkr b;
   protected final gkr c;
   protected final gkr d;
   protected final gkr e;
   protected final gkr f;
   protected final gkr g;

   protected giy(gkr $$0) {
      super($$0);
      this.b = $$0.b("head");
      this.c = $$0.b("body");
      this.d = $$0.b("right_hind_leg");
      this.e = $$0.b("left_hind_leg");
      this.f = $$0.b("right_front_leg");
      this.g = $$0.b("left_front_leg");
   }

   public static gkz a(int $$0, gkv $$1) {
      gkz $$2 = new gkz();
      glb $$3 = $$2.a();
      $$3.a("head", gkw.c().a(0, 0).a(-4.0F, -4.0F, -8.0F, 8.0F, 8.0F, 8.0F, $$1), gkt.a(0.0F, (float)(18 - $$0), -6.0F));
      $$3.a("body", gkw.c().a(28, 8).a(-5.0F, -10.0F, -7.0F, 10.0F, 16.0F, 8.0F, $$1), gkt.a(0.0F, (float)(17 - $$0), 2.0F, (float) (Math.PI / 2), 0.0F, 0.0F));
      gkw $$4 = gkw.c().a(0, 16).a(-2.0F, 0.0F, -2.0F, 4.0F, (float)$$0, 4.0F, $$1);
      $$3.a("right_hind_leg", $$4, gkt.a(-3.0F, (float)(24 - $$0), 7.0F));
      $$3.a("left_hind_leg", $$4, gkt.a(3.0F, (float)(24 - $$0), 7.0F));
      $$3.a("right_front_leg", $$4, gkt.a(-3.0F, (float)(24 - $$0), -5.0F));
      $$3.a("left_front_leg", $$4, gkt.a(3.0F, (float)(24 - $$0), -5.0F));
      return $$2;
   }

   public void a(T $$0) {
      super.a($$0);
      this.b.e = $$0.ae * (float) (Math.PI / 180.0);
      this.b.f = $$0.ad * (float) (Math.PI / 180.0);
      float $$1 = $$0.ag;
      float $$2 = $$0.ah;
      this.d.e = azz.b($$1 * 0.6662F) * 1.4F * $$2;
      this.e.e = azz.b($$1 * 0.6662F + (float) Math.PI) * 1.4F * $$2;
      this.f.e = azz.b($$1 * 0.6662F + (float) Math.PI) * 1.4F * $$2;
      this.g.e = azz.b($$1 * 0.6662F) * 1.4F * $$2;
   }
}
