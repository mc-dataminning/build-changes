public class gqt extends gqh<cmg, gxh> {
   private static final alz a = alz.b("textures/entity/skeleton/bogged.png");
   private static final alz b = alz.b("textures/entity/skeleton/bogged_overlay.png");

   public gqt(grp.a $$0) {
      super($$0, gem.D, gem.E, new gat($$0.a(gem.C)));
      this.a(new gwh<>(this, $$0.f(), gem.F, b));
   }

   public alz a(gxh $$0) {
      return a;
   }

   public gxh a() {
      return new gxh();
   }

   public void a(cmg $$0, gxh $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.gr();
   }
}
