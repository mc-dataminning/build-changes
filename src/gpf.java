public class gpf implements gok<dwf> {
   private final hbm a;
   private final azh b = azh.a();
   private final gzf c = new gzf();

   public gpf(gol.a $$0) {
      this.a = $$0.d();
   }

   public void a(dwf $$0, float $$1, ffu $$2, gly $$3, int $$4, int $$5) {
      if (dwf.a.a($$0.c())) {
         dgi $$6 = $$0.i();
         if ($$6 != null) {
            cwp $$7 = $$0.c().a();
            if (!$$7.f()) {
               this.a.a(this.c.a, $$7, cwn.h, false, $$6, null, 0);
               this.c.b = gzf.a($$7.M());
               this.c.c = gzf.a($$7);
               dwg $$8 = $$0.d();
               $$2.a();
               $$2.a(0.5F, 0.4F, 0.5F);
               $$2.a(a.d.rotationDegrees(ayz.i($$1, $$8.b(), $$8.a())));
               gta.a($$2, $$3, $$4, this.c, this.b);
               $$2.b();
            }
         }
      }
   }
}
