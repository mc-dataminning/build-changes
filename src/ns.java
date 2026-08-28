import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Supplier;

public class ns {
   public static final alc a = alc.b("trim_type");
   private static final List<ns.a> b = List.of(
      new ns.a("quartz", 0.1F, Map.of()),
      new ns.a("iron", 0.2F, Map.of(ctk.j, "iron_darker")),
      new ns.a("netherite", 0.3F, Map.of(ctk.n, "netherite_darker")),
      new ns.a("redstone", 0.4F, Map.of()),
      new ns.a("copper", 0.5F, Map.of()),
      new ns.a("gold", 0.6F, Map.of(ctk.k, "gold_darker")),
      new ns.a("emerald", 0.7F, Map.of()),
      new ns.a("diamond", 0.8F, Map.of(ctk.l, "diamond_darker")),
      new ns.a("lapis", 0.9F, Map.of()),
      new ns.a("amethyst", 1.0F, Map.of())
   );
   private final BiConsumer<alc, Supplier<JsonElement>> c;

   public ns(BiConsumer<alc, Supplier<JsonElement>> $$0) {
      this.c = $$0;
   }

   private void a(cvk $$0, og $$1) {
      $$1.a(of.a($$0), oi.b($$0), this.c);
   }

   private void a(cvk $$0, String $$1, og $$2) {
      $$2.a(of.a($$0, $$1), oi.k(oi.a($$0, $$1)), this.c);
   }

   private void a(cvk $$0, cvk $$1, og $$2) {
      $$2.a(of.a($$0), oi.b($$1), this.c);
   }

   private void a(cvk $$0) {
      this.a(of.a($$0), oi.c($$0), oi.a($$0, "_overlay"));
   }

   private void b(cvk $$0) {
      for (int $$1 = 0; $$1 < 32; $$1++) {
         if ($$1 != 16) {
            this.a($$0, String.format(Locale.ROOT, "_%02d", $$1), oh.bz);
         }
      }
   }

   private void c(cvk $$0) {
      for (int $$1 = 1; $$1 < 64; $$1++) {
         this.a($$0, String.format(Locale.ROOT, "_%02d", $$1), oh.bz);
      }
   }

   private void a(alc $$0, alc $$1, alc $$2) {
      oh.bD.a($$0, oi.c($$1, $$2), this.c);
   }

   private void a(alc $$0, alc $$1, alc $$2, alc $$3) {
      oh.bE.a($$0, oi.a($$1, $$2, $$3), this.c);
   }

   private alc a(alc $$0, String $$1) {
      return $$0.g("_" + $$1 + "_trim");
   }

