import java.util.Calendar;

public class gky<T extends dsm & dtr> implements gks<T> {
   private final fxy a;
   private final fxy b;
   private final fxy c;
   private boolean d;

   public gky(gkt.a $$0) {
      Calendar $$1 = Calendar.getInstance();
      if ($$1.get(2) + 1 == 12 && $$1.get(5) >= 24 && $$1.get(5) <= 26) {
         this.d = true;
      }

      this.a = new fxy($$0.a(gbl.K));
      this.b = new fxy($$0.a(gbl.af));
      this.c = new fxy($$0.a(gbl.ag));
   }

   @Override
   public void a(T $$0, float $$1, feb $$2, gih $$3, int $$4, int $$5) {
      dfb $$6 = $$0.i();
      boolean $$7 = $$6 != null;
      dvj $$8 = $$7 ? $$0.m() : dig.cv.m().b(djh.c, jm.d);
      dwb $$9 = $$8.b(djh.d) ? $$8.c(djh.d) : dwb.a;
      if ($$8.b() instanceof dgy<?> $$11) {
         boolean $$12 = $$9 != dwb.a;
         $$2.a();
         float $$13 = $$8.c(djh.c).p();
         $$2.a(0.5F, 0.5F, 0.5F);
         $$2.a(a.d.rotationDegrees(-$$13));
         $$2.a(-0.5F, -0.5F, -0.5F);
         dkl.c<? extends dst> $$14;
         if ($$7) {
            $$14 = $$11.a($$8, $$6, $$0.aB_(), true);
         } else {
            $$14 = dkl.b::b;
         }

         float $$16 = $$14.apply(djh.a($$0)).get($$1);
         $$16 = 1.0F - $$16;
         $$16 = 1.0F - $$16 * $$16 * $$16;
         int $$17 = $$14.apply(new gkv<>()).applyAsInt($$4);
         ham $$18 = gjc.a($$0, $$9, this.d);
         fef $$19 = $$18.a($$3, gir::e);
         if ($$12) {
            if ($$9 == dwb.b) {
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

   private void a(feb $$0, fef $$1, fxy $$2, float $$3, int $$4, int $$5) {
      $$2.a($$3);
      $$2.a($$0, $$1, $$4, $$5);
   }
}
