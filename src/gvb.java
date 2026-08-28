public class gvb extends gwa<gxg, gat> {
   private static final alp a = alp.b("textures/entity/cat/cat_collar.png");
   private final gat b;
   private final gat c;

   public gvb(gti<gxg, gat> $$0, gef $$1) {
      super($$0);
      this.b = new gat($$1.a(gei.R));
      this.c = new gat($$1.a(gei.Q));
   }

   public void a(fgl $$0, glg $$1, int $$2, gxg $$3, float $$4, float $$5) {
      cwd $$6 = $$3.c;
      if ($$6 != null) {
         int $$7 = $$6.d();
         gat $$8 = $$3.ae ? this.c : this.b;
         a($$8, a, $$0, $$1, $$2, $$3, $$7);
      }
   }
}
