public class gsy<S extends gvl & gwd, M extends fyk<? super S>> extends gsx<S, M> {
   private final ali a;
   private final M b;
   private final M c;

   public gsy(gqg<S, M> $$0, M $$1, M $$2, ali $$3) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
      this.a = $$3;
   }

   public gsy(gqg<S, M> $$0, M $$1, ali $$2) {
      this($$0, $$1, $$1, $$2);
   }

   public void a(feb $$0, gih $$1, int $$2, S $$3, float $$4, float $$5) {
      if ($$3.c()) {
         M $$6 = $$3.ae ? this.c : this.b;
         $$6.a($$3);
         fef $$7 = $$1.getBuffer(gir.f(this.a));
         $$6.a($$0, $$7, $$2, gxu.d);
      }
   }
}
