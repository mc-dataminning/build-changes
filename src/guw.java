public class guw extends gqs<cjb, gyj, gao<gyj>> {
   private static final aku a = aku.b("textures/entity/horse/horse_zombie.png");
   private static final aku b = aku.b("textures/entity/horse/horse_skeleton.png");
   private final aku k;

   public guw(gsc.a $$0, gfa $$1, gfa $$2, boolean $$3) {
      super($$0, new gcl($$0.a($$1)), new gcl($$0.a($$2)));
      this.k = $$3 ? b : a;
   }

   public aku a(gyj $$0) {
      return this.k;
   }

   public gyj b() {
      return new gyj();
   }
}
