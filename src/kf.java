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
   kf g = ($$0, $$1, $$2, $$3, $$4, $$5) -> a($$1, $$2, $$3, $$4, $$5, dez.fu.o().a(djg.g, Integer.valueOf(3)), avz.dc);
   kf h = ($$0, $$1, $$2, $$3, $$4, $$5) -> a($$1, $$2, $$3, $$4, $$5, dez.fv.o(), avz.df);
   kf i = ($$0, $$1, $$2, $$3, $$4, $$5) -> a($$1, $$2, $$3, $$4, $$5, dez.fw.o().a(djg.g, Integer.valueOf(3)), avz.dg);
   kf j = ($$0, $$1, $$2, $$3, $$4, $$5) -> {
      dex $$6 = dex.a($$5.g());
      if (!($$6 instanceof dlw)) {
         return bqu.d;
      } else {
         if (!$$1.B) {
            $$3.a($$4, $$5.a(dez.kP, 1));
            $$3.a(awj.Z);
            djg.d($$0, $$1, $$2);
         }

         return bqu.a($$1.B);
      }
   };
   kf k = ($$0, $$1, $$2, $$3, $$4, $$5) -> {
      dow $$6 = $$5.a(km.W, dow.a);
      if ($$6.b().isEmpty()) {
         return bqu.d;
      } else {
         if (!$$1.B) {
            cun $$7 = $$5.c(1);
            $$7.b(km.W, $$6.a());
            $$5.a(1, $$3);
            if ($$5.e()) {
               $$3.a($$4, $$7);
            } else if ($$3.gc().f($$7)) {
               $$3.ca.b();
            } else {
               $$3.a($$7, false);
            }

            $$3.a(awj.Y);
            djg.d($$0, $$1, $$2);
         }

         return bqu.a($$1.B);
      }
   };
   kf l = ($$0, $$1, $$2, $$3, $$4, $$5) -> {
      if (!$$5.a(awx.by)) {
         return bqu.d;
      } else if (!$$5.b(km.y)) {
         return bqu.d;
      } else {
         if (!$$1.B) {
            $$5.c(km.y);
            $$3.a(awj.X);
            djg.d($$0, $$1, $$2);
         }

         return bqu.a($$1.B);
      }
   };

   static kf.a a(String $$0) {
      Object2ObjectOpenHashMap<cui, kf> $$1 = new Object2ObjectOpenHashMap();
      $$1.defaultReturnValue((kf)($$0x, $$1x, $$2x, $$3, $$4, $$5) -> bqu.d);
      kf.a $$2 = new kf.a($$0, $$1);
      a.put($$0, $$2);
      return $$2;
   }

   bqu interact(dsa var1, dbw var2, iz var3, cmv var4, bqr var5, cun var6);

   static void a() {
      Map<cui, kf> $$0 = c.b();
      a($$0);
      $$0.put(cuq.sk, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> {
         cwo $$6 = $$5.a(km.F);
         if ($$6 != null && $$6.a(cwp.a)) {
            if (!$$1x.B) {
               cui $$7 = $$5.g();
               $$3x.a($$4, cup.a($$5, $$3x, new cun(cuq.sl)));
               $$3x.a(awj.W);
               $$3x.b(awj.c.b($$7));
               $$1x.b($$2x, dez.fu.o());
               $$1x.a(null, $$2x, avz.cB, awa.e, 1.0F, 1.0F);
               $$1x.a(null, dwt.z, $$2x);
            }

            return bqu.a($$1x.B);
         } else {
            return bqu.d;
         }
      });
      Map<cui, kf> $$1 = d.b();
      a($$1);
      $$1.put(cuq.qy, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> a($$0x, $$1x, $$2x, $$3x, $$4, $$5, new cun(cuq.qz), $$0xx -> $$0xx.c(djg.g) == 3, avz.di));
      $$1.put(cuq.sl, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> {
         if (!$$1x.B) {
            cui $$6 = $$5.g();
            $$3x.a($$4, cup.a($$5, $$3x, cwo.a(cuq.sk, cwp.a)));
            $$3x.a(awj.W);
            $$3x.b(awj.c.b($$6));
            djg.d($$0x, $$1x, $$2x);
            $$1x.a(null, $$2x, avz.cC, awa.e, 1.0F, 1.0F);
            $$1x.a(null, dwt.y, $$2x);
         }

         return bqu.a($$1x.B);
      });
      $$1.put(cuq.sk, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> {
         if ($$0x.c(djg.g) == 3) {
            return bqu.d;
         } else {
            cwo $$6 = $$5.a(km.F);
            if ($$6 != null && $$6.a(cwp.a)) {
               if (!$$1x.B) {
                  $$3x.a($$4, cup.a($$5, $$3x, new cun(cuq.sl)));
                  $$3x.a(awj.W);
                  $$3x.b(awj.c.b($$5.g()));
                  $$1x.b($$2x, $$0x.a(djg.g));
                  $$1x.a(null, $$2x, avz.cB, awa.e, 1.0F, 1.0F);
                  $$1x.a(null, dwt.z, $$2x);
               }

               return bqu.a($$1x.B);
            } else {
               return bqu.d;
            }
         }
      });
      $$1.put(cuq.pB, l);
      $$1.put(cuq.pA, l);
      $$1.put(cuq.pz, l);
      $$1.put(cuq.py, l);
      $$1.put(cuq.uJ, l);
      $$1.put(cuq.or, l);
      $$1.put(cuq.uP, k);
      $$1.put(cuq.uW, k);
      $$1.put(cuq.ve, k);
      $$1.put(cuq.va, k);
      $$1.put(cuq.vb, k);
      $$1.put(cuq.uY, k);
      $$1.put(cuq.vc, k);
      $$1.put(cuq.uS, k);
      $$1.put(cuq.uX, k);
      $$1.put(cuq.uU, k);
      $$1.put(cuq.uR, k);
      $$1.put(cuq.uQ, k);
      $$1.put(cuq.uV, k);
      $$1.put(cuq.uZ, k);
      $$1.put(cuq.vd, k);
      $$1.put(cuq.uT, k);
      $$1.put(cuq.jd, j);
      $$1.put(cuq.jk, j);
      $$1.put(cuq.js, j);
      $$1.put(cuq.jo, j);
      $$1.put(cuq.jp, j);
      $$1.put(cuq.jm, j);
      $$1.put(cuq.jq, j);
      $$1.put(cuq.jg, j);
      $$1.put(cuq.jl, j);
      $$1.put(cuq.ji, j);
      $$1.put(cuq.jf, j);
      $$1.put(cuq.je, j);
      $$1.put(cuq.jj, j);
      $$1.put(cuq.jn, j);
      $$1.put(cuq.jr, j);
      $$1.put(cuq.jh, j);
      Map<cui, kf> $$2 = e.b();
      $$2.put(cuq.qy, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> a($$0x, $$1x, $$2x, $$3x, $$4, $$5, new cun(cuq.qA), $$0xx -> true, avz.dl));
      a($$2);
      Map<cui, kf> $$3 = f.b();
      $$3.put(cuq.qy, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> a($$0x, $$1x, $$2x, $$3x, $$4, $$5, new cun(cuq.qB), $$0xx -> $$0xx.c(djg.g) == 3, avz.dm));
      a($$3);
   }

   static void a(Map<cui, kf> $$0) {
      $$0.put(cuq.qA, h);
      $$0.put(cuq.qz, g);
      $$0.put(cuq.qB, i);
   }

   static bqu a(dsa $$0, dbw $$1, iz $$2, cmv $$3, bqr $$4, cun $$5, cun $$6, Predicate<dsa> $$7, avy $$8) {
      if (!$$7.test($$0)) {
         return bqu.d;
      } else {
         if (!$$1.B) {
            cui $$9 = $$5.g();
            $$3.a($$4, cup.a($$5, $$3, $$6));
            $$3.a(awj.W);
            $$3.b(awj.c.b($$9));
            $$1.b($$2, dez.ft.o());
            $$1.a(null, $$2, $$8, awa.e, 1.0F, 1.0F);
            $$1.a(null, dwt.y, $$2);
         }

         return bqu.a($$1.B);
      }
   }

   static bqu a(dbw $$0, iz $$1, cmv $$2, bqr $$3, cun $$4, dsa $$5, avy $$6) {
      if (!$$0.B) {
         cui $$7 = $$4.g();
         $$2.a($$3, cup.a($$4, $$2, new cun(cuq.qy)));
         $$2.a(awj.V);
         $$2.b(awj.c.b($$7));
         $$0.b($$1, $$5);
         $$0.a(null, $$1, $$6, awa.e, 1.0F, 1.0F);
         $$0.a(null, dwt.z, $$1);
      }

      return bqu.a($$0.B);
   }

   public static record a(String a, Map<cui, kf> b) {
   }
}
