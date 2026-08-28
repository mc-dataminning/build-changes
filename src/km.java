import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Map;
import java.util.function.Predicate;

public interface km {
   Map<String, km.a> a = new Object2ObjectArrayMap();
   Codec<km.a> b = Codec.stringResolver(km.a::a, a::get);
   km.a c = a("empty");
   km.a d = a("water");
   km.a e = a("lava");
   km.a f = a("powder_snow");

   static km.a a(String $$0) {
      Object2ObjectOpenHashMap<cvt, km> $$1 = new Object2ObjectOpenHashMap();
      $$1.defaultReturnValue((km)($$0x, $$1x, $$2x, $$3, $$4, $$5) -> bry.f);
      km.a $$2 = new km.a($$0, $$1);
      a.put($$0, $$2);
      return $$2;
   }

   bry interact(dvd var1, dev var2, jg var3, coh var4, brx var5, cvx var6);

   static void a() {
      Map<cvt, km> $$0 = c.b();
      a($$0);
      $$0.put(cwb.sm, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> {
         cxw $$6 = $$5.a(kt.P);
         if ($$6 != null && $$6.a(cxx.a)) {
            if (!$$1x.C) {
               cvt $$7 = $$5.h();
               $$3x.a($$4, cwa.a($$5, $$3x, new cvx(cwb.sl)));
               $$3x.a(awu.W);
               $$3x.b(awu.c.b($$7));
               $$1x.b($$2x, dia.fu.m());
               $$1x.a(null, $$2x, awk.cB, awl.e, 1.0F, 1.0F);
               $$1x.a(null, eaa.z, $$2x);
            }

            return bry.a;
         } else {
            return bry.f;
         }
      });
      Map<cvt, km> $$1 = d.b();
      a($$1);
      $$1.put(cwb.qz, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> a($$0x, $$1x, $$2x, $$3x, $$4, $$5, new cvx(cwb.qA), $$0xx -> $$0xx.c(dmg.g) == 3, awk.di));
      $$1.put(cwb.sl, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> {
         if (!$$1x.C) {
            cvt $$6 = $$5.h();
            $$3x.a($$4, cwa.a($$5, $$3x, cxw.a(cwb.sm, cxx.a)));
            $$3x.a(awu.W);
            $$3x.b(awu.c.b($$6));
            dmg.e($$0x, $$1x, $$2x);
            $$1x.a(null, $$2x, awk.cC, awl.e, 1.0F, 1.0F);
            $$1x.a(null, eaa.y, $$2x);
         }

         return bry.a;
      });
      $$1.put(cwb.sm, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> {
         if ($$0x.c(dmg.g) == 3) {
            return bry.f;
         } else {
            cxw $$6 = $$5.a(kt.P);
            if ($$6 != null && $$6.a(cxx.a)) {
               if (!$$1x.C) {
                  $$3x.a($$4, cwa.a($$5, $$3x, new cvx(cwb.sl)));
                  $$3x.a(awu.W);
                  $$3x.b(awu.c.b($$5.h()));
                  $$1x.b($$2x, $$0x.a(dmg.g));
                  $$1x.a(null, $$2x, awk.cB, awl.e, 1.0F, 1.0F);
                  $$1x.a(null, eaa.z, $$2x);
               }

               return bry.a;
            } else {
               return bry.f;
            }
         }
      });
      $$1.put(cwb.pC, km::f);
      $$1.put(cwb.pB, km::f);
      $$1.put(cwb.pA, km::f);
      $$1.put(cwb.pz, km::f);
      $$1.put(cwb.uL, km::f);
      $$1.put(cwb.os, km::f);
      $$1.put(cwb.uR, km::e);
      $$1.put(cwb.uY, km::e);
      $$1.put(cwb.vg, km::e);
      $$1.put(cwb.vc, km::e);
      $$1.put(cwb.vd, km::e);
      $$1.put(cwb.va, km::e);
      $$1.put(cwb.ve, km::e);
      $$1.put(cwb.uU, km::e);
      $$1.put(cwb.uZ, km::e);
      $$1.put(cwb.uW, km::e);
      $$1.put(cwb.uT, km::e);
      $$1.put(cwb.uS, km::e);
      $$1.put(cwb.uX, km::e);
      $$1.put(cwb.vb, km::e);
      $$1.put(cwb.vf, km::e);
      $$1.put(cwb.uV, km::e);
      $$1.put(cwb.jd, km::d);
      $$1.put(cwb.jk, km::d);
      $$1.put(cwb.js, km::d);
      $$1.put(cwb.jo, km::d);
      $$1.put(cwb.jp, km::d);
      $$1.put(cwb.jm, km::d);
      $$1.put(cwb.jq, km::d);
      $$1.put(cwb.jg, km::d);
      $$1.put(cwb.jl, km::d);
      $$1.put(cwb.ji, km::d);
      $$1.put(cwb.jf, km::d);
      $$1.put(cwb.je, km::d);
      $$1.put(cwb.jj, km::d);
      $$1.put(cwb.jn, km::d);
      $$1.put(cwb.jr, km::d);
      $$1.put(cwb.jh, km::d);
      Map<cvt, km> $$2 = e.b();
      $$2.put(cwb.qz, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> a($$0x, $$1x, $$2x, $$3x, $$4, $$5, new cvx(cwb.qB), $$0xx -> true, awk.dl));
      a($$2);
      Map<cvt, km> $$3 = f.b();
      $$3.put(cwb.qz, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> a($$0x, $$1x, $$2x, $$3x, $$4, $$5, new cvx(cwb.qC), $$0xx -> $$0xx.c(dmg.g) == 3, awk.dm));
      a($$3);
   }

