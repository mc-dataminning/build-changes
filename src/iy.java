import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Map;
import java.util.function.Predicate;

public interface iy {
   Map<String, iy.a> a = new Object2ObjectArrayMap();
   Codec<iy.a> b = asg.a(iy.a::a, a::get);
   iy.a c = a("empty");
   iy.a d = a("water");
   iy.a e = a("lava");
   iy.a f = a("powder_snow");
   iy g = ($$0, $$1, $$2, $$3, $$4, $$5) -> a($$1, $$2, $$3, $$4, $$5, cuc.fu.o().a(cyh.g, Integer.valueOf(3)), aqd.cv);
   iy h = ($$0, $$1, $$2, $$3, $$4, $$5) -> a($$1, $$2, $$3, $$4, $$5, cuc.fv.o(), aqd.cy);
   iy i = ($$0, $$1, $$2, $$3, $$4, $$5) -> a($$1, $$2, $$3, $$4, $$5, cuc.fw.o().a(cyh.g, Integer.valueOf(3)), aqd.cz);
   iy j = ($$0, $$1, $$2, $$3, $$4, $$5) -> {
      cua $$6 = cua.a($$5.d());
      if (!($$6 instanceof dax)) {
         return bib.d;
      } else {
         if (!$$1.B) {
            ckj $$7 = new ckj(cuc.kP);
            if ($$5.u()) {
               $$7.c($$5.v().h());
            }

            $$3.a($$4, $$7);
            $$3.a(aqn.Z);
            cyh.d($$0, $$1, $$2);
         }

         return bib.a($$1.B);
      }
   };
   iy k = ($$0, $$1, $$2, $$3, $$4, $$5) -> {
      if (ddn.c($$5) <= 0) {
         return bib.d;
      } else {
         if (!$$1.B) {
            ckj $$6 = $$5.c(1);
            ddn.d($$6);
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

            $$3.a(aqn.Y);
            cyh.d($$0, $$1, $$2);
         }

         return bib.a($$1.B);
      }
   };
   iy l = ($$0, $$1, $$2, $$3, $$4, $$5) -> {
      if (!($$5.d() instanceof cjb $$7)) {
         return bib.d;
      } else if (!$$7.a($$5)) {
         return bib.d;
      } else {
         if (!$$1.B) {
            $$7.f_($$5);
            $$3.a(aqn.X);
            cyh.d($$0, $$1, $$2);
         }

         return bib.a($$1.B);
      }
   };

   static iy.a a(String $$0) {
      Object2ObjectOpenHashMap<cke, iy> $$1 = new Object2ObjectOpenHashMap();
      $$1.defaultReturnValue((iy)($$0x, $$1x, $$2x, $$3, $$4, $$5) -> bib.d);
      iy.a $$2 = new iy.a($$0, $$1);
      a.put($$0, $$2);
      return $$2;
   }

   bib interact(dgb var1, cqz var2, ht var3, ccx var4, bia var5, ckj var6);

