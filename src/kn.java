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
      Object2ObjectOpenHashMap<cvx, kn> $$1 = new Object2ObjectOpenHashMap();
      $$1.defaultReturnValue((kn)($$0x, $$1x, $$2x, $$3, $$4, $$5) -> bsd.f);
      kn.a $$2 = new kn.a($$0, $$1);
      a.put($$0, $$2);
      return $$2;
   }

   bsd interact(dvj var1, dfb var2, jh var3, com var4, bsc var5, cwb var6);

   static void a() {
      Map<cvx, kn> $$0 = c.b();
      a($$0);
      $$0.put(cwf.sm, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> {
         cya $$6 = $$5.a(ku.Q);
         if ($$6 != null && $$6.a(cyb.a)) {
            if (!$$1x.C) {
               cvx $$7 = $$5.h();
               $$3x.a($$4, cwe.a($$5, $$3x, new cwb(cwf.sl)));
               $$3x.a(awv.W);
               $$3x.b(awv.c.b($$7));
               $$1x.b($$2x, dig.fu.m());
               $$1x.a(null, $$2x, awl.cB, awm.e, 1.0F, 1.0F);
               $$1x.a(null, eag.z, $$2x);
            }

            return bsd.a;
         } else {
            return bsd.f;
         }
      });
      Map<cvx, kn> $$1 = d.b();
      a($$1);
      $$1.put(cwf.qz, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> a($$0x, $$1x, $$2x, $$3x, $$4, $$5, new cwb(cwf.qA), $$0xx -> $$0xx.c(dmm.g) == 3, awl.di));
      $$1.put(cwf.sl, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> {
         if (!$$1x.C) {
            cvx $$6 = $$5.h();
            $$3x.a($$4, cwe.a($$5, $$3x, cya.a(cwf.sm, cyb.a)));
            $$3x.a(awv.W);
            $$3x.b(awv.c.b($$6));
            dmm.e($$0x, $$1x, $$2x);
            $$1x.a(null, $$2x, awl.cC, awm.e, 1.0F, 1.0F);
            $$1x.a(null, eag.y, $$2x);
         }

         return bsd.a;
      });
      $$1.put(cwf.sm, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> {
         if ($$0x.c(dmm.g) == 3) {
            return bsd.f;
         } else {
            cya $$6 = $$5.a(ku.Q);
            if ($$6 != null && $$6.a(cyb.a)) {
               if (!$$1x.C) {
                  $$3x.a($$4, cwe.a($$5, $$3x, new cwb(cwf.sl)));
                  $$3x.a(awv.W);
                  $$3x.b(awv.c.b($$5.h()));
                  $$1x.b($$2x, $$0x.a(dmm.g));
                  $$1x.a(null, $$2x, awl.cB, awm.e, 1.0F, 1.0F);
                  $$1x.a(null, eag.z, $$2x);
               }

               return bsd.a;
            } else {
               return bsd.f;
            }
         }
      });
      $$1.put(cwf.pC, kn::f);
      $$1.put(cwf.pB, kn::f);
      $$1.put(cwf.pA, kn::f);
      $$1.put(cwf.pz, kn::f);
      $$1.put(cwf.uL, kn::f);
      $$1.put(cwf.os, kn::f);
      $$1.put(cwf.uR, kn::e);
      $$1.put(cwf.uY, kn::e);
      $$1.put(cwf.vg, kn::e);
      $$1.put(cwf.vc, kn::e);
      $$1.put(cwf.vd, kn::e);
      $$1.put(cwf.va, kn::e);
      $$1.put(cwf.ve, kn::e);
      $$1.put(cwf.uU, kn::e);
      $$1.put(cwf.uZ, kn::e);
      $$1.put(cwf.uW, kn::e);
      $$1.put(cwf.uT, kn::e);
      $$1.put(cwf.uS, kn::e);
      $$1.put(cwf.uX, kn::e);
      $$1.put(cwf.vb, kn::e);
      $$1.put(cwf.vf, kn::e);
      $$1.put(cwf.uV, kn::e);
      $$1.put(cwf.jd, kn::d);
      $$1.put(cwf.jk, kn::d);
      $$1.put(cwf.js, kn::d);
      $$1.put(cwf.jo, kn::d);
      $$1.put(cwf.jp, kn::d);
      $$1.put(cwf.jm, kn::d);
      $$1.put(cwf.jq, kn::d);
      $$1.put(cwf.jg, kn::d);
      $$1.put(cwf.jl, kn::d);
      $$1.put(cwf.ji, kn::d);
      $$1.put(cwf.jf, kn::d);
      $$1.put(cwf.je, kn::d);
      $$1.put(cwf.jj, kn::d);
      $$1.put(cwf.jn, kn::d);
      $$1.put(cwf.jr, kn::d);
      $$1.put(cwf.jh, kn::d);
      Map<cvx, kn> $$2 = e.b();
      $$2.put(cwf.qz, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> a($$0x, $$1x, $$2x, $$3x, $$4, $$5, new cwb(cwf.qB), $$0xx -> true, awl.dl));
      a($$2);
      Map<cvx, kn> $$3 = f.b();
      $$3.put(cwf.qz, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> a($$0x, $$1x, $$2x, $$3x, $$4, $$5, new cwb(cwf.qC), $$0xx -> $$0xx.c(dmm.g) == 3, awl.dm));
      a($$3);
   }

   static void a(Map<cvx, kn> $$0) {
      $$0.put(cwf.qB, kn::b);
      $$0.put(cwf.qA, kn::a);
      $$0.put(cwf.qC, kn::c);
   }

   static bsd a(dvj $$0, dfb $$1, jh $$2, com $$3, bsc $$4, cwb $$5, cwb $$6, Predicate<dvj> $$7, awk $$8) {
      if (!$$7.test($$0)) {
         return bsd.f;
      } else {
         if (!$$1.C) {
            cvx $$9 = $$5.h();
            $$3.a($$4, cwe.a($$5, $$3, $$6));
            $$3.a(awv.W);
            $$3.b(awv.c.b($$9));
            $$1.b($$2, dig.ft.m());
            $$1.a(null, $$2, $$8, awm.e, 1.0F, 1.0F);
            $$1.a(null, eag.y, $$2);
         }

         return bsd.a;
      }
   }

   static bsd a(dfb $$0, jh $$1, com $$2, bsc $$3, cwb $$4, dvj $$5, awk $$6) {
      if (!$$0.C) {
         cvx $$7 = $$4.h();
         $$2.a($$3, cwe.a($$4, $$2, new cwb(cwf.qz)));
         $$2.a(awv.V);
         $$2.b(awv.c.b($$7));
         $$0.b($$1, $$5);
         $$0.a(null, $$1, $$6, awm.e, 1.0F, 1.0F);
         $$0.a(null, eag.z, $$1);
      }

      return bsd.a;
   }

   private static bsd a(dvj $$0, dfb $$1, jh $$2, com $$3, bsc $$4, cwb $$5) {
      return a($$1, $$2, $$3, $$4, $$5, dig.fu.m().b(dmm.g, Integer.valueOf(3)), awl.dc);
   }

   private static bsd b(dvj $$0, dfb $$1, jh $$2, com $$3, bsc $$4, cwb $$5) {
      return (bsd)(a($$1, $$2) ? bsd.c : a($$1, $$2, $$3, $$4, $$5, dig.fv.m(), awl.df));
   }

   private static bsd c(dvj $$0, dfb $$1, jh $$2, com $$3, bsc $$4, cwb $$5) {
      return (bsd)(a($$1, $$2) ? bsd.c : a($$1, $$2, $$3, $$4, $$5, dig.fw.m().b(dmm.g, Integer.valueOf(3)), awl.dg));
   }

   private static bsd d(dvj $$0, dfb $$1, jh $$2, com $$3, bsc $$4, cwb $$5) {
      die $$6 = die.a($$5.h());
      if (!($$6 instanceof dpd)) {
         return bsd.f;
      } else {
         if (!$$1.C) {
            cwb $$7 = $$5.a(dig.kP, 1);
            $$3.a($$4, cwe.a($$5, $$3, $$7, false));
            $$3.a(awv.Z);
            dmm.e($$0, $$1, $$2);
         }

         return bsd.a;
      }
   }

   private static bsd e(dvj $$0, dfb $$1, jh $$2, com $$3, bsc $$4, cwb $$5) {
      dsd $$6 = $$5.a(ku.ai, dsd.a);
      if ($$6.b().isEmpty()) {
         return bsd.f;
      } else {
         if (!$$1.C) {
            cwb $$7 = $$5.c(1);
            $$7.b(ku.ai, $$6.a());
            $$3.a($$4, cwe.a($$5, $$3, $$7, false));
            $$3.a(awv.Y);
            dmm.e($$0, $$1, $$2);
         }

         return bsd.a;
      }
   }

   private static bsd f(dvj $$0, dfb $$1, jh $$2, com $$3, bsc $$4, cwb $$5) {
      if (!$$5.a(axj.bP)) {
         return bsd.f;
      } else if (!$$5.b(ku.J)) {
         return bsd.f;
      } else {
         if (!$$1.C) {
            $$5.c(ku.J);
            $$3.a(awv.X);
            dmm.e($$0, $$1, $$2);
         }

         return bsd.a;
      }
   }

   private static boolean a(dfb $$0, jh $$1) {
      erk $$2 = $$0.b_($$1.d());
      return $$2.a(axg.a);
   }

   public static record a(String a, Map<cvx, kn> b) {
   }
}
