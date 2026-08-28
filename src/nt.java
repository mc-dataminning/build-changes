import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Supplier;

public class nt {
   public static final ale a = ale.b("trim_type");
   private static final List<nt.a> b = List.of(
      new nt.a("quartz", 0.1F, Map.of()),
      new nt.a("iron", 0.2F, Map.of(ctn.j, "iron_darker")),
      new nt.a("netherite", 0.3F, Map.of(ctn.n, "netherite_darker")),
      new nt.a("redstone", 0.4F, Map.of()),
      new nt.a("copper", 0.5F, Map.of()),
      new nt.a("gold", 0.6F, Map.of(ctn.k, "gold_darker")),
      new nt.a("emerald", 0.7F, Map.of()),
      new nt.a("diamond", 0.8F, Map.of(ctn.l, "diamond_darker")),
      new nt.a("lapis", 0.9F, Map.of()),
      new nt.a("amethyst", 1.0F, Map.of())
   );
   private final BiConsumer<ale, Supplier<JsonElement>> c;

   public nt(BiConsumer<ale, Supplier<JsonElement>> $$0) {
      this.c = $$0;
   }

   private void a(cvn $$0, oh $$1) {
      $$1.a(og.a($$0), oj.b($$0), this.c);
   }

   private void a(cvn $$0, String $$1, oh $$2) {
      $$2.a(og.a($$0, $$1), oj.k(oj.a($$0, $$1)), this.c);
   }

   private void a(cvn $$0, cvn $$1, oh $$2) {
      $$2.a(og.a($$0), oj.b($$1), this.c);
   }

   private void a(cvn $$0) {
      this.a(og.a($$0), oj.c($$0), oj.a($$0, "_overlay"));
   }

   private void b(cvn $$0) {
      for (int $$1 = 0; $$1 < 32; $$1++) {
         if ($$1 != 16) {
            this.a($$0, String.format(Locale.ROOT, "_%02d", $$1), oi.bz);
         }
      }
   }

   private void c(cvn $$0) {
      for (int $$1 = 1; $$1 < 64; $$1++) {
         this.a($$0, String.format(Locale.ROOT, "_%02d", $$1), oi.bz);
      }
   }

   private void a(ale $$0, ale $$1, ale $$2) {
      oi.bD.a($$0, oj.c($$1, $$2), this.c);
   }

   private void a(ale $$0, ale $$1, ale $$2, ale $$3) {
      oi.bE.a($$0, oj.a($$1, $$2, $$3), this.c);
   }

   private ale a(ale $$0, String $$1) {
      return $$0.g("_" + $$1 + "_trim");
   }

