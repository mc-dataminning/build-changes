public class gto<S extends gwb & gwt, M extends fza<? super S>> extends gtn<S, M> {
   private final all a;
   private final M b;
   private final M c;

   public gto(gqw<S, M> $$0, M $$1, M $$2, all $$3) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
      this.a = $$3;
   }

   public gto(gqw<S, M> $$0, M $$1, all $$2) {
      this($$0, $$1, $$1, $$2);
   }

   public void a(fek $$0, gix $$1, int $$2, S $$3, float $$4, float $$5) {
      if ($$3.c()) {
         M $$6 = $$3.ae ? this.c : this.b;
         $$6.a($$3);
         feo $$7 = $$1.getBuffer(gjh.f(this.a));
         $$6.a($$0, $$7, $$2, gyk.d);
      }
   }
}
