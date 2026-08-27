import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Map;
import java.util.function.Predicate;

public interface jd {
   Map<String, jd.a> a = new Object2ObjectArrayMap();
   Codec<jd.a> b = atx.a(jd.a::a, a::get);
   jd.a c = a("empty");
   jd.a d = a("water");
   jd.a e = a("lava");
   jd.a f = a("powder_snow");
   jd g = ($$0, $$1, $$2, $$3, $$4, $$5) -> a($$1, $$2, $$3, $$4, $$5, cxa.fu.o().a(dbg.g, Integer.valueOf(3)), art.cT);
   jd h = ($$0, $$1, $$2, $$3, $$4, $$5) -> a($$1, $$2, $$3, $$4, $$5, cxa.fv.o(), art.cW);
   jd i = ($$0, $$1, $$2, $$3, $$4, $$5) -> a($$1, $$2, $$3, $$4, $$5, cxa.fw.o().a(dbg.g, Integer.valueOf(3)), art.cX);
   jd j = ($$0, $$1, $$2, $$3, $$4, $$5) -> {
      cwy $$6 = cwy.a($$5.d());
      if (!($$6 instanceof ddw)) {
         return bke.d;
      } else {
         if (!$$1.B) {
            cng $$7 = new cng(cxa.kP);
            if ($$5.u()) {
               $$7.c($$5.v().h());
            }

            $$3.a($$4, $$7);
            $$3.a(asd.Z);
            dbg.d($$0, $$1, $$2);
         }

         return bke.a($$1.B);
      }
   };
   jd k = ($$0, $$1, $$2, $$3, $$4, $$5) -> {
      if (dgt.c($$5) <= 0) {
         return bke.d;
      } else {
         if (!$$1.B) {
            cng $$6 = $$5.c(1);
            dgt.d($$6);
            if (!$$3.fT().d) {
               $$5.h(1);
            }

            if ($$5.b()) {
               $$3.a($$4, $$6);
            } else if ($$3.fS().e($$6)) {
               $$3.bV.b();
            } else {
               $$3.a($$6, false);
            }

            $$3.a(asd.Y);
            dbg.d($$0, $$1, $$2);
         }

         return bke.a($$1.B);
      }
   };
   jd l = ($$0, $$1, $$2, $$3, $$4, $$5) -> {
      if (!($$5.d() instanceof clz $$7)) {
         return bke.d;
      } else if (!$$7.a($$5)) {
         return bke.d;
      } else {
         if (!$$1.B) {
            $$7.f_($$5);
            $$3.a(asd.X);
            dbg.d($$0, $$1, $$2);
         }

         return bke.a($$1.B);
      }
   };

   static jd.a a(String $$0) {
      Object2ObjectOpenHashMap<cnb, jd> $$1 = new Object2ObjectOpenHashMap();
      $$1.defaultReturnValue((jd)($$0x, $$1x, $$2x, $$3, $$4, $$5) -> bke.d);
      jd.a $$2 = new jd.a($$0, $$1);
      a.put($$0, $$2);
      return $$2;
   }

   bke interact(djp var1, ctx var2, hx var3, cfq var4, bkb var5, cng var6);

