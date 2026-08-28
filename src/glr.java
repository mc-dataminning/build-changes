public class glr extends gkd<ckr, fwj> {
   private static final alf a = new alf("textures/entity/illager/vex.png");
   private static final alf i = new alf("textures/entity/illager/vex_charging.png");

   public glr(gix.a $$0) {
      super($$0, new fwj($$0.a(fwz.bO)), 0.3F);
      this.a(new gnc<>(this, $$0.d()));
   }

   protected int a(ckr $$0, iz $$1) {
      return 15;
   }

   public alf a(ckr $$0) {
      return $$0.gr() ? i : a;
   }
}
