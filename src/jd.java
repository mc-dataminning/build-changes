import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Map;
import java.util.function.Predicate;

public interface jd {
   Map<String, jd.a> a = new Object2ObjectArrayMap();
   Codec<jd.a> b = atq.a(jd.a::a, a::get);
   jd.a c = a("empty");
   jd.a d = a("water");
   jd.a e = a("lava");
   jd.a f = a("powder_snow");
   jd g = ($$0, $$1, $$2, $$3, $$4, $$5) -> a($$1, $$2, $$3, $$4, $$5, cwl.fu.o().a(dar.g, Integer.valueOf(3)), arm.cE);
   jd h = ($$0, $$1, $$2, $$3, $$4, $$5) -> a($$1, $$2, $$3, $$4, $$5, cwl.fv.o(), arm.cH);
   jd i = ($$0, $$1, $$2, $$3, $$4, $$5) -> a($$1, $$2, $$3, $$4, $$5, cwl.fw.o().a(dar.g, Integer.valueOf(3)), arm.cI);
   jd j = ($$0, $$1, $$2, $$3, $$4, $$5) -> {
      cwj $$6 = cwj.a($$5.d());
      if (!($$6 instanceof ddh)) {
         return bjv.d;
      } else {
         if (!$$1.B) {
            cmr $$7 = new cmr(cwl.kP);
            if ($$5.u()) {
               $$7.c($$5.v().h());
            }

            $$3.a($$4, $$7);
            $$3.a(arw.Z);
            dar.d($$0, $$1, $$2);
         }

         return bjv.a($$1.B);
      }
   };
   jd k = ($$0, $$1, $$2, $$3, $$4, $$5) -> {
      if (dge.c($$5) <= 0) {
         return bjv.d;
      } else {
         if (!$$1.B) {
            cmr $$6 = $$5.c(1);
            dge.d($$6);
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

            $$3.a(arw.Y);
            dar.d($$0, $$1, $$2);
         }

         return bjv.a($$1.B);
      }
   };
   jd l = ($$0, $$1, $$2, $$3, $$4, $$5) -> {
      if (!($$5.d() instanceof clj $$7)) {
         return bjv.d;
      } else if (!$$7.a($$5)) {
         return bjv.d;
      } else {
         if (!$$1.B) {
            $$7.f_($$5);
            $$3.a(arw.X);
            dar.d($$0, $$1, $$2);
         }

         return bjv.a($$1.B);
      }
   };

   static jd.a a(String $$0) {
      Object2ObjectOpenHashMap<cmm, jd> $$1 = new Object2ObjectOpenHashMap();
      $$1.defaultReturnValue((jd)($$0x, $$1x, $$2x, $$3, $$4, $$5) -> bjv.d);
      jd.a $$2 = new jd.a($$0, $$1);
      a.put($$0, $$2);
      return $$2;
   }

   bjv interact(dja var1, cti var2, hx var3, cfb var4, bju var5, cmr var6);

