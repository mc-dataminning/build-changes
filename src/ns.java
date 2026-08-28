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
      new ns.a("iron", 0.2F, Map.of(csi.c, "iron_darker")),
      new ns.a("netherite", 0.3F, Map.of(csi.g, "netherite_darker")),
      new ns.a("redstone", 0.4F, Map.of()),
      new ns.a("copper", 0.5F, Map.of()),
      new ns.a("gold", 0.6F, Map.of(csi.d, "gold_darker")),
      new ns.a("emerald", 0.7F, Map.of()),
      new ns.a("diamond", 0.8F, Map.of(csi.e, "diamond_darker")),
      new ns.a("lapis", 0.9F, Map.of()),
      new ns.a("amethyst", 1.0F, Map.of())
   );
   private final BiConsumer<alf, Supplier<JsonElement>> c;

   public ns(BiConsumer<alf, Supplier<JsonElement>> $$0) {
      this.c = $$0;
   }

   private void a(cum $$0, og $$1) {
      $$1.a(of.a($$0), oi.b($$0), this.c);
   }

   private void a(cum $$0, String $$1, og $$2) {
      $$2.a(of.a($$0, $$1), oi.k(oi.a($$0, $$1)), this.c);
   }

   private void a(cum $$0, cum $$1, og $$2) {
      $$2.a(of.a($$0), oi.b($$1), this.c);
   }

   private void a(cum $$0) {
      this.a(of.a($$0), oi.c($$0), oi.a($$0, "_overlay"));
   }

   private void b(cum $$0) {
      for (int $$1 = 0; $$1 < 32; $$1++) {
         if ($$1 != 16) {
            this.a($$0, String.format(Locale.ROOT, "_%02d", $$1), oh.bx);
         }
      }
   }

   private void c(cum $$0) {
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

   private JsonObject a(alf $$0, Map<oj, alf> $$1, ji<csh> $$2) {
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

   private void a(csg $$0) {
      if ($$0.f().d()) {
         alf $$1 = of.a($$0);
         alf $$2 = oi.c($$0);
         alf $$3 = oi.a($$0, "_overlay");
         if ($$0.h().a(csi.a)) {
            oh.bB.a($$1, oi.c($$2, $$3), this.c, ($$1x, $$2x) -> this.a($$1x, $$2x, $$0.h()));
         } else {
            oh.bx.a($$1, oi.k($$2), this.c, ($$1x, $$2x) -> this.a($$1x, $$2x, $$0.h()));
         }

         for (ns.a $$4 : b) {
            String $$5 = $$4.a($$0.h());
            alf $$6 = this.a($$1, $$5);
            String $$7 = $$0.f().b() + "_trim_" + $$5;
            alf $$8 = new alf($$7).d("trims/items/");
            if ($$0.h().a(csi.a)) {
               this.a($$6, $$2, $$3, $$8);
            } else {
               this.a($$6, $$2, $$8);
            }
         }
      }
   }

   public void a() {
      this.a(cuu.oc, oh.bx);
      this.a(cuu.oe, oh.bx);
      this.a(cuu.od, oh.bx);
      this.a(cuu.of, oh.bx);
      this.a(cuu.oC, oh.bx);
      this.a(cuu.ot, oh.bx);
      this.a(cuu.oq, oh.bx);
      this.a(cuu.uF, oh.bx);
      this.a(cuu.ov, oh.bx);
      this.a(cuu.uh, oh.bx);
      this.a(cuu.dR, oh.bz);
      this.a(cuu.sa, oh.bx);
      this.a(cuu.vk, oh.bx);
      this.a(cuu.vm, oh.bx);
      this.a(cuu.nY, oh.bx);
      this.a(cuu.nZ, oh.bx);
      this.a(cuu.rx, oh.bx);
      this.a(cuu.so, oh.bx);
      this.a(cuu.sg, oh.bz);
      this.a(cuu.rt, oh.bx);
      this.a(cuu.ry, oh.bx);
      this.a(cuu.qP, oh.bx);
      this.a(cuu.pq, oh.bx);
      this.a(cuu.px, oh.bx);
      this.a(cuu.qL, oh.bx);
      this.a(cuu.yD, oh.bx);
      this.a(cuu.ru, oh.bx);
      this.a(cuu.qy, oh.bx);
      this.a(cuu.nR, oh.bA);
      this.a(cuu.nS, oh.bA);
      this.a(cuu.ox, oh.bx);
      this.a(cuu.nN, oh.bx);
      this.a(cuu.sc, oh.bx);
      this.a(cuu.vg, oh.bx);
      this.a(cuu.qM, oh.bx);
      this.c(cuu.qW);
      this.a(cuu.ow, oh.bx);
      this.a(cuu.qH, oh.bx);
      this.a(cuu.uM, oh.bx);
      this.b(cuu.qS);
      this.b(cuu.qT);
      this.a(cuu.sb, oh.bx);
      this.a(cuu.sd, oh.bx);
      this.a(cuu.rd, oh.bx);
      this.a(cuu.uO, oh.bx);
      this.a(cuu.pY, oh.bx);
      this.a(cuu.uB, oh.bx);
      this.a(cuu.re, oh.bx);
      this.a(cuu.rS, oh.bx);
      this.a(cuu.oF, oh.bx);
      this.a(cuu.oG, oh.bx);
      this.a(cuu.vX, oh.bx);
      this.a(cuu.rr, oh.bx);
      this.a(cuu.og, oh.bx);
      this.a(cuu.oh, oh.bx);
      this.a(cuu.oy, oh.bx);
      this.a(cuu.pi, oh.bz);
      this.a(cuu.pj, oh.bz);
      this.a(cuu.uI, oh.bx);
      this.a(cuu.ph, oh.bz);
      this.a(cuu.pg, oh.bz);
      this.a(cuu.pf, oh.bz);
      this.a(cuu.vn, oh.bx);
      this.a(cuu.rX, oh.bx);
      this.a(cuu.qR, oh.bx);
      this.a(cuu.oz, oh.bx);
      this.a(cuu.uw, oh.bx);
      this.a(cuu.ss, oh.bx);
      this.a(cuu.sf, oh.bx);
      this.a(cuu.vf, oh.bx);
      this.a(cuu.tW, oh.bx);
      this.a(cuu.sn, oh.bx);
      this.a(cuu.uu, oh.bx);
      this.a(cuu.tX, oh.bx);
      this.a(cuu.pW, oh.bx);
      this.a(cuu.os, oh.bx);
      this.a(cuu.wc, oh.bx);
      this.a(cuu.vW, oh.bx);
      this.a(cuu.nO, oh.bx);
      this.a(cuu.sh, oh.bx);
      this.a(cuu.sl, oh.bx);
      this.a(cuu.st, oh.bx);
      this.a(cuu.wa, oh.bx);
      this.a(cuu.ws, oh.bx);
      this.a(cuu.qY, oh.bx);
      this.a(cuu.rg, oh.bx);
      this.a(cuu.ud, oh.bx);
      this.a(cuu.oH, oh.bx);
      this.a(cuu.qa, oh.bx);
      this.a(cuu.oY, oh.bz);
      this.a(cuu.uk, oh.bx);
      this.a(cuu.oZ, oh.bz);
      this.a(cuu.uH, oh.bx);
      this.a(cuu.oX, oh.bz);
      this.a(cuu.oW, oh.bz);
      this.a(cuu.oV, oh.bz);
      this.a(cuu.oI, oh.bx);
      this.a(cuu.si, oh.bx);
      this.a(cuu.rp, oh.bx);
      this.a(cuu.rv, oh.bx);
      this.a(cuu.pu, oh.bx);
      this.a(cuu.wd, oh.bx);
      this.a(cuu.vS, oh.bx);
      this.a(cuu.ww, oh.bx);
      this.a(cuu.wz, oh.bx);
      this.a(cuu.nQ, oh.bx);
      this.a(cuu.rf, oh.bx);
      this.a(cuu.oD, oh.bx);
      this.a(cuu.pd, oh.bz);
      this.a(cuu.pe, oh.bz);
      this.a(cuu.uG, oh.bx);
      this.a(cuu.oE, oh.bx);
      this.a(cuu.vv, oh.bx);
      this.a(cuu.pc, oh.bz);
      this.a(cuu.pb, oh.bz);
      this.a(cuu.pa, oh.bz);
      this.a(cuu.uc, oh.bx);
      this.a(cuu.oa, oh.bx);
      this.a(cuu.ob, oh.bx);
      this.a(cuu.vw, oh.bx);
      this.a(cuu.oA, oh.bx);
      this.a(cuu.qA, oh.bx);
      this.a(cuu.qD, oh.bx);
      this.a(cuu.uJ, oh.bx);
      this.a(cuu.rl, oh.bx);
      this.a(cuu.rq, oh.bx);
      this.a(cuu.rn, oh.bx);
      this.a(cuu.rk, oh.bx);
      this.a(cuu.sp, oh.bx);
      this.a(cuu.oi, oh.bx);
      this.a(cuu.oj, oh.bx);
      this.a(cuu.ok, oh.bx);
      this.a(cuu.ol, oh.bx);
      this.a(cuu.uj, oh.bx);
      this.a(cuu.rW, oh.bx);
      this.a(cuu.qE, oh.bx);
      this.a(cuu.nM, oh.bx);
      this.a(cuu.vZ, oh.bx);
      this.a(cuu.pr, oh.bx);
      this.a(cuu.vO, oh.bx);
      this.a(cuu.vI, oh.by);
      this.a(cuu.vy, oh.by);
      this.a(cuu.vA, oh.by);
      this.a(cuu.vz, oh.by);
      this.a(cuu.vB, oh.by);
      this.a(cuu.vC, oh.by);
      this.a(cuu.vD, oh.by);
      this.a(cuu.vE, oh.by);
      this.a(cuu.vN, oh.by);
      this.a(cuu.vF, oh.by);
      this.a(cuu.vG, oh.by);
      this.a(cuu.vJ, oh.by);
      this.a(cuu.vH, oh.by);
      this.a(cuu.vK, oh.by);
      this.a(cuu.vL, oh.by);
      this.a(cuu.vM, oh.by);
      this.a(cuu.uN, oh.bx);
      this.a(cuu.uL, oh.bx);
      this.a(cuu.vR, oh.bx);
      this.a(cuu.pn, oh.bz);
      this.a(cuu.po, oh.bz);
      this.a(cuu.oJ, oh.bx);
      this.a(cuu.pm, oh.bz);
      this.a(cuu.oK, oh.bx);
      this.a(cuu.pl, oh.bz);
      this.a(cuu.pk, oh.bz);
      this.a(cuu.ux, oh.bx);
      this.a(cuu.us, oh.bx);
      this.a(cuu.nU, oh.bx);
      this.a(cuu.nV, oh.bx);
      this.a(cuu.rj, oh.bx);
      this.a(cuu.pZ, oh.bx);
      this.a(cuu.qO, oh.bx);
      this.a(cuu.vQ, oh.bx);
      this.a(cuu.wb, oh.bx);
      this.a(cuu.ro, oh.bx);
      this.a(cuu.ui, oh.bx);
      this.a(cuu.vh, oh.bx);
      this.a(cuu.pX, oh.bx);
      this.a(cuu.qB, oh.bx);
      this.a(cuu.uz, oh.bx);
      this.a(cuu.uy, oh.bx);
      this.a(cuu.rc, oh.bx);
      this.a(cuu.qF, oh.bx);
      this.a(cuu.ut, oh.bx);
      this.a(cuu.rs, oh.bx);
      this.a(cuu.oB, oh.bx);
      this.a(cuu.uA, oh.bx);
      this.a(cuu.uD, oh.bx);
      this.a(cuu.uE, oh.bx);
      this.a(cuu.uC, oh.bx);
      this.a(cuu.rw, oh.bx);
      this.a(cuu.se, oh.bx);
      this.a(cuu.nL, oh.bx);
      this.a(cuu.ra, oh.bx);
      this.a(cuu.qG, oh.bx);
      this.a(cuu.op, oh.bx);
      this.a(cuu.rV, oh.bx);
      this.a(cuu.vu, oh.bx);
      this.a(cuu.vY, oh.bx);
      this.a(cuu.qQ, oh.bx);
      this.a(cuu.qC, oh.bx);
      this.a(cuu.xq, oh.bx);
      this.a(cuu.vp, oh.bx);
      this.a(cuu.sm, oh.bx);
      this.a(cuu.nW, oh.bx);
      this.a(cuu.nX, oh.bx);
      this.a(cuu.qX, oh.bx);
      this.a(cuu.pp, oh.bz);
      this.a(cuu.oT, oh.bz);
      this.a(cuu.oU, oh.bz);
      this.a(cuu.oS, oh.bz);
      this.a(cuu.oR, oh.bz);
      this.a(cuu.oQ, oh.bz);
      this.a(cuu.rA, oh.bx);
      this.a(cuu.vU, oh.bx);
      this.a(cuu.nP, oh.bx);
      this.a(cuu.vt, oh.bx);
      this.a(cuu.vP, oh.bx);
      this.a(cuu.rb, oh.bx);
      this.a(cuu.qI, oh.bx);
      this.a(cuu.qJ, oh.bx);
      this.a(cuu.qK, oh.bx);
      this.a(cuu.qz, oh.bx);
      this.a(cuu.pw, oh.bx);
      this.a(cuu.ri, oh.bx);
      this.a(cuu.tY, oh.bx);
      this.a(cuu.ub, oh.bO);
      this.a(cuu.or);
      this.a(cuu.oO, oh.bz);
      this.a(cuu.oP, oh.bz);
      this.a(cuu.oN, oh.bz);
      this.a(cuu.oM, oh.bz);
      this.a(cuu.oL, oh.bz);
      this.a(cuu.tZ, oh.bx);
      this.a(cuu.ua, oh.bx);
      this.a(cuu.rm, oh.bx);
      this.a(cuu.xs, oh.bx);
      this.a(cuu.xt, oh.bx);
      this.a(cuu.xu, oh.bx);
      this.a(cuu.xv, oh.bx);
      this.a(cuu.xw, oh.bx);
      this.a(cuu.xx, oh.bx);
      this.a(cuu.xy, oh.bx);
      this.a(cuu.xz, oh.bx);
      this.a(cuu.xA, oh.bx);
      this.a(cuu.xB, oh.bx);
      this.a(cuu.xC, oh.bx);
      this.a(cuu.xD, oh.bx);
      this.a(cuu.xE, oh.bx);
      this.a(cuu.xF, oh.bx);
      this.a(cuu.xG, oh.bx);
      this.a(cuu.xH, oh.bx);
      this.a(cuu.xI, oh.bx);
      this.a(cuu.xJ, oh.bx);
      this.a(cuu.xK, oh.bx);
      this.a(cuu.vx, cuu.pp, oh.bz);
      this.a(cuu.qb, cuu.qa, oh.bx);

      for (cum $$0 : lp.h) {
         if ($$0 instanceof csg $$1) {
            this.a($$1);
         }
      }

      this.a(cuu.xL, oh.bx);
      this.a(cuu.xM, oh.bx);
      this.a(cuu.xN, oh.bx);
      this.a(cuu.xO, oh.bx);
      this.a(cuu.xP, oh.bx);
      this.a(cuu.xQ, oh.bx);
      this.a(cuu.xR, oh.bx);
      this.a(cuu.xS, oh.bx);
      this.a(cuu.xT, oh.bx);
      this.a(cuu.xU, oh.bx);
      this.a(cuu.xV, oh.bx);
      this.a(cuu.xW, oh.bx);
      this.a(cuu.xX, oh.bx);
      this.a(cuu.xY, oh.bx);
      this.a(cuu.xZ, oh.bx);
      this.a(cuu.ya, oh.bx);
      this.a(cuu.yb, oh.bx);
      this.a(cuu.yc, oh.bx);
      this.a(cuu.yd, oh.bx);
      this.a(cuu.ye, oh.bx);
      this.a(cuu.yf, oh.bx);
      this.a(cuu.yg, oh.bx);
      this.a(cuu.yh, oh.bx);
      this.a(cuu.yz, oh.bx);
      this.a(cuu.yA, oh.bx);
      this.a(cuu.yC, oh.bx);
   }

   static record a(String a, float b, Map<ji<csh>, String> c) {
      public String a(ji<csh> $$0) {
         return this.c.getOrDefault($$0, this.a);
      }
   }
}
