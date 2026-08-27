import java.util.Calendar;

public class gdk<T extends dnd & dog> implements gde<T> {
   private static final String a = "bottom";
   private static final String b = "lid";
   private static final String c = "lock";
   private final fur d;
   private final fur e;
   private final fur f;
   private final fur g;
   private final fur h;
   private final fur i;
   private final fur j;
   private final fur k;
   private final fur l;
   private boolean m;

   public gdk(gdf.a $$0) {
      Calendar $$1 = Calendar.getInstance();
      if ($$1.get(2) + 1 == 12 && $$1.get(5) >= 24 && $$1.get(5) <= 26) {
         this.m = true;
      }

      fur $$2 = $$0.a(fuq.x);
      this.e = $$2.b("bottom");
      this.d = $$2.b("lid");
      this.f = $$2.b("lock");
      fur $$3 = $$0.a(fuq.O);
      this.h = $$3.b("bottom");
      this.g = $$3.b("lid");
      this.i = $$3.b("lock");
      fur $$4 = $$0.a(fuq.P);
      this.k = $$4.b("bottom");
      this.j = $$4.b("lid");
      this.l = $$4.b("lock");
   }

   public static fux b() {
      fuz $$0 = new fuz();
      fva $$1 = $$0.a();
      $$1.a("bottom", fuw.c().a(0, 19).a(1.0F, 0.0F, 1.0F, 14.0F, 10.0F, 14.0F), fut.a);
      $$1.a("lid", fuw.c().a(0, 0).a(1.0F, 0.0F, 0.0F, 14.0F, 5.0F, 14.0F), fut.a(0.0F, 9.0F, 1.0F));
      $$1.a("lock", fuw.c().a(0, 0).a(7.0F, -2.0F, 14.0F, 2.0F, 4.0F, 1.0F), fut.a(0.0F, 9.0F, 1.0F));
      return fux.a($$0, 64, 64);
   }

   public static fux c() {
      fuz $$0 = new fuz();
      fva $$1 = $$0.a();
      $$1.a("bottom", fuw.c().a(0, 19).a(1.0F, 0.0F, 1.0F, 15.0F, 10.0F, 14.0F), fut.a);
      $$1.a("lid", fuw.c().a(0, 0).a(1.0F, 0.0F, 0.0F, 15.0F, 5.0F, 14.0F), fut.a(0.0F, 9.0F, 1.0F));
      $$1.a("lock", fuw.c().a(0, 0).a(15.0F, -2.0F, 14.0F, 1.0F, 4.0F, 1.0F), fut.a(0.0F, 9.0F, 1.0F));
      return fux.a($$0, 64, 64);
   }

   public static fux d() {
      fuz $$0 = new fuz();
      fva $$1 = $$0.a();
      $$1.a("bottom", fuw.c().a(0, 19).a(0.0F, 0.0F, 1.0F, 15.0F, 10.0F, 14.0F), fut.a);
      $$1.a("lid", fuw.c().a(0, 0).a(0.0F, 0.0F, 0.0F, 15.0F, 5.0F, 14.0F), fut.a(0.0F, 9.0F, 1.0F));
      $$1.a("lock", fuw.c().a(0, 0).a(0.0F, -2.0F, 14.0F, 1.0F, 4.0F, 1.0F), fut.a(0.0F, 9.0F, 1.0F));
      return fux.a($$0, 64, 64);
   }

   @Override
   public void a(T $$0, float $$1, exn $$2, gbe $$3, int $$4, int $$5) {
      czu $$6 = $$0.i();
      boolean $$7 = $$6 != null;
      dpy $$8 = $$7 ? $$0.n() : dcx.cv.n().a(ddy.c, ir.d);
      dqq $$9 = $$8.b(ddy.d) ? $$8.c(ddy.d) : dqq.a;
      if ($$8.b() instanceof dbp<?> $$11) {
         boolean $$12 = $$9 != dqq.a;
         $$2.a();
         float $$13 = $$8.c(ddy.c).p();
         $$2.a(0.5F, 0.5F, 0.5F);
         $$2.a(a.d.rotationDegrees(-$$13));
         $$2.a(-0.5F, -0.5F, -0.5F);
         dfc.c<? extends dnk> $$14;
         if ($$7) {
            $$14 = $$11.a($$8, $$6, $$0.az_(), true);
         } else {
            $$14 = dfc.b::b;
         }

         float $$16 = $$14.apply(ddy.a($$0)).get($$1);
         $$16 = 1.0F - $$16;
         $$16 = 1.0F - $$16 * $$16 * $$16;
         int $$17 = $$14.apply(new gdh<>()).applyAsInt($$4);
         gor $$18 = gbt.a($$0, $$9, this.m);
         exr $$19 = $$18.a($$3, gbm::d);
         if ($$12) {
            if ($$9 == dqq.b) {
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

   private void a(exn $$0, exr $$1, fur $$2, fur $$3, fur $$4, float $$5, int $$6, int $$7) {
      $$2.e = -($$5 * (float) (Math.PI / 2));
      $$3.e = $$2.e;
      $$2.a($$0, $$1, $$6, $$7);
      $$3.a($$0, $$1, $$6, $$7);
      $$4.a($$0, $$1, $$6, $$7);
   }
}
