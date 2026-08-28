import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Map;
import java.util.function.Predicate;

public interface ko {
   Map<String, ko.a> a = new Object2ObjectArrayMap();
   Codec<ko.a> b = Codec.stringResolver(ko.a::a, a::get);
   ko.a c = a("empty");
   ko.a d = a("water");
   ko.a e = a("lava");
   ko.a f = a("powder_snow");

   static ko.a a(String $$0) {
      Object2ObjectOpenHashMap<cwj, ko> $$1 = new Object2ObjectOpenHashMap();
      $$1.defaultReturnValue((ko)($$0x, $$1x, $$2x, $$3, $$4, $$5) -> bsi.f);
      ko.a $$2 = new ko.a($$0, $$1);
      a.put($$0, $$2);
      return $$2;
   }

   bsi interact(dwv var1, dgg var2, ji var3, cov var4, bsh var5, cwn var6);

   static void a() {
      Map<cwj, ko> $$0 = c.b();
      a($$0);
      $$0.put(cwr.ti, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> {
         cym $$6 = $$5.a(kv.Q);
         if ($$6 != null && $$6.a(cyn.a)) {
            if (!$$1x.C) {
               cwj $$7 = $$5.h();
               $$3x.a($$4, cwq.a($$5, $$3x, new cwn(cwr.th)));
               $$3x.a(awj.W);
               $$3x.b(awj.c.b($$7));
               $$1x.b($$2x, djm.fP.m());
               $$1x.a(null, $$2x, avz.cB, awa.e, 1.0F, 1.0F);
               $$1x.a(null, ebr.z, $$2x);
            }

            return bsi.a;
         } else {
            return bsi.f;
         }
      });
      Map<cwj, ko> $$1 = d.b();
      a($$1);
      $$1.put(cwr.rf, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> a($$0x, $$1x, $$2x, $$3x, $$4, $$5, new cwn(cwr.rg), $$0xx -> $$0xx.c(dnv.g) == 3, avz.dj));
      $$1.put(cwr.th, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> {
         if (!$$1x.C) {
            cwj $$6 = $$5.h();
            $$3x.a($$4, cwq.a($$5, $$3x, cym.a(cwr.ti, cyn.a)));
            $$3x.a(awj.W);
            $$3x.b(awj.c.b($$6));
            dnv.e($$0x, $$1x, $$2x);
            $$1x.a(null, $$2x, avz.cC, awa.e, 1.0F, 1.0F);
            $$1x.a(null, ebr.y, $$2x);
         }

         return bsi.a;
      });
      $$1.put(cwr.ti, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> {
         if ($$0x.c(dnv.g) == 3) {
            return bsi.f;
         } else {
            cym $$6 = $$5.a(kv.Q);
            if ($$6 != null && $$6.a(cyn.a)) {
               if (!$$1x.C) {
                  $$3x.a($$4, cwq.a($$5, $$3x, new cwn(cwr.th)));
                  $$3x.a(awj.W);
                  $$3x.b(awj.c.b($$5.h()));
                  $$1x.b($$2x, $$0x.a(dnv.g));
                  $$1x.a(null, $$2x, avz.cB, awa.e, 1.0F, 1.0F);
                  $$1x.a(null, ebr.z, $$2x);
               }

               return bsi.a;
            } else {
               return bsi.f;
            }
         }
      });
      $$1.put(cwr.qg, ko::f);
      $$1.put(cwr.qf, ko::f);
      $$1.put(cwr.qe, ko::f);
      $$1.put(cwr.qd, ko::f);
      $$1.put(cwr.vJ, ko::f);
      $$1.put(cwr.oW, ko::f);
      $$1.put(cwr.vP, ko::e);
      $$1.put(cwr.vW, ko::e);
      $$1.put(cwr.we, ko::e);
      $$1.put(cwr.wa, ko::e);
      $$1.put(cwr.wb, ko::e);
      $$1.put(cwr.vY, ko::e);
      $$1.put(cwr.wc, ko::e);
      $$1.put(cwr.vS, ko::e);
      $$1.put(cwr.vX, ko::e);
      $$1.put(cwr.vU, ko::e);
      $$1.put(cwr.vR, ko::e);
      $$1.put(cwr.vQ, ko::e);
      $$1.put(cwr.vV, ko::e);
      $$1.put(cwr.vZ, ko::e);
      $$1.put(cwr.wd, ko::e);
      $$1.put(cwr.vT, ko::e);
      $$1.put(cwr.jA, ko::d);
      $$1.put(cwr.jH, ko::d);
      $$1.put(cwr.jP, ko::d);
      $$1.put(cwr.jL, ko::d);
      $$1.put(cwr.jM, ko::d);
      $$1.put(cwr.jJ, ko::d);
      $$1.put(cwr.jN, ko::d);
      $$1.put(cwr.jD, ko::d);
      $$1.put(cwr.jI, ko::d);
      $$1.put(cwr.jF, ko::d);
      $$1.put(cwr.jC, ko::d);
      $$1.put(cwr.jB, ko::d);
      $$1.put(cwr.jG, ko::d);
      $$1.put(cwr.jK, ko::d);
      $$1.put(cwr.jO, ko::d);
      $$1.put(cwr.jE, ko::d);
      Map<cwj, ko> $$2 = e.b();
      $$2.put(cwr.rf, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> a($$0x, $$1x, $$2x, $$3x, $$4, $$5, new cwn(cwr.rh), $$0xx -> true, avz.dm));
      a($$2);
      Map<cwj, ko> $$3 = f.b();
      $$3.put(cwr.rf, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> a($$0x, $$1x, $$2x, $$3x, $$4, $$5, new cwn(cwr.ri), $$0xx -> $$0xx.c(dnv.g) == 3, avz.dn));
      a($$3);
   }

