import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.Objects;

public class gkl implements avw {
   private static final dwb[] a = Arrays.stream(cwh.values())
      .sorted(Comparator.comparingInt(cwh::a))
      .map($$0 -> new dwb($$0, jh.c, dkg.lk.m()))
      .toArray(dwb[]::new);
   private static final dwb b = new dwb(jh.c, dkg.lk.m());
   private final duw c = new duw(jh.c, dkg.cD.m());
   private final duw d = new dwl(jh.c, dkg.hl.m());
   private final dvm e = new dvm(jh.c, dkg.fU.m());
   private final due f = new due(jh.c, dkg.ja.m());
   private final dul g = new dul(jh.c, dkg.bu.m());
   private final dvb h = new dvb(jh.c, dkg.ns.m());
   private final dvg i = new dvg(jh.c, dkg.tK.m());
   private gcw j;
   private gdl k;
   private Map<drj.a, gdc> l;
   private final gno m;
   private final ged n;

   public gkl(gno $$0, ged $$1) {
      this.m = $$0;
      this.n = $$1;
   }

   @Override
   public void a(avv $$0) {
      this.j = new gcw(this.n.a(geg.cA));
      this.k = new gdl(this.n.a(geg.dg));
      this.l = goe.a(this.n);
   }

   public void a(cxk $$0, cxi $$1, fgl $$2, gle $$3, int $$4, int $$5) {
      cxg $$6 = $$0.h();
      if ($$6 instanceof cvq) {
         dke $$7 = ((cvq)$$6).d();
         if ($$7 instanceof dja $$8) {
            daj $$9 = $$0.a(ku.ag);
            if ($$9 != null && !$$9.b()) {
               $$0.c(ku.ag);
               $$9.a().thenAcceptAsync($$1x -> $$0.b(ku.ag, $$1x), flz.Q());
               $$9 = null;
            }

            gdc $$10 = this.l.get($$8.b());
            glo $$11 = goe.a($$8.b(), $$9);
            goe.a(null, 180.0F, 0.0F, $$2, $$3, $$4, $$10, $$11);
         } else {
            dxn $$12 = $$7.m();
            dup $$13;
            if ($$7 instanceof div) {
               this.f.a($$0, ((div)$$7).b());
               $$13 = this.f;
            } else if ($$7 instanceof djx) {
               this.g.a(((djx)$$7).b());
               $$13 = this.g;
            } else if ($$12.a(dkg.ns)) {
               $$13 = this.h;
            } else if ($$12.a(dkg.cD)) {
               $$13 = this.c;
            } else if ($$12.a(dkg.fU)) {
               $$13 = this.e;
            } else if ($$12.a(dkg.hl)) {
               $$13 = this.d;
            } else if ($$12.a(dkg.tK)) {
               this.i.c($$0);
               $$13 = this.i;
            } else {
               if (!($$7 instanceof drg)) {
                  return;
               }

               cwh $$20 = drg.b($$6);
               if ($$20 == null) {
                  $$13 = b;
               } else {
                  $$13 = a[$$20.a()];
               }
            }

            this.m.a($$13, $$2, $$3, $$4, $$5);
         }
      } else {
         if ($$0.a(cxo.wi)) {
            dug $$24 = $$0.a(ku.ai, dug.a);
            cwh $$25 = $$0.a(ku.aj);
            boolean $$26 = !$$24.b().isEmpty() || $$25 != null;
            $$2.a();
            $$2.b(1.0F, -1.0F, -1.0F);
            hdn $$27 = $$26 ? hdq.g : hdq.h;
            fgp $$28 = $$27.c().a(gsh.a($$3, this.j.a($$27.a()), $$1 == cxi.g, $$0.B()));
            this.j.c().a($$2, $$28, $$4, $$5);
            if ($$26) {
               gnk.a($$2, $$3, $$4, $$5, this.j.b(), $$27, false, Objects.requireNonNullElse($$25, cwh.a), $$24, $$0.B(), false);
            } else {
               this.j.b().a($$2, $$28, $$4, $$5);
            }

            $$2.b();
         } else if ($$0.a(cxo.wI)) {
            $$2.a();
            $$2.b(1.0F, -1.0F, -1.0F);
            fgp $$29 = gsh.a($$3, this.k.a(gdl.a), false, $$0.B());
            this.k.a($$2, $$29, $$4, $$5);
            $$2.b();
         }
      }
   }
}
