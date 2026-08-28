import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Supplier;

public class od {
   public static final alz a = alz.b("trim_type");
   private static final List<od.a> b = List.of(
      new od.a("quartz", 0.1F, Map.of()),
      new od.a("iron", 0.2F, Map.of(dfl.c, "iron_darker")),
      new od.a("netherite", 0.3F, Map.of(dfl.g, "netherite_darker")),
      new od.a("redstone", 0.4F, Map.of()),
      new od.a("copper", 0.5F, Map.of()),
      new od.a("gold", 0.6F, Map.of(dfl.d, "gold_darker")),
      new od.a("emerald", 0.7F, Map.of()),
      new od.a("diamond", 0.8F, Map.of(dfl.e, "diamond_darker")),
      new od.a("lapis", 0.9F, Map.of()),
      new od.a("amethyst", 1.0F, Map.of())
   );
   private final BiConsumer<alz, Supplier<JsonElement>> c;

   public od(BiConsumer<alz, Supplier<JsonElement>> $$0) {
      this.c = $$0;
   }

   private void a(cxg $$0, or $$1) {
      $$1.a(oq.a($$0), ot.b($$0), this.c);
   }

   private void a(cxg $$0, String $$1, or $$2) {
      $$2.a(oq.a($$0, $$1), ot.k(ot.a($$0, $$1)), this.c);
   }

   private void a(cxg $$0, cxg $$1, or $$2) {
      $$2.a(oq.a($$0), ot.b($$1), this.c);
   }

   private void a(cxg $$0) {
      this.a(oq.a($$0), ot.c($$0), ot.a($$0, "_overlay"));
   }

   private void b(cxg $$0) {
      for (int $$1 = 0; $$1 < 32; $$1++) {
         if ($$1 != 16) {
            this.a($$0, String.format(Locale.ROOT, "_%02d", $$1), os.bC);
         }
      }
   }

   private void c(cxg $$0) {
      for (int $$1 = 1; $$1 < 64; $$1++) {
         this.a($$0, String.format(Locale.ROOT, "_%02d", $$1), os.bC);
      }
   }

   private void a(alz $$0, alz $$1, alz $$2) {
      os.bG.a($$0, ot.c($$1, $$2), this.c);
   }

   private void a(alz $$0, alz $$1, alz $$2, alz $$3) {
      os.bH.a($$0, ot.a($$1, $$2, $$3), this.c);
   }

   private alz a(alz $$0, String $$1) {
      return $$0.g("_" + $$1 + "_trim");
   }

