import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Map;
import java.util.function.Predicate;

public interface jf {
   Map<String, jf.a> a = new Object2ObjectArrayMap();
   Codec<jf.a> b = avq.a(jf.a::a, a::get);
   jf.a c = a("empty");
   jf.a d = a("water");
   jf.a e = a("lava");
   jf.a f = a("powder_snow");
   jf g = ($$0, $$1, $$2, $$3, $$4, $$5) -> a($$1, $$2, $$3, $$4, $$5, cyu.fu.o().a(dda.g, Integer.valueOf(3)), atl.cU);
   jf h = ($$0, $$1, $$2, $$3, $$4, $$5) -> a($$1, $$2, $$3, $$4, $$5, cyu.fv.o(), atl.cX);
   jf i = ($$0, $$1, $$2, $$3, $$4, $$5) -> a($$1, $$2, $$3, $$4, $$5, cyu.fw.o().a(dda.g, Integer.valueOf(3)), atl.cY);
   jf j = ($$0, $$1, $$2, $$3, $$4, $$5) -> {
      cys $$6 = cys.a($$5.d());
      if (!($$6 instanceof dfq)) {
         return bly.d;
      } else {
         if (!$$1.B) {
            cpd $$7 = new cpd(cyu.kP);
            if ($$5.v()) {
               $$7.c($$5.w().h());
            }

            $$3.a($$4, $$7);
            $$3.a(atv.Z);
            dda.d($$0, $$1, $$2);
         }

         return bly.a($$1.B);
      }
   };
   jf k = ($$0, $$1, $$2, $$3, $$4, $$5) -> {
      if (din.c($$5) <= 0) {
         return bly.d;
      } else {
         if (!$$1.B) {
            cpd $$6 = $$5.c(1);
            din.d($$6);
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

            $$3.a(atv.Y);
            dda.d($$0, $$1, $$2);
         }

         return bly.a($$1.B);
      }
   };
   jf l = ($$0, $$1, $$2, $$3, $$4, $$5) -> {
      if (!($$5.d() instanceof cnv $$7)) {
         return bly.d;
      } else if (!$$7.a($$5)) {
         return bly.d;
      } else {
         if (!$$1.B) {
            $$7.f_($$5);
            $$3.a(atv.X);
            dda.d($$0, $$1, $$2);
         }

         return bly.a($$1.B);
      }
   };

   static jf.a a(String $$0) {
      Object2ObjectOpenHashMap<coy, jf> $$1 = new Object2ObjectOpenHashMap();
      $$1.defaultReturnValue((jf)($$0x, $$1x, $$2x, $$3, $$4, $$5) -> bly.d);
      jf.a $$2 = new jf.a($$0, $$1);
      a.put($$0, $$2);
      return $$2;
   }

   bly interact(dlj var1, cvr var2, hz var3, chl var4, blv var5, cpd var6);

