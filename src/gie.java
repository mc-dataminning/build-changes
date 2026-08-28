import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.Objects;

public class gie implements avf {
   private static final duc[] a = Arrays.stream(cvc.values())
      .sorted(Comparator.comparingInt(cvc::a))
      .map($$0 -> new duc($$0, jh.c, dil.kP.m()))
      .toArray(duc[]::new);
   private static final duc b = new duc(jh.c, dil.kP.m());
   private final dsy c = new dsy(jh.c, dil.cv.m());
   private final dsy d = new dum(jh.c, dil.gV.m());
   private final dtn e = new dtn(jh.c, dil.fG.m());
   private final dsg f = new dsg(jh.c, dil.iJ.m());
   private final dsn g = new dsn(jh.c, dil.bn.m());
   private final dtd h = new dtd(jh.c, dil.mX.m());
   private final dth i = new dth(jh.c, dil.tp.m());
   private gar j;
   private gbg k;
   private Map<dpl.a, gax> l;
   private final glh m;
   private final gby n;

   public gie(glh $$0, gby $$1) {
      this.m = $$0;
      this.n = $$1;
   }

   @Override
   public void a(ave $$0) {
      this.j = new gar(this.n.a(gcb.ch));
      this.k = new gbg(this.n.a(gcb.cL));
      this.l = glx.a(this.n);
   }

   public void a(cwf $$0, cwd $$1, fek $$2, gix $$3, int $$4, int $$5) {
      cwb $$6 = $$0.h();
      if ($$6 instanceof cul) {
         dij $$7 = ((cul)$$6).d();
         if ($$7 instanceof dhf $$8) {
            cze $$9 = $$0.a(ku.ag);
            if ($$9 != null && !$$9.b()) {
               $$0.c(ku.ag);
               $$9.a().thenAcceptAsync($$1x -> $$0.b(ku.ag, $$1x), fjx.Q());
               $$9 = null;
            }

            gax $$10 = this.l.get($$8.b());
            gjh $$11 = glx.a($$8.b(), $$9);
            glx.a(null, 180.0F, 0.0F, $$2, $$3, $$4, $$10, $$11);
         } else {
            dvo $$12 = $$7.m();
            dsr $$13;
            if ($$7 instanceof dha) {
               this.f.a($$0, ((dha)$$7).b());
               $$13 = this.f;
            } else if ($$7 instanceof dic) {
               this.g.a(((dic)$$7).b());
               $$13 = this.g;
            } else if ($$12.a(dil.mX)) {
               $$13 = this.h;
            } else if ($$12.a(dil.cv)) {
               $$13 = this.c;
            } else if ($$12.a(dil.fG)) {
               $$13 = this.e;
            } else if ($$12.a(dil.gV)) {
               $$13 = this.d;
            } else if ($$12.a(dil.tp)) {
               this.i.c($$0);
               $$13 = this.i;
            } else {
               if (!($$7 instanceof dpi)) {
                  return;
               }

               cvc $$20 = dpi.b($$6);
               if ($$20 == null) {
                  $$13 = b;
               } else {
                  $$13 = a[$$20.a()];
               }
            }

            this.m.a($$13, $$2, $$3, $$4, $$5);
         }
      } else {
         if ($$0.a(cwj.vK)) {
            dsi $$24 = $$0.a(ku.ai, dsi.a);
            cvc $$25 = $$0.a(ku.aj);
            boolean $$26 = !$$24.b().isEmpty() || $$25 != null;
            $$2.a();
            $$2.b(1.0F, -1.0F, -1.0F);
            hbc $$27 = $$26 ? hbf.g : hbf.h;
            feo $$28 = $$27.c().a(gpy.a($$3, this.j.a($$27.a()), $$1 == cwd.g, $$0.B()));
            this.j.c().a($$2, $$28, $$4, $$5);
            if ($$26) {
               gld.a($$2, $$3, $$4, $$5, this.j.b(), $$27, false, Objects.requireNonNullElse($$25, cvc.a), $$24, $$0.B(), false);
            } else {
               this.j.b().a($$2, $$28, $$4, $$5);
            }

            $$2.b();
         } else if ($$0.a(cwj.wk)) {
            $$2.a();
            $$2.b(1.0F, -1.0F, -1.0F);
            feo $$29 = gpy.a($$3, this.k.a(gbg.a), false, $$0.B());
            this.k.a($$2, $$29, $$4, $$5);
            $$2.b();
         }
      }
   }
}
