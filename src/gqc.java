public class gqc extends gma<cie, gtm, fwb<gtm>> {
   private static final alc a = alc.b("textures/entity/horse/horse_zombie.png");
   private static final alc b = alc.b("textures/entity/horse/horse_skeleton.png");
   private final alc k;

   public gqc(gnj.a $$0, gaj $$1, gaj $$2, boolean $$3) {
      super($$0, new fxv($$0.a($$1)), new fxv($$0.a($$2)), 1.0F);
      this.k = $$3 ? b : a;
   }

   public alc a(gtm $$0) {
      return this.k;
   }

   public gtm c() {
      return new gtm();
   }
}