   static void a() {
      Map<coy, jf> $$0 = c.b();
      a($$0);
      $$0.put(cpg.sj, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> {
         if (!crb.d($$5).a(crc.c)) {
            return bly.d;
         } else {
            if (!$$1x.B) {
               coy $$6 = $$5.d();
               $$3x.a($$4, cpf.a($$5, $$3x, new cpd(cpg.sk)));
               $$3x.a(atv.W);
               $$3x.b(atv.c.b($$6));
               $$1x.b($$2x, cyu.fu.o());
               $$1x.a(null, $$2x, atl.cu, atm.e, 1.0F, 1.0F);
               $$1x.a(null, dpw.z, $$2x);
            }

            return bly.a($$1x.B);
         }
      });
      Map<coy, jf> $$1 = d.b();
      a($$1);
      $$1.put(cpg.qx, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> a($$0x, $$1x, $$2x, $$3x, $$4, $$5, new cpd(cpg.qy), $$0xx -> $$0xx.c(dda.g) == 3, atl.da));
      $$1.put(cpg.sk, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> {
         if (!$$1x.B) {
            coy $$6 = $$5.d();
            $$3x.a($$4, cpf.a($$5, $$3x, crb.a(new cpd(cpg.sj), crc.c)));
            $$3x.a(atv.W);
            $$3x.b(atv.c.b($$6));
            dda.d($$0x, $$1x, $$2x);
            $$1x.a(null, $$2x, atl.cv, atm.e, 1.0F, 1.0F);
            $$1x.a(null, dpw.y, $$2x);
         }

         return bly.a($$1x.B);
      });
      $$1.put(cpg.sj, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> {
         if ($$0x.c(dda.g) != 3 && crb.d($$5).a(crc.c)) {
            if (!$$1x.B) {
               $$3x.a($$4, cpf.a($$5, $$3x, new cpd(cpg.sk)));
               $$3x.a(atv.W);
               $$3x.b(atv.c.b($$5.d()));
               $$1x.b($$2x, $$0x.a(dda.g));
               $$1x.a(null, $$2x, atl.cu, atm.e, 1.0F, 1.0F);
               $$1x.a(null, dpw.z, $$2x);
            }

            return bly.a($$1x.B);
         } else {
            return bly.d;
         }
      });
      $$1.put(cpg.pA, l);
      $$1.put(cpg.pz, l);
      $$1.put(cpg.py, l);
      $$1.put(cpg.px, l);
      $$1.put(cpg.uF, l);
      $$1.put(cpg.uL, k);
      $$1.put(cpg.uS, k);
      $$1.put(cpg.va, k);
      $$1.put(cpg.uW, k);
      $$1.put(cpg.uX, k);
      $$1.put(cpg.uU, k);
      $$1.put(cpg.uY, k);
      $$1.put(cpg.uO, k);
      $$1.put(cpg.uT, k);
      $$1.put(cpg.uQ, k);
      $$1.put(cpg.uN, k);
      $$1.put(cpg.uM, k);
      $$1.put(cpg.uR, k);
      $$1.put(cpg.uV, k);
      $$1.put(cpg.uZ, k);
      $$1.put(cpg.uP, k);
      $$1.put(cpg.jc, j);
      $$1.put(cpg.jj, j);
      $$1.put(cpg.jr, j);
      $$1.put(cpg.jn, j);
      $$1.put(cpg.jo, j);
      $$1.put(cpg.jl, j);
      $$1.put(cpg.jp, j);
      $$1.put(cpg.jf, j);
      $$1.put(cpg.jk, j);
      $$1.put(cpg.jh, j);
      $$1.put(cpg.je, j);
      $$1.put(cpg.jd, j);
      $$1.put(cpg.ji, j);
      $$1.put(cpg.jm, j);
      $$1.put(cpg.jq, j);
      $$1.put(cpg.jg, j);
      Map<coy, jf> $$2 = e.b();
      $$2.put(cpg.qx, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> a($$0x, $$1x, $$2x, $$3x, $$4, $$5, new cpd(cpg.qz), $$0xx -> true, atl.dd));
      a($$2);
      Map<coy, jf> $$3 = f.b();
      $$3.put(cpg.qx, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> a($$0x, $$1x, $$2x, $$3x, $$4, $$5, new cpd(cpg.qA), $$0xx -> $$0xx.c(dda.g) == 3, atl.de));
      a($$3);
   }

   static void a(Map<coy, jf> $$0) {
      $$0.put(cpg.qz, h);
      $$0.put(cpg.qy, g);
      $$0.put(cpg.qA, i);
   }

   static bly a(dlj $$0, cvr $$1, hz $$2, chl $$3, blv $$4, cpd $$5, cpd $$6, Predicate<dlj> $$7, atk $$8) {
      if (!$$7.test($$0)) {
         return bly.d;
      } else {
         if (!$$1.B) {
            coy $$9 = $$5.d();
            $$3.a($$4, cpf.a($$5, $$3, $$6));
            $$3.a(atv.W);
            $$3.b(atv.c.b($$9));
            $$1.b($$2, cyu.ft.o());
            $$1.a(null, $$2, $$8, atm.e, 1.0F, 1.0F);
            $$1.a(null, dpw.y, $$2);
         }

         return bly.a($$1.B);
      }
   }

   static bly a(cvr $$0, hz $$1, chl $$2, blv $$3, cpd $$4, dlj $$5, atk $$6) {
      if (!$$0.B) {
         coy $$7 = $$4.d();
         $$2.a($$3, cpf.a($$4, $$2, new cpd(cpg.qx)));
         $$2.a(atv.V);
         $$2.b(atv.c.b($$7));
         $$0.b($$1, $$5);
         $$0.a(null, $$1, $$6, atm.e, 1.0F, 1.0F);
         $$0.a(null, dpw.z, $$1);
      }

      return bly.a($$0.B);
   }

   public static record a(String a, Map<coy, jf> b) {
   }
}
