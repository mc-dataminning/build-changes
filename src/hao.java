public class hao extends hbm<hcu, gfy> {
   private static final alg a = alg.b("textures/entity/cat/cat_collar.png");
   private final gfy b;
   private final gfy c;

   public hao(gyv<hcu, gfy> $$0, gjp $$1) {
      super($$0);
      this.b = new gfy($$1.a(gjs.T));
      this.c = new gfy($$1.a(gjs.S));
   }

   public void a(fkd $$0, gqr $$1, int $$2, hcu $$3, float $$4, float $$5) {
      cyl $$6 = $$3.c;
      if ($$6 != null) {
         int $$7 = $$6.d();
         gfy $$8 = $$3.aj ? this.c : this.b;
         a($$8, a, $$0, $$1, $$2, $$3, $$7);
      }
   }
}
