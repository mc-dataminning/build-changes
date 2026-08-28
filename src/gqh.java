public class gqh extends gmf<cih, gtr, fwf<gtr>> {
   private static final ale a = ale.b("textures/entity/horse/horse_zombie.png");
   private static final ale b = ale.b("textures/entity/horse/horse_skeleton.png");
   private final ale k;

   public gqh(gno.a $$0, gao $$1, gao $$2, boolean $$3) {
      super($$0, new fxz($$0.a($$1)), new fxz($$0.a($$2)), 1.0F);
      this.k = $$3 ? b : a;
   }

   public ale a(gtr $$0) {
      return this.k;
   }

   public gtr c() {
      return new gtr();
   }
}
