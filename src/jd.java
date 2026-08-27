import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Map;
import java.util.function.Predicate;

public interface jd {
   Map<String, jd.a> a = new Object2ObjectArrayMap();
   Codec<jd.a> b = atv.a(jd.a::a, a::get);
   jd.a c = a("empty");
   jd.a d = a("water");
   jd.a e = a("lava");
   jd.a f = a("powder_snow");
   jd g = ($$0, $$1, $$2, $$3, $$4, $$5) -> a($$1, $$2, $$3, $$4, $$5, cwr.fu.o().a(dax.g, Integer.valueOf(3)), arr.cE);
   jd h = ($$0, $$1, $$2, $$3, $$4, $$5) -> a($$1, $$2, $$3, $$4, $$5, cwr.fv.o(), arr.cH);
   jd i = ($$0, $$1, $$2, $$3, $$4, $$5) -> a($$1, $$2, $$3, $$4, $$5, cwr.fw.o().a(dax.g, Integer.valueOf(3)), arr.cI);
   jd j = ($$0, $$1, $$2, $$3, $$4, $$5) -> {
      cwp $$6 = cwp.a($$5.d());
      if (!($$6 instanceof ddn)) {
         return bka.d;
      } else {
         if (!$$1.B) {
            cmx $$7 = new cmx(cwr.kP);
            if ($$5.u()) {
               $$7.c($$5.v().h());
            }

            $$3.a($$4, $$7);
            $$3.a(asb.Z);
            dax.d($$0, $$1, $$2);
         }

         return bka.a($$1.B);
      }
   };
   jd k = ($$0, $$1, $$2, $$3, $$4, $$5) -> {
      if (dgk.c($$5) <= 0) {
         return bka.d;
      } else {
         if (!$$1.B) {
            cmx $$6 = $$5.c(1);
            dgk.d($$6);
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

            $$3.a(asb.Y);
            dax.d($$0, $$1, $$2);
         }

         return bka.a($$1.B);
      }
   };
   jd l = ($$0, $$1, $$2, $$3, $$4, $$5) -> {
      if (!($$5.d() instanceof clp $$7)) {
         return bka.d;
      } else if (!$$7.a($$5)) {
         return bka.d;
      } else {
         if (!$$1.B) {
            $$7.f_($$5);
            $$3.a(asb.X);
            dax.d($$0, $$1, $$2);
         }

         return bka.a($$1.B);
      }
   };

   static jd.a a(String $$0) {
      Object2ObjectOpenHashMap<cms, jd> $$1 = new Object2ObjectOpenHashMap();
      $$1.defaultReturnValue((jd)($$0x, $$1x, $$2x, $$3, $$4, $$5) -> bka.d);
      jd.a $$2 = new jd.a($$0, $$1);
      a.put($$0, $$2);
      return $$2;
   }

   bka interact(djg var1, cto var2, hx var3, cfh var4, bjz var5, cmx var6);

