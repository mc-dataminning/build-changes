import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Map;
import java.util.function.Predicate;

public interface jc {
   Map<String, jc.a> a = new Object2ObjectArrayMap();
   Codec<jc.a> b = asy.a(jc.a::a, a::get);
   jc.a c = a("empty");
   jc.a d = a("water");
   jc.a e = a("lava");
   jc.a f = a("powder_snow");
   jc g = ($$0, $$1, $$2, $$3, $$4, $$5) -> a($$1, $$2, $$3, $$4, $$5, cvh.fu.o().a(czn.g, Integer.valueOf(3)), aqv.cv);
   jc h = ($$0, $$1, $$2, $$3, $$4, $$5) -> a($$1, $$2, $$3, $$4, $$5, cvh.fv.o(), aqv.cy);
   jc i = ($$0, $$1, $$2, $$3, $$4, $$5) -> a($$1, $$2, $$3, $$4, $$5, cvh.fw.o().a(czn.g, Integer.valueOf(3)), aqv.cz);
   jc j = ($$0, $$1, $$2, $$3, $$4, $$5) -> {
      cvf $$6 = cvf.a($$5.d());
      if (!($$6 instanceof dcd)) {
         return bjb.d;
      } else {
         if (!$$1.B) {
            clo $$7 = new clo(cvh.kP);
            if ($$5.u()) {
               $$7.c($$5.v().h());
            }

            $$3.a($$4, $$7);
            $$3.a(arf.Z);
            czn.d($$0, $$1, $$2);
         }

         return bjb.a($$1.B);
      }
   };
   jc k = ($$0, $$1, $$2, $$3, $$4, $$5) -> {
      if (dey.c($$5) <= 0) {
         return bjb.d;
      } else {
         if (!$$1.B) {
            clo $$6 = $$5.c(1);
            dey.d($$6);
            if (!$$3.fU().d) {
               $$5.h(1);
            }

            if ($$5.b()) {
               $$3.a($$4, $$6);
            } else if ($$3.fT().e($$6)) {
               $$3.bR.b();
            } else {
               $$3.a($$6, false);
            }

            $$3.a(arf.Y);
            czn.d($$0, $$1, $$2);
         }

         return bjb.a($$1.B);
      }
   };
   jc l = ($$0, $$1, $$2, $$3, $$4, $$5) -> {
      if (!($$5.d() instanceof ckg $$7)) {
         return bjb.d;
      } else if (!$$7.a($$5)) {
         return bjb.d;
      } else {
         if (!$$1.B) {
            $$7.f_($$5);
            $$3.a(arf.X);
            czn.d($$0, $$1, $$2);
         }

         return bjb.a($$1.B);
      }
   };

   static jc.a a(String $$0) {
      Object2ObjectOpenHashMap<clj, jc> $$1 = new Object2ObjectOpenHashMap();
      $$1.defaultReturnValue((jc)($$0x, $$1x, $$2x, $$3, $$4, $$5) -> bjb.d);
      jc.a $$2 = new jc.a($$0, $$1);
      a.put($$0, $$2);
      return $$2;
   }

   bjb interact(dhn var1, csf var2, hx var3, cdz var4, bja var5, clo var6);

