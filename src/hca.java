public class hca extends hcy<heg, ghl> {
   private static final alk a = alk.b("textures/entity/cat/cat_collar.png");
   private final ghl b;
   private final ghl c;

   public hca(hah<heg, ghl> $$0, glc $$1) {
      super($$0);
      this.b = new ghl($$1.a(glf.T));
      this.c = new ghl($$1.a(glf.S));
   }

   public void a(flq $$0, gsc $$1, int $$2, heg $$3, float $$4, float $$5) {
      cyy $$6 = $$3.c;
      if ($$6 != null) {
         int $$7 = $$6.d();
         ghl $$8 = $$3.aj ? this.c : this.b;
         a($$8, a, $$0, $$1, $$2, $$3, $$7);
      }
   }
}
