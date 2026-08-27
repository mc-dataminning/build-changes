import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Supplier;

public class lw {
   public static final agm a = new agm("trim_type");
   private static final List<lw.a> b = List.of(
      new lw.a("quartz", 0.1F, Map.of()),
      new lw.a("iron", 0.2F, Map.of(cja.c, "iron_darker")),
      new lw.a("netherite", 0.3F, Map.of(cja.g, "netherite_darker")),
      new lw.a("redstone", 0.4F, Map.of()),
      new lw.a("copper", 0.5F, Map.of()),
      new lw.a("gold", 0.6F, Map.of(cja.d, "gold_darker")),
      new lw.a("emerald", 0.7F, Map.of()),
      new lw.a("diamond", 0.8F, Map.of(cja.e, "diamond_darker")),
      new lw.a("lapis", 0.9F, Map.of()),
      new lw.a("amethyst", 1.0F, Map.of())
   );
   private final BiConsumer<agm, Supplier<JsonElement>> c;

   public lw(BiConsumer<agm, Supplier<JsonElement>> $$0) {
      this.c = $$0;
   }

   private void a(clj $$0, mk $$1) {
      $$1.a(mj.a($$0), mm.b($$0), this.c);
   }

   private void a(clj $$0, String $$1, mk $$2) {
      $$2.a(mj.a($$0, $$1), mm.k(mm.a($$0, $$1)), this.c);
   }

   private void a(clj $$0, clj $$1, mk $$2) {
      $$2.a(mj.a($$0), mm.b($$1), this.c);
   }

   private void a(clj $$0) {
      for (int $$1 = 0; $$1 < 32; $$1++) {
         if ($$1 != 16) {
            this.a($$0, String.format(Locale.ROOT, "_%02d", $$1), ml.bv);
         }
      }
   }

   private void b(clj $$0) {
      for (int $$1 = 1; $$1 < 64; $$1++) {
         this.a($$0, String.format(Locale.ROOT, "_%02d", $$1), ml.bv);
      }
   }

   private void a(agm $$0, agm $$1, agm $$2) {
      ml.bz.a($$0, mm.c($$1, $$2), this.c);
   }

   private void a(agm $$0, agm $$1, agm $$2, agm $$3) {
      ml.bA.a($$0, mm.a($$1, $$2, $$3), this.c);
   }

   private agm a(agm $$0, String $$1) {
      return $$0.e("_" + $$1 + "_trim");
   }

