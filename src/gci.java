public abstract class gci<T extends blv, M extends fkd<T>> extends gbz<T, M> {
   public gci(fyp<T, M> $$0) {
      super($$0);
   }

   protected abstract int a(T var1);

   protected abstract void a(epd var1, fsi var2, int var3, blf var4, float var5, float var6, float var7, float var8);

   public void a(epd $$0, fsi $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      int $$10 = this.a($$3);
      auf $$11 = auf.a((long)$$3.aj());
      if ($$10 > 0) {
         for (int $$12 = 0; $$12 < $$10; $$12++) {
            $$0.a();
            fly $$13 = this.c().a($$11);
            fly.a $$14 = $$13.a($$11);
            $$13.a($$0);
            float $$15 = $$11.i();
            float $$16 = $$11.i();
            float $$17 = $$11.i();
            float $$18 = aty.i($$15, $$14.a, $$14.d) / 16.0F;
            float $$19 = aty.i($$16, $$14.b, $$14.e) / 16.0F;
            float $$20 = aty.i($$17, $$14.c, $$14.f) / 16.0F;
            $$0.a($$18, $$19, $$20);
            $$15 = -1.0F * ($$15 * 2.0F - 1.0F);
            $$16 = -1.0F * ($$16 * 2.0F - 1.0F);
            $$17 = -1.0F * ($$17 * 2.0F - 1.0F);
            this.a($$0, $$1, $$2, $$3, $$15, $$16, $$17, $$6);
            $$0.b();
         }
      }
   }
}
