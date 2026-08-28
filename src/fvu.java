public class fvu extends fxa<grz> implements fvx {
   private final gab a;
   private final gab b;
   private final gab c;
   private final gab d;
   private final gab e;
   private final gab f;
   private final gab g;
   private static final float i = (float) (Math.PI / 4);
   private static final float j = -1.134464F;
   private static final float k = (float) (-Math.PI / 3);

   public fvu(gab $$0) {
      super(ghe::j);
      this.a = $$0.b("root");
      this.b = this.a.b("head");
      this.c = this.a.b("body");
      this.d = this.c.b("right_arm");
      this.e = this.c.b("left_arm");
      this.f = this.c.b("right_wing");
      this.g = this.c.b("left_wing");
   }

   @Override
   public gab a() {
      return this.a;
   }

   public static gah b() {
      gaj $$0 = new gaj();
      gal $$1 = $$0.a();
      gal $$2 = $$1.a("root", gag.c(), gad.a(0.0F, 23.5F, 0.0F));
      $$2.a("head", gag.c().a(0, 0).a(-2.5F, -5.0F, -2.5F, 5.0F, 5.0F, 5.0F, new gaf(0.0F)), gad.a(0.0F, -3.99F, 0.0F));
      gal $$3 = $$2.a(
         "body",
         gag.c().a(0, 10).a(-1.5F, 0.0F, -1.0F, 3.0F, 4.0F, 2.0F, new gaf(0.0F)).a(0, 16).a(-1.5F, 0.0F, -1.0F, 3.0F, 5.0F, 2.0F, new gaf(-0.2F)),
         gad.a(0.0F, -4.0F, 0.0F)
      );
      $$3.a("right_arm", gag.c().a(23, 0).a(-0.75F, -0.5F, -1.0F, 1.0F, 4.0F, 2.0F, new gaf(-0.01F)), gad.a(-1.75F, 0.5F, 0.0F));
      $$3.a("left_arm", gag.c().a(23, 6).a(-0.25F, -0.5F, -1.0F, 1.0F, 4.0F, 2.0F, new gaf(-0.01F)), gad.a(1.75F, 0.5F, 0.0F));
      $$3.a("right_wing", gag.c().a(16, 14).a(0.0F, 1.0F, 0.0F, 0.0F, 5.0F, 8.0F, new gaf(0.0F)), gad.a(-0.5F, 0.0F, 0.6F));
      $$3.a("left_wing", gag.c().a(16, 14).a(0.0F, 1.0F, 0.0F, 0.0F, 5.0F, 8.0F, new gaf(0.0F)), gad.a(0.5F, 0.0F, 0.6F));
      return gah.a($$0, 32, 32);
   }

   public void a(grz $$0) {
      this.a().e().forEach(gab::c);
      float $$1 = $$0.Y;
      float $$2 = $$0.X;
      float $$3 = $$0.p * 20.0F * (float) (Math.PI / 180.0) + $$2;
      float $$4 = azc.b($$3) * (float) Math.PI * 0.15F + $$1;
      float $$5 = $$0.p * 9.0F * (float) (Math.PI / 180.0);
      float $$6 = Math.min($$1 / 0.3F, 1.0F);
      float $$7 = 1.0F - $$6;
      float $$8 = $$0.d;
      if ($$0.a) {
         float $$9 = $$0.p * 8.0F * (float) (Math.PI / 180.0) + $$1;
         float $$10 = azc.b($$9) * 16.0F * (float) (Math.PI / 180.0);
         float $$11 = $$0.c;
         float $$12 = azc.b($$9) * 14.0F * (float) (Math.PI / 180.0);
         float $$13 = azc.b($$9) * 30.0F * (float) (Math.PI / 180.0);
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
      float $$14 = $$8 * azc.h($$6, (float) (-Math.PI / 3), -1.134464F);
      this.a.c = this.a.c + (float)Math.cos((double)$$5) * 0.25F * $$7;
      this.d.e = $$14;
      this.e.e = $$14;
      float $$15 = $$7 * (1.0F - $$8);
      float $$16 = 0.43633232F - azc.b($$5 + (float) (Math.PI * 3.0 / 2.0)) * (float) Math.PI * 0.075F * $$15;
      this.e.g = -$$16;
      this.d.g = $$16;
      this.d.f = 0.27925268F * $$8;
      this.e.f = -0.27925268F * $$8;
   }

   @Override
   public void a(btz $$0, fcu $$1) {
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
