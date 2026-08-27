import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Supplier;

public class mu {
   public static final ajv a = new ajv("trim_type");
   private static final List<mu.a> b = List.of(
      new mu.a("quartz", 0.1F, Map.of()),
      new mu.a("iron", 0.2F, Map.of(cpj.c, "iron_darker")),
      new mu.a("netherite", 0.3F, Map.of(cpj.g, "netherite_darker")),
      new mu.a("redstone", 0.4F, Map.of()),
      new mu.a("copper", 0.5F, Map.of()),
      new mu.a("gold", 0.6F, Map.of(cpj.d, "gold_darker")),
      new mu.a("emerald", 0.7F, Map.of()),
      new mu.a("diamond", 0.8F, Map.of(cpj.e, "diamond_darker")),
      new mu.a("lapis", 0.9F, Map.of()),
      new mu.a("amethyst", 1.0F, Map.of())
   );
   private final BiConsumer<ajv, Supplier<JsonElement>> c;

   public mu(BiConsumer<ajv, Supplier<JsonElement>> $$0) {
      this.c = $$0;
   }

   private void a(crn $$0, ni $$1) {
      $$1.a(nh.a($$0), nk.b($$0), this.c);
   }

   private void a(crn $$0, String $$1, ni $$2) {
      $$2.a(nh.a($$0, $$1), nk.k(nk.a($$0, $$1)), this.c);
   }

   private void a(crn $$0, crn $$1, ni $$2) {
      $$2.a(nh.a($$0), nk.b($$1), this.c);
   }

   private void a(crn $$0) {
      this.a(nh.a($$0), nk.c($$0), nk.a($$0, "_overlay"));
   }

   private void b(crn $$0) {
      for (int $$1 = 0; $$1 < 32; $$1++) {
         if ($$1 != 16) {
            this.a($$0, String.format(Locale.ROOT, "_%02d", $$1), nj.bx);
         }
      }
   }

   private void c(crn $$0) {
      for (int $$1 = 1; $$1 < 64; $$1++) {
         this.a($$0, String.format(Locale.ROOT, "_%02d", $$1), nj.bx);
      }
   }

   private void a(ajv $$0, ajv $$1, ajv $$2) {
      nj.bB.a($$0, nk.c($$1, $$2), this.c);
   }

   private void a(ajv $$0, ajv $$1, ajv $$2, ajv $$3) {
      nj.bC.a($$0, nk.a($$1, $$2, $$3), this.c);
   }

   private ajv a(ajv $$0, String $$1) {
      return $$0.e("_" + $$1 + "_trim");
   }

