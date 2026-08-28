import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Supplier;

public class ny {
   public static final alj a = alj.b("trim_type");
   private static final List<ny.a> b = List.of(
      new ny.a("quartz", 0.1F, Map.of()),
      new ny.a("iron", 0.2F, Map.of(ddx.c, "iron_darker")),
      new ny.a("netherite", 0.3F, Map.of(ddx.g, "netherite_darker")),
      new ny.a("redstone", 0.4F, Map.of()),
      new ny.a("copper", 0.5F, Map.of()),
      new ny.a("gold", 0.6F, Map.of(ddx.d, "gold_darker")),
      new ny.a("emerald", 0.7F, Map.of()),
      new ny.a("diamond", 0.8F, Map.of(ddx.e, "diamond_darker")),
      new ny.a("lapis", 0.9F, Map.of()),
      new ny.a("amethyst", 1.0F, Map.of())
   );
   private final BiConsumer<alj, Supplier<JsonElement>> c;

   public ny(BiConsumer<alj, Supplier<JsonElement>> $$0) {
      this.c = $$0;
   }

   private void a(cwi $$0, om $$1) {
      $$1.a(ol.a($$0), oo.b($$0), this.c);
   }

   private void a(cwi $$0, String $$1, om $$2) {
      $$2.a(ol.a($$0, $$1), oo.k(oo.a($$0, $$1)), this.c);
   }

   private void a(cwi $$0, cwi $$1, om $$2) {
      $$2.a(ol.a($$0), oo.b($$1), this.c);
   }

   private void a(cwi $$0) {
      this.a(ol.a($$0), oo.c($$0), oo.a($$0, "_overlay"));
   }

   private void b(cwi $$0) {
      for (int $$1 = 0; $$1 < 32; $$1++) {
         if ($$1 != 16) {
            this.a($$0, String.format(Locale.ROOT, "_%02d", $$1), on.bB);
         }
      }
   }

   private void c(cwi $$0) {
      for (int $$1 = 1; $$1 < 64; $$1++) {
         this.a($$0, String.format(Locale.ROOT, "_%02d", $$1), on.bB);
      }
   }

   private void a(alj $$0, alj $$1, alj $$2) {
      on.bF.a($$0, oo.c($$1, $$2), this.c);
   }

   private void a(alj $$0, alj $$1, alj $$2, alj $$3) {
      on.bG.a($$0, oo.a($$1, $$2, $$3), this.c);
   }

   private alj a(alj $$0, String $$1) {
      return $$0.g("_" + $$1 + "_trim");
   }

