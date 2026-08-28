public class gsc<S extends guo & gvg, M extends fxo<? super S>> extends gsb<S, M> {
   private final ale a;
   private final M b;
   private final M c;

   public gsc(gpk<S, M> $$0, M $$1, M $$2, ale $$3) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
      this.a = $$3;
   }

   public gsc(gpk<S, M> $$0, M $$1, ale $$2) {
      this($$0, $$1, $$1, $$2);
   }

   public void a(fdi $$0, ghl $$1, int $$2, S $$3, float $$4, float $$5) {
      if ($$3.c()) {
         M $$6 = $$3.ae ? this.c : this.b;
         $$6.a($$3);
         fdm $$7 = $$1.getBuffer(ghv.f(this.a));
         $$6.a($$0, $$7, $$2, gwx.d);
      }
   }
}
