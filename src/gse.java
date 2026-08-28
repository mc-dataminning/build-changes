public class gse extends gob<cjc, gvp, fya<gvp>> {
   private static final alj a = alj.b("textures/entity/horse/horse_zombie.png");
   private static final alj b = alj.b("textures/entity/horse/horse_skeleton.png");
   private final alj k;

   public gse(gpk.a $$0, gcj $$1, gcj $$2, boolean $$3) {
      super($$0, new fzu($$0.a($$1)), new fzu($$0.a($$2)), 1.0F);
      this.k = $$3 ? b : a;
   }

   public alj a(gvp $$0) {
      return this.k;
   }

   public gvp b() {
      return new gvp();
   }
}
