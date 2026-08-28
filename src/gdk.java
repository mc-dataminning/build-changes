import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.Objects;

public class gdk implements atv {
   private static final dqw[] a = Arrays.stream(cst.values())
      .sorted(Comparator.comparingInt(cst::a))
      .map($$0 -> new dqw($$0, ja.c, dfh.kP.o()))
      .toArray(dqw[]::new);
   private static final dqw b = new dqw(ja.c, dfh.kP.o());
   private final dpu c = new dpu(ja.c, dfh.cv.o());
   private final dpu d = new drg(ja.c, dfh.gV.o());
   private final dqi e = new dqi(ja.c, dfh.fG.o());
   private final dpc f = new dpc(ja.c, dfh.iJ.o());
   private final dpj g = new dpj(ja.c, dfh.bn.o());
   private final dpz h = new dpz(ja.c, dfh.mX.o());
   private final dqd i = new dqd(ja.c, dfh.tp.o());
   private fvz j;
   private fwn k;
   private Map<dmh.a, fwf> l;
   private final gfw m;
   private final fxe n;

   public gdk(gfw $$0, fxe $$1) {
      this.m = $$0;
      this.n = $$1;
   }

   @Override
   public void a(atu $$0) {
      this.j = new fvz(this.n.a(fxh.bj));
      this.k = new fwn(this.n.a(fxh.bI));
      this.l = ggm.a(this.n);
   }

   public void a(cua $$0, ctx $$1, fag $$2, gdx $$3, int $$4, int $$5) {
      ctv $$6 = $$0.g();
      if ($$6 instanceof cry) {
         dff $$7 = ((cry)$$6).d();
         if ($$7 instanceof deb $$8) {
            cxb $$9 = $$0.a(kn.V);
            if ($$9 != null && !$$9.b()) {
               $$0.c(kn.V);
               $$9.a().thenAcceptAsync($$1x -> $$0.b(kn.V, $$1x), ffn.Q());
               $$9 = null;
            }

            fwf $$10 = this.l.get($$8.b());
            gef $$11 = ggm.a($$8.b(), $$9);
            ggm.a(null, 180.0F, 0.0F, $$2, $$3, $$4, $$10, $$11);
         } else {
            dsh $$12 = $$7.o();
            dpn $$13;
            if ($$7 instanceof ddw) {
               this.f.a($$0, ((ddw)$$7).b());
               $$13 = this.f;
            } else if ($$7 instanceof dey) {
               this.g.a(((dey)$$7).b());
               $$13 = this.g;
            } else if ($$12.a(dfh.mX)) {
               $$13 = this.h;
            } else if ($$12.a(dfh.cv)) {
               $$13 = this.c;
            } else if ($$12.a(dfh.fG)) {
               $$13 = this.e;
            } else if ($$12.a(dfh.gV)) {
               $$13 = this.d;
            } else if ($$12.a(dfh.tp)) {
               this.i.c($$0);
               $$13 = this.i;
            } else {
               if (!($$7 instanceof dme)) {
                  return;
               }

               cst $$20 = dme.b($$6);
               if ($$20 == null) {
                  $$13 = b;
               } else {
                  $$13 = a[$$20.a()];
               }
            }

            this.m.a($$13, $$2, $$3, $$4, $$5);
         }
      } else {
         if ($$0.a(cud.vs)) {
            dpe $$24 = $$0.a(kn.X, dpe.a);
            cst $$25 = $$0.a(kn.Y);
            boolean $$26 = !$$24.b().isEmpty() || $$25 != null;
            $$2.a();
            $$2.b(1.0F, -1.0F, -1.0F);
            grm $$27 = $$26 ? gro.g : gro.h;
            fak $$28 = $$27.c().a(gke.c($$3, this.j.a($$27.a()), true, $$0.x()));
            this.j.c().a($$2, $$28, $$4, $$5, 1.0F, 1.0F, 1.0F, 1.0F);
            if ($$26) {
               gfs.a($$2, $$3, $$4, $$5, this.j.b(), $$27, false, Objects.requireNonNullElse($$25, cst.a), $$24, $$0.x());
            } else {
               this.j.b().a($$2, $$28, $$4, $$5, 1.0F, 1.0F, 1.0F, 1.0F);
            }

            $$2.b();
         } else if ($$0.a(cud.vS)) {
            $$2.a();
            $$2.b(1.0F, -1.0F, -1.0F);
            fak $$29 = gke.c($$3, this.k.a(fwn.a), false, $$0.x());
            this.k.a($$2, $$29, $$4, $$5, 1.0F, 1.0F, 1.0F, 1.0F);
            $$2.b();
         }
      }
   }
}
