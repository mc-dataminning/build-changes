import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Map;
import java.util.function.Predicate;

public interface kk {
   Map<String, kk.a> a = new Object2ObjectArrayMap();
   Codec<kk.a> b = Codec.stringResolver(kk.a::a, a::get);
   kk.a c = a("empty");
   kk.a d = a("water");
   kk.a e = a("lava");
   kk.a f = a("powder_snow");

   static kk.a a(String $$0) {
      Object2ObjectOpenHashMap<cvk, kk> $$1 = new Object2ObjectOpenHashMap();
      $$1.defaultReturnValue((kk)($$0x, $$1x, $$2x, $$3, $$4, $$5) -> brp.f);
      kk.a $$2 = new kk.a($$0, $$1);
      a.put($$0, $$2);
      return $$2;
   }

   brp interact(duo var1, deg var2, je var3, cnu var4, bro var5, cvp var6);

   static void a() {
      Map<cvk, kk> $$0 = c.b();
      a($$0);
      $$0.put(cvt.sm, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> {
         cxo $$6 = $$5.a(kr.L);
         if ($$6 != null && $$6.a(cxp.a)) {
            if (!$$1x.B) {
               cvk $$7 = $$5.h();
               $$3x.a($$4, cvs.a($$5, $$3x, new cvp(cvt.sl)));
               $$3x.a(awo.W);
               $$3x.b(awo.c.b($$7));
               $$1x.b($$2x, dhl.fu.o());
               $$1x.a(null, $$2x, awe.cB, awf.e, 1.0F, 1.0F);
               $$1x.a(null, dzl.z, $$2x);
            }

            return brp.a;
         } else {
            return brp.f;
         }
      });
      Map<cvk, kk> $$1 = d.b();
      a($$1);
      $$1.put(cvt.qz, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> a($$0x, $$1x, $$2x, $$3x, $$4, $$5, new cvp(cvt.qA), $$0xx -> $$0xx.c(dls.g) == 3, awe.di));
      $$1.put(cvt.sl, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> {
         if (!$$1x.B) {
            cvk $$6 = $$5.h();
            $$3x.a($$4, cvs.a($$5, $$3x, cxo.a(cvt.sm, cxp.a)));
            $$3x.a(awo.W);
            $$3x.b(awo.c.b($$6));
            dls.d($$0x, $$1x, $$2x);
            $$1x.a(null, $$2x, awe.cC, awf.e, 1.0F, 1.0F);
            $$1x.a(null, dzl.y, $$2x);
         }

         return brp.a;
      });
      $$1.put(cvt.sm, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> {
         if ($$0x.c(dls.g) == 3) {
            return brp.f;
         } else {
            cxo $$6 = $$5.a(kr.L);
            if ($$6 != null && $$6.a(cxp.a)) {
               if (!$$1x.B) {
                  $$3x.a($$4, cvs.a($$5, $$3x, new cvp(cvt.sl)));
                  $$3x.a(awo.W);
                  $$3x.b(awo.c.b($$5.h()));
                  $$1x.b($$2x, $$0x.a(dls.g));
                  $$1x.a(null, $$2x, awe.cB, awf.e, 1.0F, 1.0F);
                  $$1x.a(null, dzl.z, $$2x);
               }

               return brp.a;
            } else {
               return brp.f;
            }
         }
      });
      $$1.put(cvt.pC, kk::f);
      $$1.put(cvt.pB, kk::f);
      $$1.put(cvt.pA, kk::f);
      $$1.put(cvt.pz, kk::f);
      $$1.put(cvt.uL, kk::f);
      $$1.put(cvt.os, kk::f);
      $$1.put(cvt.uR, kk::e);
      $$1.put(cvt.uY, kk::e);
      $$1.put(cvt.vg, kk::e);
      $$1.put(cvt.vc, kk::e);
      $$1.put(cvt.vd, kk::e);
      $$1.put(cvt.va, kk::e);
      $$1.put(cvt.ve, kk::e);
      $$1.put(cvt.uU, kk::e);
      $$1.put(cvt.uZ, kk::e);
      $$1.put(cvt.uW, kk::e);
      $$1.put(cvt.uT, kk::e);
      $$1.put(cvt.uS, kk::e);
      $$1.put(cvt.uX, kk::e);
      $$1.put(cvt.vb, kk::e);
      $$1.put(cvt.vf, kk::e);
      $$1.put(cvt.uV, kk::e);
      $$1.put(cvt.jd, kk::d);
      $$1.put(cvt.jk, kk::d);
      $$1.put(cvt.js, kk::d);
      $$1.put(cvt.jo, kk::d);
      $$1.put(cvt.jp, kk::d);
      $$1.put(cvt.jm, kk::d);
      $$1.put(cvt.jq, kk::d);
      $$1.put(cvt.jg, kk::d);
      $$1.put(cvt.jl, kk::d);
      $$1.put(cvt.ji, kk::d);
      $$1.put(cvt.jf, kk::d);
      $$1.put(cvt.je, kk::d);
      $$1.put(cvt.jj, kk::d);
      $$1.put(cvt.jn, kk::d);
      $$1.put(cvt.jr, kk::d);
      $$1.put(cvt.jh, kk::d);
      Map<cvk, kk> $$2 = e.b();
      $$2.put(cvt.qz, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> a($$0x, $$1x, $$2x, $$3x, $$4, $$5, new cvp(cvt.qB), $$0xx -> true, awe.dl));
      a($$2);
      Map<cvk, kk> $$3 = f.b();
      $$3.put(cvt.qz, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> a($$0x, $$1x, $$2x, $$3x, $$4, $$5, new cvp(cvt.qC), $$0xx -> $$0xx.c(dls.g) == 3, awe.dm));
      a($$3);
   }

