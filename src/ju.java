import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Map;
import java.util.function.Predicate;

public interface ju {
   Map<String, ju.a> a = new Object2ObjectArrayMap();
   Codec<ju.a> b = Codec.stringResolver(ju.a::a, a::get);
   ju.a c = a("empty");
   ju.a d = a("water");
   ju.a e = a("lava");
   ju.a f = a("powder_snow");
   ju g = ($$0, $$1, $$2, $$3, $$4, $$5) -> a($$1, $$2, $$3, $$4, $$5, dea.fu.n().a(dih.g, Integer.valueOf(3)), avh.dc);
   ju h = ($$0, $$1, $$2, $$3, $$4, $$5) -> a($$1, $$2, $$3, $$4, $$5, dea.fv.n(), avh.df);
   ju i = ($$0, $$1, $$2, $$3, $$4, $$5) -> a($$1, $$2, $$3, $$4, $$5, dea.fw.n().a(dih.g, Integer.valueOf(3)), avh.dg);
   ju j = ($$0, $$1, $$2, $$3, $$4, $$5) -> {
      ddy $$6 = ddy.a($$5.g());
      if (!($$6 instanceof dkx)) {
         return bpw.d;
      } else {
         if (!$$1.B) {
            $$3.a($$4, $$5.a(dea.kP, 1));
            $$3.a(avr.Z);
            dih.d($$0, $$1, $$2);
         }

         return bpw.a($$1.B);
      }
   };
   ju k = ($$0, $$1, $$2, $$3, $$4, $$5) -> {
      dnx $$6 = $$5.a(kb.W, dnx.a);
      if ($$6.b().isEmpty()) {
         return bpw.d;
      } else {
         if (!$$1.B) {
            cto $$7 = $$5.c(1);
            $$7.b(kb.W, $$6.a());
            $$5.a(1, $$3);
            if ($$5.e()) {
               $$3.a($$4, $$7);
            } else if ($$3.gc().f($$7)) {
               $$3.cb.b();
            } else {
               $$3.a($$7, false);
            }

            $$3.a(avr.Y);
            dih.d($$0, $$1, $$2);
         }

         return bpw.a($$1.B);
      }
   };
   ju l = ($$0, $$1, $$2, $$3, $$4, $$5) -> {
      if (!$$5.a(awe.bz)) {
         return bpw.d;
      } else if (!$$5.b(kb.y)) {
         return bpw.d;
      } else {
         if (!$$1.B) {
            $$5.c(kb.y);
            $$3.a(avr.X);
            dih.d($$0, $$1, $$2);
         }

         return bpw.a($$1.B);
      }
   };

   static ju.a a(String $$0) {
      Object2ObjectOpenHashMap<ctj, ju> $$1 = new Object2ObjectOpenHashMap();
      $$1.defaultReturnValue((ju)($$0x, $$1x, $$2x, $$3, $$4, $$5) -> bpw.d);
      ju.a $$2 = new ju.a($$0, $$1);
      a.put($$0, $$2);
      return $$2;
   }

   bpw interact(drb var1, dax var2, io var3, clw var4, bpt var5, cto var6);

