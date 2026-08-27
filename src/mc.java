import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Supplier;

public class mc {
   public static final aiy a = new aiy("trim_type");
   private static final List<mc.a> b = List.of(
      new mc.a("quartz", 0.1F, Map.of()),
      new mc.a("iron", 0.2F, Map.of(cml.c, "iron_darker")),
      new mc.a("netherite", 0.3F, Map.of(cml.g, "netherite_darker")),
      new mc.a("redstone", 0.4F, Map.of()),
      new mc.a("copper", 0.5F, Map.of()),
      new mc.a("gold", 0.6F, Map.of(cml.d, "gold_darker")),
      new mc.a("emerald", 0.7F, Map.of()),
      new mc.a("diamond", 0.8F, Map.of(cml.e, "diamond_darker")),
      new mc.a("lapis", 0.9F, Map.of()),
      new mc.a("amethyst", 1.0F, Map.of())
   );
   private final BiConsumer<aiy, Supplier<JsonElement>> c;

   public mc(BiConsumer<aiy, Supplier<JsonElement>> $$0) {
      this.c = $$0;
   }

   private void a(cou $$0, mq $$1) {
      $$1.a(mp.a($$0), ms.b($$0), this.c);
   }

   private void a(cou $$0, String $$1, mq $$2) {
      $$2.a(mp.a($$0, $$1), ms.k(ms.a($$0, $$1)), this.c);
   }

   private void a(cou $$0, cou $$1, mq $$2) {
      $$2.a(mp.a($$0), ms.b($$1), this.c);
   }

   private void a(cou $$0) {
      for (int $$1 = 0; $$1 < 32; $$1++) {
         if ($$1 != 16) {
            this.a($$0, String.format(Locale.ROOT, "_%02d", $$1), mr.bx);
         }
      }
   }

   private void b(cou $$0) {
      for (int $$1 = 1; $$1 < 64; $$1++) {
         this.a($$0, String.format(Locale.ROOT, "_%02d", $$1), mr.bx);
      }
   }

   private void a(aiy $$0, aiy $$1, aiy $$2) {
      mr.bB.a($$0, ms.c($$1, $$2), this.c);
   }

   private void a(aiy $$0, aiy $$1, aiy $$2, aiy $$3) {
      mr.bC.a($$0, ms.a($$1, $$2, $$3), this.c);
   }

   private aiy a(aiy $$0, String $$1) {
      return $$0.e("_" + $$1 + "_trim");
   }

