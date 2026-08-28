public class gvl extends gwe<haj, gbg> {
   private static final alz a = alz.b("textures/entity/zombie/drowned_outer_layer.png");
   private final gbg b;
   private final gbg c;

   public gvl(gtm<haj, gbg> $$0, gej $$1) {
      super($$0);
      this.b = new gbg($$1.a(gem.aA));
      this.c = new gbg($$1.a(gem.ax));
   }

   public void a(fgr $$0, glk $$1, int $$2, haj $$3, float $$4, float $$5) {
      gbg $$6 = $$3.ae ? this.c : this.b;
      a($$6, a, $$0, $$1, $$2, $$3, -1);
   }
}
