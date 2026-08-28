public class gwb<S extends gyo & gzg, M extends gbh<? super S>> extends gwa<S, M> {
   private final alp a;
   private final M b;
   private final M c;

   public gwb(gti<S, M> $$0, M $$1, M $$2, alp $$3) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
      this.a = $$3;
   }

   public gwb(gti<S, M> $$0, M $$1, alp $$2) {
      this($$0, $$1, $$1, $$2);
   }

   public void a(fgl $$0, glg $$1, int $$2, S $$3, float $$4, float $$5) {
      if ($$3.c()) {
         M $$6 = $$3.ae ? this.c : this.b;
         $$6.a($$3);
         fgp $$7 = $$1.getBuffer(glq.g(this.a));
         $$6.a($$0, $$7, $$2, hax.d);
      }
   }
}
