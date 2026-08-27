import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Supplier;

public class nh {
   public static final akm a = new akm("trim_type");
   private static final List<nh.a> b = List.of(
      new nh.a("quartz", 0.1F, Map.of()),
      new nh.a("iron", 0.2F, Map.of(crf.c, "iron_darker")),
      new nh.a("netherite", 0.3F, Map.of(crf.g, "netherite_darker")),
      new nh.a("redstone", 0.4F, Map.of()),
      new nh.a("copper", 0.5F, Map.of()),
      new nh.a("gold", 0.6F, Map.of(crf.d, "gold_darker")),
      new nh.a("emerald", 0.7F, Map.of()),
      new nh.a("diamond", 0.8F, Map.of(crf.e, "diamond_darker")),
      new nh.a("lapis", 0.9F, Map.of()),
      new nh.a("amethyst", 1.0F, Map.of())
   );
   private final BiConsumer<akm, Supplier<JsonElement>> c;

   public nh(BiConsumer<akm, Supplier<JsonElement>> $$0) {
      this.c = $$0;
   }

   private void a(ctj $$0, nv $$1) {
      $$1.a(nu.a($$0), nx.b($$0), this.c);
   }

   private void a(ctj $$0, String $$1, nv $$2) {
      $$2.a(nu.a($$0, $$1), nx.k(nx.a($$0, $$1)), this.c);
   }

   private void a(ctj $$0, ctj $$1, nv $$2) {
      $$2.a(nu.a($$0), nx.b($$1), this.c);
   }

   private void a(ctj $$0) {
      this.a(nu.a($$0), nx.c($$0), nx.a($$0, "_overlay"));
   }

   private void b(ctj $$0) {
      for (int $$1 = 0; $$1 < 32; $$1++) {
         if ($$1 != 16) {
            this.a($$0, String.format(Locale.ROOT, "_%02d", $$1), nw.bx);
         }
      }
   }

   private void c(ctj $$0) {
      for (int $$1 = 1; $$1 < 64; $$1++) {
         this.a($$0, String.format(Locale.ROOT, "_%02d", $$1), nw.bx);
      }
   }

   private void a(akm $$0, akm $$1, akm $$2) {
      nw.bB.a($$0, nx.c($$1, $$2), this.c);
   }

   private void a(akm $$0, akm $$1, akm $$2, akm $$3) {
      nw.bC.a($$0, nx.a($$1, $$2, $$3), this.c);
   }

   private akm a(akm $$0, String $$1) {
      return $$0.e("_" + $$1 + "_trim");
   }

