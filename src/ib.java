import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Map;
import java.util.function.Predicate;

public interface ib {
   Map<cit, ib> a = a();
   Map<cit, ib> b = a();
   Map<cit, ib> c = a();
   Map<cit, ib> d = a();
   ib e = ($$0, $$1, $$2, $$3, $$4, $$5) -> a($$1, $$2, $$3, $$4, $$5, csn.fu.n().a(cws.e, Integer.valueOf(3)), aow.cv);
   ib f = ($$0, $$1, $$2, $$3, $$4, $$5) -> a($$1, $$2, $$3, $$4, $$5, csn.fv.n(), aow.cy);
   ib g = ($$0, $$1, $$2, $$3, $$4, $$5) -> a($$1, $$2, $$3, $$4, $$5, csn.fw.n().a(cws.e, Integer.valueOf(3)), aow.cz);
   ib h = ($$0, $$1, $$2, $$3, $$4, $$5) -> {
      csm $$6 = csm.a($$5.d());
      if (!($$6 instanceof czl)) {
         return bgq.d;
      } else {
         if (!$$1.B) {
            ciy $$7 = new ciy(csn.kP);
            if ($$5.u()) {
               $$7.c($$5.v().h());
            }

            $$3.a($$4, $$7);
            $$3.a(apg.Z);
            cws.e($$0, $$1, $$2);
         }

         return bgq.a($$1.B);
      }
   };
   ib i = ($$0, $$1, $$2, $$3, $$4, $$5) -> {
      if (dcc.c($$5) <= 0) {
         return bgq.d;
      } else {
         if (!$$1.B) {
            ciy $$6 = $$5.c(1);
            dcc.d($$6);
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
            cws.e($$0, $$1, $$2);
         }

         return bgq.a($$1.B);
      }
   };
   ib j = ($$0, $$1, $$2, $$3, $$4, $$5) -> {
      if (!($$5.d() instanceof chq $$7)) {
         return bgq.d;
      } else if (!$$7.a($$5)) {
         return bgq.d;
      } else {
         if (!$$1.B) {
            $$7.f_($$5);
            $$3.a(apg.X);
            cws.e($$0, $$1, $$2);
         }

         return bgq.a($$1.B);
      }
   };

   static Object2ObjectOpenHashMap<cit, ib> a() {
      return ac.a(new Object2ObjectOpenHashMap(), $$0 -> $$0.defaultReturnValue((ib)($$0x, $$1, $$2, $$3, $$4, $$5) -> bgq.d));
   }

   bgq interact(dfa var1, cpm var2, gu var3, cbn var4, bgp var5, ciy var6);

