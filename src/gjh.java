public class gjh extends gkc<cjx, fum<cjx>> {
   private static final ale a = new ale("textures/entity/zombie/zombie.png");
   private final float i;

   public gjh(giw.a $$0, float $$1) {
      super($$0, new fue($$0.a(fwy.ah)), 0.5F * $$1);
      this.i = $$1;
      this.a(new gnb<>(this, $$0.d()));
      this.a(new gmy<>(this, new fue($$0.a(fwy.ai)), new fue($$0.a(fwy.aj)), $$0.g()));
   }

   protected void a(cjx $$0, ezx $$1, float $$2) {
      $$1.b(this.i, this.i, this.i);
   }

   public ale a(cjx $$0) {
      return a;
   }
}
