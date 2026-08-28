public class gqn extends gqb<cmc, gxb> {
   private static final alz a = alz.b("textures/entity/skeleton/bogged.png");
   private static final alz b = alz.b("textures/entity/skeleton/bogged_overlay.png");

   public gqn(grj.a $$0) {
      super($$0, geg.D, geg.E, new gan($$0.a(geg.C)));
      this.a(new gwb<>(this, $$0.f(), geg.F, b));
   }

   public alz a(gxb $$0) {
      return a;
   }

   public gxb a() {
      return new gxb();
   }

   public void a(cmc $$0, gxb $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.gp();
   }
}
