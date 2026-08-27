import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Map;
import java.util.function.Predicate;

public interface iy {
   Map<String, iy.a> a = new Object2ObjectArrayMap();
   Codec<iy.a> b = asq.a(iy.a::a, a::get);
   iy.a c = a("empty");
   iy.a d = a("water");
   iy.a e = a("lava");
   iy.a f = a("powder_snow");
   iy g = ($$0, $$1, $$2, $$3, $$4, $$5) -> a($$1, $$2, $$3, $$4, $$5, cuv.fu.o().a(czb.g, Integer.valueOf(3)), aqn.cv);
   iy h = ($$0, $$1, $$2, $$3, $$4, $$5) -> a($$1, $$2, $$3, $$4, $$5, cuv.fv.o(), aqn.cy);
   iy i = ($$0, $$1, $$2, $$3, $$4, $$5) -> a($$1, $$2, $$3, $$4, $$5, cuv.fw.o().a(czb.g, Integer.valueOf(3)), aqn.cz);
   iy j = ($$0, $$1, $$2, $$3, $$4, $$5) -> {
      cut $$6 = cut.a($$5.d());
      if (!($$6 instanceof dbr)) {
         return biq.d;
      } else {
         if (!$$1.B) {
            clb $$7 = new clb(cuv.kP);
            if ($$5.u()) {
               $$7.c($$5.v().h());
            }

            $$3.a($$4, $$7);
            $$3.a(aqx.Z);
            czb.d($$0, $$1, $$2);
         }

         return biq.a($$1.B);
      }
   };
   iy k = ($$0, $$1, $$2, $$3, $$4, $$5) -> {
      if (deh.c($$5) <= 0) {
         return biq.d;
      } else {
         if (!$$1.B) {
            clb $$6 = $$5.c(1);
            deh.d($$6);
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

            $$3.a(aqx.Y);
            czb.d($$0, $$1, $$2);
         }

         return biq.a($$1.B);
      }
   };
   iy l = ($$0, $$1, $$2, $$3, $$4, $$5) -> {
      if (!($$5.d() instanceof cjt $$7)) {
         return biq.d;
      } else if (!$$7.a($$5)) {
         return biq.d;
      } else {
         if (!$$1.B) {
            $$7.f_($$5);
            $$3.a(aqx.X);
            czb.d($$0, $$1, $$2);
         }

         return biq.a($$1.B);
      }
   };

   static iy.a a(String $$0) {
      Object2ObjectOpenHashMap<ckw, iy> $$1 = new Object2ObjectOpenHashMap();
      $$1.defaultReturnValue((iy)($$0x, $$1x, $$2x, $$3, $$4, $$5) -> biq.d);
      iy.a $$2 = new iy.a($$0, $$1);
      a.put($$0, $$2);
      return $$2;
   }

   biq interact(dgw var1, crs var2, ht var3, cdm var4, bip var5, clb var6);

