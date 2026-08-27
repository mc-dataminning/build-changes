import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Supplier;

public class ne {
   public static final akh a = new akh("trim_type");
   private static final List<ne.a> b = List.of(
      new ne.a("quartz", 0.1F, Map.of()),
      new ne.a("iron", 0.2F, Map.of(cqq.c, "iron_darker")),
      new ne.a("netherite", 0.3F, Map.of(cqq.g, "netherite_darker")),
      new ne.a("redstone", 0.4F, Map.of()),
      new ne.a("copper", 0.5F, Map.of()),
      new ne.a("gold", 0.6F, Map.of(cqq.d, "gold_darker")),
      new ne.a("emerald", 0.7F, Map.of()),
      new ne.a("diamond", 0.8F, Map.of(cqq.e, "diamond_darker")),
      new ne.a("lapis", 0.9F, Map.of()),
      new ne.a("amethyst", 1.0F, Map.of())
   );
   private final BiConsumer<akh, Supplier<JsonElement>> c;

   public ne(BiConsumer<akh, Supplier<JsonElement>> $$0) {
      this.c = $$0;
   }

   private void a(csu $$0, ns $$1) {
      $$1.a(nr.a($$0), nu.b($$0), this.c);
   }

   private void a(csu $$0, String $$1, ns $$2) {
      $$2.a(nr.a($$0, $$1), nu.k(nu.a($$0, $$1)), this.c);
   }

   private void a(csu $$0, csu $$1, ns $$2) {
      $$2.a(nr.a($$0), nu.b($$1), this.c);
   }

   private void a(csu $$0) {
      this.a(nr.a($$0), nu.c($$0), nu.a($$0, "_overlay"));
   }

   private void b(csu $$0) {
      for (int $$1 = 0; $$1 < 32; $$1++) {
         if ($$1 != 16) {
            this.a($$0, String.format(Locale.ROOT, "_%02d", $$1), nt.bx);
         }
      }
   }

   private void c(csu $$0) {
      for (int $$1 = 1; $$1 < 64; $$1++) {
         this.a($$0, String.format(Locale.ROOT, "_%02d", $$1), nt.bx);
      }
   }

   private void a(akh $$0, akh $$1, akh $$2) {
      nt.bB.a($$0, nu.c($$1, $$2), this.c);
   }

   private void a(akh $$0, akh $$1, akh $$2, akh $$3) {
      nt.bC.a($$0, nu.a($$1, $$2, $$3), this.c);
   }

   private akh a(akh $$0, String $$1) {
      return $$0.e("_" + $$1 + "_trim");
   }

