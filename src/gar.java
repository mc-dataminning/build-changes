public class gar extends gbh<gxe> {
   private static final float a = 0.6F;
   private static final float b = 0.8F;
   private static final float c = 1.0F;
   private final gej d;
   private final gej e;
   private final gej f;
   private final gej g;
   private final gej i;
   private final gej j;
   private final gej k;

   public gar(gej $$0) {
      super($$0, glq::j);
      this.f = $$0.b("wind_body");
      this.j = this.f.b("wind_bottom");
      this.i = this.j.b("wind_mid");
      this.g = this.i.b("wind_top");
      this.d = $$0.b("body").b("head");
      this.e = this.d.b("eyes");
      this.k = $$0.b("body").b("rods");
   }

   public static gep a(int $$0, int $$1) {
      ger $$2 = new ger();
      get $$3 = $$2.a();
      get $$4 = $$3.a("body", geo.c(), gel.a(0.0F, 0.0F, 0.0F));
      get $$5 = $$4.a("rods", geo.c(), gel.a(0.0F, 8.0F, 0.0F));
      $$5.a("rod_1", geo.c().a(0, 17).a(-1.0F, 0.0F, -3.0F, 2.0F, 8.0F, 2.0F, new gen(0.0F)), gel.a(2.5981F, -3.0F, 1.5F, -2.7489F, -1.0472F, 3.1416F));
      $$5.a("rod_2", geo.c().a(0, 17).a(-1.0F, 0.0F, -3.0F, 2.0F, 8.0F, 2.0F, new gen(0.0F)), gel.a(-2.5981F, -3.0F, 1.5F, -2.7489F, 1.0472F, 3.1416F));
      $$5.a("rod_3", geo.c().a(0, 17).a(-1.0F, 0.0F, -3.0F, 2.0F, 8.0F, 2.0F, new gen(0.0F)), gel.a(0.0F, -3.0F, -3.0F, 0.3927F, 0.0F, 0.0F));
      get $$6 = $$4.a(
         "head",
         geo.c().a(4, 24).a(-5.0F, -5.0F, -4.2F, 10.0F, 3.0F, 4.0F, new gen(0.0F)).a(0, 0).a(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new gen(0.0F)),
         gel.a(0.0F, 4.0F, 0.0F)
      );
      $$6.a(
         "eyes",
         geo.c().a(4, 24).a(-5.0F, -5.0F, -4.2F, 10.0F, 3.0F, 4.0F, new gen(0.0F)).a(0, 0).a(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new gen(0.0F)),
         gel.a(0.0F, 0.0F, 0.0F)
      );
      get $$7 = $$3.a("wind_body", geo.c(), gel.a(0.0F, 0.0F, 0.0F));
      get $$8 = $$7.a("wind_bottom", geo.c().a(1, 83).a(-2.5F, -7.0F, -2.5F, 5.0F, 7.0F, 5.0F, new gen(0.0F)), gel.a(0.0F, 24.0F, 0.0F));
      get $$9 = $$8.a(
         "wind_mid",
         geo.c()
            .a(74, 28)
            .a(-6.0F, -6.0F, -6.0F, 12.0F, 6.0F, 12.0F, new gen(0.0F))
            .a(78, 32)
            .a(-4.0F, -6.0F, -4.0F, 8.0F, 6.0F, 8.0F, new gen(0.0F))
            .a(49, 71)
            .a(-2.5F, -6.0F, -2.5F, 5.0F, 6.0F, 5.0F, new gen(0.0F)),
         gel.a(0.0F, -7.0F, 0.0F)
      );
      $$9.a(
         "wind_top",
         geo.c()
            .a(0, 0)
            .a(-9.0F, -8.0F, -9.0F, 18.0F, 8.0F, 18.0F, new gen(0.0F))
            .a(6, 6)
            .a(-6.0F, -8.0F, -6.0F, 12.0F, 8.0F, 12.0F, new gen(0.0F))
            .a(105, 57)
            .a(-2.5F, -8.0F, -2.5F, 5.0F, 8.0F, 5.0F, new gen(0.0F)),
         gel.a(0.0F, -6.0F, 0.0F)
      );
      return gep.a($$2, $$0, $$1);
   }

   public void a(gxe $$0) {
      super.a($$0);
      this.a($$0.a, fms.a, $$0.p);
      this.a($$0.b, fms.b, $$0.p);
      this.a($$0.c, fms.e, $$0.p);
      this.a($$0.d, fms.f, $$0.p);
      this.a($$0.e, fms.d, $$0.p);
      this.a($$0.f, fms.c, $$0.p);
   }

   public gej a() {
      return this.d;
   }

   public gej b() {
      return this.e;
   }

   public gej c() {
      return this.k;
   }

   public gej d() {
      return this.f;
   }
}
