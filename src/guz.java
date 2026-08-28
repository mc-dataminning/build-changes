public class guz extends gth<com, has, gek> {
   private static final aku a = aku.b("textures/entity/wandering_trader.png");

   public guz(gsb.a $$0) {
      super($$0, new gek($$0.a(gez.dw)), 0.5F);
      this.a(new gvu<>(this, $$0.f()));
      this.a(new gvt<>(this));
   }

   public aku a(has $$0) {
      return a;
   }

   public has b() {
      return new has();
   }

   public void a(com $$0, has $$1, float $$2) {
      super.a($$0, $$1, $$2);
      gyw.a($$0, $$1, this.i);
      $$1.a = $$0.p() > 0;
   }
}
