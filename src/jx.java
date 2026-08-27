import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Map;
import java.util.function.Predicate;

public interface jx {
   Map<String, jx.a> a = new Object2ObjectArrayMap();
   Codec<jx.a> b = axu.a(jx.a::a, a::get);
   jx.a c = a("empty");
   jx.a d = a("water");
   jx.a e = a("lava");
   jx.a f = a("powder_snow");
   jx g = ($$0, $$1, $$2, $$3, $$4, $$5) -> a($$1, $$2, $$3, $$4, $$5, dfe.gm.n().a(djp.g, Integer.valueOf(3)), avo.dh);
   jx h = ($$0, $$1, $$2, $$3, $$4, $$5) -> a($$1, $$2, $$3, $$4, $$5, dfe.gn.n(), avo.dk);
   jx i = ($$0, $$1, $$2, $$3, $$4, $$5) -> a($$1, $$2, $$3, $$4, $$5, dfe.go.n().a(djp.g, Integer.valueOf(3)), avo.dl);
   jx j = ($$0, $$1, $$2, $$3, $$4, $$5) -> {
      dfc $$6 = dfc.a($$5.f());
      if (!($$6 instanceof dmp)) {
         return bqc.d;
      } else {
         if (!$$1.C) {
            $$3.a($$4, $$5.a(dfe.lN, 1));
            $$3.a(avz.Z);
            djp.d($$0, $$1, $$2);
         }

         return bqc.a($$1.C);
      }
   };
   jx k = ($$0, $$1, $$2, $$3, $$4, $$5) -> {
      dps $$6 = $$5.a(ke.W, dps.a);
      if ($$6.b().isEmpty()) {
         return bqc.d;
      } else {
         if (!$$1.C) {
            cuh $$7 = $$5.c(1);
            $$7.b(ke.W, $$6.a());
            $$5.a(1, $$3);
            if ($$5.d()) {
               $$3.a($$4, $$7);
            } else if ($$3.gl().f($$7)) {
               $$3.cp.b();
            } else {
               $$3.a($$7, false);
            }

            $$3.a(avz.Y);
            djp.d($$0, $$1, $$2);
         }

         return bqc.a($$1.C);
      }
   };
   jx l = ($$0, $$1, $$2, $$3, $$4, $$5) -> {
      if (!$$5.a(awm.bA)) {
         return bqc.d;
      } else if (!$$5.b(ke.x)) {
         return bqc.d;
      } else {
         if (!$$1.C) {
            $$5.c(ke.x);
            $$3.a(avz.X);
            djp.d($$0, $$1, $$2);
         }

         return bqc.a($$1.C);
      }
   };

   static jx.a a(String $$0) {
      Object2ObjectOpenHashMap<cuc, jx> $$1 = new Object2ObjectOpenHashMap();
      $$1.defaultReturnValue((jx)($$0x, $$1x, $$2x, $$3, $$4, $$5) -> bqc.d);
      jx.a $$2 = new jx.a($$0, $$1);
      a.put($$0, $$2);
      return $$2;
   }

   bqc interact(dtc var1, dca var2, ir var3, cly var4, bpz var5, cuh var6);

