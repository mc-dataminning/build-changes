import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Map;
import java.util.function.Predicate;

public interface ia {
   Map<String, ia.a> a = new Object2ObjectArrayMap();
   Codec<ia.a> b = arj.a(ia.a::a, a::get);
   ia.a c = a("empty");
   ia.a d = a("water");
   ia.a e = a("lava");
   ia.a f = a("powder_snow");
   ia g = ($$0, $$1, $$2, $$3, $$4, $$5) -> a($$1, $$2, $$3, $$4, $$5, cte.fu.o().a(cxj.g, Integer.valueOf(3)), apg.cv);
   ia h = ($$0, $$1, $$2, $$3, $$4, $$5) -> a($$1, $$2, $$3, $$4, $$5, cte.fv.o(), apg.cy);
   ia i = ($$0, $$1, $$2, $$3, $$4, $$5) -> a($$1, $$2, $$3, $$4, $$5, cte.fw.o().a(cxj.g, Integer.valueOf(3)), apg.cz);
   ia j = ($$0, $$1, $$2, $$3, $$4, $$5) -> {
      ctc $$6 = ctc.a($$5.d());
      if (!($$6 instanceof czz)) {
         return bhe.d;
      } else {
         if (!$$1.B) {
            cjl $$7 = new cjl(cte.kP);
            if ($$5.u()) {
               $$7.c($$5.v().h());
            }

            $$3.a($$4, $$7);
            $$3.a(apq.Z);
            cxj.d($$0, $$1, $$2);
         }

         return bhe.a($$1.B);
      }
   };
   ia k = ($$0, $$1, $$2, $$3, $$4, $$5) -> {
      if (dcp.c($$5) <= 0) {
         return bhe.d;
      } else {
         if (!$$1.B) {
            cjl $$6 = $$5.c(1);
            dcp.d($$6);
            if (!$$3.fT().d) {
               $$5.h(1);
            }

            if ($$5.b()) {
               $$3.a($$4, $$6);
            } else if ($$3.fS().e($$6)) {
               $$3.bR.b();
            } else {
               $$3.a($$6, false);
            }

            $$3.a(apq.Y);
            cxj.d($$0, $$1, $$2);
         }

         return bhe.a($$1.B);
      }
   };
   ia l = ($$0, $$1, $$2, $$3, $$4, $$5) -> {
      if (!($$5.d() instanceof cid $$7)) {
         return bhe.d;
      } else if (!$$7.a($$5)) {
         return bhe.d;
      } else {
         if (!$$1.B) {
            $$7.f_($$5);
            $$3.a(apq.X);
            cxj.d($$0, $$1, $$2);
         }

         return bhe.a($$1.B);
      }
   };

   static ia.a a(String $$0) {
      Object2ObjectOpenHashMap<cjg, ia> $$1 = new Object2ObjectOpenHashMap();
      $$1.defaultReturnValue((ia)($$0x, $$1x, $$2x, $$3, $$4, $$5) -> bhe.d);
      ia.a $$2 = new ia.a($$0, $$1);
      a.put($$0, $$2);
      return $$2;
   }

   bhe interact(dfd var1, cqb var2, gw var3, cca var4, bhd var5, cjl var6);

