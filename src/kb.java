import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Map;
import java.util.function.Predicate;

public interface kb {
   Map<String, kb.a> a = new Object2ObjectArrayMap();
   Codec<kb.a> b = Codec.stringResolver(kb.a::a, a::get);
   kb.a c = a("empty");
   kb.a d = a("water");
   kb.a e = a("lava");
   kb.a f = a("powder_snow");

   static kb.a a(String $$0) {
      Object2ObjectOpenHashMap<cyo, kb> $$1 = new Object2ObjectOpenHashMap();
      $$1.defaultReturnValue((kb)($$0x, $$1x, $$2x, $$3, $$4, $$5) -> bty.f);
      kb.a $$2 = new kb.a($$0, $$1);
      a.put($$0, $$2);
      return $$2;
   }

   bty interact(dzo var1, dip var2, iu var3, cqs var4, btx var5, cys var6);

   static void a() {
      Map<cyo, kb> $$0 = c.b();
      a($$0);
      $$0.put(cyw.tm, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> {
         dao $$6 = $$5.a(kj.R);
         if ($$6 != null && $$6.a(dap.a)) {
            if (!$$1x.C) {
               cyo $$7 = $$5.h();
               $$3x.a($$4, cyv.a($$5, $$3x, new cys(cyw.tl)));
               $$3x.a(awv.W);
               $$3x.b(awv.c.b($$7));
               $$1x.b($$2x, dlw.fP.m());
               $$1x.a(null, $$2x, awl.cB, awm.e, 1.0F, 1.0F);
               $$1x.a(null, eeo.z, $$2x);
            }

            return bty.a;
         } else {
            return bty.f;
         }
      });
      Map<cyo, kb> $$1 = d.b();
      a($$1);
      $$1.put(cyw.rj, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> a($$0x, $$1x, $$2x, $$3x, $$4, $$5, new cys(cyw.rk), $$0xx -> $$0xx.c(dqg.f) == 3, awl.dj));
      $$1.put(cyw.tl, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> {
         if (!$$1x.C) {
            cyo $$6 = $$5.h();
            $$3x.a($$4, cyv.a($$5, $$3x, dao.a(cyw.tm, dap.a)));
            $$3x.a(awv.W);
            $$3x.b(awv.c.b($$6));
            dqg.d($$0x, $$1x, $$2x);
            $$1x.a(null, $$2x, awl.cC, awm.e, 1.0F, 1.0F);
            $$1x.a(null, eeo.y, $$2x);
         }

         return bty.a;
      });
      $$1.put(cyw.tm, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> {
         if ($$0x.c(dqg.f) == 3) {
            return bty.f;
         } else {
            dao $$6 = $$5.a(kj.R);
            if ($$6 != null && $$6.a(dap.a)) {
               if (!$$1x.C) {
                  $$3x.a($$4, cyv.a($$5, $$3x, new cys(cyw.tl)));
                  $$3x.a(awv.W);
                  $$3x.b(awv.c.b($$5.h()));
                  $$1x.b($$2x, $$0x.a(dqg.f));
                  $$1x.a(null, $$2x, awl.cB, awm.e, 1.0F, 1.0F);
                  $$1x.a(null, eeo.z, $$2x);
               }

               return bty.a;
            } else {
               return bty.f;
            }
         }
      });
      $$1.put(cyw.qk, kb::f);
      $$1.put(cyw.qj, kb::f);
      $$1.put(cyw.qi, kb::f);
      $$1.put(cyw.qh, kb::f);
      $$1.put(cyw.vN, kb::f);
      $$1.put(cyw.pa, kb::f);
      $$1.put(cyw.vT, kb::e);
      $$1.put(cyw.wa, kb::e);
      $$1.put(cyw.wi, kb::e);
      $$1.put(cyw.we, kb::e);
      $$1.put(cyw.wf, kb::e);
      $$1.put(cyw.wc, kb::e);
      $$1.put(cyw.wg, kb::e);
      $$1.put(cyw.vW, kb::e);
      $$1.put(cyw.wb, kb::e);
      $$1.put(cyw.vY, kb::e);
      $$1.put(cyw.vV, kb::e);
      $$1.put(cyw.vU, kb::e);
      $$1.put(cyw.vZ, kb::e);
      $$1.put(cyw.wd, kb::e);
      $$1.put(cyw.wh, kb::e);
      $$1.put(cyw.vX, kb::e);
      $$1.put(cyw.jC, kb::d);
      $$1.put(cyw.jJ, kb::d);
      $$1.put(cyw.jR, kb::d);
      $$1.put(cyw.jN, kb::d);
      $$1.put(cyw.jO, kb::d);
      $$1.put(cyw.jL, kb::d);
      $$1.put(cyw.jP, kb::d);
      $$1.put(cyw.jF, kb::d);
      $$1.put(cyw.jK, kb::d);
      $$1.put(cyw.jH, kb::d);
      $$1.put(cyw.jE, kb::d);
      $$1.put(cyw.jD, kb::d);
      $$1.put(cyw.jI, kb::d);
      $$1.put(cyw.jM, kb::d);
      $$1.put(cyw.jQ, kb::d);
      $$1.put(cyw.jG, kb::d);
      Map<cyo, kb> $$2 = e.b();
      $$2.put(cyw.rj, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> a($$0x, $$1x, $$2x, $$3x, $$4, $$5, new cys(cyw.rl), $$0xx -> true, awl.dm));
      a($$2);
      Map<cyo, kb> $$3 = f.b();
      $$3.put(cyw.rj, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> a($$0x, $$1x, $$2x, $$3x, $$4, $$5, new cys(cyw.rm), $$0xx -> $$0xx.c(dqg.f) == 3, awl.dn));
      a($$3);
   }