   static void a(Map<cvk, kk> $$0) {
      $$0.put(cvt.qB, kk::b);
      $$0.put(cvt.qA, kk::a);
      $$0.put(cvt.qC, kk::c);
   }

   static brp a(duo $$0, deg $$1, je $$2, cnu $$3, bro $$4, cvp $$5, cvp $$6, Predicate<duo> $$7, awd $$8) {
      if (!$$7.test($$0)) {
         return brp.f;
      } else {
         if (!$$1.B) {
            cvk $$9 = $$5.h();
            $$3.a($$4, cvs.a($$5, $$3, $$6));
            $$3.a(awo.W);
            $$3.b(awo.c.b($$9));
            $$1.b($$2, dhl.ft.o());
            $$1.a(null, $$2, $$8, awf.e, 1.0F, 1.0F);
            $$1.a(null, dzl.y, $$2);
         }

         return brp.a;
      }
   }

   static brp a(deg $$0, je $$1, cnu $$2, bro $$3, cvp $$4, duo $$5, awd $$6) {
      if (!$$0.B) {
         cvk $$7 = $$4.h();
         $$2.a($$3, cvs.a($$4, $$2, new cvp(cvt.qz)));
         $$2.a(awo.V);
         $$2.b(awo.c.b($$7));
         $$0.b($$1, $$5);
         $$0.a(null, $$1, $$6, awf.e, 1.0F, 1.0F);
         $$0.a(null, dzl.z, $$1);
      }

      return brp.a;
   }

   private static brp a(duo $$0, deg $$1, je $$2, cnu $$3, bro $$4, cvp $$5) {
      return a($$1, $$2, $$3, $$4, $$5, dhl.fu.o().b(dls.g, Integer.valueOf(3)), awe.dc);
   }

   private static brp b(duo $$0, deg $$1, je $$2, cnu $$3, bro $$4, cvp $$5) {
      return (brp)(a($$1, $$2) ? brp.c : a($$1, $$2, $$3, $$4, $$5, dhl.fv.o(), awe.df));
   }

   private static brp c(duo $$0, deg $$1, je $$2, cnu $$3, bro $$4, cvp $$5) {
      return (brp)(a($$1, $$2) ? brp.c : a($$1, $$2, $$3, $$4, $$5, dhl.fw.o().b(dls.g, Integer.valueOf(3)), awe.dg));
   }

   private static brp d(duo $$0, deg $$1, je $$2, cnu $$3, bro $$4, cvp $$5) {
      dhj $$6 = dhj.a($$5.h());
      if (!($$6 instanceof doj)) {
         return brp.f;
      } else {
         if (!$$1.B) {
            cvp $$7 = $$5.a(dhl.kP, 1);
            $$3.a($$4, cvs.a($$5, $$3, $$7, false));
            $$3.a(awo.Z);
            dls.d($$0, $$1, $$2);
         }

         return brp.a;
      }
   }

   private static brp e(duo $$0, deg $$1, je $$2, cnu $$3, bro $$4, cvp $$5) {
      drj $$6 = $$5.a(kr.ad, drj.a);
      if ($$6.b().isEmpty()) {
         return brp.f;
      } else {
         if (!$$1.B) {
            cvp $$7 = $$5.c(1);
            $$7.b(kr.ad, $$6.a());
            $$3.a($$4, cvs.a($$5, $$3, $$7, false));
            $$3.a(awo.Y);
            dls.d($$0, $$1, $$2);
         }

         return brp.a;
      }
   }

   private static brp f(duo $$0, deg $$1, je $$2, cnu $$3, bro $$4, cvp $$5) {
      if (!$$5.a(axc.bD)) {
         return brp.f;
      } else if (!$$5.b(kr.E)) {
         return brp.f;
      } else {
         if (!$$1.B) {
            $$5.c(kr.E);
            $$3.a(awo.X);
            dls.d($$0, $$1, $$2);
         }

         return brp.a;
      }
   }

   private static boolean a(deg $$0, je $$1) {
      eqp $$2 = $$0.b_($$1.d());
      return $$2.a(awz.a);
   }

   public static record a(String a, Map<cvk, kk> b) {
   }
}
