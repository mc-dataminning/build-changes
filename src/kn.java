import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Map;
import java.util.function.Predicate;

public interface kn {
   Map<String, kn.a> a = new Object2ObjectArrayMap();
   Codec<kn.a> b = Codec.stringResolver(kn.a::a, a::get);
   kn.a c = a("empty");
   kn.a d = a("water");
   kn.a e = a("lava");
   kn.a f = a("powder_snow");

   static kn.a a(String $$0) {
      Object2ObjectOpenHashMap<cxg, kn> $$1 = new Object2ObjectOpenHashMap();
      $$1.defaultReturnValue((kn)($$0x, $$1x, $$2x, $$3, $$4, $$5) -> bte.f);
      kn.a $$2 = new kn.a($$0, $$1);
      a.put($$0, $$2);
      return $$2;
   }

   bte interact(dxn var1, dha var2, jh var3, cps var4, btd var5, cxk var6);

   static void a() {
      Map<cxg, kn> $$0 = c.b();
      a($$0);
      $$0.put(cxo.sZ, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> {
         czj $$6 = $$5.a(ku.Q);
         if ($$6 != null && $$6.a(czk.a)) {
            if (!$$1x.C) {
               cxg $$7 = $$5.h();
               $$3x.a($$4, cxn.a($$5, $$3x, new cxk(cxo.sY)));
               $$3x.a(axp.W);
               $$3x.b(axp.c.b($$7));
               $$1x.b($$2x, dkg.fI.m());
               $$1x.a(null, $$2x, axf.cB, axg.e, 1.0F, 1.0F);
               $$1x.a(null, ecj.z, $$2x);
            }

            return bte.a;
         } else {
            return bte.f;
         }
      });
      Map<cxg, kn> $$1 = d.b();
      a($$1);
      $$1.put(cxo.qW, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> a($$0x, $$1x, $$2x, $$3x, $$4, $$5, new cxk(cxo.qX), $$0xx -> $$0xx.c(dop.g) == 3, axf.di));
      $$1.put(cxo.sY, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> {
         if (!$$1x.C) {
            cxg $$6 = $$5.h();
            $$3x.a($$4, cxn.a($$5, $$3x, czj.a(cxo.sZ, czk.a)));
            $$3x.a(axp.W);
            $$3x.b(axp.c.b($$6));
            dop.e($$0x, $$1x, $$2x);
            $$1x.a(null, $$2x, axf.cC, axg.e, 1.0F, 1.0F);
            $$1x.a(null, ecj.y, $$2x);
         }

         return bte.a;
      });
      $$1.put(cxo.sZ, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> {
         if ($$0x.c(dop.g) == 3) {
            return bte.f;
         } else {
            czj $$6 = $$5.a(ku.Q);
            if ($$6 != null && $$6.a(czk.a)) {
               if (!$$1x.C) {
                  $$3x.a($$4, cxn.a($$5, $$3x, new cxk(cxo.sY)));
                  $$3x.a(axp.W);
                  $$3x.b(axp.c.b($$5.h()));
                  $$1x.b($$2x, $$0x.a(dop.g));
                  $$1x.a(null, $$2x, axf.cB, axg.e, 1.0F, 1.0F);
                  $$1x.a(null, ecj.z, $$2x);
               }

               return bte.a;
            } else {
               return bte.f;
            }
         }
      });
      $$1.put(cxo.pX, kn::f);
      $$1.put(cxo.pW, kn::f);
      $$1.put(cxo.pV, kn::f);
      $$1.put(cxo.pU, kn::f);
      $$1.put(cxo.vz, kn::f);
      $$1.put(cxo.oN, kn::f);
      $$1.put(cxo.vF, kn::e);
      $$1.put(cxo.vM, kn::e);
      $$1.put(cxo.vU, kn::e);
      $$1.put(cxo.vQ, kn::e);
      $$1.put(cxo.vR, kn::e);
      $$1.put(cxo.vO, kn::e);
      $$1.put(cxo.vS, kn::e);
      $$1.put(cxo.vI, kn::e);
      $$1.put(cxo.vN, kn::e);
      $$1.put(cxo.vK, kn::e);
      $$1.put(cxo.vH, kn::e);
      $$1.put(cxo.vG, kn::e);
      $$1.put(cxo.vL, kn::e);
      $$1.put(cxo.vP, kn::e);
      $$1.put(cxo.vT, kn::e);
      $$1.put(cxo.vJ, kn::e);
      $$1.put(cxo.jr, kn::d);
      $$1.put(cxo.jy, kn::d);
      $$1.put(cxo.jG, kn::d);
      $$1.put(cxo.jC, kn::d);
      $$1.put(cxo.jD, kn::d);
      $$1.put(cxo.jA, kn::d);
      $$1.put(cxo.jE, kn::d);
      $$1.put(cxo.ju, kn::d);
      $$1.put(cxo.jz, kn::d);
      $$1.put(cxo.jw, kn::d);
      $$1.put(cxo.jt, kn::d);
      $$1.put(cxo.js, kn::d);
      $$1.put(cxo.jx, kn::d);
      $$1.put(cxo.jB, kn::d);
      $$1.put(cxo.jF, kn::d);
      $$1.put(cxo.jv, kn::d);
      Map<cxg, kn> $$2 = e.b();
      $$2.put(cxo.qW, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> a($$0x, $$1x, $$2x, $$3x, $$4, $$5, new cxk(cxo.qY), $$0xx -> true, axf.dl));
      a($$2);
      Map<cxg, kn> $$3 = f.b();
      $$3.put(cxo.qW, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> a($$0x, $$1x, $$2x, $$3x, $$4, $$5, new cxk(cxo.qZ), $$0xx -> $$0xx.c(dop.g) == 3, axf.dm));
      a($$3);
   }

