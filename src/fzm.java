import com.mojang.authlib.GameProfile;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.Objects;

public class fzm implements atd {
   private static final dno[] a = Arrays.stream(cqc.values())
      .sorted(Comparator.comparingInt(cqc::a))
      .map($$0 -> new dno($$0, ib.c, dca.kP.n()))
      .toArray(dno[]::new);
   private static final dno b = new dno(ib.c, dca.kP.n());
   private final dmm c = new dmm(ib.c, dca.cv.n());
   private final dmm d = new dny(ib.c, dca.gV.n());
   private final dna e = new dna(ib.c, dca.fG.n());
   private final dlu f = new dlu(ib.c, dca.iJ.n());
   private final dmb g = new dmb(ib.c, dca.bn.n());
   private final dmr h = new dmr(ib.c, dca.mX.n());
   private final dmv i = new dmv(ib.c, dca.tp.n());
   private fsd j;
   private fsr k;
   private Map<diz.a, fsj> l;
   private final gby m;
   private final fti n;

   public fzm(gby $$0, fti $$1) {
      this.m = $$0;
      this.n = $$1;
   }

   @Override
   public void a(atc $$0) {
      this.j = new fsd(this.n.a(ftl.bj));
      this.k = new fsr(this.n.a(ftl.bI));
      this.l = gco.a(this.n);
   }

   public void a(crj $$0, crg $$1, ewi $$2, fzz $$3, int $$4, int $$5) {
      cre $$6 = $$0.f();
      if ($$6 instanceof cph) {
         dby $$7 = ((cph)$$6).d();
         if ($$7 instanceof dau $$8) {
            cug $$9 = $$0.a(jp.L);
            if ($$9 != null && !$$9.b()) {
               $$0.c(jp.L);
               $$9.a().thenAcceptAsync($$1x -> $$0.b(jp.L, $$1x), fbp.Q());
               $$9 = null;
            }

            GameProfile $$10 = $$9 != null ? $$9.f() : null;
            fsj $$11 = this.l.get($$8.b());
            gah $$12 = gco.a($$8.b(), $$10);
            gco.a(null, 180.0F, 0.0F, $$2, $$3, $$4, $$11, $$12);
         } else {
            doz $$13 = $$7.n();
            dmf $$14;
            if ($$7 instanceof dap) {
               this.f.a($$0, ((dap)$$7).b());
               $$14 = this.f;
            } else if ($$7 instanceof dbr) {
               this.g.a(((dbr)$$7).b());
               $$14 = this.g;
            } else if ($$13.a(dca.mX)) {
               $$14 = this.h;
            } else if ($$13.a(dca.cv)) {
               $$14 = this.c;
            } else if ($$13.a(dca.fG)) {
               $$14 = this.e;
            } else if ($$13.a(dca.gV)) {
               $$14 = this.d;
            } else if ($$13.a(dca.tp)) {
               this.i.b($$0);
               $$14 = this.i;
            } else {
               if (!($$7 instanceof diw)) {
                  return;
               }

               cqc $$21 = diw.b($$6);
               if ($$21 == null) {
                  $$14 = b;
               } else {
                  $$14 = a[$$21.a()];
               }
            }

            this.m.a($$14, $$2, $$3, $$4, $$5);
         }
      } else {
         if ($$0.a(crm.vq)) {
            dlw $$25 = $$0.a(jp.N, dlw.a);
            cqc $$26 = $$0.a(jp.O);
            boolean $$27 = !$$25.b().isEmpty() || $$26 != null;
            $$2.a();
            $$2.b(1.0F, -1.0F, -1.0F);
            gnm $$28 = $$27 ? gno.g : gno.h;
            ewm $$29 = $$28.c().a(ggg.c($$3, this.j.a($$28.a()), true, $$0.x()));
            this.j.c().a($$2, $$29, $$4, $$5, 1.0F, 1.0F, 1.0F, 1.0F);
            if ($$27) {
               dlw $$30 = $$25.a(Objects.requireNonNullElse($$26, cqc.a));
               gbu.a($$2, $$3, $$4, $$5, this.j.b(), $$28, false, $$30, $$0.x());
            } else {
               this.j.b().a($$2, $$29, $$4, $$5, 1.0F, 1.0F, 1.0F, 1.0F);
            }

            $$2.b();
         } else if ($$0.a(crm.vN)) {
            $$2.a();
            $$2.b(1.0F, -1.0F, -1.0F);
            ewm $$31 = ggg.c($$3, this.k.a(fsr.a), false, $$0.x());
            this.k.a($$2, $$31, $$4, $$5, 1.0F, 1.0F, 1.0F, 1.0F);
            $$2.b();
         }
      }
   }
}
