import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Supplier;

public class lw {
   public static final agt a = new agt("trim_type");
   private static final List<lw.a> b = List.of(
      new lw.a("quartz", 0.1F, Map.of()),
      new lw.a("iron", 0.2F, Map.of(cjt.c, "iron_darker")),
      new lw.a("netherite", 0.3F, Map.of(cjt.g, "netherite_darker")),
      new lw.a("redstone", 0.4F, Map.of()),
      new lw.a("copper", 0.5F, Map.of()),
      new lw.a("gold", 0.6F, Map.of(cjt.d, "gold_darker")),
      new lw.a("emerald", 0.7F, Map.of()),
      new lw.a("diamond", 0.8F, Map.of(cjt.e, "diamond_darker")),
      new lw.a("lapis", 0.9F, Map.of()),
      new lw.a("amethyst", 1.0F, Map.of())
   );
   private final BiConsumer<agt, Supplier<JsonElement>> c;

   public lw(BiConsumer<agt, Supplier<JsonElement>> $$0) {
      this.c = $$0;
   }

   private void a(cmc $$0, mk $$1) {
      $$1.a(mj.a($$0), mm.b($$0), this.c);
   }

   private void a(cmc $$0, String $$1, mk $$2) {
      $$2.a(mj.a($$0, $$1), mm.k(mm.a($$0, $$1)), this.c);
   }

   private void a(cmc $$0, cmc $$1, mk $$2) {
      $$2.a(mj.a($$0), mm.b($$1), this.c);
   }

   private void a(cmc $$0) {
      for (int $$1 = 0; $$1 < 32; $$1++) {
         if ($$1 != 16) {
            this.a($$0, String.format(Locale.ROOT, "_%02d", $$1), ml.bx);
         }
      }
   }

   private void b(cmc $$0) {
      for (int $$1 = 1; $$1 < 64; $$1++) {
         this.a($$0, String.format(Locale.ROOT, "_%02d", $$1), ml.bx);
      }
   }

   private void a(agt $$0, agt $$1, agt $$2) {
      ml.bB.a($$0, mm.c($$1, $$2), this.c);
   }

   private void a(agt $$0, agt $$1, agt $$2, agt $$3) {
      ml.bC.a($$0, mm.a($$1, $$2, $$3), this.c);
   }

   private agt a(agt $$0, String $$1) {
      return $$0.e("_" + $$1 + "_trim");
   }

