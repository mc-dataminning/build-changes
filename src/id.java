import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Map;
import java.util.function.Predicate;

public interface id {
   Map<cjc, id> a = a();
   Map<cjc, id> b = a();
   Map<cjc, id> c = a();
   Map<cjc, id> d = a();
   id e = ($$0, $$1, $$2, $$3, $$4, $$5) -> a($$1, $$2, $$3, $$4, $$5, csy.fu.n().a(cxd.e, Integer.valueOf(3)), apf.cv);
   id f = ($$0, $$1, $$2, $$3, $$4, $$5) -> a($$1, $$2, $$3, $$4, $$5, csy.fv.n(), apf.cy);
   id g = ($$0, $$1, $$2, $$3, $$4, $$5) -> a($$1, $$2, $$3, $$4, $$5, csy.fw.n().a(cxd.e, Integer.valueOf(3)), apf.cz);
   id h = ($$0, $$1, $$2, $$3, $$4, $$5) -> {
      csx $$6 = csx.a($$5.d());
      if (!($$6 instanceof czw)) {
         return bha.d;
      } else {
         if (!$$1.B) {
            cjh $$7 = new cjh(csy.kP);
            if ($$5.u()) {
               $$7.c($$5.v().h());
            }

            $$3.a($$4, $$7);
            $$3.a(app.Z);
            cxd.e($$0, $$1, $$2);
         }

         return bha.a($$1.B);
      }
   };
   id i = ($$0, $$1, $$2, $$3, $$4, $$5) -> {
      if (dcn.c($$5) <= 0) {
         return bha.d;
      } else {
         if (!$$1.B) {
            cjh $$6 = $$5.c(1);
            dcn.d($$6);
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

            $$3.a(app.Y);
            cxd.e($$0, $$1, $$2);
         }

         return bha.a($$1.B);
      }
   };
   id j = ($$0, $$1, $$2, $$3, $$4, $$5) -> {
      if (!($$5.d() instanceof chz $$7)) {
         return bha.d;
      } else if (!$$7.a($$5)) {
         return bha.d;
      } else {
         if (!$$1.B) {
            $$7.f_($$5);
            $$3.a(app.X);
            cxd.e($$0, $$1, $$2);
         }

         return bha.a($$1.B);
      }
   };

   static Object2ObjectOpenHashMap<cjc, id> a() {
      return ac.a(new Object2ObjectOpenHashMap(), $$0 -> $$0.defaultReturnValue((id)($$0x, $$1, $$2, $$3, $$4, $$5) -> bha.d));
   }

   bha interact(dfl var1, cpx var2, gw var3, cbw var4, bgz var5, cjh var6);

