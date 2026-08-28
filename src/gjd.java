public class gjd extends giy<bth> {
   private static final alf a = new alf("textures/entity/experience_orb.png");
   private static final gdy f = gdy.g(a);

   public gjd(giz.a $$0) {
      super($$0);
      this.d = 0.15F;
      this.e = 0.75F;
   }

   protected int a(bth $$0, iz $$1) {
      return ayz.a(super.a($$0, $$1) + 7, 0, 15);
   }

   public void a(bth $$0, float $$1, float $$2, faa $$3, gdq $$4, int $$5) {
      $$3.a();
      int $$6 = $$0.s();
      float $$7 = (float)($$6 % 4 * 16 + 0) / 64.0F;
      float $$8 = (float)($$6 % 4 * 16 + 16) / 64.0F;
      float $$9 = (float)($$6 / 4 * 16 + 0) / 64.0F;
      float $$10 = (float)($$6 / 4 * 16 + 16) / 64.0F;
      float $$11 = 1.0F;
      float $$12 = 0.5F;
      float $$13 = 0.25F;
      float $$14 = 255.0F;
      float $$15 = ((float)$$0.ai + $$2) / 2.0F;
      int $$16 = (int)((ayz.a($$15 + 0.0F) + 1.0F) * 0.5F * 255.0F);
      int $$17 = 255;
      int $$18 = (int)((ayz.a($$15 + (float) (Math.PI * 4.0 / 3.0)) + 1.0F) * 0.1F * 255.0F);
      $$3.a(0.0F, 0.1F, 0.0F);
      $$3.a(this.c.b());
      $$3.a(a.d.rotationDegrees(180.0F));
      float $$19 = 0.3F;
      $$3.b(0.3F, 0.3F, 0.3F);
      fae $$20 = $$4.getBuffer(f);
      faa.a $$21 = $$3.c();
      a($$20, $$21, -0.5F, -0.25F, $$16, 255, $$18, $$7, $$10, $$5);
      a($$20, $$21, 0.5F, -0.25F, $$16, 255, $$18, $$8, $$10, $$5);
      a($$20, $$21, 0.5F, 0.75F, $$16, 255, $$18, $$8, $$9, $$5);
      a($$20, $$21, -0.5F, 0.75F, $$16, 255, $$18, $$7, $$9, $$5);
      $$3.b();
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   private static void a(fae $$0, faa.a $$1, float $$2, float $$3, int $$4, int $$5, int $$6, float $$7, float $$8, int $$9) {
      $$0.a($$1, $$2, $$3, 0.0F).a($$4, $$5, $$6, 128).a($$7, $$8).c(gos.d).b($$9).b($$1, 0.0F, 1.0F, 0.0F).e();
   }

   public alf a(bth $$0) {
      return a;
   }
}
