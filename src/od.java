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
      new od.a("iron", 0.2F, Map.of(dft.c, "iron_darker")),
      new od.a("netherite", 0.3F, Map.of(dft.g, "netherite_darker")),
      new od.a("redstone", 0.4F, Map.of()),
      new od.a("copper", 0.5F, Map.of()),
      new od.a("gold", 0.6F, Map.of(dft.d, "gold_darker")),
      new od.a("emerald", 0.7F, Map.of()),
      new od.a("diamond", 0.8F, Map.of(dft.e, "diamond_darker")),
      new od.a("lapis", 0.9F, Map.of()),
      new od.a("amethyst", 1.0F, Map.of())
   );
   private final BiConsumer<alz, Supplier<JsonElement>> c;

   public od(BiConsumer<alz, Supplier<JsonElement>> $$0) {
      this.c = $$0;
   }

   private void a(cxl $$0, or $$1) {
      $$1.a(oq.a($$0), ot.b($$0), this.c);
   }

   private void a(cxl $$0, String $$1, or $$2) {
      $$2.a(oq.a($$0, $$1), ot.k(ot.a($$0, $$1)), this.c);
   }

   private void a(cxl $$0, cxl $$1, or $$2) {
      $$2.a(oq.a($$0), ot.b($$1), this.c);
   }

   private void a(cxl $$0) {
      this.a(oq.a($$0), ot.c($$0), ot.a($$0, "_overlay"));
   }

   private void b(cxl $$0) {
      for (int $$1 = 0; $$1 < 32; $$1++) {
         if ($$1 != 16) {
            this.a($$0, String.format(Locale.ROOT, "_%02d", $$1), os.bC);
         }
      }
   }

   private void c(cxl $$0) {
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

   private void a(cxl $$0, alz $$1, dfs $$2, bvs $$3) {
      List<dfs.c> $$4 = $$2.a(dfs.d.a);
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
      this.a(cxt.ow, os.bC);
      this.a(cxt.oy, os.bC);
      this.a(cxt.ox, os.bC);
      this.a(cxt.oz, os.bC);
      this.a(cxt.oZ, os.bC);
      this.a(cxt.oQ, os.bC);
      this.a(cxt.oM, os.bC);
      this.a(cxt.vv, os.bC);
      this.a(cxt.oS, os.bC);
      this.a(cxt.uX, os.bC);
      this.a(cxt.eb, os.bE);
      this.a(cxt.sO, os.bC);
      this.a(cxt.wa, os.bC);
      this.a(cxt.wc, os.bC);
      this.a(cxt.os, os.bC);
      this.a(cxt.ot, os.bC);
      this.a(cxt.sl, os.bC);
      this.a(cxt.tc, os.bC);
      this.a(cxt.sU, os.bE);
      this.a(cxt.sh, os.bC);
      this.a(cxt.sm, os.bC);
      this.a(cxt.wX, os.bC);
      this.a(cxt.rn, os.bC);
      this.a(cxt.oP, os.bC);
      this.a(cxt.pT, os.bC);
      this.a(cxt.rj, os.bC);
      this.a(cxt.uQ, os.bE);
      this.a(cxt.si, os.bC);
      this.a(cxt.qW, os.bC);
      this.a(cxt.ok, os.bF);
      this.a(cxt.ol, os.bF);
      this.a(cxt.oU, os.bC);
      this.a(cxt.og, os.bC);
      this.a(cxt.sQ, os.bC);
      this.a(cxt.vW, os.bC);
      this.a(cxt.rk, os.bC);
      this.c(cxt.rK);
      this.a(cxt.oT, os.bC);
      this.a(cxt.rf, os.bC);
      this.a(cxt.vC, os.bC);
      this.b(cxt.rq);
      this.b(cxt.rr);
      this.a(cxt.sP, os.bC);
      this.a(cxt.sR, os.bC);
      this.a(cxt.rR, os.bC);
      this.a(cxt.vE, os.bC);
      this.a(cxt.qu, os.bC);
      this.a(cxt.vr, os.bC);
      this.a(cxt.rS, os.bC);
      this.a(cxt.sG, os.bC);
      this.a(cxt.pc, os.bC);
      this.a(cxt.pd, os.bC);
      this.a(cxt.wP, os.bC);
      this.a(cxt.sf, os.bC);
      this.a(cxt.oA, os.bC);
      this.a(cxt.oB, os.bC);
      this.a(cxt.oV, os.bC);
      this.a(cxt.pF, os.bE);
      this.a(cxt.pG, os.bE);
      this.a(cxt.vy, os.bC);
      this.a(cxt.pE, os.bE);
      this.a(cxt.pD, os.bE);
      this.a(cxt.pC, os.bE);
      this.a(cxt.wd, os.bC);
      this.a(cxt.sL, os.bC);
      this.a(cxt.rp, os.bC);
      this.a(cxt.oW, os.bC);
      this.a(cxt.vm, os.bC);
      this.a(cxt.tg, os.bC);
      this.a(cxt.sT, os.bC);
      this.a(cxt.vV, os.bC);
      this.a(cxt.uL, os.bC);
      this.a(cxt.tb, os.bC);
      this.a(cxt.wW, os.bC);
      this.a(cxt.vk, os.bC);
      this.a(cxt.uM, os.bC);
      this.a(cxt.qs, os.bC);
      this.a(cxt.oO, os.bC);
      this.a(cxt.wU, os.bC);
      this.a(cxt.wO, os.bC);
      this.a(cxt.oh, os.bC);
      this.a(cxt.sV, os.bC);
      this.a(cxt.sY, os.bC);
      this.a(cxt.th, os.bC);
      this.a(cxt.wS, os.bC);
      this.a(cxt.xm, os.bC);
      this.a(cxt.rM, os.bC);
      this.a(cxt.rU, os.bC);
      this.a(cxt.uT, os.bC);
      this.a(cxt.pe, os.bC);
      this.a(cxt.qw, os.bC);
      this.a(cxt.pv, os.bE);
      this.a(cxt.va, os.bC);
      this.a(cxt.pw, os.bE);
      this.a(cxt.vx, os.bC);
      this.a(cxt.pu, os.bE);
      this.a(cxt.pt, os.bE);
      this.a(cxt.ps, os.bE);
      this.a(cxt.pf, os.bC);
      this.a(cxt.sW, os.bC);
      this.a(cxt.sd, os.bC);
      this.a(cxt.sj, os.bC);
      this.a(cxt.pQ, os.bC);
      this.a(cxt.wV, os.bC);
      this.a(cxt.wK, os.bC);
      this.a(cxt.xq, os.bC);
      this.a(cxt.xt, os.bC);
      this.a(cxt.oj, os.bC);
      this.a(cxt.rT, os.bC);
      this.a(cxt.pa, os.bC);
      this.a(cxt.pA, os.bE);
      this.a(cxt.pB, os.bE);
      this.a(cxt.vw, os.bC);
      this.a(cxt.pb, os.bC);
      this.a(cxt.wl, os.bC);
      this.a(cxt.pz, os.bE);
      this.a(cxt.py, os.bE);
      this.a(cxt.px, os.bE);
      this.a(cxt.uS, os.bC);
      this.a(cxt.ou, os.bC);
      this.a(cxt.ov, os.bC);
      this.a(cxt.wm, os.bC);
      this.a(cxt.oX, os.bC);
      this.a(cxt.qY, os.bC);
      this.a(cxt.rb, os.bC);
      this.a(cxt.vz, os.bC);
      this.a(cxt.rZ, os.bC);
      this.a(cxt.se, os.bC);
      this.a(cxt.sb, os.bC);
      this.a(cxt.rY, os.bC);
      this.a(cxt.td, os.bC);
      this.a(cxt.oE, os.bC);
      this.a(cxt.oF, os.bC);
      this.a(cxt.oG, os.bC);
      this.a(cxt.oH, os.bC);
      this.a(cxt.uZ, os.bC);
      this.a(cxt.sK, os.bC);
      this.a(cxt.rc, os.bC);
      this.a(cxt.of, os.bC);
      this.a(cxt.wR, os.bC);
      this.a(cxt.pN, os.bC);
      this.a(cxt.wH, os.bC);
      this.a(cxt.wA, os.bD);
      this.a(cxt.wo, os.bD);
      this.a(cxt.wq, os.bD);
      this.a(cxt.wp, os.bD);
      this.a(cxt.wr, os.bD);
      this.a(cxt.ws, os.bD);
      this.a(cxt.wt, os.bD);
      this.a(cxt.wu, os.bD);
      this.a(cxt.wv, os.bD);
      this.a(cxt.ww, os.bD);
      this.a(cxt.wF, os.bD);
      this.a(cxt.wG, os.bD);
      this.a(cxt.wx, os.bD);
      this.a(cxt.wy, os.bD);
      this.a(cxt.wB, os.bD);
      this.a(cxt.wz, os.bD);
      this.a(cxt.wC, os.bD);
      this.a(cxt.wD, os.bD);
      this.a(cxt.wE, os.bD);
      this.a(cxt.vD, os.bC);
      this.a(cxt.vB, os.bC);
      this.a(cxt.wJ, os.bC);
      this.a(cxt.pK, os.bE);
      this.a(cxt.pL, os.bE);
      this.a(cxt.pg, os.bC);
      this.a(cxt.pJ, os.bE);
      this.a(cxt.ph, os.bC);
      this.a(cxt.pI, os.bE);
      this.a(cxt.pH, os.bE);
      this.a(cxt.vn, os.bC);
      this.a(cxt.vi, os.bC);
      this.a(cxt.oo, os.bC);
      this.a(cxt.op, os.bC);
      this.a(cxt.rX, os.bC);
      this.a(cxt.qv, os.bC);
      this.a(cxt.oC, os.bC);
      this.a(cxt.oD, os.bC);
      this.a(cxt.rm, os.bC);
      this.a(cxt.om, os.bC);
      this.a(cxt.wT, os.bC);
      this.a(cxt.sc, os.bC);
      this.a(cxt.uY, os.bC);
      this.a(cxt.vX, os.bC);
      this.a(cxt.qt, os.bC);
      this.a(cxt.qZ, os.bC);
      this.a(cxt.vp, os.bC);
      this.a(cxt.vo, os.bC);
      this.a(cxt.rQ, os.bC);
      this.a(cxt.rd, os.bC);
      this.a(cxt.vj, os.bC);
      this.a(cxt.sg, os.bC);
      this.a(cxt.oY, os.bC);
      this.a(cxt.vq, os.bC);
      this.a(cxt.vt, os.bC);
      this.a(cxt.vu, os.bC);
      this.a(cxt.vs, os.bC);
      this.a(cxt.sk, os.bC);
      this.a(cxt.sS, os.bC);
      this.a(cxt.oe, os.bC);
      this.a(cxt.rO, os.bC);
      this.a(cxt.re, os.bC);
      this.a(cxt.oL, os.bC);
      this.a(cxt.sJ, os.bC);
      this.a(cxt.wk, os.bC);
      this.a(cxt.wQ, os.bC);
      this.a(cxt.ro, os.bC);
      this.a(cxt.ra, os.bC);
      this.a(cxt.yk, os.bC);
      this.a(cxt.wf, os.bC);
      this.a(cxt.ta, os.bC);
      this.a(cxt.oq, os.bC);
      this.a(cxt.or, os.bC);
      this.a(cxt.rL, os.bC);
      this.a(cxt.pM, os.bE);
      this.a(cxt.pq, os.bE);
      this.a(cxt.pr, os.bE);
      this.a(cxt.pp, os.bE);
      this.a(cxt.po, os.bE);
      this.a(cxt.pn, os.bE);
      this.a(cxt.so, os.bC);
      this.a(cxt.wM, os.bC);
      this.a(cxt.oi, os.bC);
      this.a(cxt.wj, os.bC);
      this.a(cxt.wI, os.bC);
      this.a(cxt.rP, os.bC);
      this.a(cxt.rg, os.bC);
      this.a(cxt.rh, os.bC);
      this.a(cxt.ri, os.bC);
      this.a(cxt.qX, os.bC);
      this.a(cxt.pS, os.bC);
      this.a(cxt.rW, os.bC);
      this.a(cxt.uN, os.bC);
      this.a(cxt.uR, os.bT);
      this.a(cxt.oN);
      this.a(cxt.pl, os.bE);
      this.a(cxt.pm, os.bE);
      this.a(cxt.pk, os.bE);
      this.a(cxt.pj, os.bE);
      this.a(cxt.pi, os.bE);
      this.a(cxt.uO, os.bC);
      this.a(cxt.uP, os.bC);
      this.a(cxt.sa, os.bC);
      this.a(cxt.ym, os.bC);
      this.a(cxt.yn, os.bC);
      this.a(cxt.yo, os.bC);
      this.a(cxt.yp, os.bC);
      this.a(cxt.yq, os.bC);
      this.a(cxt.yr, os.bC);
      this.a(cxt.ys, os.bC);
      this.a(cxt.yt, os.bC);
      this.a(cxt.yu, os.bC);
      this.a(cxt.yv, os.bC);
      this.a(cxt.yw, os.bC);
      this.a(cxt.yx, os.bC);
      this.a(cxt.yy, os.bC);
      this.a(cxt.yz, os.bC);
      this.a(cxt.yA, os.bC);
      this.a(cxt.yB, os.bC);
      this.a(cxt.yC, os.bC);
      this.a(cxt.yD, os.bC);
      this.a(cxt.yE, os.bC);
      this.a(cxt.wn, cxt.pM, os.bE);
      this.a(cxt.qx, cxt.qw, os.bC);
      Map<alz, dfs> $$0 = new HashMap<>();
      dft.a($$0::put);

      for (cxl $$1 : ma.g) {
         dfu $$2 = $$1.g().a(ku.D);
         if ($$2 != null && $$2.a().a() == bvs.a.b && $$2.c().isPresent()) {
            alz $$3 = $$2.c().get();
            dfs $$4 = $$0.get($$3);
            if ($$4 == null) {
               throw new IllegalStateException("Referenced equipment model does not exist: " + $$3);
            }

            this.a($$1, $$3, $$4, $$2.a());
         }
      }

      this.a(cxt.yF, os.bC);
      this.a(cxt.yG, os.bC);
      this.a(cxt.yH, os.bC);
      this.a(cxt.yI, os.bC);
      this.a(cxt.yJ, os.bC);
      this.a(cxt.yK, os.bC);
      this.a(cxt.yL, os.bC);
      this.a(cxt.yM, os.bC);
      this.a(cxt.yN, os.bC);
      this.a(cxt.yO, os.bC);
      this.a(cxt.yP, os.bC);
      this.a(cxt.yQ, os.bC);
      this.a(cxt.yR, os.bC);
      this.a(cxt.yS, os.bC);
      this.a(cxt.yT, os.bC);
      this.a(cxt.yU, os.bC);
      this.a(cxt.yV, os.bC);
      this.a(cxt.yW, os.bC);
      this.a(cxt.yX, os.bC);
      this.a(cxt.yY, os.bC);
      this.a(cxt.yZ, os.bC);
      this.a(cxt.za, os.bC);
      this.a(cxt.zb, os.bC);
      this.a(cxt.zt, os.bC);
      this.a(cxt.zu, os.bC);
      this.a(cxt.zw, os.bC);
      this.a(cxt.rs, os.bC);
      this.a(cxt.rI, os.bC);
      this.a(cxt.rt, os.bC);
      this.a(cxt.rA, os.bC);
      this.a(cxt.rB, os.bC);
      this.a(cxt.rw, os.bC);
      this.a(cxt.rE, os.bC);
      this.a(cxt.rC, os.bC);
      this.a(cxt.rx, os.bC);
      this.a(cxt.rH, os.bC);
      this.a(cxt.rD, os.bC);
      this.a(cxt.rv, os.bC);
      this.a(cxt.rz, os.bC);
      this.a(cxt.rG, os.bC);
      this.a(cxt.ry, os.bC);
      this.a(cxt.rF, os.bC);
      this.a(cxt.ru, os.bC);
   }

   static record a(String a, float b, Map<alz, String> c) {
      public String a(alz $$0) {
         return this.c.getOrDefault($$0, this.a);
      }
   }
}
