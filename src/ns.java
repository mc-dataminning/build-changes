import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Supplier;

public class ns {
   public static final alb a = alb.b("trim_type");
   private static final List<ns.a> b = List.of(
      new ns.a("quartz", 0.1F, Map.of()),
      new ns.a("iron", 0.2F, Map.of(cte.c, "iron_darker")),
      new ns.a("netherite", 0.3F, Map.of(cte.g, "netherite_darker")),
      new ns.a("redstone", 0.4F, Map.of()),
      new ns.a("copper", 0.5F, Map.of()),
      new ns.a("gold", 0.6F, Map.of(cte.d, "gold_darker")),
      new ns.a("emerald", 0.7F, Map.of()),
      new ns.a("diamond", 0.8F, Map.of(cte.e, "diamond_darker")),
      new ns.a("lapis", 0.9F, Map.of()),
      new ns.a("amethyst", 1.0F, Map.of())
   );
   private final BiConsumer<alb, Supplier<JsonElement>> c;

   public ns(BiConsumer<alb, Supplier<JsonElement>> $$0) {
      this.c = $$0;
   }

   private void a(cvg $$0, og $$1) {
      $$1.a(of.a($$0), oi.b($$0), this.c);
   }

   private void a(cvg $$0, String $$1, og $$2) {
      $$2.a(of.a($$0, $$1), oi.k(oi.a($$0, $$1)), this.c);
   }

   private void a(cvg $$0, cvg $$1, og $$2) {
      $$2.a(of.a($$0), oi.b($$1), this.c);
   }

   private void a(cvg $$0) {
      this.a(of.a($$0), oi.c($$0), oi.a($$0, "_overlay"));
   }

   private void b(cvg $$0) {
      for (int $$1 = 0; $$1 < 32; $$1++) {
         if ($$1 != 16) {
            this.a($$0, String.format(Locale.ROOT, "_%02d", $$1), oh.bz);
         }
      }
   }

   private void c(cvg $$0) {
      for (int $$1 = 1; $$1 < 64; $$1++) {
         this.a($$0, String.format(Locale.ROOT, "_%02d", $$1), oh.bz);
      }
   }

   private void a(alb $$0, alb $$1, alb $$2) {
      oh.bD.a($$0, oi.c($$1, $$2), this.c);
   }

   private void a(alb $$0, alb $$1, alb $$2, alb $$3) {
      oh.bE.a($$0, oi.a($$1, $$2, $$3), this.c);
   }

   private alb a(alb $$0, String $$1) {
      return $$0.g("_" + $$1 + "_trim");
   }

