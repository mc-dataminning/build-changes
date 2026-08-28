import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.Objects;

public class gdc implements auq {
   private static final dqr[] a = Arrays.stream(ctj.values())
      .sorted(Comparator.comparingInt(ctj::a))
      .map($$0 -> new dqr($$0, iz.c, dfc.kP.o()))
      .toArray(dqr[]::new);
   private static final dqr b = new dqr(iz.c, dfc.kP.o());
   private final dpp c = new dpp(iz.c, dfc.cv.o());
   private final dpp d = new drb(iz.c, dfc.gV.o());
   private final dqd e = new dqd(iz.c, dfc.fG.o());
   private final dox f = new dox(iz.c, dfc.iJ.o());
   private final dpe g = new dpe(iz.c, dfc.bn.o());
   private final dpu h = new dpu(iz.c, dfc.mX.o());
   private final dpy i = new dpy(iz.c, dfc.tp.o());
   private fvs j;
   private fwg k;
   private Map<dmc.a, fvy> l;
   private final gfo m;
   private final fwx n;

   public gdc(gfo $$0, fwx $$1) {
      this.m = $$0;
      this.n = $$1;
   }

   @Override
   public void a(aup $$0) {
      this.j = new fvs(this.n.a(fxa.bj));
      this.k = new fwg(this.n.a(fxa.bI));
      this.l = gge.a(this.n);
   }

   public void a(cuq $$0, cun $$1, ezz $$2, gdp $$3, int $$4, int $$5) {
      cul $$6 = $$0.g();
      if ($$6 instanceof cso) {
         dfa $$7 = ((cso)$$6).d();
         if ($$7 instanceof ddw $$8) {
            cxs $$9 = $$0.a(km.V);
            if ($$9 != null && !$$9.b()) {
               $$0.c(km.V);
               $$9.a().thenAcceptAsync($$1x -> $$0.b(km.V, $$1x), ffg.Q());
               $$9 = null;
            }

            fvy $$10 = this.l.get($$8.b());
            gdx $$11 = gge.a($$8.b(), $$9);
            gge.a(null, 180.0F, 0.0F, $$2, $$3, $$4, $$10, $$11);
         } else {
            dsd $$12 = $$7.o();
            dpi $$13;
            if ($$7 instanceof ddr) {
               this.f.a($$0, ((ddr)$$7).b());
               $$13 = this.f;
            } else if ($$7 instanceof det) {
               this.g.a(((det)$$7).b());
               $$13 = this.g;
            } else if ($$12.a(dfc.mX)) {
               $$13 = this.h;
            } else if ($$12.a(dfc.cv)) {
               $$13 = this.c;
            } else if ($$12.a(dfc.fG)) {
               $$13 = this.e;
            } else if ($$12.a(dfc.gV)) {
               $$13 = this.d;
            } else if ($$12.a(dfc.tp)) {
               this.i.c($$0);
               $$13 = this.i;
            } else {
               if (!($$7 instanceof dlz)) {
                  return;
               }

               ctj $$20 = dlz.b($$6);
               if ($$20 == null) {
                  $$13 = b;
               } else {
                  $$13 = a[$$20.a()];
               }
            }

            this.m.a($$13, $$2, $$3, $$4, $$5);
         }
      } else {
         if ($$0.a(cut.vs)) {
            doz $$24 = $$0.a(km.X, doz.a);
            ctj $$25 = $$0.a(km.Y);
            boolean $$26 = !$$24.b().isEmpty() || $$25 != null;
            $$2.a();
            $$2.b(1.0F, -1.0F, -1.0F);
            gre $$27 = $$26 ? grg.g : grg.h;
            fad $$28 = $$27.c().a(gjw.c($$3, this.j.a($$27.a()), true, $$0.y()));
            this.j.c().a($$2, $$28, $$4, $$5, 1.0F, 1.0F, 1.0F, 1.0F);
            if ($$26) {
               gfk.a($$2, $$3, $$4, $$5, this.j.b(), $$27, false, Objects.requireNonNullElse($$25, ctj.a), $$24, $$0.y());
            } else {
               this.j.b().a($$2, $$28, $$4, $$5, 1.0F, 1.0F, 1.0F, 1.0F);
            }

            $$2.b();
         } else if ($$0.a(cut.vP)) {
            $$2.a();
            $$2.b(1.0F, -1.0F, -1.0F);
            fad $$29 = gjw.c($$3, this.k.a(fwg.a), false, $$0.y());
            this.k.a($$2, $$29, $$4, $$5, 1.0F, 1.0F, 1.0F, 1.0F);
            $$2.b();
         }
      }
   }
}
