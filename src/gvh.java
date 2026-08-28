public class gvh extends gwa<haf, gbc> {
   private static final alp a = alp.b("textures/entity/zombie/drowned_outer_layer.png");
   private final gbc b;
   private final gbc c;

   public gvh(gti<haf, gbc> $$0, gef $$1) {
      super($$0);
      this.b = new gbc($$1.a(gei.aD));
      this.c = new gbc($$1.a(gei.aA));
   }

   public void a(fgl $$0, glg $$1, int $$2, haf $$3, float $$4, float $$5) {
      gbc $$6 = $$3.ae ? this.c : this.b;
      a($$6, a, $$0, $$1, $$2, $$3, -1);
   }
}
