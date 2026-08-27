import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Map;
import java.util.function.Predicate;

public interface jf {
   Map<String, jf.a> a = new Object2ObjectArrayMap();
   Codec<jf.a> b = avp.a(jf.a::a, a::get);
   jf.a c = a("empty");
   jf.a d = a("water");
   jf.a e = a("lava");
   jf.a f = a("powder_snow");
   jf g = ($$0, $$1, $$2, $$3, $$4, $$5) -> a($$1, $$2, $$3, $$4, $$5, cyq.fu.o().a(dcw.g, Integer.valueOf(3)), atk.cT);
   jf h = ($$0, $$1, $$2, $$3, $$4, $$5) -> a($$1, $$2, $$3, $$4, $$5, cyq.fv.o(), atk.cW);
   jf i = ($$0, $$1, $$2, $$3, $$4, $$5) -> a($$1, $$2, $$3, $$4, $$5, cyq.fw.o().a(dcw.g, Integer.valueOf(3)), atk.cX);
   jf j = ($$0, $$1, $$2, $$3, $$4, $$5) -> {
      cyo $$6 = cyo.a($$5.d());
      if (!($$6 instanceof dfm)) {
         return blw.d;
      } else {
         if (!$$1.B) {
            coz $$7 = new coz(cyq.kP);
            if ($$5.v()) {
               $$7.c($$5.w().h());
            }

            $$3.a($$4, $$7);
            $$3.a(atu.Z);
            dcw.d($$0, $$1, $$2);
         }

         return blw.a($$1.B);
      }
   };
   jf k = ($$0, $$1, $$2, $$3, $$4, $$5) -> {
      if (dij.c($$5) <= 0) {
         return blw.d;
      } else {
         if (!$$1.B) {
            coz $$6 = $$5.c(1);
            dij.d($$6);
            if (!$$3.fU().d) {
               $$5.h(1);
            }

            if ($$5.b()) {
               $$3.a($$4, $$6);
            } else if ($$3.fT().e($$6)) {
               $$3.bV.b();
            } else {
               $$3.a($$6, false);
            }

            $$3.a(atu.Y);
            dcw.d($$0, $$1, $$2);
         }

         return blw.a($$1.B);
      }
   };
   jf l = ($$0, $$1, $$2, $$3, $$4, $$5) -> {
      if (!($$5.d() instanceof cnr $$7)) {
         return blw.d;
      } else if (!$$7.a($$5)) {
         return blw.d;
      } else {
         if (!$$1.B) {
            $$7.f_($$5);
            $$3.a(atu.X);
            dcw.d($$0, $$1, $$2);
         }

         return blw.a($$1.B);
      }
   };

   static jf.a a(String $$0) {
      Object2ObjectOpenHashMap<cou, jf> $$1 = new Object2ObjectOpenHashMap();
      $$1.defaultReturnValue((jf)($$0x, $$1x, $$2x, $$3, $$4, $$5) -> blw.d);
      jf.a $$2 = new jf.a($$0, $$1);
      a.put($$0, $$2);
      return $$2;
   }

   blw interact(dlf var1, cvn var2, hz var3, chh var4, blt var5, coz var6);

