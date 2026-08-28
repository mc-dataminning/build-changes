import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Supplier;

public class ns {
   public static final alb a = new alb("trim_type");
   private static final List<ns.a> b = List.of(
      new ns.a("quartz", 0.1F, Map.of()),
      new ns.a("iron", 0.2F, Map.of(csb.c, "iron_darker")),
      new ns.a("netherite", 0.3F, Map.of(csb.g, "netherite_darker")),
      new ns.a("redstone", 0.4F, Map.of()),
      new ns.a("copper", 0.5F, Map.of()),
      new ns.a("gold", 0.6F, Map.of(csb.d, "gold_darker")),
      new ns.a("emerald", 0.7F, Map.of()),
      new ns.a("diamond", 0.8F, Map.of(csb.e, "diamond_darker")),
      new ns.a("lapis", 0.9F, Map.of()),
      new ns.a("amethyst", 1.0F, Map.of())
   );
   private final BiConsumer<alb, Supplier<JsonElement>> c;

   public ns(BiConsumer<alb, Supplier<JsonElement>> $$0) {
      this.c = $$0;
   }

   private void a(cuf $$0, og $$1) {
      $$1.a(of.a($$0), oi.b($$0), this.c);
   }

   private void a(cuf $$0, String $$1, og $$2) {
      $$2.a(of.a($$0, $$1), oi.k(oi.a($$0, $$1)), this.c);
   }

   private void a(cuf $$0, cuf $$1, og $$2) {
      $$2.a(of.a($$0), oi.b($$1), this.c);
   }

   private void a(cuf $$0) {
      this.a(of.a($$0), oi.c($$0), oi.a($$0, "_overlay"));
   }

   private void b(cuf $$0) {
      for (int $$1 = 0; $$1 < 32; $$1++) {
         if ($$1 != 16) {
            this.a($$0, String.format(Locale.ROOT, "_%02d", $$1), oh.bx);
         }
      }
   }

   private void c(cuf $$0) {
      for (int $$1 = 1; $$1 < 64; $$1++) {
         this.a($$0, String.format(Locale.ROOT, "_%02d", $$1), oh.bx);
      }
   }

   private void a(alb $$0, alb $$1, alb $$2) {
      oh.bB.a($$0, oi.c($$1, $$2), this.c);
   }

   private void a(alb $$0, alb $$1, alb $$2, alb $$3) {
      oh.bC.a($$0, oi.a($$1, $$2, $$3), this.c);
   }

   private alb a(alb $$0, String $$1) {
      return $$0.e("_" + $$1 + "_trim");
   }