   private JsonObject a(agm $$0, Map<mn, agm> $$1, ciz $$2) {
      JsonObject $$3 = ml.bz.a($$0, $$1);
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

   private void a(ciy $$0) {
      agm $$1 = mj.a($$0);
      agm $$2 = mm.c($$0);
      agm $$3 = mm.a($$0, "_overlay");
      if ($$0.d() == cja.a) {
         ml.bz.a($$1, mm.c($$2, $$3), this.c, ($$1x, $$2x) -> this.a($$1x, $$2x, $$0.d()));
      } else {
         ml.bv.a($$1, mm.k($$2), this.c, ($$1x, $$2x) -> this.a($$1x, $$2x, $$0.d()));
      }

      for (lw.a $$4 : b) {
         String $$5 = $$4.a($$0.d());
         agm $$6 = this.a($$1, $$5);
         String $$7 = $$0.b().b() + "_trim_" + $$5;
         agm $$8 = new agm($$7).d("trims/items/");
         if ($$0.d() == cja.a) {
            this.a($$6, $$2, $$3, $$8);
         } else {
            this.a($$6, $$2, $$8);
         }
      }
   }

   public void a() {
      this.a(clr.ob, ml.bv);
      this.a(clr.od, ml.bv);
      this.a(clr.oc, ml.bv);
      this.a(clr.oe, ml.bv);
      this.a(clr.oz, ml.bv);
      this.a(clr.oq, ml.bv);
      this.a(clr.ux, ml.bv);
      this.a(clr.os, ml.bv);
      this.a(clr.tZ, ml.bv);
      this.a(clr.dQ, ml.bx);
      this.a(clr.rX, ml.bv);
      this.a(clr.vc, ml.bv);
      this.a(clr.ve, ml.bv);
      this.a(clr.nX, ml.bv);
      this.a(clr.nY, ml.bv);
      this.a(clr.ru, ml.bv);
      this.a(clr.sl, ml.bv);
      this.a(clr.sd, ml.bx);
      this.a(clr.rq, ml.bv);
      this.a(clr.rv, ml.bv);
      this.a(clr.qM, ml.bv);
      this.a(clr.pn, ml.bv);
      this.a(clr.pu, ml.bv);
      this.a(clr.qI, ml.bv);
      this.a(clr.rr, ml.bv);
      this.a(clr.qv, ml.bv);
      this.a(clr.nQ, ml.by);
      this.a(clr.nR, ml.by);
      this.a(clr.ou, ml.bv);
      this.a(clr.nM, ml.bv);
      this.a(clr.rZ, ml.bv);
      this.a(clr.uY, ml.bv);
      this.a(clr.qJ, ml.bv);
      this.b(clr.qT);
      this.a(clr.ot, ml.bv);
      this.a(clr.qE, ml.bv);
      this.a(clr.uE, ml.bv);
      this.a(clr.qP);
      this.a(clr.qQ);
      this.a(clr.rY, ml.bv);
      this.a(clr.sa, ml.bv);
      this.a(clr.ra, ml.bv);
      this.a(clr.uG, ml.bv);
      this.a(clr.pV, ml.bv);
      this.a(clr.ut, ml.bv);
      this.a(clr.rb, ml.bv);
      this.a(clr.rP, ml.bv);
      this.a(clr.oC, ml.bv);
      this.a(clr.oD, ml.bv);
      this.a(clr.vP, ml.bv);
      this.a(clr.ro, ml.bv);
      this.a(clr.of, ml.bv);
      this.a(clr.og, ml.bv);
      this.a(clr.ov, ml.bv);
      this.a(clr.pf, ml.bx);
      this.a(clr.pg, ml.bx);
      this.a(clr.uA, ml.bv);
      this.a(clr.pe, ml.bx);
      this.a(clr.pd, ml.bx);
      this.a(clr.pc, ml.bx);
      this.a(clr.vf, ml.bv);
      this.a(clr.rU, ml.bv);
      this.a(clr.qO, ml.bv);
      this.a(clr.ow, ml.bv);
      this.a(clr.uo, ml.bv);
      this.a(clr.sp, ml.bv);
      this.a(clr.sc, ml.bv);
      this.a(clr.uX, ml.bv);
      this.a(clr.tQ, ml.bv);
      this.a(clr.sk, ml.bv);
      this.a(clr.um, ml.bv);
      this.a(clr.tR, ml.bv);
      this.a(clr.pT, ml.bv);
      this.a(clr.op, ml.bv);
      this.a(clr.vO, ml.bv);
      this.a(clr.nN, ml.bv);
      this.a(clr.se, ml.bv);
      this.a(clr.si, ml.bv);
      this.a(clr.sq, ml.bv);
      this.a(clr.vS, ml.bv);
      this.a(clr.wi, ml.bv);
      this.a(clr.qV, ml.bv);
      this.a(clr.rd, ml.bv);
      this.a(clr.tV, ml.bv);
      this.a(clr.oE, ml.bv);
      this.a(clr.pX, ml.bv);
      this.a(clr.oV, ml.bx);
      this.a(clr.uc, ml.bv);
      this.a(clr.oW, ml.bx);
      this.a(clr.uz, ml.bv);
      this.a(clr.oU, ml.bx);
      this.a(clr.oT, ml.bx);
      this.a(clr.oS, ml.bx);
      this.a(clr.oF, ml.bv);
      this.a(clr.sf, ml.bv);
      this.a(clr.rm, ml.bv);
      this.a(clr.rs, ml.bv);
      this.a(clr.pr, ml.bv);
      this.a(clr.vK, ml.bv);
      this.a(clr.wm, ml.bv);
      this.a(clr.wp, ml.bv);
      this.a(clr.nP, ml.bv);
      this.a(clr.rc, ml.bv);
      this.a(clr.oA, ml.bv);
      this.a(clr.pa, ml.bx);
      this.a(clr.pb, ml.bx);
      this.a(clr.uy, ml.bv);
      this.a(clr.oB, ml.bv);
      this.a(clr.vn, ml.bv);
      this.a(clr.oZ, ml.bx);
      this.a(clr.oY, ml.bx);
      this.a(clr.oX, ml.bx);
      this.a(clr.tU, ml.bv);
      this.a(clr.nZ, ml.bv);
      this.a(clr.oa, ml.bv);
      this.a(clr.vo, ml.bv);
      this.a(clr.ox, ml.bv);
      this.a(clr.qx, ml.bv);
      this.a(clr.qA, ml.bv);
      this.a(clr.uB, ml.bv);
      this.a(clr.ri, ml.bv);
      this.a(clr.rn, ml.bv);
      this.a(clr.rk, ml.bv);
      this.a(clr.rh, ml.bv);
      this.a(clr.sm, ml.bv);
      this.a(clr.oh, ml.bv);
      this.a(clr.oi, ml.bv);
      this.a(clr.oj, ml.bv);
      this.a(clr.ok, ml.bv);
      this.a(clr.ub, ml.bv);
      this.a(clr.rT, ml.bv);
      this.a(clr.qB, ml.bv);
      this.a(clr.nL, ml.bv);
      this.a(clr.vR, ml.bv);
      this.a(clr.po, ml.bv);
      this.a(clr.vG, ml.bv);
      this.a(clr.vA, ml.bw);
      this.a(clr.vq, ml.bw);
      this.a(clr.vs, ml.bw);
      this.a(clr.vr, ml.bw);
      this.a(clr.vt, ml.bw);
      this.a(clr.vu, ml.bw);
      this.a(clr.vv, ml.bw);
      this.a(clr.vw, ml.bw);
      this.a(clr.vF, ml.bw);
      this.a(clr.vx, ml.bw);
      this.a(clr.vy, ml.bw);
      this.a(clr.vB, ml.bw);
      this.a(clr.vz, ml.bw);
      this.a(clr.vC, ml.bw);
      this.a(clr.vD, ml.bw);
      this.a(clr.vE, ml.bw);
      this.a(clr.uF, ml.bv);
      this.a(clr.uD, ml.bv);
      this.a(clr.vJ, ml.bv);
      this.a(clr.pk, ml.bx);
      this.a(clr.pl, ml.bx);
      this.a(clr.oG, ml.bv);
      this.a(clr.pj, ml.bx);
      this.a(clr.oH, ml.bv);
      this.a(clr.pi, ml.bx);
      this.a(clr.ph, ml.bx);
      this.a(clr.up, ml.bv);
      this.a(clr.uk, ml.bv);
      this.a(clr.nT, ml.bv);
      this.a(clr.nU, ml.bv);
      this.a(clr.rg, ml.bv);
      this.a(clr.pW, ml.bv);
      this.a(clr.qL, ml.bv);
      this.a(clr.vI, ml.bv);
      this.a(clr.vT, ml.bv);
      this.a(clr.rl, ml.bv);
      this.a(clr.ua, ml.bv);
      this.a(clr.uZ, ml.bv);
      this.a(clr.pU, ml.bv);
      this.a(clr.qy, ml.bv);
      this.a(clr.ur, ml.bv);
      this.a(clr.uq, ml.bv);
      this.a(clr.qZ, ml.bv);
      this.a(clr.qC, ml.bv);
      this.a(clr.ul, ml.bv);
      this.a(clr.rp, ml.bv);
      this.a(clr.oy, ml.bv);
      this.a(clr.us, ml.bv);
      this.a(clr.uv, ml.bv);
      this.a(clr.uw, ml.bv);
      this.a(clr.uu, ml.bv);
      this.a(clr.rt, ml.bv);
      this.a(clr.sb, ml.bv);
      this.a(clr.nK, ml.bv);
      this.a(clr.qX, ml.bv);
      this.a(clr.qD, ml.bv);
      this.a(clr.oo, ml.bv);
      this.a(clr.rS, ml.bv);
      this.a(clr.vm, ml.bv);
      this.a(clr.vQ, ml.bv);
      this.a(clr.qN, ml.bv);
      this.a(clr.qz, ml.bv);
      this.a(clr.xg, ml.bv);
      this.a(clr.vh, ml.bv);
      this.a(clr.sj, ml.bv);
      this.a(clr.nV, ml.bv);
      this.a(clr.nW, ml.bv);
      this.a(clr.qU, ml.bv);
      this.a(clr.pm, ml.bx);
      this.a(clr.oQ, ml.bx);
      this.a(clr.oR, ml.bx);
      this.a(clr.oP, ml.bx);
      this.a(clr.oO, ml.bx);
      this.a(clr.oN, ml.bx);
      this.a(clr.rx, ml.bv);
      this.a(clr.vM, ml.bv);
      this.a(clr.nO, ml.bv);
      this.a(clr.vl, ml.bv);
      this.a(clr.vH, ml.bv);
      this.a(clr.qY, ml.bv);
      this.a(clr.qF, ml.bv);
      this.a(clr.qG, ml.bv);
      this.a(clr.qH, ml.bv);
      this.a(clr.qw, ml.bv);
      this.a(clr.pt, ml.bv);
      this.a(clr.rf, ml.bv);
      this.a(clr.oL, ml.bx);
      this.a(clr.oM, ml.bx);
      this.a(clr.oK, ml.bx);
      this.a(clr.oJ, ml.bx);
      this.a(clr.oI, ml.bx);
      this.a(clr.tS, ml.bv);
      this.a(clr.tT, ml.bv);
      this.a(clr.rj, ml.bv);
      this.a(clr.xi, ml.bv);
      this.a(clr.xj, ml.bv);
      this.a(clr.xk, ml.bv);
      this.a(clr.xl, ml.bv);
      this.a(clr.xm, ml.bv);
      this.a(clr.xn, ml.bv);
      this.a(clr.xo, ml.bv);
      this.a(clr.xp, ml.bv);
      this.a(clr.xq, ml.bv);
      this.a(clr.xr, ml.bv);
      this.a(clr.xs, ml.bv);
      this.a(clr.xt, ml.bv);
      this.a(clr.xu, ml.bv);
      this.a(clr.xv, ml.bv);
      this.a(clr.xw, ml.bv);
      this.a(clr.xx, ml.bv);
      this.a(clr.xy, ml.bv);
      this.a(clr.vp, clr.pm, ml.bx);
      this.a(clr.pY, clr.pX, ml.bv);

      for (clj $$0 : kc.i) {
         if ($$0 instanceof ciy $$1) {
            this.a($$1);
         }
      }

      this.a(clr.xz, ml.bv);
      this.a(clr.xA, ml.bv);
      this.a(clr.xB, ml.bv);
      this.a(clr.xC, ml.bv);
      this.a(clr.xD, ml.bv);
      this.a(clr.xE, ml.bv);
      this.a(clr.xF, ml.bv);
      this.a(clr.xG, ml.bv);
      this.a(clr.xH, ml.bv);
      this.a(clr.xI, ml.bv);
      this.a(clr.xJ, ml.bv);
      this.a(clr.xK, ml.bv);
      this.a(clr.xL, ml.bv);
      this.a(clr.xM, ml.bv);
      this.a(clr.xN, ml.bv);
      this.a(clr.xO, ml.bv);
      this.a(clr.xP, ml.bv);
      this.a(clr.xQ, ml.bv);
      this.a(clr.xR, ml.bv);
      this.a(clr.xS, ml.bv);
   }

   static record a(String a, float b, Map<ciz, String> c) {
      public String a(ciz $$0) {
         return this.c.getOrDefault($$0, this.a);
      }
   }
}
