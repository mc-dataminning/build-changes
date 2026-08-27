import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Supplier;

public class ma {
   public static final ahg a = new ahg("trim_type");
   private static final List<ma.a> b = List.of(
      new ma.a("quartz", 0.1F, Map.of()),
      new ma.a("iron", 0.2F, Map.of(ckk.c, "iron_darker")),
      new ma.a("netherite", 0.3F, Map.of(ckk.g, "netherite_darker")),
      new ma.a("redstone", 0.4F, Map.of()),
      new ma.a("copper", 0.5F, Map.of()),
      new ma.a("gold", 0.6F, Map.of(ckk.d, "gold_darker")),
      new ma.a("emerald", 0.7F, Map.of()),
      new ma.a("diamond", 0.8F, Map.of(ckk.e, "diamond_darker")),
      new ma.a("lapis", 0.9F, Map.of()),
      new ma.a("amethyst", 1.0F, Map.of())
   );
   private final BiConsumer<ahg, Supplier<JsonElement>> c;

   public ma(BiConsumer<ahg, Supplier<JsonElement>> $$0) {
      this.c = $$0;
   }

   private void a(cmt $$0, mo $$1) {
      $$1.a(mn.a($$0), mq.b($$0), this.c);
   }

   private void a(cmt $$0, String $$1, mo $$2) {
      $$2.a(mn.a($$0, $$1), mq.k(mq.a($$0, $$1)), this.c);
   }

   private void a(cmt $$0, cmt $$1, mo $$2) {
      $$2.a(mn.a($$0), mq.b($$1), this.c);
   }

   private void a(cmt $$0) {
      for (int $$1 = 0; $$1 < 32; $$1++) {
         if ($$1 != 16) {
            this.a($$0, String.format(Locale.ROOT, "_%02d", $$1), mp.bx);
         }
      }
   }

   private void b(cmt $$0) {
      for (int $$1 = 1; $$1 < 64; $$1++) {
         this.a($$0, String.format(Locale.ROOT, "_%02d", $$1), mp.bx);
      }
   }

   private void a(ahg $$0, ahg $$1, ahg $$2) {
      mp.bB.a($$0, mq.c($$1, $$2), this.c);
   }

   private void a(ahg $$0, ahg $$1, ahg $$2, ahg $$3) {
      mp.bC.a($$0, mq.a($$1, $$2, $$3), this.c);
   }

   private ahg a(ahg $$0, String $$1) {
      return $$0.e("_" + $$1 + "_trim");
   }

