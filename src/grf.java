public class grf<S extends gub, M extends fxk<S>> extends grw<S, M> {
   private static final alc a = alc.b("textures/entity/elytra.png");
   private final fxg b;
   private final fxg c;

   public grf(gpf<S, M> $$0, gah $$1) {
      super($$0);
      this.b = new fxg($$1.a(gak.ar));
      this.c = new fxg($$1.a(gak.as));
   }

   public void a(fde $$0, ghg $$1, int $$2, S $$3, float $$4, float $$5) {
      if ($$3.Q.a(cvt.nU)) {
         alc $$8;
         if ($$3 instanceof guw $$6) {
            gyc $$7 = $$6.a;
            if ($$7.d() != null) {
               $$8 = $$7.d();
            } else if ($$7.c() != null && $$6.aw) {
               $$8 = $$7.c();
            } else {
               $$8 = a;
            }
         } else {
            $$8 = a;
         }

         fxg $$12 = $$3.ae ? this.c : this.b;
         $$0.a();
         $$0.a(0.0F, 0.0F, 0.125F);
         $$12.a($$3);
         fdi $$13 = goh.a($$1, ghq.a($$8), $$3.Q.z());
         $$12.a($$0, $$13, $$2, gws.d);
         $$0.b();
      }
   }
}
