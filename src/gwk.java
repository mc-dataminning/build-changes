public class gwk extends gwq<gzi, gcq> {
   private final gcq a;
   private final gcq b;
   private final gwa c;

   public gwk(gty<gzi, gcq> $$0, gew $$1, gwa $$2) {
      super($$0);
      this.c = $$2;
      this.a = new gcq($$1.a(gez.bv));
      this.b = new gcq($$1.a(gez.bu));
   }

   public void a(ffs $$0, glv $$1, int $$2, gzi $$3, float $$4, float $$5) {
      cwn $$6 = $$3.c;
      des $$7 = $$6.a(kv.D);
      if ($$7 != null && $$7.c().isPresent()) {
         this.a($$0, $$1, $$3, $$6, $$7.c().get(), $$2);
      } else if ($$3.d) {
         this.a($$0, $$1, $$3, cwn.j, der.l, $$2);
      }
   }

   private void a(ffs $$0, glv $$1, gzi $$2, cwn $$3, akt<deq> $$4, int $$5) {
      gcq $$6 = $$2.aj ? this.b : this.a;
      $$6.a($$2);
      this.c.a(hgr.d.f, $$4, $$6, $$3, $$0, $$1, $$5);
   }
}
