import java.util.Calendar;

public class ggl<T extends dpq & dqu> implements ggf<T> {
   private static final String a = "bottom";
   private static final String b = "lid";
   private static final String c = "lock";
   private final fxq d;
   private final fxq e;
   private final fxq f;
   private final fxq g;
   private final fxq h;
   private final fxq i;
   private final fxq j;
   private final fxq k;
   private final fxq l;
   private boolean m;

   public ggl(ggg.a $$0) {
      Calendar $$1 = Calendar.getInstance();
      if ($$1.get(2) + 1 == 12 && $$1.get(5) >= 24 && $$1.get(5) <= 26) {
         this.m = true;
      }

      fxq $$2 = $$0.a(fxp.x);
      this.e = $$2.b("bottom");
      this.d = $$2.b("lid");
      this.f = $$2.b("lock");
      fxq $$3 = $$0.a(fxp.O);
      this.h = $$3.b("bottom");
      this.g = $$3.b("lid");
      this.i = $$3.b("lock");
      fxq $$4 = $$0.a(fxp.P);
      this.k = $$4.b("bottom");
      this.j = $$4.b("lid");
      this.l = $$4.b("lock");
   }

   public static fxw b() {
      fxy $$0 = new fxy();
      fxz $$1 = $$0.a();
      $$1.a("bottom", fxv.c().a(0, 19).a(1.0F, 0.0F, 1.0F, 14.0F, 10.0F, 14.0F), fxs.a);
      $$1.a("lid", fxv.c().a(0, 0).a(1.0F, 0.0F, 0.0F, 14.0F, 5.0F, 14.0F), fxs.a(0.0F, 9.0F, 1.0F));
      $$1.a("lock", fxv.c().a(0, 0).a(7.0F, -2.0F, 14.0F, 2.0F, 4.0F, 1.0F), fxs.a(0.0F, 9.0F, 1.0F));
      return fxw.a($$0, 64, 64);
   }

   public static fxw c() {
      fxy $$0 = new fxy();
      fxz $$1 = $$0.a();
      $$1.a("bottom", fxv.c().a(0, 19).a(1.0F, 0.0F, 1.0F, 15.0F, 10.0F, 14.0F), fxs.a);
      $$1.a("lid", fxv.c().a(0, 0).a(1.0F, 0.0F, 0.0F, 15.0F, 5.0F, 14.0F), fxs.a(0.0F, 9.0F, 1.0F));
      $$1.a("lock", fxv.c().a(0, 0).a(15.0F, -2.0F, 14.0F, 1.0F, 4.0F, 1.0F), fxs.a(0.0F, 9.0F, 1.0F));
      return fxw.a($$0, 64, 64);
   }

   public static fxw d() {
      fxy $$0 = new fxy();
      fxz $$1 = $$0.a();
      $$1.a("bottom", fxv.c().a(0, 19).a(0.0F, 0.0F, 1.0F, 15.0F, 10.0F, 14.0F), fxs.a);
      $$1.a("lid", fxv.c().a(0, 0).a(0.0F, 0.0F, 0.0F, 15.0F, 5.0F, 14.0F), fxs.a(0.0F, 9.0F, 1.0F));
      $$1.a("lock", fxv.c().a(0, 0).a(0.0F, -2.0F, 14.0F, 1.0F, 4.0F, 1.0F), fxs.a(0.0F, 9.0F, 1.0F));
      return fxw.a($$0, 64, 64);
   }

   @Override
   public void a(T $$0, float $$1, fao $$2, gef $$3, int $$4, int $$5) {
      dcg $$6 = $$0.i();
      boolean $$7 = $$6 != null;
      dsl $$8 = $$7 ? $$0.n() : dfk.cv.o().a(dgl.c, jf.d);
      dtd $$9 = $$8.b(dgl.d) ? $$8.c(dgl.d) : dtd.a;
      if ($$8.b() instanceof dec<?> $$11) {
         boolean $$12 = $$9 != dtd.a;
         $$2.a();
         float $$13 = $$8.c(dgl.c).p();
         $$2.a(0.5F, 0.5F, 0.5F);
         $$2.a(a.d.rotationDegrees(-$$13));
         $$2.a(-0.5F, -0.5F, -0.5F);
         dhp.c<? extends dpx> $$14;
         if ($$7) {
            $$14 = $$11.a($$8, $$6, $$0.az_(), true);
         } else {
            $$14 = dhp.b::b;
         }

         float $$16 = $$14.apply(dgl.a($$0)).get($$1);
         $$16 = 1.0F - $$16;
         $$16 = 1.0F - $$16 * $$16 * $$16;
         int $$17 = $$14.apply(new ggi<>()).applyAsInt($$4);
         gru $$18 = geu.a($$0, $$9, this.m);
         fas $$19 = $$18.a($$3, gen::d);
         if ($$12) {
            if ($$9 == dtd.b) {
               this.a($$2, $$19, this.g, this.i, this.h, $$16, $$17, $$5);
            } else {
               this.a($$2, $$19, this.j, this.l, this.k, $$16, $$17, $$5);
            }
         } else {
            this.a($$2, $$19, this.d, this.f, this.e, $$16, $$17, $$5);
         }

         $$2.b();
      }
   }

   private void a(fao $$0, fas $$1, fxq $$2, fxq $$3, fxq $$4, float $$5, int $$6, int $$7) {
      $$2.e = -($$5 * (float) (Math.PI / 2));
      $$3.e = $$2.e;
      $$2.a($$0, $$1, $$6, $$7);
      $$3.a($$0, $$1, $$6, $$7);
      $$4.a($$0, $$1, $$6, $$7);
   }
}
