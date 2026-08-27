import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Map;
import java.util.function.Predicate;

public interface jt {
   Map<String, jt.a> a = new Object2ObjectArrayMap();
   Codec<jt.a> b = axh.a(jt.a::a, a::get);
   jt.a c = a("empty");
   jt.a d = a("water");
   jt.a e = a("lava");
   jt.a f = a("powder_snow");
   jt g = ($$0, $$1, $$2, $$3, $$4, $$5) -> a($$1, $$2, $$3, $$4, $$5, ddg.fu.n().a(dhn.g, Integer.valueOf(3)), avc.dc);
   jt h = ($$0, $$1, $$2, $$3, $$4, $$5) -> a($$1, $$2, $$3, $$4, $$5, ddg.fv.n(), avc.df);
   jt i = ($$0, $$1, $$2, $$3, $$4, $$5) -> a($$1, $$2, $$3, $$4, $$5, ddg.fw.n().a(dhn.g, Integer.valueOf(3)), avc.dg);
   jt j = ($$0, $$1, $$2, $$3, $$4, $$5) -> {
      dde $$6 = dde.a($$5.f());
      if (!($$6 instanceof dkd)) {
         return bpo.d;
      } else {
         if (!$$1.B) {
            $$3.a($$4, $$5.a(ddg.kP, 1));
            $$3.a(avm.Z);
            dhn.d($$0, $$1, $$2);
         }

         return bpo.a($$1.B);
      }
   };
   jt k = ($$0, $$1, $$2, $$3, $$4, $$5) -> {
      dnd $$6 = $$5.a(ka.U, dnd.a);
      if ($$6.b().isEmpty()) {
         return bpo.d;
      } else {
         if (!$$1.B) {
            csz $$7 = $$5.c(1);
            $$7.b(ka.U, $$6.a());
            $$5.a(1, $$3);
            if ($$5.d()) {
               $$3.a($$4, $$7);
            } else if ($$3.ga().f($$7)) {
               $$3.cb.b();
            } else {
               $$3.a($$7, false);
            }

            $$3.a(avm.Y);
            dhn.d($$0, $$1, $$2);
         }

         return bpo.a($$1.B);
      }
   };
   jt l = ($$0, $$1, $$2, $$3, $$4, $$5) -> {
      if (!$$5.a(avz.bz)) {
         return bpo.d;
      } else if (!$$5.b(ka.x)) {
         return bpo.d;
      } else {
         if (!$$1.B) {
            $$5.c(ka.x);
            $$3.a(avm.X);
            dhn.d($$0, $$1, $$2);
         }

         return bpo.a($$1.B);
      }
   };

   static jt.a a(String $$0) {
      Object2ObjectOpenHashMap<csu, jt> $$1 = new Object2ObjectOpenHashMap();
      $$1.defaultReturnValue((jt)($$0x, $$1x, $$2x, $$3, $$4, $$5) -> bpo.d);
      jt.a $$2 = new jt.a($$0, $$1);
      a.put($$0, $$2);
      return $$2;
   }

   bpo interact(dqh var1, dad var2, in var3, clh var4, bpl var5, csz var6);

