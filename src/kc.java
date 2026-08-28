import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Map;
import java.util.function.Predicate;

public interface kc {
   Map<String, kc.a> a = new Object2ObjectArrayMap();
   Codec<kc.a> b = Codec.stringResolver(kc.a::a, a::get);
   kc.a c = a("empty");
   kc.a d = a("water");
   kc.a e = a("lava");
   kc.a f = a("powder_snow");

   static kc.a a(String $$0) {
      Object2ObjectOpenHashMap<czu, kc> $$1 = new Object2ObjectOpenHashMap();
      $$1.defaultReturnValue((kc)($$0x, $$1x, $$2x, $$3, $$4, $$5) -> bur.f);
      kc.a $$2 = new kc.a($$0, $$1);
      a.put($$0, $$2);
      return $$2;
   }

   bur interact(ebe var1, djx var2, iv var3, crx var4, buq var5, czy var6);

   static void a() {
      Map<czu, kc> $$0 = c.b();
      a($$0);
      $$0.put(dac.tt, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> {
         dbu $$6 = $$5.a(kk.R);
         if ($$6 != null && $$6.a(dbv.a)) {
            if (!$$1x.C) {
               czu $$7 = $$5.h();
               $$3x.a($$4, dab.a($$5, $$3x, new czy(dac.ts)));
               $$3x.a(awz.W);
               $$3x.b(awz.c.b($$7));
               $$1x.b($$2x, dne.fT.m());
               $$1x.a(null, $$2x, awp.cB, awq.e, 1.0F, 1.0F);
               $$1x.a(null, ege.z, $$2x);
            }

            return bur.a;
         } else {
            return bur.f;
         }
      });
      Map<czu, kc> $$1 = d.b();
      a($$1);
      $$1.put(dac.ro, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> a($$0x, $$1x, $$2x, $$3x, $$4, $$5, new czy(dac.rp), $$0xx -> $$0xx.c(drq.f) == 3, awp.dj));
      $$1.put(dac.ts, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> {
         if (!$$1x.C) {
            czu $$6 = $$5.h();
            $$3x.a($$4, dab.a($$5, $$3x, dbu.a(dac.tt, dbv.a)));
            $$3x.a(awz.W);
            $$3x.b(awz.c.b($$6));
            drq.d($$0x, $$1x, $$2x);
            $$1x.a(null, $$2x, awp.cC, awq.e, 1.0F, 1.0F);
            $$1x.a(null, ege.y, $$2x);
         }

         return bur.a;
      });
      $$1.put(dac.tt, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> {
         if ($$0x.c(drq.f) == 3) {
            return bur.f;
         } else {
            dbu $$6 = $$5.a(kk.R);
            if ($$6 != null && $$6.a(dbv.a)) {
               if (!$$1x.C) {
                  $$3x.a($$4, dab.a($$5, $$3x, new czy(dac.ts)));
                  $$3x.a(awz.W);
                  $$3x.b(awz.c.b($$5.h()));
                  $$1x.b($$2x, $$0x.a(drq.f));
                  $$1x.a(null, $$2x, awp.cB, awq.e, 1.0F, 1.0F);
                  $$1x.a(null, ege.z, $$2x);
               }

               return bur.a;
            } else {
               return bur.f;
            }
         }
      });
      $$1.put(dac.qp, kc::f);
      $$1.put(dac.qo, kc::f);
      $$1.put(dac.qn, kc::f);
      $$1.put(dac.qm, kc::f);
      $$1.put(dac.vU, kc::f);
      $$1.put(dac.pf, kc::f);
      $$1.put(dac.wa, kc::e);
      $$1.put(dac.wh, kc::e);
      $$1.put(dac.wp, kc::e);
      $$1.put(dac.wl, kc::e);
      $$1.put(dac.wm, kc::e);
      $$1.put(dac.wj, kc::e);
      $$1.put(dac.wn, kc::e);
      $$1.put(dac.wd, kc::e);
      $$1.put(dac.wi, kc::e);
      $$1.put(dac.wf, kc::e);
      $$1.put(dac.wc, kc::e);
      $$1.put(dac.wb, kc::e);
      $$1.put(dac.wg, kc::e);
      $$1.put(dac.wk, kc::e);
      $$1.put(dac.wo, kc::e);
      $$1.put(dac.we, kc::e);
      $$1.put(dac.jH, kc::d);
      $$1.put(dac.jO, kc::d);
      $$1.put(dac.jW, kc::d);
      $$1.put(dac.jS, kc::d);
      $$1.put(dac.jT, kc::d);
      $$1.put(dac.jQ, kc::d);
      $$1.put(dac.jU, kc::d);
      $$1.put(dac.jK, kc::d);
      $$1.put(dac.jP, kc::d);
      $$1.put(dac.jM, kc::d);
      $$1.put(dac.jJ, kc::d);
      $$1.put(dac.jI, kc::d);
      $$1.put(dac.jN, kc::d);
      $$1.put(dac.jR, kc::d);
      $$1.put(dac.jV, kc::d);
      $$1.put(dac.jL, kc::d);
      Map<czu, kc> $$2 = e.b();
      $$2.put(dac.ro, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> a($$0x, $$1x, $$2x, $$3x, $$4, $$5, new czy(dac.rq), $$0xx -> true, awp.dm));
      a($$2);
      Map<czu, kc> $$3 = f.b();
      $$3.put(dac.ro, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> a($$0x, $$1x, $$2x, $$3x, $$4, $$5, new czy(dac.rr), $$0xx -> $$0xx.c(drq.f) == 3, awp.dn));
      a($$3);
   }

