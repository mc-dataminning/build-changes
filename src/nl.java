import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Supplier;

public class nl {
   public static final akk a = new akk("trim_type");
   private static final List<nl.a> b = List.of(
      new nl.a("quartz", 0.1F, Map.of()),
      new nl.a("iron", 0.2F, Map.of(crv.c, "iron_darker")),
      new nl.a("netherite", 0.3F, Map.of(crv.g, "netherite_darker")),
      new nl.a("redstone", 0.4F, Map.of()),
      new nl.a("copper", 0.5F, Map.of()),
      new nl.a("gold", 0.6F, Map.of(crv.d, "gold_darker")),
      new nl.a("emerald", 0.7F, Map.of()),
      new nl.a("diamond", 0.8F, Map.of(crv.e, "diamond_darker")),
      new nl.a("lapis", 0.9F, Map.of()),
      new nl.a("amethyst", 1.0F, Map.of())
   );
   private final BiConsumer<akk, Supplier<JsonElement>> c;

   public nl(BiConsumer<akk, Supplier<JsonElement>> $$0) {
      this.c = $$0;
   }

   private void a(cty $$0, nz $$1) {
      $$1.a(ny.a($$0), ob.b($$0), this.c);
   }

   private void a(cty $$0, String $$1, nz $$2) {
      $$2.a(ny.a($$0, $$1), ob.k(ob.a($$0, $$1)), this.c);
   }

   private void a(cty $$0, cty $$1, nz $$2) {
      $$2.a(ny.a($$0), ob.b($$1), this.c);
   }

   private void a(cty $$0) {
      this.a(ny.a($$0), ob.c($$0), ob.a($$0, "_overlay"));
   }

   private void b(cty $$0) {
      for (int $$1 = 0; $$1 < 32; $$1++) {
         if ($$1 != 16) {
            this.a($$0, String.format(Locale.ROOT, "_%02d", $$1), oa.bx);
         }
      }
   }

   private void c(cty $$0) {
      for (int $$1 = 1; $$1 < 64; $$1++) {
         this.a($$0, String.format(Locale.ROOT, "_%02d", $$1), oa.bx);
      }
   }

   private void a(akk $$0, akk $$1, akk $$2) {
      oa.bB.a($$0, ob.c($$1, $$2), this.c);
   }

   private void a(akk $$0, akk $$1, akk $$2, akk $$3) {
      oa.bC.a($$0, ob.a($$1, $$2, $$3), this.c);
   }

   private akk a(akk $$0, String $$1) {
      return $$0.e("_" + $$1 + "_trim");
   }