   static void a() {
      Map<ctj, ju> $$0 = c.b();
      a($$0);
      $$0.put(ctr.sk, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> {
         cvp $$6 = $$5.a(kb.F);
         if ($$6 != null && $$6.a(cvq.a)) {
            if (!$$1x.B) {
               ctj $$7 = $$5.g();
               $$3x.a($$4, ctq.a($$5, $$3x, new cto(ctr.sl)));
               $$3x.a(avr.W);
               $$3x.b(avr.c.b($$7));
               $$1x.b($$2x, dea.fu.n());
               $$1x.a(null, $$2x, avh.cB, avi.e, 1.0F, 1.0F);
               $$1x.a(null, dvu.z, $$2x);
            }

            return bpw.a($$1x.B);
         } else {
            return bpw.d;
         }
      });
      Map<ctj, ju> $$1 = d.b();
      a($$1);
      $$1.put(ctr.qy, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> a($$0x, $$1x, $$2x, $$3x, $$4, $$5, new cto(ctr.qz), $$0xx -> $$0xx.c(dih.g) == 3, avh.di));
      $$1.put(ctr.sl, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> {
         if (!$$1x.B) {
            ctj $$6 = $$5.g();
            $$3x.a($$4, ctq.a($$5, $$3x, cvp.a(ctr.sk, cvq.a)));
            $$3x.a(avr.W);
            $$3x.b(avr.c.b($$6));
            dih.d($$0x, $$1x, $$2x);
            $$1x.a(null, $$2x, avh.cC, avi.e, 1.0F, 1.0F);
            $$1x.a(null, dvu.y, $$2x);
         }

         return bpw.a($$1x.B);
      });
      $$1.put(ctr.sk, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> {
         if ($$0x.c(dih.g) == 3) {
            return bpw.d;
         } else {
            cvp $$6 = $$5.a(kb.F);
            if ($$6 != null && $$6.a(cvq.a)) {
               if (!$$1x.B) {
                  $$3x.a($$4, ctq.a($$5, $$3x, new cto(ctr.sl)));
                  $$3x.a(avr.W);
                  $$3x.b(avr.c.b($$5.g()));
                  $$1x.b($$2x, $$0x.a(dih.g));
                  $$1x.a(null, $$2x, avh.cB, avi.e, 1.0F, 1.0F);
                  $$1x.a(null, dvu.z, $$2x);
               }

               return bpw.a($$1x.B);
            } else {
               return bpw.d;
            }
         }
      });
      $$1.put(ctr.pB, l);
      $$1.put(ctr.pA, l);
      $$1.put(ctr.pz, l);
      $$1.put(ctr.py, l);
      $$1.put(ctr.uJ, l);
      $$1.put(ctr.or, l);
      $$1.put(ctr.uP, k);
      $$1.put(ctr.uW, k);
      $$1.put(ctr.ve, k);
      $$1.put(ctr.va, k);
      $$1.put(ctr.vb, k);
      $$1.put(ctr.uY, k);
      $$1.put(ctr.vc, k);
      $$1.put(ctr.uS, k);
      $$1.put(ctr.uX, k);
      $$1.put(ctr.uU, k);
      $$1.put(ctr.uR, k);
      $$1.put(ctr.uQ, k);
      $$1.put(ctr.uV, k);
      $$1.put(ctr.uZ, k);
      $$1.put(ctr.vd, k);
      $$1.put(ctr.uT, k);
      $$1.put(ctr.jd, j);
      $$1.put(ctr.jk, j);
      $$1.put(ctr.js, j);
      $$1.put(ctr.jo, j);
      $$1.put(ctr.jp, j);
      $$1.put(ctr.jm, j);
      $$1.put(ctr.jq, j);
      $$1.put(ctr.jg, j);
      $$1.put(ctr.jl, j);
      $$1.put(ctr.ji, j);
      $$1.put(ctr.jf, j);
      $$1.put(ctr.je, j);
      $$1.put(ctr.jj, j);
      $$1.put(ctr.jn, j);
      $$1.put(ctr.jr, j);
      $$1.put(ctr.jh, j);
      Map<ctj, ju> $$2 = e.b();
      $$2.put(ctr.qy, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> a($$0x, $$1x, $$2x, $$3x, $$4, $$5, new cto(ctr.qA), $$0xx -> true, avh.dl));
      a($$2);
      Map<ctj, ju> $$3 = f.b();
      $$3.put(ctr.qy, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> a($$0x, $$1x, $$2x, $$3x, $$4, $$5, new cto(ctr.qB), $$0xx -> $$0xx.c(dih.g) == 3, avh.dm));
      a($$3);
   }

   static void a(Map<ctj, ju> $$0) {
      $$0.put(ctr.qA, h);
      $$0.put(ctr.qz, g);
      $$0.put(ctr.qB, i);
   }

   static bpw a(drb $$0, dax $$1, io $$2, clw $$3, bpt $$4, cto $$5, cto $$6, Predicate<drb> $$7, avg $$8) {
      if (!$$7.test($$0)) {
         return bpw.d;
      } else {
         if (!$$1.B) {
            ctj $$9 = $$5.g();
            $$3.a($$4, ctq.a($$5, $$3, $$6));
            $$3.a(avr.W);
            $$3.b(avr.c.b($$9));
            $$1.b($$2, dea.ft.n());
            $$1.a(null, $$2, $$8, avi.e, 1.0F, 1.0F);
            $$1.a(null, dvu.y, $$2);
         }

         return bpw.a($$1.B);
      }
   }

   static bpw a(dax $$0, io $$1, clw $$2, bpt $$3, cto $$4, drb $$5, avg $$6) {
      if (!$$0.B) {
         ctj $$7 = $$4.g();
         $$2.a($$3, ctq.a($$4, $$2, new cto(ctr.qy)));
         $$2.a(avr.V);
         $$2.b(avr.c.b($$7));
         $$0.b($$1, $$5);
         $$0.a(null, $$1, $$6, avi.e, 1.0F, 1.0F);
         $$0.a(null, dvu.z, $$1);
      }

      return bpw.a($$0.B);
   }

   public static record a(String a, Map<ctj, ju> b) {
   }
}
