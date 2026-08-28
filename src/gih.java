public class gih extends gfq<her> implements gga, gic {
   protected final giu a;
   private final giu b;
   private final giu c;
   private final giu d;
   private final giu e;
   private final giu f;
   private final giu g;

   public gih(giu $$0) {
      super($$0);
      this.b = $$0.b("head");
      this.c = this.b.b("hat");
      this.d = this.c.b("hat_rim");
      this.a = this.b.b("nose");
      this.e = $$0.b("right_leg");
      this.f = $$0.b("left_leg");
      this.g = $$0.b("arms");
   }

   public static gja a() {
      gjc $$0 = gid.a();
      gje $$1 = $$0.a();
      gje $$2 = $$1.a("head", giz.c().a(0, 0).a(-4.0F, -10.0F, -4.0F, 8.0F, 10.0F, 8.0F), giw.a);
      gje $$3 = $$2.a("hat", giz.c().a(0, 64).a(0.0F, 0.0F, 0.0F, 10.0F, 2.0F, 10.0F), giw.a(-5.0F, -10.03125F, -5.0F));
      gje $$4 = $$3.a("hat2", giz.c().a(0, 76).a(0.0F, 0.0F, 0.0F, 7.0F, 4.0F, 7.0F), giw.a(1.75F, -4.0F, 2.0F, -0.05235988F, 0.0F, 0.02617994F));
      gje $$5 = $$4.a("hat3", giz.c().a(0, 87).a(0.0F, 0.0F, 0.0F, 4.0F, 4.0F, 4.0F), giw.a(1.75F, -4.0F, 2.0F, -0.10471976F, 0.0F, 0.05235988F));
      $$5.a(
         "hat4", giz.c().a(0, 95).a(0.0F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F, new giy(0.25F)), giw.a(1.75F, -2.0F, 2.0F, (float) (-Math.PI / 15), 0.0F, 0.10471976F)
      );
      gje $$6 = $$2.b("nose");
      $$6.a("mole", giz.c().a(0, 0).a(0.0F, 3.0F, -6.75F, 1.0F, 1.0F, 1.0F, new giy(-0.25F)), giw.a(0.0F, -2.0F, 0.0F));
      return gja.a($$0, 64, 128);
   }

   public void a(her $$0) {
      super.a($$0);
      this.b.f = $$0.aa * (float) (Math.PI / 180.0);
      this.b.e = $$0.ab * (float) (Math.PI / 180.0);
      this.e.e = azm.b($$0.ad * 0.6662F) * 1.4F * $$0.ae * 0.5F;
      this.f.e = azm.b($$0.ad * 0.6662F + (float) Math.PI) * 1.4F * $$0.ae * 0.5F;
      float $$1 = 0.01F * (float)($$0.a % 10);
      this.a.e = azm.a($$0.u * $$1) * 4.5F * (float) (Math.PI / 180.0);
      this.a.g = azm.b($$0.u * $$1) * 2.5F * (float) (Math.PI / 180.0);
      if ($$0.b) {
         this.a.a(0.0F, 1.0F, -1.5F);
         this.a.e = -0.9F;
      }
   }

   public giu c() {
      return this.a;
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
