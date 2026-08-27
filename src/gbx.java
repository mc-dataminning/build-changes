import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.Objects;

public class gbx implements atx {
   private static final dpp[] a = Arrays.stream(csh.values())
      .sorted(Comparator.comparingInt(csh::a))
      .map($$0 -> new dpp($$0, io.c, dea.kP.n()))
      .toArray(dpp[]::new);
   private static final dpp b = new dpp(io.c, dea.kP.n());
   private final don c = new don(io.c, dea.cv.n());
   private final don d = new dpz(io.c, dea.gV.n());
   private final dpb e = new dpb(io.c, dea.fG.n());
   private final dnv f = new dnv(io.c, dea.iJ.n());
   private final doc g = new doc(io.c, dea.bn.n());
   private final dos h = new dos(io.c, dea.mX.n());
   private final dow i = new dow(io.c, dea.tp.n());
   private fun j;
   private fvb k;
   private Map<dla.a, fut> l;
   private final gej m;
   private final fvs n;

   public gbx(gej $$0, fvs $$1) {
      this.m = $$0;
      this.n = $$1;
   }

   @Override
   public void a(atw $$0) {
      this.j = new fun(this.n.a(fvv.bj));
      this.k = new fvb(this.n.a(fvv.bI));
      this.l = gez.a(this.n);
   }

   public void a(cto $$0, ctl $$1, eys $$2, gck $$3, int $$4, int $$5) {
      ctj $$6 = $$0.g();
      if ($$6 instanceof crm) {
         ddy $$7 = ((crm)$$6).d();
         if ($$7 instanceof dcu $$8) {
            cwq $$9 = $$0.a(kb.U);
            if ($$9 != null && !$$9.b()) {
               $$0.c(kb.U);
               $$9.a().thenAcceptAsync($$1x -> $$0.b(kb.U, $$1x), fdz.Q());
               $$9 = null;
            }

            fut $$10 = this.l.get($$8.b());
            gcs $$11 = gez.a($$8.b(), $$9);
            gez.a(null, 180.0F, 0.0F, $$2, $$3, $$4, $$10, $$11);
         } else {
            drb $$12 = $$7.n();
            dog $$13;
            if ($$7 instanceof dcp) {
               this.f.a($$0, ((dcp)$$7).b());
               $$13 = this.f;
            } else if ($$7 instanceof ddr) {
               this.g.a(((ddr)$$7).b());
               $$13 = this.g;
            } else if ($$12.a(dea.mX)) {
               $$13 = this.h;
            } else if ($$12.a(dea.cv)) {
               $$13 = this.c;
            } else if ($$12.a(dea.fG)) {
               $$13 = this.e;
            } else if ($$12.a(dea.gV)) {
               $$13 = this.d;
            } else if ($$12.a(dea.tp)) {
               this.i.c($$0);
               $$13 = this.i;
            } else {
               if (!($$7 instanceof dkx)) {
                  return;
               }

               csh $$20 = dkx.b($$6);
               if ($$20 == null) {
                  $$13 = b;
               } else {
                  $$13 = a[$$20.a()];
               }
            }

            this.m.a($$13, $$2, $$3, $$4, $$5);
         }
      } else {
         if ($$0.a(ctr.vs)) {
            dnx $$24 = $$0.a(kb.W, dnx.a);
            csh $$25 = $$0.a(kb.X);
            boolean $$26 = !$$24.b().isEmpty() || $$25 != null;
            $$2.a();
            $$2.b(1.0F, -1.0F, -1.0F);
            gpz $$27 = $$26 ? gqb.g : gqb.h;
            eyw $$28 = $$27.c().a(gir.c($$3, this.j.a($$27.a()), true, $$0.y()));
            this.j.c().a($$2, $$28, $$4, $$5, 1.0F, 1.0F, 1.0F, 1.0F);
            if ($$26) {
               gef.a($$2, $$3, $$4, $$5, this.j.b(), $$27, false, Objects.requireNonNullElse($$25, csh.a), $$24, $$0.y());
            } else {
               this.j.b().a($$2, $$28, $$4, $$5, 1.0F, 1.0F, 1.0F, 1.0F);
            }

            $$2.b();
         } else if ($$0.a(ctr.vP)) {
            $$2.a();
            $$2.b(1.0F, -1.0F, -1.0F);
            eyw $$29 = gir.c($$3, this.k.a(fvb.a), false, $$0.y());
            this.k.a($$2, $$29, $$4, $$5, 1.0F, 1.0F, 1.0F, 1.0F);
            $$2.b();
         }
      }
   }
}
