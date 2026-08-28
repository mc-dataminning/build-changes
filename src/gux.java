public class gux extends gqt<cjb, gyk, gao<gyk>> {
   private static final akv a = akv.b("textures/entity/horse/horse_zombie.png");
   private static final akv b = akv.b("textures/entity/horse/horse_skeleton.png");
   private final akv k;

   public gux(gsd.a $$0, gfa $$1, gfa $$2, boolean $$3) {
      super($$0, new gcl($$0.a($$1)), new gcl($$0.a($$2)));
      this.k = $$3 ? b : a;
   }

   public akv a(gyk $$0) {
      return this.k;
   }

   public gyk b() {
      return new gyk();
   }
}
