import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Map;
import java.util.function.Predicate;

public interface kn {
   Map<String, kn.a> a = new Object2ObjectArrayMap();
   Codec<kn.a> b = Codec.stringResolver(kn.a::a, a::get);
   kn.a c = a("empty");
   kn.a d = a("water");
   kn.a e = a("lava");
   kn.a f = a("powder_snow");

   static kn.a a(String $$0) {
      Object2ObjectOpenHashMap<cxc, kn> $$1 = new Object2ObjectOpenHashMap();
      $$1.defaultReturnValue((kn)($$0x, $$1x, $$2x, $$3, $$4, $$5) -> bta.f);
      kn.a $$2 = new kn.a($$0, $$1);
      a.put($$0, $$2);
      return $$2;
   }

   bta interact(dxo var1, dgz var2, jh var3, cpo var4, bsz var5, cxg var6);

   static void a() {
      Map<cxc, kn> $$0 = c.b();
      a($$0);
      $$0.put(cxk.ti, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> {
         czf $$6 = $$5.a(ku.Q);
         if ($$6 != null && $$6.a(czg.a)) {
            if (!$$1x.C) {
               cxc $$7 = $$5.h();
               $$3x.a($$4, cxj.a($$5, $$3x, new cxg(cxk.th)));
               $$3x.a(axf.W);
               $$3x.b(axf.c.b($$7));
               $$1x.b($$2x, dkf.fP.m());
               $$1x.a(null, $$2x, awv.cB, aww.e, 1.0F, 1.0F);
               $$1x.a(null, eck.z, $$2x);
            }

            return bta.a;
         } else {
            return bta.f;
         }
      });
      Map<cxc, kn> $$1 = d.b();
      a($$1);
      $$1.put(cxk.rf, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> a($$0x, $$1x, $$2x, $$3x, $$4, $$5, new cxg(cxk.rg), $$0xx -> $$0xx.c(doo.g) == 3, awv.dj));
      $$1.put(cxk.th, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> {
         if (!$$1x.C) {
            cxc $$6 = $$5.h();
            $$3x.a($$4, cxj.a($$5, $$3x, czf.a(cxk.ti, czg.a)));
            $$3x.a(axf.W);
            $$3x.b(axf.c.b($$6));
            doo.e($$0x, $$1x, $$2x);
            $$1x.a(null, $$2x, awv.cC, aww.e, 1.0F, 1.0F);
            $$1x.a(null, eck.y, $$2x);
         }

         return bta.a;
      });
      $$1.put(cxk.ti, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> {
         if ($$0x.c(doo.g) == 3) {
            return bta.f;
         } else {
            czf $$6 = $$5.a(ku.Q);
            if ($$6 != null && $$6.a(czg.a)) {
               if (!$$1x.C) {
                  $$3x.a($$4, cxj.a($$5, $$3x, new cxg(cxk.th)));
                  $$3x.a(axf.W);
                  $$3x.b(axf.c.b($$5.h()));
                  $$1x.b($$2x, $$0x.a(doo.g));
                  $$1x.a(null, $$2x, awv.cB, aww.e, 1.0F, 1.0F);
                  $$1x.a(null, eck.z, $$2x);
               }

               return bta.a;
            } else {
               return bta.f;
            }
         }
      });
      $$1.put(cxk.qg, kn::f);
      $$1.put(cxk.qf, kn::f);
      $$1.put(cxk.qe, kn::f);
      $$1.put(cxk.qd, kn::f);
      $$1.put(cxk.vJ, kn::f);
      $$1.put(cxk.oW, kn::f);
      $$1.put(cxk.vP, kn::e);
      $$1.put(cxk.vW, kn::e);
      $$1.put(cxk.we, kn::e);
      $$1.put(cxk.wa, kn::e);
      $$1.put(cxk.wb, kn::e);
      $$1.put(cxk.vY, kn::e);
      $$1.put(cxk.wc, kn::e);
      $$1.put(cxk.vS, kn::e);
      $$1.put(cxk.vX, kn::e);
      $$1.put(cxk.vU, kn::e);
      $$1.put(cxk.vR, kn::e);
      $$1.put(cxk.vQ, kn::e);
      $$1.put(cxk.vV, kn::e);
      $$1.put(cxk.vZ, kn::e);
      $$1.put(cxk.wd, kn::e);
      $$1.put(cxk.vT, kn::e);
      $$1.put(cxk.jA, kn::d);
      $$1.put(cxk.jH, kn::d);
      $$1.put(cxk.jP, kn::d);
      $$1.put(cxk.jL, kn::d);
      $$1.put(cxk.jM, kn::d);
      $$1.put(cxk.jJ, kn::d);
      $$1.put(cxk.jN, kn::d);
      $$1.put(cxk.jD, kn::d);
      $$1.put(cxk.jI, kn::d);
      $$1.put(cxk.jF, kn::d);
      $$1.put(cxk.jC, kn::d);
      $$1.put(cxk.jB, kn::d);
      $$1.put(cxk.jG, kn::d);
      $$1.put(cxk.jK, kn::d);
      $$1.put(cxk.jO, kn::d);
      $$1.put(cxk.jE, kn::d);
      Map<cxc, kn> $$2 = e.b();
      $$2.put(cxk.rf, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> a($$0x, $$1x, $$2x, $$3x, $$4, $$5, new cxg(cxk.rh), $$0xx -> true, awv.dm));
      a($$2);
      Map<cxc, kn> $$3 = f.b();
      $$3.put(cxk.rf, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> a($$0x, $$1x, $$2x, $$3x, $$4, $$5, new cxg(cxk.ri), $$0xx -> $$0xx.c(doo.g) == 3, awv.dn));
      a($$3);
   }

