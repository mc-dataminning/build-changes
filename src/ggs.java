public class ggs<T extends bpo, M extends foc<T>> extends ghj<T, M> {
   private static final ajh a = new ajh("textures/entity/elytra.png");
   private final fnz<T> b;

   public ggs(get<T, M> $$0, fqz $$1) {
      super($$0);
      this.b = new fnz<>($$1.a(frc.S));
   }

   public void a(etz $$0, fxq $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      cqk $$10 = $$3.d(bpd.e);
      if ($$10.a(cqn.nS)) {
         ajh $$13;
         if ($$3 instanceof fwp $$11) {
            gjy $$12 = $$11.b();
            if ($$12.d() != null) {
               $$13 = $$12.d();
            } else if ($$12.c() != null && $$11.a(cit.a)) {
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
         eud $$17 = gdw.a($$1, fxy.a($$13), false, $$10.C());
         this.b.a($$0, $$17, $$2, giq.d, 1.0F, 1.0F, 1.0F, 1.0F);
         $$0.b();
      }
   }
}
