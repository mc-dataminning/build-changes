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
   kf g = ($$0, $$1, $$2, $$3, $$4, $$5) -> a($$1, $$2, $$3, $$4, $$5, dfb.fu.o().a(dji.g, Integer.valueOf(3)), awa.dc);
   kf h = ($$0, $$1, $$2, $$3, $$4, $$5) -> a($$1, $$2, $$3, $$4, $$5, dfb.fv.o(), awa.df);
   kf i = ($$0, $$1, $$2, $$3, $$4, $$5) -> a($$1, $$2, $$3, $$4, $$5, dfb.fw.o().a(dji.g, Integer.valueOf(3)), awa.dg);
   kf j = ($$0, $$1, $$2, $$3, $$4, $$5) -> {
      dez $$6 = dez.a($$5.g());
      if (!($$6 instanceof dly)) {
         return bqw.d;
      } else {
         if (!$$1.B) {
            $$3.a($$4, $$5.a(dfb.kP, 1));
            $$3.a(awk.Z);
            dji.d($$0, $$1, $$2);
         }

         return bqw.a($$1.B);
      }
   };
   kf k = ($$0, $$1, $$2, $$3, $$4, $$5) -> {
      doy $$6 = $$5.a(km.X, doy.a);
      if ($$6.b().isEmpty()) {
         return bqw.d;
      } else {
         if (!$$1.B) {
            cup $$7 = $$5.c(1);
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
            dji.d($$0, $$1, $$2);
         }

         return bqw.a($$1.B);
      }
   };
   kf l = ($$0, $$1, $$2, $$3, $$4, $$5) -> {
      if (!$$5.a(awy.by)) {
         return bqw.d;
      } else if (!$$5.b(km.z)) {
         return bqw.d;
      } else {
         if (!$$1.B) {
            $$5.c(km.z);
            $$3.a(awk.X);
            dji.d($$0, $$1, $$2);
         }

         return bqw.a($$1.B);
      }
   };

   static kf.a a(String $$0) {
      Object2ObjectOpenHashMap<cuk, kf> $$1 = new Object2ObjectOpenHashMap();
      $$1.defaultReturnValue((kf)($$0x, $$1x, $$2x, $$3, $$4, $$5) -> bqw.d);
      kf.a $$2 = new kf.a($$0, $$1);
      a.put($$0, $$2);
      return $$2;
   }

   bqw interact(dsc var1, dby var2, iz var3, cmx var4, bqt var5, cup var6);

   static void a() {
      Map<cuk, kf> $$0 = c.b();
      a($$0);
      $$0.put(cus.sk, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> {
         cwq $$6 = $$5.a(km.G);
         if ($$6 != null && $$6.a(cwr.a)) {
            if (!$$1x.B) {
               cuk $$7 = $$5.g();
               $$3x.a($$4, cur.a($$5, $$3x, new cup(cus.sl)));
               $$3x.a(awk.W);
               $$3x.b(awk.c.b($$7));
               $$1x.b($$2x, dfb.fu.o());
               $$1x.a(null, $$2x, awa.cB, awb.e, 1.0F, 1.0F);
               $$1x.a(null, dwv.z, $$2x);
            }

            return bqw.a($$1x.B);
         } else {
            return bqw.d;
         }
      });
      Map<cuk, kf> $$1 = d.b();
      a($$1);
      $$1.put(cus.qy, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> a($$0x, $$1x, $$2x, $$3x, $$4, $$5, new cup(cus.qz), $$0xx -> $$0xx.c(dji.g) == 3, awa.di));
      $$1.put(cus.sl, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> {
         if (!$$1x.B) {
            cuk $$6 = $$5.g();
            $$3x.a($$4, cur.a($$5, $$3x, cwq.a(cus.sk, cwr.a)));
            $$3x.a(awk.W);
            $$3x.b(awk.c.b($$6));
            dji.d($$0x, $$1x, $$2x);
            $$1x.a(null, $$2x, awa.cC, awb.e, 1.0F, 1.0F);
            $$1x.a(null, dwv.y, $$2x);
         }

         return bqw.a($$1x.B);
      });
      $$1.put(cus.sk, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> {
         if ($$0x.c(dji.g) == 3) {
            return bqw.d;
         } else {
            cwq $$6 = $$5.a(km.G);
            if ($$6 != null && $$6.a(cwr.a)) {
               if (!$$1x.B) {
                  $$3x.a($$4, cur.a($$5, $$3x, new cup(cus.sl)));
                  $$3x.a(awk.W);
                  $$3x.b(awk.c.b($$5.g()));
                  $$1x.b($$2x, $$0x.a(dji.g));
                  $$1x.a(null, $$2x, awa.cB, awb.e, 1.0F, 1.0F);
                  $$1x.a(null, dwv.z, $$2x);
               }

               return bqw.a($$1x.B);
            } else {
               return bqw.d;
            }
         }
      });
      $$1.put(cus.pB, l);
      $$1.put(cus.pA, l);
      $$1.put(cus.pz, l);
      $$1.put(cus.py, l);
      $$1.put(cus.uJ, l);
      $$1.put(cus.or, l);
      $$1.put(cus.uP, k);
      $$1.put(cus.uW, k);
      $$1.put(cus.ve, k);
      $$1.put(cus.va, k);
      $$1.put(cus.vb, k);
      $$1.put(cus.uY, k);
      $$1.put(cus.vc, k);
      $$1.put(cus.uS, k);
      $$1.put(cus.uX, k);
      $$1.put(cus.uU, k);
      $$1.put(cus.uR, k);
      $$1.put(cus.uQ, k);
      $$1.put(cus.uV, k);
      $$1.put(cus.uZ, k);
      $$1.put(cus.vd, k);
      $$1.put(cus.uT, k);
      $$1.put(cus.jd, j);
      $$1.put(cus.jk, j);
      $$1.put(cus.js, j);
      $$1.put(cus.jo, j);
      $$1.put(cus.jp, j);
      $$1.put(cus.jm, j);
      $$1.put(cus.jq, j);
      $$1.put(cus.jg, j);
      $$1.put(cus.jl, j);
      $$1.put(cus.ji, j);
      $$1.put(cus.jf, j);
      $$1.put(cus.je, j);
      $$1.put(cus.jj, j);
      $$1.put(cus.jn, j);
      $$1.put(cus.jr, j);
      $$1.put(cus.jh, j);
      Map<cuk, kf> $$2 = e.b();
      $$2.put(cus.qy, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> a($$0x, $$1x, $$2x, $$3x, $$4, $$5, new cup(cus.qA), $$0xx -> true, awa.dl));
      a($$2);
      Map<cuk, kf> $$3 = f.b();
      $$3.put(cus.qy, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> a($$0x, $$1x, $$2x, $$3x, $$4, $$5, new cup(cus.qB), $$0xx -> $$0xx.c(dji.g) == 3, awa.dm));
      a($$3);
   }

   static void a(Map<cuk, kf> $$0) {
      $$0.put(cus.qA, h);
      $$0.put(cus.qz, g);
      $$0.put(cus.qB, i);
   }

   static bqw a(dsc $$0, dby $$1, iz $$2, cmx $$3, bqt $$4, cup $$5, cup $$6, Predicate<dsc> $$7, avz $$8) {
      if (!$$7.test($$0)) {
         return bqw.d;
      } else {
         if (!$$1.B) {
            cuk $$9 = $$5.g();
            $$3.a($$4, cur.a($$5, $$3, $$6));
            $$3.a(awk.W);
            $$3.b(awk.c.b($$9));
            $$1.b($$2, dfb.ft.o());
            $$1.a(null, $$2, $$8, awb.e, 1.0F, 1.0F);
            $$1.a(null, dwv.y, $$2);
         }

         return bqw.a($$1.B);
      }
   }

   static bqw a(dby $$0, iz $$1, cmx $$2, bqt $$3, cup $$4, dsc $$5, avz $$6) {
      if (!$$0.B) {
         cuk $$7 = $$4.g();
         $$2.a($$3, cur.a($$4, $$2, new cup(cus.qy)));
         $$2.a(awk.V);
         $$2.b(awk.c.b($$7));
         $$0.b($$1, $$5);
         $$0.a(null, $$1, $$6, awb.e, 1.0F, 1.0F);
         $$0.a(null, dwv.z, $$1);
      }

      return bqw.a($$0.B);
   }

   public static record a(String a, Map<cuk, kf> b) {
   }
}
