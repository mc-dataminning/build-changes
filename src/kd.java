import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Map;
import java.util.function.Predicate;

public interface kd {
   Map<String, kd.a> a = new Object2ObjectArrayMap();
   Codec<kd.a> b = Codec.stringResolver(kd.a::a, a::get);
   kd.a c = a("empty");
   kd.a d = a("water");
   kd.a e = a("lava");
   kd.a f = a("powder_snow");

   static kd.a a(String $$0) {
      Object2ObjectOpenHashMap<dag, kd> $$1 = new Object2ObjectOpenHashMap();
      $$1.defaultReturnValue((kd)($$0x, $$1x, $$2x, $$3, $$4, $$5) -> bvc.f);
      kd.a $$2 = new kd.a($$0, $$1);
      a.put($$0, $$2);
      return $$2;
   }

   bvc interact(ebq var1, dkj var2, iw var3, csi var4, bvb var5, dak var6);

   static void a() {
      Map<dag, kd> $$0 = c.b();
      a($$0);
      $$0.put(dao.tt, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> {
         dcg $$6 = $$5.a(kl.R);
         if ($$6 != null && $$6.a(dch.a)) {
            if (!$$1x.C) {
               dag $$7 = $$5.h();
               $$3x.a($$4, dan.a($$5, $$3x, new dak(dao.ts)));
               $$3x.a(axi.W);
               $$3x.b(axi.c.b($$7));
               $$1x.b($$2x, dnq.fT.m());
               $$1x.a(null, $$2x, awy.cB, awz.e, 1.0F, 1.0F);
               $$1x.a(null, egq.z, $$2x);
            }

            return bvc.a;
         } else {
            return bvc.f;
         }
      });
      Map<dag, kd> $$1 = d.b();
      a($$1);
      $$1.put(dao.ro, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> a($$0x, $$1x, $$2x, $$3x, $$4, $$5, new dak(dao.rp), $$0xx -> $$0xx.c(dsc.f) == 3, awy.dj));
      $$1.put(dao.ts, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> {
         if (!$$1x.C) {
            dag $$6 = $$5.h();
            $$3x.a($$4, dan.a($$5, $$3x, dcg.a(dao.tt, dch.a)));
            $$3x.a(axi.W);
            $$3x.b(axi.c.b($$6));
            dsc.d($$0x, $$1x, $$2x);
            $$1x.a(null, $$2x, awy.cC, awz.e, 1.0F, 1.0F);
            $$1x.a(null, egq.y, $$2x);
         }

         return bvc.a;
      });
      $$1.put(dao.tt, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> {
         if ($$0x.c(dsc.f) == 3) {
            return bvc.f;
         } else {
            dcg $$6 = $$5.a(kl.R);
            if ($$6 != null && $$6.a(dch.a)) {
               if (!$$1x.C) {
                  $$3x.a($$4, dan.a($$5, $$3x, new dak(dao.ts)));
                  $$3x.a(axi.W);
                  $$3x.b(axi.c.b($$5.h()));
                  $$1x.b($$2x, $$0x.a(dsc.f));
                  $$1x.a(null, $$2x, awy.cB, awz.e, 1.0F, 1.0F);
                  $$1x.a(null, egq.z, $$2x);
               }

               return bvc.a;
            } else {
               return bvc.f;
            }
         }
      });
      $$1.put(dao.qp, kd::f);
      $$1.put(dao.qo, kd::f);
      $$1.put(dao.qn, kd::f);
      $$1.put(dao.qm, kd::f);
      $$1.put(dao.vU, kd::f);
      $$1.put(dao.pf, kd::f);
      $$1.put(dao.wa, kd::e);
      $$1.put(dao.wh, kd::e);
      $$1.put(dao.wp, kd::e);
      $$1.put(dao.wl, kd::e);
      $$1.put(dao.wm, kd::e);
      $$1.put(dao.wj, kd::e);
      $$1.put(dao.wn, kd::e);
      $$1.put(dao.wd, kd::e);
      $$1.put(dao.wi, kd::e);
      $$1.put(dao.wf, kd::e);
      $$1.put(dao.wc, kd::e);
      $$1.put(dao.wb, kd::e);
      $$1.put(dao.wg, kd::e);
      $$1.put(dao.wk, kd::e);
      $$1.put(dao.wo, kd::e);
      $$1.put(dao.we, kd::e);
      $$1.put(dao.jH, kd::d);
      $$1.put(dao.jO, kd::d);
      $$1.put(dao.jW, kd::d);
      $$1.put(dao.jS, kd::d);
      $$1.put(dao.jT, kd::d);
      $$1.put(dao.jQ, kd::d);
      $$1.put(dao.jU, kd::d);
      $$1.put(dao.jK, kd::d);
      $$1.put(dao.jP, kd::d);
      $$1.put(dao.jM, kd::d);
      $$1.put(dao.jJ, kd::d);
      $$1.put(dao.jI, kd::d);
      $$1.put(dao.jN, kd::d);
      $$1.put(dao.jR, kd::d);
      $$1.put(dao.jV, kd::d);
      $$1.put(dao.jL, kd::d);
      Map<dag, kd> $$2 = e.b();
      $$2.put(dao.ro, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> a($$0x, $$1x, $$2x, $$3x, $$4, $$5, new dak(dao.rq), $$0xx -> true, awy.dm));
      a($$2);
      Map<dag, kd> $$3 = f.b();
      $$3.put(dao.ro, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> a($$0x, $$1x, $$2x, $$3x, $$4, $$5, new dak(dao.rr), $$0xx -> $$0xx.c(dsc.f) == 3, awy.dn));
      a($$3);
   }

