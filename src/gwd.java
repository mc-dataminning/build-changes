public class gwd extends gwq<gyx, gcj> {
   private final gcj a;
   private final gcj b;
   private final gwa c;

   public gwd(gty<gyx, gcj> $$0, gew $$1, gwa $$2) {
      super($$0);
      this.c = $$2;
      this.a = new gcj($$1.a(gez.be));
      this.b = new gcj($$1.a(gez.bg));
   }

   public void a(ffs $$0, glv $$1, int $$2, gyx $$3, float $$4, float $$5) {
      cwn $$6 = $$3.i;
      des $$7 = $$6.a(kv.D);
      if ($$7 != null && !$$7.c().isEmpty()) {
         gcj $$8 = $$3.aj ? this.b : this.a;
         $$8.a($$3);
         this.c.a(hgr.d.e, $$7.c().get(), $$8, $$6, $$0, $$1, $$2);
      }
   }
}
