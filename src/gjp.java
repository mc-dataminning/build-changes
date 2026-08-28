public class gjp extends glp<ckz, fut<ckz>> {
   private static final akr a = akr.b("textures/entity/breeze/breeze.png");

   public gjp(gkj.a $$0) {
      super($$0, new fut<>($$0.a(fyj.s)), 0.5F);
      this.a(new gnu($$0, this));
      this.a(new gnt(this));
   }

   public void a(ckz $$0, float $$1, float $$2, fbi $$3, gez $$4, int $$5) {
      fut<ckz> $$6 = this.a();
      a($$6, $$6.b(), $$6.d());
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public akr a(ckz $$0) {
      return a;
   }

   public static fut<ckz> a(fut<ckz> $$0, fyk... $$1) {
      $$0.b().k = false;
      $$0.c().k = false;
      $$0.d().k = false;
      $$0.e().k = false;

      for (fyk $$2 : $$1) {
         $$2.k = true;
      }

      return $$0;
   }
}
