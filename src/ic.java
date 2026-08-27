import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Map;
import java.util.function.Predicate;

public interface ic {
   Map<cir, ic> a = a();
   Map<cir, ic> b = a();
   Map<cir, ic> c = a();
   Map<cir, ic> d = a();
   ic e = ($$0, $$1, $$2, $$3, $$4, $$5) -> a($$1, $$2, $$3, $$4, $$5, csl.fu.n().a(cwq.e, Integer.valueOf(3)), aou.cv);
   ic f = ($$0, $$1, $$2, $$3, $$4, $$5) -> a($$1, $$2, $$3, $$4, $$5, csl.fv.n(), aou.cy);
   ic g = ($$0, $$1, $$2, $$3, $$4, $$5) -> a($$1, $$2, $$3, $$4, $$5, csl.fw.n().a(cwq.e, Integer.valueOf(3)), aou.cz);
   ic h = ($$0, $$1, $$2, $$3, $$4, $$5) -> {
      csk $$6 = csk.a($$5.d());
      if (!($$6 instanceof czj)) {
         return bgo.d;
      } else {
         if (!$$1.B) {
            ciw $$7 = new ciw(csl.kP);
            if ($$5.u()) {
               $$7.c($$5.v().h());
            }

            $$3.a($$4, $$7);
            $$3.a(ape.Z);
            cwq.e($$0, $$1, $$2);
         }

         return bgo.a($$1.B);
      }
   };
   ic i = ($$0, $$1, $$2, $$3, $$4, $$5) -> {
      if (dca.c($$5) <= 0) {
         return bgo.d;
      } else {
         if (!$$1.B) {
            ciw $$6 = $$5.c(1);
            dca.d($$6);
            if (!$$3.fR().d) {
               $$5.h(1);
            }

            if ($$5.b()) {
               $$3.a($$4, $$6);
            } else if ($$3.fQ().e($$6)) {
               $$3.bP.b();
            } else {
               $$3.a($$6, false);
            }

            $$3.a(ape.Y);
            cwq.e($$0, $$1, $$2);
         }

         return bgo.a($$1.B);
      }
   };
   ic j = ($$0, $$1, $$2, $$3, $$4, $$5) -> {
      if (!($$5.d() instanceof cho $$7)) {
         return bgo.d;
      } else if (!$$7.a($$5)) {
         return bgo.d;
      } else {
         if (!$$1.B) {
            $$7.f_($$5);
            $$3.a(ape.X);
            cwq.e($$0, $$1, $$2);
         }

         return bgo.a($$1.B);
      }
   };

   static Object2ObjectOpenHashMap<cir, ic> a() {
      return ac.a(new Object2ObjectOpenHashMap(), $$0 -> $$0.defaultReturnValue((ic)($$0x, $$1, $$2, $$3, $$4, $$5) -> bgo.d));
   }

   bgo interact(dey var1, cpk var2, gv var3, cbl var4, bgn var5, ciw var6);

