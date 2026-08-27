public class fxe<T extends cbm, M extends fet<T> & fdu & ffb> extends fwy<T, M> {
   private final fnq a;
   private static final float b = (float) (-Math.PI / 6);
   private static final float c = (float) (Math.PI / 2);

   public fxe(fus<T, M> $$0, fnq $$1) {
      super($$0, $$1);
      this.a = $$1;
   }

   @Override
   protected void a(biy $$0, cix $$1, ciu $$2, bis $$3, elf $$4, fnu $$5, int $$6) {
      if ($$1.a(cja.qj) && $$0.fn() == $$1 && $$0.aH == 0) {
         this.a($$0, $$1, $$3, $$4, $$5, $$6);
      } else {
         super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }

   private void a(biy $$0, cix $$1, bis $$2, elf $$3, fnu $$4, int $$5) {
      $$3.a();
      fhs $$6 = this.c().d();
      float $$7 = $$6.e;
      $$6.e = arp.a($$6.e, (float) (-Math.PI / 6), (float) (Math.PI / 2));
      $$6.a($$3);
      $$6.e = $$7;
      fwk.a($$3, false);
      boolean $$8 = $$2 == bis.a;
      $$3.a(($$8 ? -2.5F : 2.5F) / 16.0F, -0.0625F, 0.0F);
      this.a.a($$0, $$1, ciu.f, false, $$3, $$4, $$5);
      $$3.b();
   }
}
