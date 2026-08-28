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
      Object2ObjectOpenHashMap<cwl, ko> $$1 = new Object2ObjectOpenHashMap();
      $$1.defaultReturnValue((ko)($$0x, $$1x, $$2x, $$3, $$4, $$5) -> bsk.f);
      ko.a $$2 = new ko.a($$0, $$1);
      a.put($$0, $$2);
      return $$2;
   }

   bsk interact(dwx var1, dgi var2, ji var3, cox var4, bsj var5, cwp var6);

   static void a() {
      Map<cwl, ko> $$0 = c.b();
      a($$0);
      $$0.put(cwt.ti, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> {
         cyo $$6 = $$5.a(kv.Q);
         if ($$6 != null && $$6.a(cyp.a)) {
            if (!$$1x.C) {
               cwl $$7 = $$5.h();
               $$3x.a($$4, cws.a($$5, $$3x, new cwp(cwt.th)));
               $$3x.a(awk.W);
               $$3x.b(awk.c.b($$7));
               $$1x.b($$2x, djo.fP.m());
               $$1x.a(null, $$2x, awa.cB, awb.e, 1.0F, 1.0F);
               $$1x.a(null, ebt.z, $$2x);
            }

            return bsk.a;
         } else {
            return bsk.f;
         }
      });
      Map<cwl, ko> $$1 = d.b();
      a($$1);
      $$1.put(cwt.rf, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> a($$0x, $$1x, $$2x, $$3x, $$4, $$5, new cwp(cwt.rg), $$0xx -> $$0xx.c(dnx.g) == 3, awa.dj));
      $$1.put(cwt.th, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> {
         if (!$$1x.C) {
            cwl $$6 = $$5.h();
            $$3x.a($$4, cws.a($$5, $$3x, cyo.a(cwt.ti, cyp.a)));
            $$3x.a(awk.W);
            $$3x.b(awk.c.b($$6));
            dnx.e($$0x, $$1x, $$2x);
            $$1x.a(null, $$2x, awa.cC, awb.e, 1.0F, 1.0F);
            $$1x.a(null, ebt.y, $$2x);
         }

         return bsk.a;
      });
      $$1.put(cwt.ti, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> {
         if ($$0x.c(dnx.g) == 3) {
            return bsk.f;
         } else {
            cyo $$6 = $$5.a(kv.Q);
            if ($$6 != null && $$6.a(cyp.a)) {
               if (!$$1x.C) {
                  $$3x.a($$4, cws.a($$5, $$3x, new cwp(cwt.th)));
                  $$3x.a(awk.W);
                  $$3x.b(awk.c.b($$5.h()));
                  $$1x.b($$2x, $$0x.a(dnx.g));
                  $$1x.a(null, $$2x, awa.cB, awb.e, 1.0F, 1.0F);
                  $$1x.a(null, ebt.z, $$2x);
               }

               return bsk.a;
            } else {
               return bsk.f;
            }
         }
      });
      $$1.put(cwt.qg, ko::f);
      $$1.put(cwt.qf, ko::f);
      $$1.put(cwt.qe, ko::f);
      $$1.put(cwt.qd, ko::f);
      $$1.put(cwt.vJ, ko::f);
      $$1.put(cwt.oW, ko::f);
      $$1.put(cwt.vP, ko::e);
      $$1.put(cwt.vW, ko::e);
      $$1.put(cwt.we, ko::e);
      $$1.put(cwt.wa, ko::e);
      $$1.put(cwt.wb, ko::e);
      $$1.put(cwt.vY, ko::e);
      $$1.put(cwt.wc, ko::e);
      $$1.put(cwt.vS, ko::e);
      $$1.put(cwt.vX, ko::e);
      $$1.put(cwt.vU, ko::e);
      $$1.put(cwt.vR, ko::e);
      $$1.put(cwt.vQ, ko::e);
      $$1.put(cwt.vV, ko::e);
      $$1.put(cwt.vZ, ko::e);
      $$1.put(cwt.wd, ko::e);
      $$1.put(cwt.vT, ko::e);
      $$1.put(cwt.jA, ko::d);
      $$1.put(cwt.jH, ko::d);
      $$1.put(cwt.jP, ko::d);
      $$1.put(cwt.jL, ko::d);
      $$1.put(cwt.jM, ko::d);
      $$1.put(cwt.jJ, ko::d);
      $$1.put(cwt.jN, ko::d);
      $$1.put(cwt.jD, ko::d);
      $$1.put(cwt.jI, ko::d);
      $$1.put(cwt.jF, ko::d);
      $$1.put(cwt.jC, ko::d);
      $$1.put(cwt.jB, ko::d);
      $$1.put(cwt.jG, ko::d);
      $$1.put(cwt.jK, ko::d);
      $$1.put(cwt.jO, ko::d);
      $$1.put(cwt.jE, ko::d);
      Map<cwl, ko> $$2 = e.b();
      $$2.put(cwt.rf, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> a($$0x, $$1x, $$2x, $$3x, $$4, $$5, new cwp(cwt.rh), $$0xx -> true, awa.dm));
      a($$2);
      Map<cwl, ko> $$3 = f.b();
      $$3.put(cwt.rf, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> a($$0x, $$1x, $$2x, $$3x, $$4, $$5, new cwp(cwt.ri), $$0xx -> $$0xx.c(dnx.g) == 3, awa.dn));
      a($$3);
   }

   static void a(Map<cwl, ko> $$0) {
      $$0.put(cwt.rh, ko::b);
      $$0.put(cwt.rg, ko::a);
      $$0.put(cwt.ri, ko::c);
   }

   static bsk a(dwx $$0, dgi $$1, ji $$2, cox $$3, bsj $$4, cwp $$5, cwp $$6, Predicate<dwx> $$7, avz $$8) {
      if (!$$7.test($$0)) {
         return bsk.f;
      } else {
         if (!$$1.C) {
            cwl $$9 = $$5.h();
            $$3.a($$4, cws.a($$5, $$3, $$6));
            $$3.a(awk.W);
            $$3.b(awk.c.b($$9));
            $$1.b($$2, djo.fO.m());
            $$1.a(null, $$2, $$8, awb.e, 1.0F, 1.0F);
            $$1.a(null, ebt.y, $$2);
         }

         return bsk.a;
      }
   }

   static bsk a(dgi $$0, ji $$1, cox $$2, bsj $$3, cwp $$4, dwx $$5, avz $$6) {
      if (!$$0.C) {
         cwl $$7 = $$4.h();
         $$2.a($$3, cws.a($$4, $$2, new cwp(cwt.rf)));
         $$2.a(awk.V);
         $$2.b(awk.c.b($$7));
         $$0.b($$1, $$5);
         $$0.a(null, $$1, $$6, awb.e, 1.0F, 1.0F);
         $$0.a(null, ebt.z, $$1);
      }

      return bsk.a;
   }

   private static bsk a(dwx $$0, dgi $$1, ji $$2, cox $$3, bsj $$4, cwp $$5) {
      return a($$1, $$2, $$3, $$4, $$5, djo.fP.m().b(dnx.g, Integer.valueOf(3)), awa.dd);
   }

   private static bsk b(dwx $$0, dgi $$1, ji $$2, cox $$3, bsj $$4, cwp $$5) {
      return (bsk)(a($$1, $$2) ? bsk.c : a($$1, $$2, $$3, $$4, $$5, djo.fQ.m(), awa.dg));
   }

   private static bsk c(dwx $$0, dgi $$1, ji $$2, cox $$3, bsj $$4, cwp $$5) {
      return (bsk)(a($$1, $$2) ? bsk.c : a($$1, $$2, $$3, $$4, $$5, djo.fR.m().b(dnx.g, Integer.valueOf(3)), awa.dh));
   }

   private static bsk d(dwx $$0, dgi $$1, ji $$2, cox $$3, bsj $$4, cwp $$5) {
      djm $$6 = djm.a($$5.h());
      if (!($$6 instanceof dqq)) {
         return bsk.f;
      } else {
         if (!$$1.C) {
            cwp $$7 = $$5.a(djo.lr, 1);
            $$3.a($$4, cws.a($$5, $$3, $$7, false));
            $$3.a(awk.Z);
            dnx.e($$0, $$1, $$2);
         }

         return bsk.a;
      }
   }

   private static bsk e(dwx $$0, dgi $$1, ji $$2, cox $$3, bsj $$4, cwp $$5) {
      dtq $$6 = $$5.a(kv.ai, dtq.a);
      if ($$6.b().isEmpty()) {
         return bsk.f;
      } else {
         if (!$$1.C) {
            cwp $$7 = $$5.c(1);
            $$7.b(kv.ai, $$6.a());
            $$3.a($$4, cws.a($$5, $$3, $$7, false));
            $$3.a(awk.Y);
            dnx.e($$0, $$1, $$2);
         }

         return bsk.a;
      }
   }

   private static bsk f(dwx $$0, dgi $$1, ji $$2, cox $$3, bsj $$4, cwp $$5) {
      if (!$$5.a(awy.bO)) {
         return bsk.f;
      } else if (!$$5.b(kv.J)) {
         return bsk.f;
      } else {
         if (!$$1.C) {
            $$5.d(kv.J);
            $$3.a(awk.X);
            dnx.e($$0, $$1, $$2);
         }

         return bsk.a;
      }
   }

   private static boolean a(dgi $$0, ji $$1) {
      esz $$2 = $$0.b_($$1.d());
      return $$2.a(awv.a);
   }

   public static record a(String a, Map<cwl, ko> b) {
   }
}
