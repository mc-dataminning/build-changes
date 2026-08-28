import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Supplier;

public class nz {
   public static final alp a = alp.b("trim_type");
   private static final List<nz.a> b = List.of(
      new nz.a("quartz", 0.01F, Map.of()),
      new nz.a("iron", 0.02F, Map.of(dfk.c, "iron_darker")),
      new nz.a("netherite", 0.03F, Map.of(dfk.g, "netherite_darker")),
      new nz.a("redstone", 0.04F, Map.of()),
      new nz.a("copper", 0.05F, Map.of()),
      new nz.a("gold", 0.06F, Map.of(dfk.d, "gold_darker")),
      new nz.a("emerald", 0.07F, Map.of()),
      new nz.a("diamond", 0.08F, Map.of(dfk.e, "diamond_darker")),
      new nz.a("lapis", 0.09F, Map.of()),
      new nz.a("amethyst", 0.1F, Map.of()),
      new nz.a("resin", 0.11F, Map.of())
   );
   private final BiConsumer<alp, Supplier<JsonElement>> c;

   public nz(BiConsumer<alp, Supplier<JsonElement>> $$0) {
      this.c = $$0;
   }

   private void a(cxc $$0, on $$1) {
      $$1.a(om.a($$0), op.b($$0), this.c);
   }

   private void a(cxc $$0, String $$1, on $$2) {
      $$2.a(om.a($$0, $$1), op.k(op.a($$0, $$1)), this.c);
   }

   private void a(cxc $$0, cxc $$1, on $$2) {
      $$2.a(om.a($$0), op.b($$1), this.c);
   }

   private void a(cxc $$0) {
      this.a(om.a($$0), op.c($$0), op.a($$0, "_overlay"));
   }

   private void b(cxc $$0) {
      for (int $$1 = 0; $$1 < 32; $$1++) {
         if ($$1 != 16) {
            this.a($$0, String.format(Locale.ROOT, "_%02d", $$1), oo.bE);
         }
      }
   }

   private void c(cxc $$0) {
      for (int $$1 = 1; $$1 < 64; $$1++) {
         this.a($$0, String.format(Locale.ROOT, "_%02d", $$1), oo.bE);
      }
   }

   private void a(alp $$0, alp $$1, alp $$2) {
      oo.bI.a($$0, op.c($$1, $$2), this.c);
   }

   private void a(alp $$0, alp $$1, alp $$2, alp $$3) {
      oo.bJ.a($$0, op.a($$1, $$2, $$3), this.c);
   }

   private alp a(alp $$0, String $$1) {
      return $$0.g("_" + $$1 + "_trim");
   }

