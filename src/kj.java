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
   kj g = ($$0, $$1, $$2, $$3, $$4, $$5) -> a($$1, $$2, $$3, $$4, $$5, dga.fu.o().a(dkh.g, Integer.valueOf(3)), avp.dc);
   kj h = ($$0, $$1, $$2, $$3, $$4, $$5) -> a($$1, $$2, $$3, $$4, $$5, dga.fv.o(), avp.df);
   kj i = ($$0, $$1, $$2, $$3, $$4, $$5) -> a($$1, $$2, $$3, $$4, $$5, dga.fw.o().a(dkh.g, Integer.valueOf(3)), avp.dg);
   kj j = ($$0, $$1, $$2, $$3, $$4, $$5) -> {
      dfy $$6 = dfy.a($$5.g());
      if (!($$6 instanceof dmy)) {
         return bqt.d;
      } else {
         if (!$$1.B) {
            cuq $$7 = $$5.a(dga.kP, 1);
            $$3.a($$4, cus.a($$5, $$3, $$7, false));
            $$3.a(avz.Z);
            dkh.d($$0, $$1, $$2);
         }

         return bqt.a($$1.B);
      }
   };
   kj k = ($$0, $$1, $$2, $$3, $$4, $$5) -> {
      dpy $$6 = $$5.a(kq.Y, dpy.a);
      if ($$6.b().isEmpty()) {
         return bqt.d;
      } else {
         if (!$$1.B) {
            cuq $$7 = $$5.c(1);
            $$7.b(kq.Y, $$6.a());
            $$3.a($$4, cus.a($$5, $$3, $$7, false));
            $$3.a(avz.Y);
            dkh.d($$0, $$1, $$2);
         }

         return bqt.a($$1.B);
      }
   };
   kj l = ($$0, $$1, $$2, $$3, $$4, $$5) -> {
      if (!$$5.a(awn.bx)) {
         return bqt.d;
      } else if (!$$5.b(kq.z)) {
         return bqt.d;
      } else {
         if (!$$1.B) {
            $$5.c(kq.z);
            $$3.a(avz.X);
            dkh.d($$0, $$1, $$2);
         }

         return bqt.a($$1.B);
      }
   };

   static kj.a a(String $$0) {
      Object2ObjectOpenHashMap<cul, kj> $$1 = new Object2ObjectOpenHashMap();
      $$1.defaultReturnValue((kj)($$0x, $$1x, $$2x, $$3, $$4, $$5) -> bqt.d);
      kj.a $$2 = new kj.a($$0, $$1);
      a.put($$0, $$2);
      return $$2;
   }

   bqt interact(dtc var1, dcw var2, jd var3, cmx var4, bqq var5, cuq var6);

   static void a() {
      Map<cul, kj> $$0 = c.b();
      a($$0);
      $$0.put(cut.sk, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> {
         cwu $$6 = $$5.a(kq.G);
         if ($$6 != null && $$6.a(cwv.a)) {
            if (!$$1x.B) {
               cul $$7 = $$5.g();
               $$3x.a($$4, cus.a($$5, $$3x, new cuq(cut.sl)));
               $$3x.a(avz.W);
               $$3x.b(avz.c.b($$7));
               $$1x.b($$2x, dga.fu.o());
               $$1x.a(null, $$2x, avp.cB, avq.e, 1.0F, 1.0F);
               $$1x.a(null, dxz.z, $$2x);
            }

            return bqt.a($$1x.B);
         } else {
            return bqt.d;
         }
      });
      Map<cul, kj> $$1 = d.b();
      a($$1);
      $$1.put(cut.qy, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> a($$0x, $$1x, $$2x, $$3x, $$4, $$5, new cuq(cut.qz), $$0xx -> $$0xx.c(dkh.g) == 3, avp.di));
      $$1.put(cut.sl, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> {
         if (!$$1x.B) {
            cul $$6 = $$5.g();
            $$3x.a($$4, cus.a($$5, $$3x, cwu.a(cut.sk, cwv.a)));
            $$3x.a(avz.W);
            $$3x.b(avz.c.b($$6));
            dkh.d($$0x, $$1x, $$2x);
            $$1x.a(null, $$2x, avp.cC, avq.e, 1.0F, 1.0F);
            $$1x.a(null, dxz.y, $$2x);
         }

         return bqt.a($$1x.B);
      });
      $$1.put(cut.sk, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> {
         if ($$0x.c(dkh.g) == 3) {
            return bqt.d;
         } else {
            cwu $$6 = $$5.a(kq.G);
            if ($$6 != null && $$6.a(cwv.a)) {
               if (!$$1x.B) {
                  $$3x.a($$4, cus.a($$5, $$3x, new cuq(cut.sl)));
                  $$3x.a(avz.W);
                  $$3x.b(avz.c.b($$5.g()));
                  $$1x.b($$2x, $$0x.a(dkh.g));
                  $$1x.a(null, $$2x, avp.cB, avq.e, 1.0F, 1.0F);
                  $$1x.a(null, dxz.z, $$2x);
               }

               return bqt.a($$1x.B);
            } else {
               return bqt.d;
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
      Map<cul, kj> $$2 = e.b();
      $$2.put(cut.qy, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> a($$0x, $$1x, $$2x, $$3x, $$4, $$5, new cuq(cut.qA), $$0xx -> true, avp.dl));
      a($$2);
      Map<cul, kj> $$3 = f.b();
      $$3.put(cut.qy, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> a($$0x, $$1x, $$2x, $$3x, $$4, $$5, new cuq(cut.qB), $$0xx -> $$0xx.c(dkh.g) == 3, avp.dm));
      a($$3);
   }

   static void a(Map<cul, kj> $$0) {
      $$0.put(cut.qA, h);
      $$0.put(cut.qz, g);
      $$0.put(cut.qB, i);
   }

   static bqt a(dtc $$0, dcw $$1, jd $$2, cmx $$3, bqq $$4, cuq $$5, cuq $$6, Predicate<dtc> $$7, avo $$8) {
      if (!$$7.test($$0)) {
         return bqt.d;
      } else {
         if (!$$1.B) {
            cul $$9 = $$5.g();
            $$3.a($$4, cus.a($$5, $$3, $$6));
            $$3.a(avz.W);
            $$3.b(avz.c.b($$9));
            $$1.b($$2, dga.ft.o());
            $$1.a(null, $$2, $$8, avq.e, 1.0F, 1.0F);
            $$1.a(null, dxz.y, $$2);
         }

         return bqt.a($$1.B);
      }
   }

   static bqt a(dcw $$0, jd $$1, cmx $$2, bqq $$3, cuq $$4, dtc $$5, avo $$6) {
      if (!$$0.B) {
         cul $$7 = $$4.g();
         $$2.a($$3, cus.a($$4, $$2, new cuq(cut.qy)));
         $$2.a(avz.V);
         $$2.b(avz.c.b($$7));
         $$0.b($$1, $$5);
         $$0.a(null, $$1, $$6, avq.e, 1.0F, 1.0F);
         $$0.a(null, dxz.z, $$1);
      }

      return bqt.a($$0.B);
   }

   public static record a(String a, Map<cul, kj> b) {
   }
}
