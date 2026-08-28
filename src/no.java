import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Supplier;

public class no {
   public static final akq a = akq.b("trim_type");
   private static final List<no.a> b = List.of(
      new no.a("quartz", 0.1F, Map.of()),
      new no.a("iron", 0.2F, Map.of(csf.c, "iron_darker")),
      new no.a("netherite", 0.3F, Map.of(csf.g, "netherite_darker")),
      new no.a("redstone", 0.4F, Map.of()),
      new no.a("copper", 0.5F, Map.of()),
      new no.a("gold", 0.6F, Map.of(csf.d, "gold_darker")),
      new no.a("emerald", 0.7F, Map.of()),
      new no.a("diamond", 0.8F, Map.of(csf.e, "diamond_darker")),
      new no.a("lapis", 0.9F, Map.of()),
      new no.a("amethyst", 1.0F, Map.of())
   );
   private final BiConsumer<akq, Supplier<JsonElement>> c;

   public no(BiConsumer<akq, Supplier<JsonElement>> $$0) {
      this.c = $$0;
   }

   private void a(cuj $$0, oc $$1) {
      $$1.a(ob.a($$0), oe.b($$0), this.c);
   }

   private void a(cuj $$0, String $$1, oc $$2) {
      $$2.a(ob.a($$0, $$1), oe.k(oe.a($$0, $$1)), this.c);
   }

   private void a(cuj $$0, cuj $$1, oc $$2) {
      $$2.a(ob.a($$0), oe.b($$1), this.c);
   }

   private void a(cuj $$0) {
      this.a(ob.a($$0), oe.c($$0), oe.a($$0, "_overlay"));
   }

   private void b(cuj $$0) {
      for (int $$1 = 0; $$1 < 32; $$1++) {
         if ($$1 != 16) {
            this.a($$0, String.format(Locale.ROOT, "_%02d", $$1), od.bx);
         }
      }
   }

   private void c(cuj $$0) {
      for (int $$1 = 1; $$1 < 64; $$1++) {
         this.a($$0, String.format(Locale.ROOT, "_%02d", $$1), od.bx);
      }
   }

   private void a(akq $$0, akq $$1, akq $$2) {
      od.bB.a($$0, oe.c($$1, $$2), this.c);
   }

   private void a(akq $$0, akq $$1, akq $$2, akq $$3) {
      od.bC.a($$0, oe.a($$1, $$2, $$3), this.c);
   }

   private akq a(akq $$0, String $$1) {
      return $$0.g("_" + $$1 + "_trim");
   }

   private JsonObject a(akq $$0, Map<of, akq> $$1, jm<cse> $$2) {
      JsonObject $$3 = od.bB.a($$0, $$1);
      JsonArray $$4 = new JsonArray();

      for (no.a $$5 : b) {
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
         akq $$1 = ob.a($$0);
         akq $$2 = oe.c($$0);
         akq $$3 = oe.a($$0, "_overlay");
         if ($$0.h().a(csf.a)) {
            od.bB.a($$1, oe.c($$2, $$3), this.c, ($$1x, $$2x) -> this.a($$1x, $$2x, $$0.h()));
         } else {
            od.bx.a($$1, oe.k($$2), this.c, ($$1x, $$2x) -> this.a($$1x, $$2x, $$0.h()));
         }

         for (no.a $$4 : b) {
            String $$5 = $$4.a($$0.h());
            akq $$6 = this.a($$1, $$5);
            String $$7 = $$0.f().b() + "_trim_" + $$5;
            akq $$8 = akq.b($$7).f("trims/items/");
            if ($$0.h().a(csf.a)) {
               this.a($$6, $$2, $$3, $$8);
            } else {
               this.a($$6, $$2, $$8);
            }
         }
      }
   }

