import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Map;
import java.util.function.Predicate;

public interface ia {
   Map<cja, ia> a = a();
   Map<cja, ia> b = a();
   Map<cja, ia> c = a();
   Map<cja, ia> d = a();
   ia e = ($$0, $$1, $$2, $$3, $$4, $$5) -> a($$1, $$2, $$3, $$4, $$5, csw.fu.n().a(cxb.e, Integer.valueOf(3)), apd.cv);
   ia f = ($$0, $$1, $$2, $$3, $$4, $$5) -> a($$1, $$2, $$3, $$4, $$5, csw.fv.n(), apd.cy);
   ia g = ($$0, $$1, $$2, $$3, $$4, $$5) -> a($$1, $$2, $$3, $$4, $$5, csw.fw.n().a(cxb.e, Integer.valueOf(3)), apd.cz);
   ia h = ($$0, $$1, $$2, $$3, $$4, $$5) -> {
      csv $$6 = csv.a($$5.d());
      if (!($$6 instanceof czu)) {
         return bgy.d;
      } else {
         if (!$$1.B) {
            cjf $$7 = new cjf(csw.kP);
            if ($$5.u()) {
               $$7.c($$5.v().h());
            }

            $$3.a($$4, $$7);
            $$3.a(apn.Z);
            cxb.e($$0, $$1, $$2);
         }

         return bgy.a($$1.B);
      }
   };
   ia i = ($$0, $$1, $$2, $$3, $$4, $$5) -> {
      if (dcl.c($$5) <= 0) {
         return bgy.d;
      } else {
         if (!$$1.B) {
            cjf $$6 = $$5.c(1);
            dcl.d($$6);
            if (!$$3.fS().d) {
               $$5.h(1);
            }

            if ($$5.b()) {
               $$3.a($$4, $$6);
            } else if ($$3.fR().e($$6)) {
               $$3.bR.b();
            } else {
               $$3.a($$6, false);
            }

            $$3.a(apn.Y);
            cxb.e($$0, $$1, $$2);
         }

         return bgy.a($$1.B);
      }
   };
   ia j = ($$0, $$1, $$2, $$3, $$4, $$5) -> {
      if (!($$5.d() instanceof chx $$7)) {
         return bgy.d;
      } else if (!$$7.a($$5)) {
         return bgy.d;
      } else {
         if (!$$1.B) {
            $$7.f_($$5);
            $$3.a(apn.X);
            cxb.e($$0, $$1, $$2);
         }

         return bgy.a($$1.B);
      }
   };

   static Object2ObjectOpenHashMap<cja, ia> a() {
      return ac.a(new Object2ObjectOpenHashMap(), $$0 -> $$0.defaultReturnValue((ia)($$0x, $$1, $$2, $$3, $$4, $$5) -> bgy.d));
   }

   bgy interact(dfj var1, cpv var2, gw var3, cbu var4, bgx var5, cjf var6);

