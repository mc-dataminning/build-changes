public class gfv extends ggp<hcs> {
   private static final float a = 0.6F;
   private static final float b = 0.8F;
   private static final float c = 1.0F;
   private final gjt d;
   private final gjt e;
   private final gjt f;
   private final gjt g;
   private final gjt i;
   private final gjt j;
   private final gjt k;

   public gfv(gjt $$0) {
      super($$0, grc::j);
      this.f = $$0.b("wind_body");
      this.j = this.f.b("wind_bottom");
      this.i = this.j.b("wind_mid");
      this.g = this.i.b("wind_top");
      this.d = $$0.b("body").b("head");
      this.e = this.d.b("eyes");
      this.k = $$0.b("body").b("rods");
   }

   public static gjz a(int $$0, int $$1) {
      gkb $$2 = new gkb();
      gkd $$3 = $$2.a();
      gkd $$4 = $$3.a("body", gjy.c(), gjv.a(0.0F, 0.0F, 0.0F));
      gkd $$5 = $$4.a("rods", gjy.c(), gjv.a(0.0F, 8.0F, 0.0F));
      $$5.a("rod_1", gjy.c().a(0, 17).a(-1.0F, 0.0F, -3.0F, 2.0F, 8.0F, 2.0F, new gjx(0.0F)), gjv.a(2.5981F, -3.0F, 1.5F, -2.7489F, -1.0472F, 3.1416F));
      $$5.a("rod_2", gjy.c().a(0, 17).a(-1.0F, 0.0F, -3.0F, 2.0F, 8.0F, 2.0F, new gjx(0.0F)), gjv.a(-2.5981F, -3.0F, 1.5F, -2.7489F, 1.0472F, 3.1416F));
      $$5.a("rod_3", gjy.c().a(0, 17).a(-1.0F, 0.0F, -3.0F, 2.0F, 8.0F, 2.0F, new gjx(0.0F)), gjv.a(0.0F, -3.0F, -3.0F, 0.3927F, 0.0F, 0.0F));
      gkd $$6 = $$4.a(
         "head",
         gjy.c().a(4, 24).a(-5.0F, -5.0F, -4.2F, 10.0F, 3.0F, 4.0F, new gjx(0.0F)).a(0, 0).a(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new gjx(0.0F)),
         gjv.a(0.0F, 4.0F, 0.0F)
      );
      $$6.a(
         "eyes",
         gjy.c().a(4, 24).a(-5.0F, -5.0F, -4.2F, 10.0F, 3.0F, 4.0F, new gjx(0.0F)).a(0, 0).a(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new gjx(0.0F)),
         gjv.a(0.0F, 0.0F, 0.0F)
      );
      gkd $$7 = $$3.a("wind_body", gjy.c(), gjv.a(0.0F, 0.0F, 0.0F));
      gkd $$8 = $$7.a("wind_bottom", gjy.c().a(1, 83).a(-2.5F, -7.0F, -2.5F, 5.0F, 7.0F, 5.0F, new gjx(0.0F)), gjv.a(0.0F, 24.0F, 0.0F));
      gkd $$9 = $$8.a(
         "wind_mid",
         gjy.c()
            .a(74, 28)
            .a(-6.0F, -6.0F, -6.0F, 12.0F, 6.0F, 12.0F, new gjx(0.0F))
            .a(78, 32)
            .a(-4.0F, -6.0F, -4.0F, 8.0F, 6.0F, 8.0F, new gjx(0.0F))
            .a(49, 71)
            .a(-2.5F, -6.0F, -2.5F, 5.0F, 6.0F, 5.0F, new gjx(0.0F)),
         gjv.a(0.0F, -7.0F, 0.0F)
      );
      $$9.a(
         "wind_top",
         gjy.c()
            .a(0, 0)
            .a(-9.0F, -8.0F, -9.0F, 18.0F, 8.0F, 18.0F, new gjx(0.0F))
            .a(6, 6)
            .a(-6.0F, -8.0F, -6.0F, 12.0F, 8.0F, 12.0F, new gjx(0.0F))
            .a(105, 57)
            .a(-2.5F, -8.0F, -2.5F, 5.0F, 8.0F, 5.0F, new gjx(0.0F)),
         gjv.a(0.0F, -6.0F, 0.0F)
      );
      return gjz.a($$2, $$0, $$1);
   }

   public void a(hcs $$0) {
      super.a($$0);
      this.a($$0.a, fqm.a, $$0.u);
      this.a($$0.b, fqm.b, $$0.u);
      this.a($$0.c, fqm.e, $$0.u);
      this.a($$0.d, fqm.f, $$0.u);
      this.a($$0.e, fqm.d, $$0.u);
      this.a($$0.f, fqm.c, $$0.u);
   }

   public gjt a() {
      return this.d;
   }

   public gjt b() {
      return this.e;
   }

   public gjt c() {
      return this.k;
   }

   public gjt d() {
      return this.f;
   }
}
