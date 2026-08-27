public class gnn extends glz<cjs, fyb> {
   private static final akt a = new akt("textures/entity/illager/vex.png");
   private static final akt b = new akt("textures/entity/illager/vex_charging.png");

   public gnn(gkq.a $$0) {
      super($$0, new fyb($$0.a(fyr.bU)), 0.3F);
      this.a(new goy<>(this, $$0.d()));
   }

   protected int a(cjs $$0, ir $$1) {
      return 15;
   }

   public akt a(cjs $$0) {
      return $$0.gz() ? b : a;
   }
}
