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
      new ns.a("iron", 0.2F, Map.of(cse.c, "iron_darker")),
      new ns.a("netherite", 0.3F, Map.of(cse.g, "netherite_darker")),
      new ns.a("redstone", 0.4F, Map.of()),
      new ns.a("copper", 0.5F, Map.of()),
      new ns.a("gold", 0.6F, Map.of(cse.d, "gold_darker")),
      new ns.a("emerald", 0.7F, Map.of()),
      new ns.a("diamond", 0.8F, Map.of(cse.e, "diamond_darker")),
      new ns.a("lapis", 0.9F, Map.of()),
      new ns.a("amethyst", 1.0F, Map.of())
   );
   private final BiConsumer<ale, Supplier<JsonElement>> c;

   public ns(BiConsumer<ale, Supplier<JsonElement>> $$0) {
      this.c = $$0;
   }

   private void a(cui $$0, og $$1) {
      $$1.a(of.a($$0), oi.b($$0), this.c);
   }

   private void a(cui $$0, String $$1, og $$2) {
      $$2.a(of.a($$0, $$1), oi.k(oi.a($$0, $$1)), this.c);
   }

   private void a(cui $$0, cui $$1, og $$2) {
      $$2.a(of.a($$0), oi.b($$1), this.c);
   }

   private void a(cui $$0) {
      this.a(of.a($$0), oi.c($$0), oi.a($$0, "_overlay"));
   }

   private void b(cui $$0) {
      for (int $$1 = 0; $$1 < 32; $$1++) {
         if ($$1 != 16) {
            this.a($$0, String.format(Locale.ROOT, "_%02d", $$1), oh.bx);
         }
      }
   }

   private void c(cui $$0) {
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

   private JsonObject a(ale $$0, Map<oj, ale> $$1, ji<csd> $$2) {
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

   private void a(csc $$0) {
      if ($$0.f().d()) {
         ale $$1 = of.a($$0);
         ale $$2 = oi.c($$0);
         ale $$3 = oi.a($$0, "_overlay");
         if ($$0.h().a(cse.a)) {
            oh.bB.a($$1, oi.c($$2, $$3), this.c, ($$1x, $$2x) -> this.a($$1x, $$2x, $$0.h()));
         } else {
            oh.bx.a($$1, oi.k($$2), this.c, ($$1x, $$2x) -> this.a($$1x, $$2x, $$0.h()));
         }

         for (ns.a $$4 : b) {
            String $$5 = $$4.a($$0.h());
            ale $$6 = this.a($$1, $$5);
            String $$7 = $$0.f().b() + "_trim_" + $$5;
            ale $$8 = new ale($$7).d("trims/items/");
            if ($$0.h().a(cse.a)) {
               this.a($$6, $$2, $$3, $$8);
            } else {
               this.a($$6, $$2, $$8);
            }
         }
      }
   }

   public void a() {
      this.a(cuq.oc, oh.bx);
      this.a(cuq.oe, oh.bx);
      this.a(cuq.od, oh.bx);
      this.a(cuq.of, oh.bx);
      this.a(cuq.oC, oh.bx);
      this.a(cuq.ot, oh.bx);
      this.a(cuq.oq, oh.bx);
      this.a(cuq.uF, oh.bx);
      this.a(cuq.ov, oh.bx);
      this.a(cuq.uh, oh.bx);
      this.a(cuq.dR, oh.bz);
      this.a(cuq.sa, oh.bx);
      this.a(cuq.vk, oh.bx);
      this.a(cuq.vm, oh.bx);
      this.a(cuq.nY, oh.bx);
      this.a(cuq.nZ, oh.bx);
      this.a(cuq.rx, oh.bx);
      this.a(cuq.so, oh.bx);
      this.a(cuq.sg, oh.bz);
      this.a(cuq.rt, oh.bx);
      this.a(cuq.ry, oh.bx);
      this.a(cuq.qP, oh.bx);
      this.a(cuq.pq, oh.bx);
      this.a(cuq.px, oh.bx);
      this.a(cuq.qL, oh.bx);
      this.a(cuq.yD, oh.bx);
      this.a(cuq.ru, oh.bx);
      this.a(cuq.qy, oh.bx);
      this.a(cuq.nR, oh.bA);
      this.a(cuq.nS, oh.bA);
      this.a(cuq.ox, oh.bx);
      this.a(cuq.nN, oh.bx);
      this.a(cuq.sc, oh.bx);
      this.a(cuq.vg, oh.bx);
      this.a(cuq.qM, oh.bx);
      this.c(cuq.qW);
      this.a(cuq.ow, oh.bx);
      this.a(cuq.qH, oh.bx);
      this.a(cuq.uM, oh.bx);
      this.b(cuq.qS);
      this.b(cuq.qT);
      this.a(cuq.sb, oh.bx);
      this.a(cuq.sd, oh.bx);
      this.a(cuq.rd, oh.bx);
      this.a(cuq.uO, oh.bx);
      this.a(cuq.pY, oh.bx);
      this.a(cuq.uB, oh.bx);
      this.a(cuq.re, oh.bx);
      this.a(cuq.rS, oh.bx);
      this.a(cuq.oF, oh.bx);
      this.a(cuq.oG, oh.bx);
      this.a(cuq.vX, oh.bx);
      this.a(cuq.rr, oh.bx);
      this.a(cuq.og, oh.bx);
      this.a(cuq.oh, oh.bx);
      this.a(cuq.oy, oh.bx);
      this.a(cuq.pi, oh.bz);
      this.a(cuq.pj, oh.bz);
      this.a(cuq.uI, oh.bx);
      this.a(cuq.ph, oh.bz);
      this.a(cuq.pg, oh.bz);
      this.a(cuq.pf, oh.bz);
      this.a(cuq.vn, oh.bx);
      this.a(cuq.rX, oh.bx);
      this.a(cuq.qR, oh.bx);
      this.a(cuq.oz, oh.bx);
      this.a(cuq.uw, oh.bx);
      this.a(cuq.ss, oh.bx);
      this.a(cuq.sf, oh.bx);
      this.a(cuq.vf, oh.bx);
      this.a(cuq.tW, oh.bx);
      this.a(cuq.sn, oh.bx);
      this.a(cuq.uu, oh.bx);
      this.a(cuq.tX, oh.bx);
      this.a(cuq.pW, oh.bx);
      this.a(cuq.os, oh.bx);
      this.a(cuq.wc, oh.bx);
      this.a(cuq.vW, oh.bx);
      this.a(cuq.nO, oh.bx);
      this.a(cuq.sh, oh.bx);
      this.a(cuq.sl, oh.bx);
      this.a(cuq.st, oh.bx);
      this.a(cuq.wa, oh.bx);
      this.a(cuq.ws, oh.bx);
      this.a(cuq.qY, oh.bx);
      this.a(cuq.rg, oh.bx);
      this.a(cuq.ud, oh.bx);
      this.a(cuq.oH, oh.bx);
      this.a(cuq.qa, oh.bx);
      this.a(cuq.oY, oh.bz);
      this.a(cuq.uk, oh.bx);
      this.a(cuq.oZ, oh.bz);
      this.a(cuq.uH, oh.bx);
      this.a(cuq.oX, oh.bz);
      this.a(cuq.oW, oh.bz);
      this.a(cuq.oV, oh.bz);
      this.a(cuq.oI, oh.bx);
      this.a(cuq.si, oh.bx);
      this.a(cuq.rp, oh.bx);
      this.a(cuq.rv, oh.bx);
      this.a(cuq.pu, oh.bx);
      this.a(cuq.wd, oh.bx);
      this.a(cuq.vS, oh.bx);
      this.a(cuq.ww, oh.bx);
      this.a(cuq.wz, oh.bx);
      this.a(cuq.nQ, oh.bx);
      this.a(cuq.rf, oh.bx);
      this.a(cuq.oD, oh.bx);
      this.a(cuq.pd, oh.bz);
      this.a(cuq.pe, oh.bz);
      this.a(cuq.uG, oh.bx);
      this.a(cuq.oE, oh.bx);
      this.a(cuq.vv, oh.bx);
      this.a(cuq.pc, oh.bz);
      this.a(cuq.pb, oh.bz);
      this.a(cuq.pa, oh.bz);
      this.a(cuq.uc, oh.bx);
      this.a(cuq.oa, oh.bx);
      this.a(cuq.ob, oh.bx);
      this.a(cuq.vw, oh.bx);
      this.a(cuq.oA, oh.bx);
      this.a(cuq.qA, oh.bx);
      this.a(cuq.qD, oh.bx);
      this.a(cuq.uJ, oh.bx);
      this.a(cuq.rl, oh.bx);
      this.a(cuq.rq, oh.bx);
      this.a(cuq.rn, oh.bx);
      this.a(cuq.rk, oh.bx);
      this.a(cuq.sp, oh.bx);
      this.a(cuq.oi, oh.bx);
      this.a(cuq.oj, oh.bx);
      this.a(cuq.ok, oh.bx);
      this.a(cuq.ol, oh.bx);
      this.a(cuq.uj, oh.bx);
      this.a(cuq.rW, oh.bx);
      this.a(cuq.qE, oh.bx);
      this.a(cuq.nM, oh.bx);
      this.a(cuq.vZ, oh.bx);
      this.a(cuq.pr, oh.bx);
      this.a(cuq.vO, oh.bx);
      this.a(cuq.vI, oh.by);
      this.a(cuq.vy, oh.by);
      this.a(cuq.vA, oh.by);
      this.a(cuq.vz, oh.by);
      this.a(cuq.vB, oh.by);
      this.a(cuq.vC, oh.by);
      this.a(cuq.vD, oh.by);
      this.a(cuq.vE, oh.by);
      this.a(cuq.vN, oh.by);
      this.a(cuq.vF, oh.by);
      this.a(cuq.vG, oh.by);
      this.a(cuq.vJ, oh.by);
      this.a(cuq.vH, oh.by);
      this.a(cuq.vK, oh.by);
      this.a(cuq.vL, oh.by);
      this.a(cuq.vM, oh.by);
      this.a(cuq.uN, oh.bx);
      this.a(cuq.uL, oh.bx);
      this.a(cuq.vR, oh.bx);
      this.a(cuq.pn, oh.bz);
      this.a(cuq.po, oh.bz);
      this.a(cuq.oJ, oh.bx);
      this.a(cuq.pm, oh.bz);
      this.a(cuq.oK, oh.bx);
      this.a(cuq.pl, oh.bz);
      this.a(cuq.pk, oh.bz);
      this.a(cuq.ux, oh.bx);
      this.a(cuq.us, oh.bx);
      this.a(cuq.nU, oh.bx);
      this.a(cuq.nV, oh.bx);
      this.a(cuq.rj, oh.bx);
      this.a(cuq.pZ, oh.bx);
      this.a(cuq.qO, oh.bx);
      this.a(cuq.vQ, oh.bx);
      this.a(cuq.wb, oh.bx);
      this.a(cuq.ro, oh.bx);
      this.a(cuq.ui, oh.bx);
      this.a(cuq.vh, oh.bx);
      this.a(cuq.pX, oh.bx);
      this.a(cuq.qB, oh.bx);
      this.a(cuq.uz, oh.bx);
      this.a(cuq.uy, oh.bx);
      this.a(cuq.rc, oh.bx);
      this.a(cuq.qF, oh.bx);
      this.a(cuq.ut, oh.bx);
      this.a(cuq.rs, oh.bx);
      this.a(cuq.oB, oh.bx);
      this.a(cuq.uA, oh.bx);
      this.a(cuq.uD, oh.bx);
      this.a(cuq.uE, oh.bx);
      this.a(cuq.uC, oh.bx);
      this.a(cuq.rw, oh.bx);
      this.a(cuq.se, oh.bx);
      this.a(cuq.nL, oh.bx);
      this.a(cuq.ra, oh.bx);
      this.a(cuq.qG, oh.bx);
      this.a(cuq.op, oh.bx);
      this.a(cuq.rV, oh.bx);
      this.a(cuq.vu, oh.bx);
      this.a(cuq.vY, oh.bx);
      this.a(cuq.qQ, oh.bx);
      this.a(cuq.qC, oh.bx);
      this.a(cuq.xq, oh.bx);
      this.a(cuq.vp, oh.bx);
      this.a(cuq.sm, oh.bx);
      this.a(cuq.nW, oh.bx);
      this.a(cuq.nX, oh.bx);
      this.a(cuq.qX, oh.bx);
      this.a(cuq.pp, oh.bz);
      this.a(cuq.oT, oh.bz);
      this.a(cuq.oU, oh.bz);
      this.a(cuq.oS, oh.bz);
      this.a(cuq.oR, oh.bz);
      this.a(cuq.oQ, oh.bz);
      this.a(cuq.rA, oh.bx);
      this.a(cuq.vU, oh.bx);
      this.a(cuq.nP, oh.bx);
      this.a(cuq.vt, oh.bx);
      this.a(cuq.vP, oh.bx);
      this.a(cuq.rb, oh.bx);
      this.a(cuq.qI, oh.bx);
      this.a(cuq.qJ, oh.bx);
      this.a(cuq.qK, oh.bx);
      this.a(cuq.qz, oh.bx);
      this.a(cuq.pw, oh.bx);
      this.a(cuq.ri, oh.bx);
      this.a(cuq.tY, oh.bx);
      this.a(cuq.ub, oh.bO);
      this.a(cuq.or);
      this.a(cuq.oO, oh.bz);
      this.a(cuq.oP, oh.bz);
      this.a(cuq.oN, oh.bz);
      this.a(cuq.oM, oh.bz);
      this.a(cuq.oL, oh.bz);
      this.a(cuq.tZ, oh.bx);
      this.a(cuq.ua, oh.bx);
      this.a(cuq.rm, oh.bx);
      this.a(cuq.xs, oh.bx);
      this.a(cuq.xt, oh.bx);
      this.a(cuq.xu, oh.bx);
      this.a(cuq.xv, oh.bx);
      this.a(cuq.xw, oh.bx);
      this.a(cuq.xx, oh.bx);
      this.a(cuq.xy, oh.bx);
      this.a(cuq.xz, oh.bx);
      this.a(cuq.xA, oh.bx);
      this.a(cuq.xB, oh.bx);
      this.a(cuq.xC, oh.bx);
      this.a(cuq.xD, oh.bx);
      this.a(cuq.xE, oh.bx);
      this.a(cuq.xF, oh.bx);
      this.a(cuq.xG, oh.bx);
      this.a(cuq.xH, oh.bx);
      this.a(cuq.xI, oh.bx);
      this.a(cuq.xJ, oh.bx);
      this.a(cuq.xK, oh.bx);
      this.a(cuq.vx, cuq.pp, oh.bz);
      this.a(cuq.qb, cuq.qa, oh.bx);

      for (cui $$0 : lp.h) {
         if ($$0 instanceof csc $$1) {
            this.a($$1);
         }
      }

      this.a(cuq.xL, oh.bx);
      this.a(cuq.xM, oh.bx);
      this.a(cuq.xN, oh.bx);
      this.a(cuq.xO, oh.bx);
      this.a(cuq.xP, oh.bx);
      this.a(cuq.xQ, oh.bx);
      this.a(cuq.xR, oh.bx);
      this.a(cuq.xS, oh.bx);
      this.a(cuq.xT, oh.bx);
      this.a(cuq.xU, oh.bx);
      this.a(cuq.xV, oh.bx);
      this.a(cuq.xW, oh.bx);
      this.a(cuq.xX, oh.bx);
      this.a(cuq.xY, oh.bx);
      this.a(cuq.xZ, oh.bx);
      this.a(cuq.ya, oh.bx);
      this.a(cuq.yb, oh.bx);
      this.a(cuq.yc, oh.bx);
      this.a(cuq.yd, oh.bx);
      this.a(cuq.ye, oh.bx);
      this.a(cuq.yf, oh.bx);
      this.a(cuq.yg, oh.bx);
      this.a(cuq.yh, oh.bx);
      this.a(cuq.yz, oh.bx);
      this.a(cuq.yA, oh.bx);
      this.a(cuq.yC, oh.bx);
   }

   static record a(String a, float b, Map<ji<csd>, String> c) {
      public String a(ji<csd> $$0) {
         return this.c.getOrDefault($$0, this.a);
      }
   }
}
