import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.Objects;

public class get implements aue {
   private static final drq[] a = Arrays.stream(csy.values())
      .sorted(Comparator.comparingInt(csy::a))
      .map($$0 -> new drq($$0, ir.c, dfe.lN.n()))
      .toArray(drq[]::new);
   private static final drq b = new drq(ir.c, dfe.lN.n());
   private final dqj c = new dqj(ir.c, dfe.dg.n());
   private final dqj d = new dsa(ir.c, dfe.hP.n());
   private final dqx e = new dqx(ir.c, dfe.gy.n());
   private final dpq f = new dpq(ir.c, dfe.jD.n());
   private final dpx g = new dpx(ir.c, dfe.bX.n());
   private final dqo h = new dqo(ir.c, dfe.nV.n());
   private final dqs i = new dqs(ir.c, dfe.uN.n());
   private fxj j;
   private fxx k;
   private Map<dms.a, fxp> l;
   private final ghf m;
   private final fyo n;

   public get(ghf $$0, fyo $$1) {
      this.m = $$0;
      this.n = $$1;
   }

   @Override
   public void a(aud $$0) {
      this.j = new fxj(this.n.a(fyr.bn));
      this.k = new fxx(this.n.a(fyr.bO));
      this.l = ghv.a(this.n);
   }

   public void a(cuh $$0, cue $$1, fbc $$2, gfg $$3, int $$4, int $$5) {
      cuc $$6 = $$0.f();
      if ($$6 instanceof csc) {
         dfc $$7 = ((csc)$$6).d();
         if ($$7 instanceof ddx $$8) {
            cxs $$9 = $$0.a(ke.U);
            if ($$9 != null && !$$9.b()) {
               $$0.c(ke.U);
               $$9.a().thenAcceptAsync($$1x -> $$0.b(ke.U, $$1x), fgj.Q());
               $$9 = null;
            }

            fxp $$10 = this.l.get($$8.b());
            gfo $$11 = ghv.a($$8.b(), $$9);
            ghv.a(null, 180.0F, 0.0F, $$2, $$3, $$4, $$10, $$11);
         } else {
            dtc $$12 = $$7.n();
            dqc $$13;
            if ($$7 instanceof dds) {
               this.f.a($$0, ((dds)$$7).b());
               $$13 = this.f;
            } else if ($$7 instanceof deu) {
               this.g.a(((deu)$$7).b());
               $$13 = this.g;
            } else if ($$12.a(dfe.nV)) {
               $$13 = this.h;
            } else if ($$12.a(dfe.dg)) {
               $$13 = this.c;
            } else if ($$12.a(dfe.gy)) {
               $$13 = this.e;
            } else if ($$12.a(dfe.hP)) {
               $$13 = this.d;
            } else if ($$12.a(dfe.uN)) {
               this.i.c($$0);
               $$13 = this.i;
            } else {
               if (!($$7 instanceof dmp)) {
                  return;
               }

               csy $$20 = dmp.b($$6);
               if ($$20 == null) {
                  $$13 = b;
               } else {
                  $$13 = a[$$20.a()];
               }
            }

            this.m.a($$13, $$2, $$3, $$4, $$5);
         }
      } else {
         if ($$0.a(cuk.xd)) {
            dps $$24 = $$0.a(ke.W, dps.a);
            csy $$25 = $$0.a(ke.X);
            boolean $$26 = !$$24.b().isEmpty() || $$25 != null;
            $$2.a();
            $$2.b(1.0F, -1.0F, -1.0F);
            gtc $$27 = $$26 ? gte.g : gte.h;
            fbg $$28 = $$27.c().a(glp.c($$3, this.j.a($$27.a()), true, $$0.x()));
            this.j.c().a($$2, $$28, $$4, $$5, 1.0F, 1.0F, 1.0F, 1.0F);
            if ($$26) {
               ghb.a($$2, $$3, $$4, $$5, this.j.b(), $$27, false, Objects.requireNonNullElse($$25, csy.a), $$24, $$0.x());
            } else {
               this.j.b().a($$2, $$28, $$4, $$5, 1.0F, 1.0F, 1.0F, 1.0F);
            }

            $$2.b();
         } else if ($$0.a(cuk.xA)) {
            $$2.a();
            $$2.b(1.0F, -1.0F, -1.0F);
            fbg $$29 = glp.c($$3, this.k.a(fxx.a), false, $$0.x());
            this.k.a($$2, $$29, $$4, $$5, 1.0F, 1.0F, 1.0F, 1.0F);
            $$2.b();
         }
      }
   }
}
