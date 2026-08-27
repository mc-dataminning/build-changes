import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Supplier;

public class me {
   public static final ajc a = new ajc("trim_type");
   private static final List<me.a> b = List.of(
      new me.a("quartz", 0.1F, Map.of()),
      new me.a("iron", 0.2F, Map.of(cne.c, "iron_darker")),
      new me.a("netherite", 0.3F, Map.of(cne.g, "netherite_darker")),
      new me.a("redstone", 0.4F, Map.of()),
      new me.a("copper", 0.5F, Map.of()),
      new me.a("gold", 0.6F, Map.of(cne.d, "gold_darker")),
      new me.a("emerald", 0.7F, Map.of()),
      new me.a("diamond", 0.8F, Map.of(cne.e, "diamond_darker")),
      new me.a("lapis", 0.9F, Map.of()),
      new me.a("amethyst", 1.0F, Map.of())
   );
   private final BiConsumer<ajc, Supplier<JsonElement>> c;

   public me(BiConsumer<ajc, Supplier<JsonElement>> $$0) {
      this.c = $$0;
   }

   private void a(cpl $$0, ms $$1) {
      $$1.a(mr.a($$0), mu.b($$0), this.c);
   }

   private void a(cpl $$0, String $$1, ms $$2) {
      $$2.a(mr.a($$0, $$1), mu.k(mu.a($$0, $$1)), this.c);
   }

   private void a(cpl $$0, cpl $$1, ms $$2) {
      $$2.a(mr.a($$0), mu.b($$1), this.c);
   }

   private void a(cpl $$0) {
      for (int $$1 = 0; $$1 < 32; $$1++) {
         if ($$1 != 16) {
            this.a($$0, String.format(Locale.ROOT, "_%02d", $$1), mt.bx);
         }
      }
   }

   private void b(cpl $$0) {
      for (int $$1 = 1; $$1 < 64; $$1++) {
         this.a($$0, String.format(Locale.ROOT, "_%02d", $$1), mt.bx);
      }
   }

   private void a(ajc $$0, ajc $$1, ajc $$2) {
      mt.bB.a($$0, mu.c($$1, $$2), this.c);
   }

   private void a(ajc $$0, ajc $$1, ajc $$2, ajc $$3) {
      mt.bC.a($$0, mu.a($$1, $$2, $$3), this.c);
   }

   private ajc a(ajc $$0, String $$1) {
      return $$0.e("_" + $$1 + "_trim");
   }