   static void a() {
      Map<cuc, jx> $$0 = c.b();
      a($$0);
      $$0.put(cuk.tH, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> {
         cwr $$6 = $$5.a(ke.E);
         if ($$6 != null && $$6.a(cws.a)) {
            if (!$$1x.C) {
               cuc $$7 = $$5.f();
               $$3x.a($$4, cuj.a($$5, $$3x, new cuh(cuk.tI)));
               $$3x.a(avz.W);
               $$3x.b(avz.c.b($$7));
               $$1x.b($$2x, dfe.gm.n());
               $$1x.a(null, $$2x, avo.cG, avq.e, 1.0F, 1.0F);
               $$1x.a(null, dxv.z, $$2x);
            }

            return bqc.a($$1x.C);
         } else {
            return bqc.d;
         }
      });
      Map<cuc, jx> $$1 = d.b();
      a($$1);
      $$1.put(cuk.rV, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> a($$0x, $$1x, $$2x, $$3x, $$4, $$5, new cuh(cuk.rW), $$0xx -> $$0xx.c(djp.g) == 3, avo.dn));
      $$1.put(cuk.tI, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> {
         if (!$$1x.C) {
            cuc $$6 = $$5.f();
            $$3x.a($$4, cuj.a($$5, $$3x, cwr.a(cuk.tH, cws.a)));
            $$3x.a(avz.W);
            $$3x.b(avz.c.b($$6));
            djp.d($$0x, $$1x, $$2x);
            $$1x.a(null, $$2x, avo.cH, avq.e, 1.0F, 1.0F);
            $$1x.a(null, dxv.y, $$2x);
         }

         return bqc.a($$1x.C);
      });
      $$1.put(cuk.tH, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> {
         if ($$0x.c(djp.g) == 3) {
            return bqc.d;
         } else {
            cwr $$6 = $$5.a(ke.E);
            if ($$6 != null && $$6.a(cws.a)) {
               if (!$$1x.C) {
                  $$3x.a($$4, cuj.a($$5, $$3x, new cuh(cuk.tI)));
                  $$3x.a(avz.W);
                  $$3x.b(avz.c.b($$5.f()));
                  $$1x.b($$2x, $$0x.a(djp.g));
                  $$1x.a(null, $$2x, avo.cG, avq.e, 1.0F, 1.0F);
                  $$1x.a(null, dxv.z, $$2x);
               }

               return bqc.a($$1x.C);
            } else {
               return bqc.d;
            }
         }
      });
      $$1.put(cuk.qU, l);
      $$1.put(cuk.qT, l);
      $$1.put(cuk.qS, l);
      $$1.put(cuk.qR, l);
      $$1.put(cuk.wu, l);
      $$1.put(cuk.pH, l);
      $$1.put(cuk.wA, k);
      $$1.put(cuk.wH, k);
      $$1.put(cuk.wP, k);
      $$1.put(cuk.wL, k);
      $$1.put(cuk.wM, k);
      $$1.put(cuk.wJ, k);
      $$1.put(cuk.wN, k);
      $$1.put(cuk.wD, k);
      $$1.put(cuk.wI, k);
      $$1.put(cuk.wF, k);
      $$1.put(cuk.wC, k);
      $$1.put(cuk.wB, k);
      $$1.put(cuk.wG, k);
      $$1.put(cuk.wK, k);
      $$1.put(cuk.wO, k);
      $$1.put(cuk.wE, k);
      $$1.put(cuk.ks, j);
      $$1.put(cuk.kz, j);
      $$1.put(cuk.kH, j);
      $$1.put(cuk.kD, j);
      $$1.put(cuk.kE, j);
      $$1.put(cuk.kB, j);
      $$1.put(cuk.kF, j);
      $$1.put(cuk.kv, j);
      $$1.put(cuk.kA, j);
      $$1.put(cuk.kx, j);
      $$1.put(cuk.ku, j);
      $$1.put(cuk.kt, j);
      $$1.put(cuk.ky, j);
      $$1.put(cuk.kC, j);
      $$1.put(cuk.kG, j);
      $$1.put(cuk.kw, j);
      Map<cuc, jx> $$2 = e.b();
      $$2.put(cuk.rV, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> a($$0x, $$1x, $$2x, $$3x, $$4, $$5, new cuh(cuk.rX), $$0xx -> true, avo.dq));
      a($$2);
      Map<cuc, jx> $$3 = f.b();
      $$3.put(cuk.rV, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> a($$0x, $$1x, $$2x, $$3x, $$4, $$5, new cuh(cuk.rY), $$0xx -> $$0xx.c(djp.g) == 3, avo.dr));
      a($$3);
   }

   static void a(Map<cuc, jx> $$0) {
      $$0.put(cuk.rX, h);
      $$0.put(cuk.rW, g);
      $$0.put(cuk.rY, i);
   }

   static bqc a(dtc $$0, dca $$1, ir $$2, cly $$3, bpz $$4, cuh $$5, cuh $$6, Predicate<dtc> $$7, avn $$8) {
      if (!$$7.test($$0)) {
         return bqc.d;
      } else {
         if (!$$1.C) {
            cuc $$9 = $$5.f();
            $$3.a($$4, cuj.a($$5, $$3, $$6));
            $$3.a(avz.W);
            $$3.b(avz.c.b($$9));
            $$1.b($$2, dfe.gl.n());
            $$1.a(null, $$2, $$8, avq.e, 1.0F, 1.0F);
            $$1.a(null, dxv.y, $$2);
         }

         return bqc.a($$1.C);
      }
   }

   static bqc a(dca $$0, ir $$1, cly $$2, bpz $$3, cuh $$4, dtc $$5, avn $$6) {
      if (!$$0.C) {
         cuc $$7 = $$4.f();
         $$2.a($$3, cuj.a($$4, $$2, new cuh(cuk.rV)));
         $$2.a(avz.V);
         $$2.b(avz.c.b($$7));
         $$0.b($$1, $$5);
         $$0.a(null, $$1, $$6, avq.e, 1.0F, 1.0F);
         $$0.a(null, dxv.z, $$1);
      }

      return bqc.a($$0.C);
   }

   public static record a(String a, Map<cuc, jx> b) {
   }
}
