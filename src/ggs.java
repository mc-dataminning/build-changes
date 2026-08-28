public class ggs implements gfx<drp> {
   private final gke a;
   private final aym b = aym.a();

   public ggs(gfy.a $$0) {
      this.a = $$0.d();
   }

   public void a(drp $$0, float $$1, fag $$2, gdx $$3, int $$4, int $$5) {
      if (drp.a.a($$0.c())) {
         dcd $$6 = $$0.i();
         if ($$6 != null) {
            cua $$7 = $$0.c().a();
            if (!$$7.e()) {
               this.b.b((long)gkc.a($$7));
               drq $$8 = $$0.d();
               a($$1, $$6, $$2, $$3, $$4, $$7, this.a, $$8.b(), $$8.a(), this.b);
            }
         }
      }
   }

   public static void a(float $$0, dcd $$1, fag $$2, gdx $$3, int $$4, cua $$5, gke $$6, float $$7, float $$8, aym $$9) {
      $$2.a();
      $$2.a(0.5F, 0.4F, 0.5F);
      $$2.a(a.d.rotationDegrees(aye.j($$0, $$7, $$8)));
      gkc.a($$6, $$2, $$3, $$4, $$5, $$9, $$1);
      $$2.b();
   }
}
