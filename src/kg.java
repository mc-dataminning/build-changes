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
   kg g = ($$0, $$1, $$2, $$3, $$4, $$5) -> a($$1, $$2, $$3, $$4, $$5, dfh.fu.o().a(djo.g, Integer.valueOf(3)), avf.dc);
   kg h = ($$0, $$1, $$2, $$3, $$4, $$5) -> a($$1, $$2, $$3, $$4, $$5, dfh.fv.o(), avf.df);
   kg i = ($$0, $$1, $$2, $$3, $$4, $$5) -> a($$1, $$2, $$3, $$4, $$5, dfh.fw.o().a(djo.g, Integer.valueOf(3)), avf.dg);
   kg j = ($$0, $$1, $$2, $$3, $$4, $$5) -> {
      dff $$6 = dff.a($$5.g());
      if (!($$6 instanceof dme)) {
         return bqf.d;
      } else {
         if (!$$1.B) {
            $$3.a($$4, $$5.a(dfh.kP, 1));
            $$3.a(avp.Z);
            djo.d($$0, $$1, $$2);
         }

         return bqf.a($$1.B);
      }
   };
   kg k = ($$0, $$1, $$2, $$3, $$4, $$5) -> {
      dpe $$6 = $$5.a(kn.X, dpe.a);
      if ($$6.b().isEmpty()) {
         return bqf.d;
      } else {
         if (!$$1.B) {
            cua $$7 = $$5.c(1);
            $$7.b(kn.X, $$6.a());
            $$5.a(1, $$3);
            if ($$5.e()) {
               $$3.a($$4, $$7);
            } else if ($$3.fY().f($$7)) {
               $$3.cc.b();
            } else {
               $$3.a($$7, false);
            }

            $$3.a(avp.Y);
            djo.d($$0, $$1, $$2);
         }

         return bqf.a($$1.B);
      }
   };
   kg l = ($$0, $$1, $$2, $$3, $$4, $$5) -> {
      if (!$$5.a(awd.by)) {
         return bqf.d;
      } else if (!$$5.b(kn.z)) {
         return bqf.d;
      } else {
         if (!$$1.B) {
            $$5.c(kn.z);
            $$3.a(avp.X);
            djo.d($$0, $$1, $$2);
         }

         return bqf.a($$1.B);
      }
   };

   static kg.a a(String $$0) {
      Object2ObjectOpenHashMap<ctv, kg> $$1 = new Object2ObjectOpenHashMap();
      $$1.defaultReturnValue((kg)($$0x, $$1x, $$2x, $$3, $$4, $$5) -> bqf.d);
      kg.a $$2 = new kg.a($$0, $$1);
      a.put($$0, $$2);
      return $$2;
   }

   bqf interact(dsh var1, dcd var2, ja var3, cmh var4, bqc var5, cua var6);

   static void a() {
      Map<ctv, kg> $$0 = c.b();
      a($$0);
      $$0.put(cud.sk, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> {
         cwb $$6 = $$5.a(kn.G);
         if ($$6 != null && $$6.a(cwc.a)) {
            if (!$$1x.B) {
               ctv $$7 = $$5.g();
               $$3x.a($$4, cuc.a($$5, $$3x, new cua(cud.sl)));
               $$3x.a(avp.W);
               $$3x.b(avp.c.b($$7));
               $$1x.b($$2x, dfh.fu.o());
               $$1x.a(null, $$2x, avf.cB, avg.e, 1.0F, 1.0F);
               $$1x.a(null, dxa.z, $$2x);
            }

            return bqf.a($$1x.B);
         } else {
            return bqf.d;
         }
      });
      Map<ctv, kg> $$1 = d.b();
      a($$1);
      $$1.put(cud.qy, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> a($$0x, $$1x, $$2x, $$3x, $$4, $$5, new cua(cud.qz), $$0xx -> $$0xx.c(djo.g) == 3, avf.di));
      $$1.put(cud.sl, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> {
         if (!$$1x.B) {
            ctv $$6 = $$5.g();
            $$3x.a($$4, cuc.a($$5, $$3x, cwb.a(cud.sk, cwc.a)));
            $$3x.a(avp.W);
            $$3x.b(avp.c.b($$6));
            djo.d($$0x, $$1x, $$2x);
            $$1x.a(null, $$2x, avf.cC, avg.e, 1.0F, 1.0F);
            $$1x.a(null, dxa.y, $$2x);
         }

         return bqf.a($$1x.B);
      });
      $$1.put(cud.sk, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> {
         if ($$0x.c(djo.g) == 3) {
            return bqf.d;
         } else {
            cwb $$6 = $$5.a(kn.G);
            if ($$6 != null && $$6.a(cwc.a)) {
               if (!$$1x.B) {
                  $$3x.a($$4, cuc.a($$5, $$3x, new cua(cud.sl)));
                  $$3x.a(avp.W);
                  $$3x.b(avp.c.b($$5.g()));
                  $$1x.b($$2x, $$0x.a(djo.g));
                  $$1x.a(null, $$2x, avf.cB, avg.e, 1.0F, 1.0F);
                  $$1x.a(null, dxa.z, $$2x);
               }

               return bqf.a($$1x.B);
            } else {
               return bqf.d;
            }
         }
      });
      $$1.put(cud.pB, l);
      $$1.put(cud.pA, l);
      $$1.put(cud.pz, l);
      $$1.put(cud.py, l);
      $$1.put(cud.uJ, l);
      $$1.put(cud.or, l);
      $$1.put(cud.uP, k);
      $$1.put(cud.uW, k);
      $$1.put(cud.ve, k);
      $$1.put(cud.va, k);
      $$1.put(cud.vb, k);
      $$1.put(cud.uY, k);
      $$1.put(cud.vc, k);
      $$1.put(cud.uS, k);
      $$1.put(cud.uX, k);
      $$1.put(cud.uU, k);
      $$1.put(cud.uR, k);
      $$1.put(cud.uQ, k);
      $$1.put(cud.uV, k);
      $$1.put(cud.uZ, k);
      $$1.put(cud.vd, k);
      $$1.put(cud.uT, k);
      $$1.put(cud.jd, j);
      $$1.put(cud.jk, j);
      $$1.put(cud.js, j);
      $$1.put(cud.jo, j);
      $$1.put(cud.jp, j);
      $$1.put(cud.jm, j);
      $$1.put(cud.jq, j);
      $$1.put(cud.jg, j);
      $$1.put(cud.jl, j);
      $$1.put(cud.ji, j);
      $$1.put(cud.jf, j);
      $$1.put(cud.je, j);
      $$1.put(cud.jj, j);
      $$1.put(cud.jn, j);
      $$1.put(cud.jr, j);
      $$1.put(cud.jh, j);
      Map<ctv, kg> $$2 = e.b();
      $$2.put(cud.qy, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> a($$0x, $$1x, $$2x, $$3x, $$4, $$5, new cua(cud.qA), $$0xx -> true, avf.dl));
      a($$2);
      Map<ctv, kg> $$3 = f.b();
      $$3.put(cud.qy, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> a($$0x, $$1x, $$2x, $$3x, $$4, $$5, new cua(cud.qB), $$0xx -> $$0xx.c(djo.g) == 3, avf.dm));
      a($$3);
   }

   static void a(Map<ctv, kg> $$0) {
      $$0.put(cud.qA, h);
      $$0.put(cud.qz, g);
      $$0.put(cud.qB, i);
   }

   static bqf a(dsh $$0, dcd $$1, ja $$2, cmh $$3, bqc $$4, cua $$5, cua $$6, Predicate<dsh> $$7, ave $$8) {
      if (!$$7.test($$0)) {
         return bqf.d;
      } else {
         if (!$$1.B) {
            ctv $$9 = $$5.g();
            $$3.a($$4, cuc.a($$5, $$3, $$6));
            $$3.a(avp.W);
            $$3.b(avp.c.b($$9));
            $$1.b($$2, dfh.ft.o());
            $$1.a(null, $$2, $$8, avg.e, 1.0F, 1.0F);
            $$1.a(null, dxa.y, $$2);
         }

         return bqf.a($$1.B);
      }
   }

   static bqf a(dcd $$0, ja $$1, cmh $$2, bqc $$3, cua $$4, dsh $$5, ave $$6) {
      if (!$$0.B) {
         ctv $$7 = $$4.g();
         $$2.a($$3, cuc.a($$4, $$2, new cua(cud.qy)));
         $$2.a(avp.V);
         $$2.b(avp.c.b($$7));
         $$0.b($$1, $$5);
         $$0.a(null, $$1, $$6, avg.e, 1.0F, 1.0F);
         $$0.a(null, dxa.z, $$1);
      }

      return bqf.a($$0.B);
   }

   public static record a(String a, Map<ctv, kg> b) {
   }
}
