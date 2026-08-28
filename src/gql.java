public class gql extends gou<cnq, gvz, gaa> {
   private static final ale a = ale.b("textures/entity/wandering_trader.png");

   public gql(gno.a $$0) {
      super($$0, new gaa($$0.a(gap.cW)), 0.5F);
      this.a(new grg<>(this, $$0.f(), $$0.b()));
      this.a(new grf<>(this, $$0.b()));
   }

   public ale a(gvz $$0) {
      return a;
   }

   protected void a(gvz $$0, fdi $$1) {
      float $$2 = 0.9375F;
      $$1.b(0.9375F, 0.9375F, 0.9375F);
   }

   public gvz c() {
      return new gvz();
   }

   public void a(cnq $$0, gvz $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.q() > 0;
   }
}
