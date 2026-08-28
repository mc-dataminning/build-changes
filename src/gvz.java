public class gvz<S extends gym & gze, M extends gbf<? super S>> extends gvy<S, M> {
   private final alz a;
   private final M b;
   private final M c;

   public gvz(gtg<S, M> $$0, M $$1, M $$2, alz $$3) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
      this.a = $$3;
   }

   public gvz(gtg<S, M> $$0, M $$1, alz $$2) {
      this($$0, $$1, $$1, $$2);
   }

   public void a(fgl $$0, gle $$1, int $$2, S $$3, float $$4, float $$5) {
      if ($$3.c()) {
         M $$6 = $$3.ae ? this.c : this.b;
         $$6.a($$3);
         fgp $$7 = $$1.getBuffer(glo.f(this.a));
         $$6.a($$0, $$7, $$2, hav.d);
      }
   }
}
