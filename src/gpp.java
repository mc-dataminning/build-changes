import java.util.Calendar;

public class gpp<T extends dus & dvy> implements gpj<T> {
   private final gcm a;
   private final gcm b;
   private final gcm c;
   private final boolean d = b();

   public gpp(gpk.a $$0) {
      this.a = new gcm($$0.a(ggb.V));
      this.b = new gcm($$0.a(ggb.av));
      this.c = new gcm($$0.a(ggb.aw));
   }

   public static boolean b() {
      Calendar $$0 = Calendar.getInstance();
      return $$0.get(2) + 1 == 12 && $$0.get(5) >= 24 && $$0.get(5) <= 26;
   }

   @Override
   public void a(T $$0, float $$1, fgr $$2, gmx $$3, int $$4, int $$5) {
      dgz $$6 = $$0.i();
      boolean $$7 = $$6 != null;
      dxq $$8 = $$7 ? $$0.m() : dkg.cD.m().b(dlh.c, jn.d);
      dyi $$9 = $$8.b(dlh.d) ? $$8.c(dlh.d) : dyi.a;
      if ($$8.b() instanceof diy<?> $$11) {
         boolean $$12 = $$9 != dyi.a;
         $$2.a();
         float $$13 = $$8.c(dlh.c).p();
         $$2.a(0.5F, 0.5F, 0.5F);
         $$2.a(a.d.rotationDegrees(-$$13));
         $$2.a(-0.5F, -0.5F, -0.5F);
         dmm.c<? extends duz> $$14;
         if ($$7) {
            $$14 = $$11.a($$8, $$6, $$0.aA_(), true);
         } else {
            $$14 = dmm.b::b;
         }

         float $$16 = $$14.apply(dlh.a($$0)).get($$1);
         $$16 = 1.0F - $$16;
         $$16 = 1.0F - $$16 * $$16 * $$16;
         int $$17 = $$14.apply(new gpm<>()).applyAsInt($$4);
         hhy $$18 = gns.a($$0, $$9, this.d);
         fgv $$19 = $$18.a($$3, gnh::f);
         if ($$12) {
            if ($$9 == dyi.b) {
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

   private void a(fgr $$0, fgv $$1, gcm $$2, float $$3, int $$4, int $$5) {
      $$2.a($$3);
      $$2.a($$0, $$1, $$4, $$5);
   }
}
