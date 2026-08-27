import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Map;
import java.util.function.Predicate;

public interface ib {
   Map<cfu, ib> a = a();
   Map<cfu, ib> b = a();
   Map<cfu, ib> c = a();
   Map<cfu, ib> d = a();
   ib e = ($$0, $$1, $$2, $$3, $$4, $$5) -> a($$1, $$2, $$3, $$4, $$5, cpo.fu.n().a(ctt.e, Integer.valueOf(3)), amh.cv);
   ib f = ($$0, $$1, $$2, $$3, $$4, $$5) -> a($$1, $$2, $$3, $$4, $$5, cpo.fv.n(), amh.cy);
   ib g = ($$0, $$1, $$2, $$3, $$4, $$5) -> a($$1, $$2, $$3, $$4, $$5, cpo.fw.n().a(ctt.e, Integer.valueOf(3)), amh.cz);
   ib h = ($$0, $$1, $$2, $$3, $$4, $$5) -> {
      cpn $$6 = cpn.a($$5.d());
      if (!($$6 instanceof cwm)) {
         return bdx.d;
      } else {
         if (!$$1.B) {
            cfz $$7 = new cfz(cpo.kP);
            if ($$5.u()) {
               $$7.c($$5.v().h());
            }

            $$3.a($$4, $$7);
            $$3.a(amr.Z);
            ctt.e($$0, $$1, $$2);
         }

         return bdx.a($$1.B);
      }
   };
   ib i = ($$0, $$1, $$2, $$3, $$4, $$5) -> {
      if (czd.c($$5) <= 0) {
         return bdx.d;
      } else {
         if (!$$1.B) {
            cfz $$6 = $$5.c(1);
            czd.d($$6);
            if (!$$3.fO().d) {
               $$5.h(1);
            }

            if ($$5.b()) {
               $$3.a($$4, $$6);
            } else if ($$3.fN().e($$6)) {
               $$3.bQ.b();
            } else {
               $$3.a($$6, false);
            }

            $$3.a(amr.Y);
            ctt.e($$0, $$1, $$2);
         }

         return bdx.a($$1.B);
      }
   };
   ib j = ($$0, $$1, $$2, $$3, $$4, $$5) -> {
      if (!($$5.d() instanceof cer $$7)) {
         return bdx.d;
      } else if (!$$7.a($$5)) {
         return bdx.d;
      } else {
         if (!$$1.B) {
            $$7.f_($$5);
            $$3.a(amr.X);
            ctt.e($$0, $$1, $$2);
         }

         return bdx.a($$1.B);
      }
   };

   static Object2ObjectOpenHashMap<cfu, ib> a() {
      return ac.a(new Object2ObjectOpenHashMap(), $$0 -> $$0.defaultReturnValue((ib)($$0x, $$1, $$2, $$3, $$4, $$5) -> bdx.d));
   }

   bdx interact(dcb var1, cmm var2, gu var3, byo var4, bdw var5, cfz var6);

