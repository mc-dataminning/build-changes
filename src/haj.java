public class haj extends hbh<hco, gft> {
   private static final alg a = alg.b("textures/entity/cat/cat_collar.png");
   private final gft b;
   private final gft c;

   public haj(gyq<hco, gft> $$0, gjk $$1) {
      super($$0);
      this.b = new gft($$1.a(gjn.T));
      this.c = new gft($$1.a(gjn.S));
   }

   public void a(fjy $$0, gqm $$1, int $$2, hco $$3, float $$4, float $$5) {
      cyi $$6 = $$3.c;
      if ($$6 != null) {
         int $$7 = $$6.d();
         gft $$8 = $$3.aj ? this.c : this.b;
         a($$8, a, $$0, $$1, $$2, $$3, $$7);
      }
   }
}