   static void a(Map<dag, kd> $$0) {
      $$0.put(dao.rq, kd::b);
      $$0.put(dao.rp, kd::a);
      $$0.put(dao.rr, kd::c);
   }

   static bvc a(ebq $$0, dkj $$1, iw $$2, csi $$3, bvb $$4, dak $$5, dak $$6, Predicate<ebq> $$7, awx $$8) {
      if (!$$7.test($$0)) {
         return bvc.f;
      } else {
         if (!$$1.C) {
            dag $$9 = $$5.h();
            $$3.a($$4, dan.a($$5, $$3, $$6));
            $$3.a(axi.W);
            $$3.b(axi.c.b($$9));
            $$1.b($$2, dnq.fS.m());
            $$1.a(null, $$2, $$8, awz.e, 1.0F, 1.0F);
            $$1.a(null, egq.y, $$2);
         }

         return bvc.a;
      }
   }

   static bvc a(dkj $$0, iw $$1, csi $$2, bvb $$3, dak $$4, ebq $$5, awx $$6) {
      if (!$$0.C) {
         dag $$7 = $$4.h();
         $$2.a($$3, dan.a($$4, $$2, new dak(dao.ro)));
         $$2.a(axi.V);
         $$2.b(axi.c.b($$7));
         $$0.b($$1, $$5);
         $$0.a(null, $$1, $$6, awz.e, 1.0F, 1.0F);
         $$0.a(null, egq.z, $$1);
      }

      return bvc.a;
   }

   private static bvc a(ebq $$0, dkj $$1, iw $$2, csi $$3, bvb $$4, dak $$5) {
      return a($$1, $$2, $$3, $$4, $$5, dnq.fT.m().b(dsc.f, Integer.valueOf(3)), awy.dd);
   }

   private static bvc b(ebq $$0, dkj $$1, iw $$2, csi $$3, bvb $$4, dak $$5) {
      return (bvc)(a($$1, $$2) ? bvc.c : a($$1, $$2, $$3, $$4, $$5, dnq.fU.m(), awy.dg));
   }

   private static bvc c(ebq $$0, dkj $$1, iw $$2, csi $$3, bvb $$4, dak $$5) {
      return (bvc)(a($$1, $$2) ? bvc.c : a($$1, $$2, $$3, $$4, $$5, dnq.fV.m().b(dsc.f, Integer.valueOf(3)), awy.dh));
   }

   private static bvc d(ebq $$0, dkj $$1, iw $$2, csi $$3, bvb $$4, dak $$5) {
      dno $$6 = dno.a($$5.h());
      if (!($$6 instanceof dux)) {
         return bvc.f;
      } else {
         if (!$$1.C) {
            dak $$7 = $$5.a(dnq.lv, 1);
            $$3.a($$4, dan.a($$5, $$3, $$7, false));
            $$3.a(axi.Z);
            dsc.d($$0, $$1, $$2);
         }

         return bvc.a;
      }
   }

   private static bvc e(ebq $$0, dkj $$1, iw $$2, csi $$3, bvb $$4, dak $$5) {
      dye $$6 = $$5.a(kl.am, dye.a);
      if ($$6.b().isEmpty()) {
         return bvc.f;
      } else {
         if (!$$1.C) {
            dak $$7 = $$5.c(1);
            $$7.b(kl.am, $$6.a());
            $$3.a($$4, dan.a($$5, $$3, $$7, false));
            $$3.a(axi.Y);
            dsc.d($$0, $$1, $$2);
         }

         return bvc.a;
      }
   }

   private static bvc f(ebq $$0, dkj $$1, iw $$2, csi $$3, bvb $$4, dak $$5) {
      if (!$$5.a(axv.bQ)) {
         return bvc.f;
      } else if (!$$5.c(kl.K)) {
         return bvc.f;
      } else {
         if (!$$1.C) {
            $$5.e(kl.K);
            $$3.a(axi.X);
            dsc.d($$0, $$1, $$2);
         }

         return bvc.a;
      }
   }

   private static boolean a(dkj $$0, iw $$1) {
      eya $$2 = $$0.b_($$1.d());
      return $$2.a(axs.a);
   }

   public static record a(String a, Map<dag, kd> b) {
   }
}
