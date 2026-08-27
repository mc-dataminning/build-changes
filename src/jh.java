import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Map;
import java.util.function.Predicate;

public interface jh {
   Map<String, jh.a> a = new Object2ObjectArrayMap();
   Codec<jh.a> b = avu.a(jh.a::a, a::get);
   jh.a c = a("empty");
   jh.a d = a("water");
   jh.a e = a("lava");
   jh.a f = a("powder_snow");
   jh g = ($$0, $$1, $$2, $$3, $$4, $$5) -> a($$1, $$2, $$3, $$4, $$5, czh.fu.o().a(ddn.g, Integer.valueOf(3)), atp.cU);
   jh h = ($$0, $$1, $$2, $$3, $$4, $$5) -> a($$1, $$2, $$3, $$4, $$5, czh.fv.o(), atp.cX);
   jh i = ($$0, $$1, $$2, $$3, $$4, $$5) -> a($$1, $$2, $$3, $$4, $$5, czh.fw.o().a(ddn.g, Integer.valueOf(3)), atp.cY);
   jh j = ($$0, $$1, $$2, $$3, $$4, $$5) -> {
      czf $$6 = czf.a($$5.d());
      if (!($$6 instanceof dgd)) {
         return bmn.d;
      } else {
         if (!$$1.B) {
            $$3.a($$4, $$5.a(czh.kP, 1));
            $$3.a(atz.Z);
            ddn.d($$0, $$1, $$2);
         }

         return bmn.a($$1.B);
      }
   };
   jh k = ($$0, $$1, $$2, $$3, $$4, $$5) -> {
      if (djb.c($$5) <= 0) {
         return bmn.d;
      } else {
         if (!$$1.B) {
            cpq $$6 = $$5.c(1);
            djb.d($$6);
            if (!$$3.fW().d) {
               $$5.h(1);
            }

            if ($$5.b()) {
               $$3.a($$4, $$6);
            } else if ($$3.fV().e($$6)) {
               $$3.bW.b();
            } else {
               $$3.a($$6, false);
            }

            $$3.a(atz.Y);
            ddn.d($$0, $$1, $$2);
         }

         return bmn.a($$1.B);
      }
   };
   jh l = ($$0, $$1, $$2, $$3, $$4, $$5) -> {
      if (!$$5.a(aum.ba)) {
         return bmn.d;
      } else if (!coi.a($$5)) {
         return bmn.d;
      } else {
         if (!$$1.B) {
            coi.c($$5);
            $$3.a(atz.X);
            ddn.d($$0, $$1, $$2);
         }

         return bmn.a($$1.B);
      }
   };

   static jh.a a(String $$0) {
      Object2ObjectOpenHashMap<cpl, jh> $$1 = new Object2ObjectOpenHashMap();
      $$1.defaultReturnValue((jh)($$0x, $$1x, $$2x, $$3, $$4, $$5) -> bmn.d);
      jh.a $$2 = new jh.a($$0, $$1);
      a.put($$0, $$2);
      return $$2;
   }

   bmn interact(dme var1, cwe var2, ib var3, cia var4, bmk var5, cpq var6);

