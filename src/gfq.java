public class gfq extends ggk<hcm> {
   private static final float a = 0.6F;
   private static final float b = 0.8F;
   private static final float c = 1.0F;
   private final gjo d;
   private final gjo e;
   private final gjo f;
   private final gjo g;
   private final gjo i;
   private final gjo j;
   private final gjo k;

   public gfq(gjo $$0) {
      super($$0, gqx::j);
      this.f = $$0.b("wind_body");
      this.j = this.f.b("wind_bottom");
      this.i = this.j.b("wind_mid");
      this.g = this.i.b("wind_top");
      this.d = $$0.b("body").b("head");
      this.e = this.d.b("eyes");
      this.k = $$0.b("body").b("rods");
   }

   public static gju a(int $$0, int $$1) {
      gjw $$2 = new gjw();
      gjy $$3 = $$2.a();
      gjy $$4 = $$3.a("body", gjt.c(), gjq.a(0.0F, 0.0F, 0.0F));
      gjy $$5 = $$4.a("rods", gjt.c(), gjq.a(0.0F, 8.0F, 0.0F));
      $$5.a("rod_1", gjt.c().a(0, 17).a(-1.0F, 0.0F, -3.0F, 2.0F, 8.0F, 2.0F, new gjs(0.0F)), gjq.a(2.5981F, -3.0F, 1.5F, -2.7489F, -1.0472F, 3.1416F));
      $$5.a("rod_2", gjt.c().a(0, 17).a(-1.0F, 0.0F, -3.0F, 2.0F, 8.0F, 2.0F, new gjs(0.0F)), gjq.a(-2.5981F, -3.0F, 1.5F, -2.7489F, 1.0472F, 3.1416F));
      $$5.a("rod_3", gjt.c().a(0, 17).a(-1.0F, 0.0F, -3.0F, 2.0F, 8.0F, 2.0F, new gjs(0.0F)), gjq.a(0.0F, -3.0F, -3.0F, 0.3927F, 0.0F, 0.0F));
      gjy $$6 = $$4.a(
         "head",
         gjt.c().a(4, 24).a(-5.0F, -5.0F, -4.2F, 10.0F, 3.0F, 4.0F, new gjs(0.0F)).a(0, 0).a(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new gjs(0.0F)),
         gjq.a(0.0F, 4.0F, 0.0F)
      );
      $$6.a(
         "eyes",
         gjt.c().a(4, 24).a(-5.0F, -5.0F, -4.2F, 10.0F, 3.0F, 4.0F, new gjs(0.0F)).a(0, 0).a(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new gjs(0.0F)),
         gjq.a(0.0F, 0.0F, 0.0F)
      );
      gjy $$7 = $$3.a("wind_body", gjt.c(), gjq.a(0.0F, 0.0F, 0.0F));
      gjy $$8 = $$7.a("wind_bottom", gjt.c().a(1, 83).a(-2.5F, -7.0F, -2.5F, 5.0F, 7.0F, 5.0F, new gjs(0.0F)), gjq.a(0.0F, 24.0F, 0.0F));
      gjy $$9 = $$8.a(
         "wind_mid",
         gjt.c()
            .a(74, 28)
            .a(-6.0F, -6.0F, -6.0F, 12.0F, 6.0F, 12.0F, new gjs(0.0F))
            .a(78, 32)
            .a(-4.0F, -6.0F, -4.0F, 8.0F, 6.0F, 8.0F, new gjs(0.0F))
            .a(49, 71)
            .a(-2.5F, -6.0F, -2.5F, 5.0F, 6.0F, 5.0F, new gjs(0.0F)),
         gjq.a(0.0F, -7.0F, 0.0F)
      );
      $$9.a(
         "wind_top",
         gjt.c()
            .a(0, 0)
            .a(-9.0F, -8.0F, -9.0F, 18.0F, 8.0F, 18.0F, new gjs(0.0F))
            .a(6, 6)
            .a(-6.0F, -8.0F, -6.0F, 12.0F, 8.0F, 12.0F, new gjs(0.0F))
            .a(105, 57)
            .a(-2.5F, -8.0F, -2.5F, 5.0F, 8.0F, 5.0F, new gjs(0.0F)),
         gjq.a(0.0F, -6.0F, 0.0F)
      );
      return gju.a($$2, $$0, $$1);
   }

   public void a(hcm $$0) {
      super.a($$0);
      this.a($$0.a, fqh.a, $$0.u);
      this.a($$0.b, fqh.b, $$0.u);
      this.a($$0.c, fqh.e, $$0.u);
      this.a($$0.d, fqh.f, $$0.u);
      this.a($$0.e, fqh.d, $$0.u);
      this.a($$0.f, fqh.c, $$0.u);
   }

   public gjo a() {
      return this.d;
   }

   public gjo b() {
      return this.e;
   }

   public gjo c() {
      return this.k;
   }

   public gjo d() {
      return this.f;
   }
}