   static void a() {
      Map<cnb, jd> $$0 = c.b();
      a($$0);
      $$0.put(cnj.sj, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> {
         if (!cpg.d($$5).a(cph.c)) {
            return bke.d;
         } else {
            if (!$$1x.B) {
               cnb $$6 = $$5.d();
               $$3x.a($$4, cni.a($$5, $$3x, new cng(cnj.sk)));
               $$3x.a(asd.W);
               $$3x.b(asd.c.b($$6));
               $$1x.b($$2x, cxa.fu.o());
               $$1x.a(null, $$2x, art.ct, aru.e, 1.0F, 1.0F);
               $$1x.a(null, dnz.z, $$2x);
            }

            return bke.a($$1x.B);
         }
      });
      Map<cnb, jd> $$1 = d.b();
      a($$1);
      $$1.put(cnj.qx, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> a($$0x, $$1x, $$2x, $$3x, $$4, $$5, new cng(cnj.qy), $$0xx -> $$0xx.c(dbg.g) == 3, art.cZ));
      $$1.put(cnj.sk, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> {
         if (!$$1x.B) {
            cnb $$6 = $$5.d();
            $$3x.a($$4, cni.a($$5, $$3x, cpg.a(new cng(cnj.sj), cph.c)));
            $$3x.a(asd.W);
            $$3x.b(asd.c.b($$6));
            dbg.d($$0x, $$1x, $$2x);
            $$1x.a(null, $$2x, art.cu, aru.e, 1.0F, 1.0F);
            $$1x.a(null, dnz.y, $$2x);
         }

         return bke.a($$1x.B);
      });
      $$1.put(cnj.sj, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> {
         if ($$0x.c(dbg.g) != 3 && cpg.d($$5).a(cph.c)) {
            if (!$$1x.B) {
               $$3x.a($$4, cni.a($$5, $$3x, new cng(cnj.sk)));
               $$3x.a(asd.W);
               $$3x.b(asd.c.b($$5.d()));
               $$1x.b($$2x, $$0x.a(dbg.g));
               $$1x.a(null, $$2x, art.ct, aru.e, 1.0F, 1.0F);
               $$1x.a(null, dnz.z, $$2x);
            }

            return bke.a($$1x.B);
         } else {
            return bke.d;
         }
      });
      $$1.put(cnj.pA, l);
      $$1.put(cnj.pz, l);
      $$1.put(cnj.py, l);
      $$1.put(cnj.px, l);
      $$1.put(cnj.uF, l);
      $$1.put(cnj.uL, k);
      $$1.put(cnj.uS, k);
      $$1.put(cnj.va, k);
      $$1.put(cnj.uW, k);
      $$1.put(cnj.uX, k);
      $$1.put(cnj.uU, k);
      $$1.put(cnj.uY, k);
      $$1.put(cnj.uO, k);
      $$1.put(cnj.uT, k);
      $$1.put(cnj.uQ, k);
      $$1.put(cnj.uN, k);
      $$1.put(cnj.uM, k);
      $$1.put(cnj.uR, k);
      $$1.put(cnj.uV, k);
      $$1.put(cnj.uZ, k);
      $$1.put(cnj.uP, k);
      $$1.put(cnj.jc, j);
      $$1.put(cnj.jj, j);
      $$1.put(cnj.jr, j);
      $$1.put(cnj.jn, j);
      $$1.put(cnj.jo, j);
      $$1.put(cnj.jl, j);
      $$1.put(cnj.jp, j);
      $$1.put(cnj.jf, j);
      $$1.put(cnj.jk, j);
      $$1.put(cnj.jh, j);
      $$1.put(cnj.je, j);
      $$1.put(cnj.jd, j);
      $$1.put(cnj.ji, j);
      $$1.put(cnj.jm, j);
      $$1.put(cnj.jq, j);
      $$1.put(cnj.jg, j);
      Map<cnb, jd> $$2 = e.b();
      $$2.put(cnj.qx, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> a($$0x, $$1x, $$2x, $$3x, $$4, $$5, new cng(cnj.qz), $$0xx -> true, art.dc));
      a($$2);
      Map<cnb, jd> $$3 = f.b();
      $$3.put(cnj.qx, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> a($$0x, $$1x, $$2x, $$3x, $$4, $$5, new cng(cnj.qA), $$0xx -> $$0xx.c(dbg.g) == 3, art.dd));
      a($$3);
   }

   static void a(Map<cnb, jd> $$0) {
      $$0.put(cnj.qz, h);
      $$0.put(cnj.qy, g);
      $$0.put(cnj.qA, i);
   }

   static bke a(djp $$0, ctx $$1, hx $$2, cfq $$3, bkb $$4, cng $$5, cng $$6, Predicate<djp> $$7, ars $$8) {
      if (!$$7.test($$0)) {
         return bke.d;
      } else {
         if (!$$1.B) {
            cnb $$9 = $$5.d();
            $$3.a($$4, cni.a($$5, $$3, $$6));
            $$3.a(asd.W);
            $$3.b(asd.c.b($$9));
            $$1.b($$2, cxa.ft.o());
            $$1.a(null, $$2, $$8, aru.e, 1.0F, 1.0F);
            $$1.a(null, dnz.y, $$2);
         }

         return bke.a($$1.B);
      }
   }

   static bke a(ctx $$0, hx $$1, cfq $$2, bkb $$3, cng $$4, djp $$5, ars $$6) {
      if (!$$0.B) {
         cnb $$7 = $$4.d();
         $$2.a($$3, cni.a($$4, $$2, new cng(cnj.qx)));
         $$2.a(asd.V);
         $$2.b(asd.c.b($$7));
         $$0.b($$1, $$5);
         $$0.a(null, $$1, $$6, aru.e, 1.0F, 1.0F);
         $$0.a(null, dnz.z, $$1);
      }

      return bke.a($$0.B);
   }

   public static record a(String a, Map<cnb, jd> b) {
   }
}