   static void a() {
      Map<cmm, jd> $$0 = c.b();
      a($$0);
      $$0.put(cmu.sh, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> {
         if (cor.d($$5) != cos.c) {
            return bjv.d;
         } else {
            if (!$$1x.B) {
               cmm $$6 = $$5.d();
               $$3x.a($$4, cmt.a($$5, $$3x, new cmr(cmu.si)));
               $$3x.a(arw.W);
               $$3x.b(arw.c.b($$6));
               $$1x.b($$2x, cwl.fu.o());
               $$1x.a(null, $$2x, arm.ch, arn.e, 1.0F, 1.0F);
               $$1x.a(null, dnk.z, $$2x);
            }

            return bjv.a($$1x.B);
         }
      });
      Map<cmm, jd> $$1 = d.b();
      a($$1);
      $$1.put(cmu.qv, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> a($$0x, $$1x, $$2x, $$3x, $$4, $$5, new cmr(cmu.qw), $$0xx -> $$0xx.c(dar.g) == 3, arm.cK));
      $$1.put(cmu.si, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> {
         if (!$$1x.B) {
            cmm $$6 = $$5.d();
            $$3x.a($$4, cmt.a($$5, $$3x, cor.a(new cmr(cmu.sh), cos.c)));
            $$3x.a(arw.W);
            $$3x.b(arw.c.b($$6));
            dar.d($$0x, $$1x, $$2x);
            $$1x.a(null, $$2x, arm.ci, arn.e, 1.0F, 1.0F);
            $$1x.a(null, dnk.y, $$2x);
         }

         return bjv.a($$1x.B);
      });
      $$1.put(cmu.sh, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> {
         if ($$0x.c(dar.g) != 3 && cor.d($$5) == cos.c) {
            if (!$$1x.B) {
               $$3x.a($$4, cmt.a($$5, $$3x, new cmr(cmu.si)));
               $$3x.a(arw.W);
               $$3x.b(arw.c.b($$5.d()));
               $$1x.b($$2x, $$0x.a(dar.g));
               $$1x.a(null, $$2x, arm.ch, arn.e, 1.0F, 1.0F);
               $$1x.a(null, dnk.z, $$2x);
            }

            return bjv.a($$1x.B);
         } else {
            return bjv.d;
         }
      });
      $$1.put(cmu.py, l);
      $$1.put(cmu.px, l);
      $$1.put(cmu.pw, l);
      $$1.put(cmu.pv, l);
      $$1.put(cmu.uC, l);
      $$1.put(cmu.uI, k);
      $$1.put(cmu.uP, k);
      $$1.put(cmu.uX, k);
      $$1.put(cmu.uT, k);
      $$1.put(cmu.uU, k);
      $$1.put(cmu.uR, k);
      $$1.put(cmu.uV, k);
      $$1.put(cmu.uL, k);
      $$1.put(cmu.uQ, k);
      $$1.put(cmu.uN, k);
      $$1.put(cmu.uK, k);
      $$1.put(cmu.uJ, k);
      $$1.put(cmu.uO, k);
      $$1.put(cmu.uS, k);
      $$1.put(cmu.uW, k);
      $$1.put(cmu.uM, k);
      $$1.put(cmu.jc, j);
      $$1.put(cmu.jj, j);
      $$1.put(cmu.jr, j);
      $$1.put(cmu.jn, j);
      $$1.put(cmu.jo, j);
      $$1.put(cmu.jl, j);
      $$1.put(cmu.jp, j);
      $$1.put(cmu.jf, j);
      $$1.put(cmu.jk, j);
      $$1.put(cmu.jh, j);
      $$1.put(cmu.je, j);
      $$1.put(cmu.jd, j);
      $$1.put(cmu.ji, j);
      $$1.put(cmu.jm, j);
      $$1.put(cmu.jq, j);
      $$1.put(cmu.jg, j);
      Map<cmm, jd> $$2 = e.b();
      $$2.put(cmu.qv, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> a($$0x, $$1x, $$2x, $$3x, $$4, $$5, new cmr(cmu.qx), $$0xx -> true, arm.cN));
      a($$2);
      Map<cmm, jd> $$3 = f.b();
      $$3.put(cmu.qv, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> a($$0x, $$1x, $$2x, $$3x, $$4, $$5, new cmr(cmu.qy), $$0xx -> $$0xx.c(dar.g) == 3, arm.cO));
      a($$3);
   }

   static void a(Map<cmm, jd> $$0) {
      $$0.put(cmu.qx, h);
      $$0.put(cmu.qw, g);
      $$0.put(cmu.qy, i);
   }

   static bjv a(dja $$0, cti $$1, hx $$2, cfb $$3, bju $$4, cmr $$5, cmr $$6, Predicate<dja> $$7, arl $$8) {
      if (!$$7.test($$0)) {
         return bjv.d;
      } else {
         if (!$$1.B) {
            cmm $$9 = $$5.d();
            $$3.a($$4, cmt.a($$5, $$3, $$6));
            $$3.a(arw.W);
            $$3.b(arw.c.b($$9));
            $$1.b($$2, cwl.ft.o());
            $$1.a(null, $$2, $$8, arn.e, 1.0F, 1.0F);
            $$1.a(null, dnk.y, $$2);
         }

         return bjv.a($$1.B);
      }
   }

   static bjv a(cti $$0, hx $$1, cfb $$2, bju $$3, cmr $$4, dja $$5, arl $$6) {
      if (!$$0.B) {
         cmm $$7 = $$4.d();
         $$2.a($$3, cmt.a($$4, $$2, new cmr(cmu.qv)));
         $$2.a(arw.V);
         $$2.b(arw.c.b($$7));
         $$0.b($$1, $$5);
         $$0.a(null, $$1, $$6, arn.e, 1.0F, 1.0F);
         $$0.a(null, dnk.z, $$1);
      }

      return bjv.a($$0.B);
   }

   public static record a(String a, Map<cmm, jd> b) {
   }
}
