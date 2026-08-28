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
   kf g = ($$0, $$1, $$2, $$3, $$4, $$5) -> a($$1, $$2, $$3, $$4, $$5, dfd.fu.o().a(djk.g, Integer.valueOf(3)), awa.dc);
   kf h = ($$0, $$1, $$2, $$3, $$4, $$5) -> a($$1, $$2, $$3, $$4, $$5, dfd.fv.o(), awa.df);
   kf i = ($$0, $$1, $$2, $$3, $$4, $$5) -> a($$1, $$2, $$3, $$4, $$5, dfd.fw.o().a(djk.g, Integer.valueOf(3)), awa.dg);
   kf j = ($$0, $$1, $$2, $$3, $$4, $$5) -> {
      dfb $$6 = dfb.a($$5.g());
      if (!($$6 instanceof dma)) {
         return bqy.d;
      } else {
         if (!$$1.B) {
            $$3.a($$4, $$5.a(dfd.kP, 1));
            $$3.a(awk.Z);
            djk.d($$0, $$1, $$2);
         }

         return bqy.a($$1.B);
      }
   };
   kf k = ($$0, $$1, $$2, $$3, $$4, $$5) -> {
      dpa $$6 = $$5.a(km.X, dpa.a);
      if ($$6.b().isEmpty()) {
         return bqy.d;
      } else {
         if (!$$1.B) {
            cur $$7 = $$5.c(1);
            $$7.b(km.X, $$6.a());
            $$5.a(1, $$3);
            if ($$5.e()) {
               $$3.a($$4, $$7);
            } else if ($$3.gc().f($$7)) {
               $$3.ca.b();
            } else {
               $$3.a($$7, false);
            }

            $$3.a(awk.Y);
            djk.d($$0, $$1, $$2);
         }

         return bqy.a($$1.B);
      }
   };
   kf l = ($$0, $$1, $$2, $$3, $$4, $$5) -> {
      if (!$$5.a(awy.by)) {
         return bqy.d;
      } else if (!$$5.b(km.z)) {
         return bqy.d;
      } else {
         if (!$$1.B) {
            $$5.c(km.z);
            $$3.a(awk.X);
            djk.d($$0, $$1, $$2);
         }

         return bqy.a($$1.B);
      }
   };

   static kf.a a(String $$0) {
      Object2ObjectOpenHashMap<cum, kf> $$1 = new Object2ObjectOpenHashMap();
      $$1.defaultReturnValue((kf)($$0x, $$1x, $$2x, $$3, $$4, $$5) -> bqy.d);
      kf.a $$2 = new kf.a($$0, $$1);
      a.put($$0, $$2);
      return $$2;
   }

   bqy interact(dse var1, dca var2, iz var3, cmz var4, bqv var5, cur var6);

   static void a() {
      Map<cum, kf> $$0 = c.b();
      a($$0);
      $$0.put(cuu.sk, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> {
         cws $$6 = $$5.a(km.G);
         if ($$6 != null && $$6.a(cwt.a)) {
            if (!$$1x.B) {
               cum $$7 = $$5.g();
               $$3x.a($$4, cut.a($$5, $$3x, new cur(cuu.sl)));
               $$3x.a(awk.W);
               $$3x.b(awk.c.b($$7));
               $$1x.b($$2x, dfd.fu.o());
               $$1x.a(null, $$2x, awa.cB, awb.e, 1.0F, 1.0F);
               $$1x.a(null, dwx.z, $$2x);
            }

            return bqy.a($$1x.B);
         } else {
            return bqy.d;
         }
      });
      Map<cum, kf> $$1 = d.b();
      a($$1);
      $$1.put(cuu.qy, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> a($$0x, $$1x, $$2x, $$3x, $$4, $$5, new cur(cuu.qz), $$0xx -> $$0xx.c(djk.g) == 3, awa.di));
      $$1.put(cuu.sl, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> {
         if (!$$1x.B) {
            cum $$6 = $$5.g();
            $$3x.a($$4, cut.a($$5, $$3x, cws.a(cuu.sk, cwt.a)));
            $$3x.a(awk.W);
            $$3x.b(awk.c.b($$6));
            djk.d($$0x, $$1x, $$2x);
            $$1x.a(null, $$2x, awa.cC, awb.e, 1.0F, 1.0F);
            $$1x.a(null, dwx.y, $$2x);
         }

         return bqy.a($$1x.B);
      });
      $$1.put(cuu.sk, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> {
         if ($$0x.c(djk.g) == 3) {
            return bqy.d;
         } else {
            cws $$6 = $$5.a(km.G);
            if ($$6 != null && $$6.a(cwt.a)) {
               if (!$$1x.B) {
                  $$3x.a($$4, cut.a($$5, $$3x, new cur(cuu.sl)));
                  $$3x.a(awk.W);
                  $$3x.b(awk.c.b($$5.g()));
                  $$1x.b($$2x, $$0x.a(djk.g));
                  $$1x.a(null, $$2x, awa.cB, awb.e, 1.0F, 1.0F);
                  $$1x.a(null, dwx.z, $$2x);
               }

               return bqy.a($$1x.B);
            } else {
               return bqy.d;
            }
         }
      });
      $$1.put(cuu.pB, l);
      $$1.put(cuu.pA, l);
      $$1.put(cuu.pz, l);
      $$1.put(cuu.py, l);
      $$1.put(cuu.uJ, l);
      $$1.put(cuu.or, l);
      $$1.put(cuu.uP, k);
      $$1.put(cuu.uW, k);
      $$1.put(cuu.ve, k);
      $$1.put(cuu.va, k);
      $$1.put(cuu.vb, k);
      $$1.put(cuu.uY, k);
      $$1.put(cuu.vc, k);
      $$1.put(cuu.uS, k);
      $$1.put(cuu.uX, k);
      $$1.put(cuu.uU, k);
      $$1.put(cuu.uR, k);
      $$1.put(cuu.uQ, k);
      $$1.put(cuu.uV, k);
      $$1.put(cuu.uZ, k);
      $$1.put(cuu.vd, k);
      $$1.put(cuu.uT, k);
      $$1.put(cuu.jd, j);
      $$1.put(cuu.jk, j);
      $$1.put(cuu.js, j);
      $$1.put(cuu.jo, j);
      $$1.put(cuu.jp, j);
      $$1.put(cuu.jm, j);
      $$1.put(cuu.jq, j);
      $$1.put(cuu.jg, j);
      $$1.put(cuu.jl, j);
      $$1.put(cuu.ji, j);
      $$1.put(cuu.jf, j);
      $$1.put(cuu.je, j);
      $$1.put(cuu.jj, j);
      $$1.put(cuu.jn, j);
      $$1.put(cuu.jr, j);
      $$1.put(cuu.jh, j);
      Map<cum, kf> $$2 = e.b();
      $$2.put(cuu.qy, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> a($$0x, $$1x, $$2x, $$3x, $$4, $$5, new cur(cuu.qA), $$0xx -> true, awa.dl));
      a($$2);
      Map<cum, kf> $$3 = f.b();
      $$3.put(cuu.qy, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> a($$0x, $$1x, $$2x, $$3x, $$4, $$5, new cur(cuu.qB), $$0xx -> $$0xx.c(djk.g) == 3, awa.dm));
      a($$3);
   }

   static void a(Map<cum, kf> $$0) {
      $$0.put(cuu.qA, h);
      $$0.put(cuu.qz, g);
      $$0.put(cuu.qB, i);
   }

   static bqy a(dse $$0, dca $$1, iz $$2, cmz $$3, bqv $$4, cur $$5, cur $$6, Predicate<dse> $$7, avz $$8) {
      if (!$$7.test($$0)) {
         return bqy.d;
      } else {
         if (!$$1.B) {
            cum $$9 = $$5.g();
            $$3.a($$4, cut.a($$5, $$3, $$6));
            $$3.a(awk.W);
            $$3.b(awk.c.b($$9));
            $$1.b($$2, dfd.ft.o());
            $$1.a(null, $$2, $$8, awb.e, 1.0F, 1.0F);
            $$1.a(null, dwx.y, $$2);
         }

         return bqy.a($$1.B);
      }
   }

   static bqy a(dca $$0, iz $$1, cmz $$2, bqv $$3, cur $$4, dse $$5, avz $$6) {
      if (!$$0.B) {
         cum $$7 = $$4.g();
         $$2.a($$3, cut.a($$4, $$2, new cur(cuu.qy)));
         $$2.a(awk.V);
         $$2.b(awk.c.b($$7));
         $$0.b($$1, $$5);
         $$0.a(null, $$1, $$6, awb.e, 1.0F, 1.0F);
         $$0.a(null, dwx.z, $$1);
      }

      return bqy.a($$0.B);
   }

   public static record a(String a, Map<cum, kf> b) {
   }
}
