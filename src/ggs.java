import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.Objects;

public class ggs implements auw {
   private static final dtg[] a = Arrays.stream(cum.values())
      .sorted(Comparator.comparingInt(cum::a))
      .map($$0 -> new dtg($$0, jf.c, dho.kP.n()))
      .toArray(dtg[]::new);
   private static final dtg b = new dtg(jf.c, dho.kP.n());
   private final dsc c = new dsc(jf.c, dho.cv.n());
   private final dsc d = new dtq(jf.c, dho.gV.n());
   private final dsr e = new dsr(jf.c, dho.fG.n());
   private final drk f = new drk(jf.c, dho.iJ.n());
   private final drr g = new drr(jf.c, dho.bn.n());
   private final dsh h = new dsh(jf.c, dho.mX.n());
   private final dsl i = new dsl(jf.c, dho.tp.n());
   private fzf j;
   private fzu k;
   private Map<dop.a, fzl> l;
   private final gjv m;
   private final gam n;

   public ggs(gjv $$0, gam $$1) {
      this.m = $$0;
      this.n = $$1;
   }

   @Override
   public void a(auv $$0) {
      this.j = new fzf(this.n.a(gap.ch));
      this.k = new fzu(this.n.a(gap.cL));
      this.l = gkl.a(this.n);
   }

   public void a(cvs $$0, cvp $$1, fdi $$2, ghl $$3, int $$4, int $$5) {
      cvn $$6 = $$0.h();
      if ($$6 instanceof ctu) {
         dhm $$7 = ((ctu)$$6).d();
         if ($$7 instanceof dgi $$8) {
            cyv $$9 = $$0.a(ks.ab);
            if ($$9 != null && !$$9.b()) {
               $$0.c(ks.ab);
               $$9.a().thenAcceptAsync($$1x -> $$0.b(ks.ab, $$1x), fip.Q());
               $$9 = null;
            }

            fzl $$10 = this.l.get($$8.b());
            ghv $$11 = gkl.a($$8.b(), $$9);
            gkl.a(null, 180.0F, 0.0F, $$2, $$3, $$4, $$10, $$11);
         } else {
            dus $$12 = $$7.n();
            drv $$13;
            if ($$7 instanceof dgd) {
               this.f.a($$0, ((dgd)$$7).b());
               $$13 = this.f;
            } else if ($$7 instanceof dhf) {
               this.g.a(((dhf)$$7).b());
               $$13 = this.g;
            } else if ($$12.a(dho.mX)) {
               $$13 = this.h;
            } else if ($$12.a(dho.cv)) {
               $$13 = this.c;
            } else if ($$12.a(dho.fG)) {
               $$13 = this.e;
            } else if ($$12.a(dho.gV)) {
               $$13 = this.d;
            } else if ($$12.a(dho.tp)) {
               this.i.c($$0);
               $$13 = this.i;
            } else {
               if (!($$7 instanceof dom)) {
                  return;
               }

               cum $$20 = dom.b($$6);
               if ($$20 == null) {
                  $$13 = b;
               } else {
                  $$13 = a[$$20.a()];
               }
            }

            this.m.a($$13, $$2, $$3, $$4, $$5);
         }
      } else {
         if ($$0.a(cvw.vu)) {
            drm $$24 = $$0.a(ks.ad, drm.a);
            cum $$25 = $$0.a(ks.ae);
            boolean $$26 = !$$24.b().isEmpty() || $$25 != null;
            $$2.a();
            $$2.b(1.0F, -1.0F, -1.0F);
            gzm $$27 = $$26 ? gzp.g : gzp.h;
            fdm $$28 = $$27.c().a(gom.a($$3, this.j.a($$27.a()), $$1 == cvp.g, $$0.A()));
            this.j.c().a($$2, $$28, $$4, $$5);
            if ($$26) {
               gjr.a($$2, $$3, $$4, $$5, this.j.b(), $$27, false, Objects.requireNonNullElse($$25, cum.a), $$24, $$0.A(), false);
            } else {
               this.j.b().a($$2, $$28, $$4, $$5);
            }

            $$2.b();
         } else if ($$0.a(cvw.vU)) {
            $$2.a();
            $$2.b(1.0F, -1.0F, -1.0F);
            fdm $$29 = gom.a($$3, this.k.a(fzu.a), false, $$0.A());
            this.k.a($$2, $$29, $$4, $$5);
            $$2.b();
         }
      }
   }
}
