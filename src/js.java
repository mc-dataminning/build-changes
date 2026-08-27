import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Map;
import java.util.function.Predicate;

public interface js {
   Map<String, js.a> a = new Object2ObjectArrayMap();
   Codec<js.a> b = axe.a(js.a::a, a::get);
   js.a c = a("empty");
   js.a d = a("water");
   js.a e = a("lava");
   js.a f = a("powder_snow");
   js g = ($$0, $$1, $$2, $$3, $$4, $$5) -> a($$1, $$2, $$3, $$4, $$5, dcx.fu.n().a(dhe.g, Integer.valueOf(3)), auz.dc);
   js h = ($$0, $$1, $$2, $$3, $$4, $$5) -> a($$1, $$2, $$3, $$4, $$5, dcx.fv.n(), auz.df);
   js i = ($$0, $$1, $$2, $$3, $$4, $$5) -> a($$1, $$2, $$3, $$4, $$5, dcx.fw.n().a(dhe.g, Integer.valueOf(3)), auz.dg);
   js j = ($$0, $$1, $$2, $$3, $$4, $$5) -> {
      dcv $$6 = dcv.a($$5.f());
      if (!($$6 instanceof dju)) {
         return bos.d;
      } else {
         if (!$$1.B) {
            $$3.a($$4, $$5.a(dcx.kP, 1));
            $$3.a(avj.Z);
            dhe.d($$0, $$1, $$2);
         }

         return bos.a($$1.B);
      }
   };
   js k = ($$0, $$1, $$2, $$3, $$4, $$5) -> {
      dmu $$6 = $$5.a(jz.N, dmu.a);
      if ($$6.b().isEmpty()) {
         return bos.d;
      } else {
         if (!$$1.B) {
            csd $$7 = $$5.c(1);
            $$7.b(jz.N, $$6.a());
            $$5.a(1, $$3);
            if ($$5.d()) {
               $$3.a($$4, $$7);
            } else if ($$3.ga().e($$7)) {
               $$3.cb.b();
            } else {
               $$3.a($$7, false);
            }

            $$3.a(avj.Y);
            dhe.d($$0, $$1, $$2);
         }

         return bos.a($$1.B);
      }
   };
   js l = ($$0, $$1, $$2, $$3, $$4, $$5) -> {
      if (!$$5.a(avw.ba)) {
         return bos.d;
      } else if (!$$5.b(jz.q)) {
         return bos.d;
      } else {
         if (!$$1.B) {
            $$5.c(jz.q);
            $$3.a(avj.X);
            dhe.d($$0, $$1, $$2);
         }

         return bos.a($$1.B);
      }
   };

   static js.a a(String $$0) {
      Object2ObjectOpenHashMap<cry, js> $$1 = new Object2ObjectOpenHashMap();
      $$1.defaultReturnValue((js)($$0x, $$1x, $$2x, $$3, $$4, $$5) -> bos.d);
      js.a $$2 = new js.a($$0, $$1);
      a.put($$0, $$2);
      return $$2;
   }

   bos interact(dpy var1, czu var2, im var3, ckl var4, bop var5, csd var6);

