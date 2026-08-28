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
      new ns.a("iron", 0.2F, Map.of(csh.c, "iron_darker")),
      new ns.a("netherite", 0.3F, Map.of(csh.g, "netherite_darker")),
      new ns.a("redstone", 0.4F, Map.of()),
      new ns.a("copper", 0.5F, Map.of()),
      new ns.a("gold", 0.6F, Map.of(csh.d, "gold_darker")),
      new ns.a("emerald", 0.7F, Map.of()),
      new ns.a("diamond", 0.8F, Map.of(csh.e, "diamond_darker")),
      new ns.a("lapis", 0.9F, Map.of()),
      new ns.a("amethyst", 1.0F, Map.of())
   );
   private final BiConsumer<alf, Supplier<JsonElement>> c;

   public ns(BiConsumer<alf, Supplier<JsonElement>> $$0) {
      this.c = $$0;
   }

   private void a(cul $$0, og $$1) {
      $$1.a(of.a($$0), oi.b($$0), this.c);
   }

   private void a(cul $$0, String $$1, og $$2) {
      $$2.a(of.a($$0, $$1), oi.k(oi.a($$0, $$1)), this.c);
   }

   private void a(cul $$0, cul $$1, og $$2) {
      $$2.a(of.a($$0), oi.b($$1), this.c);
   }

   private void a(cul $$0) {
      this.a(of.a($$0), oi.c($$0), oi.a($$0, "_overlay"));
   }

   private void b(cul $$0) {
      for (int $$1 = 0; $$1 < 32; $$1++) {
         if ($$1 != 16) {
            this.a($$0, String.format(Locale.ROOT, "_%02d", $$1), oh.bx);
         }
      }
   }

   private void c(cul $$0) {
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

   private JsonObject a(alf $$0, Map<oj, alf> $$1, ji<csg> $$2) {
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

   private void a(csf $$0) {
      if ($$0.f().d()) {
         alf $$1 = of.a($$0);
         alf $$2 = oi.c($$0);
         alf $$3 = oi.a($$0, "_overlay");
         if ($$0.h().a(csh.a)) {
            oh.bB.a($$1, oi.c($$2, $$3), this.c, ($$1x, $$2x) -> this.a($$1x, $$2x, $$0.h()));
         } else {
            oh.bx.a($$1, oi.k($$2), this.c, ($$1x, $$2x) -> this.a($$1x, $$2x, $$0.h()));
         }

         for (ns.a $$4 : b) {
            String $$5 = $$4.a($$0.h());
            alf $$6 = this.a($$1, $$5);
            String $$7 = $$0.f().b() + "_trim_" + $$5;
            alf $$8 = new alf($$7).d("trims/items/");
            if ($$0.h().a(csh.a)) {
               this.a($$6, $$2, $$3, $$8);
            } else {
               this.a($$6, $$2, $$8);
            }
         }
      }
   }

   public void a() {
      this.a(cut.oc, oh.bx);
      this.a(cut.oe, oh.bx);
      this.a(cut.od, oh.bx);
      this.a(cut.of, oh.bx);
      this.a(cut.oC, oh.bx);
      this.a(cut.ot, oh.bx);
      this.a(cut.oq, oh.bx);
      this.a(cut.uF, oh.bx);
      this.a(cut.ov, oh.bx);
      this.a(cut.uh, oh.bx);
      this.a(cut.dR, oh.bz);
      this.a(cut.sa, oh.bx);
      this.a(cut.vk, oh.bx);
      this.a(cut.vm, oh.bx);
      this.a(cut.nY, oh.bx);
      this.a(cut.nZ, oh.bx);
      this.a(cut.rx, oh.bx);
      this.a(cut.so, oh.bx);
      this.a(cut.sg, oh.bz);
      this.a(cut.rt, oh.bx);
      this.a(cut.ry, oh.bx);
      this.a(cut.qP, oh.bx);
      this.a(cut.pq, oh.bx);
      this.a(cut.px, oh.bx);
      this.a(cut.qL, oh.bx);
      this.a(cut.yD, oh.bx);
      this.a(cut.ru, oh.bx);
      this.a(cut.qy, oh.bx);
      this.a(cut.nR, oh.bA);
      this.a(cut.nS, oh.bA);
      this.a(cut.ox, oh.bx);
      this.a(cut.nN, oh.bx);
      this.a(cut.sc, oh.bx);
      this.a(cut.vg, oh.bx);
      this.a(cut.qM, oh.bx);
      this.c(cut.qW);
      this.a(cut.ow, oh.bx);
      this.a(cut.qH, oh.bx);
      this.a(cut.uM, oh.bx);
      this.b(cut.qS);
      this.b(cut.qT);
      this.a(cut.sb, oh.bx);
      this.a(cut.sd, oh.bx);
      this.a(cut.rd, oh.bx);
      this.a(cut.uO, oh.bx);
      this.a(cut.pY, oh.bx);
      this.a(cut.uB, oh.bx);
      this.a(cut.re, oh.bx);
      this.a(cut.rS, oh.bx);
      this.a(cut.oF, oh.bx);
      this.a(cut.oG, oh.bx);
      this.a(cut.vX, oh.bx);
      this.a(cut.rr, oh.bx);
      this.a(cut.og, oh.bx);
      this.a(cut.oh, oh.bx);
      this.a(cut.oy, oh.bx);
      this.a(cut.pi, oh.bz);
      this.a(cut.pj, oh.bz);
      this.a(cut.uI, oh.bx);
      this.a(cut.ph, oh.bz);
      this.a(cut.pg, oh.bz);
      this.a(cut.pf, oh.bz);
      this.a(cut.vn, oh.bx);
      this.a(cut.rX, oh.bx);
      this.a(cut.qR, oh.bx);
      this.a(cut.oz, oh.bx);
      this.a(cut.uw, oh.bx);
      this.a(cut.ss, oh.bx);
      this.a(cut.sf, oh.bx);
      this.a(cut.vf, oh.bx);
      this.a(cut.tW, oh.bx);
      this.a(cut.sn, oh.bx);
      this.a(cut.uu, oh.bx);
      this.a(cut.tX, oh.bx);
      this.a(cut.pW, oh.bx);
      this.a(cut.os, oh.bx);
      this.a(cut.wc, oh.bx);
      this.a(cut.vW, oh.bx);
      this.a(cut.nO, oh.bx);
      this.a(cut.sh, oh.bx);
      this.a(cut.sl, oh.bx);
      this.a(cut.st, oh.bx);
      this.a(cut.wa, oh.bx);
      this.a(cut.ws, oh.bx);
      this.a(cut.qY, oh.bx);
      this.a(cut.rg, oh.bx);
      this.a(cut.ud, oh.bx);
      this.a(cut.oH, oh.bx);
      this.a(cut.qa, oh.bx);
      this.a(cut.oY, oh.bz);
      this.a(cut.uk, oh.bx);
      this.a(cut.oZ, oh.bz);
      this.a(cut.uH, oh.bx);
      this.a(cut.oX, oh.bz);
      this.a(cut.oW, oh.bz);
      this.a(cut.oV, oh.bz);
      this.a(cut.oI, oh.bx);
      this.a(cut.si, oh.bx);
      this.a(cut.rp, oh.bx);
      this.a(cut.rv, oh.bx);
      this.a(cut.pu, oh.bx);
      this.a(cut.wd, oh.bx);
      this.a(cut.vS, oh.bx);
      this.a(cut.ww, oh.bx);
      this.a(cut.wz, oh.bx);
      this.a(cut.nQ, oh.bx);
      this.a(cut.rf, oh.bx);
      this.a(cut.oD, oh.bx);
      this.a(cut.pd, oh.bz);
      this.a(cut.pe, oh.bz);
      this.a(cut.uG, oh.bx);
      this.a(cut.oE, oh.bx);
      this.a(cut.vv, oh.bx);
      this.a(cut.pc, oh.bz);
      this.a(cut.pb, oh.bz);
      this.a(cut.pa, oh.bz);
      this.a(cut.uc, oh.bx);
      this.a(cut.oa, oh.bx);
      this.a(cut.ob, oh.bx);
      this.a(cut.vw, oh.bx);
      this.a(cut.oA, oh.bx);
      this.a(cut.qA, oh.bx);
      this.a(cut.qD, oh.bx);
      this.a(cut.uJ, oh.bx);
      this.a(cut.rl, oh.bx);
      this.a(cut.rq, oh.bx);
      this.a(cut.rn, oh.bx);
      this.a(cut.rk, oh.bx);
      this.a(cut.sp, oh.bx);
      this.a(cut.oi, oh.bx);
      this.a(cut.oj, oh.bx);
      this.a(cut.ok, oh.bx);
      this.a(cut.ol, oh.bx);
      this.a(cut.uj, oh.bx);
      this.a(cut.rW, oh.bx);
      this.a(cut.qE, oh.bx);
      this.a(cut.nM, oh.bx);
      this.a(cut.vZ, oh.bx);
      this.a(cut.pr, oh.bx);
      this.a(cut.vO, oh.bx);
      this.a(cut.vI, oh.by);
      this.a(cut.vy, oh.by);
      this.a(cut.vA, oh.by);
      this.a(cut.vz, oh.by);
      this.a(cut.vB, oh.by);
      this.a(cut.vC, oh.by);
      this.a(cut.vD, oh.by);
      this.a(cut.vE, oh.by);
      this.a(cut.vN, oh.by);
      this.a(cut.vF, oh.by);
      this.a(cut.vG, oh.by);
      this.a(cut.vJ, oh.by);
      this.a(cut.vH, oh.by);
      this.a(cut.vK, oh.by);
      this.a(cut.vL, oh.by);
      this.a(cut.vM, oh.by);
      this.a(cut.uN, oh.bx);
      this.a(cut.uL, oh.bx);
      this.a(cut.vR, oh.bx);
      this.a(cut.pn, oh.bz);
      this.a(cut.po, oh.bz);
      this.a(cut.oJ, oh.bx);
      this.a(cut.pm, oh.bz);
      this.a(cut.oK, oh.bx);
      this.a(cut.pl, oh.bz);
      this.a(cut.pk, oh.bz);
      this.a(cut.ux, oh.bx);
      this.a(cut.us, oh.bx);
      this.a(cut.nU, oh.bx);
      this.a(cut.nV, oh.bx);
      this.a(cut.rj, oh.bx);
      this.a(cut.pZ, oh.bx);
      this.a(cut.qO, oh.bx);
      this.a(cut.vQ, oh.bx);
      this.a(cut.wb, oh.bx);
      this.a(cut.ro, oh.bx);
      this.a(cut.ui, oh.bx);
      this.a(cut.vh, oh.bx);
      this.a(cut.pX, oh.bx);
      this.a(cut.qB, oh.bx);
      this.a(cut.uz, oh.bx);
      this.a(cut.uy, oh.bx);
      this.a(cut.rc, oh.bx);
      this.a(cut.qF, oh.bx);
      this.a(cut.ut, oh.bx);
      this.a(cut.rs, oh.bx);
      this.a(cut.oB, oh.bx);
      this.a(cut.uA, oh.bx);
      this.a(cut.uD, oh.bx);
      this.a(cut.uE, oh.bx);
      this.a(cut.uC, oh.bx);
      this.a(cut.rw, oh.bx);
      this.a(cut.se, oh.bx);
      this.a(cut.nL, oh.bx);
      this.a(cut.ra, oh.bx);
      this.a(cut.qG, oh.bx);
      this.a(cut.op, oh.bx);
      this.a(cut.rV, oh.bx);
      this.a(cut.vu, oh.bx);
      this.a(cut.vY, oh.bx);
      this.a(cut.qQ, oh.bx);
      this.a(cut.qC, oh.bx);
      this.a(cut.xq, oh.bx);
      this.a(cut.vp, oh.bx);
      this.a(cut.sm, oh.bx);
      this.a(cut.nW, oh.bx);
      this.a(cut.nX, oh.bx);
      this.a(cut.qX, oh.bx);
      this.a(cut.pp, oh.bz);
      this.a(cut.oT, oh.bz);
      this.a(cut.oU, oh.bz);
      this.a(cut.oS, oh.bz);
      this.a(cut.oR, oh.bz);
      this.a(cut.oQ, oh.bz);
      this.a(cut.rA, oh.bx);
      this.a(cut.vU, oh.bx);
      this.a(cut.nP, oh.bx);
      this.a(cut.vt, oh.bx);
      this.a(cut.vP, oh.bx);
      this.a(cut.rb, oh.bx);
      this.a(cut.qI, oh.bx);
      this.a(cut.qJ, oh.bx);
      this.a(cut.qK, oh.bx);
      this.a(cut.qz, oh.bx);
      this.a(cut.pw, oh.bx);
      this.a(cut.ri, oh.bx);
      this.a(cut.tY, oh.bx);
      this.a(cut.ub, oh.bO);
      this.a(cut.or);
      this.a(cut.oO, oh.bz);
      this.a(cut.oP, oh.bz);
      this.a(cut.oN, oh.bz);
      this.a(cut.oM, oh.bz);
      this.a(cut.oL, oh.bz);
      this.a(cut.tZ, oh.bx);
      this.a(cut.ua, oh.bx);
      this.a(cut.rm, oh.bx);
      this.a(cut.xs, oh.bx);
      this.a(cut.xt, oh.bx);
      this.a(cut.xu, oh.bx);
      this.a(cut.xv, oh.bx);
      this.a(cut.xw, oh.bx);
      this.a(cut.xx, oh.bx);
      this.a(cut.xy, oh.bx);
      this.a(cut.xz, oh.bx);
      this.a(cut.xA, oh.bx);
      this.a(cut.xB, oh.bx);
      this.a(cut.xC, oh.bx);
      this.a(cut.xD, oh.bx);
      this.a(cut.xE, oh.bx);
      this.a(cut.xF, oh.bx);
      this.a(cut.xG, oh.bx);
      this.a(cut.xH, oh.bx);
      this.a(cut.xI, oh.bx);
      this.a(cut.xJ, oh.bx);
      this.a(cut.xK, oh.bx);
      this.a(cut.vx, cut.pp, oh.bz);
      this.a(cut.qb, cut.qa, oh.bx);

      for (cul $$0 : lp.h) {
         if ($$0 instanceof csf $$1) {
            this.a($$1);
         }
      }

      this.a(cut.xL, oh.bx);
      this.a(cut.xM, oh.bx);
      this.a(cut.xN, oh.bx);
      this.a(cut.xO, oh.bx);
      this.a(cut.xP, oh.bx);
      this.a(cut.xQ, oh.bx);
      this.a(cut.xR, oh.bx);
      this.a(cut.xS, oh.bx);
      this.a(cut.xT, oh.bx);
      this.a(cut.xU, oh.bx);
      this.a(cut.xV, oh.bx);
      this.a(cut.xW, oh.bx);
      this.a(cut.xX, oh.bx);
      this.a(cut.xY, oh.bx);
      this.a(cut.xZ, oh.bx);
      this.a(cut.ya, oh.bx);
      this.a(cut.yb, oh.bx);
      this.a(cut.yc, oh.bx);
      this.a(cut.yd, oh.bx);
      this.a(cut.ye, oh.bx);
      this.a(cut.yf, oh.bx);
      this.a(cut.yg, oh.bx);
      this.a(cut.yh, oh.bx);
      this.a(cut.yz, oh.bx);
      this.a(cut.yA, oh.bx);
      this.a(cut.yC, oh.bx);
   }

   static record a(String a, float b, Map<ji<csg>, String> c) {
      public String a(ji<csg> $$0) {
         return this.c.getOrDefault($$0, this.a);
      }
   }
}
