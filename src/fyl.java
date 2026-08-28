public class fyl extends fza<gus> {
   private static final float a = 0.6F;
   private static final float b = 0.8F;
   private static final float c = 1.0F;
   private final gcc d;
   private final gcc e;
   private final gcc f;
   private final gcc g;
   private final gcc i;
   private final gcc j;
   private final gcc k;

   public fyl(gcc $$0) {
      super($$0, gjh::i);
      this.f = $$0.b("wind_body");
      this.j = this.f.b("wind_bottom");
      this.i = this.j.b("wind_mid");
      this.g = this.i.b("wind_top");
      this.d = $$0.b("body").b("head");
      this.e = this.d.b("eyes");
      this.k = $$0.b("body").b("rods");
   }

   public static gci a(int $$0, int $$1) {
      gck $$2 = new gck();
      gcm $$3 = $$2.a();
      gcm $$4 = $$3.a("body", gch.c(), gce.a(0.0F, 0.0F, 0.0F));
      gcm $$5 = $$4.a("rods", gch.c(), gce.a(0.0F, 8.0F, 0.0F));
      $$5.a("rod_1", gch.c().a(0, 17).a(-1.0F, 0.0F, -3.0F, 2.0F, 8.0F, 2.0F, new gcg(0.0F)), gce.a(2.5981F, -3.0F, 1.5F, -2.7489F, -1.0472F, 3.1416F));
      $$5.a("rod_2", gch.c().a(0, 17).a(-1.0F, 0.0F, -3.0F, 2.0F, 8.0F, 2.0F, new gcg(0.0F)), gce.a(-2.5981F, -3.0F, 1.5F, -2.7489F, 1.0472F, 3.1416F));
      $$5.a("rod_3", gch.c().a(0, 17).a(-1.0F, 0.0F, -3.0F, 2.0F, 8.0F, 2.0F, new gcg(0.0F)), gce.a(0.0F, -3.0F, -3.0F, 0.3927F, 0.0F, 0.0F));
      gcm $$6 = $$4.a(
         "head",
         gch.c().a(4, 24).a(-5.0F, -5.0F, -4.2F, 10.0F, 3.0F, 4.0F, new gcg(0.0F)).a(0, 0).a(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new gcg(0.0F)),
         gce.a(0.0F, 4.0F, 0.0F)
      );
      $$6.a(
         "eyes",
         gch.c().a(4, 24).a(-5.0F, -5.0F, -4.2F, 10.0F, 3.0F, 4.0F, new gcg(0.0F)).a(0, 0).a(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new gcg(0.0F)),
         gce.a(0.0F, 0.0F, 0.0F)
      );
      gcm $$7 = $$3.a("wind_body", gch.c(), gce.a(0.0F, 0.0F, 0.0F));
      gcm $$8 = $$7.a("wind_bottom", gch.c().a(1, 83).a(-2.5F, -7.0F, -2.5F, 5.0F, 7.0F, 5.0F, new gcg(0.0F)), gce.a(0.0F, 24.0F, 0.0F));
      gcm $$9 = $$8.a(
         "wind_mid",
         gch.c()
            .a(74, 28)
            .a(-6.0F, -6.0F, -6.0F, 12.0F, 6.0F, 12.0F, new gcg(0.0F))
            .a(78, 32)
            .a(-4.0F, -6.0F, -4.0F, 8.0F, 6.0F, 8.0F, new gcg(0.0F))
            .a(49, 71)
            .a(-2.5F, -6.0F, -2.5F, 5.0F, 6.0F, 5.0F, new gcg(0.0F)),
         gce.a(0.0F, -7.0F, 0.0F)
      );
      $$9.a(
         "wind_top",
         gch.c()
            .a(0, 0)
            .a(-9.0F, -8.0F, -9.0F, 18.0F, 8.0F, 18.0F, new gcg(0.0F))
            .a(6, 6)
            .a(-6.0F, -8.0F, -6.0F, 12.0F, 8.0F, 12.0F, new gcg(0.0F))
            .a(105, 57)
            .a(-2.5F, -8.0F, -2.5F, 5.0F, 8.0F, 5.0F, new gcg(0.0F)),
         gce.a(0.0F, -6.0F, 0.0F)
      );
      return gci.a($$2, $$0, $$1);
   }

   public void a(gus $$0) {
      super.a($$0);
      float $$1 = $$0.p * (float) Math.PI * -0.1F;
      this.g.b = azn.b($$1) * 1.0F * 0.6F;
      this.g.d = azn.a($$1) * 1.0F * 0.6F;
      this.i.b = azn.a($$1) * 0.5F * 0.8F;
      this.i.d = azn.b($$1) * 0.8F;
      this.j.b = azn.b($$1) * -0.25F * 1.0F;
      this.j.d = azn.a($$1) * -0.25F * 1.0F;
      this.d.c = 4.0F + azn.b($$1) / 4.0F;
      this.k.f = $$0.p * (float) Math.PI * 0.1F;
      this.a($$0.a, fkr.a, $$0.p);
      this.a($$0.b, fkr.d, $$0.p);
      this.a($$0.c, fkr.e, $$0.p);
      this.a($$0.d, fkr.c, $$0.p);
      this.a($$0.e, fkr.b, $$0.p);
   }

   public gcc a() {
      return this.d;
   }

   public gcc b() {
      return this.e;
   }

   public gcc c() {
      return this.k;
   }

   public gcc d() {
      return this.f;
   }
}
