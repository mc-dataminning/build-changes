public class gzx extends hav<hcc, gfh> {
   private static final alg a = alg.b("textures/entity/cat/cat_collar.png");
   private final gfh b;
   private final gfh c;

   public gzx(gye<hcc, gfh> $$0, giy $$1) {
      super($$0);
      this.b = new gfh($$1.a(gjb.T));
      this.c = new gfh($$1.a(gjb.S));
   }

   public void a(fjj $$0, gqa $$1, int $$2, hcc $$3, float $$4, float $$5) {
      cyb $$6 = $$3.c;
      if ($$6 != null) {
         int $$7 = $$6.d();
         gfh $$8 = $$3.aj ? this.c : this.b;
         a($$8, a, $$0, $$1, $$2, $$3, $$7);
      }
   }
}
