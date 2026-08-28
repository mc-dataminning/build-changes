import java.util.Calendar;

public class gor<T extends dua & dvg> implements gol<T> {
   private final gbp a;
   private final gbp b;
   private final gbp c;
   private final boolean d = b();

   public gor(gom.a $$0) {
      this.a = new gbp($$0.a(gfd.V));
      this.b = new gbp($$0.a(gfd.at));
      this.c = new gbp($$0.a(gfd.au));
   }

   public static boolean b() {
      Calendar $$0 = Calendar.getInstance();
      return $$0.get(2) + 1 == 12 && $$0.get(5) >= 24 && $$0.get(5) <= 26;
   }

   @Override
   public void a(T $$0, float $$1, ffv $$2, glz $$3, int $$4, int $$5) {
      dgj $$6 = $$0.i();
      boolean $$7 = $$6 != null;
      dwy $$8 = $$7 ? $$0.m() : djp.cD.m().b(dkq.c, jn.d);
      dxq $$9 = $$8.b(dkq.d) ? $$8.c(dkq.d) : dxq.a;
      if ($$8.b() instanceof dih<?> $$11) {
         boolean $$12 = $$9 != dxq.a;
         $$2.a();
         float $$13 = $$8.c(dkq.c).p();
         $$2.a(0.5F, 0.5F, 0.5F);
         $$2.a(a.d.rotationDegrees(-$$13));
         $$2.a(-0.5F, -0.5F, -0.5F);
         dlv.c<? extends duh> $$14;
         if ($$7) {
            $$14 = $$11.a($$8, $$6, $$0.aA_(), true);
         } else {
            $$14 = dlv.b::b;
         }

         float $$16 = $$14.apply(dkq.a($$0)).get($$1);
         $$16 = 1.0F - $$16;
         $$16 = 1.0F - $$16 * $$16 * $$16;
         int $$17 = $$14.apply(new goo<>()).applyAsInt($$4);
         hha $$18 = gmu.a($$0, $$9, this.d);
         ffz $$19 = $$18.a($$3, gmj::f);
         if ($$12) {
            if ($$9 == dxq.b) {
               this.a($$2, $$19, this.b, $$16, $$17, $$5);
            } else {
               this.a($$2, $$19, this.c, $$16, $$17, $$5);
            }
         } else {
            this.a($$2, $$19, this.a, $$16, $$17, $$5);
         }

         $$2.b();
      }
   }

   private void a(ffv $$0, ffz $$1, gbp $$2, float $$3, int $$4, int $$5) {
      $$2.a($$3);
      $$2.a($$0, $$1, $$4, $$5);
   }
}
