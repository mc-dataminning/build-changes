public class gwb extends guj<cpj, hbu, gfm> {
   private static final aku a = aku.b("textures/entity/wandering_trader.png");

   public gwb(gtd.a $$0) {
      super($$0, new gfm($$0.a(ggb.dy)), 0.5F);
      this.a(new gww<>(this, $$0.f()));
      this.a(new gwv<>(this));
   }

   public aku a(hbu $$0) {
      return a;
   }

   public hbu b() {
      return new hbu();
   }

   public void a(cpj $$0, hbu $$1, float $$2) {
      super.a($$0, $$1, $$2);
      gzy.a($$0, $$1, this.i);
      $$1.a = $$0.q() > 0;
   }
}