   private JsonObject a(aiy $$0, Map<mt, aiy> $$1, cmk $$2) {
      JsonObject $$3 = mr.bB.a($$0, $$1);
      JsonArray $$4 = new JsonArray();

      for (mc.a $$5 : b) {
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

   private void a(cmj $$0) {
      aiy $$1 = mp.a($$0);
      aiy $$2 = ms.c($$0);
      aiy $$3 = ms.a($$0, "_overlay");
      if ($$0.d() == cml.a) {
         mr.bB.a($$1, ms.c($$2, $$3), this.c, ($$1x, $$2x) -> this.a($$1x, $$2x, $$0.d()));
      } else {
         mr.bx.a($$1, ms.k($$2), this.c, ($$1x, $$2x) -> this.a($$1x, $$2x, $$0.d()));
      }

      for (mc.a $$4 : b) {
         String $$5 = $$4.a($$0.d());
         aiy $$6 = this.a($$1, $$5);
         String $$7 = $$0.b().b() + "_trim_" + $$5;
         aiy $$8 = new aiy($$7).d("trims/items/");
         if ($$0.d() == cml.a) {
            this.a($$6, $$2, $$3, $$8);
         } else {
            this.a($$6, $$2, $$8);
         }
      }
   }

   public void a() {
      this.a(cpc.ob, mr.bx);
      this.a(cpc.od, mr.bx);
      this.a(cpc.oc, mr.bx);
      this.a(cpc.oe, mr.bx);
      this.a(cpc.oB, mr.bx);
      this.a(cpc.os, mr.bx);
      this.a(cpc.uB, mr.bx);
      this.a(cpc.ou, mr.bx);
      this.a(cpc.ud, mr.bx);
      this.a(cpc.dQ, mr.bz);
      this.a(cpc.rZ, mr.bx);
      this.a(cpc.vg, mr.bx);
      this.a(cpc.vi, mr.bx);
      this.a(cpc.nX, mr.bx);
      this.a(cpc.nY, mr.bx);
      this.a(cpc.rw, mr.bx);
      this.a(cpc.sn, mr.bx);
      this.a(cpc.sf, mr.bz);
      this.a(cpc.rs, mr.bx);
      this.a(cpc.rx, mr.bx);
      this.a(cpc.qO, mr.bx);
      this.a(cpc.pp, mr.bx);
      this.a(cpc.pw, mr.bx);
      this.a(cpc.qK, mr.bx);
      this.a(cpc.rt, mr.bx);
      this.a(cpc.qx, mr.bx);
      this.a(cpc.nQ, mr.bA);
      this.a(cpc.nR, mr.bA);
      this.a(cpc.ow, mr.bx);
      this.a(cpc.nM, mr.bx);
      this.a(cpc.sb, mr.bx);
      this.a(cpc.vc, mr.bx);
      this.a(cpc.qL, mr.bx);
      this.b(cpc.qV);
      this.a(cpc.ov, mr.bx);
      this.a(cpc.qG, mr.bx);
      this.a(cpc.uI, mr.bx);
      this.a(cpc.qR);
      this.a(cpc.qS);
      this.a(cpc.sa, mr.bx);
      this.a(cpc.sc, mr.bx);
      this.a(cpc.rc, mr.bx);
      this.a(cpc.uK, mr.bx);
      this.a(cpc.pX, mr.bx);
      this.a(cpc.ux, mr.bx);
      this.a(cpc.rd, mr.bx);
      this.a(cpc.rR, mr.bx);
      this.a(cpc.oE, mr.bx);
      this.a(cpc.oF, mr.bx);
      this.a(cpc.vT, mr.bx);
      this.a(cpc.rq, mr.bx);
      this.a(cpc.of, mr.bx);
      this.a(cpc.og, mr.bx);
      this.a(cpc.ox, mr.bx);
      this.a(cpc.ph, mr.bz);
      this.a(cpc.pi, mr.bz);
      this.a(cpc.uE, mr.bx);
      this.a(cpc.pg, mr.bz);
      this.a(cpc.pf, mr.bz);
      this.a(cpc.pe, mr.bz);
      this.a(cpc.vj, mr.bx);
      this.a(cpc.rW, mr.bx);
      this.a(cpc.qQ, mr.bx);
      this.a(cpc.oy, mr.bx);
      this.a(cpc.us, mr.bx);
      this.a(cpc.sr, mr.bx);
      this.a(cpc.se, mr.bx);
      this.a(cpc.vb, mr.bx);
      this.a(cpc.tU, mr.bx);
      this.a(cpc.sm, mr.bx);
      this.a(cpc.uq, mr.bx);
      this.a(cpc.tV, mr.bx);
      this.a(cpc.pV, mr.bx);
      this.a(cpc.or, mr.bx);
      this.a(cpc.vS, mr.bx);
      this.a(cpc.nN, mr.bx);
      this.a(cpc.sg, mr.bx);
      this.a(cpc.sk, mr.bx);
      this.a(cpc.ss, mr.bx);
      this.a(cpc.vW, mr.bx);
      this.a(cpc.wm, mr.bx);
      this.a(cpc.qX, mr.bx);
      this.a(cpc.rf, mr.bx);
      this.a(cpc.tZ, mr.bx);
      this.a(cpc.oG, mr.bx);
      this.a(cpc.pZ, mr.bx);
      this.a(cpc.oX, mr.bz);
      this.a(cpc.ug, mr.bx);
      this.a(cpc.oY, mr.bz);
      this.a(cpc.uD, mr.bx);
      this.a(cpc.oW, mr.bz);
      this.a(cpc.oV, mr.bz);
      this.a(cpc.oU, mr.bz);
      this.a(cpc.oH, mr.bx);
      this.a(cpc.sh, mr.bx);
      this.a(cpc.ro, mr.bx);
      this.a(cpc.ru, mr.bx);
      this.a(cpc.pt, mr.bx);
      this.a(cpc.vO, mr.bx);
      this.a(cpc.wq, mr.bx);
      this.a(cpc.wt, mr.bx);
      this.a(cpc.nP, mr.bx);
      this.a(cpc.re, mr.bx);
      this.a(cpc.oC, mr.bx);
      this.a(cpc.pc, mr.bz);
      this.a(cpc.pd, mr.bz);
      this.a(cpc.uC, mr.bx);
      this.a(cpc.oD, mr.bx);
      this.a(cpc.vr, mr.bx);
      this.a(cpc.pb, mr.bz);
      this.a(cpc.pa, mr.bz);
      this.a(cpc.oZ, mr.bz);
      this.a(cpc.tY, mr.bx);
      this.a(cpc.nZ, mr.bx);
      this.a(cpc.oa, mr.bx);
      this.a(cpc.vs, mr.bx);
      this.a(cpc.oz, mr.bx);
      this.a(cpc.qz, mr.bx);
      this.a(cpc.qC, mr.bx);
      this.a(cpc.uF, mr.bx);
      this.a(cpc.rk, mr.bx);
      this.a(cpc.rp, mr.bx);
      this.a(cpc.rm, mr.bx);
      this.a(cpc.rj, mr.bx);
      this.a(cpc.so, mr.bx);
      this.a(cpc.oh, mr.bx);
      this.a(cpc.oi, mr.bx);
      this.a(cpc.oj, mr.bx);
      this.a(cpc.ok, mr.bx);
      this.a(cpc.uf, mr.bx);
      this.a(cpc.rV, mr.bx);
      this.a(cpc.qD, mr.bx);
      this.a(cpc.nL, mr.bx);
      this.a(cpc.vV, mr.bx);
      this.a(cpc.pq, mr.bx);
      this.a(cpc.vK, mr.bx);
      this.a(cpc.vE, mr.by);
      this.a(cpc.vu, mr.by);
      this.a(cpc.vw, mr.by);
      this.a(cpc.vv, mr.by);
      this.a(cpc.vx, mr.by);
      this.a(cpc.vy, mr.by);
      this.a(cpc.vz, mr.by);
      this.a(cpc.vA, mr.by);
      this.a(cpc.vJ, mr.by);
      this.a(cpc.vB, mr.by);
      this.a(cpc.vC, mr.by);
      this.a(cpc.vF, mr.by);
      this.a(cpc.vD, mr.by);
      this.a(cpc.vG, mr.by);
      this.a(cpc.vH, mr.by);
      this.a(cpc.vI, mr.by);
      this.a(cpc.uJ, mr.bx);
      this.a(cpc.uH, mr.bx);
      this.a(cpc.vN, mr.bx);
      this.a(cpc.pm, mr.bz);
      this.a(cpc.pn, mr.bz);
      this.a(cpc.oI, mr.bx);
      this.a(cpc.pl, mr.bz);
      this.a(cpc.oJ, mr.bx);
      this.a(cpc.pk, mr.bz);
      this.a(cpc.pj, mr.bz);
      this.a(cpc.ut, mr.bx);
      this.a(cpc.uo, mr.bx);
      this.a(cpc.nT, mr.bx);
      this.a(cpc.nU, mr.bx);
      this.a(cpc.ri, mr.bx);
      this.a(cpc.pY, mr.bx);
      this.a(cpc.qN, mr.bx);
      this.a(cpc.vM, mr.bx);
      this.a(cpc.vX, mr.bx);
      this.a(cpc.rn, mr.bx);
      this.a(cpc.ue, mr.bx);
      this.a(cpc.vd, mr.bx);
      this.a(cpc.pW, mr.bx);
      this.a(cpc.qA, mr.bx);
      this.a(cpc.uv, mr.bx);
      this.a(cpc.uu, mr.bx);
      this.a(cpc.rb, mr.bx);
      this.a(cpc.qE, mr.bx);
      this.a(cpc.up, mr.bx);
      this.a(cpc.rr, mr.bx);
      this.a(cpc.oA, mr.bx);
      this.a(cpc.uw, mr.bx);
      this.a(cpc.uz, mr.bx);
      this.a(cpc.uA, mr.bx);
      this.a(cpc.uy, mr.bx);
      this.a(cpc.rv, mr.bx);
      this.a(cpc.sd, mr.bx);
      this.a(cpc.nK, mr.bx);
      this.a(cpc.qZ, mr.bx);
      this.a(cpc.qF, mr.bx);
      this.a(cpc.oo, mr.bx);
      this.a(cpc.op, mr.bx);
      this.a(cpc.oq, mr.bx);
      this.a(cpc.rU, mr.bx);
      this.a(cpc.vq, mr.bx);
      this.a(cpc.vU, mr.bx);
      this.a(cpc.qP, mr.bx);
      this.a(cpc.qB, mr.bx);
      this.a(cpc.xk, mr.bx);
      this.a(cpc.vl, mr.bx);
      this.a(cpc.sl, mr.bx);
      this.a(cpc.nV, mr.bx);
      this.a(cpc.nW, mr.bx);
      this.a(cpc.qW, mr.bx);
      this.a(cpc.po, mr.bz);
      this.a(cpc.oS, mr.bz);
      this.a(cpc.oT, mr.bz);
      this.a(cpc.oR, mr.bz);
      this.a(cpc.oQ, mr.bz);
      this.a(cpc.oP, mr.bz);
      this.a(cpc.rz, mr.bx);
      this.a(cpc.vQ, mr.bx);
      this.a(cpc.nO, mr.bx);
      this.a(cpc.vp, mr.bx);
      this.a(cpc.vL, mr.bx);
      this.a(cpc.ra, mr.bx);
      this.a(cpc.qH, mr.bx);
      this.a(cpc.qI, mr.bx);
      this.a(cpc.qJ, mr.bx);
      this.a(cpc.qy, mr.bx);
      this.a(cpc.pv, mr.bx);
      this.a(cpc.rh, mr.bx);
      this.a(cpc.oN, mr.bz);
      this.a(cpc.oO, mr.bz);
      this.a(cpc.oM, mr.bz);
      this.a(cpc.oL, mr.bz);
      this.a(cpc.oK, mr.bz);
      this.a(cpc.tW, mr.bx);
      this.a(cpc.tX, mr.bx);
      this.a(cpc.rl, mr.bx);
      this.a(cpc.xm, mr.bx);
      this.a(cpc.xn, mr.bx);
      this.a(cpc.xo, mr.bx);
      this.a(cpc.xp, mr.bx);
      this.a(cpc.xq, mr.bx);
      this.a(cpc.xr, mr.bx);
      this.a(cpc.xs, mr.bx);
      this.a(cpc.xt, mr.bx);
      this.a(cpc.xu, mr.bx);
      this.a(cpc.xv, mr.bx);
      this.a(cpc.xw, mr.bx);
      this.a(cpc.xx, mr.bx);
      this.a(cpc.xy, mr.bx);
      this.a(cpc.xz, mr.bx);
      this.a(cpc.xA, mr.bx);
      this.a(cpc.xB, mr.bx);
      this.a(cpc.xC, mr.bx);
      this.a(cpc.vt, cpc.po, mr.bz);
      this.a(cpc.qa, cpc.pZ, mr.bx);

      for (cou $$0 : kf.h) {
         if ($$0 instanceof cmj $$1) {
            this.a($$1);
         }
      }

      this.a(cpc.xD, mr.bx);
      this.a(cpc.xE, mr.bx);
      this.a(cpc.xF, mr.bx);
      this.a(cpc.xG, mr.bx);
      this.a(cpc.xH, mr.bx);
      this.a(cpc.xI, mr.bx);
      this.a(cpc.xJ, mr.bx);
      this.a(cpc.xK, mr.bx);
      this.a(cpc.xL, mr.bx);
      this.a(cpc.xM, mr.bx);
      this.a(cpc.xN, mr.bx);
      this.a(cpc.xO, mr.bx);
      this.a(cpc.xP, mr.bx);
      this.a(cpc.xQ, mr.bx);
      this.a(cpc.xR, mr.bx);
      this.a(cpc.xS, mr.bx);
      this.a(cpc.xT, mr.bx);
      this.a(cpc.xU, mr.bx);
      this.a(cpc.xV, mr.bx);
      this.a(cpc.xW, mr.bx);
      this.a(cpc.yo, mr.bx);
   }

   static record a(String a, float b, Map<cmk, String> c) {
      public String a(cmk $$0) {
         return this.c.getOrDefault($$0, this.a);
      }
   }
}
