public class gfu extends geh<cgo, fqo> {
   private static final ajh a = new ajh("textures/entity/illager/vex.png");
   private static final ajh i = new ajh("textures/entity/illager/vex_charging.png");

   public gfu(gdb.a $$0) {
      super($$0, new fqo($$0.a(fre.bO)), 0.3F);
      this.a(new ghf<>(this, $$0.d()));
   }

   protected int a(cgo $$0, ib $$1) {
      return 15;
   }

   public ajh a(cgo $$0) {
      return $$0.gn() ? i : a;
   }
}