   private JsonObject a(akm $$0, Map<ny, akm> $$1, ix<cre> $$2) {
      JsonObject $$3 = nw.bB.a($$0, $$1);
      JsonArray $$4 = new JsonArray();

      for (nh.a $$5 : b) {
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

   private void a(crd $$0) {
      if ($$0.f().d()) {
         akm $$1 = nu.a($$0);
         akm $$2 = nx.c($$0);
         akm $$3 = nx.a($$0, "_overlay");
         if ($$0.h().a(crf.a)) {
            nw.bB.a($$1, nx.c($$2, $$3), this.c, ($$1x, $$2x) -> this.a($$1x, $$2x, $$0.h()));
         } else {
            nw.bx.a($$1, nx.k($$2), this.c, ($$1x, $$2x) -> this.a($$1x, $$2x, $$0.h()));
         }

         for (nh.a $$4 : b) {
            String $$5 = $$4.a($$0.h());
            akm $$6 = this.a($$1, $$5);
            String $$7 = $$0.f().b() + "_trim_" + $$5;
            akm $$8 = new akm($$7).d("trims/items/");
            if ($$0.h().a(crf.a)) {
               this.a($$6, $$2, $$3, $$8);
            } else {
               this.a($$6, $$2, $$8);
            }
         }
      }
   }

   public void a() {
      this.a(ctr.oc, nw.bx);
      this.a(ctr.oe, nw.bx);
      this.a(ctr.od, nw.bx);
      this.a(ctr.of, nw.bx);
      this.a(ctr.oC, nw.bx);
      this.a(ctr.ot, nw.bx);
      this.a(ctr.oq, nw.bx);
      this.a(ctr.uF, nw.bx);
      this.a(ctr.ov, nw.bx);
      this.a(ctr.uh, nw.bx);
      this.a(ctr.dR, nw.bz);
      this.a(ctr.sa, nw.bx);
      this.a(ctr.vk, nw.bx);
      this.a(ctr.vm, nw.bx);
      this.a(ctr.nY, nw.bx);
      this.a(ctr.nZ, nw.bx);
      this.a(ctr.rx, nw.bx);
      this.a(ctr.so, nw.bx);
      this.a(ctr.sg, nw.bz);
      this.a(ctr.rt, nw.bx);
      this.a(ctr.ry, nw.bx);
      this.a(ctr.qP, nw.bx);
      this.a(ctr.pq, nw.bx);
      this.a(ctr.px, nw.bx);
      this.a(ctr.qL, nw.bx);
      this.a(ctr.yD, nw.bx);
      this.a(ctr.ru, nw.bx);
      this.a(ctr.qy, nw.bx);
      this.a(ctr.nR, nw.bA);
      this.a(ctr.nS, nw.bA);
      this.a(ctr.ox, nw.bx);
      this.a(ctr.nN, nw.bx);
      this.a(ctr.sc, nw.bx);
      this.a(ctr.vg, nw.bx);
      this.a(ctr.qM, nw.bx);
      this.c(ctr.qW);
      this.a(ctr.ow, nw.bx);
      this.a(ctr.qH, nw.bx);
      this.a(ctr.uM, nw.bx);
      this.b(ctr.qS);
      this.b(ctr.qT);
      this.a(ctr.sb, nw.bx);
      this.a(ctr.sd, nw.bx);
      this.a(ctr.rd, nw.bx);
      this.a(ctr.uO, nw.bx);
      this.a(ctr.pY, nw.bx);
      this.a(ctr.uB, nw.bx);
      this.a(ctr.re, nw.bx);
      this.a(ctr.rS, nw.bx);
      this.a(ctr.oF, nw.bx);
      this.a(ctr.oG, nw.bx);
      this.a(ctr.vX, nw.bx);
      this.a(ctr.rr, nw.bx);
      this.a(ctr.og, nw.bx);
      this.a(ctr.oh, nw.bx);
      this.a(ctr.oy, nw.bx);
      this.a(ctr.pi, nw.bz);
      this.a(ctr.pj, nw.bz);
      this.a(ctr.uI, nw.bx);
      this.a(ctr.ph, nw.bz);
      this.a(ctr.pg, nw.bz);
      this.a(ctr.pf, nw.bz);
      this.a(ctr.vn, nw.bx);
      this.a(ctr.rX, nw.bx);
      this.a(ctr.qR, nw.bx);
      this.a(ctr.oz, nw.bx);
      this.a(ctr.uw, nw.bx);
      this.a(ctr.ss, nw.bx);
      this.a(ctr.sf, nw.bx);
      this.a(ctr.vf, nw.bx);
      this.a(ctr.tW, nw.bx);
      this.a(ctr.sn, nw.bx);
      this.a(ctr.uu, nw.bx);
      this.a(ctr.tX, nw.bx);
      this.a(ctr.pW, nw.bx);
      this.a(ctr.os, nw.bx);
      this.a(ctr.wc, nw.bx);
      this.a(ctr.vW, nw.bx);
      this.a(ctr.nO, nw.bx);
      this.a(ctr.sh, nw.bx);
      this.a(ctr.sl, nw.bx);
      this.a(ctr.st, nw.bx);
      this.a(ctr.wa, nw.bx);
      this.a(ctr.ws, nw.bx);
      this.a(ctr.qY, nw.bx);
      this.a(ctr.rg, nw.bx);
      this.a(ctr.ud, nw.bx);
      this.a(ctr.oH, nw.bx);
      this.a(ctr.qa, nw.bx);
      this.a(ctr.oY, nw.bz);
      this.a(ctr.uk, nw.bx);
      this.a(ctr.oZ, nw.bz);
      this.a(ctr.uH, nw.bx);
      this.a(ctr.oX, nw.bz);
      this.a(ctr.oW, nw.bz);
      this.a(ctr.oV, nw.bz);
      this.a(ctr.oI, nw.bx);
      this.a(ctr.si, nw.bx);
      this.a(ctr.rp, nw.bx);
      this.a(ctr.rv, nw.bx);
      this.a(ctr.pu, nw.bx);
      this.a(ctr.wd, nw.bx);
      this.a(ctr.vS, nw.bx);
      this.a(ctr.ww, nw.bx);
      this.a(ctr.wz, nw.bx);
      this.a(ctr.nQ, nw.bx);
      this.a(ctr.rf, nw.bx);
      this.a(ctr.oD, nw.bx);
      this.a(ctr.pd, nw.bz);
      this.a(ctr.pe, nw.bz);
      this.a(ctr.uG, nw.bx);
      this.a(ctr.oE, nw.bx);
      this.a(ctr.vv, nw.bx);
      this.a(ctr.pc, nw.bz);
      this.a(ctr.pb, nw.bz);
      this.a(ctr.pa, nw.bz);
      this.a(ctr.uc, nw.bx);
      this.a(ctr.oa, nw.bx);
      this.a(ctr.ob, nw.bx);
      this.a(ctr.vw, nw.bx);
      this.a(ctr.oA, nw.bx);
      this.a(ctr.qA, nw.bx);
      this.a(ctr.qD, nw.bx);
      this.a(ctr.uJ, nw.bx);
      this.a(ctr.rl, nw.bx);
      this.a(ctr.rq, nw.bx);
      this.a(ctr.rn, nw.bx);
      this.a(ctr.rk, nw.bx);
      this.a(ctr.sp, nw.bx);
      this.a(ctr.oi, nw.bx);
      this.a(ctr.oj, nw.bx);
      this.a(ctr.ok, nw.bx);
      this.a(ctr.ol, nw.bx);
      this.a(ctr.uj, nw.bx);
      this.a(ctr.rW, nw.bx);
      this.a(ctr.qE, nw.bx);
      this.a(ctr.nM, nw.bx);
      this.a(ctr.vZ, nw.bx);
      this.a(ctr.pr, nw.bx);
      this.a(ctr.vO, nw.bx);
      this.a(ctr.vI, nw.by);
      this.a(ctr.vy, nw.by);
      this.a(ctr.vA, nw.by);
      this.a(ctr.vz, nw.by);
      this.a(ctr.vB, nw.by);
      this.a(ctr.vC, nw.by);
      this.a(ctr.vD, nw.by);
      this.a(ctr.vE, nw.by);
      this.a(ctr.vN, nw.by);
      this.a(ctr.vF, nw.by);
      this.a(ctr.vG, nw.by);
      this.a(ctr.vJ, nw.by);
      this.a(ctr.vH, nw.by);
      this.a(ctr.vK, nw.by);
      this.a(ctr.vL, nw.by);
      this.a(ctr.vM, nw.by);
      this.a(ctr.uN, nw.bx);
      this.a(ctr.uL, nw.bx);
      this.a(ctr.vR, nw.bx);
      this.a(ctr.pn, nw.bz);
      this.a(ctr.po, nw.bz);
      this.a(ctr.oJ, nw.bx);
      this.a(ctr.pm, nw.bz);
      this.a(ctr.oK, nw.bx);
      this.a(ctr.pl, nw.bz);
      this.a(ctr.pk, nw.bz);
      this.a(ctr.ux, nw.bx);
      this.a(ctr.us, nw.bx);
      this.a(ctr.nU, nw.bx);
      this.a(ctr.nV, nw.bx);
      this.a(ctr.rj, nw.bx);
      this.a(ctr.pZ, nw.bx);
      this.a(ctr.qO, nw.bx);
      this.a(ctr.vQ, nw.bx);
      this.a(ctr.wb, nw.bx);
      this.a(ctr.ro, nw.bx);
      this.a(ctr.ui, nw.bx);
      this.a(ctr.vh, nw.bx);
      this.a(ctr.pX, nw.bx);
      this.a(ctr.qB, nw.bx);
      this.a(ctr.uz, nw.bx);
      this.a(ctr.uy, nw.bx);
      this.a(ctr.rc, nw.bx);
      this.a(ctr.qF, nw.bx);
      this.a(ctr.ut, nw.bx);
      this.a(ctr.rs, nw.bx);
      this.a(ctr.oB, nw.bx);
      this.a(ctr.uA, nw.bx);
      this.a(ctr.uD, nw.bx);
      this.a(ctr.uE, nw.bx);
      this.a(ctr.uC, nw.bx);
      this.a(ctr.rw, nw.bx);
      this.a(ctr.se, nw.bx);
      this.a(ctr.nL, nw.bx);
      this.a(ctr.ra, nw.bx);
      this.a(ctr.qG, nw.bx);
      this.a(ctr.op, nw.bx);
      this.a(ctr.rV, nw.bx);
      this.a(ctr.vu, nw.bx);
      this.a(ctr.vY, nw.bx);
      this.a(ctr.qQ, nw.bx);
      this.a(ctr.qC, nw.bx);
      this.a(ctr.xq, nw.bx);
      this.a(ctr.vp, nw.bx);
      this.a(ctr.sm, nw.bx);
      this.a(ctr.nW, nw.bx);
      this.a(ctr.nX, nw.bx);
      this.a(ctr.qX, nw.bx);
      this.a(ctr.pp, nw.bz);
      this.a(ctr.oT, nw.bz);
      this.a(ctr.oU, nw.bz);
      this.a(ctr.oS, nw.bz);
      this.a(ctr.oR, nw.bz);
      this.a(ctr.oQ, nw.bz);
      this.a(ctr.rA, nw.bx);
      this.a(ctr.vU, nw.bx);
      this.a(ctr.nP, nw.bx);
      this.a(ctr.vt, nw.bx);
      this.a(ctr.vP, nw.bx);
      this.a(ctr.rb, nw.bx);
      this.a(ctr.qI, nw.bx);
      this.a(ctr.qJ, nw.bx);
      this.a(ctr.qK, nw.bx);
      this.a(ctr.qz, nw.bx);
      this.a(ctr.pw, nw.bx);
      this.a(ctr.ri, nw.bx);
      this.a(ctr.tY, nw.bx);
      this.a(ctr.ub, nw.bO);
      this.a(ctr.or);
      this.a(ctr.oO, nw.bz);
      this.a(ctr.oP, nw.bz);
      this.a(ctr.oN, nw.bz);
      this.a(ctr.oM, nw.bz);
      this.a(ctr.oL, nw.bz);
      this.a(ctr.tZ, nw.bx);
      this.a(ctr.ua, nw.bx);
      this.a(ctr.rm, nw.bx);
      this.a(ctr.xs, nw.bx);
      this.a(ctr.xt, nw.bx);
      this.a(ctr.xu, nw.bx);
      this.a(ctr.xv, nw.bx);
      this.a(ctr.xw, nw.bx);
      this.a(ctr.xx, nw.bx);
      this.a(ctr.xy, nw.bx);
      this.a(ctr.xz, nw.bx);
      this.a(ctr.xA, nw.bx);
      this.a(ctr.xB, nw.bx);
      this.a(ctr.xC, nw.bx);
      this.a(ctr.xD, nw.bx);
      this.a(ctr.xE, nw.bx);
      this.a(ctr.xF, nw.bx);
      this.a(ctr.xG, nw.bx);
      this.a(ctr.xH, nw.bx);
      this.a(ctr.xI, nw.bx);
      this.a(ctr.xJ, nw.bx);
      this.a(ctr.xK, nw.bx);
      this.a(ctr.vx, ctr.pp, nw.bz);
      this.a(ctr.qb, ctr.qa, nw.bx);

      for (ctj $$0 : le.h) {
         if ($$0 instanceof crd $$1) {
            this.a($$1);
         }
      }

      this.a(ctr.xL, nw.bx);
      this.a(ctr.xM, nw.bx);
      this.a(ctr.xN, nw.bx);
      this.a(ctr.xO, nw.bx);
      this.a(ctr.xP, nw.bx);
      this.a(ctr.xQ, nw.bx);
      this.a(ctr.xR, nw.bx);
      this.a(ctr.xS, nw.bx);
      this.a(ctr.xT, nw.bx);
      this.a(ctr.xU, nw.bx);
      this.a(ctr.xV, nw.bx);
      this.a(ctr.xW, nw.bx);
      this.a(ctr.xX, nw.bx);
      this.a(ctr.xY, nw.bx);
      this.a(ctr.xZ, nw.bx);
      this.a(ctr.ya, nw.bx);
      this.a(ctr.yb, nw.bx);
      this.a(ctr.yc, nw.bx);
      this.a(ctr.yd, nw.bx);
      this.a(ctr.ye, nw.bx);
      this.a(ctr.yf, nw.bx);
      this.a(ctr.yg, nw.bx);
      this.a(ctr.yh, nw.bx);
      this.a(ctr.yz, nw.bx);
      this.a(ctr.yA, nw.bx);
      this.a(ctr.yC, nw.bx);
   }

   static record a(String a, float b, Map<ix<cre>, String> c) {
      public String a(ix<cre> $$0) {
         return this.c.getOrDefault($$0, this.a);
      }
   }
}
