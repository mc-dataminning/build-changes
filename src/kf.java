import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Map;
import java.util.function.Predicate;

public interface kf {
   Map<String, kf.a> a = new Object2ObjectArrayMap();
   Codec<kf.a> b = Codec.stringResolver(kf.a::a, a::get);
   kf.a c = a("empty");
   kf.a d = a("water");
   kf.a e = a("lava");
   kf.a f = a("powder_snow");
   kf g = ($$0, $$1, $$2, $$3, $$4, $$5) -> a($$1, $$2, $$3, $$4, $$5, dew.fu.n().a(djd.g, Integer.valueOf(3)), avw.dc);
   kf h = ($$0, $$1, $$2, $$3, $$4, $$5) -> a($$1, $$2, $$3, $$4, $$5, dew.fv.n(), avw.df);
   kf i = ($$0, $$1, $$2, $$3, $$4, $$5) -> a($$1, $$2, $$3, $$4, $$5, dew.fw.n().a(djd.g, Integer.valueOf(3)), avw.dg);
   kf j = ($$0, $$1, $$2, $$3, $$4, $$5) -> {
      deu $$6 = deu.a($$5.g());
      if (!($$6 instanceof dlt)) {
         return bqr.d;
      } else {
         if (!$$1.B) {
            $$3.a($$4, $$5.a(dew.kP, 1));
            $$3.a(awg.Z);
            djd.d($$0, $$1, $$2);
         }

         return bqr.a($$1.B);
      }
   };
   kf k = ($$0, $$1, $$2, $$3, $$4, $$5) -> {
      dot $$6 = $$5.a(km.W, dot.a);
      if ($$6.b().isEmpty()) {
         return bqr.d;
      } else {
         if (!$$1.B) {
            cuk $$7 = $$5.c(1);
            $$7.b(km.W, $$6.a());
            $$5.a(1, $$3);
            if ($$5.e()) {
               $$3.a($$4, $$7);
            } else if ($$3.gc().f($$7)) {
               $$3.ca.b();
            } else {
               $$3.a($$7, false);
            }

            $$3.a(awg.Y);
            djd.d($$0, $$1, $$2);
         }

         return bqr.a($$1.B);
      }
   };
   kf l = ($$0, $$1, $$2, $$3, $$4, $$5) -> {
      if (!$$5.a(awu.by)) {
         return bqr.d;
      } else if (!$$5.b(km.y)) {
         return bqr.d;
      } else {
         if (!$$1.B) {
            $$5.c(km.y);
            $$3.a(awg.X);
            djd.d($$0, $$1, $$2);
         }

         return bqr.a($$1.B);
      }
   };

   static kf.a a(String $$0) {
      Object2ObjectOpenHashMap<cuf, kf> $$1 = new Object2ObjectOpenHashMap();
      $$1.defaultReturnValue((kf)($$0x, $$1x, $$2x, $$3, $$4, $$5) -> bqr.d);
      kf.a $$2 = new kf.a($$0, $$1);
      a.put($$0, $$2);
      return $$2;
   }

   bqr interact(drx var1, dbt var2, iz var3, cms var4, bqo var5, cuk var6);

