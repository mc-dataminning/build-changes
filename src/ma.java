import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Supplier;

public class ma {
   public static final ahg a = new ahg("trim_type");
   private static final List<ma.a> b = List.of(
      new ma.a("quartz", 0.1F, Map.of()),
      new ma.a("iron", 0.2F, Map.of(ckj.c, "iron_darker")),
      new ma.a("netherite", 0.3F, Map.of(ckj.g, "netherite_darker")),
      new ma.a("redstone", 0.4F, Map.of()),
      new ma.a("copper", 0.5F, Map.of()),
      new ma.a("gold", 0.6F, Map.of(ckj.d, "gold_darker")),
      new ma.a("emerald", 0.7F, Map.of()),
      new ma.a("diamond", 0.8F, Map.of(ckj.e, "diamond_darker")),
      new ma.a("lapis", 0.9F, Map.of()),
      new ma.a("amethyst", 1.0F, Map.of())
   );
   private final BiConsumer<ahg, Supplier<JsonElement>> c;

   public ma(BiConsumer<ahg, Supplier<JsonElement>> $$0) {
      this.c = $$0;
   }

   private void a(cms $$0, mo $$1) {
      $$1.a(mn.a($$0), mq.b($$0), this.c);
   }

   private void a(cms $$0, String $$1, mo $$2) {
      $$2.a(mn.a($$0, $$1), mq.k(mq.a($$0, $$1)), this.c);
   }

   private void a(cms $$0, cms $$1, mo $$2) {
      $$2.a(mn.a($$0), mq.b($$1), this.c);
   }

   private void a(cms $$0) {
      for (int $$1 = 0; $$1 < 32; $$1++) {
         if ($$1 != 16) {
            this.a($$0, String.format(Locale.ROOT, "_%02d", $$1), mp.bx);
         }
      }
   }

   private void b(cms $$0) {
      for (int $$1 = 1; $$1 < 64; $$1++) {
         this.a($$0, String.format(Locale.ROOT, "_%02d", $$1), mp.bx);
      }
   }

   private void a(ahg $$0, ahg $$1, ahg $$2) {
      mp.bB.a($$0, mq.c($$1, $$2), this.c);
   }

   private void a(ahg $$0, ahg $$1, ahg $$2, ahg $$3) {
      mp.bC.a($$0, mq.a($$1, $$2, $$3), this.c);
   }

   private ahg a(ahg $$0, String $$1) {
      return $$0.e("_" + $$1 + "_trim");
   }

   private JsonObject a(ahg $$0, Map<mr, ahg> $$1, cki $$2) {
      JsonObject $$3 = mp.bB.a($$0, $$1);
      JsonArray $$4 = new JsonArray();

      for (ma.a $$5 : b) {
         JsonObject $$6 = new JsonObject();
         JsonObject $$7 = new JsonObject();
         $$7.addProperty(a.a(), $$5.b());
         $$6.add("predicate", $$7);
         $$6.addProperty("model", this.a($$0, $$5.a($$2)).toString());
         $$4.add($$6);
      }

      $$3.add("overrides", $$4);
      return $$3;
   }

   private void a(ckh $$0) {
      ahg $$1 = mn.a($$0);
      ahg $$2 = mq.c($$0);
      ahg $$3 = mq.a($$0, "_overlay");
      if ($$0.d() == ckj.a) {
         mp.bB.a($$1, mq.c($$2, $$3), this.c, ($$1x, $$2x) -> this.a($$1x, $$2x, $$0.d()));
      } else {
         mp.bx.a($$1, mq.k($$2), this.c, ($$1x, $$2x) -> this.a($$1x, $$2x, $$0.d()));
      }

      for (ma.a $$4 : b) {
         String $$5 = $$4.a($$0.d());
         ahg $$6 = this.a($$1, $$5);
         String $$7 = $$0.b().b() + "_trim_" + $$5;
         ahg $$8 = new ahg($$7).d("trims/items/");
         if ($$0.d() == ckj.a) {
            this.a($$6, $$2, $$3, $$8);
         } else {
            this.a($$6, $$2, $$8);
         }
      }
   }

