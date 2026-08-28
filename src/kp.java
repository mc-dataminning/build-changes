import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Map;
import java.util.function.Predicate;

public interface kp {
   Map<String, kp.a> a = new Object2ObjectArrayMap();
   Codec<kp.a> b = Codec.stringResolver(kp.a::a, a::get);
   kp.a c = a("empty");
   kp.a d = a("water");
   kp.a e = a("lava");
   kp.a f = a("powder_snow");

   static kp.a a(String $$0) {
      Object2ObjectOpenHashMap<cxu, kp> $$1 = new Object2ObjectOpenHashMap();
      $$1.defaultReturnValue((kp)($$0x, $$1x, $$2x, $$3, $$4, $$5) -> btq.f);
      kp.a $$2 = new kp.a($$0, $$1);
      a.put($$0, $$2);
      return $$2;
   }

   btq interact(dym var1, dhp var2, jj var3, cqi var4, btp var5, cxy var6);

   static void a() {
      Map<cxu, kp> $$0 = c.b();
      a($$0);
      $$0.put(cyc.tm, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> {
         czu $$6 = $$5.a(kx.R);
         if ($$6 != null && $$6.a(czv.a)) {
            if (!$$1x.C) {
               cxu $$7 = $$5.h();
               $$3x.a($$4, cyb.a($$5, $$3x, new cxy(cyc.tl)));
               $$3x.a(awu.W);
               $$3x.b(awu.c.b($$7));
               $$1x.b($$2x, dkw.fP.m());
               $$1x.a(null, $$2x, awk.cB, awl.e, 1.0F, 1.0F);
               $$1x.a(null, edm.z, $$2x);
            }

            return btq.a;
         } else {
            return btq.f;
         }
      });
      Map<cxu, kp> $$1 = d.b();
      a($$1);
      $$1.put(cyc.rj, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> a($$0x, $$1x, $$2x, $$3x, $$4, $$5, new cxy(cyc.rk), $$0xx -> $$0xx.c(dpg.f) == 3, awk.dj));
      $$1.put(cyc.tl, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> {
         if (!$$1x.C) {
            cxu $$6 = $$5.h();
            $$3x.a($$4, cyb.a($$5, $$3x, czu.a(cyc.tm, czv.a)));
            $$3x.a(awu.W);
            $$3x.b(awu.c.b($$6));
            dpg.e($$0x, $$1x, $$2x);
            $$1x.a(null, $$2x, awk.cC, awl.e, 1.0F, 1.0F);
            $$1x.a(null, edm.y, $$2x);
         }

         return btq.a;
      });
      $$1.put(cyc.tm, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> {
         if ($$0x.c(dpg.f) == 3) {
            return btq.f;
         } else {
            czu $$6 = $$5.a(kx.R);
            if ($$6 != null && $$6.a(czv.a)) {
               if (!$$1x.C) {
                  $$3x.a($$4, cyb.a($$5, $$3x, new cxy(cyc.tl)));
                  $$3x.a(awu.W);
                  $$3x.b(awu.c.b($$5.h()));
                  $$1x.b($$2x, $$0x.a(dpg.f));
                  $$1x.a(null, $$2x, awk.cB, awl.e, 1.0F, 1.0F);
                  $$1x.a(null, edm.z, $$2x);
               }

               return btq.a;
            } else {
               return btq.f;
            }
         }
      });
      $$1.put(cyc.qk, kp::f);
      $$1.put(cyc.qj, kp::f);
      $$1.put(cyc.qi, kp::f);
      $$1.put(cyc.qh, kp::f);
      $$1.put(cyc.vN, kp::f);
      $$1.put(cyc.pa, kp::f);
      $$1.put(cyc.vT, kp::e);
      $$1.put(cyc.wa, kp::e);
      $$1.put(cyc.wi, kp::e);
      $$1.put(cyc.we, kp::e);
      $$1.put(cyc.wf, kp::e);
      $$1.put(cyc.wc, kp::e);
      $$1.put(cyc.wg, kp::e);
      $$1.put(cyc.vW, kp::e);
      $$1.put(cyc.wb, kp::e);
      $$1.put(cyc.vY, kp::e);
      $$1.put(cyc.vV, kp::e);
      $$1.put(cyc.vU, kp::e);
      $$1.put(cyc.vZ, kp::e);
      $$1.put(cyc.wd, kp::e);
      $$1.put(cyc.wh, kp::e);
      $$1.put(cyc.vX, kp::e);
      $$1.put(cyc.jC, kp::d);
      $$1.put(cyc.jJ, kp::d);
      $$1.put(cyc.jR, kp::d);
      $$1.put(cyc.jN, kp::d);
      $$1.put(cyc.jO, kp::d);
      $$1.put(cyc.jL, kp::d);
      $$1.put(cyc.jP, kp::d);
      $$1.put(cyc.jF, kp::d);
      $$1.put(cyc.jK, kp::d);
      $$1.put(cyc.jH, kp::d);
      $$1.put(cyc.jE, kp::d);
      $$1.put(cyc.jD, kp::d);
      $$1.put(cyc.jI, kp::d);
      $$1.put(cyc.jM, kp::d);
      $$1.put(cyc.jQ, kp::d);
      $$1.put(cyc.jG, kp::d);
      Map<cxu, kp> $$2 = e.b();
      $$2.put(cyc.rj, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> a($$0x, $$1x, $$2x, $$3x, $$4, $$5, new cxy(cyc.rl), $$0xx -> true, awk.dm));
      a($$2);
      Map<cxu, kp> $$3 = f.b();
      $$3.put(cyc.rj, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> a($$0x, $$1x, $$2x, $$3x, $$4, $$5, new cxy(cyc.rm), $$0xx -> $$0xx.c(dpg.f) == 3, awk.dn));
      a($$3);
   }

