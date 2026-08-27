import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Map;
import java.util.function.Predicate;

public interface id {
   Map<civ, id> a = a();
   Map<civ, id> b = a();
   Map<civ, id> c = a();
   Map<civ, id> d = a();
   id e = ($$0, $$1, $$2, $$3, $$4, $$5) -> a($$1, $$2, $$3, $$4, $$5, csr.fu.n().a(cww.e, Integer.valueOf(3)), aoz.cv);
   id f = ($$0, $$1, $$2, $$3, $$4, $$5) -> a($$1, $$2, $$3, $$4, $$5, csr.fv.n(), aoz.cy);
   id g = ($$0, $$1, $$2, $$3, $$4, $$5) -> a($$1, $$2, $$3, $$4, $$5, csr.fw.n().a(cww.e, Integer.valueOf(3)), aoz.cz);
   id h = ($$0, $$1, $$2, $$3, $$4, $$5) -> {
      csq $$6 = csq.a($$5.d());
      if (!($$6 instanceof czp)) {
         return bgt.d;
      } else {
         if (!$$1.B) {
            cja $$7 = new cja(csr.kP);
            if ($$5.u()) {
               $$7.c($$5.v().h());
            }

            $$3.a($$4, $$7);
            $$3.a(apj.Z);
            cww.e($$0, $$1, $$2);
         }

         return bgt.a($$1.B);
      }
   };
   id i = ($$0, $$1, $$2, $$3, $$4, $$5) -> {
      if (dcg.c($$5) <= 0) {
         return bgt.d;
      } else {
         if (!$$1.B) {
            cja $$6 = $$5.c(1);
            dcg.d($$6);
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

            $$3.a(apj.Y);
            cww.e($$0, $$1, $$2);
         }

         return bgt.a($$1.B);
      }
   };
   id j = ($$0, $$1, $$2, $$3, $$4, $$5) -> {
      if (!($$5.d() instanceof chs $$7)) {
         return bgt.d;
      } else if (!$$7.a($$5)) {
         return bgt.d;
      } else {
         if (!$$1.B) {
            $$7.f_($$5);
            $$3.a(apj.X);
            cww.e($$0, $$1, $$2);
         }

         return bgt.a($$1.B);
      }
   };

   static Object2ObjectOpenHashMap<civ, id> a() {
      return ac.a(new Object2ObjectOpenHashMap(), $$0 -> $$0.defaultReturnValue((id)($$0x, $$1, $$2, $$3, $$4, $$5) -> bgt.d));
   }

   bgt interact(dfe var1, cpq var2, gw var3, cbp var4, bgs var5, cja var6);

