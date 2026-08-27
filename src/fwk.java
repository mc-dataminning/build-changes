public class fwk<T extends biw, M extends fek<T> & fdl> extends fwr<T, M> {
   private final fnc a;

   public fwk(fue<T, M> $$0, fnc $$1) {
      super($$0);
      this.a = $$1;
   }

   public void a(elh $$0, fng $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      boolean $$10 = $$3.fk() == biq.b;
      ciw $$11 = $$10 ? $$3.eS() : $$3.eR();
      ciw $$12 = $$10 ? $$3.eR() : $$3.eS();
      if (!$$11.b() || !$$12.b()) {
         $$0.a();
         if (this.c().e) {
            float $$13 = 0.5F;
            $$0.a(0.0F, 0.75F, 0.0F);
            $$0.b(0.5F, 0.5F, 0.5F);
         }

         this.a($$3, $$12, cit.c, biq.b, $$0, $$1, $$2);
         this.a($$3, $$11, cit.b, biq.a, $$0, $$1, $$2);
         $$0.b();
      }
   }

   protected void a(biw $$0, ciw $$1, cit $$2, biq $$3, elh $$4, fng $$5, int $$6) {
      if (!$$1.b()) {
         $$4.a();
         this.c().a($$3, $$4);
         $$4.a(a.b.rotationDegrees(-90.0F));
         $$4.a(a.d.rotationDegrees(180.0F));
         boolean $$7 = $$3 == biq.a;
         $$4.a((float)($$7 ? -1 : 1) / 16.0F, 0.125F, -0.625F);
         this.a.a($$0, $$1, $$2, $$7, $$4, $$5, $$6);
         $$4.b();
      }
   }
}
