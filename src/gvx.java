public class gvx extends gwq<hay, gbt> {
   private static final aku a = aku.b("textures/entity/zombie/drowned_outer_layer.png");
   private final gbt b;
   private final gbt c;

   public gvx(gty<hay, gbt> $$0, gew $$1) {
      super($$0);
      this.b = new gbt($$1.a(gez.aD));
      this.c = new gbt($$1.a(gez.aA));
   }

   public void a(ffs $$0, glv $$1, int $$2, hay $$3, float $$4, float $$5) {
      gbt $$6 = $$3.aj ? this.c : this.b;
      a($$6, a, $$0, $$1, $$2, $$3, -1);
   }
}
