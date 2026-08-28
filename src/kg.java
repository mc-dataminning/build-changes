import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Map;
import java.util.function.Predicate;

public interface kg {
   Map<String, kg.a> a = new Object2ObjectArrayMap();
   Codec<kg.a> b = Codec.stringResolver(kg.a::a, a::get);
   kg.a c = a("empty");
   kg.a d = a("water");
   kg.a e = a("lava");
   kg.a f = a("powder_snow");
   kg g = ($$0, $$1, $$2, $$3, $$4, $$5) -> a($$1, $$2, $$3, $$4, $$5, dfk.fu.o().a(djr.g, Integer.valueOf(3)), avh.dc);
   kg h = ($$0, $$1, $$2, $$3, $$4, $$5) -> a($$1, $$2, $$3, $$4, $$5, dfk.fv.o(), avh.df);
   kg i = ($$0, $$1, $$2, $$3, $$4, $$5) -> a($$1, $$2, $$3, $$4, $$5, dfk.fw.o().a(djr.g, Integer.valueOf(3)), avh.dg);
   kg j = ($$0, $$1, $$2, $$3, $$4, $$5) -> {
      dfi $$6 = dfi.a($$5.g());
      if (!($$6 instanceof dmh)) {
         return bqj.d;
      } else {
         if (!$$1.B) {
            cud $$7 = $$5.a(dfk.kP, 1);
            $$3.a($$4, cuf.a($$5, $$3, $$7, false));
            $$3.a(avr.Z);
            djr.d($$0, $$1, $$2);
         }

         return bqj.a($$1.B);
      }
   };
   kg k = ($$0, $$1, $$2, $$3, $$4, $$5) -> {
      dph $$6 = $$5.a(kn.X, dph.a);
      if ($$6.b().isEmpty()) {
         return bqj.d;
      } else {
         if (!$$1.B) {
            cud $$7 = $$5.c(1);
            $$7.b(kn.X, $$6.a());
            $$3.a($$4, cuf.a($$5, $$3, $$7, false));
            $$3.a(avr.Y);
            djr.d($$0, $$1, $$2);
         }

         return bqj.a($$1.B);
      }
   };
   kg l = ($$0, $$1, $$2, $$3, $$4, $$5) -> {
      if (!$$5.a(awf.by)) {
         return bqj.d;
      } else if (!$$5.b(kn.z)) {
         return bqj.d;
      } else {
         if (!$$1.B) {
            $$5.c(kn.z);
            $$3.a(avr.X);
            djr.d($$0, $$1, $$2);
         }

         return bqj.a($$1.B);
      }
   };

   static kg.a a(String $$0) {
      Object2ObjectOpenHashMap<cty, kg> $$1 = new Object2ObjectOpenHashMap();
      $$1.defaultReturnValue((kg)($$0x, $$1x, $$2x, $$3, $$4, $$5) -> bqj.d);
      kg.a $$2 = new kg.a($$0, $$1);
      a.put($$0, $$2);
      return $$2;
   }

   bqj interact(dsl var1, dcg var2, ja var3, cml var4, bqg var5, cud var6);

