public class gka extends ghn<hgp> implements ghx, gjz {
   public static final gla a = gla.scaling(0.5F);
   private final gkr b;
   private final gkr c;
   private final gkr d;
   private final gkr e;
   private final gkr f;
   private final gkr g;

   public gka(gkr $$0) {
      super($$0);
      this.b = $$0.b("head");
      this.c = this.b.b("hat");
      this.d = this.c.b("hat_rim");
      this.e = $$0.b("right_leg");
      this.f = $$0.b("left_leg");
      this.g = $$0.b("arms");
   }

   public static gkz a() {
      gkz $$0 = new gkz();
      glb $$1 = $$0.a();
      float $$2 = 0.5F;
      glb $$3 = $$1.a("head", gkw.c().a(0, 0).a(-4.0F, -10.0F, -4.0F, 8.0F, 10.0F, 8.0F), gkt.a);
      glb $$4 = $$3.a("hat", gkw.c().a(32, 0).a(-4.0F, -10.0F, -4.0F, 8.0F, 10.0F, 8.0F, new gkv(0.51F)), gkt.a);
      $$4.a("hat_rim", gkw.c().a(30, 47).a(-8.0F, -8.0F, -6.0F, 16.0F, 16.0F, 1.0F), gkt.b((float) (-Math.PI / 2), 0.0F, 0.0F));
      $$3.a("nose", gkw.c().a(24, 0).a(-1.0F, -1.0F, -6.0F, 2.0F, 4.0F, 2.0F), gkt.a(0.0F, -2.0F, 0.0F));
      glb $$5 = $$1.a("body", gkw.c().a(16, 20).a(-4.0F, 0.0F, -3.0F, 8.0F, 12.0F, 6.0F), gkt.a);
      $$5.a("jacket", gkw.c().a(0, 38).a(-4.0F, 0.0F, -3.0F, 8.0F, 20.0F, 6.0F, new gkv(0.5F)), gkt.a);
      $$1.a(
         "arms",
         gkw.c()
            .a(44, 22)
            .a(-8.0F, -2.0F, -2.0F, 4.0F, 8.0F, 4.0F)
            .a(44, 22)
            .a(4.0F, -2.0F, -2.0F, 4.0F, 8.0F, 4.0F, true)
            .a(40, 38)
            .a(-4.0F, 2.0F, -2.0F, 8.0F, 4.0F, 4.0F),
         gkt.a(0.0F, 3.0F, -1.0F, -0.75F, 0.0F, 0.0F)
      );
      $$1.a("right_leg", gkw.c().a(0, 22).a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F), gkt.a(-2.0F, 12.0F, 0.0F));
      $$1.a("left_leg", gkw.c().a(0, 22).a().a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F), gkt.a(2.0F, 12.0F, 0.0F));
      return $$0;
   }

   public void a(hgp $$0) {
      super.a($$0);
      this.b.f = $$0.ad * (float) (Math.PI / 180.0);
      this.b.e = $$0.ae * (float) (Math.PI / 180.0);
      if ($$0.a) {
         this.b.g = 0.3F * azz.a(0.45F * $$0.v);
         this.b.e = 0.4F;
      } else {
         this.b.g = 0.0F;
      }

      this.e.e = azz.b($$0.ag * 0.6662F) * 1.4F * $$0.ah * 0.5F;
      this.f.e = azz.b($$0.ag * 0.6662F + (float) Math.PI) * 1.4F * $$0.ah * 0.5F;
      this.e.f = 0.0F;
      this.f.f = 0.0F;
   }

   @Override
   public gkr b() {
      return this.b;
   }

   @Override
   public void a(boolean $$0) {
      this.b.k = $$0;
      this.c.k = $$0;
      this.d.k = $$0;
   }

   @Override
   public void a(fld $$0) {
      this.v.a($$0);
      this.g.a($$0);
   }
}
