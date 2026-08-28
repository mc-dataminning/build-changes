import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.Objects;

public class gin implements ave {
   private static final duj[] a = Arrays.stream(cvj.values())
      .sorted(Comparator.comparingInt(cvj::a))
      .map($$0 -> new duj($$0, jh.c, dis.kP.m()))
      .toArray(duj[]::new);
   private static final duj b = new duj(jh.c, dis.kP.m());
   private final dtf c = new dtf(jh.c, dis.cv.m());
   private final dtf d = new dut(jh.c, dis.gV.m());
   private final dtu e = new dtu(jh.c, dis.fG.m());
   private final dsn f = new dsn(jh.c, dis.iJ.m());
   private final dsu g = new dsu(jh.c, dis.bn.m());
   private final dtk h = new dtk(jh.c, dis.mX.m());
   private final dto i = new dto(jh.c, dis.tp.m());
   private gba j;
   private gbp k;
   private Map<dps.a, gbg> l;
   private final glq m;
   private final gch n;

   public gin(glq $$0, gch $$1) {
      this.m = $$0;
      this.n = $$1;
   }

   @Override
   public void a(avd $$0) {
      this.j = new gba(this.n.a(gck.cx));
      this.k = new gbp(this.n.a(gck.dd));
      this.l = gmg.a(this.n);
   }

   public void a(cwm $$0, cwk $$1, fer $$2, gjg $$3, int $$4, int $$5) {
      cwi $$6 = $$0.h();
      if ($$6 instanceof cus) {
         diq $$7 = ((cus)$$6).d();
         if ($$7 instanceof dhm $$8) {
            czl $$9 = $$0.a(ku.ag);
            if ($$9 != null && !$$9.b()) {
               $$0.c(ku.ag);
               $$9.a().thenAcceptAsync($$1x -> $$0.b(ku.ag, $$1x), fke.Q());
               $$9 = null;
            }

            gbg $$10 = this.l.get($$8.b());
            gjq $$11 = gmg.a($$8.b(), $$9);
            gmg.a(null, 180.0F, 0.0F, $$2, $$3, $$4, $$10, $$11);
         } else {
            dvv $$12 = $$7.m();
            dsy $$13;
            if ($$7 instanceof dhh) {
               this.f.a($$0, ((dhh)$$7).b());
               $$13 = this.f;
            } else if ($$7 instanceof dij) {
               this.g.a(((dij)$$7).b());
               $$13 = this.g;
            } else if ($$12.a(dis.mX)) {
               $$13 = this.h;
            } else if ($$12.a(dis.cv)) {
               $$13 = this.c;
            } else if ($$12.a(dis.fG)) {
               $$13 = this.e;
            } else if ($$12.a(dis.gV)) {
               $$13 = this.d;
            } else if ($$12.a(dis.tp)) {
               this.i.c($$0);
               $$13 = this.i;
            } else {
               if (!($$7 instanceof dpp)) {
                  return;
               }

               cvj $$20 = dpp.b($$6);
               if ($$20 == null) {
                  $$13 = b;
               } else {
                  $$13 = a[$$20.a()];
               }
            }

            this.m.a($$13, $$2, $$3, $$4, $$5);
         }
      } else {
         if ($$0.a(cwq.vK)) {
            dsp $$24 = $$0.a(ku.ai, dsp.a);
            cvj $$25 = $$0.a(ku.aj);
            boolean $$26 = !$$24.b().isEmpty() || $$25 != null;
            $$2.a();
            $$2.b(1.0F, -1.0F, -1.0F);
            hbn $$27 = $$26 ? hbq.g : hbq.h;
            fev $$28 = $$27.c().a(gqi.a($$3, this.j.a($$27.a()), $$1 == cwk.g, $$0.B()));
            this.j.c().a($$2, $$28, $$4, $$5);
            if ($$26) {
               glm.a($$2, $$3, $$4, $$5, this.j.b(), $$27, false, Objects.requireNonNullElse($$25, cvj.a), $$24, $$0.B(), false);
            } else {
               this.j.b().a($$2, $$28, $$4, $$5);
            }

            $$2.b();
         } else if ($$0.a(cwq.wk)) {
            $$2.a();
            $$2.b(1.0F, -1.0F, -1.0F);
            fev $$29 = gqi.a($$3, this.k.a(gbp.a), false, $$0.B());
            this.k.a($$2, $$29, $$4, $$5);
            $$2.b();
         }
      }
   }
}