   static void a(Map<cxg, kn> $$0) {
      $$0.put(cxo.qY, kn::b);
      $$0.put(cxo.qX, kn::a);
      $$0.put(cxo.qZ, kn::c);
   }

   static bte a(dxn $$0, dha $$1, jh $$2, cps $$3, btd $$4, cxk $$5, cxk $$6, Predicate<dxn> $$7, axe $$8) {
      if (!$$7.test($$0)) {
         return bte.f;
      } else {
         if (!$$1.C) {
            cxg $$9 = $$5.h();
            $$3.a($$4, cxn.a($$5, $$3, $$6));
            $$3.a(axp.W);
            $$3.b(axp.c.b($$9));
            $$1.b($$2, dkg.fH.m());
            $$1.a(null, $$2, $$8, axg.e, 1.0F, 1.0F);
            $$1.a(null, ecj.y, $$2);
         }

         return bte.a;
      }
   }

   static bte a(dha $$0, jh $$1, cps $$2, btd $$3, cxk $$4, dxn $$5, axe $$6) {
      if (!$$0.C) {
         cxg $$7 = $$4.h();
         $$2.a($$3, cxn.a($$4, $$2, new cxk(cxo.qW)));
         $$2.a(axp.V);
         $$2.b(axp.c.b($$7));
         $$0.b($$1, $$5);
         $$0.a(null, $$1, $$6, axg.e, 1.0F, 1.0F);
         $$0.a(null, ecj.z, $$1);
      }

      return bte.a;
   }

   private static bte a(dxn $$0, dha $$1, jh $$2, cps $$3, btd $$4, cxk $$5) {
      return a($$1, $$2, $$3, $$4, $$5, dkg.fI.m().b(dop.g, Integer.valueOf(3)), axf.dc);
   }

   private static bte b(dxn $$0, dha $$1, jh $$2, cps $$3, btd $$4, cxk $$5) {
      return (bte)(a($$1, $$2) ? bte.c : a($$1, $$2, $$3, $$4, $$5, dkg.fJ.m(), axf.df));
   }

   private static bte c(dxn $$0, dha $$1, jh $$2, cps $$3, btd $$4, cxk $$5) {
      return (bte)(a($$1, $$2) ? bte.c : a($$1, $$2, $$3, $$4, $$5, dkg.fK.m().b(dop.g, Integer.valueOf(3)), axf.dg));
   }

   private static bte d(dxn $$0, dha $$1, jh $$2, cps $$3, btd $$4, cxk $$5) {
      dke $$6 = dke.a($$5.h());
      if (!($$6 instanceof drg)) {
         return bte.f;
      } else {
         if (!$$1.C) {
            cxk $$7 = $$5.a(dkg.lk, 1);
            $$3.a($$4, cxn.a($$5, $$3, $$7, false));
            $$3.a(axp.Z);
            dop.e($$0, $$1, $$2);
         }

         return bte.a;
      }
   }

   private static bte e(dxn $$0, dha $$1, jh $$2, cps $$3, btd $$4, cxk $$5) {
      dug $$6 = $$5.a(ku.ai, dug.a);
      if ($$6.b().isEmpty()) {
         return bte.f;
      } else {
         if (!$$1.C) {
            cxk $$7 = $$5.c(1);
            $$7.b(ku.ai, $$6.a());
            $$3.a($$4, cxn.a($$5, $$3, $$7, false));
            $$3.a(axp.Y);
            dop.e($$0, $$1, $$2);
         }

         return bte.a;
      }
   }

   private static bte f(dxn $$0, dha $$1, jh $$2, cps $$3, btd $$4, cxk $$5) {
      if (!$$5.a(ayd.bR)) {
         return bte.f;
      } else if (!$$5.b(ku.J)) {
         return bte.f;
      } else {
         if (!$$1.C) {
            $$5.c(ku.J);
            $$3.a(axp.X);
            dop.e($$0, $$1, $$2);
         }

         return bte.a;
      }
   }

   private static boolean a(dha $$0, jh $$1) {
      etp $$2 = $$0.b_($$1.d());
      return $$2.a(aya.a);
   }

   public static record a(String a, Map<cxg, kn> b) {
   }
}
