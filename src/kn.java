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
      Object2ObjectOpenHashMap<cxl, kn> $$1 = new Object2ObjectOpenHashMap();
      $$1.defaultReturnValue((kn)($$0x, $$1x, $$2x, $$3, $$4, $$5) -> btj.f);
      kn.a $$2 = new kn.a($$0, $$1);
      a.put($$0, $$2);
      return $$2;
   }

   btj interact(dxv var1, dhi var2, jh var3, cpx var4, bti var5, cxp var6);

   static void a() {
      Map<cxl, kn> $$0 = c.b();
      a($$0);
      $$0.put(cxt.sZ, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> {
         czo $$6 = $$5.a(ku.Q);
         if ($$6 != null && $$6.a(czp.a)) {
            if (!$$1x.C) {
               cxl $$7 = $$5.h();
               $$3x.a($$4, cxs.a($$5, $$3x, new cxp(cxt.sY)));
               $$3x.a(axp.W);
               $$3x.b(axp.c.b($$7));
               $$1x.b($$2x, dko.fI.m());
               $$1x.a(null, $$2x, axf.cB, axg.e, 1.0F, 1.0F);
               $$1x.a(null, ecr.z, $$2x);
            }

            return btj.a;
         } else {
            return btj.f;
         }
      });
      Map<cxl, kn> $$1 = d.b();
      a($$1);
      $$1.put(cxt.qW, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> a($$0x, $$1x, $$2x, $$3x, $$4, $$5, new cxp(cxt.qX), $$0xx -> $$0xx.c(dox.g) == 3, axf.dj));
      $$1.put(cxt.sY, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> {
         if (!$$1x.C) {
            cxl $$6 = $$5.h();
            $$3x.a($$4, cxs.a($$5, $$3x, czo.a(cxt.sZ, czp.a)));
            $$3x.a(axp.W);
            $$3x.b(axp.c.b($$6));
            dox.e($$0x, $$1x, $$2x);
            $$1x.a(null, $$2x, axf.cC, axg.e, 1.0F, 1.0F);
            $$1x.a(null, ecr.y, $$2x);
         }

         return btj.a;
      });
      $$1.put(cxt.sZ, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> {
         if ($$0x.c(dox.g) == 3) {
            return btj.f;
         } else {
            czo $$6 = $$5.a(ku.Q);
            if ($$6 != null && $$6.a(czp.a)) {
               if (!$$1x.C) {
                  $$3x.a($$4, cxs.a($$5, $$3x, new cxp(cxt.sY)));
                  $$3x.a(axp.W);
                  $$3x.b(axp.c.b($$5.h()));
                  $$1x.b($$2x, $$0x.a(dox.g));
                  $$1x.a(null, $$2x, axf.cB, axg.e, 1.0F, 1.0F);
                  $$1x.a(null, ecr.z, $$2x);
               }

               return btj.a;
            } else {
               return btj.f;
            }
         }
      });
      $$1.put(cxt.pX, kn::f);
      $$1.put(cxt.pW, kn::f);
      $$1.put(cxt.pV, kn::f);
      $$1.put(cxt.pU, kn::f);
      $$1.put(cxt.vz, kn::f);
      $$1.put(cxt.oN, kn::f);
      $$1.put(cxt.vF, kn::e);
      $$1.put(cxt.vM, kn::e);
      $$1.put(cxt.vU, kn::e);
      $$1.put(cxt.vQ, kn::e);
      $$1.put(cxt.vR, kn::e);
      $$1.put(cxt.vO, kn::e);
      $$1.put(cxt.vS, kn::e);
      $$1.put(cxt.vI, kn::e);
      $$1.put(cxt.vN, kn::e);
      $$1.put(cxt.vK, kn::e);
      $$1.put(cxt.vH, kn::e);
      $$1.put(cxt.vG, kn::e);
      $$1.put(cxt.vL, kn::e);
      $$1.put(cxt.vP, kn::e);
      $$1.put(cxt.vT, kn::e);
      $$1.put(cxt.vJ, kn::e);
      $$1.put(cxt.jr, kn::d);
      $$1.put(cxt.jy, kn::d);
      $$1.put(cxt.jG, kn::d);
      $$1.put(cxt.jC, kn::d);
      $$1.put(cxt.jD, kn::d);
      $$1.put(cxt.jA, kn::d);
      $$1.put(cxt.jE, kn::d);
      $$1.put(cxt.ju, kn::d);
      $$1.put(cxt.jz, kn::d);
      $$1.put(cxt.jw, kn::d);
      $$1.put(cxt.jt, kn::d);
      $$1.put(cxt.js, kn::d);
      $$1.put(cxt.jx, kn::d);
      $$1.put(cxt.jB, kn::d);
      $$1.put(cxt.jF, kn::d);
      $$1.put(cxt.jv, kn::d);
      Map<cxl, kn> $$2 = e.b();
      $$2.put(cxt.qW, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> a($$0x, $$1x, $$2x, $$3x, $$4, $$5, new cxp(cxt.qY), $$0xx -> true, axf.dm));
      a($$2);
      Map<cxl, kn> $$3 = f.b();
      $$3.put(cxt.qW, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> a($$0x, $$1x, $$2x, $$3x, $$4, $$5, new cxp(cxt.qZ), $$0xx -> $$0xx.c(dox.g) == 3, axf.dn));
      a($$3);
   }

   static void a(Map<cxl, kn> $$0) {
      $$0.put(cxt.qY, kn::b);
      $$0.put(cxt.qX, kn::a);
      $$0.put(cxt.qZ, kn::c);
   }

   static btj a(dxv $$0, dhi $$1, jh $$2, cpx $$3, bti $$4, cxp $$5, cxp $$6, Predicate<dxv> $$7, axe $$8) {
      if (!$$7.test($$0)) {
         return btj.f;
      } else {
         if (!$$1.C) {
            cxl $$9 = $$5.h();
            $$3.a($$4, cxs.a($$5, $$3, $$6));
            $$3.a(axp.W);
            $$3.b(axp.c.b($$9));
            $$1.b($$2, dko.fH.m());
            $$1.a(null, $$2, $$8, axg.e, 1.0F, 1.0F);
            $$1.a(null, ecr.y, $$2);
         }

         return btj.a;
      }
   }

   static btj a(dhi $$0, jh $$1, cpx $$2, bti $$3, cxp $$4, dxv $$5, axe $$6) {
      if (!$$0.C) {
         cxl $$7 = $$4.h();
         $$2.a($$3, cxs.a($$4, $$2, new cxp(cxt.qW)));
         $$2.a(axp.V);
         $$2.b(axp.c.b($$7));
         $$0.b($$1, $$5);
         $$0.a(null, $$1, $$6, axg.e, 1.0F, 1.0F);
         $$0.a(null, ecr.z, $$1);
      }

      return btj.a;
   }

   private static btj a(dxv $$0, dhi $$1, jh $$2, cpx $$3, bti $$4, cxp $$5) {
      return a($$1, $$2, $$3, $$4, $$5, dko.fI.m().b(dox.g, Integer.valueOf(3)), axf.dd);
   }

   private static btj b(dxv $$0, dhi $$1, jh $$2, cpx $$3, bti $$4, cxp $$5) {
      return (btj)(a($$1, $$2) ? btj.c : a($$1, $$2, $$3, $$4, $$5, dko.fJ.m(), axf.dg));
   }

   private static btj c(dxv $$0, dhi $$1, jh $$2, cpx $$3, bti $$4, cxp $$5) {
      return (btj)(a($$1, $$2) ? btj.c : a($$1, $$2, $$3, $$4, $$5, dko.fK.m().b(dox.g, Integer.valueOf(3)), axf.dh));
   }

   private static btj d(dxv $$0, dhi $$1, jh $$2, cpx $$3, bti $$4, cxp $$5) {
      dkm $$6 = dkm.a($$5.h());
      if (!($$6 instanceof dro)) {
         return btj.f;
      } else {
         if (!$$1.C) {
            cxp $$7 = $$5.a(dko.lk, 1);
            $$3.a($$4, cxs.a($$5, $$3, $$7, false));
            $$3.a(axp.Z);
            dox.e($$0, $$1, $$2);
         }

         return btj.a;
      }
   }

   private static btj e(dxv $$0, dhi $$1, jh $$2, cpx $$3, bti $$4, cxp $$5) {
      duo $$6 = $$5.a(ku.ai, duo.a);
      if ($$6.b().isEmpty()) {
         return btj.f;
      } else {
         if (!$$1.C) {
            cxp $$7 = $$5.c(1);
            $$7.b(ku.ai, $$6.a());
            $$3.a($$4, cxs.a($$5, $$3, $$7, false));
            $$3.a(axp.Y);
            dox.e($$0, $$1, $$2);
         }

         return btj.a;
      }
   }

   private static btj f(dxv $$0, dhi $$1, jh $$2, cpx $$3, bti $$4, cxp $$5) {
      if (!$$5.a(ayd.bR)) {
         return btj.f;
      } else if (!$$5.b(ku.J)) {
         return btj.f;
      } else {
         if (!$$1.C) {
            $$5.c(ku.J);
            $$3.a(axp.X);
            dox.e($$0, $$1, $$2);
         }

         return btj.a;
      }
   }

   private static boolean a(dhi $$0, jh $$1) {
      etx $$2 = $$0.b_($$1.d());
      return $$2.a(aya.a);
   }

   public static record a(String a, Map<cxl, kn> b) {
   }
}
