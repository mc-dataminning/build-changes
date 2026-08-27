public class fxi<T extends bjg, M extends ffd<T> & fee> extends fxp<T, M> {
   private final foa a;

   public fxi(fvc<T, M> $$0, foa $$1) {
      super($$0);
      this.a = $$1;
   }

   public void a(elp $$0, foe $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      boolean $$10 = $$3.fl() == bja.b;
      cjf $$11 = $$10 ? $$3.eT() : $$3.eS();
      cjf $$12 = $$10 ? $$3.eS() : $$3.eT();
      if (!$$11.b() || !$$12.b()) {
         $$0.a();
         if (this.c().e) {
            float $$13 = 0.5F;
            $$0.a(0.0F, 0.75F, 0.0F);
            $$0.b(0.5F, 0.5F, 0.5F);
         }

         this.a($$3, $$12, cjc.c, bja.b, $$0, $$1, $$2);
         this.a($$3, $$11, cjc.b, bja.a, $$0, $$1, $$2);
         $$0.b();
      }
   }

   protected void a(bjg $$0, cjf $$1, cjc $$2, bja $$3, elp $$4, foe $$5, int $$6) {
      if (!$$1.b()) {
         $$4.a();
         this.c().a($$3, $$4);
         $$4.a(a.b.rotationDegrees(-90.0F));
         $$4.a(a.d.rotationDegrees(180.0F));
         boolean $$7 = $$3 == bja.a;
         $$4.a((float)($$7 ? -1 : 1) / 16.0F, 0.125F, -0.625F);
         this.a.a($$0, $$1, $$2, $$7, $$4, $$5, $$6);
         $$4.b();
      }
   }
}