   private JsonObject a(ale $$0, Map<ok, ale> $$1, jo<ctm> $$2) {
      JsonObject $$3 = oi.bD.a($$0, $$1);
      JsonArray $$4 = new JsonArray();

      for (nt.a $$5 : b) {
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

   private void a(ctl $$0) {
      if ($$0.f().d()) {
         ale $$1 = og.a($$0);
         ale $$2 = oj.c($$0);
         ale $$3 = oj.a($$0, "_overlay");
         if ($$0.g().a(ctn.h)) {
            oi.bD.a($$1, oj.c($$2, $$3), this.c, ($$1x, $$2x) -> this.a($$1x, $$2x, $$0.g()));
         } else {
            oi.bz.a($$1, oj.k($$2), this.c, ($$1x, $$2x) -> this.a($$1x, $$2x, $$0.g()));
         }

         for (nt.a $$4 : b) {
            String $$5 = $$4.a($$0.g());
            ale $$6 = this.a($$1, $$5);
            String $$7 = $$0.f().b() + "_trim_" + $$5;
            ale $$8 = ale.b($$7).f("trims/items/");
            if ($$0.g().a(ctn.h)) {
               this.a($$6, $$2, $$3, $$8);
            } else {
               this.a($$6, $$2, $$8);
            }
         }
      }
   }

   public void a() {
      this.a(cvw.od, oi.bz);
      this.a(cvw.of, oi.bz);
      this.a(cvw.oe, oi.bz);
      this.a(cvw.og, oi.bz);
      this.a(cvw.oE, oi.bz);
      this.a(cvw.ov, oi.bz);
      this.a(cvw.or, oi.bz);
      this.a(cvw.uH, oi.bz);
      this.a(cvw.ox, oi.bz);
      this.a(cvw.uj, oi.bz);
      this.a(cvw.dR, oi.bB);
      this.a(cvw.sb, oi.bz);
      this.a(cvw.vm, oi.bz);
      this.a(cvw.vo, oi.bz);
      this.a(cvw.nZ, oi.bz);
      this.a(cvw.oa, oi.bz);
      this.a(cvw.ry, oi.bz);
      this.a(cvw.sp, oi.bz);
      this.a(cvw.sh, oi.bB);
      this.a(cvw.ru, oi.bz);
      this.a(cvw.rz, oi.bz);
      this.a(cvw.wj, oi.bz);
      this.a(cvw.qQ, oi.bz);
      this.a(cvw.ou, oi.bz);
      this.a(cvw.py, oi.bz);
      this.a(cvw.qM, oi.bz);
      this.a(cvw.uc, oi.bB);
      this.a(cvw.rv, oi.bz);
      this.a(cvw.qz, oi.bz);
      this.a(cvw.nR, oi.bC);
      this.a(cvw.nS, oi.bC);
      this.a(cvw.oz, oi.bz);
      this.a(cvw.nN, oi.bz);
      this.a(cvw.sd, oi.bz);
      this.a(cvw.vi, oi.bz);
      this.a(cvw.qN, oi.bz);
      this.c(cvw.qX);
      this.a(cvw.oy, oi.bz);
      this.a(cvw.qI, oi.bz);
      this.a(cvw.uO, oi.bz);
      this.b(cvw.qT);
      this.b(cvw.qU);
      this.a(cvw.sc, oi.bz);
      this.a(cvw.se, oi.bz);
      this.a(cvw.re, oi.bz);
      this.a(cvw.uQ, oi.bz);
      this.a(cvw.pZ, oi.bz);
      this.a(cvw.uD, oi.bz);
      this.a(cvw.rf, oi.bz);
      this.a(cvw.rT, oi.bz);
      this.a(cvw.oH, oi.bz);
      this.a(cvw.oI, oi.bz);
      this.a(cvw.wb, oi.bz);
      this.a(cvw.rs, oi.bz);
      this.a(cvw.oh, oi.bz);
      this.a(cvw.oi, oi.bz);
      this.a(cvw.oA, oi.bz);
      this.a(cvw.pk, oi.bB);
      this.a(cvw.pl, oi.bB);
      this.a(cvw.uK, oi.bz);
      this.a(cvw.pj, oi.bB);
      this.a(cvw.pi, oi.bB);
      this.a(cvw.ph, oi.bB);
      this.a(cvw.vp, oi.bz);
      this.a(cvw.rY, oi.bz);
      this.a(cvw.qS, oi.bz);
      this.a(cvw.oB, oi.bz);
      this.a(cvw.uy, oi.bz);
      this.a(cvw.st, oi.bz);
      this.a(cvw.sg, oi.bz);
      this.a(cvw.vh, oi.bz);
      this.a(cvw.tX, oi.bz);
      this.a(cvw.so, oi.bz);
      this.a(cvw.wi, oi.bz);
      this.a(cvw.uw, oi.bz);
      this.a(cvw.tY, oi.bz);
      this.a(cvw.pX, oi.bz);
      this.a(cvw.ot, oi.bz);
      this.a(cvw.wg, oi.bz);
      this.a(cvw.wa, oi.bz);
      this.a(cvw.nO, oi.bz);
      this.a(cvw.si, oi.bz);
      this.a(cvw.sl, oi.bz);
      this.a(cvw.su, oi.bz);
      this.a(cvw.we, oi.bz);
      this.a(cvw.wy, oi.bz);
      this.a(cvw.qZ, oi.bz);
      this.a(cvw.rh, oi.bz);
      this.a(cvw.uf, oi.bz);
      this.a(cvw.oJ, oi.bz);
      this.a(cvw.qb, oi.bz);
      this.a(cvw.pa, oi.bB);
      this.a(cvw.um, oi.bz);
      this.a(cvw.pb, oi.bB);
      this.a(cvw.uJ, oi.bz);
      this.a(cvw.oZ, oi.bB);
      this.a(cvw.oY, oi.bB);
      this.a(cvw.oX, oi.bB);
      this.a(cvw.oK, oi.bz);
      this.a(cvw.sj, oi.bz);
      this.a(cvw.rq, oi.bz);
      this.a(cvw.rw, oi.bz);
      this.a(cvw.pv, oi.bz);
      this.a(cvw.wh, oi.bz);
      this.a(cvw.vW, oi.bz);
      this.a(cvw.wC, oi.bz);
      this.a(cvw.wF, oi.bz);
      this.a(cvw.nQ, oi.bz);
      this.a(cvw.rg, oi.bz);
      this.a(cvw.oF, oi.bz);
      this.a(cvw.pf, oi.bB);
      this.a(cvw.pg, oi.bB);
      this.a(cvw.uI, oi.bz);
      this.a(cvw.oG, oi.bz);
      this.a(cvw.vx, oi.bz);
      this.a(cvw.pe, oi.bB);
      this.a(cvw.pd, oi.bB);
      this.a(cvw.pc, oi.bB);
      this.a(cvw.ue, oi.bz);
      this.a(cvw.ob, oi.bz);
      this.a(cvw.oc, oi.bz);
      this.a(cvw.vy, oi.bz);
      this.a(cvw.oC, oi.bz);
      this.a(cvw.qB, oi.bz);
      this.a(cvw.qE, oi.bz);
      this.a(cvw.uL, oi.bz);
      this.a(cvw.rm, oi.bz);
      this.a(cvw.rr, oi.bz);
      this.a(cvw.ro, oi.bz);
      this.a(cvw.rl, oi.bz);
      this.a(cvw.sq, oi.bz);
      this.a(cvw.oj, oi.bz);
      this.a(cvw.ok, oi.bz);
      this.a(cvw.ol, oi.bz);
      this.a(cvw.om, oi.bz);
      this.a(cvw.ul, oi.bz);
      this.a(cvw.rX, oi.bz);
      this.a(cvw.qF, oi.bz);
      this.a(cvw.nM, oi.bz);
      this.a(cvw.wd, oi.bz);
      this.a(cvw.ps, oi.bz);
      this.a(cvw.vT, oi.bz);
      this.a(cvw.vM, oi.bA);
      this.a(cvw.vA, oi.bA);
      this.a(cvw.vC, oi.bA);
      this.a(cvw.vB, oi.bA);
      this.a(cvw.vD, oi.bA);
      this.a(cvw.vE, oi.bA);
      this.a(cvw.vF, oi.bA);
      this.a(cvw.vG, oi.bA);
      this.a(cvw.vH, oi.bA);
      this.a(cvw.vI, oi.bA);
      this.a(cvw.vR, oi.bA);
      this.a(cvw.vS, oi.bA);
      this.a(cvw.vJ, oi.bA);
      this.a(cvw.vK, oi.bA);
      this.a(cvw.vN, oi.bA);
      this.a(cvw.vL, oi.bA);
      this.a(cvw.vO, oi.bA);
      this.a(cvw.vP, oi.bA);
      this.a(cvw.vQ, oi.bA);
      this.a(cvw.uP, oi.bz);
      this.a(cvw.uN, oi.bz);
      this.a(cvw.vV, oi.bz);
      this.a(cvw.pp, oi.bB);
      this.a(cvw.pq, oi.bB);
      this.a(cvw.oL, oi.bz);
      this.a(cvw.po, oi.bB);
      this.a(cvw.oM, oi.bz);
      this.a(cvw.pn, oi.bB);
      this.a(cvw.pm, oi.bB);
      this.a(cvw.uz, oi.bz);
      this.a(cvw.uu, oi.bz);
      this.a(cvw.nV, oi.bz);
      this.a(cvw.nW, oi.bz);
      this.a(cvw.rk, oi.bz);
      this.a(cvw.qa, oi.bz);
      this.a(cvw.qP, oi.bz);
      this.a(cvw.nT, oi.bz);
      this.a(cvw.wf, oi.bz);
      this.a(cvw.rp, oi.bz);
      this.a(cvw.uk, oi.bz);
      this.a(cvw.vj, oi.bz);
      this.a(cvw.pY, oi.bz);
      this.a(cvw.qC, oi.bz);
      this.a(cvw.uB, oi.bz);
      this.a(cvw.uA, oi.bz);
      this.a(cvw.rd, oi.bz);
      this.a(cvw.qG, oi.bz);
      this.a(cvw.uv, oi.bz);
      this.a(cvw.rt, oi.bz);
      this.a(cvw.oD, oi.bz);
      this.a(cvw.uC, oi.bz);
      this.a(cvw.uF, oi.bz);
      this.a(cvw.uG, oi.bz);
      this.a(cvw.uE, oi.bz);
      this.a(cvw.rx, oi.bz);
      this.a(cvw.sf, oi.bz);
      this.a(cvw.nL, oi.bz);
      this.a(cvw.rb, oi.bz);
      this.a(cvw.qH, oi.bz);
      this.a(cvw.oq, oi.bz);
      this.a(cvw.rW, oi.bz);
      this.a(cvw.vw, oi.bz);
      this.a(cvw.wc, oi.bz);
      this.a(cvw.qR, oi.bz);
      this.a(cvw.qD, oi.bz);
      this.a(cvw.xw, oi.bz);
      this.a(cvw.vr, oi.bz);
      this.a(cvw.sn, oi.bz);
      this.a(cvw.nX, oi.bz);
      this.a(cvw.nY, oi.bz);
      this.a(cvw.qY, oi.bz);
      this.a(cvw.pr, oi.bB);
      this.a(cvw.oV, oi.bB);
      this.a(cvw.oW, oi.bB);
      this.a(cvw.oU, oi.bB);
      this.a(cvw.oT, oi.bB);
      this.a(cvw.oS, oi.bB);
      this.a(cvw.rB, oi.bz);
      this.a(cvw.vY, oi.bz);
      this.a(cvw.nP, oi.bz);
      this.a(cvw.vv, oi.bz);
      this.a(cvw.vU, oi.bz);
      this.a(cvw.rc, oi.bz);
      this.a(cvw.qJ, oi.bz);
      this.a(cvw.qK, oi.bz);
      this.a(cvw.qL, oi.bz);
      this.a(cvw.qA, oi.bz);
      this.a(cvw.px, oi.bz);
      this.a(cvw.rj, oi.bz);
      this.a(cvw.tZ, oi.bz);
      this.a(cvw.ud, oi.bQ);
      this.a(cvw.os);
      this.a(cvw.oQ, oi.bB);
      this.a(cvw.oR, oi.bB);
      this.a(cvw.oP, oi.bB);
      this.a(cvw.oO, oi.bB);
      this.a(cvw.oN, oi.bB);
      this.a(cvw.ua, oi.bz);
      this.a(cvw.ub, oi.bz);
      this.a(cvw.rn, oi.bz);
      this.a(cvw.xy, oi.bz);
      this.a(cvw.xz, oi.bz);
      this.a(cvw.xA, oi.bz);
      this.a(cvw.xB, oi.bz);
      this.a(cvw.xC, oi.bz);
      this.a(cvw.xD, oi.bz);
      this.a(cvw.xE, oi.bz);
      this.a(cvw.xF, oi.bz);
      this.a(cvw.xG, oi.bz);
      this.a(cvw.xH, oi.bz);
      this.a(cvw.xI, oi.bz);
      this.a(cvw.xJ, oi.bz);
      this.a(cvw.xK, oi.bz);
      this.a(cvw.xL, oi.bz);
      this.a(cvw.xM, oi.bz);
      this.a(cvw.xN, oi.bz);
      this.a(cvw.xO, oi.bz);
      this.a(cvw.xP, oi.bz);
      this.a(cvw.xQ, oi.bz);
      this.a(cvw.vz, cvw.pr, oi.bB);
      this.a(cvw.qc, cvw.qb, oi.bz);

      for (cvn $$0 : lv.g) {
         if ($$0 instanceof ctl $$1) {
            this.a($$1);
         }
      }

      this.a(cvw.xR, oi.bz);
      this.a(cvw.xS, oi.bz);
      this.a(cvw.xT, oi.bz);
      this.a(cvw.xU, oi.bz);
      this.a(cvw.xV, oi.bz);
      this.a(cvw.xW, oi.bz);
      this.a(cvw.xX, oi.bz);
      this.a(cvw.xY, oi.bz);
      this.a(cvw.xZ, oi.bz);
      this.a(cvw.ya, oi.bz);
      this.a(cvw.yb, oi.bz);
      this.a(cvw.yc, oi.bz);
      this.a(cvw.yd, oi.bz);
      this.a(cvw.ye, oi.bz);
      this.a(cvw.yf, oi.bz);
      this.a(cvw.yg, oi.bz);
      this.a(cvw.yh, oi.bz);
      this.a(cvw.yi, oi.bz);
      this.a(cvw.yj, oi.bz);
      this.a(cvw.yk, oi.bz);
      this.a(cvw.yl, oi.bz);
      this.a(cvw.ym, oi.bz);
      this.a(cvw.yn, oi.bz);
      this.a(cvw.yF, oi.bz);
      this.a(cvw.yG, oi.bz);
      this.a(cvw.yI, oi.bz);
      this.a(cvw.qV, oi.bz);
   }

   static record a(String a, float b, Map<jo<ctm>, String> c) {
      public String a(jo<ctm> $$0) {
         return this.c.getOrDefault($$0, this.a);
      }
   }
}
