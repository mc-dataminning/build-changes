public class goo<T extends btn, M extends fvk<T> & fuj> extends gov<T, M> {
   private final gev a;

   public goo(gmf<T, M> $$0, gev $$1) {
      super($$0);
      this.a = $$1;
   }

   public void a(fbi $$0, gez $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      boolean $$10 = $$3.fq() == btg.b;
      cuq $$11 = $$10 ? $$3.eU() : $$3.eT();
      cuq $$12 = $$10 ? $$3.eT() : $$3.eU();
      if (!$$11.e() || !$$12.e()) {
         $$0.a();
         if (this.c().e) {
            float $$13 = 0.5F;
            $$0.a(0.0F, 0.75F, 0.0F);
            $$0.b(0.5F, 0.5F, 0.5F);
         }

         this.a($$3, $$12, cun.c, btg.b, $$0, $$1, $$2);
         this.a($$3, $$11, cun.b, btg.a, $$0, $$1, $$2);
         $$0.b();
      }
   }

   protected void a(btn $$0, cuq $$1, cun $$2, btg $$3, fbi $$4, gez $$5, int $$6) {
      if (!$$1.e()) {
         $$4.a();
         this.c().a($$3, $$4);
         $$4.a(a.b.rotationDegrees(-90.0F));
         $$4.a(a.d.rotationDegrees(180.0F));
         boolean $$7 = $$3 == btg.a;
         $$4.a((float)($$7 ? -1 : 1) / 16.0F, 0.125F, -0.625F);
         this.a.a($$0, $$1, $$2, $$7, $$4, $$5, $$6);
         $$4.b();
      }
   }
}