   private JsonObject a(agt $$0, Map<mn, agt> $$1, cjs $$2) {
      JsonObject $$3 = ml.bB.a($$0, $$1);
      JsonArray $$4 = new JsonArray();

      for (lw.a $$5 : b) {
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

   private void a(cjr $$0) {
      agt $$1 = mj.a($$0);
      agt $$2 = mm.c($$0);
      agt $$3 = mm.a($$0, "_overlay");
      if ($$0.d() == cjt.a) {
         ml.bB.a($$1, mm.c($$2, $$3), this.c, ($$1x, $$2x) -> this.a($$1x, $$2x, $$0.d()));
      } else {
         ml.bx.a($$1, mm.k($$2), this.c, ($$1x, $$2x) -> this.a($$1x, $$2x, $$0.d()));
      }

      for (lw.a $$4 : b) {
         String $$5 = $$4.a($$0.d());
         agt $$6 = this.a($$1, $$5);
         String $$7 = $$0.b().b() + "_trim_" + $$5;
         agt $$8 = new agt($$7).d("trims/items/");
         if ($$0.d() == cjt.a) {
            this.a($$6, $$2, $$3, $$8);
         } else {
            this.a($$6, $$2, $$8);
         }
      }
   }

   public void a() {
      this.a(cmk.ob, ml.bx);
      this.a(cmk.od, ml.bx);
      this.a(cmk.oc, ml.bx);
      this.a(cmk.oe, ml.bx);
      this.a(cmk.oz, ml.bx);
      this.a(cmk.oq, ml.bx);
      this.a(cmk.uy, ml.bx);
      this.a(cmk.os, ml.bx);
      this.a(cmk.ua, ml.bx);
      this.a(cmk.dQ, ml.bz);
      this.a(cmk.rX, ml.bx);
      this.a(cmk.vd, ml.bx);
      this.a(cmk.vf, ml.bx);
      this.a(cmk.nX, ml.bx);
      this.a(cmk.nY, ml.bx);
      this.a(cmk.ru, ml.bx);
      this.a(cmk.sl, ml.bx);
      this.a(cmk.sd, ml.bz);
      this.a(cmk.rq, ml.bx);
      this.a(cmk.rv, ml.bx);
      this.a(cmk.qM, ml.bx);
      this.a(cmk.pn, ml.bx);
      this.a(cmk.pu, ml.bx);
      this.a(cmk.qI, ml.bx);
      this.a(cmk.rr, ml.bx);
      this.a(cmk.qv, ml.bx);
      this.a(cmk.nQ, ml.bA);
      this.a(cmk.nR, ml.bA);
      this.a(cmk.ou, ml.bx);
      this.a(cmk.nM, ml.bx);
      this.a(cmk.rZ, ml.bx);
      this.a(cmk.uZ, ml.bx);
      this.a(cmk.qJ, ml.bx);
      this.b(cmk.qT);
      this.a(cmk.ot, ml.bx);
      this.a(cmk.qE, ml.bx);
      this.a(cmk.uF, ml.bx);
      this.a(cmk.qP);
      this.a(cmk.qQ);
      this.a(cmk.rY, ml.bx);
      this.a(cmk.sa, ml.bx);
      this.a(cmk.ra, ml.bx);
      this.a(cmk.uH, ml.bx);
      this.a(cmk.pV, ml.bx);
      this.a(cmk.uu, ml.bx);
      this.a(cmk.rb, ml.bx);
      this.a(cmk.rP, ml.bx);
      this.a(cmk.oC, ml.bx);
      this.a(cmk.oD, ml.bx);
      this.a(cmk.vQ, ml.bx);
      this.a(cmk.ro, ml.bx);
      this.a(cmk.of, ml.bx);
      this.a(cmk.og, ml.bx);
      this.a(cmk.ov, ml.bx);
      this.a(cmk.pf, ml.bz);
      this.a(cmk.pg, ml.bz);
      this.a(cmk.uB, ml.bx);
      this.a(cmk.pe, ml.bz);
      this.a(cmk.pd, ml.bz);
      this.a(cmk.pc, ml.bz);
      this.a(cmk.vg, ml.bx);
      this.a(cmk.rU, ml.bx);
      this.a(cmk.qO, ml.bx);
      this.a(cmk.ow, ml.bx);
      this.a(cmk.up, ml.bx);
      this.a(cmk.sp, ml.bx);
      this.a(cmk.sc, ml.bx);
      this.a(cmk.uY, ml.bx);
      this.a(cmk.tR, ml.bx);
      this.a(cmk.sk, ml.bx);
      this.a(cmk.un, ml.bx);
      this.a(cmk.tS, ml.bx);
      this.a(cmk.pT, ml.bx);
      this.a(cmk.op, ml.bx);
      this.a(cmk.vP, ml.bx);
      this.a(cmk.nN, ml.bx);
      this.a(cmk.se, ml.bx);
      this.a(cmk.si, ml.bx);
      this.a(cmk.sq, ml.bx);
      this.a(cmk.vT, ml.bx);
      this.a(cmk.wj, ml.bx);
      this.a(cmk.qV, ml.bx);
      this.a(cmk.rd, ml.bx);
      this.a(cmk.tW, ml.bx);
      this.a(cmk.oE, ml.bx);
      this.a(cmk.pX, ml.bx);
      this.a(cmk.oV, ml.bz);
      this.a(cmk.ud, ml.bx);
      this.a(cmk.oW, ml.bz);
      this.a(cmk.uA, ml.bx);
      this.a(cmk.oU, ml.bz);
      this.a(cmk.oT, ml.bz);
      this.a(cmk.oS, ml.bz);
      this.a(cmk.oF, ml.bx);
      this.a(cmk.sf, ml.bx);
      this.a(cmk.rm, ml.bx);
      this.a(cmk.rs, ml.bx);
      this.a(cmk.pr, ml.bx);
      this.a(cmk.vL, ml.bx);
      this.a(cmk.wn, ml.bx);
      this.a(cmk.wq, ml.bx);
      this.a(cmk.nP, ml.bx);
      this.a(cmk.rc, ml.bx);
      this.a(cmk.oA, ml.bx);
      this.a(cmk.pa, ml.bz);
      this.a(cmk.pb, ml.bz);
      this.a(cmk.uz, ml.bx);
      this.a(cmk.oB, ml.bx);
      this.a(cmk.vo, ml.bx);
      this.a(cmk.oZ, ml.bz);
      this.a(cmk.oY, ml.bz);
      this.a(cmk.oX, ml.bz);
      this.a(cmk.tV, ml.bx);
      this.a(cmk.nZ, ml.bx);
      this.a(cmk.oa, ml.bx);
      this.a(cmk.vp, ml.bx);
      this.a(cmk.ox, ml.bx);
      this.a(cmk.qx, ml.bx);
      this.a(cmk.qA, ml.bx);
      this.a(cmk.uC, ml.bx);
      this.a(cmk.ri, ml.bx);
      this.a(cmk.rn, ml.bx);
      this.a(cmk.rk, ml.bx);
      this.a(cmk.rh, ml.bx);
      this.a(cmk.sm, ml.bx);
      this.a(cmk.oh, ml.bx);
      this.a(cmk.oi, ml.bx);
      this.a(cmk.oj, ml.bx);
      this.a(cmk.ok, ml.bx);
      this.a(cmk.uc, ml.bx);
      this.a(cmk.rT, ml.bx);
      this.a(cmk.qB, ml.bx);
      this.a(cmk.nL, ml.bx);
      this.a(cmk.vS, ml.bx);
      this.a(cmk.po, ml.bx);
      this.a(cmk.vH, ml.bx);
      this.a(cmk.vB, ml.by);
      this.a(cmk.vr, ml.by);
      this.a(cmk.vt, ml.by);
      this.a(cmk.vs, ml.by);
      this.a(cmk.vu, ml.by);
      this.a(cmk.vv, ml.by);
      this.a(cmk.vw, ml.by);
      this.a(cmk.vx, ml.by);
      this.a(cmk.vG, ml.by);
      this.a(cmk.vy, ml.by);
      this.a(cmk.vz, ml.by);
      this.a(cmk.vC, ml.by);
      this.a(cmk.vA, ml.by);
      this.a(cmk.vD, ml.by);
      this.a(cmk.vE, ml.by);
      this.a(cmk.vF, ml.by);
      this.a(cmk.uG, ml.bx);
      this.a(cmk.uE, ml.bx);
      this.a(cmk.vK, ml.bx);
      this.a(cmk.pk, ml.bz);
      this.a(cmk.pl, ml.bz);
      this.a(cmk.oG, ml.bx);
      this.a(cmk.pj, ml.bz);
      this.a(cmk.oH, ml.bx);
      this.a(cmk.pi, ml.bz);
      this.a(cmk.ph, ml.bz);
      this.a(cmk.uq, ml.bx);
      this.a(cmk.ul, ml.bx);
      this.a(cmk.nT, ml.bx);
      this.a(cmk.nU, ml.bx);
      this.a(cmk.rg, ml.bx);
      this.a(cmk.pW, ml.bx);
      this.a(cmk.qL, ml.bx);
      this.a(cmk.vJ, ml.bx);
      this.a(cmk.vU, ml.bx);
      this.a(cmk.rl, ml.bx);
      this.a(cmk.ub, ml.bx);
      this.a(cmk.va, ml.bx);
      this.a(cmk.pU, ml.bx);
      this.a(cmk.qy, ml.bx);
      this.a(cmk.us, ml.bx);
      this.a(cmk.ur, ml.bx);
      this.a(cmk.qZ, ml.bx);
      this.a(cmk.qC, ml.bx);
      this.a(cmk.um, ml.bx);
      this.a(cmk.rp, ml.bx);
      this.a(cmk.oy, ml.bx);
      this.a(cmk.ut, ml.bx);
      this.a(cmk.uw, ml.bx);
      this.a(cmk.ux, ml.bx);
      this.a(cmk.uv, ml.bx);
      this.a(cmk.rt, ml.bx);
      this.a(cmk.sb, ml.bx);
      this.a(cmk.nK, ml.bx);
      this.a(cmk.qX, ml.bx);
      this.a(cmk.qD, ml.bx);
      this.a(cmk.oo, ml.bx);
      this.a(cmk.rS, ml.bx);
      this.a(cmk.vn, ml.bx);
      this.a(cmk.vR, ml.bx);
      this.a(cmk.qN, ml.bx);
      this.a(cmk.qz, ml.bx);
      this.a(cmk.xh, ml.bx);
      this.a(cmk.vi, ml.bx);
      this.a(cmk.sj, ml.bx);
      this.a(cmk.nV, ml.bx);
      this.a(cmk.nW, ml.bx);
      this.a(cmk.qU, ml.bx);
      this.a(cmk.pm, ml.bz);
      this.a(cmk.oQ, ml.bz);
      this.a(cmk.oR, ml.bz);
      this.a(cmk.oP, ml.bz);
      this.a(cmk.oO, ml.bz);
      this.a(cmk.oN, ml.bz);
      this.a(cmk.rx, ml.bx);
      this.a(cmk.vN, ml.bx);
      this.a(cmk.nO, ml.bx);
      this.a(cmk.vm, ml.bx);
      this.a(cmk.vI, ml.bx);
      this.a(cmk.qY, ml.bx);
      this.a(cmk.qF, ml.bx);
      this.a(cmk.qG, ml.bx);
      this.a(cmk.qH, ml.bx);
      this.a(cmk.qw, ml.bx);
      this.a(cmk.pt, ml.bx);
      this.a(cmk.rf, ml.bx);
      this.a(cmk.oL, ml.bz);
      this.a(cmk.oM, ml.bz);
      this.a(cmk.oK, ml.bz);
      this.a(cmk.oJ, ml.bz);
      this.a(cmk.oI, ml.bz);
      this.a(cmk.tT, ml.bx);
      this.a(cmk.tU, ml.bx);
      this.a(cmk.rj, ml.bx);
      this.a(cmk.xj, ml.bx);
      this.a(cmk.xk, ml.bx);
      this.a(cmk.xl, ml.bx);
      this.a(cmk.xm, ml.bx);
      this.a(cmk.xn, ml.bx);
      this.a(cmk.xo, ml.bx);
      this.a(cmk.xp, ml.bx);
      this.a(cmk.xq, ml.bx);
      this.a(cmk.xr, ml.bx);
      this.a(cmk.xs, ml.bx);
      this.a(cmk.xt, ml.bx);
      this.a(cmk.xu, ml.bx);
      this.a(cmk.xv, ml.bx);
      this.a(cmk.xw, ml.bx);
      this.a(cmk.xx, ml.bx);
      this.a(cmk.xy, ml.bx);
      this.a(cmk.xz, ml.bx);
      this.a(cmk.vq, cmk.pm, ml.bz);
      this.a(cmk.pY, cmk.pX, ml.bx);

      for (cmc $$0 : kb.h) {
         if ($$0 instanceof cjr $$1) {
            this.a($$1);
         }
      }

      this.a(cmk.xA, ml.bx);
      this.a(cmk.xB, ml.bx);
      this.a(cmk.xC, ml.bx);
      this.a(cmk.xD, ml.bx);
      this.a(cmk.xE, ml.bx);
      this.a(cmk.xF, ml.bx);
      this.a(cmk.xG, ml.bx);
      this.a(cmk.xH, ml.bx);
      this.a(cmk.xI, ml.bx);
      this.a(cmk.xJ, ml.bx);
      this.a(cmk.xK, ml.bx);
      this.a(cmk.xL, ml.bx);
      this.a(cmk.xM, ml.bx);
      this.a(cmk.xN, ml.bx);
      this.a(cmk.xO, ml.bx);
      this.a(cmk.xP, ml.bx);
      this.a(cmk.xQ, ml.bx);
      this.a(cmk.xR, ml.bx);
      this.a(cmk.xS, ml.bx);
      this.a(cmk.xT, ml.bx);
      this.a(cmk.yl, ml.bx);
   }

   static record a(String a, float b, Map<cjs, String> c) {
      public String a(cjs $$0) {
         return this.c.getOrDefault($$0, this.a);
      }
   }
}
