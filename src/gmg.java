public class gmg extends gks<cke, fwx> {
   private static final akk a = new akk("textures/entity/illager/vex.png");
   private static final akk i = new akk("textures/entity/illager/vex_charging.png");

   public gmg(gjm.a $$0) {
      super($$0, new fwx($$0.a(fxn.bO)), 0.3F);
      this.a(new gnr<>(this, $$0.d()));
   }

   protected int a(cke $$0, ja $$1) {
      return 15;
   }

   public akk a(cke $$0) {
      return $$0.gp() ? i : a;
   }
}
