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
      new od.a("iron", 0.2F, Map.of(dfs.c, "iron_darker")),
      new od.a("netherite", 0.3F, Map.of(dfs.g, "netherite_darker")),
      new od.a("redstone", 0.4F, Map.of()),
      new od.a("copper", 0.5F, Map.of()),
      new od.a("gold", 0.6F, Map.of(dfs.d, "gold_darker")),
      new od.a("emerald", 0.7F, Map.of()),
      new od.a("diamond", 0.8F, Map.of(dfs.e, "diamond_darker")),
      new od.a("lapis", 0.9F, Map.of()),
      new od.a("amethyst", 1.0F, Map.of())
   );
   private final BiConsumer<alz, Supplier<JsonElement>> c;

   public od(BiConsumer<alz, Supplier<JsonElement>> $$0) {
      this.c = $$0;
   }

   private void a(cxk $$0, or $$1) {
      $$1.a(oq.a($$0), ot.b($$0), this.c);
   }

   private void a(cxk $$0, String $$1, or $$2) {
      $$2.a(oq.a($$0, $$1), ot.k(ot.a($$0, $$1)), this.c);
   }

   private void a(cxk $$0, cxk $$1, or $$2) {
      $$2.a(oq.a($$0), ot.b($$1), this.c);
   }

   private void a(cxk $$0) {
      this.a(oq.a($$0), ot.c($$0), ot.a($$0, "_overlay"));
   }

   private void b(cxk $$0) {
      for (int $$1 = 0; $$1 < 32; $$1++) {
         if ($$1 != 16) {
            this.a($$0, String.format(Locale.ROOT, "_%02d", $$1), os.bC);
         }
      }
   }

   private void c(cxk $$0) {
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

   private void a(cxk $$0, alz $$1, dfr $$2, bvr $$3) {
      List<dfr.c> $$4 = $$2.a(dfr.d.a);
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
      this.a(cxs.ow, os.bC);
      this.a(cxs.oy, os.bC);
      this.a(cxs.ox, os.bC);
      this.a(cxs.oz, os.bC);
      this.a(cxs.oZ, os.bC);
      this.a(cxs.oQ, os.bC);
      this.a(cxs.oM, os.bC);
      this.a(cxs.vv, os.bC);
      this.a(cxs.oS, os.bC);
      this.a(cxs.uX, os.bC);
      this.a(cxs.eb, os.bE);
      this.a(cxs.sO, os.bC);
      this.a(cxs.wa, os.bC);
      this.a(cxs.wc, os.bC);
      this.a(cxs.os, os.bC);
      this.a(cxs.ot, os.bC);
      this.a(cxs.sl, os.bC);
      this.a(cxs.tc, os.bC);
      this.a(cxs.sU, os.bE);
      this.a(cxs.sh, os.bC);
      this.a(cxs.sm, os.bC);
      this.a(cxs.wX, os.bC);
      this.a(cxs.rn, os.bC);
      this.a(cxs.oP, os.bC);
      this.a(cxs.pT, os.bC);
      this.a(cxs.rj, os.bC);
      this.a(cxs.uQ, os.bE);
      this.a(cxs.si, os.bC);
      this.a(cxs.qW, os.bC);
      this.a(cxs.ok, os.bF);
      this.a(cxs.ol, os.bF);
      this.a(cxs.oU, os.bC);
      this.a(cxs.og, os.bC);
      this.a(cxs.sQ, os.bC);
      this.a(cxs.vW, os.bC);
      this.a(cxs.rk, os.bC);
      this.c(cxs.rK);
      this.a(cxs.oT, os.bC);
      this.a(cxs.rf, os.bC);
      this.a(cxs.vC, os.bC);
      this.b(cxs.rq);
      this.b(cxs.rr);
      this.a(cxs.sP, os.bC);
      this.a(cxs.sR, os.bC);
      this.a(cxs.rR, os.bC);
      this.a(cxs.vE, os.bC);
      this.a(cxs.qu, os.bC);
      this.a(cxs.vr, os.bC);
      this.a(cxs.rS, os.bC);
      this.a(cxs.sG, os.bC);
      this.a(cxs.pc, os.bC);
      this.a(cxs.pd, os.bC);
      this.a(cxs.wP, os.bC);
      this.a(cxs.sf, os.bC);
      this.a(cxs.oA, os.bC);
      this.a(cxs.oB, os.bC);
      this.a(cxs.oV, os.bC);
      this.a(cxs.pF, os.bE);
      this.a(cxs.pG, os.bE);
      this.a(cxs.vy, os.bC);
      this.a(cxs.pE, os.bE);
      this.a(cxs.pD, os.bE);
      this.a(cxs.pC, os.bE);
      this.a(cxs.wd, os.bC);
      this.a(cxs.sL, os.bC);
      this.a(cxs.rp, os.bC);
      this.a(cxs.oW, os.bC);
      this.a(cxs.vm, os.bC);
      this.a(cxs.tg, os.bC);
      this.a(cxs.sT, os.bC);
      this.a(cxs.vV, os.bC);
      this.a(cxs.uL, os.bC);
      this.a(cxs.tb, os.bC);
      this.a(cxs.wW, os.bC);
      this.a(cxs.vk, os.bC);
      this.a(cxs.uM, os.bC);
      this.a(cxs.qs, os.bC);
      this.a(cxs.oO, os.bC);
      this.a(cxs.wU, os.bC);
      this.a(cxs.wO, os.bC);
      this.a(cxs.oh, os.bC);
      this.a(cxs.sV, os.bC);
      this.a(cxs.sY, os.bC);
      this.a(cxs.th, os.bC);
      this.a(cxs.wS, os.bC);
      this.a(cxs.xm, os.bC);
      this.a(cxs.rM, os.bC);
      this.a(cxs.rU, os.bC);
      this.a(cxs.uT, os.bC);
      this.a(cxs.pe, os.bC);
      this.a(cxs.qw, os.bC);
      this.a(cxs.pv, os.bE);
      this.a(cxs.va, os.bC);
      this.a(cxs.pw, os.bE);
      this.a(cxs.vx, os.bC);
      this.a(cxs.pu, os.bE);
      this.a(cxs.pt, os.bE);
      this.a(cxs.ps, os.bE);
      this.a(cxs.pf, os.bC);
      this.a(cxs.sW, os.bC);
      this.a(cxs.sd, os.bC);
      this.a(cxs.sj, os.bC);
      this.a(cxs.pQ, os.bC);
      this.a(cxs.wV, os.bC);
      this.a(cxs.wK, os.bC);
      this.a(cxs.xq, os.bC);
      this.a(cxs.xt, os.bC);
      this.a(cxs.oj, os.bC);
      this.a(cxs.rT, os.bC);
      this.a(cxs.pa, os.bC);
      this.a(cxs.pA, os.bE);
      this.a(cxs.pB, os.bE);
      this.a(cxs.vw, os.bC);
      this.a(cxs.pb, os.bC);
      this.a(cxs.wl, os.bC);
      this.a(cxs.pz, os.bE);
      this.a(cxs.py, os.bE);
      this.a(cxs.px, os.bE);
      this.a(cxs.uS, os.bC);
      this.a(cxs.ou, os.bC);
      this.a(cxs.ov, os.bC);
      this.a(cxs.wm, os.bC);
      this.a(cxs.oX, os.bC);
      this.a(cxs.qY, os.bC);
      this.a(cxs.rb, os.bC);
      this.a(cxs.vz, os.bC);
      this.a(cxs.rZ, os.bC);
      this.a(cxs.se, os.bC);
      this.a(cxs.sb, os.bC);
      this.a(cxs.rY, os.bC);
      this.a(cxs.td, os.bC);
      this.a(cxs.oE, os.bC);
      this.a(cxs.oF, os.bC);
      this.a(cxs.oG, os.bC);
      this.a(cxs.oH, os.bC);
      this.a(cxs.uZ, os.bC);
      this.a(cxs.sK, os.bC);
      this.a(cxs.rc, os.bC);
      this.a(cxs.of, os.bC);
      this.a(cxs.wR, os.bC);
      this.a(cxs.pN, os.bC);
      this.a(cxs.wH, os.bC);
      this.a(cxs.wA, os.bD);
      this.a(cxs.wo, os.bD);
      this.a(cxs.wq, os.bD);
      this.a(cxs.wp, os.bD);
      this.a(cxs.wr, os.bD);
      this.a(cxs.ws, os.bD);
      this.a(cxs.wt, os.bD);
      this.a(cxs.wu, os.bD);
      this.a(cxs.wv, os.bD);
      this.a(cxs.ww, os.bD);
      this.a(cxs.wF, os.bD);
      this.a(cxs.wG, os.bD);
      this.a(cxs.wx, os.bD);
      this.a(cxs.wy, os.bD);
      this.a(cxs.wB, os.bD);
      this.a(cxs.wz, os.bD);
      this.a(cxs.wC, os.bD);
      this.a(cxs.wD, os.bD);
      this.a(cxs.wE, os.bD);
      this.a(cxs.vD, os.bC);
      this.a(cxs.vB, os.bC);
      this.a(cxs.wJ, os.bC);
      this.a(cxs.pK, os.bE);
      this.a(cxs.pL, os.bE);
      this.a(cxs.pg, os.bC);
      this.a(cxs.pJ, os.bE);
      this.a(cxs.ph, os.bC);
      this.a(cxs.pI, os.bE);
      this.a(cxs.pH, os.bE);
      this.a(cxs.vn, os.bC);
      this.a(cxs.vi, os.bC);
      this.a(cxs.oo, os.bC);
      this.a(cxs.op, os.bC);
      this.a(cxs.rX, os.bC);
      this.a(cxs.qv, os.bC);
      this.a(cxs.oC, os.bC);
      this.a(cxs.oD, os.bC);
      this.a(cxs.rm, os.bC);
      this.a(cxs.om, os.bC);
      this.a(cxs.wT, os.bC);
      this.a(cxs.sc, os.bC);
      this.a(cxs.uY, os.bC);
      this.a(cxs.vX, os.bC);
      this.a(cxs.qt, os.bC);
      this.a(cxs.qZ, os.bC);
      this.a(cxs.vp, os.bC);
      this.a(cxs.vo, os.bC);
      this.a(cxs.rQ, os.bC);
      this.a(cxs.rd, os.bC);
      this.a(cxs.vj, os.bC);
      this.a(cxs.sg, os.bC);
      this.a(cxs.oY, os.bC);
      this.a(cxs.vq, os.bC);
      this.a(cxs.vt, os.bC);
      this.a(cxs.vu, os.bC);
      this.a(cxs.vs, os.bC);
      this.a(cxs.sk, os.bC);
      this.a(cxs.sS, os.bC);
      this.a(cxs.oe, os.bC);
      this.a(cxs.rO, os.bC);
      this.a(cxs.re, os.bC);
      this.a(cxs.oL, os.bC);
      this.a(cxs.sJ, os.bC);
      this.a(cxs.wk, os.bC);
      this.a(cxs.wQ, os.bC);
      this.a(cxs.ro, os.bC);
      this.a(cxs.ra, os.bC);
      this.a(cxs.yk, os.bC);
      this.a(cxs.wf, os.bC);
      this.a(cxs.ta, os.bC);
      this.a(cxs.oq, os.bC);
      this.a(cxs.or, os.bC);
      this.a(cxs.rL, os.bC);
      this.a(cxs.pM, os.bE);
      this.a(cxs.pq, os.bE);
      this.a(cxs.pr, os.bE);
      this.a(cxs.pp, os.bE);
      this.a(cxs.po, os.bE);
      this.a(cxs.pn, os.bE);
      this.a(cxs.so, os.bC);
      this.a(cxs.wM, os.bC);
      this.a(cxs.oi, os.bC);
      this.a(cxs.wj, os.bC);
      this.a(cxs.wI, os.bC);
      this.a(cxs.rP, os.bC);
      this.a(cxs.rg, os.bC);
      this.a(cxs.rh, os.bC);
      this.a(cxs.ri, os.bC);
      this.a(cxs.qX, os.bC);
      this.a(cxs.pS, os.bC);
      this.a(cxs.rW, os.bC);
      this.a(cxs.uN, os.bC);
      this.a(cxs.uR, os.bT);
      this.a(cxs.oN);
      this.a(cxs.pl, os.bE);
      this.a(cxs.pm, os.bE);
      this.a(cxs.pk, os.bE);
      this.a(cxs.pj, os.bE);
      this.a(cxs.pi, os.bE);
      this.a(cxs.uO, os.bC);
      this.a(cxs.uP, os.bC);
      this.a(cxs.sa, os.bC);
      this.a(cxs.ym, os.bC);
      this.a(cxs.yn, os.bC);
      this.a(cxs.yo, os.bC);
      this.a(cxs.yp, os.bC);
      this.a(cxs.yq, os.bC);
      this.a(cxs.yr, os.bC);
      this.a(cxs.ys, os.bC);
      this.a(cxs.yt, os.bC);
      this.a(cxs.yu, os.bC);
      this.a(cxs.yv, os.bC);
      this.a(cxs.yw, os.bC);
      this.a(cxs.yx, os.bC);
      this.a(cxs.yy, os.bC);
      this.a(cxs.yz, os.bC);
      this.a(cxs.yA, os.bC);
      this.a(cxs.yB, os.bC);
      this.a(cxs.yC, os.bC);
      this.a(cxs.yD, os.bC);
      this.a(cxs.yE, os.bC);
      this.a(cxs.wn, cxs.pM, os.bE);
      this.a(cxs.qx, cxs.qw, os.bC);
      Map<alz, dfr> $$0 = new HashMap<>();
      dfs.a($$0::put);

      for (cxk $$1 : ma.g) {
         dft $$2 = $$1.g().a(ku.D);
         if ($$2 != null && $$2.a().a() == bvr.a.b && $$2.c().isPresent()) {
            alz $$3 = $$2.c().get();
            dfr $$4 = $$0.get($$3);
            if ($$4 == null) {
               throw new IllegalStateException("Referenced equipment model does not exist: " + $$3);
            }

            this.a($$1, $$3, $$4, $$2.a());
         }
      }

      this.a(cxs.yF, os.bC);
      this.a(cxs.yG, os.bC);
      this.a(cxs.yH, os.bC);
      this.a(cxs.yI, os.bC);
      this.a(cxs.yJ, os.bC);
      this.a(cxs.yK, os.bC);
      this.a(cxs.yL, os.bC);
      this.a(cxs.yM, os.bC);
      this.a(cxs.yN, os.bC);
      this.a(cxs.yO, os.bC);
      this.a(cxs.yP, os.bC);
      this.a(cxs.yQ, os.bC);
      this.a(cxs.yR, os.bC);
      this.a(cxs.yS, os.bC);
      this.a(cxs.yT, os.bC);
      this.a(cxs.yU, os.bC);
      this.a(cxs.yV, os.bC);
      this.a(cxs.yW, os.bC);
      this.a(cxs.yX, os.bC);
      this.a(cxs.yY, os.bC);
      this.a(cxs.yZ, os.bC);
      this.a(cxs.za, os.bC);
      this.a(cxs.zb, os.bC);
      this.a(cxs.zt, os.bC);
      this.a(cxs.zu, os.bC);
      this.a(cxs.zw, os.bC);
      this.a(cxs.rs, os.bC);
      this.a(cxs.rI, os.bC);
      this.a(cxs.rt, os.bC);
      this.a(cxs.rA, os.bC);
      this.a(cxs.rB, os.bC);
      this.a(cxs.rw, os.bC);
      this.a(cxs.rE, os.bC);
      this.a(cxs.rC, os.bC);
      this.a(cxs.rx, os.bC);
      this.a(cxs.rH, os.bC);
      this.a(cxs.rD, os.bC);
      this.a(cxs.rv, os.bC);
      this.a(cxs.rz, os.bC);
      this.a(cxs.rG, os.bC);
      this.a(cxs.ry, os.bC);
      this.a(cxs.rF, os.bC);
      this.a(cxs.ru, os.bC);
   }

   static record a(String a, float b, Map<alz, String> c) {
      public String a(alz $$0) {
         return this.c.getOrDefault($$0, this.a);
      }
   }
}