   public void a() {
      this.a(cur.oc, od.bx);
      this.a(cur.oe, od.bx);
      this.a(cur.od, od.bx);
      this.a(cur.of, od.bx);
      this.a(cur.oD, od.bx);
      this.a(cur.ou, od.bx);
      this.a(cur.oq, od.bx);
      this.a(cur.uF, od.bx);
      this.a(cur.ow, od.bx);
      this.a(cur.uh, od.bx);
      this.a(cur.dR, od.bz);
      this.a(cur.sa, od.bx);
      this.a(cur.vk, od.bx);
      this.a(cur.vm, od.bx);
      this.a(cur.nY, od.bx);
      this.a(cur.nZ, od.bx);
      this.a(cur.rx, od.bx);
      this.a(cur.so, od.bx);
      this.a(cur.sg, od.bz);
      this.a(cur.rt, od.bx);
      this.a(cur.ry, od.bx);
      this.a(cur.qP, od.bx);
      this.a(cur.ot, od.bx);
      this.a(cur.px, od.bx);
      this.a(cur.qL, od.bx);
      this.a(cur.yG, od.bx);
      this.a(cur.ru, od.bx);
      this.a(cur.qy, od.bx);
      this.a(cur.nR, od.bA);
      this.a(cur.nS, od.bA);
      this.a(cur.oy, od.bx);
      this.a(cur.nN, od.bx);
      this.a(cur.sc, od.bx);
      this.a(cur.vg, od.bx);
      this.a(cur.qM, od.bx);
      this.c(cur.qW);
      this.a(cur.ox, od.bx);
      this.a(cur.qH, od.bx);
      this.a(cur.uM, od.bx);
      this.b(cur.qS);
      this.b(cur.qT);
      this.a(cur.sb, od.bx);
      this.a(cur.sd, od.bx);
      this.a(cur.rd, od.bx);
      this.a(cur.uO, od.bx);
      this.a(cur.pY, od.bx);
      this.a(cur.uB, od.bx);
      this.a(cur.re, od.bx);
      this.a(cur.rS, od.bx);
      this.a(cur.oG, od.bx);
      this.a(cur.oH, od.bx);
      this.a(cur.wa, od.bx);
      this.a(cur.rr, od.bx);
      this.a(cur.og, od.bx);
      this.a(cur.oh, od.bx);
      this.a(cur.oz, od.bx);
      this.a(cur.pj, od.bz);
      this.a(cur.pk, od.bz);
      this.a(cur.uI, od.bx);
      this.a(cur.pi, od.bz);
      this.a(cur.ph, od.bz);
      this.a(cur.pg, od.bz);
      this.a(cur.vn, od.bx);
      this.a(cur.rX, od.bx);
      this.a(cur.qR, od.bx);
      this.a(cur.oA, od.bx);
      this.a(cur.uw, od.bx);
      this.a(cur.ss, od.bx);
      this.a(cur.sf, od.bx);
      this.a(cur.vf, od.bx);
      this.a(cur.tW, od.bx);
      this.a(cur.sn, od.bx);
      this.a(cur.uu, od.bx);
      this.a(cur.tX, od.bx);
      this.a(cur.pW, od.bx);
      this.a(cur.os, od.bx);
      this.a(cur.wf, od.bx);
      this.a(cur.vZ, od.bx);
      this.a(cur.nO, od.bx);
      this.a(cur.sh, od.bx);
      this.a(cur.sl, od.bx);
      this.a(cur.st, od.bx);
      this.a(cur.wd, od.bx);
      this.a(cur.wv, od.bx);
      this.a(cur.qY, od.bx);
      this.a(cur.rg, od.bx);
      this.a(cur.ud, od.bx);
      this.a(cur.oI, od.bx);
      this.a(cur.qa, od.bx);
      this.a(cur.oZ, od.bz);
      this.a(cur.uk, od.bx);
      this.a(cur.pa, od.bz);
      this.a(cur.uH, od.bx);
      this.a(cur.oY, od.bz);
      this.a(cur.oX, od.bz);
      this.a(cur.oW, od.bz);
      this.a(cur.oJ, od.bx);
      this.a(cur.si, od.bx);
      this.a(cur.rp, od.bx);
      this.a(cur.rv, od.bx);
      this.a(cur.pu, od.bx);
      this.a(cur.wg, od.bx);
      this.a(cur.vV, od.bx);
      this.a(cur.wz, od.bx);
      this.a(cur.wC, od.bx);
      this.a(cur.nQ, od.bx);
      this.a(cur.rf, od.bx);
      this.a(cur.oE, od.bx);
      this.a(cur.pe, od.bz);
      this.a(cur.pf, od.bz);
      this.a(cur.uG, od.bx);
      this.a(cur.oF, od.bx);
      this.a(cur.vv, od.bx);
      this.a(cur.pd, od.bz);
      this.a(cur.pc, od.bz);
      this.a(cur.pb, od.bz);
      this.a(cur.uc, od.bx);
      this.a(cur.oa, od.bx);
      this.a(cur.ob, od.bx);
      this.a(cur.vw, od.bx);
      this.a(cur.oB, od.bx);
      this.a(cur.qA, od.bx);
      this.a(cur.qD, od.bx);
      this.a(cur.uJ, od.bx);
      this.a(cur.rl, od.bx);
      this.a(cur.rq, od.bx);
      this.a(cur.rn, od.bx);
      this.a(cur.rk, od.bx);
      this.a(cur.sp, od.bx);
      this.a(cur.oi, od.bx);
      this.a(cur.oj, od.bx);
      this.a(cur.ok, od.bx);
      this.a(cur.ol, od.bx);
      this.a(cur.uj, od.bx);
      this.a(cur.rW, od.bx);
      this.a(cur.qE, od.bx);
      this.a(cur.nM, od.bx);
      this.a(cur.wc, od.bx);
      this.a(cur.pr, od.bx);
      this.a(cur.vR, od.bx);
      this.a(cur.vK, od.by);
      this.a(cur.vy, od.by);
      this.a(cur.vA, od.by);
      this.a(cur.vz, od.by);
      this.a(cur.vB, od.by);
      this.a(cur.vC, od.by);
      this.a(cur.vD, od.by);
      this.a(cur.vE, od.by);
      this.a(cur.vF, od.by);
      this.a(cur.vG, od.by);
      this.a(cur.vP, od.by);
      this.a(cur.vQ, od.by);
      this.a(cur.vH, od.by);
      this.a(cur.vI, od.by);
      this.a(cur.vL, od.by);
      this.a(cur.vJ, od.by);
      this.a(cur.vM, od.by);
      this.a(cur.vN, od.by);
      this.a(cur.vO, od.by);
      this.a(cur.uN, od.bx);
      this.a(cur.uL, od.bx);
      this.a(cur.vU, od.bx);
      this.a(cur.po, od.bz);
      this.a(cur.pp, od.bz);
      this.a(cur.oK, od.bx);
      this.a(cur.pn, od.bz);
      this.a(cur.oL, od.bx);
      this.a(cur.pm, od.bz);
      this.a(cur.pl, od.bz);
      this.a(cur.ux, od.bx);
      this.a(cur.us, od.bx);
      this.a(cur.nU, od.bx);
      this.a(cur.nV, od.bx);
      this.a(cur.rj, od.bx);
      this.a(cur.pZ, od.bx);
      this.a(cur.qO, od.bx);
      this.a(cur.vT, od.bx);
      this.a(cur.we, od.bx);
      this.a(cur.ro, od.bx);
      this.a(cur.ui, od.bx);
      this.a(cur.vh, od.bx);
      this.a(cur.pX, od.bx);
      this.a(cur.qB, od.bx);
      this.a(cur.uz, od.bx);
      this.a(cur.uy, od.bx);
      this.a(cur.rc, od.bx);
      this.a(cur.qF, od.bx);
      this.a(cur.ut, od.bx);
      this.a(cur.rs, od.bx);
      this.a(cur.oC, od.bx);
      this.a(cur.uA, od.bx);
      this.a(cur.uD, od.bx);
      this.a(cur.uE, od.bx);
      this.a(cur.uC, od.bx);
      this.a(cur.rw, od.bx);
      this.a(cur.se, od.bx);
      this.a(cur.nL, od.bx);
      this.a(cur.ra, od.bx);
      this.a(cur.qG, od.bx);
      this.a(cur.op, od.bx);
      this.a(cur.rV, od.bx);
      this.a(cur.vu, od.bx);
      this.a(cur.wb, od.bx);
      this.a(cur.qQ, od.bx);
      this.a(cur.qC, od.bx);
      this.a(cur.xt, od.bx);
      this.a(cur.vp, od.bx);
      this.a(cur.sm, od.bx);
      this.a(cur.nW, od.bx);
      this.a(cur.nX, od.bx);
      this.a(cur.qX, od.bx);
      this.a(cur.pq, od.bz);
      this.a(cur.oU, od.bz);
      this.a(cur.oV, od.bz);
      this.a(cur.oT, od.bz);
      this.a(cur.oS, od.bz);
      this.a(cur.oR, od.bz);
      this.a(cur.rA, od.bx);
      this.a(cur.vX, od.bx);
      this.a(cur.nP, od.bx);
      this.a(cur.vt, od.bx);
      this.a(cur.vS, od.bx);
      this.a(cur.rb, od.bx);
      this.a(cur.qI, od.bx);
      this.a(cur.qJ, od.bx);
      this.a(cur.qK, od.bx);
      this.a(cur.qz, od.bx);
      this.a(cur.pw, od.bx);
      this.a(cur.ri, od.bx);
      this.a(cur.tY, od.bx);
      this.a(cur.ub, od.bO);
      this.a(cur.or);
      this.a(cur.oP, od.bz);
      this.a(cur.oQ, od.bz);
      this.a(cur.oO, od.bz);
      this.a(cur.oN, od.bz);
      this.a(cur.oM, od.bz);
      this.a(cur.tZ, od.bx);
      this.a(cur.ua, od.bx);
      this.a(cur.rm, od.bx);
      this.a(cur.xv, od.bx);
      this.a(cur.xw, od.bx);
      this.a(cur.xx, od.bx);
      this.a(cur.xy, od.bx);
      this.a(cur.xz, od.bx);
      this.a(cur.xA, od.bx);
      this.a(cur.xB, od.bx);
      this.a(cur.xC, od.bx);
      this.a(cur.xD, od.bx);
      this.a(cur.xE, od.bx);
      this.a(cur.xF, od.bx);
      this.a(cur.xG, od.bx);
      this.a(cur.xH, od.bx);
      this.a(cur.xI, od.bx);
      this.a(cur.xJ, od.bx);
      this.a(cur.xK, od.bx);
      this.a(cur.xL, od.bx);
      this.a(cur.xM, od.bx);
      this.a(cur.xN, od.bx);
      this.a(cur.vx, cur.pq, od.bz);
      this.a(cur.qb, cur.qa, od.bx);

      for (cuj $$0 : lt.g) {
         if ($$0 instanceof csd $$1) {
            this.a($$1);
         }
      }

      this.a(cur.xO, od.bx);
      this.a(cur.xP, od.bx);
      this.a(cur.xQ, od.bx);
      this.a(cur.xR, od.bx);
      this.a(cur.xS, od.bx);
      this.a(cur.xT, od.bx);
      this.a(cur.xU, od.bx);
      this.a(cur.xV, od.bx);
      this.a(cur.xW, od.bx);
      this.a(cur.xX, od.bx);
      this.a(cur.xY, od.bx);
      this.a(cur.xZ, od.bx);
      this.a(cur.ya, od.bx);
      this.a(cur.yb, od.bx);
      this.a(cur.yc, od.bx);
      this.a(cur.yd, od.bx);
      this.a(cur.ye, od.bx);
      this.a(cur.yf, od.bx);
      this.a(cur.yg, od.bx);
      this.a(cur.yh, od.bx);
      this.a(cur.yi, od.bx);
      this.a(cur.yj, od.bx);
      this.a(cur.yk, od.bx);
      this.a(cur.yC, od.bx);
      this.a(cur.yD, od.bx);
      this.a(cur.yF, od.bx);
   }

   static record a(String a, float b, Map<jm<cse>, String> c) {
      public String a(jm<cse> $$0) {
         return this.c.getOrDefault($$0, this.a);
      }
   }
}
