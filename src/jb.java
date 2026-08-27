import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Map;
import java.util.function.Predicate;

public interface jb {
   Map<String, jb.a> a = new Object2ObjectArrayMap();
   Codec<jb.a> b = atg.a(jb.a::a, a::get);
   jb.a c = a("empty");
   jb.a d = a("water");
   jb.a e = a("lava");
   jb.a f = a("powder_snow");
   jb g = ($$0, $$1, $$2, $$3, $$4, $$5) -> a($$1, $$2, $$3, $$4, $$5, cwb.fu.o().a(dah.g, Integer.valueOf(3)), arc.cE);
   jb h = ($$0, $$1, $$2, $$3, $$4, $$5) -> a($$1, $$2, $$3, $$4, $$5, cwb.fv.o(), arc.cH);
   jb i = ($$0, $$1, $$2, $$3, $$4, $$5) -> a($$1, $$2, $$3, $$4, $$5, cwb.fw.o().a(dah.g, Integer.valueOf(3)), arc.cI);
   jb j = ($$0, $$1, $$2, $$3, $$4, $$5) -> {
      cvz $$6 = cvz.a($$5.d());
      if (!($$6 instanceof dcx)) {
         return bjl.d;
      } else {
         if (!$$1.B) {
            cmh $$7 = new cmh(cwb.kP);
            if ($$5.u()) {
               $$7.c($$5.v().h());
            }

            $$3.a($$4, $$7);
            $$3.a(arm.Z);
            dah.d($$0, $$1, $$2);
         }

         return bjl.a($$1.B);
      }
   };
   jb k = ($$0, $$1, $$2, $$3, $$4, $$5) -> {
      if (dft.c($$5) <= 0) {
         return bjl.d;
      } else {
         if (!$$1.B) {
            cmh $$6 = $$5.c(1);
            dft.d($$6);
            if (!$$3.fT().d) {
               $$5.h(1);
            }

            if ($$5.b()) {
               $$3.a($$4, $$6);
            } else if ($$3.fS().e($$6)) {
               $$3.bR.b();
            } else {
               $$3.a($$6, false);
            }

            $$3.a(arm.Y);
            dah.d($$0, $$1, $$2);
         }

         return bjl.a($$1.B);
      }
   };
   jb l = ($$0, $$1, $$2, $$3, $$4, $$5) -> {
      if (!($$5.d() instanceof ckz $$7)) {
         return bjl.d;
      } else if (!$$7.a($$5)) {
         return bjl.d;
      } else {
         if (!$$1.B) {
            $$7.f_($$5);
            $$3.a(arm.X);
            dah.d($$0, $$1, $$2);
         }

         return bjl.a($$1.B);
      }
   };

   static jb.a a(String $$0) {
      Object2ObjectOpenHashMap<cmc, jb> $$1 = new Object2ObjectOpenHashMap();
      $$1.defaultReturnValue((jb)($$0x, $$1x, $$2x, $$3, $$4, $$5) -> bjl.d);
      jb.a $$2 = new jb.a($$0, $$1);
      a.put($$0, $$2);
      return $$2;
   }

   bjl interact(dip var1, csy var2, hv var3, cer var4, bjk var5, cmh var6);

