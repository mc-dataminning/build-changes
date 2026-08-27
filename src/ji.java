import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Map;
import java.util.function.Predicate;

public interface ji {
   Map<String, ji.a> a = new Object2ObjectArrayMap();
   Codec<ji.a> b = aws.a(ji.a::a, a::get);
   ji.a c = a("empty");
   ji.a d = a("water");
   ji.a e = a("lava");
   ji.a f = a("powder_snow");
   ji g = ($$0, $$1, $$2, $$3, $$4, $$5) -> a($$1, $$2, $$3, $$4, $$5, dca.fu.n().a(dgg.g, Integer.valueOf(3)), aum.dc);
   ji h = ($$0, $$1, $$2, $$3, $$4, $$5) -> a($$1, $$2, $$3, $$4, $$5, dca.fv.n(), aum.df);
   ji i = ($$0, $$1, $$2, $$3, $$4, $$5) -> a($$1, $$2, $$3, $$4, $$5, dca.fw.n().a(dgg.g, Integer.valueOf(3)), aum.dg);
   ji j = ($$0, $$1, $$2, $$3, $$4, $$5) -> {
      dby $$6 = dby.a($$5.f());
      if (!($$6 instanceof diw)) {
         return boc.d;
      } else {
         if (!$$1.B) {
            $$3.a($$4, $$5.a(dca.kP, 1));
            $$3.a(auw.Z);
            dgg.d($$0, $$1, $$2);
         }

         return boc.a($$1.B);
      }
   };
   ji k = ($$0, $$1, $$2, $$3, $$4, $$5) -> {
      dlw $$6 = $$5.a(jp.N, dlw.a);
      if ($$6.b().isEmpty()) {
         return boc.d;
      } else {
         if (!$$1.B) {
            crj $$7 = $$5.c(1);
            $$7.b(jp.N, $$6.a());
            $$5.a(1, $$3);
            if ($$5.d()) {
               $$3.a($$4, $$7);
            } else if ($$3.fZ().e($$7)) {
               $$3.bX.b();
            } else {
               $$3.a($$7, false);
            }

            $$3.a(auw.Y);
            dgg.d($$0, $$1, $$2);
         }

         return boc.a($$1.B);
      }
   };
   ji l = ($$0, $$1, $$2, $$3, $$4, $$5) -> {
      if (!$$5.a(avk.ba)) {
         return boc.d;
      } else if (!$$5.b(jp.q)) {
         return boc.d;
      } else {
         if (!$$1.B) {
            $$5.c(jp.q);
            $$3.a(auw.X);
            dgg.d($$0, $$1, $$2);
         }

         return boc.a($$1.B);
      }
   };

   static ji.a a(String $$0) {
      Object2ObjectOpenHashMap<cre, ji> $$1 = new Object2ObjectOpenHashMap();
      $$1.defaultReturnValue((ji)($$0x, $$1x, $$2x, $$3, $$4, $$5) -> boc.d);
      ji.a $$2 = new ji.a($$0, $$1);
      a.put($$0, $$2);
      return $$2;
   }

   boc interact(doz var1, cyx var2, ib var3, cjt var4, bnz var5, crj var6);

