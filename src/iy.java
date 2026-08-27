import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Map;
import java.util.function.Predicate;

public interface iy {
   Map<String, iy.a> a = new Object2ObjectArrayMap();
   Codec<iy.a> b = asu.a(iy.a::a, a::get);
   iy.a c = a("empty");
   iy.a d = a("water");
   iy.a e = a("lava");
   iy.a f = a("powder_snow");
   iy g = ($$0, $$1, $$2, $$3, $$4, $$5) -> a($$1, $$2, $$3, $$4, $$5, cvc.fu.o().a(czi.g, Integer.valueOf(3)), aqr.cv);
   iy h = ($$0, $$1, $$2, $$3, $$4, $$5) -> a($$1, $$2, $$3, $$4, $$5, cvc.fv.o(), aqr.cy);
   iy i = ($$0, $$1, $$2, $$3, $$4, $$5) -> a($$1, $$2, $$3, $$4, $$5, cvc.fw.o().a(czi.g, Integer.valueOf(3)), aqr.cz);
   iy j = ($$0, $$1, $$2, $$3, $$4, $$5) -> {
      cva $$6 = cva.a($$5.d());
      if (!($$6 instanceof dby)) {
         return bix.d;
      } else {
         if (!$$1.B) {
            clj $$7 = new clj(cvc.kP);
            if ($$5.u()) {
               $$7.c($$5.v().h());
            }

            $$3.a($$4, $$7);
            $$3.a(arb.Z);
            czi.d($$0, $$1, $$2);
         }

         return bix.a($$1.B);
      }
   };
   iy k = ($$0, $$1, $$2, $$3, $$4, $$5) -> {
      if (det.c($$5) <= 0) {
         return bix.d;
      } else {
         if (!$$1.B) {
            clj $$6 = $$5.c(1);
            det.d($$6);
            if (!$$3.fU().d) {
               $$5.h(1);
            }

            if ($$5.b()) {
               $$3.a($$4, $$6);
            } else if ($$3.fT().e($$6)) {
               $$3.bR.b();
            } else {
               $$3.a($$6, false);
            }

            $$3.a(arb.Y);
            czi.d($$0, $$1, $$2);
         }

         return bix.a($$1.B);
      }
   };
   iy l = ($$0, $$1, $$2, $$3, $$4, $$5) -> {
      if (!($$5.d() instanceof ckb $$7)) {
         return bix.d;
      } else if (!$$7.a($$5)) {
         return bix.d;
      } else {
         if (!$$1.B) {
            $$7.f_($$5);
            $$3.a(arb.X);
            czi.d($$0, $$1, $$2);
         }

         return bix.a($$1.B);
      }
   };

   static iy.a a(String $$0) {
      Object2ObjectOpenHashMap<cle, iy> $$1 = new Object2ObjectOpenHashMap();
      $$1.defaultReturnValue((iy)($$0x, $$1x, $$2x, $$3, $$4, $$5) -> bix.d);
      iy.a $$2 = new iy.a($$0, $$1);
      a.put($$0, $$2);
      return $$2;
   }

   bix interact(dhi var1, csa var2, ht var3, cdu var4, biw var5, clj var6);