   static void a(Map<cxu, kp> $$0) {
      $$0.put(cyc.rl, kp::b);
      $$0.put(cyc.rk, kp::a);
      $$0.put(cyc.rm, kp::c);
   }

   static btq a(dym $$0, dhp $$1, jj $$2, cqi $$3, btp $$4, cxy $$5, cxy $$6, Predicate<dym> $$7, awj $$8) {
      if (!$$7.test($$0)) {
         return btq.f;
      } else {
         if (!$$1.C) {
            cxu $$9 = $$5.h();
            $$3.a($$4, cyb.a($$5, $$3, $$6));
            $$3.a(awu.W);
            $$3.b(awu.c.b($$9));
            $$1.b($$2, dkw.fO.m());
            $$1.a(null, $$2, $$8, awl.e, 1.0F, 1.0F);
            $$1.a(null, edm.y, $$2);
         }

         return btq.a;
      }
   }

   static btq a(dhp $$0, jj $$1, cqi $$2, btp $$3, cxy $$4, dym $$5, awj $$6) {
      if (!$$0.C) {
         cxu $$7 = $$4.h();
         $$2.a($$3, cyb.a($$4, $$2, new cxy(cyc.rj)));
         $$2.a(awu.V);
         $$2.b(awu.c.b($$7));
         $$0.b($$1, $$5);
         $$0.a(null, $$1, $$6, awl.e, 1.0F, 1.0F);
         $$0.a(null, edm.z, $$1);
      }

      return btq.a;
   }

   private static btq a(dym $$0, dhp $$1, jj $$2, cqi $$3, btp $$4, cxy $$5) {
      return a($$1, $$2, $$3, $$4, $$5, dkw.fP.m().b(dpg.f, Integer.valueOf(3)), awk.dd);
   }

   private static btq b(dym $$0, dhp $$1, jj $$2, cqi $$3, btp $$4, cxy $$5) {
      return (btq)(a($$1, $$2) ? btq.c : a($$1, $$2, $$3, $$4, $$5, dkw.fQ.m(), awk.dg));
   }

   private static btq c(dym $$0, dhp $$1, jj $$2, cqi $$3, btp $$4, cxy $$5) {
      return (btq)(a($$1, $$2) ? btq.c : a($$1, $$2, $$3, $$4, $$5, dkw.fR.m().b(dpg.f, Integer.valueOf(3)), awk.dh));
   }

   private static btq d(dym $$0, dhp $$1, jj $$2, cqi $$3, btp $$4, cxy $$5) {
      dku $$6 = dku.a($$5.h());
      if (!($$6 instanceof drz)) {
         return btq.f;
      } else {
         if (!$$1.C) {
            cxy $$7 = $$5.a(dkw.lr, 1);
            $$3.a($$4, cyb.a($$5, $$3, $$7, false));
            $$3.a(awu.Z);
            dpg.e($$0, $$1, $$2);
         }

         return btq.a;
      }
   }

   private static btq e(dym $$0, dhp $$1, jj $$2, cqi $$3, btp $$4, cxy $$5) {
      dvb $$6 = $$5.a(kx.ak, dvb.a);
      if ($$6.b().isEmpty()) {
         return btq.f;
      } else {
         if (!$$1.C) {
            cxy $$7 = $$5.c(1);
            $$7.b(kx.ak, $$6.a());
            $$3.a($$4, cyb.a($$5, $$3, $$7, false));
            $$3.a(awu.Y);
            dpg.e($$0, $$1, $$2);
         }

         return btq.a;
      }
   }

   private static btq f(dym $$0, dhp $$1, jj $$2, cqi $$3, btp $$4, cxy $$5) {
      if (!$$5.a(axi.bO)) {
         return btq.f;
      } else if (!$$5.c(kx.K)) {
         return btq.f;
      } else {
         if (!$$1.C) {
            $$5.e(kx.K);
            $$3.a(awu.X);
            dpg.e($$0, $$1, $$2);
         }

         return btq.a;
      }
   }

   private static boolean a(dhp $$0, jj $$1) {
      eut $$2 = $$0.b_($$1.d());
      return $$2.a(axf.a);
   }

   public static record a(String a, Map<cxu, kp> b) {
   }
}
