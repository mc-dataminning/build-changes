public class gsn<S extends gva & gvs, M extends fxz<? super S>> extends gsm<S, M> {
   private final alh a;
   private final M b;
   private final M c;

   public gsn(gpv<S, M> $$0, M $$1, M $$2, alh $$3) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
      this.a = $$3;
   }

   public gsn(gpv<S, M> $$0, M $$1, alh $$2) {
      this($$0, $$1, $$1, $$2);
   }

   public void a(fdt $$0, ghw $$1, int $$2, S $$3, float $$4, float $$5) {
      if ($$3.c()) {
         M $$6 = $$3.ae ? this.c : this.b;
         $$6.a($$3);
         fdx $$7 = $$1.getBuffer(gig.f(this.a));
         $$6.a($$0, $$7, $$2, gxj.d);
      }
   }
}
