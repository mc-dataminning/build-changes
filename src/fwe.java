public class fwe extends fxk<gsq> implements fwh {
   private final gal a;
   private final gal b;
   private final gal c;
   private final gal d;
   private final gal e;
   private final gal f;
   private final gal g;
   private static final float i = (float) (Math.PI / 4);
   private static final float j = -1.134464F;
   private static final float k = (float) (-Math.PI / 3);

   public fwe(gal $$0) {
      super(ghq::i);
      this.a = $$0.b("root");
      this.b = this.a.b("head");
      this.c = this.a.b("body");
      this.d = this.c.b("right_arm");
      this.e = this.c.b("left_arm");
      this.f = this.c.b("right_wing");
      this.g = this.c.b("left_wing");
   }

   @Override
   public gal a() {
      return this.a;
   }

   public static gar b() {
      gat $$0 = new gat();
      gav $$1 = $$0.a();
      gav $$2 = $$1.a("root", gaq.c(), gan.a(0.0F, 23.5F, 0.0F));
      $$2.a("head", gaq.c().a(0, 0).a(-2.5F, -5.0F, -2.5F, 5.0F, 5.0F, 5.0F, new gap(0.0F)), gan.a(0.0F, -3.99F, 0.0F));
      gav $$3 = $$2.a(
         "body",
         gaq.c().a(0, 10).a(-1.5F, 0.0F, -1.0F, 3.0F, 4.0F, 2.0F, new gap(0.0F)).a(0, 16).a(-1.5F, 0.0F, -1.0F, 3.0F, 5.0F, 2.0F, new gap(-0.2F)),
         gan.a(0.0F, -4.0F, 0.0F)
      );
      $$3.a("right_arm", gaq.c().a(23, 0).a(-0.75F, -0.5F, -1.0F, 1.0F, 4.0F, 2.0F, new gap(-0.01F)), gan.a(-1.75F, 0.5F, 0.0F));
      $$3.a("left_arm", gaq.c().a(23, 6).a(-0.25F, -0.5F, -1.0F, 1.0F, 4.0F, 2.0F, new gap(-0.01F)), gan.a(1.75F, 0.5F, 0.0F));
      $$3.a("right_wing", gaq.c().a(16, 14).a(0.0F, 1.0F, 0.0F, 0.0F, 5.0F, 8.0F, new gap(0.0F)), gan.a(-0.5F, 0.0F, 0.6F));
      $$3.a("left_wing", gaq.c().a(16, 14).a(0.0F, 1.0F, 0.0F, 0.0F, 5.0F, 8.0F, new gap(0.0F)), gan.a(0.5F, 0.0F, 0.6F));
      return gar.a($$0, 32, 32);
   }

   public void a(gsq $$0) {
      this.a().e().forEach(gal::c);
      float $$1 = $$0.Y;
      float $$2 = $$0.X;
      float $$3 = $$0.p * 20.0F * (float) (Math.PI / 180.0) + $$2;
      float $$4 = azd.b($$3) * (float) Math.PI * 0.15F + $$1;
      float $$5 = $$0.p * 9.0F * (float) (Math.PI / 180.0);
      float $$6 = Math.min($$1 / 0.3F, 1.0F);
      float $$7 = 1.0F - $$6;
      float $$8 = $$0.d;
      if ($$0.a) {
         float $$9 = $$0.p * 8.0F * (float) (Math.PI / 180.0) + $$1;
         float $$10 = azd.b($$9) * 16.0F * (float) (Math.PI / 180.0);
         float $$11 = $$0.c;
         float $$12 = azd.b($$9) * 14.0F * (float) (Math.PI / 180.0);
         float $$13 = azd.b($$9) * 30.0F * (float) (Math.PI / 180.0);
         this.a.f = $$0.b ? (float) (Math.PI * 4) * $$11 : this.a.f;
         this.a.g = $$10 * (1.0F - $$11);
         this.b.f = $$13 * (1.0F - $$11);
         this.b.g = $$12 * (1.0F - $$11);
      } else {
         this.b.e = $$0.V * (float) (Math.PI / 180.0);
         this.b.f = $$0.U * (float) (Math.PI / 180.0);
      }

      this.f.e = 0.43633232F * (1.0F - $$6);
      this.f.f = (float) (-Math.PI / 4) + $$4;
      this.g.e = 0.43633232F * (1.0F - $$6);
      this.g.f = (float) (Math.PI / 4) - $$4;
      this.c.e = $$6 * (float) (Math.PI / 4);
      float $$14 = $$8 * azd.h($$6, (float) (-Math.PI / 3), -1.134464F);
      this.a.c = this.a.c + (float)Math.cos((double)$$5) * 0.25F * $$7;
      this.d.e = $$14;
      this.e.e = $$14;
      float $$15 = $$7 * (1.0F - $$8);
      float $$16 = 0.43633232F - azd.b($$5 + (float) (Math.PI * 3.0 / 2.0)) * (float) Math.PI * 0.075F * $$15;
      this.e.g = -$$16;
      this.d.g = $$16;
      this.d.f = 0.27925268F * $$8;
      this.e.f = -0.27925268F * $$8;
   }

   @Override
   public void a(bue $$0, fde $$1) {
      float $$2 = 1.0F;
      float $$3 = 3.0F;
      this.a.a($$1);
      this.c.a($$1);
      $$1.a(0.0F, 0.0625F, 0.1875F);
      $$1.a(a.b.rotation(this.d.e));
      $$1.b(0.7F, 0.7F, 0.7F);
      $$1.a(0.0625F, 0.0F, 0.0F);
   }
}
