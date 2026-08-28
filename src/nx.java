import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Supplier;

public class nx {
   public static final ali a = ali.b("trim_type");
   private static final List<nx.a> b = List.of(
      new nx.a("quartz", 0.1F, Map.of()),
      new nx.a("iron", 0.2F, Map.of(ddm.c, "iron_darker")),
      new nx.a("netherite", 0.3F, Map.of(ddm.g, "netherite_darker")),
      new nx.a("redstone", 0.4F, Map.of()),
      new nx.a("copper", 0.5F, Map.of()),
      new nx.a("gold", 0.6F, Map.of(ddm.d, "gold_darker")),
      new nx.a("emerald", 0.7F, Map.of()),
      new nx.a("diamond", 0.8F, Map.of(ddm.e, "diamond_darker")),
      new nx.a("lapis", 0.9F, Map.of()),
      new nx.a("amethyst", 1.0F, Map.of())
   );
   private final BiConsumer<ali, Supplier<JsonElement>> c;

   public nx(BiConsumer<ali, Supplier<JsonElement>> $$0) {
      this.c = $$0;
   }

   private void a(cvx $$0, ol $$1) {
      $$1.a(ok.a($$0), on.b($$0), this.c);
   }

   private void a(cvx $$0, String $$1, ol $$2) {
      $$2.a(ok.a($$0, $$1), on.k(on.a($$0, $$1)), this.c);
   }

   private void a(cvx $$0, cvx $$1, ol $$2) {
      $$2.a(ok.a($$0), on.b($$1), this.c);
   }

   private void a(cvx $$0) {
      this.a(ok.a($$0), on.c($$0), on.a($$0, "_overlay"));
   }

   private void b(cvx $$0) {
      for (int $$1 = 0; $$1 < 32; $$1++) {
         if ($$1 != 16) {
            this.a($$0, String.format(Locale.ROOT, "_%02d", $$1), om.bz);
         }
      }
   }

   private void c(cvx $$0) {
      for (int $$1 = 1; $$1 < 64; $$1++) {
         this.a($$0, String.format(Locale.ROOT, "_%02d", $$1), om.bz);
      }
   }

   private void a(ali $$0, ali $$1, ali $$2) {
      om.bD.a($$0, on.c($$1, $$2), this.c);
   }

   private void a(ali $$0, ali $$1, ali $$2, ali $$3) {
      om.bE.a($$0, on.a($$1, $$2, $$3), this.c);
   }

   private ali a(ali $$0, String $$1) {
      return $$0.g("_" + $$1 + "_trim");
   }

