import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Supplier;

public class ma {
   public static final ahh a = new ahh("trim_type");
   private static final List<ma.a> b = List.of(
      new ma.a("quartz", 0.1F, Map.of()),
      new ma.a("iron", 0.2F, Map.of(ckt.c, "iron_darker")),
      new ma.a("netherite", 0.3F, Map.of(ckt.g, "netherite_darker")),
      new ma.a("redstone", 0.4F, Map.of()),
      new ma.a("copper", 0.5F, Map.of()),
      new ma.a("gold", 0.6F, Map.of(ckt.d, "gold_darker")),
      new ma.a("emerald", 0.7F, Map.of()),
      new ma.a("diamond", 0.8F, Map.of(ckt.e, "diamond_darker")),
      new ma.a("lapis", 0.9F, Map.of()),
      new ma.a("amethyst", 1.0F, Map.of())
   );
   private final BiConsumer<ahh, Supplier<JsonElement>> c;

   public ma(BiConsumer<ahh, Supplier<JsonElement>> $$0) {
      this.c = $$0;
   }

   private void a(cnb $$0, mo $$1) {
      $$1.a(mn.a($$0), mq.b($$0), this.c);
   }

   private void a(cnb $$0, String $$1, mo $$2) {
      $$2.a(mn.a($$0, $$1), mq.k(mq.a($$0, $$1)), this.c);
   }

   private void a(cnb $$0, cnb $$1, mo $$2) {
      $$2.a(mn.a($$0), mq.b($$1), this.c);
   }

   private void a(cnb $$0) {
      for (int $$1 = 0; $$1 < 32; $$1++) {
         if ($$1 != 16) {
            this.a($$0, String.format(Locale.ROOT, "_%02d", $$1), mp.bx);
         }
      }
   }

   private void b(cnb $$0) {
      for (int $$1 = 1; $$1 < 64; $$1++) {
         this.a($$0, String.format(Locale.ROOT, "_%02d", $$1), mp.bx);
      }
   }

   private void a(ahh $$0, ahh $$1, ahh $$2) {
      mp.bB.a($$0, mq.c($$1, $$2), this.c);
   }

   private void a(ahh $$0, ahh $$1, ahh $$2, ahh $$3) {
      mp.bC.a($$0, mq.a($$1, $$2, $$3), this.c);
   }

   private ahh a(ahh $$0, String $$1) {
      return $$0.e("_" + $$1 + "_trim");
   }

