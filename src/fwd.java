import com.mojang.authlib.GameProfile;
import com.mojang.datafixers.util.Pair;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

public class fwd implements asg {
   private static final dkt[] a = Arrays.stream(cog.values())
      .sorted(Comparator.comparingInt(cog::a))
      .map($$0 -> new dkt($$0, ib.c, czh.kP.o()))
      .toArray(dkt[]::new);
   private static final dkt b = new dkt(ib.c, czh.kP.o());
   private final djs c = new djs(ib.c, czh.cv.o());
   private final djs d = new dld(ib.c, czh.gV.o());
   private final dkg e = new dkg(ib.c, czh.fG.o());
   private final djb f = new djb(ib.c, czh.iJ.o());
   private final djh g = new djh(ib.c, czh.bn.o());
   private final djx h = new djx(ib.c, czh.mX.o());
   private final dkb i = new dkb(ib.c, czh.tp.o());
   private fow j;
   private fpk k;
   private Map<dgg.a, fpc> l;
   private final fyp m;
   private final fqb n;

   public fwd(fyp $$0, fqb $$1) {
      this.m = $$0;
      this.n = $$1;
   }

   @Override
   public void a(asf $$0) {
      this.j = new fow(this.n.a(fqe.bf));
      this.k = new fpk(this.n.a(fqe.bE));
      this.l = fzf.a(this.n);
   }

   public void a(cpq $$0, cpn $$1, etd $$2, fwq $$3, int $$4, int $$5) {
      cpl $$6 = $$0.d();
      if ($$6 instanceof cnl) {
         czf $$7 = ((cnl)$$6).d();
         if ($$7 instanceof cyb $$8) {
            sy $$9 = $$0.w();
            GameProfile $$10 = $$9 != null ? dkw.b($$9) : null;
            fpc $$11 = this.l.get($$8.b());
            fwy $$12 = fzf.a($$8.b(), $$10);
            fzf.a(null, 180.0F, 0.0F, $$2, $$3, $$4, $$11, $$12);
         } else {
            dme $$13 = $$7.o();
            djl $$14;
            if ($$7 instanceof cxw) {
               this.f.a($$0, ((cxw)$$7).b());
               $$14 = this.f;
            } else if ($$7 instanceof cyy) {
               this.g.a(((cyy)$$7).b());
               $$14 = this.g;
            } else if ($$13.a(czh.mX)) {
               $$14 = this.h;
            } else if ($$13.a(czh.cv)) {
               $$14 = this.c;
            } else if ($$13.a(czh.fG)) {
               $$14 = this.e;
            } else if ($$13.a(czh.gV)) {
               $$14 = this.d;
            } else if ($$13.a(czh.tp)) {
               this.i.b($$0);
               $$14 = this.i;
            } else {
               if (!($$7 instanceof dgd)) {
                  return;
               }

               cog $$21 = dgd.b($$6);
               if ($$21 == null) {
                  $$14 = b;
               } else {
                  $$14 = a[$$21.a()];
               }
            }

            this.m.a($$14, $$2, $$3, $$4, $$5);
         }
      } else {
         if ($$0.a(cpt.vo)) {
            boolean $$25 = cnl.a($$0) != null;
            $$2.a();
            $$2.b(1.0F, -1.0F, -1.0F);
            gkc $$26 = $$25 ? gke.g : gke.h;
            eth $$27 = $$26.c().a(gcw.c($$3, this.j.a($$26.a()), true, $$0.C()));
            this.j.c().a($$2, $$27, $$4, $$5, 1.0F, 1.0F, 1.0F, 1.0F);
            if ($$25) {
               List<Pair<il<djc>, cog>> $$28 = djb.a(cqn.d($$0), djb.a($$0));
               fyl.a($$2, $$3, $$4, $$5, this.j.b(), $$26, false, $$28, $$0.C());
            } else {
               this.j.b().a($$2, $$27, $$4, $$5, 1.0F, 1.0F, 1.0F, 1.0F);
            }

            $$2.b();
         } else if ($$0.a(cpt.vL)) {
            $$2.a();
            $$2.b(1.0F, -1.0F, -1.0F);
            eth $$29 = gcw.c($$3, this.k.a(fpk.a), false, $$0.C());
            this.k.a($$2, $$29, $$4, $$5, 1.0F, 1.0F, 1.0F, 1.0F);
            $$2.b();
         }
      }
   }
}
