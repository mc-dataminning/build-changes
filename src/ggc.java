public class ggc<T extends box, M extends fne<T> & fme> extends ggj<T, M> {
   private final fwm a;

   public ggc(gdt<T, M> $$0, fwm $$1) {
      super($$0);
      this.a = $$1;
   }

   public void a(etd $$0, fwq $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      boolean $$10 = $$3.fo() == bor.b;
      cpq $$11 = $$10 ? $$3.eS() : $$3.eR();
      cpq $$12 = $$10 ? $$3.eR() : $$3.eS();
      if (!$$11.b() || !$$12.b()) {
         $$0.a();
         if (this.c().e) {
            float $$13 = 0.5F;
            $$0.a(0.0F, 0.75F, 0.0F);
            $$0.b(0.5F, 0.5F, 0.5F);
         }

         this.a($$3, $$12, cpn.c, bor.b, $$0, $$1, $$2);
         this.a($$3, $$11, cpn.b, bor.a, $$0, $$1, $$2);
         $$0.b();
      }
   }

   protected void a(box $$0, cpq $$1, cpn $$2, bor $$3, etd $$4, fwq $$5, int $$6) {
      if (!$$1.b()) {
         $$4.a();
         this.c().a($$3, $$4);
         $$4.a(a.b.rotationDegrees(-90.0F));
         $$4.a(a.d.rotationDegrees(180.0F));
         boolean $$7 = $$3 == bor.a;
         $$4.a((float)($$7 ? -1 : 1) / 16.0F, 0.125F, -0.625F);
         this.a.a($$0, $$1, $$2, $$7, $$4, $$5, $$6);
         $$4.b();
      }
   }
}
