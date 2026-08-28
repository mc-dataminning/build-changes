public class fyu extends fzj<gvd> {
   private static final float a = 0.6F;
   private static final float b = 0.8F;
   private static final float c = 1.0F;
   private final gcl d;
   private final gcl e;
   private final gcl f;
   private final gcl g;
   private final gcl i;
   private final gcl j;
   private final gcl k;

   public fyu(gcl $$0) {
      super($$0, gjq::i);
      this.f = $$0.b("wind_body");
      this.j = this.f.b("wind_bottom");
      this.i = this.j.b("wind_mid");
      this.g = this.i.b("wind_top");
      this.d = $$0.b("body").b("head");
      this.e = this.d.b("eyes");
      this.k = $$0.b("body").b("rods");
   }

   public static gcr a(int $$0, int $$1) {
      gct $$2 = new gct();
      gcv $$3 = $$2.a();
      gcv $$4 = $$3.a("body", gcq.c(), gcn.a(0.0F, 0.0F, 0.0F));
      gcv $$5 = $$4.a("rods", gcq.c(), gcn.a(0.0F, 8.0F, 0.0F));
      $$5.a("rod_1", gcq.c().a(0, 17).a(-1.0F, 0.0F, -3.0F, 2.0F, 8.0F, 2.0F, new gcp(0.0F)), gcn.a(2.5981F, -3.0F, 1.5F, -2.7489F, -1.0472F, 3.1416F));
      $$5.a("rod_2", gcq.c().a(0, 17).a(-1.0F, 0.0F, -3.0F, 2.0F, 8.0F, 2.0F, new gcp(0.0F)), gcn.a(-2.5981F, -3.0F, 1.5F, -2.7489F, 1.0472F, 3.1416F));
      $$5.a("rod_3", gcq.c().a(0, 17).a(-1.0F, 0.0F, -3.0F, 2.0F, 8.0F, 2.0F, new gcp(0.0F)), gcn.a(0.0F, -3.0F, -3.0F, 0.3927F, 0.0F, 0.0F));
      gcv $$6 = $$4.a(
         "head",
         gcq.c().a(4, 24).a(-5.0F, -5.0F, -4.2F, 10.0F, 3.0F, 4.0F, new gcp(0.0F)).a(0, 0).a(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new gcp(0.0F)),
         gcn.a(0.0F, 4.0F, 0.0F)
      );
      $$6.a(
         "eyes",
         gcq.c().a(4, 24).a(-5.0F, -5.0F, -4.2F, 10.0F, 3.0F, 4.0F, new gcp(0.0F)).a(0, 0).a(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new gcp(0.0F)),
         gcn.a(0.0F, 0.0F, 0.0F)
      );
      gcv $$7 = $$3.a("wind_body", gcq.c(), gcn.a(0.0F, 0.0F, 0.0F));
      gcv $$8 = $$7.a("wind_bottom", gcq.c().a(1, 83).a(-2.5F, -7.0F, -2.5F, 5.0F, 7.0F, 5.0F, new gcp(0.0F)), gcn.a(0.0F, 24.0F, 0.0F));
      gcv $$9 = $$8.a(
         "wind_mid",
         gcq.c()
            .a(74, 28)
            .a(-6.0F, -6.0F, -6.0F, 12.0F, 6.0F, 12.0F, new gcp(0.0F))
            .a(78, 32)
            .a(-4.0F, -6.0F, -4.0F, 8.0F, 6.0F, 8.0F, new gcp(0.0F))
            .a(49, 71)
            .a(-2.5F, -6.0F, -2.5F, 5.0F, 6.0F, 5.0F, new gcp(0.0F)),
         gcn.a(0.0F, -7.0F, 0.0F)
      );
      $$9.a(
         "wind_top",
         gcq.c()
            .a(0, 0)
            .a(-9.0F, -8.0F, -9.0F, 18.0F, 8.0F, 18.0F, new gcp(0.0F))
            .a(6, 6)
            .a(-6.0F, -8.0F, -6.0F, 12.0F, 8.0F, 12.0F, new gcp(0.0F))
            .a(105, 57)
            .a(-2.5F, -8.0F, -2.5F, 5.0F, 8.0F, 5.0F, new gcp(0.0F)),
         gcn.a(0.0F, -6.0F, 0.0F)
      );
      return gcr.a($$2, $$0, $$1);
   }

   public void a(gvd $$0) {
      super.a($$0);
      float $$1 = $$0.p * (float) Math.PI * -0.1F;
      this.g.b = azm.b($$1) * 1.0F * 0.6F;
      this.g.d = azm.a($$1) * 1.0F * 0.6F;
      this.i.b = azm.a($$1) * 0.5F * 0.8F;
      this.i.d = azm.b($$1) * 0.8F;
      this.j.b = azm.b($$1) * -0.25F * 1.0F;
      this.j.d = azm.a($$1) * -0.25F * 1.0F;
      this.d.c = 4.0F + azm.b($$1) / 4.0F;
      this.k.f = $$0.p * (float) Math.PI * 0.1F;
      this.a($$0.a, fky.a, $$0.p);
      this.a($$0.b, fky.d, $$0.p);
      this.a($$0.c, fky.e, $$0.p);
      this.a($$0.d, fky.c, $$0.p);
      this.a($$0.e, fky.b, $$0.p);
   }

   public gcl a() {
      return this.d;
   }

   public gcl b() {
      return this.e;
   }

   public gcl c() {
      return this.k;
   }

   public gcl d() {
      return this.f;
   }
}
