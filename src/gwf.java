public class gwf<S extends gys & gzk, M extends gbl<? super S>> extends gwe<S, M> {
   private final alz a;
   private final M b;
   private final M c;

   public gwf(gtm<S, M> $$0, M $$1, M $$2, alz $$3) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
      this.a = $$3;
   }

   public gwf(gtm<S, M> $$0, M $$1, alz $$2) {
      this($$0, $$1, $$1, $$2);
   }

   public void a(fgr $$0, glk $$1, int $$2, S $$3, float $$4, float $$5) {
      if ($$3.c()) {
         M $$6 = $$3.ae ? this.c : this.b;
         $$6.a($$3);
         fgv $$7 = $$1.getBuffer(glu.g(this.a));
         $$6.a($$0, $$7, $$2, hbb.d);
      }
   }
}
