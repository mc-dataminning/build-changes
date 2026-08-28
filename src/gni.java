public class gni<T extends bss & bud, M extends fty<T>> extends gnh<T, M> {
   private final ale a;
   private final M b;

   public gni(gkr<T, M> $$0, M $$1, ale $$2) {
      super($$0);
      this.b = $$1;
      this.a = $$2;
   }

   @Override
   public void a(ezw $$0, gdm $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      if ($$3.i()) {
         this.c().a(this.b);
         this.b.a($$3, $$4, $$5, $$6);
         this.b.a($$3, $$4, $$5, $$7, $$8, $$9);
         faa $$10 = $$1.getBuffer(gdu.e(this.a));
         this.b.a($$0, $$10, $$2, goo.d, 1.0F, 1.0F, 1.0F, 1.0F);
      }
   }
}
