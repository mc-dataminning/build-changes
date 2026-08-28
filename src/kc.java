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
      Object2ObjectOpenHashMap<czj, kc> $$1 = new Object2ObjectOpenHashMap();
      $$1.defaultReturnValue((kc)($$0x, $$1x, $$2x, $$3, $$4, $$5) -> bug.f);
      kc.a $$2 = new kc.a($$0, $$1);
      a.put($$0, $$2);
      return $$2;
   }

   bug interact(eat var1, djm var2, iv var3, crm var4, buf var5, czn var6);

   static void a() {
      Map<czj, kc> $$0 = c.b();
      a($$0);
      $$0.put(czr.tt, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> {
         dbj $$6 = $$5.a(kk.R);
         if ($$6 != null && $$6.a(dbk.a)) {
            if (!$$1x.C) {
               czj $$7 = $$5.h();
               $$3x.a($$4, czq.a($$5, $$3x, new czn(czr.ts)));
               $$3x.a(awx.W);
               $$3x.b(awx.c.b($$7));
               $$1x.b($$2x, dmt.fT.m());
               $$1x.a(null, $$2x, awn.cB, awo.e, 1.0F, 1.0F);
               $$1x.a(null, eft.z, $$2x);
            }

            return bug.a;
         } else {
            return bug.f;
         }
      });
      Map<czj, kc> $$1 = d.b();
      a($$1);
      $$1.put(czr.ro, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> a($$0x, $$1x, $$2x, $$3x, $$4, $$5, new czn(czr.rp), $$0xx -> $$0xx.c(drf.f) == 3, awn.dj));
      $$1.put(czr.ts, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> {
         if (!$$1x.C) {
            czj $$6 = $$5.h();
            $$3x.a($$4, czq.a($$5, $$3x, dbj.a(czr.tt, dbk.a)));
            $$3x.a(awx.W);
            $$3x.b(awx.c.b($$6));
            drf.d($$0x, $$1x, $$2x);
            $$1x.a(null, $$2x, awn.cC, awo.e, 1.0F, 1.0F);
            $$1x.a(null, eft.y, $$2x);
         }

         return bug.a;
      });
      $$1.put(czr.tt, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> {
         if ($$0x.c(drf.f) == 3) {
            return bug.f;
         } else {
            dbj $$6 = $$5.a(kk.R);
            if ($$6 != null && $$6.a(dbk.a)) {
               if (!$$1x.C) {
                  $$3x.a($$4, czq.a($$5, $$3x, new czn(czr.ts)));
                  $$3x.a(awx.W);
                  $$3x.b(awx.c.b($$5.h()));
                  $$1x.b($$2x, $$0x.a(drf.f));
                  $$1x.a(null, $$2x, awn.cB, awo.e, 1.0F, 1.0F);
                  $$1x.a(null, eft.z, $$2x);
               }

               return bug.a;
            } else {
               return bug.f;
            }
         }
      });
      $$1.put(czr.qp, kc::f);
      $$1.put(czr.qo, kc::f);
      $$1.put(czr.qn, kc::f);
      $$1.put(czr.qm, kc::f);
      $$1.put(czr.vU, kc::f);
      $$1.put(czr.pf, kc::f);
      $$1.put(czr.wa, kc::e);
      $$1.put(czr.wh, kc::e);
      $$1.put(czr.wp, kc::e);
      $$1.put(czr.wl, kc::e);
      $$1.put(czr.wm, kc::e);
      $$1.put(czr.wj, kc::e);
      $$1.put(czr.wn, kc::e);
      $$1.put(czr.wd, kc::e);
      $$1.put(czr.wi, kc::e);
      $$1.put(czr.wf, kc::e);
      $$1.put(czr.wc, kc::e);
      $$1.put(czr.wb, kc::e);
      $$1.put(czr.wg, kc::e);
      $$1.put(czr.wk, kc::e);
      $$1.put(czr.wo, kc::e);
      $$1.put(czr.we, kc::e);
      $$1.put(czr.jH, kc::d);
      $$1.put(czr.jO, kc::d);
      $$1.put(czr.jW, kc::d);
      $$1.put(czr.jS, kc::d);
      $$1.put(czr.jT, kc::d);
      $$1.put(czr.jQ, kc::d);
      $$1.put(czr.jU, kc::d);
      $$1.put(czr.jK, kc::d);
      $$1.put(czr.jP, kc::d);
      $$1.put(czr.jM, kc::d);
      $$1.put(czr.jJ, kc::d);
      $$1.put(czr.jI, kc::d);
      $$1.put(czr.jN, kc::d);
      $$1.put(czr.jR, kc::d);
      $$1.put(czr.jV, kc::d);
      $$1.put(czr.jL, kc::d);
      Map<czj, kc> $$2 = e.b();
      $$2.put(czr.ro, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> a($$0x, $$1x, $$2x, $$3x, $$4, $$5, new czn(czr.rq), $$0xx -> true, awn.dm));
      a($$2);
      Map<czj, kc> $$3 = f.b();
      $$3.put(czr.ro, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> a($$0x, $$1x, $$2x, $$3x, $$4, $$5, new czn(czr.rr), $$0xx -> $$0xx.c(drf.f) == 3, awn.dn));
      a($$3);
   }

   static void a(Map<czj, kc> $$0) {
      $$0.put(czr.rq, kc::b);
      $$0.put(czr.rp, kc::a);
      $$0.put(czr.rr, kc::c);
   }

   static bug a(eat $$0, djm $$1, iv $$2, crm $$3, buf $$4, czn $$5, czn $$6, Predicate<eat> $$7, awm $$8) {
      if (!$$7.test($$0)) {
         return bug.f;
      } else {
         if (!$$1.C) {
            czj $$9 = $$5.h();
            $$3.a($$4, czq.a($$5, $$3, $$6));
            $$3.a(awx.W);
            $$3.b(awx.c.b($$9));
            $$1.b($$2, dmt.fS.m());
            $$1.a(null, $$2, $$8, awo.e, 1.0F, 1.0F);
            $$1.a(null, eft.y, $$2);
         }

         return bug.a;
      }
   }

   static bug a(djm $$0, iv $$1, crm $$2, buf $$3, czn $$4, eat $$5, awm $$6) {
      if (!$$0.C) {
         czj $$7 = $$4.h();
         $$2.a($$3, czq.a($$4, $$2, new czn(czr.ro)));
         $$2.a(awx.V);
         $$2.b(awx.c.b($$7));
         $$0.b($$1, $$5);
         $$0.a(null, $$1, $$6, awo.e, 1.0F, 1.0F);
         $$0.a(null, eft.z, $$1);
      }

      return bug.a;
   }

   private static bug a(eat $$0, djm $$1, iv $$2, crm $$3, buf $$4, czn $$5) {
      return a($$1, $$2, $$3, $$4, $$5, dmt.fT.m().b(drf.f, Integer.valueOf(3)), awn.dd);
   }

   private static bug b(eat $$0, djm $$1, iv $$2, crm $$3, buf $$4, czn $$5) {
      return (bug)(a($$1, $$2) ? bug.c : a($$1, $$2, $$3, $$4, $$5, dmt.fU.m(), awn.dg));
   }

   private static bug c(eat $$0, djm $$1, iv $$2, crm $$3, buf $$4, czn $$5) {
      return (bug)(a($$1, $$2) ? bug.c : a($$1, $$2, $$3, $$4, $$5, dmt.fV.m().b(drf.f, Integer.valueOf(3)), awn.dh));
   }

   private static bug d(eat $$0, djm $$1, iv $$2, crm $$3, buf $$4, czn $$5) {
      dmr $$6 = dmr.a($$5.h());
      if (!($$6 instanceof dua)) {
         return bug.f;
      } else {
         if (!$$1.C) {
            czn $$7 = $$5.a(dmt.lv, 1);
            $$3.a($$4, czq.a($$5, $$3, $$7, false));
            $$3.a(awx.Z);
            drf.d($$0, $$1, $$2);
         }

         return bug.a;
      }
   }

   private static bug e(eat $$0, djm $$1, iv $$2, crm $$3, buf $$4, czn $$5) {
      dxh $$6 = $$5.a(kk.am, dxh.a);
      if ($$6.b().isEmpty()) {
         return bug.f;
      } else {
         if (!$$1.C) {
            czn $$7 = $$5.c(1);
            $$7.b(kk.am, $$6.a());
            $$3.a($$4, czq.a($$5, $$3, $$7, false));
            $$3.a(awx.Y);
            drf.d($$0, $$1, $$2);
         }

         return bug.a;
      }
   }

   private static bug f(eat $$0, djm $$1, iv $$2, crm $$3, buf $$4, czn $$5) {
      if (!$$5.a(axk.bP)) {
         return bug.f;
      } else if (!$$5.c(kk.K)) {
         return bug.f;
      } else {
         if (!$$1.C) {
            $$5.e(kk.K);
            $$3.a(awx.X);
            drf.d($$0, $$1, $$2);
         }

         return bug.a;
      }
   }

   private static boolean a(djm $$0, iv $$1) {
      exa $$2 = $$0.b_($$1.d());
      return $$2.a(axh.a);
   }

   public static record a(String a, Map<czj, kc> b) {
   }
}
