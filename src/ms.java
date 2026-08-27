import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Supplier;

public class ms {
   public static final ajt a = new ajt("trim_type");
   private static final List<ms.a> b = List.of(
      new ms.a("quartz", 0.1F, Map.of()),
      new ms.a("iron", 0.2F, Map.of(cpa.c, "iron_darker")),
      new ms.a("netherite", 0.3F, Map.of(cpa.g, "netherite_darker")),
      new ms.a("redstone", 0.4F, Map.of()),
      new ms.a("copper", 0.5F, Map.of()),
      new ms.a("gold", 0.6F, Map.of(cpa.d, "gold_darker")),
      new ms.a("emerald", 0.7F, Map.of()),
      new ms.a("diamond", 0.8F, Map.of(cpa.e, "diamond_darker")),
      new ms.a("lapis", 0.9F, Map.of()),
      new ms.a("amethyst", 1.0F, Map.of())
   );
   private final BiConsumer<ajt, Supplier<JsonElement>> c;

   public ms(BiConsumer<ajt, Supplier<JsonElement>> $$0) {
      this.c = $$0;
   }

   private void a(cre $$0, ng $$1) {
      $$1.a(nf.a($$0), ni.b($$0), this.c);
   }

   private void a(cre $$0, String $$1, ng $$2) {
      $$2.a(nf.a($$0, $$1), ni.k(ni.a($$0, $$1)), this.c);
   }

   private void a(cre $$0, cre $$1, ng $$2) {
      $$2.a(nf.a($$0), ni.b($$1), this.c);
   }

   private void a(cre $$0) {
      this.a(nf.a($$0), ni.c($$0), ni.a($$0, "_overlay"));
   }

   private void b(cre $$0) {
      for (int $$1 = 0; $$1 < 32; $$1++) {
         if ($$1 != 16) {
            this.a($$0, String.format(Locale.ROOT, "_%02d", $$1), nh.bx);
         }
      }
   }

   private void c(cre $$0) {
      for (int $$1 = 1; $$1 < 64; $$1++) {
         this.a($$0, String.format(Locale.ROOT, "_%02d", $$1), nh.bx);
      }
   }

   private void a(ajt $$0, ajt $$1, ajt $$2) {
      nh.bB.a($$0, ni.c($$1, $$2), this.c);
   }

   private void a(ajt $$0, ajt $$1, ajt $$2, ajt $$3) {
      nh.bC.a($$0, ni.a($$1, $$2, $$3), this.c);
   }

   private ajt a(ajt $$0, String $$1) {
      return $$0.e("_" + $$1 + "_trim");
   }

