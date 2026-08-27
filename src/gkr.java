public class gkr<T extends bre, M extends frr<T> & fqq> extends gky<T, M> {
   private final gba a;

   public gkr(gii<T, M> $$0, gba $$1) {
      super($$0);
      this.a = $$1;
   }

   public void a(exn $$0, gbe $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      boolean $$10 = $$3.fs() == bqy.b;
      csd $$11 = $$10 ? $$3.eW() : $$3.eV();
      csd $$12 = $$10 ? $$3.eV() : $$3.eW();
      if (!$$11.d() || !$$12.d()) {
         $$0.a();
         if (this.c().e) {
            float $$13 = 0.5F;
            $$0.a(0.0F, 0.75F, 0.0F);
            $$0.b(0.5F, 0.5F, 0.5F);
         }

         this.a($$3, $$12, csa.c, bqy.b, $$0, $$1, $$2);
         this.a($$3, $$11, csa.b, bqy.a, $$0, $$1, $$2);
         $$0.b();
      }
   }

   protected void a(bre $$0, csd $$1, csa $$2, bqy $$3, exn $$4, gbe $$5, int $$6) {
      if (!$$1.d()) {
         $$4.a();
         this.c().a($$3, $$4);
         $$4.a(a.b.rotationDegrees(-90.0F));
         $$4.a(a.d.rotationDegrees(180.0F));
         boolean $$7 = $$3 == bqy.a;
         $$4.a((float)($$7 ? -1 : 1) / 16.0F, 0.125F, -0.625F);
         this.a.a($$0, $$1, $$2, $$7, $$4, $$5, $$6);
         $$4.b();
      }
   }
}