   private JsonObject a(alp $$0, Map<oq, alp> $$1, alp $$2) {
      JsonObject $$3 = oo.bI.a($$0, $$1);
      JsonArray $$4 = new JsonArray();

      for (nz.a $$5 : b) {
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

   private void a(cxc $$0, alp $$1, dfj $$2, bvj $$3) {
      List<dfj.c> $$4 = $$2.a(dfj.d.a);
      if (!$$4.isEmpty()) {
         boolean $$5 = $$4.size() == 2 && $$4.getFirst().b().isPresent();
         alp $$6 = om.a($$0);
         alp $$7 = op.c($$0);
         alp $$8 = op.a($$0, "_overlay");
         if ($$5) {
            oo.bI.a($$6, op.c($$7, $$8), this.c, ($$1x, $$2x) -> this.a($$1x, $$2x, $$1));
         } else {
            oo.bE.a($$6, op.k($$7), this.c, ($$1x, $$2x) -> this.a($$1x, $$2x, $$1));
         }
         String $$9 = switch ($$3) {
            case f -> "helmet";
            case e -> "chestplate";
            case d -> "leggings";
            case c -> "boots";
            default -> throw new UnsupportedOperationException();
         };

         for (nz.a $$10 : b) {
            String $$11 = $$10.a($$1);
            alp $$12 = this.a($$6, $$11);
            String $$13 = $$9 + "_trim_" + $$11;
            alp $$14 = alp.b($$13).f("trims/items/");
            if ($$5) {
               this.a($$12, $$7, $$8, $$14);
            } else {
               this.a($$12, $$7, $$14);
            }
         }
      }
   }

   public void a() {
      this.a(cxk.oF, oo.bE);
      this.a(cxk.oH, oo.bE);
      this.a(cxk.oG, oo.bE);
      this.a(cxk.oI, oo.bE);
      this.a(cxk.pi, oo.bE);
      this.a(cxk.oZ, oo.bE);
      this.a(cxk.oV, oo.bE);
      this.a(cxk.vF, oo.bE);
      this.a(cxk.pb, oo.bE);
      this.a(cxk.vg, oo.bE);
      this.a(cxk.ed, oo.bG);
      this.a(cxk.sX, oo.bE);
      this.a(cxk.wk, oo.bE);
      this.a(cxk.wm, oo.bE);
      this.a(cxk.oB, oo.bE);
      this.a(cxk.oC, oo.bE);
      this.a(cxk.su, oo.bE);
      this.a(cxk.tl, oo.bE);
      this.a(cxk.td, oo.bG);
      this.a(cxk.sq, oo.bE);
      this.a(cxk.sv, oo.bE);
      this.a(cxk.xh, oo.bE);
      this.a(cxk.rw, oo.bE);
      this.a(cxk.oY, oo.bE);
      this.a(cxk.qc, oo.bE);
      this.a(cxk.rs, oo.bE);
      this.a(cxk.uZ, oo.bG);
      this.a(cxk.sr, oo.bE);
      this.a(cxk.rf, oo.bE);
      this.a(cxk.ot, oo.bH);
      this.a(cxk.ou, oo.bH);
      this.a(cxk.pd, oo.bE);
      this.a(cxk.op, oo.bE);
      this.a(cxk.sZ, oo.bE);
      this.a(cxk.wg, oo.bE);
      this.a(cxk.rt, oo.bE);
      this.c(cxk.rT);
      this.a(cxk.pc, oo.bE);
      this.a(cxk.ro, oo.bE);
      this.a(cxk.vM, oo.bE);
      this.b(cxk.rz);
      this.b(cxk.rA);
      this.a(cxk.sY, oo.bE);
      this.a(cxk.ta, oo.bE);
      this.a(cxk.sa, oo.bE);
      this.a(cxk.vO, oo.bE);
      this.a(cxk.qD, oo.bE);
      this.a(cxk.vB, oo.bE);
      this.a(cxk.sb, oo.bE);
      this.a(cxk.sP, oo.bE);
      this.a(cxk.pl, oo.bE);
      this.a(cxk.pm, oo.bE);
      this.a(cxk.wZ, oo.bE);
      this.a(cxk.so, oo.bE);
      this.a(cxk.oJ, oo.bE);
      this.a(cxk.oK, oo.bE);
      this.a(cxk.pe, oo.bE);
      this.a(cxk.pO, oo.bG);
      this.a(cxk.pP, oo.bG);
      this.a(cxk.vI, oo.bE);
      this.a(cxk.pN, oo.bG);
      this.a(cxk.pM, oo.bG);
      this.a(cxk.pL, oo.bG);
      this.a(cxk.wn, oo.bE);
      this.a(cxk.sU, oo.bE);
      this.a(cxk.ry, oo.bE);
      this.a(cxk.pf, oo.bE);
      this.a(cxk.vv, oo.bE);
      this.a(cxk.tp, oo.bE);
      this.a(cxk.tc, oo.bE);
      this.a(cxk.wf, oo.bE);
      this.a(cxk.uU, oo.bE);
      this.a(cxk.tk, oo.bE);
      this.a(cxk.xg, oo.bE);
      this.a(cxk.vt, oo.bE);
      this.a(cxk.uV, oo.bE);
      this.a(cxk.qB, oo.bE);
      this.a(cxk.oX, oo.bE);
      this.a(cxk.xe, oo.bE);
      this.a(cxk.wY, oo.bE);
      this.a(cxk.oq, oo.bE);
      this.a(cxk.te, oo.bE);
      this.a(cxk.th, oo.bE);
      this.a(cxk.tq, oo.bE);
      this.a(cxk.xc, oo.bE);
      this.a(cxk.xw, oo.bE);
      this.a(cxk.rV, oo.bE);
      this.a(cxk.sd, oo.bE);
      this.a(cxk.vc, oo.bE);
      this.a(cxk.pn, oo.bE);
      this.a(cxk.qF, oo.bE);
      this.a(cxk.pE, oo.bG);
      this.a(cxk.vj, oo.bE);
      this.a(cxk.pF, oo.bG);
      this.a(cxk.vH, oo.bE);
      this.a(cxk.pD, oo.bG);
      this.a(cxk.pC, oo.bG);
      this.a(cxk.pB, oo.bG);
      this.a(cxk.po, oo.bE);
      this.a(cxk.tf, oo.bE);
      this.a(cxk.sm, oo.bE);
      this.a(cxk.ss, oo.bE);
      this.a(cxk.pZ, oo.bE);
      this.a(cxk.xf, oo.bE);
      this.a(cxk.wU, oo.bE);
      this.a(cxk.xA, oo.bE);
      this.a(cxk.xD, oo.bE);
      this.a(cxk.os, oo.bE);
      this.a(cxk.sc, oo.bE);
      this.a(cxk.pj, oo.bE);
      this.a(cxk.pJ, oo.bG);
      this.a(cxk.pK, oo.bG);
      this.a(cxk.vG, oo.bE);
      this.a(cxk.pk, oo.bE);
      this.a(cxk.wv, oo.bE);
      this.a(cxk.pI, oo.bG);
      this.a(cxk.pH, oo.bG);
      this.a(cxk.pG, oo.bG);
      this.a(cxk.vb, oo.bE);
      this.a(cxk.oD, oo.bE);
      this.a(cxk.oE, oo.bE);
      this.a(cxk.ww, oo.bE);
      this.a(cxk.pg, oo.bE);
      this.a(cxk.rh, oo.bE);
      this.a(cxk.rk, oo.bE);
      this.a(cxk.vJ, oo.bE);
      this.a(cxk.si, oo.bE);
      this.a(cxk.sn, oo.bE);
      this.a(cxk.sk, oo.bE);
      this.a(cxk.sh, oo.bE);
      this.a(cxk.tm, oo.bE);
      this.a(cxk.oN, oo.bE);
      this.a(cxk.oO, oo.bE);
      this.a(cxk.oP, oo.bE);
      this.a(cxk.oQ, oo.bE);
      this.a(cxk.vi, oo.bE);
      this.a(cxk.sT, oo.bE);
      this.a(cxk.rl, oo.bE);
      this.a(cxk.oo, oo.bE);
      this.a(cxk.xb, oo.bE);
      this.a(cxk.pW, oo.bE);
      this.a(cxk.wR, oo.bE);
      this.a(cxk.wK, oo.bF);
      this.a(cxk.wy, oo.bF);
      this.a(cxk.wA, oo.bF);
      this.a(cxk.wz, oo.bF);
      this.a(cxk.wB, oo.bF);
      this.a(cxk.wC, oo.bF);
      this.a(cxk.wD, oo.bF);
      this.a(cxk.wE, oo.bF);
      this.a(cxk.wF, oo.bF);
      this.a(cxk.wG, oo.bF);
      this.a(cxk.wP, oo.bF);
      this.a(cxk.wQ, oo.bF);
      this.a(cxk.wH, oo.bF);
      this.a(cxk.wI, oo.bF);
      this.a(cxk.wL, oo.bF);
      this.a(cxk.wJ, oo.bF);
      this.a(cxk.wM, oo.bF);
      this.a(cxk.wN, oo.bF);
      this.a(cxk.wO, oo.bF);
      this.a(cxk.vN, oo.bE);
      this.a(cxk.vL, oo.bE);
      this.a(cxk.wT, oo.bE);
      this.a(cxk.pT, oo.bG);
      this.a(cxk.pU, oo.bG);
      this.a(cxk.pp, oo.bE);
      this.a(cxk.pS, oo.bG);
      this.a(cxk.pq, oo.bE);
      this.a(cxk.pR, oo.bG);
      this.a(cxk.pQ, oo.bG);
      this.a(cxk.vw, oo.bE);
      this.a(cxk.vx, oo.bE);
      this.a(cxk.vr, oo.bE);
      this.a(cxk.ox, oo.bE);
      this.a(cxk.oy, oo.bE);
      this.a(cxk.sg, oo.bE);
      this.a(cxk.qE, oo.bE);
      this.a(cxk.oL, oo.bE);
      this.a(cxk.oM, oo.bE);
      this.a(cxk.rv, oo.bE);
      this.a(cxk.ov, oo.bE);
      this.a(cxk.xd, oo.bE);
      this.a(cxk.sl, oo.bE);
      this.a(cxk.vh, oo.bE);
      this.a(cxk.wh, oo.bE);
      this.a(cxk.qC, oo.bE);
      this.a(cxk.ri, oo.bE);
      this.a(cxk.vz, oo.bE);
      this.a(cxk.vy, oo.bE);
      this.a(cxk.rZ, oo.bE);
      this.a(cxk.rm, oo.bE);
      this.a(cxk.vs, oo.bE);
      this.a(cxk.sp, oo.bE);
      this.a(cxk.ph, oo.bE);
      this.a(cxk.vA, oo.bE);
      this.a(cxk.vD, oo.bE);
      this.a(cxk.vE, oo.bE);
      this.a(cxk.vC, oo.bE);
      this.a(cxk.st, oo.bE);
      this.a(cxk.tb, oo.bE);
      this.a(cxk.on, oo.bE);
      this.a(cxk.rX, oo.bE);
      this.a(cxk.rn, oo.bE);
      this.a(cxk.oU, oo.bE);
      this.a(cxk.sS, oo.bE);
      this.a(cxk.wu, oo.bE);
      this.a(cxk.xa, oo.bE);
      this.a(cxk.rx, oo.bE);
      this.a(cxk.rj, oo.bE);
      this.a(cxk.yu, oo.bE);
      this.a(cxk.wp, oo.bE);
      this.a(cxk.tj, oo.bE);
      this.a(cxk.oz, oo.bE);
      this.a(cxk.oA, oo.bE);
      this.a(cxk.rU, oo.bE);
      this.a(cxk.pV, oo.bG);
      this.a(cxk.pz, oo.bG);
      this.a(cxk.pA, oo.bG);
      this.a(cxk.py, oo.bG);
      this.a(cxk.px, oo.bG);
      this.a(cxk.pw, oo.bG);
      this.a(cxk.sx, oo.bE);
      this.a(cxk.wW, oo.bE);
      this.a(cxk.or, oo.bE);
      this.a(cxk.wt, oo.bE);
      this.a(cxk.wS, oo.bE);
      this.a(cxk.rY, oo.bE);
      this.a(cxk.rp, oo.bE);
      this.a(cxk.rq, oo.bE);
      this.a(cxk.rr, oo.bE);
      this.a(cxk.rg, oo.bE);
      this.a(cxk.qb, oo.bE);
      this.a(cxk.sf, oo.bE);
      this.a(cxk.uW, oo.bE);
      this.a(cxk.va, oo.bV);
      this.a(cxk.oW);
      this.a(cxk.pu, oo.bG);
      this.a(cxk.pv, oo.bG);
      this.a(cxk.pt, oo.bG);
      this.a(cxk.ps, oo.bG);
      this.a(cxk.pr, oo.bG);
      this.a(cxk.uX, oo.bE);
      this.a(cxk.uY, oo.bE);
      this.a(cxk.sj, oo.bE);
      this.a(cxk.yw, oo.bE);
      this.a(cxk.yx, oo.bE);
      this.a(cxk.yy, oo.bE);
      this.a(cxk.yz, oo.bE);
      this.a(cxk.yA, oo.bE);
      this.a(cxk.yB, oo.bE);
      this.a(cxk.yC, oo.bE);
      this.a(cxk.yD, oo.bE);
      this.a(cxk.yE, oo.bE);
      this.a(cxk.yF, oo.bE);
      this.a(cxk.yG, oo.bE);
      this.a(cxk.yH, oo.bE);
      this.a(cxk.yI, oo.bE);
      this.a(cxk.yJ, oo.bE);
      this.a(cxk.yK, oo.bE);
      this.a(cxk.yL, oo.bE);
      this.a(cxk.yM, oo.bE);
      this.a(cxk.yN, oo.bE);
      this.a(cxk.yO, oo.bE);
      this.a(cxk.wx, cxk.pV, oo.bG);
      this.a(cxk.qG, cxk.qF, oo.bE);
      Map<alp, dfj> $$0 = new HashMap<>();
      dfk.a($$0::put);

      for (cxc $$1 : ma.g) {
         dfl $$2 = $$1.g().a(ku.D);
         if ($$2 != null && $$2.a().a() == bvj.a.b && $$2.c().isPresent()) {
            alp $$3 = $$2.c().get();
            dfj $$4 = $$0.get($$3);
            if ($$4 == null) {
               throw new IllegalStateException("Referenced equipment model does not exist: " + $$3);
            }

            this.a($$1, $$3, $$4, $$2.a());
         }
      }

      this.a(cxk.yP, oo.bE);
      this.a(cxk.yQ, oo.bE);
      this.a(cxk.yR, oo.bE);
      this.a(cxk.yS, oo.bE);
      this.a(cxk.yT, oo.bE);
      this.a(cxk.yU, oo.bE);
      this.a(cxk.yV, oo.bE);
      this.a(cxk.yW, oo.bE);
      this.a(cxk.yX, oo.bE);
      this.a(cxk.yY, oo.bE);
      this.a(cxk.yZ, oo.bE);
      this.a(cxk.za, oo.bE);
      this.a(cxk.zb, oo.bE);
      this.a(cxk.zc, oo.bE);
      this.a(cxk.zd, oo.bE);
      this.a(cxk.ze, oo.bE);
      this.a(cxk.zf, oo.bE);
      this.a(cxk.zg, oo.bE);
      this.a(cxk.zh, oo.bE);
      this.a(cxk.zi, oo.bE);
      this.a(cxk.zj, oo.bE);
      this.a(cxk.zk, oo.bE);
      this.a(cxk.zl, oo.bE);
      this.a(cxk.zD, oo.bE);
      this.a(cxk.zE, oo.bE);
      this.a(cxk.zG, oo.bE);
      this.a(cxk.rB, oo.bE);
      this.a(cxk.rR, oo.bE);
      this.a(cxk.rC, oo.bE);
      this.a(cxk.rJ, oo.bE);
      this.a(cxk.rK, oo.bE);
      this.a(cxk.rF, oo.bE);
      this.a(cxk.rN, oo.bE);
      this.a(cxk.rL, oo.bE);
      this.a(cxk.rG, oo.bE);
      this.a(cxk.rQ, oo.bE);
      this.a(cxk.rM, oo.bE);
      this.a(cxk.rE, oo.bE);
      this.a(cxk.rI, oo.bE);
      this.a(cxk.rP, oo.bE);
      this.a(cxk.rH, oo.bE);
      this.a(cxk.rO, oo.bE);
      this.a(cxk.rD, oo.bE);
   }

   static record a(String a, float b, Map<alp, String> c) {
      public String a(alp $$0) {
         return this.c.getOrDefault($$0, this.a);
      }
   }
}
