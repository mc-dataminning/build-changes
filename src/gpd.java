public class gpd extends gmj<cgu, guz, fyo> {
   private static final ale a = ale.b("textures/entity/pig/pig.png");

   public gpd(gno.a $$0) {
      super($$0, new fyo($$0.a(gap.bt)), new fyo($$0.a(gap.bu)), 0.7F);
      this.a(new gsc<>(this, new fyo($$0.a(gap.bv)), new fyo($$0.a(gap.bw)), ale.b("textures/entity/pig/pig_saddle.png")));
   }

   public ale a(guz $$0) {
      return a;
   }

   public guz c() {
      return new guz();
   }

   public void a(cgu $$0, guz $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.i();
   }
}
