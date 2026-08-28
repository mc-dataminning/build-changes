public class gvz extends grx<cpd, hbu, gfm> {
   private static final aku b = aku.b("textures/entity/villager/villager.png");
   public static final gww.a a = new gww.a(-0.1171875F, -0.07421875F, 1.0F);

   public gvz(gtd.a $$0) {
      super($$0, new gfm($$0.a(ggb.dv)), new gfm($$0.a(ggb.dw)), 0.5F);
      this.a(new gww<>(this, $$0.f(), a));
      this.a(new gyc<>(this, $$0.e(), "villager"));
      this.a(new gwv<>(this));
   }

   public aku a(hbu $$0) {
      return b;
   }

   protected float b(hbu $$0) {
      float $$1 = super.g($$0);
      return $$0.aj ? $$1 * 0.5F : $$1;
   }

   public hbu b() {
      return new hbu();
   }

   public void a(cpd $$0, hbu $$1, float $$2) {
      super.a($$0, $$1, $$2);
      gzy.a($$0, $$1, this.i);
      $$1.a = $$0.q() > 0;
      $$1.b = $$0.gA();
   }
}
