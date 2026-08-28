import java.util.Calendar;

public class gft<T extends dpg & dqj> implements gfn<T> {
   private static final String a = "bottom";
   private static final String b = "lid";
   private static final String c = "lock";
   private final fwz d;
   private final fwz e;
   private final fwz f;
   private final fwz g;
   private final fwz h;
   private final fwz i;
   private final fwz j;
   private final fwz k;
   private final fwz l;
   private boolean m;

   public gft(gfo.a $$0) {
      Calendar $$1 = Calendar.getInstance();
      if ($$1.get(2) + 1 == 12 && $$1.get(5) >= 24 && $$1.get(5) <= 26) {
         this.m = true;
      }

      fwz $$2 = $$0.a(fwy.x);
      this.e = $$2.b("bottom");
      this.d = $$2.b("lid");
      this.f = $$2.b("lock");
      fwz $$3 = $$0.a(fwy.O);
      this.h = $$3.b("bottom");
      this.g = $$3.b("lid");
      this.i = $$3.b("lock");
      fwz $$4 = $$0.a(fwy.P);
      this.k = $$4.b("bottom");
      this.j = $$4.b("lid");
      this.l = $$4.b("lock");
   }

   public static fxf b() {
      fxh $$0 = new fxh();
      fxi $$1 = $$0.a();
      $$1.a("bottom", fxe.c().a(0, 19).a(1.0F, 0.0F, 1.0F, 14.0F, 10.0F, 14.0F), fxb.a);
      $$1.a("lid", fxe.c().a(0, 0).a(1.0F, 0.0F, 0.0F, 14.0F, 5.0F, 14.0F), fxb.a(0.0F, 9.0F, 1.0F));
      $$1.a("lock", fxe.c().a(0, 0).a(7.0F, -2.0F, 14.0F, 2.0F, 4.0F, 1.0F), fxb.a(0.0F, 9.0F, 1.0F));
      return fxf.a($$0, 64, 64);
   }

   public static fxf c() {
      fxh $$0 = new fxh();
      fxi $$1 = $$0.a();
      $$1.a("bottom", fxe.c().a(0, 19).a(1.0F, 0.0F, 1.0F, 15.0F, 10.0F, 14.0F), fxb.a);
      $$1.a("lid", fxe.c().a(0, 0).a(1.0F, 0.0F, 0.0F, 15.0F, 5.0F, 14.0F), fxb.a(0.0F, 9.0F, 1.0F));
      $$1.a("lock", fxe.c().a(0, 0).a(15.0F, -2.0F, 14.0F, 1.0F, 4.0F, 1.0F), fxb.a(0.0F, 9.0F, 1.0F));
      return fxf.a($$0, 64, 64);
   }

   public static fxf d() {
      fxh $$0 = new fxh();
      fxi $$1 = $$0.a();
      $$1.a("bottom", fxe.c().a(0, 19).a(0.0F, 0.0F, 1.0F, 15.0F, 10.0F, 14.0F), fxb.a);
      $$1.a("lid", fxe.c().a(0, 0).a(0.0F, 0.0F, 0.0F, 15.0F, 5.0F, 14.0F), fxb.a(0.0F, 9.0F, 1.0F));
      $$1.a("lock", fxe.c().a(0, 0).a(0.0F, -2.0F, 14.0F, 1.0F, 4.0F, 1.0F), fxb.a(0.0F, 9.0F, 1.0F));
      return fxf.a($$0, 64, 64);
   }

   @Override
   public void a(T $$0, float $$1, ezx $$2, gdn $$3, int $$4, int $$5) {
      dbx $$6 = $$0.i();
      boolean $$7 = $$6 != null;
      dsb $$8 = $$7 ? $$0.n() : dfa.cv.o().a(dgb.c, je.d);
      dst $$9 = $$8.b(dgb.d) ? $$8.c(dgb.d) : dst.a;
      if ($$8.b() instanceof dds<?> $$11) {
         boolean $$12 = $$9 != dst.a;
         $$2.a();
         float $$13 = $$8.c(dgb.c).p();
         $$2.a(0.5F, 0.5F, 0.5F);
         $$2.a(a.d.rotationDegrees(-$$13));
         $$2.a(-0.5F, -0.5F, -0.5F);
         dhf.c<? extends dpn> $$14;
         if ($$7) {
            $$14 = $$11.a($$8, $$6, $$0.ay_(), true);
         } else {
            $$14 = dhf.b::b;
         }

         float $$16 = $$14.apply(dgb.a($$0)).get($$1);
         $$16 = 1.0F - $$16;
         $$16 = 1.0F - $$16 * $$16 * $$16;
         int $$17 = $$14.apply(new gfq<>()).applyAsInt($$4);
         grc $$18 = gec.a($$0, $$9, this.m);
         fab $$19 = $$18.a($$3, gdv::d);
         if ($$12) {
            if ($$9 == dst.b) {
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

   private void a(ezx $$0, fab $$1, fwz $$2, fwz $$3, fwz $$4, float $$5, int $$6, int $$7) {
      $$2.e = -($$5 * (float) (Math.PI / 2));
      $$3.e = $$2.e;
      $$2.a($$0, $$1, $$6, $$7);
      $$3.a($$0, $$1, $$6, $$7);
      $$4.a($$0, $$1, $$6, $$7);
   }
}
