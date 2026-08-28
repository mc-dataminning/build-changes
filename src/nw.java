import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Supplier;

public class nw {
   public static final alh a = alh.b("trim_type");
   private static final List<nw.a> b = List.of(
      new nw.a("quartz", 0.1F, Map.of()),
      new nw.a("iron", 0.2F, Map.of(ddg.c, "iron_darker")),
      new nw.a("netherite", 0.3F, Map.of(ddg.g, "netherite_darker")),
      new nw.a("redstone", 0.4F, Map.of()),
      new nw.a("copper", 0.5F, Map.of()),
      new nw.a("gold", 0.6F, Map.of(ddg.d, "gold_darker")),
      new nw.a("emerald", 0.7F, Map.of()),
      new nw.a("diamond", 0.8F, Map.of(ddg.e, "diamond_darker")),
      new nw.a("lapis", 0.9F, Map.of()),
      new nw.a("amethyst", 1.0F, Map.of())
   );
   private final BiConsumer<alh, Supplier<JsonElement>> c;

   public nw(BiConsumer<alh, Supplier<JsonElement>> $$0) {
      this.c = $$0;
   }

   private void a(cvt $$0, ok $$1) {
      $$1.a(oj.a($$0), om.b($$0), this.c);
   }

   private void a(cvt $$0, String $$1, ok $$2) {
      $$2.a(oj.a($$0, $$1), om.k(om.a($$0, $$1)), this.c);
   }

   private void a(cvt $$0, cvt $$1, ok $$2) {
      $$2.a(oj.a($$0), om.b($$1), this.c);
   }

   private void a(cvt $$0) {
      this.a(oj.a($$0), om.c($$0), om.a($$0, "_overlay"));
   }

   private void b(cvt $$0) {
      for (int $$1 = 0; $$1 < 32; $$1++) {
         if ($$1 != 16) {
            this.a($$0, String.format(Locale.ROOT, "_%02d", $$1), ol.bz);
         }
      }
   }

   private void c(cvt $$0) {
      for (int $$1 = 1; $$1 < 64; $$1++) {
         this.a($$0, String.format(Locale.ROOT, "_%02d", $$1), ol.bz);
      }
   }

   private void a(alh $$0, alh $$1, alh $$2) {
      ol.bD.a($$0, om.c($$1, $$2), this.c);
   }

   private void a(alh $$0, alh $$1, alh $$2, alh $$3) {
      ol.bE.a($$0, om.a($$1, $$2, $$3), this.c);
   }

   private alh a(alh $$0, String $$1) {
      return $$0.g("_" + $$1 + "_trim");
   }