   private JsonObject a(akk $$0, Map<oc, akk> $$1, jj<cru> $$2) {
      JsonObject $$3 = oa.bB.a($$0, $$1);
      JsonArray $$4 = new JsonArray();

      for (nl.a $$5 : b) {
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

   private void a(crt $$0) {
      if ($$0.f().d()) {
         akk $$1 = ny.a($$0);
         akk $$2 = ob.c($$0);
         akk $$3 = ob.a($$0, "_overlay");
         if ($$0.h().a(crv.a)) {
            oa.bB.a($$1, ob.c($$2, $$3), this.c, ($$1x, $$2x) -> this.a($$1x, $$2x, $$0.h()));
         } else {
            oa.bx.a($$1, ob.k($$2), this.c, ($$1x, $$2x) -> this.a($$1x, $$2x, $$0.h()));
         }

         for (nl.a $$4 : b) {
            String $$5 = $$4.a($$0.h());
            akk $$6 = this.a($$1, $$5);
            String $$7 = $$0.f().b() + "_trim_" + $$5;
            akk $$8 = new akk($$7).d("trims/items/");
            if ($$0.h().a(crv.a)) {
               this.a($$6, $$2, $$3, $$8);
            } else {
               this.a($$6, $$2, $$8);
            }
         }
      }
   }

   public void a() {
      this.a(cug.oc, oa.bx);
      this.a(cug.oe, oa.bx);
      this.a(cug.od, oa.bx);
      this.a(cug.of, oa.bx);
      this.a(cug.oD, oa.bx);
      this.a(cug.ou, oa.bx);
      this.a(cug.oq, oa.bx);
      this.a(cug.uF, oa.bx);
      this.a(cug.ow, oa.bx);
      this.a(cug.uh, oa.bx);
      this.a(cug.dR, oa.bz);
      this.a(cug.sa, oa.bx);
      this.a(cug.vk, oa.bx);
      this.a(cug.vm, oa.bx);
      this.a(cug.nY, oa.bx);
      this.a(cug.nZ, oa.bx);
      this.a(cug.rx, oa.bx);
      this.a(cug.so, oa.bx);
      this.a(cug.sg, oa.bz);
      this.a(cug.rt, oa.bx);
      this.a(cug.ry, oa.bx);
      this.a(cug.qP, oa.bx);
      this.a(cug.ot, oa.bx);
      this.a(cug.px, oa.bx);
      this.a(cug.qL, oa.bx);
      this.a(cug.yG, oa.bx);
      this.a(cug.ru, oa.bx);
      this.a(cug.qy, oa.bx);
      this.a(cug.nR, oa.bA);
      this.a(cug.nS, oa.bA);
      this.a(cug.oy, oa.bx);
      this.a(cug.nN, oa.bx);
      this.a(cug.sc, oa.bx);
      this.a(cug.vg, oa.bx);
      this.a(cug.qM, oa.bx);
      this.c(cug.qW);
      this.a(cug.ox, oa.bx);
      this.a(cug.qH, oa.bx);
      this.a(cug.uM, oa.bx);
      this.b(cug.qS);
      this.b(cug.qT);
      this.a(cug.sb, oa.bx);
      this.a(cug.sd, oa.bx);
      this.a(cug.rd, oa.bx);
      this.a(cug.uO, oa.bx);
      this.a(cug.pY, oa.bx);
      this.a(cug.uB, oa.bx);
      this.a(cug.re, oa.bx);
      this.a(cug.rS, oa.bx);
      this.a(cug.oG, oa.bx);
      this.a(cug.oH, oa.bx);
      this.a(cug.wa, oa.bx);
      this.a(cug.rr, oa.bx);
      this.a(cug.og, oa.bx);
      this.a(cug.oh, oa.bx);
      this.a(cug.oz, oa.bx);
      this.a(cug.pj, oa.bz);
      this.a(cug.pk, oa.bz);
      this.a(cug.uI, oa.bx);
      this.a(cug.pi, oa.bz);
      this.a(cug.ph, oa.bz);
      this.a(cug.pg, oa.bz);
      this.a(cug.vn, oa.bx);
      this.a(cug.rX, oa.bx);
      this.a(cug.qR, oa.bx);
      this.a(cug.oA, oa.bx);
      this.a(cug.uw, oa.bx);
      this.a(cug.ss, oa.bx);
      this.a(cug.sf, oa.bx);
      this.a(cug.vf, oa.bx);
      this.a(cug.tW, oa.bx);
      this.a(cug.sn, oa.bx);
      this.a(cug.uu, oa.bx);
      this.a(cug.tX, oa.bx);
      this.a(cug.pW, oa.bx);
      this.a(cug.os, oa.bx);
      this.a(cug.wf, oa.bx);
      this.a(cug.vZ, oa.bx);
      this.a(cug.nO, oa.bx);
      this.a(cug.sh, oa.bx);
      this.a(cug.sl, oa.bx);
      this.a(cug.st, oa.bx);
      this.a(cug.wd, oa.bx);
      this.a(cug.wv, oa.bx);
      this.a(cug.qY, oa.bx);
      this.a(cug.rg, oa.bx);
      this.a(cug.ud, oa.bx);
      this.a(cug.oI, oa.bx);
      this.a(cug.qa, oa.bx);
      this.a(cug.oZ, oa.bz);
      this.a(cug.uk, oa.bx);
      this.a(cug.pa, oa.bz);
      this.a(cug.uH, oa.bx);
      this.a(cug.oY, oa.bz);
      this.a(cug.oX, oa.bz);
      this.a(cug.oW, oa.bz);
      this.a(cug.oJ, oa.bx);
      this.a(cug.si, oa.bx);
      this.a(cug.rp, oa.bx);
      this.a(cug.rv, oa.bx);
      this.a(cug.pu, oa.bx);
      this.a(cug.wg, oa.bx);
      this.a(cug.vV, oa.bx);
      this.a(cug.wz, oa.bx);
      this.a(cug.wC, oa.bx);
      this.a(cug.nQ, oa.bx);
      this.a(cug.rf, oa.bx);
      this.a(cug.oE, oa.bx);
      this.a(cug.pe, oa.bz);
      this.a(cug.pf, oa.bz);
      this.a(cug.uG, oa.bx);
      this.a(cug.oF, oa.bx);
      this.a(cug.vv, oa.bx);
      this.a(cug.pd, oa.bz);
      this.a(cug.pc, oa.bz);
      this.a(cug.pb, oa.bz);
      this.a(cug.uc, oa.bx);
      this.a(cug.oa, oa.bx);
      this.a(cug.ob, oa.bx);
      this.a(cug.vw, oa.bx);
      this.a(cug.oB, oa.bx);
      this.a(cug.qA, oa.bx);
      this.a(cug.qD, oa.bx);
      this.a(cug.uJ, oa.bx);
      this.a(cug.rl, oa.bx);
      this.a(cug.rq, oa.bx);
      this.a(cug.rn, oa.bx);
      this.a(cug.rk, oa.bx);
      this.a(cug.sp, oa.bx);
      this.a(cug.oi, oa.bx);
      this.a(cug.oj, oa.bx);
      this.a(cug.ok, oa.bx);
      this.a(cug.ol, oa.bx);
      this.a(cug.uj, oa.bx);
      this.a(cug.rW, oa.bx);
      this.a(cug.qE, oa.bx);
      this.a(cug.nM, oa.bx);
      this.a(cug.wc, oa.bx);
      this.a(cug.pr, oa.bx);
      this.a(cug.vR, oa.bx);
      this.a(cug.vK, oa.by);
      this.a(cug.vy, oa.by);
      this.a(cug.vA, oa.by);
      this.a(cug.vz, oa.by);
      this.a(cug.vB, oa.by);
      this.a(cug.vC, oa.by);
      this.a(cug.vD, oa.by);
      this.a(cug.vE, oa.by);
      this.a(cug.vF, oa.by);
      this.a(cug.vG, oa.by);
      this.a(cug.vP, oa.by);
      this.a(cug.vQ, oa.by);
      this.a(cug.vH, oa.by);
      this.a(cug.vI, oa.by);
      this.a(cug.vL, oa.by);
      this.a(cug.vJ, oa.by);
      this.a(cug.vM, oa.by);
      this.a(cug.vN, oa.by);
      this.a(cug.vO, oa.by);
      this.a(cug.uN, oa.bx);
      this.a(cug.uL, oa.bx);
      this.a(cug.vU, oa.bx);
      this.a(cug.po, oa.bz);
      this.a(cug.pp, oa.bz);
      this.a(cug.oK, oa.bx);
      this.a(cug.pn, oa.bz);
      this.a(cug.oL, oa.bx);
      this.a(cug.pm, oa.bz);
      this.a(cug.pl, oa.bz);
      this.a(cug.ux, oa.bx);
      this.a(cug.us, oa.bx);
      this.a(cug.nU, oa.bx);
      this.a(cug.nV, oa.bx);
      this.a(cug.rj, oa.bx);
      this.a(cug.pZ, oa.bx);
      this.a(cug.qO, oa.bx);
      this.a(cug.vT, oa.bx);
      this.a(cug.we, oa.bx);
      this.a(cug.ro, oa.bx);
      this.a(cug.ui, oa.bx);
      this.a(cug.vh, oa.bx);
      this.a(cug.pX, oa.bx);
      this.a(cug.qB, oa.bx);
      this.a(cug.uz, oa.bx);
      this.a(cug.uy, oa.bx);
      this.a(cug.rc, oa.bx);
      this.a(cug.qF, oa.bx);
      this.a(cug.ut, oa.bx);
      this.a(cug.rs, oa.bx);
      this.a(cug.oC, oa.bx);
      this.a(cug.uA, oa.bx);
      this.a(cug.uD, oa.bx);
      this.a(cug.uE, oa.bx);
      this.a(cug.uC, oa.bx);
      this.a(cug.rw, oa.bx);
      this.a(cug.se, oa.bx);
      this.a(cug.nL, oa.bx);
      this.a(cug.ra, oa.bx);
      this.a(cug.qG, oa.bx);
      this.a(cug.op, oa.bx);
      this.a(cug.rV, oa.bx);
      this.a(cug.vu, oa.bx);
      this.a(cug.wb, oa.bx);
      this.a(cug.qQ, oa.bx);
      this.a(cug.qC, oa.bx);
      this.a(cug.xt, oa.bx);
      this.a(cug.vp, oa.bx);
      this.a(cug.sm, oa.bx);
      this.a(cug.nW, oa.bx);
      this.a(cug.nX, oa.bx);
      this.a(cug.qX, oa.bx);
      this.a(cug.pq, oa.bz);
      this.a(cug.oU, oa.bz);
      this.a(cug.oV, oa.bz);
      this.a(cug.oT, oa.bz);
      this.a(cug.oS, oa.bz);
      this.a(cug.oR, oa.bz);
      this.a(cug.rA, oa.bx);
      this.a(cug.vX, oa.bx);
      this.a(cug.nP, oa.bx);
      this.a(cug.vt, oa.bx);
      this.a(cug.vS, oa.bx);
      this.a(cug.rb, oa.bx);
      this.a(cug.qI, oa.bx);
      this.a(cug.qJ, oa.bx);
      this.a(cug.qK, oa.bx);
      this.a(cug.qz, oa.bx);
      this.a(cug.pw, oa.bx);
      this.a(cug.ri, oa.bx);
      this.a(cug.tY, oa.bx);
      this.a(cug.ub, oa.bO);
      this.a(cug.or);
      this.a(cug.oP, oa.bz);
      this.a(cug.oQ, oa.bz);
      this.a(cug.oO, oa.bz);
      this.a(cug.oN, oa.bz);
      this.a(cug.oM, oa.bz);
      this.a(cug.tZ, oa.bx);
      this.a(cug.ua, oa.bx);
      this.a(cug.rm, oa.bx);
      this.a(cug.xv, oa.bx);
      this.a(cug.xw, oa.bx);
      this.a(cug.xx, oa.bx);
      this.a(cug.xy, oa.bx);
      this.a(cug.xz, oa.bx);
      this.a(cug.xA, oa.bx);
      this.a(cug.xB, oa.bx);
      this.a(cug.xC, oa.bx);
      this.a(cug.xD, oa.bx);
      this.a(cug.xE, oa.bx);
      this.a(cug.xF, oa.bx);
      this.a(cug.xG, oa.bx);
      this.a(cug.xH, oa.bx);
      this.a(cug.xI, oa.bx);
      this.a(cug.xJ, oa.bx);
      this.a(cug.xK, oa.bx);
      this.a(cug.xL, oa.bx);
      this.a(cug.xM, oa.bx);
      this.a(cug.xN, oa.bx);
      this.a(cug.vx, cug.pq, oa.bz);
      this.a(cug.qb, cug.qa, oa.bx);

      for (cty $$0 : lq.g) {
         if ($$0 instanceof crt $$1) {
            this.a($$1);
         }
      }

      this.a(cug.xO, oa.bx);
      this.a(cug.xP, oa.bx);
      this.a(cug.xQ, oa.bx);
      this.a(cug.xR, oa.bx);
      this.a(cug.xS, oa.bx);
      this.a(cug.xT, oa.bx);
      this.a(cug.xU, oa.bx);
      this.a(cug.xV, oa.bx);
      this.a(cug.xW, oa.bx);
      this.a(cug.xX, oa.bx);
      this.a(cug.xY, oa.bx);
      this.a(cug.xZ, oa.bx);
      this.a(cug.ya, oa.bx);
      this.a(cug.yb, oa.bx);
      this.a(cug.yc, oa.bx);
      this.a(cug.yd, oa.bx);
      this.a(cug.ye, oa.bx);
      this.a(cug.yf, oa.bx);
      this.a(cug.yg, oa.bx);
      this.a(cug.yh, oa.bx);
      this.a(cug.yi, oa.bx);
      this.a(cug.yj, oa.bx);
      this.a(cug.yk, oa.bx);
      this.a(cug.yC, oa.bx);
      this.a(cug.yD, oa.bx);
      this.a(cug.yF, oa.bx);
   }

   static record a(String a, float b, Map<jj<cru>, String> c) {
      public String a(jj<cru> $$0) {
         return this.c.getOrDefault($$0, this.a);
      }
   }
}
