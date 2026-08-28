public class gsj extends gse<buy, gyp> {
   private static final akv a = akv.b("textures/entity/experience_orb.png");
   private static final gmj b = gmj.i(a);

   public gsj(gsf.a $$0) {
      super($$0);
      this.f = 0.15F;
      this.g = 0.75F;
   }

   protected int a(buy $$0, ji $$1) {
      return ayz.a(super.a($$0, $$1) + 7, 0, 15);
   }

   public void a(gyp $$0, ffv $$1, glz $$2, int $$3) {
      $$1.a();
      int $$4 = $$0.a;
      float $$5 = (float)($$4 % 4 * 16 + 0) / 64.0F;
      float $$6 = (float)($$4 % 4 * 16 + 16) / 64.0F;
      float $$7 = (float)($$4 / 4 * 16 + 0) / 64.0F;
      float $$8 = (float)($$4 / 4 * 16 + 16) / 64.0F;
      float $$9 = 1.0F;
      float $$10 = 0.5F;
      float $$11 = 0.25F;
      float $$12 = 255.0F;
      float $$13 = $$0.u / 2.0F;
      int $$14 = (int)((ayz.a($$13 + 0.0F) + 1.0F) * 0.5F * 255.0F);
      int $$15 = 255;
      int $$16 = (int)((ayz.a($$13 + (float) (Math.PI * 4.0 / 3.0)) + 1.0F) * 0.1F * 255.0F);
      $$1.a(0.0F, 0.1F, 0.0F);
      $$1.a(this.e.b());
      float $$17 = 0.3F;
      $$1.b(0.3F, 0.3F, 0.3F);
      ffz $$18 = $$2.getBuffer(b);
      ffv.a $$19 = $$1.c();
      a($$18, $$19, -0.5F, -0.25F, $$14, 255, $$16, $$5, $$8, $$3);
      a($$18, $$19, 0.5F, -0.25F, $$14, 255, $$16, $$6, $$8, $$3);
      a($$18, $$19, 0.5F, 0.75F, $$14, 255, $$16, $$6, $$7, $$3);
      a($$18, $$19, -0.5F, 0.75F, $$14, 255, $$16, $$5, $$7, $$3);
      $$1.b();
      super.a($$0, $$1, $$2, $$3);
   }

   private static void a(ffz $$0, ffv.a $$1, float $$2, float $$3, int $$4, int $$5, int $$6, float $$7, float $$8, int $$9) {
      $$0.a($$1, $$2, $$3, 0.0F).a($$4, $$5, $$6, 128).a($$7, $$8).b(hej.d).c($$9).b($$1, 0.0F, 1.0F, 0.0F);
   }

   public gyp a() {
      return new gyp();
   }

   public void a(buy $$0, gyp $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.m();
   }
}
