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
   ju g = ($$0, $$1, $$2, $$3, $$4, $$5) -> a($$1, $$2, $$3, $$4, $$5, dec.fu.n().a(dij.g, Integer.valueOf(3)), avi.dc);
   ju h = ($$0, $$1, $$2, $$3, $$4, $$5) -> a($$1, $$2, $$3, $$4, $$5, dec.fv.n(), avi.df);
   ju i = ($$0, $$1, $$2, $$3, $$4, $$5) -> a($$1, $$2, $$3, $$4, $$5, dec.fw.n().a(dij.g, Integer.valueOf(3)), avi.dg);
   ju j = ($$0, $$1, $$2, $$3, $$4, $$5) -> {
      dea $$6 = dea.a($$5.g());
      if (!($$6 instanceof dkz)) {
         return bpy.d;
      } else {
         if (!$$1.B) {
            $$3.a($$4, $$5.a(dec.kP, 1));
            $$3.a(avs.Z);
            dij.d($$0, $$1, $$2);
         }

         return bpy.a($$1.B);
      }
   };
   ju k = ($$0, $$1, $$2, $$3, $$4, $$5) -> {
      dnz $$6 = $$5.a(kb.W, dnz.a);
      if ($$6.b().isEmpty()) {
         return bpy.d;
      } else {
         if (!$$1.B) {
            ctq $$7 = $$5.c(1);
            $$7.b(kb.W, $$6.a());
            $$5.a(1, $$3);
            if ($$5.e()) {
               $$3.a($$4, $$7);
            } else if ($$3.gc().f($$7)) {
               $$3.ca.b();
            } else {
               $$3.a($$7, false);
            }

            $$3.a(avs.Y);
            dij.d($$0, $$1, $$2);
         }

         return bpy.a($$1.B);
      }
   };
   ju l = ($$0, $$1, $$2, $$3, $$4, $$5) -> {
      if (!$$5.a(awf.bz)) {
         return bpy.d;
      } else if (!$$5.b(kb.y)) {
         return bpy.d;
      } else {
         if (!$$1.B) {
            $$5.c(kb.y);
            $$3.a(avs.X);
            dij.d($$0, $$1, $$2);
         }

         return bpy.a($$1.B);
      }
   };

   static ju.a a(String $$0) {
      Object2ObjectOpenHashMap<ctl, ju> $$1 = new Object2ObjectOpenHashMap();
      $$1.defaultReturnValue((ju)($$0x, $$1x, $$2x, $$3, $$4, $$5) -> bpy.d);
      ju.a $$2 = new ju.a($$0, $$1);
      a.put($$0, $$2);
      return $$2;
   }

   bpy interact(drd var1, daz var2, io var3, cly var4, bpv var5, ctq var6);

   static void a() {
      Map<ctl, ju> $$0 = c.b();
      a($$0);
      $$0.put(ctt.sk, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> {
         cvr $$6 = $$5.a(kb.F);
         if ($$6 != null && $$6.a(cvs.a)) {
            if (!$$1x.B) {
               ctl $$7 = $$5.g();
               $$3x.a($$4, cts.a($$5, $$3x, new ctq(ctt.sl)));
               $$3x.a(avs.W);
               $$3x.b(avs.c.b($$7));
               $$1x.b($$2x, dec.fu.n());
               $$1x.a(null, $$2x, avi.cB, avj.e, 1.0F, 1.0F);
               $$1x.a(null, dvw.z, $$2x);
            }

            return bpy.a($$1x.B);
         } else {
            return bpy.d;
         }
      });
      Map<ctl, ju> $$1 = d.b();
      a($$1);
      $$1.put(ctt.qy, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> a($$0x, $$1x, $$2x, $$3x, $$4, $$5, new ctq(ctt.qz), $$0xx -> $$0xx.c(dij.g) == 3, avi.di));
      $$1.put(ctt.sl, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> {
         if (!$$1x.B) {
            ctl $$6 = $$5.g();
            $$3x.a($$4, cts.a($$5, $$3x, cvr.a(ctt.sk, cvs.a)));
            $$3x.a(avs.W);
            $$3x.b(avs.c.b($$6));
            dij.d($$0x, $$1x, $$2x);
            $$1x.a(null, $$2x, avi.cC, avj.e, 1.0F, 1.0F);
            $$1x.a(null, dvw.y, $$2x);
         }

         return bpy.a($$1x.B);
      });
      $$1.put(ctt.sk, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> {
         if ($$0x.c(dij.g) == 3) {
            return bpy.d;
         } else {
            cvr $$6 = $$5.a(kb.F);
            if ($$6 != null && $$6.a(cvs.a)) {
               if (!$$1x.B) {
                  $$3x.a($$4, cts.a($$5, $$3x, new ctq(ctt.sl)));
                  $$3x.a(avs.W);
                  $$3x.b(avs.c.b($$5.g()));
                  $$1x.b($$2x, $$0x.a(dij.g));
                  $$1x.a(null, $$2x, avi.cB, avj.e, 1.0F, 1.0F);
                  $$1x.a(null, dvw.z, $$2x);
               }

               return bpy.a($$1x.B);
            } else {
               return bpy.d;
            }
         }
      });
      $$1.put(ctt.pB, l);
      $$1.put(ctt.pA, l);
      $$1.put(ctt.pz, l);
      $$1.put(ctt.py, l);
      $$1.put(ctt.uJ, l);
      $$1.put(ctt.or, l);
      $$1.put(ctt.uP, k);
      $$1.put(ctt.uW, k);
      $$1.put(ctt.ve, k);
      $$1.put(ctt.va, k);
      $$1.put(ctt.vb, k);
      $$1.put(ctt.uY, k);
      $$1.put(ctt.vc, k);
      $$1.put(ctt.uS, k);
      $$1.put(ctt.uX, k);
      $$1.put(ctt.uU, k);
      $$1.put(ctt.uR, k);
      $$1.put(ctt.uQ, k);
      $$1.put(ctt.uV, k);
      $$1.put(ctt.uZ, k);
      $$1.put(ctt.vd, k);
      $$1.put(ctt.uT, k);
      $$1.put(ctt.jd, j);
      $$1.put(ctt.jk, j);
      $$1.put(ctt.js, j);
      $$1.put(ctt.jo, j);
      $$1.put(ctt.jp, j);
      $$1.put(ctt.jm, j);
      $$1.put(ctt.jq, j);
      $$1.put(ctt.jg, j);
      $$1.put(ctt.jl, j);
      $$1.put(ctt.ji, j);
      $$1.put(ctt.jf, j);
      $$1.put(ctt.je, j);
      $$1.put(ctt.jj, j);
      $$1.put(ctt.jn, j);
      $$1.put(ctt.jr, j);
      $$1.put(ctt.jh, j);
      Map<ctl, ju> $$2 = e.b();
      $$2.put(ctt.qy, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> a($$0x, $$1x, $$2x, $$3x, $$4, $$5, new ctq(ctt.qA), $$0xx -> true, avi.dl));
      a($$2);
      Map<ctl, ju> $$3 = f.b();
      $$3.put(ctt.qy, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> a($$0x, $$1x, $$2x, $$3x, $$4, $$5, new ctq(ctt.qB), $$0xx -> $$0xx.c(dij.g) == 3, avi.dm));
      a($$3);
   }

   static void a(Map<ctl, ju> $$0) {
      $$0.put(ctt.qA, h);
      $$0.put(ctt.qz, g);
      $$0.put(ctt.qB, i);
   }

   static bpy a(drd $$0, daz $$1, io $$2, cly $$3, bpv $$4, ctq $$5, ctq $$6, Predicate<drd> $$7, avh $$8) {
      if (!$$7.test($$0)) {
         return bpy.d;
      } else {
         if (!$$1.B) {
            ctl $$9 = $$5.g();
            $$3.a($$4, cts.a($$5, $$3, $$6));
            $$3.a(avs.W);
            $$3.b(avs.c.b($$9));
            $$1.b($$2, dec.ft.n());
            $$1.a(null, $$2, $$8, avj.e, 1.0F, 1.0F);
            $$1.a(null, dvw.y, $$2);
         }

         return bpy.a($$1.B);
      }
   }

   static bpy a(daz $$0, io $$1, cly $$2, bpv $$3, ctq $$4, drd $$5, avh $$6) {
      if (!$$0.B) {
         ctl $$7 = $$4.g();
         $$2.a($$3, cts.a($$4, $$2, new ctq(ctt.qy)));
         $$2.a(avs.V);
         $$2.b(avs.c.b($$7));
         $$0.b($$1, $$5);
         $$0.a(null, $$1, $$6, avj.e, 1.0F, 1.0F);
         $$0.a(null, dvw.z, $$1);
      }

      return bpy.a($$0.B);
   }

   public static record a(String a, Map<ctl, ju> b) {
   }
}
