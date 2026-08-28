import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.Objects;

public class gkn implements avm {
   private static final dwc[] a = Arrays.stream(cwd.values())
      .sorted(Comparator.comparingInt(cwd::a))
      .map($$0 -> new dwc($$0, jh.c, dkf.lr.m()))
      .toArray(dwc[]::new);
   private static final dwc b = new dwc(jh.c, dkf.lr.m());
   private final dux c = new dux(jh.c, dkf.cD.m());
   private final dux d = new dwm(jh.c, dkf.hs.m());
   private final dvn e = new dvn(jh.c, dkf.gb.m());
   private final duf f = new duf(jh.c, dkf.jh.m());
   private final dum g = new dum(jh.c, dkf.bu.m());
   private final dvc h = new dvc(jh.c, dkf.nz.m());
   private final dvh i = new dvh(jh.c, dkf.tR.m());
   private gcy j;
   private gdn k;
   private Map<drk.a, gde> l;
   private final gnq m;
   private final gef n;

   public gkn(gnq $$0, gef $$1) {
      this.m = $$0;
      this.n = $$1;
   }

   @Override
   public void a(avl $$0) {
      this.j = new gcy(this.n.a(gei.cD));
      this.k = new gdn(this.n.a(gei.dl));
      this.l = gog.a(this.n);
   }

   public void a(cxg $$0, cxe $$1, fgl $$2, glg $$3, int $$4, int $$5) {
      cxc $$6 = $$0.h();
      if ($$6 instanceof cvm) {
         dkd $$7 = ((cvm)$$6).d();
         if ($$7 instanceof diz $$8) {
            daf $$9 = $$0.a(ku.ag);
            if ($$9 != null && !$$9.b()) {
               $$0.c(ku.ag);
               $$9.a().thenAcceptAsync($$1x -> $$0.b(ku.ag, $$1x), flz.Q());
               $$9 = null;
            }

            gde $$10 = this.l.get($$8.b());
            glq $$11 = gog.a($$8.b(), $$9);
            gog.a(null, 180.0F, 0.0F, $$2, $$3, $$4, $$10, $$11);
         } else {
            dxo $$12 = $$7.m();
            duq $$13;
            if ($$7 instanceof diu) {
               this.f.a($$0, ((diu)$$7).b());
               $$13 = this.f;
            } else if ($$7 instanceof djw) {
               this.g.a(((djw)$$7).b());
               $$13 = this.g;
            } else if ($$12.a(dkf.nz)) {
               $$13 = this.h;
            } else if ($$12.a(dkf.cD)) {
               $$13 = this.c;
            } else if ($$12.a(dkf.gb)) {
               $$13 = this.e;
            } else if ($$12.a(dkf.hs)) {
               $$13 = this.d;
            } else if ($$12.a(dkf.tR)) {
               this.i.c($$0);
               $$13 = this.i;
            } else {
               if (!($$7 instanceof drh)) {
                  return;
               }

               cwd $$20 = drh.b($$6);
               if ($$20 == null) {
                  $$13 = b;
               } else {
                  $$13 = a[$$20.a()];
               }
            }

            this.m.a($$13, $$2, $$3, $$4, $$5);
         }
      } else {
         if ($$0.a(cxk.ws)) {
            duh $$24 = $$0.a(ku.ai, duh.a);
            cwd $$25 = $$0.a(ku.aj);
            boolean $$26 = !$$24.b().isEmpty() || $$25 != null;
            $$2.a();
            $$2.b(1.0F, -1.0F, -1.0F);
            hdp $$27 = $$26 ? hds.g : hds.h;
            fgp $$28 = $$27.c().a(gsj.a($$3, this.j.a($$27.a()), $$1 == cxe.g, $$0.C()));
            this.j.c().a($$2, $$28, $$4, $$5);
            if ($$26) {
               gnm.a($$2, $$3, $$4, $$5, this.j.b(), $$27, false, Objects.requireNonNullElse($$25, cwd.a), $$24, $$0.C(), false);
            } else {
               this.j.b().a($$2, $$28, $$4, $$5);
            }

            $$2.b();
         } else if ($$0.a(cxk.wS)) {
            $$2.a();
            $$2.b(1.0F, -1.0F, -1.0F);
            fgp $$29 = gsj.a($$3, this.k.a(gdn.a), false, $$0.C());
            this.k.a($$2, $$29, $$4, $$5);
            $$2.b();
         }
      }
   }
}
