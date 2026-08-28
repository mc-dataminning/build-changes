public class gnc<T extends btp, M extends fua<T> & fsz> extends gnj<T, M> {
   private final gdk a;

   public gnc(gkt<T, M> $$0, gdk $$1) {
      super($$0);
      this.a = $$1;
   }

   public void a(ezy $$0, gdo $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      boolean $$10 = $$3.fu() == btj.b;
      cup $$11 = $$10 ? $$3.eY() : $$3.eX();
      cup $$12 = $$10 ? $$3.eX() : $$3.eY();
      if (!$$11.e() || !$$12.e()) {
         $$0.a();
         if (this.c().e) {
            float $$13 = 0.5F;
            $$0.a(0.0F, 0.75F, 0.0F);
            $$0.b(0.5F, 0.5F, 0.5F);
         }

         this.a($$3, $$12, cum.c, btj.b, $$0, $$1, $$2);
         this.a($$3, $$11, cum.b, btj.a, $$0, $$1, $$2);
         $$0.b();
      }
   }

   protected void a(btp $$0, cup $$1, cum $$2, btj $$3, ezy $$4, gdo $$5, int $$6) {
      if (!$$1.e()) {
         $$4.a();
         this.c().a($$3, $$4);
         $$4.a(a.b.rotationDegrees(-90.0F));
         $$4.a(a.d.rotationDegrees(180.0F));
         boolean $$7 = $$3 == btj.a;
         $$4.a((float)($$7 ? -1 : 1) / 16.0F, 0.125F, -0.625F);
         this.a.a($$0, $$1, $$2, $$7, $$4, $$5, $$6);
         $$4.b();
      }
   }
}
