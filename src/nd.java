import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Supplier;

public class nd {
   public static final akf a = new akf("trim_type");
   private static final List<nd.a> b = List.of(
      new nd.a("quartz", 0.1F, Map.of()),
      new nd.a("iron", 0.2F, Map.of(cpu.c, "iron_darker")),
      new nd.a("netherite", 0.3F, Map.of(cpu.g, "netherite_darker")),
      new nd.a("redstone", 0.4F, Map.of()),
      new nd.a("copper", 0.5F, Map.of()),
      new nd.a("gold", 0.6F, Map.of(cpu.d, "gold_darker")),
      new nd.a("emerald", 0.7F, Map.of()),
      new nd.a("diamond", 0.8F, Map.of(cpu.e, "diamond_darker")),
      new nd.a("lapis", 0.9F, Map.of()),
      new nd.a("amethyst", 1.0F, Map.of())
   );
   private final BiConsumer<akf, Supplier<JsonElement>> c;

   public nd(BiConsumer<akf, Supplier<JsonElement>> $$0) {
      this.c = $$0;
   }

   private void a(cry $$0, nr $$1) {
      $$1.a(nq.a($$0), nt.b($$0), this.c);
   }

   private void a(cry $$0, String $$1, nr $$2) {
      $$2.a(nq.a($$0, $$1), nt.k(nt.a($$0, $$1)), this.c);
   }

   private void a(cry $$0, cry $$1, nr $$2) {
      $$2.a(nq.a($$0), nt.b($$1), this.c);
   }

   private void a(cry $$0) {
      this.a(nq.a($$0), nt.c($$0), nt.a($$0, "_overlay"));
   }

   private void b(cry $$0) {
      for (int $$1 = 0; $$1 < 32; $$1++) {
         if ($$1 != 16) {
            this.a($$0, String.format(Locale.ROOT, "_%02d", $$1), ns.bx);
         }
      }
   }

   private void c(cry $$0) {
      for (int $$1 = 1; $$1 < 64; $$1++) {
         this.a($$0, String.format(Locale.ROOT, "_%02d", $$1), ns.bx);
      }
   }

   private void a(akf $$0, akf $$1, akf $$2) {
      ns.bB.a($$0, nt.c($$1, $$2), this.c);
   }

   private void a(akf $$0, akf $$1, akf $$2, akf $$3) {
      ns.bC.a($$0, nt.a($$1, $$2, $$3), this.c);
   }

   private akf a(akf $$0, String $$1) {
      return $$0.e("_" + $$1 + "_trim");
   }

