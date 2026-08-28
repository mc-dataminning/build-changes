public class gvs extends gwt<gzw, gdg> {
   private final gco<gzw> a;
   private final hgx b;

   public gvs(gub<gzw, gdg> $$0, gez $$1, hgx $$2) {
      super($$0);
      this.a = new gde<>($$1.a(gfc.cf));
      this.b = $$2;
   }

   private boolean a(cwp $$0, hgy.d $$1) {
      deu $$2 = $$0.a(kv.D);
      if ($$2 != null && !$$2.c().isEmpty()) {
         hgy $$3 = this.b.a($$2.c().get());
         return !$$3.a($$1).isEmpty();
      } else {
         return false;
      }
   }

   public void a(ffu $$0, gly $$1, int $$2, gzw $$3, float $$4, float $$5) {
      if (!$$3.z && $$3.ay) {
         hfu $$6 = $$3.a;
         if ($$6.c() != null) {
            if (!this.a($$3.W, hgy.d.c)) {
               $$0.a();
               if (this.a($$3.W, hgy.d.a)) {
                  $$0.a(0.0F, -0.053125F, 0.06875F);
               }

               ffy $$7 = $$1.getBuffer(gmi.d($$6.c()));
               this.d().a(this.a);
               this.a.a($$3);
               this.a.a($$0, $$7, $$2, hei.d);
               $$0.b();
            }
         }
      }
   }
}