   static void a(Map<czu, kc> $$0) {
      $$0.put(dac.rq, kc::b);
      $$0.put(dac.rp, kc::a);
      $$0.put(dac.rr, kc::c);
   }

   static bur a(ebe $$0, djx $$1, iv $$2, crx $$3, buq $$4, czy $$5, czy $$6, Predicate<ebe> $$7, awo $$8) {
      if (!$$7.test($$0)) {
         return bur.f;
      } else {
         if (!$$1.C) {
            czu $$9 = $$5.h();
            $$3.a($$4, dab.a($$5, $$3, $$6));
            $$3.a(awz.W);
            $$3.b(awz.c.b($$9));
            $$1.b($$2, dne.fS.m());
            $$1.a(null, $$2, $$8, awq.e, 1.0F, 1.0F);
            $$1.a(null, ege.y, $$2);
         }

         return bur.a;
      }
   }

   static bur a(djx $$0, iv $$1, crx $$2, buq $$3, czy $$4, ebe $$5, awo $$6) {
      if (!$$0.C) {
         czu $$7 = $$4.h();
         $$2.a($$3, dab.a($$4, $$2, new czy(dac.ro)));
         $$2.a(awz.V);
         $$2.b(awz.c.b($$7));
         $$0.b($$1, $$5);
         $$0.a(null, $$1, $$6, awq.e, 1.0F, 1.0F);
         $$0.a(null, ege.z, $$1);
      }

      return bur.a;
   }

   private static bur a(ebe $$0, djx $$1, iv $$2, crx $$3, buq $$4, czy $$5) {
      return a($$1, $$2, $$3, $$4, $$5, dne.fT.m().b(drq.f, Integer.valueOf(3)), awp.dd);
   }

   private static bur b(ebe $$0, djx $$1, iv $$2, crx $$3, buq $$4, czy $$5) {
      return (bur)(a($$1, $$2) ? bur.c : a($$1, $$2, $$3, $$4, $$5, dne.fU.m(), awp.dg));
   }

   private static bur c(ebe $$0, djx $$1, iv $$2, crx $$3, buq $$4, czy $$5) {
      return (bur)(a($$1, $$2) ? bur.c : a($$1, $$2, $$3, $$4, $$5, dne.fV.m().b(drq.f, Integer.valueOf(3)), awp.dh));
   }

   private static bur d(ebe $$0, djx $$1, iv $$2, crx $$3, buq $$4, czy $$5) {
      dnc $$6 = dnc.a($$5.h());
      if (!($$6 instanceof dul)) {
         return bur.f;
      } else {
         if (!$$1.C) {
            czy $$7 = $$5.a(dne.lv, 1);
            $$3.a($$4, dab.a($$5, $$3, $$7, false));
            $$3.a(awz.Z);
            drq.d($$0, $$1, $$2);
         }

         return bur.a;
      }
   }

   private static bur e(ebe $$0, djx $$1, iv $$2, crx $$3, buq $$4, czy $$5) {
      dxs $$6 = $$5.a(kk.am, dxs.a);
      if ($$6.b().isEmpty()) {
         return bur.f;
      } else {
         if (!$$1.C) {
            czy $$7 = $$5.c(1);
            $$7.b(kk.am, $$6.a());
            $$3.a($$4, dab.a($$5, $$3, $$7, false));
            $$3.a(awz.Y);
            drq.d($$0, $$1, $$2);
         }

         return bur.a;
      }
   }

   private static bur f(ebe $$0, djx $$1, iv $$2, crx $$3, buq $$4, czy $$5) {
      if (!$$5.a(axm.bP)) {
         return bur.f;
      } else if (!$$5.c(kk.K)) {
         return bur.f;
      } else {
         if (!$$1.C) {
            $$5.e(kk.K);
            $$3.a(awz.X);
            drq.d($$0, $$1, $$2);
         }

         return bur.a;
      }
   }

   private static boolean a(djx $$0, iv $$1) {
      exo $$2 = $$0.b_($$1.d());
      return $$2.a(axj.a);
   }

   public static record a(String a, Map<czu, kc> b) {
   }
}
