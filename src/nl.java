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
      new nl.a("iron", 0.2F, Map.of(cru.c, "iron_darker")),
      new nl.a("netherite", 0.3F, Map.of(cru.g, "netherite_darker")),
      new nl.a("redstone", 0.4F, Map.of()),
      new nl.a("copper", 0.5F, Map.of()),
      new nl.a("gold", 0.6F, Map.of(cru.d, "gold_darker")),
      new nl.a("emerald", 0.7F, Map.of()),
      new nl.a("diamond", 0.8F, Map.of(cru.e, "diamond_darker")),
      new nl.a("lapis", 0.9F, Map.of()),
      new nl.a("amethyst", 1.0F, Map.of())
   );
   private final BiConsumer<akk, Supplier<JsonElement>> c;

   public nl(BiConsumer<akk, Supplier<JsonElement>> $$0) {
      this.c = $$0;
   }

   private void a(ctx $$0, nz $$1) {
      $$1.a(ny.a($$0), ob.b($$0), this.c);
   }

   private void a(ctx $$0, String $$1, nz $$2) {
      $$2.a(ny.a($$0, $$1), ob.k(ob.a($$0, $$1)), this.c);
   }

   private void a(ctx $$0, ctx $$1, nz $$2) {
      $$2.a(ny.a($$0), ob.b($$1), this.c);
   }

   private void a(ctx $$0) {
      this.a(ny.a($$0), ob.c($$0), ob.a($$0, "_overlay"));
   }

   private void b(ctx $$0) {
      for (int $$1 = 0; $$1 < 32; $$1++) {
         if ($$1 != 16) {
            this.a($$0, String.format(Locale.ROOT, "_%02d", $$1), oa.bx);
         }
      }
   }

   private void c(ctx $$0) {
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

   private JsonObject a(akk $$0, Map<oc, akk> $$1, jj<crt> $$2) {
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

   private void a(crs $$0) {
      if ($$0.f().d()) {
         akk $$1 = ny.a($$0);
         akk $$2 = ob.c($$0);
         akk $$3 = ob.a($$0, "_overlay");
         if ($$0.h().a(cru.a)) {
            oa.bB.a($$1, ob.c($$2, $$3), this.c, ($$1x, $$2x) -> this.a($$1x, $$2x, $$0.h()));
         } else {
            oa.bx.a($$1, ob.k($$2), this.c, ($$1x, $$2x) -> this.a($$1x, $$2x, $$0.h()));
         }

         for (nl.a $$4 : b) {
            String $$5 = $$4.a($$0.h());
            akk $$6 = this.a($$1, $$5);
            String $$7 = $$0.f().b() + "_trim_" + $$5;
            akk $$8 = new akk($$7).d("trims/items/");
            if ($$0.h().a(cru.a)) {
               this.a($$6, $$2, $$3, $$8);
            } else {
               this.a($$6, $$2, $$8);
            }
         }
      }
   }

   public void a() {
      this.a(cuf.oc, oa.bx);
      this.a(cuf.oe, oa.bx);
      this.a(cuf.od, oa.bx);
      this.a(cuf.of, oa.bx);
      this.a(cuf.oD, oa.bx);
      this.a(cuf.ou, oa.bx);
      this.a(cuf.oq, oa.bx);
      this.a(cuf.uF, oa.bx);
      this.a(cuf.ow, oa.bx);
      this.a(cuf.uh, oa.bx);
      this.a(cuf.dR, oa.bz);
      this.a(cuf.sa, oa.bx);
      this.a(cuf.vk, oa.bx);
      this.a(cuf.vm, oa.bx);
      this.a(cuf.nY, oa.bx);
      this.a(cuf.nZ, oa.bx);
      this.a(cuf.rx, oa.bx);
      this.a(cuf.so, oa.bx);
      this.a(cuf.sg, oa.bz);
      this.a(cuf.rt, oa.bx);
      this.a(cuf.ry, oa.bx);
      this.a(cuf.qP, oa.bx);
      this.a(cuf.ot, oa.bx);
      this.a(cuf.px, oa.bx);
      this.a(cuf.qL, oa.bx);
      this.a(cuf.yG, oa.bx);
      this.a(cuf.ru, oa.bx);
      this.a(cuf.qy, oa.bx);
      this.a(cuf.nR, oa.bA);
      this.a(cuf.nS, oa.bA);
      this.a(cuf.oy, oa.bx);
      this.a(cuf.nN, oa.bx);
      this.a(cuf.sc, oa.bx);
      this.a(cuf.vg, oa.bx);
      this.a(cuf.qM, oa.bx);
      this.c(cuf.qW);
      this.a(cuf.ox, oa.bx);
      this.a(cuf.qH, oa.bx);
      this.a(cuf.uM, oa.bx);
      this.b(cuf.qS);
      this.b(cuf.qT);
      this.a(cuf.sb, oa.bx);
      this.a(cuf.sd, oa.bx);
      this.a(cuf.rd, oa.bx);
      this.a(cuf.uO, oa.bx);
      this.a(cuf.pY, oa.bx);
      this.a(cuf.uB, oa.bx);
      this.a(cuf.re, oa.bx);
      this.a(cuf.rS, oa.bx);
      this.a(cuf.oG, oa.bx);
      this.a(cuf.oH, oa.bx);
      this.a(cuf.wa, oa.bx);
      this.a(cuf.rr, oa.bx);
      this.a(cuf.og, oa.bx);
      this.a(cuf.oh, oa.bx);
      this.a(cuf.oz, oa.bx);
      this.a(cuf.pj, oa.bz);
      this.a(cuf.pk, oa.bz);
      this.a(cuf.uI, oa.bx);
      this.a(cuf.pi, oa.bz);
      this.a(cuf.ph, oa.bz);
      this.a(cuf.pg, oa.bz);
      this.a(cuf.vn, oa.bx);
      this.a(cuf.rX, oa.bx);
      this.a(cuf.qR, oa.bx);
      this.a(cuf.oA, oa.bx);
      this.a(cuf.uw, oa.bx);
      this.a(cuf.ss, oa.bx);
      this.a(cuf.sf, oa.bx);
      this.a(cuf.vf, oa.bx);
      this.a(cuf.tW, oa.bx);
      this.a(cuf.sn, oa.bx);
      this.a(cuf.uu, oa.bx);
      this.a(cuf.tX, oa.bx);
      this.a(cuf.pW, oa.bx);
      this.a(cuf.os, oa.bx);
      this.a(cuf.wf, oa.bx);
      this.a(cuf.vZ, oa.bx);
      this.a(cuf.nO, oa.bx);
      this.a(cuf.sh, oa.bx);
      this.a(cuf.sl, oa.bx);
      this.a(cuf.st, oa.bx);
      this.a(cuf.wd, oa.bx);
      this.a(cuf.wv, oa.bx);
      this.a(cuf.qY, oa.bx);
      this.a(cuf.rg, oa.bx);
      this.a(cuf.ud, oa.bx);
      this.a(cuf.oI, oa.bx);
      this.a(cuf.qa, oa.bx);
      this.a(cuf.oZ, oa.bz);
      this.a(cuf.uk, oa.bx);
      this.a(cuf.pa, oa.bz);
      this.a(cuf.uH, oa.bx);
      this.a(cuf.oY, oa.bz);
      this.a(cuf.oX, oa.bz);
      this.a(cuf.oW, oa.bz);
      this.a(cuf.oJ, oa.bx);
      this.a(cuf.si, oa.bx);
      this.a(cuf.rp, oa.bx);
      this.a(cuf.rv, oa.bx);
      this.a(cuf.pu, oa.bx);
      this.a(cuf.wg, oa.bx);
      this.a(cuf.vV, oa.bx);
      this.a(cuf.wz, oa.bx);
      this.a(cuf.wC, oa.bx);
      this.a(cuf.nQ, oa.bx);
      this.a(cuf.rf, oa.bx);
      this.a(cuf.oE, oa.bx);
      this.a(cuf.pe, oa.bz);
      this.a(cuf.pf, oa.bz);
      this.a(cuf.uG, oa.bx);
      this.a(cuf.oF, oa.bx);
      this.a(cuf.vv, oa.bx);
      this.a(cuf.pd, oa.bz);
      this.a(cuf.pc, oa.bz);
      this.a(cuf.pb, oa.bz);
      this.a(cuf.uc, oa.bx);
      this.a(cuf.oa, oa.bx);
      this.a(cuf.ob, oa.bx);
      this.a(cuf.vw, oa.bx);
      this.a(cuf.oB, oa.bx);
      this.a(cuf.qA, oa.bx);
      this.a(cuf.qD, oa.bx);
      this.a(cuf.uJ, oa.bx);
      this.a(cuf.rl, oa.bx);
      this.a(cuf.rq, oa.bx);
      this.a(cuf.rn, oa.bx);
      this.a(cuf.rk, oa.bx);
      this.a(cuf.sp, oa.bx);
      this.a(cuf.oi, oa.bx);
      this.a(cuf.oj, oa.bx);
      this.a(cuf.ok, oa.bx);
      this.a(cuf.ol, oa.bx);
      this.a(cuf.uj, oa.bx);
      this.a(cuf.rW, oa.bx);
      this.a(cuf.qE, oa.bx);
      this.a(cuf.nM, oa.bx);
      this.a(cuf.wc, oa.bx);
      this.a(cuf.pr, oa.bx);
      this.a(cuf.vR, oa.bx);
      this.a(cuf.vK, oa.by);
      this.a(cuf.vy, oa.by);
      this.a(cuf.vA, oa.by);
      this.a(cuf.vz, oa.by);
      this.a(cuf.vB, oa.by);
      this.a(cuf.vC, oa.by);
      this.a(cuf.vD, oa.by);
      this.a(cuf.vE, oa.by);
      this.a(cuf.vF, oa.by);
      this.a(cuf.vG, oa.by);
      this.a(cuf.vP, oa.by);
      this.a(cuf.vQ, oa.by);
      this.a(cuf.vH, oa.by);
      this.a(cuf.vI, oa.by);
      this.a(cuf.vL, oa.by);
      this.a(cuf.vJ, oa.by);
      this.a(cuf.vM, oa.by);
      this.a(cuf.vN, oa.by);
      this.a(cuf.vO, oa.by);
      this.a(cuf.uN, oa.bx);
      this.a(cuf.uL, oa.bx);
      this.a(cuf.vU, oa.bx);
      this.a(cuf.po, oa.bz);
      this.a(cuf.pp, oa.bz);
      this.a(cuf.oK, oa.bx);
      this.a(cuf.pn, oa.bz);
      this.a(cuf.oL, oa.bx);
      this.a(cuf.pm, oa.bz);
      this.a(cuf.pl, oa.bz);
      this.a(cuf.ux, oa.bx);
      this.a(cuf.us, oa.bx);
      this.a(cuf.nU, oa.bx);
      this.a(cuf.nV, oa.bx);
      this.a(cuf.rj, oa.bx);
      this.a(cuf.pZ, oa.bx);
      this.a(cuf.qO, oa.bx);
      this.a(cuf.vT, oa.bx);
      this.a(cuf.we, oa.bx);
      this.a(cuf.ro, oa.bx);
      this.a(cuf.ui, oa.bx);
      this.a(cuf.vh, oa.bx);
      this.a(cuf.pX, oa.bx);
      this.a(cuf.qB, oa.bx);
      this.a(cuf.uz, oa.bx);
      this.a(cuf.uy, oa.bx);
      this.a(cuf.rc, oa.bx);
      this.a(cuf.qF, oa.bx);
      this.a(cuf.ut, oa.bx);
      this.a(cuf.rs, oa.bx);
      this.a(cuf.oC, oa.bx);
      this.a(cuf.uA, oa.bx);
      this.a(cuf.uD, oa.bx);
      this.a(cuf.uE, oa.bx);
      this.a(cuf.uC, oa.bx);
      this.a(cuf.rw, oa.bx);
      this.a(cuf.se, oa.bx);
      this.a(cuf.nL, oa.bx);
      this.a(cuf.ra, oa.bx);
      this.a(cuf.qG, oa.bx);
      this.a(cuf.op, oa.bx);
      this.a(cuf.rV, oa.bx);
      this.a(cuf.vu, oa.bx);
      this.a(cuf.wb, oa.bx);
      this.a(cuf.qQ, oa.bx);
      this.a(cuf.qC, oa.bx);
      this.a(cuf.xt, oa.bx);
      this.a(cuf.vp, oa.bx);
      this.a(cuf.sm, oa.bx);
      this.a(cuf.nW, oa.bx);
      this.a(cuf.nX, oa.bx);
      this.a(cuf.qX, oa.bx);
      this.a(cuf.pq, oa.bz);
      this.a(cuf.oU, oa.bz);
      this.a(cuf.oV, oa.bz);
      this.a(cuf.oT, oa.bz);
      this.a(cuf.oS, oa.bz);
      this.a(cuf.oR, oa.bz);
      this.a(cuf.rA, oa.bx);
      this.a(cuf.vX, oa.bx);
      this.a(cuf.nP, oa.bx);
      this.a(cuf.vt, oa.bx);
      this.a(cuf.vS, oa.bx);
      this.a(cuf.rb, oa.bx);
      this.a(cuf.qI, oa.bx);
      this.a(cuf.qJ, oa.bx);
      this.a(cuf.qK, oa.bx);
      this.a(cuf.qz, oa.bx);
      this.a(cuf.pw, oa.bx);
      this.a(cuf.ri, oa.bx);
      this.a(cuf.tY, oa.bx);
      this.a(cuf.ub, oa.bO);
      this.a(cuf.or);
      this.a(cuf.oP, oa.bz);
      this.a(cuf.oQ, oa.bz);
      this.a(cuf.oO, oa.bz);
      this.a(cuf.oN, oa.bz);
      this.a(cuf.oM, oa.bz);
      this.a(cuf.tZ, oa.bx);
      this.a(cuf.ua, oa.bx);
      this.a(cuf.rm, oa.bx);
      this.a(cuf.xv, oa.bx);
      this.a(cuf.xw, oa.bx);
      this.a(cuf.xx, oa.bx);
      this.a(cuf.xy, oa.bx);
      this.a(cuf.xz, oa.bx);
      this.a(cuf.xA, oa.bx);
      this.a(cuf.xB, oa.bx);
      this.a(cuf.xC, oa.bx);
      this.a(cuf.xD, oa.bx);
      this.a(cuf.xE, oa.bx);
      this.a(cuf.xF, oa.bx);
      this.a(cuf.xG, oa.bx);
      this.a(cuf.xH, oa.bx);
      this.a(cuf.xI, oa.bx);
      this.a(cuf.xJ, oa.bx);
      this.a(cuf.xK, oa.bx);
      this.a(cuf.xL, oa.bx);
      this.a(cuf.xM, oa.bx);
      this.a(cuf.xN, oa.bx);
      this.a(cuf.vx, cuf.pq, oa.bz);
      this.a(cuf.qb, cuf.qa, oa.bx);

      for (ctx $$0 : lq.g) {
         if ($$0 instanceof crs $$1) {
            this.a($$1);
         }
      }

      this.a(cuf.xO, oa.bx);
      this.a(cuf.xP, oa.bx);
      this.a(cuf.xQ, oa.bx);
      this.a(cuf.xR, oa.bx);
      this.a(cuf.xS, oa.bx);
      this.a(cuf.xT, oa.bx);
      this.a(cuf.xU, oa.bx);
      this.a(cuf.xV, oa.bx);
      this.a(cuf.xW, oa.bx);
      this.a(cuf.xX, oa.bx);
      this.a(cuf.xY, oa.bx);
      this.a(cuf.xZ, oa.bx);
      this.a(cuf.ya, oa.bx);
      this.a(cuf.yb, oa.bx);
      this.a(cuf.yc, oa.bx);
      this.a(cuf.yd, oa.bx);
      this.a(cuf.ye, oa.bx);
      this.a(cuf.yf, oa.bx);
      this.a(cuf.yg, oa.bx);
      this.a(cuf.yh, oa.bx);
      this.a(cuf.yi, oa.bx);
      this.a(cuf.yj, oa.bx);
      this.a(cuf.yk, oa.bx);
      this.a(cuf.yC, oa.bx);
      this.a(cuf.yD, oa.bx);
      this.a(cuf.yF, oa.bx);
   }

   static record a(String a, float b, Map<jj<crt>, String> c) {
      public String a(jj<crt> $$0) {
         return this.c.getOrDefault($$0, this.a);
      }
   }
}
