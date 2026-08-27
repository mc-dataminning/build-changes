public class ggk<T extends bof & bpm, M extends fne<T>> extends ggj<T, M> {
   private final ajc a;
   private final M b;

   public ggk(gdt<T, M> $$0, M $$1, ajc $$2) {
      super($$0);
      this.b = $$1;
      this.a = $$2;
   }

   @Override
   public void a(etd $$0, fwq $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      if ($$3.i()) {
         this.c().a(this.b);
         this.b.a($$3, $$4, $$5, $$6);
         this.b.a($$3, $$4, $$5, $$7, $$8, $$9);
         eth $$10 = $$1.getBuffer(fwy.e(this.a));
         this.b.a($$0, $$10, $$2, ghq.d, 1.0F, 1.0F, 1.0F, 1.0F);
      }
   }
}
