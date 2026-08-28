public class gqu extends gqi<cmh, gxi> {
   private static final alz a = alz.b("textures/entity/skeleton/bogged.png");
   private static final alz b = alz.b("textures/entity/skeleton/bogged_overlay.png");

   public gqu(grq.a $$0) {
      super($$0, gen.D, gen.E, new gau($$0.a(gen.C)));
      this.a(new gwi<>(this, $$0.f(), gen.F, b));
   }

   public alz a(gxi $$0) {
      return a;
   }

   public gxi a() {
      return new gxi();
   }

   public void a(cmh $$0, gxi $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.gr();
   }
}
