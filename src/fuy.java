import com.mojang.authlib.GameProfile;
import com.mojang.datafixers.util.Pair;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

public class fuy implements asb {
   private static final dkb[] a = Arrays.stream(cnn.values())
      .sorted(Comparator.comparingInt(cnn::a))
      .map($$0 -> new dkb($$0, hz.c, cyq.kP.o()))
      .toArray(dkb[]::new);
   private static final dkb b = new dkb(hz.c, cyq.kP.o());
   private final dja c = new dja(hz.c, cyq.cv.o());
   private final dja d = new dkl(hz.c, cyq.gV.o());
   private final djo e = new djo(hz.c, cyq.fG.o());
   private final dij f = new dij(hz.c, cyq.iJ.o());
   private final dip g = new dip(hz.c, cyq.bn.o());
   private final djf h = new djf(hz.c, cyq.mX.o());
   private final djj i = new djj(hz.c, cyq.tp.o());
   private fns j;
   private fog k;
   private Map<dfp.a, fny> l;
   private final fxk m;
   private final foy n;

   public fuy(fxk $$0, foy $$1) {
      this.m = $$0;
      this.n = $$1;
   }

   @Override
   public void a(asa $$0) {
      this.j = new fns(this.n.a(fpb.bf));
      this.k = new fog(this.n.a(fpb.bE));
      this.l = fya.a(this.n);
   }

   public void a(coz $$0, cow $$1, esa $$2, fvl $$3, int $$4, int $$5) {
      cou $$6 = $$0.d();
      if ($$6 instanceof cms) {
         cyo $$7 = ((cms)$$6).e();
         if ($$7 instanceof cxk $$8) {
            sw $$9 = $$0.w();
            GameProfile $$10 = $$9 != null ? dke.d($$9) : null;
            fny $$11 = this.l.get($$8.b());
            fvt $$12 = fya.a($$8.b(), $$10);
            fya.a(null, 180.0F, 0.0F, $$2, $$3, $$4, $$11, $$12);
         } else {
            dlf $$13 = $$7.o();
            dit $$14;
            if ($$7 instanceof cxf) {
               this.f.a($$0, ((cxf)$$7).b());
               $$14 = this.f;
            } else if ($$7 instanceof cyh) {
               this.g.a(((cyh)$$7).b());
               $$14 = this.g;
            } else if ($$13.a(cyq.mX)) {
               $$14 = this.h;
            } else if ($$13.a(cyq.cv)) {
               $$14 = this.c;
            } else if ($$13.a(cyq.fG)) {
               $$14 = this.e;
            } else if ($$13.a(cyq.gV)) {
               $$14 = this.d;
            } else if ($$13.a(cyq.tp)) {
               this.i.a($$0);
               $$14 = this.i;
            } else {
               if (!($$7 instanceof dfm)) {
                  return;
               }

               cnn $$21 = dfm.b($$6);
               if ($$21 == null) {
                  $$14 = b;
               } else {
                  $$14 = a[$$21.a()];
               }
            }

            this.m.a($$14, $$2, $$3, $$4, $$5);
         }
      } else {
         if ($$0.a(cpc.vo)) {
            boolean $$25 = cms.a($$0) != null;
            $$2.a();
            $$2.b(1.0F, -1.0F, -1.0F);
            giw $$26 = $$25 ? giy.g : giy.h;
            ese $$27 = $$26.c().a(gbq.c($$3, this.j.a($$26.a()), true, $$0.C()));
            this.j.c().a($$2, $$27, $$4, $$5, 1.0F, 1.0F, 1.0F, 1.0F);
            if ($$25) {
               List<Pair<ij<dik>, cnn>> $$28 = dij.a(cpw.d($$0), dij.a($$0));
               fxg.a($$2, $$3, $$4, $$5, this.j.b(), $$26, false, $$28, $$0.C());
            } else {
               this.j.b().a($$2, $$27, $$4, $$5, 1.0F, 1.0F, 1.0F, 1.0F);
            }

            $$2.b();
         } else if ($$0.a(cpc.vL)) {
            $$2.a();
            $$2.b(1.0F, -1.0F, -1.0F);
            ese $$29 = gbq.c($$3, this.k.a(fog.a), false, $$0.C());
            this.k.a($$2, $$29, $$4, $$5, 1.0F, 1.0F, 1.0F, 1.0F);
            $$2.b();
         }
      }
   }
}