   private JsonObject a(ahh $$0, Map<mr, ahh> $$1, cks $$2) {
      JsonObject $$3 = mp.bB.a($$0, $$1);
      JsonArray $$4 = new JsonArray();

      for (ma.a $$5 : b) {
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

   private void a(ckr $$0) {
      ahh $$1 = mn.a($$0);
      ahh $$2 = mq.c($$0);
      ahh $$3 = mq.a($$0, "_overlay");
      if ($$0.d() == ckt.a) {
         mp.bB.a($$1, mq.c($$2, $$3), this.c, ($$1x, $$2x) -> this.a($$1x, $$2x, $$0.d()));
      } else {
         mp.bx.a($$1, mq.k($$2), this.c, ($$1x, $$2x) -> this.a($$1x, $$2x, $$0.d()));
      }

      for (ma.a $$4 : b) {
         String $$5 = $$4.a($$0.d());
         ahh $$6 = this.a($$1, $$5);
         String $$7 = $$0.b().b() + "_trim_" + $$5;
         ahh $$8 = new ahh($$7).d("trims/items/");
         if ($$0.d() == ckt.a) {
            this.a($$6, $$2, $$3, $$8);
         } else {
            this.a($$6, $$2, $$8);
         }
      }
   }

   public void a() {
      this.a(cnj.ob, mp.bx);
      this.a(cnj.od, mp.bx);
      this.a(cnj.oc, mp.bx);
      this.a(cnj.oe, mp.bx);
      this.a(cnj.oB, mp.bx);
      this.a(cnj.os, mp.bx);
      this.a(cnj.uB, mp.bx);
      this.a(cnj.ou, mp.bx);
      this.a(cnj.ud, mp.bx);
      this.a(cnj.dQ, mp.bz);
      this.a(cnj.rZ, mp.bx);
      this.a(cnj.vg, mp.bx);
      this.a(cnj.vi, mp.bx);
      this.a(cnj.nX, mp.bx);
      this.a(cnj.nY, mp.bx);
      this.a(cnj.rw, mp.bx);
      this.a(cnj.sn, mp.bx);
      this.a(cnj.sf, mp.bz);
      this.a(cnj.rs, mp.bx);
      this.a(cnj.rx, mp.bx);
      this.a(cnj.qO, mp.bx);
      this.a(cnj.pp, mp.bx);
      this.a(cnj.pw, mp.bx);
      this.a(cnj.qK, mp.bx);
      this.a(cnj.rt, mp.bx);
      this.a(cnj.qx, mp.bx);
      this.a(cnj.nQ, mp.bA);
      this.a(cnj.nR, mp.bA);
      this.a(cnj.ow, mp.bx);
      this.a(cnj.nM, mp.bx);
      this.a(cnj.sb, mp.bx);
      this.a(cnj.vc, mp.bx);
      this.a(cnj.qL, mp.bx);
      this.b(cnj.qV);
      this.a(cnj.ov, mp.bx);
      this.a(cnj.qG, mp.bx);
      this.a(cnj.uI, mp.bx);
      this.a(cnj.qR);
      this.a(cnj.qS);
      this.a(cnj.sa, mp.bx);
      this.a(cnj.sc, mp.bx);
      this.a(cnj.rc, mp.bx);
      this.a(cnj.uK, mp.bx);
      this.a(cnj.pX, mp.bx);
      this.a(cnj.ux, mp.bx);
      this.a(cnj.rd, mp.bx);
      this.a(cnj.rR, mp.bx);
      this.a(cnj.oE, mp.bx);
      this.a(cnj.oF, mp.bx);
      this.a(cnj.vT, mp.bx);
      this.a(cnj.rq, mp.bx);
      this.a(cnj.of, mp.bx);
      this.a(cnj.og, mp.bx);
      this.a(cnj.ox, mp.bx);
      this.a(cnj.ph, mp.bz);
      this.a(cnj.pi, mp.bz);
      this.a(cnj.uE, mp.bx);
      this.a(cnj.pg, mp.bz);
      this.a(cnj.pf, mp.bz);
      this.a(cnj.pe, mp.bz);
      this.a(cnj.vj, mp.bx);
      this.a(cnj.rW, mp.bx);
      this.a(cnj.qQ, mp.bx);
      this.a(cnj.oy, mp.bx);
      this.a(cnj.us, mp.bx);
      this.a(cnj.sr, mp.bx);
      this.a(cnj.se, mp.bx);
      this.a(cnj.vb, mp.bx);
      this.a(cnj.tU, mp.bx);
      this.a(cnj.sm, mp.bx);
      this.a(cnj.uq, mp.bx);
      this.a(cnj.tV, mp.bx);
      this.a(cnj.pV, mp.bx);
      this.a(cnj.or, mp.bx);
      this.a(cnj.vS, mp.bx);
      this.a(cnj.nN, mp.bx);
      this.a(cnj.sg, mp.bx);
      this.a(cnj.sk, mp.bx);
      this.a(cnj.ss, mp.bx);
      this.a(cnj.vW, mp.bx);
      this.a(cnj.wm, mp.bx);
      this.a(cnj.qX, mp.bx);
      this.a(cnj.rf, mp.bx);
      this.a(cnj.tZ, mp.bx);
      this.a(cnj.oG, mp.bx);
      this.a(cnj.pZ, mp.bx);
      this.a(cnj.oX, mp.bz);
      this.a(cnj.ug, mp.bx);
      this.a(cnj.oY, mp.bz);
      this.a(cnj.uD, mp.bx);
      this.a(cnj.oW, mp.bz);
      this.a(cnj.oV, mp.bz);
      this.a(cnj.oU, mp.bz);
      this.a(cnj.oH, mp.bx);
      this.a(cnj.sh, mp.bx);
      this.a(cnj.ro, mp.bx);
      this.a(cnj.ru, mp.bx);
      this.a(cnj.pt, mp.bx);
      this.a(cnj.vO, mp.bx);
      this.a(cnj.wq, mp.bx);
      this.a(cnj.wt, mp.bx);
      this.a(cnj.nP, mp.bx);
      this.a(cnj.re, mp.bx);
      this.a(cnj.oC, mp.bx);
      this.a(cnj.pc, mp.bz);
      this.a(cnj.pd, mp.bz);
      this.a(cnj.uC, mp.bx);
      this.a(cnj.oD, mp.bx);
      this.a(cnj.vr, mp.bx);
      this.a(cnj.pb, mp.bz);
      this.a(cnj.pa, mp.bz);
      this.a(cnj.oZ, mp.bz);
      this.a(cnj.tY, mp.bx);
      this.a(cnj.nZ, mp.bx);
      this.a(cnj.oa, mp.bx);
      this.a(cnj.vs, mp.bx);
      this.a(cnj.oz, mp.bx);
      this.a(cnj.qz, mp.bx);
      this.a(cnj.qC, mp.bx);
      this.a(cnj.uF, mp.bx);
      this.a(cnj.rk, mp.bx);
      this.a(cnj.rp, mp.bx);
      this.a(cnj.rm, mp.bx);
      this.a(cnj.rj, mp.bx);
      this.a(cnj.so, mp.bx);
      this.a(cnj.oh, mp.bx);
      this.a(cnj.oi, mp.bx);
      this.a(cnj.oj, mp.bx);
      this.a(cnj.ok, mp.bx);
      this.a(cnj.uf, mp.bx);
      this.a(cnj.rV, mp.bx);
      this.a(cnj.qD, mp.bx);
      this.a(cnj.nL, mp.bx);
      this.a(cnj.vV, mp.bx);
      this.a(cnj.pq, mp.bx);
      this.a(cnj.vK, mp.bx);
      this.a(cnj.vE, mp.by);
      this.a(cnj.vu, mp.by);
      this.a(cnj.vw, mp.by);
      this.a(cnj.vv, mp.by);
      this.a(cnj.vx, mp.by);
      this.a(cnj.vy, mp.by);
      this.a(cnj.vz, mp.by);
      this.a(cnj.vA, mp.by);
      this.a(cnj.vJ, mp.by);
      this.a(cnj.vB, mp.by);
      this.a(cnj.vC, mp.by);
      this.a(cnj.vF, mp.by);
      this.a(cnj.vD, mp.by);
      this.a(cnj.vG, mp.by);
      this.a(cnj.vH, mp.by);
      this.a(cnj.vI, mp.by);
      this.a(cnj.uJ, mp.bx);
      this.a(cnj.uH, mp.bx);
      this.a(cnj.vN, mp.bx);
      this.a(cnj.pm, mp.bz);
      this.a(cnj.pn, mp.bz);
      this.a(cnj.oI, mp.bx);
      this.a(cnj.pl, mp.bz);
      this.a(cnj.oJ, mp.bx);
      this.a(cnj.pk, mp.bz);
      this.a(cnj.pj, mp.bz);
      this.a(cnj.ut, mp.bx);
      this.a(cnj.uo, mp.bx);
      this.a(cnj.nT, mp.bx);
      this.a(cnj.nU, mp.bx);
      this.a(cnj.ri, mp.bx);
      this.a(cnj.pY, mp.bx);
      this.a(cnj.qN, mp.bx);
      this.a(cnj.vM, mp.bx);
      this.a(cnj.vX, mp.bx);
      this.a(cnj.rn, mp.bx);
      this.a(cnj.ue, mp.bx);
      this.a(cnj.vd, mp.bx);
      this.a(cnj.pW, mp.bx);
      this.a(cnj.qA, mp.bx);
      this.a(cnj.uv, mp.bx);
      this.a(cnj.uu, mp.bx);
      this.a(cnj.rb, mp.bx);
      this.a(cnj.qE, mp.bx);
      this.a(cnj.up, mp.bx);
      this.a(cnj.rr, mp.bx);
      this.a(cnj.oA, mp.bx);
      this.a(cnj.uw, mp.bx);
      this.a(cnj.uz, mp.bx);
      this.a(cnj.uA, mp.bx);
      this.a(cnj.uy, mp.bx);
      this.a(cnj.rv, mp.bx);
      this.a(cnj.sd, mp.bx);
      this.a(cnj.nK, mp.bx);
      this.a(cnj.qZ, mp.bx);
      this.a(cnj.qF, mp.bx);
      this.a(cnj.oo, mp.bx);
      this.a(cnj.op, mp.bx);
      this.a(cnj.oq, mp.bx);
      this.a(cnj.rU, mp.bx);
      this.a(cnj.vq, mp.bx);
      this.a(cnj.vU, mp.bx);
      this.a(cnj.qP, mp.bx);
      this.a(cnj.qB, mp.bx);
      this.a(cnj.xk, mp.bx);
      this.a(cnj.vl, mp.bx);
      this.a(cnj.sl, mp.bx);
      this.a(cnj.nV, mp.bx);
      this.a(cnj.nW, mp.bx);
      this.a(cnj.qW, mp.bx);
      this.a(cnj.po, mp.bz);
      this.a(cnj.oS, mp.bz);
      this.a(cnj.oT, mp.bz);
      this.a(cnj.oR, mp.bz);
      this.a(cnj.oQ, mp.bz);
      this.a(cnj.oP, mp.bz);
      this.a(cnj.rz, mp.bx);
      this.a(cnj.vQ, mp.bx);
      this.a(cnj.nO, mp.bx);
      this.a(cnj.vp, mp.bx);
      this.a(cnj.vL, mp.bx);
      this.a(cnj.ra, mp.bx);
      this.a(cnj.qH, mp.bx);
      this.a(cnj.qI, mp.bx);
      this.a(cnj.qJ, mp.bx);
      this.a(cnj.qy, mp.bx);
      this.a(cnj.pv, mp.bx);
      this.a(cnj.rh, mp.bx);
      this.a(cnj.oN, mp.bz);
      this.a(cnj.oO, mp.bz);
      this.a(cnj.oM, mp.bz);
      this.a(cnj.oL, mp.bz);
      this.a(cnj.oK, mp.bz);
      this.a(cnj.tW, mp.bx);
      this.a(cnj.tX, mp.bx);
      this.a(cnj.rl, mp.bx);
      this.a(cnj.xm, mp.bx);
      this.a(cnj.xn, mp.bx);
      this.a(cnj.xo, mp.bx);
      this.a(cnj.xp, mp.bx);
      this.a(cnj.xq, mp.bx);
      this.a(cnj.xr, mp.bx);
      this.a(cnj.xs, mp.bx);
      this.a(cnj.xt, mp.bx);
      this.a(cnj.xu, mp.bx);
      this.a(cnj.xv, mp.bx);
      this.a(cnj.xw, mp.bx);
      this.a(cnj.xx, mp.bx);
      this.a(cnj.xy, mp.bx);
      this.a(cnj.xz, mp.bx);
      this.a(cnj.xA, mp.bx);
      this.a(cnj.xB, mp.bx);
      this.a(cnj.xC, mp.bx);
      this.a(cnj.vt, cnj.po, mp.bz);
      this.a(cnj.qa, cnj.pZ, mp.bx);

      for (cnb $$0 : kd.h) {
         if ($$0 instanceof ckr $$1) {
            this.a($$1);
         }
      }

      this.a(cnj.xD, mp.bx);
      this.a(cnj.xE, mp.bx);
      this.a(cnj.xF, mp.bx);
      this.a(cnj.xG, mp.bx);
      this.a(cnj.xH, mp.bx);
      this.a(cnj.xI, mp.bx);
      this.a(cnj.xJ, mp.bx);
      this.a(cnj.xK, mp.bx);
      this.a(cnj.xL, mp.bx);
      this.a(cnj.xM, mp.bx);
      this.a(cnj.xN, mp.bx);
      this.a(cnj.xO, mp.bx);
      this.a(cnj.xP, mp.bx);
      this.a(cnj.xQ, mp.bx);
      this.a(cnj.xR, mp.bx);
      this.a(cnj.xS, mp.bx);
      this.a(cnj.xT, mp.bx);
      this.a(cnj.xU, mp.bx);
      this.a(cnj.xV, mp.bx);
      this.a(cnj.xW, mp.bx);
      this.a(cnj.yo, mp.bx);
   }

   static record a(String a, float b, Map<cks, String> c) {
      public String a(cks $$0) {
         return this.c.getOrDefault($$0, this.a);
      }
   }
}
