public class gif extends gkf<clb, ftl<clb>> {
   private static final alf a = new alf("textures/entity/breeze/breeze.png");

   public gif(giz.a $$0) {
      super($$0, new ftl<>($$0.a(fxb.s)), 0.5F);
      this.a(new gmk(this));
      this.a(new gmj(this));
   }

   public void a(clb $$0, float $$1, float $$2, faa $$3, gdq $$4, int $$5) {
      ftl<clb> $$6 = this.a();
      a($$6, $$6.b(), $$6.d());
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public alf a(clb $$0) {
      return a;
   }

   public static ftl<clb> a(ftl<clb> $$0, fxc... $$1) {
      $$0.b().k = false;
      $$0.c().k = false;
      $$0.d().k = false;
      $$0.e().k = false;

      for (fxc $$2 : $$1) {
         $$2.k = true;
      }

      return $$0;
   }
}
