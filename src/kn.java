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
      Object2ObjectOpenHashMap<cwi, kn> $$1 = new Object2ObjectOpenHashMap();
      $$1.defaultReturnValue((kn)($$0x, $$1x, $$2x, $$3, $$4, $$5) -> bsk.f);
      kn.a $$2 = new kn.a($$0, $$1);
      a.put($$0, $$2);
      return $$2;
   }

   bsk interact(dvv var1, dfm var2, jh var3, cou var4, bsj var5, cwm var6);

   static void a() {
      Map<cwi, kn> $$0 = c.b();
      a($$0);
      $$0.put(cwq.sC, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> {
         cyl $$6 = $$5.a(ku.Q);
         if ($$6 != null && $$6.a(cym.a)) {
            if (!$$1x.C) {
               cwi $$7 = $$5.h();
               $$3x.a($$4, cwp.a($$5, $$3x, new cwm(cwq.sB)));
               $$3x.a(awx.W);
               $$3x.b(awx.c.b($$7));
               $$1x.b($$2x, dis.fu.m());
               $$1x.a(null, $$2x, awn.cB, awo.e, 1.0F, 1.0F);
               $$1x.a(null, ear.z, $$2x);
            }

            return bsk.a;
         } else {
            return bsk.f;
         }
      });
      Map<cwi, kn> $$1 = d.b();
      a($$1);
      $$1.put(cwq.qz, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> a($$0x, $$1x, $$2x, $$3x, $$4, $$5, new cwm(cwq.qA), $$0xx -> $$0xx.c(dmy.g) == 3, awn.di));
      $$1.put(cwq.sB, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> {
         if (!$$1x.C) {
            cwi $$6 = $$5.h();
            $$3x.a($$4, cwp.a($$5, $$3x, cyl.a(cwq.sC, cym.a)));
            $$3x.a(awx.W);
            $$3x.b(awx.c.b($$6));
            dmy.e($$0x, $$1x, $$2x);
            $$1x.a(null, $$2x, awn.cC, awo.e, 1.0F, 1.0F);
            $$1x.a(null, ear.y, $$2x);
         }

         return bsk.a;
      });
      $$1.put(cwq.sC, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> {
         if ($$0x.c(dmy.g) == 3) {
            return bsk.f;
         } else {
            cyl $$6 = $$5.a(ku.Q);
            if ($$6 != null && $$6.a(cym.a)) {
               if (!$$1x.C) {
                  $$3x.a($$4, cwp.a($$5, $$3x, new cwm(cwq.sB)));
                  $$3x.a(awx.W);
                  $$3x.b(awx.c.b($$5.h()));
                  $$1x.b($$2x, $$0x.a(dmy.g));
                  $$1x.a(null, $$2x, awn.cB, awo.e, 1.0F, 1.0F);
                  $$1x.a(null, ear.z, $$2x);
               }

               return bsk.a;
            } else {
               return bsk.f;
            }
         }
      });
      $$1.put(cwq.pC, kn::f);
      $$1.put(cwq.pB, kn::f);
      $$1.put(cwq.pA, kn::f);
      $$1.put(cwq.pz, kn::f);
      $$1.put(cwq.vb, kn::f);
      $$1.put(cwq.os, kn::f);
      $$1.put(cwq.vh, kn::e);
      $$1.put(cwq.vo, kn::e);
      $$1.put(cwq.vw, kn::e);
      $$1.put(cwq.vs, kn::e);
      $$1.put(cwq.vt, kn::e);
      $$1.put(cwq.vq, kn::e);
      $$1.put(cwq.vu, kn::e);
      $$1.put(cwq.vk, kn::e);
      $$1.put(cwq.vp, kn::e);
      $$1.put(cwq.vm, kn::e);
      $$1.put(cwq.vj, kn::e);
      $$1.put(cwq.vi, kn::e);
      $$1.put(cwq.vn, kn::e);
      $$1.put(cwq.vr, kn::e);
      $$1.put(cwq.vv, kn::e);
      $$1.put(cwq.vl, kn::e);
      $$1.put(cwq.jd, kn::d);
      $$1.put(cwq.jk, kn::d);
      $$1.put(cwq.js, kn::d);
      $$1.put(cwq.jo, kn::d);
      $$1.put(cwq.jp, kn::d);
      $$1.put(cwq.jm, kn::d);
      $$1.put(cwq.jq, kn::d);
      $$1.put(cwq.jg, kn::d);
      $$1.put(cwq.jl, kn::d);
      $$1.put(cwq.ji, kn::d);
      $$1.put(cwq.jf, kn::d);
      $$1.put(cwq.je, kn::d);
      $$1.put(cwq.jj, kn::d);
      $$1.put(cwq.jn, kn::d);
      $$1.put(cwq.jr, kn::d);
      $$1.put(cwq.jh, kn::d);
      Map<cwi, kn> $$2 = e.b();
      $$2.put(cwq.qz, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> a($$0x, $$1x, $$2x, $$3x, $$4, $$5, new cwm(cwq.qB), $$0xx -> true, awn.dl));
      a($$2);
      Map<cwi, kn> $$3 = f.b();
      $$3.put(cwq.qz, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> a($$0x, $$1x, $$2x, $$3x, $$4, $$5, new cwm(cwq.qC), $$0xx -> $$0xx.c(dmy.g) == 3, awn.dm));
      a($$3);
   }

   static void a(Map<cwi, kn> $$0) {
      $$0.put(cwq.qB, kn::b);
      $$0.put(cwq.qA, kn::a);
      $$0.put(cwq.qC, kn::c);
   }

   static bsk a(dvv $$0, dfm $$1, jh $$2, cou $$3, bsj $$4, cwm $$5, cwm $$6, Predicate<dvv> $$7, awm $$8) {
      if (!$$7.test($$0)) {
         return bsk.f;
      } else {
         if (!$$1.C) {
            cwi $$9 = $$5.h();
            $$3.a($$4, cwp.a($$5, $$3, $$6));
            $$3.a(awx.W);
            $$3.b(awx.c.b($$9));
            $$1.b($$2, dis.ft.m());
            $$1.a(null, $$2, $$8, awo.e, 1.0F, 1.0F);
            $$1.a(null, ear.y, $$2);
         }

         return bsk.a;
      }
   }

   static bsk a(dfm $$0, jh $$1, cou $$2, bsj $$3, cwm $$4, dvv $$5, awm $$6) {
      if (!$$0.C) {
         cwi $$7 = $$4.h();
         $$2.a($$3, cwp.a($$4, $$2, new cwm(cwq.qz)));
         $$2.a(awx.V);
         $$2.b(awx.c.b($$7));
         $$0.b($$1, $$5);
         $$0.a(null, $$1, $$6, awo.e, 1.0F, 1.0F);
         $$0.a(null, ear.z, $$1);
      }

      return bsk.a;
   }

   private static bsk a(dvv $$0, dfm $$1, jh $$2, cou $$3, bsj $$4, cwm $$5) {
      return a($$1, $$2, $$3, $$4, $$5, dis.fu.m().b(dmy.g, Integer.valueOf(3)), awn.dc);
   }

   private static bsk b(dvv $$0, dfm $$1, jh $$2, cou $$3, bsj $$4, cwm $$5) {
      return (bsk)(a($$1, $$2) ? bsk.c : a($$1, $$2, $$3, $$4, $$5, dis.fv.m(), awn.df));
   }

   private static bsk c(dvv $$0, dfm $$1, jh $$2, cou $$3, bsj $$4, cwm $$5) {
      return (bsk)(a($$1, $$2) ? bsk.c : a($$1, $$2, $$3, $$4, $$5, dis.fw.m().b(dmy.g, Integer.valueOf(3)), awn.dg));
   }

   private static bsk d(dvv $$0, dfm $$1, jh $$2, cou $$3, bsj $$4, cwm $$5) {
      diq $$6 = diq.a($$5.h());
      if (!($$6 instanceof dpp)) {
         return bsk.f;
      } else {
         if (!$$1.C) {
            cwm $$7 = $$5.a(dis.kP, 1);
            $$3.a($$4, cwp.a($$5, $$3, $$7, false));
            $$3.a(awx.Z);
            dmy.e($$0, $$1, $$2);
         }

         return bsk.a;
      }
   }

   private static bsk e(dvv $$0, dfm $$1, jh $$2, cou $$3, bsj $$4, cwm $$5) {
      dsp $$6 = $$5.a(ku.ai, dsp.a);
      if ($$6.b().isEmpty()) {
         return bsk.f;
      } else {
         if (!$$1.C) {
            cwm $$7 = $$5.c(1);
            $$7.b(ku.ai, $$6.a());
            $$3.a($$4, cwp.a($$5, $$3, $$7, false));
            $$3.a(awx.Y);
            dmy.e($$0, $$1, $$2);
         }

         return bsk.a;
      }
   }

   private static bsk f(dvv $$0, dfm $$1, jh $$2, cou $$3, bsj $$4, cwm $$5) {
      if (!$$5.a(axl.bQ)) {
         return bsk.f;
      } else if (!$$5.b(ku.J)) {
         return bsk.f;
      } else {
         if (!$$1.C) {
            $$5.c(ku.J);
            $$3.a(awx.X);
            dmy.e($$0, $$1, $$2);
         }

         return bsk.a;
      }
   }

   private static boolean a(dfm $$0, jh $$1) {
      erv $$2 = $$0.b_($$1.d());
      return $$2.a(axi.a);
   }

   public static record a(String a, Map<cwi, kn> b) {
   }
}
