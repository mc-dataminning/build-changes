public class ggt extends ghn<hdp> {
   private static final float a = 0.6F;
   private static final float b = 0.8F;
   private static final float c = 1.0F;
   private final gkr d;
   private final gkr e;
   private final gkr f;
   private final gkr g;
   private final gkr i;
   private final gkr j;
   private final gkr k;

   public ggt(gkr $$0) {
      super($$0, gry::j);
      this.f = $$0.b("wind_body");
      this.j = this.f.b("wind_bottom");
      this.i = this.j.b("wind_mid");
      this.g = this.i.b("wind_top");
      this.d = $$0.b("body").b("head");
      this.e = this.d.b("eyes");
      this.k = $$0.b("body").b("rods");
   }

   public static gkx a(int $$0, int $$1) {
      gkz $$2 = new gkz();
      glb $$3 = $$2.a();
      glb $$4 = $$3.a("body", gkw.c(), gkt.a(0.0F, 0.0F, 0.0F));
      glb $$5 = $$4.a("rods", gkw.c(), gkt.a(0.0F, 8.0F, 0.0F));
      $$5.a("rod_1", gkw.c().a(0, 17).a(-1.0F, 0.0F, -3.0F, 2.0F, 8.0F, 2.0F, new gkv(0.0F)), gkt.a(2.5981F, -3.0F, 1.5F, -2.7489F, -1.0472F, 3.1416F));
      $$5.a("rod_2", gkw.c().a(0, 17).a(-1.0F, 0.0F, -3.0F, 2.0F, 8.0F, 2.0F, new gkv(0.0F)), gkt.a(-2.5981F, -3.0F, 1.5F, -2.7489F, 1.0472F, 3.1416F));
      $$5.a("rod_3", gkw.c().a(0, 17).a(-1.0F, 0.0F, -3.0F, 2.0F, 8.0F, 2.0F, new gkv(0.0F)), gkt.a(0.0F, -3.0F, -3.0F, 0.3927F, 0.0F, 0.0F));
      glb $$6 = $$4.a(
         "head",
         gkw.c().a(4, 24).a(-5.0F, -5.0F, -4.2F, 10.0F, 3.0F, 4.0F, new gkv(0.0F)).a(0, 0).a(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new gkv(0.0F)),
         gkt.a(0.0F, 4.0F, 0.0F)
      );
      $$6.a(
         "eyes",
         gkw.c().a(4, 24).a(-5.0F, -5.0F, -4.2F, 10.0F, 3.0F, 4.0F, new gkv(0.0F)).a(0, 0).a(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new gkv(0.0F)),
         gkt.a(0.0F, 0.0F, 0.0F)
      );
      glb $$7 = $$3.a("wind_body", gkw.c(), gkt.a(0.0F, 0.0F, 0.0F));
      glb $$8 = $$7.a("wind_bottom", gkw.c().a(1, 83).a(-2.5F, -7.0F, -2.5F, 5.0F, 7.0F, 5.0F, new gkv(0.0F)), gkt.a(0.0F, 24.0F, 0.0F));
      glb $$9 = $$8.a(
         "wind_mid",
         gkw.c()
            .a(74, 28)
            .a(-6.0F, -6.0F, -6.0F, 12.0F, 6.0F, 12.0F, new gkv(0.0F))
            .a(78, 32)
            .a(-4.0F, -6.0F, -4.0F, 8.0F, 6.0F, 8.0F, new gkv(0.0F))
            .a(49, 71)
            .a(-2.5F, -6.0F, -2.5F, 5.0F, 6.0F, 5.0F, new gkv(0.0F)),
         gkt.a(0.0F, -7.0F, 0.0F)
      );
      $$9.a(
         "wind_top",
         gkw.c()
            .a(0, 0)
            .a(-9.0F, -8.0F, -9.0F, 18.0F, 8.0F, 18.0F, new gkv(0.0F))
            .a(6, 6)
            .a(-6.0F, -8.0F, -6.0F, 12.0F, 8.0F, 12.0F, new gkv(0.0F))
            .a(105, 57)
            .a(-2.5F, -8.0F, -2.5F, 5.0F, 8.0F, 5.0F, new gkv(0.0F)),
         gkt.a(0.0F, -6.0F, 0.0F)
      );
      return gkx.a($$2, $$0, $$1);
   }

   public void a(hdp $$0) {
      super.a($$0);
      this.a($$0.a, frj.a, $$0.v);
      this.a($$0.b, frj.b, $$0.v);
      this.a($$0.c, frj.e, $$0.v);
      this.a($$0.d, frj.f, $$0.v);
      this.a($$0.e, frj.d, $$0.v);
      this.a($$0.f, frj.c, $$0.v);
   }

   public gkr a() {
      return this.d;
   }

   public gkr b() {
      return this.e;
   }

   public gkr c() {
      return this.k;
   }

   public gkr d() {
      return this.f;
   }
}
