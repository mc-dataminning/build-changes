import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.Objects;

public class gdq implements atx {
   private static final dqz[] a = Arrays.stream(csv.values())
      .sorted(Comparator.comparingInt(csv::a))
      .map($$0 -> new dqz($$0, ja.c, dfj.kP.o()))
      .toArray(dqz[]::new);
   private static final dqz b = new dqz(ja.c, dfj.kP.o());
   private final dpw c = new dpw(ja.c, dfj.cv.o());
   private final dpw d = new drj(ja.c, dfj.gV.o());
   private final dql e = new dql(ja.c, dfj.fG.o());
   private final dpe f = new dpe(ja.c, dfj.iJ.o());
   private final dpl g = new dpl(ja.c, dfj.bn.o());
   private final dqb h = new dqb(ja.c, dfj.mX.o());
   private final dqf i = new dqf(ja.c, dfj.tp.o());
   private fwf j;
   private fwt k;
   private Map<dmj.a, fwl> l;
   private final ggc m;
   private final fxk n;

   public gdq(ggc $$0, fxk $$1) {
      this.m = $$0;
      this.n = $$1;
   }

   @Override
   public void a(atw $$0) {
      this.j = new fwf(this.n.a(fxn.bj));
      this.k = new fwt(this.n.a(fxn.bI));
      this.l = ggs.a(this.n);
   }

   public void a(cuc $$0, ctz $$1, fam $$2, ged $$3, int $$4, int $$5) {
      ctx $$6 = $$0.g();
      if ($$6 instanceof csb) {
         dfh $$7 = ((csb)$$6).d();
         if ($$7 instanceof ded $$8) {
            cxd $$9 = $$0.a(kn.V);
            if ($$9 != null && !$$9.b()) {
               $$0.c(kn.V);
               $$9.a().thenAcceptAsync($$1x -> $$0.b(kn.V, $$1x), fft.Q());
               $$9 = null;
            }

            fwl $$10 = this.l.get($$8.b());
            gel $$11 = ggs.a($$8.b(), $$9);
            ggs.a(null, 180.0F, 0.0F, $$2, $$3, $$4, $$10, $$11);
         } else {
            dsk $$12 = $$7.o();
            dpp $$13;
            if ($$7 instanceof ddy) {
               this.f.a($$0, ((ddy)$$7).b());
               $$13 = this.f;
            } else if ($$7 instanceof dfa) {
               this.g.a(((dfa)$$7).b());
               $$13 = this.g;
            } else if ($$12.a(dfj.mX)) {
               $$13 = this.h;
            } else if ($$12.a(dfj.cv)) {
               $$13 = this.c;
            } else if ($$12.a(dfj.fG)) {
               $$13 = this.e;
            } else if ($$12.a(dfj.gV)) {
               $$13 = this.d;
            } else if ($$12.a(dfj.tp)) {
               this.i.c($$0);
               $$13 = this.i;
            } else {
               if (!($$7 instanceof dmg)) {
                  return;
               }

               csv $$20 = dmg.b($$6);
               if ($$20 == null) {
                  $$13 = b;
               } else {
                  $$13 = a[$$20.a()];
               }
            }

            this.m.a($$13, $$2, $$3, $$4, $$5);
         }
      } else {
         if ($$0.a(cuf.vs)) {
            dpg $$24 = $$0.a(kn.X, dpg.a);
            csv $$25 = $$0.a(kn.Y);
            boolean $$26 = !$$24.b().isEmpty() || $$25 != null;
            $$2.a();
            $$2.b(1.0F, -1.0F, -1.0F);
            grs $$27 = $$26 ? gru.g : gru.h;
            faq $$28 = $$27.c().a(gkk.c($$3, this.j.a($$27.a()), true, $$0.x()));
            this.j.c().a($$2, $$28, $$4, $$5, 1.0F, 1.0F, 1.0F, 1.0F);
            if ($$26) {
               gfy.a($$2, $$3, $$4, $$5, this.j.b(), $$27, false, Objects.requireNonNullElse($$25, csv.a), $$24, $$0.x());
            } else {
               this.j.b().a($$2, $$28, $$4, $$5, 1.0F, 1.0F, 1.0F, 1.0F);
            }

            $$2.b();
         } else if ($$0.a(cuf.vS)) {
            $$2.a();
            $$2.b(1.0F, -1.0F, -1.0F);
            faq $$29 = gkk.c($$3, this.k.a(fwt.a), false, $$0.x());
            this.k.a($$2, $$29, $$4, $$5, 1.0F, 1.0F, 1.0F, 1.0F);
            $$2.b();
         }
      }
   }
}
