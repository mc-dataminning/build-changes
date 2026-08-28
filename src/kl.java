import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Map;
import java.util.function.Predicate;

public interface kl {
   Map<String, kl.a> a = new Object2ObjectArrayMap();
   Codec<kl.a> b = Codec.stringResolver(kl.a::a, a::get);
   kl.a c = a("empty");
   kl.a d = a("water");
   kl.a e = a("lava");
   kl.a f = a("powder_snow");

   static kl.a a(String $$0) {
      Object2ObjectOpenHashMap<cvn, kl> $$1 = new Object2ObjectOpenHashMap();
      $$1.defaultReturnValue((kl)($$0x, $$1x, $$2x, $$3, $$4, $$5) -> brs.f);
      kl.a $$2 = new kl.a($$0, $$1);
      a.put($$0, $$2);
      return $$2;
   }

   brs interact(dus var1, dej var2, jf var3, cnx var4, brr var5, cvs var6);

   static void a() {
      Map<cvn, kl> $$0 = c.b();
      a($$0);
      $$0.put(cvw.sm, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> {
         cxr $$6 = $$5.a(ks.L);
         if ($$6 != null && $$6.a(cxs.a)) {
            if (!$$1x.B) {
               cvn $$7 = $$5.h();
               $$3x.a($$4, cvv.a($$5, $$3x, new cvs(cvw.sl)));
               $$3x.a(awq.W);
               $$3x.b(awq.c.b($$7));
               $$1x.b($$2x, dho.fu.n());
               $$1x.a(null, $$2x, awg.cB, awh.e, 1.0F, 1.0F);
               $$1x.a(null, dzp.z, $$2x);
            }

            return brs.a;
         } else {
            return brs.f;
         }
      });
      Map<cvn, kl> $$1 = d.b();
      a($$1);
      $$1.put(cvw.qz, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> a($$0x, $$1x, $$2x, $$3x, $$4, $$5, new cvs(cvw.qA), $$0xx -> $$0xx.c(dlv.g) == 3, awg.di));
      $$1.put(cvw.sl, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> {
         if (!$$1x.B) {
            cvn $$6 = $$5.h();
            $$3x.a($$4, cvv.a($$5, $$3x, cxr.a(cvw.sm, cxs.a)));
            $$3x.a(awq.W);
            $$3x.b(awq.c.b($$6));
            dlv.d($$0x, $$1x, $$2x);
            $$1x.a(null, $$2x, awg.cC, awh.e, 1.0F, 1.0F);
            $$1x.a(null, dzp.y, $$2x);
         }

         return brs.a;
      });
      $$1.put(cvw.sm, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> {
         if ($$0x.c(dlv.g) == 3) {
            return brs.f;
         } else {
            cxr $$6 = $$5.a(ks.L);
            if ($$6 != null && $$6.a(cxs.a)) {
               if (!$$1x.B) {
                  $$3x.a($$4, cvv.a($$5, $$3x, new cvs(cvw.sl)));
                  $$3x.a(awq.W);
                  $$3x.b(awq.c.b($$5.h()));
                  $$1x.b($$2x, $$0x.a(dlv.g));
                  $$1x.a(null, $$2x, awg.cB, awh.e, 1.0F, 1.0F);
                  $$1x.a(null, dzp.z, $$2x);
               }

               return brs.a;
            } else {
               return brs.f;
            }
         }
      });
      $$1.put(cvw.pC, kl::f);
      $$1.put(cvw.pB, kl::f);
      $$1.put(cvw.pA, kl::f);
      $$1.put(cvw.pz, kl::f);
      $$1.put(cvw.uL, kl::f);
      $$1.put(cvw.os, kl::f);
      $$1.put(cvw.uR, kl::e);
      $$1.put(cvw.uY, kl::e);
      $$1.put(cvw.vg, kl::e);
      $$1.put(cvw.vc, kl::e);
      $$1.put(cvw.vd, kl::e);
      $$1.put(cvw.va, kl::e);
      $$1.put(cvw.ve, kl::e);
      $$1.put(cvw.uU, kl::e);
      $$1.put(cvw.uZ, kl::e);
      $$1.put(cvw.uW, kl::e);
      $$1.put(cvw.uT, kl::e);
      $$1.put(cvw.uS, kl::e);
      $$1.put(cvw.uX, kl::e);
      $$1.put(cvw.vb, kl::e);
      $$1.put(cvw.vf, kl::e);
      $$1.put(cvw.uV, kl::e);
      $$1.put(cvw.jd, kl::d);
      $$1.put(cvw.jk, kl::d);
      $$1.put(cvw.js, kl::d);
      $$1.put(cvw.jo, kl::d);
      $$1.put(cvw.jp, kl::d);
      $$1.put(cvw.jm, kl::d);
      $$1.put(cvw.jq, kl::d);
      $$1.put(cvw.jg, kl::d);
      $$1.put(cvw.jl, kl::d);
      $$1.put(cvw.ji, kl::d);
      $$1.put(cvw.jf, kl::d);
      $$1.put(cvw.je, kl::d);
      $$1.put(cvw.jj, kl::d);
      $$1.put(cvw.jn, kl::d);
      $$1.put(cvw.jr, kl::d);
      $$1.put(cvw.jh, kl::d);
      Map<cvn, kl> $$2 = e.b();
      $$2.put(cvw.qz, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> a($$0x, $$1x, $$2x, $$3x, $$4, $$5, new cvs(cvw.qB), $$0xx -> true, awg.dl));
      a($$2);
      Map<cvn, kl> $$3 = f.b();
      $$3.put(cvw.qz, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> a($$0x, $$1x, $$2x, $$3x, $$4, $$5, new cvs(cvw.qC), $$0xx -> $$0xx.c(dlv.g) == 3, awg.dm));
      a($$3);
   }

