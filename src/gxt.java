public class gxt<S extends haj & hba, M extends gda<? super S>> extends gxs<S, M> {
   private final aku a;
   private final M b;
   private final M c;

   public gxt(gva<S, M> $$0, M $$1, M $$2, aku $$3) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
      this.a = $$3;
   }

   public gxt(gva<S, M> $$0, M $$1, aku $$2) {
      this($$0, $$1, $$1, $$2);
   }

   public void a(fgr $$0, gmx $$1, int $$2, S $$3, float $$4, float $$5) {
      if ($$3.a()) {
         M $$6 = $$3.aj ? this.c : this.b;
         $$6.a($$3);
         fgv $$7 = $$1.getBuffer(gnh.g(this.a));
         $$6.a($$0, $$7, $$2, hfh.d);
      }
   }
}
