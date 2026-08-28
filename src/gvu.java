public class gvu extends gwt<gya, gbn> {
   private static final akv a = akv.b("textures/entity/cat/cat_collar.png");
   private final gbn b;
   private final gbn c;

   public gvu(gub<gya, gbn> $$0, gez $$1) {
      super($$0);
      this.b = new gbn($$1.a(gfc.R));
      this.c = new gbn($$1.a(gfc.Q));
   }

   public void a(ffu $$0, gly $$1, int $$2, gya $$3, float $$4, float $$5) {
      cvm $$6 = $$3.c;
      if ($$6 != null) {
         int $$7 = $$6.d();
         gbn $$8 = $$3.aj ? this.c : this.b;
         a($$8, a, $$0, $$1, $$2, $$3, $$7);
      }
   }
}