   static void a() {
      Map<ckw, iy> $$0 = c.b();
      a($$0);
      $$0.put(cle.rw, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> {
         if (cna.d($$5) != cnb.c) {
            return biq.d;
         } else {
            if (!$$1x.B) {
               ckw $$6 = $$5.d();
               $$3x.a($$4, cld.a($$5, $$3x, new clb(cle.rx)));
               $$3x.a(aqx.W);
               $$3x.b(aqx.c.b($$6));
               $$1x.b($$2x, cuv.fu.o());
               $$1x.a(null, $$2x, aqn.ch, aqo.e, 1.0F, 1.0F);
               $$1x.a(null, dlg.z, $$2x);
            }

            return biq.a($$1x.B);
         }
      });
      Map<ckw, iy> $$1 = d.b();
      a($$1);
      $$1.put(cle.pK, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> a($$0x, $$1x, $$2x, $$3x, $$4, $$5, new clb(cle.pL), $$0xx -> $$0xx.c(czb.g) == 3, aqn.cB));
      $$1.put(cle.rx, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> {
         if (!$$1x.B) {
            ckw $$6 = $$5.d();
            $$3x.a($$4, cld.a($$5, $$3x, cna.a(new clb(cle.rw), cnb.c)));
            $$3x.a(aqx.W);
            $$3x.b(aqx.c.b($$6));
            czb.d($$0x, $$1x, $$2x);
            $$1x.a(null, $$2x, aqn.ci, aqo.e, 1.0F, 1.0F);
            $$1x.a(null, dlg.y, $$2x);
         }

         return biq.a($$1x.B);
      });
      $$1.put(cle.rw, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> {
         if ($$0x.c(czb.g) != 3 && cna.d($$5) == cnb.c) {
            if (!$$1x.B) {
               $$3x.a($$4, cld.a($$5, $$3x, new clb(cle.rx)));
               $$3x.a(aqx.W);
               $$3x.b(aqx.c.b($$5.d()));
               $$1x.b($$2x, $$0x.a(czb.g));
               $$1x.a(null, $$2x, aqn.ch, aqo.e, 1.0F, 1.0F);
               $$1x.a(null, dlg.z, $$2x);
            }

            return biq.a($$1x.B);
         } else {
            return biq.d;
         }
      });
      $$1.put(cle.oN, l);
      $$1.put(cle.oM, l);
      $$1.put(cle.oL, l);
      $$1.put(cle.oK, l);
      $$1.put(cle.tQ, l);
      $$1.put(cle.tW, k);
      $$1.put(cle.ud, k);
      $$1.put(cle.ul, k);
      $$1.put(cle.uh, k);
      $$1.put(cle.ui, k);
      $$1.put(cle.uf, k);
      $$1.put(cle.uj, k);
      $$1.put(cle.tZ, k);
      $$1.put(cle.ue, k);
      $$1.put(cle.ub, k);
      $$1.put(cle.tY, k);
      $$1.put(cle.tX, k);
      $$1.put(cle.uc, k);
      $$1.put(cle.ug, k);
      $$1.put(cle.uk, k);
      $$1.put(cle.ua, k);
      $$1.put(cle.iH, j);
      $$1.put(cle.iO, j);
      $$1.put(cle.iW, j);
      $$1.put(cle.iS, j);
      $$1.put(cle.iT, j);
      $$1.put(cle.iQ, j);
      $$1.put(cle.iU, j);
      $$1.put(cle.iK, j);
      $$1.put(cle.iP, j);
      $$1.put(cle.iM, j);
      $$1.put(cle.iJ, j);
      $$1.put(cle.iI, j);
      $$1.put(cle.iN, j);
      $$1.put(cle.iR, j);
      $$1.put(cle.iV, j);
      $$1.put(cle.iL, j);
      Map<ckw, iy> $$2 = e.b();
      $$2.put(cle.pK, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> a($$0x, $$1x, $$2x, $$3x, $$4, $$5, new clb(cle.pM), $$0xx -> true, aqn.cE));
      a($$2);
      Map<ckw, iy> $$3 = f.b();
      $$3.put(cle.pK, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> a($$0x, $$1x, $$2x, $$3x, $$4, $$5, new clb(cle.pN), $$0xx -> $$0xx.c(czb.g) == 3, aqn.cF));
      a($$3);
   }

   static void a(Map<ckw, iy> $$0) {
      $$0.put(cle.pM, h);
      $$0.put(cle.pL, g);
      $$0.put(cle.pN, i);
   }

   static biq a(dgw $$0, crs $$1, ht $$2, cdm $$3, bip $$4, clb $$5, clb $$6, Predicate<dgw> $$7, aqm $$8) {
      if (!$$7.test($$0)) {
         return biq.d;
      } else {
         if (!$$1.B) {
            ckw $$9 = $$5.d();
            $$3.a($$4, cld.a($$5, $$3, $$6));
            $$3.a(aqx.W);
            $$3.b(aqx.c.b($$9));
            $$1.b($$2, cuv.ft.o());
            $$1.a(null, $$2, $$8, aqo.e, 1.0F, 1.0F);
            $$1.a(null, dlg.y, $$2);
         }

         return biq.a($$1.B);
      }
   }

   static biq a(crs $$0, ht $$1, cdm $$2, bip $$3, clb $$4, dgw $$5, aqm $$6) {
      if (!$$0.B) {
         ckw $$7 = $$4.d();
         $$2.a($$3, cld.a($$4, $$2, new clb(cle.pK)));
         $$2.a(aqx.V);
         $$2.b(aqx.c.b($$7));
         $$0.b($$1, $$5);
         $$0.a(null, $$1, $$6, aqo.e, 1.0F, 1.0F);
         $$0.a(null, dlg.z, $$1);
      }

      return biq.a($$0.B);
   }

   public static record a(String a, Map<ckw, iy> b) {
   }
}