   static void a() {
      Map<cuf, kf> $$0 = c.b();
      a($$0);
      $$0.put(cun.sk, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> {
         cwl $$6 = $$5.a(km.F);
         if ($$6 != null && $$6.a(cwm.a)) {
            if (!$$1x.B) {
               cuf $$7 = $$5.g();
               $$3x.a($$4, cum.a($$5, $$3x, new cuk(cun.sl)));
               $$3x.a(awg.W);
               $$3x.b(awg.c.b($$7));
               $$1x.b($$2x, dew.fu.n());
               $$1x.a(null, $$2x, avw.cB, avx.e, 1.0F, 1.0F);
               $$1x.a(null, dwq.z, $$2x);
            }

            return bqr.a($$1x.B);
         } else {
            return bqr.d;
         }
      });
      Map<cuf, kf> $$1 = d.b();
      a($$1);
      $$1.put(cun.qy, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> a($$0x, $$1x, $$2x, $$3x, $$4, $$5, new cuk(cun.qz), $$0xx -> $$0xx.c(djd.g) == 3, avw.di));
      $$1.put(cun.sl, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> {
         if (!$$1x.B) {
            cuf $$6 = $$5.g();
            $$3x.a($$4, cum.a($$5, $$3x, cwl.a(cun.sk, cwm.a)));
            $$3x.a(awg.W);
            $$3x.b(awg.c.b($$6));
            djd.d($$0x, $$1x, $$2x);
            $$1x.a(null, $$2x, avw.cC, avx.e, 1.0F, 1.0F);
            $$1x.a(null, dwq.y, $$2x);
         }

         return bqr.a($$1x.B);
      });
      $$1.put(cun.sk, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> {
         if ($$0x.c(djd.g) == 3) {
            return bqr.d;
         } else {
            cwl $$6 = $$5.a(km.F);
            if ($$6 != null && $$6.a(cwm.a)) {
               if (!$$1x.B) {
                  $$3x.a($$4, cum.a($$5, $$3x, new cuk(cun.sl)));
                  $$3x.a(awg.W);
                  $$3x.b(awg.c.b($$5.g()));
                  $$1x.b($$2x, $$0x.a(djd.g));
                  $$1x.a(null, $$2x, avw.cB, avx.e, 1.0F, 1.0F);
                  $$1x.a(null, dwq.z, $$2x);
               }

               return bqr.a($$1x.B);
            } else {
               return bqr.d;
            }
         }
      });
      $$1.put(cun.pB, l);
      $$1.put(cun.pA, l);
      $$1.put(cun.pz, l);
      $$1.put(cun.py, l);
      $$1.put(cun.uJ, l);
      $$1.put(cun.or, l);
      $$1.put(cun.uP, k);
      $$1.put(cun.uW, k);
      $$1.put(cun.ve, k);
      $$1.put(cun.va, k);
      $$1.put(cun.vb, k);
      $$1.put(cun.uY, k);
      $$1.put(cun.vc, k);
      $$1.put(cun.uS, k);
      $$1.put(cun.uX, k);
      $$1.put(cun.uU, k);
      $$1.put(cun.uR, k);
      $$1.put(cun.uQ, k);
      $$1.put(cun.uV, k);
      $$1.put(cun.uZ, k);
      $$1.put(cun.vd, k);
      $$1.put(cun.uT, k);
      $$1.put(cun.jd, j);
      $$1.put(cun.jk, j);
      $$1.put(cun.js, j);
      $$1.put(cun.jo, j);
      $$1.put(cun.jp, j);
      $$1.put(cun.jm, j);
      $$1.put(cun.jq, j);
      $$1.put(cun.jg, j);
      $$1.put(cun.jl, j);
      $$1.put(cun.ji, j);
      $$1.put(cun.jf, j);
      $$1.put(cun.je, j);
      $$1.put(cun.jj, j);
      $$1.put(cun.jn, j);
      $$1.put(cun.jr, j);
      $$1.put(cun.jh, j);
      Map<cuf, kf> $$2 = e.b();
      $$2.put(cun.qy, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> a($$0x, $$1x, $$2x, $$3x, $$4, $$5, new cuk(cun.qA), $$0xx -> true, avw.dl));
      a($$2);
      Map<cuf, kf> $$3 = f.b();
      $$3.put(cun.qy, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> a($$0x, $$1x, $$2x, $$3x, $$4, $$5, new cuk(cun.qB), $$0xx -> $$0xx.c(djd.g) == 3, avw.dm));
      a($$3);
   }

   static void a(Map<cuf, kf> $$0) {
      $$0.put(cun.qA, h);
      $$0.put(cun.qz, g);
      $$0.put(cun.qB, i);
   }

   static bqr a(drx $$0, dbt $$1, iz $$2, cms $$3, bqo $$4, cuk $$5, cuk $$6, Predicate<drx> $$7, avv $$8) {
      if (!$$7.test($$0)) {
         return bqr.d;
      } else {
         if (!$$1.B) {
            cuf $$9 = $$5.g();
            $$3.a($$4, cum.a($$5, $$3, $$6));
            $$3.a(awg.W);
            $$3.b(awg.c.b($$9));
            $$1.b($$2, dew.ft.n());
            $$1.a(null, $$2, $$8, avx.e, 1.0F, 1.0F);
            $$1.a(null, dwq.y, $$2);
         }

         return bqr.a($$1.B);
      }
   }

   static bqr a(dbt $$0, iz $$1, cms $$2, bqo $$3, cuk $$4, drx $$5, avv $$6) {
      if (!$$0.B) {
         cuf $$7 = $$4.g();
         $$2.a($$3, cum.a($$4, $$2, new cuk(cun.qy)));
         $$2.a(awg.V);
         $$2.b(awg.c.b($$7));
         $$0.b($$1, $$5);
         $$0.a(null, $$1, $$6, avx.e, 1.0F, 1.0F);
         $$0.a(null, dwq.z, $$1);
      }

      return bqr.a($$0.B);
   }

   public static record a(String a, Map<cuf, kf> b) {
   }
}