   private JsonObject a(alz $$0, Map<ou, alz> $$1, alz $$2) {
      JsonObject $$3 = os.bG.a($$0, $$1);
      JsonArray $$4 = new JsonArray();

      for (od.a $$5 : b) {
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

   private void a(cxg $$0, alz $$1, dfk $$2, bvn $$3) {
      List<dfk.c> $$4 = $$2.a(dfk.d.a);
      if (!$$4.isEmpty()) {
         boolean $$5 = $$4.size() == 2 && $$4.getFirst().b().isPresent();
         alz $$6 = oq.a($$0);
         alz $$7 = ot.c($$0);
         alz $$8 = ot.a($$0, "_overlay");
         if ($$5) {
            os.bG.a($$6, ot.c($$7, $$8), this.c, ($$1x, $$2x) -> this.a($$1x, $$2x, $$1));
         } else {
            os.bC.a($$6, ot.k($$7), this.c, ($$1x, $$2x) -> this.a($$1x, $$2x, $$1));
         }
         String $$9 = switch ($$3) {
            case f -> "helmet";
            case e -> "chestplate";
            case d -> "leggings";
            case c -> "boots";
            default -> throw new UnsupportedOperationException();
         };

         for (od.a $$10 : b) {
            String $$11 = $$10.a($$1);
            alz $$12 = this.a($$6, $$11);
            String $$13 = $$9 + "_trim_" + $$11;
            alz $$14 = alz.b($$13).f("trims/items/");
            if ($$5) {
               this.a($$12, $$7, $$8, $$14);
            } else {
               this.a($$12, $$7, $$14);
            }
         }
      }
   }

   public void a() {
      this.a(cxo.ow, os.bC);
      this.a(cxo.oy, os.bC);
      this.a(cxo.ox, os.bC);
      this.a(cxo.oz, os.bC);
      this.a(cxo.oZ, os.bC);
      this.a(cxo.oQ, os.bC);
      this.a(cxo.oM, os.bC);
      this.a(cxo.vv, os.bC);
      this.a(cxo.oS, os.bC);
      this.a(cxo.uX, os.bC);
      this.a(cxo.eb, os.bE);
      this.a(cxo.sO, os.bC);
      this.a(cxo.wa, os.bC);
      this.a(cxo.wc, os.bC);
      this.a(cxo.os, os.bC);
      this.a(cxo.ot, os.bC);
      this.a(cxo.sl, os.bC);
      this.a(cxo.tc, os.bC);
      this.a(cxo.sU, os.bE);
      this.a(cxo.sh, os.bC);
      this.a(cxo.sm, os.bC);
      this.a(cxo.wX, os.bC);
      this.a(cxo.rn, os.bC);
      this.a(cxo.oP, os.bC);
      this.a(cxo.pT, os.bC);
      this.a(cxo.rj, os.bC);
      this.a(cxo.uQ, os.bE);
      this.a(cxo.si, os.bC);
      this.a(cxo.qW, os.bC);
      this.a(cxo.ok, os.bF);
      this.a(cxo.ol, os.bF);
      this.a(cxo.oU, os.bC);
      this.a(cxo.og, os.bC);
      this.a(cxo.sQ, os.bC);
      this.a(cxo.vW, os.bC);
      this.a(cxo.rk, os.bC);
      this.c(cxo.rK);
      this.a(cxo.oT, os.bC);
      this.a(cxo.rf, os.bC);
      this.a(cxo.vC, os.bC);
      this.b(cxo.rq);
      this.b(cxo.rr);
      this.a(cxo.sP, os.bC);
      this.a(cxo.sR, os.bC);
      this.a(cxo.rR, os.bC);
      this.a(cxo.vE, os.bC);
      this.a(cxo.qu, os.bC);
      this.a(cxo.vr, os.bC);
      this.a(cxo.rS, os.bC);
      this.a(cxo.sG, os.bC);
      this.a(cxo.pc, os.bC);
      this.a(cxo.pd, os.bC);
      this.a(cxo.wP, os.bC);
      this.a(cxo.sf, os.bC);
      this.a(cxo.oA, os.bC);
      this.a(cxo.oB, os.bC);
      this.a(cxo.oV, os.bC);
      this.a(cxo.pF, os.bE);
      this.a(cxo.pG, os.bE);
      this.a(cxo.vy, os.bC);
      this.a(cxo.pE, os.bE);
      this.a(cxo.pD, os.bE);
      this.a(cxo.pC, os.bE);
      this.a(cxo.wd, os.bC);
      this.a(cxo.sL, os.bC);
      this.a(cxo.rp, os.bC);
      this.a(cxo.oW, os.bC);
      this.a(cxo.vm, os.bC);
      this.a(cxo.tg, os.bC);
      this.a(cxo.sT, os.bC);
      this.a(cxo.vV, os.bC);
      this.a(cxo.uL, os.bC);
      this.a(cxo.tb, os.bC);
      this.a(cxo.wW, os.bC);
      this.a(cxo.vk, os.bC);
      this.a(cxo.uM, os.bC);
      this.a(cxo.qs, os.bC);
      this.a(cxo.oO, os.bC);
      this.a(cxo.wU, os.bC);
      this.a(cxo.wO, os.bC);
      this.a(cxo.oh, os.bC);
      this.a(cxo.sV, os.bC);
      this.a(cxo.sY, os.bC);
      this.a(cxo.th, os.bC);
      this.a(cxo.wS, os.bC);
      this.a(cxo.xm, os.bC);
      this.a(cxo.rM, os.bC);
      this.a(cxo.rU, os.bC);
      this.a(cxo.uT, os.bC);
      this.a(cxo.pe, os.bC);
      this.a(cxo.qw, os.bC);
      this.a(cxo.pv, os.bE);
      this.a(cxo.va, os.bC);
      this.a(cxo.pw, os.bE);
      this.a(cxo.vx, os.bC);
      this.a(cxo.pu, os.bE);
      this.a(cxo.pt, os.bE);
      this.a(cxo.ps, os.bE);
      this.a(cxo.pf, os.bC);
      this.a(cxo.sW, os.bC);
      this.a(cxo.sd, os.bC);
      this.a(cxo.sj, os.bC);
      this.a(cxo.pQ, os.bC);
      this.a(cxo.wV, os.bC);
      this.a(cxo.wK, os.bC);
      this.a(cxo.xq, os.bC);
      this.a(cxo.xt, os.bC);
      this.a(cxo.oj, os.bC);
      this.a(cxo.rT, os.bC);
      this.a(cxo.pa, os.bC);
      this.a(cxo.pA, os.bE);
      this.a(cxo.pB, os.bE);
      this.a(cxo.vw, os.bC);
      this.a(cxo.pb, os.bC);
      this.a(cxo.wl, os.bC);
      this.a(cxo.pz, os.bE);
      this.a(cxo.py, os.bE);
      this.a(cxo.px, os.bE);
      this.a(cxo.uS, os.bC);
      this.a(cxo.ou, os.bC);
      this.a(cxo.ov, os.bC);
      this.a(cxo.wm, os.bC);
      this.a(cxo.oX, os.bC);
      this.a(cxo.qY, os.bC);
      this.a(cxo.rb, os.bC);
      this.a(cxo.vz, os.bC);
      this.a(cxo.rZ, os.bC);
      this.a(cxo.se, os.bC);
      this.a(cxo.sb, os.bC);
      this.a(cxo.rY, os.bC);
      this.a(cxo.td, os.bC);
      this.a(cxo.oE, os.bC);
      this.a(cxo.oF, os.bC);
      this.a(cxo.oG, os.bC);
      this.a(cxo.oH, os.bC);
      this.a(cxo.uZ, os.bC);
      this.a(cxo.sK, os.bC);
      this.a(cxo.rc, os.bC);
      this.a(cxo.of, os.bC);
      this.a(cxo.wR, os.bC);
      this.a(cxo.pN, os.bC);
      this.a(cxo.wH, os.bC);
      this.a(cxo.wA, os.bD);
      this.a(cxo.wo, os.bD);
      this.a(cxo.wq, os.bD);
      this.a(cxo.wp, os.bD);
      this.a(cxo.wr, os.bD);
      this.a(cxo.ws, os.bD);
      this.a(cxo.wt, os.bD);
      this.a(cxo.wu, os.bD);
      this.a(cxo.wv, os.bD);
      this.a(cxo.ww, os.bD);
      this.a(cxo.wF, os.bD);
      this.a(cxo.wG, os.bD);
      this.a(cxo.wx, os.bD);
      this.a(cxo.wy, os.bD);
      this.a(cxo.wB, os.bD);
      this.a(cxo.wz, os.bD);
      this.a(cxo.wC, os.bD);
      this.a(cxo.wD, os.bD);
      this.a(cxo.wE, os.bD);
      this.a(cxo.vD, os.bC);
      this.a(cxo.vB, os.bC);
      this.a(cxo.wJ, os.bC);
      this.a(cxo.pK, os.bE);
      this.a(cxo.pL, os.bE);
      this.a(cxo.pg, os.bC);
      this.a(cxo.pJ, os.bE);
      this.a(cxo.ph, os.bC);
      this.a(cxo.pI, os.bE);
      this.a(cxo.pH, os.bE);
      this.a(cxo.vn, os.bC);
      this.a(cxo.vi, os.bC);
      this.a(cxo.oo, os.bC);
      this.a(cxo.op, os.bC);
      this.a(cxo.rX, os.bC);
      this.a(cxo.qv, os.bC);
      this.a(cxo.oC, os.bC);
      this.a(cxo.oD, os.bC);
      this.a(cxo.rm, os.bC);
      this.a(cxo.om, os.bC);
      this.a(cxo.wT, os.bC);
      this.a(cxo.sc, os.bC);
      this.a(cxo.uY, os.bC);
      this.a(cxo.vX, os.bC);
      this.a(cxo.qt, os.bC);
      this.a(cxo.qZ, os.bC);
      this.a(cxo.vp, os.bC);
      this.a(cxo.vo, os.bC);
      this.a(cxo.rQ, os.bC);
      this.a(cxo.rd, os.bC);
      this.a(cxo.vj, os.bC);
      this.a(cxo.sg, os.bC);
      this.a(cxo.oY, os.bC);
      this.a(cxo.vq, os.bC);
      this.a(cxo.vt, os.bC);
      this.a(cxo.vu, os.bC);
      this.a(cxo.vs, os.bC);
      this.a(cxo.sk, os.bC);
      this.a(cxo.sS, os.bC);
      this.a(cxo.oe, os.bC);
      this.a(cxo.rO, os.bC);
      this.a(cxo.re, os.bC);
      this.a(cxo.oL, os.bC);
      this.a(cxo.sJ, os.bC);
      this.a(cxo.wk, os.bC);
      this.a(cxo.wQ, os.bC);
      this.a(cxo.ro, os.bC);
      this.a(cxo.ra, os.bC);
      this.a(cxo.yk, os.bC);
      this.a(cxo.wf, os.bC);
      this.a(cxo.ta, os.bC);
      this.a(cxo.oq, os.bC);
      this.a(cxo.or, os.bC);
      this.a(cxo.rL, os.bC);
      this.a(cxo.pM, os.bE);
      this.a(cxo.pq, os.bE);
      this.a(cxo.pr, os.bE);
      this.a(cxo.pp, os.bE);
      this.a(cxo.po, os.bE);
      this.a(cxo.pn, os.bE);
      this.a(cxo.so, os.bC);
      this.a(cxo.wM, os.bC);
      this.a(cxo.oi, os.bC);
      this.a(cxo.wj, os.bC);
      this.a(cxo.wI, os.bC);
      this.a(cxo.rP, os.bC);
      this.a(cxo.rg, os.bC);
      this.a(cxo.rh, os.bC);
      this.a(cxo.ri, os.bC);
      this.a(cxo.qX, os.bC);
      this.a(cxo.pS, os.bC);
      this.a(cxo.rW, os.bC);
      this.a(cxo.uN, os.bC);
      this.a(cxo.uR, os.bT);
      this.a(cxo.oN);
      this.a(cxo.pl, os.bE);
      this.a(cxo.pm, os.bE);
      this.a(cxo.pk, os.bE);
      this.a(cxo.pj, os.bE);
      this.a(cxo.pi, os.bE);
      this.a(cxo.uO, os.bC);
      this.a(cxo.uP, os.bC);
      this.a(cxo.sa, os.bC);
      this.a(cxo.ym, os.bC);
      this.a(cxo.yn, os.bC);
      this.a(cxo.yo, os.bC);
      this.a(cxo.yp, os.bC);
      this.a(cxo.yq, os.bC);
      this.a(cxo.yr, os.bC);
      this.a(cxo.ys, os.bC);
      this.a(cxo.yt, os.bC);
      this.a(cxo.yu, os.bC);
      this.a(cxo.yv, os.bC);
      this.a(cxo.yw, os.bC);
      this.a(cxo.yx, os.bC);
      this.a(cxo.yy, os.bC);
      this.a(cxo.yz, os.bC);
      this.a(cxo.yA, os.bC);
      this.a(cxo.yB, os.bC);
      this.a(cxo.yC, os.bC);
      this.a(cxo.yD, os.bC);
      this.a(cxo.yE, os.bC);
      this.a(cxo.wn, cxo.pM, os.bE);
      this.a(cxo.qx, cxo.qw, os.bC);
      Map<alz, dfk> $$0 = new HashMap<>();
      dfl.a($$0::put);

      for (cxg $$1 : ma.g) {
         dfm $$2 = $$1.g().a(ku.D);
         if ($$2 != null && $$2.a().a() == bvn.a.b && $$2.c().isPresent()) {
            alz $$3 = $$2.c().get();
            dfk $$4 = $$0.get($$3);
            if ($$4 == null) {
               throw new IllegalStateException("Referenced equipment model does not exist: " + $$3);
            }

            this.a($$1, $$3, $$4, $$2.a());
         }
      }

      this.a(cxo.yF, os.bC);
      this.a(cxo.yG, os.bC);
      this.a(cxo.yH, os.bC);
      this.a(cxo.yI, os.bC);
      this.a(cxo.yJ, os.bC);
      this.a(cxo.yK, os.bC);
      this.a(cxo.yL, os.bC);
      this.a(cxo.yM, os.bC);
      this.a(cxo.yN, os.bC);
      this.a(cxo.yO, os.bC);
      this.a(cxo.yP, os.bC);
      this.a(cxo.yQ, os.bC);
      this.a(cxo.yR, os.bC);
      this.a(cxo.yS, os.bC);
      this.a(cxo.yT, os.bC);
      this.a(cxo.yU, os.bC);
      this.a(cxo.yV, os.bC);
      this.a(cxo.yW, os.bC);
      this.a(cxo.yX, os.bC);
      this.a(cxo.yY, os.bC);
      this.a(cxo.yZ, os.bC);
      this.a(cxo.za, os.bC);
      this.a(cxo.zb, os.bC);
      this.a(cxo.zt, os.bC);
      this.a(cxo.zu, os.bC);
      this.a(cxo.zw, os.bC);
      this.a(cxo.rs, os.bC);
      this.a(cxo.rI, os.bC);
      this.a(cxo.rt, os.bC);
      this.a(cxo.rA, os.bC);
      this.a(cxo.rB, os.bC);
      this.a(cxo.rw, os.bC);
      this.a(cxo.rE, os.bC);
      this.a(cxo.rC, os.bC);
      this.a(cxo.rx, os.bC);
      this.a(cxo.rH, os.bC);
      this.a(cxo.rD, os.bC);
      this.a(cxo.rv, os.bC);
      this.a(cxo.rz, os.bC);
      this.a(cxo.rG, os.bC);
      this.a(cxo.ry, os.bC);
      this.a(cxo.rF, os.bC);
      this.a(cxo.ru, os.bC);
   }

   static record a(String a, float b, Map<alz, String> c) {
      public String a(alz $$0) {
         return this.c.getOrDefault($$0, this.a);
      }
   }
}
