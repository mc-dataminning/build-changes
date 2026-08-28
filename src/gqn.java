public class gqn extends grf<gvj, fwv> {
   private static final alb a = alb.b("textures/entity/zombie/drowned_outer_layer.png");
   private final fwv b;
   private final fwv c;

   public gqn(goo<gvj, fwv> $$0, fzx $$1) {
      super($$0);
      this.b = new fwv($$1.a(gaa.al));
      this.c = new fwv($$1.a(gaa.ap));
   }

   public void a(fcu $$0, ggv $$1, int $$2, gvj $$3, float $$4, float $$5) {
      fwv $$6 = $$3.ae ? this.c : this.b;
      a($$6, a, $$0, $$1, $$2, $$3, -1);
   }
}
