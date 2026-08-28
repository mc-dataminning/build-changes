public class gts extends gqx<cho, gzt, gda> {
   private static final akv a = akv.b("textures/entity/pig/pig.png");

   public gts(gsd.a $$0) {
      super($$0, new gda($$0.a(gfb.bP)), new gda($$0.a(gfb.ca)), 0.7F);
      this.a(new gwt<>(this, new gda($$0.a(gfb.cc)), new gda($$0.a(gfb.cb)), akv.b("textures/entity/pig/pig_saddle.png")));
   }

   public akv a(gzt $$0) {
      return a;
   }

   public gzt b() {
      return new gzt();
   }

   public void a(cho $$0, gzt $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.j();
   }
}
