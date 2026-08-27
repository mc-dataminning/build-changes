public class gdm extends geh<cfv, fos<cfv>> {
   private static final ajh a = new ajh("textures/entity/zombie/zombie.png");
   private final float i;

   public gdm(gdb.a $$0, float $$1) {
      super($$0, new foj($$0.a(fre.ah)), 0.5F * $$1);
      this.i = $$1;
      this.a(new ghf<>(this, $$0.d()));
      this.a(new ghc<>(this, new foj($$0.a(fre.ai)), new foj($$0.a(fre.aj)), $$0.g()));
   }

   protected void a(cfv $$0, eub $$1, float $$2) {
      $$1.b(this.i, this.i, this.i);
   }

   public ajh a(cfv $$0) {
      return a;
   }
}
