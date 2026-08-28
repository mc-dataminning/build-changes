import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.Objects;

public class gem implements auf {
   private static final drr[] a = Arrays.stream(cti.values())
      .sorted(Comparator.comparingInt(cti::a))
      .map($$0 -> new drr($$0, jd.c, dga.kP.o()))
      .toArray(drr[]::new);
   private static final drr b = new drr(jd.c, dga.kP.o());
   private final dqo c = new dqo(jd.c, dga.cv.o());
   private final dqo d = new dsb(jd.c, dga.gV.o());
   private final drd e = new drd(jd.c, dga.fG.o());
   private final dpw f = new dpw(jd.c, dga.iJ.o());
   private final dqd g = new dqd(jd.c, dga.bn.o());
   private final dqt h = new dqt(jd.c, dga.mX.o());
   private final dqx i = new dqx(jd.c, dga.tp.o());
   private fxb j;
   private fxp k;
   private Map<dnb.a, fxh> l;
   private final ggy m;
   private final fyg n;

   public gem(ggy $$0, fyg $$1) {
      this.m = $$0;
      this.n = $$1;
   }

   @Override
   public void a(aue $$0) {
      this.j = new fxb(this.n.a(fyj.bk));
      this.k = new fxp(this.n.a(fyj.bJ));
      this.l = gho.a(this.n);
   }

   public void a(cuq $$0, cun $$1, fbi $$2, gez $$3, int $$4, int $$5) {
      cul $$6 = $$0.g();
      if ($$6 instanceof cso) {
         dfy $$7 = ((cso)$$6).d();
         if ($$7 instanceof deu $$8) {
            cxu $$9 = $$0.a(kq.W);
            if ($$9 != null && !$$9.b()) {
               $$0.c(kq.W);
               $$9.a().thenAcceptAsync($$1x -> $$0.b(kq.W, $$1x), fgo.Q());
               $$9 = null;
            }

            fxh $$10 = this.l.get($$8.b());
            gfh $$11 = gho.a($$8.b(), $$9);
            gho.a(null, 180.0F, 0.0F, $$2, $$3, $$4, $$10, $$11);
         } else {
            dtc $$12 = $$7.o();
            dqh $$13;
            if ($$7 instanceof dep) {
               this.f.a($$0, ((dep)$$7).b());
               $$13 = this.f;
            } else if ($$7 instanceof dfr) {
               this.g.a(((dfr)$$7).b());
               $$13 = this.g;
            } else if ($$12.a(dga.mX)) {
               $$13 = this.h;
            } else if ($$12.a(dga.cv)) {
               $$13 = this.c;
            } else if ($$12.a(dga.fG)) {
               $$13 = this.e;
            } else if ($$12.a(dga.gV)) {
               $$13 = this.d;
            } else if ($$12.a(dga.tp)) {
               this.i.c($$0);
               $$13 = this.i;
            } else {
               if (!($$7 instanceof dmy)) {
                  return;
               }

               cti $$20 = dmy.b($$6);
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
            dpy $$24 = $$0.a(kq.Y, dpy.a);
            cti $$25 = $$0.a(kq.Z);
            boolean $$26 = !$$24.b().isEmpty() || $$25 != null;
            $$2.a();
            $$2.b(1.0F, -1.0F, -1.0F);
            gsq $$27 = $$26 ? gss.g : gss.h;
            fbm $$28 = $$27.c().a(glh.b($$3, this.j.a($$27.a()), true, $$0.x()));
            this.j.c().a($$2, $$28, $$4, $$5);
            if ($$26) {
               ggu.a($$2, $$3, $$4, $$5, this.j.b(), $$27, false, Objects.requireNonNullElse($$25, cti.a), $$24, $$0.x());
            } else {
               this.j.b().a($$2, $$28, $$4, $$5);
            }

            $$2.b();
         } else if ($$0.a(cut.vS)) {
            $$2.a();
            $$2.b(1.0F, -1.0F, -1.0F);
            fbm $$29 = glh.b($$3, this.k.a(fxp.a), false, $$0.x());
            this.k.a($$2, $$29, $$4, $$5);
            $$2.b();
         }
      }
   }
}
