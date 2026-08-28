public class gpe implements goj<dwe> {
   private final hbl a;
   private final azh b = azh.a();
   private final gze c = new gze();

   public gpe(gok.a $$0) {
      this.a = $$0.d();
   }

   public void a(dwe $$0, float $$1, fft $$2, glx $$3, int $$4, int $$5) {
      if (dwe.a.a($$0.c())) {
         dgh $$6 = $$0.i();
         if ($$6 != null) {
            cwo $$7 = $$0.c().a();
            if (!$$7.f()) {
               this.a.a(this.c.a, $$7, cwm.h, false, $$6, null, 0);
               this.c.b = gze.a($$7.M());
               this.c.c = gze.a($$7);
               dwf $$8 = $$0.d();
               $$2.a();
               $$2.a(0.5F, 0.4F, 0.5F);
               $$2.a(a.d.rotationDegrees(ayz.i($$1, $$8.b(), $$8.a())));
               gsz.a($$2, $$3, $$4, this.c, this.b);
               $$2.b();
            }
         }
      }
   }
}
