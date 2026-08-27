public class gie extends giz<cix, ftj<cix>> {
   private static final akm a = new akm("textures/entity/zombie/zombie.png");
   private final float i;

   public gie(ght.a $$0, float $$1) {
      super($$0, new ftb($$0.a(fvv.ah)), 0.5F * $$1);
      this.i = $$1;
      this.a(new gly<>(this, $$0.d()));
      this.a(new glv<>(this, new ftb($$0.a(fvv.ai)), new ftb($$0.a(fvv.aj)), $$0.g()));
   }

   protected void a(cix $$0, eys $$1, float $$2) {
      $$1.b(this.i, this.i, this.i);
   }

   public akm a(cix $$0) {
      return a;
   }
}
