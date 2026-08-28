public class gnb<T extends bto, M extends ftz<T> & fsy> extends gni<T, M> {
   private final gdj a;

   public gnb(gks<T, M> $$0, gdj $$1) {
      super($$0);
      this.a = $$1;
   }

   public void a(ezx $$0, gdn $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      boolean $$10 = $$3.fu() == bti.b;
      cuo $$11 = $$10 ? $$3.eY() : $$3.eX();
      cuo $$12 = $$10 ? $$3.eX() : $$3.eY();
      if (!$$11.e() || !$$12.e()) {
         $$0.a();
         if (this.c().e) {
            float $$13 = 0.5F;
            $$0.a(0.0F, 0.75F, 0.0F);
            $$0.b(0.5F, 0.5F, 0.5F);
         }

         this.a($$3, $$12, cul.c, bti.b, $$0, $$1, $$2);
         this.a($$3, $$11, cul.b, bti.a, $$0, $$1, $$2);
         $$0.b();
      }
   }

   protected void a(bto $$0, cuo $$1, cul $$2, bti $$3, ezx $$4, gdn $$5, int $$6) {
      if (!$$1.e()) {
         $$4.a();
         this.c().a($$3, $$4);
         $$4.a(a.b.rotationDegrees(-90.0F));
         $$4.a(a.d.rotationDegrees(180.0F));
         boolean $$7 = $$3 == bti.a;
         $$4.a((float)($$7 ? -1 : 1) / 16.0F, 0.125F, -0.625F);
         this.a.a($$0, $$1, $$2, $$7, $$4, $$5, $$6);
         $$4.b();
      }
   }
}
