public class glt extends gkf<ckt, fwl> {
   private static final alf a = new alf("textures/entity/illager/vex.png");
   private static final alf i = new alf("textures/entity/illager/vex_charging.png");

   public glt(giz.a $$0) {
      super($$0, new fwl($$0.a(fxb.bO)), 0.3F);
      this.a(new gne<>(this, $$0.d()));
   }

   protected int a(ckt $$0, iz $$1) {
      return 15;
   }

   public alf a(ckt $$0) {
      return $$0.gr() ? i : a;
   }
}