   static void a(Map<cvn, kl> $$0) {
      $$0.put(cvw.qB, kl::b);
      $$0.put(cvw.qA, kl::a);
      $$0.put(cvw.qC, kl::c);
   }

   static brs a(dus $$0, dej $$1, jf $$2, cnx $$3, brr $$4, cvs $$5, cvs $$6, Predicate<dus> $$7, awf $$8) {
      if (!$$7.test($$0)) {
         return brs.f;
      } else {
         if (!$$1.B) {
            cvn $$9 = $$5.h();
            $$3.a($$4, cvv.a($$5, $$3, $$6));
            $$3.a(awq.W);
            $$3.b(awq.c.b($$9));
            $$1.b($$2, dho.ft.n());
            $$1.a(null, $$2, $$8, awh.e, 1.0F, 1.0F);
            $$1.a(null, dzp.y, $$2);
         }

         return brs.a;
      }
   }

   static brs a(dej $$0, jf $$1, cnx $$2, brr $$3, cvs $$4, dus $$5, awf $$6) {
      if (!$$0.B) {
         cvn $$7 = $$4.h();
         $$2.a($$3, cvv.a($$4, $$2, new cvs(cvw.qz)));
         $$2.a(awq.V);
         $$2.b(awq.c.b($$7));
         $$0.b($$1, $$5);
         $$0.a(null, $$1, $$6, awh.e, 1.0F, 1.0F);
         $$0.a(null, dzp.z, $$1);
      }

      return brs.a;
   }

   private static brs a(dus $$0, dej $$1, jf $$2, cnx $$3, brr $$4, cvs $$5) {
      return a($$1, $$2, $$3, $$4, $$5, dho.fu.n().b(dlv.g, Integer.valueOf(3)), awg.dc);
   }

   private static brs b(dus $$0, dej $$1, jf $$2, cnx $$3, brr $$4, cvs $$5) {
      return (brs)(a($$1, $$2) ? brs.c : a($$1, $$2, $$3, $$4, $$5, dho.fv.n(), awg.df));
   }

   private static brs c(dus $$0, dej $$1, jf $$2, cnx $$3, brr $$4, cvs $$5) {
      return (brs)(a($$1, $$2) ? brs.c : a($$1, $$2, $$3, $$4, $$5, dho.fw.n().b(dlv.g, Integer.valueOf(3)), awg.dg));
   }

   private static brs d(dus $$0, dej $$1, jf $$2, cnx $$3, brr $$4, cvs $$5) {
      dhm $$6 = dhm.a($$5.h());
      if (!($$6 instanceof dom)) {
         return brs.f;
      } else {
         if (!$$1.B) {
            cvs $$7 = $$5.a(dho.kP, 1);
            $$3.a($$4, cvv.a($$5, $$3, $$7, false));
            $$3.a(awq.Z);
            dlv.d($$0, $$1, $$2);
         }

         return brs.a;
      }
   }

   private static brs e(dus $$0, dej $$1, jf $$2, cnx $$3, brr $$4, cvs $$5) {
      drm $$6 = $$5.a(ks.ad, drm.a);
      if ($$6.b().isEmpty()) {
         return brs.f;
      } else {
         if (!$$1.B) {
            cvs $$7 = $$5.c(1);
            $$7.b(ks.ad, $$6.a());
            $$3.a($$4, cvv.a($$5, $$3, $$7, false));
            $$3.a(awq.Y);
            dlv.d($$0, $$1, $$2);
         }

         return brs.a;
      }
   }

   private static brs f(dus $$0, dej $$1, jf $$2, cnx $$3, brr $$4, cvs $$5) {
      if (!$$5.a(axe.bD)) {
         return brs.f;
      } else if (!$$5.b(ks.E)) {
         return brs.f;
      } else {
         if (!$$1.B) {
            $$5.c(ks.E);
            $$3.a(awq.X);
            dlv.d($$0, $$1, $$2);
         }

         return brs.a;
      }
   }

   private static boolean a(dej $$0, jf $$1) {
      eqt $$2 = $$0.b_($$1.d());
      return $$2.a(axb.a);
   }

   public static record a(String a, Map<cvn, kl> b) {
   }
}
