public class gfs<T extends box, M extends fne<T>> extends ggj<T, M> {
   private static final ajc a = new ajc("textures/entity/elytra.png");
   private final fnb<T> b;

   public gfs(gdt<T, M> $$0, fqb $$1) {
      super($$0);
      this.b = new fnb<>($$1.a(fqe.S));
   }

   public void a(etd $$0, fwq $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      cpq $$10 = $$3.c(bom.e);
      if ($$10.a(cpt.nS)) {
         ajc $$13;
         if ($$3 instanceof fvp $$11) {
            giy $$12 = $$11.b();
            if ($$12.d() != null) {
               $$13 = $$12.d();
            } else if ($$12.c() != null && $$11.a(cib.a)) {
               $$13 = $$12.c();
            } else {
               $$13 = a;
            }
         } else {
            $$13 = a;
         }

         $$0.a();
         $$0.a(0.0F, 0.0F, 0.125F);
         this.c().a(this.b);
         this.b.a($$3, $$4, $$5, $$7, $$8, $$9);
         eth $$17 = gcw.a($$1, fwy.a($$13), false, $$10.C());
         this.b.a($$0, $$17, $$2, ghq.d, 1.0F, 1.0F, 1.0F, 1.0F);
         $$0.b();
      }
   }
}
