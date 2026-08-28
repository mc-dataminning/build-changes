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
      Object2ObjectOpenHashMap<cwb, kn> $$1 = new Object2ObjectOpenHashMap();
      $$1.defaultReturnValue((kn)($$0x, $$1x, $$2x, $$3, $$4, $$5) -> bsh.f);
      kn.a $$2 = new kn.a($$0, $$1);
      a.put($$0, $$2);
      return $$2;
   }

   bsh interact(dvo var1, dff var2, jh var3, cor var4, bsg var5, cwf var6);

   static void a() {
      Map<cwb, kn> $$0 = c.b();
      a($$0);
      $$0.put(cwj.sC, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> {
         cye $$6 = $$5.a(ku.Q);
         if ($$6 != null && $$6.a(cyf.a)) {
            if (!$$1x.C) {
               cwb $$7 = $$5.h();
               $$3x.a($$4, cwi.a($$5, $$3x, new cwf(cwj.sB)));
               $$3x.a(awy.W);
               $$3x.b(awy.c.b($$7));
               $$1x.b($$2x, dil.fu.m());
               $$1x.a(null, $$2x, awo.cB, awp.e, 1.0F, 1.0F);
               $$1x.a(null, eak.z, $$2x);
            }

            return bsh.a;
         } else {
            return bsh.f;
         }
      });
      Map<cwb, kn> $$1 = d.b();
      a($$1);
      $$1.put(cwj.qz, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> a($$0x, $$1x, $$2x, $$3x, $$4, $$5, new cwf(cwj.qA), $$0xx -> $$0xx.c(dmr.g) == 3, awo.di));
      $$1.put(cwj.sB, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> {
         if (!$$1x.C) {
            cwb $$6 = $$5.h();
            $$3x.a($$4, cwi.a($$5, $$3x, cye.a(cwj.sC, cyf.a)));
            $$3x.a(awy.W);
            $$3x.b(awy.c.b($$6));
            dmr.e($$0x, $$1x, $$2x);
            $$1x.a(null, $$2x, awo.cC, awp.e, 1.0F, 1.0F);
            $$1x.a(null, eak.y, $$2x);
         }

         return bsh.a;
      });
      $$1.put(cwj.sC, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> {
         if ($$0x.c(dmr.g) == 3) {
            return bsh.f;
         } else {
            cye $$6 = $$5.a(ku.Q);
            if ($$6 != null && $$6.a(cyf.a)) {
               if (!$$1x.C) {
                  $$3x.a($$4, cwi.a($$5, $$3x, new cwf(cwj.sB)));
                  $$3x.a(awy.W);
                  $$3x.b(awy.c.b($$5.h()));
                  $$1x.b($$2x, $$0x.a(dmr.g));
                  $$1x.a(null, $$2x, awo.cB, awp.e, 1.0F, 1.0F);
                  $$1x.a(null, eak.z, $$2x);
               }

               return bsh.a;
            } else {
               return bsh.f;
            }
         }
      });
      $$1.put(cwj.pC, kn::f);
      $$1.put(cwj.pB, kn::f);
      $$1.put(cwj.pA, kn::f);
      $$1.put(cwj.pz, kn::f);
      $$1.put(cwj.vb, kn::f);
      $$1.put(cwj.os, kn::f);
      $$1.put(cwj.vh, kn::e);
      $$1.put(cwj.vo, kn::e);
      $$1.put(cwj.vw, kn::e);
      $$1.put(cwj.vs, kn::e);
      $$1.put(cwj.vt, kn::e);
      $$1.put(cwj.vq, kn::e);
      $$1.put(cwj.vu, kn::e);
      $$1.put(cwj.vk, kn::e);
      $$1.put(cwj.vp, kn::e);
      $$1.put(cwj.vm, kn::e);
      $$1.put(cwj.vj, kn::e);
      $$1.put(cwj.vi, kn::e);
      $$1.put(cwj.vn, kn::e);
      $$1.put(cwj.vr, kn::e);
      $$1.put(cwj.vv, kn::e);
      $$1.put(cwj.vl, kn::e);
      $$1.put(cwj.jd, kn::d);
      $$1.put(cwj.jk, kn::d);
      $$1.put(cwj.js, kn::d);
      $$1.put(cwj.jo, kn::d);
      $$1.put(cwj.jp, kn::d);
      $$1.put(cwj.jm, kn::d);
      $$1.put(cwj.jq, kn::d);
      $$1.put(cwj.jg, kn::d);
      $$1.put(cwj.jl, kn::d);
      $$1.put(cwj.ji, kn::d);
      $$1.put(cwj.jf, kn::d);
      $$1.put(cwj.je, kn::d);
      $$1.put(cwj.jj, kn::d);
      $$1.put(cwj.jn, kn::d);
      $$1.put(cwj.jr, kn::d);
      $$1.put(cwj.jh, kn::d);
      Map<cwb, kn> $$2 = e.b();
      $$2.put(cwj.qz, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> a($$0x, $$1x, $$2x, $$3x, $$4, $$5, new cwf(cwj.qB), $$0xx -> true, awo.dl));
      a($$2);
      Map<cwb, kn> $$3 = f.b();
      $$3.put(cwj.qz, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> a($$0x, $$1x, $$2x, $$3x, $$4, $$5, new cwf(cwj.qC), $$0xx -> $$0xx.c(dmr.g) == 3, awo.dm));
      a($$3);
   }

   static void a(Map<cwb, kn> $$0) {
      $$0.put(cwj.qB, kn::b);
      $$0.put(cwj.qA, kn::a);
      $$0.put(cwj.qC, kn::c);
   }

   static bsh a(dvo $$0, dff $$1, jh $$2, cor $$3, bsg $$4, cwf $$5, cwf $$6, Predicate<dvo> $$7, awn $$8) {
      if (!$$7.test($$0)) {
         return bsh.f;
      } else {
         if (!$$1.C) {
            cwb $$9 = $$5.h();
            $$3.a($$4, cwi.a($$5, $$3, $$6));
            $$3.a(awy.W);
            $$3.b(awy.c.b($$9));
            $$1.b($$2, dil.ft.m());
            $$1.a(null, $$2, $$8, awp.e, 1.0F, 1.0F);
            $$1.a(null, eak.y, $$2);
         }

         return bsh.a;
      }
   }

   static bsh a(dff $$0, jh $$1, cor $$2, bsg $$3, cwf $$4, dvo $$5, awn $$6) {
      if (!$$0.C) {
         cwb $$7 = $$4.h();
         $$2.a($$3, cwi.a($$4, $$2, new cwf(cwj.qz)));
         $$2.a(awy.V);
         $$2.b(awy.c.b($$7));
         $$0.b($$1, $$5);
         $$0.a(null, $$1, $$6, awp.e, 1.0F, 1.0F);
         $$0.a(null, eak.z, $$1);
      }

      return bsh.a;
   }

   private static bsh a(dvo $$0, dff $$1, jh $$2, cor $$3, bsg $$4, cwf $$5) {
      return a($$1, $$2, $$3, $$4, $$5, dil.fu.m().b(dmr.g, Integer.valueOf(3)), awo.dc);
   }

   private static bsh b(dvo $$0, dff $$1, jh $$2, cor $$3, bsg $$4, cwf $$5) {
      return (bsh)(a($$1, $$2) ? bsh.c : a($$1, $$2, $$3, $$4, $$5, dil.fv.m(), awo.df));
   }

   private static bsh c(dvo $$0, dff $$1, jh $$2, cor $$3, bsg $$4, cwf $$5) {
      return (bsh)(a($$1, $$2) ? bsh.c : a($$1, $$2, $$3, $$4, $$5, dil.fw.m().b(dmr.g, Integer.valueOf(3)), awo.dg));
   }

   private static bsh d(dvo $$0, dff $$1, jh $$2, cor $$3, bsg $$4, cwf $$5) {
      dij $$6 = dij.a($$5.h());
      if (!($$6 instanceof dpi)) {
         return bsh.f;
      } else {
         if (!$$1.C) {
            cwf $$7 = $$5.a(dil.kP, 1);
            $$3.a($$4, cwi.a($$5, $$3, $$7, false));
            $$3.a(awy.Z);
            dmr.e($$0, $$1, $$2);
         }

         return bsh.a;
      }
   }

   private static bsh e(dvo $$0, dff $$1, jh $$2, cor $$3, bsg $$4, cwf $$5) {
      dsi $$6 = $$5.a(ku.ai, dsi.a);
      if ($$6.b().isEmpty()) {
         return bsh.f;
      } else {
         if (!$$1.C) {
            cwf $$7 = $$5.c(1);
            $$7.b(ku.ai, $$6.a());
            $$3.a($$4, cwi.a($$5, $$3, $$7, false));
            $$3.a(awy.Y);
            dmr.e($$0, $$1, $$2);
         }

         return bsh.a;
      }
   }

   private static bsh f(dvo $$0, dff $$1, jh $$2, cor $$3, bsg $$4, cwf $$5) {
      if (!$$5.a(axm.bQ)) {
         return bsh.f;
      } else if (!$$5.b(ku.J)) {
         return bsh.f;
      } else {
         if (!$$1.C) {
            $$5.c(ku.J);
            $$3.a(awy.X);
            dmr.e($$0, $$1, $$2);
         }

         return bsh.a;
      }
   }

   private static boolean a(dff $$0, jh $$1) {
      ero $$2 = $$0.b_($$1.d());
      return $$2.a(axj.a);
   }

   public static record a(String a, Map<cwb, kn> b) {
   }
}