   private JsonObject a(ali $$0, Map<oo, ali> $$1, ali $$2) {
      JsonObject $$3 = om.bD.a($$0, $$1);
      JsonArray $$4 = new JsonArray();

      for (nx.a $$5 : b) {
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

   private void a(cvx $$0, ali $$1, ddl $$2, bum $$3) {
      List<ddl.c> $$4 = $$2.a(ddl.d.a);
      if (!$$4.isEmpty()) {
         boolean $$5 = $$4.size() == 2 && $$4.getFirst().b().isPresent();
         ali $$6 = ok.a($$0);
         ali $$7 = on.c($$0);
         ali $$8 = on.a($$0, "_overlay");
         if ($$5) {
            om.bD.a($$6, on.c($$7, $$8), this.c, ($$1x, $$2x) -> this.a($$1x, $$2x, $$1));
         } else {
            om.bz.a($$6, on.k($$7), this.c, ($$1x, $$2x) -> this.a($$1x, $$2x, $$1));
         }
         String $$9 = switch ($$3) {
            case f -> "helmet";
            case e -> "chestplate";
            case d -> "leggings";
            case c -> "boots";
            default -> throw new UnsupportedOperationException();
         };

         for (nx.a $$10 : b) {
            String $$11 = $$10.a($$1);
            ali $$12 = this.a($$6, $$11);
            String $$13 = $$9 + "_trim_" + $$11;
            ali $$14 = ali.b($$13).f("trims/items/");
            if ($$5) {
               this.a($$12, $$7, $$8, $$14);
            } else {
               this.a($$12, $$7, $$14);
            }
         }
      }
   }

   public void a() {
      this.a(cwf.od, om.bz);
      this.a(cwf.of, om.bz);
      this.a(cwf.oe, om.bz);
      this.a(cwf.og, om.bz);
      this.a(cwf.oE, om.bz);
      this.a(cwf.ov, om.bz);
      this.a(cwf.or, om.bz);
      this.a(cwf.uH, om.bz);
      this.a(cwf.ox, om.bz);
      this.a(cwf.uj, om.bz);
      this.a(cwf.dR, om.bB);
      this.a(cwf.sb, om.bz);
      this.a(cwf.vm, om.bz);
      this.a(cwf.vo, om.bz);
      this.a(cwf.nZ, om.bz);
      this.a(cwf.oa, om.bz);
      this.a(cwf.ry, om.bz);
      this.a(cwf.sp, om.bz);
      this.a(cwf.sh, om.bB);
      this.a(cwf.ru, om.bz);
      this.a(cwf.rz, om.bz);
      this.a(cwf.wj, om.bz);
      this.a(cwf.qQ, om.bz);
      this.a(cwf.ou, om.bz);
      this.a(cwf.py, om.bz);
      this.a(cwf.qM, om.bz);
      this.a(cwf.uc, om.bB);
      this.a(cwf.rv, om.bz);
      this.a(cwf.qz, om.bz);
      this.a(cwf.nR, om.bC);
      this.a(cwf.nS, om.bC);
      this.a(cwf.oz, om.bz);
      this.a(cwf.nN, om.bz);
      this.a(cwf.sd, om.bz);
      this.a(cwf.vi, om.bz);
      this.a(cwf.qN, om.bz);
      this.c(cwf.qX);
      this.a(cwf.oy, om.bz);
      this.a(cwf.qI, om.bz);
      this.a(cwf.uO, om.bz);
      this.b(cwf.qT);
      this.b(cwf.qU);
      this.a(cwf.sc, om.bz);
      this.a(cwf.se, om.bz);
      this.a(cwf.re, om.bz);
      this.a(cwf.uQ, om.bz);
      this.a(cwf.pZ, om.bz);
      this.a(cwf.uD, om.bz);
      this.a(cwf.rf, om.bz);
      this.a(cwf.rT, om.bz);
      this.a(cwf.oH, om.bz);
      this.a(cwf.oI, om.bz);
      this.a(cwf.wb, om.bz);
      this.a(cwf.rs, om.bz);
      this.a(cwf.oh, om.bz);
      this.a(cwf.oi, om.bz);
      this.a(cwf.oA, om.bz);
      this.a(cwf.pk, om.bB);
      this.a(cwf.pl, om.bB);
      this.a(cwf.uK, om.bz);
      this.a(cwf.pj, om.bB);
      this.a(cwf.pi, om.bB);
      this.a(cwf.ph, om.bB);
      this.a(cwf.vp, om.bz);
      this.a(cwf.rY, om.bz);
      this.a(cwf.qS, om.bz);
      this.a(cwf.oB, om.bz);
      this.a(cwf.uy, om.bz);
      this.a(cwf.st, om.bz);
      this.a(cwf.sg, om.bz);
      this.a(cwf.vh, om.bz);
      this.a(cwf.tX, om.bz);
      this.a(cwf.so, om.bz);
      this.a(cwf.wi, om.bz);
      this.a(cwf.uw, om.bz);
      this.a(cwf.tY, om.bz);
      this.a(cwf.pX, om.bz);
      this.a(cwf.ot, om.bz);
      this.a(cwf.wg, om.bz);
      this.a(cwf.wa, om.bz);
      this.a(cwf.nO, om.bz);
      this.a(cwf.si, om.bz);
      this.a(cwf.sl, om.bz);
      this.a(cwf.su, om.bz);
      this.a(cwf.we, om.bz);
      this.a(cwf.wy, om.bz);
      this.a(cwf.qZ, om.bz);
      this.a(cwf.rh, om.bz);
      this.a(cwf.uf, om.bz);
      this.a(cwf.oJ, om.bz);
      this.a(cwf.qb, om.bz);
      this.a(cwf.pa, om.bB);
      this.a(cwf.um, om.bz);
      this.a(cwf.pb, om.bB);
      this.a(cwf.uJ, om.bz);
      this.a(cwf.oZ, om.bB);
      this.a(cwf.oY, om.bB);
      this.a(cwf.oX, om.bB);
      this.a(cwf.oK, om.bz);
      this.a(cwf.sj, om.bz);
      this.a(cwf.rq, om.bz);
      this.a(cwf.rw, om.bz);
      this.a(cwf.pv, om.bz);
      this.a(cwf.wh, om.bz);
      this.a(cwf.vW, om.bz);
      this.a(cwf.wC, om.bz);
      this.a(cwf.wF, om.bz);
      this.a(cwf.nQ, om.bz);
      this.a(cwf.rg, om.bz);
      this.a(cwf.oF, om.bz);
      this.a(cwf.pf, om.bB);
      this.a(cwf.pg, om.bB);
      this.a(cwf.uI, om.bz);
      this.a(cwf.oG, om.bz);
      this.a(cwf.vx, om.bz);
      this.a(cwf.pe, om.bB);
      this.a(cwf.pd, om.bB);
      this.a(cwf.pc, om.bB);
      this.a(cwf.ue, om.bz);
      this.a(cwf.ob, om.bz);
      this.a(cwf.oc, om.bz);
      this.a(cwf.vy, om.bz);
      this.a(cwf.oC, om.bz);
      this.a(cwf.qB, om.bz);
      this.a(cwf.qE, om.bz);
      this.a(cwf.uL, om.bz);
      this.a(cwf.rm, om.bz);
      this.a(cwf.rr, om.bz);
      this.a(cwf.ro, om.bz);
      this.a(cwf.rl, om.bz);
      this.a(cwf.sq, om.bz);
      this.a(cwf.oj, om.bz);
      this.a(cwf.ok, om.bz);
      this.a(cwf.ol, om.bz);
      this.a(cwf.om, om.bz);
      this.a(cwf.ul, om.bz);
      this.a(cwf.rX, om.bz);
      this.a(cwf.qF, om.bz);
      this.a(cwf.nM, om.bz);
      this.a(cwf.wd, om.bz);
      this.a(cwf.ps, om.bz);
      this.a(cwf.vT, om.bz);
      this.a(cwf.vM, om.bA);
      this.a(cwf.vA, om.bA);
      this.a(cwf.vC, om.bA);
      this.a(cwf.vB, om.bA);
      this.a(cwf.vD, om.bA);
      this.a(cwf.vE, om.bA);
      this.a(cwf.vF, om.bA);
      this.a(cwf.vG, om.bA);
      this.a(cwf.vH, om.bA);
      this.a(cwf.vI, om.bA);
      this.a(cwf.vR, om.bA);
      this.a(cwf.vS, om.bA);
      this.a(cwf.vJ, om.bA);
      this.a(cwf.vK, om.bA);
      this.a(cwf.vN, om.bA);
      this.a(cwf.vL, om.bA);
      this.a(cwf.vO, om.bA);
      this.a(cwf.vP, om.bA);
      this.a(cwf.vQ, om.bA);
      this.a(cwf.uP, om.bz);
      this.a(cwf.uN, om.bz);
      this.a(cwf.vV, om.bz);
      this.a(cwf.pp, om.bB);
      this.a(cwf.pq, om.bB);
      this.a(cwf.oL, om.bz);
      this.a(cwf.po, om.bB);
      this.a(cwf.oM, om.bz);
      this.a(cwf.pn, om.bB);
      this.a(cwf.pm, om.bB);
      this.a(cwf.uz, om.bz);
      this.a(cwf.uu, om.bz);
      this.a(cwf.nV, om.bz);
      this.a(cwf.nW, om.bz);
      this.a(cwf.rk, om.bz);
      this.a(cwf.qa, om.bz);
      this.a(cwf.qP, om.bz);
      this.a(cwf.nT, om.bz);
      this.a(cwf.wf, om.bz);
      this.a(cwf.rp, om.bz);
      this.a(cwf.uk, om.bz);
      this.a(cwf.vj, om.bz);
      this.a(cwf.pY, om.bz);
      this.a(cwf.qC, om.bz);
      this.a(cwf.uB, om.bz);
      this.a(cwf.uA, om.bz);
      this.a(cwf.rd, om.bz);
      this.a(cwf.qG, om.bz);
      this.a(cwf.uv, om.bz);
      this.a(cwf.rt, om.bz);
      this.a(cwf.oD, om.bz);
      this.a(cwf.uC, om.bz);
      this.a(cwf.uF, om.bz);
      this.a(cwf.uG, om.bz);
      this.a(cwf.uE, om.bz);
      this.a(cwf.rx, om.bz);
      this.a(cwf.sf, om.bz);
      this.a(cwf.nL, om.bz);
      this.a(cwf.rb, om.bz);
      this.a(cwf.qH, om.bz);
      this.a(cwf.oq, om.bz);
      this.a(cwf.rW, om.bz);
      this.a(cwf.vw, om.bz);
      this.a(cwf.wc, om.bz);
      this.a(cwf.qR, om.bz);
      this.a(cwf.qD, om.bz);
      this.a(cwf.xw, om.bz);
      this.a(cwf.vr, om.bz);
      this.a(cwf.sn, om.bz);
      this.a(cwf.nX, om.bz);
      this.a(cwf.nY, om.bz);
      this.a(cwf.qY, om.bz);
      this.a(cwf.pr, om.bB);
      this.a(cwf.oV, om.bB);
      this.a(cwf.oW, om.bB);
      this.a(cwf.oU, om.bB);
      this.a(cwf.oT, om.bB);
      this.a(cwf.oS, om.bB);
      this.a(cwf.rB, om.bz);
      this.a(cwf.vY, om.bz);
      this.a(cwf.nP, om.bz);
      this.a(cwf.vv, om.bz);
      this.a(cwf.vU, om.bz);
      this.a(cwf.rc, om.bz);
      this.a(cwf.qJ, om.bz);
      this.a(cwf.qK, om.bz);
      this.a(cwf.qL, om.bz);
      this.a(cwf.qA, om.bz);
      this.a(cwf.px, om.bz);
      this.a(cwf.rj, om.bz);
      this.a(cwf.tZ, om.bz);
      this.a(cwf.ud, om.bQ);
      this.a(cwf.os);
      this.a(cwf.oQ, om.bB);
      this.a(cwf.oR, om.bB);
      this.a(cwf.oP, om.bB);
      this.a(cwf.oO, om.bB);
      this.a(cwf.oN, om.bB);
      this.a(cwf.ua, om.bz);
      this.a(cwf.ub, om.bz);
      this.a(cwf.rn, om.bz);
      this.a(cwf.xy, om.bz);
      this.a(cwf.xz, om.bz);
      this.a(cwf.xA, om.bz);
      this.a(cwf.xB, om.bz);
      this.a(cwf.xC, om.bz);
      this.a(cwf.xD, om.bz);
      this.a(cwf.xE, om.bz);
      this.a(cwf.xF, om.bz);
      this.a(cwf.xG, om.bz);
      this.a(cwf.xH, om.bz);
      this.a(cwf.xI, om.bz);
      this.a(cwf.xJ, om.bz);
      this.a(cwf.xK, om.bz);
      this.a(cwf.xL, om.bz);
      this.a(cwf.xM, om.bz);
      this.a(cwf.xN, om.bz);
      this.a(cwf.xO, om.bz);
      this.a(cwf.xP, om.bz);
      this.a(cwf.xQ, om.bz);
      this.a(cwf.vz, cwf.pr, om.bB);
      this.a(cwf.qc, cwf.qb, om.bz);
      Map<ali, ddl> $$0 = new HashMap<>();
      ddm.a($$0::put);

      for (cvx $$1 : ly.g) {
         ddn $$2 = $$1.g().a(ku.D);
         if ($$2 != null && $$2.a().a() == bum.a.b && $$2.c().isPresent()) {
            ali $$3 = $$2.c().get();
            ddl $$4 = $$0.get($$3);
            if ($$4 == null) {
               throw new IllegalStateException("Referenced equipment model does not exist: " + $$3);
            }

            this.a($$1, $$3, $$4, $$2.a());
         }
      }

      this.a(cwf.xR, om.bz);
      this.a(cwf.xS, om.bz);
      this.a(cwf.xT, om.bz);
      this.a(cwf.xU, om.bz);
      this.a(cwf.xV, om.bz);
      this.a(cwf.xW, om.bz);
      this.a(cwf.xX, om.bz);
      this.a(cwf.xY, om.bz);
      this.a(cwf.xZ, om.bz);
      this.a(cwf.ya, om.bz);
      this.a(cwf.yb, om.bz);
      this.a(cwf.yc, om.bz);
      this.a(cwf.yd, om.bz);
      this.a(cwf.ye, om.bz);
      this.a(cwf.yf, om.bz);
      this.a(cwf.yg, om.bz);
      this.a(cwf.yh, om.bz);
      this.a(cwf.yi, om.bz);
      this.a(cwf.yj, om.bz);
      this.a(cwf.yk, om.bz);
      this.a(cwf.yl, om.bz);
      this.a(cwf.ym, om.bz);
      this.a(cwf.yn, om.bz);
      this.a(cwf.yF, om.bz);
      this.a(cwf.yG, om.bz);
      this.a(cwf.yI, om.bz);
      this.a(cwf.qV, om.bz);
   }

   static record a(String a, float b, Map<ali, String> c) {
      public String a(ali $$0) {
         return this.c.getOrDefault($$0, this.a);
      }
   }
}