   static void b() {
      a(a);
      a.put(cjk.rv, ($$0, $$1, $$2, $$3, $$4, $$5) -> {
         if (clg.d($$5) != clh.c) {
            return bha.d;
         } else {
            if (!$$1.B) {
               cjc $$6 = $$5.d();
               $$3.a($$4, cjj.a($$5, $$3, new cjh(cjk.rw)));
               $$3.a(app.W);
               $$3.b(app.c.b($$6));
               $$1.b($$2, csy.fu.n());
               $$1.a(null, $$2, apf.ch, apg.e, 1.0F, 1.0F);
               $$1.a(null, djv.z, $$2);
            }

            return bha.a($$1.B);
         }
      });
      a(b);
      b.put(cjk.pK, ($$0, $$1, $$2, $$3, $$4, $$5) -> a($$0, $$1, $$2, $$3, $$4, $$5, new cjh(cjk.pL), $$0x -> $$0x.c(cxd.e) == 3, apf.cB));
      b.put(cjk.rw, ($$0, $$1, $$2, $$3, $$4, $$5) -> {
         if (!$$1.B) {
            cjc $$6 = $$5.d();
            $$3.a($$4, cjj.a($$5, $$3, clg.a(new cjh(cjk.rv), clh.c)));
            $$3.a(app.W);
            $$3.b(app.c.b($$6));
            cxd.e($$0, $$1, $$2);
            $$1.a(null, $$2, apf.ci, apg.e, 1.0F, 1.0F);
            $$1.a(null, djv.y, $$2);
         }

         return bha.a($$1.B);
      });
      b.put(cjk.rv, ($$0, $$1, $$2, $$3, $$4, $$5) -> {
         if ($$0.c(cxd.e) != 3 && clg.d($$5) == clh.c) {
            if (!$$1.B) {
               $$3.a($$4, cjj.a($$5, $$3, new cjh(cjk.rw)));
               $$3.a(app.W);
               $$3.b(app.c.b($$5.d()));
               $$1.b($$2, $$0.a(cxd.e));
               $$1.a(null, $$2, apf.ch, apg.e, 1.0F, 1.0F);
               $$1.a(null, djv.z, $$2);
            }

            return bha.a($$1.B);
         } else {
            return bha.d;
         }
      });
      b.put(cjk.oN, j);
      b.put(cjk.oM, j);
      b.put(cjk.oL, j);
      b.put(cjk.oK, j);
      b.put(cjk.tP, j);
      b.put(cjk.tV, i);
      b.put(cjk.uc, i);
      b.put(cjk.uk, i);
      b.put(cjk.ug, i);
      b.put(cjk.uh, i);
      b.put(cjk.ue, i);
      b.put(cjk.ui, i);
      b.put(cjk.tY, i);
      b.put(cjk.ud, i);
      b.put(cjk.ua, i);
      b.put(cjk.tX, i);
      b.put(cjk.tW, i);
      b.put(cjk.ub, i);
      b.put(cjk.uf, i);
      b.put(cjk.uj, i);
      b.put(cjk.tZ, i);
      b.put(cjk.iH, h);
      b.put(cjk.iO, h);
      b.put(cjk.iW, h);
      b.put(cjk.iS, h);
      b.put(cjk.iT, h);
      b.put(cjk.iQ, h);
      b.put(cjk.iU, h);
      b.put(cjk.iK, h);
      b.put(cjk.iP, h);
      b.put(cjk.iM, h);
      b.put(cjk.iJ, h);
      b.put(cjk.iI, h);
      b.put(cjk.iN, h);
      b.put(cjk.iR, h);
      b.put(cjk.iV, h);
      b.put(cjk.iL, h);
      c.put(cjk.pK, ($$0, $$1, $$2, $$3, $$4, $$5) -> a($$0, $$1, $$2, $$3, $$4, $$5, new cjh(cjk.pM), $$0x -> true, apf.cE));
      a(c);
      d.put(cjk.pK, ($$0, $$1, $$2, $$3, $$4, $$5) -> a($$0, $$1, $$2, $$3, $$4, $$5, new cjh(cjk.pN), $$0x -> $$0x.c(cxd.e) == 3, apf.cF));
      a(d);
   }

   static void a(Map<cjc, id> $$0) {
      $$0.put(cjk.pM, f);
      $$0.put(cjk.pL, e);
      $$0.put(cjk.pN, g);
   }

   static bha a(dfl $$0, cpx $$1, gw $$2, cbw $$3, bgz $$4, cjh $$5, cjh $$6, Predicate<dfl> $$7, ape $$8) {
      if (!$$7.test($$0)) {
         return bha.d;
      } else {
         if (!$$1.B) {
            cjc $$9 = $$5.d();
            $$3.a($$4, cjj.a($$5, $$3, $$6));
            $$3.a(app.W);
            $$3.b(app.c.b($$9));
            $$1.b($$2, csy.ft.n());
            $$1.a(null, $$2, $$8, apg.e, 1.0F, 1.0F);
            $$1.a(null, djv.y, $$2);
         }

         return bha.a($$1.B);
      }
   }

   static bha a(cpx $$0, gw $$1, cbw $$2, bgz $$3, cjh $$4, dfl $$5, ape $$6) {
      if (!$$0.B) {
         cjc $$7 = $$4.d();
         $$2.a($$3, cjj.a($$4, $$2, new cjh(cjk.pK)));
         $$2.a(app.V);
         $$2.b(app.c.b($$7));
         $$0.b($$1, $$5);
         $$0.a(null, $$1, $$6, apg.e, 1.0F, 1.0F);
         $$0.a(null, djv.z, $$1);
      }

      return bha.a($$0.B);
   }
}