   private JsonObject a(alb $$0, Map<oj, alb> $$1, jn<ctd> $$2) {
      JsonObject $$3 = oh.bD.a($$0, $$1);
      JsonArray $$4 = new JsonArray();

      for (ns.a $$5 : b) {
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

   private void a(ctc $$0) {
      if ($$0.f().d()) {
         alb $$1 = of.a($$0);
         alb $$2 = oi.c($$0);
         alb $$3 = oi.a($$0, "_overlay");
         if ($$0.h().a(cte.a)) {
            oh.bD.a($$1, oi.c($$2, $$3), this.c, ($$1x, $$2x) -> this.a($$1x, $$2x, $$0.h()));
         } else {
            oh.bz.a($$1, oi.k($$2), this.c, ($$1x, $$2x) -> this.a($$1x, $$2x, $$0.h()));
         }

         for (ns.a $$4 : b) {
            String $$5 = $$4.a($$0.h());
            alb $$6 = this.a($$1, $$5);
            String $$7 = $$0.f().b() + "_trim_" + $$5;
            alb $$8 = alb.b($$7).f("trims/items/");
            if ($$0.h().a(cte.a)) {
               this.a($$6, $$2, $$3, $$8);
            } else {
               this.a($$6, $$2, $$8);
            }
         }
      }
   }

   public void a() {
      this.a(cvo.od, oh.bz);
      this.a(cvo.of, oh.bz);
      this.a(cvo.oe, oh.bz);
      this.a(cvo.og, oh.bz);
      this.a(cvo.oE, oh.bz);
      this.a(cvo.ov, oh.bz);
      this.a(cvo.or, oh.bz);
      this.a(cvo.uH, oh.bz);
      this.a(cvo.ox, oh.bz);
      this.a(cvo.uj, oh.bz);
      this.a(cvo.dR, oh.bB);
      this.a(cvo.sb, oh.bz);
      this.a(cvo.vm, oh.bz);
      this.a(cvo.vo, oh.bz);
      this.a(cvo.nZ, oh.bz);
      this.a(cvo.oa, oh.bz);
      this.a(cvo.ry, oh.bz);
      this.a(cvo.sp, oh.bz);
      this.a(cvo.sh, oh.bB);
      this.a(cvo.ru, oh.bz);
      this.a(cvo.rz, oh.bz);
      this.a(cvo.wj, oh.bz);
      this.a(cvo.qQ, oh.bz);
      this.a(cvo.ou, oh.bz);
      this.a(cvo.py, oh.bz);
      this.a(cvo.qM, oh.bz);
      this.a(cvo.uc, oh.bB);
      this.a(cvo.rv, oh.bz);
      this.a(cvo.qz, oh.bz);
      this.a(cvo.nR, oh.bC);
      this.a(cvo.nS, oh.bC);
      this.a(cvo.oz, oh.bz);
      this.a(cvo.nN, oh.bz);
      this.a(cvo.sd, oh.bz);
      this.a(cvo.vi, oh.bz);
      this.a(cvo.qN, oh.bz);
      this.c(cvo.qX);
      this.a(cvo.oy, oh.bz);
      this.a(cvo.qI, oh.bz);
      this.a(cvo.uO, oh.bz);
      this.b(cvo.qT);
      this.b(cvo.qU);
      this.a(cvo.sc, oh.bz);
      this.a(cvo.se, oh.bz);
      this.a(cvo.re, oh.bz);
      this.a(cvo.uQ, oh.bz);
      this.a(cvo.pZ, oh.bz);
      this.a(cvo.uD, oh.bz);
      this.a(cvo.rf, oh.bz);
      this.a(cvo.rT, oh.bz);
      this.a(cvo.oH, oh.bz);
      this.a(cvo.oI, oh.bz);
      this.a(cvo.wb, oh.bz);
      this.a(cvo.rs, oh.bz);
      this.a(cvo.oh, oh.bz);
      this.a(cvo.oi, oh.bz);
      this.a(cvo.oA, oh.bz);
      this.a(cvo.pk, oh.bB);
      this.a(cvo.pl, oh.bB);
      this.a(cvo.uK, oh.bz);
      this.a(cvo.pj, oh.bB);
      this.a(cvo.pi, oh.bB);
      this.a(cvo.ph, oh.bB);
      this.a(cvo.vp, oh.bz);
      this.a(cvo.rY, oh.bz);
      this.a(cvo.qS, oh.bz);
      this.a(cvo.oB, oh.bz);
      this.a(cvo.uy, oh.bz);
      this.a(cvo.st, oh.bz);
      this.a(cvo.sg, oh.bz);
      this.a(cvo.vh, oh.bz);
      this.a(cvo.tX, oh.bz);
      this.a(cvo.so, oh.bz);
      this.a(cvo.wi, oh.bz);
      this.a(cvo.uw, oh.bz);
      this.a(cvo.tY, oh.bz);
      this.a(cvo.pX, oh.bz);
      this.a(cvo.ot, oh.bz);
      this.a(cvo.wg, oh.bz);
      this.a(cvo.wa, oh.bz);
      this.a(cvo.nO, oh.bz);
      this.a(cvo.si, oh.bz);
      this.a(cvo.sm, oh.bz);
      this.a(cvo.su, oh.bz);
      this.a(cvo.we, oh.bz);
      this.a(cvo.wy, oh.bz);
      this.a(cvo.qZ, oh.bz);
      this.a(cvo.rh, oh.bz);
      this.a(cvo.uf, oh.bz);
      this.a(cvo.oJ, oh.bz);
      this.a(cvo.qb, oh.bz);
      this.a(cvo.pa, oh.bB);
      this.a(cvo.um, oh.bz);
      this.a(cvo.pb, oh.bB);
      this.a(cvo.uJ, oh.bz);
      this.a(cvo.oZ, oh.bB);
      this.a(cvo.oY, oh.bB);
      this.a(cvo.oX, oh.bB);
      this.a(cvo.oK, oh.bz);
      this.a(cvo.sj, oh.bz);
      this.a(cvo.rq, oh.bz);
      this.a(cvo.rw, oh.bz);
      this.a(cvo.pv, oh.bz);
      this.a(cvo.wh, oh.bz);
      this.a(cvo.vW, oh.bz);
      this.a(cvo.wC, oh.bz);
      this.a(cvo.wF, oh.bz);
      this.a(cvo.nQ, oh.bz);
      this.a(cvo.rg, oh.bz);
      this.a(cvo.oF, oh.bz);
      this.a(cvo.pf, oh.bB);
      this.a(cvo.pg, oh.bB);
      this.a(cvo.uI, oh.bz);
      this.a(cvo.oG, oh.bz);
      this.a(cvo.vx, oh.bz);
      this.a(cvo.pe, oh.bB);
      this.a(cvo.pd, oh.bB);
      this.a(cvo.pc, oh.bB);
      this.a(cvo.ue, oh.bz);
      this.a(cvo.ob, oh.bz);
      this.a(cvo.oc, oh.bz);
      this.a(cvo.vy, oh.bz);
      this.a(cvo.oC, oh.bz);
      this.a(cvo.qB, oh.bz);
      this.a(cvo.qE, oh.bz);
      this.a(cvo.uL, oh.bz);
      this.a(cvo.rm, oh.bz);
      this.a(cvo.rr, oh.bz);
      this.a(cvo.ro, oh.bz);
      this.a(cvo.rl, oh.bz);
      this.a(cvo.sq, oh.bz);
      this.a(cvo.oj, oh.bz);
      this.a(cvo.ok, oh.bz);
      this.a(cvo.ol, oh.bz);
      this.a(cvo.om, oh.bz);
      this.a(cvo.ul, oh.bz);
      this.a(cvo.rX, oh.bz);
      this.a(cvo.qF, oh.bz);
      this.a(cvo.nM, oh.bz);
      this.a(cvo.wd, oh.bz);
      this.a(cvo.ps, oh.bz);
      this.a(cvo.vT, oh.bz);
      this.a(cvo.vM, oh.bA);
      this.a(cvo.vA, oh.bA);
      this.a(cvo.vC, oh.bA);
      this.a(cvo.vB, oh.bA);
      this.a(cvo.vD, oh.bA);
      this.a(cvo.vE, oh.bA);
      this.a(cvo.vF, oh.bA);
      this.a(cvo.vG, oh.bA);
      this.a(cvo.vH, oh.bA);
      this.a(cvo.vI, oh.bA);
      this.a(cvo.vR, oh.bA);
      this.a(cvo.vS, oh.bA);
      this.a(cvo.vJ, oh.bA);
      this.a(cvo.vK, oh.bA);
      this.a(cvo.vN, oh.bA);
      this.a(cvo.vL, oh.bA);
      this.a(cvo.vO, oh.bA);
      this.a(cvo.vP, oh.bA);
      this.a(cvo.vQ, oh.bA);
      this.a(cvo.uP, oh.bz);
      this.a(cvo.uN, oh.bz);
      this.a(cvo.vV, oh.bz);
      this.a(cvo.pp, oh.bB);
      this.a(cvo.pq, oh.bB);
      this.a(cvo.oL, oh.bz);
      this.a(cvo.po, oh.bB);
      this.a(cvo.oM, oh.bz);
      this.a(cvo.pn, oh.bB);
      this.a(cvo.pm, oh.bB);
      this.a(cvo.uz, oh.bz);
      this.a(cvo.uu, oh.bz);
      this.a(cvo.nV, oh.bz);
      this.a(cvo.nW, oh.bz);
      this.a(cvo.rk, oh.bz);
      this.a(cvo.qa, oh.bz);
      this.a(cvo.qP, oh.bz);
      this.a(cvo.nT, oh.bz);
      this.a(cvo.wf, oh.bz);
      this.a(cvo.rp, oh.bz);
      this.a(cvo.uk, oh.bz);
      this.a(cvo.vj, oh.bz);
      this.a(cvo.pY, oh.bz);
      this.a(cvo.qC, oh.bz);
      this.a(cvo.uB, oh.bz);
      this.a(cvo.uA, oh.bz);
      this.a(cvo.rd, oh.bz);
      this.a(cvo.qG, oh.bz);
      this.a(cvo.uv, oh.bz);
      this.a(cvo.rt, oh.bz);
      this.a(cvo.oD, oh.bz);
      this.a(cvo.uC, oh.bz);
      this.a(cvo.uF, oh.bz);
      this.a(cvo.uG, oh.bz);
      this.a(cvo.uE, oh.bz);
      this.a(cvo.rx, oh.bz);
      this.a(cvo.sf, oh.bz);
      this.a(cvo.nL, oh.bz);
      this.a(cvo.rb, oh.bz);
      this.a(cvo.qH, oh.bz);
      this.a(cvo.oq, oh.bz);
      this.a(cvo.rW, oh.bz);
      this.a(cvo.vw, oh.bz);
      this.a(cvo.wc, oh.bz);
      this.a(cvo.qR, oh.bz);
      this.a(cvo.qD, oh.bz);
      this.a(cvo.xw, oh.bz);
      this.a(cvo.vr, oh.bz);
      this.a(cvo.sn, oh.bz);
      this.a(cvo.nX, oh.bz);
      this.a(cvo.nY, oh.bz);
      this.a(cvo.qY, oh.bz);
      this.a(cvo.pr, oh.bB);
      this.a(cvo.oV, oh.bB);
      this.a(cvo.oW, oh.bB);
      this.a(cvo.oU, oh.bB);
      this.a(cvo.oT, oh.bB);
      this.a(cvo.oS, oh.bB);
      this.a(cvo.rB, oh.bz);
      this.a(cvo.vY, oh.bz);
      this.a(cvo.nP, oh.bz);
      this.a(cvo.vv, oh.bz);
      this.a(cvo.vU, oh.bz);
      this.a(cvo.rc, oh.bz);
      this.a(cvo.qJ, oh.bz);
      this.a(cvo.qK, oh.bz);
      this.a(cvo.qL, oh.bz);
      this.a(cvo.qA, oh.bz);
      this.a(cvo.px, oh.bz);
      this.a(cvo.rj, oh.bz);
      this.a(cvo.tZ, oh.bz);
      this.a(cvo.ud, oh.bQ);
      this.a(cvo.os);
      this.a(cvo.oQ, oh.bB);
      this.a(cvo.oR, oh.bB);
      this.a(cvo.oP, oh.bB);
      this.a(cvo.oO, oh.bB);
      this.a(cvo.oN, oh.bB);
      this.a(cvo.ua, oh.bz);
      this.a(cvo.ub, oh.bz);
      this.a(cvo.rn, oh.bz);
      this.a(cvo.xy, oh.bz);
      this.a(cvo.xz, oh.bz);
      this.a(cvo.xA, oh.bz);
      this.a(cvo.xB, oh.bz);
      this.a(cvo.xC, oh.bz);
      this.a(cvo.xD, oh.bz);
      this.a(cvo.xE, oh.bz);
      this.a(cvo.xF, oh.bz);
      this.a(cvo.xG, oh.bz);
      this.a(cvo.xH, oh.bz);
      this.a(cvo.xI, oh.bz);
      this.a(cvo.xJ, oh.bz);
      this.a(cvo.xK, oh.bz);
      this.a(cvo.xL, oh.bz);
      this.a(cvo.xM, oh.bz);
      this.a(cvo.xN, oh.bz);
      this.a(cvo.xO, oh.bz);
      this.a(cvo.xP, oh.bz);
      this.a(cvo.xQ, oh.bz);
      this.a(cvo.vz, cvo.pr, oh.bB);
      this.a(cvo.qc, cvo.qb, oh.bz);

      for (cvg $$0 : lu.g) {
         if ($$0 instanceof ctc $$1) {
            this.a($$1);
         }
      }

      this.a(cvo.xR, oh.bz);
      this.a(cvo.xS, oh.bz);
      this.a(cvo.xT, oh.bz);
      this.a(cvo.xU, oh.bz);
      this.a(cvo.xV, oh.bz);
      this.a(cvo.xW, oh.bz);
      this.a(cvo.xX, oh.bz);
      this.a(cvo.xY, oh.bz);
      this.a(cvo.xZ, oh.bz);
      this.a(cvo.ya, oh.bz);
      this.a(cvo.yb, oh.bz);
      this.a(cvo.yc, oh.bz);
      this.a(cvo.yd, oh.bz);
      this.a(cvo.ye, oh.bz);
      this.a(cvo.yf, oh.bz);
      this.a(cvo.yg, oh.bz);
      this.a(cvo.yh, oh.bz);
      this.a(cvo.yi, oh.bz);
      this.a(cvo.yj, oh.bz);
      this.a(cvo.yk, oh.bz);
      this.a(cvo.yl, oh.bz);
      this.a(cvo.ym, oh.bz);
      this.a(cvo.yn, oh.bz);
      this.a(cvo.yF, oh.bz);
      this.a(cvo.yG, oh.bz);
      this.a(cvo.yI, oh.bz);
      this.a(cvo.qV, oh.bz);
   }

   static record a(String a, float b, Map<jn<ctd>, String> c) {
      public String a(jn<ctd> $$0) {
         return this.c.getOrDefault($$0, this.a);
      }
   }
}