   private JsonObject a(ahg $$0, Map<mr, ahg> $$1, ckj $$2) {
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

   private void a(cki $$0) {
      ahg $$1 = mn.a($$0);
      ahg $$2 = mq.c($$0);
      ahg $$3 = mq.a($$0, "_overlay");
      if ($$0.d() == ckk.a) {
         mp.bB.a($$1, mq.c($$2, $$3), this.c, ($$1x, $$2x) -> this.a($$1x, $$2x, $$0.d()));
      } else {
         mp.bx.a($$1, mq.k($$2), this.c, ($$1x, $$2x) -> this.a($$1x, $$2x, $$0.d()));
      }

      for (ma.a $$4 : b) {
         String $$5 = $$4.a($$0.d());
         ahg $$6 = this.a($$1, $$5);
         String $$7 = $$0.b().b() + "_trim_" + $$5;
         ahg $$8 = new ahg($$7).d("trims/items/");
         if ($$0.d() == ckk.a) {
            this.a($$6, $$2, $$3, $$8);
         } else {
            this.a($$6, $$2, $$8);
         }
      }
   }

   public void a() {
      this.a(cnb.ob, mp.bx);
      this.a(cnb.od, mp.bx);
      this.a(cnb.oc, mp.bx);
      this.a(cnb.oe, mp.bx);
      this.a(cnb.oz, mp.bx);
      this.a(cnb.oq, mp.bx);
      this.a(cnb.uy, mp.bx);
      this.a(cnb.os, mp.bx);
      this.a(cnb.ua, mp.bx);
      this.a(cnb.dQ, mp.bz);
      this.a(cnb.rX, mp.bx);
      this.a(cnb.vd, mp.bx);
      this.a(cnb.vf, mp.bx);
      this.a(cnb.nX, mp.bx);
      this.a(cnb.nY, mp.bx);
      this.a(cnb.ru, mp.bx);
      this.a(cnb.sl, mp.bx);
      this.a(cnb.sd, mp.bz);
      this.a(cnb.rq, mp.bx);
      this.a(cnb.rv, mp.bx);
      this.a(cnb.qM, mp.bx);
      this.a(cnb.pn, mp.bx);
      this.a(cnb.pu, mp.bx);
      this.a(cnb.qI, mp.bx);
      this.a(cnb.rr, mp.bx);
      this.a(cnb.qv, mp.bx);
      this.a(cnb.nQ, mp.bA);
      this.a(cnb.nR, mp.bA);
      this.a(cnb.ou, mp.bx);
      this.a(cnb.nM, mp.bx);
      this.a(cnb.rZ, mp.bx);
      this.a(cnb.uZ, mp.bx);
      this.a(cnb.qJ, mp.bx);
      this.b(cnb.qT);
      this.a(cnb.ot, mp.bx);
      this.a(cnb.qE, mp.bx);
      this.a(cnb.uF, mp.bx);
      this.a(cnb.qP);
      this.a(cnb.qQ);
      this.a(cnb.rY, mp.bx);
      this.a(cnb.sa, mp.bx);
      this.a(cnb.ra, mp.bx);
      this.a(cnb.uH, mp.bx);
      this.a(cnb.pV, mp.bx);
      this.a(cnb.uu, mp.bx);
      this.a(cnb.rb, mp.bx);
      this.a(cnb.rP, mp.bx);
      this.a(cnb.oC, mp.bx);
      this.a(cnb.oD, mp.bx);
      this.a(cnb.vQ, mp.bx);
      this.a(cnb.ro, mp.bx);
      this.a(cnb.of, mp.bx);
      this.a(cnb.og, mp.bx);
      this.a(cnb.ov, mp.bx);
      this.a(cnb.pf, mp.bz);
      this.a(cnb.pg, mp.bz);
      this.a(cnb.uB, mp.bx);
      this.a(cnb.pe, mp.bz);
      this.a(cnb.pd, mp.bz);
      this.a(cnb.pc, mp.bz);
      this.a(cnb.vg, mp.bx);
      this.a(cnb.rU, mp.bx);
      this.a(cnb.qO, mp.bx);
      this.a(cnb.ow, mp.bx);
      this.a(cnb.up, mp.bx);
      this.a(cnb.sp, mp.bx);
      this.a(cnb.sc, mp.bx);
      this.a(cnb.uY, mp.bx);
      this.a(cnb.tR, mp.bx);
      this.a(cnb.sk, mp.bx);
      this.a(cnb.un, mp.bx);
      this.a(cnb.tS, mp.bx);
      this.a(cnb.pT, mp.bx);
      this.a(cnb.op, mp.bx);
      this.a(cnb.vP, mp.bx);
      this.a(cnb.nN, mp.bx);
      this.a(cnb.se, mp.bx);
      this.a(cnb.si, mp.bx);
      this.a(cnb.sq, mp.bx);
      this.a(cnb.vT, mp.bx);
      this.a(cnb.wj, mp.bx);
      this.a(cnb.qV, mp.bx);
      this.a(cnb.rd, mp.bx);
      this.a(cnb.tW, mp.bx);
      this.a(cnb.oE, mp.bx);
      this.a(cnb.pX, mp.bx);
      this.a(cnb.oV, mp.bz);
      this.a(cnb.ud, mp.bx);
      this.a(cnb.oW, mp.bz);
      this.a(cnb.uA, mp.bx);
      this.a(cnb.oU, mp.bz);
      this.a(cnb.oT, mp.bz);
      this.a(cnb.oS, mp.bz);
      this.a(cnb.oF, mp.bx);
      this.a(cnb.sf, mp.bx);
      this.a(cnb.rm, mp.bx);
      this.a(cnb.rs, mp.bx);
      this.a(cnb.pr, mp.bx);
      this.a(cnb.vL, mp.bx);
      this.a(cnb.wn, mp.bx);
      this.a(cnb.wq, mp.bx);
      this.a(cnb.nP, mp.bx);
      this.a(cnb.rc, mp.bx);
      this.a(cnb.oA, mp.bx);
      this.a(cnb.pa, mp.bz);
      this.a(cnb.pb, mp.bz);
      this.a(cnb.uz, mp.bx);
      this.a(cnb.oB, mp.bx);
      this.a(cnb.vo, mp.bx);
      this.a(cnb.oZ, mp.bz);
      this.a(cnb.oY, mp.bz);
      this.a(cnb.oX, mp.bz);
      this.a(cnb.tV, mp.bx);
      this.a(cnb.nZ, mp.bx);
      this.a(cnb.oa, mp.bx);
      this.a(cnb.vp, mp.bx);
      this.a(cnb.ox, mp.bx);
      this.a(cnb.qx, mp.bx);
      this.a(cnb.qA, mp.bx);
      this.a(cnb.uC, mp.bx);
      this.a(cnb.ri, mp.bx);
      this.a(cnb.rn, mp.bx);
      this.a(cnb.rk, mp.bx);
      this.a(cnb.rh, mp.bx);
      this.a(cnb.sm, mp.bx);
      this.a(cnb.oh, mp.bx);
      this.a(cnb.oi, mp.bx);
      this.a(cnb.oj, mp.bx);
      this.a(cnb.ok, mp.bx);
      this.a(cnb.uc, mp.bx);
      this.a(cnb.rT, mp.bx);
      this.a(cnb.qB, mp.bx);
      this.a(cnb.nL, mp.bx);
      this.a(cnb.vS, mp.bx);
      this.a(cnb.po, mp.bx);
      this.a(cnb.vH, mp.bx);
      this.a(cnb.vB, mp.by);
      this.a(cnb.vr, mp.by);
      this.a(cnb.vt, mp.by);
      this.a(cnb.vs, mp.by);
      this.a(cnb.vu, mp.by);
      this.a(cnb.vv, mp.by);
      this.a(cnb.vw, mp.by);
      this.a(cnb.vx, mp.by);
      this.a(cnb.vG, mp.by);
      this.a(cnb.vy, mp.by);
      this.a(cnb.vz, mp.by);
      this.a(cnb.vC, mp.by);
      this.a(cnb.vA, mp.by);
      this.a(cnb.vD, mp.by);
      this.a(cnb.vE, mp.by);
      this.a(cnb.vF, mp.by);
      this.a(cnb.uG, mp.bx);
      this.a(cnb.uE, mp.bx);
      this.a(cnb.vK, mp.bx);
      this.a(cnb.pk, mp.bz);
      this.a(cnb.pl, mp.bz);
      this.a(cnb.oG, mp.bx);
      this.a(cnb.pj, mp.bz);
      this.a(cnb.oH, mp.bx);
      this.a(cnb.pi, mp.bz);
      this.a(cnb.ph, mp.bz);
      this.a(cnb.uq, mp.bx);
      this.a(cnb.ul, mp.bx);
      this.a(cnb.nT, mp.bx);
      this.a(cnb.nU, mp.bx);
      this.a(cnb.rg, mp.bx);
      this.a(cnb.pW, mp.bx);
      this.a(cnb.qL, mp.bx);
      this.a(cnb.vJ, mp.bx);
      this.a(cnb.vU, mp.bx);
      this.a(cnb.rl, mp.bx);
      this.a(cnb.ub, mp.bx);
      this.a(cnb.va, mp.bx);
      this.a(cnb.pU, mp.bx);
      this.a(cnb.qy, mp.bx);
      this.a(cnb.us, mp.bx);
      this.a(cnb.ur, mp.bx);
      this.a(cnb.qZ, mp.bx);
      this.a(cnb.qC, mp.bx);
      this.a(cnb.um, mp.bx);
      this.a(cnb.rp, mp.bx);
      this.a(cnb.oy, mp.bx);
      this.a(cnb.ut, mp.bx);
      this.a(cnb.uw, mp.bx);
      this.a(cnb.ux, mp.bx);
      this.a(cnb.uv, mp.bx);
      this.a(cnb.rt, mp.bx);
      this.a(cnb.sb, mp.bx);
      this.a(cnb.nK, mp.bx);
      this.a(cnb.qX, mp.bx);
      this.a(cnb.qD, mp.bx);
      this.a(cnb.oo, mp.bx);
      this.a(cnb.rS, mp.bx);
      this.a(cnb.vn, mp.bx);
      this.a(cnb.vR, mp.bx);
      this.a(cnb.qN, mp.bx);
      this.a(cnb.qz, mp.bx);
      this.a(cnb.xh, mp.bx);
      this.a(cnb.vi, mp.bx);
      this.a(cnb.sj, mp.bx);
      this.a(cnb.nV, mp.bx);
      this.a(cnb.nW, mp.bx);
      this.a(cnb.qU, mp.bx);
      this.a(cnb.pm, mp.bz);
      this.a(cnb.oQ, mp.bz);
      this.a(cnb.oR, mp.bz);
      this.a(cnb.oP, mp.bz);
      this.a(cnb.oO, mp.bz);
      this.a(cnb.oN, mp.bz);
      this.a(cnb.rx, mp.bx);
      this.a(cnb.vN, mp.bx);
      this.a(cnb.nO, mp.bx);
      this.a(cnb.vm, mp.bx);
      this.a(cnb.vI, mp.bx);
      this.a(cnb.qY, mp.bx);
      this.a(cnb.qF, mp.bx);
      this.a(cnb.qG, mp.bx);
      this.a(cnb.qH, mp.bx);
      this.a(cnb.qw, mp.bx);
      this.a(cnb.pt, mp.bx);
      this.a(cnb.rf, mp.bx);
      this.a(cnb.oL, mp.bz);
      this.a(cnb.oM, mp.bz);
      this.a(cnb.oK, mp.bz);
      this.a(cnb.oJ, mp.bz);
      this.a(cnb.oI, mp.bz);
      this.a(cnb.tT, mp.bx);
      this.a(cnb.tU, mp.bx);
      this.a(cnb.rj, mp.bx);
      this.a(cnb.xj, mp.bx);
      this.a(cnb.xk, mp.bx);
      this.a(cnb.xl, mp.bx);
      this.a(cnb.xm, mp.bx);
      this.a(cnb.xn, mp.bx);
      this.a(cnb.xo, mp.bx);
      this.a(cnb.xp, mp.bx);
      this.a(cnb.xq, mp.bx);
      this.a(cnb.xr, mp.bx);
      this.a(cnb.xs, mp.bx);
      this.a(cnb.xt, mp.bx);
      this.a(cnb.xu, mp.bx);
      this.a(cnb.xv, mp.bx);
      this.a(cnb.xw, mp.bx);
      this.a(cnb.xx, mp.bx);
      this.a(cnb.xy, mp.bx);
      this.a(cnb.xz, mp.bx);
      this.a(cnb.vq, cnb.pm, mp.bz);
      this.a(cnb.pY, cnb.pX, mp.bx);

      for (cmt $$0 : kd.h) {
         if ($$0 instanceof cki $$1) {
            this.a($$1);
         }
      }

      this.a(cnb.xA, mp.bx);
      this.a(cnb.xB, mp.bx);
      this.a(cnb.xC, mp.bx);
      this.a(cnb.xD, mp.bx);
      this.a(cnb.xE, mp.bx);
      this.a(cnb.xF, mp.bx);
      this.a(cnb.xG, mp.bx);
      this.a(cnb.xH, mp.bx);
      this.a(cnb.xI, mp.bx);
      this.a(cnb.xJ, mp.bx);
      this.a(cnb.xK, mp.bx);
      this.a(cnb.xL, mp.bx);
      this.a(cnb.xM, mp.bx);
      this.a(cnb.xN, mp.bx);
      this.a(cnb.xO, mp.bx);
      this.a(cnb.xP, mp.bx);
      this.a(cnb.xQ, mp.bx);
      this.a(cnb.xR, mp.bx);
      this.a(cnb.xS, mp.bx);
      this.a(cnb.xT, mp.bx);
      this.a(cnb.yl, mp.bx);
   }

   static record a(String a, float b, Map<ckj, String> c) {
      public String a(ckj $$0) {
         return this.c.getOrDefault($$0, this.a);
      }
   }
}
