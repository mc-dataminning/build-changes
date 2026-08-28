import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.Objects;

public class ggn implements auu {
   private static final dtd[] a = Arrays.stream(cuj.values())
      .sorted(Comparator.comparingInt(cuj::a))
      .map($$0 -> new dtd($$0, je.c, dhl.kP.o()))
      .toArray(dtd[]::new);
   private static final dtd b = new dtd(je.c, dhl.kP.o());
   private final drz c = new drz(je.c, dhl.cv.o());
   private final drz d = new dtn(je.c, dhl.gV.o());
   private final dso e = new dso(je.c, dhl.fG.o());
   private final drh f = new drh(je.c, dhl.iJ.o());
   private final dro g = new dro(je.c, dhl.bn.o());
   private final dse h = new dse(je.c, dhl.mX.o());
   private final dsi i = new dsi(je.c, dhl.tp.o());
   private fzb j;
   private fzp k;
   private Map<dom.a, fzh> l;
   private final gjq m;
   private final gah n;

   public ggn(gjq $$0, gah $$1) {
      this.m = $$0;
      this.n = $$1;
   }

   @Override
   public void a(aut $$0) {
      this.j = new fzb(this.n.a(gak.ch));
      this.k = new fzp(this.n.a(gak.cL));
      this.l = gkg.a(this.n);
   }

   public void a(cvp $$0, cvm $$1, fde $$2, ghg $$3, int $$4, int $$5) {
      cvk $$6 = $$0.h();
      if ($$6 instanceof ctr) {
         dhj $$7 = ((ctr)$$6).d();
         if ($$7 instanceof dgf $$8) {
            cys $$9 = $$0.a(kr.ab);
            if ($$9 != null && !$$9.b()) {
               $$0.c(kr.ab);
               $$9.a().thenAcceptAsync($$1x -> $$0.b(kr.ab, $$1x), fil.Q());
               $$9 = null;
            }

            fzh $$10 = this.l.get($$8.b());
            ghq $$11 = gkg.a($$8.b(), $$9);
            gkg.a(null, 180.0F, 0.0F, $$2, $$3, $$4, $$10, $$11);
         } else {
            duo $$12 = $$7.o();
            drs $$13;
            if ($$7 instanceof dga) {
               this.f.a($$0, ((dga)$$7).b());
               $$13 = this.f;
            } else if ($$7 instanceof dhc) {
               this.g.a(((dhc)$$7).b());
               $$13 = this.g;
            } else if ($$12.a(dhl.mX)) {
               $$13 = this.h;
            } else if ($$12.a(dhl.cv)) {
               $$13 = this.c;
            } else if ($$12.a(dhl.fG)) {
               $$13 = this.e;
            } else if ($$12.a(dhl.gV)) {
               $$13 = this.d;
            } else if ($$12.a(dhl.tp)) {
               this.i.c($$0);
               $$13 = this.i;
            } else {
               if (!($$7 instanceof doj)) {
                  return;
               }

               cuj $$20 = doj.b($$6);
               if ($$20 == null) {
                  $$13 = b;
               } else {
                  $$13 = a[$$20.a()];
               }
            }

            this.m.a($$13, $$2, $$3, $$4, $$5);
         }
      } else {
         if ($$0.a(cvt.vu)) {
            drj $$24 = $$0.a(kr.ad, drj.a);
            cuj $$25 = $$0.a(kr.ae);
            boolean $$26 = !$$24.b().isEmpty() || $$25 != null;
            $$2.a();
            $$2.b(1.0F, -1.0F, -1.0F);
            gzh $$27 = $$26 ? gzk.g : gzk.h;
            fdi $$28 = $$27.c().a(goh.a($$3, this.j.a($$27.a()), false, $$0.z()));
            this.j.d().a($$2, $$28, $$4, $$5);
            if ($$26) {
               gjm.a($$2, $$3, $$4, $$5, this.j.c(), $$27, false, Objects.requireNonNullElse($$25, cuj.a), $$24, $$0.z(), false);
            } else {
               this.j.c().a($$2, $$28, $$4, $$5);
            }

            $$2.b();
         } else if ($$0.a(cvt.vU)) {
            $$2.a();
            $$2.b(1.0F, -1.0F, -1.0F);
            fdi $$29 = goh.a($$3, this.k.a(fzp.a), false, $$0.z());
            this.k.a($$2, $$29, $$4, $$5);
            $$2.b();
         }
      }
   }
}