   static void a() {
      Map<clj, jc> $$0 = c.b();
      a($$0);
      $$0.put(clr.sh, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> {
         if (cnn.d($$5) != cno.c) {
            return bjb.d;
         } else {
            if (!$$1x.B) {
               clj $$6 = $$5.d();
               $$3x.a($$4, clq.a($$5, $$3x, new clo(clr.si)));
               $$3x.a(arf.W);
               $$3x.b(arf.c.b($$6));
               $$1x.b($$2x, cvh.fu.o());
               $$1x.a(null, $$2x, aqv.ch, aqw.e, 1.0F, 1.0F);
               $$1x.a(null, dlx.z, $$2x);
            }

            return bjb.a($$1x.B);
         }
      });
      Map<clj, jc> $$1 = d.b();
      a($$1);
      $$1.put(clr.qv, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> a($$0x, $$1x, $$2x, $$3x, $$4, $$5, new clo(clr.qw), $$0xx -> $$0xx.c(czn.g) == 3, aqv.cB));
      $$1.put(clr.si, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> {
         if (!$$1x.B) {
            clj $$6 = $$5.d();
            $$3x.a($$4, clq.a($$5, $$3x, cnn.a(new clo(clr.sh), cno.c)));
            $$3x.a(arf.W);
            $$3x.b(arf.c.b($$6));
            czn.d($$0x, $$1x, $$2x);
            $$1x.a(null, $$2x, aqv.ci, aqw.e, 1.0F, 1.0F);
            $$1x.a(null, dlx.y, $$2x);
         }

         return bjb.a($$1x.B);
      });
      $$1.put(clr.sh, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> {
         if ($$0x.c(czn.g) != 3 && cnn.d($$5) == cno.c) {
            if (!$$1x.B) {
               $$3x.a($$4, clq.a($$5, $$3x, new clo(clr.si)));
               $$3x.a(arf.W);
               $$3x.b(arf.c.b($$5.d()));
               $$1x.b($$2x, $$0x.a(czn.g));
               $$1x.a(null, $$2x, aqv.ch, aqw.e, 1.0F, 1.0F);
               $$1x.a(null, dlx.z, $$2x);
            }

            return bjb.a($$1x.B);
         } else {
            return bjb.d;
         }
      });
      $$1.put(clr.py, l);
      $$1.put(clr.px, l);
      $$1.put(clr.pw, l);
      $$1.put(clr.pv, l);
      $$1.put(clr.uB, l);
      $$1.put(clr.uH, k);
      $$1.put(clr.uO, k);
      $$1.put(clr.uW, k);
      $$1.put(clr.uS, k);
      $$1.put(clr.uT, k);
      $$1.put(clr.uQ, k);
      $$1.put(clr.uU, k);
      $$1.put(clr.uK, k);
      $$1.put(clr.uP, k);
      $$1.put(clr.uM, k);
      $$1.put(clr.uJ, k);
      $$1.put(clr.uI, k);
      $$1.put(clr.uN, k);
      $$1.put(clr.uR, k);
      $$1.put(clr.uV, k);
      $$1.put(clr.uL, k);
      $$1.put(clr.jc, j);
      $$1.put(clr.jj, j);
      $$1.put(clr.jr, j);
      $$1.put(clr.jn, j);
      $$1.put(clr.jo, j);
      $$1.put(clr.jl, j);
      $$1.put(clr.jp, j);
      $$1.put(clr.jf, j);
      $$1.put(clr.jk, j);
      $$1.put(clr.jh, j);
      $$1.put(clr.je, j);
      $$1.put(clr.jd, j);
      $$1.put(clr.ji, j);
      $$1.put(clr.jm, j);
      $$1.put(clr.jq, j);
      $$1.put(clr.jg, j);
      Map<clj, jc> $$2 = e.b();
      $$2.put(clr.qv, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> a($$0x, $$1x, $$2x, $$3x, $$4, $$5, new clo(clr.qx), $$0xx -> true, aqv.cE));
      a($$2);
      Map<clj, jc> $$3 = f.b();
      $$3.put(clr.qv, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> a($$0x, $$1x, $$2x, $$3x, $$4, $$5, new clo(clr.qy), $$0xx -> $$0xx.c(czn.g) == 3, aqv.cF));
      a($$3);
   }

   static void a(Map<clj, jc> $$0) {
      $$0.put(clr.qx, h);
      $$0.put(clr.qw, g);
      $$0.put(clr.qy, i);
   }

   static bjb a(dhn $$0, csf $$1, hx $$2, cdz $$3, bja $$4, clo $$5, clo $$6, Predicate<dhn> $$7, aqu $$8) {
      if (!$$7.test($$0)) {
         return bjb.d;
      } else {
         if (!$$1.B) {
            clj $$9 = $$5.d();
            $$3.a($$4, clq.a($$5, $$3, $$6));
            $$3.a(arf.W);
            $$3.b(arf.c.b($$9));
            $$1.b($$2, cvh.ft.o());
            $$1.a(null, $$2, $$8, aqw.e, 1.0F, 1.0F);
            $$1.a(null, dlx.y, $$2);
         }

         return bjb.a($$1.B);
      }
   }

   static bjb a(csf $$0, hx $$1, cdz $$2, bja $$3, clo $$4, dhn $$5, aqu $$6) {
      if (!$$0.B) {
         clj $$7 = $$4.d();
         $$2.a($$3, clq.a($$4, $$2, new clo(clr.qv)));
         $$2.a(arf.V);
         $$2.b(arf.c.b($$7));
         $$0.b($$1, $$5);
         $$0.a(null, $$1, $$6, aqw.e, 1.0F, 1.0F);
         $$0.a(null, dlx.z, $$1);
      }

      return bjb.a($$0.B);
   }

   public static record a(String a, Map<clj, jc> b) {
   }
}