   static void a() {
      Map<csu, jt> $$0 = c.b();
      a($$0);
      $$0.put(ctc.sk, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> {
         cuy $$6 = $$5.a(ka.E);
         if ($$6 != null && $$6.a(cuz.a)) {
            if (!$$1x.B) {
               csu $$7 = $$5.f();
               $$3x.a($$4, ctb.a($$5, $$3x, new csz(ctc.sl)));
               $$3x.a(avm.W);
               $$3x.b(avm.c.b($$7));
               $$1x.b($$2x, ddg.fu.n());
               $$1x.a(null, $$2x, avc.cB, avd.e, 1.0F, 1.0F);
               $$1x.a(null, dva.z, $$2x);
            }

            return bpo.a($$1x.B);
         } else {
            return bpo.d;
         }
      });
      Map<csu, jt> $$1 = d.b();
      a($$1);
      $$1.put(ctc.qy, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> a($$0x, $$1x, $$2x, $$3x, $$4, $$5, new csz(ctc.qz), $$0xx -> $$0xx.c(dhn.g) == 3, avc.di));
      $$1.put(ctc.sl, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> {
         if (!$$1x.B) {
            csu $$6 = $$5.f();
            $$3x.a($$4, ctb.a($$5, $$3x, cuy.a(ctc.sk, cuz.a)));
            $$3x.a(avm.W);
            $$3x.b(avm.c.b($$6));
            dhn.d($$0x, $$1x, $$2x);
            $$1x.a(null, $$2x, avc.cC, avd.e, 1.0F, 1.0F);
            $$1x.a(null, dva.y, $$2x);
         }

         return bpo.a($$1x.B);
      });
      $$1.put(ctc.sk, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> {
         if ($$0x.c(dhn.g) == 3) {
            return bpo.d;
         } else {
            cuy $$6 = $$5.a(ka.E);
            if ($$6 != null && $$6.a(cuz.a)) {
               if (!$$1x.B) {
                  $$3x.a($$4, ctb.a($$5, $$3x, new csz(ctc.sl)));
                  $$3x.a(avm.W);
                  $$3x.b(avm.c.b($$5.f()));
                  $$1x.b($$2x, $$0x.a(dhn.g));
                  $$1x.a(null, $$2x, avc.cB, avd.e, 1.0F, 1.0F);
                  $$1x.a(null, dva.z, $$2x);
               }

               return bpo.a($$1x.B);
            } else {
               return bpo.d;
            }
         }
      });
      $$1.put(ctc.pB, l);
      $$1.put(ctc.pA, l);
      $$1.put(ctc.pz, l);
      $$1.put(ctc.py, l);
      $$1.put(ctc.uJ, l);
      $$1.put(ctc.or, l);
      $$1.put(ctc.uP, k);
      $$1.put(ctc.uW, k);
      $$1.put(ctc.ve, k);
      $$1.put(ctc.va, k);
      $$1.put(ctc.vb, k);
      $$1.put(ctc.uY, k);
      $$1.put(ctc.vc, k);
      $$1.put(ctc.uS, k);
      $$1.put(ctc.uX, k);
      $$1.put(ctc.uU, k);
      $$1.put(ctc.uR, k);
      $$1.put(ctc.uQ, k);
      $$1.put(ctc.uV, k);
      $$1.put(ctc.uZ, k);
      $$1.put(ctc.vd, k);
      $$1.put(ctc.uT, k);
      $$1.put(ctc.jd, j);
      $$1.put(ctc.jk, j);
      $$1.put(ctc.js, j);
      $$1.put(ctc.jo, j);
      $$1.put(ctc.jp, j);
      $$1.put(ctc.jm, j);
      $$1.put(ctc.jq, j);
      $$1.put(ctc.jg, j);
      $$1.put(ctc.jl, j);
      $$1.put(ctc.ji, j);
      $$1.put(ctc.jf, j);
      $$1.put(ctc.je, j);
      $$1.put(ctc.jj, j);
      $$1.put(ctc.jn, j);
      $$1.put(ctc.jr, j);
      $$1.put(ctc.jh, j);
      Map<csu, jt> $$2 = e.b();
      $$2.put(ctc.qy, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> a($$0x, $$1x, $$2x, $$3x, $$4, $$5, new csz(ctc.qA), $$0xx -> true, avc.dl));
      a($$2);
      Map<csu, jt> $$3 = f.b();
      $$3.put(ctc.qy, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> a($$0x, $$1x, $$2x, $$3x, $$4, $$5, new csz(ctc.qB), $$0xx -> $$0xx.c(dhn.g) == 3, avc.dm));
      a($$3);
   }

   static void a(Map<csu, jt> $$0) {
      $$0.put(ctc.qA, h);
      $$0.put(ctc.qz, g);
      $$0.put(ctc.qB, i);
   }

   static bpo a(dqh $$0, dad $$1, in $$2, clh $$3, bpl $$4, csz $$5, csz $$6, Predicate<dqh> $$7, avb $$8) {
      if (!$$7.test($$0)) {
         return bpo.d;
      } else {
         if (!$$1.B) {
            csu $$9 = $$5.f();
            $$3.a($$4, ctb.a($$5, $$3, $$6));
            $$3.a(avm.W);
            $$3.b(avm.c.b($$9));
            $$1.b($$2, ddg.ft.n());
            $$1.a(null, $$2, $$8, avd.e, 1.0F, 1.0F);
            $$1.a(null, dva.y, $$2);
         }

         return bpo.a($$1.B);
      }
   }

   static bpo a(dad $$0, in $$1, clh $$2, bpl $$3, csz $$4, dqh $$5, avb $$6) {
      if (!$$0.B) {
         csu $$7 = $$4.f();
         $$2.a($$3, ctb.a($$4, $$2, new csz(ctc.qy)));
         $$2.a(avm.V);
         $$2.b(avm.c.b($$7));
         $$0.b($$1, $$5);
         $$0.a(null, $$1, $$6, avd.e, 1.0F, 1.0F);
         $$0.a(null, dva.z, $$1);
      }

      return bpo.a($$0.B);
   }

   public static record a(String a, Map<csu, jt> b) {
   }
}
