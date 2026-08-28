import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.Objects;

public class ghd implements avb {
   private static final dtr[] a = Arrays.stream(cuu.values())
      .sorted(Comparator.comparingInt(cuu::a))
      .map($$0 -> new dtr($$0, jg.c, dia.kP.m()))
      .toArray(dtr[]::new);
   private static final dtr b = new dtr(jg.c, dia.kP.m());
   private final dsn c = new dsn(jg.c, dia.cv.m());
   private final dsn d = new dub(jg.c, dia.gV.m());
   private final dtc e = new dtc(jg.c, dia.fG.m());
   private final drv f = new drv(jg.c, dia.iJ.m());
   private final dsc g = new dsc(jg.c, dia.bn.m());
   private final dss h = new dss(jg.c, dia.mX.m());
   private final dsw i = new dsw(jg.c, dia.tp.m());
   private fzq j;
   private gaf k;
   private Map<dpa.a, fzw> l;
   private final gkg m;
   private final gax n;

   public ghd(gkg $$0, gax $$1) {
      this.m = $$0;
      this.n = $$1;
   }

   @Override
   public void a(ava $$0) {
      this.j = new fzq(this.n.a(gba.ch));
      this.k = new gaf(this.n.a(gba.cL));
      this.l = gkw.a(this.n);
   }

   public void a(cvx $$0, cvv $$1, fdt $$2, ghw $$3, int $$4, int $$5) {
      cvt $$6 = $$0.h();
      if ($$6 instanceof cuc) {
         dhy $$7 = ((cuc)$$6).d();
         if ($$7 instanceof dgu $$8) {
            cyu $$9 = $$0.a(kt.af);
            if ($$9 != null && !$$9.b()) {
               $$0.c(kt.af);
               $$9.a().thenAcceptAsync($$1x -> $$0.b(kt.af, $$1x), fja.Q());
               $$9 = null;
            }

            fzw $$10 = this.l.get($$8.b());
            gig $$11 = gkw.a($$8.b(), $$9);
            gkw.a(null, 180.0F, 0.0F, $$2, $$3, $$4, $$10, $$11);
         } else {
            dvd $$12 = $$7.m();
            dsg $$13;
            if ($$7 instanceof dgp) {
               this.f.a($$0, ((dgp)$$7).b());
               $$13 = this.f;
            } else if ($$7 instanceof dhr) {
               this.g.a(((dhr)$$7).b());
               $$13 = this.g;
            } else if ($$12.a(dia.mX)) {
               $$13 = this.h;
            } else if ($$12.a(dia.cv)) {
               $$13 = this.c;
            } else if ($$12.a(dia.fG)) {
               $$13 = this.e;
            } else if ($$12.a(dia.gV)) {
               $$13 = this.d;
            } else if ($$12.a(dia.tp)) {
               this.i.c($$0);
               $$13 = this.i;
            } else {
               if (!($$7 instanceof dox)) {
                  return;
               }

               cuu $$20 = dox.b($$6);
               if ($$20 == null) {
                  $$13 = b;
               } else {
                  $$13 = a[$$20.a()];
               }
            }

            this.m.a($$13, $$2, $$3, $$4, $$5);
         }
      } else {
         if ($$0.a(cwb.vu)) {
            drx $$24 = $$0.a(kt.ah, drx.a);
            cuu $$25 = $$0.a(kt.ai);
            boolean $$26 = !$$24.b().isEmpty() || $$25 != null;
            $$2.a();
            $$2.b(1.0F, -1.0F, -1.0F);
            hab $$27 = $$26 ? hae.g : hae.h;
            fdx $$28 = $$27.c().a(gox.a($$3, this.j.a($$27.a()), $$1 == cvv.g, $$0.B()));
            this.j.c().a($$2, $$28, $$4, $$5);
            if ($$26) {
               gkc.a($$2, $$3, $$4, $$5, this.j.b(), $$27, false, Objects.requireNonNullElse($$25, cuu.a), $$24, $$0.B(), false);
            } else {
               this.j.b().a($$2, $$28, $$4, $$5);
            }

            $$2.b();
         } else if ($$0.a(cwb.vU)) {
            $$2.a();
            $$2.b(1.0F, -1.0F, -1.0F);
            fdx $$29 = gox.a($$3, this.k.a(gaf.a), false, $$0.B());
            this.k.a($$2, $$29, $$4, $$5);
            $$2.b();
         }
      }
   }
}
