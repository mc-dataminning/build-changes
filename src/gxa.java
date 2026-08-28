public class gxa extends gvl<cnx, hcs, ggl> {
   private static final ald a = ald.b("textures/entity/illager/vex.png");
   private static final ald j = ald.b("textures/entity/illager/vex_charging.png");

   public gxa(guf.a $$0) {
      super($$0, new ggl($$0.a(ghc.dE)), 0.3F);
      this.a(new gyl<>(this));
   }

   protected int a(cnx $$0, jj $$1) {
      return 15;
   }

   public ald a(hcs $$0) {
      return $$0.a ? j : a;
   }

   public hcs b() {
      return new hcs();
   }

   public void a(cnx $$0, hcs $$1, float $$2) {
      super.a($$0, $$1, $$2);
      gzp.a($$0, $$1, this.h);
      $$1.a = $$0.t();
   }
}
