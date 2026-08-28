import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Supplier;

public class ns {
   public static final ale a = new ale("trim_type");
   private static final List<ns.a> b = List.of(
      new ns.a("quartz", 0.1F, Map.of()),
      new ns.a("iron", 0.2F, Map.of(csf.c, "iron_darker")),
      new ns.a("netherite", 0.3F, Map.of(csf.g, "netherite_darker")),
      new ns.a("redstone", 0.4F, Map.of()),
      new ns.a("copper", 0.5F, Map.of()),
      new ns.a("gold", 0.6F, Map.of(csf.d, "gold_darker")),
      new ns.a("emerald", 0.7F, Map.of()),
      new ns.a("diamond", 0.8F, Map.of(csf.e, "diamond_darker")),
      new ns.a("lapis", 0.9F, Map.of()),
      new ns.a("amethyst", 1.0F, Map.of())
   );
   private final BiConsumer<ale, Supplier<JsonElement>> c;

   public ns(BiConsumer<ale, Supplier<JsonElement>> $$0) {
      this.c = $$0;
   }

   private void a(cuj $$0, og $$1) {
      $$1.a(of.a($$0), oi.b($$0), this.c);
   }

   private void a(cuj $$0, String $$1, og $$2) {
      $$2.a(of.a($$0, $$1), oi.k(oi.a($$0, $$1)), this.c);
   }

   private void a(cuj $$0, cuj $$1, og $$2) {
      $$2.a(of.a($$0), oi.b($$1), this.c);
   }

   private void a(cuj $$0) {
      this.a(of.a($$0), oi.c($$0), oi.a($$0, "_overlay"));
   }

   private void b(cuj $$0) {
      for (int $$1 = 0; $$1 < 32; $$1++) {
         if ($$1 != 16) {
            this.a($$0, String.format(Locale.ROOT, "_%02d", $$1), oh.bx);
         }
      }
   }

   private void c(cuj $$0) {
      for (int $$1 = 1; $$1 < 64; $$1++) {
         this.a($$0, String.format(Locale.ROOT, "_%02d", $$1), oh.bx);
      }
   }

   private void a(ale $$0, ale $$1, ale $$2) {
      oh.bB.a($$0, oi.c($$1, $$2), this.c);
   }

   private void a(ale $$0, ale $$1, ale $$2, ale $$3) {
      oh.bC.a($$0, oi.a($$1, $$2, $$3), this.c);
   }

   private ale a(ale $$0, String $$1) {
      return $$0.e("_" + $$1 + "_trim");
   }

