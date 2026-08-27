import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.Objects;

public class gbx implements aty {
   private static final dpr[] a = Arrays.stream(csj.values())
      .sorted(Comparator.comparingInt(csj::a))
      .map($$0 -> new dpr($$0, io.c, dec.kP.n()))
      .toArray(dpr[]::new);
   private static final dpr b = new dpr(io.c, dec.kP.n());
   private final dop c = new dop(io.c, dec.cv.n());
   private final dop d = new dqb(io.c, dec.gV.n());
   private final dpd e = new dpd(io.c, dec.fG.n());
   private final dnx f = new dnx(io.c, dec.iJ.n());
   private final doe g = new doe(io.c, dec.bn.n());
   private final dou h = new dou(io.c, dec.mX.n());
   private final doy i = new doy(io.c, dec.tp.n());
   private fun j;
   private fvb k;
   private Map<dlc.a, fut> l;
   private final gej m;
   private final fvs n;

   public gbx(gej $$0, fvs $$1) {
      this.m = $$0;
      this.n = $$1;
   }

   @Override
   public void a(atx $$0) {
      this.j = new fun(this.n.a(fvv.bj));
      this.k = new fvb(this.n.a(fvv.bI));
      this.l = gez.a(this.n);
   }

   public void a(ctq $$0, ctn $$1, eyu $$2, gck $$3, int $$4, int $$5) {
      ctl $$6 = $$0.g();
      if ($$6 instanceof cro) {
         dea $$7 = ((cro)$$6).d();
         if ($$7 instanceof dcw $$8) {
            cws $$9 = $$0.a(kb.U);
            if ($$9 != null && !$$9.b()) {
               $$0.c(kb.U);
               $$9.a().thenAcceptAsync($$1x -> $$0.b(kb.U, $$1x), feb.Q());
               $$9 = null;
            }

            fut $$10 = this.l.get($$8.b());
            gcs $$11 = gez.a($$8.b(), $$9);
            gez.a(null, 180.0F, 0.0F, $$2, $$3, $$4, $$10, $$11);
         } else {
            drd $$12 = $$7.n();
            doi $$13;
            if ($$7 instanceof dcr) {
               this.f.a($$0, ((dcr)$$7).b());
               $$13 = this.f;
            } else if ($$7 instanceof ddt) {
               this.g.a(((ddt)$$7).b());
               $$13 = this.g;
            } else if ($$12.a(dec.mX)) {
               $$13 = this.h;
            } else if ($$12.a(dec.cv)) {
               $$13 = this.c;
            } else if ($$12.a(dec.fG)) {
               $$13 = this.e;
            } else if ($$12.a(dec.gV)) {
               $$13 = this.d;
            } else if ($$12.a(dec.tp)) {
               this.i.c($$0);
               $$13 = this.i;
            } else {
               if (!($$7 instanceof dkz)) {
                  return;
               }

               csj $$20 = dkz.b($$6);
               if ($$20 == null) {
                  $$13 = b;
               } else {
                  $$13 = a[$$20.a()];
               }
            }

            this.m.a($$13, $$2, $$3, $$4, $$5);
         }
      } else {
         if ($$0.a(ctt.vs)) {
            dnz $$24 = $$0.a(kb.W, dnz.a);
            csj $$25 = $$0.a(kb.X);
            boolean $$26 = !$$24.b().isEmpty() || $$25 != null;
            $$2.a();
            $$2.b(1.0F, -1.0F, -1.0F);
            gpz $$27 = $$26 ? gqb.g : gqb.h;
            eyy $$28 = $$27.c().a(gir.c($$3, this.j.a($$27.a()), true, $$0.y()));
            this.j.c().a($$2, $$28, $$4, $$5, 1.0F, 1.0F, 1.0F, 1.0F);
            if ($$26) {
               gef.a($$2, $$3, $$4, $$5, this.j.b(), $$27, false, Objects.requireNonNullElse($$25, csj.a), $$24, $$0.y());
            } else {
               this.j.b().a($$2, $$28, $$4, $$5, 1.0F, 1.0F, 1.0F, 1.0F);
            }

            $$2.b();
         } else if ($$0.a(ctt.vP)) {
            $$2.a();
            $$2.b(1.0F, -1.0F, -1.0F);
            eyy $$29 = gir.c($$3, this.k.a(fvb.a), false, $$0.y());
            this.k.a($$2, $$29, $$4, $$5, 1.0F, 1.0F, 1.0F, 1.0F);
            $$2.b();
         }
      }
   }
}
