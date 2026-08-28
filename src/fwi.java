public class fwi extends fxo<gsv> implements fwl {
   private final gaq a = this.v.b("head");
   private final gaq b = this.v.b("body");
   private final gaq c = this.b.b("right_arm");
   private final gaq d = this.b.b("left_arm");
   private final gaq e = this.b.b("right_wing");
   private final gaq f = this.b.b("left_wing");
   private static final float g = (float) (Math.PI / 4);
   private static final float i = -1.134464F;
   private static final float j = (float) (-Math.PI / 3);

   public fwi(gaq $$0) {
      super($$0.b("root"), ghv::i);
   }

   public static gaw a() {
      gay $$0 = new gay();
      gba $$1 = $$0.a();
      gba $$2 = $$1.a("root", gav.c(), gas.a(0.0F, 23.5F, 0.0F));
      $$2.a("head", gav.c().a(0, 0).a(-2.5F, -5.0F, -2.5F, 5.0F, 5.0F, 5.0F, new gau(0.0F)), gas.a(0.0F, -3.99F, 0.0F));
      gba $$3 = $$2.a(
         "body",
         gav.c().a(0, 10).a(-1.5F, 0.0F, -1.0F, 3.0F, 4.0F, 2.0F, new gau(0.0F)).a(0, 16).a(-1.5F, 0.0F, -1.0F, 3.0F, 5.0F, 2.0F, new gau(-0.2F)),
         gas.a(0.0F, -4.0F, 0.0F)
      );
      $$3.a("right_arm", gav.c().a(23, 0).a(-0.75F, -0.5F, -1.0F, 1.0F, 4.0F, 2.0F, new gau(-0.01F)), gas.a(-1.75F, 0.5F, 0.0F));
      $$3.a("left_arm", gav.c().a(23, 6).a(-0.25F, -0.5F, -1.0F, 1.0F, 4.0F, 2.0F, new gau(-0.01F)), gas.a(1.75F, 0.5F, 0.0F));
      $$3.a("right_wing", gav.c().a(16, 14).a(0.0F, 1.0F, 0.0F, 0.0F, 5.0F, 8.0F, new gau(0.0F)), gas.a(-0.5F, 0.0F, 0.6F));
      $$3.a("left_wing", gav.c().a(16, 14).a(0.0F, 1.0F, 0.0F, 0.0F, 5.0F, 8.0F, new gau(0.0F)), gas.a(0.5F, 0.0F, 0.6F));
      return gaw.a($$0, 32, 32);
   }

   public void a(gsv $$0) {
      super.a($$0);
      float $$1 = $$0.Y;
      float $$2 = $$0.X;
      float $$3 = $$0.p * 20.0F * (float) (Math.PI / 180.0) + $$2;
      float $$4 = azf.b($$3) * (float) Math.PI * 0.15F + $$1;
      float $$5 = $$0.p * 9.0F * (float) (Math.PI / 180.0);
      float $$6 = Math.min($$1 / 0.3F, 1.0F);
      float $$7 = 1.0F - $$6;
      float $$8 = $$0.d;
      if ($$0.a) {
         float $$9 = $$0.p * 8.0F * (float) (Math.PI / 180.0) + $$1;
         float $$10 = azf.b($$9) * 16.0F * (float) (Math.PI / 180.0);
         float $$11 = $$0.c;
         float $$12 = azf.b($$9) * 14.0F * (float) (Math.PI / 180.0);
         float $$13 = azf.b($$9) * 30.0F * (float) (Math.PI / 180.0);
         this.v.f = $$0.b ? (float) (Math.PI * 4) * $$11 : this.v.f;
         this.v.g = $$10 * (1.0F - $$11);
         this.a.f = $$13 * (1.0F - $$11);
         this.a.g = $$12 * (1.0F - $$11);
      } else {
         this.a.e = $$0.V * (float) (Math.PI / 180.0);
         this.a.f = $$0.U * (float) (Math.PI / 180.0);
      }

      this.e.e = 0.43633232F * (1.0F - $$6);
      this.e.f = (float) (-Math.PI / 4) + $$4;
      this.f.e = 0.43633232F * (1.0F - $$6);
      this.f.f = (float) (Math.PI / 4) - $$4;
      this.b.e = $$6 * (float) (Math.PI / 4);
      float $$14 = $$8 * azf.h($$6, (float) (-Math.PI / 3), -1.134464F);
      this.v.c = this.v.c + (float)Math.cos((double)$$5) * 0.25F * $$7;
      this.c.e = $$14;
      this.d.e = $$14;
      float $$15 = $$7 * (1.0F - $$8);
      float $$16 = 0.43633232F - azf.b($$5 + (float) (Math.PI * 3.0 / 2.0)) * (float) Math.PI * 0.075F * $$15;
      this.d.g = -$$16;
      this.c.g = $$16;
      this.c.f = 0.27925268F * $$8;
      this.d.f = -0.27925268F * $$8;
   }

   @Override
   public void a(buh $$0, fdi $$1) {
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
