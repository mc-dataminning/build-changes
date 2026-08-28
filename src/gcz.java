import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.Objects;

public class gcz implements aup {
   private static final dqo[] a = Arrays.stream(ctg.values())
      .sorted(Comparator.comparingInt(ctg::a))
      .map($$0 -> new dqo($$0, iz.c, dez.kP.o()))
      .toArray(dqo[]::new);
   private static final dqo b = new dqo(iz.c, dez.kP.o());
   private final dpm c = new dpm(iz.c, dez.cv.o());
   private final dpm d = new dqy(iz.c, dez.gV.o());
   private final dqa e = new dqa(iz.c, dez.fG.o());
   private final dou f = new dou(iz.c, dez.iJ.o());
   private final dpb g = new dpb(iz.c, dez.bn.o());
   private final dpr h = new dpr(iz.c, dez.mX.o());
   private final dpv i = new dpv(iz.c, dez.tp.o());
   private fvp j;
   private fwd k;
   private Map<dlz.a, fvv> l;
   private final gfl m;
   private final fwu n;

   public gcz(gfl $$0, fwu $$1) {
      this.m = $$0;
      this.n = $$1;
   }

   @Override
   public void a(auo $$0) {
      this.j = new fvp(this.n.a(fwx.bj));
      this.k = new fwd(this.n.a(fwx.bI));
      this.l = ggb.a(this.n);
   }

   public void a(cun $$0, cuk $$1, ezw $$2, gdm $$3, int $$4, int $$5) {
      cui $$6 = $$0.g();
      if ($$6 instanceof csl) {
         dex $$7 = ((csl)$$6).d();
         if ($$7 instanceof ddt $$8) {
            cxp $$9 = $$0.a(km.U);
            if ($$9 != null && !$$9.b()) {
               $$0.c(km.U);
               $$9.a().thenAcceptAsync($$1x -> $$0.b(km.U, $$1x), ffd.Q());
               $$9 = null;
            }

            fvv $$10 = this.l.get($$8.b());
            gdu $$11 = ggb.a($$8.b(), $$9);
            ggb.a(null, 180.0F, 0.0F, $$2, $$3, $$4, $$10, $$11);
         } else {
            dsa $$12 = $$7.o();
            dpf $$13;
            if ($$7 instanceof ddo) {
               this.f.a($$0, ((ddo)$$7).b());
               $$13 = this.f;
            } else if ($$7 instanceof deq) {
               this.g.a(((deq)$$7).b());
               $$13 = this.g;
            } else if ($$12.a(dez.mX)) {
               $$13 = this.h;
            } else if ($$12.a(dez.cv)) {
               $$13 = this.c;
            } else if ($$12.a(dez.fG)) {
               $$13 = this.e;
            } else if ($$12.a(dez.gV)) {
               $$13 = this.d;
            } else if ($$12.a(dez.tp)) {
               this.i.c($$0);
               $$13 = this.i;
            } else {
               if (!($$7 instanceof dlw)) {
                  return;
               }

               ctg $$20 = dlw.b($$6);
               if ($$20 == null) {
                  $$13 = b;
               } else {
                  $$13 = a[$$20.a()];
               }
            }

            this.m.a($$13, $$2, $$3, $$4, $$5);
         }
      } else {
         if ($$0.a(cuq.vs)) {
            dow $$24 = $$0.a(km.W, dow.a);
            ctg $$25 = $$0.a(km.X);
            boolean $$26 = !$$24.b().isEmpty() || $$25 != null;
            $$2.a();
            $$2.b(1.0F, -1.0F, -1.0F);
            grb $$27 = $$26 ? grd.g : grd.h;
            faa $$28 = $$27.c().a(gjt.c($$3, this.j.a($$27.a()), true, $$0.y()));
            this.j.c().a($$2, $$28, $$4, $$5, 1.0F, 1.0F, 1.0F, 1.0F);
            if ($$26) {
               gfh.a($$2, $$3, $$4, $$5, this.j.b(), $$27, false, Objects.requireNonNullElse($$25, ctg.a), $$24, $$0.y());
            } else {
               this.j.b().a($$2, $$28, $$4, $$5, 1.0F, 1.0F, 1.0F, 1.0F);
            }

            $$2.b();
         } else if ($$0.a(cuq.vP)) {
            $$2.a();
            $$2.b(1.0F, -1.0F, -1.0F);
            faa $$29 = gjt.c($$3, this.k.a(fwd.a), false, $$0.y());
            this.k.a($$2, $$29, $$4, $$5, 1.0F, 1.0F, 1.0F, 1.0F);
            $$2.b();
         }
      }
   }
}