   static void b() {
      a(a);
      a.put(cgc.rv, ($$0, $$1, $$2, $$3, $$4, $$5) -> {
         if (chy.d($$5) != chz.c) {
            return bdx.d;
         } else {
            if (!$$1.B) {
               cfu $$6 = $$5.d();
               $$3.a($$4, cgb.a($$5, $$3, new cfz(cgc.rw)));
               $$3.a(amr.W);
               $$3.b(amr.c.b($$6));
               $$1.b($$2, cpo.fu.n());
               $$1.a(null, $$2, amh.ch, ami.e, 1.0F, 1.0F);
               $$1.a(null, dgl.A, $$2);
            }

            return bdx.a($$1.B);
         }
      });
      a(b);
      b.put(cgc.pK, ($$0, $$1, $$2, $$3, $$4, $$5) -> a($$0, $$1, $$2, $$3, $$4, $$5, new cfz(cgc.pL), $$0x -> $$0x.c(ctt.e) == 3, amh.cB));
      b.put(cgc.rw, ($$0, $$1, $$2, $$3, $$4, $$5) -> {
         if (!$$1.B) {
            cfu $$6 = $$5.d();
            $$3.a($$4, cgb.a($$5, $$3, chy.a(new cfz(cgc.rv), chz.c)));
            $$3.a(amr.W);
            $$3.b(amr.c.b($$6));
            ctt.e($$0, $$1, $$2);
            $$1.a(null, $$2, amh.ci, ami.e, 1.0F, 1.0F);
            $$1.a(null, dgl.z, $$2);
         }

         return bdx.a($$1.B);
      });
      b.put(cgc.rv, ($$0, $$1, $$2, $$3, $$4, $$5) -> {
         if ($$0.c(ctt.e) != 3 && chy.d($$5) == chz.c) {
            if (!$$1.B) {
               $$3.a($$4, cgb.a($$5, $$3, new cfz(cgc.rw)));
               $$3.a(amr.W);
               $$3.b(amr.c.b($$5.d()));
               $$1.b($$2, $$0.a(ctt.e));
               $$1.a(null, $$2, amh.ch, ami.e, 1.0F, 1.0F);
               $$1.a(null, dgl.A, $$2);
            }

            return bdx.a($$1.B);
         } else {
            return bdx.d;
         }
      });
      b.put(cgc.oN, j);
      b.put(cgc.oM, j);
      b.put(cgc.oL, j);
      b.put(cgc.oK, j);
      b.put(cgc.tP, j);
      b.put(cgc.tV, i);
      b.put(cgc.uc, i);
      b.put(cgc.uk, i);
      b.put(cgc.ug, i);
      b.put(cgc.uh, i);
      b.put(cgc.ue, i);
      b.put(cgc.ui, i);
      b.put(cgc.tY, i);
      b.put(cgc.ud, i);
      b.put(cgc.ua, i);
      b.put(cgc.tX, i);
      b.put(cgc.tW, i);
      b.put(cgc.ub, i);
      b.put(cgc.uf, i);
      b.put(cgc.uj, i);
      b.put(cgc.tZ, i);
      b.put(cgc.iH, h);
      b.put(cgc.iO, h);
      b.put(cgc.iW, h);
      b.put(cgc.iS, h);
      b.put(cgc.iT, h);
      b.put(cgc.iQ, h);
      b.put(cgc.iU, h);
      b.put(cgc.iK, h);
      b.put(cgc.iP, h);
      b.put(cgc.iM, h);
      b.put(cgc.iJ, h);
      b.put(cgc.iI, h);
      b.put(cgc.iN, h);
      b.put(cgc.iR, h);
      b.put(cgc.iV, h);
      b.put(cgc.iL, h);
      c.put(cgc.pK, ($$0, $$1, $$2, $$3, $$4, $$5) -> a($$0, $$1, $$2, $$3, $$4, $$5, new cfz(cgc.pM), $$0x -> true, amh.cE));
      a(c);
      d.put(cgc.pK, ($$0, $$1, $$2, $$3, $$4, $$5) -> a($$0, $$1, $$2, $$3, $$4, $$5, new cfz(cgc.pN), $$0x -> $$0x.c(ctt.e) == 3, amh.cF));
      a(d);
   }

   static void a(Map<cfu, ib> $$0) {
      $$0.put(cgc.pM, f);
      $$0.put(cgc.pL, e);
      $$0.put(cgc.pN, g);
   }

   static bdx a(dcb $$0, cmm $$1, gu $$2, byo $$3, bdw $$4, cfz $$5, cfz $$6, Predicate<dcb> $$7, amg $$8) {
      if (!$$7.test($$0)) {
         return bdx.d;
      } else {
         if (!$$1.B) {
            cfu $$9 = $$5.d();
            $$3.a($$4, cgb.a($$5, $$3, $$6));
            $$3.a(amr.W);
            $$3.b(amr.c.b($$9));
            $$1.b($$2, cpo.ft.n());
            $$1.a(null, $$2, $$8, ami.e, 1.0F, 1.0F);
            $$1.a(null, dgl.z, $$2);
         }

         return bdx.a($$1.B);
      }
   }

   static bdx a(cmm $$0, gu $$1, byo $$2, bdw $$3, cfz $$4, dcb $$5, amg $$6) {
      if (!$$0.B) {
         cfu $$7 = $$4.d();
         $$2.a($$3, cgb.a($$4, $$2, new cfz(cgc.pK)));
         $$2.a(amr.V);
         $$2.b(amr.c.b($$7));
         $$0.b($$1, $$5);
         $$0.a(null, $$1, $$6, ami.e, 1.0F, 1.0F);
         $$0.a(null, dgl.A, $$1);
      }

      return bdx.a($$0.B);
   }
}
