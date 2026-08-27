public class gkn extends giz<cjq, fvf> {
   private static final akm a = new akm("textures/entity/illager/vex.png");
   private static final akm i = new akm("textures/entity/illager/vex_charging.png");

   public gkn(ght.a $$0) {
      super($$0, new fvf($$0.a(fvv.bO)), 0.3F);
      this.a(new gly<>(this, $$0.d()));
   }

   protected int a(cjq $$0, io $$1) {
      return 15;
   }

   public akm a(cjq $$0) {
      return $$0.gq() ? i : a;
   }
}