   static void a(Map<cxc, kn> $$0) {
      $$0.put(cxk.rh, kn::b);
      $$0.put(cxk.rg, kn::a);
      $$0.put(cxk.ri, kn::c);
   }

   static bta a(dxo $$0, dgz $$1, jh $$2, cpo $$3, bsz $$4, cxg $$5, cxg $$6, Predicate<dxo> $$7, awu $$8) {
      if (!$$7.test($$0)) {
         return bta.f;
      } else {
         if (!$$1.C) {
            cxc $$9 = $$5.h();
            $$3.a($$4, cxj.a($$5, $$3, $$6));
            $$3.a(axf.W);
            $$3.b(axf.c.b($$9));
            $$1.b($$2, dkf.fO.m());
            $$1.a(null, $$2, $$8, aww.e, 1.0F, 1.0F);
            $$1.a(null, eck.y, $$2);
         }

         return bta.a;
      }
   }

   static bta a(dgz $$0, jh $$1, cpo $$2, bsz $$3, cxg $$4, dxo $$5, awu $$6) {
      if (!$$0.C) {
         cxc $$7 = $$4.h();
         $$2.a($$3, cxj.a($$4, $$2, new cxg(cxk.rf)));
         $$2.a(axf.V);
         $$2.b(axf.c.b($$7));
         $$0.b($$1, $$5);
         $$0.a(null, $$1, $$6, aww.e, 1.0F, 1.0F);
         $$0.a(null, eck.z, $$1);
      }

      return bta.a;
   }

   private static bta a(dxo $$0, dgz $$1, jh $$2, cpo $$3, bsz $$4, cxg $$5) {
      return a($$1, $$2, $$3, $$4, $$5, dkf.fP.m().b(doo.g, Integer.valueOf(3)), awv.dd);
   }

   private static bta b(dxo $$0, dgz $$1, jh $$2, cpo $$3, bsz $$4, cxg $$5) {
      return (bta)(a($$1, $$2) ? bta.c : a($$1, $$2, $$3, $$4, $$5, dkf.fQ.m(), awv.dg));
   }

   private static bta c(dxo $$0, dgz $$1, jh $$2, cpo $$3, bsz $$4, cxg $$5) {
      return (bta)(a($$1, $$2) ? bta.c : a($$1, $$2, $$3, $$4, $$5, dkf.fR.m().b(doo.g, Integer.valueOf(3)), awv.dh));
   }

   private static bta d(dxo $$0, dgz $$1, jh $$2, cpo $$3, bsz $$4, cxg $$5) {
      dkd $$6 = dkd.a($$5.h());
      if (!($$6 instanceof drh)) {
         return bta.f;
      } else {
         if (!$$1.C) {
            cxg $$7 = $$5.a(dkf.lr, 1);
            $$3.a($$4, cxj.a($$5, $$3, $$7, false));
            $$3.a(axf.Z);
            doo.e($$0, $$1, $$2);
         }

         return bta.a;
      }
   }

   private static bta e(dxo $$0, dgz $$1, jh $$2, cpo $$3, bsz $$4, cxg $$5) {
      duh $$6 = $$5.a(ku.ai, duh.a);
      if ($$6.b().isEmpty()) {
         return bta.f;
      } else {
         if (!$$1.C) {
            cxg $$7 = $$5.c(1);
            $$7.b(ku.ai, $$6.a());
            $$3.a($$4, cxj.a($$5, $$3, $$7, false));
            $$3.a(axf.Y);
            doo.e($$0, $$1, $$2);
         }

         return bta.a;
      }
   }

   private static bta f(dxo $$0, dgz $$1, jh $$2, cpo $$3, bsz $$4, cxg $$5) {
      if (!$$5.a(axt.bR)) {
         return bta.f;
      } else if (!$$5.b(ku.J)) {
         return bta.f;
      } else {
         if (!$$1.C) {
            $$5.c(ku.J);
            $$3.a(axf.X);
            doo.e($$0, $$1, $$2);
         }

         return bta.a;
      }
   }

   private static boolean a(dgz $$0, jh $$1) {
      etq $$2 = $$0.b_($$1.d());
      return $$2.a(axq.a);
   }

   public static record a(String a, Map<cxc, kn> b) {
   }
}
