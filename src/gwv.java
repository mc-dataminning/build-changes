public class gwv<S extends gzl & hac, M extends gcc<? super S>> extends gwu<S, M> {
   private final akv a;
   private final M b;
   private final M c;

   public gwv(guc<S, M> $$0, M $$1, M $$2, akv $$3) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
      this.a = $$3;
   }

   public gwv(guc<S, M> $$0, M $$1, akv $$2) {
      this($$0, $$1, $$1, $$2);
   }

   public void a(ffv $$0, glz $$1, int $$2, S $$3, float $$4, float $$5) {
      if ($$3.a()) {
         M $$6 = $$3.aj ? this.c : this.b;
         $$6.a($$3);
         ffz $$7 = $$1.getBuffer(gmj.g(this.a));
         $$6.a($$0, $$7, $$2, hej.d);
      }
   }
}
