import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Map;
import java.util.function.Predicate;

public interface ib {
   Map<cis, ib> a = a();
   Map<cis, ib> b = a();
   Map<cis, ib> c = a();
   Map<cis, ib> d = a();
   ib e = ($$0, $$1, $$2, $$3, $$4, $$5) -> a($$1, $$2, $$3, $$4, $$5, csm.fu.n().a(cwr.e, Integer.valueOf(3)), aow.cv);
   ib f = ($$0, $$1, $$2, $$3, $$4, $$5) -> a($$1, $$2, $$3, $$4, $$5, csm.fv.n(), aow.cy);
   ib g = ($$0, $$1, $$2, $$3, $$4, $$5) -> a($$1, $$2, $$3, $$4, $$5, csm.fw.n().a(cwr.e, Integer.valueOf(3)), aow.cz);
   ib h = ($$0, $$1, $$2, $$3, $$4, $$5) -> {
      csl $$6 = csl.a($$5.d());
      if (!($$6 instanceof czk)) {
         return bgq.d;
      } else {
         if (!$$1.B) {
            cix $$7 = new cix(csm.kP);
            if ($$5.u()) {
               $$7.c($$5.v().h());
            }

            $$3.a($$4, $$7);
            $$3.a(apg.Z);
            cwr.e($$0, $$1, $$2);
         }

         return bgq.a($$1.B);
      }
   };
   ib i = ($$0, $$1, $$2, $$3, $$4, $$5) -> {
      if (dcb.c($$5) <= 0) {
         return bgq.d;
      } else {
         if (!$$1.B) {
            cix $$6 = $$5.c(1);
            dcb.d($$6);
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

            $$3.a(apg.Y);
            cwr.e($$0, $$1, $$2);
         }

         return bgq.a($$1.B);
      }
   };
   ib j = ($$0, $$1, $$2, $$3, $$4, $$5) -> {
      if (!($$5.d() instanceof chp $$7)) {
         return bgq.d;
      } else if (!$$7.a($$5)) {
         return bgq.d;
      } else {
         if (!$$1.B) {
            $$7.f_($$5);
            $$3.a(apg.X);
            cwr.e($$0, $$1, $$2);
         }

         return bgq.a($$1.B);
      }
   };

   static Object2ObjectOpenHashMap<cis, ib> a() {
      return ac.a(new Object2ObjectOpenHashMap(), $$0 -> $$0.defaultReturnValue((ib)($$0x, $$1, $$2, $$3, $$4, $$5) -> bgq.d));
   }

   bgq interact(dez var1, cpl var2, gu var3, cbm var4, bgp var5, cix var6);

