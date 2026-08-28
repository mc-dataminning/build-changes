public class gwg<S extends gyt & gzl, M extends gbm<? super S>> extends gwf<S, M> {
   private final alz a;
   private final M b;
   private final M c;

   public gwg(gtn<S, M> $$0, M $$1, M $$2, alz $$3) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
      this.a = $$3;
   }

   public gwg(gtn<S, M> $$0, M $$1, alz $$2) {
      this($$0, $$1, $$1, $$2);
   }

   public void a(fgs $$0, gll $$1, int $$2, S $$3, float $$4, float $$5) {
      if ($$3.c()) {
         M $$6 = $$3.ae ? this.c : this.b;
         $$6.a($$3);
         fgw $$7 = $$1.getBuffer(glv.g(this.a));
         $$6.a($$0, $$7, $$2, hbc.d);
      }
   }
}
