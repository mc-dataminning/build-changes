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
   kg g = ($$0, $$1, $$2, $$3, $$4, $$5) -> a($$1, $$2, $$3, $$4, $$5, dfj.fu.o().a(djq.g, Integer.valueOf(3)), avh.dc);
   kg h = ($$0, $$1, $$2, $$3, $$4, $$5) -> a($$1, $$2, $$3, $$4, $$5, dfj.fv.o(), avh.df);
   kg i = ($$0, $$1, $$2, $$3, $$4, $$5) -> a($$1, $$2, $$3, $$4, $$5, dfj.fw.o().a(djq.g, Integer.valueOf(3)), avh.dg);
   kg j = ($$0, $$1, $$2, $$3, $$4, $$5) -> {
      dfh $$6 = dfh.a($$5.g());
      if (!($$6 instanceof dmg)) {
         return bqi.d;
      } else {
         if (!$$1.B) {
            cuc $$7 = $$5.a(dfj.kP, 1);
            $$3.a($$4, cue.a($$5, $$3, $$7, false));
            $$3.a(avr.Z);
            djq.d($$0, $$1, $$2);
         }

         return bqi.a($$1.B);
      }
   };
   kg k = ($$0, $$1, $$2, $$3, $$4, $$5) -> {
      dpg $$6 = $$5.a(kn.X, dpg.a);
      if ($$6.b().isEmpty()) {
         return bqi.d;
      } else {
         if (!$$1.B) {
            cuc $$7 = $$5.c(1);
            $$7.b(kn.X, $$6.a());
            $$3.a($$4, cue.a($$5, $$3, $$7, false));
            $$3.a(avr.Y);
            djq.d($$0, $$1, $$2);
         }

         return bqi.a($$1.B);
      }
   };
   kg l = ($$0, $$1, $$2, $$3, $$4, $$5) -> {
      if (!$$5.a(awf.by)) {
         return bqi.d;
      } else if (!$$5.b(kn.z)) {
         return bqi.d;
      } else {
         if (!$$1.B) {
            $$5.c(kn.z);
            $$3.a(avr.X);
            djq.d($$0, $$1, $$2);
         }

         return bqi.a($$1.B);
      }
   };

   static kg.a a(String $$0) {
      Object2ObjectOpenHashMap<ctx, kg> $$1 = new Object2ObjectOpenHashMap();
      $$1.defaultReturnValue((kg)($$0x, $$1x, $$2x, $$3, $$4, $$5) -> bqi.d);
      kg.a $$2 = new kg.a($$0, $$1);
      a.put($$0, $$2);
      return $$2;
   }

   bqi interact(dsk var1, dcf var2, ja var3, cmk var4, bqf var5, cuc var6);

   static void a() {
      Map<ctx, kg> $$0 = c.b();
      a($$0);
      $$0.put(cuf.sk, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> {
         cwd $$6 = $$5.a(kn.G);
         if ($$6 != null && $$6.a(cwe.a)) {
            if (!$$1x.B) {
               ctx $$7 = $$5.g();
               $$3x.a($$4, cue.a($$5, $$3x, new cuc(cuf.sl)));
               $$3x.a(avr.W);
               $$3x.b(avr.c.b($$7));
               $$1x.b($$2x, dfj.fu.o());
               $$1x.a(null, $$2x, avh.cB, avi.e, 1.0F, 1.0F);
               $$1x.a(null, dxg.z, $$2x);
            }

            return bqi.a($$1x.B);
         } else {
            return bqi.d;
         }
      });
      Map<ctx, kg> $$1 = d.b();
      a($$1);
      $$1.put(cuf.qy, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> a($$0x, $$1x, $$2x, $$3x, $$4, $$5, new cuc(cuf.qz), $$0xx -> $$0xx.c(djq.g) == 3, avh.di));
      $$1.put(cuf.sl, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> {
         if (!$$1x.B) {
            ctx $$6 = $$5.g();
            $$3x.a($$4, cue.a($$5, $$3x, cwd.a(cuf.sk, cwe.a)));
            $$3x.a(avr.W);
            $$3x.b(avr.c.b($$6));
            djq.d($$0x, $$1x, $$2x);
            $$1x.a(null, $$2x, avh.cC, avi.e, 1.0F, 1.0F);
            $$1x.a(null, dxg.y, $$2x);
         }

         return bqi.a($$1x.B);
      });
      $$1.put(cuf.sk, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> {
         if ($$0x.c(djq.g) == 3) {
            return bqi.d;
         } else {
            cwd $$6 = $$5.a(kn.G);
            if ($$6 != null && $$6.a(cwe.a)) {
               if (!$$1x.B) {
                  $$3x.a($$4, cue.a($$5, $$3x, new cuc(cuf.sl)));
                  $$3x.a(avr.W);
                  $$3x.b(avr.c.b($$5.g()));
                  $$1x.b($$2x, $$0x.a(djq.g));
                  $$1x.a(null, $$2x, avh.cB, avi.e, 1.0F, 1.0F);
                  $$1x.a(null, dxg.z, $$2x);
               }

               return bqi.a($$1x.B);
            } else {
               return bqi.d;
            }
         }
      });
      $$1.put(cuf.pB, l);
      $$1.put(cuf.pA, l);
      $$1.put(cuf.pz, l);
      $$1.put(cuf.py, l);
      $$1.put(cuf.uJ, l);
      $$1.put(cuf.or, l);
      $$1.put(cuf.uP, k);
      $$1.put(cuf.uW, k);
      $$1.put(cuf.ve, k);
      $$1.put(cuf.va, k);
      $$1.put(cuf.vb, k);
      $$1.put(cuf.uY, k);
      $$1.put(cuf.vc, k);
      $$1.put(cuf.uS, k);
      $$1.put(cuf.uX, k);
      $$1.put(cuf.uU, k);
      $$1.put(cuf.uR, k);
      $$1.put(cuf.uQ, k);
      $$1.put(cuf.uV, k);
      $$1.put(cuf.uZ, k);
      $$1.put(cuf.vd, k);
      $$1.put(cuf.uT, k);
      $$1.put(cuf.jd, j);
      $$1.put(cuf.jk, j);
      $$1.put(cuf.js, j);
      $$1.put(cuf.jo, j);
      $$1.put(cuf.jp, j);
      $$1.put(cuf.jm, j);
      $$1.put(cuf.jq, j);
      $$1.put(cuf.jg, j);
      $$1.put(cuf.jl, j);
      $$1.put(cuf.ji, j);
      $$1.put(cuf.jf, j);
      $$1.put(cuf.je, j);
      $$1.put(cuf.jj, j);
      $$1.put(cuf.jn, j);
      $$1.put(cuf.jr, j);
      $$1.put(cuf.jh, j);
      Map<ctx, kg> $$2 = e.b();
      $$2.put(cuf.qy, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> a($$0x, $$1x, $$2x, $$3x, $$4, $$5, new cuc(cuf.qA), $$0xx -> true, avh.dl));
      a($$2);
      Map<ctx, kg> $$3 = f.b();
      $$3.put(cuf.qy, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> a($$0x, $$1x, $$2x, $$3x, $$4, $$5, new cuc(cuf.qB), $$0xx -> $$0xx.c(djq.g) == 3, avh.dm));
      a($$3);
   }

   static void a(Map<ctx, kg> $$0) {
      $$0.put(cuf.qA, h);
      $$0.put(cuf.qz, g);
      $$0.put(cuf.qB, i);
   }

   static bqi a(dsk $$0, dcf $$1, ja $$2, cmk $$3, bqf $$4, cuc $$5, cuc $$6, Predicate<dsk> $$7, avg $$8) {
      if (!$$7.test($$0)) {
         return bqi.d;
      } else {
         if (!$$1.B) {
            ctx $$9 = $$5.g();
            $$3.a($$4, cue.a($$5, $$3, $$6));
            $$3.a(avr.W);
            $$3.b(avr.c.b($$9));
            $$1.b($$2, dfj.ft.o());
            $$1.a(null, $$2, $$8, avi.e, 1.0F, 1.0F);
            $$1.a(null, dxg.y, $$2);
         }

         return bqi.a($$1.B);
      }
   }

   static bqi a(dcf $$0, ja $$1, cmk $$2, bqf $$3, cuc $$4, dsk $$5, avg $$6) {
      if (!$$0.B) {
         ctx $$7 = $$4.g();
         $$2.a($$3, cue.a($$4, $$2, new cuc(cuf.qy)));
         $$2.a(avr.V);
         $$2.b(avr.c.b($$7));
         $$0.b($$1, $$5);
         $$0.a(null, $$1, $$6, avi.e, 1.0F, 1.0F);
         $$0.a(null, dxg.z, $$1);
      }

      return bqi.a($$0.B);
   }

   public static record a(String a, Map<ctx, kg> b) {
   }
}
