public class grx<S extends guj & gvb, M extends fxk<? super S>> extends grw<S, M> {
   private final alc a;
   private final M b;
   private final M c;

   public grx(gpf<S, M> $$0, M $$1, M $$2, alc $$3) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
      this.a = $$3;
   }

   public grx(gpf<S, M> $$0, M $$1, alc $$2) {
      this($$0, $$1, $$1, $$2);
   }

   public void a(fde $$0, ghg $$1, int $$2, S $$3, float $$4, float $$5) {
      if ($$3.c()) {
         M $$6 = $$3.ae ? this.c : this.b;
         $$6.a($$3);
         fdi $$7 = $$1.getBuffer(ghq.f(this.a));
         $$6.a($$0, $$7, $$2, gws.d);
      }
   }
}