   static void a(Map<cwj, ko> $$0) {
      $$0.put(cwr.rh, ko::b);
      $$0.put(cwr.rg, ko::a);
      $$0.put(cwr.ri, ko::c);
   }

   static bsi a(dwv $$0, dgg $$1, ji $$2, cov $$3, bsh $$4, cwn $$5, cwn $$6, Predicate<dwv> $$7, avy $$8) {
      if (!$$7.test($$0)) {
         return bsi.f;
      } else {
         if (!$$1.C) {
            cwj $$9 = $$5.h();
            $$3.a($$4, cwq.a($$5, $$3, $$6));
            $$3.a(awj.W);
            $$3.b(awj.c.b($$9));
            $$1.b($$2, djm.fO.m());
            $$1.a(null, $$2, $$8, awa.e, 1.0F, 1.0F);
            $$1.a(null, ebr.y, $$2);
         }

         return bsi.a;
      }
   }

   static bsi a(dgg $$0, ji $$1, cov $$2, bsh $$3, cwn $$4, dwv $$5, avy $$6) {
      if (!$$0.C) {
         cwj $$7 = $$4.h();
         $$2.a($$3, cwq.a($$4, $$2, new cwn(cwr.rf)));
         $$2.a(awj.V);
         $$2.b(awj.c.b($$7));
         $$0.b($$1, $$5);
         $$0.a(null, $$1, $$6, awa.e, 1.0F, 1.0F);
         $$0.a(null, ebr.z, $$1);
      }

      return bsi.a;
   }

   private static bsi a(dwv $$0, dgg $$1, ji $$2, cov $$3, bsh $$4, cwn $$5) {
      return a($$1, $$2, $$3, $$4, $$5, djm.fP.m().b(dnv.g, Integer.valueOf(3)), avz.dd);
   }

   private static bsi b(dwv $$0, dgg $$1, ji $$2, cov $$3, bsh $$4, cwn $$5) {
      return (bsi)(a($$1, $$2) ? bsi.c : a($$1, $$2, $$3, $$4, $$5, djm.fQ.m(), avz.dg));
   }

   private static bsi c(dwv $$0, dgg $$1, ji $$2, cov $$3, bsh $$4, cwn $$5) {
      return (bsi)(a($$1, $$2) ? bsi.c : a($$1, $$2, $$3, $$4, $$5, djm.fR.m().b(dnv.g, Integer.valueOf(3)), avz.dh));
   }

   private static bsi d(dwv $$0, dgg $$1, ji $$2, cov $$3, bsh $$4, cwn $$5) {
      djk $$6 = djk.a($$5.h());
      if (!($$6 instanceof dqo)) {
         return bsi.f;
      } else {
         if (!$$1.C) {
            cwn $$7 = $$5.a(djm.lr, 1);
            $$3.a($$4, cwq.a($$5, $$3, $$7, false));
            $$3.a(awj.Z);
            dnv.e($$0, $$1, $$2);
         }

         return bsi.a;
      }
   }

   private static bsi e(dwv $$0, dgg $$1, ji $$2, cov $$3, bsh $$4, cwn $$5) {
      dto $$6 = $$5.a(kv.ai, dto.a);
      if ($$6.b().isEmpty()) {
         return bsi.f;
      } else {
         if (!$$1.C) {
            cwn $$7 = $$5.c(1);
            $$7.b(kv.ai, $$6.a());
            $$3.a($$4, cwq.a($$5, $$3, $$7, false));
            $$3.a(awj.Y);
            dnv.e($$0, $$1, $$2);
         }

         return bsi.a;
      }
   }

   private static bsi f(dwv $$0, dgg $$1, ji $$2, cov $$3, bsh $$4, cwn $$5) {
      if (!$$5.a(awx.bO)) {
         return bsi.f;
      } else if (!$$5.b(kv.J)) {
         return bsi.f;
      } else {
         if (!$$1.C) {
            $$5.d(kv.J);
            $$3.a(awj.X);
            dnv.e($$0, $$1, $$2);
         }

         return bsi.a;
      }
   }

   private static boolean a(dgg $$0, ji $$1) {
      esx $$2 = $$0.b_($$1.d());
      return $$2.a(awu.a);
   }

   public static record a(String a, Map<cwj, ko> b) {
   }
}
