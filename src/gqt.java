public class gqt extends grf<gtj, fxl> {
   private final fxl a;
   private final fxl b;

   public gqt(goo<gtj, fxl> $$0, fzx $$1) {
      super($$0);
      this.a = new fxl($$1.a(gaa.aR));
      this.b = new fxl($$1.a(gaa.aS));
   }

   public void a(fcu $$0, ggv $$1, int $$2, gtj $$3, float $$4, float $$5) {
      cvl $$6 = $$3.i;
      if ($$6.h() instanceof ctb $$7 && $$7.d() == ctb.a.a) {
         fxl $$9 = $$3.ae ? this.b : this.a;
         $$9.a($$3);
         int $$10;
         if ($$6.a(axb.bD)) {
            $$10 = axn.f(cyd.a($$6, -6265536));
         } else {
            $$10 = -1;
         }

         fcy $$12 = $$1.getBuffer(ghe.f($$7.b()));
         $$9.a($$0, $$12, $$2, gwb.d, $$10);
         return;
      }
   }
}
