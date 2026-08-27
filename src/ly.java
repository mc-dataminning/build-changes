import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Supplier;

public class ly {
   public static final ahd a = new ahd("trim_type");
   private static final List<ly.a> b = List.of(
      new ly.a("quartz", 0.1F, Map.of()),
      new ly.a("iron", 0.2F, Map.of(ckd.c, "iron_darker")),
      new ly.a("netherite", 0.3F, Map.of(ckd.g, "netherite_darker")),
      new ly.a("redstone", 0.4F, Map.of()),
      new ly.a("copper", 0.5F, Map.of()),
      new ly.a("gold", 0.6F, Map.of(ckd.d, "gold_darker")),
      new ly.a("emerald", 0.7F, Map.of()),
      new ly.a("diamond", 0.8F, Map.of(ckd.e, "diamond_darker")),
      new ly.a("lapis", 0.9F, Map.of()),
      new ly.a("amethyst", 1.0F, Map.of())
   );
   private final BiConsumer<ahd, Supplier<JsonElement>> c;

   public ly(BiConsumer<ahd, Supplier<JsonElement>> $$0) {
      this.c = $$0;
   }

   private void a(cmm $$0, mm $$1) {
      $$1.a(ml.a($$0), mo.b($$0), this.c);
   }

   private void a(cmm $$0, String $$1, mm $$2) {
      $$2.a(ml.a($$0, $$1), mo.k(mo.a($$0, $$1)), this.c);
   }

   private void a(cmm $$0, cmm $$1, mm $$2) {
      $$2.a(ml.a($$0), mo.b($$1), this.c);
   }

   private void a(cmm $$0) {
      for (int $$1 = 0; $$1 < 32; $$1++) {
         if ($$1 != 16) {
            this.a($$0, String.format(Locale.ROOT, "_%02d", $$1), mn.bx);
         }
      }
   }

   private void b(cmm $$0) {
      for (int $$1 = 1; $$1 < 64; $$1++) {
         this.a($$0, String.format(Locale.ROOT, "_%02d", $$1), mn.bx);
      }
   }

   private void a(ahd $$0, ahd $$1, ahd $$2) {
      mn.bB.a($$0, mo.c($$1, $$2), this.c);
   }

   private void a(ahd $$0, ahd $$1, ahd $$2, ahd $$3) {
      mn.bC.a($$0, mo.a($$1, $$2, $$3), this.c);
   }

   private ahd a(ahd $$0, String $$1) {
      return $$0.e("_" + $$1 + "_trim");
   }

