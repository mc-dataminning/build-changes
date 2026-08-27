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
      new mg.a("iron", 0.2F, Map.of(cny.c, "iron_darker")),
      new mg.a("netherite", 0.3F, Map.of(cny.g, "netherite_darker")),
      new mg.a("redstone", 0.4F, Map.of()),
      new mg.a("copper", 0.5F, Map.of()),
      new mg.a("gold", 0.6F, Map.of(cny.d, "gold_darker")),
      new mg.a("emerald", 0.7F, Map.of()),
      new mg.a("diamond", 0.8F, Map.of(cny.e, "diamond_darker")),
      new mg.a("lapis", 0.9F, Map.of()),
      new mg.a("amethyst", 1.0F, Map.of())
   );
   private final BiConsumer<ajh, Supplier<JsonElement>> c;

   public mg(BiConsumer<ajh, Supplier<JsonElement>> $$0) {
      this.c = $$0;
   }

   private void a(cqf $$0, mu $$1) {
      $$1.a(mt.a($$0), mw.b($$0), this.c);
   }

   private void a(cqf $$0, String $$1, mu $$2) {
      $$2.a(mt.a($$0, $$1), mw.k(mw.a($$0, $$1)), this.c);
   }

   private void a(cqf $$0, cqf $$1, mu $$2) {
      $$2.a(mt.a($$0), mw.b($$1), this.c);
   }

   private void a(cqf $$0) {
      for (int $$1 = 0; $$1 < 32; $$1++) {
         if ($$1 != 16) {
            this.a($$0, String.format(Locale.ROOT, "_%02d", $$1), mv.bx);
         }
      }
   }

   private void b(cqf $$0) {
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

   private JsonObject a(ajh $$0, Map<mx, ajh> $$1, il<cnx> $$2) {
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

   private void a(cnw $$0) {
      if ($$0.d().d()) {
         ajh $$1 = mt.a($$0);
         ajh $$2 = mw.c($$0);
         ajh $$3 = mw.a($$0, "_overlay");
         if ($$0.f().a(cny.a)) {
            mv.bB.a($$1, mw.c($$2, $$3), this.c, ($$1x, $$2x) -> this.a($$1x, $$2x, $$0.f()));
         } else {
            mv.bx.a($$1, mw.k($$2), this.c, ($$1x, $$2x) -> this.a($$1x, $$2x, $$0.f()));
         }

         for (mg.a $$4 : b) {
            String $$5 = $$4.a($$0.f());
            ajh $$6 = this.a($$1, $$5);
            String $$7 = $$0.d().b() + "_trim_" + $$5;
            ajh $$8 = new ajh($$7).d("trims/items/");
            if ($$0.f().a(cny.a)) {
               this.a($$6, $$2, $$3, $$8);
            } else {
               this.a($$6, $$2, $$8);
            }
         }
      }
   }

   public void a() {
      this.a(cqn.ob, mv.bx);
      this.a(cqn.od, mv.bx);
      this.a(cqn.oc, mv.bx);
      this.a(cqn.oe, mv.bx);
      this.a(cqn.oB, mv.bx);
      this.a(cqn.os, mv.bx);
      this.a(cqn.uC, mv.bx);
      this.a(cqn.ou, mv.bx);
      this.a(cqn.ue, mv.bx);
      this.a(cqn.dQ, mv.bz);
      this.a(cqn.rZ, mv.bx);
      this.a(cqn.vh, mv.bx);
      this.a(cqn.vj, mv.bx);
      this.a(cqn.nX, mv.bx);
      this.a(cqn.nY, mv.bx);
      this.a(cqn.rw, mv.bx);
      this.a(cqn.sn, mv.bx);
      this.a(cqn.sf, mv.bz);
      this.a(cqn.rs, mv.bx);
      this.a(cqn.rx, mv.bx);
      this.a(cqn.qO, mv.bx);
      this.a(cqn.pp, mv.bx);
      this.a(cqn.pw, mv.bx);
      this.a(cqn.qK, mv.bx);
      this.a(cqn.rt, mv.bx);
      this.a(cqn.qx, mv.bx);
      this.a(cqn.nQ, mv.bA);
      this.a(cqn.nR, mv.bA);
      this.a(cqn.ow, mv.bx);
      this.a(cqn.nM, mv.bx);
      this.a(cqn.sb, mv.bx);
      this.a(cqn.vd, mv.bx);
      this.a(cqn.qL, mv.bx);
      this.b(cqn.qV);
      this.a(cqn.ov, mv.bx);
      this.a(cqn.qG, mv.bx);
      this.a(cqn.uJ, mv.bx);
      this.a(cqn.qR);
      this.a(cqn.qS);
      this.a(cqn.sa, mv.bx);
      this.a(cqn.sc, mv.bx);
      this.a(cqn.rc, mv.bx);
      this.a(cqn.uL, mv.bx);
      this.a(cqn.pX, mv.bx);
      this.a(cqn.uy, mv.bx);
      this.a(cqn.rd, mv.bx);
      this.a(cqn.rR, mv.bx);
      this.a(cqn.oE, mv.bx);
      this.a(cqn.oF, mv.bx);
      this.a(cqn.vU, mv.bx);
      this.a(cqn.rq, mv.bx);
      this.a(cqn.of, mv.bx);
      this.a(cqn.og, mv.bx);
      this.a(cqn.ox, mv.bx);
      this.a(cqn.ph, mv.bz);
      this.a(cqn.pi, mv.bz);
      this.a(cqn.uF, mv.bx);
      this.a(cqn.pg, mv.bz);
      this.a(cqn.pf, mv.bz);
      this.a(cqn.pe, mv.bz);
      this.a(cqn.vk, mv.bx);
      this.a(cqn.rW, mv.bx);
      this.a(cqn.qQ, mv.bx);
      this.a(cqn.oy, mv.bx);
      this.a(cqn.ut, mv.bx);
      this.a(cqn.sr, mv.bx);
      this.a(cqn.se, mv.bx);
      this.a(cqn.vc, mv.bx);
      this.a(cqn.tU, mv.bx);
      this.a(cqn.sm, mv.bx);
      this.a(cqn.ur, mv.bx);
      this.a(cqn.tV, mv.bx);
      this.a(cqn.pV, mv.bx);
      this.a(cqn.or, mv.bx);
      this.a(cqn.vT, mv.bx);
      this.a(cqn.nN, mv.bx);
      this.a(cqn.sg, mv.bx);
      this.a(cqn.sk, mv.bx);
      this.a(cqn.ss, mv.bx);
      this.a(cqn.vX, mv.bx);
      this.a(cqn.wn, mv.bx);
      this.a(cqn.qX, mv.bx);
      this.a(cqn.rf, mv.bx);
      this.a(cqn.ua, mv.bx);
      this.a(cqn.oG, mv.bx);
      this.a(cqn.pZ, mv.bx);
      this.a(cqn.oX, mv.bz);
      this.a(cqn.uh, mv.bx);
      this.a(cqn.oY, mv.bz);
      this.a(cqn.uE, mv.bx);
      this.a(cqn.oW, mv.bz);
      this.a(cqn.oV, mv.bz);
      this.a(cqn.oU, mv.bz);
      this.a(cqn.oH, mv.bx);
      this.a(cqn.sh, mv.bx);
      this.a(cqn.ro, mv.bx);
      this.a(cqn.ru, mv.bx);
      this.a(cqn.pt, mv.bx);
      this.a(cqn.vP, mv.bx);
      this.a(cqn.wr, mv.bx);
      this.a(cqn.wu, mv.bx);
      this.a(cqn.nP, mv.bx);
      this.a(cqn.re, mv.bx);
      this.a(cqn.oC, mv.bx);
      this.a(cqn.pc, mv.bz);
      this.a(cqn.pd, mv.bz);
      this.a(cqn.uD, mv.bx);
      this.a(cqn.oD, mv.bx);
      this.a(cqn.vs, mv.bx);
      this.a(cqn.pb, mv.bz);
      this.a(cqn.pa, mv.bz);
      this.a(cqn.oZ, mv.bz);
      this.a(cqn.tZ, mv.bx);
      this.a(cqn.nZ, mv.bx);
      this.a(cqn.oa, mv.bx);
      this.a(cqn.vt, mv.bx);
      this.a(cqn.oz, mv.bx);
      this.a(cqn.qz, mv.bx);
      this.a(cqn.qC, mv.bx);
      this.a(cqn.uG, mv.bx);
      this.a(cqn.rk, mv.bx);
      this.a(cqn.rp, mv.bx);
      this.a(cqn.rm, mv.bx);
      this.a(cqn.rj, mv.bx);
      this.a(cqn.so, mv.bx);
      this.a(cqn.oh, mv.bx);
      this.a(cqn.oi, mv.bx);
      this.a(cqn.oj, mv.bx);
      this.a(cqn.ok, mv.bx);
      this.a(cqn.ug, mv.bx);
      this.a(cqn.rV, mv.bx);
      this.a(cqn.qD, mv.bx);
      this.a(cqn.nL, mv.bx);
      this.a(cqn.vW, mv.bx);
      this.a(cqn.pq, mv.bx);
      this.a(cqn.vL, mv.bx);
      this.a(cqn.vF, mv.by);
      this.a(cqn.vv, mv.by);
      this.a(cqn.vx, mv.by);
      this.a(cqn.vw, mv.by);
      this.a(cqn.vy, mv.by);
      this.a(cqn.vz, mv.by);
      this.a(cqn.vA, mv.by);
      this.a(cqn.vB, mv.by);
      this.a(cqn.vK, mv.by);
      this.a(cqn.vC, mv.by);
      this.a(cqn.vD, mv.by);
      this.a(cqn.vG, mv.by);
      this.a(cqn.vE, mv.by);
      this.a(cqn.vH, mv.by);
      this.a(cqn.vI, mv.by);
      this.a(cqn.vJ, mv.by);
      this.a(cqn.uK, mv.bx);
      this.a(cqn.uI, mv.bx);
      this.a(cqn.vO, mv.bx);
      this.a(cqn.pm, mv.bz);
      this.a(cqn.pn, mv.bz);
      this.a(cqn.oI, mv.bx);
      this.a(cqn.pl, mv.bz);
      this.a(cqn.oJ, mv.bx);
      this.a(cqn.pk, mv.bz);
      this.a(cqn.pj, mv.bz);
      this.a(cqn.uu, mv.bx);
      this.a(cqn.up, mv.bx);
      this.a(cqn.nT, mv.bx);
      this.a(cqn.nU, mv.bx);
      this.a(cqn.ri, mv.bx);
      this.a(cqn.pY, mv.bx);
      this.a(cqn.qN, mv.bx);
      this.a(cqn.vN, mv.bx);
      this.a(cqn.vY, mv.bx);
      this.a(cqn.rn, mv.bx);
      this.a(cqn.uf, mv.bx);
      this.a(cqn.ve, mv.bx);
      this.a(cqn.pW, mv.bx);
      this.a(cqn.qA, mv.bx);
      this.a(cqn.uw, mv.bx);
      this.a(cqn.uv, mv.bx);
      this.a(cqn.rb, mv.bx);
      this.a(cqn.qE, mv.bx);
      this.a(cqn.uq, mv.bx);
      this.a(cqn.rr, mv.bx);
      this.a(cqn.oA, mv.bx);
      this.a(cqn.ux, mv.bx);
      this.a(cqn.uA, mv.bx);
      this.a(cqn.uB, mv.bx);
      this.a(cqn.uz, mv.bx);
      this.a(cqn.rv, mv.bx);
      this.a(cqn.sd, mv.bx);
      this.a(cqn.nK, mv.bx);
      this.a(cqn.qZ, mv.bx);
      this.a(cqn.qF, mv.bx);
      this.a(cqn.oo, mv.bx);
      this.a(cqn.op, mv.bx);
      this.a(cqn.oq, mv.bx);
      this.a(cqn.rU, mv.bx);
      this.a(cqn.vr, mv.bx);
      this.a(cqn.vV, mv.bx);
      this.a(cqn.qP, mv.bx);
      this.a(cqn.qB, mv.bx);
      this.a(cqn.xl, mv.bx);
      this.a(cqn.vm, mv.bx);
      this.a(cqn.sl, mv.bx);
      this.a(cqn.nV, mv.bx);
      this.a(cqn.nW, mv.bx);
      this.a(cqn.qW, mv.bx);
      this.a(cqn.po, mv.bz);
      this.a(cqn.oS, mv.bz);
      this.a(cqn.oT, mv.bz);
      this.a(cqn.oR, mv.bz);
      this.a(cqn.oQ, mv.bz);
      this.a(cqn.oP, mv.bz);
      this.a(cqn.rz, mv.bx);
      this.a(cqn.vR, mv.bx);
      this.a(cqn.nO, mv.bx);
      this.a(cqn.vq, mv.bx);
      this.a(cqn.vM, mv.bx);
      this.a(cqn.ra, mv.bx);
      this.a(cqn.qH, mv.bx);
      this.a(cqn.qI, mv.bx);
      this.a(cqn.qJ, mv.bx);
      this.a(cqn.qy, mv.bx);
      this.a(cqn.pv, mv.bx);
      this.a(cqn.rh, mv.bx);
      this.a(cqn.tW, mv.bx);
      this.a(cqn.oN, mv.bz);
      this.a(cqn.oO, mv.bz);
      this.a(cqn.oM, mv.bz);
      this.a(cqn.oL, mv.bz);
      this.a(cqn.oK, mv.bz);
      this.a(cqn.tX, mv.bx);
      this.a(cqn.tY, mv.bx);
      this.a(cqn.rl, mv.bx);
      this.a(cqn.xn, mv.bx);
      this.a(cqn.xo, mv.bx);
      this.a(cqn.xp, mv.bx);
      this.a(cqn.xq, mv.bx);
      this.a(cqn.xr, mv.bx);
      this.a(cqn.xs, mv.bx);
      this.a(cqn.xt, mv.bx);
      this.a(cqn.xu, mv.bx);
      this.a(cqn.xv, mv.bx);
      this.a(cqn.xw, mv.bx);
      this.a(cqn.xx, mv.bx);
      this.a(cqn.xy, mv.bx);
      this.a(cqn.xz, mv.bx);
      this.a(cqn.xA, mv.bx);
      this.a(cqn.xB, mv.bx);
      this.a(cqn.xC, mv.bx);
      this.a(cqn.xD, mv.bx);
      this.a(cqn.vu, cqn.po, mv.bz);
      this.a(cqn.qa, cqn.pZ, mv.bx);

      for (cqf $$0 : ki.h) {
         if ($$0 instanceof cnw $$1) {
            this.a($$1);
         }
      }

      this.a(cqn.xE, mv.bx);
      this.a(cqn.xF, mv.bx);
      this.a(cqn.xG, mv.bx);
      this.a(cqn.xH, mv.bx);
      this.a(cqn.xI, mv.bx);
      this.a(cqn.xJ, mv.bx);
      this.a(cqn.xK, mv.bx);
      this.a(cqn.xL, mv.bx);
      this.a(cqn.xM, mv.bx);
      this.a(cqn.xN, mv.bx);
      this.a(cqn.xO, mv.bx);
      this.a(cqn.xP, mv.bx);
      this.a(cqn.xQ, mv.bx);
      this.a(cqn.xR, mv.bx);
      this.a(cqn.xS, mv.bx);
      this.a(cqn.xT, mv.bx);
      this.a(cqn.xU, mv.bx);
      this.a(cqn.xV, mv.bx);
      this.a(cqn.xW, mv.bx);
      this.a(cqn.xX, mv.bx);
      this.a(cqn.yp, mv.bx);
   }

   static record a(String a, float b, Map<il<cnx>, String> c) {
      public String a(il<cnx> $$0) {
         return this.c.getOrDefault($$0, this.a);
      }
   }
}