   static void b() {
      a(a);
      a.put(cjd.rv, ($$0, $$1, $$2, $$3, $$4, $$5) -> {
         if (ckz.d($$5) != cla.c) {
            return bgt.d;
         } else {
            if (!$$1.B) {
               civ $$6 = $$5.d();
               $$3.a($$4, cjc.a($$5, $$3, new cja(cjd.rw)));
               $$3.a(apj.W);
               $$3.b(apj.c.b($$6));
               $$1.b($$2, csr.fu.n());
               $$1.a(null, $$2, aoz.ch, apa.e, 1.0F, 1.0F);
               $$1.a(null, djo.z, $$2);
            }

            return bgt.a($$1.B);
         }
      });
      a(b);
      b.put(cjd.pK, ($$0, $$1, $$2, $$3, $$4, $$5) -> a($$0, $$1, $$2, $$3, $$4, $$5, new cja(cjd.pL), $$0x -> $$0x.c(cww.e) == 3, aoz.cB));
      b.put(cjd.rw, ($$0, $$1, $$2, $$3, $$4, $$5) -> {
         if (!$$1.B) {
            civ $$6 = $$5.d();
            $$3.a($$4, cjc.a($$5, $$3, ckz.a(new cja(cjd.rv), cla.c)));
            $$3.a(apj.W);
            $$3.b(apj.c.b($$6));
            cww.e($$0, $$1, $$2);
            $$1.a(null, $$2, aoz.ci, apa.e, 1.0F, 1.0F);
            $$1.a(null, djo.y, $$2);
         }

         return bgt.a($$1.B);
      });
      b.put(cjd.rv, ($$0, $$1, $$2, $$3, $$4, $$5) -> {
         if ($$0.c(cww.e) != 3 && ckz.d($$5) == cla.c) {
            if (!$$1.B) {
               $$3.a($$4, cjc.a($$5, $$3, new cja(cjd.rw)));
               $$3.a(apj.W);
               $$3.b(apj.c.b($$5.d()));
               $$1.b($$2, $$0.a(cww.e));
               $$1.a(null, $$2, aoz.ch, apa.e, 1.0F, 1.0F);
               $$1.a(null, djo.z, $$2);
            }

            return bgt.a($$1.B);
         } else {
            return bgt.d;
         }
      });
      b.put(cjd.oN, j);
      b.put(cjd.oM, j);
      b.put(cjd.oL, j);
      b.put(cjd.oK, j);
      b.put(cjd.tP, j);
      b.put(cjd.tV, i);
      b.put(cjd.uc, i);
      b.put(cjd.uk, i);
      b.put(cjd.ug, i);
      b.put(cjd.uh, i);
      b.put(cjd.ue, i);
      b.put(cjd.ui, i);
      b.put(cjd.tY, i);
      b.put(cjd.ud, i);
      b.put(cjd.ua, i);
      b.put(cjd.tX, i);
      b.put(cjd.tW, i);
      b.put(cjd.ub, i);
      b.put(cjd.uf, i);
      b.put(cjd.uj, i);
      b.put(cjd.tZ, i);
      b.put(cjd.iH, h);
      b.put(cjd.iO, h);
      b.put(cjd.iW, h);
      b.put(cjd.iS, h);
      b.put(cjd.iT, h);
      b.put(cjd.iQ, h);
      b.put(cjd.iU, h);
      b.put(cjd.iK, h);
      b.put(cjd.iP, h);
      b.put(cjd.iM, h);
      b.put(cjd.iJ, h);
      b.put(cjd.iI, h);
      b.put(cjd.iN, h);
      b.put(cjd.iR, h);
      b.put(cjd.iV, h);
      b.put(cjd.iL, h);
      c.put(cjd.pK, ($$0, $$1, $$2, $$3, $$4, $$5) -> a($$0, $$1, $$2, $$3, $$4, $$5, new cja(cjd.pM), $$0x -> true, aoz.cE));
      a(c);
      d.put(cjd.pK, ($$0, $$1, $$2, $$3, $$4, $$5) -> a($$0, $$1, $$2, $$3, $$4, $$5, new cja(cjd.pN), $$0x -> $$0x.c(cww.e) == 3, aoz.cF));
      a(d);
   }

   static void a(Map<civ, id> $$0) {
      $$0.put(cjd.pM, f);
      $$0.put(cjd.pL, e);
      $$0.put(cjd.pN, g);
   }

   static bgt a(dfe $$0, cpq $$1, gw $$2, cbp $$3, bgs $$4, cja $$5, cja $$6, Predicate<dfe> $$7, aoy $$8) {
      if (!$$7.test($$0)) {
         return bgt.d;
      } else {
         if (!$$1.B) {
            civ $$9 = $$5.d();
            $$3.a($$4, cjc.a($$5, $$3, $$6));
            $$3.a(apj.W);
            $$3.b(apj.c.b($$9));
            $$1.b($$2, csr.ft.n());
            $$1.a(null, $$2, $$8, apa.e, 1.0F, 1.0F);
            $$1.a(null, djo.y, $$2);
         }

         return bgt.a($$1.B);
      }
   }

   static bgt a(cpq $$0, gw $$1, cbp $$2, bgs $$3, cja $$4, dfe $$5, aoy $$6) {
      if (!$$0.B) {
         civ $$7 = $$4.d();
         $$2.a($$3, cjc.a($$4, $$2, new cja(cjd.pK)));
         $$2.a(apj.V);
         $$2.b(apj.c.b($$7));
         $$0.b($$1, $$5);
         $$0.a(null, $$1, $$6, apa.e, 1.0F, 1.0F);
         $$0.a(null, djo.z, $$1);
      }

      return bgt.a($$0.B);
   }
}
