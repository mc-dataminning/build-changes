public class gff<T extends bno & bov, M extends fmb<T>> extends gfe<T, M> {
   private final aiy a;
   private final M b;

   public gff(gco<T, M> $$0, M $$1, aiy $$2) {
      super($$0);
      this.b = $$1;
      this.a = $$2;
   }

   @Override
   public void a(esa $$0, fvm $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      if ($$3.i()) {
         this.c().a(this.b);
         this.b.a($$3, $$4, $$5, $$6);
         this.b.a($$3, $$4, $$5, $$7, $$8, $$9);
         ese $$10 = $$1.getBuffer(fvu.e(this.a));
         this.b.a($$0, $$10, $$2, ggl.d, 1.0F, 1.0F, 1.0F, 1.0F);
      }
   }
}
