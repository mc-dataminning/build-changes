public class gdf extends gda<bpf> {
   private static final ajh a = new ajh("textures/entity/experience_orb.png");
   private static final fya f = fya.g(a);

   public gdf(gdb.a $$0) {
      super($$0);
      this.d = 0.15F;
      this.e = 0.75F;
   }

   protected int a(bpf $$0, ib $$1) {
      return aww.a(super.a($$0, $$1) + 7, 0, 15);
   }

   public void a(bpf $$0, float $$1, float $$2, eub $$3, fxs $$4, int $$5) {
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
      int $$16 = (int)((aww.a($$15 + 0.0F) + 1.0F) * 0.5F * 255.0F);
      int $$17 = 255;
      int $$18 = (int)((aww.a($$15 + (float) (Math.PI * 4.0 / 3.0)) + 1.0F) * 0.1F * 255.0F);
      $$3.a(0.0F, 0.1F, 0.0F);
      $$3.a(this.c.b());
      $$3.a(a.d.rotationDegrees(180.0F));
      float $$19 = 0.3F;
      $$3.b(0.3F, 0.3F, 0.3F);
      euf $$20 = $$4.getBuffer(f);
      eub.a $$21 = $$3.c();
      a($$20, $$21, -0.5F, -0.25F, $$16, 255, $$18, $$7, $$10, $$5);
      a($$20, $$21, 0.5F, -0.25F, $$16, 255, $$18, $$8, $$10, $$5);
      a($$20, $$21, 0.5F, 0.75F, $$16, 255, $$18, $$8, $$9, $$5);
      a($$20, $$21, -0.5F, 0.75F, $$16, 255, $$18, $$7, $$9, $$5);
      $$3.b();
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   private static void a(euf $$0, eub.a $$1, float $$2, float $$3, int $$4, int $$5, int $$6, float $$7, float $$8, int $$9) {
      $$0.a($$1, $$2, $$3, 0.0F).a($$4, $$5, $$6, 128).a($$7, $$8).c(git.d).b($$9).b($$1, 0.0F, 1.0F, 0.0F).e();
   }

   public ajh a(bpf $$0) {
      return a;
   }
}
