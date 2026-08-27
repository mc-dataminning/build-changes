import com.mojang.authlib.GameProfile;
import com.mojang.datafixers.util.Pair;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

public class fvg implements asc {
   private static final dkf[] a = Arrays.stream(cnr.values())
      .sorted(Comparator.comparingInt(cnr::a))
      .map($$0 -> new dkf($$0, hz.c, cyu.kP.o()))
      .toArray(dkf[]::new);
   private static final dkf b = new dkf(hz.c, cyu.kP.o());
   private final dje c = new dje(hz.c, cyu.cv.o());
   private final dje d = new dkp(hz.c, cyu.gV.o());
   private final djs e = new djs(hz.c, cyu.fG.o());
   private final din f = new din(hz.c, cyu.iJ.o());
   private final dit g = new dit(hz.c, cyu.bn.o());
   private final djj h = new djj(hz.c, cyu.mX.o());
   private final djn i = new djn(hz.c, cyu.tp.o());
   private fnz j;
   private fon k;
   private Map<dft.a, fof> l;
   private final fxs m;
   private final fpf n;

   public fvg(fxs $$0, fpf $$1) {
      this.m = $$0;
      this.n = $$1;
   }

   @Override
   public void a(asb $$0) {
      this.j = new fnz(this.n.a(fpi.bf));
      this.k = new fon(this.n.a(fpi.bE));
      this.l = fyi.a(this.n);
   }

   public void a(cpd $$0, cpa $$1, esh $$2, fvt $$3, int $$4, int $$5) {
      coy $$6 = $$0.d();
      if ($$6 instanceof cmw) {
         cys $$7 = ((cmw)$$6).e();
         if ($$7 instanceof cxo $$8) {
            sw $$9 = $$0.w();
            GameProfile $$10 = $$9 != null ? dki.d($$9) : null;
            fof $$11 = this.l.get($$8.b());
            fwb $$12 = fyi.a($$8.b(), $$10);
            fyi.a(null, 180.0F, 0.0F, $$2, $$3, $$4, $$11, $$12);
         } else {
            dlj $$13 = $$7.o();
            dix $$14;
            if ($$7 instanceof cxj) {
               this.f.a($$0, ((cxj)$$7).b());
               $$14 = this.f;
            } else if ($$7 instanceof cyl) {
               this.g.a(((cyl)$$7).b());
               $$14 = this.g;
            } else if ($$13.a(cyu.mX)) {
               $$14 = this.h;
            } else if ($$13.a(cyu.cv)) {
               $$14 = this.c;
            } else if ($$13.a(cyu.fG)) {
               $$14 = this.e;
            } else if ($$13.a(cyu.gV)) {
               $$14 = this.d;
            } else if ($$13.a(cyu.tp)) {
               this.i.a($$0);
               $$14 = this.i;
            } else {
               if (!($$7 instanceof dfq)) {
                  return;
               }

               cnr $$21 = dfq.b($$6);
               if ($$21 == null) {
                  $$14 = b;
               } else {
                  $$14 = a[$$21.a()];
               }
            }

            this.m.a($$14, $$2, $$3, $$4, $$5);
         }
      } else {
         if ($$0.a(cpg.vo)) {
            boolean $$25 = cmw.a($$0) != null;
            $$2.a();
            $$2.b(1.0F, -1.0F, -1.0F);
            gje $$26 = $$25 ? gjg.g : gjg.h;
            esl $$27 = $$26.c().a(gby.c($$3, this.j.a($$26.a()), true, $$0.C()));
            this.j.c().a($$2, $$27, $$4, $$5, 1.0F, 1.0F, 1.0F, 1.0F);
            if ($$25) {
               List<Pair<ij<dio>, cnr>> $$28 = din.a(cqa.d($$0), din.a($$0));
               fxo.a($$2, $$3, $$4, $$5, this.j.b(), $$26, false, $$28, $$0.C());
            } else {
               this.j.b().a($$2, $$27, $$4, $$5, 1.0F, 1.0F, 1.0F, 1.0F);
            }

            $$2.b();
         } else if ($$0.a(cpg.vL)) {
            $$2.a();
            $$2.b(1.0F, -1.0F, -1.0F);
            esl $$29 = gby.c($$3, this.k.a(fon.a), false, $$0.C());
            this.k.a($$2, $$29, $$4, $$5, 1.0F, 1.0F, 1.0F, 1.0F);
            $$2.b();
         }
      }
   }
}
