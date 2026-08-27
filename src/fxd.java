public class fxd<T extends bjb, M extends fey<T> & fdz> extends fxk<T, M> {
   private final fnv a;

   public fxd(fux<T, M> $$0, fnv $$1) {
      super($$0);
      this.a = $$1;
   }

   public void a(elk $$0, fnz $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      boolean $$10 = $$3.fk() == biv.b;
      cja $$11 = $$10 ? $$3.eS() : $$3.eR();
      cja $$12 = $$10 ? $$3.eR() : $$3.eS();
      if (!$$11.b() || !$$12.b()) {
         $$0.a();
         if (this.c().e) {
            float $$13 = 0.5F;
            $$0.a(0.0F, 0.75F, 0.0F);
            $$0.b(0.5F, 0.5F, 0.5F);
         }

         this.a($$3, $$12, cix.c, biv.b, $$0, $$1, $$2);
         this.a($$3, $$11, cix.b, biv.a, $$0, $$1, $$2);
         $$0.b();
      }
   }

   protected void a(bjb $$0, cja $$1, cix $$2, biv $$3, elk $$4, fnz $$5, int $$6) {
      if (!$$1.b()) {
         $$4.a();
         this.c().a($$3, $$4);
         $$4.a(a.b.rotationDegrees(-90.0F));
         $$4.a(a.d.rotationDegrees(180.0F));
         boolean $$7 = $$3 == biv.a;
         $$4.a((float)($$7 ? -1 : 1) / 16.0F, 0.125F, -0.625F);
         this.a.a($$0, $$1, $$2, $$7, $$4, $$5, $$6);
         $$4.b();
      }
   }
}