   static void a() {
      Map<cre, ji> $$0 = c.b();
      a($$0);
      $$0.put(crm.sj, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> {
         cth $$6 = $$5.a(jp.x);
         if ($$6 != null && $$6.a(cti.a)) {
            if (!$$1x.B) {
               cre $$7 = $$5.f();
               $$3x.a($$4, crl.a($$5, $$3x, new crj(crm.sk)));
               $$3x.a(auw.W);
               $$3x.b(auw.c.b($$7));
               $$1x.b($$2x, dca.fu.n());
               $$1x.a(null, $$2x, aum.cB, aun.e, 1.0F, 1.0F);
               $$1x.a(null, dts.z, $$2x);
            }

            return boc.a($$1x.B);
         } else {
            return boc.d;
         }
      });
      Map<cre, ji> $$1 = d.b();
      a($$1);
      $$1.put(crm.qx, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> a($$0x, $$1x, $$2x, $$3x, $$4, $$5, new crj(crm.qy), $$0xx -> $$0xx.c(dgg.g) == 3, aum.di));
      $$1.put(crm.sk, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> {
         if (!$$1x.B) {
            cre $$6 = $$5.f();
            $$3x.a($$4, crl.a($$5, $$3x, cth.a(crm.sj, cti.a)));
            $$3x.a(auw.W);
            $$3x.b(auw.c.b($$6));
            dgg.d($$0x, $$1x, $$2x);
            $$1x.a(null, $$2x, aum.cC, aun.e, 1.0F, 1.0F);
            $$1x.a(null, dts.y, $$2x);
         }

         return boc.a($$1x.B);
      });
      $$1.put(crm.sj, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> {
         if ($$0x.c(dgg.g) == 3) {
            return boc.d;
         } else {
            cth $$6 = $$5.a(jp.x);
            if ($$6 != null && $$6.a(cti.a)) {
               if (!$$1x.B) {
                  $$3x.a($$4, crl.a($$5, $$3x, new crj(crm.sk)));
                  $$3x.a(auw.W);
                  $$3x.b(auw.c.b($$5.f()));
                  $$1x.b($$2x, $$0x.a(dgg.g));
                  $$1x.a(null, $$2x, aum.cB, aun.e, 1.0F, 1.0F);
                  $$1x.a(null, dts.z, $$2x);
               }

               return boc.a($$1x.B);
            } else {
               return boc.d;
            }
         }
      });
      $$1.put(crm.pA, l);
      $$1.put(crm.pz, l);
      $$1.put(crm.py, l);
      $$1.put(crm.px, l);
      $$1.put(crm.uH, l);
      $$1.put(crm.oq, l);
      $$1.put(crm.uN, k);
      $$1.put(crm.uU, k);
      $$1.put(crm.vc, k);
      $$1.put(crm.uY, k);
      $$1.put(crm.uZ, k);
      $$1.put(crm.uW, k);
      $$1.put(crm.va, k);
      $$1.put(crm.uQ, k);
      $$1.put(crm.uV, k);
      $$1.put(crm.uS, k);
      $$1.put(crm.uP, k);
      $$1.put(crm.uO, k);
      $$1.put(crm.uT, k);
      $$1.put(crm.uX, k);
      $$1.put(crm.vb, k);
      $$1.put(crm.uR, k);
      $$1.put(crm.jc, j);
      $$1.put(crm.jj, j);
      $$1.put(crm.jr, j);
      $$1.put(crm.jn, j);
      $$1.put(crm.jo, j);
      $$1.put(crm.jl, j);
      $$1.put(crm.jp, j);
      $$1.put(crm.jf, j);
      $$1.put(crm.jk, j);
      $$1.put(crm.jh, j);
      $$1.put(crm.je, j);
      $$1.put(crm.jd, j);
      $$1.put(crm.ji, j);
      $$1.put(crm.jm, j);
      $$1.put(crm.jq, j);
      $$1.put(crm.jg, j);
      Map<cre, ji> $$2 = e.b();
      $$2.put(crm.qx, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> a($$0x, $$1x, $$2x, $$3x, $$4, $$5, new crj(crm.qz), $$0xx -> true, aum.dl));
      a($$2);
      Map<cre, ji> $$3 = f.b();
      $$3.put(crm.qx, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> a($$0x, $$1x, $$2x, $$3x, $$4, $$5, new crj(crm.qA), $$0xx -> $$0xx.c(dgg.g) == 3, aum.dm));
      a($$3);
   }

   static void a(Map<cre, ji> $$0) {
      $$0.put(crm.qz, h);
      $$0.put(crm.qy, g);
      $$0.put(crm.qA, i);
   }

   static boc a(doz $$0, cyx $$1, ib $$2, cjt $$3, bnz $$4, crj $$5, crj $$6, Predicate<doz> $$7, aul $$8) {
      if (!$$7.test($$0)) {
         return boc.d;
      } else {
         if (!$$1.B) {
            cre $$9 = $$5.f();
            $$3.a($$4, crl.a($$5, $$3, $$6));
            $$3.a(auw.W);
            $$3.b(auw.c.b($$9));
            $$1.b($$2, dca.ft.n());
            $$1.a(null, $$2, $$8, aun.e, 1.0F, 1.0F);
            $$1.a(null, dts.y, $$2);
         }

         return boc.a($$1.B);
      }
   }

   static boc a(cyx $$0, ib $$1, cjt $$2, bnz $$3, crj $$4, doz $$5, aul $$6) {
      if (!$$0.B) {
         cre $$7 = $$4.f();
         $$2.a($$3, crl.a($$4, $$2, new crj(crm.qx)));
         $$2.a(auw.V);
         $$2.b(auw.c.b($$7));
         $$0.b($$1, $$5);
         $$0.a(null, $$1, $$6, aun.e, 1.0F, 1.0F);
         $$0.a(null, dts.z, $$1);
      }

      return boc.a($$0.B);
   }

   public static record a(String a, Map<cre, ji> b) {
   }
}
