public class fwz extends fxo<gtf> {
   private static final float a = 0.6F;
   private static final float b = 0.8F;
   private static final float c = 1.0F;
   private final gaq d;
   private final gaq e;
   private final gaq f;
   private final gaq g;
   private final gaq i;
   private final gaq j;
   private final gaq k;

   public fwz(gaq $$0) {
      super($$0, ghv::i);
      this.f = $$0.b("wind_body");
      this.j = this.f.b("wind_bottom");
      this.i = this.j.b("wind_mid");
      this.g = this.i.b("wind_top");
      this.d = $$0.b("body").b("head");
      this.e = this.d.b("eyes");
      this.k = $$0.b("body").b("rods");
   }

   public static gaw a(int $$0, int $$1) {
      gay $$2 = new gay();
      gba $$3 = $$2.a();
      gba $$4 = $$3.a("body", gav.c(), gas.a(0.0F, 0.0F, 0.0F));
      gba $$5 = $$4.a("rods", gav.c(), gas.a(0.0F, 8.0F, 0.0F));
      $$5.a("rod_1", gav.c().a(0, 17).a(-1.0F, 0.0F, -3.0F, 2.0F, 8.0F, 2.0F, new gau(0.0F)), gas.a(2.5981F, -3.0F, 1.5F, -2.7489F, -1.0472F, 3.1416F));
      $$5.a("rod_2", gav.c().a(0, 17).a(-1.0F, 0.0F, -3.0F, 2.0F, 8.0F, 2.0F, new gau(0.0F)), gas.a(-2.5981F, -3.0F, 1.5F, -2.7489F, 1.0472F, 3.1416F));
      $$5.a("rod_3", gav.c().a(0, 17).a(-1.0F, 0.0F, -3.0F, 2.0F, 8.0F, 2.0F, new gau(0.0F)), gas.a(0.0F, -3.0F, -3.0F, 0.3927F, 0.0F, 0.0F));
      gba $$6 = $$4.a(
         "head",
         gav.c().a(4, 24).a(-5.0F, -5.0F, -4.2F, 10.0F, 3.0F, 4.0F, new gau(0.0F)).a(0, 0).a(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new gau(0.0F)),
         gas.a(0.0F, 4.0F, 0.0F)
      );
      $$6.a(
         "eyes",
         gav.c().a(4, 24).a(-5.0F, -5.0F, -4.2F, 10.0F, 3.0F, 4.0F, new gau(0.0F)).a(0, 0).a(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new gau(0.0F)),
         gas.a(0.0F, 0.0F, 0.0F)
      );
      gba $$7 = $$3.a("wind_body", gav.c(), gas.a(0.0F, 0.0F, 0.0F));
      gba $$8 = $$7.a("wind_bottom", gav.c().a(1, 83).a(-2.5F, -7.0F, -2.5F, 5.0F, 7.0F, 5.0F, new gau(0.0F)), gas.a(0.0F, 24.0F, 0.0F));
      gba $$9 = $$8.a(
         "wind_mid",
         gav.c()
            .a(74, 28)
            .a(-6.0F, -6.0F, -6.0F, 12.0F, 6.0F, 12.0F, new gau(0.0F))
            .a(78, 32)
            .a(-4.0F, -6.0F, -4.0F, 8.0F, 6.0F, 8.0F, new gau(0.0F))
            .a(49, 71)
            .a(-2.5F, -6.0F, -2.5F, 5.0F, 6.0F, 5.0F, new gau(0.0F)),
         gas.a(0.0F, -7.0F, 0.0F)
      );
      $$9.a(
         "wind_top",
         gav.c()
            .a(0, 0)
            .a(-9.0F, -8.0F, -9.0F, 18.0F, 8.0F, 18.0F, new gau(0.0F))
            .a(6, 6)
            .a(-6.0F, -8.0F, -6.0F, 12.0F, 8.0F, 12.0F, new gau(0.0F))
            .a(105, 57)
            .a(-2.5F, -8.0F, -2.5F, 5.0F, 8.0F, 5.0F, new gau(0.0F)),
         gas.a(0.0F, -6.0F, 0.0F)
      );
      return gaw.a($$2, $$0, $$1);
   }

   public void a(gtf $$0) {
      super.a($$0);
      float $$1 = $$0.p * (float) Math.PI * -0.1F;
      this.g.b = azf.b($$1) * 1.0F * 0.6F;
      this.g.d = azf.a($$1) * 1.0F * 0.6F;
      this.i.b = azf.a($$1) * 0.5F * 0.8F;
      this.i.d = azf.b($$1) * 0.8F;
      this.j.b = azf.b($$1) * -0.25F * 1.0F;
      this.j.d = azf.a($$1) * -0.25F * 1.0F;
      this.d.c = 4.0F + azf.b($$1) / 4.0F;
      this.k.f = $$0.p * (float) Math.PI * 0.1F;
      this.a($$0.a, fjj.a, $$0.p);
      this.a($$0.b, fjj.d, $$0.p);
      this.a($$0.c, fjj.e, $$0.p);
      this.a($$0.d, fjj.c, $$0.p);
      this.a($$0.e, fjj.b, $$0.p);
   }

   public gaq a() {
      return this.d;
   }

   public gaq b() {
      return this.e;
   }

   public gaq c() {
      return this.k;
   }

   public gaq d() {
      return this.f;
   }
}
