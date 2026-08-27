public class gib extends ggo<chn, fsv> {
   private static final ajt a = new ajt("textures/entity/illager/vex.png");
   private static final ajt i = new ajt("textures/entity/illager/vex_charging.png");

   public gib(gfi.a $$0) {
      super($$0, new fsv($$0.a(ftl.bO)), 0.3F);
      this.a(new gjm<>(this, $$0.d()));
   }

   protected int a(chn $$0, ib $$1) {
      return 15;
   }

   public ajt a(chn $$0) {
      return $$0.go() ? i : a;
   }
}