   private JsonObject a(alj $$0, Map<op, alj> $$1, alj $$2) {
      JsonObject $$3 = on.bF.a($$0, $$1);
      JsonArray $$4 = new JsonArray();

      for (ny.a $$5 : b) {
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

   private void a(cwi $$0, alj $$1, ddw $$2, but $$3) {
      List<ddw.c> $$4 = $$2.a(ddw.d.a);
      if (!$$4.isEmpty()) {
         boolean $$5 = $$4.size() == 2 && $$4.getFirst().b().isPresent();
         alj $$6 = ol.a($$0);
         alj $$7 = oo.c($$0);
         alj $$8 = oo.a($$0, "_overlay");
         if ($$5) {
            on.bF.a($$6, oo.c($$7, $$8), this.c, ($$1x, $$2x) -> this.a($$1x, $$2x, $$1));
         } else {
            on.bB.a($$6, oo.k($$7), this.c, ($$1x, $$2x) -> this.a($$1x, $$2x, $$1));
         }
         String $$9 = switch ($$3) {
            case f -> "helmet";
            case e -> "chestplate";
            case d -> "leggings";
            case c -> "boots";
            default -> throw new UnsupportedOperationException();
         };

         for (ny.a $$10 : b) {
            String $$11 = $$10.a($$1);
            alj $$12 = this.a($$6, $$11);
            String $$13 = $$9 + "_trim_" + $$11;
            alj $$14 = alj.b($$13).f("trims/items/");
            if ($$5) {
               this.a($$12, $$7, $$8, $$14);
            } else {
               this.a($$12, $$7, $$14);
            }
         }
      }
   }

   public void a() {
      this.a(cwq.od, on.bB);
      this.a(cwq.of, on.bB);
      this.a(cwq.oe, on.bB);
      this.a(cwq.og, on.bB);
      this.a(cwq.oE, on.bB);
      this.a(cwq.ov, on.bB);
      this.a(cwq.or, on.bB);
      this.a(cwq.uX, on.bB);
      this.a(cwq.ox, on.bB);
      this.a(cwq.uz, on.bB);
      this.a(cwq.dR, on.bD);
      this.a(cwq.sr, on.bB);
      this.a(cwq.vC, on.bB);
      this.a(cwq.vE, on.bB);
      this.a(cwq.nZ, on.bB);
      this.a(cwq.oa, on.bB);
      this.a(cwq.rO, on.bB);
      this.a(cwq.sF, on.bB);
      this.a(cwq.sx, on.bD);
      this.a(cwq.rK, on.bB);
      this.a(cwq.rP, on.bB);
      this.a(cwq.wz, on.bB);
      this.a(cwq.qQ, on.bB);
      this.a(cwq.ou, on.bB);
      this.a(cwq.py, on.bB);
      this.a(cwq.qM, on.bB);
      this.a(cwq.us, on.bD);
      this.a(cwq.rL, on.bB);
      this.a(cwq.qz, on.bB);
      this.a(cwq.nR, on.bE);
      this.a(cwq.nS, on.bE);
      this.a(cwq.oz, on.bB);
      this.a(cwq.nN, on.bB);
      this.a(cwq.st, on.bB);
      this.a(cwq.vy, on.bB);
      this.a(cwq.qN, on.bB);
      this.c(cwq.rn);
      this.a(cwq.oy, on.bB);
      this.a(cwq.qI, on.bB);
      this.a(cwq.ve, on.bB);
      this.b(cwq.qT);
      this.b(cwq.qU);
      this.a(cwq.ss, on.bB);
      this.a(cwq.su, on.bB);
      this.a(cwq.ru, on.bB);
      this.a(cwq.vg, on.bB);
      this.a(cwq.pZ, on.bB);
      this.a(cwq.uT, on.bB);
      this.a(cwq.rv, on.bB);
      this.a(cwq.sj, on.bB);
      this.a(cwq.oH, on.bB);
      this.a(cwq.oI, on.bB);
      this.a(cwq.wr, on.bB);
      this.a(cwq.rI, on.bB);
      this.a(cwq.oh, on.bB);
      this.a(cwq.oi, on.bB);
      this.a(cwq.oA, on.bB);
      this.a(cwq.pk, on.bD);
      this.a(cwq.pl, on.bD);
      this.a(cwq.va, on.bB);
      this.a(cwq.pj, on.bD);
      this.a(cwq.pi, on.bD);
      this.a(cwq.ph, on.bD);
      this.a(cwq.vF, on.bB);
      this.a(cwq.so, on.bB);
      this.a(cwq.qS, on.bB);
      this.a(cwq.oB, on.bB);
      this.a(cwq.uO, on.bB);
      this.a(cwq.sJ, on.bB);
      this.a(cwq.sw, on.bB);
      this.a(cwq.vx, on.bB);
      this.a(cwq.un, on.bB);
      this.a(cwq.sE, on.bB);
      this.a(cwq.wy, on.bB);
      this.a(cwq.uM, on.bB);
      this.a(cwq.uo, on.bB);
      this.a(cwq.pX, on.bB);
      this.a(cwq.ot, on.bB);
      this.a(cwq.ww, on.bB);
      this.a(cwq.wq, on.bB);
      this.a(cwq.nO, on.bB);
      this.a(cwq.sy, on.bB);
      this.a(cwq.sB, on.bB);
      this.a(cwq.sK, on.bB);
      this.a(cwq.wu, on.bB);
      this.a(cwq.wO, on.bB);
      this.a(cwq.rp, on.bB);
      this.a(cwq.rx, on.bB);
      this.a(cwq.uv, on.bB);
      this.a(cwq.oJ, on.bB);
      this.a(cwq.qb, on.bB);
      this.a(cwq.pa, on.bD);
      this.a(cwq.uC, on.bB);
      this.a(cwq.pb, on.bD);
      this.a(cwq.uZ, on.bB);
      this.a(cwq.oZ, on.bD);
      this.a(cwq.oY, on.bD);
      this.a(cwq.oX, on.bD);
      this.a(cwq.oK, on.bB);
      this.a(cwq.sz, on.bB);
      this.a(cwq.rG, on.bB);
      this.a(cwq.rM, on.bB);
      this.a(cwq.pv, on.bB);
      this.a(cwq.wx, on.bB);
      this.a(cwq.wm, on.bB);
      this.a(cwq.wS, on.bB);
      this.a(cwq.wV, on.bB);
      this.a(cwq.nQ, on.bB);
      this.a(cwq.rw, on.bB);
      this.a(cwq.oF, on.bB);
      this.a(cwq.pf, on.bD);
      this.a(cwq.pg, on.bD);
      this.a(cwq.uY, on.bB);
      this.a(cwq.oG, on.bB);
      this.a(cwq.vN, on.bB);
      this.a(cwq.pe, on.bD);
      this.a(cwq.pd, on.bD);
      this.a(cwq.pc, on.bD);
      this.a(cwq.uu, on.bB);
      this.a(cwq.ob, on.bB);
      this.a(cwq.oc, on.bB);
      this.a(cwq.vO, on.bB);
      this.a(cwq.oC, on.bB);
      this.a(cwq.qB, on.bB);
      this.a(cwq.qE, on.bB);
      this.a(cwq.vb, on.bB);
      this.a(cwq.rC, on.bB);
      this.a(cwq.rH, on.bB);
      this.a(cwq.rE, on.bB);
      this.a(cwq.rB, on.bB);
      this.a(cwq.sG, on.bB);
      this.a(cwq.oj, on.bB);
      this.a(cwq.ok, on.bB);
      this.a(cwq.ol, on.bB);
      this.a(cwq.om, on.bB);
      this.a(cwq.uB, on.bB);
      this.a(cwq.sn, on.bB);
      this.a(cwq.qF, on.bB);
      this.a(cwq.nM, on.bB);
      this.a(cwq.wt, on.bB);
      this.a(cwq.ps, on.bB);
      this.a(cwq.wj, on.bB);
      this.a(cwq.wc, on.bC);
      this.a(cwq.vQ, on.bC);
      this.a(cwq.vS, on.bC);
      this.a(cwq.vR, on.bC);
      this.a(cwq.vT, on.bC);
      this.a(cwq.vU, on.bC);
      this.a(cwq.vV, on.bC);
      this.a(cwq.vW, on.bC);
      this.a(cwq.vX, on.bC);
      this.a(cwq.vY, on.bC);
      this.a(cwq.wh, on.bC);
      this.a(cwq.wi, on.bC);
      this.a(cwq.vZ, on.bC);
      this.a(cwq.wa, on.bC);
      this.a(cwq.wd, on.bC);
      this.a(cwq.wb, on.bC);
      this.a(cwq.we, on.bC);
      this.a(cwq.wf, on.bC);
      this.a(cwq.wg, on.bC);
      this.a(cwq.vf, on.bB);
      this.a(cwq.vd, on.bB);
      this.a(cwq.wl, on.bB);
      this.a(cwq.pp, on.bD);
      this.a(cwq.pq, on.bD);
      this.a(cwq.oL, on.bB);
      this.a(cwq.po, on.bD);
      this.a(cwq.oM, on.bB);
      this.a(cwq.pn, on.bD);
      this.a(cwq.pm, on.bD);
      this.a(cwq.uP, on.bB);
      this.a(cwq.uK, on.bB);
      this.a(cwq.nV, on.bB);
      this.a(cwq.nW, on.bB);
      this.a(cwq.rA, on.bB);
      this.a(cwq.qa, on.bB);
      this.a(cwq.qP, on.bB);
      this.a(cwq.nT, on.bB);
      this.a(cwq.wv, on.bB);
      this.a(cwq.rF, on.bB);
      this.a(cwq.uA, on.bB);
      this.a(cwq.vz, on.bB);
      this.a(cwq.pY, on.bB);
      this.a(cwq.qC, on.bB);
      this.a(cwq.uR, on.bB);
      this.a(cwq.uQ, on.bB);
      this.a(cwq.rt, on.bB);
      this.a(cwq.qG, on.bB);
      this.a(cwq.uL, on.bB);
      this.a(cwq.rJ, on.bB);
      this.a(cwq.oD, on.bB);
      this.a(cwq.uS, on.bB);
      this.a(cwq.uV, on.bB);
      this.a(cwq.uW, on.bB);
      this.a(cwq.uU, on.bB);
      this.a(cwq.rN, on.bB);
      this.a(cwq.sv, on.bB);
      this.a(cwq.nL, on.bB);
      this.a(cwq.rr, on.bB);
      this.a(cwq.qH, on.bB);
      this.a(cwq.oq, on.bB);
      this.a(cwq.sm, on.bB);
      this.a(cwq.vM, on.bB);
      this.a(cwq.ws, on.bB);
      this.a(cwq.qR, on.bB);
      this.a(cwq.qD, on.bB);
      this.a(cwq.xM, on.bB);
      this.a(cwq.vH, on.bB);
      this.a(cwq.sD, on.bB);
      this.a(cwq.nX, on.bB);
      this.a(cwq.nY, on.bB);
      this.a(cwq.ro, on.bB);
      this.a(cwq.pr, on.bD);
      this.a(cwq.oV, on.bD);
      this.a(cwq.oW, on.bD);
      this.a(cwq.oU, on.bD);
      this.a(cwq.oT, on.bD);
      this.a(cwq.oS, on.bD);
      this.a(cwq.rR, on.bB);
      this.a(cwq.wo, on.bB);
      this.a(cwq.nP, on.bB);
      this.a(cwq.vL, on.bB);
      this.a(cwq.wk, on.bB);
      this.a(cwq.rs, on.bB);
      this.a(cwq.qJ, on.bB);
      this.a(cwq.qK, on.bB);
      this.a(cwq.qL, on.bB);
      this.a(cwq.qA, on.bB);
      this.a(cwq.px, on.bB);
      this.a(cwq.rz, on.bB);
      this.a(cwq.up, on.bB);
      this.a(cwq.ut, on.bS);
      this.a(cwq.os);
      this.a(cwq.oQ, on.bD);
      this.a(cwq.oR, on.bD);
      this.a(cwq.oP, on.bD);
      this.a(cwq.oO, on.bD);
      this.a(cwq.oN, on.bD);
      this.a(cwq.uq, on.bB);
      this.a(cwq.ur, on.bB);
      this.a(cwq.rD, on.bB);
      this.a(cwq.xO, on.bB);
      this.a(cwq.xP, on.bB);
      this.a(cwq.xQ, on.bB);
      this.a(cwq.xR, on.bB);
      this.a(cwq.xS, on.bB);
      this.a(cwq.xT, on.bB);
      this.a(cwq.xU, on.bB);
      this.a(cwq.xV, on.bB);
      this.a(cwq.xW, on.bB);
      this.a(cwq.xX, on.bB);
      this.a(cwq.xY, on.bB);
      this.a(cwq.xZ, on.bB);
      this.a(cwq.ya, on.bB);
      this.a(cwq.yb, on.bB);
      this.a(cwq.yc, on.bB);
      this.a(cwq.yd, on.bB);
      this.a(cwq.ye, on.bB);
      this.a(cwq.yf, on.bB);
      this.a(cwq.yg, on.bB);
      this.a(cwq.vP, cwq.pr, on.bD);
      this.a(cwq.qc, cwq.qb, on.bB);
      Map<alj, ddw> $$0 = new HashMap<>();
      ddx.a($$0::put);

      for (cwi $$1 : lz.g) {
         ddy $$2 = $$1.g().a(ku.D);
         if ($$2 != null && $$2.a().a() == but.a.b && $$2.c().isPresent()) {
            alj $$3 = $$2.c().get();
            ddw $$4 = $$0.get($$3);
            if ($$4 == null) {
               throw new IllegalStateException("Referenced equipment model does not exist: " + $$3);
            }

            this.a($$1, $$3, $$4, $$2.a());
         }
      }

      this.a(cwq.yh, on.bB);
      this.a(cwq.yi, on.bB);
      this.a(cwq.yj, on.bB);
      this.a(cwq.yk, on.bB);
      this.a(cwq.yl, on.bB);
      this.a(cwq.ym, on.bB);
      this.a(cwq.yn, on.bB);
      this.a(cwq.yo, on.bB);
      this.a(cwq.yp, on.bB);
      this.a(cwq.yq, on.bB);
      this.a(cwq.yr, on.bB);
      this.a(cwq.ys, on.bB);
      this.a(cwq.yt, on.bB);
      this.a(cwq.yu, on.bB);
      this.a(cwq.yv, on.bB);
      this.a(cwq.yw, on.bB);
      this.a(cwq.yx, on.bB);
      this.a(cwq.yy, on.bB);
      this.a(cwq.yz, on.bB);
      this.a(cwq.yA, on.bB);
      this.a(cwq.yB, on.bB);
      this.a(cwq.yC, on.bB);
      this.a(cwq.yD, on.bB);
      this.a(cwq.yV, on.bB);
      this.a(cwq.yW, on.bB);
      this.a(cwq.yY, on.bB);
      this.a(cwq.qV, on.bB);
      this.a(cwq.rl, on.bB);
      this.a(cwq.qW, on.bB);
      this.a(cwq.rd, on.bB);
      this.a(cwq.re, on.bB);
      this.a(cwq.qZ, on.bB);
      this.a(cwq.rh, on.bB);
      this.a(cwq.rf, on.bB);
      this.a(cwq.ra, on.bB);
      this.a(cwq.rk, on.bB);
      this.a(cwq.rg, on.bB);
      this.a(cwq.qY, on.bB);
      this.a(cwq.rc, on.bB);
      this.a(cwq.rj, on.bB);
      this.a(cwq.rb, on.bB);
      this.a(cwq.ri, on.bB);
      this.a(cwq.qX, on.bB);
   }

   static record a(String a, float b, Map<alj, String> c) {
      public String a(alj $$0) {
         return this.c.getOrDefault($$0, this.a);
      }
   }
}
