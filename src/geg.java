import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.Objects;

public class geg implements aue {
   private static final drp[] a = Arrays.stream(ctg.values())
      .sorted(Comparator.comparingInt(ctg::a))
      .map($$0 -> new drp($$0, jd.c, dfy.kP.o()))
      .toArray(drp[]::new);
   private static final drp b = new drp(jd.c, dfy.kP.o());
   private final dqm c = new dqm(jd.c, dfy.cv.o());
   private final dqm d = new drz(jd.c, dfy.gV.o());
   private final drb e = new drb(jd.c, dfy.fG.o());
   private final dpu f = new dpu(jd.c, dfy.iJ.o());
   private final dqb g = new dqb(jd.c, dfy.bn.o());
   private final dqr h = new dqr(jd.c, dfy.mX.o());
   private final dqv i = new dqv(jd.c, dfy.tp.o());
   private fwv j;
   private fxj k;
   private Map<dmz.a, fxb> l;
   private final ggs m;
   private final fya n;

   public geg(ggs $$0, fya $$1) {
      this.m = $$0;
      this.n = $$1;
   }

   @Override
   public void a(aud $$0) {
      this.j = new fwv(this.n.a(fyd.bk));
      this.k = new fxj(this.n.a(fyd.bJ));
      this.l = ghi.a(this.n);
   }

   public void a(cuo $$0, cul $$1, fbc $$2, get $$3, int $$4, int $$5) {
      cuj $$6 = $$0.g();
      if ($$6 instanceof csm) {
         dfw $$7 = ((csm)$$6).d();
         if ($$7 instanceof des $$8) {
            cxs $$9 = $$0.a(kq.W);
            if ($$9 != null && !$$9.b()) {
               $$0.c(kq.W);
               $$9.a().thenAcceptAsync($$1x -> $$0.b(kq.W, $$1x), fgi.Q());
               $$9 = null;
            }

            fxb $$10 = this.l.get($$8.b());
            gfb $$11 = ghi.a($$8.b(), $$9);
            ghi.a(null, 180.0F, 0.0F, $$2, $$3, $$4, $$10, $$11);
         } else {
            dta $$12 = $$7.o();
            dqf $$13;
            if ($$7 instanceof den) {
               this.f.a($$0, ((den)$$7).b());
               $$13 = this.f;
            } else if ($$7 instanceof dfp) {
               this.g.a(((dfp)$$7).b());
               $$13 = this.g;
            } else if ($$12.a(dfy.mX)) {
               $$13 = this.h;
            } else if ($$12.a(dfy.cv)) {
               $$13 = this.c;
            } else if ($$12.a(dfy.fG)) {
               $$13 = this.e;
            } else if ($$12.a(dfy.gV)) {
               $$13 = this.d;
            } else if ($$12.a(dfy.tp)) {
               this.i.c($$0);
               $$13 = this.i;
            } else {
               if (!($$7 instanceof dmw)) {
                  return;
               }

               ctg $$20 = dmw.b($$6);
               if ($$20 == null) {
                  $$13 = b;
               } else {
                  $$13 = a[$$20.a()];
               }
            }

            this.m.a($$13, $$2, $$3, $$4, $$5);
         }
      } else {
         if ($$0.a(cur.vs)) {
            dpw $$24 = $$0.a(kq.Y, dpw.a);
            ctg $$25 = $$0.a(kq.Z);
            boolean $$26 = !$$24.b().isEmpty() || $$25 != null;
            $$2.a();
            $$2.b(1.0F, -1.0F, -1.0F);
            gsj $$27 = $$26 ? gsl.g : gsl.h;
            fbg $$28 = $$27.c().a(glb.b($$3, this.j.a($$27.a()), true, $$0.x()));
            this.j.c().a($$2, $$28, $$4, $$5);
            if ($$26) {
               ggo.a($$2, $$3, $$4, $$5, this.j.b(), $$27, false, Objects.requireNonNullElse($$25, ctg.a), $$24, $$0.x());
            } else {
               this.j.b().a($$2, $$28, $$4, $$5);
            }

            $$2.b();
         } else if ($$0.a(cur.vS)) {
            $$2.a();
            $$2.b(1.0F, -1.0F, -1.0F);
            fbg $$29 = glb.b($$3, this.k.a(fxj.a), false, $$0.x());
            this.k.a($$2, $$29, $$4, $$5);
            $$2.b();
         }
      }
   }
}
