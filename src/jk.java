import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Map;
import java.util.function.Predicate;

public interface jk {
   Map<String, jk.a> a = new Object2ObjectArrayMap();
   Codec<jk.a> b = awu.a(jk.a::a, a::get);
   jk.a c = a("empty");
   jk.a d = a("water");
   jk.a e = a("lava");
   jk.a f = a("powder_snow");
   jk g = ($$0, $$1, $$2, $$3, $$4, $$5) -> a($$1, $$2, $$3, $$4, $$5, dcj.fu.n().a(dgp.g, Integer.valueOf(3)), auo.dc);
   jk h = ($$0, $$1, $$2, $$3, $$4, $$5) -> a($$1, $$2, $$3, $$4, $$5, dcj.fv.n(), auo.df);
   jk i = ($$0, $$1, $$2, $$3, $$4, $$5) -> a($$1, $$2, $$3, $$4, $$5, dcj.fw.n().a(dgp.g, Integer.valueOf(3)), auo.dg);
   jk j = ($$0, $$1, $$2, $$3, $$4, $$5) -> {
      dch $$6 = dch.a($$5.f());
      if (!($$6 instanceof djf)) {
         return boh.d;
      } else {
         if (!$$1.B) {
            $$3.a($$4, $$5.a(dcj.kP, 1));
            $$3.a(auz.Z);
            dgp.d($$0, $$1, $$2);
         }

         return boh.a($$1.B);
      }
   };
   jk k = ($$0, $$1, $$2, $$3, $$4, $$5) -> {
      dmf $$6 = $$5.a(jr.N, dmf.a);
      if ($$6.b().isEmpty()) {
         return boh.d;
      } else {
         if (!$$1.B) {
            crs $$7 = $$5.c(1);
            $$7.b(jr.N, $$6.a());
            $$5.a(1, $$3);
            if ($$5.d()) {
               $$3.a($$4, $$7);
            } else if ($$3.fZ().e($$7)) {
               $$3.bZ.b();
            } else {
               $$3.a($$7, false);
            }

            $$3.a(auz.Y);
            dgp.d($$0, $$1, $$2);
         }

         return boh.a($$1.B);
      }
   };
   jk l = ($$0, $$1, $$2, $$3, $$4, $$5) -> {
      if (!$$5.a(avm.ba)) {
         return boh.d;
      } else if (!$$5.b(jr.q)) {
         return boh.d;
      } else {
         if (!$$1.B) {
            $$5.c(jr.q);
            $$3.a(auz.X);
            dgp.d($$0, $$1, $$2);
         }

         return boh.a($$1.B);
      }
   };

   static jk.a a(String $$0) {
      Object2ObjectOpenHashMap<crn, jk> $$1 = new Object2ObjectOpenHashMap();
      $$1.defaultReturnValue((jk)($$0x, $$1x, $$2x, $$3, $$4, $$5) -> boh.d);
      jk.a $$2 = new jk.a($$0, $$1);
      a.put($$0, $$2);
      return $$2;
   }

   boh interact(dpi var1, czg var2, id var3, cka var4, boe var5, crs var6);

