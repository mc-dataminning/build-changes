public class gic extends gkc<cky, fti<cky>> {
   private static final ale a = new ale("textures/entity/breeze/breeze.png");

   public gic(giw.a $$0) {
      super($$0, new fti<>($$0.a(fwy.s)), 0.5F);
      this.a(new gmh(this));
      this.a(new gmg(this));
   }

   public void a(cky $$0, float $$1, float $$2, ezx $$3, gdn $$4, int $$5) {
      fti<cky> $$6 = this.a();
      a($$6, $$6.b(), $$6.d());
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public ale a(cky $$0) {
      return a;
   }

   public static fti<cky> a(fti<cky> $$0, fwz... $$1) {
      $$0.b().k = false;
      $$0.c().k = false;
      $$0.d().k = false;
      $$0.e().k = false;

      for (fwz $$2 : $$1) {
         $$2.k = true;
      }

      return $$0;
   }
}
