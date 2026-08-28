import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Supplier;

public class ns {
   public static final alf a = new alf("trim_type");
   private static final List<ns.a> b = List.of(
      new ns.a("quartz", 0.1F, Map.of()),
      new ns.a("iron", 0.2F, Map.of(csg.c, "iron_darker")),
      new ns.a("netherite", 0.3F, Map.of(csg.g, "netherite_darker")),
      new ns.a("redstone", 0.4F, Map.of()),
      new ns.a("copper", 0.5F, Map.of()),
      new ns.a("gold", 0.6F, Map.of(csg.d, "gold_darker")),
      new ns.a("emerald", 0.7F, Map.of()),
      new ns.a("diamond", 0.8F, Map.of(csg.e, "diamond_darker")),
      new ns.a("lapis", 0.9F, Map.of()),
      new ns.a("amethyst", 1.0F, Map.of())
   );
   private final BiConsumer<alf, Supplier<JsonElement>> c;

   public ns(BiConsumer<alf, Supplier<JsonElement>> $$0) {
      this.c = $$0;
   }

   private void a(cuk $$0, og $$1) {
      $$1.a(of.a($$0), oi.b($$0), this.c);
   }

   private void a(cuk $$0, String $$1, og $$2) {
      $$2.a(of.a($$0, $$1), oi.k(oi.a($$0, $$1)), this.c);
   }

   private void a(cuk $$0, cuk $$1, og $$2) {
      $$2.a(of.a($$0), oi.b($$1), this.c);
   }

   private void a(cuk $$0) {
      this.a(of.a($$0), oi.c($$0), oi.a($$0, "_overlay"));
   }

   private void b(cuk $$0) {
      for (int $$1 = 0; $$1 < 32; $$1++) {
         if ($$1 != 16) {
            this.a($$0, String.format(Locale.ROOT, "_%02d", $$1), oh.bx);
         }
      }
   }

   private void c(cuk $$0) {
      for (int $$1 = 1; $$1 < 64; $$1++) {
         this.a($$0, String.format(Locale.ROOT, "_%02d", $$1), oh.bx);
      }
   }

   private void a(alf $$0, alf $$1, alf $$2) {
      oh.bB.a($$0, oi.c($$1, $$2), this.c);
   }

   private void a(alf $$0, alf $$1, alf $$2, alf $$3) {
      oh.bC.a($$0, oi.a($$1, $$2, $$3), this.c);
   }

   private alf a(alf $$0, String $$1) {
      return $$0.e("_" + $$1 + "_trim");
   }

