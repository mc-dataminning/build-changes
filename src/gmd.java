public class gmd implements gli<duw> {
   private final gpy a;
   private final azv b = azv.a();

   public gmd(glj.a $$0) {
      this.a = $$0.d();
   }

   public void a(duw $$0, float $$1, fek $$2, gix $$3, int $$4, int $$5) {
      if (duw.a.a($$0.c())) {
         dff $$6 = $$0.i();
         if ($$6 != null) {
            cwf $$7 = $$0.c().a();
            if (!$$7.f()) {
               this.b.b((long)gpw.a($$7));
               dux $$8 = $$0.d();
               a($$1, $$6, $$2, $$3, $$4, $$7, this.a, $$8.b(), $$8.a(), this.b);
            }
         }
      }
   }

   public static void a(float $$0, dff $$1, fek $$2, gix $$3, int $$4, cwf $$5, gpy $$6, float $$7, float $$8, azv $$9) {
      $$2.a();
      $$2.a(0.5F, 0.4F, 0.5F);
      $$2.a(a.d.rotationDegrees(azn.i($$0, $$7, $$8)));
      gpw.a($$6, $$2, $$3, $$4, $$5, $$9, $$1);
      $$2.b();
   }
}