   static void a() {
      Map<cle, iy> $$0 = c.b();
      a($$0);
      $$0.put(clm.sh, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> {
         if (cni.d($$5) != cnj.c) {
            return bix.d;
         } else {
            if (!$$1x.B) {
               cle $$6 = $$5.d();
               $$3x.a($$4, cll.a($$5, $$3x, new clj(clm.si)));
               $$3x.a(arb.W);
               $$3x.b(arb.c.b($$6));
               $$1x.b($$2x, cvc.fu.o());
               $$1x.a(null, $$2x, aqr.ch, aqs.e, 1.0F, 1.0F);
               $$1x.a(null, dls.z, $$2x);
            }

            return bix.a($$1x.B);
         }
      });
      Map<cle, iy> $$1 = d.b();
      a($$1);
      $$1.put(clm.qv, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> a($$0x, $$1x, $$2x, $$3x, $$4, $$5, new clj(clm.qw), $$0xx -> $$0xx.c(czi.g) == 3, aqr.cB));
      $$1.put(clm.si, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> {
         if (!$$1x.B) {
            cle $$6 = $$5.d();
            $$3x.a($$4, cll.a($$5, $$3x, cni.a(new clj(clm.sh), cnj.c)));
            $$3x.a(arb.W);
            $$3x.b(arb.c.b($$6));
            czi.d($$0x, $$1x, $$2x);
            $$1x.a(null, $$2x, aqr.ci, aqs.e, 1.0F, 1.0F);
            $$1x.a(null, dls.y, $$2x);
         }

         return bix.a($$1x.B);
      });
      $$1.put(clm.sh, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> {
         if ($$0x.c(czi.g) != 3 && cni.d($$5) == cnj.c) {
            if (!$$1x.B) {
               $$3x.a($$4, cll.a($$5, $$3x, new clj(clm.si)));
               $$3x.a(arb.W);
               $$3x.b(arb.c.b($$5.d()));
               $$1x.b($$2x, $$0x.a(czi.g));
               $$1x.a(null, $$2x, aqr.ch, aqs.e, 1.0F, 1.0F);
               $$1x.a(null, dls.z, $$2x);
            }

            return bix.a($$1x.B);
         } else {
            return bix.d;
         }
      });
      $$1.put(clm.py, l);
      $$1.put(clm.px, l);
      $$1.put(clm.pw, l);
      $$1.put(clm.pv, l);
      $$1.put(clm.uB, l);
      $$1.put(clm.uH, k);
      $$1.put(clm.uO, k);
      $$1.put(clm.uW, k);
      $$1.put(clm.uS, k);
      $$1.put(clm.uT, k);
      $$1.put(clm.uQ, k);
      $$1.put(clm.uU, k);
      $$1.put(clm.uK, k);
      $$1.put(clm.uP, k);
      $$1.put(clm.uM, k);
      $$1.put(clm.uJ, k);
      $$1.put(clm.uI, k);
      $$1.put(clm.uN, k);
      $$1.put(clm.uR, k);
      $$1.put(clm.uV, k);
      $$1.put(clm.uL, k);
      $$1.put(clm.jc, j);
      $$1.put(clm.jj, j);
      $$1.put(clm.jr, j);
      $$1.put(clm.jn, j);
      $$1.put(clm.jo, j);
      $$1.put(clm.jl, j);
      $$1.put(clm.jp, j);
      $$1.put(clm.jf, j);
      $$1.put(clm.jk, j);
      $$1.put(clm.jh, j);
      $$1.put(clm.je, j);
      $$1.put(clm.jd, j);
      $$1.put(clm.ji, j);
      $$1.put(clm.jm, j);
      $$1.put(clm.jq, j);
      $$1.put(clm.jg, j);
      Map<cle, iy> $$2 = e.b();
      $$2.put(clm.qv, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> a($$0x, $$1x, $$2x, $$3x, $$4, $$5, new clj(clm.qx), $$0xx -> true, aqr.cE));
      a($$2);
      Map<cle, iy> $$3 = f.b();
      $$3.put(clm.qv, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> a($$0x, $$1x, $$2x, $$3x, $$4, $$5, new clj(clm.qy), $$0xx -> $$0xx.c(czi.g) == 3, aqr.cF));
      a($$3);
   }

   static void a(Map<cle, iy> $$0) {
      $$0.put(clm.qx, h);
      $$0.put(clm.qw, g);
      $$0.put(clm.qy, i);
   }

   static bix a(dhi $$0, csa $$1, ht $$2, cdu $$3, biw $$4, clj $$5, clj $$6, Predicate<dhi> $$7, aqq $$8) {
      if (!$$7.test($$0)) {
         return bix.d;
      } else {
         if (!$$1.B) {
            cle $$9 = $$5.d();
            $$3.a($$4, cll.a($$5, $$3, $$6));
            $$3.a(arb.W);
            $$3.b(arb.c.b($$9));
            $$1.b($$2, cvc.ft.o());
            $$1.a(null, $$2, $$8, aqs.e, 1.0F, 1.0F);
            $$1.a(null, dls.y, $$2);
         }

         return bix.a($$1.B);
      }
   }

   static bix a(csa $$0, ht $$1, cdu $$2, biw $$3, clj $$4, dhi $$5, aqq $$6) {
      if (!$$0.B) {
         cle $$7 = $$4.d();
         $$2.a($$3, cll.a($$4, $$2, new clj(clm.qv)));
         $$2.a(arb.V);
         $$2.b(arb.c.b($$7));
         $$0.b($$1, $$5);
         $$0.a(null, $$1, $$6, aqs.e, 1.0F, 1.0F);
         $$0.a(null, dls.z, $$1);
      }

      return bix.a($$0.B);
   }

   public static record a(String a, Map<cle, iy> b) {
   }
}
