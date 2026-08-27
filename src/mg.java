import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Supplier;

public class mg {
   public static final ajh a = new ajh("trim_type");
   private static final List<mg.a> b = List.of(
      new mg.a("quartz", 0.1F, Map.of()),
      new mg.a("iron", 0.2F, Map.of(coa.c, "iron_darker")),
      new mg.a("netherite", 0.3F, Map.of(coa.g, "netherite_darker")),
      new mg.a("redstone", 0.4F, Map.of()),
      new mg.a("copper", 0.5F, Map.of()),
      new mg.a("gold", 0.6F, Map.of(coa.d, "gold_darker")),
      new mg.a("emerald", 0.7F, Map.of()),
      new mg.a("diamond", 0.8F, Map.of(coa.e, "diamond_darker")),
      new mg.a("lapis", 0.9F, Map.of()),
      new mg.a("amethyst", 1.0F, Map.of())
   );
   private final BiConsumer<ajh, Supplier<JsonElement>> c;

   public mg(BiConsumer<ajh, Supplier<JsonElement>> $$0) {
      this.c = $$0;
   }

   private void a(cqh $$0, mu $$1) {
      $$1.a(mt.a($$0), mw.b($$0), this.c);
   }

   private void a(cqh $$0, String $$1, mu $$2) {
      $$2.a(mt.a($$0, $$1), mw.k(mw.a($$0, $$1)), this.c);
   }

   private void a(cqh $$0, cqh $$1, mu $$2) {
      $$2.a(mt.a($$0), mw.b($$1), this.c);
   }

   private void a(cqh $$0) {
      for (int $$1 = 0; $$1 < 32; $$1++) {
         if ($$1 != 16) {
            this.a($$0, String.format(Locale.ROOT, "_%02d", $$1), mv.bx);
         }
      }
   }

   private void b(cqh $$0) {
      for (int $$1 = 1; $$1 < 64; $$1++) {
         this.a($$0, String.format(Locale.ROOT, "_%02d", $$1), mv.bx);
      }
   }

   private void a(ajh $$0, ajh $$1, ajh $$2) {
      mv.bB.a($$0, mw.c($$1, $$2), this.c);
   }

   private void a(ajh $$0, ajh $$1, ajh $$2, ajh $$3) {
      mv.bC.a($$0, mw.a($$1, $$2, $$3), this.c);
   }

   private ajh a(ajh $$0, String $$1) {
      return $$0.e("_" + $$1 + "_trim");
   }

