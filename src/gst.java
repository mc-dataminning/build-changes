import java.util.Calendar;

public class gst<T extends dxf & dym> implements gsm<T> {
   private final gfi a;
   private final gfi b;
   private final gfi c;
   private final boolean d = b();

   public gst(gsn.a $$0) {
      this.a = new gfi($$0.a(gjb.X));
      this.b = new gfi($$0.a(gjb.aD));
      this.c = new gfi($$0.a(gjb.aE));
   }

   public static boolean b() {
      Calendar $$0 = Calendar.getInstance();
      return $$0.get(2) + 1 == 12 && $$0.get(5) >= 24 && $$0.get(5) <= 26;
   }

   @Override
   public void a(T $$0, float $$1, fjj $$2, gqa $$3, int $$4, int $$5, feq $$6) {
      dja $$7 = $$0.i();
      boolean $$8 = $$7 != null;
      eah $$9 = $$8 ? $$0.m() : dmh.cG.m().b(dnj.c, ja.d);
      eaz $$10 = $$9.b(dnj.d) ? $$9.c(dnj.d) : eaz.a;
      if ($$9.b() instanceof dkz<?> $$12) {
         boolean $$13 = $$10 != eaz.a;
         $$2.a();
         float $$14 = $$9.c(dnj.c).p();
         $$2.a(0.5F, 0.5F, 0.5F);
         $$2.a(a.d.rotationDegrees(-$$14));
         $$2.a(-0.5F, -0.5F, -0.5F);
         don.c<? extends dxn> $$15;
         if ($$8) {
            $$15 = $$12.a($$9, $$7, $$0.ax_(), true);
         } else {
            $$15 = don.b::b;
         }

         float $$17 = $$15.apply(dnj.a($$0)).get($$1);
         $$17 = 1.0F - $$17;
         $$17 = 1.0F - $$17 * $$17 * $$17;
         int $$18 = $$15.apply(new gsq<>()).applyAsInt($$4);
         hle $$19 = gqv.a($$0, $$10, this.d);
         fjn $$20 = $$19.a($$3, gqk::f);
         if ($$13) {
            if ($$10 == eaz.b) {
               this.a($$2, $$20, this.b, $$17, $$18, $$5);
            } else {
               this.a($$2, $$20, this.c, $$17, $$18, $$5);
            }
         } else {
            this.a($$2, $$20, this.a, $$17, $$18, $$5);
         }

         $$2.b();
      }
   }

   private void a(fjj $$0, fjn $$1, gfi $$2, float $$3, int $$4, int $$5) {
      $$2.a($$3);
      $$2.a($$0, $$1, $$4, $$5);
   }
}
