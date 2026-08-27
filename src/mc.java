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
      new mc.a("iron", 0.2F, Map.of(cmp.c, "iron_darker")),
      new mc.a("netherite", 0.3F, Map.of(cmp.g, "netherite_darker")),
      new mc.a("redstone", 0.4F, Map.of()),
      new mc.a("copper", 0.5F, Map.of()),
      new mc.a("gold", 0.6F, Map.of(cmp.d, "gold_darker")),
      new mc.a("emerald", 0.7F, Map.of()),
      new mc.a("diamond", 0.8F, Map.of(cmp.e, "diamond_darker")),
      new mc.a("lapis", 0.9F, Map.of()),
      new mc.a("amethyst", 1.0F, Map.of())
   );
   private final BiConsumer<aiy, Supplier<JsonElement>> c;

   public mc(BiConsumer<aiy, Supplier<JsonElement>> $$0) {
      this.c = $$0;
   }

   private void a(coy $$0, mq $$1) {
      $$1.a(mp.a($$0), ms.b($$0), this.c);
   }

   private void a(coy $$0, String $$1, mq $$2) {
      $$2.a(mp.a($$0, $$1), ms.k(ms.a($$0, $$1)), this.c);
   }

   private void a(coy $$0, coy $$1, mq $$2) {
      $$2.a(mp.a($$0), ms.b($$1), this.c);
   }

   private void a(coy $$0) {
      for (int $$1 = 0; $$1 < 32; $$1++) {
         if ($$1 != 16) {
            this.a($$0, String.format(Locale.ROOT, "_%02d", $$1), mr.bx);
         }
      }
   }

   private void b(coy $$0) {
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

   private JsonObject a(aiy $$0, Map<mt, aiy> $$1, cmo $$2) {
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

   private void a(cmn $$0) {
      aiy $$1 = mp.a($$0);
      aiy $$2 = ms.c($$0);
      aiy $$3 = ms.a($$0, "_overlay");
      if ($$0.d() == cmp.a) {
         mr.bB.a($$1, ms.c($$2, $$3), this.c, ($$1x, $$2x) -> this.a($$1x, $$2x, $$0.d()));
      } else {
         mr.bx.a($$1, ms.k($$2), this.c, ($$1x, $$2x) -> this.a($$1x, $$2x, $$0.d()));
      }

      for (mc.a $$4 : b) {
         String $$5 = $$4.a($$0.d());
         aiy $$6 = this.a($$1, $$5);
         String $$7 = $$0.b().b() + "_trim_" + $$5;
         aiy $$8 = new aiy($$7).d("trims/items/");
         if ($$0.d() == cmp.a) {
            this.a($$6, $$2, $$3, $$8);
         } else {
            this.a($$6, $$2, $$8);
         }
      }
   }

   public void a() {
      this.a(cpg.ob, mr.bx);
      this.a(cpg.od, mr.bx);
      this.a(cpg.oc, mr.bx);
      this.a(cpg.oe, mr.bx);
      this.a(cpg.oB, mr.bx);
      this.a(cpg.os, mr.bx);
      this.a(cpg.uB, mr.bx);
      this.a(cpg.ou, mr.bx);
      this.a(cpg.ud, mr.bx);
      this.a(cpg.dQ, mr.bz);
      this.a(cpg.rZ, mr.bx);
      this.a(cpg.vg, mr.bx);
      this.a(cpg.vi, mr.bx);
      this.a(cpg.nX, mr.bx);
      this.a(cpg.nY, mr.bx);
      this.a(cpg.rw, mr.bx);
      this.a(cpg.sn, mr.bx);
      this.a(cpg.sf, mr.bz);
      this.a(cpg.rs, mr.bx);
      this.a(cpg.rx, mr.bx);
      this.a(cpg.qO, mr.bx);
      this.a(cpg.pp, mr.bx);
      this.a(cpg.pw, mr.bx);
      this.a(cpg.qK, mr.bx);
      this.a(cpg.rt, mr.bx);
      this.a(cpg.qx, mr.bx);
      this.a(cpg.nQ, mr.bA);
      this.a(cpg.nR, mr.bA);
      this.a(cpg.ow, mr.bx);
      this.a(cpg.nM, mr.bx);
      this.a(cpg.sb, mr.bx);
      this.a(cpg.vc, mr.bx);
      this.a(cpg.qL, mr.bx);
      this.b(cpg.qV);
      this.a(cpg.ov, mr.bx);
      this.a(cpg.qG, mr.bx);
      this.a(cpg.uI, mr.bx);
      this.a(cpg.qR);
      this.a(cpg.qS);
      this.a(cpg.sa, mr.bx);
      this.a(cpg.sc, mr.bx);
      this.a(cpg.rc, mr.bx);
      this.a(cpg.uK, mr.bx);
      this.a(cpg.pX, mr.bx);
      this.a(cpg.ux, mr.bx);
      this.a(cpg.rd, mr.bx);
      this.a(cpg.rR, mr.bx);
      this.a(cpg.oE, mr.bx);
      this.a(cpg.oF, mr.bx);
      this.a(cpg.vT, mr.bx);
      this.a(cpg.rq, mr.bx);
      this.a(cpg.of, mr.bx);
      this.a(cpg.og, mr.bx);
      this.a(cpg.ox, mr.bx);
      this.a(cpg.ph, mr.bz);
      this.a(cpg.pi, mr.bz);
      this.a(cpg.uE, mr.bx);
      this.a(cpg.pg, mr.bz);
      this.a(cpg.pf, mr.bz);
      this.a(cpg.pe, mr.bz);
      this.a(cpg.vj, mr.bx);
      this.a(cpg.rW, mr.bx);
      this.a(cpg.qQ, mr.bx);
      this.a(cpg.oy, mr.bx);
      this.a(cpg.us, mr.bx);
      this.a(cpg.sr, mr.bx);
      this.a(cpg.se, mr.bx);
      this.a(cpg.vb, mr.bx);
      this.a(cpg.tU, mr.bx);
      this.a(cpg.sm, mr.bx);
      this.a(cpg.uq, mr.bx);
      this.a(cpg.tV, mr.bx);
      this.a(cpg.pV, mr.bx);
      this.a(cpg.or, mr.bx);
      this.a(cpg.vS, mr.bx);
      this.a(cpg.nN, mr.bx);
      this.a(cpg.sg, mr.bx);
      this.a(cpg.sk, mr.bx);
      this.a(cpg.ss, mr.bx);
      this.a(cpg.vW, mr.bx);
      this.a(cpg.wm, mr.bx);
      this.a(cpg.qX, mr.bx);
      this.a(cpg.rf, mr.bx);
      this.a(cpg.tZ, mr.bx);
      this.a(cpg.oG, mr.bx);
      this.a(cpg.pZ, mr.bx);
      this.a(cpg.oX, mr.bz);
      this.a(cpg.ug, mr.bx);
      this.a(cpg.oY, mr.bz);
      this.a(cpg.uD, mr.bx);
      this.a(cpg.oW, mr.bz);
      this.a(cpg.oV, mr.bz);
      this.a(cpg.oU, mr.bz);
      this.a(cpg.oH, mr.bx);
      this.a(cpg.sh, mr.bx);
      this.a(cpg.ro, mr.bx);
      this.a(cpg.ru, mr.bx);
      this.a(cpg.pt, mr.bx);
      this.a(cpg.vO, mr.bx);
      this.a(cpg.wq, mr.bx);
      this.a(cpg.wt, mr.bx);
      this.a(cpg.nP, mr.bx);
      this.a(cpg.re, mr.bx);
      this.a(cpg.oC, mr.bx);
      this.a(cpg.pc, mr.bz);
      this.a(cpg.pd, mr.bz);
      this.a(cpg.uC, mr.bx);
      this.a(cpg.oD, mr.bx);
      this.a(cpg.vr, mr.bx);
      this.a(cpg.pb, mr.bz);
      this.a(cpg.pa, mr.bz);
      this.a(cpg.oZ, mr.bz);
      this.a(cpg.tY, mr.bx);
      this.a(cpg.nZ, mr.bx);
      this.a(cpg.oa, mr.bx);
      this.a(cpg.vs, mr.bx);
      this.a(cpg.oz, mr.bx);
      this.a(cpg.qz, mr.bx);
      this.a(cpg.qC, mr.bx);
      this.a(cpg.uF, mr.bx);
      this.a(cpg.rk, mr.bx);
      this.a(cpg.rp, mr.bx);
      this.a(cpg.rm, mr.bx);
      this.a(cpg.rj, mr.bx);
      this.a(cpg.so, mr.bx);
      this.a(cpg.oh, mr.bx);
      this.a(cpg.oi, mr.bx);
      this.a(cpg.oj, mr.bx);
      this.a(cpg.ok, mr.bx);
      this.a(cpg.uf, mr.bx);
      this.a(cpg.rV, mr.bx);
      this.a(cpg.qD, mr.bx);
      this.a(cpg.nL, mr.bx);
      this.a(cpg.vV, mr.bx);
      this.a(cpg.pq, mr.bx);
      this.a(cpg.vK, mr.bx);
      this.a(cpg.vE, mr.by);
      this.a(cpg.vu, mr.by);
      this.a(cpg.vw, mr.by);
      this.a(cpg.vv, mr.by);
      this.a(cpg.vx, mr.by);
      this.a(cpg.vy, mr.by);
      this.a(cpg.vz, mr.by);
      this.a(cpg.vA, mr.by);
      this.a(cpg.vJ, mr.by);
      this.a(cpg.vB, mr.by);
      this.a(cpg.vC, mr.by);
      this.a(cpg.vF, mr.by);
      this.a(cpg.vD, mr.by);
      this.a(cpg.vG, mr.by);
      this.a(cpg.vH, mr.by);
      this.a(cpg.vI, mr.by);
      this.a(cpg.uJ, mr.bx);
      this.a(cpg.uH, mr.bx);
      this.a(cpg.vN, mr.bx);
      this.a(cpg.pm, mr.bz);
      this.a(cpg.pn, mr.bz);
      this.a(cpg.oI, mr.bx);
      this.a(cpg.pl, mr.bz);
      this.a(cpg.oJ, mr.bx);
      this.a(cpg.pk, mr.bz);
      this.a(cpg.pj, mr.bz);
      this.a(cpg.ut, mr.bx);
      this.a(cpg.uo, mr.bx);
      this.a(cpg.nT, mr.bx);
      this.a(cpg.nU, mr.bx);
      this.a(cpg.ri, mr.bx);
      this.a(cpg.pY, mr.bx);
      this.a(cpg.qN, mr.bx);
      this.a(cpg.vM, mr.bx);
      this.a(cpg.vX, mr.bx);
      this.a(cpg.rn, mr.bx);
      this.a(cpg.ue, mr.bx);
      this.a(cpg.vd, mr.bx);
      this.a(cpg.pW, mr.bx);
      this.a(cpg.qA, mr.bx);
      this.a(cpg.uv, mr.bx);
      this.a(cpg.uu, mr.bx);
      this.a(cpg.rb, mr.bx);
      this.a(cpg.qE, mr.bx);
      this.a(cpg.up, mr.bx);
      this.a(cpg.rr, mr.bx);
      this.a(cpg.oA, mr.bx);
      this.a(cpg.uw, mr.bx);
      this.a(cpg.uz, mr.bx);
      this.a(cpg.uA, mr.bx);
      this.a(cpg.uy, mr.bx);
      this.a(cpg.rv, mr.bx);
      this.a(cpg.sd, mr.bx);
      this.a(cpg.nK, mr.bx);
      this.a(cpg.qZ, mr.bx);
      this.a(cpg.qF, mr.bx);
      this.a(cpg.oo, mr.bx);
      this.a(cpg.op, mr.bx);
      this.a(cpg.oq, mr.bx);
      this.a(cpg.rU, mr.bx);
      this.a(cpg.vq, mr.bx);
      this.a(cpg.vU, mr.bx);
      this.a(cpg.qP, mr.bx);
      this.a(cpg.qB, mr.bx);
      this.a(cpg.xk, mr.bx);
      this.a(cpg.vl, mr.bx);
      this.a(cpg.sl, mr.bx);
      this.a(cpg.nV, mr.bx);
      this.a(cpg.nW, mr.bx);
      this.a(cpg.qW, mr.bx);
      this.a(cpg.po, mr.bz);
      this.a(cpg.oS, mr.bz);
      this.a(cpg.oT, mr.bz);
      this.a(cpg.oR, mr.bz);
      this.a(cpg.oQ, mr.bz);
      this.a(cpg.oP, mr.bz);
      this.a(cpg.rz, mr.bx);
      this.a(cpg.vQ, mr.bx);
      this.a(cpg.nO, mr.bx);
      this.a(cpg.vp, mr.bx);
      this.a(cpg.vL, mr.bx);
      this.a(cpg.ra, mr.bx);
      this.a(cpg.qH, mr.bx);
      this.a(cpg.qI, mr.bx);
      this.a(cpg.qJ, mr.bx);
      this.a(cpg.qy, mr.bx);
      this.a(cpg.pv, mr.bx);
      this.a(cpg.rh, mr.bx);
      this.a(cpg.oN, mr.bz);
      this.a(cpg.oO, mr.bz);
      this.a(cpg.oM, mr.bz);
      this.a(cpg.oL, mr.bz);
      this.a(cpg.oK, mr.bz);
      this.a(cpg.tW, mr.bx);
      this.a(cpg.tX, mr.bx);
      this.a(cpg.rl, mr.bx);
      this.a(cpg.xm, mr.bx);
      this.a(cpg.xn, mr.bx);
      this.a(cpg.xo, mr.bx);
      this.a(cpg.xp, mr.bx);
      this.a(cpg.xq, mr.bx);
      this.a(cpg.xr, mr.bx);
      this.a(cpg.xs, mr.bx);
      this.a(cpg.xt, mr.bx);
      this.a(cpg.xu, mr.bx);
      this.a(cpg.xv, mr.bx);
      this.a(cpg.xw, mr.bx);
      this.a(cpg.xx, mr.bx);
      this.a(cpg.xy, mr.bx);
      this.a(cpg.xz, mr.bx);
      this.a(cpg.xA, mr.bx);
      this.a(cpg.xB, mr.bx);
      this.a(cpg.xC, mr.bx);
      this.a(cpg.vt, cpg.po, mr.bz);
      this.a(cpg.qa, cpg.pZ, mr.bx);

      for (coy $$0 : kf.h) {
         if ($$0 instanceof cmn $$1) {
            this.a($$1);
         }
      }

      this.a(cpg.xD, mr.bx);
      this.a(cpg.xE, mr.bx);
      this.a(cpg.xF, mr.bx);
      this.a(cpg.xG, mr.bx);
      this.a(cpg.xH, mr.bx);
      this.a(cpg.xI, mr.bx);
      this.a(cpg.xJ, mr.bx);
      this.a(cpg.xK, mr.bx);
      this.a(cpg.xL, mr.bx);
      this.a(cpg.xM, mr.bx);
      this.a(cpg.xN, mr.bx);
      this.a(cpg.xO, mr.bx);
      this.a(cpg.xP, mr.bx);
      this.a(cpg.xQ, mr.bx);
      this.a(cpg.xR, mr.bx);
      this.a(cpg.xS, mr.bx);
      this.a(cpg.xT, mr.bx);
      this.a(cpg.xU, mr.bx);
      this.a(cpg.xV, mr.bx);
      this.a(cpg.xW, mr.bx);
      this.a(cpg.yo, mr.bx);
   }

   static record a(String a, float b, Map<cmo, String> c) {
      public String a(cmo $$0) {
         return this.c.getOrDefault($$0, this.a);
      }
   }
}
