public class gdm extends gbz<cfb, fok> {
   private static final aiy a = new aiy("textures/entity/illager/vex.png");
   private static final aiy i = new aiy("textures/entity/illager/vex_charging.png");

   public gdm(gat.a $$0) {
      super($$0, new fok($$0.a(fpb.bK)), 0.3F);
      this.a(new gex<>(this, $$0.d()));
   }

   protected int a(cfb $$0, hz $$1) {
      return 15;
   }

   public aiy a(cfb $$0) {
      return $$0.gh() ? i : a;
   }
}
