public class gwr<S extends gzh & gzy, M extends gby<? super S>> extends gwq<S, M> {
   private final aku a;
   private final M b;
   private final M c;

   public gwr(gty<S, M> $$0, M $$1, M $$2, aku $$3) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
      this.a = $$3;
   }

   public gwr(gty<S, M> $$0, M $$1, aku $$2) {
      this($$0, $$1, $$1, $$2);
   }

   public void a(ffs $$0, glv $$1, int $$2, S $$3, float $$4, float $$5) {
      if ($$3.a()) {
         M $$6 = $$3.aj ? this.c : this.b;
         $$6.a($$3);
         ffw $$7 = $$1.getBuffer(gmf.g(this.a));
         $$6.a($$0, $$7, $$2, hec.d);
      }
   }
}
