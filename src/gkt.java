public class gkt extends gic<hhd> implements gim, gko {
   protected final glg a;
   private final glg b;
   private final glg c;
   private final glg d;
   private final glg e;
   private final glg f;
   private final glg g;

   public gkt(glg $$0) {
      super($$0);
      this.b = $$0.b("head");
      this.c = this.b.b("hat");
      this.d = this.c.b("hat_rim");
      this.a = this.b.b("nose");
      this.e = $$0.b("right_leg");
      this.f = $$0.b("left_leg");
      this.g = $$0.b("arms");
   }

   public static glm a() {
      glo $$0 = gkp.a();
      glq $$1 = $$0.a();
      glq $$2 = $$1.a("head", gll.c().a(0, 0).a(-4.0F, -10.0F, -4.0F, 8.0F, 10.0F, 8.0F), gli.a);
      glq $$3 = $$2.a("hat", gll.c().a(0, 64).a(0.0F, 0.0F, 0.0F, 10.0F, 2.0F, 10.0F), gli.a(-5.0F, -10.03125F, -5.0F));
      glq $$4 = $$3.a("hat2", gll.c().a(0, 76).a(0.0F, 0.0F, 0.0F, 7.0F, 4.0F, 7.0F), gli.a(1.75F, -4.0F, 2.0F, -0.05235988F, 0.0F, 0.02617994F));
      glq $$5 = $$4.a("hat3", gll.c().a(0, 87).a(0.0F, 0.0F, 0.0F, 4.0F, 4.0F, 4.0F), gli.a(1.75F, -4.0F, 2.0F, -0.10471976F, 0.0F, 0.05235988F));
      $$5.a(
         "hat4", gll.c().a(0, 95).a(0.0F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F, new glk(0.25F)), gli.a(1.75F, -2.0F, 2.0F, (float) (-Math.PI / 15), 0.0F, 0.10471976F)
      );
      glq $$6 = $$2.b("nose");
      $$6.a("mole", gll.c().a(0, 0).a(0.0F, 3.0F, -6.75F, 1.0F, 1.0F, 1.0F, new glk(-0.25F)), gli.a(0.0F, -2.0F, 0.0F));
      return glm.a($$0, 64, 128);
   }

   public void a(hhd $$0) {
      super.a($$0);
      this.b.f = $$0.aa * (float) (Math.PI / 180.0);
      this.b.e = $$0.ab * (float) (Math.PI / 180.0);
      this.e.e = azq.b($$0.ad * 0.6662F) * 1.4F * $$0.ae * 0.5F;
      this.f.e = azq.b($$0.ad * 0.6662F + (float) Math.PI) * 1.4F * $$0.ae * 0.5F;
      float $$1 = 0.01F * (float)($$0.a % 10);
      this.a.e = azq.a($$0.u * $$1) * 4.5F * (float) (Math.PI / 180.0);
      this.a.g = azq.b($$0.u * $$1) * 2.5F * (float) (Math.PI / 180.0);
      if ($$0.b) {
         this.a.a(0.0F, 1.0F, -1.5F);
         this.a.e = -0.9F;
      }
   }

   public glg c() {
      return this.a;
   }

   @Override
   public glg b() {
      return this.b;
   }

   @Override
   public void a(boolean $$0) {
      this.b.k = $$0;
      this.c.k = $$0;
      this.d.k = $$0;
   }

   @Override
   public void a(flq $$0) {
      this.v.a($$0);
      this.g.a($$0);
   }
}
