import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.Objects;

public class ggd implements aut {
   private static final dsp[] a = Arrays.stream(cue.values())
      .sorted(Comparator.comparingInt(cue::a))
      .map($$0 -> new dsp($$0, je.c, dgx.kP.o()))
      .toArray(dsp[]::new);
   private static final dsp b = new dsp(je.c, dgx.kP.o());
   private final drl c = new drl(je.c, dgx.cv.o());
   private final drl d = new dsz(je.c, dgx.gV.o());
   private final dsa e = new dsa(je.c, dgx.fG.o());
   private final dqt f = new dqt(je.c, dgx.iJ.o());
   private final dra g = new dra(je.c, dgx.bn.o());
   private final drq h = new drq(je.c, dgx.mX.o());
   private final dru i = new dru(je.c, dgx.tp.o());
   private fyr j;
   private fzf k;
   private Map<dny.a, fyx> l;
   private final gjb m;
   private final fzx n;

   public ggd(gjb $$0, fzx $$1) {
      this.m = $$0;
      this.n = $$1;
   }

   @Override
   public void a(aus $$0) {
      this.j = new fyr(this.n.a(gaa.cg));
      this.k = new fzf(this.n.a(gaa.cK));
      this.l = gjr.a(this.n);
   }

   public void a(cvl $$0, cvi $$1, fcu $$2, ggv $$3, int $$4, int $$5) {
      cvg $$6 = $$0.h();
      if ($$6 instanceof ctl) {
         dgv $$7 = ((ctl)$$6).d();
         if ($$7 instanceof dfr $$8) {
            cyn $$9 = $$0.a(kr.Y);
            if ($$9 != null && !$$9.b()) {
               $$0.c(kr.Y);
               $$9.a().thenAcceptAsync($$1x -> $$0.b(kr.Y, $$1x), fib.Q());
               $$9 = null;
            }

            fyx $$10 = this.l.get($$8.b());
            ghe $$11 = gjr.a($$8.b(), $$9);
            gjr.a(null, 180.0F, 0.0F, $$2, $$3, $$4, $$10, $$11);
         } else {
            dua $$12 = $$7.o();
            dre $$13;
            if ($$7 instanceof dfm) {
               this.f.a($$0, ((dfm)$$7).b());
               $$13 = this.f;
            } else if ($$7 instanceof dgo) {
               this.g.a(((dgo)$$7).b());
               $$13 = this.g;
            } else if ($$12.a(dgx.mX)) {
               $$13 = this.h;
            } else if ($$12.a(dgx.cv)) {
               $$13 = this.c;
            } else if ($$12.a(dgx.fG)) {
               $$13 = this.e;
            } else if ($$12.a(dgx.gV)) {
               $$13 = this.d;
            } else if ($$12.a(dgx.tp)) {
               this.i.c($$0);
               $$13 = this.i;
            } else {
               if (!($$7 instanceof dnv)) {
                  return;
               }

               cue $$20 = dnv.b($$6);
               if ($$20 == null) {
                  $$13 = b;
               } else {
                  $$13 = a[$$20.a()];
               }
            }

            this.m.a($$13, $$2, $$3, $$4, $$5);
         }
      } else {
         if ($$0.a(cvo.vu)) {
            dqv $$24 = $$0.a(kr.aa, dqv.a);
            cue $$25 = $$0.a(kr.ab);
            boolean $$26 = !$$24.b().isEmpty() || $$25 != null;
            $$2.a();
            $$2.b(1.0F, -1.0F, -1.0F);
            gyq $$27 = $$26 ? gyt.g : gyt.h;
            fcy $$28 = $$27.c().a(gnq.b($$3, this.j.a($$27.a()), false, $$0.z()));
            this.j.d().a($$2, $$28, $$4, $$5);
            if ($$26) {
               gix.a($$2, $$3, $$4, $$5, this.j.c(), $$27, false, Objects.requireNonNullElse($$25, cue.a), $$24, $$0.z(), false);
            } else {
               this.j.c().a($$2, $$28, $$4, $$5);
            }

            $$2.b();
         } else if ($$0.a(cvo.vU)) {
            $$2.a();
            $$2.b(1.0F, -1.0F, -1.0F);
            fcy $$29 = gnq.b($$3, this.k.a(fzf.a), false, $$0.z());
            this.k.a($$2, $$29, $$4, $$5);
            $$2.b();
         }
      }
   }
}
