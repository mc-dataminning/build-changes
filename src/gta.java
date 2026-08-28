public class gta implements gse<dzg> {
   private final hfg a;
   private final azv b = azv.a();
   private final hda c = new hda();

   public gta(gsf.a $$0) {
      this.a = $$0.d();
   }

   public void a(dzg $$0, float $$1, fjc $$2, gps $$3, int $$4, int $$5, fei $$6) {
      if (dzg.a.a($$0.c())) {
         div $$7 = $$0.i();
         if ($$7 != null) {
            cyy $$8 = $$0.c().a();
            if (!$$8.f()) {
               this.a.a(this.c.a, $$8, cyw.h, false, $$7, null, 0);
               this.c.b = hda.a($$8.M());
               this.c.c = hda.a($$8);
               dzh $$9 = $$0.d();
               $$2.a();
               $$2.a(0.5F, 0.4F, 0.5F);
               $$2.a(a.d.rotationDegrees(azm.i($$1, $$9.b(), $$9.a())));
               gwv.a($$2, $$3, $$4, this.c, this.b);
               $$2.b();
            }
         }
      }
   }
}