   private JsonObject a(alf $$0, Map<oj, alf> $$1, ji<csf> $$2) {
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

   private void a(cse $$0) {
      if ($$0.f().d()) {
         alf $$1 = of.a($$0);
         alf $$2 = oi.c($$0);
         alf $$3 = oi.a($$0, "_overlay");
         if ($$0.h().a(csg.a)) {
            oh.bB.a($$1, oi.c($$2, $$3), this.c, ($$1x, $$2x) -> this.a($$1x, $$2x, $$0.h()));
         } else {
            oh.bx.a($$1, oi.k($$2), this.c, ($$1x, $$2x) -> this.a($$1x, $$2x, $$0.h()));
         }

         for (ns.a $$4 : b) {
            String $$5 = $$4.a($$0.h());
            alf $$6 = this.a($$1, $$5);
            String $$7 = $$0.f().b() + "_trim_" + $$5;
            alf $$8 = new alf($$7).d("trims/items/");
            if ($$0.h().a(csg.a)) {
               this.a($$6, $$2, $$3, $$8);
            } else {
               this.a($$6, $$2, $$8);
            }
         }
      }
   }

   public void a() {
      this.a(cus.oc, oh.bx);
      this.a(cus.oe, oh.bx);
      this.a(cus.od, oh.bx);
      this.a(cus.of, oh.bx);
      this.a(cus.oC, oh.bx);
      this.a(cus.ot, oh.bx);
      this.a(cus.oq, oh.bx);
      this.a(cus.uF, oh.bx);
      this.a(cus.ov, oh.bx);
      this.a(cus.uh, oh.bx);
      this.a(cus.dR, oh.bz);
      this.a(cus.sa, oh.bx);
      this.a(cus.vk, oh.bx);
      this.a(cus.vm, oh.bx);
      this.a(cus.nY, oh.bx);
      this.a(cus.nZ, oh.bx);
      this.a(cus.rx, oh.bx);
      this.a(cus.so, oh.bx);
      this.a(cus.sg, oh.bz);
      this.a(cus.rt, oh.bx);
      this.a(cus.ry, oh.bx);
      this.a(cus.qP, oh.bx);
      this.a(cus.pq, oh.bx);
      this.a(cus.px, oh.bx);
      this.a(cus.qL, oh.bx);
      this.a(cus.yD, oh.bx);
      this.a(cus.ru, oh.bx);
      this.a(cus.qy, oh.bx);
      this.a(cus.nR, oh.bA);
      this.a(cus.nS, oh.bA);
      this.a(cus.ox, oh.bx);
      this.a(cus.nN, oh.bx);
      this.a(cus.sc, oh.bx);
      this.a(cus.vg, oh.bx);
      this.a(cus.qM, oh.bx);
      this.c(cus.qW);
      this.a(cus.ow, oh.bx);
      this.a(cus.qH, oh.bx);
      this.a(cus.uM, oh.bx);
      this.b(cus.qS);
      this.b(cus.qT);
      this.a(cus.sb, oh.bx);
      this.a(cus.sd, oh.bx);
      this.a(cus.rd, oh.bx);
      this.a(cus.uO, oh.bx);
      this.a(cus.pY, oh.bx);
      this.a(cus.uB, oh.bx);
      this.a(cus.re, oh.bx);
      this.a(cus.rS, oh.bx);
      this.a(cus.oF, oh.bx);
      this.a(cus.oG, oh.bx);
      this.a(cus.vX, oh.bx);
      this.a(cus.rr, oh.bx);
      this.a(cus.og, oh.bx);
      this.a(cus.oh, oh.bx);
      this.a(cus.oy, oh.bx);
      this.a(cus.pi, oh.bz);
      this.a(cus.pj, oh.bz);
      this.a(cus.uI, oh.bx);
      this.a(cus.ph, oh.bz);
      this.a(cus.pg, oh.bz);
      this.a(cus.pf, oh.bz);
      this.a(cus.vn, oh.bx);
      this.a(cus.rX, oh.bx);
      this.a(cus.qR, oh.bx);
      this.a(cus.oz, oh.bx);
      this.a(cus.uw, oh.bx);
      this.a(cus.ss, oh.bx);
      this.a(cus.sf, oh.bx);
      this.a(cus.vf, oh.bx);
      this.a(cus.tW, oh.bx);
      this.a(cus.sn, oh.bx);
      this.a(cus.uu, oh.bx);
      this.a(cus.tX, oh.bx);
      this.a(cus.pW, oh.bx);
      this.a(cus.os, oh.bx);
      this.a(cus.wc, oh.bx);
      this.a(cus.vW, oh.bx);
      this.a(cus.nO, oh.bx);
      this.a(cus.sh, oh.bx);
      this.a(cus.sl, oh.bx);
      this.a(cus.st, oh.bx);
      this.a(cus.wa, oh.bx);
      this.a(cus.ws, oh.bx);
      this.a(cus.qY, oh.bx);
      this.a(cus.rg, oh.bx);
      this.a(cus.ud, oh.bx);
      this.a(cus.oH, oh.bx);
      this.a(cus.qa, oh.bx);
      this.a(cus.oY, oh.bz);
      this.a(cus.uk, oh.bx);
      this.a(cus.oZ, oh.bz);
      this.a(cus.uH, oh.bx);
      this.a(cus.oX, oh.bz);
      this.a(cus.oW, oh.bz);
      this.a(cus.oV, oh.bz);
      this.a(cus.oI, oh.bx);
      this.a(cus.si, oh.bx);
      this.a(cus.rp, oh.bx);
      this.a(cus.rv, oh.bx);
      this.a(cus.pu, oh.bx);
      this.a(cus.wd, oh.bx);
      this.a(cus.vS, oh.bx);
      this.a(cus.ww, oh.bx);
      this.a(cus.wz, oh.bx);
      this.a(cus.nQ, oh.bx);
      this.a(cus.rf, oh.bx);
      this.a(cus.oD, oh.bx);
      this.a(cus.pd, oh.bz);
      this.a(cus.pe, oh.bz);
      this.a(cus.uG, oh.bx);
      this.a(cus.oE, oh.bx);
      this.a(cus.vv, oh.bx);
      this.a(cus.pc, oh.bz);
      this.a(cus.pb, oh.bz);
      this.a(cus.pa, oh.bz);
      this.a(cus.uc, oh.bx);
      this.a(cus.oa, oh.bx);
      this.a(cus.ob, oh.bx);
      this.a(cus.vw, oh.bx);
      this.a(cus.oA, oh.bx);
      this.a(cus.qA, oh.bx);
      this.a(cus.qD, oh.bx);
      this.a(cus.uJ, oh.bx);
      this.a(cus.rl, oh.bx);
      this.a(cus.rq, oh.bx);
      this.a(cus.rn, oh.bx);
      this.a(cus.rk, oh.bx);
      this.a(cus.sp, oh.bx);
      this.a(cus.oi, oh.bx);
      this.a(cus.oj, oh.bx);
      this.a(cus.ok, oh.bx);
      this.a(cus.ol, oh.bx);
      this.a(cus.uj, oh.bx);
      this.a(cus.rW, oh.bx);
      this.a(cus.qE, oh.bx);
      this.a(cus.nM, oh.bx);
      this.a(cus.vZ, oh.bx);
      this.a(cus.pr, oh.bx);
      this.a(cus.vO, oh.bx);
      this.a(cus.vI, oh.by);
      this.a(cus.vy, oh.by);
      this.a(cus.vA, oh.by);
      this.a(cus.vz, oh.by);
      this.a(cus.vB, oh.by);
      this.a(cus.vC, oh.by);
      this.a(cus.vD, oh.by);
      this.a(cus.vE, oh.by);
      this.a(cus.vN, oh.by);
      this.a(cus.vF, oh.by);
      this.a(cus.vG, oh.by);
      this.a(cus.vJ, oh.by);
      this.a(cus.vH, oh.by);
      this.a(cus.vK, oh.by);
      this.a(cus.vL, oh.by);
      this.a(cus.vM, oh.by);
      this.a(cus.uN, oh.bx);
      this.a(cus.uL, oh.bx);
      this.a(cus.vR, oh.bx);
      this.a(cus.pn, oh.bz);
      this.a(cus.po, oh.bz);
      this.a(cus.oJ, oh.bx);
      this.a(cus.pm, oh.bz);
      this.a(cus.oK, oh.bx);
      this.a(cus.pl, oh.bz);
      this.a(cus.pk, oh.bz);
      this.a(cus.ux, oh.bx);
      this.a(cus.us, oh.bx);
      this.a(cus.nU, oh.bx);
      this.a(cus.nV, oh.bx);
      this.a(cus.rj, oh.bx);
      this.a(cus.pZ, oh.bx);
      this.a(cus.qO, oh.bx);
      this.a(cus.vQ, oh.bx);
      this.a(cus.wb, oh.bx);
      this.a(cus.ro, oh.bx);
      this.a(cus.ui, oh.bx);
      this.a(cus.vh, oh.bx);
      this.a(cus.pX, oh.bx);
      this.a(cus.qB, oh.bx);
      this.a(cus.uz, oh.bx);
      this.a(cus.uy, oh.bx);
      this.a(cus.rc, oh.bx);
      this.a(cus.qF, oh.bx);
      this.a(cus.ut, oh.bx);
      this.a(cus.rs, oh.bx);
      this.a(cus.oB, oh.bx);
      this.a(cus.uA, oh.bx);
      this.a(cus.uD, oh.bx);
      this.a(cus.uE, oh.bx);
      this.a(cus.uC, oh.bx);
      this.a(cus.rw, oh.bx);
      this.a(cus.se, oh.bx);
      this.a(cus.nL, oh.bx);
      this.a(cus.ra, oh.bx);
      this.a(cus.qG, oh.bx);
      this.a(cus.op, oh.bx);
      this.a(cus.rV, oh.bx);
      this.a(cus.vu, oh.bx);
      this.a(cus.vY, oh.bx);
      this.a(cus.qQ, oh.bx);
      this.a(cus.qC, oh.bx);
      this.a(cus.xq, oh.bx);
      this.a(cus.vp, oh.bx);
      this.a(cus.sm, oh.bx);
      this.a(cus.nW, oh.bx);
      this.a(cus.nX, oh.bx);
      this.a(cus.qX, oh.bx);
      this.a(cus.pp, oh.bz);
      this.a(cus.oT, oh.bz);
      this.a(cus.oU, oh.bz);
      this.a(cus.oS, oh.bz);
      this.a(cus.oR, oh.bz);
      this.a(cus.oQ, oh.bz);
      this.a(cus.rA, oh.bx);
      this.a(cus.vU, oh.bx);
      this.a(cus.nP, oh.bx);
      this.a(cus.vt, oh.bx);
      this.a(cus.vP, oh.bx);
      this.a(cus.rb, oh.bx);
      this.a(cus.qI, oh.bx);
      this.a(cus.qJ, oh.bx);
      this.a(cus.qK, oh.bx);
      this.a(cus.qz, oh.bx);
      this.a(cus.pw, oh.bx);
      this.a(cus.ri, oh.bx);
      this.a(cus.tY, oh.bx);
      this.a(cus.ub, oh.bO);
      this.a(cus.or);
      this.a(cus.oO, oh.bz);
      this.a(cus.oP, oh.bz);
      this.a(cus.oN, oh.bz);
      this.a(cus.oM, oh.bz);
      this.a(cus.oL, oh.bz);
      this.a(cus.tZ, oh.bx);
      this.a(cus.ua, oh.bx);
      this.a(cus.rm, oh.bx);
      this.a(cus.xs, oh.bx);
      this.a(cus.xt, oh.bx);
      this.a(cus.xu, oh.bx);
      this.a(cus.xv, oh.bx);
      this.a(cus.xw, oh.bx);
      this.a(cus.xx, oh.bx);
      this.a(cus.xy, oh.bx);
      this.a(cus.xz, oh.bx);
      this.a(cus.xA, oh.bx);
      this.a(cus.xB, oh.bx);
      this.a(cus.xC, oh.bx);
      this.a(cus.xD, oh.bx);
      this.a(cus.xE, oh.bx);
      this.a(cus.xF, oh.bx);
      this.a(cus.xG, oh.bx);
      this.a(cus.xH, oh.bx);
      this.a(cus.xI, oh.bx);
      this.a(cus.xJ, oh.bx);
      this.a(cus.xK, oh.bx);
      this.a(cus.vx, cus.pp, oh.bz);
      this.a(cus.qb, cus.qa, oh.bx);

      for (cuk $$0 : lp.h) {
         if ($$0 instanceof cse $$1) {
            this.a($$1);
         }
      }

      this.a(cus.xL, oh.bx);
      this.a(cus.xM, oh.bx);
      this.a(cus.xN, oh.bx);
      this.a(cus.xO, oh.bx);
      this.a(cus.xP, oh.bx);
      this.a(cus.xQ, oh.bx);
      this.a(cus.xR, oh.bx);
      this.a(cus.xS, oh.bx);
      this.a(cus.xT, oh.bx);
      this.a(cus.xU, oh.bx);
      this.a(cus.xV, oh.bx);
      this.a(cus.xW, oh.bx);
      this.a(cus.xX, oh.bx);
      this.a(cus.xY, oh.bx);
      this.a(cus.xZ, oh.bx);
      this.a(cus.ya, oh.bx);
      this.a(cus.yb, oh.bx);
      this.a(cus.yc, oh.bx);
      this.a(cus.yd, oh.bx);
      this.a(cus.ye, oh.bx);
      this.a(cus.yf, oh.bx);
      this.a(cus.yg, oh.bx);
      this.a(cus.yh, oh.bx);
      this.a(cus.yz, oh.bx);
      this.a(cus.yA, oh.bx);
      this.a(cus.yC, oh.bx);
   }

   static record a(String a, float b, Map<ji<csf>, String> c) {
      public String a(ji<csf> $$0) {
         return this.c.getOrDefault($$0, this.a);
      }
   }
}