   private JsonObject a(alb $$0, Map<oj, alb> $$1, ji<csa> $$2) {
      JsonObject $$3 = oh.bB.a($$0, $$1);
      JsonArray $$4 = new JsonArray();

      for (ns.a $$5 : b) {
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

   private void a(crz $$0) {
      if ($$0.f().d()) {
         alb $$1 = of.a($$0);
         alb $$2 = oi.c($$0);
         alb $$3 = oi.a($$0, "_overlay");
         if ($$0.h().a(csb.a)) {
            oh.bB.a($$1, oi.c($$2, $$3), this.c, ($$1x, $$2x) -> this.a($$1x, $$2x, $$0.h()));
         } else {
            oh.bx.a($$1, oi.k($$2), this.c, ($$1x, $$2x) -> this.a($$1x, $$2x, $$0.h()));
         }

         for (ns.a $$4 : b) {
            String $$5 = $$4.a($$0.h());
            alb $$6 = this.a($$1, $$5);
            String $$7 = $$0.f().b() + "_trim_" + $$5;
            alb $$8 = new alb($$7).d("trims/items/");
            if ($$0.h().a(csb.a)) {
               this.a($$6, $$2, $$3, $$8);
            } else {
               this.a($$6, $$2, $$8);
            }
         }
      }
   }

   public void a() {
      this.a(cun.oc, oh.bx);
      this.a(cun.oe, oh.bx);
      this.a(cun.od, oh.bx);
      this.a(cun.of, oh.bx);
      this.a(cun.oC, oh.bx);
      this.a(cun.ot, oh.bx);
      this.a(cun.oq, oh.bx);
      this.a(cun.uF, oh.bx);
      this.a(cun.ov, oh.bx);
      this.a(cun.uh, oh.bx);
      this.a(cun.dR, oh.bz);
      this.a(cun.sa, oh.bx);
      this.a(cun.vk, oh.bx);
      this.a(cun.vm, oh.bx);
      this.a(cun.nY, oh.bx);
      this.a(cun.nZ, oh.bx);
      this.a(cun.rx, oh.bx);
      this.a(cun.so, oh.bx);
      this.a(cun.sg, oh.bz);
      this.a(cun.rt, oh.bx);
      this.a(cun.ry, oh.bx);
      this.a(cun.qP, oh.bx);
      this.a(cun.pq, oh.bx);
      this.a(cun.px, oh.bx);
      this.a(cun.qL, oh.bx);
      this.a(cun.yD, oh.bx);
      this.a(cun.ru, oh.bx);
      this.a(cun.qy, oh.bx);
      this.a(cun.nR, oh.bA);
      this.a(cun.nS, oh.bA);
      this.a(cun.ox, oh.bx);
      this.a(cun.nN, oh.bx);
      this.a(cun.sc, oh.bx);
      this.a(cun.vg, oh.bx);
      this.a(cun.qM, oh.bx);
      this.c(cun.qW);
      this.a(cun.ow, oh.bx);
      this.a(cun.qH, oh.bx);
      this.a(cun.uM, oh.bx);
      this.b(cun.qS);
      this.b(cun.qT);
      this.a(cun.sb, oh.bx);
      this.a(cun.sd, oh.bx);
      this.a(cun.rd, oh.bx);
      this.a(cun.uO, oh.bx);
      this.a(cun.pY, oh.bx);
      this.a(cun.uB, oh.bx);
      this.a(cun.re, oh.bx);
      this.a(cun.rS, oh.bx);
      this.a(cun.oF, oh.bx);
      this.a(cun.oG, oh.bx);
      this.a(cun.vX, oh.bx);
      this.a(cun.rr, oh.bx);
      this.a(cun.og, oh.bx);
      this.a(cun.oh, oh.bx);
      this.a(cun.oy, oh.bx);
      this.a(cun.pi, oh.bz);
      this.a(cun.pj, oh.bz);
      this.a(cun.uI, oh.bx);
      this.a(cun.ph, oh.bz);
      this.a(cun.pg, oh.bz);
      this.a(cun.pf, oh.bz);
      this.a(cun.vn, oh.bx);
      this.a(cun.rX, oh.bx);
      this.a(cun.qR, oh.bx);
      this.a(cun.oz, oh.bx);
      this.a(cun.uw, oh.bx);
      this.a(cun.ss, oh.bx);
      this.a(cun.sf, oh.bx);
      this.a(cun.vf, oh.bx);
      this.a(cun.tW, oh.bx);
      this.a(cun.sn, oh.bx);
      this.a(cun.uu, oh.bx);
      this.a(cun.tX, oh.bx);
      this.a(cun.pW, oh.bx);
      this.a(cun.os, oh.bx);
      this.a(cun.wc, oh.bx);
      this.a(cun.vW, oh.bx);
      this.a(cun.nO, oh.bx);
      this.a(cun.sh, oh.bx);
      this.a(cun.sl, oh.bx);
      this.a(cun.st, oh.bx);
      this.a(cun.wa, oh.bx);
      this.a(cun.ws, oh.bx);
      this.a(cun.qY, oh.bx);
      this.a(cun.rg, oh.bx);
      this.a(cun.ud, oh.bx);
      this.a(cun.oH, oh.bx);
      this.a(cun.qa, oh.bx);
      this.a(cun.oY, oh.bz);
      this.a(cun.uk, oh.bx);
      this.a(cun.oZ, oh.bz);
      this.a(cun.uH, oh.bx);
      this.a(cun.oX, oh.bz);
      this.a(cun.oW, oh.bz);
      this.a(cun.oV, oh.bz);
      this.a(cun.oI, oh.bx);
      this.a(cun.si, oh.bx);
      this.a(cun.rp, oh.bx);
      this.a(cun.rv, oh.bx);
      this.a(cun.pu, oh.bx);
      this.a(cun.wd, oh.bx);
      this.a(cun.vS, oh.bx);
      this.a(cun.ww, oh.bx);
      this.a(cun.wz, oh.bx);
      this.a(cun.nQ, oh.bx);
      this.a(cun.rf, oh.bx);
      this.a(cun.oD, oh.bx);
      this.a(cun.pd, oh.bz);
      this.a(cun.pe, oh.bz);
      this.a(cun.uG, oh.bx);
      this.a(cun.oE, oh.bx);
      this.a(cun.vv, oh.bx);
      this.a(cun.pc, oh.bz);
      this.a(cun.pb, oh.bz);
      this.a(cun.pa, oh.bz);
      this.a(cun.uc, oh.bx);
      this.a(cun.oa, oh.bx);
      this.a(cun.ob, oh.bx);
      this.a(cun.vw, oh.bx);
      this.a(cun.oA, oh.bx);
      this.a(cun.qA, oh.bx);
      this.a(cun.qD, oh.bx);
      this.a(cun.uJ, oh.bx);
      this.a(cun.rl, oh.bx);
      this.a(cun.rq, oh.bx);
      this.a(cun.rn, oh.bx);
      this.a(cun.rk, oh.bx);
      this.a(cun.sp, oh.bx);
      this.a(cun.oi, oh.bx);
      this.a(cun.oj, oh.bx);
      this.a(cun.ok, oh.bx);
      this.a(cun.ol, oh.bx);
      this.a(cun.uj, oh.bx);
      this.a(cun.rW, oh.bx);
      this.a(cun.qE, oh.bx);
      this.a(cun.nM, oh.bx);
      this.a(cun.vZ, oh.bx);
      this.a(cun.pr, oh.bx);
      this.a(cun.vO, oh.bx);
      this.a(cun.vI, oh.by);
      this.a(cun.vy, oh.by);
      this.a(cun.vA, oh.by);
      this.a(cun.vz, oh.by);
      this.a(cun.vB, oh.by);
      this.a(cun.vC, oh.by);
      this.a(cun.vD, oh.by);
      this.a(cun.vE, oh.by);
      this.a(cun.vN, oh.by);
      this.a(cun.vF, oh.by);
      this.a(cun.vG, oh.by);
      this.a(cun.vJ, oh.by);
      this.a(cun.vH, oh.by);
      this.a(cun.vK, oh.by);
      this.a(cun.vL, oh.by);
      this.a(cun.vM, oh.by);
      this.a(cun.uN, oh.bx);
      this.a(cun.uL, oh.bx);
      this.a(cun.vR, oh.bx);
      this.a(cun.pn, oh.bz);
      this.a(cun.po, oh.bz);
      this.a(cun.oJ, oh.bx);
      this.a(cun.pm, oh.bz);
      this.a(cun.oK, oh.bx);
      this.a(cun.pl, oh.bz);
      this.a(cun.pk, oh.bz);
      this.a(cun.ux, oh.bx);
      this.a(cun.us, oh.bx);
      this.a(cun.nU, oh.bx);
      this.a(cun.nV, oh.bx);
      this.a(cun.rj, oh.bx);
      this.a(cun.pZ, oh.bx);
      this.a(cun.qO, oh.bx);
      this.a(cun.vQ, oh.bx);
      this.a(cun.wb, oh.bx);
      this.a(cun.ro, oh.bx);
      this.a(cun.ui, oh.bx);
      this.a(cun.vh, oh.bx);
      this.a(cun.pX, oh.bx);
      this.a(cun.qB, oh.bx);
      this.a(cun.uz, oh.bx);
      this.a(cun.uy, oh.bx);
      this.a(cun.rc, oh.bx);
      this.a(cun.qF, oh.bx);
      this.a(cun.ut, oh.bx);
      this.a(cun.rs, oh.bx);
      this.a(cun.oB, oh.bx);
      this.a(cun.uA, oh.bx);
      this.a(cun.uD, oh.bx);
      this.a(cun.uE, oh.bx);
      this.a(cun.uC, oh.bx);
      this.a(cun.rw, oh.bx);
      this.a(cun.se, oh.bx);
      this.a(cun.nL, oh.bx);
      this.a(cun.ra, oh.bx);
      this.a(cun.qG, oh.bx);
      this.a(cun.op, oh.bx);
      this.a(cun.rV, oh.bx);
      this.a(cun.vu, oh.bx);
      this.a(cun.vY, oh.bx);
      this.a(cun.qQ, oh.bx);
      this.a(cun.qC, oh.bx);
      this.a(cun.xq, oh.bx);
      this.a(cun.vp, oh.bx);
      this.a(cun.sm, oh.bx);
      this.a(cun.nW, oh.bx);
      this.a(cun.nX, oh.bx);
      this.a(cun.qX, oh.bx);
      this.a(cun.pp, oh.bz);
      this.a(cun.oT, oh.bz);
      this.a(cun.oU, oh.bz);
      this.a(cun.oS, oh.bz);
      this.a(cun.oR, oh.bz);
      this.a(cun.oQ, oh.bz);
      this.a(cun.rA, oh.bx);
      this.a(cun.vU, oh.bx);
      this.a(cun.nP, oh.bx);
      this.a(cun.vt, oh.bx);
      this.a(cun.vP, oh.bx);
      this.a(cun.rb, oh.bx);
      this.a(cun.qI, oh.bx);
      this.a(cun.qJ, oh.bx);
      this.a(cun.qK, oh.bx);
      this.a(cun.qz, oh.bx);
      this.a(cun.pw, oh.bx);
      this.a(cun.ri, oh.bx);
      this.a(cun.tY, oh.bx);
      this.a(cun.ub, oh.bO);
      this.a(cun.or);
      this.a(cun.oO, oh.bz);
      this.a(cun.oP, oh.bz);
      this.a(cun.oN, oh.bz);
      this.a(cun.oM, oh.bz);
      this.a(cun.oL, oh.bz);
      this.a(cun.tZ, oh.bx);
      this.a(cun.ua, oh.bx);
      this.a(cun.rm, oh.bx);
      this.a(cun.xs, oh.bx);
      this.a(cun.xt, oh.bx);
      this.a(cun.xu, oh.bx);
      this.a(cun.xv, oh.bx);
      this.a(cun.xw, oh.bx);
      this.a(cun.xx, oh.bx);
      this.a(cun.xy, oh.bx);
      this.a(cun.xz, oh.bx);
      this.a(cun.xA, oh.bx);
      this.a(cun.xB, oh.bx);
      this.a(cun.xC, oh.bx);
      this.a(cun.xD, oh.bx);
      this.a(cun.xE, oh.bx);
      this.a(cun.xF, oh.bx);
      this.a(cun.xG, oh.bx);
      this.a(cun.xH, oh.bx);
      this.a(cun.xI, oh.bx);
      this.a(cun.xJ, oh.bx);
      this.a(cun.xK, oh.bx);
      this.a(cun.vx, cun.pp, oh.bz);
      this.a(cun.qb, cun.qa, oh.bx);

      for (cuf $$0 : lp.h) {
         if ($$0 instanceof crz $$1) {
            this.a($$1);
         }
      }

      this.a(cun.xL, oh.bx);
      this.a(cun.xM, oh.bx);
      this.a(cun.xN, oh.bx);
      this.a(cun.xO, oh.bx);
      this.a(cun.xP, oh.bx);
      this.a(cun.xQ, oh.bx);
      this.a(cun.xR, oh.bx);
      this.a(cun.xS, oh.bx);
      this.a(cun.xT, oh.bx);
      this.a(cun.xU, oh.bx);
      this.a(cun.xV, oh.bx);
      this.a(cun.xW, oh.bx);
      this.a(cun.xX, oh.bx);
      this.a(cun.xY, oh.bx);
      this.a(cun.xZ, oh.bx);
      this.a(cun.ya, oh.bx);
      this.a(cun.yb, oh.bx);
      this.a(cun.yc, oh.bx);
      this.a(cun.yd, oh.bx);
      this.a(cun.ye, oh.bx);
      this.a(cun.yf, oh.bx);
      this.a(cun.yg, oh.bx);
      this.a(cun.yh, oh.bx);
      this.a(cun.yz, oh.bx);
      this.a(cun.yA, oh.bx);
      this.a(cun.yC, oh.bx);
   }

   static record a(String a, float b, Map<ji<csa>, String> c) {
      public String a(ji<csa> $$0) {
         return this.c.getOrDefault($$0, this.a);
      }
   }
}
