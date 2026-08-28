import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.Objects;

public class gho implements avc {
   private static final dtx[] a = Arrays.stream(cuy.values())
      .sorted(Comparator.comparingInt(cuy::a))
      .map($$0 -> new dtx($$0, jh.c, dig.kP.m()))
      .toArray(dtx[]::new);
   private static final dtx b = new dtx(jh.c, dig.kP.m());
   private final dst c = new dst(jh.c, dig.cv.m());
   private final dst d = new duh(jh.c, dig.gV.m());
   private final dti e = new dti(jh.c, dig.fG.m());
   private final dsb f = new dsb(jh.c, dig.iJ.m());
   private final dsi g = new dsi(jh.c, dig.bn.m());
   private final dsy h = new dsy(jh.c, dig.mX.m());
   private final dtc i = new dtc(jh.c, dig.tp.m());
   private gab j;
   private gaq k;
   private Map<dpg.a, gah> l;
   private final gkr m;
   private final gbi n;

   public gho(gkr $$0, gbi $$1) {
      this.m = $$0;
      this.n = $$1;
   }

   @Override
   public void a(avb $$0) {
      this.j = new gab(this.n.a(gbl.ch));
      this.k = new gaq(this.n.a(gbl.cL));
      this.l = glh.a(this.n);
   }

   public void a(cwb $$0, cvz $$1, feb $$2, gih $$3, int $$4, int $$5) {
      cvx $$6 = $$0.h();
      if ($$6 instanceof cuh) {
         die $$7 = ((cuh)$$6).d();
         if ($$7 instanceof dha $$8) {
            cza $$9 = $$0.a(ku.ag);
            if ($$9 != null && !$$9.b()) {
               $$0.c(ku.ag);
               $$9.a().thenAcceptAsync($$1x -> $$0.b(ku.ag, $$1x), fji.Q());
               $$9 = null;
            }

            gah $$10 = this.l.get($$8.b());
            gir $$11 = glh.a($$8.b(), $$9);
            glh.a(null, 180.0F, 0.0F, $$2, $$3, $$4, $$10, $$11);
         } else {
            dvj $$12 = $$7.m();
            dsm $$13;
            if ($$7 instanceof dgv) {
               this.f.a($$0, ((dgv)$$7).b());
               $$13 = this.f;
            } else if ($$7 instanceof dhx) {
               this.g.a(((dhx)$$7).b());
               $$13 = this.g;
            } else if ($$12.a(dig.mX)) {
               $$13 = this.h;
            } else if ($$12.a(dig.cv)) {
               $$13 = this.c;
            } else if ($$12.a(dig.fG)) {
               $$13 = this.e;
            } else if ($$12.a(dig.gV)) {
               $$13 = this.d;
            } else if ($$12.a(dig.tp)) {
               this.i.c($$0);
               $$13 = this.i;
            } else {
               if (!($$7 instanceof dpd)) {
                  return;
               }

               cuy $$20 = dpd.b($$6);
               if ($$20 == null) {
                  $$13 = b;
               } else {
                  $$13 = a[$$20.a()];
               }
            }

            this.m.a($$13, $$2, $$3, $$4, $$5);
         }
      } else {
         if ($$0.a(cwf.vu)) {
            dsd $$24 = $$0.a(ku.ai, dsd.a);
            cuy $$25 = $$0.a(ku.aj);
            boolean $$26 = !$$24.b().isEmpty() || $$25 != null;
            $$2.a();
            $$2.b(1.0F, -1.0F, -1.0F);
            ham $$27 = $$26 ? hap.g : hap.h;
            fef $$28 = $$27.c().a(gpi.a($$3, this.j.a($$27.a()), $$1 == cvz.g, $$0.B()));
            this.j.c().a($$2, $$28, $$4, $$5);
            if ($$26) {
               gkn.a($$2, $$3, $$4, $$5, this.j.b(), $$27, false, Objects.requireNonNullElse($$25, cuy.a), $$24, $$0.B(), false);
            } else {
               this.j.b().a($$2, $$28, $$4, $$5);
            }

            $$2.b();
         } else if ($$0.a(cwf.vU)) {
            $$2.a();
            $$2.b(1.0F, -1.0F, -1.0F);
            fef $$29 = gpi.a($$3, this.k.a(gaq.a), false, $$0.B());
            this.k.a($$2, $$29, $$4, $$5);
            $$2.b();
         }
      }
   }
}
