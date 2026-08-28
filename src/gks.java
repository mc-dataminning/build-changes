import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.Objects;

public class gks implements avw {
   private static final dwj[] a = Arrays.stream(cwm.values())
      .sorted(Comparator.comparingInt(cwm::a))
      .map($$0 -> new dwj($$0, jh.c, dko.lk.m()))
      .toArray(dwj[]::new);
   private static final dwj b = new dwj(jh.c, dko.lk.m());
   private final dve c = new dve(jh.c, dko.cD.m());
   private final dve d = new dwt(jh.c, dko.hl.m());
   private final dvu e = new dvu(jh.c, dko.fU.m());
   private final dum f = new dum(jh.c, dko.ja.m());
   private final dut g = new dut(jh.c, dko.bu.m());
   private final dvj h = new dvj(jh.c, dko.ns.m());
   private final dvo i = new dvo(jh.c, dko.tK.m());
   private gdd j;
   private gds k;
   private Map<drr.a, gdj> l;
   private final gnv m;
   private final gek n;

   public gks(gnv $$0, gek $$1) {
      this.m = $$0;
      this.n = $$1;
   }

   @Override
   public void a(avv $$0) {
      this.j = new gdd(this.n.a(gen.cA));
      this.k = new gds(this.n.a(gen.dg));
      this.l = gol.a(this.n);
   }

   public void a(cxp $$0, cxn $$1, fgs $$2, gll $$3, int $$4, int $$5) {
      cxl $$6 = $$0.h();
      if ($$6 instanceof cvv) {
         dkm $$7 = ((cvv)$$6).d();
         if ($$7 instanceof dji $$8) {
            dao $$9 = $$0.a(ku.ag);
            if ($$9 != null && !$$9.b()) {
               $$0.c(ku.ag);
               $$9.a().thenAcceptAsync($$1x -> $$0.b(ku.ag, $$1x), fmg.Q());
               $$9 = null;
            }

            gdj $$10 = this.l.get($$8.b());
            glv $$11 = gol.a($$8.b(), $$9);
            gol.a(null, 180.0F, 0.0F, $$2, $$3, $$4, $$10, $$11);
         } else {
            dxv $$12 = $$7.m();
            dux $$13;
            if ($$7 instanceof djd) {
               this.f.a($$0, ((djd)$$7).b());
               $$13 = this.f;
            } else if ($$7 instanceof dkf) {
               this.g.a(((dkf)$$7).b());
               $$13 = this.g;
            } else if ($$12.a(dko.ns)) {
               $$13 = this.h;
            } else if ($$12.a(dko.cD)) {
               $$13 = this.c;
            } else if ($$12.a(dko.fU)) {
               $$13 = this.e;
            } else if ($$12.a(dko.hl)) {
               $$13 = this.d;
            } else if ($$12.a(dko.tK)) {
               this.i.c($$0);
               $$13 = this.i;
            } else {
               if (!($$7 instanceof dro)) {
                  return;
               }

               cwm $$20 = dro.b($$6);
               if ($$20 == null) {
                  $$13 = b;
               } else {
                  $$13 = a[$$20.a()];
               }
            }

            this.m.a($$13, $$2, $$3, $$4, $$5);
         }
      } else {
         if ($$0.a(cxt.wi)) {
            duo $$24 = $$0.a(ku.ai, duo.a);
            cwm $$25 = $$0.a(ku.aj);
            boolean $$26 = !$$24.b().isEmpty() || $$25 != null;
            $$2.a();
            $$2.b(1.0F, -1.0F, -1.0F);
            hdu $$27 = $$26 ? hdx.g : hdx.h;
            fgw $$28 = $$27.c().a(gso.a($$3, this.j.a($$27.a()), $$1 == cxn.g, $$0.B()));
            this.j.c().a($$2, $$28, $$4, $$5);
            if ($$26) {
               gnr.a($$2, $$3, $$4, $$5, this.j.b(), $$27, false, Objects.requireNonNullElse($$25, cwm.a), $$24, $$0.B(), false);
            } else {
               this.j.b().a($$2, $$28, $$4, $$5);
            }

            $$2.b();
         } else if ($$0.a(cxt.wI)) {
            $$2.a();
            $$2.b(1.0F, -1.0F, -1.0F);
            fgw $$29 = gso.a($$3, this.k.a(gds.a), false, $$0.B());
            this.k.a($$2, $$29, $$4, $$5);
            $$2.b();
         }
      }
   }
}