   private JsonObject a(ajv $$0, Map<nl, ajv> $$1, in<cpi> $$2) {
      JsonObject $$3 = nj.bB.a($$0, $$1);
      JsonArray $$4 = new JsonArray();

      for (mu.a $$5 : b) {
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

   private void a(cph $$0) {
      if ($$0.f().d()) {
         ajv $$1 = nh.a($$0);
         ajv $$2 = nk.c($$0);
         ajv $$3 = nk.a($$0, "_overlay");
         if ($$0.h().a(cpj.a)) {
            nj.bB.a($$1, nk.c($$2, $$3), this.c, ($$1x, $$2x) -> this.a($$1x, $$2x, $$0.h()));
         } else {
            nj.bx.a($$1, nk.k($$2), this.c, ($$1x, $$2x) -> this.a($$1x, $$2x, $$0.h()));
         }

         for (mu.a $$4 : b) {
            String $$5 = $$4.a($$0.h());
            ajv $$6 = this.a($$1, $$5);
            String $$7 = $$0.f().b() + "_trim_" + $$5;
            ajv $$8 = new ajv($$7).d("trims/items/");
            if ($$0.h().a(cpj.a)) {
               this.a($$6, $$2, $$3, $$8);
            } else {
               this.a($$6, $$2, $$8);
            }
         }
      }
   }

   public void a() {
      this.a(crv.ob, nj.bx);
      this.a(crv.od, nj.bx);
      this.a(crv.oc, nj.bx);
      this.a(crv.oe, nj.bx);
      this.a(crv.oB, nj.bx);
      this.a(crv.os, nj.bx);
      this.a(crv.op, nj.bx);
      this.a(crv.uD, nj.bx);
      this.a(crv.ou, nj.bx);
      this.a(crv.uf, nj.bx);
      this.a(crv.dQ, nj.bz);
      this.a(crv.rZ, nj.bx);
      this.a(crv.vi, nj.bx);
      this.a(crv.vk, nj.bx);
      this.a(crv.nX, nj.bx);
      this.a(crv.nY, nj.bx);
      this.a(crv.rw, nj.bx);
      this.a(crv.sn, nj.bx);
      this.a(crv.sf, nj.bz);
      this.a(crv.rs, nj.bx);
      this.a(crv.rx, nj.bx);
      this.a(crv.qO, nj.bx);
      this.a(crv.pp, nj.bx);
      this.a(crv.pw, nj.bx);
      this.a(crv.qK, nj.bx);
      this.a(crv.rt, nj.bx);
      this.a(crv.qx, nj.bx);
      this.a(crv.nQ, nj.bA);
      this.a(crv.nR, nj.bA);
      this.a(crv.ow, nj.bx);
      this.a(crv.nM, nj.bx);
      this.a(crv.sb, nj.bx);
      this.a(crv.ve, nj.bx);
      this.a(crv.qL, nj.bx);
      this.c(crv.qV);
      this.a(crv.ov, nj.bx);
      this.a(crv.qG, nj.bx);
      this.a(crv.uK, nj.bx);
      this.b(crv.qR);
      this.b(crv.qS);
      this.a(crv.sa, nj.bx);
      this.a(crv.sc, nj.bx);
      this.a(crv.rc, nj.bx);
      this.a(crv.uM, nj.bx);
      this.a(crv.pX, nj.bx);
      this.a(crv.uz, nj.bx);
      this.a(crv.rd, nj.bx);
      this.a(crv.rR, nj.bx);
      this.a(crv.oE, nj.bx);
      this.a(crv.oF, nj.bx);
      this.a(crv.vV, nj.bx);
      this.a(crv.rq, nj.bx);
      this.a(crv.of, nj.bx);
      this.a(crv.og, nj.bx);
      this.a(crv.ox, nj.bx);
      this.a(crv.ph, nj.bz);
      this.a(crv.pi, nj.bz);
      this.a(crv.uG, nj.bx);
      this.a(crv.pg, nj.bz);
      this.a(crv.pf, nj.bz);
      this.a(crv.pe, nj.bz);
      this.a(crv.vl, nj.bx);
      this.a(crv.rW, nj.bx);
      this.a(crv.qQ, nj.bx);
      this.a(crv.oy, nj.bx);
      this.a(crv.uu, nj.bx);
      this.a(crv.sr, nj.bx);
      this.a(crv.se, nj.bx);
      this.a(crv.vd, nj.bx);
      this.a(crv.tV, nj.bx);
      this.a(crv.sm, nj.bx);
      this.a(crv.us, nj.bx);
      this.a(crv.tW, nj.bx);
      this.a(crv.pV, nj.bx);
      this.a(crv.or, nj.bx);
      this.a(crv.vU, nj.bx);
      this.a(crv.nN, nj.bx);
      this.a(crv.sg, nj.bx);
      this.a(crv.sk, nj.bx);
      this.a(crv.ss, nj.bx);
      this.a(crv.vY, nj.bx);
      this.a(crv.wo, nj.bx);
      this.a(crv.qX, nj.bx);
      this.a(crv.rf, nj.bx);
      this.a(crv.ub, nj.bx);
      this.a(crv.oG, nj.bx);
      this.a(crv.pZ, nj.bx);
      this.a(crv.oX, nj.bz);
      this.a(crv.ui, nj.bx);
      this.a(crv.oY, nj.bz);
      this.a(crv.uF, nj.bx);
      this.a(crv.oW, nj.bz);
      this.a(crv.oV, nj.bz);
      this.a(crv.oU, nj.bz);
      this.a(crv.oH, nj.bx);
      this.a(crv.sh, nj.bx);
      this.a(crv.ro, nj.bx);
      this.a(crv.ru, nj.bx);
      this.a(crv.pt, nj.bx);
      this.a(crv.vQ, nj.bx);
      this.a(crv.ws, nj.bx);
      this.a(crv.wv, nj.bx);
      this.a(crv.nP, nj.bx);
      this.a(crv.re, nj.bx);
      this.a(crv.oC, nj.bx);
      this.a(crv.pc, nj.bz);
      this.a(crv.pd, nj.bz);
      this.a(crv.uE, nj.bx);
      this.a(crv.oD, nj.bx);
      this.a(crv.vt, nj.bx);
      this.a(crv.pb, nj.bz);
      this.a(crv.pa, nj.bz);
      this.a(crv.oZ, nj.bz);
      this.a(crv.ua, nj.bx);
      this.a(crv.nZ, nj.bx);
      this.a(crv.oa, nj.bx);
      this.a(crv.vu, nj.bx);
      this.a(crv.oz, nj.bx);
      this.a(crv.qz, nj.bx);
      this.a(crv.qC, nj.bx);
      this.a(crv.uH, nj.bx);
      this.a(crv.rk, nj.bx);
      this.a(crv.rp, nj.bx);
      this.a(crv.rm, nj.bx);
      this.a(crv.rj, nj.bx);
      this.a(crv.so, nj.bx);
      this.a(crv.oh, nj.bx);
      this.a(crv.oi, nj.bx);
      this.a(crv.oj, nj.bx);
      this.a(crv.ok, nj.bx);
      this.a(crv.uh, nj.bx);
      this.a(crv.rV, nj.bx);
      this.a(crv.qD, nj.bx);
      this.a(crv.nL, nj.bx);
      this.a(crv.vX, nj.bx);
      this.a(crv.pq, nj.bx);
      this.a(crv.vM, nj.bx);
      this.a(crv.vG, nj.by);
      this.a(crv.vw, nj.by);
      this.a(crv.vy, nj.by);
      this.a(crv.vx, nj.by);
      this.a(crv.vz, nj.by);
      this.a(crv.vA, nj.by);
      this.a(crv.vB, nj.by);
      this.a(crv.vC, nj.by);
      this.a(crv.vL, nj.by);
      this.a(crv.vD, nj.by);
      this.a(crv.vE, nj.by);
      this.a(crv.vH, nj.by);
      this.a(crv.vF, nj.by);
      this.a(crv.vI, nj.by);
      this.a(crv.vJ, nj.by);
      this.a(crv.vK, nj.by);
      this.a(crv.uL, nj.bx);
      this.a(crv.uJ, nj.bx);
      this.a(crv.vP, nj.bx);
      this.a(crv.pm, nj.bz);
      this.a(crv.pn, nj.bz);
      this.a(crv.oI, nj.bx);
      this.a(crv.pl, nj.bz);
      this.a(crv.oJ, nj.bx);
      this.a(crv.pk, nj.bz);
      this.a(crv.pj, nj.bz);
      this.a(crv.uv, nj.bx);
      this.a(crv.uq, nj.bx);
      this.a(crv.nT, nj.bx);
      this.a(crv.nU, nj.bx);
      this.a(crv.ri, nj.bx);
      this.a(crv.pY, nj.bx);
      this.a(crv.qN, nj.bx);
      this.a(crv.vO, nj.bx);
      this.a(crv.vZ, nj.bx);
      this.a(crv.rn, nj.bx);
      this.a(crv.ug, nj.bx);
      this.a(crv.vf, nj.bx);
      this.a(crv.pW, nj.bx);
      this.a(crv.qA, nj.bx);
      this.a(crv.ux, nj.bx);
      this.a(crv.uw, nj.bx);
      this.a(crv.rb, nj.bx);
      this.a(crv.qE, nj.bx);
      this.a(crv.ur, nj.bx);
      this.a(crv.rr, nj.bx);
      this.a(crv.oA, nj.bx);
      this.a(crv.uy, nj.bx);
      this.a(crv.uB, nj.bx);
      this.a(crv.uC, nj.bx);
      this.a(crv.uA, nj.bx);
      this.a(crv.rv, nj.bx);
      this.a(crv.sd, nj.bx);
      this.a(crv.nK, nj.bx);
      this.a(crv.qZ, nj.bx);
      this.a(crv.qF, nj.bx);
      this.a(crv.oo, nj.bx);
      this.a(crv.rU, nj.bx);
      this.a(crv.vs, nj.bx);
      this.a(crv.vW, nj.bx);
      this.a(crv.qP, nj.bx);
      this.a(crv.qB, nj.bx);
      this.a(crv.xm, nj.bx);
      this.a(crv.vn, nj.bx);
      this.a(crv.sl, nj.bx);
      this.a(crv.nV, nj.bx);
      this.a(crv.nW, nj.bx);
      this.a(crv.qW, nj.bx);
      this.a(crv.po, nj.bz);
      this.a(crv.oS, nj.bz);
      this.a(crv.oT, nj.bz);
      this.a(crv.oR, nj.bz);
      this.a(crv.oQ, nj.bz);
      this.a(crv.oP, nj.bz);
      this.a(crv.rz, nj.bx);
      this.a(crv.vS, nj.bx);
      this.a(crv.nO, nj.bx);
      this.a(crv.vr, nj.bx);
      this.a(crv.vN, nj.bx);
      this.a(crv.ra, nj.bx);
      this.a(crv.qH, nj.bx);
      this.a(crv.qI, nj.bx);
      this.a(crv.qJ, nj.bx);
      this.a(crv.qy, nj.bx);
      this.a(crv.pv, nj.bx);
      this.a(crv.rh, nj.bx);
      this.a(crv.tX, nj.bx);
      this.a(crv.oq);
      this.a(crv.oN, nj.bz);
      this.a(crv.oO, nj.bz);
      this.a(crv.oM, nj.bz);
      this.a(crv.oL, nj.bz);
      this.a(crv.oK, nj.bz);
      this.a(crv.tY, nj.bx);
      this.a(crv.tZ, nj.bx);
      this.a(crv.rl, nj.bx);
      this.a(crv.xo, nj.bx);
      this.a(crv.xp, nj.bx);
      this.a(crv.xq, nj.bx);
      this.a(crv.xr, nj.bx);
      this.a(crv.xs, nj.bx);
      this.a(crv.xt, nj.bx);
      this.a(crv.xu, nj.bx);
      this.a(crv.xv, nj.bx);
      this.a(crv.xw, nj.bx);
      this.a(crv.xx, nj.bx);
      this.a(crv.xy, nj.bx);
      this.a(crv.xz, nj.bx);
      this.a(crv.xA, nj.bx);
      this.a(crv.xB, nj.bx);
      this.a(crv.xC, nj.bx);
      this.a(crv.xD, nj.bx);
      this.a(crv.xE, nj.bx);
      this.a(crv.vv, crv.po, nj.bz);
      this.a(crv.qa, crv.pZ, nj.bx);

      for (crn $$0 : kt.h) {
         if ($$0 instanceof cph $$1) {
            this.a($$1);
         }
      }

      this.a(crv.xF, nj.bx);
      this.a(crv.xG, nj.bx);
      this.a(crv.xH, nj.bx);
      this.a(crv.xI, nj.bx);
      this.a(crv.xJ, nj.bx);
      this.a(crv.xK, nj.bx);
      this.a(crv.xL, nj.bx);
      this.a(crv.xM, nj.bx);
      this.a(crv.xN, nj.bx);
      this.a(crv.xO, nj.bx);
      this.a(crv.xP, nj.bx);
      this.a(crv.xQ, nj.bx);
      this.a(crv.xR, nj.bx);
      this.a(crv.xS, nj.bx);
      this.a(crv.xT, nj.bx);
      this.a(crv.xU, nj.bx);
      this.a(crv.xV, nj.bx);
      this.a(crv.xW, nj.bx);
      this.a(crv.xX, nj.bx);
      this.a(crv.xY, nj.bx);
      this.a(crv.yq, nj.bx);
   }

   static record a(String a, float b, Map<in<cpi>, String> c) {
      public String a(in<cpi> $$0) {
         return this.c.getOrDefault($$0, this.a);
      }
   }
}
