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
      Object2ObjectOpenHashMap<cxk, kn> $$1 = new Object2ObjectOpenHashMap();
      $$1.defaultReturnValue((kn)($$0x, $$1x, $$2x, $$3, $$4, $$5) -> bti.f);
      kn.a $$2 = new kn.a($$0, $$1);
      a.put($$0, $$2);
      return $$2;
   }

   bti interact(dxu var1, dhh var2, jh var3, cpw var4, bth var5, cxo var6);

   static void a() {
      Map<cxk, kn> $$0 = c.b();
      a($$0);
      $$0.put(cxs.sZ, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> {
         czn $$6 = $$5.a(ku.Q);
         if ($$6 != null && $$6.a(czo.a)) {
            if (!$$1x.C) {
               cxk $$7 = $$5.h();
               $$3x.a($$4, cxr.a($$5, $$3x, new cxo(cxs.sY)));
               $$3x.a(axp.W);
               $$3x.b(axp.c.b($$7));
               $$1x.b($$2x, dkn.fI.m());
               $$1x.a(null, $$2x, axf.cB, axg.e, 1.0F, 1.0F);
               $$1x.a(null, ecq.z, $$2x);
            }

            return bti.a;
         } else {
            return bti.f;
         }
      });
      Map<cxk, kn> $$1 = d.b();
      a($$1);
      $$1.put(cxs.qW, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> a($$0x, $$1x, $$2x, $$3x, $$4, $$5, new cxo(cxs.qX), $$0xx -> $$0xx.c(dow.g) == 3, axf.dj));
      $$1.put(cxs.sY, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> {
         if (!$$1x.C) {
            cxk $$6 = $$5.h();
            $$3x.a($$4, cxr.a($$5, $$3x, czn.a(cxs.sZ, czo.a)));
            $$3x.a(axp.W);
            $$3x.b(axp.c.b($$6));
            dow.e($$0x, $$1x, $$2x);
            $$1x.a(null, $$2x, axf.cC, axg.e, 1.0F, 1.0F);
            $$1x.a(null, ecq.y, $$2x);
         }

         return bti.a;
      });
      $$1.put(cxs.sZ, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> {
         if ($$0x.c(dow.g) == 3) {
            return bti.f;
         } else {
            czn $$6 = $$5.a(ku.Q);
            if ($$6 != null && $$6.a(czo.a)) {
               if (!$$1x.C) {
                  $$3x.a($$4, cxr.a($$5, $$3x, new cxo(cxs.sY)));
                  $$3x.a(axp.W);
                  $$3x.b(axp.c.b($$5.h()));
                  $$1x.b($$2x, $$0x.a(dow.g));
                  $$1x.a(null, $$2x, axf.cB, axg.e, 1.0F, 1.0F);
                  $$1x.a(null, ecq.z, $$2x);
               }

               return bti.a;
            } else {
               return bti.f;
            }
         }
      });
      $$1.put(cxs.pX, kn::f);
      $$1.put(cxs.pW, kn::f);
      $$1.put(cxs.pV, kn::f);
      $$1.put(cxs.pU, kn::f);
      $$1.put(cxs.vz, kn::f);
      $$1.put(cxs.oN, kn::f);
      $$1.put(cxs.vF, kn::e);
      $$1.put(cxs.vM, kn::e);
      $$1.put(cxs.vU, kn::e);
      $$1.put(cxs.vQ, kn::e);
      $$1.put(cxs.vR, kn::e);
      $$1.put(cxs.vO, kn::e);
      $$1.put(cxs.vS, kn::e);
      $$1.put(cxs.vI, kn::e);
      $$1.put(cxs.vN, kn::e);
      $$1.put(cxs.vK, kn::e);
      $$1.put(cxs.vH, kn::e);
      $$1.put(cxs.vG, kn::e);
      $$1.put(cxs.vL, kn::e);
      $$1.put(cxs.vP, kn::e);
      $$1.put(cxs.vT, kn::e);
      $$1.put(cxs.vJ, kn::e);
      $$1.put(cxs.jr, kn::d);
      $$1.put(cxs.jy, kn::d);
      $$1.put(cxs.jG, kn::d);
      $$1.put(cxs.jC, kn::d);
      $$1.put(cxs.jD, kn::d);
      $$1.put(cxs.jA, kn::d);
      $$1.put(cxs.jE, kn::d);
      $$1.put(cxs.ju, kn::d);
      $$1.put(cxs.jz, kn::d);
      $$1.put(cxs.jw, kn::d);
      $$1.put(cxs.jt, kn::d);
      $$1.put(cxs.js, kn::d);
      $$1.put(cxs.jx, kn::d);
      $$1.put(cxs.jB, kn::d);
      $$1.put(cxs.jF, kn::d);
      $$1.put(cxs.jv, kn::d);
      Map<cxk, kn> $$2 = e.b();
      $$2.put(cxs.qW, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> a($$0x, $$1x, $$2x, $$3x, $$4, $$5, new cxo(cxs.qY), $$0xx -> true, axf.dm));
      a($$2);
      Map<cxk, kn> $$3 = f.b();
      $$3.put(cxs.qW, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> a($$0x, $$1x, $$2x, $$3x, $$4, $$5, new cxo(cxs.qZ), $$0xx -> $$0xx.c(dow.g) == 3, axf.dn));
      a($$3);
   }

   static void a(Map<cxk, kn> $$0) {
      $$0.put(cxs.qY, kn::b);
      $$0.put(cxs.qX, kn::a);
      $$0.put(cxs.qZ, kn::c);
   }

   static bti a(dxu $$0, dhh $$1, jh $$2, cpw $$3, bth $$4, cxo $$5, cxo $$6, Predicate<dxu> $$7, axe $$8) {
      if (!$$7.test($$0)) {
         return bti.f;
      } else {
         if (!$$1.C) {
            cxk $$9 = $$5.h();
            $$3.a($$4, cxr.a($$5, $$3, $$6));
            $$3.a(axp.W);
            $$3.b(axp.c.b($$9));
            $$1.b($$2, dkn.fH.m());
            $$1.a(null, $$2, $$8, axg.e, 1.0F, 1.0F);
            $$1.a(null, ecq.y, $$2);
         }

         return bti.a;
      }
   }

   static bti a(dhh $$0, jh $$1, cpw $$2, bth $$3, cxo $$4, dxu $$5, axe $$6) {
      if (!$$0.C) {
         cxk $$7 = $$4.h();
         $$2.a($$3, cxr.a($$4, $$2, new cxo(cxs.qW)));
         $$2.a(axp.V);
         $$2.b(axp.c.b($$7));
         $$0.b($$1, $$5);
         $$0.a(null, $$1, $$6, axg.e, 1.0F, 1.0F);
         $$0.a(null, ecq.z, $$1);
      }

      return bti.a;
   }

   private static bti a(dxu $$0, dhh $$1, jh $$2, cpw $$3, bth $$4, cxo $$5) {
      return a($$1, $$2, $$3, $$4, $$5, dkn.fI.m().b(dow.g, Integer.valueOf(3)), axf.dd);
   }

   private static bti b(dxu $$0, dhh $$1, jh $$2, cpw $$3, bth $$4, cxo $$5) {
      return (bti)(a($$1, $$2) ? bti.c : a($$1, $$2, $$3, $$4, $$5, dkn.fJ.m(), axf.dg));
   }

   private static bti c(dxu $$0, dhh $$1, jh $$2, cpw $$3, bth $$4, cxo $$5) {
      return (bti)(a($$1, $$2) ? bti.c : a($$1, $$2, $$3, $$4, $$5, dkn.fK.m().b(dow.g, Integer.valueOf(3)), axf.dh));
   }

   private static bti d(dxu $$0, dhh $$1, jh $$2, cpw $$3, bth $$4, cxo $$5) {
      dkl $$6 = dkl.a($$5.h());
      if (!($$6 instanceof drn)) {
         return bti.f;
      } else {
         if (!$$1.C) {
            cxo $$7 = $$5.a(dkn.lk, 1);
            $$3.a($$4, cxr.a($$5, $$3, $$7, false));
            $$3.a(axp.Z);
            dow.e($$0, $$1, $$2);
         }

         return bti.a;
      }
   }

   private static bti e(dxu $$0, dhh $$1, jh $$2, cpw $$3, bth $$4, cxo $$5) {
      dun $$6 = $$5.a(ku.ai, dun.a);
      if ($$6.b().isEmpty()) {
         return bti.f;
      } else {
         if (!$$1.C) {
            cxo $$7 = $$5.c(1);
            $$7.b(ku.ai, $$6.a());
            $$3.a($$4, cxr.a($$5, $$3, $$7, false));
            $$3.a(axp.Y);
            dow.e($$0, $$1, $$2);
         }

         return bti.a;
      }
   }

   private static bti f(dxu $$0, dhh $$1, jh $$2, cpw $$3, bth $$4, cxo $$5) {
      if (!$$5.a(ayd.bR)) {
         return bti.f;
      } else if (!$$5.b(ku.J)) {
         return bti.f;
      } else {
         if (!$$1.C) {
            $$5.c(ku.J);
            $$3.a(axp.X);
            dow.e($$0, $$1, $$2);
         }

         return bti.a;
      }
   }

   private static boolean a(dhh $$0, jh $$1) {
      etw $$2 = $$0.b_($$1.d());
      return $$2.a(aya.a);
   }

   public static record a(String a, Map<cxk, kn> b) {
   }
}