   private JsonObject a(alc $$0, Map<oj, alc> $$1, jn<ctj> $$2) {
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

   private void a(cti $$0) {
      if ($$0.f().d()) {
         alc $$1 = of.a($$0);
         alc $$2 = oi.c($$0);
         alc $$3 = oi.a($$0, "_overlay");
         if ($$0.g().a(ctk.h)) {
            oh.bD.a($$1, oi.c($$2, $$3), this.c, ($$1x, $$2x) -> this.a($$1x, $$2x, $$0.g()));
         } else {
            oh.bz.a($$1, oi.k($$2), this.c, ($$1x, $$2x) -> this.a($$1x, $$2x, $$0.g()));
         }

         for (ns.a $$4 : b) {
            String $$5 = $$4.a($$0.g());
            alc $$6 = this.a($$1, $$5);
            String $$7 = $$0.f().b() + "_trim_" + $$5;
            alc $$8 = alc.b($$7).f("trims/items/");
            if ($$0.g().a(ctk.h)) {
               this.a($$6, $$2, $$3, $$8);
            } else {
               this.a($$6, $$2, $$8);
            }
         }
      }
   }

   public void a() {
      this.a(cvt.od, oh.bz);
      this.a(cvt.of, oh.bz);
      this.a(cvt.oe, oh.bz);
      this.a(cvt.og, oh.bz);
      this.a(cvt.oE, oh.bz);
      this.a(cvt.ov, oh.bz);
      this.a(cvt.or, oh.bz);
      this.a(cvt.uH, oh.bz);
      this.a(cvt.ox, oh.bz);
      this.a(cvt.uj, oh.bz);
      this.a(cvt.dR, oh.bB);
      this.a(cvt.sb, oh.bz);
      this.a(cvt.vm, oh.bz);
      this.a(cvt.vo, oh.bz);
      this.a(cvt.nZ, oh.bz);
      this.a(cvt.oa, oh.bz);
      this.a(cvt.ry, oh.bz);
      this.a(cvt.sp, oh.bz);
      this.a(cvt.sh, oh.bB);
      this.a(cvt.ru, oh.bz);
      this.a(cvt.rz, oh.bz);
      this.a(cvt.wj, oh.bz);
      this.a(cvt.qQ, oh.bz);
      this.a(cvt.ou, oh.bz);
      this.a(cvt.py, oh.bz);
      this.a(cvt.qM, oh.bz);
      this.a(cvt.uc, oh.bB);
      this.a(cvt.rv, oh.bz);
      this.a(cvt.qz, oh.bz);
      this.a(cvt.nR, oh.bC);
      this.a(cvt.nS, oh.bC);
      this.a(cvt.oz, oh.bz);
      this.a(cvt.nN, oh.bz);
      this.a(cvt.sd, oh.bz);
      this.a(cvt.vi, oh.bz);
      this.a(cvt.qN, oh.bz);
      this.c(cvt.qX);
      this.a(cvt.oy, oh.bz);
      this.a(cvt.qI, oh.bz);
      this.a(cvt.uO, oh.bz);
      this.b(cvt.qT);
      this.b(cvt.qU);
      this.a(cvt.sc, oh.bz);
      this.a(cvt.se, oh.bz);
      this.a(cvt.re, oh.bz);
      this.a(cvt.uQ, oh.bz);
      this.a(cvt.pZ, oh.bz);
      this.a(cvt.uD, oh.bz);
      this.a(cvt.rf, oh.bz);
      this.a(cvt.rT, oh.bz);
      this.a(cvt.oH, oh.bz);
      this.a(cvt.oI, oh.bz);
      this.a(cvt.wb, oh.bz);
      this.a(cvt.rs, oh.bz);
      this.a(cvt.oh, oh.bz);
      this.a(cvt.oi, oh.bz);
      this.a(cvt.oA, oh.bz);
      this.a(cvt.pk, oh.bB);
      this.a(cvt.pl, oh.bB);
      this.a(cvt.uK, oh.bz);
      this.a(cvt.pj, oh.bB);
      this.a(cvt.pi, oh.bB);
      this.a(cvt.ph, oh.bB);
      this.a(cvt.vp, oh.bz);
      this.a(cvt.rY, oh.bz);
      this.a(cvt.qS, oh.bz);
      this.a(cvt.oB, oh.bz);
      this.a(cvt.uy, oh.bz);
      this.a(cvt.st, oh.bz);
      this.a(cvt.sg, oh.bz);
      this.a(cvt.vh, oh.bz);
      this.a(cvt.tX, oh.bz);
      this.a(cvt.so, oh.bz);
      this.a(cvt.wi, oh.bz);
      this.a(cvt.uw, oh.bz);
      this.a(cvt.tY, oh.bz);
      this.a(cvt.pX, oh.bz);
      this.a(cvt.ot, oh.bz);
      this.a(cvt.wg, oh.bz);
      this.a(cvt.wa, oh.bz);
      this.a(cvt.nO, oh.bz);
      this.a(cvt.si, oh.bz);
      this.a(cvt.sl, oh.bz);
      this.a(cvt.su, oh.bz);
      this.a(cvt.we, oh.bz);
      this.a(cvt.wy, oh.bz);
      this.a(cvt.qZ, oh.bz);
      this.a(cvt.rh, oh.bz);
      this.a(cvt.uf, oh.bz);
      this.a(cvt.oJ, oh.bz);
      this.a(cvt.qb, oh.bz);
      this.a(cvt.pa, oh.bB);
      this.a(cvt.um, oh.bz);
      this.a(cvt.pb, oh.bB);
      this.a(cvt.uJ, oh.bz);
      this.a(cvt.oZ, oh.bB);
      this.a(cvt.oY, oh.bB);
      this.a(cvt.oX, oh.bB);
      this.a(cvt.oK, oh.bz);
      this.a(cvt.sj, oh.bz);
      this.a(cvt.rq, oh.bz);
      this.a(cvt.rw, oh.bz);
      this.a(cvt.pv, oh.bz);
      this.a(cvt.wh, oh.bz);
      this.a(cvt.vW, oh.bz);
      this.a(cvt.wC, oh.bz);
      this.a(cvt.wF, oh.bz);
      this.a(cvt.nQ, oh.bz);
      this.a(cvt.rg, oh.bz);
      this.a(cvt.oF, oh.bz);
      this.a(cvt.pf, oh.bB);
      this.a(cvt.pg, oh.bB);
      this.a(cvt.uI, oh.bz);
      this.a(cvt.oG, oh.bz);
      this.a(cvt.vx, oh.bz);
      this.a(cvt.pe, oh.bB);
      this.a(cvt.pd, oh.bB);
      this.a(cvt.pc, oh.bB);
      this.a(cvt.ue, oh.bz);
      this.a(cvt.ob, oh.bz);
      this.a(cvt.oc, oh.bz);
      this.a(cvt.vy, oh.bz);
      this.a(cvt.oC, oh.bz);
      this.a(cvt.qB, oh.bz);
      this.a(cvt.qE, oh.bz);
      this.a(cvt.uL, oh.bz);
      this.a(cvt.rm, oh.bz);
      this.a(cvt.rr, oh.bz);
      this.a(cvt.ro, oh.bz);
      this.a(cvt.rl, oh.bz);
      this.a(cvt.sq, oh.bz);
      this.a(cvt.oj, oh.bz);
      this.a(cvt.ok, oh.bz);
      this.a(cvt.ol, oh.bz);
      this.a(cvt.om, oh.bz);
      this.a(cvt.ul, oh.bz);
      this.a(cvt.rX, oh.bz);
      this.a(cvt.qF, oh.bz);
      this.a(cvt.nM, oh.bz);
      this.a(cvt.wd, oh.bz);
      this.a(cvt.ps, oh.bz);
      this.a(cvt.vT, oh.bz);
      this.a(cvt.vM, oh.bA);
      this.a(cvt.vA, oh.bA);
      this.a(cvt.vC, oh.bA);
      this.a(cvt.vB, oh.bA);
      this.a(cvt.vD, oh.bA);
      this.a(cvt.vE, oh.bA);
      this.a(cvt.vF, oh.bA);
      this.a(cvt.vG, oh.bA);
      this.a(cvt.vH, oh.bA);
      this.a(cvt.vI, oh.bA);
      this.a(cvt.vR, oh.bA);
      this.a(cvt.vS, oh.bA);
      this.a(cvt.vJ, oh.bA);
      this.a(cvt.vK, oh.bA);
      this.a(cvt.vN, oh.bA);
      this.a(cvt.vL, oh.bA);
      this.a(cvt.vO, oh.bA);
      this.a(cvt.vP, oh.bA);
      this.a(cvt.vQ, oh.bA);
      this.a(cvt.uP, oh.bz);
      this.a(cvt.uN, oh.bz);
      this.a(cvt.vV, oh.bz);
      this.a(cvt.pp, oh.bB);
      this.a(cvt.pq, oh.bB);
      this.a(cvt.oL, oh.bz);
      this.a(cvt.po, oh.bB);
      this.a(cvt.oM, oh.bz);
      this.a(cvt.pn, oh.bB);
      this.a(cvt.pm, oh.bB);
      this.a(cvt.uz, oh.bz);
      this.a(cvt.uu, oh.bz);
      this.a(cvt.nV, oh.bz);
      this.a(cvt.nW, oh.bz);
      this.a(cvt.rk, oh.bz);
      this.a(cvt.qa, oh.bz);
      this.a(cvt.qP, oh.bz);
      this.a(cvt.nT, oh.bz);
      this.a(cvt.wf, oh.bz);
      this.a(cvt.rp, oh.bz);
      this.a(cvt.uk, oh.bz);
      this.a(cvt.vj, oh.bz);
      this.a(cvt.pY, oh.bz);
      this.a(cvt.qC, oh.bz);
      this.a(cvt.uB, oh.bz);
      this.a(cvt.uA, oh.bz);
      this.a(cvt.rd, oh.bz);
      this.a(cvt.qG, oh.bz);
      this.a(cvt.uv, oh.bz);
      this.a(cvt.rt, oh.bz);
      this.a(cvt.oD, oh.bz);
      this.a(cvt.uC, oh.bz);
      this.a(cvt.uF, oh.bz);
      this.a(cvt.uG, oh.bz);
      this.a(cvt.uE, oh.bz);
      this.a(cvt.rx, oh.bz);
      this.a(cvt.sf, oh.bz);
      this.a(cvt.nL, oh.bz);
      this.a(cvt.rb, oh.bz);
      this.a(cvt.qH, oh.bz);
      this.a(cvt.oq, oh.bz);
      this.a(cvt.rW, oh.bz);
      this.a(cvt.vw, oh.bz);
      this.a(cvt.wc, oh.bz);
      this.a(cvt.qR, oh.bz);
      this.a(cvt.qD, oh.bz);
      this.a(cvt.xw, oh.bz);
      this.a(cvt.vr, oh.bz);
      this.a(cvt.sn, oh.bz);
      this.a(cvt.nX, oh.bz);
      this.a(cvt.nY, oh.bz);
      this.a(cvt.qY, oh.bz);
      this.a(cvt.pr, oh.bB);
      this.a(cvt.oV, oh.bB);
      this.a(cvt.oW, oh.bB);
      this.a(cvt.oU, oh.bB);
      this.a(cvt.oT, oh.bB);
      this.a(cvt.oS, oh.bB);
      this.a(cvt.rB, oh.bz);
      this.a(cvt.vY, oh.bz);
      this.a(cvt.nP, oh.bz);
      this.a(cvt.vv, oh.bz);
      this.a(cvt.vU, oh.bz);
      this.a(cvt.rc, oh.bz);
      this.a(cvt.qJ, oh.bz);
      this.a(cvt.qK, oh.bz);
      this.a(cvt.qL, oh.bz);
      this.a(cvt.qA, oh.bz);
      this.a(cvt.px, oh.bz);
      this.a(cvt.rj, oh.bz);
      this.a(cvt.tZ, oh.bz);
      this.a(cvt.ud, oh.bQ);
      this.a(cvt.os);
      this.a(cvt.oQ, oh.bB);
      this.a(cvt.oR, oh.bB);
      this.a(cvt.oP, oh.bB);
      this.a(cvt.oO, oh.bB);
      this.a(cvt.oN, oh.bB);
      this.a(cvt.ua, oh.bz);
      this.a(cvt.ub, oh.bz);
      this.a(cvt.rn, oh.bz);
      this.a(cvt.xy, oh.bz);
      this.a(cvt.xz, oh.bz);
      this.a(cvt.xA, oh.bz);
      this.a(cvt.xB, oh.bz);
      this.a(cvt.xC, oh.bz);
      this.a(cvt.xD, oh.bz);
      this.a(cvt.xE, oh.bz);
      this.a(cvt.xF, oh.bz);
      this.a(cvt.xG, oh.bz);
      this.a(cvt.xH, oh.bz);
      this.a(cvt.xI, oh.bz);
      this.a(cvt.xJ, oh.bz);
      this.a(cvt.xK, oh.bz);
      this.a(cvt.xL, oh.bz);
      this.a(cvt.xM, oh.bz);
      this.a(cvt.xN, oh.bz);
      this.a(cvt.xO, oh.bz);
      this.a(cvt.xP, oh.bz);
      this.a(cvt.xQ, oh.bz);
      this.a(cvt.vz, cvt.pr, oh.bB);
      this.a(cvt.qc, cvt.qb, oh.bz);

      for (cvk $$0 : lu.g) {
         if ($$0 instanceof cti $$1) {
            this.a($$1);
         }
      }

      this.a(cvt.xR, oh.bz);
      this.a(cvt.xS, oh.bz);
      this.a(cvt.xT, oh.bz);
      this.a(cvt.xU, oh.bz);
      this.a(cvt.xV, oh.bz);
      this.a(cvt.xW, oh.bz);
      this.a(cvt.xX, oh.bz);
      this.a(cvt.xY, oh.bz);
      this.a(cvt.xZ, oh.bz);
      this.a(cvt.ya, oh.bz);
      this.a(cvt.yb, oh.bz);
      this.a(cvt.yc, oh.bz);
      this.a(cvt.yd, oh.bz);
      this.a(cvt.ye, oh.bz);
      this.a(cvt.yf, oh.bz);
      this.a(cvt.yg, oh.bz);
      this.a(cvt.yh, oh.bz);
      this.a(cvt.yi, oh.bz);
      this.a(cvt.yj, oh.bz);
      this.a(cvt.yk, oh.bz);
      this.a(cvt.yl, oh.bz);
      this.a(cvt.ym, oh.bz);
      this.a(cvt.yn, oh.bz);
      this.a(cvt.yF, oh.bz);
      this.a(cvt.yG, oh.bz);
      this.a(cvt.yI, oh.bz);
      this.a(cvt.qV, oh.bz);
   }

   static record a(String a, float b, Map<jn<ctj>, String> c) {
      public String a(jn<ctj> $$0) {
         return this.c.getOrDefault($$0, this.a);
      }
   }
}
