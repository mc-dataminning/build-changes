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
      new nl.a("iron", 0.2F, Map.of(crr.c, "iron_darker")),
      new nl.a("netherite", 0.3F, Map.of(crr.g, "netherite_darker")),
      new nl.a("redstone", 0.4F, Map.of()),
      new nl.a("copper", 0.5F, Map.of()),
      new nl.a("gold", 0.6F, Map.of(crr.d, "gold_darker")),
      new nl.a("emerald", 0.7F, Map.of()),
      new nl.a("diamond", 0.8F, Map.of(crr.e, "diamond_darker")),
      new nl.a("lapis", 0.9F, Map.of()),
      new nl.a("amethyst", 1.0F, Map.of())
   );
   private final BiConsumer<akk, Supplier<JsonElement>> c;

   public nl(BiConsumer<akk, Supplier<JsonElement>> $$0) {
      this.c = $$0;
   }

   private void a(ctv $$0, nz $$1) {
      $$1.a(ny.a($$0), ob.b($$0), this.c);
   }

   private void a(ctv $$0, String $$1, nz $$2) {
      $$2.a(ny.a($$0, $$1), ob.k(ob.a($$0, $$1)), this.c);
   }

   private void a(ctv $$0, ctv $$1, nz $$2) {
      $$2.a(ny.a($$0), ob.b($$1), this.c);
   }

   private void a(ctv $$0) {
      this.a(ny.a($$0), ob.c($$0), ob.a($$0, "_overlay"));
   }

   private void b(ctv $$0) {
      for (int $$1 = 0; $$1 < 32; $$1++) {
         if ($$1 != 16) {
            this.a($$0, String.format(Locale.ROOT, "_%02d", $$1), oa.bx);
         }
      }
   }

   private void c(ctv $$0) {
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

   private JsonObject a(akk $$0, Map<oc, akk> $$1, jj<crq> $$2) {
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

   private void a(crp $$0) {
      if ($$0.f().d()) {
         akk $$1 = ny.a($$0);
         akk $$2 = ob.c($$0);
         akk $$3 = ob.a($$0, "_overlay");
         if ($$0.h().a(crr.a)) {
            oa.bB.a($$1, ob.c($$2, $$3), this.c, ($$1x, $$2x) -> this.a($$1x, $$2x, $$0.h()));
         } else {
            oa.bx.a($$1, ob.k($$2), this.c, ($$1x, $$2x) -> this.a($$1x, $$2x, $$0.h()));
         }

         for (nl.a $$4 : b) {
            String $$5 = $$4.a($$0.h());
            akk $$6 = this.a($$1, $$5);
            String $$7 = $$0.f().b() + "_trim_" + $$5;
            akk $$8 = new akk($$7).d("trims/items/");
            if ($$0.h().a(crr.a)) {
               this.a($$6, $$2, $$3, $$8);
            } else {
               this.a($$6, $$2, $$8);
            }
         }
      }
   }

   public void a() {
      this.a(cud.oc, oa.bx);
      this.a(cud.oe, oa.bx);
      this.a(cud.od, oa.bx);
      this.a(cud.of, oa.bx);
      this.a(cud.oC, oa.bx);
      this.a(cud.ot, oa.bx);
      this.a(cud.oq, oa.bx);
      this.a(cud.uF, oa.bx);
      this.a(cud.ov, oa.bx);
      this.a(cud.uh, oa.bx);
      this.a(cud.dR, oa.bz);
      this.a(cud.sa, oa.bx);
      this.a(cud.vk, oa.bx);
      this.a(cud.vm, oa.bx);
      this.a(cud.nY, oa.bx);
      this.a(cud.nZ, oa.bx);
      this.a(cud.rx, oa.bx);
      this.a(cud.so, oa.bx);
      this.a(cud.sg, oa.bz);
      this.a(cud.rt, oa.bx);
      this.a(cud.ry, oa.bx);
      this.a(cud.qP, oa.bx);
      this.a(cud.pq, oa.bx);
      this.a(cud.px, oa.bx);
      this.a(cud.qL, oa.bx);
      this.a(cud.yG, oa.bx);
      this.a(cud.ru, oa.bx);
      this.a(cud.qy, oa.bx);
      this.a(cud.nR, oa.bA);
      this.a(cud.nS, oa.bA);
      this.a(cud.ox, oa.bx);
      this.a(cud.nN, oa.bx);
      this.a(cud.sc, oa.bx);
      this.a(cud.vg, oa.bx);
      this.a(cud.qM, oa.bx);
      this.c(cud.qW);
      this.a(cud.ow, oa.bx);
      this.a(cud.qH, oa.bx);
      this.a(cud.uM, oa.bx);
      this.b(cud.qS);
      this.b(cud.qT);
      this.a(cud.sb, oa.bx);
      this.a(cud.sd, oa.bx);
      this.a(cud.rd, oa.bx);
      this.a(cud.uO, oa.bx);
      this.a(cud.pY, oa.bx);
      this.a(cud.uB, oa.bx);
      this.a(cud.re, oa.bx);
      this.a(cud.rS, oa.bx);
      this.a(cud.oF, oa.bx);
      this.a(cud.oG, oa.bx);
      this.a(cud.wa, oa.bx);
      this.a(cud.rr, oa.bx);
      this.a(cud.og, oa.bx);
      this.a(cud.oh, oa.bx);
      this.a(cud.oy, oa.bx);
      this.a(cud.pi, oa.bz);
      this.a(cud.pj, oa.bz);
      this.a(cud.uI, oa.bx);
      this.a(cud.ph, oa.bz);
      this.a(cud.pg, oa.bz);
      this.a(cud.pf, oa.bz);
      this.a(cud.vn, oa.bx);
      this.a(cud.rX, oa.bx);
      this.a(cud.qR, oa.bx);
      this.a(cud.oz, oa.bx);
      this.a(cud.uw, oa.bx);
      this.a(cud.ss, oa.bx);
      this.a(cud.sf, oa.bx);
      this.a(cud.vf, oa.bx);
      this.a(cud.tW, oa.bx);
      this.a(cud.sn, oa.bx);
      this.a(cud.uu, oa.bx);
      this.a(cud.tX, oa.bx);
      this.a(cud.pW, oa.bx);
      this.a(cud.os, oa.bx);
      this.a(cud.wf, oa.bx);
      this.a(cud.vZ, oa.bx);
      this.a(cud.nO, oa.bx);
      this.a(cud.sh, oa.bx);
      this.a(cud.sl, oa.bx);
      this.a(cud.st, oa.bx);
      this.a(cud.wd, oa.bx);
      this.a(cud.wv, oa.bx);
      this.a(cud.qY, oa.bx);
      this.a(cud.rg, oa.bx);
      this.a(cud.ud, oa.bx);
      this.a(cud.oH, oa.bx);
      this.a(cud.qa, oa.bx);
      this.a(cud.oY, oa.bz);
      this.a(cud.uk, oa.bx);
      this.a(cud.oZ, oa.bz);
      this.a(cud.uH, oa.bx);
      this.a(cud.oX, oa.bz);
      this.a(cud.oW, oa.bz);
      this.a(cud.oV, oa.bz);
      this.a(cud.oI, oa.bx);
      this.a(cud.si, oa.bx);
      this.a(cud.rp, oa.bx);
      this.a(cud.rv, oa.bx);
      this.a(cud.pu, oa.bx);
      this.a(cud.wg, oa.bx);
      this.a(cud.vV, oa.bx);
      this.a(cud.wz, oa.bx);
      this.a(cud.wC, oa.bx);
      this.a(cud.nQ, oa.bx);
      this.a(cud.rf, oa.bx);
      this.a(cud.oD, oa.bx);
      this.a(cud.pd, oa.bz);
      this.a(cud.pe, oa.bz);
      this.a(cud.uG, oa.bx);
      this.a(cud.oE, oa.bx);
      this.a(cud.vv, oa.bx);
      this.a(cud.pc, oa.bz);
      this.a(cud.pb, oa.bz);
      this.a(cud.pa, oa.bz);
      this.a(cud.uc, oa.bx);
      this.a(cud.oa, oa.bx);
      this.a(cud.ob, oa.bx);
      this.a(cud.vw, oa.bx);
      this.a(cud.oA, oa.bx);
      this.a(cud.qA, oa.bx);
      this.a(cud.qD, oa.bx);
      this.a(cud.uJ, oa.bx);
      this.a(cud.rl, oa.bx);
      this.a(cud.rq, oa.bx);
      this.a(cud.rn, oa.bx);
      this.a(cud.rk, oa.bx);
      this.a(cud.sp, oa.bx);
      this.a(cud.oi, oa.bx);
      this.a(cud.oj, oa.bx);
      this.a(cud.ok, oa.bx);
      this.a(cud.ol, oa.bx);
      this.a(cud.uj, oa.bx);
      this.a(cud.rW, oa.bx);
      this.a(cud.qE, oa.bx);
      this.a(cud.nM, oa.bx);
      this.a(cud.wc, oa.bx);
      this.a(cud.pr, oa.bx);
      this.a(cud.vR, oa.bx);
      this.a(cud.vK, oa.by);
      this.a(cud.vy, oa.by);
      this.a(cud.vA, oa.by);
      this.a(cud.vz, oa.by);
      this.a(cud.vB, oa.by);
      this.a(cud.vC, oa.by);
      this.a(cud.vD, oa.by);
      this.a(cud.vE, oa.by);
      this.a(cud.vF, oa.by);
      this.a(cud.vG, oa.by);
      this.a(cud.vP, oa.by);
      this.a(cud.vQ, oa.by);
      this.a(cud.vH, oa.by);
      this.a(cud.vI, oa.by);
      this.a(cud.vL, oa.by);
      this.a(cud.vJ, oa.by);
      this.a(cud.vM, oa.by);
      this.a(cud.vN, oa.by);
      this.a(cud.vO, oa.by);
      this.a(cud.uN, oa.bx);
      this.a(cud.uL, oa.bx);
      this.a(cud.vU, oa.bx);
      this.a(cud.pn, oa.bz);
      this.a(cud.po, oa.bz);
      this.a(cud.oJ, oa.bx);
      this.a(cud.pm, oa.bz);
      this.a(cud.oK, oa.bx);
      this.a(cud.pl, oa.bz);
      this.a(cud.pk, oa.bz);
      this.a(cud.ux, oa.bx);
      this.a(cud.us, oa.bx);
      this.a(cud.nU, oa.bx);
      this.a(cud.nV, oa.bx);
      this.a(cud.rj, oa.bx);
      this.a(cud.pZ, oa.bx);
      this.a(cud.qO, oa.bx);
      this.a(cud.vT, oa.bx);
      this.a(cud.we, oa.bx);
      this.a(cud.ro, oa.bx);
      this.a(cud.ui, oa.bx);
      this.a(cud.vh, oa.bx);
      this.a(cud.pX, oa.bx);
      this.a(cud.qB, oa.bx);
      this.a(cud.uz, oa.bx);
      this.a(cud.uy, oa.bx);
      this.a(cud.rc, oa.bx);
      this.a(cud.qF, oa.bx);
      this.a(cud.ut, oa.bx);
      this.a(cud.rs, oa.bx);
      this.a(cud.oB, oa.bx);
      this.a(cud.uA, oa.bx);
      this.a(cud.uD, oa.bx);
      this.a(cud.uE, oa.bx);
      this.a(cud.uC, oa.bx);
      this.a(cud.rw, oa.bx);
      this.a(cud.se, oa.bx);
      this.a(cud.nL, oa.bx);
      this.a(cud.ra, oa.bx);
      this.a(cud.qG, oa.bx);
      this.a(cud.op, oa.bx);
      this.a(cud.rV, oa.bx);
      this.a(cud.vu, oa.bx);
      this.a(cud.wb, oa.bx);
      this.a(cud.qQ, oa.bx);
      this.a(cud.qC, oa.bx);
      this.a(cud.xt, oa.bx);
      this.a(cud.vp, oa.bx);
      this.a(cud.sm, oa.bx);
      this.a(cud.nW, oa.bx);
      this.a(cud.nX, oa.bx);
      this.a(cud.qX, oa.bx);
      this.a(cud.pp, oa.bz);
      this.a(cud.oT, oa.bz);
      this.a(cud.oU, oa.bz);
      this.a(cud.oS, oa.bz);
      this.a(cud.oR, oa.bz);
      this.a(cud.oQ, oa.bz);
      this.a(cud.rA, oa.bx);
      this.a(cud.vX, oa.bx);
      this.a(cud.nP, oa.bx);
      this.a(cud.vt, oa.bx);
      this.a(cud.vS, oa.bx);
      this.a(cud.rb, oa.bx);
      this.a(cud.qI, oa.bx);
      this.a(cud.qJ, oa.bx);
      this.a(cud.qK, oa.bx);
      this.a(cud.qz, oa.bx);
      this.a(cud.pw, oa.bx);
      this.a(cud.ri, oa.bx);
      this.a(cud.tY, oa.bx);
      this.a(cud.ub, oa.bO);
      this.a(cud.or);
      this.a(cud.oO, oa.bz);
      this.a(cud.oP, oa.bz);
      this.a(cud.oN, oa.bz);
      this.a(cud.oM, oa.bz);
      this.a(cud.oL, oa.bz);
      this.a(cud.tZ, oa.bx);
      this.a(cud.ua, oa.bx);
      this.a(cud.rm, oa.bx);
      this.a(cud.xv, oa.bx);
      this.a(cud.xw, oa.bx);
      this.a(cud.xx, oa.bx);
      this.a(cud.xy, oa.bx);
      this.a(cud.xz, oa.bx);
      this.a(cud.xA, oa.bx);
      this.a(cud.xB, oa.bx);
      this.a(cud.xC, oa.bx);
      this.a(cud.xD, oa.bx);
      this.a(cud.xE, oa.bx);
      this.a(cud.xF, oa.bx);
      this.a(cud.xG, oa.bx);
      this.a(cud.xH, oa.bx);
      this.a(cud.xI, oa.bx);
      this.a(cud.xJ, oa.bx);
      this.a(cud.xK, oa.bx);
      this.a(cud.xL, oa.bx);
      this.a(cud.xM, oa.bx);
      this.a(cud.xN, oa.bx);
      this.a(cud.vx, cud.pp, oa.bz);
      this.a(cud.qb, cud.qa, oa.bx);

      for (ctv $$0 : lq.g) {
         if ($$0 instanceof crp $$1) {
            this.a($$1);
         }
      }

      this.a(cud.xO, oa.bx);
      this.a(cud.xP, oa.bx);
      this.a(cud.xQ, oa.bx);
      this.a(cud.xR, oa.bx);
      this.a(cud.xS, oa.bx);
      this.a(cud.xT, oa.bx);
      this.a(cud.xU, oa.bx);
      this.a(cud.xV, oa.bx);
      this.a(cud.xW, oa.bx);
      this.a(cud.xX, oa.bx);
      this.a(cud.xY, oa.bx);
      this.a(cud.xZ, oa.bx);
      this.a(cud.ya, oa.bx);
      this.a(cud.yb, oa.bx);
      this.a(cud.yc, oa.bx);
      this.a(cud.yd, oa.bx);
      this.a(cud.ye, oa.bx);
      this.a(cud.yf, oa.bx);
      this.a(cud.yg, oa.bx);
      this.a(cud.yh, oa.bx);
      this.a(cud.yi, oa.bx);
      this.a(cud.yj, oa.bx);
      this.a(cud.yk, oa.bx);
      this.a(cud.yC, oa.bx);
      this.a(cud.yD, oa.bx);
      this.a(cud.yF, oa.bx);
   }

   static record a(String a, float b, Map<jj<crq>, String> c) {
      public String a(jj<crq> $$0) {
         return this.c.getOrDefault($$0, this.a);
      }
   }
}
