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
      Object2ObjectOpenHashMap<cyu, kb> $$1 = new Object2ObjectOpenHashMap();
      $$1.defaultReturnValue((kb)($$0x, $$1x, $$2x, $$3, $$4, $$5) -> bub.f);
      kb.a $$2 = new kb.a($$0, $$1);
      a.put($$0, $$2);
      return $$2;
   }

   bub interact(dzz var1, div var2, iu var3, cqy var4, bua var5, cyy var6);

   static void a() {
      Map<cyu, kb> $$0 = c.b();
      a($$0);
      $$0.put(czc.to, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> {
         dau $$6 = $$5.a(kj.R);
         if ($$6 != null && $$6.a(dav.a)) {
            if (!$$1x.C) {
               cyu $$7 = $$5.h();
               $$3x.a($$4, czb.a($$5, $$3x, new cyy(czc.tn)));
               $$3x.a(awx.W);
               $$3x.b(awx.c.b($$7));
               $$1x.b($$2x, dmc.fQ.m());
               $$1x.a(null, $$2x, awn.cB, awo.e, 1.0F, 1.0F);
               $$1x.a(null, eez.z, $$2x);
            }

            return bub.a;
         } else {
            return bub.f;
         }
      });
      Map<cyu, kb> $$1 = d.b();
      a($$1);
      $$1.put(czc.rl, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> a($$0x, $$1x, $$2x, $$3x, $$4, $$5, new cyy(czc.rm), $$0xx -> $$0xx.c(dqn.f) == 3, awn.dj));
      $$1.put(czc.tn, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> {
         if (!$$1x.C) {
            cyu $$6 = $$5.h();
            $$3x.a($$4, czb.a($$5, $$3x, dau.a(czc.to, dav.a)));
            $$3x.a(awx.W);
            $$3x.b(awx.c.b($$6));
            dqn.d($$0x, $$1x, $$2x);
            $$1x.a(null, $$2x, awn.cC, awo.e, 1.0F, 1.0F);
            $$1x.a(null, eez.y, $$2x);
         }

         return bub.a;
      });
      $$1.put(czc.to, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> {
         if ($$0x.c(dqn.f) == 3) {
            return bub.f;
         } else {
            dau $$6 = $$5.a(kj.R);
            if ($$6 != null && $$6.a(dav.a)) {
               if (!$$1x.C) {
                  $$3x.a($$4, czb.a($$5, $$3x, new cyy(czc.tn)));
                  $$3x.a(awx.W);
                  $$3x.b(awx.c.b($$5.h()));
                  $$1x.b($$2x, $$0x.a(dqn.f));
                  $$1x.a(null, $$2x, awn.cB, awo.e, 1.0F, 1.0F);
                  $$1x.a(null, eez.z, $$2x);
               }

               return bub.a;
            } else {
               return bub.f;
            }
         }
      });
      $$1.put(czc.qm, kb::f);
      $$1.put(czc.ql, kb::f);
      $$1.put(czc.qk, kb::f);
      $$1.put(czc.qj, kb::f);
      $$1.put(czc.vP, kb::f);
      $$1.put(czc.pc, kb::f);
      $$1.put(czc.vV, kb::e);
      $$1.put(czc.wc, kb::e);
      $$1.put(czc.wk, kb::e);
      $$1.put(czc.wg, kb::e);
      $$1.put(czc.wh, kb::e);
      $$1.put(czc.we, kb::e);
      $$1.put(czc.wi, kb::e);
      $$1.put(czc.vY, kb::e);
      $$1.put(czc.wd, kb::e);
      $$1.put(czc.wa, kb::e);
      $$1.put(czc.vX, kb::e);
      $$1.put(czc.vW, kb::e);
      $$1.put(czc.wb, kb::e);
      $$1.put(czc.wf, kb::e);
      $$1.put(czc.wj, kb::e);
      $$1.put(czc.vZ, kb::e);
      $$1.put(czc.jE, kb::d);
      $$1.put(czc.jL, kb::d);
      $$1.put(czc.jT, kb::d);
      $$1.put(czc.jP, kb::d);
      $$1.put(czc.jQ, kb::d);
      $$1.put(czc.jN, kb::d);
      $$1.put(czc.jR, kb::d);
      $$1.put(czc.jH, kb::d);
      $$1.put(czc.jM, kb::d);
      $$1.put(czc.jJ, kb::d);
      $$1.put(czc.jG, kb::d);
      $$1.put(czc.jF, kb::d);
      $$1.put(czc.jK, kb::d);
      $$1.put(czc.jO, kb::d);
      $$1.put(czc.jS, kb::d);
      $$1.put(czc.jI, kb::d);
      Map<cyu, kb> $$2 = e.b();
      $$2.put(czc.rl, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> a($$0x, $$1x, $$2x, $$3x, $$4, $$5, new cyy(czc.rn), $$0xx -> true, awn.dm));
      a($$2);
      Map<cyu, kb> $$3 = f.b();
      $$3.put(czc.rl, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> a($$0x, $$1x, $$2x, $$3x, $$4, $$5, new cyy(czc.ro), $$0xx -> $$0xx.c(dqn.f) == 3, awn.dn));
      a($$3);
   }

   static void a(Map<cyu, kb> $$0) {
      $$0.put(czc.rn, kb::b);
      $$0.put(czc.rm, kb::a);
      $$0.put(czc.ro, kb::c);
   }

   static bub a(dzz $$0, div $$1, iu $$2, cqy $$3, bua $$4, cyy $$5, cyy $$6, Predicate<dzz> $$7, awm $$8) {
      if (!$$7.test($$0)) {
         return bub.f;
      } else {
         if (!$$1.C) {
            cyu $$9 = $$5.h();
            $$3.a($$4, czb.a($$5, $$3, $$6));
            $$3.a(awx.W);
            $$3.b(awx.c.b($$9));
            $$1.b($$2, dmc.fP.m());
            $$1.a(null, $$2, $$8, awo.e, 1.0F, 1.0F);
            $$1.a(null, eez.y, $$2);
         }

         return bub.a;
      }
   }

   static bub a(div $$0, iu $$1, cqy $$2, bua $$3, cyy $$4, dzz $$5, awm $$6) {
      if (!$$0.C) {
         cyu $$7 = $$4.h();
         $$2.a($$3, czb.a($$4, $$2, new cyy(czc.rl)));
         $$2.a(awx.V);
         $$2.b(awx.c.b($$7));
         $$0.b($$1, $$5);
         $$0.a(null, $$1, $$6, awo.e, 1.0F, 1.0F);
         $$0.a(null, eez.z, $$1);
      }

      return bub.a;
   }

   private static bub a(dzz $$0, div $$1, iu $$2, cqy $$3, bua $$4, cyy $$5) {
      return a($$1, $$2, $$3, $$4, $$5, dmc.fQ.m().b(dqn.f, Integer.valueOf(3)), awn.dd);
   }

   private static bub b(dzz $$0, div $$1, iu $$2, cqy $$3, bua $$4, cyy $$5) {
      return (bub)(a($$1, $$2) ? bub.c : a($$1, $$2, $$3, $$4, $$5, dmc.fR.m(), awn.dg));
   }

   private static bub c(dzz $$0, div $$1, iu $$2, cqy $$3, bua $$4, cyy $$5) {
      return (bub)(a($$1, $$2) ? bub.c : a($$1, $$2, $$3, $$4, $$5, dmc.fS.m().b(dqn.f, Integer.valueOf(3)), awn.dh));
   }

   private static bub d(dzz $$0, div $$1, iu $$2, cqy $$3, bua $$4, cyy $$5) {
      dma $$6 = dma.a($$5.h());
      if (!($$6 instanceof dth)) {
         return bub.f;
      } else {
         if (!$$1.C) {
            cyy $$7 = $$5.a(dmc.ls, 1);
            $$3.a($$4, czb.a($$5, $$3, $$7, false));
            $$3.a(awx.Z);
            dqn.d($$0, $$1, $$2);
         }

         return bub.a;
      }
   }

   private static bub e(dzz $$0, div $$1, iu $$2, cqy $$3, bua $$4, cyy $$5) {
      dwn $$6 = $$5.a(kj.am, dwn.a);
      if ($$6.b().isEmpty()) {
         return bub.f;
      } else {
         if (!$$1.C) {
            cyy $$7 = $$5.c(1);
            $$7.b(kj.am, $$6.a());
            $$3.a($$4, czb.a($$5, $$3, $$7, false));
            $$3.a(awx.Y);
            dqn.d($$0, $$1, $$2);
         }

         return bub.a;
      }
   }

   private static bub f(dzz $$0, div $$1, iu $$2, cqy $$3, bua $$4, cyy $$5) {
      if (!$$5.a(axk.bO)) {
         return bub.f;
      } else if (!$$5.c(kj.K)) {
         return bub.f;
      } else {
         if (!$$1.C) {
            $$5.e(kj.K);
            $$3.a(awx.X);
            dqn.d($$0, $$1, $$2);
         }

         return bub.a;
      }
   }

   private static boolean a(div $$0, iu $$1) {
      ewg $$2 = $$0.b_($$1.d());
      return $$2.a(axh.a);
   }

   public static record a(String a, Map<cyu, kb> b) {
   }
}
