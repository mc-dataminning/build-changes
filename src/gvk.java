public class gvk extends gwd<hai, gbf> {
   private static final alz a = alz.b("textures/entity/zombie/drowned_outer_layer.png");
   private final gbf b;
   private final gbf c;

   public gvk(gtl<hai, gbf> $$0, gei $$1) {
      super($$0);
      this.b = new gbf($$1.a(gel.aA));
      this.c = new gbf($$1.a(gel.ax));
   }

   public void a(fgq $$0, glj $$1, int $$2, hai $$3, float $$4, float $$5) {
      gbf $$6 = $$3.ae ? this.c : this.b;
      a($$6, a, $$0, $$1, $$2, $$3, -1);
   }
}
