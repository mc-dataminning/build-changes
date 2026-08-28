public class gyn extends gyt<hbl, get> {
   private final get a;
   private final get b;
   private final gye c;

   public gyn(gwc<hbl, get> $$0, ggz $$1, gye $$2) {
      super($$0);
      this.c = $$2;
      this.a = new get($$1.a(ghc.bD));
      this.b = new get($$1.a(ghc.bC));
   }

   public void a(fho $$0, gny $$1, int $$2, hbl $$3, float $$4, float $$5) {
      cxy $$6 = $$3.c;
      dgc $$7 = $$6.a(kx.E);
      if ($$7 != null && $$7.d().isPresent()) {
         this.a($$0, $$1, $$3, $$6, $$7.d().get(), $$2);
      } else if ($$3.d) {
         this.a($$0, $$1, $$3, cxy.k, dgb.m, $$2);
      }
   }

   private void a(fho $$0, gny $$1, hbl $$2, cxy $$3, alc<dga> $$4, int $$5) {
      get $$6 = $$2.aj ? this.b : this.a;
      $$6.a($$2);
      this.c.a(hiy.d.f, $$4, $$6, $$3, $$0, $$1, $$5);
   }
}
