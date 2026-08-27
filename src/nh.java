import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Supplier;

public class nh {
   public static final akn a = new akn("trim_type");
   private static final List<nh.a> b = List.of(
      new nh.a("quartz", 0.1F, Map.of()),
      new nh.a("iron", 0.2F, Map.of(crh.c, "iron_darker")),
      new nh.a("netherite", 0.3F, Map.of(crh.g, "netherite_darker")),
      new nh.a("redstone", 0.4F, Map.of()),
      new nh.a("copper", 0.5F, Map.of()),
      new nh.a("gold", 0.6F, Map.of(crh.d, "gold_darker")),
      new nh.a("emerald", 0.7F, Map.of()),
      new nh.a("diamond", 0.8F, Map.of(crh.e, "diamond_darker")),
      new nh.a("lapis", 0.9F, Map.of()),
      new nh.a("amethyst", 1.0F, Map.of())
   );
   private final BiConsumer<akn, Supplier<JsonElement>> c;

   public nh(BiConsumer<akn, Supplier<JsonElement>> $$0) {
      this.c = $$0;
   }

   private void a(ctl $$0, nv $$1) {
      $$1.a(nu.a($$0), nx.b($$0), this.c);
   }

   private void a(ctl $$0, String $$1, nv $$2) {
      $$2.a(nu.a($$0, $$1), nx.k(nx.a($$0, $$1)), this.c);
   }

   private void a(ctl $$0, ctl $$1, nv $$2) {
      $$2.a(nu.a($$0), nx.b($$1), this.c);
   }

   private void a(ctl $$0) {
      this.a(nu.a($$0), nx.c($$0), nx.a($$0, "_overlay"));
   }

   private void b(ctl $$0) {
      for (int $$1 = 0; $$1 < 32; $$1++) {
         if ($$1 != 16) {
            this.a($$0, String.format(Locale.ROOT, "_%02d", $$1), nw.bx);
         }
      }
   }

   private void c(ctl $$0) {
      for (int $$1 = 1; $$1 < 64; $$1++) {
         this.a($$0, String.format(Locale.ROOT, "_%02d", $$1), nw.bx);
      }
   }

   private void a(akn $$0, akn $$1, akn $$2) {
      nw.bB.a($$0, nx.c($$1, $$2), this.c);
   }

   private void a(akn $$0, akn $$1, akn $$2, akn $$3) {
      nw.bC.a($$0, nx.a($$1, $$2, $$3), this.c);
   }

   private akn a(akn $$0, String $$1) {
      return $$0.e("_" + $$1 + "_trim");
   }

