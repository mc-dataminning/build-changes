import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.Objects;

public class gar implements atp {
   private static final dom[] a = Arrays.stream(cqw.values())
      .sorted(Comparator.comparingInt(cqw::a))
      .map($$0 -> new dom($$0, im.c, dcx.kP.n()))
      .toArray(dom[]::new);
   private static final dom b = new dom(im.c, dcx.kP.n());
   private final dnk c = new dnk(im.c, dcx.cv.n());
   private final dnk d = new dow(im.c, dcx.gV.n());
   private final dny e = new dny(im.c, dcx.fG.n());
   private final dms f = new dms(im.c, dcx.iJ.n());
   private final dmz g = new dmz(im.c, dcx.bn.n());
   private final dnp h = new dnp(im.c, dcx.mX.n());
   private final dnt i = new dnt(im.c, dcx.tp.n());
   private fti j;
   private ftw k;
   private Map<djx.a, fto> l;
   private final gdd m;
   private final fun n;

   public gar(gdd $$0, fun $$1) {
      this.m = $$0;
      this.n = $$1;
   }

   @Override
   public void a(ato $$0) {
      this.j = new fti(this.n.a(fuq.bj));
      this.k = new ftw(this.n.a(fuq.bI));
      this.l = gdt.a(this.n);
   }

   public void a(csd $$0, csa $$1, exn $$2, gbe $$3, int $$4, int $$5) {
      cry $$6 = $$0.f();
      if ($$6 instanceof cqb) {
         dcv $$7 = ((cqb)$$6).d();
         if ($$7 instanceof dbr $$8) {
            cvd $$9 = $$0.a(jz.L);
            if ($$9 != null && !$$9.b()) {
               $$0.c(jz.L);
               $$9.a().thenAcceptAsync($$1x -> $$0.b(jz.L, $$1x), fcu.Q());
               $$9 = null;
            }

            fto $$10 = this.l.get($$8.b());
            gbm $$11 = gdt.a($$8.b(), $$9);
            gdt.a(null, 180.0F, 0.0F, $$2, $$3, $$4, $$10, $$11);
         } else {
            dpy $$12 = $$7.n();
            dnd $$13;
            if ($$7 instanceof dbm) {
               this.f.a($$0, ((dbm)$$7).b());
               $$13 = this.f;
            } else if ($$7 instanceof dco) {
               this.g.a(((dco)$$7).b());
               $$13 = this.g;
            } else if ($$12.a(dcx.mX)) {
               $$13 = this.h;
            } else if ($$12.a(dcx.cv)) {
               $$13 = this.c;
            } else if ($$12.a(dcx.fG)) {
               $$13 = this.e;
            } else if ($$12.a(dcx.gV)) {
               $$13 = this.d;
            } else if ($$12.a(dcx.tp)) {
               this.i.b($$0);
               $$13 = this.i;
            } else {
               if (!($$7 instanceof dju)) {
                  return;
               }

               cqw $$20 = dju.b($$6);
               if ($$20 == null) {
                  $$13 = b;
               } else {
                  $$13 = a[$$20.a()];
               }
            }

            this.m.a($$13, $$2, $$3, $$4, $$5);
         }
      } else {
         if ($$0.a(csg.vs)) {
            dmu $$24 = $$0.a(jz.N, dmu.a);
            cqw $$25 = $$0.a(jz.O);
            boolean $$26 = !$$24.b().isEmpty() || $$25 != null;
            $$2.a();
            $$2.b(1.0F, -1.0F, -1.0F);
            gor $$27 = $$26 ? got.g : got.h;
            exr $$28 = $$27.c().a(ghl.c($$3, this.j.a($$27.a()), true, $$0.x()));
            this.j.c().a($$2, $$28, $$4, $$5, 1.0F, 1.0F, 1.0F, 1.0F);
            if ($$26) {
               gcz.a($$2, $$3, $$4, $$5, this.j.b(), $$27, false, Objects.requireNonNullElse($$25, cqw.a), $$24, $$0.x());
            } else {
               this.j.b().a($$2, $$28, $$4, $$5, 1.0F, 1.0F, 1.0F, 1.0F);
            }

            $$2.b();
         } else if ($$0.a(csg.vP)) {
            $$2.a();
            $$2.b(1.0F, -1.0F, -1.0F);
            exr $$29 = ghl.c($$3, this.k.a(ftw.a), false, $$0.x());
            this.k.a($$2, $$29, $$4, $$5, 1.0F, 1.0F, 1.0F, 1.0F);
            $$2.b();
         }
      }
   }
}
