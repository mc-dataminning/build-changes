public class gjg extends ght<cif, fua> {
   private static final akf a = new akf("textures/entity/illager/vex.png");
   private static final akf i = new akf("textures/entity/illager/vex_charging.png");

   public gjg(ggn.a $$0) {
      super($$0, new fua($$0.a(fuq.bO)), 0.3F);
      this.a(new gkr<>(this, $$0.d()));
   }

   protected int a(cif $$0, im $$1) {
      return 15;
   }

   public akf a(cif $$0) {
      return $$0.gq() ? i : a;
   }
}