   private JsonObject a(ajc $$0, Map<mv, ajc> $$1, il<cnd> $$2) {
      JsonObject $$3 = mt.bB.a($$0, $$1);
      JsonArray $$4 = new JsonArray();

      for (me.a $$5 : b) {
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

   private void a(cnc $$0) {
      if ($$0.d().d()) {
         ajc $$1 = mr.a($$0);
         ajc $$2 = mu.c($$0);
         ajc $$3 = mu.a($$0, "_overlay");
         if ($$0.f().a(cne.a)) {
            mt.bB.a($$1, mu.c($$2, $$3), this.c, ($$1x, $$2x) -> this.a($$1x, $$2x, $$0.f()));
         } else {
            mt.bx.a($$1, mu.k($$2), this.c, ($$1x, $$2x) -> this.a($$1x, $$2x, $$0.f()));
         }

         for (me.a $$4 : b) {
            String $$5 = $$4.a($$0.f());
            ajc $$6 = this.a($$1, $$5);
            String $$7 = $$0.d().b() + "_trim_" + $$5;
            ajc $$8 = new ajc($$7).d("trims/items/");
            if ($$0.f().a(cne.a)) {
               this.a($$6, $$2, $$3, $$8);
            } else {
               this.a($$6, $$2, $$8);
            }
         }
      }
   }

   public void a() {
      this.a(cpt.ob, mt.bx);
      this.a(cpt.od, mt.bx);
      this.a(cpt.oc, mt.bx);
      this.a(cpt.oe, mt.bx);
      this.a(cpt.oB, mt.bx);
      this.a(cpt.os, mt.bx);
      this.a(cpt.uB, mt.bx);
      this.a(cpt.ou, mt.bx);
      this.a(cpt.ud, mt.bx);
      this.a(cpt.dQ, mt.bz);
      this.a(cpt.rZ, mt.bx);
      this.a(cpt.vg, mt.bx);
      this.a(cpt.vi, mt.bx);
      this.a(cpt.nX, mt.bx);
      this.a(cpt.nY, mt.bx);
      this.a(cpt.rw, mt.bx);
      this.a(cpt.sn, mt.bx);
      this.a(cpt.sf, mt.bz);
      this.a(cpt.rs, mt.bx);
      this.a(cpt.rx, mt.bx);
      this.a(cpt.qO, mt.bx);
      this.a(cpt.pp, mt.bx);
      this.a(cpt.pw, mt.bx);
      this.a(cpt.qK, mt.bx);
      this.a(cpt.rt, mt.bx);
      this.a(cpt.qx, mt.bx);
      this.a(cpt.nQ, mt.bA);
      this.a(cpt.nR, mt.bA);
      this.a(cpt.ow, mt.bx);
      this.a(cpt.nM, mt.bx);
      this.a(cpt.sb, mt.bx);
      this.a(cpt.vc, mt.bx);
      this.a(cpt.qL, mt.bx);
      this.b(cpt.qV);
      this.a(cpt.ov, mt.bx);
      this.a(cpt.qG, mt.bx);
      this.a(cpt.uI, mt.bx);
      this.a(cpt.qR);
      this.a(cpt.qS);
      this.a(cpt.sa, mt.bx);
      this.a(cpt.sc, mt.bx);
      this.a(cpt.rc, mt.bx);
      this.a(cpt.uK, mt.bx);
      this.a(cpt.pX, mt.bx);
      this.a(cpt.ux, mt.bx);
      this.a(cpt.rd, mt.bx);
      this.a(cpt.rR, mt.bx);
      this.a(cpt.oE, mt.bx);
      this.a(cpt.oF, mt.bx);
      this.a(cpt.vT, mt.bx);
      this.a(cpt.rq, mt.bx);
      this.a(cpt.of, mt.bx);
      this.a(cpt.og, mt.bx);
      this.a(cpt.ox, mt.bx);
      this.a(cpt.ph, mt.bz);
      this.a(cpt.pi, mt.bz);
      this.a(cpt.uE, mt.bx);
      this.a(cpt.pg, mt.bz);
      this.a(cpt.pf, mt.bz);
      this.a(cpt.pe, mt.bz);
      this.a(cpt.vj, mt.bx);
      this.a(cpt.rW, mt.bx);
      this.a(cpt.qQ, mt.bx);
      this.a(cpt.oy, mt.bx);
      this.a(cpt.us, mt.bx);
      this.a(cpt.sr, mt.bx);
      this.a(cpt.se, mt.bx);
      this.a(cpt.vb, mt.bx);
      this.a(cpt.tU, mt.bx);
      this.a(cpt.sm, mt.bx);
      this.a(cpt.uq, mt.bx);
      this.a(cpt.tV, mt.bx);
      this.a(cpt.pV, mt.bx);
      this.a(cpt.or, mt.bx);
      this.a(cpt.vS, mt.bx);
      this.a(cpt.nN, mt.bx);
      this.a(cpt.sg, mt.bx);
      this.a(cpt.sk, mt.bx);
      this.a(cpt.ss, mt.bx);
      this.a(cpt.vW, mt.bx);
      this.a(cpt.wm, mt.bx);
      this.a(cpt.qX, mt.bx);
      this.a(cpt.rf, mt.bx);
      this.a(cpt.tZ, mt.bx);
      this.a(cpt.oG, mt.bx);
      this.a(cpt.pZ, mt.bx);
      this.a(cpt.oX, mt.bz);
      this.a(cpt.ug, mt.bx);
      this.a(cpt.oY, mt.bz);
      this.a(cpt.uD, mt.bx);
      this.a(cpt.oW, mt.bz);
      this.a(cpt.oV, mt.bz);
      this.a(cpt.oU, mt.bz);
      this.a(cpt.oH, mt.bx);
      this.a(cpt.sh, mt.bx);
      this.a(cpt.ro, mt.bx);
      this.a(cpt.ru, mt.bx);
      this.a(cpt.pt, mt.bx);
      this.a(cpt.vO, mt.bx);
      this.a(cpt.wq, mt.bx);
      this.a(cpt.wt, mt.bx);
      this.a(cpt.nP, mt.bx);
      this.a(cpt.re, mt.bx);
      this.a(cpt.oC, mt.bx);
      this.a(cpt.pc, mt.bz);
      this.a(cpt.pd, mt.bz);
      this.a(cpt.uC, mt.bx);
      this.a(cpt.oD, mt.bx);
      this.a(cpt.vr, mt.bx);
      this.a(cpt.pb, mt.bz);
      this.a(cpt.pa, mt.bz);
      this.a(cpt.oZ, mt.bz);
      this.a(cpt.tY, mt.bx);
      this.a(cpt.nZ, mt.bx);
      this.a(cpt.oa, mt.bx);
      this.a(cpt.vs, mt.bx);
      this.a(cpt.oz, mt.bx);
      this.a(cpt.qz, mt.bx);
      this.a(cpt.qC, mt.bx);
      this.a(cpt.uF, mt.bx);
      this.a(cpt.rk, mt.bx);
      this.a(cpt.rp, mt.bx);
      this.a(cpt.rm, mt.bx);
      this.a(cpt.rj, mt.bx);
      this.a(cpt.so, mt.bx);
      this.a(cpt.oh, mt.bx);
      this.a(cpt.oi, mt.bx);
      this.a(cpt.oj, mt.bx);
      this.a(cpt.ok, mt.bx);
      this.a(cpt.uf, mt.bx);
      this.a(cpt.rV, mt.bx);
      this.a(cpt.qD, mt.bx);
      this.a(cpt.nL, mt.bx);
      this.a(cpt.vV, mt.bx);
      this.a(cpt.pq, mt.bx);
      this.a(cpt.vK, mt.bx);
      this.a(cpt.vE, mt.by);
      this.a(cpt.vu, mt.by);
      this.a(cpt.vw, mt.by);
      this.a(cpt.vv, mt.by);
      this.a(cpt.vx, mt.by);
      this.a(cpt.vy, mt.by);
      this.a(cpt.vz, mt.by);
      this.a(cpt.vA, mt.by);
      this.a(cpt.vJ, mt.by);
      this.a(cpt.vB, mt.by);
      this.a(cpt.vC, mt.by);
      this.a(cpt.vF, mt.by);
      this.a(cpt.vD, mt.by);
      this.a(cpt.vG, mt.by);
      this.a(cpt.vH, mt.by);
      this.a(cpt.vI, mt.by);
      this.a(cpt.uJ, mt.bx);
      this.a(cpt.uH, mt.bx);
      this.a(cpt.vN, mt.bx);
      this.a(cpt.pm, mt.bz);
      this.a(cpt.pn, mt.bz);
      this.a(cpt.oI, mt.bx);
      this.a(cpt.pl, mt.bz);
      this.a(cpt.oJ, mt.bx);
      this.a(cpt.pk, mt.bz);
      this.a(cpt.pj, mt.bz);
      this.a(cpt.ut, mt.bx);
      this.a(cpt.uo, mt.bx);
      this.a(cpt.nT, mt.bx);
      this.a(cpt.nU, mt.bx);
      this.a(cpt.ri, mt.bx);
      this.a(cpt.pY, mt.bx);
      this.a(cpt.qN, mt.bx);
      this.a(cpt.vM, mt.bx);
      this.a(cpt.vX, mt.bx);
      this.a(cpt.rn, mt.bx);
      this.a(cpt.ue, mt.bx);
      this.a(cpt.vd, mt.bx);
      this.a(cpt.pW, mt.bx);
      this.a(cpt.qA, mt.bx);
      this.a(cpt.uv, mt.bx);
      this.a(cpt.uu, mt.bx);
      this.a(cpt.rb, mt.bx);
      this.a(cpt.qE, mt.bx);
      this.a(cpt.up, mt.bx);
      this.a(cpt.rr, mt.bx);
      this.a(cpt.oA, mt.bx);
      this.a(cpt.uw, mt.bx);
      this.a(cpt.uz, mt.bx);
      this.a(cpt.uA, mt.bx);
      this.a(cpt.uy, mt.bx);
      this.a(cpt.rv, mt.bx);
      this.a(cpt.sd, mt.bx);
      this.a(cpt.nK, mt.bx);
      this.a(cpt.qZ, mt.bx);
      this.a(cpt.qF, mt.bx);
      this.a(cpt.oo, mt.bx);
      this.a(cpt.op, mt.bx);
      this.a(cpt.oq, mt.bx);
      this.a(cpt.rU, mt.bx);
      this.a(cpt.vq, mt.bx);
      this.a(cpt.vU, mt.bx);
      this.a(cpt.qP, mt.bx);
      this.a(cpt.qB, mt.bx);
      this.a(cpt.xk, mt.bx);
      this.a(cpt.vl, mt.bx);
      this.a(cpt.sl, mt.bx);
      this.a(cpt.nV, mt.bx);
      this.a(cpt.nW, mt.bx);
      this.a(cpt.qW, mt.bx);
      this.a(cpt.po, mt.bz);
      this.a(cpt.oS, mt.bz);
      this.a(cpt.oT, mt.bz);
      this.a(cpt.oR, mt.bz);
      this.a(cpt.oQ, mt.bz);
      this.a(cpt.oP, mt.bz);
      this.a(cpt.rz, mt.bx);
      this.a(cpt.vQ, mt.bx);
      this.a(cpt.nO, mt.bx);
      this.a(cpt.vp, mt.bx);
      this.a(cpt.vL, mt.bx);
      this.a(cpt.ra, mt.bx);
      this.a(cpt.qH, mt.bx);
      this.a(cpt.qI, mt.bx);
      this.a(cpt.qJ, mt.bx);
      this.a(cpt.qy, mt.bx);
      this.a(cpt.pv, mt.bx);
      this.a(cpt.rh, mt.bx);
      this.a(cpt.oN, mt.bz);
      this.a(cpt.oO, mt.bz);
      this.a(cpt.oM, mt.bz);
      this.a(cpt.oL, mt.bz);
      this.a(cpt.oK, mt.bz);
      this.a(cpt.tW, mt.bx);
      this.a(cpt.tX, mt.bx);
      this.a(cpt.rl, mt.bx);
      this.a(cpt.xm, mt.bx);
      this.a(cpt.xn, mt.bx);
      this.a(cpt.xo, mt.bx);
      this.a(cpt.xp, mt.bx);
      this.a(cpt.xq, mt.bx);
      this.a(cpt.xr, mt.bx);
      this.a(cpt.xs, mt.bx);
      this.a(cpt.xt, mt.bx);
      this.a(cpt.xu, mt.bx);
      this.a(cpt.xv, mt.bx);
      this.a(cpt.xw, mt.bx);
      this.a(cpt.xx, mt.bx);
      this.a(cpt.xy, mt.bx);
      this.a(cpt.xz, mt.bx);
      this.a(cpt.xA, mt.bx);
      this.a(cpt.xB, mt.bx);
      this.a(cpt.xC, mt.bx);
      this.a(cpt.vt, cpt.po, mt.bz);
      this.a(cpt.qa, cpt.pZ, mt.bx);

      for (cpl $$0 : kh.h) {
         if ($$0 instanceof cnc $$1) {
            this.a($$1);
         }
      }

      this.a(cpt.xD, mt.bx);
      this.a(cpt.xE, mt.bx);
      this.a(cpt.xF, mt.bx);
      this.a(cpt.xG, mt.bx);
      this.a(cpt.xH, mt.bx);
      this.a(cpt.xI, mt.bx);
      this.a(cpt.xJ, mt.bx);
      this.a(cpt.xK, mt.bx);
      this.a(cpt.xL, mt.bx);
      this.a(cpt.xM, mt.bx);
      this.a(cpt.xN, mt.bx);
      this.a(cpt.xO, mt.bx);
      this.a(cpt.xP, mt.bx);
      this.a(cpt.xQ, mt.bx);
      this.a(cpt.xR, mt.bx);
      this.a(cpt.xS, mt.bx);
      this.a(cpt.xT, mt.bx);
      this.a(cpt.xU, mt.bx);
      this.a(cpt.xV, mt.bx);
      this.a(cpt.xW, mt.bx);
      this.a(cpt.yo, mt.bx);
   }

   static record a(String a, float b, Map<il<cnd>, String> c) {
      public String a(il<cnd> $$0) {
         return this.c.getOrDefault($$0, this.a);
      }
   }
}
