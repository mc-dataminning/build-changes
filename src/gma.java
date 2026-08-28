public class gma extends gkm<ckb, fwr> {
   private static final akk a = new akk("textures/entity/illager/vex.png");
   private static final akk i = new akk("textures/entity/illager/vex_charging.png");

   public gma(gjg.a $$0) {
      super($$0, new fwr($$0.a(fxh.bO)), 0.3F);
      this.a(new gnl<>(this, $$0.d()));
   }

   protected int a(ckb $$0, ja $$1) {
      return 15;
   }

   public akk a(ckb $$0) {
      return $$0.go() ? i : a;
   }
}