   static void a() {
      Map<cmc, jb> $$0 = c.b();
      a($$0);
      $$0.put(cmk.sh, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> {
         if (cog.d($$5) != coh.c) {
            return bjl.d;
         } else {
            if (!$$1x.B) {
               cmc $$6 = $$5.d();
               $$3x.a($$4, cmj.a($$5, $$3x, new cmh(cmk.si)));
               $$3x.a(arm.W);
               $$3x.b(arm.c.b($$6));
               $$1x.b($$2x, cwb.fu.o());
               $$1x.a(null, $$2x, arc.ch, ard.e, 1.0F, 1.0F);
               $$1x.a(null, dmz.z, $$2x);
            }

            return bjl.a($$1x.B);
         }
      });
      Map<cmc, jb> $$1 = d.b();
      a($$1);
      $$1.put(cmk.qv, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> a($$0x, $$1x, $$2x, $$3x, $$4, $$5, new cmh(cmk.qw), $$0xx -> $$0xx.c(dah.g) == 3, arc.cK));
      $$1.put(cmk.si, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> {
         if (!$$1x.B) {
            cmc $$6 = $$5.d();
            $$3x.a($$4, cmj.a($$5, $$3x, cog.a(new cmh(cmk.sh), coh.c)));
            $$3x.a(arm.W);
            $$3x.b(arm.c.b($$6));
            dah.d($$0x, $$1x, $$2x);
            $$1x.a(null, $$2x, arc.ci, ard.e, 1.0F, 1.0F);
            $$1x.a(null, dmz.y, $$2x);
         }

         return bjl.a($$1x.B);
      });
      $$1.put(cmk.sh, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> {
         if ($$0x.c(dah.g) != 3 && cog.d($$5) == coh.c) {
            if (!$$1x.B) {
               $$3x.a($$4, cmj.a($$5, $$3x, new cmh(cmk.si)));
               $$3x.a(arm.W);
               $$3x.b(arm.c.b($$5.d()));
               $$1x.b($$2x, $$0x.a(dah.g));
               $$1x.a(null, $$2x, arc.ch, ard.e, 1.0F, 1.0F);
               $$1x.a(null, dmz.z, $$2x);
            }

            return bjl.a($$1x.B);
         } else {
            return bjl.d;
         }
      });
      $$1.put(cmk.py, l);
      $$1.put(cmk.px, l);
      $$1.put(cmk.pw, l);
      $$1.put(cmk.pv, l);
      $$1.put(cmk.uC, l);
      $$1.put(cmk.uI, k);
      $$1.put(cmk.uP, k);
      $$1.put(cmk.uX, k);
      $$1.put(cmk.uT, k);
      $$1.put(cmk.uU, k);
      $$1.put(cmk.uR, k);
      $$1.put(cmk.uV, k);
      $$1.put(cmk.uL, k);
      $$1.put(cmk.uQ, k);
      $$1.put(cmk.uN, k);
      $$1.put(cmk.uK, k);
      $$1.put(cmk.uJ, k);
      $$1.put(cmk.uO, k);
      $$1.put(cmk.uS, k);
      $$1.put(cmk.uW, k);
      $$1.put(cmk.uM, k);
      $$1.put(cmk.jc, j);
      $$1.put(cmk.jj, j);
      $$1.put(cmk.jr, j);
      $$1.put(cmk.jn, j);
      $$1.put(cmk.jo, j);
      $$1.put(cmk.jl, j);
      $$1.put(cmk.jp, j);
      $$1.put(cmk.jf, j);
      $$1.put(cmk.jk, j);
      $$1.put(cmk.jh, j);
      $$1.put(cmk.je, j);
      $$1.put(cmk.jd, j);
      $$1.put(cmk.ji, j);
      $$1.put(cmk.jm, j);
      $$1.put(cmk.jq, j);
      $$1.put(cmk.jg, j);
      Map<cmc, jb> $$2 = e.b();
      $$2.put(cmk.qv, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> a($$0x, $$1x, $$2x, $$3x, $$4, $$5, new cmh(cmk.qx), $$0xx -> true, arc.cN));
      a($$2);
      Map<cmc, jb> $$3 = f.b();
      $$3.put(cmk.qv, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> a($$0x, $$1x, $$2x, $$3x, $$4, $$5, new cmh(cmk.qy), $$0xx -> $$0xx.c(dah.g) == 3, arc.cO));
      a($$3);
   }

   static void a(Map<cmc, jb> $$0) {
      $$0.put(cmk.qx, h);
      $$0.put(cmk.qw, g);
      $$0.put(cmk.qy, i);
   }

   static bjl a(dip $$0, csy $$1, hv $$2, cer $$3, bjk $$4, cmh $$5, cmh $$6, Predicate<dip> $$7, arb $$8) {
      if (!$$7.test($$0)) {
         return bjl.d;
      } else {
         if (!$$1.B) {
            cmc $$9 = $$5.d();
            $$3.a($$4, cmj.a($$5, $$3, $$6));
            $$3.a(arm.W);
            $$3.b(arm.c.b($$9));
            $$1.b($$2, cwb.ft.o());
            $$1.a(null, $$2, $$8, ard.e, 1.0F, 1.0F);
            $$1.a(null, dmz.y, $$2);
         }

         return bjl.a($$1.B);
      }
   }

   static bjl a(csy $$0, hv $$1, cer $$2, bjk $$3, cmh $$4, dip $$5, arb $$6) {
      if (!$$0.B) {
         cmc $$7 = $$4.d();
         $$2.a($$3, cmj.a($$4, $$2, new cmh(cmk.qv)));
         $$2.a(arm.V);
         $$2.b(arm.c.b($$7));
         $$0.b($$1, $$5);
         $$0.a(null, $$1, $$6, ard.e, 1.0F, 1.0F);
         $$0.a(null, dmz.z, $$1);
      }

      return bjl.a($$0.B);
   }

   public static record a(String a, Map<cmc, jb> b) {
   }
}
