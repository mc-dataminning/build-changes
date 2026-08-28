import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.Objects;

public class gdb implements auq {
   private static final dqq[] a = Arrays.stream(cti.values())
      .sorted(Comparator.comparingInt(cti::a))
      .map($$0 -> new dqq($$0, iz.c, dfb.kP.o()))
      .toArray(dqq[]::new);
   private static final dqq b = new dqq(iz.c, dfb.kP.o());
   private final dpo c = new dpo(iz.c, dfb.cv.o());
   private final dpo d = new dra(iz.c, dfb.gV.o());
   private final dqc e = new dqc(iz.c, dfb.fG.o());
   private final dow f = new dow(iz.c, dfb.iJ.o());
   private final dpd g = new dpd(iz.c, dfb.bn.o());
   private final dpt h = new dpt(iz.c, dfb.mX.o());
   private final dpx i = new dpx(iz.c, dfb.tp.o());
   private fvr j;
   private fwf k;
   private Map<dmb.a, fvx> l;
   private final gfn m;
   private final fww n;

   public gdb(gfn $$0, fww $$1) {
      this.m = $$0;
      this.n = $$1;
   }

   @Override
   public void a(aup $$0) {
      this.j = new fvr(this.n.a(fwz.bj));
      this.k = new fwf(this.n.a(fwz.bI));
      this.l = ggd.a(this.n);
   }

   public void a(cup $$0, cum $$1, ezy $$2, gdo $$3, int $$4, int $$5) {
      cuk $$6 = $$0.g();
      if ($$6 instanceof csn) {
         dez $$7 = ((csn)$$6).d();
         if ($$7 instanceof ddv $$8) {
            cxr $$9 = $$0.a(km.V);
            if ($$9 != null && !$$9.b()) {
               $$0.c(km.V);
               $$9.a().thenAcceptAsync($$1x -> $$0.b(km.V, $$1x), fff.Q());
               $$9 = null;
            }

            fvx $$10 = this.l.get($$8.b());
            gdw $$11 = ggd.a($$8.b(), $$9);
            ggd.a(null, 180.0F, 0.0F, $$2, $$3, $$4, $$10, $$11);
         } else {
            dsc $$12 = $$7.o();
            dph $$13;
            if ($$7 instanceof ddq) {
               this.f.a($$0, ((ddq)$$7).b());
               $$13 = this.f;
            } else if ($$7 instanceof des) {
               this.g.a(((des)$$7).b());
               $$13 = this.g;
            } else if ($$12.a(dfb.mX)) {
               $$13 = this.h;
            } else if ($$12.a(dfb.cv)) {
               $$13 = this.c;
            } else if ($$12.a(dfb.fG)) {
               $$13 = this.e;
            } else if ($$12.a(dfb.gV)) {
               $$13 = this.d;
            } else if ($$12.a(dfb.tp)) {
               this.i.c($$0);
               $$13 = this.i;
            } else {
               if (!($$7 instanceof dly)) {
                  return;
               }

               cti $$20 = dly.b($$6);
               if ($$20 == null) {
                  $$13 = b;
               } else {
                  $$13 = a[$$20.a()];
               }
            }

            this.m.a($$13, $$2, $$3, $$4, $$5);
         }
      } else {
         if ($$0.a(cus.vs)) {
            doy $$24 = $$0.a(km.X, doy.a);
            cti $$25 = $$0.a(km.Y);
            boolean $$26 = !$$24.b().isEmpty() || $$25 != null;
            $$2.a();
            $$2.b(1.0F, -1.0F, -1.0F);
            grd $$27 = $$26 ? grf.g : grf.h;
            fac $$28 = $$27.c().a(gjv.c($$3, this.j.a($$27.a()), true, $$0.y()));
            this.j.c().a($$2, $$28, $$4, $$5, 1.0F, 1.0F, 1.0F, 1.0F);
            if ($$26) {
               gfj.a($$2, $$3, $$4, $$5, this.j.b(), $$27, false, Objects.requireNonNullElse($$25, cti.a), $$24, $$0.y());
            } else {
               this.j.b().a($$2, $$28, $$4, $$5, 1.0F, 1.0F, 1.0F, 1.0F);
            }

            $$2.b();
         } else if ($$0.a(cus.vP)) {
            $$2.a();
            $$2.b(1.0F, -1.0F, -1.0F);
            fac $$29 = gjv.c($$3, this.k.a(fwf.a), false, $$0.y());
            this.k.a($$2, $$29, $$4, $$5, 1.0F, 1.0F, 1.0F, 1.0F);
            $$2.b();
         }
      }
   }
}
