public class gej implements gdo<dpp> {
   private final ghv a;
   private final ayg b = ayg.a();

   public gej(gdp.a $$0) {
      this.a = $$0.d();
   }

   public void a(dpp $$0, float $$1, exx $$2, gbo $$3, int $$4, int $$5) {
      if (dpp.a.a($$0.c())) {
         dad $$6 = $$0.i();
         if ($$6 != null) {
            csz $$7 = $$0.c().a();
            if (!$$7.d()) {
               this.b.b((long)ght.a($$7));
               dpq $$8 = $$0.d();
               a($$1, $$6, $$2, $$3, $$4, $$7, this.a, $$8.b(), $$8.a(), this.b);
            }
         }
      }
   }

   public static void a(float $$0, dad $$1, exx $$2, gbo $$3, int $$4, csz $$5, ghv $$6, float $$7, float $$8, ayg $$9) {
      $$2.a();
      $$2.a(0.5F, 0.4F, 0.5F);
      $$2.a(a.d.rotationDegrees(axz.j($$0, $$7, $$8)));
      ght.a($$6, $$2, $$3, $$4, $$5, $$9, $$1);
      $$2.b();
   }
}
