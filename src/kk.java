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
      Object2ObjectOpenHashMap<cvg, kk> $$1 = new Object2ObjectOpenHashMap();
      $$1.defaultReturnValue((kk)($$0x, $$1x, $$2x, $$3, $$4, $$5) -> brk.f);
      kk.a $$2 = new kk.a($$0, $$1);
      a.put($$0, $$2);
      return $$2;
   }

   brk interact(dua var1, dds var2, je var3, cnp var4, brj var5, cvl var6);

   static void a() {
      Map<cvg, kk> $$0 = c.b();
      a($$0);
      $$0.put(cvo.sl, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> {
         cxn $$6 = $$5.a(kr.I);
         if ($$6 != null && $$6.a(cxo.a)) {
            if (!$$1x.B) {
               cvg $$7 = $$5.h();
               $$3x.a($$4, cvn.a($$5, $$3x, new cvl(cvo.sm)));
               $$3x.a(awn.W);
               $$3x.b(awn.c.b($$7));
               $$1x.b($$2x, dgx.fu.o());
               $$1x.a(null, $$2x, awd.cB, awe.e, 1.0F, 1.0F);
               $$1x.a(null, dyx.z, $$2x);
            }

            return brk.a;
         } else {
            return brk.f;
         }
      });
      Map<cvg, kk> $$1 = d.b();
      a($$1);
      $$1.put(cvo.qz, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> a($$0x, $$1x, $$2x, $$3x, $$4, $$5, new cvl(cvo.qA), $$0xx -> $$0xx.c(dle.g) == 3, awd.di));
      $$1.put(cvo.sm, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> {
         if (!$$1x.B) {
            cvg $$6 = $$5.h();
            $$3x.a($$4, cvn.a($$5, $$3x, cxn.a(cvo.sl, cxo.a)));
            $$3x.a(awn.W);
            $$3x.b(awn.c.b($$6));
            dle.d($$0x, $$1x, $$2x);
            $$1x.a(null, $$2x, awd.cC, awe.e, 1.0F, 1.0F);
            $$1x.a(null, dyx.y, $$2x);
         }

         return brk.a;
      });
      $$1.put(cvo.sl, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> {
         if ($$0x.c(dle.g) == 3) {
            return brk.f;
         } else {
            cxn $$6 = $$5.a(kr.I);
            if ($$6 != null && $$6.a(cxo.a)) {
               if (!$$1x.B) {
                  $$3x.a($$4, cvn.a($$5, $$3x, new cvl(cvo.sm)));
                  $$3x.a(awn.W);
                  $$3x.b(awn.c.b($$5.h()));
                  $$1x.b($$2x, $$0x.a(dle.g));
                  $$1x.a(null, $$2x, awd.cB, awe.e, 1.0F, 1.0F);
                  $$1x.a(null, dyx.z, $$2x);
               }

               return brk.a;
            } else {
               return brk.f;
            }
         }
      });
      $$1.put(cvo.pC, kk::f);
      $$1.put(cvo.pB, kk::f);
      $$1.put(cvo.pA, kk::f);
      $$1.put(cvo.pz, kk::f);
      $$1.put(cvo.uL, kk::f);
      $$1.put(cvo.os, kk::f);
      $$1.put(cvo.uR, kk::e);
      $$1.put(cvo.uY, kk::e);
      $$1.put(cvo.vg, kk::e);
      $$1.put(cvo.vc, kk::e);
      $$1.put(cvo.vd, kk::e);
      $$1.put(cvo.va, kk::e);
      $$1.put(cvo.ve, kk::e);
      $$1.put(cvo.uU, kk::e);
      $$1.put(cvo.uZ, kk::e);
      $$1.put(cvo.uW, kk::e);
      $$1.put(cvo.uT, kk::e);
      $$1.put(cvo.uS, kk::e);
      $$1.put(cvo.uX, kk::e);
      $$1.put(cvo.vb, kk::e);
      $$1.put(cvo.vf, kk::e);
      $$1.put(cvo.uV, kk::e);
      $$1.put(cvo.jd, kk::d);
      $$1.put(cvo.jk, kk::d);
      $$1.put(cvo.js, kk::d);
      $$1.put(cvo.jo, kk::d);
      $$1.put(cvo.jp, kk::d);
      $$1.put(cvo.jm, kk::d);
      $$1.put(cvo.jq, kk::d);
      $$1.put(cvo.jg, kk::d);
      $$1.put(cvo.jl, kk::d);
      $$1.put(cvo.ji, kk::d);
      $$1.put(cvo.jf, kk::d);
      $$1.put(cvo.je, kk::d);
      $$1.put(cvo.jj, kk::d);
      $$1.put(cvo.jn, kk::d);
      $$1.put(cvo.jr, kk::d);
      $$1.put(cvo.jh, kk::d);
      Map<cvg, kk> $$2 = e.b();
      $$2.put(cvo.qz, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> a($$0x, $$1x, $$2x, $$3x, $$4, $$5, new cvl(cvo.qB), $$0xx -> true, awd.dl));
      a($$2);
      Map<cvg, kk> $$3 = f.b();
      $$3.put(cvo.qz, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> a($$0x, $$1x, $$2x, $$3x, $$4, $$5, new cvl(cvo.qC), $$0xx -> $$0xx.c(dle.g) == 3, awd.dm));
      a($$3);
   }

   static void a(Map<cvg, kk> $$0) {
      $$0.put(cvo.qB, kk::b);
      $$0.put(cvo.qA, kk::a);
      $$0.put(cvo.qC, kk::c);
   }

   static brk a(dua $$0, dds $$1, je $$2, cnp $$3, brj $$4, cvl $$5, cvl $$6, Predicate<dua> $$7, awc $$8) {
      if (!$$7.test($$0)) {
         return brk.f;
      } else {
         if (!$$1.B) {
            cvg $$9 = $$5.h();
            $$3.a($$4, cvn.a($$5, $$3, $$6));
            $$3.a(awn.W);
            $$3.b(awn.c.b($$9));
            $$1.b($$2, dgx.ft.o());
            $$1.a(null, $$2, $$8, awe.e, 1.0F, 1.0F);
            $$1.a(null, dyx.y, $$2);
         }

         return brk.a;
      }
   }

   static brk a(dds $$0, je $$1, cnp $$2, brj $$3, cvl $$4, dua $$5, awc $$6) {
      if (!$$0.B) {
         cvg $$7 = $$4.h();
         $$2.a($$3, cvn.a($$4, $$2, new cvl(cvo.qz)));
         $$2.a(awn.V);
         $$2.b(awn.c.b($$7));
         $$0.b($$1, $$5);
         $$0.a(null, $$1, $$6, awe.e, 1.0F, 1.0F);
         $$0.a(null, dyx.z, $$1);
      }

      return brk.a;
   }

   private static brk a(dua $$0, dds $$1, je $$2, cnp $$3, brj $$4, cvl $$5) {
      return (brk)(a($$1, $$2) ? brk.a : a($$1, $$2, $$3, $$4, $$5, dgx.fu.o().b(dle.g, Integer.valueOf(3)), awd.dc));
   }

   private static brk b(dua $$0, dds $$1, je $$2, cnp $$3, brj $$4, cvl $$5) {
      return (brk)(a($$1, $$2) ? brk.a : a($$1, $$2, $$3, $$4, $$5, dgx.fv.o(), awd.df));
   }

   private static brk c(dua $$0, dds $$1, je $$2, cnp $$3, brj $$4, cvl $$5) {
      return (brk)(a($$1, $$2) ? brk.a : a($$1, $$2, $$3, $$4, $$5, dgx.fw.o().b(dle.g, Integer.valueOf(3)), awd.dg));
   }

   private static brk d(dua $$0, dds $$1, je $$2, cnp $$3, brj $$4, cvl $$5) {
      dgv $$6 = dgv.a($$5.h());
      if (!($$6 instanceof dnv)) {
         return brk.f;
      } else {
         if (!$$1.B) {
            cvl $$7 = $$5.a(dgx.kP, 1);
            $$3.a($$4, cvn.a($$5, $$3, $$7, false));
            $$3.a(awn.Z);
            dle.d($$0, $$1, $$2);
         }

         return brk.a;
      }
   }

   private static brk e(dua $$0, dds $$1, je $$2, cnp $$3, brj $$4, cvl $$5) {
      dqv $$6 = $$5.a(kr.aa, dqv.a);
      if ($$6.b().isEmpty()) {
         return brk.f;
      } else {
         if (!$$1.B) {
            cvl $$7 = $$5.c(1);
            $$7.b(kr.aa, $$6.a());
            $$3.a($$4, cvn.a($$5, $$3, $$7, false));
            $$3.a(awn.Y);
            dle.d($$0, $$1, $$2);
         }

         return brk.a;
      }
   }

   private static brk f(dua $$0, dds $$1, je $$2, cnp $$3, brj $$4, cvl $$5) {
      if (!$$5.a(axb.bD)) {
         return brk.f;
      } else if (!$$5.b(kr.B)) {
         return brk.f;
      } else {
         if (!$$1.B) {
            $$5.c(kr.B);
            $$3.a(awn.X);
            dle.d($$0, $$1, $$2);
         }

         return brk.a;
      }
   }

   private static boolean a(dds $$0, je $$1) {
      eqb $$2 = $$0.b_($$1.d());
      return $$2.a(awy.a);
   }

   public static record a(String a, Map<cvg, kk> b) {
   }
}
