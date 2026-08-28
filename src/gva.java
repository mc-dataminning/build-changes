public class gva extends gti<cop, hat, gem> {
   private static final aku a = aku.b("textures/entity/wandering_trader.png");

   public gva(gsc.a $$0) {
      super($$0, new gem($$0.a(gfb.dw)), 0.5F);
      this.a(new gvv<>(this, $$0.f()));
      this.a(new gvu<>(this));
   }

   public aku a(hat $$0) {
      return a;
   }

   public hat b() {
      return new hat();
   }

   public void a(cop $$0, hat $$1, float $$2) {
      super.a($$0, $$1, $$2);
      gyx.a($$0, $$1, this.i);
      $$1.a = $$0.p() > 0;
   }
}
