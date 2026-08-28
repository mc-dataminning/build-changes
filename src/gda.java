import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.Objects;

public class gda implements aup {
   private static final dqp[] a = Arrays.stream(cth.values())
      .sorted(Comparator.comparingInt(cth::a))
      .map($$0 -> new dqp($$0, iz.c, dfa.kP.o()))
      .toArray(dqp[]::new);
   private static final dqp b = new dqp(iz.c, dfa.kP.o());
   private final dpn c = new dpn(iz.c, dfa.cv.o());
   private final dpn d = new dqz(iz.c, dfa.gV.o());
   private final dqb e = new dqb(iz.c, dfa.fG.o());
   private final dov f = new dov(iz.c, dfa.iJ.o());
   private final dpc g = new dpc(iz.c, dfa.bn.o());
   private final dps h = new dps(iz.c, dfa.mX.o());
   private final dpw i = new dpw(iz.c, dfa.tp.o());
   private fvq j;
   private fwe k;
   private Map<dma.a, fvw> l;
   private final gfm m;
   private final fwv n;

   public gda(gfm $$0, fwv $$1) {
      this.m = $$0;
      this.n = $$1;
   }

   @Override
   public void a(auo $$0) {
      this.j = new fvq(this.n.a(fwy.bj));
      this.k = new fwe(this.n.a(fwy.bI));
      this.l = ggc.a(this.n);
   }

   public void a(cuo $$0, cul $$1, ezx $$2, gdn $$3, int $$4, int $$5) {
      cuj $$6 = $$0.g();
      if ($$6 instanceof csm) {
         dey $$7 = ((csm)$$6).d();
         if ($$7 instanceof ddu $$8) {
            cxq $$9 = $$0.a(km.V);
            if ($$9 != null && !$$9.b()) {
               $$0.c(km.V);
               $$9.a().thenAcceptAsync($$1x -> $$0.b(km.V, $$1x), ffe.Q());
               $$9 = null;
            }

            fvw $$10 = this.l.get($$8.b());
            gdv $$11 = ggc.a($$8.b(), $$9);
            ggc.a(null, 180.0F, 0.0F, $$2, $$3, $$4, $$10, $$11);
         } else {
            dsb $$12 = $$7.o();
            dpg $$13;
            if ($$7 instanceof ddp) {
               this.f.a($$0, ((ddp)$$7).b());
               $$13 = this.f;
            } else if ($$7 instanceof der) {
               this.g.a(((der)$$7).b());
               $$13 = this.g;
            } else if ($$12.a(dfa.mX)) {
               $$13 = this.h;
            } else if ($$12.a(dfa.cv)) {
               $$13 = this.c;
            } else if ($$12.a(dfa.fG)) {
               $$13 = this.e;
            } else if ($$12.a(dfa.gV)) {
               $$13 = this.d;
            } else if ($$12.a(dfa.tp)) {
               this.i.c($$0);
               $$13 = this.i;
            } else {
               if (!($$7 instanceof dlx)) {
                  return;
               }

               cth $$20 = dlx.b($$6);
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
            dox $$24 = $$0.a(km.X, dox.a);
            cth $$25 = $$0.a(km.Y);
            boolean $$26 = !$$24.b().isEmpty() || $$25 != null;
            $$2.a();
            $$2.b(1.0F, -1.0F, -1.0F);
            grc $$27 = $$26 ? gre.g : gre.h;
            fab $$28 = $$27.c().a(gju.c($$3, this.j.a($$27.a()), true, $$0.y()));
            this.j.c().a($$2, $$28, $$4, $$5, 1.0F, 1.0F, 1.0F, 1.0F);
            if ($$26) {
               gfi.a($$2, $$3, $$4, $$5, this.j.b(), $$27, false, Objects.requireNonNullElse($$25, cth.a), $$24, $$0.y());
            } else {
               this.j.b().a($$2, $$28, $$4, $$5, 1.0F, 1.0F, 1.0F, 1.0F);
            }

            $$2.b();
         } else if ($$0.a(cur.vP)) {
            $$2.a();
            $$2.b(1.0F, -1.0F, -1.0F);
            fab $$29 = gju.c($$3, this.k.a(fwe.a), false, $$0.y());
            this.k.a($$2, $$29, $$4, $$5, 1.0F, 1.0F, 1.0F, 1.0F);
            $$2.b();
         }
      }
   }
}
