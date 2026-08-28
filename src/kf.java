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
   kf g = ($$0, $$1, $$2, $$3, $$4, $$5) -> a($$1, $$2, $$3, $$4, $$5, dfa.fu.o().a(djh.g, Integer.valueOf(3)), avz.dc);
   kf h = ($$0, $$1, $$2, $$3, $$4, $$5) -> a($$1, $$2, $$3, $$4, $$5, dfa.fv.o(), avz.df);
   kf i = ($$0, $$1, $$2, $$3, $$4, $$5) -> a($$1, $$2, $$3, $$4, $$5, dfa.fw.o().a(djh.g, Integer.valueOf(3)), avz.dg);
   kf j = ($$0, $$1, $$2, $$3, $$4, $$5) -> {
      dey $$6 = dey.a($$5.g());
      if (!($$6 instanceof dlx)) {
         return bqv.d;
      } else {
         if (!$$1.B) {
            $$3.a($$4, $$5.a(dfa.kP, 1));
            $$3.a(awj.Z);
            djh.d($$0, $$1, $$2);
         }

         return bqv.a($$1.B);
      }
   };
   kf k = ($$0, $$1, $$2, $$3, $$4, $$5) -> {
      dox $$6 = $$5.a(km.X, dox.a);
      if ($$6.b().isEmpty()) {
         return bqv.d;
      } else {
         if (!$$1.B) {
            cuo $$7 = $$5.c(1);
            $$7.b(km.X, $$6.a());
            $$5.a(1, $$3);
            if ($$5.e()) {
               $$3.a($$4, $$7);
            } else if ($$3.gc().f($$7)) {
               $$3.ca.b();
            } else {
               $$3.a($$7, false);
            }

            $$3.a(awj.Y);
            djh.d($$0, $$1, $$2);
         }

         return bqv.a($$1.B);
      }
   };
   kf l = ($$0, $$1, $$2, $$3, $$4, $$5) -> {
      if (!$$5.a(awx.by)) {
         return bqv.d;
      } else if (!$$5.b(km.z)) {
         return bqv.d;
      } else {
         if (!$$1.B) {
            $$5.c(km.z);
            $$3.a(awj.X);
            djh.d($$0, $$1, $$2);
         }

         return bqv.a($$1.B);
      }
   };

   static kf.a a(String $$0) {
      Object2ObjectOpenHashMap<cuj, kf> $$1 = new Object2ObjectOpenHashMap();
      $$1.defaultReturnValue((kf)($$0x, $$1x, $$2x, $$3, $$4, $$5) -> bqv.d);
      kf.a $$2 = new kf.a($$0, $$1);
      a.put($$0, $$2);
      return $$2;
   }

   bqv interact(dsb var1, dbx var2, iz var3, cmw var4, bqs var5, cuo var6);

   static void a() {
      Map<cuj, kf> $$0 = c.b();
      a($$0);
      $$0.put(cur.sk, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> {
         cwp $$6 = $$5.a(km.G);
         if ($$6 != null && $$6.a(cwq.a)) {
            if (!$$1x.B) {
               cuj $$7 = $$5.g();
               $$3x.a($$4, cuq.a($$5, $$3x, new cuo(cur.sl)));
               $$3x.a(awj.W);
               $$3x.b(awj.c.b($$7));
               $$1x.b($$2x, dfa.fu.o());
               $$1x.a(null, $$2x, avz.cB, awa.e, 1.0F, 1.0F);
               $$1x.a(null, dwu.z, $$2x);
            }

            return bqv.a($$1x.B);
         } else {
            return bqv.d;
         }
      });
      Map<cuj, kf> $$1 = d.b();
      a($$1);
      $$1.put(cur.qy, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> a($$0x, $$1x, $$2x, $$3x, $$4, $$5, new cuo(cur.qz), $$0xx -> $$0xx.c(djh.g) == 3, avz.di));
      $$1.put(cur.sl, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> {
         if (!$$1x.B) {
            cuj $$6 = $$5.g();
            $$3x.a($$4, cuq.a($$5, $$3x, cwp.a(cur.sk, cwq.a)));
            $$3x.a(awj.W);
            $$3x.b(awj.c.b($$6));
            djh.d($$0x, $$1x, $$2x);
            $$1x.a(null, $$2x, avz.cC, awa.e, 1.0F, 1.0F);
            $$1x.a(null, dwu.y, $$2x);
         }

         return bqv.a($$1x.B);
      });
      $$1.put(cur.sk, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> {
         if ($$0x.c(djh.g) == 3) {
            return bqv.d;
         } else {
            cwp $$6 = $$5.a(km.G);
            if ($$6 != null && $$6.a(cwq.a)) {
               if (!$$1x.B) {
                  $$3x.a($$4, cuq.a($$5, $$3x, new cuo(cur.sl)));
                  $$3x.a(awj.W);
                  $$3x.b(awj.c.b($$5.g()));
                  $$1x.b($$2x, $$0x.a(djh.g));
                  $$1x.a(null, $$2x, avz.cB, awa.e, 1.0F, 1.0F);
                  $$1x.a(null, dwu.z, $$2x);
               }

               return bqv.a($$1x.B);
            } else {
               return bqv.d;
            }
         }
      });
      $$1.put(cur.pB, l);
      $$1.put(cur.pA, l);
      $$1.put(cur.pz, l);
      $$1.put(cur.py, l);
      $$1.put(cur.uJ, l);
      $$1.put(cur.or, l);
      $$1.put(cur.uP, k);
      $$1.put(cur.uW, k);
      $$1.put(cur.ve, k);
      $$1.put(cur.va, k);
      $$1.put(cur.vb, k);
      $$1.put(cur.uY, k);
      $$1.put(cur.vc, k);
      $$1.put(cur.uS, k);
      $$1.put(cur.uX, k);
      $$1.put(cur.uU, k);
      $$1.put(cur.uR, k);
      $$1.put(cur.uQ, k);
      $$1.put(cur.uV, k);
      $$1.put(cur.uZ, k);
      $$1.put(cur.vd, k);
      $$1.put(cur.uT, k);
      $$1.put(cur.jd, j);
      $$1.put(cur.jk, j);
      $$1.put(cur.js, j);
      $$1.put(cur.jo, j);
      $$1.put(cur.jp, j);
      $$1.put(cur.jm, j);
      $$1.put(cur.jq, j);
      $$1.put(cur.jg, j);
      $$1.put(cur.jl, j);
      $$1.put(cur.ji, j);
      $$1.put(cur.jf, j);
      $$1.put(cur.je, j);
      $$1.put(cur.jj, j);
      $$1.put(cur.jn, j);
      $$1.put(cur.jr, j);
      $$1.put(cur.jh, j);
      Map<cuj, kf> $$2 = e.b();
      $$2.put(cur.qy, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> a($$0x, $$1x, $$2x, $$3x, $$4, $$5, new cuo(cur.qA), $$0xx -> true, avz.dl));
      a($$2);
      Map<cuj, kf> $$3 = f.b();
      $$3.put(cur.qy, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> a($$0x, $$1x, $$2x, $$3x, $$4, $$5, new cuo(cur.qB), $$0xx -> $$0xx.c(djh.g) == 3, avz.dm));
      a($$3);
   }

   static void a(Map<cuj, kf> $$0) {
      $$0.put(cur.qA, h);
      $$0.put(cur.qz, g);
      $$0.put(cur.qB, i);
   }

   static bqv a(dsb $$0, dbx $$1, iz $$2, cmw $$3, bqs $$4, cuo $$5, cuo $$6, Predicate<dsb> $$7, avy $$8) {
      if (!$$7.test($$0)) {
         return bqv.d;
      } else {
         if (!$$1.B) {
            cuj $$9 = $$5.g();
            $$3.a($$4, cuq.a($$5, $$3, $$6));
            $$3.a(awj.W);
            $$3.b(awj.c.b($$9));
            $$1.b($$2, dfa.ft.o());
            $$1.a(null, $$2, $$8, awa.e, 1.0F, 1.0F);
            $$1.a(null, dwu.y, $$2);
         }

         return bqv.a($$1.B);
      }
   }

   static bqv a(dbx $$0, iz $$1, cmw $$2, bqs $$3, cuo $$4, dsb $$5, avy $$6) {
      if (!$$0.B) {
         cuj $$7 = $$4.g();
         $$2.a($$3, cuq.a($$4, $$2, new cuo(cur.qy)));
         $$2.a(awj.V);
         $$2.b(awj.c.b($$7));
         $$0.b($$1, $$5);
         $$0.a(null, $$1, $$6, awa.e, 1.0F, 1.0F);
         $$0.a(null, dwu.z, $$1);
      }

      return bqv.a($$0.B);
   }

   public static record a(String a, Map<cuj, kf> b) {
   }
}
