public class gtg extends gty<gyd, fze> {
   private static final alj a = alj.b("textures/entity/zombie/drowned_outer_layer.png");
   private final fze b;
   private final fze c;

   public gtg(grh<gyd, fze> $$0, gch $$1) {
      super($$0);
      this.b = new fze($$1.a(gck.az));
      this.c = new fze($$1.a(gck.aw));
   }

   public void a(fer $$0, gjg $$1, int $$2, gyd $$3, float $$4, float $$5) {
      fze $$6 = $$3.ae ? this.c : this.b;
      a($$6, a, $$0, $$1, $$2, $$3, -1);
   }
}
