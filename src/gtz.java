public class gtz<S extends gwm & gxe, M extends fzj<? super S>> extends gty<S, M> {
   private final alj a;
   private final M b;
   private final M c;

   public gtz(grh<S, M> $$0, M $$1, M $$2, alj $$3) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
      this.a = $$3;
   }

   public gtz(grh<S, M> $$0, M $$1, alj $$2) {
      this($$0, $$1, $$1, $$2);
   }

   public void a(fer $$0, gjg $$1, int $$2, S $$3, float $$4, float $$5) {
      if ($$3.c()) {
         M $$6 = $$3.ae ? this.c : this.b;
         $$6.a($$3);
         fev $$7 = $$1.getBuffer(gjq.f(this.a));
         $$6.a($$0, $$7, $$2, gyv.d);
      }
   }
}
