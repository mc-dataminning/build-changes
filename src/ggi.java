public class ggi implements gfn<drj> {
   private final gju a;
   private final azg b = azg.a();

   public ggi(gfo.a $$0) {
      this.a = $$0.d();
   }

   public void a(drj $$0, float $$1, ezx $$2, gdn $$3, int $$4, int $$5) {
      if (drj.a.a($$0.c())) {
         dbx $$6 = $$0.i();
         if ($$6 != null) {
            cuo $$7 = $$0.c().a();
            if (!$$7.e()) {
               this.b.b((long)gjs.a($$7));
               drk $$8 = $$0.d();
               a($$1, $$6, $$2, $$3, $$4, $$7, this.a, $$8.b(), $$8.a(), this.b);
            }
         }
      }
   }

   public static void a(float $$0, dbx $$1, ezx $$2, gdn $$3, int $$4, cuo $$5, gju $$6, float $$7, float $$8, azg $$9) {
      $$2.a();
      $$2.a(0.5F, 0.4F, 0.5F);
      $$2.a(a.d.rotationDegrees(ayy.j($$0, $$7, $$8)));
      gjs.a($$6, $$2, $$3, $$4, $$5, $$9, $$1);
      $$2.b();
   }
}
