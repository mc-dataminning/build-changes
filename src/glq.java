public class glq extends gkc<ckq, fwi> {
   private static final ale a = new ale("textures/entity/illager/vex.png");
   private static final ale i = new ale("textures/entity/illager/vex_charging.png");

   public glq(giw.a $$0) {
      super($$0, new fwi($$0.a(fwy.bO)), 0.3F);
      this.a(new gnb<>(this, $$0.d()));
   }

   protected int a(ckq $$0, iz $$1) {
      return 15;
   }

   public ale a(ckq $$0) {
      return $$0.gr() ? i : a;
   }
}
