public class gdt extends gcg<cff, fos> {
   private static final aiy a = new aiy("textures/entity/illager/vex.png");
   private static final aiy i = new aiy("textures/entity/illager/vex_charging.png");

   public gdt(gba.a $$0) {
      super($$0, new fos($$0.a(fpi.bK)), 0.3F);
      this.a(new gfe<>(this, $$0.d()));
   }

   protected int a(cff $$0, hz $$1) {
      return 15;
   }

   public aiy a(cff $$0) {
      return $$0.gh() ? i : a;
   }
}
