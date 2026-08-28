public class gel extends gfy<hbp> implements geo {
   private final gjc a = this.v.b("head");
   private final gjc b = this.v.b("body");
   private final gjc c = this.b.b("right_arm");
   private final gjc d = this.b.b("left_arm");
   private final gjc e = this.b.b("right_wing");
   private final gjc f = this.b.b("left_wing");
   private static final float g = (float) (Math.PI / 4);
   private static final float i = -1.134464F;
   private static final float j = (float) (-Math.PI / 3);

   public gel(gjc $$0) {
      super($$0.b("root"), gqk::j);
   }

   public static gji a() {
      gjk $$0 = new gjk();
      gjm $$1 = $$0.a();
      gjm $$2 = $$1.a("root", gjh.c(), gje.a(0.0F, 23.5F, 0.0F));
      $$2.a("head", gjh.c().a(0, 0).a(-2.5F, -5.0F, -2.5F, 5.0F, 5.0F, 5.0F, new gjg(0.0F)), gje.a(0.0F, -3.99F, 0.0F));
      gjm $$3 = $$2.a(
         "body",
         gjh.c().a(0, 10).a(-1.5F, 0.0F, -1.0F, 3.0F, 4.0F, 2.0F, new gjg(0.0F)).a(0, 16).a(-1.5F, 0.0F, -1.0F, 3.0F, 5.0F, 2.0F, new gjg(-0.2F)),
         gje.a(0.0F, -4.0F, 0.0F)
      );
      $$3.a("right_arm", gjh.c().a(23, 0).a(-0.75F, -0.5F, -1.0F, 1.0F, 4.0F, 2.0F, new gjg(-0.01F)), gje.a(-1.75F, 0.5F, 0.0F));
      $$3.a("left_arm", gjh.c().a(23, 6).a(-0.25F, -0.5F, -1.0F, 1.0F, 4.0F, 2.0F, new gjg(-0.01F)), gje.a(1.75F, 0.5F, 0.0F));
      $$3.a("right_wing", gjh.c().a(16, 14).a(0.0F, 1.0F, 0.0F, 0.0F, 5.0F, 8.0F, new gjg(0.0F)), gje.a(-0.5F, 0.0F, 0.6F));
      $$3.a("left_wing", gjh.c().a(16, 14).a(0.0F, 1.0F, 0.0F, 0.0F, 5.0F, 8.0F, new gjg(0.0F)), gje.a(0.5F, 0.0F, 0.6F));
      return gji.a($$0, 32, 32);
   }

   public void a(hbp $$0) {
      super.a($$0);
      float $$1 = $$0.ae;
      float $$2 = $$0.ad;
      float $$3 = $$0.u * 20.0F * (float) (Math.PI / 180.0) + $$2;
      float $$4 = azm.b($$3) * (float) Math.PI * 0.15F + $$1;
      float $$5 = $$0.u * 9.0F * (float) (Math.PI / 180.0);
      float $$6 = Math.min($$1 / 0.3F, 1.0F);
      float $$7 = 1.0F - $$6;
      float $$8 = $$0.d;
      if ($$0.a) {
         float $$9 = $$0.u * 8.0F * (float) (Math.PI / 180.0) + $$1;
         float $$10 = azm.b($$9) * 16.0F * (float) (Math.PI / 180.0);
         float $$11 = $$0.c;
         float $$12 = azm.b($$9) * 14.0F * (float) (Math.PI / 180.0);
         float $$13 = azm.b($$9) * 30.0F * (float) (Math.PI / 180.0);
         this.v.f = $$0.b ? (float) (Math.PI * 4) * $$11 : this.v.f;
         this.v.g = $$10 * (1.0F - $$11);
         this.a.f = $$13 * (1.0F - $$11);
         this.a.g = $$12 * (1.0F - $$11);
      } else {
         this.a.e = $$0.ab * (float) (Math.PI / 180.0);
         this.a.f = $$0.aa * (float) (Math.PI / 180.0);
      }

      this.e.e = 0.43633232F * (1.0F - $$6);
      this.e.f = (float) (-Math.PI / 4) + $$4;
      this.f.e = 0.43633232F * (1.0F - $$6);
      this.f.f = (float) (Math.PI / 4) - $$4;
      this.b.e = $$6 * (float) (Math.PI / 4);
      float $$14 = $$8 * azm.h($$6, (float) (-Math.PI / 3), -1.134464F);
      this.v.c = this.v.c + (float)Math.cos((double)$$5) * 0.25F * $$7;
      this.c.e = $$14;
      this.d.e = $$14;
      float $$15 = $$7 * (1.0F - $$8);
      float $$16 = 0.43633232F - azm.b($$5 + (float) (Math.PI * 3.0 / 2.0)) * (float) Math.PI * 0.075F * $$15;
      this.d.g = -$$16;
      this.c.g = $$16;
      this.c.f = 0.27925268F * $$8;
      this.d.f = -0.27925268F * $$8;
   }

   @Override
   public void a(bwx $$0, fjj $$1) {
      float $$2 = 1.0F;
      float $$3 = 3.0F;
      this.v.a($$1);
      this.b.a($$1);
      $$1.a(0.0F, 0.0625F, 0.1875F);
      $$1.a(a.b.rotation(this.c.e));
      $$1.b(0.7F, 0.7F, 0.7F);
      $$1.a(0.0625F, 0.0F, 0.0F);
   }
}
