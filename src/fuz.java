public class fuz<T extends cka> extends fvz<T> {
   private static final float a = 0.6F;
   private static final float b = 0.8F;
   private static final float f = 1.0F;
   private final fys g;
   private final fys h;
   private final fys i;
   private final fys j;
   private final fys k;
   private final fys l;
   private final fys m;
   private final fys n;

   public fuz(fys $$0) {
      super(gfo::i);
      this.g = $$0;
      this.j = $$0.b("wind_body");
      this.m = this.j.b("wind_bottom");
      this.l = this.m.b("wind_mid");
      this.k = this.l.b("wind_top");
      this.h = $$0.b("body").b("head");
      this.i = this.h.b("eyes");
      this.n = $$0.b("body").b("rods");
   }

   public static fyy a(int $$0, int $$1) {
      fza $$2 = new fza();
      fzb $$3 = $$2.a();
      fzb $$4 = $$3.a("body", fyx.c(), fyu.a(0.0F, 0.0F, 0.0F));
      fzb $$5 = $$4.a("rods", fyx.c(), fyu.a(0.0F, 8.0F, 0.0F));
      $$5.a("rod_1", fyx.c().a(0, 17).a(-1.0F, 0.0F, -3.0F, 2.0F, 8.0F, 2.0F, new fyw(0.0F)), fyu.a(2.5981F, -3.0F, 1.5F, -2.7489F, -1.0472F, 3.1416F));
      $$5.a("rod_2", fyx.c().a(0, 17).a(-1.0F, 0.0F, -3.0F, 2.0F, 8.0F, 2.0F, new fyw(0.0F)), fyu.a(-2.5981F, -3.0F, 1.5F, -2.7489F, 1.0472F, 3.1416F));
      $$5.a("rod_3", fyx.c().a(0, 17).a(-1.0F, 0.0F, -3.0F, 2.0F, 8.0F, 2.0F, new fyw(0.0F)), fyu.a(0.0F, -3.0F, -3.0F, 0.3927F, 0.0F, 0.0F));
      fzb $$6 = $$4.a(
         "head",
         fyx.c().a(4, 24).a(-5.0F, -5.0F, -4.2F, 10.0F, 3.0F, 4.0F, new fyw(0.0F)).a(0, 0).a(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new fyw(0.0F)),
         fyu.a(0.0F, 4.0F, 0.0F)
      );
      $$6.a(
         "eyes",
         fyx.c().a(4, 24).a(-5.0F, -5.0F, -4.2F, 10.0F, 3.0F, 4.0F, new fyw(0.0F)).a(0, 0).a(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new fyw(0.0F)),
         fyu.a(0.0F, 0.0F, 0.0F)
      );
      fzb $$7 = $$3.a("wind_body", fyx.c(), fyu.a(0.0F, 0.0F, 0.0F));
      fzb $$8 = $$7.a("wind_bottom", fyx.c().a(1, 83).a(-2.5F, -7.0F, -2.5F, 5.0F, 7.0F, 5.0F, new fyw(0.0F)), fyu.a(0.0F, 24.0F, 0.0F));
      fzb $$9 = $$8.a(
         "wind_mid",
         fyx.c()
            .a(74, 28)
            .a(-6.0F, -6.0F, -6.0F, 12.0F, 6.0F, 12.0F, new fyw(0.0F))
            .a(78, 32)
            .a(-4.0F, -6.0F, -4.0F, 8.0F, 6.0F, 8.0F, new fyw(0.0F))
            .a(49, 71)
            .a(-2.5F, -6.0F, -2.5F, 5.0F, 6.0F, 5.0F, new fyw(0.0F)),
         fyu.a(0.0F, -7.0F, 0.0F)
      );
      $$9.a(
         "wind_top",
         fyx.c()
            .a(0, 0)
            .a(-9.0F, -8.0F, -9.0F, 18.0F, 8.0F, 18.0F, new fyw(0.0F))
            .a(6, 6)
            .a(-6.0F, -8.0F, -6.0F, 12.0F, 8.0F, 12.0F, new fyw(0.0F))
            .a(105, 57)
            .a(-2.5F, -8.0F, -2.5F, 5.0F, 8.0F, 5.0F, new fyw(0.0F)),
         fyu.a(0.0F, -6.0F, 0.0F)
      );
      return fyy.a($$2, $$0, $$1);
   }

   public void a(T $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      this.a().e().forEach(fys::c);
      float $$6 = $$3 * (float) Math.PI * -0.1F;
      this.k.b = aym.b($$6) * 1.0F * 0.6F;
      this.k.d = aym.a($$6) * 1.0F * 0.6F;
      this.l.b = aym.a($$6) * 0.5F * 0.8F;
      this.l.d = aym.b($$6) * 0.8F;
      this.m.b = aym.b($$6) * -0.25F * 1.0F;
      this.m.d = aym.a($$6) * -0.25F * 1.0F;
      this.h.c = 4.0F + aym.b($$6) / 4.0F;
      this.n.f = $$3 * (float) Math.PI * 0.1F;
      this.a($$0.ch, fhf.a, $$3);
      this.a($$0.c, fhf.c, $$3);
      this.a($$0.d, fhf.d, $$3);
      this.a($$0.e, fhf.b, $$3);
   }

   @Override
   public fys a() {
      return this.g;
   }

   public fys b() {
      return this.h;
   }

   public fys c() {
      return this.i;
   }

   public fys d() {
      return this.n;
   }

   public fys e() {
      return this.j;
   }
}
