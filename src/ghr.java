public class ghr<T extends bpp> extends ghm<T, fqd<T>> {
   private final foe<T> a;

   public ghr(gew<T, fqd<T>> $$0, frb $$1) {
      super($$0);
      this.a = new fqd<>($$1.a(fre.bt));
   }

   public void a(eub $$0, fxs $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      ezi $$10 = ezi.Q();
      boolean $$11 = $$10.b($$3) && $$3.ce();
      if (!$$3.ce() || $$11) {
         euf $$12;
         if ($$11) {
            $$12 = $$1.getBuffer(fya.r(this.a($$3)));
         } else {
            $$12 = $$1.getBuffer(fya.i(this.a($$3)));
         }

         this.c().a(this.a);
         this.a.a($$3, $$4, $$5, $$6);
         this.a.a($$3, $$4, $$5, $$7, $$8, $$9);
         this.a.a($$0, $$12, $$2, gec.c($$3, 0.0F), 1.0F, 1.0F, 1.0F, 1.0F);
      }
   }
}
