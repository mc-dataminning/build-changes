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
      Object2ObjectOpenHashMap<cwm, ko> $$1 = new Object2ObjectOpenHashMap();
      $$1.defaultReturnValue((ko)($$0x, $$1x, $$2x, $$3, $$4, $$5) -> bsl.f);
      ko.a $$2 = new ko.a($$0, $$1);
      a.put($$0, $$2);
      return $$2;
   }

   bsl interact(dwy var1, dgj var2, ji var3, coy var4, bsk var5, cwq var6);

   static void a() {
      Map<cwm, ko> $$0 = c.b();
      a($$0);
      $$0.put(cwu.ti, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> {
         cyp $$6 = $$5.a(kv.Q);
         if ($$6 != null && $$6.a(cyq.a)) {
            if (!$$1x.C) {
               cwm $$7 = $$5.h();
               $$3x.a($$4, cwt.a($$5, $$3x, new cwq(cwu.th)));
               $$3x.a(awk.W);
               $$3x.b(awk.c.b($$7));
               $$1x.b($$2x, djp.fP.m());
               $$1x.a(null, $$2x, awa.cB, awb.e, 1.0F, 1.0F);
               $$1x.a(null, ebu.z, $$2x);
            }

            return bsl.a;
         } else {
            return bsl.f;
         }
      });
      Map<cwm, ko> $$1 = d.b();
      a($$1);
      $$1.put(cwu.rf, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> a($$0x, $$1x, $$2x, $$3x, $$4, $$5, new cwq(cwu.rg), $$0xx -> $$0xx.c(dny.g) == 3, awa.dj));
      $$1.put(cwu.th, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> {
         if (!$$1x.C) {
            cwm $$6 = $$5.h();
            $$3x.a($$4, cwt.a($$5, $$3x, cyp.a(cwu.ti, cyq.a)));
            $$3x.a(awk.W);
            $$3x.b(awk.c.b($$6));
            dny.e($$0x, $$1x, $$2x);
            $$1x.a(null, $$2x, awa.cC, awb.e, 1.0F, 1.0F);
            $$1x.a(null, ebu.y, $$2x);
         }

         return bsl.a;
      });
      $$1.put(cwu.ti, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> {
         if ($$0x.c(dny.g) == 3) {
            return bsl.f;
         } else {
            cyp $$6 = $$5.a(kv.Q);
            if ($$6 != null && $$6.a(cyq.a)) {
               if (!$$1x.C) {
                  $$3x.a($$4, cwt.a($$5, $$3x, new cwq(cwu.th)));
                  $$3x.a(awk.W);
                  $$3x.b(awk.c.b($$5.h()));
                  $$1x.b($$2x, $$0x.a(dny.g));
                  $$1x.a(null, $$2x, awa.cB, awb.e, 1.0F, 1.0F);
                  $$1x.a(null, ebu.z, $$2x);
               }

               return bsl.a;
            } else {
               return bsl.f;
            }
         }
      });
      $$1.put(cwu.qg, ko::f);
      $$1.put(cwu.qf, ko::f);
      $$1.put(cwu.qe, ko::f);
      $$1.put(cwu.qd, ko::f);
      $$1.put(cwu.vJ, ko::f);
      $$1.put(cwu.oW, ko::f);
      $$1.put(cwu.vP, ko::e);
      $$1.put(cwu.vW, ko::e);
      $$1.put(cwu.we, ko::e);
      $$1.put(cwu.wa, ko::e);
      $$1.put(cwu.wb, ko::e);
      $$1.put(cwu.vY, ko::e);
      $$1.put(cwu.wc, ko::e);
      $$1.put(cwu.vS, ko::e);
      $$1.put(cwu.vX, ko::e);
      $$1.put(cwu.vU, ko::e);
      $$1.put(cwu.vR, ko::e);
      $$1.put(cwu.vQ, ko::e);
      $$1.put(cwu.vV, ko::e);
      $$1.put(cwu.vZ, ko::e);
      $$1.put(cwu.wd, ko::e);
      $$1.put(cwu.vT, ko::e);
      $$1.put(cwu.jA, ko::d);
      $$1.put(cwu.jH, ko::d);
      $$1.put(cwu.jP, ko::d);
      $$1.put(cwu.jL, ko::d);
      $$1.put(cwu.jM, ko::d);
      $$1.put(cwu.jJ, ko::d);
      $$1.put(cwu.jN, ko::d);
      $$1.put(cwu.jD, ko::d);
      $$1.put(cwu.jI, ko::d);
      $$1.put(cwu.jF, ko::d);
      $$1.put(cwu.jC, ko::d);
      $$1.put(cwu.jB, ko::d);
      $$1.put(cwu.jG, ko::d);
      $$1.put(cwu.jK, ko::d);
      $$1.put(cwu.jO, ko::d);
      $$1.put(cwu.jE, ko::d);
      Map<cwm, ko> $$2 = e.b();
      $$2.put(cwu.rf, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> a($$0x, $$1x, $$2x, $$3x, $$4, $$5, new cwq(cwu.rh), $$0xx -> true, awa.dm));
      a($$2);
      Map<cwm, ko> $$3 = f.b();
      $$3.put(cwu.rf, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> a($$0x, $$1x, $$2x, $$3x, $$4, $$5, new cwq(cwu.ri), $$0xx -> $$0xx.c(dny.g) == 3, awa.dn));
      a($$3);
   }

   static void a(Map<cwm, ko> $$0) {
      $$0.put(cwu.rh, ko::b);
      $$0.put(cwu.rg, ko::a);
      $$0.put(cwu.ri, ko::c);
   }

   static bsl a(dwy $$0, dgj $$1, ji $$2, coy $$3, bsk $$4, cwq $$5, cwq $$6, Predicate<dwy> $$7, avz $$8) {
      if (!$$7.test($$0)) {
         return bsl.f;
      } else {
         if (!$$1.C) {
            cwm $$9 = $$5.h();
            $$3.a($$4, cwt.a($$5, $$3, $$6));
            $$3.a(awk.W);
            $$3.b(awk.c.b($$9));
            $$1.b($$2, djp.fO.m());
            $$1.a(null, $$2, $$8, awb.e, 1.0F, 1.0F);
            $$1.a(null, ebu.y, $$2);
         }

         return bsl.a;
      }
   }

   static bsl a(dgj $$0, ji $$1, coy $$2, bsk $$3, cwq $$4, dwy $$5, avz $$6) {
      if (!$$0.C) {
         cwm $$7 = $$4.h();
         $$2.a($$3, cwt.a($$4, $$2, new cwq(cwu.rf)));
         $$2.a(awk.V);
         $$2.b(awk.c.b($$7));
         $$0.b($$1, $$5);
         $$0.a(null, $$1, $$6, awb.e, 1.0F, 1.0F);
         $$0.a(null, ebu.z, $$1);
      }

      return bsl.a;
   }

   private static bsl a(dwy $$0, dgj $$1, ji $$2, coy $$3, bsk $$4, cwq $$5) {
      return a($$1, $$2, $$3, $$4, $$5, djp.fP.m().b(dny.g, Integer.valueOf(3)), awa.dd);
   }

   private static bsl b(dwy $$0, dgj $$1, ji $$2, coy $$3, bsk $$4, cwq $$5) {
      return (bsl)(a($$1, $$2) ? bsl.c : a($$1, $$2, $$3, $$4, $$5, djp.fQ.m(), awa.dg));
   }

   private static bsl c(dwy $$0, dgj $$1, ji $$2, coy $$3, bsk $$4, cwq $$5) {
      return (bsl)(a($$1, $$2) ? bsl.c : a($$1, $$2, $$3, $$4, $$5, djp.fR.m().b(dny.g, Integer.valueOf(3)), awa.dh));
   }

   private static bsl d(dwy $$0, dgj $$1, ji $$2, coy $$3, bsk $$4, cwq $$5) {
      djn $$6 = djn.a($$5.h());
      if (!($$6 instanceof dqr)) {
         return bsl.f;
      } else {
         if (!$$1.C) {
            cwq $$7 = $$5.a(djp.lr, 1);
            $$3.a($$4, cwt.a($$5, $$3, $$7, false));
            $$3.a(awk.Z);
            dny.e($$0, $$1, $$2);
         }

         return bsl.a;
      }
   }

   private static bsl e(dwy $$0, dgj $$1, ji $$2, coy $$3, bsk $$4, cwq $$5) {
      dtr $$6 = $$5.a(kv.ai, dtr.a);
      if ($$6.b().isEmpty()) {
         return bsl.f;
      } else {
         if (!$$1.C) {
            cwq $$7 = $$5.c(1);
            $$7.b(kv.ai, $$6.a());
            $$3.a($$4, cwt.a($$5, $$3, $$7, false));
            $$3.a(awk.Y);
            dny.e($$0, $$1, $$2);
         }

         return bsl.a;
      }
   }

   private static bsl f(dwy $$0, dgj $$1, ji $$2, coy $$3, bsk $$4, cwq $$5) {
      if (!$$5.a(awy.bO)) {
         return bsl.f;
      } else if (!$$5.b(kv.J)) {
         return bsl.f;
      } else {
         if (!$$1.C) {
            $$5.d(kv.J);
            $$3.a(awk.X);
            dny.e($$0, $$1, $$2);
         }

         return bsl.a;
      }
   }

   private static boolean a(dgj $$0, ji $$1) {
      eta $$2 = $$0.b_($$1.d());
      return $$2.a(awv.a);
   }

   public static record a(String a, Map<cwm, ko> b) {
   }
}
