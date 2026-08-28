import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Map;
import java.util.function.Predicate;

public interface kj {
   Map<String, kj.a> a = new Object2ObjectArrayMap();
   Codec<kj.a> b = Codec.stringResolver(kj.a::a, a::get);
   kj.a c = a("empty");
   kj.a d = a("water");
   kj.a e = a("lava");
   kj.a f = a("powder_snow");
   kj g = ($$0, $$1, $$2, $$3, $$4, $$5) -> a($$1, $$2, $$3, $$4, $$5, dfy.fu.o().a(dkf.g, Integer.valueOf(3)), avo.dc);
   kj h = ($$0, $$1, $$2, $$3, $$4, $$5) -> a($$1, $$2, $$3, $$4, $$5, dfy.fv.o(), avo.df);
   kj i = ($$0, $$1, $$2, $$3, $$4, $$5) -> a($$1, $$2, $$3, $$4, $$5, dfy.fw.o().a(dkf.g, Integer.valueOf(3)), avo.dg);
   kj j = ($$0, $$1, $$2, $$3, $$4, $$5) -> {
      dfw $$6 = dfw.a($$5.g());
      if (!($$6 instanceof dmw)) {
         return bqs.d;
      } else {
         if (!$$1.B) {
            cuo $$7 = $$5.a(dfy.kP, 1);
            $$3.a($$4, cuq.a($$5, $$3, $$7, false));
            $$3.a(avy.Z);
            dkf.d($$0, $$1, $$2);
         }

         return bqs.a($$1.B);
      }
   };
   kj k = ($$0, $$1, $$2, $$3, $$4, $$5) -> {
      dpw $$6 = $$5.a(kq.Y, dpw.a);
      if ($$6.b().isEmpty()) {
         return bqs.d;
      } else {
         if (!$$1.B) {
            cuo $$7 = $$5.c(1);
            $$7.b(kq.Y, $$6.a());
            $$3.a($$4, cuq.a($$5, $$3, $$7, false));
            $$3.a(avy.Y);
            dkf.d($$0, $$1, $$2);
         }

         return bqs.a($$1.B);
      }
   };
   kj l = ($$0, $$1, $$2, $$3, $$4, $$5) -> {
      if (!$$5.a(awm.bx)) {
         return bqs.d;
      } else if (!$$5.b(kq.z)) {
         return bqs.d;
      } else {
         if (!$$1.B) {
            $$5.c(kq.z);
            $$3.a(avy.X);
            dkf.d($$0, $$1, $$2);
         }

         return bqs.a($$1.B);
      }
   };

   static kj.a a(String $$0) {
      Object2ObjectOpenHashMap<cuj, kj> $$1 = new Object2ObjectOpenHashMap();
      $$1.defaultReturnValue((kj)($$0x, $$1x, $$2x, $$3, $$4, $$5) -> bqs.d);
      kj.a $$2 = new kj.a($$0, $$1);
      a.put($$0, $$2);
      return $$2;
   }

   bqs interact(dta var1, dcu var2, jd var3, cmv var4, bqp var5, cuo var6);

   static void a() {
      Map<cuj, kj> $$0 = c.b();
      a($$0);
      $$0.put(cur.sk, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> {
         cws $$6 = $$5.a(kq.G);
         if ($$6 != null && $$6.a(cwt.a)) {
            if (!$$1x.B) {
               cuj $$7 = $$5.g();
               $$3x.a($$4, cuq.a($$5, $$3x, new cuo(cur.sl)));
               $$3x.a(avy.W);
               $$3x.b(avy.c.b($$7));
               $$1x.b($$2x, dfy.fu.o());
               $$1x.a(null, $$2x, avo.cB, avp.e, 1.0F, 1.0F);
               $$1x.a(null, dxw.z, $$2x);
            }

            return bqs.a($$1x.B);
         } else {
            return bqs.d;
         }
      });
      Map<cuj, kj> $$1 = d.b();
      a($$1);
      $$1.put(cur.qy, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> a($$0x, $$1x, $$2x, $$3x, $$4, $$5, new cuo(cur.qz), $$0xx -> $$0xx.c(dkf.g) == 3, avo.di));
      $$1.put(cur.sl, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> {
         if (!$$1x.B) {
            cuj $$6 = $$5.g();
            $$3x.a($$4, cuq.a($$5, $$3x, cws.a(cur.sk, cwt.a)));
            $$3x.a(avy.W);
            $$3x.b(avy.c.b($$6));
            dkf.d($$0x, $$1x, $$2x);
            $$1x.a(null, $$2x, avo.cC, avp.e, 1.0F, 1.0F);
            $$1x.a(null, dxw.y, $$2x);
         }

         return bqs.a($$1x.B);
      });
      $$1.put(cur.sk, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> {
         if ($$0x.c(dkf.g) == 3) {
            return bqs.d;
         } else {
            cws $$6 = $$5.a(kq.G);
            if ($$6 != null && $$6.a(cwt.a)) {
               if (!$$1x.B) {
                  $$3x.a($$4, cuq.a($$5, $$3x, new cuo(cur.sl)));
                  $$3x.a(avy.W);
                  $$3x.b(avy.c.b($$5.g()));
                  $$1x.b($$2x, $$0x.a(dkf.g));
                  $$1x.a(null, $$2x, avo.cB, avp.e, 1.0F, 1.0F);
                  $$1x.a(null, dxw.z, $$2x);
               }

               return bqs.a($$1x.B);
            } else {
               return bqs.d;
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
      Map<cuj, kj> $$2 = e.b();
      $$2.put(cur.qy, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> a($$0x, $$1x, $$2x, $$3x, $$4, $$5, new cuo(cur.qA), $$0xx -> true, avo.dl));
      a($$2);
      Map<cuj, kj> $$3 = f.b();
      $$3.put(cur.qy, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> a($$0x, $$1x, $$2x, $$3x, $$4, $$5, new cuo(cur.qB), $$0xx -> $$0xx.c(dkf.g) == 3, avo.dm));
      a($$3);
   }

   static void a(Map<cuj, kj> $$0) {
      $$0.put(cur.qA, h);
      $$0.put(cur.qz, g);
      $$0.put(cur.qB, i);
   }

   static bqs a(dta $$0, dcu $$1, jd $$2, cmv $$3, bqp $$4, cuo $$5, cuo $$6, Predicate<dta> $$7, avn $$8) {
      if (!$$7.test($$0)) {
         return bqs.d;
      } else {
         if (!$$1.B) {
            cuj $$9 = $$5.g();
            $$3.a($$4, cuq.a($$5, $$3, $$6));
            $$3.a(avy.W);
            $$3.b(avy.c.b($$9));
            $$1.b($$2, dfy.ft.o());
            $$1.a(null, $$2, $$8, avp.e, 1.0F, 1.0F);
            $$1.a(null, dxw.y, $$2);
         }

         return bqs.a($$1.B);
      }
   }

   static bqs a(dcu $$0, jd $$1, cmv $$2, bqp $$3, cuo $$4, dta $$5, avn $$6) {
      if (!$$0.B) {
         cuj $$7 = $$4.g();
         $$2.a($$3, cuq.a($$4, $$2, new cuo(cur.qy)));
         $$2.a(avy.V);
         $$2.b(avy.c.b($$7));
         $$0.b($$1, $$5);
         $$0.a(null, $$1, $$6, avp.e, 1.0F, 1.0F);
         $$0.a(null, dxw.z, $$1);
      }

      return bqs.a($$0.B);
   }

   public static record a(String a, Map<cuj, kj> b) {
   }
}
