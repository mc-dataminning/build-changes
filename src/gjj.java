public class gjj extends glj<ckx, fun<ckx>> {
   private static final akq a = akq.b("textures/entity/breeze/breeze.png");

   public gjj(gkd.a $$0) {
      super($$0, new fun<>($$0.a(fyd.s)), 0.5F);
      this.a(new gno($$0, this));
      this.a(new gnn(this));
   }

   public void a(ckx $$0, float $$1, float $$2, fbc $$3, get $$4, int $$5) {
      fun<ckx> $$6 = this.a();
      a($$6, $$6.b(), $$6.d());
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public akq a(ckx $$0) {
      return a;
   }

   public static fun<ckx> a(fun<ckx> $$0, fye... $$1) {
      $$0.b().k = false;
      $$0.c().k = false;
      $$0.d().k = false;
      $$0.e().k = false;

      for (fye $$2 : $$1) {
         $$2.k = true;
      }

      return $$0;
   }
}
