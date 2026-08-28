import java.util.Calendar;

public class ggd<T extends dpn & dqq> implements gfx<T> {
   private static final String a = "bottom";
   private static final String b = "lid";
   private static final String c = "lock";
   private final fxi d;
   private final fxi e;
   private final fxi f;
   private final fxi g;
   private final fxi h;
   private final fxi i;
   private final fxi j;
   private final fxi k;
   private final fxi l;
   private boolean m;

   public ggd(gfy.a $$0) {
      Calendar $$1 = Calendar.getInstance();
      if ($$1.get(2) + 1 == 12 && $$1.get(5) >= 24 && $$1.get(5) <= 26) {
         this.m = true;
      }

      fxi $$2 = $$0.a(fxh.x);
      this.e = $$2.b("bottom");
      this.d = $$2.b("lid");
      this.f = $$2.b("lock");
      fxi $$3 = $$0.a(fxh.O);
      this.h = $$3.b("bottom");
      this.g = $$3.b("lid");
      this.i = $$3.b("lock");
      fxi $$4 = $$0.a(fxh.P);
      this.k = $$4.b("bottom");
      this.j = $$4.b("lid");
      this.l = $$4.b("lock");
   }

   public static fxo b() {
      fxq $$0 = new fxq();
      fxr $$1 = $$0.a();
      $$1.a("bottom", fxn.c().a(0, 19).a(1.0F, 0.0F, 1.0F, 14.0F, 10.0F, 14.0F), fxk.a);
      $$1.a("lid", fxn.c().a(0, 0).a(1.0F, 0.0F, 0.0F, 14.0F, 5.0F, 14.0F), fxk.a(0.0F, 9.0F, 1.0F));
      $$1.a("lock", fxn.c().a(0, 0).a(7.0F, -2.0F, 14.0F, 2.0F, 4.0F, 1.0F), fxk.a(0.0F, 9.0F, 1.0F));
      return fxo.a($$0, 64, 64);
   }

   public static fxo c() {
      fxq $$0 = new fxq();
      fxr $$1 = $$0.a();
      $$1.a("bottom", fxn.c().a(0, 19).a(1.0F, 0.0F, 1.0F, 15.0F, 10.0F, 14.0F), fxk.a);
      $$1.a("lid", fxn.c().a(0, 0).a(1.0F, 0.0F, 0.0F, 15.0F, 5.0F, 14.0F), fxk.a(0.0F, 9.0F, 1.0F));
      $$1.a("lock", fxn.c().a(0, 0).a(15.0F, -2.0F, 14.0F, 1.0F, 4.0F, 1.0F), fxk.a(0.0F, 9.0F, 1.0F));
      return fxo.a($$0, 64, 64);
   }

   public static fxo d() {
      fxq $$0 = new fxq();
      fxr $$1 = $$0.a();
      $$1.a("bottom", fxn.c().a(0, 19).a(0.0F, 0.0F, 1.0F, 15.0F, 10.0F, 14.0F), fxk.a);
      $$1.a("lid", fxn.c().a(0, 0).a(0.0F, 0.0F, 0.0F, 15.0F, 5.0F, 14.0F), fxk.a(0.0F, 9.0F, 1.0F));
      $$1.a("lock", fxn.c().a(0, 0).a(0.0F, -2.0F, 14.0F, 1.0F, 4.0F, 1.0F), fxk.a(0.0F, 9.0F, 1.0F));
      return fxo.a($$0, 64, 64);
   }

   @Override
   public void a(T $$0, float $$1, fag $$2, gdx $$3, int $$4, int $$5) {
      dcd $$6 = $$0.i();
      boolean $$7 = $$6 != null;
      dsh $$8 = $$7 ? $$0.n() : dfh.cv.o().a(dgi.c, jf.d);
      dsz $$9 = $$8.b(dgi.d) ? $$8.c(dgi.d) : dsz.a;
      if ($$8.b() instanceof ddz<?> $$11) {
         boolean $$12 = $$9 != dsz.a;
         $$2.a();
         float $$13 = $$8.c(dgi.c).p();
         $$2.a(0.5F, 0.5F, 0.5F);
         $$2.a(a.d.rotationDegrees(-$$13));
         $$2.a(-0.5F, -0.5F, -0.5F);
         dhm.c<? extends dpu> $$14;
         if ($$7) {
            $$14 = $$11.a($$8, $$6, $$0.az_(), true);
         } else {
            $$14 = dhm.b::b;
         }

         float $$16 = $$14.apply(dgi.a($$0)).get($$1);
         $$16 = 1.0F - $$16;
         $$16 = 1.0F - $$16 * $$16 * $$16;
         int $$17 = $$14.apply(new gga<>()).applyAsInt($$4);
         grm $$18 = gem.a($$0, $$9, this.m);
         fak $$19 = $$18.a($$3, gef::d);
         if ($$12) {
            if ($$9 == dsz.b) {
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

   private void a(fag $$0, fak $$1, fxi $$2, fxi $$3, fxi $$4, float $$5, int $$6, int $$7) {
      $$2.e = -($$5 * (float) (Math.PI / 2));
      $$3.e = $$2.e;
      $$2.a($$0, $$1, $$6, $$7);
      $$3.a($$0, $$1, $$6, $$7);
      $$4.a($$0, $$1, $$6, $$7);
   }
}
