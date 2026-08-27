public class gfv extends gfq<bqj> {
   private static final ajv a = new ajv("textures/entity/experience_orb.png");
   private static final gaq f = gaq.g(a);

   public gfv(gfr.a $$0) {
      super($$0);
      this.d = 0.15F;
      this.e = 0.75F;
   }

   protected int a(bqj $$0, id $$1) {
      return axm.a(super.a($$0, $$1) + 7, 0, 15);
   }

   public void a(bqj $$0, float $$1, float $$2, ewr $$3, gai $$4, int $$5) {
      $$3.a();
      int $$6 = $$0.r();
      float $$7 = (float)($$6 % 4 * 16 + 0) / 64.0F;
      float $$8 = (float)($$6 % 4 * 16 + 16) / 64.0F;
      float $$9 = (float)($$6 / 4 * 16 + 0) / 64.0F;
      float $$10 = (float)($$6 / 4 * 16 + 16) / 64.0F;
      float $$11 = 1.0F;
      float $$12 = 0.5F;
      float $$13 = 0.25F;
      float $$14 = 255.0F;
      float $$15 = ((float)$$0.ah + $$2) / 2.0F;
      int $$16 = (int)((axm.a($$15 + 0.0F) + 1.0F) * 0.5F * 255.0F);
      int $$17 = 255;
      int $$18 = (int)((axm.a($$15 + (float) (Math.PI * 4.0 / 3.0)) + 1.0F) * 0.1F * 255.0F);
      $$3.a(0.0F, 0.1F, 0.0F);
      $$3.a(this.c.b());
      $$3.a(a.d.rotationDegrees(180.0F));
      float $$19 = 0.3F;
      $$3.b(0.3F, 0.3F, 0.3F);
      ewv $$20 = $$4.getBuffer(f);
      ewr.a $$21 = $$3.c();
      a($$20, $$21, -0.5F, -0.25F, $$16, 255, $$18, $$7, $$10, $$5);
      a($$20, $$21, 0.5F, -0.25F, $$16, 255, $$18, $$8, $$10, $$5);
      a($$20, $$21, 0.5F, 0.75F, $$16, 255, $$18, $$8, $$9, $$5);
      a($$20, $$21, -0.5F, 0.75F, $$16, 255, $$18, $$7, $$9, $$5);
      $$3.b();
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   private static void a(ewv $$0, ewr.a $$1, float $$2, float $$3, int $$4, int $$5, int $$6, float $$7, float $$8, int $$9) {
      $$0.a($$1, $$2, $$3, 0.0F).a($$4, $$5, $$6, 128).a($$7, $$8).c(glj.d).b($$9).b($$1, 0.0F, 1.0F, 0.0F).e();
   }

   public ajv a(bqj $$0) {
      return a;
   }
}