   private JsonObject a(akn $$0, Map<ny, akn> $$1, ix<crg> $$2) {
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

   private void a(crf $$0) {
      if ($$0.f().d()) {
         akn $$1 = nu.a($$0);
         akn $$2 = nx.c($$0);
         akn $$3 = nx.a($$0, "_overlay");
         if ($$0.h().a(crh.a)) {
            nw.bB.a($$1, nx.c($$2, $$3), this.c, ($$1x, $$2x) -> this.a($$1x, $$2x, $$0.h()));
         } else {
            nw.bx.a($$1, nx.k($$2), this.c, ($$1x, $$2x) -> this.a($$1x, $$2x, $$0.h()));
         }

         for (nh.a $$4 : b) {
            String $$5 = $$4.a($$0.h());
            akn $$6 = this.a($$1, $$5);
            String $$7 = $$0.f().b() + "_trim_" + $$5;
            akn $$8 = new akn($$7).d("trims/items/");
            if ($$0.h().a(crh.a)) {
               this.a($$6, $$2, $$3, $$8);
            } else {
               this.a($$6, $$2, $$8);
            }
         }
      }
   }

   public void a() {
      this.a(ctt.oc, nw.bx);
      this.a(ctt.oe, nw.bx);
      this.a(ctt.od, nw.bx);
      this.a(ctt.of, nw.bx);
      this.a(ctt.oC, nw.bx);
      this.a(ctt.ot, nw.bx);
      this.a(ctt.oq, nw.bx);
      this.a(ctt.uF, nw.bx);
      this.a(ctt.ov, nw.bx);
      this.a(ctt.uh, nw.bx);
      this.a(ctt.dR, nw.bz);
      this.a(ctt.sa, nw.bx);
      this.a(ctt.vk, nw.bx);
      this.a(ctt.vm, nw.bx);
      this.a(ctt.nY, nw.bx);
      this.a(ctt.nZ, nw.bx);
      this.a(ctt.rx, nw.bx);
      this.a(ctt.so, nw.bx);
      this.a(ctt.sg, nw.bz);
      this.a(ctt.rt, nw.bx);
      this.a(ctt.ry, nw.bx);
      this.a(ctt.qP, nw.bx);
      this.a(ctt.pq, nw.bx);
      this.a(ctt.px, nw.bx);
      this.a(ctt.qL, nw.bx);
      this.a(ctt.yD, nw.bx);
      this.a(ctt.ru, nw.bx);
      this.a(ctt.qy, nw.bx);
      this.a(ctt.nR, nw.bA);
      this.a(ctt.nS, nw.bA);
      this.a(ctt.ox, nw.bx);
      this.a(ctt.nN, nw.bx);
      this.a(ctt.sc, nw.bx);
      this.a(ctt.vg, nw.bx);
      this.a(ctt.qM, nw.bx);
      this.c(ctt.qW);
      this.a(ctt.ow, nw.bx);
      this.a(ctt.qH, nw.bx);
      this.a(ctt.uM, nw.bx);
      this.b(ctt.qS);
      this.b(ctt.qT);
      this.a(ctt.sb, nw.bx);
      this.a(ctt.sd, nw.bx);
      this.a(ctt.rd, nw.bx);
      this.a(ctt.uO, nw.bx);
      this.a(ctt.pY, nw.bx);
      this.a(ctt.uB, nw.bx);
      this.a(ctt.re, nw.bx);
      this.a(ctt.rS, nw.bx);
      this.a(ctt.oF, nw.bx);
      this.a(ctt.oG, nw.bx);
      this.a(ctt.vX, nw.bx);
      this.a(ctt.rr, nw.bx);
      this.a(ctt.og, nw.bx);
      this.a(ctt.oh, nw.bx);
      this.a(ctt.oy, nw.bx);
      this.a(ctt.pi, nw.bz);
      this.a(ctt.pj, nw.bz);
      this.a(ctt.uI, nw.bx);
      this.a(ctt.ph, nw.bz);
      this.a(ctt.pg, nw.bz);
      this.a(ctt.pf, nw.bz);
      this.a(ctt.vn, nw.bx);
      this.a(ctt.rX, nw.bx);
      this.a(ctt.qR, nw.bx);
      this.a(ctt.oz, nw.bx);
      this.a(ctt.uw, nw.bx);
      this.a(ctt.ss, nw.bx);
      this.a(ctt.sf, nw.bx);
      this.a(ctt.vf, nw.bx);
      this.a(ctt.tW, nw.bx);
      this.a(ctt.sn, nw.bx);
      this.a(ctt.uu, nw.bx);
      this.a(ctt.tX, nw.bx);
      this.a(ctt.pW, nw.bx);
      this.a(ctt.os, nw.bx);
      this.a(ctt.wc, nw.bx);
      this.a(ctt.vW, nw.bx);
      this.a(ctt.nO, nw.bx);
      this.a(ctt.sh, nw.bx);
      this.a(ctt.sl, nw.bx);
      this.a(ctt.st, nw.bx);
      this.a(ctt.wa, nw.bx);
      this.a(ctt.ws, nw.bx);
      this.a(ctt.qY, nw.bx);
      this.a(ctt.rg, nw.bx);
      this.a(ctt.ud, nw.bx);
      this.a(ctt.oH, nw.bx);
      this.a(ctt.qa, nw.bx);
      this.a(ctt.oY, nw.bz);
      this.a(ctt.uk, nw.bx);
      this.a(ctt.oZ, nw.bz);
      this.a(ctt.uH, nw.bx);
      this.a(ctt.oX, nw.bz);
      this.a(ctt.oW, nw.bz);
      this.a(ctt.oV, nw.bz);
      this.a(ctt.oI, nw.bx);
      this.a(ctt.si, nw.bx);
      this.a(ctt.rp, nw.bx);
      this.a(ctt.rv, nw.bx);
      this.a(ctt.pu, nw.bx);
      this.a(ctt.wd, nw.bx);
      this.a(ctt.vS, nw.bx);
      this.a(ctt.ww, nw.bx);
      this.a(ctt.wz, nw.bx);
      this.a(ctt.nQ, nw.bx);
      this.a(ctt.rf, nw.bx);
      this.a(ctt.oD, nw.bx);
      this.a(ctt.pd, nw.bz);
      this.a(ctt.pe, nw.bz);
      this.a(ctt.uG, nw.bx);
      this.a(ctt.oE, nw.bx);
      this.a(ctt.vv, nw.bx);
      this.a(ctt.pc, nw.bz);
      this.a(ctt.pb, nw.bz);
      this.a(ctt.pa, nw.bz);
      this.a(ctt.uc, nw.bx);
      this.a(ctt.oa, nw.bx);
      this.a(ctt.ob, nw.bx);
      this.a(ctt.vw, nw.bx);
      this.a(ctt.oA, nw.bx);
      this.a(ctt.qA, nw.bx);
      this.a(ctt.qD, nw.bx);
      this.a(ctt.uJ, nw.bx);
      this.a(ctt.rl, nw.bx);
      this.a(ctt.rq, nw.bx);
      this.a(ctt.rn, nw.bx);
      this.a(ctt.rk, nw.bx);
      this.a(ctt.sp, nw.bx);
      this.a(ctt.oi, nw.bx);
      this.a(ctt.oj, nw.bx);
      this.a(ctt.ok, nw.bx);
      this.a(ctt.ol, nw.bx);
      this.a(ctt.uj, nw.bx);
      this.a(ctt.rW, nw.bx);
      this.a(ctt.qE, nw.bx);
      this.a(ctt.nM, nw.bx);
      this.a(ctt.vZ, nw.bx);
      this.a(ctt.pr, nw.bx);
      this.a(ctt.vO, nw.bx);
      this.a(ctt.vI, nw.by);
      this.a(ctt.vy, nw.by);
      this.a(ctt.vA, nw.by);
      this.a(ctt.vz, nw.by);
      this.a(ctt.vB, nw.by);
      this.a(ctt.vC, nw.by);
      this.a(ctt.vD, nw.by);
      this.a(ctt.vE, nw.by);
      this.a(ctt.vN, nw.by);
      this.a(ctt.vF, nw.by);
      this.a(ctt.vG, nw.by);
      this.a(ctt.vJ, nw.by);
      this.a(ctt.vH, nw.by);
      this.a(ctt.vK, nw.by);
      this.a(ctt.vL, nw.by);
      this.a(ctt.vM, nw.by);
      this.a(ctt.uN, nw.bx);
      this.a(ctt.uL, nw.bx);
      this.a(ctt.vR, nw.bx);
      this.a(ctt.pn, nw.bz);
      this.a(ctt.po, nw.bz);
      this.a(ctt.oJ, nw.bx);
      this.a(ctt.pm, nw.bz);
      this.a(ctt.oK, nw.bx);
      this.a(ctt.pl, nw.bz);
      this.a(ctt.pk, nw.bz);
      this.a(ctt.ux, nw.bx);
      this.a(ctt.us, nw.bx);
      this.a(ctt.nU, nw.bx);
      this.a(ctt.nV, nw.bx);
      this.a(ctt.rj, nw.bx);
      this.a(ctt.pZ, nw.bx);
      this.a(ctt.qO, nw.bx);
      this.a(ctt.vQ, nw.bx);
      this.a(ctt.wb, nw.bx);
      this.a(ctt.ro, nw.bx);
      this.a(ctt.ui, nw.bx);
      this.a(ctt.vh, nw.bx);
      this.a(ctt.pX, nw.bx);
      this.a(ctt.qB, nw.bx);
      this.a(ctt.uz, nw.bx);
      this.a(ctt.uy, nw.bx);
      this.a(ctt.rc, nw.bx);
      this.a(ctt.qF, nw.bx);
      this.a(ctt.ut, nw.bx);
      this.a(ctt.rs, nw.bx);
      this.a(ctt.oB, nw.bx);
      this.a(ctt.uA, nw.bx);
      this.a(ctt.uD, nw.bx);
      this.a(ctt.uE, nw.bx);
      this.a(ctt.uC, nw.bx);
      this.a(ctt.rw, nw.bx);
      this.a(ctt.se, nw.bx);
      this.a(ctt.nL, nw.bx);
      this.a(ctt.ra, nw.bx);
      this.a(ctt.qG, nw.bx);
      this.a(ctt.op, nw.bx);
      this.a(ctt.rV, nw.bx);
      this.a(ctt.vu, nw.bx);
      this.a(ctt.vY, nw.bx);
      this.a(ctt.qQ, nw.bx);
      this.a(ctt.qC, nw.bx);
      this.a(ctt.xq, nw.bx);
      this.a(ctt.vp, nw.bx);
      this.a(ctt.sm, nw.bx);
      this.a(ctt.nW, nw.bx);
      this.a(ctt.nX, nw.bx);
      this.a(ctt.qX, nw.bx);
      this.a(ctt.pp, nw.bz);
      this.a(ctt.oT, nw.bz);
      this.a(ctt.oU, nw.bz);
      this.a(ctt.oS, nw.bz);
      this.a(ctt.oR, nw.bz);
      this.a(ctt.oQ, nw.bz);
      this.a(ctt.rA, nw.bx);
      this.a(ctt.vU, nw.bx);
      this.a(ctt.nP, nw.bx);
      this.a(ctt.vt, nw.bx);
      this.a(ctt.vP, nw.bx);
      this.a(ctt.rb, nw.bx);
      this.a(ctt.qI, nw.bx);
      this.a(ctt.qJ, nw.bx);
      this.a(ctt.qK, nw.bx);
      this.a(ctt.qz, nw.bx);
      this.a(ctt.pw, nw.bx);
      this.a(ctt.ri, nw.bx);
      this.a(ctt.tY, nw.bx);
      this.a(ctt.ub, nw.bO);
      this.a(ctt.or);
      this.a(ctt.oO, nw.bz);
      this.a(ctt.oP, nw.bz);
      this.a(ctt.oN, nw.bz);
      this.a(ctt.oM, nw.bz);
      this.a(ctt.oL, nw.bz);
      this.a(ctt.tZ, nw.bx);
      this.a(ctt.ua, nw.bx);
      this.a(ctt.rm, nw.bx);
      this.a(ctt.xs, nw.bx);
      this.a(ctt.xt, nw.bx);
      this.a(ctt.xu, nw.bx);
      this.a(ctt.xv, nw.bx);
      this.a(ctt.xw, nw.bx);
      this.a(ctt.xx, nw.bx);
      this.a(ctt.xy, nw.bx);
      this.a(ctt.xz, nw.bx);
      this.a(ctt.xA, nw.bx);
      this.a(ctt.xB, nw.bx);
      this.a(ctt.xC, nw.bx);
      this.a(ctt.xD, nw.bx);
      this.a(ctt.xE, nw.bx);
      this.a(ctt.xF, nw.bx);
      this.a(ctt.xG, nw.bx);
      this.a(ctt.xH, nw.bx);
      this.a(ctt.xI, nw.bx);
      this.a(ctt.xJ, nw.bx);
      this.a(ctt.xK, nw.bx);
      this.a(ctt.vx, ctt.pp, nw.bz);
      this.a(ctt.qb, ctt.qa, nw.bx);

      for (ctl $$0 : le.h) {
         if ($$0 instanceof crf $$1) {
            this.a($$1);
         }
      }

      this.a(ctt.xL, nw.bx);
      this.a(ctt.xM, nw.bx);
      this.a(ctt.xN, nw.bx);
      this.a(ctt.xO, nw.bx);
      this.a(ctt.xP, nw.bx);
      this.a(ctt.xQ, nw.bx);
      this.a(ctt.xR, nw.bx);
      this.a(ctt.xS, nw.bx);
      this.a(ctt.xT, nw.bx);
      this.a(ctt.xU, nw.bx);
      this.a(ctt.xV, nw.bx);
      this.a(ctt.xW, nw.bx);
      this.a(ctt.xX, nw.bx);
      this.a(ctt.xY, nw.bx);
      this.a(ctt.xZ, nw.bx);
      this.a(ctt.ya, nw.bx);
      this.a(ctt.yb, nw.bx);
      this.a(ctt.yc, nw.bx);
      this.a(ctt.yd, nw.bx);
      this.a(ctt.ye, nw.bx);
      this.a(ctt.yf, nw.bx);
      this.a(ctt.yg, nw.bx);
      this.a(ctt.yh, nw.bx);
      this.a(ctt.yz, nw.bx);
      this.a(ctt.yA, nw.bx);
      this.a(ctt.yC, nw.bx);
   }

   static record a(String a, float b, Map<ix<crg>, String> c) {
      public String a(ix<crg> $$0) {
         return this.c.getOrDefault($$0, this.a);
      }
   }
}
