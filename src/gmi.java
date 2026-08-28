public class gmi extends gku<ckf, fwz> {
   private static final akk a = new akk("textures/entity/illager/vex.png");
   private static final akk i = new akk("textures/entity/illager/vex_charging.png");

   public gmi(gjo.a $$0) {
      super($$0, new fwz($$0.a(fxp.bO)), 0.3F);
      this.a(new gnt<>(this, $$0.d()));
   }

   protected int a(ckf $$0, ja $$1) {
      return 15;
   }

   public akk a(ckf $$0) {
      return $$0.go() ? i : a;
   }
}