   private JsonObject a(alh $$0, Map<on, alh> $$1, alh $$2) {
      JsonObject $$3 = ol.bD.a($$0, $$1);
      JsonArray $$4 = new JsonArray();

      for (nw.a $$5 : b) {
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

   private void a(cvt $$0, alh $$1, ddf $$2, buh $$3) {
      List<ddf.c> $$4 = $$2.a(ddf.d.a);
      if (!$$4.isEmpty()) {
         boolean $$5 = $$4.size() == 2 && $$4.getFirst().b().isPresent();
         alh $$6 = oj.a($$0);
         alh $$7 = om.c($$0);
         alh $$8 = om.a($$0, "_overlay");
         if ($$5) {
            ol.bD.a($$6, om.c($$7, $$8), this.c, ($$1x, $$2x) -> this.a($$1x, $$2x, $$1));
         } else {
            ol.bz.a($$6, om.k($$7), this.c, ($$1x, $$2x) -> this.a($$1x, $$2x, $$1));
         }
         String $$9 = switch ($$3) {
            case f -> "helmet";
            case e -> "chestplate";
            case d -> "leggings";
            case c -> "boots";
            default -> throw new UnsupportedOperationException();
         };

         for (nw.a $$10 : b) {
            String $$11 = $$10.a($$1);
            alh $$12 = this.a($$6, $$11);
            String $$13 = $$9 + "_trim_" + $$11;
            alh $$14 = alh.b($$13).f("trims/items/");
            if ($$5) {
               this.a($$12, $$7, $$8, $$14);
            } else {
               this.a($$12, $$7, $$14);
            }
         }
      }
   }

   public void a() {
      this.a(cwb.od, ol.bz);
      this.a(cwb.of, ol.bz);
      this.a(cwb.oe, ol.bz);
      this.a(cwb.og, ol.bz);
      this.a(cwb.oE, ol.bz);
      this.a(cwb.ov, ol.bz);
      this.a(cwb.or, ol.bz);
      this.a(cwb.uH, ol.bz);
      this.a(cwb.ox, ol.bz);
      this.a(cwb.uj, ol.bz);
      this.a(cwb.dR, ol.bB);
      this.a(cwb.sb, ol.bz);
      this.a(cwb.vm, ol.bz);
      this.a(cwb.vo, ol.bz);
      this.a(cwb.nZ, ol.bz);
      this.a(cwb.oa, ol.bz);
      this.a(cwb.ry, ol.bz);
      this.a(cwb.sp, ol.bz);
      this.a(cwb.sh, ol.bB);
      this.a(cwb.ru, ol.bz);
      this.a(cwb.rz, ol.bz);
      this.a(cwb.wj, ol.bz);
      this.a(cwb.qQ, ol.bz);
      this.a(cwb.ou, ol.bz);
      this.a(cwb.py, ol.bz);
      this.a(cwb.qM, ol.bz);
      this.a(cwb.uc, ol.bB);
      this.a(cwb.rv, ol.bz);
      this.a(cwb.qz, ol.bz);
      this.a(cwb.nR, ol.bC);
      this.a(cwb.nS, ol.bC);
      this.a(cwb.oz, ol.bz);
      this.a(cwb.nN, ol.bz);
      this.a(cwb.sd, ol.bz);
      this.a(cwb.vi, ol.bz);
      this.a(cwb.qN, ol.bz);
      this.c(cwb.qX);
      this.a(cwb.oy, ol.bz);
      this.a(cwb.qI, ol.bz);
      this.a(cwb.uO, ol.bz);
      this.b(cwb.qT);
      this.b(cwb.qU);
      this.a(cwb.sc, ol.bz);
      this.a(cwb.se, ol.bz);
      this.a(cwb.re, ol.bz);
      this.a(cwb.uQ, ol.bz);
      this.a(cwb.pZ, ol.bz);
      this.a(cwb.uD, ol.bz);
      this.a(cwb.rf, ol.bz);
      this.a(cwb.rT, ol.bz);
      this.a(cwb.oH, ol.bz);
      this.a(cwb.oI, ol.bz);
      this.a(cwb.wb, ol.bz);
      this.a(cwb.rs, ol.bz);
      this.a(cwb.oh, ol.bz);
      this.a(cwb.oi, ol.bz);
      this.a(cwb.oA, ol.bz);
      this.a(cwb.pk, ol.bB);
      this.a(cwb.pl, ol.bB);
      this.a(cwb.uK, ol.bz);
      this.a(cwb.pj, ol.bB);
      this.a(cwb.pi, ol.bB);
      this.a(cwb.ph, ol.bB);
      this.a(cwb.vp, ol.bz);
      this.a(cwb.rY, ol.bz);
      this.a(cwb.qS, ol.bz);
      this.a(cwb.oB, ol.bz);
      this.a(cwb.uy, ol.bz);
      this.a(cwb.st, ol.bz);
      this.a(cwb.sg, ol.bz);
      this.a(cwb.vh, ol.bz);
      this.a(cwb.tX, ol.bz);
      this.a(cwb.so, ol.bz);
      this.a(cwb.wi, ol.bz);
      this.a(cwb.uw, ol.bz);
      this.a(cwb.tY, ol.bz);
      this.a(cwb.pX, ol.bz);
      this.a(cwb.ot, ol.bz);
      this.a(cwb.wg, ol.bz);
      this.a(cwb.wa, ol.bz);
      this.a(cwb.nO, ol.bz);
      this.a(cwb.si, ol.bz);
      this.a(cwb.sl, ol.bz);
      this.a(cwb.su, ol.bz);
      this.a(cwb.we, ol.bz);
      this.a(cwb.wy, ol.bz);
      this.a(cwb.qZ, ol.bz);
      this.a(cwb.rh, ol.bz);
      this.a(cwb.uf, ol.bz);
      this.a(cwb.oJ, ol.bz);
      this.a(cwb.qb, ol.bz);
      this.a(cwb.pa, ol.bB);
      this.a(cwb.um, ol.bz);
      this.a(cwb.pb, ol.bB);
      this.a(cwb.uJ, ol.bz);
      this.a(cwb.oZ, ol.bB);
      this.a(cwb.oY, ol.bB);
      this.a(cwb.oX, ol.bB);
      this.a(cwb.oK, ol.bz);
      this.a(cwb.sj, ol.bz);
      this.a(cwb.rq, ol.bz);
      this.a(cwb.rw, ol.bz);
      this.a(cwb.pv, ol.bz);
      this.a(cwb.wh, ol.bz);
      this.a(cwb.vW, ol.bz);
      this.a(cwb.wC, ol.bz);
      this.a(cwb.wF, ol.bz);
      this.a(cwb.nQ, ol.bz);
      this.a(cwb.rg, ol.bz);
      this.a(cwb.oF, ol.bz);
      this.a(cwb.pf, ol.bB);
      this.a(cwb.pg, ol.bB);
      this.a(cwb.uI, ol.bz);
      this.a(cwb.oG, ol.bz);
      this.a(cwb.vx, ol.bz);
      this.a(cwb.pe, ol.bB);
      this.a(cwb.pd, ol.bB);
      this.a(cwb.pc, ol.bB);
      this.a(cwb.ue, ol.bz);
      this.a(cwb.ob, ol.bz);
      this.a(cwb.oc, ol.bz);
      this.a(cwb.vy, ol.bz);
      this.a(cwb.oC, ol.bz);
      this.a(cwb.qB, ol.bz);
      this.a(cwb.qE, ol.bz);
      this.a(cwb.uL, ol.bz);
      this.a(cwb.rm, ol.bz);
      this.a(cwb.rr, ol.bz);
      this.a(cwb.ro, ol.bz);
      this.a(cwb.rl, ol.bz);
      this.a(cwb.sq, ol.bz);
      this.a(cwb.oj, ol.bz);
      this.a(cwb.ok, ol.bz);
      this.a(cwb.ol, ol.bz);
      this.a(cwb.om, ol.bz);
      this.a(cwb.ul, ol.bz);
      this.a(cwb.rX, ol.bz);
      this.a(cwb.qF, ol.bz);
      this.a(cwb.nM, ol.bz);
      this.a(cwb.wd, ol.bz);
      this.a(cwb.ps, ol.bz);
      this.a(cwb.vT, ol.bz);
      this.a(cwb.vM, ol.bA);
      this.a(cwb.vA, ol.bA);
      this.a(cwb.vC, ol.bA);
      this.a(cwb.vB, ol.bA);
      this.a(cwb.vD, ol.bA);
      this.a(cwb.vE, ol.bA);
      this.a(cwb.vF, ol.bA);
      this.a(cwb.vG, ol.bA);
      this.a(cwb.vH, ol.bA);
      this.a(cwb.vI, ol.bA);
      this.a(cwb.vR, ol.bA);
      this.a(cwb.vS, ol.bA);
      this.a(cwb.vJ, ol.bA);
      this.a(cwb.vK, ol.bA);
      this.a(cwb.vN, ol.bA);
      this.a(cwb.vL, ol.bA);
      this.a(cwb.vO, ol.bA);
      this.a(cwb.vP, ol.bA);
      this.a(cwb.vQ, ol.bA);
      this.a(cwb.uP, ol.bz);
      this.a(cwb.uN, ol.bz);
      this.a(cwb.vV, ol.bz);
      this.a(cwb.pp, ol.bB);
      this.a(cwb.pq, ol.bB);
      this.a(cwb.oL, ol.bz);
      this.a(cwb.po, ol.bB);
      this.a(cwb.oM, ol.bz);
      this.a(cwb.pn, ol.bB);
      this.a(cwb.pm, ol.bB);
      this.a(cwb.uz, ol.bz);
      this.a(cwb.uu, ol.bz);
      this.a(cwb.nV, ol.bz);
      this.a(cwb.nW, ol.bz);
      this.a(cwb.rk, ol.bz);
      this.a(cwb.qa, ol.bz);
      this.a(cwb.qP, ol.bz);
      this.a(cwb.nT, ol.bz);
      this.a(cwb.wf, ol.bz);
      this.a(cwb.rp, ol.bz);
      this.a(cwb.uk, ol.bz);
      this.a(cwb.vj, ol.bz);
      this.a(cwb.pY, ol.bz);
      this.a(cwb.qC, ol.bz);
      this.a(cwb.uB, ol.bz);
      this.a(cwb.uA, ol.bz);
      this.a(cwb.rd, ol.bz);
      this.a(cwb.qG, ol.bz);
      this.a(cwb.uv, ol.bz);
      this.a(cwb.rt, ol.bz);
      this.a(cwb.oD, ol.bz);
      this.a(cwb.uC, ol.bz);
      this.a(cwb.uF, ol.bz);
      this.a(cwb.uG, ol.bz);
      this.a(cwb.uE, ol.bz);
      this.a(cwb.rx, ol.bz);
      this.a(cwb.sf, ol.bz);
      this.a(cwb.nL, ol.bz);
      this.a(cwb.rb, ol.bz);
      this.a(cwb.qH, ol.bz);
      this.a(cwb.oq, ol.bz);
      this.a(cwb.rW, ol.bz);
      this.a(cwb.vw, ol.bz);
      this.a(cwb.wc, ol.bz);
      this.a(cwb.qR, ol.bz);
      this.a(cwb.qD, ol.bz);
      this.a(cwb.xw, ol.bz);
      this.a(cwb.vr, ol.bz);
      this.a(cwb.sn, ol.bz);
      this.a(cwb.nX, ol.bz);
      this.a(cwb.nY, ol.bz);
      this.a(cwb.qY, ol.bz);
      this.a(cwb.pr, ol.bB);
      this.a(cwb.oV, ol.bB);
      this.a(cwb.oW, ol.bB);
      this.a(cwb.oU, ol.bB);
      this.a(cwb.oT, ol.bB);
      this.a(cwb.oS, ol.bB);
      this.a(cwb.rB, ol.bz);
      this.a(cwb.vY, ol.bz);
      this.a(cwb.nP, ol.bz);
      this.a(cwb.vv, ol.bz);
      this.a(cwb.vU, ol.bz);
      this.a(cwb.rc, ol.bz);
      this.a(cwb.qJ, ol.bz);
      this.a(cwb.qK, ol.bz);
      this.a(cwb.qL, ol.bz);
      this.a(cwb.qA, ol.bz);
      this.a(cwb.px, ol.bz);
      this.a(cwb.rj, ol.bz);
      this.a(cwb.tZ, ol.bz);
      this.a(cwb.ud, ol.bQ);
      this.a(cwb.os);
      this.a(cwb.oQ, ol.bB);
      this.a(cwb.oR, ol.bB);
      this.a(cwb.oP, ol.bB);
      this.a(cwb.oO, ol.bB);
      this.a(cwb.oN, ol.bB);
      this.a(cwb.ua, ol.bz);
      this.a(cwb.ub, ol.bz);
      this.a(cwb.rn, ol.bz);
      this.a(cwb.xy, ol.bz);
      this.a(cwb.xz, ol.bz);
      this.a(cwb.xA, ol.bz);
      this.a(cwb.xB, ol.bz);
      this.a(cwb.xC, ol.bz);
      this.a(cwb.xD, ol.bz);
      this.a(cwb.xE, ol.bz);
      this.a(cwb.xF, ol.bz);
      this.a(cwb.xG, ol.bz);
      this.a(cwb.xH, ol.bz);
      this.a(cwb.xI, ol.bz);
      this.a(cwb.xJ, ol.bz);
      this.a(cwb.xK, ol.bz);
      this.a(cwb.xL, ol.bz);
      this.a(cwb.xM, ol.bz);
      this.a(cwb.xN, ol.bz);
      this.a(cwb.xO, ol.bz);
      this.a(cwb.xP, ol.bz);
      this.a(cwb.xQ, ol.bz);
      this.a(cwb.vz, cwb.pr, ol.bB);
      this.a(cwb.qc, cwb.qb, ol.bz);
      Map<alh, ddf> $$0 = new HashMap<>();
      ddg.a($$0::put);

      for (cvt $$1 : lx.g) {
         ddh $$2 = $$1.g().a(kt.D);
         if ($$2 != null && $$2.a().a() == buh.a.b && $$2.c().isPresent()) {
            alh $$3 = $$2.c().get();
            ddf $$4 = $$0.get($$3);
            if ($$4 == null) {
               throw new IllegalStateException("Referenced equipment model does not exist: " + $$3);
            }

            this.a($$1, $$3, $$4, $$2.a());
         }
      }

      this.a(cwb.xR, ol.bz);
      this.a(cwb.xS, ol.bz);
      this.a(cwb.xT, ol.bz);
      this.a(cwb.xU, ol.bz);
      this.a(cwb.xV, ol.bz);
      this.a(cwb.xW, ol.bz);
      this.a(cwb.xX, ol.bz);
      this.a(cwb.xY, ol.bz);
      this.a(cwb.xZ, ol.bz);
      this.a(cwb.ya, ol.bz);
      this.a(cwb.yb, ol.bz);
      this.a(cwb.yc, ol.bz);
      this.a(cwb.yd, ol.bz);
      this.a(cwb.ye, ol.bz);
      this.a(cwb.yf, ol.bz);
      this.a(cwb.yg, ol.bz);
      this.a(cwb.yh, ol.bz);
      this.a(cwb.yi, ol.bz);
      this.a(cwb.yj, ol.bz);
      this.a(cwb.yk, ol.bz);
      this.a(cwb.yl, ol.bz);
      this.a(cwb.ym, ol.bz);
      this.a(cwb.yn, ol.bz);
      this.a(cwb.yF, ol.bz);
      this.a(cwb.yG, ol.bz);
      this.a(cwb.yI, ol.bz);
      this.a(cwb.qV, ol.bz);
   }

   static record a(String a, float b, Map<alh, String> c) {
      public String a(alh $$0) {
         return this.c.getOrDefault($$0, this.a);
      }
   }
}
