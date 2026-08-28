public class gid extends gfq<hep> implements gga, gic {
   public static final gjd a = gjd.scaling(0.5F);
   private final giu b;
   private final giu c;
   private final giu d;
   private final giu e;
   private final giu f;
   private final giu g;

   public gid(giu $$0) {
      super($$0);
      this.b = $$0.b("head");
      this.c = this.b.b("hat");
      this.d = this.c.b("hat_rim");
      this.e = $$0.b("right_leg");
      this.f = $$0.b("left_leg");
      this.g = $$0.b("arms");
   }

   public static gjc a() {
      gjc $$0 = new gjc();
      gje $$1 = $$0.a();
      float $$2 = 0.5F;
      gje $$3 = $$1.a("head", giz.c().a(0, 0).a(-4.0F, -10.0F, -4.0F, 8.0F, 10.0F, 8.0F), giw.a);
      gje $$4 = $$3.a("hat", giz.c().a(32, 0).a(-4.0F, -10.0F, -4.0F, 8.0F, 10.0F, 8.0F, new giy(0.51F)), giw.a);
      $$4.a("hat_rim", giz.c().a(30, 47).a(-8.0F, -8.0F, -6.0F, 16.0F, 16.0F, 1.0F), giw.b((float) (-Math.PI / 2), 0.0F, 0.0F));
      $$3.a("nose", giz.c().a(24, 0).a(-1.0F, -1.0F, -6.0F, 2.0F, 4.0F, 2.0F), giw.a(0.0F, -2.0F, 0.0F));
      gje $$5 = $$1.a("body", giz.c().a(16, 20).a(-4.0F, 0.0F, -3.0F, 8.0F, 12.0F, 6.0F), giw.a);
      $$5.a("jacket", giz.c().a(0, 38).a(-4.0F, 0.0F, -3.0F, 8.0F, 20.0F, 6.0F, new giy(0.5F)), giw.a);
      $$1.a(
         "arms",
         giz.c()
            .a(44, 22)
            .a(-8.0F, -2.0F, -2.0F, 4.0F, 8.0F, 4.0F)
            .a(44, 22)
            .a(4.0F, -2.0F, -2.0F, 4.0F, 8.0F, 4.0F, true)
            .a(40, 38)
            .a(-4.0F, 2.0F, -2.0F, 8.0F, 4.0F, 4.0F),
         giw.a(0.0F, 3.0F, -1.0F, -0.75F, 0.0F, 0.0F)
      );
      $$1.a("right_leg", giz.c().a(0, 22).a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F), giw.a(-2.0F, 12.0F, 0.0F));
      $$1.a("left_leg", giz.c().a(0, 22).a().a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F), giw.a(2.0F, 12.0F, 0.0F));
      return $$0;
   }

   public void a(hep $$0) {
      super.a($$0);
      this.b.f = $$0.aa * (float) (Math.PI / 180.0);
      this.b.e = $$0.ab * (float) (Math.PI / 180.0);
      if ($$0.a) {
         this.b.g = 0.3F * azm.a(0.45F * $$0.u);
         this.b.e = 0.4F;
      } else {
         this.b.g = 0.0F;
      }

      this.e.e = azm.b($$0.ad * 0.6662F) * 1.4F * $$0.ae * 0.5F;
      this.f.e = azm.b($$0.ad * 0.6662F + (float) Math.PI) * 1.4F * $$0.ae * 0.5F;
      this.e.f = 0.0F;
      this.f.f = 0.0F;
   }

   @Override
   public giu b() {
      return this.b;
   }

   @Override
   public void a(boolean $$0) {
      this.b.k = $$0;
      this.c.k = $$0;
      this.d.k = $$0;
   }

   @Override
   public void a(fjc $$0) {
      this.v.a($$0);
      this.g.a($$0);
   }
}
