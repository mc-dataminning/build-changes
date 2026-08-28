import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Supplier;

public class np {
   public static final akr a = akr.b("trim_type");
   private static final List<np.a> b = List.of(
      new np.a("quartz", 0.1F, Map.of()),
      new np.a("iron", 0.2F, Map.of(csh.c, "iron_darker")),
      new np.a("netherite", 0.3F, Map.of(csh.g, "netherite_darker")),
      new np.a("redstone", 0.4F, Map.of()),
      new np.a("copper", 0.5F, Map.of()),
      new np.a("gold", 0.6F, Map.of(csh.d, "gold_darker")),
      new np.a("emerald", 0.7F, Map.of()),
      new np.a("diamond", 0.8F, Map.of(csh.e, "diamond_darker")),
      new np.a("lapis", 0.9F, Map.of()),
      new np.a("amethyst", 1.0F, Map.of())
   );
   private final BiConsumer<akr, Supplier<JsonElement>> c;

   public np(BiConsumer<akr, Supplier<JsonElement>> $$0) {
      this.c = $$0;
   }

   private void a(cul $$0, od $$1) {
      $$1.a(oc.a($$0), of.b($$0), this.c);
   }

   private void a(cul $$0, String $$1, od $$2) {
      $$2.a(oc.a($$0, $$1), of.k(of.a($$0, $$1)), this.c);
   }

   private void a(cul $$0, cul $$1, od $$2) {
      $$2.a(oc.a($$0), of.b($$1), this.c);
   }

   private void a(cul $$0) {
      this.a(oc.a($$0), of.c($$0), of.a($$0, "_overlay"));
   }

   private void b(cul $$0) {
      for (int $$1 = 0; $$1 < 32; $$1++) {
         if ($$1 != 16) {
            this.a($$0, String.format(Locale.ROOT, "_%02d", $$1), oe.bx);
         }
      }
   }

   private void c(cul $$0) {
      for (int $$1 = 1; $$1 < 64; $$1++) {
         this.a($$0, String.format(Locale.ROOT, "_%02d", $$1), oe.bx);
      }
   }

   private void a(akr $$0, akr $$1, akr $$2) {
      oe.bB.a($$0, of.c($$1, $$2), this.c);
   }

   private void a(akr $$0, akr $$1, akr $$2, akr $$3) {
      oe.bC.a($$0, of.a($$1, $$2, $$3), this.c);
   }

   private akr a(akr $$0, String $$1) {
      return $$0.g("_" + $$1 + "_trim");
   }

   private JsonObject a(akr $$0, Map<og, akr> $$1, jm<csg> $$2) {
      JsonObject $$3 = oe.bB.a($$0, $$1);
      JsonArray $$4 = new JsonArray();

      for (np.a $$5 : b) {
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
         akr $$1 = oc.a($$0);
         akr $$2 = of.c($$0);
         akr $$3 = of.a($$0, "_overlay");
         if ($$0.h().a(csh.a)) {
            oe.bB.a($$1, of.c($$2, $$3), this.c, ($$1x, $$2x) -> this.a($$1x, $$2x, $$0.h()));
         } else {
            oe.bx.a($$1, of.k($$2), this.c, ($$1x, $$2x) -> this.a($$1x, $$2x, $$0.h()));
         }

         for (np.a $$4 : b) {
            String $$5 = $$4.a($$0.h());
            akr $$6 = this.a($$1, $$5);
            String $$7 = $$0.f().b() + "_trim_" + $$5;
            akr $$8 = akr.b($$7).f("trims/items/");
            if ($$0.h().a(csh.a)) {
               this.a($$6, $$2, $$3, $$8);
            } else {
               this.a($$6, $$2, $$8);
            }
         }
      }
   }