   static void a() {
      Map<cke, iy> $$0 = c.b();
      a($$0);
      $$0.put(ckm.rv, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> {
         if (cmi.d($$5) != cmj.c) {
            return bib.d;
         } else {
            if (!$$1x.B) {
               cke $$6 = $$5.d();
               $$3x.a($$4, ckl.a($$5, $$3x, new ckj(ckm.rw)));
               $$3x.a(aqn.W);
               $$3x.b(aqn.c.b($$6));
               $$1x.b($$2x, cuc.fu.o());
               $$1x.a(null, $$2x, aqd.ch, aqe.e, 1.0F, 1.0F);
               $$1x.a(null, dkl.z, $$2x);
            }

            return bib.a($$1x.B);
         }
      });
      Map<cke, iy> $$1 = d.b();
      a($$1);
      $$1.put(ckm.pK, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> a($$0x, $$1x, $$2x, $$3x, $$4, $$5, new ckj(ckm.pL), $$0xx -> $$0xx.c(cyh.g) == 3, aqd.cB));
      $$1.put(ckm.rw, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> {
         if (!$$1x.B) {
            cke $$6 = $$5.d();
            $$3x.a($$4, ckl.a($$5, $$3x, cmi.a(new ckj(ckm.rv), cmj.c)));
            $$3x.a(aqn.W);
            $$3x.b(aqn.c.b($$6));
            cyh.d($$0x, $$1x, $$2x);
            $$1x.a(null, $$2x, aqd.ci, aqe.e, 1.0F, 1.0F);
            $$1x.a(null, dkl.y, $$2x);
         }

         return bib.a($$1x.B);
      });
      $$1.put(ckm.rv, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> {
         if ($$0x.c(cyh.g) != 3 && cmi.d($$5) == cmj.c) {
            if (!$$1x.B) {
               $$3x.a($$4, ckl.a($$5, $$3x, new ckj(ckm.rw)));
               $$3x.a(aqn.W);
               $$3x.b(aqn.c.b($$5.d()));
               $$1x.b($$2x, $$0x.a(cyh.g));
               $$1x.a(null, $$2x, aqd.ch, aqe.e, 1.0F, 1.0F);
               $$1x.a(null, dkl.z, $$2x);
            }

            return bib.a($$1x.B);
         } else {
            return bib.d;
         }
      });
      $$1.put(ckm.oN, l);
      $$1.put(ckm.oM, l);
      $$1.put(ckm.oL, l);
      $$1.put(ckm.oK, l);
      $$1.put(ckm.tP, l);
      $$1.put(ckm.tV, k);
      $$1.put(ckm.uc, k);
      $$1.put(ckm.uk, k);
      $$1.put(ckm.ug, k);
      $$1.put(ckm.uh, k);
      $$1.put(ckm.ue, k);
      $$1.put(ckm.ui, k);
      $$1.put(ckm.tY, k);
      $$1.put(ckm.ud, k);
      $$1.put(ckm.ua, k);
      $$1.put(ckm.tX, k);
      $$1.put(ckm.tW, k);
      $$1.put(ckm.ub, k);
      $$1.put(ckm.uf, k);
      $$1.put(ckm.uj, k);
      $$1.put(ckm.tZ, k);
      $$1.put(ckm.iH, j);
      $$1.put(ckm.iO, j);
      $$1.put(ckm.iW, j);
      $$1.put(ckm.iS, j);
      $$1.put(ckm.iT, j);
      $$1.put(ckm.iQ, j);
      $$1.put(ckm.iU, j);
      $$1.put(ckm.iK, j);
      $$1.put(ckm.iP, j);
      $$1.put(ckm.iM, j);
      $$1.put(ckm.iJ, j);
      $$1.put(ckm.iI, j);
      $$1.put(ckm.iN, j);
      $$1.put(ckm.iR, j);
      $$1.put(ckm.iV, j);
      $$1.put(ckm.iL, j);
      Map<cke, iy> $$2 = e.b();
      $$2.put(ckm.pK, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> a($$0x, $$1x, $$2x, $$3x, $$4, $$5, new ckj(ckm.pM), $$0xx -> true, aqd.cE));
      a($$2);
      Map<cke, iy> $$3 = f.b();
      $$3.put(ckm.pK, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> a($$0x, $$1x, $$2x, $$3x, $$4, $$5, new ckj(ckm.pN), $$0xx -> $$0xx.c(cyh.g) == 3, aqd.cF));
      a($$3);
   }

   static void a(Map<cke, iy> $$0) {
      $$0.put(ckm.pM, h);
      $$0.put(ckm.pL, g);
      $$0.put(ckm.pN, i);
   }

   static bib a(dgb $$0, cqz $$1, ht $$2, ccx $$3, bia $$4, ckj $$5, ckj $$6, Predicate<dgb> $$7, aqc $$8) {
      if (!$$7.test($$0)) {
         return bib.d;
      } else {
         if (!$$1.B) {
            cke $$9 = $$5.d();
            $$3.a($$4, ckl.a($$5, $$3, $$6));
            $$3.a(aqn.W);
            $$3.b(aqn.c.b($$9));
            $$1.b($$2, cuc.ft.o());
            $$1.a(null, $$2, $$8, aqe.e, 1.0F, 1.0F);
            $$1.a(null, dkl.y, $$2);
         }

         return bib.a($$1.B);
      }
   }

   static bib a(cqz $$0, ht $$1, ccx $$2, bia $$3, ckj $$4, dgb $$5, aqc $$6) {
      if (!$$0.B) {
         cke $$7 = $$4.d();
         $$2.a($$3, ckl.a($$4, $$2, new ckj(ckm.pK)));
         $$2.a(aqn.V);
         $$2.b(aqn.c.b($$7));
         $$0.b($$1, $$5);
         $$0.a(null, $$1, $$6, aqe.e, 1.0F, 1.0F);
         $$0.a(null, dkl.z, $$1);
      }

      return bib.a($$0.B);
   }

   public static record a(String a, Map<cke, iy> b) {
   }
}