   static void b() {
      a(a);
      a.put(cji.rv, ($$0, $$1, $$2, $$3, $$4, $$5) -> {
         if (cle.d($$5) != clf.c) {
            return bgy.d;
         } else {
            if (!$$1.B) {
               cja $$6 = $$5.d();
               $$3.a($$4, cjh.a($$5, $$3, new cjf(cji.rw)));
               $$3.a(apn.W);
               $$3.b(apn.c.b($$6));
               $$1.b($$2, csw.fu.n());
               $$1.a(null, $$2, apd.ch, ape.e, 1.0F, 1.0F);
               $$1.a(null, djt.z, $$2);
            }

            return bgy.a($$1.B);
         }
      });
      a(b);
      b.put(cji.pK, ($$0, $$1, $$2, $$3, $$4, $$5) -> a($$0, $$1, $$2, $$3, $$4, $$5, new cjf(cji.pL), $$0x -> $$0x.c(cxb.e) == 3, apd.cB));
      b.put(cji.rw, ($$0, $$1, $$2, $$3, $$4, $$5) -> {
         if (!$$1.B) {
            cja $$6 = $$5.d();
            $$3.a($$4, cjh.a($$5, $$3, cle.a(new cjf(cji.rv), clf.c)));
            $$3.a(apn.W);
            $$3.b(apn.c.b($$6));
            cxb.e($$0, $$1, $$2);
            $$1.a(null, $$2, apd.ci, ape.e, 1.0F, 1.0F);
            $$1.a(null, djt.y, $$2);
         }

         return bgy.a($$1.B);
      });
      b.put(cji.rv, ($$0, $$1, $$2, $$3, $$4, $$5) -> {
         if ($$0.c(cxb.e) != 3 && cle.d($$5) == clf.c) {
            if (!$$1.B) {
               $$3.a($$4, cjh.a($$5, $$3, new cjf(cji.rw)));
               $$3.a(apn.W);
               $$3.b(apn.c.b($$5.d()));
               $$1.b($$2, $$0.a(cxb.e));
               $$1.a(null, $$2, apd.ch, ape.e, 1.0F, 1.0F);
               $$1.a(null, djt.z, $$2);
            }

            return bgy.a($$1.B);
         } else {
            return bgy.d;
         }
      });
      b.put(cji.oN, j);
      b.put(cji.oM, j);
      b.put(cji.oL, j);
      b.put(cji.oK, j);
      b.put(cji.tP, j);
      b.put(cji.tV, i);
      b.put(cji.uc, i);
      b.put(cji.uk, i);
      b.put(cji.ug, i);
      b.put(cji.uh, i);
      b.put(cji.ue, i);
      b.put(cji.ui, i);
      b.put(cji.tY, i);
      b.put(cji.ud, i);
      b.put(cji.ua, i);
      b.put(cji.tX, i);
      b.put(cji.tW, i);
      b.put(cji.ub, i);
      b.put(cji.uf, i);
      b.put(cji.uj, i);
      b.put(cji.tZ, i);
      b.put(cji.iH, h);
      b.put(cji.iO, h);
      b.put(cji.iW, h);
      b.put(cji.iS, h);
      b.put(cji.iT, h);
      b.put(cji.iQ, h);
      b.put(cji.iU, h);
      b.put(cji.iK, h);
      b.put(cji.iP, h);
      b.put(cji.iM, h);
      b.put(cji.iJ, h);
      b.put(cji.iI, h);
      b.put(cji.iN, h);
      b.put(cji.iR, h);
      b.put(cji.iV, h);
      b.put(cji.iL, h);
      c.put(cji.pK, ($$0, $$1, $$2, $$3, $$4, $$5) -> a($$0, $$1, $$2, $$3, $$4, $$5, new cjf(cji.pM), $$0x -> true, apd.cE));
      a(c);
      d.put(cji.pK, ($$0, $$1, $$2, $$3, $$4, $$5) -> a($$0, $$1, $$2, $$3, $$4, $$5, new cjf(cji.pN), $$0x -> $$0x.c(cxb.e) == 3, apd.cF));
      a(d);
   }

   static void a(Map<cja, ia> $$0) {
      $$0.put(cji.pM, f);
      $$0.put(cji.pL, e);
      $$0.put(cji.pN, g);
   }

   static bgy a(dfj $$0, cpv $$1, gw $$2, cbu $$3, bgx $$4, cjf $$5, cjf $$6, Predicate<dfj> $$7, apc $$8) {
      if (!$$7.test($$0)) {
         return bgy.d;
      } else {
         if (!$$1.B) {
            cja $$9 = $$5.d();
            $$3.a($$4, cjh.a($$5, $$3, $$6));
            $$3.a(apn.W);
            $$3.b(apn.c.b($$9));
            $$1.b($$2, csw.ft.n());
            $$1.a(null, $$2, $$8, ape.e, 1.0F, 1.0F);
            $$1.a(null, djt.y, $$2);
         }

         return bgy.a($$1.B);
      }
   }

   static bgy a(cpv $$0, gw $$1, cbu $$2, bgx $$3, cjf $$4, dfj $$5, apc $$6) {
      if (!$$0.B) {
         cja $$7 = $$4.d();
         $$2.a($$3, cjh.a($$4, $$2, new cjf(cji.pK)));
         $$2.a(apn.V);
         $$2.b(apn.c.b($$7));
         $$0.b($$1, $$5);
         $$0.a(null, $$1, $$6, ape.e, 1.0F, 1.0F);
         $$0.a(null, djt.z, $$1);
      }

      return bgy.a($$0.B);
   }
}
