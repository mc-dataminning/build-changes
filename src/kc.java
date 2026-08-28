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
      Object2ObjectOpenHashMap<czg, kc> $$1 = new Object2ObjectOpenHashMap();
      $$1.defaultReturnValue((kc)($$0x, $$1x, $$2x, $$3, $$4, $$5) -> bug.f);
      kc.a $$2 = new kc.a($$0, $$1);
      a.put($$0, $$2);
      return $$2;
   }

   bug interact(eao var1, djh var2, iv var3, crj var4, buf var5, czk var6);

   static void a() {
      Map<czg, kc> $$0 = c.b();
      a($$0);
      $$0.put(czo.tt, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> {
         dbg $$6 = $$5.a(kk.R);
         if ($$6 != null && $$6.a(dbh.a)) {
            if (!$$1x.C) {
               czg $$7 = $$5.h();
               $$3x.a($$4, czn.a($$5, $$3x, new czk(czo.ts)));
               $$3x.a(awx.W);
               $$3x.b(awx.c.b($$7));
               $$1x.b($$2x, dmo.fT.m());
               $$1x.a(null, $$2x, awn.cB, awo.e, 1.0F, 1.0F);
               $$1x.a(null, efo.z, $$2x);
            }

            return bug.a;
         } else {
            return bug.f;
         }
      });
      Map<czg, kc> $$1 = d.b();
      a($$1);
      $$1.put(czo.ro, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> a($$0x, $$1x, $$2x, $$3x, $$4, $$5, new czk(czo.rp), $$0xx -> $$0xx.c(dra.f) == 3, awn.dj));
      $$1.put(czo.ts, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> {
         if (!$$1x.C) {
            czg $$6 = $$5.h();
            $$3x.a($$4, czn.a($$5, $$3x, dbg.a(czo.tt, dbh.a)));
            $$3x.a(awx.W);
            $$3x.b(awx.c.b($$6));
            dra.d($$0x, $$1x, $$2x);
            $$1x.a(null, $$2x, awn.cC, awo.e, 1.0F, 1.0F);
            $$1x.a(null, efo.y, $$2x);
         }

         return bug.a;
      });
      $$1.put(czo.tt, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> {
         if ($$0x.c(dra.f) == 3) {
            return bug.f;
         } else {
            dbg $$6 = $$5.a(kk.R);
            if ($$6 != null && $$6.a(dbh.a)) {
               if (!$$1x.C) {
                  $$3x.a($$4, czn.a($$5, $$3x, new czk(czo.ts)));
                  $$3x.a(awx.W);
                  $$3x.b(awx.c.b($$5.h()));
                  $$1x.b($$2x, $$0x.a(dra.f));
                  $$1x.a(null, $$2x, awn.cB, awo.e, 1.0F, 1.0F);
                  $$1x.a(null, efo.z, $$2x);
               }

               return bug.a;
            } else {
               return bug.f;
            }
         }
      });
      $$1.put(czo.qp, kc::f);
      $$1.put(czo.qo, kc::f);
      $$1.put(czo.qn, kc::f);
      $$1.put(czo.qm, kc::f);
      $$1.put(czo.vU, kc::f);
      $$1.put(czo.pf, kc::f);
      $$1.put(czo.wa, kc::e);
      $$1.put(czo.wh, kc::e);
      $$1.put(czo.wp, kc::e);
      $$1.put(czo.wl, kc::e);
      $$1.put(czo.wm, kc::e);
      $$1.put(czo.wj, kc::e);
      $$1.put(czo.wn, kc::e);
      $$1.put(czo.wd, kc::e);
      $$1.put(czo.wi, kc::e);
      $$1.put(czo.wf, kc::e);
      $$1.put(czo.wc, kc::e);
      $$1.put(czo.wb, kc::e);
      $$1.put(czo.wg, kc::e);
      $$1.put(czo.wk, kc::e);
      $$1.put(czo.wo, kc::e);
      $$1.put(czo.we, kc::e);
      $$1.put(czo.jH, kc::d);
      $$1.put(czo.jO, kc::d);
      $$1.put(czo.jW, kc::d);
      $$1.put(czo.jS, kc::d);
      $$1.put(czo.jT, kc::d);
      $$1.put(czo.jQ, kc::d);
      $$1.put(czo.jU, kc::d);
      $$1.put(czo.jK, kc::d);
      $$1.put(czo.jP, kc::d);
      $$1.put(czo.jM, kc::d);
      $$1.put(czo.jJ, kc::d);
      $$1.put(czo.jI, kc::d);
      $$1.put(czo.jN, kc::d);
      $$1.put(czo.jR, kc::d);
      $$1.put(czo.jV, kc::d);
      $$1.put(czo.jL, kc::d);
      Map<czg, kc> $$2 = e.b();
      $$2.put(czo.ro, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> a($$0x, $$1x, $$2x, $$3x, $$4, $$5, new czk(czo.rq), $$0xx -> true, awn.dm));
      a($$2);
      Map<czg, kc> $$3 = f.b();
      $$3.put(czo.ro, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> a($$0x, $$1x, $$2x, $$3x, $$4, $$5, new czk(czo.rr), $$0xx -> $$0xx.c(dra.f) == 3, awn.dn));
      a($$3);
   }

   static void a(Map<czg, kc> $$0) {
      $$0.put(czo.rq, kc::b);
      $$0.put(czo.rp, kc::a);
      $$0.put(czo.rr, kc::c);
   }

   static bug a(eao $$0, djh $$1, iv $$2, crj $$3, buf $$4, czk $$5, czk $$6, Predicate<eao> $$7, awm $$8) {
      if (!$$7.test($$0)) {
         return bug.f;
      } else {
         if (!$$1.C) {
            czg $$9 = $$5.h();
            $$3.a($$4, czn.a($$5, $$3, $$6));
            $$3.a(awx.W);
            $$3.b(awx.c.b($$9));
            $$1.b($$2, dmo.fS.m());
            $$1.a(null, $$2, $$8, awo.e, 1.0F, 1.0F);
            $$1.a(null, efo.y, $$2);
         }

         return bug.a;
      }
   }

   static bug a(djh $$0, iv $$1, crj $$2, buf $$3, czk $$4, eao $$5, awm $$6) {
      if (!$$0.C) {
         czg $$7 = $$4.h();
         $$2.a($$3, czn.a($$4, $$2, new czk(czo.ro)));
         $$2.a(awx.V);
         $$2.b(awx.c.b($$7));
         $$0.b($$1, $$5);
         $$0.a(null, $$1, $$6, awo.e, 1.0F, 1.0F);
         $$0.a(null, efo.z, $$1);
      }

      return bug.a;
   }

   private static bug a(eao $$0, djh $$1, iv $$2, crj $$3, buf $$4, czk $$5) {
      return a($$1, $$2, $$3, $$4, $$5, dmo.fT.m().b(dra.f, Integer.valueOf(3)), awn.dd);
   }

   private static bug b(eao $$0, djh $$1, iv $$2, crj $$3, buf $$4, czk $$5) {
      return (bug)(a($$1, $$2) ? bug.c : a($$1, $$2, $$3, $$4, $$5, dmo.fU.m(), awn.dg));
   }

   private static bug c(eao $$0, djh $$1, iv $$2, crj $$3, buf $$4, czk $$5) {
      return (bug)(a($$1, $$2) ? bug.c : a($$1, $$2, $$3, $$4, $$5, dmo.fV.m().b(dra.f, Integer.valueOf(3)), awn.dh));
   }

   private static bug d(eao $$0, djh $$1, iv $$2, crj $$3, buf $$4, czk $$5) {
      dmm $$6 = dmm.a($$5.h());
      if (!($$6 instanceof dtv)) {
         return bug.f;
      } else {
         if (!$$1.C) {
            czk $$7 = $$5.a(dmo.lv, 1);
            $$3.a($$4, czn.a($$5, $$3, $$7, false));
            $$3.a(awx.Z);
            dra.d($$0, $$1, $$2);
         }

         return bug.a;
      }
   }

   private static bug e(eao $$0, djh $$1, iv $$2, crj $$3, buf $$4, czk $$5) {
      dxc $$6 = $$5.a(kk.am, dxc.a);
      if ($$6.b().isEmpty()) {
         return bug.f;
      } else {
         if (!$$1.C) {
            czk $$7 = $$5.c(1);
            $$7.b(kk.am, $$6.a());
            $$3.a($$4, czn.a($$5, $$3, $$7, false));
            $$3.a(awx.Y);
            dra.d($$0, $$1, $$2);
         }

         return bug.a;
      }
   }

   private static bug f(eao $$0, djh $$1, iv $$2, crj $$3, buf $$4, czk $$5) {
      if (!$$5.a(axk.bP)) {
         return bug.f;
      } else if (!$$5.c(kk.K)) {
         return bug.f;
      } else {
         if (!$$1.C) {
            $$5.e(kk.K);
            $$3.a(awx.X);
            dra.d($$0, $$1, $$2);
         }

         return bug.a;
      }
   }

   private static boolean a(djh $$0, iv $$1) {
      ewv $$2 = $$0.b_($$1.d());
      return $$2.a(axh.a);
   }

   public static record a(String a, Map<czg, kc> b) {
   }
}
