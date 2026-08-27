public class gly<T extends bso, M extends fsw<T> & frv> extends gmf<T, M> {
   private final gcg a;

   public gly(gjp<T, M> $$0, gcg $$1) {
      super($$0);
      this.a = $$1;
   }

   public void a(eys $$0, gck $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      boolean $$10 = $$3.fu() == bsi.b;
      cto $$11 = $$10 ? $$3.eY() : $$3.eX();
      cto $$12 = $$10 ? $$3.eX() : $$3.eY();
      if (!$$11.e() || !$$12.e()) {
         $$0.a();
         if (this.c().e) {
            float $$13 = 0.5F;
            $$0.a(0.0F, 0.75F, 0.0F);
            $$0.b(0.5F, 0.5F, 0.5F);
         }

         this.a($$3, $$12, ctl.c, bsi.b, $$0, $$1, $$2);
         this.a($$3, $$11, ctl.b, bsi.a, $$0, $$1, $$2);
         $$0.b();
      }
   }

   protected void a(bso $$0, cto $$1, ctl $$2, bsi $$3, eys $$4, gck $$5, int $$6) {
      if (!$$1.e()) {
         $$4.a();
         this.c().a($$3, $$4);
         $$4.a(a.b.rotationDegrees(-90.0F));
         $$4.a(a.d.rotationDegrees(180.0F));
         boolean $$7 = $$3 == bsi.a;
         $$4.a((float)($$7 ? -1 : 1) / 16.0F, 0.125F, -0.625F);
         this.a.a($$0, $$1, $$2, $$7, $$4, $$5, $$6);
         $$4.b();
      }
   }
}