   static void a() {
      Map<cou, jf> $$0 = c.b();
      a($$0);
      $$0.put(cpc.sj, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> {
         if (!cqx.d($$5).a(cqy.c)) {
            return blw.d;
         } else {
            if (!$$1x.B) {
               cou $$6 = $$5.d();
               $$3x.a($$4, cpb.a($$5, $$3x, new coz(cpc.sk)));
               $$3x.a(atu.W);
               $$3x.b(atu.c.b($$6));
               $$1x.b($$2x, cyq.fu.o());
               $$1x.a(null, $$2x, atk.ct, atl.e, 1.0F, 1.0F);
               $$1x.a(null, dpp.z, $$2x);
            }

            return blw.a($$1x.B);
         }
      });
      Map<cou, jf> $$1 = d.b();
      a($$1);
      $$1.put(cpc.qx, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> a($$0x, $$1x, $$2x, $$3x, $$4, $$5, new coz(cpc.qy), $$0xx -> $$0xx.c(dcw.g) == 3, atk.cZ));
      $$1.put(cpc.sk, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> {
         if (!$$1x.B) {
            cou $$6 = $$5.d();
            $$3x.a($$4, cpb.a($$5, $$3x, cqx.a(new coz(cpc.sj), cqy.c)));
            $$3x.a(atu.W);
            $$3x.b(atu.c.b($$6));
            dcw.d($$0x, $$1x, $$2x);
            $$1x.a(null, $$2x, atk.cu, atl.e, 1.0F, 1.0F);
            $$1x.a(null, dpp.y, $$2x);
         }

         return blw.a($$1x.B);
      });
      $$1.put(cpc.sj, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> {
         if ($$0x.c(dcw.g) != 3 && cqx.d($$5).a(cqy.c)) {
            if (!$$1x.B) {
               $$3x.a($$4, cpb.a($$5, $$3x, new coz(cpc.sk)));
               $$3x.a(atu.W);
               $$3x.b(atu.c.b($$5.d()));
               $$1x.b($$2x, $$0x.a(dcw.g));
               $$1x.a(null, $$2x, atk.ct, atl.e, 1.0F, 1.0F);
               $$1x.a(null, dpp.z, $$2x);
            }

            return blw.a($$1x.B);
         } else {
            return blw.d;
         }
      });
      $$1.put(cpc.pA, l);
      $$1.put(cpc.pz, l);
      $$1.put(cpc.py, l);
      $$1.put(cpc.px, l);
      $$1.put(cpc.uF, l);
      $$1.put(cpc.uL, k);
      $$1.put(cpc.uS, k);
      $$1.put(cpc.va, k);
      $$1.put(cpc.uW, k);
      $$1.put(cpc.uX, k);
      $$1.put(cpc.uU, k);
      $$1.put(cpc.uY, k);
      $$1.put(cpc.uO, k);
      $$1.put(cpc.uT, k);
      $$1.put(cpc.uQ, k);
      $$1.put(cpc.uN, k);
      $$1.put(cpc.uM, k);
      $$1.put(cpc.uR, k);
      $$1.put(cpc.uV, k);
      $$1.put(cpc.uZ, k);
      $$1.put(cpc.uP, k);
      $$1.put(cpc.jc, j);
      $$1.put(cpc.jj, j);
      $$1.put(cpc.jr, j);
      $$1.put(cpc.jn, j);
      $$1.put(cpc.jo, j);
      $$1.put(cpc.jl, j);
      $$1.put(cpc.jp, j);
      $$1.put(cpc.jf, j);
      $$1.put(cpc.jk, j);
      $$1.put(cpc.jh, j);
      $$1.put(cpc.je, j);
      $$1.put(cpc.jd, j);
      $$1.put(cpc.ji, j);
      $$1.put(cpc.jm, j);
      $$1.put(cpc.jq, j);
      $$1.put(cpc.jg, j);
      Map<cou, jf> $$2 = e.b();
      $$2.put(cpc.qx, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> a($$0x, $$1x, $$2x, $$3x, $$4, $$5, new coz(cpc.qz), $$0xx -> true, atk.dc));
      a($$2);
      Map<cou, jf> $$3 = f.b();
      $$3.put(cpc.qx, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> a($$0x, $$1x, $$2x, $$3x, $$4, $$5, new coz(cpc.qA), $$0xx -> $$0xx.c(dcw.g) == 3, atk.dd));
      a($$3);
   }

   static void a(Map<cou, jf> $$0) {
      $$0.put(cpc.qz, h);
      $$0.put(cpc.qy, g);
      $$0.put(cpc.qA, i);
   }

   static blw a(dlf $$0, cvn $$1, hz $$2, chh $$3, blt $$4, coz $$5, coz $$6, Predicate<dlf> $$7, atj $$8) {
      if (!$$7.test($$0)) {
         return blw.d;
      } else {
         if (!$$1.B) {
            cou $$9 = $$5.d();
            $$3.a($$4, cpb.a($$5, $$3, $$6));
            $$3.a(atu.W);
            $$3.b(atu.c.b($$9));
            $$1.b($$2, cyq.ft.o());
            $$1.a(null, $$2, $$8, atl.e, 1.0F, 1.0F);
            $$1.a(null, dpp.y, $$2);
         }

         return blw.a($$1.B);
      }
   }

   static blw a(cvn $$0, hz $$1, chh $$2, blt $$3, coz $$4, dlf $$5, atj $$6) {
      if (!$$0.B) {
         cou $$7 = $$4.d();
         $$2.a($$3, cpb.a($$4, $$2, new coz(cpc.qx)));
         $$2.a(atu.V);
         $$2.b(atu.c.b($$7));
         $$0.b($$1, $$5);
         $$0.a(null, $$1, $$6, atl.e, 1.0F, 1.0F);
         $$0.a(null, dpp.z, $$1);
      }

      return blw.a($$0.B);
   }

   public static record a(String a, Map<cou, jf> b) {
   }
}
