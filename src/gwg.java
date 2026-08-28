public class gwg extends gwt<gza, gcm> {
   private final gcm a;
   private final gcm b;
   private final gwd c;

   public gwg(gub<gza, gcm> $$0, gez $$1, gwd $$2) {
      super($$0);
      this.c = $$2;
      this.a = new gcm($$1.a(gfc.be));
      this.b = new gcm($$1.a(gfc.bg));
   }

   public void a(ffu $$0, gly $$1, int $$2, gza $$3, float $$4, float $$5) {
      cwp $$6 = $$3.i;
      deu $$7 = $$6.a(kv.D);
      if ($$7 != null && !$$7.c().isEmpty()) {
         gcm $$8 = $$3.aj ? this.b : this.a;
         $$8.a($$3);
         this.c.a(hgy.d.e, $$7.c().get(), $$8, $$6, $$0, $$1, $$2);
      }
   }
}
