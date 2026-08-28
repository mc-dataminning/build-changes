public class gyq extends gyt<hbw, gfg> {
   private final gez a;
   private final hbs b = new hbs();

   public gyq(gwc<hbw, gfg> $$0, ggz $$1) {
      super($$0);
      this.a = new gez($$1.a(ghc.bX));
      this.b.c = gez.a.e;
   }

   public void a(fho $$0, gny $$1, int $$2, hbw $$3, float $$4, float $$5) {
      ciw.b $$6 = $$3.aE;
      if ($$6 != null) {
         this.a($$0, $$1, $$2, $$3, $$6, $$4, $$5, true);
      }

      ciw.b $$7 = $$3.aF;
      if ($$7 != null) {
         this.a($$0, $$1, $$2, $$3, $$7, $$4, $$5, false);
      }
   }

   private void a(fho $$0, gny $$1, int $$2, hbw $$3, ciw.b $$4, float $$5, float $$6, boolean $$7) {
      $$0.a();
      $$0.a($$7 ? 0.4F : -0.4F, $$3.N ? -1.3F : -1.5F, 0.0F);
      this.b.u = $$3.u;
      this.b.ad = $$3.ad;
      this.b.ae = $$3.ae;
      this.b.aa = $$5;
      this.b.ab = $$6;
      this.a.a(this.b);
      this.a.a($$0, $$1.getBuffer(this.a.a(gvs.a($$4))), $$2, hgi.d);
      $$0.b();
   }
}