   static void b() {
      a(a);
      a.put(ciz.rv, ($$0, $$1, $$2, $$3, $$4, $$5) -> {
         if (ckv.d($$5) != ckw.c) {
            return bgo.d;
         } else {
            if (!$$1.B) {
               cir $$6 = $$5.d();
               $$3.a($$4, ciy.a($$5, $$3, new ciw(ciz.rw)));
               $$3.a(ape.W);
               $$3.b(ape.c.b($$6));
               $$1.b($$2, csl.fu.n());
               $$1.a(null, $$2, aou.ch, aov.e, 1.0F, 1.0F);
               $$1.a(null, dji.z, $$2);
            }

            return bgo.a($$1.B);
         }
      });
      a(b);
      b.put(ciz.pK, ($$0, $$1, $$2, $$3, $$4, $$5) -> a($$0, $$1, $$2, $$3, $$4, $$5, new ciw(ciz.pL), $$0x -> $$0x.c(cwq.e) == 3, aou.cB));
      b.put(ciz.rw, ($$0, $$1, $$2, $$3, $$4, $$5) -> {
         if (!$$1.B) {
            cir $$6 = $$5.d();
            $$3.a($$4, ciy.a($$5, $$3, ckv.a(new ciw(ciz.rv), ckw.c)));
            $$3.a(ape.W);
            $$3.b(ape.c.b($$6));
            cwq.e($$0, $$1, $$2);
            $$1.a(null, $$2, aou.ci, aov.e, 1.0F, 1.0F);
            $$1.a(null, dji.y, $$2);
         }

         return bgo.a($$1.B);
      });
      b.put(ciz.rv, ($$0, $$1, $$2, $$3, $$4, $$5) -> {
         if ($$0.c(cwq.e) != 3 && ckv.d($$5) == ckw.c) {
            if (!$$1.B) {
               $$3.a($$4, ciy.a($$5, $$3, new ciw(ciz.rw)));
               $$3.a(ape.W);
               $$3.b(ape.c.b($$5.d()));
               $$1.b($$2, $$0.a(cwq.e));
               $$1.a(null, $$2, aou.ch, aov.e, 1.0F, 1.0F);
               $$1.a(null, dji.z, $$2);
            }

            return bgo.a($$1.B);
         } else {
            return bgo.d;
         }
      });
      b.put(ciz.oN, j);
      b.put(ciz.oM, j);
      b.put(ciz.oL, j);
      b.put(ciz.oK, j);
      b.put(ciz.tP, j);
      b.put(ciz.tV, i);
      b.put(ciz.uc, i);
      b.put(ciz.uk, i);
      b.put(ciz.ug, i);
      b.put(ciz.uh, i);
      b.put(ciz.ue, i);
      b.put(ciz.ui, i);
      b.put(ciz.tY, i);
      b.put(ciz.ud, i);
      b.put(ciz.ua, i);
      b.put(ciz.tX, i);
      b.put(ciz.tW, i);
      b.put(ciz.ub, i);
      b.put(ciz.uf, i);
      b.put(ciz.uj, i);
      b.put(ciz.tZ, i);
      b.put(ciz.iH, h);
      b.put(ciz.iO, h);
      b.put(ciz.iW, h);
      b.put(ciz.iS, h);
      b.put(ciz.iT, h);
      b.put(ciz.iQ, h);
      b.put(ciz.iU, h);
      b.put(ciz.iK, h);
      b.put(ciz.iP, h);
      b.put(ciz.iM, h);
      b.put(ciz.iJ, h);
      b.put(ciz.iI, h);
      b.put(ciz.iN, h);
      b.put(ciz.iR, h);
      b.put(ciz.iV, h);
      b.put(ciz.iL, h);
      c.put(ciz.pK, ($$0, $$1, $$2, $$3, $$4, $$5) -> a($$0, $$1, $$2, $$3, $$4, $$5, new ciw(ciz.pM), $$0x -> true, aou.cE));
      a(c);
      d.put(ciz.pK, ($$0, $$1, $$2, $$3, $$4, $$5) -> a($$0, $$1, $$2, $$3, $$4, $$5, new ciw(ciz.pN), $$0x -> $$0x.c(cwq.e) == 3, aou.cF));
      a(d);
   }

   static void a(Map<cir, ic> $$0) {
      $$0.put(ciz.pM, f);
      $$0.put(ciz.pL, e);
      $$0.put(ciz.pN, g);
   }

   static bgo a(dey $$0, cpk $$1, gv $$2, cbl $$3, bgn $$4, ciw $$5, ciw $$6, Predicate<dey> $$7, aot $$8) {
      if (!$$7.test($$0)) {
         return bgo.d;
      } else {
         if (!$$1.B) {
            cir $$9 = $$5.d();
            $$3.a($$4, ciy.a($$5, $$3, $$6));
            $$3.a(ape.W);
            $$3.b(ape.c.b($$9));
            $$1.b($$2, csl.ft.n());
            $$1.a(null, $$2, $$8, aov.e, 1.0F, 1.0F);
            $$1.a(null, dji.y, $$2);
         }

         return bgo.a($$1.B);
      }
   }

   static bgo a(cpk $$0, gv $$1, cbl $$2, bgn $$3, ciw $$4, dey $$5, aot $$6) {
      if (!$$0.B) {
         cir $$7 = $$4.d();
         $$2.a($$3, ciy.a($$4, $$2, new ciw(ciz.pK)));
         $$2.a(ape.V);
         $$2.b(ape.c.b($$7));
         $$0.b($$1, $$5);
         $$0.a(null, $$1, $$6, aov.e, 1.0F, 1.0F);
         $$0.a(null, dji.z, $$1);
      }

      return bgo.a($$0.B);
   }
}
