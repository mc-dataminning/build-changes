public class hcg extends hcy<hhh, ghx> {
   private static final alk a = alk.b("textures/entity/zombie/drowned_outer_layer.png");
   private final ghx b;
   private final ghx c;

   public hcg(hah<hhh, ghx> $$0, glc $$1) {
      super($$0);
      this.b = new ghx($$1.a(glf.aN));
      this.c = new ghx($$1.a(glf.aK));
   }

   public void a(flq $$0, gsc $$1, int $$2, hhh $$3, float $$4, float $$5) {
      ghx $$6 = $$3.aj ? this.c : this.b;
      a($$6, a, $$0, $$1, $$2, $$3, -1);
   }
}
