public class gzp extends han<hbu, gfa> {
   private static final alg a = alg.b("textures/entity/cat/cat_collar.png");
   private final gfa b;
   private final gfa c;

   public gzp(gxw<hbu, gfa> $$0, giq $$1) {
      super($$0);
      this.b = new gfa($$1.a(git.T));
      this.c = new gfa($$1.a(git.S));
   }

   public void a(fjc $$0, gps $$1, int $$2, hbu $$3, float $$4, float $$5) {
      cxw $$6 = $$3.c;
      if ($$6 != null) {
         int $$7 = $$6.d();
         gfa $$8 = $$3.aj ? this.c : this.b;
         a($$8, a, $$0, $$1, $$2, $$3, $$7);
      }
   }
}
