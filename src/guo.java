public class guo extends gsw<cpp, hae, gdy> {
   private static final alz a = alz.b("textures/entity/wandering_trader.png");

   public guo(grq.a $$0) {
      super($$0, new gdy($$0.a(gen.dq)), 0.5F);
      this.a(new gvj<>(this, $$0.f(), $$0.b()));
      this.a(new gvi<>(this, $$0.b()));
   }

   public alz a(hae $$0) {
      return a;
   }

   public hae b() {
      return new hae();
   }

   public void a(cpp $$0, hae $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.p() > 0;
   }
}
