public class fyq extends fxd<cbw, fjy> {
   private static final agi a = new agi("textures/entity/illager/vex.png");
   private static final agi i = new agi("textures/entity/illager/vex_charging.png");

   public fyq(fvx.a $$0) {
      super($$0, new fjy($$0.a(fkn.bI)), 0.3F);
      this.a(new fzy<>(this, $$0.d()));
   }

   protected int a(cbw $$0, ht $$1) {
      return 15;
   }

   public agi a(cbw $$0) {
      return $$0.gg() ? i : a;
   }
}
