public class gnd<T extends btq, M extends fub<T> & fta> extends gnk<T, M> {
   private final gdl a;

   public gnd(gku<T, M> $$0, gdl $$1) {
      super($$0);
      this.a = $$1;
   }

   public void a(ezz $$0, gdp $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      boolean $$10 = $$3.fu() == btk.b;
      cuq $$11 = $$10 ? $$3.eY() : $$3.eX();
      cuq $$12 = $$10 ? $$3.eX() : $$3.eY();
      if (!$$11.e() || !$$12.e()) {
         $$0.a();
         if (this.c().e) {
            float $$13 = 0.5F;
            $$0.a(0.0F, 0.75F, 0.0F);
            $$0.b(0.5F, 0.5F, 0.5F);
         }

         this.a($$3, $$12, cun.c, btk.b, $$0, $$1, $$2);
         this.a($$3, $$11, cun.b, btk.a, $$0, $$1, $$2);
         $$0.b();
      }
   }

   protected void a(btq $$0, cuq $$1, cun $$2, btk $$3, ezz $$4, gdp $$5, int $$6) {
      if (!$$1.e()) {
         $$4.a();
         this.c().a($$3, $$4);
         $$4.a(a.b.rotationDegrees(-90.0F));
         $$4.a(a.d.rotationDegrees(180.0F));
         boolean $$7 = $$3 == btk.a;
         $$4.a((float)($$7 ? -1 : 1) / 16.0F, 0.125F, -0.625F);
         this.a.a($$0, $$1, $$2, $$7, $$4, $$5, $$6);
         $$4.b();
      }
   }
}
