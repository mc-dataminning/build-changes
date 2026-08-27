public class gdz implements gde<dpg> {
   private final ghl a;
   private final ayd b = ayd.a();

   public gdz(gdf.a $$0) {
      this.a = $$0.d();
   }

   public void a(dpg $$0, float $$1, exn $$2, gbe $$3, int $$4, int $$5) {
      if (dpg.a.a($$0.c())) {
         czu $$6 = $$0.i();
         if ($$6 != null) {
            csd $$7 = $$0.c().a();
            if (!$$7.d()) {
               this.b.b((long)ghj.a($$7));
               dph $$8 = $$0.d();
               a($$1, $$6, $$2, $$3, $$4, $$7, this.a, $$8.b(), $$8.a(), this.b);
            }
         }
      }
   }

   public static void a(float $$0, czu $$1, exn $$2, gbe $$3, int $$4, csd $$5, ghl $$6, float $$7, float $$8, ayd $$9) {
      $$2.a();
      $$2.a(0.5F, 0.4F, 0.5F);
      $$2.a(a.d.rotationDegrees(axw.j($$0, $$7, $$8)));
      ghj.a($$6, $$2, $$3, $$4, $$5, $$9, $$1);
      $$2.b();
   }
}