   static void a() {
      Map<cry, js> $$0 = c.b();
      a($$0);
      $$0.put(csg.sk, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> {
         cuc $$6 = $$5.a(jz.x);
         if ($$6 != null && $$6.a(cud.a)) {
            if (!$$1x.B) {
               cry $$7 = $$5.f();
               $$3x.a($$4, csf.a($$5, $$3x, new csd(csg.sl)));
               $$3x.a(avj.W);
               $$3x.b(avj.c.b($$7));
               $$1x.b($$2x, dcx.fu.n());
               $$1x.a(null, $$2x, auz.cB, ava.e, 1.0F, 1.0F);
               $$1x.a(null, dur.z, $$2x);
            }

            return bos.a($$1x.B);
         } else {
            return bos.d;
         }
      });
      Map<cry, js> $$1 = d.b();
      a($$1);
      $$1.put(csg.qy, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> a($$0x, $$1x, $$2x, $$3x, $$4, $$5, new csd(csg.qz), $$0xx -> $$0xx.c(dhe.g) == 3, auz.di));
      $$1.put(csg.sl, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> {
         if (!$$1x.B) {
            cry $$6 = $$5.f();
            $$3x.a($$4, csf.a($$5, $$3x, cuc.a(csg.sk, cud.a)));
            $$3x.a(avj.W);
            $$3x.b(avj.c.b($$6));
            dhe.d($$0x, $$1x, $$2x);
            $$1x.a(null, $$2x, auz.cC, ava.e, 1.0F, 1.0F);
            $$1x.a(null, dur.y, $$2x);
         }

         return bos.a($$1x.B);
      });
      $$1.put(csg.sk, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> {
         if ($$0x.c(dhe.g) == 3) {
            return bos.d;
         } else {
            cuc $$6 = $$5.a(jz.x);
            if ($$6 != null && $$6.a(cud.a)) {
               if (!$$1x.B) {
                  $$3x.a($$4, csf.a($$5, $$3x, new csd(csg.sl)));
                  $$3x.a(avj.W);
                  $$3x.b(avj.c.b($$5.f()));
                  $$1x.b($$2x, $$0x.a(dhe.g));
                  $$1x.a(null, $$2x, auz.cB, ava.e, 1.0F, 1.0F);
                  $$1x.a(null, dur.z, $$2x);
               }

               return bos.a($$1x.B);
            } else {
               return bos.d;
            }
         }
      });
      $$1.put(csg.pB, l);
      $$1.put(csg.pA, l);
      $$1.put(csg.pz, l);
      $$1.put(csg.py, l);
      $$1.put(csg.uJ, l);
      $$1.put(csg.or, l);
      $$1.put(csg.uP, k);
      $$1.put(csg.uW, k);
      $$1.put(csg.ve, k);
      $$1.put(csg.va, k);
      $$1.put(csg.vb, k);
      $$1.put(csg.uY, k);
      $$1.put(csg.vc, k);
      $$1.put(csg.uS, k);
      $$1.put(csg.uX, k);
      $$1.put(csg.uU, k);
      $$1.put(csg.uR, k);
      $$1.put(csg.uQ, k);
      $$1.put(csg.uV, k);
      $$1.put(csg.uZ, k);
      $$1.put(csg.vd, k);
      $$1.put(csg.uT, k);
      $$1.put(csg.jd, j);
      $$1.put(csg.jk, j);
      $$1.put(csg.js, j);
      $$1.put(csg.jo, j);
      $$1.put(csg.jp, j);
      $$1.put(csg.jm, j);
      $$1.put(csg.jq, j);
      $$1.put(csg.jg, j);
      $$1.put(csg.jl, j);
      $$1.put(csg.ji, j);
      $$1.put(csg.jf, j);
      $$1.put(csg.je, j);
      $$1.put(csg.jj, j);
      $$1.put(csg.jn, j);
      $$1.put(csg.jr, j);
      $$1.put(csg.jh, j);
      Map<cry, js> $$2 = e.b();
      $$2.put(csg.qy, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> a($$0x, $$1x, $$2x, $$3x, $$4, $$5, new csd(csg.qA), $$0xx -> true, auz.dl));
      a($$2);
      Map<cry, js> $$3 = f.b();
      $$3.put(csg.qy, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> a($$0x, $$1x, $$2x, $$3x, $$4, $$5, new csd(csg.qB), $$0xx -> $$0xx.c(dhe.g) == 3, auz.dm));
      a($$3);
   }

   static void a(Map<cry, js> $$0) {
      $$0.put(csg.qA, h);
      $$0.put(csg.qz, g);
      $$0.put(csg.qB, i);
   }

   static bos a(dpy $$0, czu $$1, im $$2, ckl $$3, bop $$4, csd $$5, csd $$6, Predicate<dpy> $$7, auy $$8) {
      if (!$$7.test($$0)) {
         return bos.d;
      } else {
         if (!$$1.B) {
            cry $$9 = $$5.f();
            $$3.a($$4, csf.a($$5, $$3, $$6));
            $$3.a(avj.W);
            $$3.b(avj.c.b($$9));
            $$1.b($$2, dcx.ft.n());
            $$1.a(null, $$2, $$8, ava.e, 1.0F, 1.0F);
            $$1.a(null, dur.y, $$2);
         }

         return bos.a($$1.B);
      }
   }

   static bos a(czu $$0, im $$1, ckl $$2, bop $$3, csd $$4, dpy $$5, auy $$6) {
      if (!$$0.B) {
         cry $$7 = $$4.f();
         $$2.a($$3, csf.a($$4, $$2, new csd(csg.qy)));
         $$2.a(avj.V);
         $$2.b(avj.c.b($$7));
         $$0.b($$1, $$5);
         $$0.a(null, $$1, $$6, ava.e, 1.0F, 1.0F);
         $$0.a(null, dur.z, $$1);
      }

      return bos.a($$0.B);
   }

   public static record a(String a, Map<cry, js> b) {
   }
}
