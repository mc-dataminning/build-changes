import com.mojang.authlib.GameProfile;
import com.mojang.datafixers.util.Pair;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

public class fxf implements asp {
   private static final dlq[] a = Arrays.stream(cpd.values())
      .sorted(Comparator.comparingInt(cpd::a))
      .map($$0 -> new dlq($$0, ib.c, dae.kP.o()))
      .toArray(dlq[]::new);
   private static final dlq b = new dlq(ib.c, dae.kP.o());
   private final dkp c = new dkp(ib.c, dae.cv.o());
   private final dkp d = new dma(ib.c, dae.gV.o());
   private final dld e = new dld(ib.c, dae.fG.o());
   private final djy f = new djy(ib.c, dae.iJ.o());
   private final dke g = new dke(ib.c, dae.bn.o());
   private final dku h = new dku(ib.c, dae.mX.o());
   private final dky i = new dky(ib.c, dae.tp.o());
   private fpw j;
   private fqk k;
   private Map<dhd.a, fqc> l;
   private final fzr m;
   private final frb n;

   public fxf(fzr $$0, frb $$1) {
      this.m = $$0;
      this.n = $$1;
   }

   @Override
   public void a(aso $$0) {
      this.j = new fpw(this.n.a(fre.bj));
      this.k = new fqk(this.n.a(fre.bI));
      this.l = gah.a(this.n);
   }

   public void a(cqm $$0, cqj $$1, eub $$2, fxs $$3, int $$4, int $$5) {
      cqh $$6 = $$0.d();
      if ($$6 instanceof coh) {
         dac $$7 = ((coh)$$6).d();
         if ($$7 instanceof cyy $$8) {
            ta $$9 = $$0.w();
            GameProfile $$10 = $$9 != null ? dlt.b($$9) : null;
            fqc $$11 = this.l.get($$8.b());
            fya $$12 = gah.a($$8.b(), $$10);
            gah.a(null, 180.0F, 0.0F, $$2, $$3, $$4, $$11, $$12);
         } else {
            dnb $$13 = $$7.o();
            dki $$14;
            if ($$7 instanceof cyt) {
               this.f.a($$0, ((cyt)$$7).b());
               $$14 = this.f;
            } else if ($$7 instanceof czv) {
               this.g.a(((czv)$$7).b());
               $$14 = this.g;
            } else if ($$13.a(dae.mX)) {
               $$14 = this.h;
            } else if ($$13.a(dae.cv)) {
               $$14 = this.c;
            } else if ($$13.a(dae.fG)) {
               $$14 = this.e;
            } else if ($$13.a(dae.gV)) {
               $$14 = this.d;
            } else if ($$13.a(dae.tp)) {
               this.i.b($$0);
               $$14 = this.i;
            } else {
               if (!($$7 instanceof dha)) {
                  return;
               }

               cpd $$21 = dha.b($$6);
               if ($$21 == null) {
                  $$14 = b;
               } else {
                  $$14 = a[$$21.a()];
               }
            }

            this.m.a($$14, $$2, $$3, $$4, $$5);
         }
      } else {
         if ($$0.a(cqp.vq)) {
            boolean $$25 = coh.a($$0) != null;
            $$2.a();
            $$2.b(1.0F, -1.0F, -1.0F);
            glf $$26 = $$25 ? glh.g : glh.h;
            euf $$27 = $$26.c().a(gdz.c($$3, this.j.a($$26.a()), true, $$0.C()));
            this.j.c().a($$2, $$27, $$4, $$5, 1.0F, 1.0F, 1.0F, 1.0F);
            if ($$25) {
               List<Pair<il<djz>, cpd>> $$28 = djy.a(crj.d($$0), djy.a($$0));
               fzn.a($$2, $$3, $$4, $$5, this.j.b(), $$26, false, $$28, $$0.C());
            } else {
               this.j.b().a($$2, $$27, $$4, $$5, 1.0F, 1.0F, 1.0F, 1.0F);
            }

            $$2.b();
         } else if ($$0.a(cqp.vN)) {
            $$2.a();
            $$2.b(1.0F, -1.0F, -1.0F);
            euf $$29 = gdz.c($$3, this.k.a(fqk.a), false, $$0.C());
            this.k.a($$2, $$29, $$4, $$5, 1.0F, 1.0F, 1.0F, 1.0F);
            $$2.b();
         }
      }
   }
}