   static void a(Map<cvt, km> $$0) {
      $$0.put(cwb.qB, km::b);
      $$0.put(cwb.qA, km::a);
      $$0.put(cwb.qC, km::c);
   }

   static bry a(dvd $$0, dev $$1, jg $$2, coh $$3, brx $$4, cvx $$5, cvx $$6, Predicate<dvd> $$7, awj $$8) {
      if (!$$7.test($$0)) {
         return bry.f;
      } else {
         if (!$$1.C) {
            cvt $$9 = $$5.h();
            $$3.a($$4, cwa.a($$5, $$3, $$6));
            $$3.a(awu.W);
            $$3.b(awu.c.b($$9));
            $$1.b($$2, dia.ft.m());
            $$1.a(null, $$2, $$8, awl.e, 1.0F, 1.0F);
            $$1.a(null, eaa.y, $$2);
         }

         return bry.a;
      }
   }

   static bry a(dev $$0, jg $$1, coh $$2, brx $$3, cvx $$4, dvd $$5, awj $$6) {
      if (!$$0.C) {
         cvt $$7 = $$4.h();
         $$2.a($$3, cwa.a($$4, $$2, new cvx(cwb.qz)));
         $$2.a(awu.V);
         $$2.b(awu.c.b($$7));
         $$0.b($$1, $$5);
         $$0.a(null, $$1, $$6, awl.e, 1.0F, 1.0F);
         $$0.a(null, eaa.z, $$1);
      }

      return bry.a;
   }

   private static bry a(dvd $$0, dev $$1, jg $$2, coh $$3, brx $$4, cvx $$5) {
      return a($$1, $$2, $$3, $$4, $$5, dia.fu.m().b(dmg.g, Integer.valueOf(3)), awk.dc);
   }

   private static bry b(dvd $$0, dev $$1, jg $$2, coh $$3, brx $$4, cvx $$5) {
      return (bry)(a($$1, $$2) ? bry.c : a($$1, $$2, $$3, $$4, $$5, dia.fv.m(), awk.df));
   }

   private static bry c(dvd $$0, dev $$1, jg $$2, coh $$3, brx $$4, cvx $$5) {
      return (bry)(a($$1, $$2) ? bry.c : a($$1, $$2, $$3, $$4, $$5, dia.fw.m().b(dmg.g, Integer.valueOf(3)), awk.dg));
   }

   private static bry d(dvd $$0, dev $$1, jg $$2, coh $$3, brx $$4, cvx $$5) {
      dhy $$6 = dhy.a($$5.h());
      if (!($$6 instanceof dox)) {
         return bry.f;
      } else {
         if (!$$1.C) {
            cvx $$7 = $$5.a(dia.kP, 1);
            $$3.a($$4, cwa.a($$5, $$3, $$7, false));
            $$3.a(awu.Z);
            dmg.e($$0, $$1, $$2);
         }

         return bry.a;
      }
   }

   private static bry e(dvd $$0, dev $$1, jg $$2, coh $$3, brx $$4, cvx $$5) {
      drx $$6 = $$5.a(kt.ah, drx.a);
      if ($$6.b().isEmpty()) {
         return bry.f;
      } else {
         if (!$$1.C) {
            cvx $$7 = $$5.c(1);
            $$7.b(kt.ah, $$6.a());
            $$3.a($$4, cwa.a($$5, $$3, $$7, false));
            $$3.a(awu.Y);
            dmg.e($$0, $$1, $$2);
         }

         return bry.a;
      }
   }

   private static bry f(dvd $$0, dev $$1, jg $$2, coh $$3, brx $$4, cvx $$5) {
      if (!$$5.a(axi.bM)) {
         return bry.f;
      } else if (!$$5.b(kt.I)) {
         return bry.f;
      } else {
         if (!$$1.C) {
            $$5.c(kt.I);
            $$3.a(awu.X);
            dmg.e($$0, $$1, $$2);
         }

         return bry.a;
      }
   }

   private static boolean a(dev $$0, jg $$1) {
      ere $$2 = $$0.b_($$1.d());
      return $$2.a(axf.a);
   }

   public static record a(String a, Map<cvt, km> b) {
   }
}
