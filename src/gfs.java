import java.util.Calendar;

public class gfs<T extends dpf & dqi> implements gfm<T> {
   private static final String a = "bottom";
   private static final String b = "lid";
   private static final String c = "lock";
   private final fwy d;
   private final fwy e;
   private final fwy f;
   private final fwy g;
   private final fwy h;
   private final fwy i;
   private final fwy j;
   private final fwy k;
   private final fwy l;
   private boolean m;

   public gfs(gfn.a $$0) {
      Calendar $$1 = Calendar.getInstance();
      if ($$1.get(2) + 1 == 12 && $$1.get(5) >= 24 && $$1.get(5) <= 26) {
         this.m = true;
      }

      fwy $$2 = $$0.a(fwx.x);
      this.e = $$2.b("bottom");
      this.d = $$2.b("lid");
      this.f = $$2.b("lock");
      fwy $$3 = $$0.a(fwx.O);
      this.h = $$3.b("bottom");
      this.g = $$3.b("lid");
      this.i = $$3.b("lock");
      fwy $$4 = $$0.a(fwx.P);
      this.k = $$4.b("bottom");
      this.j = $$4.b("lid");
      this.l = $$4.b("lock");
   }

   public static fxe b() {
      fxg $$0 = new fxg();
      fxh $$1 = $$0.a();
      $$1.a("bottom", fxd.c().a(0, 19).a(1.0F, 0.0F, 1.0F, 14.0F, 10.0F, 14.0F), fxa.a);
      $$1.a("lid", fxd.c().a(0, 0).a(1.0F, 0.0F, 0.0F, 14.0F, 5.0F, 14.0F), fxa.a(0.0F, 9.0F, 1.0F));
      $$1.a("lock", fxd.c().a(0, 0).a(7.0F, -2.0F, 14.0F, 2.0F, 4.0F, 1.0F), fxa.a(0.0F, 9.0F, 1.0F));
      return fxe.a($$0, 64, 64);
   }

   public static fxe c() {
      fxg $$0 = new fxg();
      fxh $$1 = $$0.a();
      $$1.a("bottom", fxd.c().a(0, 19).a(1.0F, 0.0F, 1.0F, 15.0F, 10.0F, 14.0F), fxa.a);
      $$1.a("lid", fxd.c().a(0, 0).a(1.0F, 0.0F, 0.0F, 15.0F, 5.0F, 14.0F), fxa.a(0.0F, 9.0F, 1.0F));
      $$1.a("lock", fxd.c().a(0, 0).a(15.0F, -2.0F, 14.0F, 1.0F, 4.0F, 1.0F), fxa.a(0.0F, 9.0F, 1.0F));
      return fxe.a($$0, 64, 64);
   }

   public static fxe d() {
      fxg $$0 = new fxg();
      fxh $$1 = $$0.a();
      $$1.a("bottom", fxd.c().a(0, 19).a(0.0F, 0.0F, 1.0F, 15.0F, 10.0F, 14.0F), fxa.a);
      $$1.a("lid", fxd.c().a(0, 0).a(0.0F, 0.0F, 0.0F, 15.0F, 5.0F, 14.0F), fxa.a(0.0F, 9.0F, 1.0F));
      $$1.a("lock", fxd.c().a(0, 0).a(0.0F, -2.0F, 14.0F, 1.0F, 4.0F, 1.0F), fxa.a(0.0F, 9.0F, 1.0F));
      return fxe.a($$0, 64, 64);
   }

   @Override
   public void a(T $$0, float $$1, ezw $$2, gdm $$3, int $$4, int $$5) {
      dbw $$6 = $$0.i();
      boolean $$7 = $$6 != null;
      dsa $$8 = $$7 ? $$0.n() : dez.cv.o().a(dga.c, je.d);
      dss $$9 = $$8.b(dga.d) ? $$8.c(dga.d) : dss.a;
      if ($$8.b() instanceof ddr<?> $$11) {
         boolean $$12 = $$9 != dss.a;
         $$2.a();
         float $$13 = $$8.c(dga.c).p();
         $$2.a(0.5F, 0.5F, 0.5F);
         $$2.a(a.d.rotationDegrees(-$$13));
         $$2.a(-0.5F, -0.5F, -0.5F);
         dhe.c<? extends dpm> $$14;
         if ($$7) {
            $$14 = $$11.a($$8, $$6, $$0.az_(), true);
         } else {
            $$14 = dhe.b::b;
         }

         float $$16 = $$14.apply(dga.a($$0)).get($$1);
         $$16 = 1.0F - $$16;
         $$16 = 1.0F - $$16 * $$16 * $$16;
         int $$17 = $$14.apply(new gfp<>()).applyAsInt($$4);
         grb $$18 = geb.a($$0, $$9, this.m);
         faa $$19 = $$18.a($$3, gdu::d);
         if ($$12) {
            if ($$9 == dss.b) {
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

   private void a(ezw $$0, faa $$1, fwy $$2, fwy $$3, fwy $$4, float $$5, int $$6, int $$7) {
      $$2.e = -($$5 * (float) (Math.PI / 2));
      $$3.e = $$2.e;
      $$2.a($$0, $$1, $$6, $$7);
      $$3.a($$0, $$1, $$6, $$7);
      $$4.a($$0, $$1, $$6, $$7);
   }
}
