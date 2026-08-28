public class gyb extends gyt<hda, gdv> {
   private static final ald a = ald.b("textures/entity/zombie/drowned_outer_layer.png");
   private final gdv b;
   private final gdv c;

   public gyb(gwc<hda, gdv> $$0, ggz $$1) {
      super($$0);
      this.b = new gdv($$1.a(ghc.aJ));
      this.c = new gdv($$1.a(ghc.aG));
   }

   public void a(fho $$0, gny $$1, int $$2, hda $$3, float $$4, float $$5) {
      gdv $$6 = $$3.aj ? this.c : this.b;
      a($$6, a, $$0, $$1, $$2, $$3, -1);
   }
}
