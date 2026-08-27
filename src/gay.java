public abstract class gay<T extends cig> extends gbx<T> {
   public gay(gby.a $$0) {
      super($$0);
   }

   public void a(T $$0, float $$1, float $$2, etd $$3, fwq $$4, int $$5) {
      $$3.a();
      $$3.a(a.d.rotationDegrees(awm.i($$2, $$0.M, $$0.dz()) - 90.0F));
      $$3.a(a.f.rotationDegrees(awm.i($$2, $$0.N, $$0.dB())));
      int $$6 = 0;
      float $$7 = 0.0F;
      float $$8 = 0.5F;
      float $$9 = 0.0F;
      float $$10 = 0.15625F;
      float $$11 = 0.0F;
      float $$12 = 0.15625F;
      float $$13 = 0.15625F;
      float $$14 = 0.3125F;
      float $$15 = 0.05625F;
      float $$16 = (float)$$0.e - $$2;
      if ($$16 > 0.0F) {
         float $$17 = -awm.a($$16 * 3.0F) * $$16;
         $$3.a(a.f.rotationDegrees($$17));
      }

      $$3.a(a.b.rotationDegrees(45.0F));
      $$3.b(0.05625F, 0.05625F, 0.05625F);
      $$3.a(-4.0F, 0.0F, 0.0F);
      eth $$18 = $$4.getBuffer(fwy.d(this.a($$0)));
      etd.a $$19 = $$3.c();
      this.a($$19, $$18, -7, -2, -2, 0.0F, 0.15625F, -1, 0, 0, $$5);
      this.a($$19, $$18, -7, -2, 2, 0.15625F, 0.15625F, -1, 0, 0, $$5);
      this.a($$19, $$18, -7, 2, 2, 0.15625F, 0.3125F, -1, 0, 0, $$5);
      this.a($$19, $$18, -7, 2, -2, 0.0F, 0.3125F, -1, 0, 0, $$5);
      this.a($$19, $$18, -7, 2, -2, 0.0F, 0.15625F, 1, 0, 0, $$5);
      this.a($$19, $$18, -7, 2, 2, 0.15625F, 0.15625F, 1, 0, 0, $$5);
      this.a($$19, $$18, -7, -2, 2, 0.15625F, 0.3125F, 1, 0, 0, $$5);
      this.a($$19, $$18, -7, -2, -2, 0.0F, 0.3125F, 1, 0, 0, $$5);

      for (int $$20 = 0; $$20 < 4; $$20++) {
         $$3.a(a.b.rotationDegrees(90.0F));
         this.a($$19, $$18, -8, -2, 0, 0.0F, 0.0F, 0, 1, 0, $$5);
         this.a($$19, $$18, 8, -2, 0, 0.5F, 0.0F, 0, 1, 0, $$5);
         this.a($$19, $$18, 8, 2, 0, 0.5F, 0.15625F, 0, 1, 0, $$5);
         this.a($$19, $$18, -8, 2, 0, 0.0F, 0.15625F, 0, 1, 0, $$5);
      }

      $$3.b();
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public void a(etd.a $$0, eth $$1, int $$2, int $$3, int $$4, float $$5, float $$6, int $$7, int $$8, int $$9, int $$10) {
      $$1.a($$0, (float)$$2, (float)$$3, (float)$$4).a(255, 255, 255, 255).a($$5, $$6).c(ghq.d).b($$10).b($$0, (float)$$7, (float)$$9, (float)$$8).e();
   }
}