   static void a() {
      Map<cty, kg> $$0 = c.b();
      a($$0);
      $$0.put(cug.sk, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> {
         cwe $$6 = $$5.a(kn.G);
         if ($$6 != null && $$6.a(cwf.a)) {
            if (!$$1x.B) {
               cty $$7 = $$5.g();
               $$3x.a($$4, cuf.a($$5, $$3x, new cud(cug.sl)));
               $$3x.a(avr.W);
               $$3x.b(avr.c.b($$7));
               $$1x.b($$2x, dfk.fu.o());
               $$1x.a(null, $$2x, avh.cB, avi.e, 1.0F, 1.0F);
               $$1x.a(null, dxh.z, $$2x);
            }

            return bqj.a($$1x.B);
         } else {
            return bqj.d;
         }
      });
      Map<cty, kg> $$1 = d.b();
      a($$1);
      $$1.put(cug.qy, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> a($$0x, $$1x, $$2x, $$3x, $$4, $$5, new cud(cug.qz), $$0xx -> $$0xx.c(djr.g) == 3, avh.di));
      $$1.put(cug.sl, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> {
         if (!$$1x.B) {
            cty $$6 = $$5.g();
            $$3x.a($$4, cuf.a($$5, $$3x, cwe.a(cug.sk, cwf.a)));
            $$3x.a(avr.W);
            $$3x.b(avr.c.b($$6));
            djr.d($$0x, $$1x, $$2x);
            $$1x.a(null, $$2x, avh.cC, avi.e, 1.0F, 1.0F);
            $$1x.a(null, dxh.y, $$2x);
         }

         return bqj.a($$1x.B);
      });
      $$1.put(cug.sk, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> {
         if ($$0x.c(djr.g) == 3) {
            return bqj.d;
         } else {
            cwe $$6 = $$5.a(kn.G);
            if ($$6 != null && $$6.a(cwf.a)) {
               if (!$$1x.B) {
                  $$3x.a($$4, cuf.a($$5, $$3x, new cud(cug.sl)));
                  $$3x.a(avr.W);
                  $$3x.b(avr.c.b($$5.g()));
                  $$1x.b($$2x, $$0x.a(djr.g));
                  $$1x.a(null, $$2x, avh.cB, avi.e, 1.0F, 1.0F);
                  $$1x.a(null, dxh.z, $$2x);
               }

               return bqj.a($$1x.B);
            } else {
               return bqj.d;
            }
         }
      });
      $$1.put(cug.pB, l);
      $$1.put(cug.pA, l);
      $$1.put(cug.pz, l);
      $$1.put(cug.py, l);
      $$1.put(cug.uJ, l);
      $$1.put(cug.or, l);
      $$1.put(cug.uP, k);
      $$1.put(cug.uW, k);
      $$1.put(cug.ve, k);
      $$1.put(cug.va, k);
      $$1.put(cug.vb, k);
      $$1.put(cug.uY, k);
      $$1.put(cug.vc, k);
      $$1.put(cug.uS, k);
      $$1.put(cug.uX, k);
      $$1.put(cug.uU, k);
      $$1.put(cug.uR, k);
      $$1.put(cug.uQ, k);
      $$1.put(cug.uV, k);
      $$1.put(cug.uZ, k);
      $$1.put(cug.vd, k);
      $$1.put(cug.uT, k);
      $$1.put(cug.jd, j);
      $$1.put(cug.jk, j);
      $$1.put(cug.js, j);
      $$1.put(cug.jo, j);
      $$1.put(cug.jp, j);
      $$1.put(cug.jm, j);
      $$1.put(cug.jq, j);
      $$1.put(cug.jg, j);
      $$1.put(cug.jl, j);
      $$1.put(cug.ji, j);
      $$1.put(cug.jf, j);
      $$1.put(cug.je, j);
      $$1.put(cug.jj, j);
      $$1.put(cug.jn, j);
      $$1.put(cug.jr, j);
      $$1.put(cug.jh, j);
      Map<cty, kg> $$2 = e.b();
      $$2.put(cug.qy, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> a($$0x, $$1x, $$2x, $$3x, $$4, $$5, new cud(cug.qA), $$0xx -> true, avh.dl));
      a($$2);
      Map<cty, kg> $$3 = f.b();
      $$3.put(cug.qy, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> a($$0x, $$1x, $$2x, $$3x, $$4, $$5, new cud(cug.qB), $$0xx -> $$0xx.c(djr.g) == 3, avh.dm));
      a($$3);
   }

   static void a(Map<cty, kg> $$0) {
      $$0.put(cug.qA, h);
      $$0.put(cug.qz, g);
      $$0.put(cug.qB, i);
   }

   static bqj a(dsl $$0, dcg $$1, ja $$2, cml $$3, bqg $$4, cud $$5, cud $$6, Predicate<dsl> $$7, avg $$8) {
      if (!$$7.test($$0)) {
         return bqj.d;
      } else {
         if (!$$1.B) {
            cty $$9 = $$5.g();
            $$3.a($$4, cuf.a($$5, $$3, $$6));
            $$3.a(avr.W);
            $$3.b(avr.c.b($$9));
            $$1.b($$2, dfk.ft.o());
            $$1.a(null, $$2, $$8, avi.e, 1.0F, 1.0F);
            $$1.a(null, dxh.y, $$2);
         }

         return bqj.a($$1.B);
      }
   }

   static bqj a(dcg $$0, ja $$1, cml $$2, bqg $$3, cud $$4, dsl $$5, avg $$6) {
      if (!$$0.B) {
         cty $$7 = $$4.g();
         $$2.a($$3, cuf.a($$4, $$2, new cud(cug.qy)));
         $$2.a(avr.V);
         $$2.b(avr.c.b($$7));
         $$0.b($$1, $$5);
         $$0.a(null, $$1, $$6, avi.e, 1.0F, 1.0F);
         $$0.a(null, dxh.z, $$1);
      }

      return bqj.a($$0.B);
   }

   public static record a(String a, Map<cty, kg> b) {
   }
}
