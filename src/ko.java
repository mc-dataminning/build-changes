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
      Object2ObjectOpenHashMap<cxd, ko> $$1 = new Object2ObjectOpenHashMap();
      $$1.defaultReturnValue((ko)($$0x, $$1x, $$2x, $$3, $$4, $$5) -> bsy.f);
      ko.a $$2 = new ko.a($$0, $$1);
      a.put($$0, $$2);
      return $$2;
   }

   bsy interact(dxq var1, dgz var2, ji var3, cpr var4, bsx var5, cxh var6);

   static void a() {
      Map<cxd, ko> $$0 = c.b();
      a($$0);
      $$0.put(cxl.tk, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> {
         cze $$6 = $$5.a(kv.R);
         if ($$6 != null && $$6.a(czf.a)) {
            if (!$$1x.C) {
               cxd $$7 = $$5.h();
               $$3x.a($$4, cxk.a($$5, $$3x, new cxh(cxl.tj)));
               $$3x.a(awk.W);
               $$3x.b(awk.c.b($$7));
               $$1x.b($$2x, dkg.fP.m());
               $$1x.a(null, $$2x, awa.cB, awb.e, 1.0F, 1.0F);
               $$1x.a(null, ecp.z, $$2x);
            }

            return bsy.a;
         } else {
            return bsy.f;
         }
      });
      Map<cxd, ko> $$1 = d.b();
      a($$1);
      $$1.put(cxl.rh, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> a($$0x, $$1x, $$2x, $$3x, $$4, $$5, new cxh(cxl.ri), $$0xx -> $$0xx.c(doq.f) == 3, awa.dj));
      $$1.put(cxl.tj, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> {
         if (!$$1x.C) {
            cxd $$6 = $$5.h();
            $$3x.a($$4, cxk.a($$5, $$3x, cze.a(cxl.tk, czf.a)));
            $$3x.a(awk.W);
            $$3x.b(awk.c.b($$6));
            doq.e($$0x, $$1x, $$2x);
            $$1x.a(null, $$2x, awa.cC, awb.e, 1.0F, 1.0F);
            $$1x.a(null, ecp.y, $$2x);
         }

         return bsy.a;
      });
      $$1.put(cxl.tk, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> {
         if ($$0x.c(doq.f) == 3) {
            return bsy.f;
         } else {
            cze $$6 = $$5.a(kv.R);
            if ($$6 != null && $$6.a(czf.a)) {
               if (!$$1x.C) {
                  $$3x.a($$4, cxk.a($$5, $$3x, new cxh(cxl.tj)));
                  $$3x.a(awk.W);
                  $$3x.b(awk.c.b($$5.h()));
                  $$1x.b($$2x, $$0x.a(doq.f));
                  $$1x.a(null, $$2x, awa.cB, awb.e, 1.0F, 1.0F);
                  $$1x.a(null, ecp.z, $$2x);
               }

               return bsy.a;
            } else {
               return bsy.f;
            }
         }
      });
      $$1.put(cxl.qi, ko::f);
      $$1.put(cxl.qh, ko::f);
      $$1.put(cxl.qg, ko::f);
      $$1.put(cxl.qf, ko::f);
      $$1.put(cxl.vL, ko::f);
      $$1.put(cxl.oY, ko::f);
      $$1.put(cxl.vR, ko::e);
      $$1.put(cxl.vY, ko::e);
      $$1.put(cxl.wg, ko::e);
      $$1.put(cxl.wc, ko::e);
      $$1.put(cxl.wd, ko::e);
      $$1.put(cxl.wa, ko::e);
      $$1.put(cxl.we, ko::e);
      $$1.put(cxl.vU, ko::e);
      $$1.put(cxl.vZ, ko::e);
      $$1.put(cxl.vW, ko::e);
      $$1.put(cxl.vT, ko::e);
      $$1.put(cxl.vS, ko::e);
      $$1.put(cxl.vX, ko::e);
      $$1.put(cxl.wb, ko::e);
      $$1.put(cxl.wf, ko::e);
      $$1.put(cxl.vV, ko::e);
      $$1.put(cxl.jC, ko::d);
      $$1.put(cxl.jJ, ko::d);
      $$1.put(cxl.jR, ko::d);
      $$1.put(cxl.jN, ko::d);
      $$1.put(cxl.jO, ko::d);
      $$1.put(cxl.jL, ko::d);
      $$1.put(cxl.jP, ko::d);
      $$1.put(cxl.jF, ko::d);
      $$1.put(cxl.jK, ko::d);
      $$1.put(cxl.jH, ko::d);
      $$1.put(cxl.jE, ko::d);
      $$1.put(cxl.jD, ko::d);
      $$1.put(cxl.jI, ko::d);
      $$1.put(cxl.jM, ko::d);
      $$1.put(cxl.jQ, ko::d);
      $$1.put(cxl.jG, ko::d);
      Map<cxd, ko> $$2 = e.b();
      $$2.put(cxl.rh, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> a($$0x, $$1x, $$2x, $$3x, $$4, $$5, new cxh(cxl.rj), $$0xx -> true, awa.dm));
      a($$2);
      Map<cxd, ko> $$3 = f.b();
      $$3.put(cxl.rh, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> a($$0x, $$1x, $$2x, $$3x, $$4, $$5, new cxh(cxl.rk), $$0xx -> $$0xx.c(doq.f) == 3, awa.dn));
      a($$3);
   }

   static void a(Map<cxd, ko> $$0) {
      $$0.put(cxl.rj, ko::b);
      $$0.put(cxl.ri, ko::a);
      $$0.put(cxl.rk, ko::c);
   }

   static bsy a(dxq $$0, dgz $$1, ji $$2, cpr $$3, bsx $$4, cxh $$5, cxh $$6, Predicate<dxq> $$7, avz $$8) {
      if (!$$7.test($$0)) {
         return bsy.f;
      } else {
         if (!$$1.C) {
            cxd $$9 = $$5.h();
            $$3.a($$4, cxk.a($$5, $$3, $$6));
            $$3.a(awk.W);
            $$3.b(awk.c.b($$9));
            $$1.b($$2, dkg.fO.m());
            $$1.a(null, $$2, $$8, awb.e, 1.0F, 1.0F);
            $$1.a(null, ecp.y, $$2);
         }

         return bsy.a;
      }
   }

   static bsy a(dgz $$0, ji $$1, cpr $$2, bsx $$3, cxh $$4, dxq $$5, avz $$6) {
      if (!$$0.C) {
         cxd $$7 = $$4.h();
         $$2.a($$3, cxk.a($$4, $$2, new cxh(cxl.rh)));
         $$2.a(awk.V);
         $$2.b(awk.c.b($$7));
         $$0.b($$1, $$5);
         $$0.a(null, $$1, $$6, awb.e, 1.0F, 1.0F);
         $$0.a(null, ecp.z, $$1);
      }

      return bsy.a;
   }

   private static bsy a(dxq $$0, dgz $$1, ji $$2, cpr $$3, bsx $$4, cxh $$5) {
      return a($$1, $$2, $$3, $$4, $$5, dkg.fP.m().b(doq.f, Integer.valueOf(3)), awa.dd);
   }

   private static bsy b(dxq $$0, dgz $$1, ji $$2, cpr $$3, bsx $$4, cxh $$5) {
      return (bsy)(a($$1, $$2) ? bsy.c : a($$1, $$2, $$3, $$4, $$5, dkg.fQ.m(), awa.dg));
   }

   private static bsy c(dxq $$0, dgz $$1, ji $$2, cpr $$3, bsx $$4, cxh $$5) {
      return (bsy)(a($$1, $$2) ? bsy.c : a($$1, $$2, $$3, $$4, $$5, dkg.fR.m().b(doq.f, Integer.valueOf(3)), awa.dh));
   }

   private static bsy d(dxq $$0, dgz $$1, ji $$2, cpr $$3, bsx $$4, cxh $$5) {
      dke $$6 = dke.a($$5.h());
      if (!($$6 instanceof drj)) {
         return bsy.f;
      } else {
         if (!$$1.C) {
            cxh $$7 = $$5.a(dkg.lr, 1);
            $$3.a($$4, cxk.a($$5, $$3, $$7, false));
            $$3.a(awk.Z);
            doq.e($$0, $$1, $$2);
         }

         return bsy.a;
      }
   }

   private static bsy e(dxq $$0, dgz $$1, ji $$2, cpr $$3, bsx $$4, cxh $$5) {
      duj $$6 = $$5.a(kv.ak, duj.a);
      if ($$6.b().isEmpty()) {
         return bsy.f;
      } else {
         if (!$$1.C) {
            cxh $$7 = $$5.c(1);
            $$7.b(kv.ak, $$6.a());
            $$3.a($$4, cxk.a($$5, $$3, $$7, false));
            $$3.a(awk.Y);
            doq.e($$0, $$1, $$2);
         }

         return bsy.a;
      }
   }

   private static bsy f(dxq $$0, dgz $$1, ji $$2, cpr $$3, bsx $$4, cxh $$5) {
      if (!$$5.a(awy.bO)) {
         return bsy.f;
      } else if (!$$5.b(kv.K)) {
         return bsy.f;
      } else {
         if (!$$1.C) {
            $$5.d(kv.K);
            $$3.a(awk.X);
            doq.e($$0, $$1, $$2);
         }

         return bsy.a;
      }
   }

   private static boolean a(dgz $$0, ji $$1) {
      etw $$2 = $$0.b_($$1.d());
      return $$2.a(awv.a);
   }

   public static record a(String a, Map<cxd, ko> b) {
   }
}
