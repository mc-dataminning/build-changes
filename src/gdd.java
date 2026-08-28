import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.Objects;

public class gdd implements auq {
   private static final dqs[] a = Arrays.stream(ctk.values())
      .sorted(Comparator.comparingInt(ctk::a))
      .map($$0 -> new dqs($$0, iz.c, dfd.kP.o()))
      .toArray(dqs[]::new);
   private static final dqs b = new dqs(iz.c, dfd.kP.o());
   private final dpq c = new dpq(iz.c, dfd.cv.o());
   private final dpq d = new drc(iz.c, dfd.gV.o());
   private final dqe e = new dqe(iz.c, dfd.fG.o());
   private final doy f = new doy(iz.c, dfd.iJ.o());
   private final dpf g = new dpf(iz.c, dfd.bn.o());
   private final dpv h = new dpv(iz.c, dfd.mX.o());
   private final dpz i = new dpz(iz.c, dfd.tp.o());
   private fvt j;
   private fwh k;
   private Map<dmd.a, fvz> l;
   private final gfp m;
   private final fwy n;

   public gdd(gfp $$0, fwy $$1) {
      this.m = $$0;
      this.n = $$1;
   }

   @Override
   public void a(aup $$0) {
      this.j = new fvt(this.n.a(fxb.bj));
      this.k = new fwh(this.n.a(fxb.bI));
      this.l = ggf.a(this.n);
   }

   public void a(cur $$0, cuo $$1, faa $$2, gdq $$3, int $$4, int $$5) {
      cum $$6 = $$0.g();
      if ($$6 instanceof csp) {
         dfb $$7 = ((csp)$$6).d();
         if ($$7 instanceof ddx $$8) {
            cxt $$9 = $$0.a(km.V);
            if ($$9 != null && !$$9.b()) {
               $$0.c(km.V);
               $$9.a().thenAcceptAsync($$1x -> $$0.b(km.V, $$1x), ffh.Q());
               $$9 = null;
            }

            fvz $$10 = this.l.get($$8.b());
            gdy $$11 = ggf.a($$8.b(), $$9);
            ggf.a(null, 180.0F, 0.0F, $$2, $$3, $$4, $$10, $$11);
         } else {
            dse $$12 = $$7.o();
            dpj $$13;
            if ($$7 instanceof dds) {
               this.f.a($$0, ((dds)$$7).b());
               $$13 = this.f;
            } else if ($$7 instanceof deu) {
               this.g.a(((deu)$$7).b());
               $$13 = this.g;
            } else if ($$12.a(dfd.mX)) {
               $$13 = this.h;
            } else if ($$12.a(dfd.cv)) {
               $$13 = this.c;
            } else if ($$12.a(dfd.fG)) {
               $$13 = this.e;
            } else if ($$12.a(dfd.gV)) {
               $$13 = this.d;
            } else if ($$12.a(dfd.tp)) {
               this.i.c($$0);
               $$13 = this.i;
            } else {
               if (!($$7 instanceof dma)) {
                  return;
               }

               ctk $$20 = dma.b($$6);
               if ($$20 == null) {
                  $$13 = b;
               } else {
                  $$13 = a[$$20.a()];
               }
            }

            this.m.a($$13, $$2, $$3, $$4, $$5);
         }
      } else {
         if ($$0.a(cuu.vs)) {
            dpa $$24 = $$0.a(km.X, dpa.a);
            ctk $$25 = $$0.a(km.Y);
            boolean $$26 = !$$24.b().isEmpty() || $$25 != null;
            $$2.a();
            $$2.b(1.0F, -1.0F, -1.0F);
            grf $$27 = $$26 ? grh.g : grh.h;
            fae $$28 = $$27.c().a(gjx.c($$3, this.j.a($$27.a()), true, $$0.y()));
            this.j.c().a($$2, $$28, $$4, $$5, 1.0F, 1.0F, 1.0F, 1.0F);
            if ($$26) {
               gfl.a($$2, $$3, $$4, $$5, this.j.b(), $$27, false, Objects.requireNonNullElse($$25, ctk.a), $$24, $$0.y());
            } else {
               this.j.b().a($$2, $$28, $$4, $$5, 1.0F, 1.0F, 1.0F, 1.0F);
            }

            $$2.b();
         } else if ($$0.a(cuu.vP)) {
            $$2.a();
            $$2.b(1.0F, -1.0F, -1.0F);
            fae $$29 = gjx.c($$3, this.k.a(fwh.a), false, $$0.y());
            this.k.a($$2, $$29, $$4, $$5, 1.0F, 1.0F, 1.0F, 1.0F);
            $$2.b();
         }
      }
   }
}
