public class gne<T extends btr, M extends fuc<T> & ftb> extends gnl<T, M> {
   private final gdm a;

   public gne(gkv<T, M> $$0, gdm $$1) {
      super($$0);
      this.a = $$1;
   }

   public void a(faa $$0, gdq $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      boolean $$10 = $$3.fu() == btl.b;
      cur $$11 = $$10 ? $$3.eY() : $$3.eX();
      cur $$12 = $$10 ? $$3.eX() : $$3.eY();
      if (!$$11.e() || !$$12.e()) {
         $$0.a();
         if (this.c().e) {
            float $$13 = 0.5F;
            $$0.a(0.0F, 0.75F, 0.0F);
            $$0.b(0.5F, 0.5F, 0.5F);
         }

         this.a($$3, $$12, cuo.c, btl.b, $$0, $$1, $$2);
         this.a($$3, $$11, cuo.b, btl.a, $$0, $$1, $$2);
         $$0.b();
      }
   }

   protected void a(btr $$0, cur $$1, cuo $$2, btl $$3, faa $$4, gdq $$5, int $$6) {
      if (!$$1.e()) {
         $$4.a();
         this.c().a($$3, $$4);
         $$4.a(a.b.rotationDegrees(-90.0F));
         $$4.a(a.d.rotationDegrees(180.0F));
         boolean $$7 = $$3 == btl.a;
         $$4.a((float)($$7 ? -1 : 1) / 16.0F, 0.125F, -0.625F);
         this.a.a($$0, $$1, $$2, $$7, $$4, $$5, $$6);
         $$4.b();
      }
   }
}
