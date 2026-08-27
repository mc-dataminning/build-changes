import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.Objects;

public class fzv implements atf {
   private static final dnx[] a = Arrays.stream(cql.values())
      .sorted(Comparator.comparingInt(cql::a))
      .map($$0 -> new dnx($$0, id.c, dcj.kP.n()))
      .toArray(dnx[]::new);
   private static final dnx b = new dnx(id.c, dcj.kP.n());
   private final dmv c = new dmv(id.c, dcj.cv.n());
   private final dmv d = new doh(id.c, dcj.gV.n());
   private final dnj e = new dnj(id.c, dcj.fG.n());
   private final dmd f = new dmd(id.c, dcj.iJ.n());
   private final dmk g = new dmk(id.c, dcj.bn.n());
   private final dna h = new dna(id.c, dcj.mX.n());
   private final dne i = new dne(id.c, dcj.tp.n());
   private fsm j;
   private fta k;
   private Map<dji.a, fss> l;
   private final gch m;
   private final ftr n;

   public fzv(gch $$0, ftr $$1) {
      this.m = $$0;
      this.n = $$1;
   }

   @Override
   public void a(ate $$0) {
      this.j = new fsm(this.n.a(ftu.bj));
      this.k = new fta(this.n.a(ftu.bI));
      this.l = gcx.a(this.n);
   }

   public void a(crs $$0, crp $$1, ewr $$2, gai $$3, int $$4, int $$5) {
      crn $$6 = $$0.f();
      if ($$6 instanceof cpq) {
         dch $$7 = ((cpq)$$6).d();
         if ($$7 instanceof dbd $$8) {
            cup $$9 = $$0.a(jr.L);
            if ($$9 != null && !$$9.b()) {
               $$0.c(jr.L);
               $$9.a().thenAcceptAsync($$1x -> $$0.b(jr.L, $$1x), fby.Q());
               $$9 = null;
            }

            fss $$10 = this.l.get($$8.b());
            gaq $$11 = gcx.a($$8.b(), $$9);
            gcx.a(null, 180.0F, 0.0F, $$2, $$3, $$4, $$10, $$11);
         } else {
            dpi $$12 = $$7.n();
            dmo $$13;
            if ($$7 instanceof day) {
               this.f.a($$0, ((day)$$7).b());
               $$13 = this.f;
            } else if ($$7 instanceof dca) {
               this.g.a(((dca)$$7).b());
               $$13 = this.g;
            } else if ($$12.a(dcj.mX)) {
               $$13 = this.h;
            } else if ($$12.a(dcj.cv)) {
               $$13 = this.c;
            } else if ($$12.a(dcj.fG)) {
               $$13 = this.e;
            } else if ($$12.a(dcj.gV)) {
               $$13 = this.d;
            } else if ($$12.a(dcj.tp)) {
               this.i.b($$0);
               $$13 = this.i;
            } else {
               if (!($$7 instanceof djf)) {
                  return;
               }

               cql $$20 = djf.b($$6);
               if ($$20 == null) {
                  $$13 = b;
               } else {
                  $$13 = a[$$20.a()];
               }
            }

            this.m.a($$13, $$2, $$3, $$4, $$5);
         }
      } else {
         if ($$0.a(crv.vq)) {
            dmf $$24 = $$0.a(jr.N, dmf.a);
            cql $$25 = $$0.a(jr.O);
            boolean $$26 = !$$24.b().isEmpty() || $$25 != null;
            $$2.a();
            $$2.b(1.0F, -1.0F, -1.0F);
            gnv $$27 = $$26 ? gnx.g : gnx.h;
            ewv $$28 = $$27.c().a(ggp.c($$3, this.j.a($$27.a()), true, $$0.x()));
            this.j.c().a($$2, $$28, $$4, $$5, 1.0F, 1.0F, 1.0F, 1.0F);
            if ($$26) {
               gcd.a($$2, $$3, $$4, $$5, this.j.b(), $$27, false, Objects.requireNonNullElse($$25, cql.a), $$24, $$0.x());
            } else {
               this.j.b().a($$2, $$28, $$4, $$5, 1.0F, 1.0F, 1.0F, 1.0F);
            }

            $$2.b();
         } else if ($$0.a(crv.vN)) {
            $$2.a();
            $$2.b(1.0F, -1.0F, -1.0F);
            ewv $$29 = ggp.c($$3, this.k.a(fta.a), false, $$0.x());
            this.k.a($$2, $$29, $$4, $$5, 1.0F, 1.0F, 1.0F, 1.0F);
            $$2.b();
         }
      }
   }
}