   static void a() {
      Map<cms, jd> $$0 = c.b();
      a($$0);
      $$0.put(cna.sh, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> {
         if (cox.d($$5) != coy.c) {
            return bka.d;
         } else {
            if (!$$1x.B) {
               cms $$6 = $$5.d();
               $$3x.a($$4, cmz.a($$5, $$3x, new cmx(cna.si)));
               $$3x.a(asb.W);
               $$3x.b(asb.c.b($$6));
               $$1x.b($$2x, cwr.fu.o());
               $$1x.a(null, $$2x, arr.ch, ars.e, 1.0F, 1.0F);
               $$1x.a(null, dnq.z, $$2x);
            }

            return bka.a($$1x.B);
         }
      });
      Map<cms, jd> $$1 = d.b();
      a($$1);
      $$1.put(cna.qv, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> a($$0x, $$1x, $$2x, $$3x, $$4, $$5, new cmx(cna.qw), $$0xx -> $$0xx.c(dax.g) == 3, arr.cK));
      $$1.put(cna.si, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> {
         if (!$$1x.B) {
            cms $$6 = $$5.d();
            $$3x.a($$4, cmz.a($$5, $$3x, cox.a(new cmx(cna.sh), coy.c)));
            $$3x.a(asb.W);
            $$3x.b(asb.c.b($$6));
            dax.d($$0x, $$1x, $$2x);
            $$1x.a(null, $$2x, arr.ci, ars.e, 1.0F, 1.0F);
            $$1x.a(null, dnq.y, $$2x);
         }

         return bka.a($$1x.B);
      });
      $$1.put(cna.sh, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> {
         if ($$0x.c(dax.g) != 3 && cox.d($$5) == coy.c) {
            if (!$$1x.B) {
               $$3x.a($$4, cmz.a($$5, $$3x, new cmx(cna.si)));
               $$3x.a(asb.W);
               $$3x.b(asb.c.b($$5.d()));
               $$1x.b($$2x, $$0x.a(dax.g));
               $$1x.a(null, $$2x, arr.ch, ars.e, 1.0F, 1.0F);
               $$1x.a(null, dnq.z, $$2x);
            }

            return bka.a($$1x.B);
         } else {
            return bka.d;
         }
      });
      $$1.put(cna.py, l);
      $$1.put(cna.px, l);
      $$1.put(cna.pw, l);
      $$1.put(cna.pv, l);
      $$1.put(cna.uC, l);
      $$1.put(cna.uI, k);
      $$1.put(cna.uP, k);
      $$1.put(cna.uX, k);
      $$1.put(cna.uT, k);
      $$1.put(cna.uU, k);
      $$1.put(cna.uR, k);
      $$1.put(cna.uV, k);
      $$1.put(cna.uL, k);
      $$1.put(cna.uQ, k);
      $$1.put(cna.uN, k);
      $$1.put(cna.uK, k);
      $$1.put(cna.uJ, k);
      $$1.put(cna.uO, k);
      $$1.put(cna.uS, k);
      $$1.put(cna.uW, k);
      $$1.put(cna.uM, k);
      $$1.put(cna.jc, j);
      $$1.put(cna.jj, j);
      $$1.put(cna.jr, j);
      $$1.put(cna.jn, j);
      $$1.put(cna.jo, j);
      $$1.put(cna.jl, j);
      $$1.put(cna.jp, j);
      $$1.put(cna.jf, j);
      $$1.put(cna.jk, j);
      $$1.put(cna.jh, j);
      $$1.put(cna.je, j);
      $$1.put(cna.jd, j);
      $$1.put(cna.ji, j);
      $$1.put(cna.jm, j);
      $$1.put(cna.jq, j);
      $$1.put(cna.jg, j);
      Map<cms, jd> $$2 = e.b();
      $$2.put(cna.qv, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> a($$0x, $$1x, $$2x, $$3x, $$4, $$5, new cmx(cna.qx), $$0xx -> true, arr.cN));
      a($$2);
      Map<cms, jd> $$3 = f.b();
      $$3.put(cna.qv, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> a($$0x, $$1x, $$2x, $$3x, $$4, $$5, new cmx(cna.qy), $$0xx -> $$0xx.c(dax.g) == 3, arr.cO));
      a($$3);
   }

   static void a(Map<cms, jd> $$0) {
      $$0.put(cna.qx, h);
      $$0.put(cna.qw, g);
      $$0.put(cna.qy, i);
   }

   static bka a(djg $$0, cto $$1, hx $$2, cfh $$3, bjz $$4, cmx $$5, cmx $$6, Predicate<djg> $$7, arq $$8) {
      if (!$$7.test($$0)) {
         return bka.d;
      } else {
         if (!$$1.B) {
            cms $$9 = $$5.d();
            $$3.a($$4, cmz.a($$5, $$3, $$6));
            $$3.a(asb.W);
            $$3.b(asb.c.b($$9));
            $$1.b($$2, cwr.ft.o());
            $$1.a(null, $$2, $$8, ars.e, 1.0F, 1.0F);
            $$1.a(null, dnq.y, $$2);
         }

         return bka.a($$1.B);
      }
   }

   static bka a(cto $$0, hx $$1, cfh $$2, bjz $$3, cmx $$4, djg $$5, arq $$6) {
      if (!$$0.B) {
         cms $$7 = $$4.d();
         $$2.a($$3, cmz.a($$4, $$2, new cmx(cna.qv)));
         $$2.a(asb.V);
         $$2.b(asb.c.b($$7));
         $$0.b($$1, $$5);
         $$0.a(null, $$1, $$6, ars.e, 1.0F, 1.0F);
         $$0.a(null, dnq.z, $$1);
      }

      return bka.a($$0.B);
   }

   public static record a(String a, Map<cms, jd> b) {
   }
}