   static void b() {
      a(a);
      a.put(cjb.rv, ($$0, $$1, $$2, $$3, $$4, $$5) -> {
         if (ckx.d($$5) != cky.c) {
            return bgq.d;
         } else {
            if (!$$1.B) {
               cit $$6 = $$5.d();
               $$3.a($$4, cja.a($$5, $$3, new ciy(cjb.rw)));
               $$3.a(apg.W);
               $$3.b(apg.c.b($$6));
               $$1.b($$2, csn.fu.n());
               $$1.a(null, $$2, aow.ch, aox.e, 1.0F, 1.0F);
               $$1.a(null, djk.z, $$2);
            }

            return bgq.a($$1.B);
         }
      });
      a(b);
      b.put(cjb.pK, ($$0, $$1, $$2, $$3, $$4, $$5) -> a($$0, $$1, $$2, $$3, $$4, $$5, new ciy(cjb.pL), $$0x -> $$0x.c(cws.e) == 3, aow.cB));
      b.put(cjb.rw, ($$0, $$1, $$2, $$3, $$4, $$5) -> {
         if (!$$1.B) {
            cit $$6 = $$5.d();
            $$3.a($$4, cja.a($$5, $$3, ckx.a(new ciy(cjb.rv), cky.c)));
            $$3.a(apg.W);
            $$3.b(apg.c.b($$6));
            cws.e($$0, $$1, $$2);
            $$1.a(null, $$2, aow.ci, aox.e, 1.0F, 1.0F);
            $$1.a(null, djk.y, $$2);
         }

         return bgq.a($$1.B);
      });
      b.put(cjb.rv, ($$0, $$1, $$2, $$3, $$4, $$5) -> {
         if ($$0.c(cws.e) != 3 && ckx.d($$5) == cky.c) {
            if (!$$1.B) {
               $$3.a($$4, cja.a($$5, $$3, new ciy(cjb.rw)));
               $$3.a(apg.W);
               $$3.b(apg.c.b($$5.d()));
               $$1.b($$2, $$0.a(cws.e));
               $$1.a(null, $$2, aow.ch, aox.e, 1.0F, 1.0F);
               $$1.a(null, djk.z, $$2);
            }

            return bgq.a($$1.B);
         } else {
            return bgq.d;
         }
      });
      b.put(cjb.oN, j);
      b.put(cjb.oM, j);
      b.put(cjb.oL, j);
      b.put(cjb.oK, j);
      b.put(cjb.tP, j);
      b.put(cjb.tV, i);
      b.put(cjb.uc, i);
      b.put(cjb.uk, i);
      b.put(cjb.ug, i);
      b.put(cjb.uh, i);
      b.put(cjb.ue, i);
      b.put(cjb.ui, i);
      b.put(cjb.tY, i);
      b.put(cjb.ud, i);
      b.put(cjb.ua, i);
      b.put(cjb.tX, i);
      b.put(cjb.tW, i);
      b.put(cjb.ub, i);
      b.put(cjb.uf, i);
      b.put(cjb.uj, i);
      b.put(cjb.tZ, i);
      b.put(cjb.iH, h);
      b.put(cjb.iO, h);
      b.put(cjb.iW, h);
      b.put(cjb.iS, h);
      b.put(cjb.iT, h);
      b.put(cjb.iQ, h);
      b.put(cjb.iU, h);
      b.put(cjb.iK, h);
      b.put(cjb.iP, h);
      b.put(cjb.iM, h);
      b.put(cjb.iJ, h);
      b.put(cjb.iI, h);
      b.put(cjb.iN, h);
      b.put(cjb.iR, h);
      b.put(cjb.iV, h);
      b.put(cjb.iL, h);
      c.put(cjb.pK, ($$0, $$1, $$2, $$3, $$4, $$5) -> a($$0, $$1, $$2, $$3, $$4, $$5, new ciy(cjb.pM), $$0x -> true, aow.cE));
      a(c);
      d.put(cjb.pK, ($$0, $$1, $$2, $$3, $$4, $$5) -> a($$0, $$1, $$2, $$3, $$4, $$5, new ciy(cjb.pN), $$0x -> $$0x.c(cws.e) == 3, aow.cF));
      a(d);
   }

   static void a(Map<cit, ib> $$0) {
      $$0.put(cjb.pM, f);
      $$0.put(cjb.pL, e);
      $$0.put(cjb.pN, g);
   }

   static bgq a(dfa $$0, cpm $$1, gu $$2, cbn $$3, bgp $$4, ciy $$5, ciy $$6, Predicate<dfa> $$7, aov $$8) {
      if (!$$7.test($$0)) {
         return bgq.d;
      } else {
         if (!$$1.B) {
            cit $$9 = $$5.d();
            $$3.a($$4, cja.a($$5, $$3, $$6));
            $$3.a(apg.W);
            $$3.b(apg.c.b($$9));
            $$1.b($$2, csn.ft.n());
            $$1.a(null, $$2, $$8, aox.e, 1.0F, 1.0F);
            $$1.a(null, djk.y, $$2);
         }

         return bgq.a($$1.B);
      }
   }

   static bgq a(cpm $$0, gu $$1, cbn $$2, bgp $$3, ciy $$4, dfa $$5, aov $$6) {
      if (!$$0.B) {
         cit $$7 = $$4.d();
         $$2.a($$3, cja.a($$4, $$2, new ciy(cjb.pK)));
         $$2.a(apg.V);
         $$2.b(apg.c.b($$7));
         $$0.b($$1, $$5);
         $$0.a(null, $$1, $$6, aox.e, 1.0F, 1.0F);
         $$0.a(null, djk.z, $$1);
      }

      return bgq.a($$0.B);
   }
}