   private JsonObject a(akh $$0, Map<nv, akh> $$1, iw<cqp> $$2) {
      JsonObject $$3 = nt.bB.a($$0, $$1);
      JsonArray $$4 = new JsonArray();

      for (ne.a $$5 : b) {
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

   private void a(cqo $$0) {
      if ($$0.f().d()) {
         akh $$1 = nr.a($$0);
         akh $$2 = nu.c($$0);
         akh $$3 = nu.a($$0, "_overlay");
         if ($$0.h().a(cqq.a)) {
            nt.bB.a($$1, nu.c($$2, $$3), this.c, ($$1x, $$2x) -> this.a($$1x, $$2x, $$0.h()));
         } else {
            nt.bx.a($$1, nu.k($$2), this.c, ($$1x, $$2x) -> this.a($$1x, $$2x, $$0.h()));
         }

         for (ne.a $$4 : b) {
            String $$5 = $$4.a($$0.h());
            akh $$6 = this.a($$1, $$5);
            String $$7 = $$0.f().b() + "_trim_" + $$5;
            akh $$8 = new akh($$7).d("trims/items/");
            if ($$0.h().a(cqq.a)) {
               this.a($$6, $$2, $$3, $$8);
            } else {
               this.a($$6, $$2, $$8);
            }
         }
      }
   }

   public void a() {
      this.a(ctc.oc, nt.bx);
      this.a(ctc.oe, nt.bx);
      this.a(ctc.od, nt.bx);
      this.a(ctc.of, nt.bx);
      this.a(ctc.oC, nt.bx);
      this.a(ctc.ot, nt.bx);
      this.a(ctc.oq, nt.bx);
      this.a(ctc.uF, nt.bx);
      this.a(ctc.ov, nt.bx);
      this.a(ctc.uh, nt.bx);
      this.a(ctc.dR, nt.bz);
      this.a(ctc.sa, nt.bx);
      this.a(ctc.vk, nt.bx);
      this.a(ctc.vm, nt.bx);
      this.a(ctc.nY, nt.bx);
      this.a(ctc.nZ, nt.bx);
      this.a(ctc.rx, nt.bx);
      this.a(ctc.so, nt.bx);
      this.a(ctc.sg, nt.bz);
      this.a(ctc.rt, nt.bx);
      this.a(ctc.ry, nt.bx);
      this.a(ctc.qP, nt.bx);
      this.a(ctc.pq, nt.bx);
      this.a(ctc.px, nt.bx);
      this.a(ctc.qL, nt.bx);
      this.a(ctc.yB, nt.bx);
      this.a(ctc.ru, nt.bx);
      this.a(ctc.qy, nt.bx);
      this.a(ctc.nR, nt.bA);
      this.a(ctc.nS, nt.bA);
      this.a(ctc.ox, nt.bx);
      this.a(ctc.nN, nt.bx);
      this.a(ctc.sc, nt.bx);
      this.a(ctc.vg, nt.bx);
      this.a(ctc.qM, nt.bx);
      this.c(ctc.qW);
      this.a(ctc.ow, nt.bx);
      this.a(ctc.qH, nt.bx);
      this.a(ctc.uM, nt.bx);
      this.b(ctc.qS);
      this.b(ctc.qT);
      this.a(ctc.sb, nt.bx);
      this.a(ctc.sd, nt.bx);
      this.a(ctc.rd, nt.bx);
      this.a(ctc.uO, nt.bx);
      this.a(ctc.pY, nt.bx);
      this.a(ctc.uB, nt.bx);
      this.a(ctc.re, nt.bx);
      this.a(ctc.rS, nt.bx);
      this.a(ctc.oF, nt.bx);
      this.a(ctc.oG, nt.bx);
      this.a(ctc.vX, nt.bx);
      this.a(ctc.rr, nt.bx);
      this.a(ctc.og, nt.bx);
      this.a(ctc.oh, nt.bx);
      this.a(ctc.oy, nt.bx);
      this.a(ctc.pi, nt.bz);
      this.a(ctc.pj, nt.bz);
      this.a(ctc.uI, nt.bx);
      this.a(ctc.ph, nt.bz);
      this.a(ctc.pg, nt.bz);
      this.a(ctc.pf, nt.bz);
      this.a(ctc.vn, nt.bx);
      this.a(ctc.rX, nt.bx);
      this.a(ctc.qR, nt.bx);
      this.a(ctc.oz, nt.bx);
      this.a(ctc.uw, nt.bx);
      this.a(ctc.ss, nt.bx);
      this.a(ctc.sf, nt.bx);
      this.a(ctc.vf, nt.bx);
      this.a(ctc.tW, nt.bx);
      this.a(ctc.sn, nt.bx);
      this.a(ctc.uu, nt.bx);
      this.a(ctc.tX, nt.bx);
      this.a(ctc.pW, nt.bx);
      this.a(ctc.os, nt.bx);
      this.a(ctc.wc, nt.bx);
      this.a(ctc.vW, nt.bx);
      this.a(ctc.nO, nt.bx);
      this.a(ctc.sh, nt.bx);
      this.a(ctc.sl, nt.bx);
      this.a(ctc.st, nt.bx);
      this.a(ctc.wa, nt.bx);
      this.a(ctc.ws, nt.bx);
      this.a(ctc.qY, nt.bx);
      this.a(ctc.rg, nt.bx);
      this.a(ctc.ud, nt.bx);
      this.a(ctc.oH, nt.bx);
      this.a(ctc.qa, nt.bx);
      this.a(ctc.oY, nt.bz);
      this.a(ctc.uk, nt.bx);
      this.a(ctc.oZ, nt.bz);
      this.a(ctc.uH, nt.bx);
      this.a(ctc.oX, nt.bz);
      this.a(ctc.oW, nt.bz);
      this.a(ctc.oV, nt.bz);
      this.a(ctc.oI, nt.bx);
      this.a(ctc.si, nt.bx);
      this.a(ctc.rp, nt.bx);
      this.a(ctc.rv, nt.bx);
      this.a(ctc.pu, nt.bx);
      this.a(ctc.wd, nt.bx);
      this.a(ctc.vS, nt.bx);
      this.a(ctc.ww, nt.bx);
      this.a(ctc.wz, nt.bx);
      this.a(ctc.nQ, nt.bx);
      this.a(ctc.rf, nt.bx);
      this.a(ctc.oD, nt.bx);
      this.a(ctc.pd, nt.bz);
      this.a(ctc.pe, nt.bz);
      this.a(ctc.uG, nt.bx);
      this.a(ctc.oE, nt.bx);
      this.a(ctc.vv, nt.bx);
      this.a(ctc.pc, nt.bz);
      this.a(ctc.pb, nt.bz);
      this.a(ctc.pa, nt.bz);
      this.a(ctc.uc, nt.bx);
      this.a(ctc.oa, nt.bx);
      this.a(ctc.ob, nt.bx);
      this.a(ctc.vw, nt.bx);
      this.a(ctc.oA, nt.bx);
      this.a(ctc.qA, nt.bx);
      this.a(ctc.qD, nt.bx);
      this.a(ctc.uJ, nt.bx);
      this.a(ctc.rl, nt.bx);
      this.a(ctc.rq, nt.bx);
      this.a(ctc.rn, nt.bx);
      this.a(ctc.rk, nt.bx);
      this.a(ctc.sp, nt.bx);
      this.a(ctc.oi, nt.bx);
      this.a(ctc.oj, nt.bx);
      this.a(ctc.ok, nt.bx);
      this.a(ctc.ol, nt.bx);
      this.a(ctc.uj, nt.bx);
      this.a(ctc.rW, nt.bx);
      this.a(ctc.qE, nt.bx);
      this.a(ctc.nM, nt.bx);
      this.a(ctc.vZ, nt.bx);
      this.a(ctc.pr, nt.bx);
      this.a(ctc.vO, nt.bx);
      this.a(ctc.vI, nt.by);
      this.a(ctc.vy, nt.by);
      this.a(ctc.vA, nt.by);
      this.a(ctc.vz, nt.by);
      this.a(ctc.vB, nt.by);
      this.a(ctc.vC, nt.by);
      this.a(ctc.vD, nt.by);
      this.a(ctc.vE, nt.by);
      this.a(ctc.vN, nt.by);
      this.a(ctc.vF, nt.by);
      this.a(ctc.vG, nt.by);
      this.a(ctc.vJ, nt.by);
      this.a(ctc.vH, nt.by);
      this.a(ctc.vK, nt.by);
      this.a(ctc.vL, nt.by);
      this.a(ctc.vM, nt.by);
      this.a(ctc.uN, nt.bx);
      this.a(ctc.uL, nt.bx);
      this.a(ctc.vR, nt.bx);
      this.a(ctc.pn, nt.bz);
      this.a(ctc.po, nt.bz);
      this.a(ctc.oJ, nt.bx);
      this.a(ctc.pm, nt.bz);
      this.a(ctc.oK, nt.bx);
      this.a(ctc.pl, nt.bz);
      this.a(ctc.pk, nt.bz);
      this.a(ctc.ux, nt.bx);
      this.a(ctc.us, nt.bx);
      this.a(ctc.nU, nt.bx);
      this.a(ctc.nV, nt.bx);
      this.a(ctc.rj, nt.bx);
      this.a(ctc.pZ, nt.bx);
      this.a(ctc.qO, nt.bx);
      this.a(ctc.vQ, nt.bx);
      this.a(ctc.wb, nt.bx);
      this.a(ctc.ro, nt.bx);
      this.a(ctc.ui, nt.bx);
      this.a(ctc.vh, nt.bx);
      this.a(ctc.pX, nt.bx);
      this.a(ctc.qB, nt.bx);
      this.a(ctc.uz, nt.bx);
      this.a(ctc.uy, nt.bx);
      this.a(ctc.rc, nt.bx);
      this.a(ctc.qF, nt.bx);
      this.a(ctc.ut, nt.bx);
      this.a(ctc.rs, nt.bx);
      this.a(ctc.oB, nt.bx);
      this.a(ctc.uA, nt.bx);
      this.a(ctc.uD, nt.bx);
      this.a(ctc.uE, nt.bx);
      this.a(ctc.uC, nt.bx);
      this.a(ctc.rw, nt.bx);
      this.a(ctc.se, nt.bx);
      this.a(ctc.nL, nt.bx);
      this.a(ctc.ra, nt.bx);
      this.a(ctc.qG, nt.bx);
      this.a(ctc.op, nt.bx);
      this.a(ctc.rV, nt.bx);
      this.a(ctc.vu, nt.bx);
      this.a(ctc.vY, nt.bx);
      this.a(ctc.qQ, nt.bx);
      this.a(ctc.qC, nt.bx);
      this.a(ctc.xq, nt.bx);
      this.a(ctc.vp, nt.bx);
      this.a(ctc.sm, nt.bx);
      this.a(ctc.nW, nt.bx);
      this.a(ctc.nX, nt.bx);
      this.a(ctc.qX, nt.bx);
      this.a(ctc.pp, nt.bz);
      this.a(ctc.oT, nt.bz);
      this.a(ctc.oU, nt.bz);
      this.a(ctc.oS, nt.bz);
      this.a(ctc.oR, nt.bz);
      this.a(ctc.oQ, nt.bz);
      this.a(ctc.rA, nt.bx);
      this.a(ctc.vU, nt.bx);
      this.a(ctc.nP, nt.bx);
      this.a(ctc.vt, nt.bx);
      this.a(ctc.vP, nt.bx);
      this.a(ctc.rb, nt.bx);
      this.a(ctc.qI, nt.bx);
      this.a(ctc.qJ, nt.bx);
      this.a(ctc.qK, nt.bx);
      this.a(ctc.qz, nt.bx);
      this.a(ctc.pw, nt.bx);
      this.a(ctc.ri, nt.bx);
      this.a(ctc.tY, nt.bx);
      this.a(ctc.ub, nt.bO);
      this.a(ctc.or);
      this.a(ctc.oO, nt.bz);
      this.a(ctc.oP, nt.bz);
      this.a(ctc.oN, nt.bz);
      this.a(ctc.oM, nt.bz);
      this.a(ctc.oL, nt.bz);
      this.a(ctc.tZ, nt.bx);
      this.a(ctc.ua, nt.bx);
      this.a(ctc.rm, nt.bx);
      this.a(ctc.xs, nt.bx);
      this.a(ctc.xt, nt.bx);
      this.a(ctc.xu, nt.bx);
      this.a(ctc.xv, nt.bx);
      this.a(ctc.xw, nt.bx);
      this.a(ctc.xx, nt.bx);
      this.a(ctc.xy, nt.bx);
      this.a(ctc.xz, nt.bx);
      this.a(ctc.xA, nt.bx);
      this.a(ctc.xB, nt.bx);
      this.a(ctc.xC, nt.bx);
      this.a(ctc.xD, nt.bx);
      this.a(ctc.xE, nt.bx);
      this.a(ctc.xF, nt.bx);
      this.a(ctc.xG, nt.bx);
      this.a(ctc.xH, nt.bx);
      this.a(ctc.xI, nt.bx);
      this.a(ctc.xJ, nt.bx);
      this.a(ctc.xK, nt.bx);
      this.a(ctc.vx, ctc.pp, nt.bz);
      this.a(ctc.qb, ctc.qa, nt.bx);

      for (csu $$0 : ld.h) {
         if ($$0 instanceof cqo $$1) {
            this.a($$1);
         }
      }

      this.a(ctc.xL, nt.bx);
      this.a(ctc.xM, nt.bx);
      this.a(ctc.xN, nt.bx);
      this.a(ctc.xO, nt.bx);
      this.a(ctc.xP, nt.bx);
      this.a(ctc.xQ, nt.bx);
      this.a(ctc.xR, nt.bx);
      this.a(ctc.xS, nt.bx);
      this.a(ctc.xT, nt.bx);
      this.a(ctc.xU, nt.bx);
      this.a(ctc.xV, nt.bx);
      this.a(ctc.xW, nt.bx);
      this.a(ctc.xX, nt.bx);
      this.a(ctc.xY, nt.bx);
      this.a(ctc.xZ, nt.bx);
      this.a(ctc.ya, nt.bx);
      this.a(ctc.yb, nt.bx);
      this.a(ctc.yc, nt.bx);
      this.a(ctc.yd, nt.bx);
      this.a(ctc.ye, nt.bx);
      this.a(ctc.yf, nt.bx);
      this.a(ctc.yg, nt.bx);
      this.a(ctc.yh, nt.bx);
      this.a(ctc.yz, nt.bx);
   }

   static record a(String a, float b, Map<iw<cqp>, String> c) {
      public String a(iw<cqp> $$0) {
         return this.c.getOrDefault($$0, this.a);
      }
   }
}