   private JsonObject a(akf $$0, Map<nu, akf> $$1, iv<cpt> $$2) {
      JsonObject $$3 = ns.bB.a($$0, $$1);
      JsonArray $$4 = new JsonArray();

      for (nd.a $$5 : b) {
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

   private void a(cps $$0) {
      if ($$0.f().d()) {
         akf $$1 = nq.a($$0);
         akf $$2 = nt.c($$0);
         akf $$3 = nt.a($$0, "_overlay");
         if ($$0.h().a(cpu.a)) {
            ns.bB.a($$1, nt.c($$2, $$3), this.c, ($$1x, $$2x) -> this.a($$1x, $$2x, $$0.h()));
         } else {
            ns.bx.a($$1, nt.k($$2), this.c, ($$1x, $$2x) -> this.a($$1x, $$2x, $$0.h()));
         }

         for (nd.a $$4 : b) {
            String $$5 = $$4.a($$0.h());
            akf $$6 = this.a($$1, $$5);
            String $$7 = $$0.f().b() + "_trim_" + $$5;
            akf $$8 = new akf($$7).d("trims/items/");
            if ($$0.h().a(cpu.a)) {
               this.a($$6, $$2, $$3, $$8);
            } else {
               this.a($$6, $$2, $$8);
            }
         }
      }
   }

   public void a() {
      this.a(csg.oc, ns.bx);
      this.a(csg.oe, ns.bx);
      this.a(csg.od, ns.bx);
      this.a(csg.of, ns.bx);
      this.a(csg.oC, ns.bx);
      this.a(csg.ot, ns.bx);
      this.a(csg.oq, ns.bx);
      this.a(csg.uF, ns.bx);
      this.a(csg.ov, ns.bx);
      this.a(csg.uh, ns.bx);
      this.a(csg.dR, ns.bz);
      this.a(csg.sa, ns.bx);
      this.a(csg.vk, ns.bx);
      this.a(csg.vm, ns.bx);
      this.a(csg.nY, ns.bx);
      this.a(csg.nZ, ns.bx);
      this.a(csg.rx, ns.bx);
      this.a(csg.so, ns.bx);
      this.a(csg.sg, ns.bz);
      this.a(csg.rt, ns.bx);
      this.a(csg.ry, ns.bx);
      this.a(csg.qP, ns.bx);
      this.a(csg.pq, ns.bx);
      this.a(csg.px, ns.bx);
      this.a(csg.qL, ns.bx);
      this.a(csg.yB, ns.bx);
      this.a(csg.ru, ns.bx);
      this.a(csg.qy, ns.bx);
      this.a(csg.nR, ns.bA);
      this.a(csg.nS, ns.bA);
      this.a(csg.ox, ns.bx);
      this.a(csg.nN, ns.bx);
      this.a(csg.sc, ns.bx);
      this.a(csg.vg, ns.bx);
      this.a(csg.qM, ns.bx);
      this.c(csg.qW);
      this.a(csg.ow, ns.bx);
      this.a(csg.qH, ns.bx);
      this.a(csg.uM, ns.bx);
      this.b(csg.qS);
      this.b(csg.qT);
      this.a(csg.sb, ns.bx);
      this.a(csg.sd, ns.bx);
      this.a(csg.rd, ns.bx);
      this.a(csg.uO, ns.bx);
      this.a(csg.pY, ns.bx);
      this.a(csg.uB, ns.bx);
      this.a(csg.re, ns.bx);
      this.a(csg.rS, ns.bx);
      this.a(csg.oF, ns.bx);
      this.a(csg.oG, ns.bx);
      this.a(csg.vX, ns.bx);
      this.a(csg.rr, ns.bx);
      this.a(csg.og, ns.bx);
      this.a(csg.oh, ns.bx);
      this.a(csg.oy, ns.bx);
      this.a(csg.pi, ns.bz);
      this.a(csg.pj, ns.bz);
      this.a(csg.uI, ns.bx);
      this.a(csg.ph, ns.bz);
      this.a(csg.pg, ns.bz);
      this.a(csg.pf, ns.bz);
      this.a(csg.vn, ns.bx);
      this.a(csg.rX, ns.bx);
      this.a(csg.qR, ns.bx);
      this.a(csg.oz, ns.bx);
      this.a(csg.uw, ns.bx);
      this.a(csg.ss, ns.bx);
      this.a(csg.sf, ns.bx);
      this.a(csg.vf, ns.bx);
      this.a(csg.tW, ns.bx);
      this.a(csg.sn, ns.bx);
      this.a(csg.uu, ns.bx);
      this.a(csg.tX, ns.bx);
      this.a(csg.pW, ns.bx);
      this.a(csg.os, ns.bx);
      this.a(csg.wc, ns.bx);
      this.a(csg.vW, ns.bx);
      this.a(csg.nO, ns.bx);
      this.a(csg.sh, ns.bx);
      this.a(csg.sl, ns.bx);
      this.a(csg.st, ns.bx);
      this.a(csg.wa, ns.bx);
      this.a(csg.ws, ns.bx);
      this.a(csg.qY, ns.bx);
      this.a(csg.rg, ns.bx);
      this.a(csg.ud, ns.bx);
      this.a(csg.oH, ns.bx);
      this.a(csg.qa, ns.bx);
      this.a(csg.oY, ns.bz);
      this.a(csg.uk, ns.bx);
      this.a(csg.oZ, ns.bz);
      this.a(csg.uH, ns.bx);
      this.a(csg.oX, ns.bz);
      this.a(csg.oW, ns.bz);
      this.a(csg.oV, ns.bz);
      this.a(csg.oI, ns.bx);
      this.a(csg.si, ns.bx);
      this.a(csg.rp, ns.bx);
      this.a(csg.rv, ns.bx);
      this.a(csg.pu, ns.bx);
      this.a(csg.wd, ns.bx);
      this.a(csg.vS, ns.bx);
      this.a(csg.ww, ns.bx);
      this.a(csg.wz, ns.bx);
      this.a(csg.nQ, ns.bx);
      this.a(csg.rf, ns.bx);
      this.a(csg.oD, ns.bx);
      this.a(csg.pd, ns.bz);
      this.a(csg.pe, ns.bz);
      this.a(csg.uG, ns.bx);
      this.a(csg.oE, ns.bx);
      this.a(csg.vv, ns.bx);
      this.a(csg.pc, ns.bz);
      this.a(csg.pb, ns.bz);
      this.a(csg.pa, ns.bz);
      this.a(csg.uc, ns.bx);
      this.a(csg.oa, ns.bx);
      this.a(csg.ob, ns.bx);
      this.a(csg.vw, ns.bx);
      this.a(csg.oA, ns.bx);
      this.a(csg.qA, ns.bx);
      this.a(csg.qD, ns.bx);
      this.a(csg.uJ, ns.bx);
      this.a(csg.rl, ns.bx);
      this.a(csg.rq, ns.bx);
      this.a(csg.rn, ns.bx);
      this.a(csg.rk, ns.bx);
      this.a(csg.sp, ns.bx);
      this.a(csg.oi, ns.bx);
      this.a(csg.oj, ns.bx);
      this.a(csg.ok, ns.bx);
      this.a(csg.ol, ns.bx);
      this.a(csg.uj, ns.bx);
      this.a(csg.rW, ns.bx);
      this.a(csg.qE, ns.bx);
      this.a(csg.nM, ns.bx);
      this.a(csg.vZ, ns.bx);
      this.a(csg.pr, ns.bx);
      this.a(csg.vO, ns.bx);
      this.a(csg.vI, ns.by);
      this.a(csg.vy, ns.by);
      this.a(csg.vA, ns.by);
      this.a(csg.vz, ns.by);
      this.a(csg.vB, ns.by);
      this.a(csg.vC, ns.by);
      this.a(csg.vD, ns.by);
      this.a(csg.vE, ns.by);
      this.a(csg.vN, ns.by);
      this.a(csg.vF, ns.by);
      this.a(csg.vG, ns.by);
      this.a(csg.vJ, ns.by);
      this.a(csg.vH, ns.by);
      this.a(csg.vK, ns.by);
      this.a(csg.vL, ns.by);
      this.a(csg.vM, ns.by);
      this.a(csg.uN, ns.bx);
      this.a(csg.uL, ns.bx);
      this.a(csg.vR, ns.bx);
      this.a(csg.pn, ns.bz);
      this.a(csg.po, ns.bz);
      this.a(csg.oJ, ns.bx);
      this.a(csg.pm, ns.bz);
      this.a(csg.oK, ns.bx);
      this.a(csg.pl, ns.bz);
      this.a(csg.pk, ns.bz);
      this.a(csg.ux, ns.bx);
      this.a(csg.us, ns.bx);
      this.a(csg.nU, ns.bx);
      this.a(csg.nV, ns.bx);
      this.a(csg.rj, ns.bx);
      this.a(csg.pZ, ns.bx);
      this.a(csg.qO, ns.bx);
      this.a(csg.vQ, ns.bx);
      this.a(csg.wb, ns.bx);
      this.a(csg.ro, ns.bx);
      this.a(csg.ui, ns.bx);
      this.a(csg.vh, ns.bx);
      this.a(csg.pX, ns.bx);
      this.a(csg.qB, ns.bx);
      this.a(csg.uz, ns.bx);
      this.a(csg.uy, ns.bx);
      this.a(csg.rc, ns.bx);
      this.a(csg.qF, ns.bx);
      this.a(csg.ut, ns.bx);
      this.a(csg.rs, ns.bx);
      this.a(csg.oB, ns.bx);
      this.a(csg.uA, ns.bx);
      this.a(csg.uD, ns.bx);
      this.a(csg.uE, ns.bx);
      this.a(csg.uC, ns.bx);
      this.a(csg.rw, ns.bx);
      this.a(csg.se, ns.bx);
      this.a(csg.nL, ns.bx);
      this.a(csg.ra, ns.bx);
      this.a(csg.qG, ns.bx);
      this.a(csg.op, ns.bx);
      this.a(csg.rV, ns.bx);
      this.a(csg.vu, ns.bx);
      this.a(csg.vY, ns.bx);
      this.a(csg.qQ, ns.bx);
      this.a(csg.qC, ns.bx);
      this.a(csg.xq, ns.bx);
      this.a(csg.vp, ns.bx);
      this.a(csg.sm, ns.bx);
      this.a(csg.nW, ns.bx);
      this.a(csg.nX, ns.bx);
      this.a(csg.qX, ns.bx);
      this.a(csg.pp, ns.bz);
      this.a(csg.oT, ns.bz);
      this.a(csg.oU, ns.bz);
      this.a(csg.oS, ns.bz);
      this.a(csg.oR, ns.bz);
      this.a(csg.oQ, ns.bz);
      this.a(csg.rA, ns.bx);
      this.a(csg.vU, ns.bx);
      this.a(csg.nP, ns.bx);
      this.a(csg.vt, ns.bx);
      this.a(csg.vP, ns.bx);
      this.a(csg.rb, ns.bx);
      this.a(csg.qI, ns.bx);
      this.a(csg.qJ, ns.bx);
      this.a(csg.qK, ns.bx);
      this.a(csg.qz, ns.bx);
      this.a(csg.pw, ns.bx);
      this.a(csg.ri, ns.bx);
      this.a(csg.tY, ns.bx);
      this.a(csg.ub, ns.bO);
      this.a(csg.or);
      this.a(csg.oO, ns.bz);
      this.a(csg.oP, ns.bz);
      this.a(csg.oN, ns.bz);
      this.a(csg.oM, ns.bz);
      this.a(csg.oL, ns.bz);
      this.a(csg.tZ, ns.bx);
      this.a(csg.ua, ns.bx);
      this.a(csg.rm, ns.bx);
      this.a(csg.xs, ns.bx);
      this.a(csg.xt, ns.bx);
      this.a(csg.xu, ns.bx);
      this.a(csg.xv, ns.bx);
      this.a(csg.xw, ns.bx);
      this.a(csg.xx, ns.bx);
      this.a(csg.xy, ns.bx);
      this.a(csg.xz, ns.bx);
      this.a(csg.xA, ns.bx);
      this.a(csg.xB, ns.bx);
      this.a(csg.xC, ns.bx);
      this.a(csg.xD, ns.bx);
      this.a(csg.xE, ns.bx);
      this.a(csg.xF, ns.bx);
      this.a(csg.xG, ns.bx);
      this.a(csg.xH, ns.bx);
      this.a(csg.xI, ns.bx);
      this.a(csg.xJ, ns.bx);
      this.a(csg.xK, ns.bx);
      this.a(csg.vx, csg.pp, ns.bz);
      this.a(csg.qb, csg.qa, ns.bx);

      for (cry $$0 : lc.h) {
         if ($$0 instanceof cps $$1) {
            this.a($$1);
         }
      }

      this.a(csg.xL, ns.bx);
      this.a(csg.xM, ns.bx);
      this.a(csg.xN, ns.bx);
      this.a(csg.xO, ns.bx);
      this.a(csg.xP, ns.bx);
      this.a(csg.xQ, ns.bx);
      this.a(csg.xR, ns.bx);
      this.a(csg.xS, ns.bx);
      this.a(csg.xT, ns.bx);
      this.a(csg.xU, ns.bx);
      this.a(csg.xV, ns.bx);
      this.a(csg.xW, ns.bx);
      this.a(csg.xX, ns.bx);
      this.a(csg.xY, ns.bx);
      this.a(csg.xZ, ns.bx);
      this.a(csg.ya, ns.bx);
      this.a(csg.yb, ns.bx);
      this.a(csg.yc, ns.bx);
      this.a(csg.yd, ns.bx);
      this.a(csg.ye, ns.bx);
      this.a(csg.yf, ns.bx);
      this.a(csg.yg, ns.bx);
      this.a(csg.yh, ns.bx);
      this.a(csg.yz, ns.bx);
   }

   static record a(String a, float b, Map<iv<cpt>, String> c) {
      public String a(iv<cpt> $$0) {
         return this.c.getOrDefault($$0, this.a);
      }
   }
}