   private JsonObject a(ale $$0, Map<oj, ale> $$1, ji<cse> $$2) {
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

   private void a(csd $$0) {
      if ($$0.f().d()) {
         ale $$1 = of.a($$0);
         ale $$2 = oi.c($$0);
         ale $$3 = oi.a($$0, "_overlay");
         if ($$0.h().a(csf.a)) {
            oh.bB.a($$1, oi.c($$2, $$3), this.c, ($$1x, $$2x) -> this.a($$1x, $$2x, $$0.h()));
         } else {
            oh.bx.a($$1, oi.k($$2), this.c, ($$1x, $$2x) -> this.a($$1x, $$2x, $$0.h()));
         }

         for (ns.a $$4 : b) {
            String $$5 = $$4.a($$0.h());
            ale $$6 = this.a($$1, $$5);
            String $$7 = $$0.f().b() + "_trim_" + $$5;
            ale $$8 = new ale($$7).d("trims/items/");
            if ($$0.h().a(csf.a)) {
               this.a($$6, $$2, $$3, $$8);
            } else {
               this.a($$6, $$2, $$8);
            }
         }
      }
   }

   public void a() {
      this.a(cur.oc, oh.bx);
      this.a(cur.oe, oh.bx);
      this.a(cur.od, oh.bx);
      this.a(cur.of, oh.bx);
      this.a(cur.oC, oh.bx);
      this.a(cur.ot, oh.bx);
      this.a(cur.oq, oh.bx);
      this.a(cur.uF, oh.bx);
      this.a(cur.ov, oh.bx);
      this.a(cur.uh, oh.bx);
      this.a(cur.dR, oh.bz);
      this.a(cur.sa, oh.bx);
      this.a(cur.vk, oh.bx);
      this.a(cur.vm, oh.bx);
      this.a(cur.nY, oh.bx);
      this.a(cur.nZ, oh.bx);
      this.a(cur.rx, oh.bx);
      this.a(cur.so, oh.bx);
      this.a(cur.sg, oh.bz);
      this.a(cur.rt, oh.bx);
      this.a(cur.ry, oh.bx);
      this.a(cur.qP, oh.bx);
      this.a(cur.pq, oh.bx);
      this.a(cur.px, oh.bx);
      this.a(cur.qL, oh.bx);
      this.a(cur.yD, oh.bx);
      this.a(cur.ru, oh.bx);
      this.a(cur.qy, oh.bx);
      this.a(cur.nR, oh.bA);
      this.a(cur.nS, oh.bA);
      this.a(cur.ox, oh.bx);
      this.a(cur.nN, oh.bx);
      this.a(cur.sc, oh.bx);
      this.a(cur.vg, oh.bx);
      this.a(cur.qM, oh.bx);
      this.c(cur.qW);
      this.a(cur.ow, oh.bx);
      this.a(cur.qH, oh.bx);
      this.a(cur.uM, oh.bx);
      this.b(cur.qS);
      this.b(cur.qT);
      this.a(cur.sb, oh.bx);
      this.a(cur.sd, oh.bx);
      this.a(cur.rd, oh.bx);
      this.a(cur.uO, oh.bx);
      this.a(cur.pY, oh.bx);
      this.a(cur.uB, oh.bx);
      this.a(cur.re, oh.bx);
      this.a(cur.rS, oh.bx);
      this.a(cur.oF, oh.bx);
      this.a(cur.oG, oh.bx);
      this.a(cur.vX, oh.bx);
      this.a(cur.rr, oh.bx);
      this.a(cur.og, oh.bx);
      this.a(cur.oh, oh.bx);
      this.a(cur.oy, oh.bx);
      this.a(cur.pi, oh.bz);
      this.a(cur.pj, oh.bz);
      this.a(cur.uI, oh.bx);
      this.a(cur.ph, oh.bz);
      this.a(cur.pg, oh.bz);
      this.a(cur.pf, oh.bz);
      this.a(cur.vn, oh.bx);
      this.a(cur.rX, oh.bx);
      this.a(cur.qR, oh.bx);
      this.a(cur.oz, oh.bx);
      this.a(cur.uw, oh.bx);
      this.a(cur.ss, oh.bx);
      this.a(cur.sf, oh.bx);
      this.a(cur.vf, oh.bx);
      this.a(cur.tW, oh.bx);
      this.a(cur.sn, oh.bx);
      this.a(cur.uu, oh.bx);
      this.a(cur.tX, oh.bx);
      this.a(cur.pW, oh.bx);
      this.a(cur.os, oh.bx);
      this.a(cur.wc, oh.bx);
      this.a(cur.vW, oh.bx);
      this.a(cur.nO, oh.bx);
      this.a(cur.sh, oh.bx);
      this.a(cur.sl, oh.bx);
      this.a(cur.st, oh.bx);
      this.a(cur.wa, oh.bx);
      this.a(cur.ws, oh.bx);
      this.a(cur.qY, oh.bx);
      this.a(cur.rg, oh.bx);
      this.a(cur.ud, oh.bx);
      this.a(cur.oH, oh.bx);
      this.a(cur.qa, oh.bx);
      this.a(cur.oY, oh.bz);
      this.a(cur.uk, oh.bx);
      this.a(cur.oZ, oh.bz);
      this.a(cur.uH, oh.bx);
      this.a(cur.oX, oh.bz);
      this.a(cur.oW, oh.bz);
      this.a(cur.oV, oh.bz);
      this.a(cur.oI, oh.bx);
      this.a(cur.si, oh.bx);
      this.a(cur.rp, oh.bx);
      this.a(cur.rv, oh.bx);
      this.a(cur.pu, oh.bx);
      this.a(cur.wd, oh.bx);
      this.a(cur.vS, oh.bx);
      this.a(cur.ww, oh.bx);
      this.a(cur.wz, oh.bx);
      this.a(cur.nQ, oh.bx);
      this.a(cur.rf, oh.bx);
      this.a(cur.oD, oh.bx);
      this.a(cur.pd, oh.bz);
      this.a(cur.pe, oh.bz);
      this.a(cur.uG, oh.bx);
      this.a(cur.oE, oh.bx);
      this.a(cur.vv, oh.bx);
      this.a(cur.pc, oh.bz);
      this.a(cur.pb, oh.bz);
      this.a(cur.pa, oh.bz);
      this.a(cur.uc, oh.bx);
      this.a(cur.oa, oh.bx);
      this.a(cur.ob, oh.bx);
      this.a(cur.vw, oh.bx);
      this.a(cur.oA, oh.bx);
      this.a(cur.qA, oh.bx);
      this.a(cur.qD, oh.bx);
      this.a(cur.uJ, oh.bx);
      this.a(cur.rl, oh.bx);
      this.a(cur.rq, oh.bx);
      this.a(cur.rn, oh.bx);
      this.a(cur.rk, oh.bx);
      this.a(cur.sp, oh.bx);
      this.a(cur.oi, oh.bx);
      this.a(cur.oj, oh.bx);
      this.a(cur.ok, oh.bx);
      this.a(cur.ol, oh.bx);
      this.a(cur.uj, oh.bx);
      this.a(cur.rW, oh.bx);
      this.a(cur.qE, oh.bx);
      this.a(cur.nM, oh.bx);
      this.a(cur.vZ, oh.bx);
      this.a(cur.pr, oh.bx);
      this.a(cur.vO, oh.bx);
      this.a(cur.vI, oh.by);
      this.a(cur.vy, oh.by);
      this.a(cur.vA, oh.by);
      this.a(cur.vz, oh.by);
      this.a(cur.vB, oh.by);
      this.a(cur.vC, oh.by);
      this.a(cur.vD, oh.by);
      this.a(cur.vE, oh.by);
      this.a(cur.vN, oh.by);
      this.a(cur.vF, oh.by);
      this.a(cur.vG, oh.by);
      this.a(cur.vJ, oh.by);
      this.a(cur.vH, oh.by);
      this.a(cur.vK, oh.by);
      this.a(cur.vL, oh.by);
      this.a(cur.vM, oh.by);
      this.a(cur.uN, oh.bx);
      this.a(cur.uL, oh.bx);
      this.a(cur.vR, oh.bx);
      this.a(cur.pn, oh.bz);
      this.a(cur.po, oh.bz);
      this.a(cur.oJ, oh.bx);
      this.a(cur.pm, oh.bz);
      this.a(cur.oK, oh.bx);
      this.a(cur.pl, oh.bz);
      this.a(cur.pk, oh.bz);
      this.a(cur.ux, oh.bx);
      this.a(cur.us, oh.bx);
      this.a(cur.nU, oh.bx);
      this.a(cur.nV, oh.bx);
      this.a(cur.rj, oh.bx);
      this.a(cur.pZ, oh.bx);
      this.a(cur.qO, oh.bx);
      this.a(cur.vQ, oh.bx);
      this.a(cur.wb, oh.bx);
      this.a(cur.ro, oh.bx);
      this.a(cur.ui, oh.bx);
      this.a(cur.vh, oh.bx);
      this.a(cur.pX, oh.bx);
      this.a(cur.qB, oh.bx);
      this.a(cur.uz, oh.bx);
      this.a(cur.uy, oh.bx);
      this.a(cur.rc, oh.bx);
      this.a(cur.qF, oh.bx);
      this.a(cur.ut, oh.bx);
      this.a(cur.rs, oh.bx);
      this.a(cur.oB, oh.bx);
      this.a(cur.uA, oh.bx);
      this.a(cur.uD, oh.bx);
      this.a(cur.uE, oh.bx);
      this.a(cur.uC, oh.bx);
      this.a(cur.rw, oh.bx);
      this.a(cur.se, oh.bx);
      this.a(cur.nL, oh.bx);
      this.a(cur.ra, oh.bx);
      this.a(cur.qG, oh.bx);
      this.a(cur.op, oh.bx);
      this.a(cur.rV, oh.bx);
      this.a(cur.vu, oh.bx);
      this.a(cur.vY, oh.bx);
      this.a(cur.qQ, oh.bx);
      this.a(cur.qC, oh.bx);
      this.a(cur.xq, oh.bx);
      this.a(cur.vp, oh.bx);
      this.a(cur.sm, oh.bx);
      this.a(cur.nW, oh.bx);
      this.a(cur.nX, oh.bx);
      this.a(cur.qX, oh.bx);
      this.a(cur.pp, oh.bz);
      this.a(cur.oT, oh.bz);
      this.a(cur.oU, oh.bz);
      this.a(cur.oS, oh.bz);
      this.a(cur.oR, oh.bz);
      this.a(cur.oQ, oh.bz);
      this.a(cur.rA, oh.bx);
      this.a(cur.vU, oh.bx);
      this.a(cur.nP, oh.bx);
      this.a(cur.vt, oh.bx);
      this.a(cur.vP, oh.bx);
      this.a(cur.rb, oh.bx);
      this.a(cur.qI, oh.bx);
      this.a(cur.qJ, oh.bx);
      this.a(cur.qK, oh.bx);
      this.a(cur.qz, oh.bx);
      this.a(cur.pw, oh.bx);
      this.a(cur.ri, oh.bx);
      this.a(cur.tY, oh.bx);
      this.a(cur.ub, oh.bO);
      this.a(cur.or);
      this.a(cur.oO, oh.bz);
      this.a(cur.oP, oh.bz);
      this.a(cur.oN, oh.bz);
      this.a(cur.oM, oh.bz);
      this.a(cur.oL, oh.bz);
      this.a(cur.tZ, oh.bx);
      this.a(cur.ua, oh.bx);
      this.a(cur.rm, oh.bx);
      this.a(cur.xs, oh.bx);
      this.a(cur.xt, oh.bx);
      this.a(cur.xu, oh.bx);
      this.a(cur.xv, oh.bx);
      this.a(cur.xw, oh.bx);
      this.a(cur.xx, oh.bx);
      this.a(cur.xy, oh.bx);
      this.a(cur.xz, oh.bx);
      this.a(cur.xA, oh.bx);
      this.a(cur.xB, oh.bx);
      this.a(cur.xC, oh.bx);
      this.a(cur.xD, oh.bx);
      this.a(cur.xE, oh.bx);
      this.a(cur.xF, oh.bx);
      this.a(cur.xG, oh.bx);
      this.a(cur.xH, oh.bx);
      this.a(cur.xI, oh.bx);
      this.a(cur.xJ, oh.bx);
      this.a(cur.xK, oh.bx);
      this.a(cur.vx, cur.pp, oh.bz);
      this.a(cur.qb, cur.qa, oh.bx);

      for (cuj $$0 : lp.h) {
         if ($$0 instanceof csd $$1) {
            this.a($$1);
         }
      }

      this.a(cur.xL, oh.bx);
      this.a(cur.xM, oh.bx);
      this.a(cur.xN, oh.bx);
      this.a(cur.xO, oh.bx);
      this.a(cur.xP, oh.bx);
      this.a(cur.xQ, oh.bx);
      this.a(cur.xR, oh.bx);
      this.a(cur.xS, oh.bx);
      this.a(cur.xT, oh.bx);
      this.a(cur.xU, oh.bx);
      this.a(cur.xV, oh.bx);
      this.a(cur.xW, oh.bx);
      this.a(cur.xX, oh.bx);
      this.a(cur.xY, oh.bx);
      this.a(cur.xZ, oh.bx);
      this.a(cur.ya, oh.bx);
      this.a(cur.yb, oh.bx);
      this.a(cur.yc, oh.bx);
      this.a(cur.yd, oh.bx);
      this.a(cur.ye, oh.bx);
      this.a(cur.yf, oh.bx);
      this.a(cur.yg, oh.bx);
      this.a(cur.yh, oh.bx);
      this.a(cur.yz, oh.bx);
      this.a(cur.yA, oh.bx);
      this.a(cur.yC, oh.bx);
   }

   static record a(String a, float b, Map<ji<cse>, String> c) {
      public String a(ji<cse> $$0) {
         return this.c.getOrDefault($$0, this.a);
      }
   }
}
