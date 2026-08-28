import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.Objects;

public class gkq implements avw {
   private static final dwi[] a = Arrays.stream(cwl.values())
      .sorted(Comparator.comparingInt(cwl::a))
      .map($$0 -> new dwi($$0, jh.c, dkn.lk.m()))
      .toArray(dwi[]::new);
   private static final dwi b = new dwi(jh.c, dkn.lk.m());
   private final dvd c = new dvd(jh.c, dkn.cD.m());
   private final dvd d = new dws(jh.c, dkn.hl.m());
   private final dvt e = new dvt(jh.c, dkn.fU.m());
   private final dul f = new dul(jh.c, dkn.ja.m());
   private final dus g = new dus(jh.c, dkn.bu.m());
   private final dvi h = new dvi(jh.c, dkn.ns.m());
   private final dvn i = new dvn(jh.c, dkn.tK.m());
   private gdb j;
   private gdq k;
   private Map<drq.a, gdh> l;
   private final gnt m;
   private final gei n;

   public gkq(gnt $$0, gei $$1) {
      this.m = $$0;
      this.n = $$1;
   }

   @Override
   public void a(avv $$0) {
      this.j = new gdb(this.n.a(gel.cA));
      this.k = new gdq(this.n.a(gel.dg));
      this.l = goj.a(this.n);
   }

   public void a(cxo $$0, cxm $$1, fgq $$2, glj $$3, int $$4, int $$5) {
      cxk $$6 = $$0.h();
      if ($$6 instanceof cvu) {
         dkl $$7 = ((cvu)$$6).d();
         if ($$7 instanceof djh $$8) {
            dan $$9 = $$0.a(ku.ag);
            if ($$9 != null && !$$9.b()) {
               $$0.c(ku.ag);
               $$9.a().thenAcceptAsync($$1x -> $$0.b(ku.ag, $$1x), fme.Q());
               $$9 = null;
            }

            gdh $$10 = this.l.get($$8.b());
            glt $$11 = goj.a($$8.b(), $$9);
            goj.a(null, 180.0F, 0.0F, $$2, $$3, $$4, $$10, $$11);
         } else {
            dxu $$12 = $$7.m();
            duw $$13;
            if ($$7 instanceof djc) {
               this.f.a($$0, ((djc)$$7).b());
               $$13 = this.f;
            } else if ($$7 instanceof dke) {
               this.g.a(((dke)$$7).b());
               $$13 = this.g;
            } else if ($$12.a(dkn.ns)) {
               $$13 = this.h;
            } else if ($$12.a(dkn.cD)) {
               $$13 = this.c;
            } else if ($$12.a(dkn.fU)) {
               $$13 = this.e;
            } else if ($$12.a(dkn.hl)) {
               $$13 = this.d;
            } else if ($$12.a(dkn.tK)) {
               this.i.c($$0);
               $$13 = this.i;
            } else {
               if (!($$7 instanceof drn)) {
                  return;
               }

               cwl $$20 = drn.b($$6);
               if ($$20 == null) {
                  $$13 = b;
               } else {
                  $$13 = a[$$20.a()];
               }
            }

            this.m.a($$13, $$2, $$3, $$4, $$5);
         }
      } else {
         if ($$0.a(cxs.wi)) {
            dun $$24 = $$0.a(ku.ai, dun.a);
            cwl $$25 = $$0.a(ku.aj);
            boolean $$26 = !$$24.b().isEmpty() || $$25 != null;
            $$2.a();
            $$2.b(1.0F, -1.0F, -1.0F);
            hds $$27 = $$26 ? hdv.g : hdv.h;
            fgu $$28 = $$27.c().a(gsm.a($$3, this.j.a($$27.a()), $$1 == cxm.g, $$0.B()));
            this.j.c().a($$2, $$28, $$4, $$5);
            if ($$26) {
               gnp.a($$2, $$3, $$4, $$5, this.j.b(), $$27, false, Objects.requireNonNullElse($$25, cwl.a), $$24, $$0.B(), false);
            } else {
               this.j.b().a($$2, $$28, $$4, $$5);
            }

            $$2.b();
         } else if ($$0.a(cxs.wI)) {
            $$2.a();
            $$2.b(1.0F, -1.0F, -1.0F);
            fgu $$29 = gsm.a($$3, this.k.a(gdq.a), false, $$0.B());
            this.k.a($$2, $$29, $$4, $$5);
            $$2.b();
         }
      }
   }
}
