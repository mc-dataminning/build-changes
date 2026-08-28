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
      Object2ObjectOpenHashMap<czw, kd> $$1 = new Object2ObjectOpenHashMap();
      $$1.defaultReturnValue((kd)($$0x, $$1x, $$2x, $$3, $$4, $$5) -> but.f);
      kd.a $$2 = new kd.a($$0, $$1);
      a.put($$0, $$2);
      return $$2;
   }

   but interact(ebg var1, djz var2, iw var3, crz var4, bus var5, daa var6);

   static void a() {
      Map<czw, kd> $$0 = c.b();
      a($$0);
      $$0.put(dae.tt, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> {
         dbw $$6 = $$5.a(kl.R);
         if ($$6 != null && $$6.a(dbx.a)) {
            if (!$$1x.C) {
               czw $$7 = $$5.h();
               $$3x.a($$4, dad.a($$5, $$3x, new daa(dae.ts)));
               $$3x.a(axb.W);
               $$3x.b(axb.c.b($$7));
               $$1x.b($$2x, dng.fT.m());
               $$1x.a(null, $$2x, awr.cB, aws.e, 1.0F, 1.0F);
               $$1x.a(null, egg.z, $$2x);
            }

            return but.a;
         } else {
            return but.f;
         }
      });
      Map<czw, kd> $$1 = d.b();
      a($$1);
      $$1.put(dae.ro, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> a($$0x, $$1x, $$2x, $$3x, $$4, $$5, new daa(dae.rp), $$0xx -> $$0xx.c(drs.f) == 3, awr.dj));
      $$1.put(dae.ts, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> {
         if (!$$1x.C) {
            czw $$6 = $$5.h();
            $$3x.a($$4, dad.a($$5, $$3x, dbw.a(dae.tt, dbx.a)));
            $$3x.a(axb.W);
            $$3x.b(axb.c.b($$6));
            drs.d($$0x, $$1x, $$2x);
            $$1x.a(null, $$2x, awr.cC, aws.e, 1.0F, 1.0F);
            $$1x.a(null, egg.y, $$2x);
         }

         return but.a;
      });
      $$1.put(dae.tt, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> {
         if ($$0x.c(drs.f) == 3) {
            return but.f;
         } else {
            dbw $$6 = $$5.a(kl.R);
            if ($$6 != null && $$6.a(dbx.a)) {
               if (!$$1x.C) {
                  $$3x.a($$4, dad.a($$5, $$3x, new daa(dae.ts)));
                  $$3x.a(axb.W);
                  $$3x.b(axb.c.b($$5.h()));
                  $$1x.b($$2x, $$0x.a(drs.f));
                  $$1x.a(null, $$2x, awr.cB, aws.e, 1.0F, 1.0F);
                  $$1x.a(null, egg.z, $$2x);
               }

               return but.a;
            } else {
               return but.f;
            }
         }
      });
      $$1.put(dae.qp, kd::f);
      $$1.put(dae.qo, kd::f);
      $$1.put(dae.qn, kd::f);
      $$1.put(dae.qm, kd::f);
      $$1.put(dae.vU, kd::f);
      $$1.put(dae.pf, kd::f);
      $$1.put(dae.wa, kd::e);
      $$1.put(dae.wh, kd::e);
      $$1.put(dae.wp, kd::e);
      $$1.put(dae.wl, kd::e);
      $$1.put(dae.wm, kd::e);
      $$1.put(dae.wj, kd::e);
      $$1.put(dae.wn, kd::e);
      $$1.put(dae.wd, kd::e);
      $$1.put(dae.wi, kd::e);
      $$1.put(dae.wf, kd::e);
      $$1.put(dae.wc, kd::e);
      $$1.put(dae.wb, kd::e);
      $$1.put(dae.wg, kd::e);
      $$1.put(dae.wk, kd::e);
      $$1.put(dae.wo, kd::e);
      $$1.put(dae.we, kd::e);
      $$1.put(dae.jH, kd::d);
      $$1.put(dae.jO, kd::d);
      $$1.put(dae.jW, kd::d);
      $$1.put(dae.jS, kd::d);
      $$1.put(dae.jT, kd::d);
      $$1.put(dae.jQ, kd::d);
      $$1.put(dae.jU, kd::d);
      $$1.put(dae.jK, kd::d);
      $$1.put(dae.jP, kd::d);
      $$1.put(dae.jM, kd::d);
      $$1.put(dae.jJ, kd::d);
      $$1.put(dae.jI, kd::d);
      $$1.put(dae.jN, kd::d);
      $$1.put(dae.jR, kd::d);
      $$1.put(dae.jV, kd::d);
      $$1.put(dae.jL, kd::d);
      Map<czw, kd> $$2 = e.b();
      $$2.put(dae.ro, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> a($$0x, $$1x, $$2x, $$3x, $$4, $$5, new daa(dae.rq), $$0xx -> true, awr.dm));
      a($$2);
      Map<czw, kd> $$3 = f.b();
      $$3.put(dae.ro, ($$0x, $$1x, $$2x, $$3x, $$4, $$5) -> a($$0x, $$1x, $$2x, $$3x, $$4, $$5, new daa(dae.rr), $$0xx -> $$0xx.c(drs.f) == 3, awr.dn));
      a($$3);
   }

   static void a(Map<czw, kd> $$0) {
      $$0.put(dae.rq, kd::b);
      $$0.put(dae.rp, kd::a);
      $$0.put(dae.rr, kd::c);
   }

   static but a(ebg $$0, djz $$1, iw $$2, crz $$3, bus $$4, daa $$5, daa $$6, Predicate<ebg> $$7, awq $$8) {
      if (!$$7.test($$0)) {
         return but.f;
      } else {
         if (!$$1.C) {
            czw $$9 = $$5.h();
            $$3.a($$4, dad.a($$5, $$3, $$6));
            $$3.a(axb.W);
            $$3.b(axb.c.b($$9));
            $$1.b($$2, dng.fS.m());
            $$1.a(null, $$2, $$8, aws.e, 1.0F, 1.0F);
            $$1.a(null, egg.y, $$2);
         }

         return but.a;
      }
   }

   static but a(djz $$0, iw $$1, crz $$2, bus $$3, daa $$4, ebg $$5, awq $$6) {
      if (!$$0.C) {
         czw $$7 = $$4.h();
         $$2.a($$3, dad.a($$4, $$2, new daa(dae.ro)));
         $$2.a(axb.V);
         $$2.b(axb.c.b($$7));
         $$0.b($$1, $$5);
         $$0.a(null, $$1, $$6, aws.e, 1.0F, 1.0F);
         $$0.a(null, egg.z, $$1);
      }

      return but.a;
   }

   private static but a(ebg $$0, djz $$1, iw $$2, crz $$3, bus $$4, daa $$5) {
      return a($$1, $$2, $$3, $$4, $$5, dng.fT.m().b(drs.f, Integer.valueOf(3)), awr.dd);
   }

   private static but b(ebg $$0, djz $$1, iw $$2, crz $$3, bus $$4, daa $$5) {
      return (but)(a($$1, $$2) ? but.c : a($$1, $$2, $$3, $$4, $$5, dng.fU.m(), awr.dg));
   }

   private static but c(ebg $$0, djz $$1, iw $$2, crz $$3, bus $$4, daa $$5) {
      return (but)(a($$1, $$2) ? but.c : a($$1, $$2, $$3, $$4, $$5, dng.fV.m().b(drs.f, Integer.valueOf(3)), awr.dh));
   }

   private static but d(ebg $$0, djz $$1, iw $$2, crz $$3, bus $$4, daa $$5) {
      dne $$6 = dne.a($$5.h());
      if (!($$6 instanceof dun)) {
         return but.f;
      } else {
         if (!$$1.C) {
            daa $$7 = $$5.a(dng.lv, 1);
            $$3.a($$4, dad.a($$5, $$3, $$7, false));
            $$3.a(axb.Z);
            drs.d($$0, $$1, $$2);
         }

         return but.a;
      }
   }

   private static but e(ebg $$0, djz $$1, iw $$2, crz $$3, bus $$4, daa $$5) {
      dxu $$6 = $$5.a(kl.am, dxu.a);
      if ($$6.b().isEmpty()) {
         return but.f;
      } else {
         if (!$$1.C) {
            daa $$7 = $$5.c(1);
            $$7.b(kl.am, $$6.a());
            $$3.a($$4, dad.a($$5, $$3, $$7, false));
            $$3.a(axb.Y);
            drs.d($$0, $$1, $$2);
         }

         return but.a;
      }
   }

   private static but f(ebg $$0, djz $$1, iw $$2, crz $$3, bus $$4, daa $$5) {
      if (!$$5.a(axo.bQ)) {
         return but.f;
      } else if (!$$5.c(kl.K)) {
         return but.f;
      } else {
         if (!$$1.C) {
            $$5.e(kl.K);
            $$3.a(axb.X);
            drs.d($$0, $$1, $$2);
         }

         return but.a;
      }
   }

   private static boolean a(djz $$0, iw $$1) {
      exq $$2 = $$0.b_($$1.d());
      return $$2.a(axl.a);
   }

   public static record a(String a, Map<czw, kd> b) {
   }
}