   private JsonObject a(ajh $$0, Map<mx, ajh> $$1, il<cnz> $$2) {
      JsonObject $$3 = mv.bB.a($$0, $$1);
      JsonArray $$4 = new JsonArray();

      for (mg.a $$5 : b) {
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

   private void a(cny $$0) {
      if ($$0.d().d()) {
         ajh $$1 = mt.a($$0);
         ajh $$2 = mw.c($$0);
         ajh $$3 = mw.a($$0, "_overlay");
         if ($$0.f().a(coa.a)) {
            mv.bB.a($$1, mw.c($$2, $$3), this.c, ($$1x, $$2x) -> this.a($$1x, $$2x, $$0.f()));
         } else {
            mv.bx.a($$1, mw.k($$2), this.c, ($$1x, $$2x) -> this.a($$1x, $$2x, $$0.f()));
         }

         for (mg.a $$4 : b) {
            String $$5 = $$4.a($$0.f());
            ajh $$6 = this.a($$1, $$5);
            String $$7 = $$0.d().b() + "_trim_" + $$5;
            ajh $$8 = new ajh($$7).d("trims/items/");
            if ($$0.f().a(coa.a)) {
               this.a($$6, $$2, $$3, $$8);
            } else {
               this.a($$6, $$2, $$8);
            }
         }
      }
   }

   public void a() {
      this.a(cqp.ob, mv.bx);
      this.a(cqp.od, mv.bx);
      this.a(cqp.oc, mv.bx);
      this.a(cqp.oe, mv.bx);
      this.a(cqp.oB, mv.bx);
      this.a(cqp.os, mv.bx);
      this.a(cqp.uD, mv.bx);
      this.a(cqp.ou, mv.bx);
      this.a(cqp.uf, mv.bx);
      this.a(cqp.dQ, mv.bz);
      this.a(cqp.rZ, mv.bx);
      this.a(cqp.vi, mv.bx);
      this.a(cqp.vk, mv.bx);
      this.a(cqp.nX, mv.bx);
      this.a(cqp.nY, mv.bx);
      this.a(cqp.rw, mv.bx);
      this.a(cqp.sn, mv.bx);
      this.a(cqp.sf, mv.bz);
      this.a(cqp.rs, mv.bx);
      this.a(cqp.rx, mv.bx);
      this.a(cqp.qO, mv.bx);
      this.a(cqp.pp, mv.bx);
      this.a(cqp.pw, mv.bx);
      this.a(cqp.qK, mv.bx);
      this.a(cqp.rt, mv.bx);
      this.a(cqp.qx, mv.bx);
      this.a(cqp.nQ, mv.bA);
      this.a(cqp.nR, mv.bA);
      this.a(cqp.ow, mv.bx);
      this.a(cqp.nM, mv.bx);
      this.a(cqp.sb, mv.bx);
      this.a(cqp.ve, mv.bx);
      this.a(cqp.qL, mv.bx);
      this.b(cqp.qV);
      this.a(cqp.ov, mv.bx);
      this.a(cqp.qG, mv.bx);
      this.a(cqp.uK, mv.bx);
      this.a(cqp.qR);
      this.a(cqp.qS);
      this.a(cqp.sa, mv.bx);
      this.a(cqp.sc, mv.bx);
      this.a(cqp.rc, mv.bx);
      this.a(cqp.uM, mv.bx);
      this.a(cqp.pX, mv.bx);
      this.a(cqp.uz, mv.bx);
      this.a(cqp.rd, mv.bx);
      this.a(cqp.rR, mv.bx);
      this.a(cqp.oE, mv.bx);
      this.a(cqp.oF, mv.bx);
      this.a(cqp.vV, mv.bx);
      this.a(cqp.rq, mv.bx);
      this.a(cqp.of, mv.bx);
      this.a(cqp.og, mv.bx);
      this.a(cqp.ox, mv.bx);
      this.a(cqp.ph, mv.bz);
      this.a(cqp.pi, mv.bz);
      this.a(cqp.uG, mv.bx);
      this.a(cqp.pg, mv.bz);
      this.a(cqp.pf, mv.bz);
      this.a(cqp.pe, mv.bz);
      this.a(cqp.vl, mv.bx);
      this.a(cqp.rW, mv.bx);
      this.a(cqp.qQ, mv.bx);
      this.a(cqp.oy, mv.bx);
      this.a(cqp.uu, mv.bx);
      this.a(cqp.sr, mv.bx);
      this.a(cqp.se, mv.bx);
      this.a(cqp.vd, mv.bx);
      this.a(cqp.tV, mv.bx);
      this.a(cqp.sm, mv.bx);
      this.a(cqp.us, mv.bx);
      this.a(cqp.tW, mv.bx);
      this.a(cqp.pV, mv.bx);
      this.a(cqp.or, mv.bx);
      this.a(cqp.vU, mv.bx);
      this.a(cqp.nN, mv.bx);
      this.a(cqp.sg, mv.bx);
      this.a(cqp.sk, mv.bx);
      this.a(cqp.ss, mv.bx);
      this.a(cqp.vY, mv.bx);
      this.a(cqp.wo, mv.bx);
      this.a(cqp.qX, mv.bx);
      this.a(cqp.rf, mv.bx);
      this.a(cqp.ub, mv.bx);
      this.a(cqp.oG, mv.bx);
      this.a(cqp.pZ, mv.bx);
      this.a(cqp.oX, mv.bz);
      this.a(cqp.ui, mv.bx);
      this.a(cqp.oY, mv.bz);
      this.a(cqp.uF, mv.bx);
      this.a(cqp.oW, mv.bz);
      this.a(cqp.oV, mv.bz);
      this.a(cqp.oU, mv.bz);
      this.a(cqp.oH, mv.bx);
      this.a(cqp.sh, mv.bx);
      this.a(cqp.ro, mv.bx);
      this.a(cqp.ru, mv.bx);
      this.a(cqp.pt, mv.bx);
      this.a(cqp.vQ, mv.bx);
      this.a(cqp.ws, mv.bx);
      this.a(cqp.wv, mv.bx);
      this.a(cqp.nP, mv.bx);
      this.a(cqp.re, mv.bx);
      this.a(cqp.oC, mv.bx);
      this.a(cqp.pc, mv.bz);
      this.a(cqp.pd, mv.bz);
      this.a(cqp.uE, mv.bx);
      this.a(cqp.oD, mv.bx);
      this.a(cqp.vt, mv.bx);
      this.a(cqp.pb, mv.bz);
      this.a(cqp.pa, mv.bz);
      this.a(cqp.oZ, mv.bz);
      this.a(cqp.ua, mv.bx);
      this.a(cqp.nZ, mv.bx);
      this.a(cqp.oa, mv.bx);
      this.a(cqp.vu, mv.bx);
      this.a(cqp.oz, mv.bx);
      this.a(cqp.qz, mv.bx);
      this.a(cqp.qC, mv.bx);
      this.a(cqp.uH, mv.bx);
      this.a(cqp.rk, mv.bx);
      this.a(cqp.rp, mv.bx);
      this.a(cqp.rm, mv.bx);
      this.a(cqp.rj, mv.bx);
      this.a(cqp.so, mv.bx);
      this.a(cqp.oh, mv.bx);
      this.a(cqp.oi, mv.bx);
      this.a(cqp.oj, mv.bx);
      this.a(cqp.ok, mv.bx);
      this.a(cqp.uh, mv.bx);
      this.a(cqp.rV, mv.bx);
      this.a(cqp.qD, mv.bx);
      this.a(cqp.nL, mv.bx);
      this.a(cqp.vX, mv.bx);
      this.a(cqp.pq, mv.bx);
      this.a(cqp.vM, mv.bx);
      this.a(cqp.vG, mv.by);
      this.a(cqp.vw, mv.by);
      this.a(cqp.vy, mv.by);
      this.a(cqp.vx, mv.by);
      this.a(cqp.vz, mv.by);
      this.a(cqp.vA, mv.by);
      this.a(cqp.vB, mv.by);
      this.a(cqp.vC, mv.by);
      this.a(cqp.vL, mv.by);
      this.a(cqp.vD, mv.by);
      this.a(cqp.vE, mv.by);
      this.a(cqp.vH, mv.by);
      this.a(cqp.vF, mv.by);
      this.a(cqp.vI, mv.by);
      this.a(cqp.vJ, mv.by);
      this.a(cqp.vK, mv.by);
      this.a(cqp.uL, mv.bx);
      this.a(cqp.uJ, mv.bx);
      this.a(cqp.vP, mv.bx);
      this.a(cqp.pm, mv.bz);
      this.a(cqp.pn, mv.bz);
      this.a(cqp.oI, mv.bx);
      this.a(cqp.pl, mv.bz);
      this.a(cqp.oJ, mv.bx);
      this.a(cqp.pk, mv.bz);
      this.a(cqp.pj, mv.bz);
      this.a(cqp.uv, mv.bx);
      this.a(cqp.uq, mv.bx);
      this.a(cqp.nT, mv.bx);
      this.a(cqp.nU, mv.bx);
      this.a(cqp.ri, mv.bx);
      this.a(cqp.pY, mv.bx);
      this.a(cqp.qN, mv.bx);
      this.a(cqp.vO, mv.bx);
      this.a(cqp.vZ, mv.bx);
      this.a(cqp.rn, mv.bx);
      this.a(cqp.ug, mv.bx);
      this.a(cqp.vf, mv.bx);
      this.a(cqp.pW, mv.bx);
      this.a(cqp.qA, mv.bx);
      this.a(cqp.ux, mv.bx);
      this.a(cqp.uw, mv.bx);
      this.a(cqp.rb, mv.bx);
      this.a(cqp.qE, mv.bx);
      this.a(cqp.ur, mv.bx);
      this.a(cqp.rr, mv.bx);
      this.a(cqp.oA, mv.bx);
      this.a(cqp.uy, mv.bx);
      this.a(cqp.uB, mv.bx);
      this.a(cqp.uC, mv.bx);
      this.a(cqp.uA, mv.bx);
      this.a(cqp.rv, mv.bx);
      this.a(cqp.sd, mv.bx);
      this.a(cqp.nK, mv.bx);
      this.a(cqp.qZ, mv.bx);
      this.a(cqp.qF, mv.bx);
      this.a(cqp.oo, mv.bx);
      this.a(cqp.op, mv.bx);
      this.a(cqp.oq, mv.bx);
      this.a(cqp.rU, mv.bx);
      this.a(cqp.vs, mv.bx);
      this.a(cqp.vW, mv.bx);
      this.a(cqp.qP, mv.bx);
      this.a(cqp.qB, mv.bx);
      this.a(cqp.xm, mv.bx);
      this.a(cqp.vn, mv.bx);
      this.a(cqp.sl, mv.bx);
      this.a(cqp.nV, mv.bx);
      this.a(cqp.nW, mv.bx);
      this.a(cqp.qW, mv.bx);
      this.a(cqp.po, mv.bz);
      this.a(cqp.oS, mv.bz);
      this.a(cqp.oT, mv.bz);
      this.a(cqp.oR, mv.bz);
      this.a(cqp.oQ, mv.bz);
      this.a(cqp.oP, mv.bz);
      this.a(cqp.rz, mv.bx);
      this.a(cqp.vS, mv.bx);
      this.a(cqp.nO, mv.bx);
      this.a(cqp.vr, mv.bx);
      this.a(cqp.vN, mv.bx);
      this.a(cqp.ra, mv.bx);
      this.a(cqp.qH, mv.bx);
      this.a(cqp.qI, mv.bx);
      this.a(cqp.qJ, mv.bx);
      this.a(cqp.qy, mv.bx);
      this.a(cqp.pv, mv.bx);
      this.a(cqp.rh, mv.bx);
      this.a(cqp.tX, mv.bx);
      this.a(cqp.oN, mv.bz);
      this.a(cqp.oO, mv.bz);
      this.a(cqp.oM, mv.bz);
      this.a(cqp.oL, mv.bz);
      this.a(cqp.oK, mv.bz);
      this.a(cqp.tY, mv.bx);
      this.a(cqp.tZ, mv.bx);
      this.a(cqp.rl, mv.bx);
      this.a(cqp.xo, mv.bx);
      this.a(cqp.xp, mv.bx);
      this.a(cqp.xq, mv.bx);
      this.a(cqp.xr, mv.bx);
      this.a(cqp.xs, mv.bx);
      this.a(cqp.xt, mv.bx);
      this.a(cqp.xu, mv.bx);
      this.a(cqp.xv, mv.bx);
      this.a(cqp.xw, mv.bx);
      this.a(cqp.xx, mv.bx);
      this.a(cqp.xy, mv.bx);
      this.a(cqp.xz, mv.bx);
      this.a(cqp.xA, mv.bx);
      this.a(cqp.xB, mv.bx);
      this.a(cqp.xC, mv.bx);
      this.a(cqp.xD, mv.bx);
      this.a(cqp.xE, mv.bx);
      this.a(cqp.vv, cqp.po, mv.bz);
      this.a(cqp.qa, cqp.pZ, mv.bx);

      for (cqh $$0 : ki.h) {
         if ($$0 instanceof cny $$1) {
            this.a($$1);
         }
      }

      this.a(cqp.xF, mv.bx);
      this.a(cqp.xG, mv.bx);
      this.a(cqp.xH, mv.bx);
      this.a(cqp.xI, mv.bx);
      this.a(cqp.xJ, mv.bx);
      this.a(cqp.xK, mv.bx);
      this.a(cqp.xL, mv.bx);
      this.a(cqp.xM, mv.bx);
      this.a(cqp.xN, mv.bx);
      this.a(cqp.xO, mv.bx);
      this.a(cqp.xP, mv.bx);
      this.a(cqp.xQ, mv.bx);
      this.a(cqp.xR, mv.bx);
      this.a(cqp.xS, mv.bx);
      this.a(cqp.xT, mv.bx);
      this.a(cqp.xU, mv.bx);
      this.a(cqp.xV, mv.bx);
      this.a(cqp.xW, mv.bx);
      this.a(cqp.xX, mv.bx);
      this.a(cqp.xY, mv.bx);
      this.a(cqp.yq, mv.bx);
   }

   static record a(String a, float b, Map<il<cnz>, String> c) {
      public String a(il<cnz> $$0) {
         return this.c.getOrDefault($$0, this.a);
      }
   }
}
