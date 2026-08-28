public class hah extends hbh<hel, ghq> {
   private final ggy<hel> a;
   private final hlo b;

   public hah(gyq<hel, ghq> $$0, gjk $$1, hlo $$2) {
      super($$0);
      this.a = new gho<>($$1.a(gjn.ct));
      this.b = $$2;
   }

   private boolean a(czk $$0, hlp.d $$1) {
      dht $$2 = $$0.a(kk.D);
      if ($$2 != null && !$$2.d().isEmpty()) {
         hlp $$3 = this.b.a($$2.d().get());
         return !$$3.a($$1).isEmpty();
      } else {
         return false;
      }
   }

   public void a(fjy $$0, gqm $$1, int $$2, hel $$3, float $$4, float $$5) {
      if (!$$3.z && $$3.ay) {
         hkl $$6 = $$3.a;
         if ($$6.c() != null) {
            if (!this.a($$3.W, hlp.d.c)) {
               $$0.a();
               if (this.a($$3.W, hlp.d.a)) {
                  $$0.a(0.0F, -0.053125F, 0.06875F);
               }

               fkc $$7 = $$1.getBuffer(gqx.d($$6.c()));
               this.d().a(this.a);
               this.a.a($$3);
               this.a.a($$0, $$7, $$2, hja.d);
               $$0.b();
            }
         }
      }
   }
}
