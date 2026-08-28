public class gvf extends gvy<had, gba> {
   private static final alz a = alz.b("textures/entity/zombie/drowned_outer_layer.png");
   private final gba b;
   private final gba c;

   public gvf(gtg<had, gba> $$0, ged $$1) {
      super($$0);
      this.b = new gba($$1.a(geg.aA));
      this.c = new gba($$1.a(geg.ax));
   }

   public void a(fgl $$0, gle $$1, int $$2, had $$3, float $$4, float $$5) {
      gba $$6 = $$3.ae ? this.c : this.b;
      a($$6, a, $$0, $$1, $$2, $$3, -1);
   }
}
