public class gbg extends fzt<cdd, fmg> {
   private static final ahg a = new ahg("textures/entity/illager/vex.png");
   private static final ahg i = new ahg("textures/entity/illager/vex_charging.png");

   public gbg(fyn.a $$0) {
      super($$0, new fmg($$0.a(fmw.bL)), 0.3F);
      this.a(new gcr<>(this, $$0.d()));
   }

   protected int a(cdd $$0, hx $$1) {
      return 15;
   }

   public ahg a(cdd $$0) {
      return $$0.gf() ? i : a;
   }
}
