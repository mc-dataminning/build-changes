import java.util.Calendar;

public class gqr<T extends dvl & dws> implements gqk<T> {
   private final gdm a;
   private final gdm b;
   private final gdm c;
   private final boolean d = b();

   public gqr(gql.a $$0) {
      this.a = new gdm($$0.a(ghc.X));
      this.b = new gdm($$0.a(ghc.az));
      this.c = new gdm($$0.a(ghc.aA));
   }

   public static boolean b() {
      Calendar $$0 = Calendar.getInstance();
      return $$0.get(2) + 1 == 12 && $$0.get(5) >= 24 && $$0.get(5) <= 26;
   }

   @Override
   public void a(T $$0, float $$1, fho $$2, gny $$3, int $$4, int $$5) {
      dhp $$6 = $$0.i();
      boolean $$7 = $$6 != null;
      dym $$8 = $$7 ? $$0.m() : dkw.cD.m().b(dlx.c, jo.d);
      dze $$9 = $$8.b(dlx.d) ? $$8.c(dlx.d) : dze.a;
      if ($$8.b() instanceof djo<?> $$11) {
         boolean $$12 = $$9 != dze.a;
         $$2.a();
         float $$13 = $$8.c(dlx.c).p();
         $$2.a(0.5F, 0.5F, 0.5F);
         $$2.a(a.d.rotationDegrees(-$$13));
         $$2.a(-0.5F, -0.5F, -0.5F);
         dnc.c<? extends dvt> $$14;
         if ($$7) {
            $$14 = $$11.a($$8, $$6, $$0.aw_(), true);
         } else {
            $$14 = dnc.b::b;
         }

         float $$16 = $$14.apply(dlx.a($$0)).get($$1);
         $$16 = 1.0F - $$16;
         $$16 = 1.0F - $$16 * $$16 * $$16;
         int $$17 = $$14.apply(new gqo<>()).applyAsInt($$4);
         hiz $$18 = got.a($$0, $$9, this.d);
         fhs $$19 = $$18.a($$3, goi::f);
         if ($$12) {
            if ($$9 == dze.b) {
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

   private void a(fho $$0, fhs $$1, gdm $$2, float $$3, int $$4, int $$5) {
      $$2.a($$3);
      $$2.a($$0, $$1, $$4, $$5);
   }
}