   static void a() {
      Map<cjg, ia> $$0 = c.b();
      a($$0);
      $$0.put(cjo.rv, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> {
         if (clk.d($$5) != cll.c) {
            return bhe.d;
         } else {
            if (!$$1x.B) {
               cjg $$6 = $$5.d();
               $$3x.a($$4, cjn.a($$5, $$3x, new cjl(cjo.rw)));
               $$3x.a(apq.W);
               $$3x.b(apq.c.b($$6));
               $$1x.b($$2x, cte.fu.o());
               $$1x.a(null, $$2x, apg.ch, aph.e, 1.0F, 1.0F);
               $$1x.a(null, djn.z, $$2x);
            }

            return bhe.a($$1x.B);
         }
      });
      Map<cjg, ia> $$1 = d.b();
      a($$1);
      $$1.put(cjo.pK, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> a($$0x, $$1x, $$2x, $$3x, $$4, $$5, new cjl(cjo.pL), $$0xx -> $$0xx.c(cxj.g) == 3, apg.cB));
      $$1.put(cjo.rw, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> {
         if (!$$1x.B) {
            cjg $$6 = $$5.d();
            $$3x.a($$4, cjn.a($$5, $$3x, clk.a(new cjl(cjo.rv), cll.c)));
            $$3x.a(apq.W);
            $$3x.b(apq.c.b($$6));
            cxj.d($$0x, $$1x, $$2x);
            $$1x.a(null, $$2x, apg.ci, aph.e, 1.0F, 1.0F);
            $$1x.a(null, djn.y, $$2x);
         }

         return bhe.a($$1x.B);
      });
      $$1.put(cjo.rv, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> {
         if ($$0x.c(cxj.g) != 3 && clk.d($$5) == cll.c) {
            if (!$$1x.B) {
               $$3x.a($$4, cjn.a($$5, $$3x, new cjl(cjo.rw)));
               $$3x.a(apq.W);
               $$3x.b(apq.c.b($$5.d()));
               $$1x.b($$2x, $$0x.a(cxj.g));
               $$1x.a(null, $$2x, apg.ch, aph.e, 1.0F, 1.0F);
               $$1x.a(null, djn.z, $$2x);
            }

            return bhe.a($$1x.B);
         } else {
            return bhe.d;
         }
      });
      $$1.put(cjo.oN, l);
      $$1.put(cjo.oM, l);
      $$1.put(cjo.oL, l);
      $$1.put(cjo.oK, l);
      $$1.put(cjo.tP, l);
      $$1.put(cjo.tV, k);
      $$1.put(cjo.uc, k);
      $$1.put(cjo.uk, k);
      $$1.put(cjo.ug, k);
      $$1.put(cjo.uh, k);
      $$1.put(cjo.ue, k);
      $$1.put(cjo.ui, k);
      $$1.put(cjo.tY, k);
      $$1.put(cjo.ud, k);
      $$1.put(cjo.ua, k);
      $$1.put(cjo.tX, k);
      $$1.put(cjo.tW, k);
      $$1.put(cjo.ub, k);
      $$1.put(cjo.uf, k);
      $$1.put(cjo.uj, k);
      $$1.put(cjo.tZ, k);
      $$1.put(cjo.iH, j);
      $$1.put(cjo.iO, j);
      $$1.put(cjo.iW, j);
      $$1.put(cjo.iS, j);
      $$1.put(cjo.iT, j);
      $$1.put(cjo.iQ, j);
      $$1.put(cjo.iU, j);
      $$1.put(cjo.iK, j);
      $$1.put(cjo.iP, j);
      $$1.put(cjo.iM, j);
      $$1.put(cjo.iJ, j);
      $$1.put(cjo.iI, j);
      $$1.put(cjo.iN, j);
      $$1.put(cjo.iR, j);
      $$1.put(cjo.iV, j);
      $$1.put(cjo.iL, j);
      Map<cjg, ia> $$2 = e.b();
      $$2.put(cjo.pK, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> a($$0x, $$1x, $$2x, $$3x, $$4, $$5, new cjl(cjo.pM), $$0xx -> true, apg.cE));
      a($$2);
      Map<cjg, ia> $$3 = f.b();
      $$3.put(cjo.pK, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> a($$0x, $$1x, $$2x, $$3x, $$4, $$5, new cjl(cjo.pN), $$0xx -> $$0xx.c(cxj.g) == 3, apg.cF));
      a($$3);
   }

   static void a(Map<cjg, ia> $$0) {
      $$0.put(cjo.pM, h);
      $$0.put(cjo.pL, g);
      $$0.put(cjo.pN, i);
   }

   static bhe a(dfd $$0, cqb $$1, gw $$2, cca $$3, bhd $$4, cjl $$5, cjl $$6, Predicate<dfd> $$7, apf $$8) {
      if (!$$7.test($$0)) {
         return bhe.d;
      } else {
         if (!$$1.B) {
            cjg $$9 = $$5.d();
            $$3.a($$4, cjn.a($$5, $$3, $$6));
            $$3.a(apq.W);
            $$3.b(apq.c.b($$9));
            $$1.b($$2, cte.ft.o());
            $$1.a(null, $$2, $$8, aph.e, 1.0F, 1.0F);
            $$1.a(null, djn.y, $$2);
         }

         return bhe.a($$1.B);
      }
   }

   static bhe a(cqb $$0, gw $$1, cca $$2, bhd $$3, cjl $$4, dfd $$5, apf $$6) {
      if (!$$0.B) {
         cjg $$7 = $$4.d();
         $$2.a($$3, cjn.a($$4, $$2, new cjl(cjo.pK)));
         $$2.a(apq.V);
         $$2.b(apq.c.b($$7));
         $$0.b($$1, $$5);
         $$0.a(null, $$1, $$6, aph.e, 1.0F, 1.0F);
         $$0.a(null, djn.z, $$1);
      }

      return bhe.a($$0.B);
   }

   public static record a(String a, Map<cjg, ia> b) {
   }
}