   public void a() {
      this.a(cut.oc, oe.bx);
      this.a(cut.oe, oe.bx);
      this.a(cut.od, oe.bx);
      this.a(cut.of, oe.bx);
      this.a(cut.oD, oe.bx);
      this.a(cut.ou, oe.bx);
      this.a(cut.oq, oe.bx);
      this.a(cut.uF, oe.bx);
      this.a(cut.ow, oe.bx);
      this.a(cut.uh, oe.bx);
      this.a(cut.dR, oe.bz);
      this.a(cut.sa, oe.bx);
      this.a(cut.vk, oe.bx);
      this.a(cut.vm, oe.bx);
      this.a(cut.nY, oe.bx);
      this.a(cut.nZ, oe.bx);
      this.a(cut.rx, oe.bx);
      this.a(cut.so, oe.bx);
      this.a(cut.sg, oe.bz);
      this.a(cut.rt, oe.bx);
      this.a(cut.ry, oe.bx);
      this.a(cut.qP, oe.bx);
      this.a(cut.ot, oe.bx);
      this.a(cut.px, oe.bx);
      this.a(cut.qL, oe.bx);
      this.a(cut.yG, oe.bx);
      this.a(cut.ru, oe.bx);
      this.a(cut.qy, oe.bx);
      this.a(cut.nR, oe.bA);
      this.a(cut.nS, oe.bA);
      this.a(cut.oy, oe.bx);
      this.a(cut.nN, oe.bx);
      this.a(cut.sc, oe.bx);
      this.a(cut.vg, oe.bx);
      this.a(cut.qM, oe.bx);
      this.c(cut.qW);
      this.a(cut.ox, oe.bx);
      this.a(cut.qH, oe.bx);
      this.a(cut.uM, oe.bx);
      this.b(cut.qS);
      this.b(cut.qT);
      this.a(cut.sb, oe.bx);
      this.a(cut.sd, oe.bx);
      this.a(cut.rd, oe.bx);
      this.a(cut.uO, oe.bx);
      this.a(cut.pY, oe.bx);
      this.a(cut.uB, oe.bx);
      this.a(cut.re, oe.bx);
      this.a(cut.rS, oe.bx);
      this.a(cut.oG, oe.bx);
      this.a(cut.oH, oe.bx);
      this.a(cut.wa, oe.bx);
      this.a(cut.rr, oe.bx);
      this.a(cut.og, oe.bx);
      this.a(cut.oh, oe.bx);
      this.a(cut.oz, oe.bx);
      this.a(cut.pj, oe.bz);
      this.a(cut.pk, oe.bz);
      this.a(cut.uI, oe.bx);
      this.a(cut.pi, oe.bz);
      this.a(cut.ph, oe.bz);
      this.a(cut.pg, oe.bz);
      this.a(cut.vn, oe.bx);
      this.a(cut.rX, oe.bx);
      this.a(cut.qR, oe.bx);
      this.a(cut.oA, oe.bx);
      this.a(cut.uw, oe.bx);
      this.a(cut.ss, oe.bx);
      this.a(cut.sf, oe.bx);
      this.a(cut.vf, oe.bx);
      this.a(cut.tW, oe.bx);
      this.a(cut.sn, oe.bx);
      this.a(cut.uu, oe.bx);
      this.a(cut.tX, oe.bx);
      this.a(cut.pW, oe.bx);
      this.a(cut.os, oe.bx);
      this.a(cut.wf, oe.bx);
      this.a(cut.vZ, oe.bx);
      this.a(cut.nO, oe.bx);
      this.a(cut.sh, oe.bx);
      this.a(cut.sl, oe.bx);
      this.a(cut.st, oe.bx);
      this.a(cut.wd, oe.bx);
      this.a(cut.wv, oe.bx);
      this.a(cut.qY, oe.bx);
      this.a(cut.rg, oe.bx);
      this.a(cut.ud, oe.bx);
      this.a(cut.oI, oe.bx);
      this.a(cut.qa, oe.bx);
      this.a(cut.oZ, oe.bz);
      this.a(cut.uk, oe.bx);
      this.a(cut.pa, oe.bz);
      this.a(cut.uH, oe.bx);
      this.a(cut.oY, oe.bz);
      this.a(cut.oX, oe.bz);
      this.a(cut.oW, oe.bz);
      this.a(cut.oJ, oe.bx);
      this.a(cut.si, oe.bx);
      this.a(cut.rp, oe.bx);
      this.a(cut.rv, oe.bx);
      this.a(cut.pu, oe.bx);
      this.a(cut.wg, oe.bx);
      this.a(cut.vV, oe.bx);
      this.a(cut.wz, oe.bx);
      this.a(cut.wC, oe.bx);
      this.a(cut.nQ, oe.bx);
      this.a(cut.rf, oe.bx);
      this.a(cut.oE, oe.bx);
      this.a(cut.pe, oe.bz);
      this.a(cut.pf, oe.bz);
      this.a(cut.uG, oe.bx);
      this.a(cut.oF, oe.bx);
      this.a(cut.vv, oe.bx);
      this.a(cut.pd, oe.bz);
      this.a(cut.pc, oe.bz);
      this.a(cut.pb, oe.bz);
      this.a(cut.uc, oe.bx);
      this.a(cut.oa, oe.bx);
      this.a(cut.ob, oe.bx);
      this.a(cut.vw, oe.bx);
      this.a(cut.oB, oe.bx);
      this.a(cut.qA, oe.bx);
      this.a(cut.qD, oe.bx);
      this.a(cut.uJ, oe.bx);
      this.a(cut.rl, oe.bx);
      this.a(cut.rq, oe.bx);
      this.a(cut.rn, oe.bx);
      this.a(cut.rk, oe.bx);
      this.a(cut.sp, oe.bx);
      this.a(cut.oi, oe.bx);
      this.a(cut.oj, oe.bx);
      this.a(cut.ok, oe.bx);
      this.a(cut.ol, oe.bx);
      this.a(cut.uj, oe.bx);
      this.a(cut.rW, oe.bx);
      this.a(cut.qE, oe.bx);
      this.a(cut.nM, oe.bx);
      this.a(cut.wc, oe.bx);
      this.a(cut.pr, oe.bx);
      this.a(cut.vR, oe.bx);
      this.a(cut.vK, oe.by);
      this.a(cut.vy, oe.by);
      this.a(cut.vA, oe.by);
      this.a(cut.vz, oe.by);
      this.a(cut.vB, oe.by);
      this.a(cut.vC, oe.by);
      this.a(cut.vD, oe.by);
      this.a(cut.vE, oe.by);
      this.a(cut.vF, oe.by);
      this.a(cut.vG, oe.by);
      this.a(cut.vP, oe.by);
      this.a(cut.vQ, oe.by);
      this.a(cut.vH, oe.by);
      this.a(cut.vI, oe.by);
      this.a(cut.vL, oe.by);
      this.a(cut.vJ, oe.by);
      this.a(cut.vM, oe.by);
      this.a(cut.vN, oe.by);
      this.a(cut.vO, oe.by);
      this.a(cut.uN, oe.bx);
      this.a(cut.uL, oe.bx);
      this.a(cut.vU, oe.bx);
      this.a(cut.po, oe.bz);
      this.a(cut.pp, oe.bz);
      this.a(cut.oK, oe.bx);
      this.a(cut.pn, oe.bz);
      this.a(cut.oL, oe.bx);
      this.a(cut.pm, oe.bz);
      this.a(cut.pl, oe.bz);
      this.a(cut.ux, oe.bx);
      this.a(cut.us, oe.bx);
      this.a(cut.nU, oe.bx);
      this.a(cut.nV, oe.bx);
      this.a(cut.rj, oe.bx);
      this.a(cut.pZ, oe.bx);
      this.a(cut.qO, oe.bx);
      this.a(cut.vT, oe.bx);
      this.a(cut.we, oe.bx);
      this.a(cut.ro, oe.bx);
      this.a(cut.ui, oe.bx);
      this.a(cut.vh, oe.bx);
      this.a(cut.pX, oe.bx);
      this.a(cut.qB, oe.bx);
      this.a(cut.uz, oe.bx);
      this.a(cut.uy, oe.bx);
      this.a(cut.rc, oe.bx);
      this.a(cut.qF, oe.bx);
      this.a(cut.ut, oe.bx);
      this.a(cut.rs, oe.bx);
      this.a(cut.oC, oe.bx);
      this.a(cut.uA, oe.bx);
      this.a(cut.uD, oe.bx);
      this.a(cut.uE, oe.bx);
      this.a(cut.uC, oe.bx);
      this.a(cut.rw, oe.bx);
      this.a(cut.se, oe.bx);
      this.a(cut.nL, oe.bx);
      this.a(cut.ra, oe.bx);
      this.a(cut.qG, oe.bx);
      this.a(cut.op, oe.bx);
      this.a(cut.rV, oe.bx);
      this.a(cut.vu, oe.bx);
      this.a(cut.wb, oe.bx);
      this.a(cut.qQ, oe.bx);
      this.a(cut.qC, oe.bx);
      this.a(cut.xt, oe.bx);
      this.a(cut.vp, oe.bx);
      this.a(cut.sm, oe.bx);
      this.a(cut.nW, oe.bx);
      this.a(cut.nX, oe.bx);
      this.a(cut.qX, oe.bx);
      this.a(cut.pq, oe.bz);
      this.a(cut.oU, oe.bz);
      this.a(cut.oV, oe.bz);
      this.a(cut.oT, oe.bz);
      this.a(cut.oS, oe.bz);
      this.a(cut.oR, oe.bz);
      this.a(cut.rA, oe.bx);
      this.a(cut.vX, oe.bx);
      this.a(cut.nP, oe.bx);
      this.a(cut.vt, oe.bx);
      this.a(cut.vS, oe.bx);
      this.a(cut.rb, oe.bx);
      this.a(cut.qI, oe.bx);
      this.a(cut.qJ, oe.bx);
      this.a(cut.qK, oe.bx);
      this.a(cut.qz, oe.bx);
      this.a(cut.pw, oe.bx);
      this.a(cut.ri, oe.bx);
      this.a(cut.tY, oe.bx);
      this.a(cut.ub, oe.bO);
      this.a(cut.or);
      this.a(cut.oP, oe.bz);
      this.a(cut.oQ, oe.bz);
      this.a(cut.oO, oe.bz);
      this.a(cut.oN, oe.bz);
      this.a(cut.oM, oe.bz);
      this.a(cut.tZ, oe.bx);
      this.a(cut.ua, oe.bx);
      this.a(cut.rm, oe.bx);
      this.a(cut.xv, oe.bx);
      this.a(cut.xw, oe.bx);
      this.a(cut.xx, oe.bx);
      this.a(cut.xy, oe.bx);
      this.a(cut.xz, oe.bx);
      this.a(cut.xA, oe.bx);
      this.a(cut.xB, oe.bx);
      this.a(cut.xC, oe.bx);
      this.a(cut.xD, oe.bx);
      this.a(cut.xE, oe.bx);
      this.a(cut.xF, oe.bx);
      this.a(cut.xG, oe.bx);
      this.a(cut.xH, oe.bx);
      this.a(cut.xI, oe.bx);
      this.a(cut.xJ, oe.bx);
      this.a(cut.xK, oe.bx);
      this.a(cut.xL, oe.bx);
      this.a(cut.xM, oe.bx);
      this.a(cut.xN, oe.bx);
      this.a(cut.vx, cut.pq, oe.bz);
      this.a(cut.qb, cut.qa, oe.bx);

      for (cul $$0 : lt.g) {
         if ($$0 instanceof csf $$1) {
            this.a($$1);
         }
      }

      this.a(cut.xO, oe.bx);
      this.a(cut.xP, oe.bx);
      this.a(cut.xQ, oe.bx);
      this.a(cut.xR, oe.bx);
      this.a(cut.xS, oe.bx);
      this.a(cut.xT, oe.bx);
      this.a(cut.xU, oe.bx);
      this.a(cut.xV, oe.bx);
      this.a(cut.xW, oe.bx);
      this.a(cut.xX, oe.bx);
      this.a(cut.xY, oe.bx);
      this.a(cut.xZ, oe.bx);
      this.a(cut.ya, oe.bx);
      this.a(cut.yb, oe.bx);
      this.a(cut.yc, oe.bx);
      this.a(cut.yd, oe.bx);
      this.a(cut.ye, oe.bx);
      this.a(cut.yf, oe.bx);
      this.a(cut.yg, oe.bx);
      this.a(cut.yh, oe.bx);
      this.a(cut.yi, oe.bx);
      this.a(cut.yj, oe.bx);
      this.a(cut.yk, oe.bx);
      this.a(cut.yC, oe.bx);
      this.a(cut.yD, oe.bx);
      this.a(cut.yF, oe.bx);
   }

   static record a(String a, float b, Map<jm<csg>, String> c) {
      public String a(jm<csg> $$0) {
         return this.c.getOrDefault($$0, this.a);
      }
   }
}
