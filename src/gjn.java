public class gjn extends gln<ckz, fur<ckz>> {
   private static final akr a = akr.b("textures/entity/breeze/breeze.png");

   public gjn(gkh.a $$0) {
      super($$0, new fur<>($$0.a(fyh.s)), 0.5F);
      this.a(new gns($$0, this));
      this.a(new gnr(this));
   }

   public void a(ckz $$0, float $$1, float $$2, fbg $$3, gex $$4, int $$5) {
      fur<ckz> $$6 = this.a();
      a($$6, $$6.b(), $$6.d());
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public akr a(ckz $$0) {
      return a;
   }

   public static fur<ckz> a(fur<ckz> $$0, fyi... $$1) {
      $$0.b().k = false;
      $$0.c().k = false;
      $$0.d().k = false;
      $$0.e().k = false;

      for (fyi $$2 : $$1) {
         $$2.k = true;
      }

      return $$0;
   }
}
