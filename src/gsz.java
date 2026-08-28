public class gsz extends guj<cmi, gzi, gcy<gzi>> {
   private static final aku a = aku.b("textures/entity/enderman/enderman.png");
   private final azh b = azh.a();

   public gsz(gtd.a $$0) {
      super($$0, new gcy<>($$0.a(ggb.aJ)), 0.5F);
      this.a(new gxa(this));
      this.a(new gws(this, $$0.d()));
   }

   public fbx a(gzi $$0) {
      fbx $$1 = super.a($$0);
      if ($$0.a) {
         double $$2 = 0.02 * (double)$$0.af;
         return $$1.b(this.b.k() * $$2, 0.0, this.b.k() * $$2);
      } else {
         return $$1;
      }
   }

   public aku b(gzi $$0) {
      return a;
   }

   public gzi a() {
      return new gzi();
   }

   public void a(cmi $$0, gzi $$1, float $$2) {
      super.a($$0, $$1, $$2);
      gtu.a($$0, $$1, $$2, this.i);
      $$1.a = $$0.t();
      $$1.b = $$0.q();
   }
}
