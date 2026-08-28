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
      Object2ObjectOpenHashMap<cwk, ko> $$1 = new Object2ObjectOpenHashMap();
      $$1.defaultReturnValue((ko)($$0x, $$1x, $$2x, $$3, $$4, $$5) -> bsj.f);
      ko.a $$2 = new ko.a($$0, $$1);
      a.put($$0, $$2);
      return $$2;
   }

   bsj interact(dww var1, dgh var2, ji var3, cow var4, bsi var5, cwo var6);

   static void a() {
      Map<cwk, ko> $$0 = c.b();
      a($$0);
      $$0.put(cws.ti, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> {
         cyn $$6 = $$5.a(kv.Q);
         if ($$6 != null && $$6.a(cyo.a)) {
            if (!$$1x.C) {
               cwk $$7 = $$5.h();
               $$3x.a($$4, cwr.a($$5, $$3x, new cwo(cws.th)));
               $$3x.a(awk.W);
               $$3x.b(awk.c.b($$7));
               $$1x.b($$2x, djn.fP.m());
               $$1x.a(null, $$2x, awa.cB, awb.e, 1.0F, 1.0F);
               $$1x.a(null, ebs.z, $$2x);
            }

            return bsj.a;
         } else {
            return bsj.f;
         }
      });
      Map<cwk, ko> $$1 = d.b();
      a($$1);
      $$1.put(cws.rf, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> a($$0x, $$1x, $$2x, $$3x, $$4, $$5, new cwo(cws.rg), $$0xx -> $$0xx.c(dnw.g) == 3, awa.dj));
      $$1.put(cws.th, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> {
         if (!$$1x.C) {
            cwk $$6 = $$5.h();
            $$3x.a($$4, cwr.a($$5, $$3x, cyn.a(cws.ti, cyo.a)));
            $$3x.a(awk.W);
            $$3x.b(awk.c.b($$6));
            dnw.e($$0x, $$1x, $$2x);
            $$1x.a(null, $$2x, awa.cC, awb.e, 1.0F, 1.0F);
            $$1x.a(null, ebs.y, $$2x);
         }

         return bsj.a;
      });
      $$1.put(cws.ti, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> {
         if ($$0x.c(dnw.g) == 3) {
            return bsj.f;
         } else {
            cyn $$6 = $$5.a(kv.Q);
            if ($$6 != null && $$6.a(cyo.a)) {
               if (!$$1x.C) {
                  $$3x.a($$4, cwr.a($$5, $$3x, new cwo(cws.th)));
                  $$3x.a(awk.W);
                  $$3x.b(awk.c.b($$5.h()));
                  $$1x.b($$2x, $$0x.a(dnw.g));
                  $$1x.a(null, $$2x, awa.cB, awb.e, 1.0F, 1.0F);
                  $$1x.a(null, ebs.z, $$2x);
               }

               return bsj.a;
            } else {
               return bsj.f;
            }
         }
      });
      $$1.put(cws.qg, ko::f);
      $$1.put(cws.qf, ko::f);
      $$1.put(cws.qe, ko::f);
      $$1.put(cws.qd, ko::f);
      $$1.put(cws.vJ, ko::f);
      $$1.put(cws.oW, ko::f);
      $$1.put(cws.vP, ko::e);
      $$1.put(cws.vW, ko::e);
      $$1.put(cws.we, ko::e);
      $$1.put(cws.wa, ko::e);
      $$1.put(cws.wb, ko::e);
      $$1.put(cws.vY, ko::e);
      $$1.put(cws.wc, ko::e);
      $$1.put(cws.vS, ko::e);
      $$1.put(cws.vX, ko::e);
      $$1.put(cws.vU, ko::e);
      $$1.put(cws.vR, ko::e);
      $$1.put(cws.vQ, ko::e);
      $$1.put(cws.vV, ko::e);
      $$1.put(cws.vZ, ko::e);
      $$1.put(cws.wd, ko::e);
      $$1.put(cws.vT, ko::e);
      $$1.put(cws.jA, ko::d);
      $$1.put(cws.jH, ko::d);
      $$1.put(cws.jP, ko::d);
      $$1.put(cws.jL, ko::d);
      $$1.put(cws.jM, ko::d);
      $$1.put(cws.jJ, ko::d);
      $$1.put(cws.jN, ko::d);
      $$1.put(cws.jD, ko::d);
      $$1.put(cws.jI, ko::d);
      $$1.put(cws.jF, ko::d);
      $$1.put(cws.jC, ko::d);
      $$1.put(cws.jB, ko::d);
      $$1.put(cws.jG, ko::d);
      $$1.put(cws.jK, ko::d);
      $$1.put(cws.jO, ko::d);
      $$1.put(cws.jE, ko::d);
      Map<cwk, ko> $$2 = e.b();
      $$2.put(cws.rf, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> a($$0x, $$1x, $$2x, $$3x, $$4, $$5, new cwo(cws.rh), $$0xx -> true, awa.dm));
      a($$2);
      Map<cwk, ko> $$3 = f.b();
      $$3.put(cws.rf, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> a($$0x, $$1x, $$2x, $$3x, $$4, $$5, new cwo(cws.ri), $$0xx -> $$0xx.c(dnw.g) == 3, awa.dn));
      a($$3);
   }

   static void a(Map<cwk, ko> $$0) {
      $$0.put(cws.rh, ko::b);
      $$0.put(cws.rg, ko::a);
      $$0.put(cws.ri, ko::c);
   }

   static bsj a(dww $$0, dgh $$1, ji $$2, cow $$3, bsi $$4, cwo $$5, cwo $$6, Predicate<dww> $$7, avz $$8) {
      if (!$$7.test($$0)) {
         return bsj.f;
      } else {
         if (!$$1.C) {
            cwk $$9 = $$5.h();
            $$3.a($$4, cwr.a($$5, $$3, $$6));
            $$3.a(awk.W);
            $$3.b(awk.c.b($$9));
            $$1.b($$2, djn.fO.m());
            $$1.a(null, $$2, $$8, awb.e, 1.0F, 1.0F);
            $$1.a(null, ebs.y, $$2);
         }

         return bsj.a;
      }
   }

   static bsj a(dgh $$0, ji $$1, cow $$2, bsi $$3, cwo $$4, dww $$5, avz $$6) {
      if (!$$0.C) {
         cwk $$7 = $$4.h();
         $$2.a($$3, cwr.a($$4, $$2, new cwo(cws.rf)));
         $$2.a(awk.V);
         $$2.b(awk.c.b($$7));
         $$0.b($$1, $$5);
         $$0.a(null, $$1, $$6, awb.e, 1.0F, 1.0F);
         $$0.a(null, ebs.z, $$1);
      }

      return bsj.a;
   }

   private static bsj a(dww $$0, dgh $$1, ji $$2, cow $$3, bsi $$4, cwo $$5) {
      return a($$1, $$2, $$3, $$4, $$5, djn.fP.m().b(dnw.g, Integer.valueOf(3)), awa.dd);
   }

   private static bsj b(dww $$0, dgh $$1, ji $$2, cow $$3, bsi $$4, cwo $$5) {
      return (bsj)(a($$1, $$2) ? bsj.c : a($$1, $$2, $$3, $$4, $$5, djn.fQ.m(), awa.dg));
   }

   private static bsj c(dww $$0, dgh $$1, ji $$2, cow $$3, bsi $$4, cwo $$5) {
      return (bsj)(a($$1, $$2) ? bsj.c : a($$1, $$2, $$3, $$4, $$5, djn.fR.m().b(dnw.g, Integer.valueOf(3)), awa.dh));
   }

   private static bsj d(dww $$0, dgh $$1, ji $$2, cow $$3, bsi $$4, cwo $$5) {
      djl $$6 = djl.a($$5.h());
      if (!($$6 instanceof dqp)) {
         return bsj.f;
      } else {
         if (!$$1.C) {
            cwo $$7 = $$5.a(djn.lr, 1);
            $$3.a($$4, cwr.a($$5, $$3, $$7, false));
            $$3.a(awk.Z);
            dnw.e($$0, $$1, $$2);
         }

         return bsj.a;
      }
   }

   private static bsj e(dww $$0, dgh $$1, ji $$2, cow $$3, bsi $$4, cwo $$5) {
      dtp $$6 = $$5.a(kv.ai, dtp.a);
      if ($$6.b().isEmpty()) {
         return bsj.f;
      } else {
         if (!$$1.C) {
            cwo $$7 = $$5.c(1);
            $$7.b(kv.ai, $$6.a());
            $$3.a($$4, cwr.a($$5, $$3, $$7, false));
            $$3.a(awk.Y);
            dnw.e($$0, $$1, $$2);
         }

         return bsj.a;
      }
   }

   private static bsj f(dww $$0, dgh $$1, ji $$2, cow $$3, bsi $$4, cwo $$5) {
      if (!$$5.a(awy.bO)) {
         return bsj.f;
      } else if (!$$5.b(kv.J)) {
         return bsj.f;
      } else {
         if (!$$1.C) {
            $$5.d(kv.J);
            $$3.a(awk.X);
            dnw.e($$0, $$1, $$2);
         }

         return bsj.a;
      }
   }

   private static boolean a(dgh $$0, ji $$1) {
      esy $$2 = $$0.b_($$1.d());
      return $$2.a(awv.a);
   }

   public static record a(String a, Map<cwk, ko> b) {
   }
}