   static void a(Map<cyo, kb> $$0) {
      $$0.put(cyw.rl, kb::b);
      $$0.put(cyw.rk, kb::a);
      $$0.put(cyw.rm, kb::c);
   }

   static bty a(dzo $$0, dip $$1, iu $$2, cqs $$3, btx $$4, cys $$5, cys $$6, Predicate<dzo> $$7, awk $$8) {
      if (!$$7.test($$0)) {
         return bty.f;
      } else {
         if (!$$1.C) {
            cyo $$9 = $$5.h();
            $$3.a($$4, cyv.a($$5, $$3, $$6));
            $$3.a(awv.W);
            $$3.b(awv.c.b($$9));
            $$1.b($$2, dlw.fO.m());
            $$1.a(null, $$2, $$8, awm.e, 1.0F, 1.0F);
            $$1.a(null, eeo.y, $$2);
         }

         return bty.a;
      }
   }

   static bty a(dip $$0, iu $$1, cqs $$2, btx $$3, cys $$4, dzo $$5, awk $$6) {
      if (!$$0.C) {
         cyo $$7 = $$4.h();
         $$2.a($$3, cyv.a($$4, $$2, new cys(cyw.rj)));
         $$2.a(awv.V);
         $$2.b(awv.c.b($$7));
         $$0.b($$1, $$5);
         $$0.a(null, $$1, $$6, awm.e, 1.0F, 1.0F);
         $$0.a(null, eeo.z, $$1);
      }

      return bty.a;
   }

   private static bty a(dzo $$0, dip $$1, iu $$2, cqs $$3, btx $$4, cys $$5) {
      return a($$1, $$2, $$3, $$4, $$5, dlw.fP.m().b(dqg.f, Integer.valueOf(3)), awl.dd);
   }

   private static bty b(dzo $$0, dip $$1, iu $$2, cqs $$3, btx $$4, cys $$5) {
      return (bty)(a($$1, $$2) ? bty.c : a($$1, $$2, $$3, $$4, $$5, dlw.fQ.m(), awl.dg));
   }

   private static bty c(dzo $$0, dip $$1, iu $$2, cqs $$3, btx $$4, cys $$5) {
      return (bty)(a($$1, $$2) ? bty.c : a($$1, $$2, $$3, $$4, $$5, dlw.fR.m().b(dqg.f, Integer.valueOf(3)), awl.dh));
   }

   private static bty d(dzo $$0, dip $$1, iu $$2, cqs $$3, btx $$4, cys $$5) {
      dlu $$6 = dlu.a($$5.h());
      if (!($$6 instanceof dsz)) {
         return bty.f;
      } else {
         if (!$$1.C) {
            cys $$7 = $$5.a(dlw.lr, 1);
            $$3.a($$4, cyv.a($$5, $$3, $$7, false));
            $$3.a(awv.Z);
            dqg.d($$0, $$1, $$2);
         }

         return bty.a;
      }
   }

   private static bty e(dzo $$0, dip $$1, iu $$2, cqs $$3, btx $$4, cys $$5) {
      dwd $$6 = $$5.a(kj.am, dwd.a);
      if ($$6.b().isEmpty()) {
         return bty.f;
      } else {
         if (!$$1.C) {
            cys $$7 = $$5.c(1);
            $$7.b(kj.am, $$6.a());
            $$3.a($$4, cyv.a($$5, $$3, $$7, false));
            $$3.a(awv.Y);
            dqg.d($$0, $$1, $$2);
         }

         return bty.a;
      }
   }

   private static bty f(dzo $$0, dip $$1, iu $$2, cqs $$3, btx $$4, cys $$5) {
      if (!$$5.a(axi.bO)) {
         return bty.f;
      } else if (!$$5.c(kj.K)) {
         return bty.f;
      } else {
         if (!$$1.C) {
            $$5.e(kj.K);
            $$3.a(awv.X);
            dqg.d($$0, $$1, $$2);
         }

         return bty.a;
      }
   }

   private static boolean a(dip $$0, iu $$1) {
      evv $$2 = $$0.b_($$1.d());
      return $$2.a(axf.a);
   }

   public static record a(String a, Map<cyo, kb> b) {
   }
}
