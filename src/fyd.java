public class fyd extends fwq<cbo, fjl> {
   private static final agg a = new agg("textures/entity/illager/vex.png");
   private static final agg i = new agg("textures/entity/illager/vex_charging.png");

   public fyd(fvk.a $$0) {
      super($$0, new fjl($$0.a(fka.bI)), 0.3F);
      this.a(new fzl<>(this, $$0.d()));
   }

   protected int a(cbo $$0, ht $$1) {
      return 15;
   }

   public agg a(cbo $$0) {
      return $$0.ge() ? i : a;
   }
}