   public void a() {
      this.a(cna.ob, mp.bx);
      this.a(cna.od, mp.bx);
      this.a(cna.oc, mp.bx);
      this.a(cna.oe, mp.bx);
      this.a(cna.oz, mp.bx);
      this.a(cna.oq, mp.bx);
      this.a(cna.uy, mp.bx);
      this.a(cna.os, mp.bx);
      this.a(cna.ua, mp.bx);
      this.a(cna.dQ, mp.bz);
      this.a(cna.rX, mp.bx);
      this.a(cna.vd, mp.bx);
      this.a(cna.vf, mp.bx);
      this.a(cna.nX, mp.bx);
      this.a(cna.nY, mp.bx);
      this.a(cna.ru, mp.bx);
      this.a(cna.sl, mp.bx);
      this.a(cna.sd, mp.bz);
      this.a(cna.rq, mp.bx);
      this.a(cna.rv, mp.bx);
      this.a(cna.qM, mp.bx);
      this.a(cna.pn, mp.bx);
      this.a(cna.pu, mp.bx);
      this.a(cna.qI, mp.bx);
      this.a(cna.rr, mp.bx);
      this.a(cna.qv, mp.bx);
      this.a(cna.nQ, mp.bA);
      this.a(cna.nR, mp.bA);
      this.a(cna.ou, mp.bx);
      this.a(cna.nM, mp.bx);
      this.a(cna.rZ, mp.bx);
      this.a(cna.uZ, mp.bx);
      this.a(cna.qJ, mp.bx);
      this.b(cna.qT);
      this.a(cna.ot, mp.bx);
      this.a(cna.qE, mp.bx);
      this.a(cna.uF, mp.bx);
      this.a(cna.qP);
      this.a(cna.qQ);
      this.a(cna.rY, mp.bx);
      this.a(cna.sa, mp.bx);
      this.a(cna.ra, mp.bx);
      this.a(cna.uH, mp.bx);
      this.a(cna.pV, mp.bx);
      this.a(cna.uu, mp.bx);
      this.a(cna.rb, mp.bx);
      this.a(cna.rP, mp.bx);
      this.a(cna.oC, mp.bx);
      this.a(cna.oD, mp.bx);
      this.a(cna.vQ, mp.bx);
      this.a(cna.ro, mp.bx);
      this.a(cna.of, mp.bx);
      this.a(cna.og, mp.bx);
      this.a(cna.ov, mp.bx);
      this.a(cna.pf, mp.bz);
      this.a(cna.pg, mp.bz);
      this.a(cna.uB, mp.bx);
      this.a(cna.pe, mp.bz);
      this.a(cna.pd, mp.bz);
      this.a(cna.pc, mp.bz);
      this.a(cna.vg, mp.bx);
      this.a(cna.rU, mp.bx);
      this.a(cna.qO, mp.bx);
      this.a(cna.ow, mp.bx);
      this.a(cna.up, mp.bx);
      this.a(cna.sp, mp.bx);
      this.a(cna.sc, mp.bx);
      this.a(cna.uY, mp.bx);
      this.a(cna.tR, mp.bx);
      this.a(cna.sk, mp.bx);
      this.a(cna.un, mp.bx);
      this.a(cna.tS, mp.bx);
      this.a(cna.pT, mp.bx);
      this.a(cna.op, mp.bx);
      this.a(cna.vP, mp.bx);
      this.a(cna.nN, mp.bx);
      this.a(cna.se, mp.bx);
      this.a(cna.si, mp.bx);
      this.a(cna.sq, mp.bx);
      this.a(cna.vT, mp.bx);
      this.a(cna.wj, mp.bx);
      this.a(cna.qV, mp.bx);
      this.a(cna.rd, mp.bx);
      this.a(cna.tW, mp.bx);
      this.a(cna.oE, mp.bx);
      this.a(cna.pX, mp.bx);
      this.a(cna.oV, mp.bz);
      this.a(cna.ud, mp.bx);
      this.a(cna.oW, mp.bz);
      this.a(cna.uA, mp.bx);
      this.a(cna.oU, mp.bz);
      this.a(cna.oT, mp.bz);
      this.a(cna.oS, mp.bz);
      this.a(cna.oF, mp.bx);
      this.a(cna.sf, mp.bx);
      this.a(cna.rm, mp.bx);
      this.a(cna.rs, mp.bx);
      this.a(cna.pr, mp.bx);
      this.a(cna.vL, mp.bx);
      this.a(cna.wn, mp.bx);
      this.a(cna.wq, mp.bx);
      this.a(cna.nP, mp.bx);
      this.a(cna.rc, mp.bx);
      this.a(cna.oA, mp.bx);
      this.a(cna.pa, mp.bz);
      this.a(cna.pb, mp.bz);
      this.a(cna.uz, mp.bx);
      this.a(cna.oB, mp.bx);
      this.a(cna.vo, mp.bx);
      this.a(cna.oZ, mp.bz);
      this.a(cna.oY, mp.bz);
      this.a(cna.oX, mp.bz);
      this.a(cna.tV, mp.bx);
      this.a(cna.nZ, mp.bx);
      this.a(cna.oa, mp.bx);
      this.a(cna.vp, mp.bx);
      this.a(cna.ox, mp.bx);
      this.a(cna.qx, mp.bx);
      this.a(cna.qA, mp.bx);
      this.a(cna.uC, mp.bx);
      this.a(cna.ri, mp.bx);
      this.a(cna.rn, mp.bx);
      this.a(cna.rk, mp.bx);
      this.a(cna.rh, mp.bx);
      this.a(cna.sm, mp.bx);
      this.a(cna.oh, mp.bx);
      this.a(cna.oi, mp.bx);
      this.a(cna.oj, mp.bx);
      this.a(cna.ok, mp.bx);
      this.a(cna.uc, mp.bx);
      this.a(cna.rT, mp.bx);
      this.a(cna.qB, mp.bx);
      this.a(cna.nL, mp.bx);
      this.a(cna.vS, mp.bx);
      this.a(cna.po, mp.bx);
      this.a(cna.vH, mp.bx);
      this.a(cna.vB, mp.by);
      this.a(cna.vr, mp.by);
      this.a(cna.vt, mp.by);
      this.a(cna.vs, mp.by);
      this.a(cna.vu, mp.by);
      this.a(cna.vv, mp.by);
      this.a(cna.vw, mp.by);
      this.a(cna.vx, mp.by);
      this.a(cna.vG, mp.by);
      this.a(cna.vy, mp.by);
      this.a(cna.vz, mp.by);
      this.a(cna.vC, mp.by);
      this.a(cna.vA, mp.by);
      this.a(cna.vD, mp.by);
      this.a(cna.vE, mp.by);
      this.a(cna.vF, mp.by);
      this.a(cna.uG, mp.bx);
      this.a(cna.uE, mp.bx);
      this.a(cna.vK, mp.bx);
      this.a(cna.pk, mp.bz);
      this.a(cna.pl, mp.bz);
      this.a(cna.oG, mp.bx);
      this.a(cna.pj, mp.bz);
      this.a(cna.oH, mp.bx);
      this.a(cna.pi, mp.bz);
      this.a(cna.ph, mp.bz);
      this.a(cna.uq, mp.bx);
      this.a(cna.ul, mp.bx);
      this.a(cna.nT, mp.bx);
      this.a(cna.nU, mp.bx);
      this.a(cna.rg, mp.bx);
      this.a(cna.pW, mp.bx);
      this.a(cna.qL, mp.bx);
      this.a(cna.vJ, mp.bx);
      this.a(cna.vU, mp.bx);
      this.a(cna.rl, mp.bx);
      this.a(cna.ub, mp.bx);
      this.a(cna.va, mp.bx);
      this.a(cna.pU, mp.bx);
      this.a(cna.qy, mp.bx);
      this.a(cna.us, mp.bx);
      this.a(cna.ur, mp.bx);
      this.a(cna.qZ, mp.bx);
      this.a(cna.qC, mp.bx);
      this.a(cna.um, mp.bx);
      this.a(cna.rp, mp.bx);
      this.a(cna.oy, mp.bx);
      this.a(cna.ut, mp.bx);
      this.a(cna.uw, mp.bx);
      this.a(cna.ux, mp.bx);
      this.a(cna.uv, mp.bx);
      this.a(cna.rt, mp.bx);
      this.a(cna.sb, mp.bx);
      this.a(cna.nK, mp.bx);
      this.a(cna.qX, mp.bx);
      this.a(cna.qD, mp.bx);
      this.a(cna.oo, mp.bx);
      this.a(cna.rS, mp.bx);
      this.a(cna.vn, mp.bx);
      this.a(cna.vR, mp.bx);
      this.a(cna.qN, mp.bx);
      this.a(cna.qz, mp.bx);
      this.a(cna.xh, mp.bx);
      this.a(cna.vi, mp.bx);
      this.a(cna.sj, mp.bx);
      this.a(cna.nV, mp.bx);
      this.a(cna.nW, mp.bx);
      this.a(cna.qU, mp.bx);
      this.a(cna.pm, mp.bz);
      this.a(cna.oQ, mp.bz);
      this.a(cna.oR, mp.bz);
      this.a(cna.oP, mp.bz);
      this.a(cna.oO, mp.bz);
      this.a(cna.oN, mp.bz);
      this.a(cna.rx, mp.bx);
      this.a(cna.vN, mp.bx);
      this.a(cna.nO, mp.bx);
      this.a(cna.vm, mp.bx);
      this.a(cna.vI, mp.bx);
      this.a(cna.qY, mp.bx);
      this.a(cna.qF, mp.bx);
      this.a(cna.qG, mp.bx);
      this.a(cna.qH, mp.bx);
      this.a(cna.qw, mp.bx);
      this.a(cna.pt, mp.bx);
      this.a(cna.rf, mp.bx);
      this.a(cna.oL, mp.bz);
      this.a(cna.oM, mp.bz);
      this.a(cna.oK, mp.bz);
      this.a(cna.oJ, mp.bz);
      this.a(cna.oI, mp.bz);
      this.a(cna.tT, mp.bx);
      this.a(cna.tU, mp.bx);
      this.a(cna.rj, mp.bx);
      this.a(cna.xj, mp.bx);
      this.a(cna.xk, mp.bx);
      this.a(cna.xl, mp.bx);
      this.a(cna.xm, mp.bx);
      this.a(cna.xn, mp.bx);
      this.a(cna.xo, mp.bx);
      this.a(cna.xp, mp.bx);
      this.a(cna.xq, mp.bx);
      this.a(cna.xr, mp.bx);
      this.a(cna.xs, mp.bx);
      this.a(cna.xt, mp.bx);
      this.a(cna.xu, mp.bx);
      this.a(cna.xv, mp.bx);
      this.a(cna.xw, mp.bx);
      this.a(cna.xx, mp.bx);
      this.a(cna.xy, mp.bx);
      this.a(cna.xz, mp.bx);
      this.a(cna.vq, cna.pm, mp.bz);
      this.a(cna.pY, cna.pX, mp.bx);

      for (cms $$0 : kd.h) {
         if ($$0 instanceof ckh $$1) {
            this.a($$1);
         }
      }

      this.a(cna.xA, mp.bx);
      this.a(cna.xB, mp.bx);
      this.a(cna.xC, mp.bx);
      this.a(cna.xD, mp.bx);
      this.a(cna.xE, mp.bx);
      this.a(cna.xF, mp.bx);
      this.a(cna.xG, mp.bx);
      this.a(cna.xH, mp.bx);
      this.a(cna.xI, mp.bx);
      this.a(cna.xJ, mp.bx);
      this.a(cna.xK, mp.bx);
      this.a(cna.xL, mp.bx);
      this.a(cna.xM, mp.bx);
      this.a(cna.xN, mp.bx);
      this.a(cna.xO, mp.bx);
      this.a(cna.xP, mp.bx);
      this.a(cna.xQ, mp.bx);
      this.a(cna.xR, mp.bx);
      this.a(cna.xS, mp.bx);
      this.a(cna.xT, mp.bx);
      this.a(cna.yl, mp.bx);
   }

   static record a(String a, float b, Map<cki, String> c) {
      public String a(cki $$0) {
         return this.c.getOrDefault($$0, this.a);
      }
   }
}
