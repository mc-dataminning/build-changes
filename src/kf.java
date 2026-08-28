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
   kf g = ($$0, $$1, $$2, $$3, $$4, $$5) -> a($$1, $$2, $$3, $$4, $$5, dfc.fu.o().a(djj.g, Integer.valueOf(3)), awa.dc);
   kf h = ($$0, $$1, $$2, $$3, $$4, $$5) -> a($$1, $$2, $$3, $$4, $$5, dfc.fv.o(), awa.df);
   kf i = ($$0, $$1, $$2, $$3, $$4, $$5) -> a($$1, $$2, $$3, $$4, $$5, dfc.fw.o().a(djj.g, Integer.valueOf(3)), awa.dg);
   kf j = ($$0, $$1, $$2, $$3, $$4, $$5) -> {
      dfa $$6 = dfa.a($$5.g());
      if (!($$6 instanceof dlz)) {
         return bqx.d;
      } else {
         if (!$$1.B) {
            $$3.a($$4, $$5.a(dfc.kP, 1));
            $$3.a(awk.Z);
            djj.d($$0, $$1, $$2);
         }

         return bqx.a($$1.B);
      }
   };
   kf k = ($$0, $$1, $$2, $$3, $$4, $$5) -> {
      doz $$6 = $$5.a(km.X, doz.a);
      if ($$6.b().isEmpty()) {
         return bqx.d;
      } else {
         if (!$$1.B) {
            cuq $$7 = $$5.c(1);
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
            djj.d($$0, $$1, $$2);
         }

         return bqx.a($$1.B);
      }
   };
   kf l = ($$0, $$1, $$2, $$3, $$4, $$5) -> {
      if (!$$5.a(awy.by)) {
         return bqx.d;
      } else if (!$$5.b(km.z)) {
         return bqx.d;
      } else {
         if (!$$1.B) {
            $$5.c(km.z);
            $$3.a(awk.X);
            djj.d($$0, $$1, $$2);
         }

         return bqx.a($$1.B);
      }
   };

   static kf.a a(String $$0) {
      Object2ObjectOpenHashMap<cul, kf> $$1 = new Object2ObjectOpenHashMap();
      $$1.defaultReturnValue((kf)($$0x, $$1x, $$2x, $$3, $$4, $$5) -> bqx.d);
      kf.a $$2 = new kf.a($$0, $$1);
      a.put($$0, $$2);
      return $$2;
   }

   bqx interact(dsd var1, dbz var2, iz var3, cmy var4, bqu var5, cuq var6);

   static void a() {
      Map<cul, kf> $$0 = c.b();
      a($$0);
      $$0.put(cut.sk, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> {
         cwr $$6 = $$5.a(km.G);
         if ($$6 != null && $$6.a(cws.a)) {
            if (!$$1x.B) {
               cul $$7 = $$5.g();
               $$3x.a($$4, cus.a($$5, $$3x, new cuq(cut.sl)));
               $$3x.a(awk.W);
               $$3x.b(awk.c.b($$7));
               $$1x.b($$2x, dfc.fu.o());
               $$1x.a(null, $$2x, awa.cB, awb.e, 1.0F, 1.0F);
               $$1x.a(null, dww.z, $$2x);
            }

            return bqx.a($$1x.B);
         } else {
            return bqx.d;
         }
      });
      Map<cul, kf> $$1 = d.b();
      a($$1);
      $$1.put(cut.qy, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> a($$0x, $$1x, $$2x, $$3x, $$4, $$5, new cuq(cut.qz), $$0xx -> $$0xx.c(djj.g) == 3, awa.di));
      $$1.put(cut.sl, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> {
         if (!$$1x.B) {
            cul $$6 = $$5.g();
            $$3x.a($$4, cus.a($$5, $$3x, cwr.a(cut.sk, cws.a)));
            $$3x.a(awk.W);
            $$3x.b(awk.c.b($$6));
            djj.d($$0x, $$1x, $$2x);
            $$1x.a(null, $$2x, awa.cC, awb.e, 1.0F, 1.0F);
            $$1x.a(null, dww.y, $$2x);
         }

         return bqx.a($$1x.B);
      });
      $$1.put(cut.sk, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> {
         if ($$0x.c(djj.g) == 3) {
            return bqx.d;
         } else {
            cwr $$6 = $$5.a(km.G);
            if ($$6 != null && $$6.a(cws.a)) {
               if (!$$1x.B) {
                  $$3x.a($$4, cus.a($$5, $$3x, new cuq(cut.sl)));
                  $$3x.a(awk.W);
                  $$3x.b(awk.c.b($$5.g()));
                  $$1x.b($$2x, $$0x.a(djj.g));
                  $$1x.a(null, $$2x, awa.cB, awb.e, 1.0F, 1.0F);
                  $$1x.a(null, dww.z, $$2x);
               }

               return bqx.a($$1x.B);
            } else {
               return bqx.d;
            }
         }
      });
      $$1.put(cut.pB, l);
      $$1.put(cut.pA, l);
      $$1.put(cut.pz, l);
      $$1.put(cut.py, l);
      $$1.put(cut.uJ, l);
      $$1.put(cut.or, l);
      $$1.put(cut.uP, k);
      $$1.put(cut.uW, k);
      $$1.put(cut.ve, k);
      $$1.put(cut.va, k);
      $$1.put(cut.vb, k);
      $$1.put(cut.uY, k);
      $$1.put(cut.vc, k);
      $$1.put(cut.uS, k);
      $$1.put(cut.uX, k);
      $$1.put(cut.uU, k);
      $$1.put(cut.uR, k);
      $$1.put(cut.uQ, k);
      $$1.put(cut.uV, k);
      $$1.put(cut.uZ, k);
      $$1.put(cut.vd, k);
      $$1.put(cut.uT, k);
      $$1.put(cut.jd, j);
      $$1.put(cut.jk, j);
      $$1.put(cut.js, j);
      $$1.put(cut.jo, j);
      $$1.put(cut.jp, j);
      $$1.put(cut.jm, j);
      $$1.put(cut.jq, j);
      $$1.put(cut.jg, j);
      $$1.put(cut.jl, j);
      $$1.put(cut.ji, j);
      $$1.put(cut.jf, j);
      $$1.put(cut.je, j);
      $$1.put(cut.jj, j);
      $$1.put(cut.jn, j);
      $$1.put(cut.jr, j);
      $$1.put(cut.jh, j);
      Map<cul, kf> $$2 = e.b();
      $$2.put(cut.qy, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> a($$0x, $$1x, $$2x, $$3x, $$4, $$5, new cuq(cut.qA), $$0xx -> true, awa.dl));
      a($$2);
      Map<cul, kf> $$3 = f.b();
      $$3.put(cut.qy, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> a($$0x, $$1x, $$2x, $$3x, $$4, $$5, new cuq(cut.qB), $$0xx -> $$0xx.c(djj.g) == 3, awa.dm));
      a($$3);
   }

   static void a(Map<cul, kf> $$0) {
      $$0.put(cut.qA, h);
      $$0.put(cut.qz, g);
      $$0.put(cut.qB, i);
   }

   static bqx a(dsd $$0, dbz $$1, iz $$2, cmy $$3, bqu $$4, cuq $$5, cuq $$6, Predicate<dsd> $$7, avz $$8) {
      if (!$$7.test($$0)) {
         return bqx.d;
      } else {
         if (!$$1.B) {
            cul $$9 = $$5.g();
            $$3.a($$4, cus.a($$5, $$3, $$6));
            $$3.a(awk.W);
            $$3.b(awk.c.b($$9));
            $$1.b($$2, dfc.ft.o());
            $$1.a(null, $$2, $$8, awb.e, 1.0F, 1.0F);
            $$1.a(null, dww.y, $$2);
         }

         return bqx.a($$1.B);
      }
   }

   static bqx a(dbz $$0, iz $$1, cmy $$2, bqu $$3, cuq $$4, dsd $$5, avz $$6) {
      if (!$$0.B) {
         cul $$7 = $$4.g();
         $$2.a($$3, cus.a($$4, $$2, new cuq(cut.qy)));
         $$2.a(awk.V);
         $$2.b(awk.c.b($$7));
         $$0.b($$1, $$5);
         $$0.a(null, $$1, $$6, awb.e, 1.0F, 1.0F);
         $$0.a(null, dww.z, $$1);
      }

      return bqx.a($$0.B);
   }

   public static record a(String a, Map<cul, kf> b) {
   }
}
