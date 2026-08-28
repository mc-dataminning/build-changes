public abstract class gpc<T extends btn, M extends fwn<T>> extends got<T, M> {
   public gpc(gli<T, M> $$0) {
      super($$0);
   }

   protected abstract int a(T var1);

   protected abstract void a(fbg var1, gex var2, int var3, bsr var4, float var5, float var6, float var7, float var8);

   public void a(fbg $$0, gex $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      int $$10 = this.a($$3);
      ayw $$11 = ayw.a((long)$$3.an());
      if ($$10 > 0) {
         for (int $$12 = 0; $$12 < $$10; $$12++) {
            $$0.a();
            fyi $$13 = this.c().a($$11);
            fyi.a $$14 = $$13.a($$11);
            $$13.a($$0);
            float $$15 = $$11.i();
            float $$16 = $$11.i();
            float $$17 = $$11.i();
            float $$18 = ayo.i($$15, $$14.a, $$14.d) / 16.0F;
            float $$19 = ayo.i($$16, $$14.b, $$14.e) / 16.0F;
            float $$20 = ayo.i($$17, $$14.c, $$14.f) / 16.0F;
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
