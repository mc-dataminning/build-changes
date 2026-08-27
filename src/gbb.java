import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.Objects;

public class gbb implements ats {
   private static final dov[] a = Arrays.stream(crs.values())
      .sorted(Comparator.comparingInt(crs::a))
      .map($$0 -> new dov($$0, in.c, ddg.kP.n()))
      .toArray(dov[]::new);
   private static final dov b = new dov(in.c, ddg.kP.n());
   private final dnt c = new dnt(in.c, ddg.cv.n());
   private final dnt d = new dpf(in.c, ddg.gV.n());
   private final doh e = new doh(in.c, ddg.fG.n());
   private final dnb f = new dnb(in.c, ddg.iJ.n());
   private final dni g = new dni(in.c, ddg.bn.n());
   private final dny h = new dny(in.c, ddg.mX.n());
   private final doc i = new doc(in.c, ddg.tp.n());
   private fts j;
   private fug k;
   private Map<dkg.a, fty> l;
   private final gdn m;
   private final fux n;

   public gbb(gdn $$0, fux $$1) {
      this.m = $$0;
      this.n = $$1;
   }

   @Override
   public void a(atr $$0) {
      this.j = new fts(this.n.a(fva.bj));
      this.k = new fug(this.n.a(fva.bI));
      this.l = ged.a(this.n);
   }

   public void a(csz $$0, csw $$1, exx $$2, gbo $$3, int $$4, int $$5) {
      csu $$6 = $$0.f();
      if ($$6 instanceof cqx) {
         dde $$7 = ((cqx)$$6).d();
         if ($$7 instanceof dca $$8) {
            cvz $$9 = $$0.a(ka.S);
            if ($$9 != null && !$$9.b()) {
               $$0.c(ka.S);
               $$9.a().thenAcceptAsync($$1x -> $$0.b(ka.S, $$1x), fde.Q());
               $$9 = null;
            }

            fty $$10 = this.l.get($$8.b());
            gbw $$11 = ged.a($$8.b(), $$9);
            ged.a(null, 180.0F, 0.0F, $$2, $$3, $$4, $$10, $$11);
         } else {
            dqh $$12 = $$7.n();
            dnm $$13;
            if ($$7 instanceof dbv) {
               this.f.a($$0, ((dbv)$$7).b());
               $$13 = this.f;
            } else if ($$7 instanceof dcx) {
               this.g.a(((dcx)$$7).b());
               $$13 = this.g;
            } else if ($$12.a(ddg.mX)) {
               $$13 = this.h;
            } else if ($$12.a(ddg.cv)) {
               $$13 = this.c;
            } else if ($$12.a(ddg.fG)) {
               $$13 = this.e;
            } else if ($$12.a(ddg.gV)) {
               $$13 = this.d;
            } else if ($$12.a(ddg.tp)) {
               this.i.c($$0);
               $$13 = this.i;
            } else {
               if (!($$7 instanceof dkd)) {
                  return;
               }

               crs $$20 = dkd.b($$6);
               if ($$20 == null) {
                  $$13 = b;
               } else {
                  $$13 = a[$$20.a()];
               }
            }

            this.m.a($$13, $$2, $$3, $$4, $$5);
         }
      } else {
         if ($$0.a(ctc.vs)) {
            dnd $$24 = $$0.a(ka.U, dnd.a);
            crs $$25 = $$0.a(ka.V);
            boolean $$26 = !$$24.b().isEmpty() || $$25 != null;
            $$2.a();
            $$2.b(1.0F, -1.0F, -1.0F);
            gpc $$27 = $$26 ? gpe.g : gpe.h;
            eyb $$28 = $$27.c().a(ghv.c($$3, this.j.a($$27.a()), true, $$0.x()));
            this.j.c().a($$2, $$28, $$4, $$5, 1.0F, 1.0F, 1.0F, 1.0F);
            if ($$26) {
               gdj.a($$2, $$3, $$4, $$5, this.j.b(), $$27, false, Objects.requireNonNullElse($$25, crs.a), $$24, $$0.x());
            } else {
               this.j.b().a($$2, $$28, $$4, $$5, 1.0F, 1.0F, 1.0F, 1.0F);
            }

            $$2.b();
         } else if ($$0.a(ctc.vP)) {
            $$2.a();
            $$2.b(1.0F, -1.0F, -1.0F);
            eyb $$29 = ghv.c($$3, this.k.a(fug.a), false, $$0.x());
            this.k.a($$2, $$29, $$4, $$5, 1.0F, 1.0F, 1.0F, 1.0F);
            $$2.b();
         }
      }
   }
}