   static void a() {
      Map<cpl, jh> $$0 = c.b();
      a($$0);
      $$0.put(cpt.sj, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> {
         if (!cro.d($$5).a(crp.c)) {
            return bmn.d;
         } else {
            if (!$$1x.B) {
               cpl $$6 = $$5.d();
               $$3x.a($$4, cps.a($$5, $$3x, new cpq(cpt.sk)));
               $$3x.a(atz.W);
               $$3x.b(atz.c.b($$6));
               $$1x.b($$2x, czh.fu.o());
               $$1x.a(null, $$2x, atp.cu, atq.e, 1.0F, 1.0F);
               $$1x.a(null, dqr.z, $$2x);
            }

            return bmn.a($$1x.B);
         }
      });
      Map<cpl, jh> $$1 = d.b();
      a($$1);
      $$1.put(cpt.qx, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> a($$0x, $$1x, $$2x, $$3x, $$4, $$5, new cpq(cpt.qy), $$0xx -> $$0xx.c(ddn.g) == 3, atp.da));
      $$1.put(cpt.sk, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> {
         if (!$$1x.B) {
            cpl $$6 = $$5.d();
            $$3x.a($$4, cps.a($$5, $$3x, cro.a(new cpq(cpt.sj), crp.c)));
            $$3x.a(atz.W);
            $$3x.b(atz.c.b($$6));
            ddn.d($$0x, $$1x, $$2x);
            $$1x.a(null, $$2x, atp.cv, atq.e, 1.0F, 1.0F);
            $$1x.a(null, dqr.y, $$2x);
         }

         return bmn.a($$1x.B);
      });
      $$1.put(cpt.sj, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> {
         if ($$0x.c(ddn.g) != 3 && cro.d($$5).a(crp.c)) {
            if (!$$1x.B) {
               $$3x.a($$4, cps.a($$5, $$3x, new cpq(cpt.sk)));
               $$3x.a(atz.W);
               $$3x.b(atz.c.b($$5.d()));
               $$1x.b($$2x, $$0x.a(ddn.g));
               $$1x.a(null, $$2x, atp.cu, atq.e, 1.0F, 1.0F);
               $$1x.a(null, dqr.z, $$2x);
            }

            return bmn.a($$1x.B);
         } else {
            return bmn.d;
         }
      });
      $$1.put(cpt.pA, l);
      $$1.put(cpt.pz, l);
      $$1.put(cpt.py, l);
      $$1.put(cpt.px, l);
      $$1.put(cpt.uF, l);
      $$1.put(cpt.uL, k);
      $$1.put(cpt.uS, k);
      $$1.put(cpt.va, k);
      $$1.put(cpt.uW, k);
      $$1.put(cpt.uX, k);
      $$1.put(cpt.uU, k);
      $$1.put(cpt.uY, k);
      $$1.put(cpt.uO, k);
      $$1.put(cpt.uT, k);
      $$1.put(cpt.uQ, k);
      $$1.put(cpt.uN, k);
      $$1.put(cpt.uM, k);
      $$1.put(cpt.uR, k);
      $$1.put(cpt.uV, k);
      $$1.put(cpt.uZ, k);
      $$1.put(cpt.uP, k);
      $$1.put(cpt.jc, j);
      $$1.put(cpt.jj, j);
      $$1.put(cpt.jr, j);
      $$1.put(cpt.jn, j);
      $$1.put(cpt.jo, j);
      $$1.put(cpt.jl, j);
      $$1.put(cpt.jp, j);
      $$1.put(cpt.jf, j);
      $$1.put(cpt.jk, j);
      $$1.put(cpt.jh, j);
      $$1.put(cpt.je, j);
      $$1.put(cpt.jd, j);
      $$1.put(cpt.ji, j);
      $$1.put(cpt.jm, j);
      $$1.put(cpt.jq, j);
      $$1.put(cpt.jg, j);
      Map<cpl, jh> $$2 = e.b();
      $$2.put(cpt.qx, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> a($$0x, $$1x, $$2x, $$3x, $$4, $$5, new cpq(cpt.qz), $$0xx -> true, atp.dd));
      a($$2);
      Map<cpl, jh> $$3 = f.b();
      $$3.put(cpt.qx, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> a($$0x, $$1x, $$2x, $$3x, $$4, $$5, new cpq(cpt.qA), $$0xx -> $$0xx.c(ddn.g) == 3, atp.de));
      a($$3);
   }

   static void a(Map<cpl, jh> $$0) {
      $$0.put(cpt.qz, h);
      $$0.put(cpt.qy, g);
      $$0.put(cpt.qA, i);
   }

   static bmn a(dme $$0, cwe $$1, ib $$2, cia $$3, bmk $$4, cpq $$5, cpq $$6, Predicate<dme> $$7, ato $$8) {
      if (!$$7.test($$0)) {
         return bmn.d;
      } else {
         if (!$$1.B) {
            cpl $$9 = $$5.d();
            $$3.a($$4, cps.a($$5, $$3, $$6));
            $$3.a(atz.W);
            $$3.b(atz.c.b($$9));
            $$1.b($$2, czh.ft.o());
            $$1.a(null, $$2, $$8, atq.e, 1.0F, 1.0F);
            $$1.a(null, dqr.y, $$2);
         }

         return bmn.a($$1.B);
      }
   }

   static bmn a(cwe $$0, ib $$1, cia $$2, bmk $$3, cpq $$4, dme $$5, ato $$6) {
      if (!$$0.B) {
         cpl $$7 = $$4.d();
         $$2.a($$3, cps.a($$4, $$2, new cpq(cpt.qx)));
         $$2.a(atz.V);
         $$2.b(atz.c.b($$7));
         $$0.b($$1, $$5);
         $$0.a(null, $$1, $$6, atq.e, 1.0F, 1.0F);
         $$0.a(null, dqr.z, $$1);
      }

      return bmn.a($$0.B);
   }

   public static record a(String a, Map<cpl, jh> b) {
   }
}
