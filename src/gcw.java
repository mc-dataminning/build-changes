import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.Objects;

public class gcw implements aum {
   private static final dql[] a = Arrays.stream(ctd.values())
      .sorted(Comparator.comparingInt(ctd::a))
      .map($$0 -> new dql($$0, iz.c, dew.kP.n()))
      .toArray(dql[]::new);
   private static final dql b = new dql(iz.c, dew.kP.n());
   private final dpj c = new dpj(iz.c, dew.cv.n());
   private final dpj d = new dqv(iz.c, dew.gV.n());
   private final dpx e = new dpx(iz.c, dew.fG.n());
   private final dor f = new dor(iz.c, dew.iJ.n());
   private final doy g = new doy(iz.c, dew.bn.n());
   private final dpo h = new dpo(iz.c, dew.mX.n());
   private final dps i = new dps(iz.c, dew.tp.n());
   private fvm j;
   private fwa k;
   private Map<dlw.a, fvs> l;
   private final gfi m;
   private final fwr n;

   public gcw(gfi $$0, fwr $$1) {
      this.m = $$0;
      this.n = $$1;
   }

   @Override
   public void a(aul $$0) {
      this.j = new fvm(this.n.a(fwu.bj));
      this.k = new fwa(this.n.a(fwu.bI));
      this.l = gfy.a(this.n);
   }

   public void a(cuk $$0, cuh $$1, ezt $$2, gdj $$3, int $$4, int $$5) {
      cuf $$6 = $$0.g();
      if ($$6 instanceof csi) {
         deu $$7 = ((csi)$$6).d();
         if ($$7 instanceof ddq $$8) {
            cxm $$9 = $$0.a(km.U);
            if ($$9 != null && !$$9.b()) {
               $$0.c(km.U);
               $$9.a().thenAcceptAsync($$1x -> $$0.b(km.U, $$1x), ffa.Q());
               $$9 = null;
            }

            fvs $$10 = this.l.get($$8.b());
            gdr $$11 = gfy.a($$8.b(), $$9);
            gfy.a(null, 180.0F, 0.0F, $$2, $$3, $$4, $$10, $$11);
         } else {
            drx $$12 = $$7.n();
            dpc $$13;
            if ($$7 instanceof ddl) {
               this.f.a($$0, ((ddl)$$7).b());
               $$13 = this.f;
            } else if ($$7 instanceof den) {
               this.g.a(((den)$$7).b());
               $$13 = this.g;
            } else if ($$12.a(dew.mX)) {
               $$13 = this.h;
            } else if ($$12.a(dew.cv)) {
               $$13 = this.c;
            } else if ($$12.a(dew.fG)) {
               $$13 = this.e;
            } else if ($$12.a(dew.gV)) {
               $$13 = this.d;
            } else if ($$12.a(dew.tp)) {
               this.i.c($$0);
               $$13 = this.i;
            } else {
               if (!($$7 instanceof dlt)) {
                  return;
               }

               ctd $$20 = dlt.b($$6);
               if ($$20 == null) {
                  $$13 = b;
               } else {
                  $$13 = a[$$20.a()];
               }
            }

            this.m.a($$13, $$2, $$3, $$4, $$5);
         }
      } else {
         if ($$0.a(cun.vs)) {
            dot $$24 = $$0.a(km.W, dot.a);
            ctd $$25 = $$0.a(km.X);
            boolean $$26 = !$$24.b().isEmpty() || $$25 != null;
            $$2.a();
            $$2.b(1.0F, -1.0F, -1.0F);
            gqy $$27 = $$26 ? gra.g : gra.h;
            ezx $$28 = $$27.c().a(gjq.c($$3, this.j.a($$27.a()), true, $$0.y()));
            this.j.c().a($$2, $$28, $$4, $$5, 1.0F, 1.0F, 1.0F, 1.0F);
            if ($$26) {
               gfe.a($$2, $$3, $$4, $$5, this.j.b(), $$27, false, Objects.requireNonNullElse($$25, ctd.a), $$24, $$0.y());
            } else {
               this.j.b().a($$2, $$28, $$4, $$5, 1.0F, 1.0F, 1.0F, 1.0F);
            }

            $$2.b();
         } else if ($$0.a(cun.vP)) {
            $$2.a();
            $$2.b(1.0F, -1.0F, -1.0F);
            ezx $$29 = gjq.c($$3, this.k.a(fwa.a), false, $$0.y());
            this.k.a($$2, $$29, $$4, $$5, 1.0F, 1.0F, 1.0F, 1.0F);
            $$2.b();
         }
      }
   }
}
