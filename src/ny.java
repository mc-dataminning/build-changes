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
   public static final all a = all.b("trim_type");
   private static final List<ny.a> b = List.of(
      new ny.a("quartz", 0.1F, Map.of()),
      new ny.a("iron", 0.2F, Map.of(ddq.c, "iron_darker")),
      new ny.a("netherite", 0.3F, Map.of(ddq.g, "netherite_darker")),
      new ny.a("redstone", 0.4F, Map.of()),
      new ny.a("copper", 0.5F, Map.of()),
      new ny.a("gold", 0.6F, Map.of(ddq.d, "gold_darker")),
      new ny.a("emerald", 0.7F, Map.of()),
      new ny.a("diamond", 0.8F, Map.of(ddq.e, "diamond_darker")),
      new ny.a("lapis", 0.9F, Map.of()),
      new ny.a("amethyst", 1.0F, Map.of())
   );
   private final BiConsumer<all, Supplier<JsonElement>> c;

   public ny(BiConsumer<all, Supplier<JsonElement>> $$0) {
      this.c = $$0;
   }

   private void a(cwb $$0, om $$1) {
      $$1.a(ol.a($$0), oo.b($$0), this.c);
   }

   private void a(cwb $$0, String $$1, om $$2) {
      $$2.a(ol.a($$0, $$1), oo.k(oo.a($$0, $$1)), this.c);
   }

   private void a(cwb $$0, cwb $$1, om $$2) {
      $$2.a(ol.a($$0), oo.b($$1), this.c);
   }

   private void a(cwb $$0) {
      this.a(ol.a($$0), oo.c($$0), oo.a($$0, "_overlay"));
   }

   private void b(cwb $$0) {
      for (int $$1 = 0; $$1 < 32; $$1++) {
         if ($$1 != 16) {
            this.a($$0, String.format(Locale.ROOT, "_%02d", $$1), on.bB);
         }
      }
   }

   private void c(cwb $$0) {
      for (int $$1 = 1; $$1 < 64; $$1++) {
         this.a($$0, String.format(Locale.ROOT, "_%02d", $$1), on.bB);
      }
   }

   private void a(all $$0, all $$1, all $$2) {
      on.bF.a($$0, oo.c($$1, $$2), this.c);
   }

   private void a(all $$0, all $$1, all $$2, all $$3) {
      on.bG.a($$0, oo.a($$1, $$2, $$3), this.c);
   }

   private all a(all $$0, String $$1) {
      return $$0.g("_" + $$1 + "_trim");
   }

   private JsonObject a(all $$0, Map<op, all> $$1, all $$2) {
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

   private void a(cwb $$0, all $$1, ddp $$2, buq $$3) {
      List<ddp.c> $$4 = $$2.a(ddp.d.a);
      if (!$$4.isEmpty()) {
         boolean $$5 = $$4.size() == 2 && $$4.getFirst().b().isPresent();
         all $$6 = ol.a($$0);
         all $$7 = oo.c($$0);
         all $$8 = oo.a($$0, "_overlay");
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
            all $$12 = this.a($$6, $$11);
            String $$13 = $$9 + "_trim_" + $$11;
            all $$14 = all.b($$13).f("trims/items/");
            if ($$5) {
               this.a($$12, $$7, $$8, $$14);
            } else {
               this.a($$12, $$7, $$14);
            }
         }
      }
   }

   public void a() {
      this.a(cwj.od, on.bB);
      this.a(cwj.of, on.bB);
      this.a(cwj.oe, on.bB);
      this.a(cwj.og, on.bB);
      this.a(cwj.oE, on.bB);
      this.a(cwj.ov, on.bB);
      this.a(cwj.or, on.bB);
      this.a(cwj.uX, on.bB);
      this.a(cwj.ox, on.bB);
      this.a(cwj.uz, on.bB);
      this.a(cwj.dR, on.bD);
      this.a(cwj.sr, on.bB);
      this.a(cwj.vC, on.bB);
      this.a(cwj.vE, on.bB);
      this.a(cwj.nZ, on.bB);
      this.a(cwj.oa, on.bB);
      this.a(cwj.rO, on.bB);
      this.a(cwj.sF, on.bB);
      this.a(cwj.sx, on.bD);
      this.a(cwj.rK, on.bB);
      this.a(cwj.rP, on.bB);
      this.a(cwj.wz, on.bB);
      this.a(cwj.qQ, on.bB);
      this.a(cwj.ou, on.bB);
      this.a(cwj.py, on.bB);
      this.a(cwj.qM, on.bB);
      this.a(cwj.us, on.bD);
      this.a(cwj.rL, on.bB);
      this.a(cwj.qz, on.bB);
      this.a(cwj.nR, on.bE);
      this.a(cwj.nS, on.bE);
      this.a(cwj.oz, on.bB);
      this.a(cwj.nN, on.bB);
      this.a(cwj.st, on.bB);
      this.a(cwj.vy, on.bB);
      this.a(cwj.qN, on.bB);
      this.c(cwj.rn);
      this.a(cwj.oy, on.bB);
      this.a(cwj.qI, on.bB);
      this.a(cwj.ve, on.bB);
      this.b(cwj.qT);
      this.b(cwj.qU);
      this.a(cwj.ss, on.bB);
      this.a(cwj.su, on.bB);
      this.a(cwj.ru, on.bB);
      this.a(cwj.vg, on.bB);
      this.a(cwj.pZ, on.bB);
      this.a(cwj.uT, on.bB);
      this.a(cwj.rv, on.bB);
      this.a(cwj.sj, on.bB);
      this.a(cwj.oH, on.bB);
      this.a(cwj.oI, on.bB);
      this.a(cwj.wr, on.bB);
      this.a(cwj.rI, on.bB);
      this.a(cwj.oh, on.bB);
      this.a(cwj.oi, on.bB);
      this.a(cwj.oA, on.bB);
      this.a(cwj.pk, on.bD);
      this.a(cwj.pl, on.bD);
      this.a(cwj.va, on.bB);
      this.a(cwj.pj, on.bD);
      this.a(cwj.pi, on.bD);
      this.a(cwj.ph, on.bD);
      this.a(cwj.vF, on.bB);
      this.a(cwj.so, on.bB);
      this.a(cwj.qS, on.bB);
      this.a(cwj.oB, on.bB);
      this.a(cwj.uO, on.bB);
      this.a(cwj.sJ, on.bB);
      this.a(cwj.sw, on.bB);
      this.a(cwj.vx, on.bB);
      this.a(cwj.un, on.bB);
      this.a(cwj.sE, on.bB);
      this.a(cwj.wy, on.bB);
      this.a(cwj.uM, on.bB);
      this.a(cwj.uo, on.bB);
      this.a(cwj.pX, on.bB);
      this.a(cwj.ot, on.bB);
      this.a(cwj.ww, on.bB);
      this.a(cwj.wq, on.bB);
      this.a(cwj.nO, on.bB);
      this.a(cwj.sy, on.bB);
      this.a(cwj.sB, on.bB);
      this.a(cwj.sK, on.bB);
      this.a(cwj.wu, on.bB);
      this.a(cwj.wO, on.bB);
      this.a(cwj.rp, on.bB);
      this.a(cwj.rx, on.bB);
      this.a(cwj.uv, on.bB);
      this.a(cwj.oJ, on.bB);
      this.a(cwj.qb, on.bB);
      this.a(cwj.pa, on.bD);
      this.a(cwj.uC, on.bB);
      this.a(cwj.pb, on.bD);
      this.a(cwj.uZ, on.bB);
      this.a(cwj.oZ, on.bD);
      this.a(cwj.oY, on.bD);
      this.a(cwj.oX, on.bD);
      this.a(cwj.oK, on.bB);
      this.a(cwj.sz, on.bB);
      this.a(cwj.rG, on.bB);
      this.a(cwj.rM, on.bB);
      this.a(cwj.pv, on.bB);
      this.a(cwj.wx, on.bB);
      this.a(cwj.wm, on.bB);
      this.a(cwj.wS, on.bB);
      this.a(cwj.wV, on.bB);
      this.a(cwj.nQ, on.bB);
      this.a(cwj.rw, on.bB);
      this.a(cwj.oF, on.bB);
      this.a(cwj.pf, on.bD);
      this.a(cwj.pg, on.bD);
      this.a(cwj.uY, on.bB);
      this.a(cwj.oG, on.bB);
      this.a(cwj.vN, on.bB);
      this.a(cwj.pe, on.bD);
      this.a(cwj.pd, on.bD);
      this.a(cwj.pc, on.bD);
      this.a(cwj.uu, on.bB);
      this.a(cwj.ob, on.bB);
      this.a(cwj.oc, on.bB);
      this.a(cwj.vO, on.bB);
      this.a(cwj.oC, on.bB);
      this.a(cwj.qB, on.bB);
      this.a(cwj.qE, on.bB);
      this.a(cwj.vb, on.bB);
      this.a(cwj.rC, on.bB);
      this.a(cwj.rH, on.bB);
      this.a(cwj.rE, on.bB);
      this.a(cwj.rB, on.bB);
      this.a(cwj.sG, on.bB);
      this.a(cwj.oj, on.bB);
      this.a(cwj.ok, on.bB);
      this.a(cwj.ol, on.bB);
      this.a(cwj.om, on.bB);
      this.a(cwj.uB, on.bB);
      this.a(cwj.sn, on.bB);
      this.a(cwj.qF, on.bB);
      this.a(cwj.nM, on.bB);
      this.a(cwj.wt, on.bB);
      this.a(cwj.ps, on.bB);
      this.a(cwj.wj, on.bB);
      this.a(cwj.wc, on.bC);
      this.a(cwj.vQ, on.bC);
      this.a(cwj.vS, on.bC);
      this.a(cwj.vR, on.bC);
      this.a(cwj.vT, on.bC);
      this.a(cwj.vU, on.bC);
      this.a(cwj.vV, on.bC);
      this.a(cwj.vW, on.bC);
      this.a(cwj.vX, on.bC);
      this.a(cwj.vY, on.bC);
      this.a(cwj.wh, on.bC);
      this.a(cwj.wi, on.bC);
      this.a(cwj.vZ, on.bC);
      this.a(cwj.wa, on.bC);
      this.a(cwj.wd, on.bC);
      this.a(cwj.wb, on.bC);
      this.a(cwj.we, on.bC);
      this.a(cwj.wf, on.bC);
      this.a(cwj.wg, on.bC);
      this.a(cwj.vf, on.bB);
      this.a(cwj.vd, on.bB);
      this.a(cwj.wl, on.bB);
      this.a(cwj.pp, on.bD);
      this.a(cwj.pq, on.bD);
      this.a(cwj.oL, on.bB);
      this.a(cwj.po, on.bD);
      this.a(cwj.oM, on.bB);
      this.a(cwj.pn, on.bD);
      this.a(cwj.pm, on.bD);
      this.a(cwj.uP, on.bB);
      this.a(cwj.uK, on.bB);
      this.a(cwj.nV, on.bB);
      this.a(cwj.nW, on.bB);
      this.a(cwj.rA, on.bB);
      this.a(cwj.qa, on.bB);
      this.a(cwj.qP, on.bB);
      this.a(cwj.nT, on.bB);
      this.a(cwj.wv, on.bB);
      this.a(cwj.rF, on.bB);
      this.a(cwj.uA, on.bB);
      this.a(cwj.vz, on.bB);
      this.a(cwj.pY, on.bB);
      this.a(cwj.qC, on.bB);
      this.a(cwj.uR, on.bB);
      this.a(cwj.uQ, on.bB);
      this.a(cwj.rt, on.bB);
      this.a(cwj.qG, on.bB);
      this.a(cwj.uL, on.bB);
      this.a(cwj.rJ, on.bB);
      this.a(cwj.oD, on.bB);
      this.a(cwj.uS, on.bB);
      this.a(cwj.uV, on.bB);
      this.a(cwj.uW, on.bB);
      this.a(cwj.uU, on.bB);
      this.a(cwj.rN, on.bB);
      this.a(cwj.sv, on.bB);
      this.a(cwj.nL, on.bB);
      this.a(cwj.rr, on.bB);
      this.a(cwj.qH, on.bB);
      this.a(cwj.oq, on.bB);
      this.a(cwj.sm, on.bB);
      this.a(cwj.vM, on.bB);
      this.a(cwj.ws, on.bB);
      this.a(cwj.qR, on.bB);
      this.a(cwj.qD, on.bB);
      this.a(cwj.xM, on.bB);
      this.a(cwj.vH, on.bB);
      this.a(cwj.sD, on.bB);
      this.a(cwj.nX, on.bB);
      this.a(cwj.nY, on.bB);
      this.a(cwj.ro, on.bB);
      this.a(cwj.pr, on.bD);
      this.a(cwj.oV, on.bD);
      this.a(cwj.oW, on.bD);
      this.a(cwj.oU, on.bD);
      this.a(cwj.oT, on.bD);
      this.a(cwj.oS, on.bD);
      this.a(cwj.rR, on.bB);
      this.a(cwj.wo, on.bB);
      this.a(cwj.nP, on.bB);
      this.a(cwj.vL, on.bB);
      this.a(cwj.wk, on.bB);
      this.a(cwj.rs, on.bB);
      this.a(cwj.qJ, on.bB);
      this.a(cwj.qK, on.bB);
      this.a(cwj.qL, on.bB);
      this.a(cwj.qA, on.bB);
      this.a(cwj.px, on.bB);
      this.a(cwj.rz, on.bB);
      this.a(cwj.up, on.bB);
      this.a(cwj.ut, on.bS);
      this.a(cwj.os);
      this.a(cwj.oQ, on.bD);
      this.a(cwj.oR, on.bD);
      this.a(cwj.oP, on.bD);
      this.a(cwj.oO, on.bD);
      this.a(cwj.oN, on.bD);
      this.a(cwj.uq, on.bB);
      this.a(cwj.ur, on.bB);
      this.a(cwj.rD, on.bB);
      this.a(cwj.xO, on.bB);
      this.a(cwj.xP, on.bB);
      this.a(cwj.xQ, on.bB);
      this.a(cwj.xR, on.bB);
      this.a(cwj.xS, on.bB);
      this.a(cwj.xT, on.bB);
      this.a(cwj.xU, on.bB);
      this.a(cwj.xV, on.bB);
      this.a(cwj.xW, on.bB);
      this.a(cwj.xX, on.bB);
      this.a(cwj.xY, on.bB);
      this.a(cwj.xZ, on.bB);
      this.a(cwj.ya, on.bB);
      this.a(cwj.yb, on.bB);
      this.a(cwj.yc, on.bB);
      this.a(cwj.yd, on.bB);
      this.a(cwj.ye, on.bB);
      this.a(cwj.yf, on.bB);
      this.a(cwj.yg, on.bB);
      this.a(cwj.vP, cwj.pr, on.bD);
      this.a(cwj.qc, cwj.qb, on.bB);
      Map<all, ddp> $$0 = new HashMap<>();
      ddq.a($$0::put);

      for (cwb $$1 : lz.g) {
         ddr $$2 = $$1.g().a(ku.D);
         if ($$2 != null && $$2.a().a() == buq.a.b && $$2.c().isPresent()) {
            all $$3 = $$2.c().get();
            ddp $$4 = $$0.get($$3);
            if ($$4 == null) {
               throw new IllegalStateException("Referenced equipment model does not exist: " + $$3);
            }

            this.a($$1, $$3, $$4, $$2.a());
         }
      }

      this.a(cwj.yh, on.bB);
      this.a(cwj.yi, on.bB);
      this.a(cwj.yj, on.bB);
      this.a(cwj.yk, on.bB);
      this.a(cwj.yl, on.bB);
      this.a(cwj.ym, on.bB);
      this.a(cwj.yn, on.bB);
      this.a(cwj.yo, on.bB);
      this.a(cwj.yp, on.bB);
      this.a(cwj.yq, on.bB);
      this.a(cwj.yr, on.bB);
      this.a(cwj.ys, on.bB);
      this.a(cwj.yt, on.bB);
      this.a(cwj.yu, on.bB);
      this.a(cwj.yv, on.bB);
      this.a(cwj.yw, on.bB);
      this.a(cwj.yx, on.bB);
      this.a(cwj.yy, on.bB);
      this.a(cwj.yz, on.bB);
      this.a(cwj.yA, on.bB);
      this.a(cwj.yB, on.bB);
      this.a(cwj.yC, on.bB);
      this.a(cwj.yD, on.bB);
      this.a(cwj.yV, on.bB);
      this.a(cwj.yW, on.bB);
      this.a(cwj.yY, on.bB);
      this.a(cwj.qV, on.bB);
      this.a(cwj.rl, on.bB);
      this.a(cwj.qW, on.bB);
      this.a(cwj.rd, on.bB);
      this.a(cwj.re, on.bB);
      this.a(cwj.qZ, on.bB);
      this.a(cwj.rh, on.bB);
      this.a(cwj.rf, on.bB);
      this.a(cwj.ra, on.bB);
      this.a(cwj.rk, on.bB);
      this.a(cwj.rg, on.bB);
      this.a(cwj.qY, on.bB);
      this.a(cwj.rc, on.bB);
      this.a(cwj.rj, on.bB);
      this.a(cwj.rb, on.bB);
      this.a(cwj.ri, on.bB);
      this.a(cwj.qX, on.bB);
   }

   static record a(String a, float b, Map<all, String> c) {
      public String a(all $$0) {
         return this.c.getOrDefault($$0, this.a);
      }
   }
}