   private JsonObject a(ajt $$0, Map<nj, ajt> $$1, il<coz> $$2) {
      JsonObject $$3 = nh.bB.a($$0, $$1);
      JsonArray $$4 = new JsonArray();

      for (ms.a $$5 : b) {
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

   private void a(coy $$0) {
      if ($$0.f().d()) {
         ajt $$1 = nf.a($$0);
         ajt $$2 = ni.c($$0);
         ajt $$3 = ni.a($$0, "_overlay");
         if ($$0.h().a(cpa.a)) {
            nh.bB.a($$1, ni.c($$2, $$3), this.c, ($$1x, $$2x) -> this.a($$1x, $$2x, $$0.h()));
         } else {
            nh.bx.a($$1, ni.k($$2), this.c, ($$1x, $$2x) -> this.a($$1x, $$2x, $$0.h()));
         }

         for (ms.a $$4 : b) {
            String $$5 = $$4.a($$0.h());
            ajt $$6 = this.a($$1, $$5);
            String $$7 = $$0.f().b() + "_trim_" + $$5;
            ajt $$8 = new ajt($$7).d("trims/items/");
            if ($$0.h().a(cpa.a)) {
               this.a($$6, $$2, $$3, $$8);
            } else {
               this.a($$6, $$2, $$8);
            }
         }
      }
   }

   public void a() {
      this.a(crm.ob, nh.bx);
      this.a(crm.od, nh.bx);
      this.a(crm.oc, nh.bx);
      this.a(crm.oe, nh.bx);
      this.a(crm.oB, nh.bx);
      this.a(crm.os, nh.bx);
      this.a(crm.op, nh.bx);
      this.a(crm.uD, nh.bx);
      this.a(crm.ou, nh.bx);
      this.a(crm.uf, nh.bx);
      this.a(crm.dQ, nh.bz);
      this.a(crm.rZ, nh.bx);
      this.a(crm.vi, nh.bx);
      this.a(crm.vk, nh.bx);
      this.a(crm.nX, nh.bx);
      this.a(crm.nY, nh.bx);
      this.a(crm.rw, nh.bx);
      this.a(crm.sn, nh.bx);
      this.a(crm.sf, nh.bz);
      this.a(crm.rs, nh.bx);
      this.a(crm.rx, nh.bx);
      this.a(crm.qO, nh.bx);
      this.a(crm.pp, nh.bx);
      this.a(crm.pw, nh.bx);
      this.a(crm.qK, nh.bx);
      this.a(crm.rt, nh.bx);
      this.a(crm.qx, nh.bx);
      this.a(crm.nQ, nh.bA);
      this.a(crm.nR, nh.bA);
      this.a(crm.ow, nh.bx);
      this.a(crm.nM, nh.bx);
      this.a(crm.sb, nh.bx);
      this.a(crm.ve, nh.bx);
      this.a(crm.qL, nh.bx);
      this.c(crm.qV);
      this.a(crm.ov, nh.bx);
      this.a(crm.qG, nh.bx);
      this.a(crm.uK, nh.bx);
      this.b(crm.qR);
      this.b(crm.qS);
      this.a(crm.sa, nh.bx);
      this.a(crm.sc, nh.bx);
      this.a(crm.rc, nh.bx);
      this.a(crm.uM, nh.bx);
      this.a(crm.pX, nh.bx);
      this.a(crm.uz, nh.bx);
      this.a(crm.rd, nh.bx);
      this.a(crm.rR, nh.bx);
      this.a(crm.oE, nh.bx);
      this.a(crm.oF, nh.bx);
      this.a(crm.vV, nh.bx);
      this.a(crm.rq, nh.bx);
      this.a(crm.of, nh.bx);
      this.a(crm.og, nh.bx);
      this.a(crm.ox, nh.bx);
      this.a(crm.ph, nh.bz);
      this.a(crm.pi, nh.bz);
      this.a(crm.uG, nh.bx);
      this.a(crm.pg, nh.bz);
      this.a(crm.pf, nh.bz);
      this.a(crm.pe, nh.bz);
      this.a(crm.vl, nh.bx);
      this.a(crm.rW, nh.bx);
      this.a(crm.qQ, nh.bx);
      this.a(crm.oy, nh.bx);
      this.a(crm.uu, nh.bx);
      this.a(crm.sr, nh.bx);
      this.a(crm.se, nh.bx);
      this.a(crm.vd, nh.bx);
      this.a(crm.tV, nh.bx);
      this.a(crm.sm, nh.bx);
      this.a(crm.us, nh.bx);
      this.a(crm.tW, nh.bx);
      this.a(crm.pV, nh.bx);
      this.a(crm.or, nh.bx);
      this.a(crm.vU, nh.bx);
      this.a(crm.nN, nh.bx);
      this.a(crm.sg, nh.bx);
      this.a(crm.sk, nh.bx);
      this.a(crm.ss, nh.bx);
      this.a(crm.vY, nh.bx);
      this.a(crm.wo, nh.bx);
      this.a(crm.qX, nh.bx);
      this.a(crm.rf, nh.bx);
      this.a(crm.ub, nh.bx);
      this.a(crm.oG, nh.bx);
      this.a(crm.pZ, nh.bx);
      this.a(crm.oX, nh.bz);
      this.a(crm.ui, nh.bx);
      this.a(crm.oY, nh.bz);
      this.a(crm.uF, nh.bx);
      this.a(crm.oW, nh.bz);
      this.a(crm.oV, nh.bz);
      this.a(crm.oU, nh.bz);
      this.a(crm.oH, nh.bx);
      this.a(crm.sh, nh.bx);
      this.a(crm.ro, nh.bx);
      this.a(crm.ru, nh.bx);
      this.a(crm.pt, nh.bx);
      this.a(crm.vQ, nh.bx);
      this.a(crm.ws, nh.bx);
      this.a(crm.wv, nh.bx);
      this.a(crm.nP, nh.bx);
      this.a(crm.re, nh.bx);
      this.a(crm.oC, nh.bx);
      this.a(crm.pc, nh.bz);
      this.a(crm.pd, nh.bz);
      this.a(crm.uE, nh.bx);
      this.a(crm.oD, nh.bx);
      this.a(crm.vt, nh.bx);
      this.a(crm.pb, nh.bz);
      this.a(crm.pa, nh.bz);
      this.a(crm.oZ, nh.bz);
      this.a(crm.ua, nh.bx);
      this.a(crm.nZ, nh.bx);
      this.a(crm.oa, nh.bx);
      this.a(crm.vu, nh.bx);
      this.a(crm.oz, nh.bx);
      this.a(crm.qz, nh.bx);
      this.a(crm.qC, nh.bx);
      this.a(crm.uH, nh.bx);
      this.a(crm.rk, nh.bx);
      this.a(crm.rp, nh.bx);
      this.a(crm.rm, nh.bx);
      this.a(crm.rj, nh.bx);
      this.a(crm.so, nh.bx);
      this.a(crm.oh, nh.bx);
      this.a(crm.oi, nh.bx);
      this.a(crm.oj, nh.bx);
      this.a(crm.ok, nh.bx);
      this.a(crm.uh, nh.bx);
      this.a(crm.rV, nh.bx);
      this.a(crm.qD, nh.bx);
      this.a(crm.nL, nh.bx);
      this.a(crm.vX, nh.bx);
      this.a(crm.pq, nh.bx);
      this.a(crm.vM, nh.bx);
      this.a(crm.vG, nh.by);
      this.a(crm.vw, nh.by);
      this.a(crm.vy, nh.by);
      this.a(crm.vx, nh.by);
      this.a(crm.vz, nh.by);
      this.a(crm.vA, nh.by);
      this.a(crm.vB, nh.by);
      this.a(crm.vC, nh.by);
      this.a(crm.vL, nh.by);
      this.a(crm.vD, nh.by);
      this.a(crm.vE, nh.by);
      this.a(crm.vH, nh.by);
      this.a(crm.vF, nh.by);
      this.a(crm.vI, nh.by);
      this.a(crm.vJ, nh.by);
      this.a(crm.vK, nh.by);
      this.a(crm.uL, nh.bx);
      this.a(crm.uJ, nh.bx);
      this.a(crm.vP, nh.bx);
      this.a(crm.pm, nh.bz);
      this.a(crm.pn, nh.bz);
      this.a(crm.oI, nh.bx);
      this.a(crm.pl, nh.bz);
      this.a(crm.oJ, nh.bx);
      this.a(crm.pk, nh.bz);
      this.a(crm.pj, nh.bz);
      this.a(crm.uv, nh.bx);
      this.a(crm.uq, nh.bx);
      this.a(crm.nT, nh.bx);
      this.a(crm.nU, nh.bx);
      this.a(crm.ri, nh.bx);
      this.a(crm.pY, nh.bx);
      this.a(crm.qN, nh.bx);
      this.a(crm.vO, nh.bx);
      this.a(crm.vZ, nh.bx);
      this.a(crm.rn, nh.bx);
      this.a(crm.ug, nh.bx);
      this.a(crm.vf, nh.bx);
      this.a(crm.pW, nh.bx);
      this.a(crm.qA, nh.bx);
      this.a(crm.ux, nh.bx);
      this.a(crm.uw, nh.bx);
      this.a(crm.rb, nh.bx);
      this.a(crm.qE, nh.bx);
      this.a(crm.ur, nh.bx);
      this.a(crm.rr, nh.bx);
      this.a(crm.oA, nh.bx);
      this.a(crm.uy, nh.bx);
      this.a(crm.uB, nh.bx);
      this.a(crm.uC, nh.bx);
      this.a(crm.uA, nh.bx);
      this.a(crm.rv, nh.bx);
      this.a(crm.sd, nh.bx);
      this.a(crm.nK, nh.bx);
      this.a(crm.qZ, nh.bx);
      this.a(crm.qF, nh.bx);
      this.a(crm.oo, nh.bx);
      this.a(crm.rU, nh.bx);
      this.a(crm.vs, nh.bx);
      this.a(crm.vW, nh.bx);
      this.a(crm.qP, nh.bx);
      this.a(crm.qB, nh.bx);
      this.a(crm.xm, nh.bx);
      this.a(crm.vn, nh.bx);
      this.a(crm.sl, nh.bx);
      this.a(crm.nV, nh.bx);
      this.a(crm.nW, nh.bx);
      this.a(crm.qW, nh.bx);
      this.a(crm.po, nh.bz);
      this.a(crm.oS, nh.bz);
      this.a(crm.oT, nh.bz);
      this.a(crm.oR, nh.bz);
      this.a(crm.oQ, nh.bz);
      this.a(crm.oP, nh.bz);
      this.a(crm.rz, nh.bx);
      this.a(crm.vS, nh.bx);
      this.a(crm.nO, nh.bx);
      this.a(crm.vr, nh.bx);
      this.a(crm.vN, nh.bx);
      this.a(crm.ra, nh.bx);
      this.a(crm.qH, nh.bx);
      this.a(crm.qI, nh.bx);
      this.a(crm.qJ, nh.bx);
      this.a(crm.qy, nh.bx);
      this.a(crm.pv, nh.bx);
      this.a(crm.rh, nh.bx);
      this.a(crm.tX, nh.bx);
      this.a(crm.oq);
      this.a(crm.oN, nh.bz);
      this.a(crm.oO, nh.bz);
      this.a(crm.oM, nh.bz);
      this.a(crm.oL, nh.bz);
      this.a(crm.oK, nh.bz);
      this.a(crm.tY, nh.bx);
      this.a(crm.tZ, nh.bx);
      this.a(crm.rl, nh.bx);
      this.a(crm.xo, nh.bx);
      this.a(crm.xp, nh.bx);
      this.a(crm.xq, nh.bx);
      this.a(crm.xr, nh.bx);
      this.a(crm.xs, nh.bx);
      this.a(crm.xt, nh.bx);
      this.a(crm.xu, nh.bx);
      this.a(crm.xv, nh.bx);
      this.a(crm.xw, nh.bx);
      this.a(crm.xx, nh.bx);
      this.a(crm.xy, nh.bx);
      this.a(crm.xz, nh.bx);
      this.a(crm.xA, nh.bx);
      this.a(crm.xB, nh.bx);
      this.a(crm.xC, nh.bx);
      this.a(crm.xD, nh.bx);
      this.a(crm.xE, nh.bx);
      this.a(crm.vv, crm.po, nh.bz);
      this.a(crm.qa, crm.pZ, nh.bx);

      for (cre $$0 : kr.h) {
         if ($$0 instanceof coy $$1) {
            this.a($$1);
         }
      }

      this.a(crm.xF, nh.bx);
      this.a(crm.xG, nh.bx);
      this.a(crm.xH, nh.bx);
      this.a(crm.xI, nh.bx);
      this.a(crm.xJ, nh.bx);
      this.a(crm.xK, nh.bx);
      this.a(crm.xL, nh.bx);
      this.a(crm.xM, nh.bx);
      this.a(crm.xN, nh.bx);
      this.a(crm.xO, nh.bx);
      this.a(crm.xP, nh.bx);
      this.a(crm.xQ, nh.bx);
      this.a(crm.xR, nh.bx);
      this.a(crm.xS, nh.bx);
      this.a(crm.xT, nh.bx);
      this.a(crm.xU, nh.bx);
      this.a(crm.xV, nh.bx);
      this.a(crm.xW, nh.bx);
      this.a(crm.xX, nh.bx);
      this.a(crm.xY, nh.bx);
      this.a(crm.yq, nh.bx);
   }

   static record a(String a, float b, Map<il<coz>, String> c) {
      public String a(il<coz> $$0) {
         return this.c.getOrDefault($$0, this.a);
      }
   }
}