   private JsonObject a(ahd $$0, Map<mp, ahd> $$1, ckc $$2) {
      JsonObject $$3 = mn.bB.a($$0, $$1);
      JsonArray $$4 = new JsonArray();

      for (ly.a $$5 : b) {
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

   private void a(ckb $$0) {
      ahd $$1 = ml.a($$0);
      ahd $$2 = mo.c($$0);
      ahd $$3 = mo.a($$0, "_overlay");
      if ($$0.d() == ckd.a) {
         mn.bB.a($$1, mo.c($$2, $$3), this.c, ($$1x, $$2x) -> this.a($$1x, $$2x, $$0.d()));
      } else {
         mn.bx.a($$1, mo.k($$2), this.c, ($$1x, $$2x) -> this.a($$1x, $$2x, $$0.d()));
      }

      for (ly.a $$4 : b) {
         String $$5 = $$4.a($$0.d());
         ahd $$6 = this.a($$1, $$5);
         String $$7 = $$0.b().b() + "_trim_" + $$5;
         ahd $$8 = new ahd($$7).d("trims/items/");
         if ($$0.d() == ckd.a) {
            this.a($$6, $$2, $$3, $$8);
         } else {
            this.a($$6, $$2, $$8);
         }
      }
   }

   public void a() {
      this.a(cmu.ob, mn.bx);
      this.a(cmu.od, mn.bx);
      this.a(cmu.oc, mn.bx);
      this.a(cmu.oe, mn.bx);
      this.a(cmu.oz, mn.bx);
      this.a(cmu.oq, mn.bx);
      this.a(cmu.uy, mn.bx);
      this.a(cmu.os, mn.bx);
      this.a(cmu.ua, mn.bx);
      this.a(cmu.dQ, mn.bz);
      this.a(cmu.rX, mn.bx);
      this.a(cmu.vd, mn.bx);
      this.a(cmu.vf, mn.bx);
      this.a(cmu.nX, mn.bx);
      this.a(cmu.nY, mn.bx);
      this.a(cmu.ru, mn.bx);
      this.a(cmu.sl, mn.bx);
      this.a(cmu.sd, mn.bz);
      this.a(cmu.rq, mn.bx);
      this.a(cmu.rv, mn.bx);
      this.a(cmu.qM, mn.bx);
      this.a(cmu.pn, mn.bx);
      this.a(cmu.pu, mn.bx);
      this.a(cmu.qI, mn.bx);
      this.a(cmu.rr, mn.bx);
      this.a(cmu.qv, mn.bx);
      this.a(cmu.nQ, mn.bA);
      this.a(cmu.nR, mn.bA);
      this.a(cmu.ou, mn.bx);
      this.a(cmu.nM, mn.bx);
      this.a(cmu.rZ, mn.bx);
      this.a(cmu.uZ, mn.bx);
      this.a(cmu.qJ, mn.bx);
      this.b(cmu.qT);
      this.a(cmu.ot, mn.bx);
      this.a(cmu.qE, mn.bx);
      this.a(cmu.uF, mn.bx);
      this.a(cmu.qP);
      this.a(cmu.qQ);
      this.a(cmu.rY, mn.bx);
      this.a(cmu.sa, mn.bx);
      this.a(cmu.ra, mn.bx);
      this.a(cmu.uH, mn.bx);
      this.a(cmu.pV, mn.bx);
      this.a(cmu.uu, mn.bx);
      this.a(cmu.rb, mn.bx);
      this.a(cmu.rP, mn.bx);
      this.a(cmu.oC, mn.bx);
      this.a(cmu.oD, mn.bx);
      this.a(cmu.vQ, mn.bx);
      this.a(cmu.ro, mn.bx);
      this.a(cmu.of, mn.bx);
      this.a(cmu.og, mn.bx);
      this.a(cmu.ov, mn.bx);
      this.a(cmu.pf, mn.bz);
      this.a(cmu.pg, mn.bz);
      this.a(cmu.uB, mn.bx);
      this.a(cmu.pe, mn.bz);
      this.a(cmu.pd, mn.bz);
      this.a(cmu.pc, mn.bz);
      this.a(cmu.vg, mn.bx);
      this.a(cmu.rU, mn.bx);
      this.a(cmu.qO, mn.bx);
      this.a(cmu.ow, mn.bx);
      this.a(cmu.up, mn.bx);
      this.a(cmu.sp, mn.bx);
      this.a(cmu.sc, mn.bx);
      this.a(cmu.uY, mn.bx);
      this.a(cmu.tR, mn.bx);
      this.a(cmu.sk, mn.bx);
      this.a(cmu.un, mn.bx);
      this.a(cmu.tS, mn.bx);
      this.a(cmu.pT, mn.bx);
      this.a(cmu.op, mn.bx);
      this.a(cmu.vP, mn.bx);
      this.a(cmu.nN, mn.bx);
      this.a(cmu.se, mn.bx);
      this.a(cmu.si, mn.bx);
      this.a(cmu.sq, mn.bx);
      this.a(cmu.vT, mn.bx);
      this.a(cmu.wj, mn.bx);
      this.a(cmu.qV, mn.bx);
      this.a(cmu.rd, mn.bx);
      this.a(cmu.tW, mn.bx);
      this.a(cmu.oE, mn.bx);
      this.a(cmu.pX, mn.bx);
      this.a(cmu.oV, mn.bz);
      this.a(cmu.ud, mn.bx);
      this.a(cmu.oW, mn.bz);
      this.a(cmu.uA, mn.bx);
      this.a(cmu.oU, mn.bz);
      this.a(cmu.oT, mn.bz);
      this.a(cmu.oS, mn.bz);
      this.a(cmu.oF, mn.bx);
      this.a(cmu.sf, mn.bx);
      this.a(cmu.rm, mn.bx);
      this.a(cmu.rs, mn.bx);
      this.a(cmu.pr, mn.bx);
      this.a(cmu.vL, mn.bx);
      this.a(cmu.wn, mn.bx);
      this.a(cmu.wq, mn.bx);
      this.a(cmu.nP, mn.bx);
      this.a(cmu.rc, mn.bx);
      this.a(cmu.oA, mn.bx);
      this.a(cmu.pa, mn.bz);
      this.a(cmu.pb, mn.bz);
      this.a(cmu.uz, mn.bx);
      this.a(cmu.oB, mn.bx);
      this.a(cmu.vo, mn.bx);
      this.a(cmu.oZ, mn.bz);
      this.a(cmu.oY, mn.bz);
      this.a(cmu.oX, mn.bz);
      this.a(cmu.tV, mn.bx);
      this.a(cmu.nZ, mn.bx);
      this.a(cmu.oa, mn.bx);
      this.a(cmu.vp, mn.bx);
      this.a(cmu.ox, mn.bx);
      this.a(cmu.qx, mn.bx);
      this.a(cmu.qA, mn.bx);
      this.a(cmu.uC, mn.bx);
      this.a(cmu.ri, mn.bx);
      this.a(cmu.rn, mn.bx);
      this.a(cmu.rk, mn.bx);
      this.a(cmu.rh, mn.bx);
      this.a(cmu.sm, mn.bx);
      this.a(cmu.oh, mn.bx);
      this.a(cmu.oi, mn.bx);
      this.a(cmu.oj, mn.bx);
      this.a(cmu.ok, mn.bx);
      this.a(cmu.uc, mn.bx);
      this.a(cmu.rT, mn.bx);
      this.a(cmu.qB, mn.bx);
      this.a(cmu.nL, mn.bx);
      this.a(cmu.vS, mn.bx);
      this.a(cmu.po, mn.bx);
      this.a(cmu.vH, mn.bx);
      this.a(cmu.vB, mn.by);
      this.a(cmu.vr, mn.by);
      this.a(cmu.vt, mn.by);
      this.a(cmu.vs, mn.by);
      this.a(cmu.vu, mn.by);
      this.a(cmu.vv, mn.by);
      this.a(cmu.vw, mn.by);
      this.a(cmu.vx, mn.by);
      this.a(cmu.vG, mn.by);
      this.a(cmu.vy, mn.by);
      this.a(cmu.vz, mn.by);
      this.a(cmu.vC, mn.by);
      this.a(cmu.vA, mn.by);
      this.a(cmu.vD, mn.by);
      this.a(cmu.vE, mn.by);
      this.a(cmu.vF, mn.by);
      this.a(cmu.uG, mn.bx);
      this.a(cmu.uE, mn.bx);
      this.a(cmu.vK, mn.bx);
      this.a(cmu.pk, mn.bz);
      this.a(cmu.pl, mn.bz);
      this.a(cmu.oG, mn.bx);
      this.a(cmu.pj, mn.bz);
      this.a(cmu.oH, mn.bx);
      this.a(cmu.pi, mn.bz);
      this.a(cmu.ph, mn.bz);
      this.a(cmu.uq, mn.bx);
      this.a(cmu.ul, mn.bx);
      this.a(cmu.nT, mn.bx);
      this.a(cmu.nU, mn.bx);
      this.a(cmu.rg, mn.bx);
      this.a(cmu.pW, mn.bx);
      this.a(cmu.qL, mn.bx);
      this.a(cmu.vJ, mn.bx);
      this.a(cmu.vU, mn.bx);
      this.a(cmu.rl, mn.bx);
      this.a(cmu.ub, mn.bx);
      this.a(cmu.va, mn.bx);
      this.a(cmu.pU, mn.bx);
      this.a(cmu.qy, mn.bx);
      this.a(cmu.us, mn.bx);
      this.a(cmu.ur, mn.bx);
      this.a(cmu.qZ, mn.bx);
      this.a(cmu.qC, mn.bx);
      this.a(cmu.um, mn.bx);
      this.a(cmu.rp, mn.bx);
      this.a(cmu.oy, mn.bx);
      this.a(cmu.ut, mn.bx);
      this.a(cmu.uw, mn.bx);
      this.a(cmu.ux, mn.bx);
      this.a(cmu.uv, mn.bx);
      this.a(cmu.rt, mn.bx);
      this.a(cmu.sb, mn.bx);
      this.a(cmu.nK, mn.bx);
      this.a(cmu.qX, mn.bx);
      this.a(cmu.qD, mn.bx);
      this.a(cmu.oo, mn.bx);
      this.a(cmu.rS, mn.bx);
      this.a(cmu.vn, mn.bx);
      this.a(cmu.vR, mn.bx);
      this.a(cmu.qN, mn.bx);
      this.a(cmu.qz, mn.bx);
      this.a(cmu.xh, mn.bx);
      this.a(cmu.vi, mn.bx);
      this.a(cmu.sj, mn.bx);
      this.a(cmu.nV, mn.bx);
      this.a(cmu.nW, mn.bx);
      this.a(cmu.qU, mn.bx);
      this.a(cmu.pm, mn.bz);
      this.a(cmu.oQ, mn.bz);
      this.a(cmu.oR, mn.bz);
      this.a(cmu.oP, mn.bz);
      this.a(cmu.oO, mn.bz);
      this.a(cmu.oN, mn.bz);
      this.a(cmu.rx, mn.bx);
      this.a(cmu.vN, mn.bx);
      this.a(cmu.nO, mn.bx);
      this.a(cmu.vm, mn.bx);
      this.a(cmu.vI, mn.bx);
      this.a(cmu.qY, mn.bx);
      this.a(cmu.qF, mn.bx);
      this.a(cmu.qG, mn.bx);
      this.a(cmu.qH, mn.bx);
      this.a(cmu.qw, mn.bx);
      this.a(cmu.pt, mn.bx);
      this.a(cmu.rf, mn.bx);
      this.a(cmu.oL, mn.bz);
      this.a(cmu.oM, mn.bz);
      this.a(cmu.oK, mn.bz);
      this.a(cmu.oJ, mn.bz);
      this.a(cmu.oI, mn.bz);
      this.a(cmu.tT, mn.bx);
      this.a(cmu.tU, mn.bx);
      this.a(cmu.rj, mn.bx);
      this.a(cmu.xj, mn.bx);
      this.a(cmu.xk, mn.bx);
      this.a(cmu.xl, mn.bx);
      this.a(cmu.xm, mn.bx);
      this.a(cmu.xn, mn.bx);
      this.a(cmu.xo, mn.bx);
      this.a(cmu.xp, mn.bx);
      this.a(cmu.xq, mn.bx);
      this.a(cmu.xr, mn.bx);
      this.a(cmu.xs, mn.bx);
      this.a(cmu.xt, mn.bx);
      this.a(cmu.xu, mn.bx);
      this.a(cmu.xv, mn.bx);
      this.a(cmu.xw, mn.bx);
      this.a(cmu.xx, mn.bx);
      this.a(cmu.xy, mn.bx);
      this.a(cmu.xz, mn.bx);
      this.a(cmu.vq, cmu.pm, mn.bz);
      this.a(cmu.pY, cmu.pX, mn.bx);

      for (cmm $$0 : kd.h) {
         if ($$0 instanceof ckb $$1) {
            this.a($$1);
         }
      }

      this.a(cmu.xA, mn.bx);
      this.a(cmu.xB, mn.bx);
      this.a(cmu.xC, mn.bx);
      this.a(cmu.xD, mn.bx);
      this.a(cmu.xE, mn.bx);
      this.a(cmu.xF, mn.bx);
      this.a(cmu.xG, mn.bx);
      this.a(cmu.xH, mn.bx);
      this.a(cmu.xI, mn.bx);
      this.a(cmu.xJ, mn.bx);
      this.a(cmu.xK, mn.bx);
      this.a(cmu.xL, mn.bx);
      this.a(cmu.xM, mn.bx);
      this.a(cmu.xN, mn.bx);
      this.a(cmu.xO, mn.bx);
      this.a(cmu.xP, mn.bx);
      this.a(cmu.xQ, mn.bx);
      this.a(cmu.xR, mn.bx);
      this.a(cmu.xS, mn.bx);
      this.a(cmu.xT, mn.bx);
      this.a(cmu.yl, mn.bx);
   }

   static record a(String a, float b, Map<ckc, String> c) {
      public String a(ckc $$0) {
         return this.c.getOrDefault($$0, this.a);
      }
   }
}
