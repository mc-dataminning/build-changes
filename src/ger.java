public class ger extends gde<cfu, fpo> {
   private static final ajc a = new ajc("textures/entity/illager/vex.png");
   private static final ajc i = new ajc("textures/entity/illager/vex_charging.png");

   public ger(gby.a $$0) {
      super($$0, new fpo($$0.a(fqe.bK)), 0.3F);
      this.a(new ggc<>(this, $$0.d()));
   }

   protected int a(cfu $$0, ib $$1) {
      return 15;
   }

   public ajc a(cfu $$0) {
      return $$0.gm() ? i : a;
   }
}