   static void a() {
      Map<crn, jk> $$0 = c.b();
      a($$0);
      $$0.put(crv.sj, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> {
         ctq $$6 = $$5.a(jr.x);
         if ($$6 != null && $$6.a(ctr.a)) {
            if (!$$1x.B) {
               crn $$7 = $$5.f();
               $$3x.a($$4, cru.a($$5, $$3x, new crs(crv.sk)));
               $$3x.a(auz.W);
               $$3x.b(auz.c.b($$7));
               $$1x.b($$2x, dcj.fu.n());
               $$1x.a(null, $$2x, auo.cB, aup.e, 1.0F, 1.0F);
               $$1x.a(null, dub.z, $$2x);
            }

            return boh.a($$1x.B);
         } else {
            return boh.d;
         }
      });
      Map<crn, jk> $$1 = d.b();
      a($$1);
      $$1.put(crv.qx, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> a($$0x, $$1x, $$2x, $$3x, $$4, $$5, new crs(crv.qy), $$0xx -> $$0xx.c(dgp.g) == 3, auo.di));
      $$1.put(crv.sk, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> {
         if (!$$1x.B) {
            crn $$6 = $$5.f();
            $$3x.a($$4, cru.a($$5, $$3x, ctq.a(crv.sj, ctr.a)));
            $$3x.a(auz.W);
            $$3x.b(auz.c.b($$6));
            dgp.d($$0x, $$1x, $$2x);
            $$1x.a(null, $$2x, auo.cC, aup.e, 1.0F, 1.0F);
            $$1x.a(null, dub.y, $$2x);
         }

         return boh.a($$1x.B);
      });
      $$1.put(crv.sj, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> {
         if ($$0x.c(dgp.g) == 3) {
            return boh.d;
         } else {
            ctq $$6 = $$5.a(jr.x);
            if ($$6 != null && $$6.a(ctr.a)) {
               if (!$$1x.B) {
                  $$3x.a($$4, cru.a($$5, $$3x, new crs(crv.sk)));
                  $$3x.a(auz.W);
                  $$3x.b(auz.c.b($$5.f()));
                  $$1x.b($$2x, $$0x.a(dgp.g));
                  $$1x.a(null, $$2x, auo.cB, aup.e, 1.0F, 1.0F);
                  $$1x.a(null, dub.z, $$2x);
               }

               return boh.a($$1x.B);
            } else {
               return boh.d;
            }
         }
      });
      $$1.put(crv.pA, l);
      $$1.put(crv.pz, l);
      $$1.put(crv.py, l);
      $$1.put(crv.px, l);
      $$1.put(crv.uH, l);
      $$1.put(crv.oq, l);
      $$1.put(crv.uN, k);
      $$1.put(crv.uU, k);
      $$1.put(crv.vc, k);
      $$1.put(crv.uY, k);
      $$1.put(crv.uZ, k);
      $$1.put(crv.uW, k);
      $$1.put(crv.va, k);
      $$1.put(crv.uQ, k);
      $$1.put(crv.uV, k);
      $$1.put(crv.uS, k);
      $$1.put(crv.uP, k);
      $$1.put(crv.uO, k);
      $$1.put(crv.uT, k);
      $$1.put(crv.uX, k);
      $$1.put(crv.vb, k);
      $$1.put(crv.uR, k);
      $$1.put(crv.jc, j);
      $$1.put(crv.jj, j);
      $$1.put(crv.jr, j);
      $$1.put(crv.jn, j);
      $$1.put(crv.jo, j);
      $$1.put(crv.jl, j);
      $$1.put(crv.jp, j);
      $$1.put(crv.jf, j);
      $$1.put(crv.jk, j);
      $$1.put(crv.jh, j);
      $$1.put(crv.je, j);
      $$1.put(crv.jd, j);
      $$1.put(crv.ji, j);
      $$1.put(crv.jm, j);
      $$1.put(crv.jq, j);
      $$1.put(crv.jg, j);
      Map<crn, jk> $$2 = e.b();
      $$2.put(crv.qx, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> a($$0x, $$1x, $$2x, $$3x, $$4, $$5, new crs(crv.qz), $$0xx -> true, auo.dl));
      a($$2);
      Map<crn, jk> $$3 = f.b();
      $$3.put(crv.qx, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> a($$0x, $$1x, $$2x, $$3x, $$4, $$5, new crs(crv.qA), $$0xx -> $$0xx.c(dgp.g) == 3, auo.dm));
      a($$3);
   }

   static void a(Map<crn, jk> $$0) {
      $$0.put(crv.qz, h);
      $$0.put(crv.qy, g);
      $$0.put(crv.qA, i);
   }

   static boh a(dpi $$0, czg $$1, id $$2, cka $$3, boe $$4, crs $$5, crs $$6, Predicate<dpi> $$7, aun $$8) {
      if (!$$7.test($$0)) {
         return boh.d;
      } else {
         if (!$$1.B) {
            crn $$9 = $$5.f();
            $$3.a($$4, cru.a($$5, $$3, $$6));
            $$3.a(auz.W);
            $$3.b(auz.c.b($$9));
            $$1.b($$2, dcj.ft.n());
            $$1.a(null, $$2, $$8, aup.e, 1.0F, 1.0F);
            $$1.a(null, dub.y, $$2);
         }

         return boh.a($$1.B);
      }
   }

   static boh a(czg $$0, id $$1, cka $$2, boe $$3, crs $$4, dpi $$5, aun $$6) {
      if (!$$0.B) {
         crn $$7 = $$4.f();
         $$2.a($$3, cru.a($$4, $$2, new crs(crv.qx)));
         $$2.a(auz.V);
         $$2.b(auz.c.b($$7));
         $$0.b($$1, $$5);
         $$0.a(null, $$1, $$6, aup.e, 1.0F, 1.0F);
         $$0.a(null, dub.z, $$1);
      }

      return boh.a($$0.B);
   }

   public static record a(String a, Map<crn, jk> b) {
   }
}