   static void b() {
      a(a);
      a.put(cja.rv, ($$0, $$1, $$2, $$3, $$4, $$5) -> {
         if (ckw.d($$5) != ckx.c) {
            return bgq.d;
         } else {
            if (!$$1.B) {
               cis $$6 = $$5.d();
               $$3.a($$4, ciz.a($$5, $$3, new cix(cja.rw)));
               $$3.a(apg.W);
               $$3.b(apg.c.b($$6));
               $$1.b($$2, csm.fu.n());
               $$1.a(null, $$2, aow.ch, aox.e, 1.0F, 1.0F);
               $$1.a(null, djj.z, $$2);
            }

            return bgq.a($$1.B);
         }
      });
      a(b);
      b.put(cja.pK, ($$0, $$1, $$2, $$3, $$4, $$5) -> a($$0, $$1, $$2, $$3, $$4, $$5, new cix(cja.pL), $$0x -> $$0x.c(cwr.e) == 3, aow.cB));
      b.put(cja.rw, ($$0, $$1, $$2, $$3, $$4, $$5) -> {
         if (!$$1.B) {
            cis $$6 = $$5.d();
            $$3.a($$4, ciz.a($$5, $$3, ckw.a(new cix(cja.rv), ckx.c)));
            $$3.a(apg.W);
            $$3.b(apg.c.b($$6));
            cwr.e($$0, $$1, $$2);
            $$1.a(null, $$2, aow.ci, aox.e, 1.0F, 1.0F);
            $$1.a(null, djj.y, $$2);
         }

         return bgq.a($$1.B);
      });
      b.put(cja.rv, ($$0, $$1, $$2, $$3, $$4, $$5) -> {
         if ($$0.c(cwr.e) != 3 && ckw.d($$5) == ckx.c) {
            if (!$$1.B) {
               $$3.a($$4, ciz.a($$5, $$3, new cix(cja.rw)));
               $$3.a(apg.W);
               $$3.b(apg.c.b($$5.d()));
               $$1.b($$2, $$0.a(cwr.e));
               $$1.a(null, $$2, aow.ch, aox.e, 1.0F, 1.0F);
               $$1.a(null, djj.z, $$2);
            }

            return bgq.a($$1.B);
         } else {
            return bgq.d;
         }
      });
      b.put(cja.oN, j);
      b.put(cja.oM, j);
      b.put(cja.oL, j);
      b.put(cja.oK, j);
      b.put(cja.tP, j);
      b.put(cja.tV, i);
      b.put(cja.uc, i);
      b.put(cja.uk, i);
      b.put(cja.ug, i);
      b.put(cja.uh, i);
      b.put(cja.ue, i);
      b.put(cja.ui, i);
      b.put(cja.tY, i);
      b.put(cja.ud, i);
      b.put(cja.ua, i);
      b.put(cja.tX, i);
      b.put(cja.tW, i);
      b.put(cja.ub, i);
      b.put(cja.uf, i);
      b.put(cja.uj, i);
      b.put(cja.tZ, i);
      b.put(cja.iH, h);
      b.put(cja.iO, h);
      b.put(cja.iW, h);
      b.put(cja.iS, h);
      b.put(cja.iT, h);
      b.put(cja.iQ, h);
      b.put(cja.iU, h);
      b.put(cja.iK, h);
      b.put(cja.iP, h);
      b.put(cja.iM, h);
      b.put(cja.iJ, h);
      b.put(cja.iI, h);
      b.put(cja.iN, h);
      b.put(cja.iR, h);
      b.put(cja.iV, h);
      b.put(cja.iL, h);
      c.put(cja.pK, ($$0, $$1, $$2, $$3, $$4, $$5) -> a($$0, $$1, $$2, $$3, $$4, $$5, new cix(cja.pM), $$0x -> true, aow.cE));
      a(c);
      d.put(cja.pK, ($$0, $$1, $$2, $$3, $$4, $$5) -> a($$0, $$1, $$2, $$3, $$4, $$5, new cix(cja.pN), $$0x -> $$0x.c(cwr.e) == 3, aow.cF));
      a(d);
   }

   static void a(Map<cis, ib> $$0) {
      $$0.put(cja.pM, f);
      $$0.put(cja.pL, e);
      $$0.put(cja.pN, g);
   }

   static bgq a(dez $$0, cpl $$1, gu $$2, cbm $$3, bgp $$4, cix $$5, cix $$6, Predicate<dez> $$7, aov $$8) {
      if (!$$7.test($$0)) {
         return bgq.d;
      } else {
         if (!$$1.B) {
            cis $$9 = $$5.d();
            $$3.a($$4, ciz.a($$5, $$3, $$6));
            $$3.a(apg.W);
            $$3.b(apg.c.b($$9));
            $$1.b($$2, csm.ft.n());
            $$1.a(null, $$2, $$8, aox.e, 1.0F, 1.0F);
            $$1.a(null, djj.y, $$2);
         }

         return bgq.a($$1.B);
      }
   }

   static bgq a(cpl $$0, gu $$1, cbm $$2, bgp $$3, cix $$4, dez $$5, aov $$6) {
      if (!$$0.B) {
         cis $$7 = $$4.d();
         $$2.a($$3, ciz.a($$4, $$2, new cix(cja.pK)));
         $$2.a(apg.V);
         $$2.b(apg.c.b($$7));
         $$0.b($$1, $$5);
         $$0.a(null, $$1, $$6, aox.e, 1.0F, 1.0F);
         $$0.a(null, djj.z, $$1);
      }

      return bgq.a($$0.B);
   }
}
