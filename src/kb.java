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
      Object2ObjectOpenHashMap<cyz, kb> $$1 = new Object2ObjectOpenHashMap();
      $$1.defaultReturnValue((kb)($$0x, $$1x, $$2x, $$3, $$4, $$5) -> bud.f);
      kb.a $$2 = new kb.a($$0, $$1);
      a.put($$0, $$2);
      return $$2;
   }

   bud interact(eah var1, dja var2, iu var3, crc var4, buc var5, czd var6);

   static void a() {
      Map<cyz, kb> $$0 = c.b();
      a($$0);
      $$0.put(czh.tt, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> {
         daz $$6 = $$5.a(kj.R);
         if ($$6 != null && $$6.a(dba.a)) {
            if (!$$1x.C) {
               cyz $$7 = $$5.h();
               $$3x.a($$4, czg.a($$5, $$3x, new czd(czh.ts)));
               $$3x.a(awx.W);
               $$3x.b(awx.c.b($$7));
               $$1x.b($$2x, dmh.fT.m());
               $$1x.a(null, $$2x, awn.cB, awo.e, 1.0F, 1.0F);
               $$1x.a(null, efh.z, $$2x);
            }

            return bud.a;
         } else {
            return bud.f;
         }
      });
      Map<cyz, kb> $$1 = d.b();
      a($$1);
      $$1.put(czh.ro, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> a($$0x, $$1x, $$2x, $$3x, $$4, $$5, new czd(czh.rp), $$0xx -> $$0xx.c(dqt.f) == 3, awn.dj));
      $$1.put(czh.ts, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> {
         if (!$$1x.C) {
            cyz $$6 = $$5.h();
            $$3x.a($$4, czg.a($$5, $$3x, daz.a(czh.tt, dba.a)));
            $$3x.a(awx.W);
            $$3x.b(awx.c.b($$6));
            dqt.d($$0x, $$1x, $$2x);
            $$1x.a(null, $$2x, awn.cC, awo.e, 1.0F, 1.0F);
            $$1x.a(null, efh.y, $$2x);
         }

         return bud.a;
      });
      $$1.put(czh.tt, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> {
         if ($$0x.c(dqt.f) == 3) {
            return bud.f;
         } else {
            daz $$6 = $$5.a(kj.R);
            if ($$6 != null && $$6.a(dba.a)) {
               if (!$$1x.C) {
                  $$3x.a($$4, czg.a($$5, $$3x, new czd(czh.ts)));
                  $$3x.a(awx.W);
                  $$3x.b(awx.c.b($$5.h()));
                  $$1x.b($$2x, $$0x.a(dqt.f));
                  $$1x.a(null, $$2x, awn.cB, awo.e, 1.0F, 1.0F);
                  $$1x.a(null, efh.z, $$2x);
               }

               return bud.a;
            } else {
               return bud.f;
            }
         }
      });
      $$1.put(czh.qp, kb::f);
      $$1.put(czh.qo, kb::f);
      $$1.put(czh.qn, kb::f);
      $$1.put(czh.qm, kb::f);
      $$1.put(czh.vU, kb::f);
      $$1.put(czh.pf, kb::f);
      $$1.put(czh.wa, kb::e);
      $$1.put(czh.wh, kb::e);
      $$1.put(czh.wp, kb::e);
      $$1.put(czh.wl, kb::e);
      $$1.put(czh.wm, kb::e);
      $$1.put(czh.wj, kb::e);
      $$1.put(czh.wn, kb::e);
      $$1.put(czh.wd, kb::e);
      $$1.put(czh.wi, kb::e);
      $$1.put(czh.wf, kb::e);
      $$1.put(czh.wc, kb::e);
      $$1.put(czh.wb, kb::e);
      $$1.put(czh.wg, kb::e);
      $$1.put(czh.wk, kb::e);
      $$1.put(czh.wo, kb::e);
      $$1.put(czh.we, kb::e);
      $$1.put(czh.jH, kb::d);
      $$1.put(czh.jO, kb::d);
      $$1.put(czh.jW, kb::d);
      $$1.put(czh.jS, kb::d);
      $$1.put(czh.jT, kb::d);
      $$1.put(czh.jQ, kb::d);
      $$1.put(czh.jU, kb::d);
      $$1.put(czh.jK, kb::d);
      $$1.put(czh.jP, kb::d);
      $$1.put(czh.jM, kb::d);
      $$1.put(czh.jJ, kb::d);
      $$1.put(czh.jI, kb::d);
      $$1.put(czh.jN, kb::d);
      $$1.put(czh.jR, kb::d);
      $$1.put(czh.jV, kb::d);
      $$1.put(czh.jL, kb::d);
      Map<cyz, kb> $$2 = e.b();
      $$2.put(czh.ro, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> a($$0x, $$1x, $$2x, $$3x, $$4, $$5, new czd(czh.rq), $$0xx -> true, awn.dm));
      a($$2);
      Map<cyz, kb> $$3 = f.b();
      $$3.put(czh.ro, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> a($$0x, $$1x, $$2x, $$3x, $$4, $$5, new czd(czh.rr), $$0xx -> $$0xx.c(dqt.f) == 3, awn.dn));
      a($$3);
   }

   static void a(Map<cyz, kb> $$0) {
      $$0.put(czh.rq, kb::b);
      $$0.put(czh.rp, kb::a);
      $$0.put(czh.rr, kb::c);
   }

   static bud a(eah $$0, dja $$1, iu $$2, crc $$3, buc $$4, czd $$5, czd $$6, Predicate<eah> $$7, awm $$8) {
      if (!$$7.test($$0)) {
         return bud.f;
      } else {
         if (!$$1.C) {
            cyz $$9 = $$5.h();
            $$3.a($$4, czg.a($$5, $$3, $$6));
            $$3.a(awx.W);
            $$3.b(awx.c.b($$9));
            $$1.b($$2, dmh.fS.m());
            $$1.a(null, $$2, $$8, awo.e, 1.0F, 1.0F);
            $$1.a(null, efh.y, $$2);
         }

         return bud.a;
      }
   }

   static bud a(dja $$0, iu $$1, crc $$2, buc $$3, czd $$4, eah $$5, awm $$6) {
      if (!$$0.C) {
         cyz $$7 = $$4.h();
         $$2.a($$3, czg.a($$4, $$2, new czd(czh.ro)));
         $$2.a(awx.V);
         $$2.b(awx.c.b($$7));
         $$0.b($$1, $$5);
         $$0.a(null, $$1, $$6, awo.e, 1.0F, 1.0F);
         $$0.a(null, efh.z, $$1);
      }

      return bud.a;
   }

   private static bud a(eah $$0, dja $$1, iu $$2, crc $$3, buc $$4, czd $$5) {
      return a($$1, $$2, $$3, $$4, $$5, dmh.fT.m().b(dqt.f, Integer.valueOf(3)), awn.dd);
   }

   private static bud b(eah $$0, dja $$1, iu $$2, crc $$3, buc $$4, czd $$5) {
      return (bud)(a($$1, $$2) ? bud.c : a($$1, $$2, $$3, $$4, $$5, dmh.fU.m(), awn.dg));
   }

   private static bud c(eah $$0, dja $$1, iu $$2, crc $$3, buc $$4, czd $$5) {
      return (bud)(a($$1, $$2) ? bud.c : a($$1, $$2, $$3, $$4, $$5, dmh.fV.m().b(dqt.f, Integer.valueOf(3)), awn.dh));
   }

   private static bud d(eah $$0, dja $$1, iu $$2, crc $$3, buc $$4, czd $$5) {
      dmf $$6 = dmf.a($$5.h());
      if (!($$6 instanceof dto)) {
         return bud.f;
      } else {
         if (!$$1.C) {
            czd $$7 = $$5.a(dmh.lv, 1);
            $$3.a($$4, czg.a($$5, $$3, $$7, false));
            $$3.a(awx.Z);
            dqt.d($$0, $$1, $$2);
         }

         return bud.a;
      }
   }

   private static bud e(eah $$0, dja $$1, iu $$2, crc $$3, buc $$4, czd $$5) {
      dwv $$6 = $$5.a(kj.am, dwv.a);
      if ($$6.b().isEmpty()) {
         return bud.f;
      } else {
         if (!$$1.C) {
            czd $$7 = $$5.c(1);
            $$7.b(kj.am, $$6.a());
            $$3.a($$4, czg.a($$5, $$3, $$7, false));
            $$3.a(awx.Y);
            dqt.d($$0, $$1, $$2);
         }

         return bud.a;
      }
   }

   private static bud f(eah $$0, dja $$1, iu $$2, crc $$3, buc $$4, czd $$5) {
      if (!$$5.a(axk.bP)) {
         return bud.f;
      } else if (!$$5.c(kj.K)) {
         return bud.f;
      } else {
         if (!$$1.C) {
            $$5.e(kj.K);
            $$3.a(awx.X);
            dqt.d($$0, $$1, $$2);
         }

         return bud.a;
      }
   }

   private static boolean a(dja $$0, iu $$1) {
      ewo $$2 = $$0.b_($$1.d());
      return $$2.a(axh.a);
   }

   public static record a(String a, Map<cyz, kb> b) {
   }
}
