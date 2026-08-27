import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Supplier;

public class kr {
   public static final acq a = new acq("trim_type");
   private static final List<kr.a> b = List.of(
      new kr.a("quartz", 0.1F, Map.of()),
      new kr.a("iron", 0.2F, Map.of(cdl.c, "iron_darker")),
      new kr.a("netherite", 0.3F, Map.of(cdl.g, "netherite_darker")),
      new kr.a("redstone", 0.4F, Map.of()),
      new kr.a("copper", 0.5F, Map.of()),
      new kr.a("gold", 0.6F, Map.of(cdl.d, "gold_darker")),
      new kr.a("emerald", 0.7F, Map.of()),
      new kr.a("diamond", 0.8F, Map.of(cdl.e, "diamond_darker")),
      new kr.a("lapis", 0.9F, Map.of()),
      new kr.a("amethyst", 1.0F, Map.of())
   );
   private final BiConsumer<acq, Supplier<JsonElement>> c;

   public kr(BiConsumer<acq, Supplier<JsonElement>> $$0) {
      this.c = $$0;
   }

   private void a(cfu $$0, lf $$1) {
      $$1.a(le.a($$0), lh.b($$0), this.c);
   }

   private void a(cfu $$0, String $$1, lf $$2) {
      $$2.a(le.a($$0, $$1), lh.k(lh.a($$0, $$1)), this.c);
   }

   private void a(cfu $$0, cfu $$1, lf $$2) {
      $$2.a(le.a($$0), lh.b($$1), this.c);
   }

   private void a(cfu $$0) {
      for (int $$1 = 0; $$1 < 32; $$1++) {
         if ($$1 != 16) {
            this.a($$0, String.format(Locale.ROOT, "_%02d", $$1), lg.bv);
         }
      }
   }

   private void b(cfu $$0) {
      for (int $$1 = 1; $$1 < 64; $$1++) {
         this.a($$0, String.format(Locale.ROOT, "_%02d", $$1), lg.bv);
      }
   }

   private void a(acq $$0, acq $$1, acq $$2) {
      lg.bz.a($$0, lh.c($$1, $$2), this.c);
   }

   private void a(acq $$0, acq $$1, acq $$2, acq $$3) {
      lg.bA.a($$0, lh.a($$1, $$2, $$3), this.c);
   }

   private acq a(acq $$0, String $$1) {
      return $$0.e("_" + $$1 + "_trim");
   }

   private JsonObject a(acq $$0, Map<li, acq> $$1, cdk $$2) {
      JsonObject $$3 = lg.bz.a($$0, $$1);
      JsonArray $$4 = new JsonArray();

      for (kr.a $$5 : b) {
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

   private void a(cdj $$0) {
      acq $$1 = le.a($$0);
      acq $$2 = lh.c($$0);
      acq $$3 = lh.a($$0, "_overlay");
      if ($$0.d() == cdl.a) {
         lg.bz.a($$1, lh.c($$2, $$3), this.c, ($$1x, $$2x) -> this.a($$1x, $$2x, $$0.d()));
      } else {
         lg.bv.a($$1, lh.k($$2), this.c, ($$1x, $$2x) -> this.a($$1x, $$2x, $$0.d()));
      }

      for (kr.a $$4 : b) {
         String $$5 = $$4.a($$0.d());
         acq $$6 = this.a($$1, $$5);
         String $$7 = $$0.b().b() + "_trim_" + $$5;
         acq $$8 = new acq($$7).d("trims/items/");
         if ($$0.d() == cdl.a) {
            this.a($$6, $$2, $$3, $$8);
         } else {
            this.a($$6, $$2, $$8);
         }
      }
   }

   public void a() {
      this.a(cgc.nq, lg.bv);
      this.a(cgc.ns, lg.bv);
      this.a(cgc.nr, lg.bv);
      this.a(cgc.nt, lg.bv);
      this.a(cgc.nO, lg.bv);
      this.a(cgc.nF, lg.bv);
      this.a(cgc.tL, lg.bv);
      this.a(cgc.nH, lg.bv);
      this.a(cgc.tn, lg.bv);
      this.a(cgc.dv, lg.bx);
      this.a(cgc.rl, lg.bv);
      this.a(cgc.uq, lg.bv);
      this.a(cgc.us, lg.bv);
      this.a(cgc.nm, lg.bv);
      this.a(cgc.nn, lg.bv);
      this.a(cgc.qJ, lg.bv);
      this.a(cgc.rz, lg.bv);
      this.a(cgc.rr, lg.bx);
      this.a(cgc.qF, lg.bv);
      this.a(cgc.qK, lg.bv);
      this.a(cgc.qb, lg.bv);
      this.a(cgc.oC, lg.bv);
      this.a(cgc.oJ, lg.bv);
      this.a(cgc.pX, lg.bv);
      this.a(cgc.qG, lg.bv);
      this.a(cgc.pK, lg.bv);
      this.a(cgc.nf, lg.by);
      this.a(cgc.ng, lg.by);
      this.a(cgc.nJ, lg.bv);
      this.a(cgc.nb, lg.bv);
      this.a(cgc.rn, lg.bv);
      this.a(cgc.um, lg.bv);
      this.a(cgc.pY, lg.bv);
      this.b(cgc.qi);
      this.a(cgc.nI, lg.bv);
      this.a(cgc.pT, lg.bv);
      this.a(cgc.tS, lg.bv);
      this.a(cgc.qe);
      this.a(cgc.qf);
      this.a(cgc.rm, lg.bv);
      this.a(cgc.ro, lg.bv);
      this.a(cgc.qp, lg.bv);
      this.a(cgc.tU, lg.bv);
      this.a(cgc.pk, lg.bv);
      this.a(cgc.tH, lg.bv);
      this.a(cgc.qq, lg.bv);
      this.a(cgc.re, lg.bv);
      this.a(cgc.nR, lg.bv);
      this.a(cgc.nS, lg.bv);
      this.a(cgc.vd, lg.bv);
      this.a(cgc.qD, lg.bv);
      this.a(cgc.nu, lg.bv);
      this.a(cgc.nv, lg.bv);
      this.a(cgc.nK, lg.bv);
      this.a(cgc.ou, lg.bx);
      this.a(cgc.ov, lg.bx);
      this.a(cgc.tO, lg.bv);
      this.a(cgc.ot, lg.bx);
      this.a(cgc.os, lg.bx);
      this.a(cgc.or, lg.bx);
      this.a(cgc.ut, lg.bv);
      this.a(cgc.ri, lg.bv);
      this.a(cgc.qd, lg.bv);
      this.a(cgc.nL, lg.bv);
      this.a(cgc.tC, lg.bv);
      this.a(cgc.rD, lg.bv);
      this.a(cgc.rq, lg.bv);
      this.a(cgc.ul, lg.bv);
      this.a(cgc.te, lg.bv);
      this.a(cgc.ry, lg.bv);
      this.a(cgc.tA, lg.bv);
      this.a(cgc.tf, lg.bv);
      this.a(cgc.pi, lg.bv);
      this.a(cgc.nE, lg.bv);
      this.a(cgc.vc, lg.bv);
      this.a(cgc.nc, lg.bv);
      this.a(cgc.rs, lg.bv);
      this.a(cgc.rw, lg.bv);
      this.a(cgc.rE, lg.bv);
      this.a(cgc.vg, lg.bv);
      this.a(cgc.vw, lg.bv);
      this.a(cgc.qk, lg.bv);
      this.a(cgc.qs, lg.bv);
      this.a(cgc.tj, lg.bv);
      this.a(cgc.nT, lg.bv);
      this.a(cgc.pm, lg.bv);
      this.a(cgc.ok, lg.bx);
      this.a(cgc.tq, lg.bv);
      this.a(cgc.ol, lg.bx);
      this.a(cgc.tN, lg.bv);
      this.a(cgc.oj, lg.bx);
      this.a(cgc.oi, lg.bx);
      this.a(cgc.oh, lg.bx);
      this.a(cgc.nU, lg.bv);
      this.a(cgc.rt, lg.bv);
      this.a(cgc.qB, lg.bv);
      this.a(cgc.qH, lg.bv);
      this.a(cgc.oG, lg.bv);
      this.a(cgc.uY, lg.bv);
      this.a(cgc.vA, lg.bv);
      this.a(cgc.vD, lg.bv);
      this.a(cgc.ne, lg.bv);
      this.a(cgc.qr, lg.bv);
      this.a(cgc.nP, lg.bv);
      this.a(cgc.op, lg.bx);
      this.a(cgc.oq, lg.bx);
      this.a(cgc.tM, lg.bv);
      this.a(cgc.nQ, lg.bv);
      this.a(cgc.uB, lg.bv);
      this.a(cgc.oo, lg.bx);
      this.a(cgc.on, lg.bx);
      this.a(cgc.om, lg.bx);
      this.a(cgc.ti, lg.bv);
      this.a(cgc.no, lg.bv);
      this.a(cgc.np, lg.bv);
      this.a(cgc.uC, lg.bv);
      this.a(cgc.nM, lg.bv);
      this.a(cgc.pM, lg.bv);
      this.a(cgc.pP, lg.bv);
      this.a(cgc.tP, lg.bv);
      this.a(cgc.qx, lg.bv);
      this.a(cgc.qC, lg.bv);
      this.a(cgc.qz, lg.bv);
      this.a(cgc.qw, lg.bv);
      this.a(cgc.rA, lg.bv);
      this.a(cgc.nw, lg.bv);
      this.a(cgc.nx, lg.bv);
      this.a(cgc.ny, lg.bv);
      this.a(cgc.nz, lg.bv);
      this.a(cgc.tp, lg.bv);
      this.a(cgc.rh, lg.bv);
      this.a(cgc.pQ, lg.bv);
      this.a(cgc.na, lg.bv);
      this.a(cgc.vf, lg.bv);
      this.a(cgc.oD, lg.bv);
      this.a(cgc.uU, lg.bv);
      this.a(cgc.uO, lg.bw);
      this.a(cgc.uE, lg.bw);
      this.a(cgc.uG, lg.bw);
      this.a(cgc.uF, lg.bw);
      this.a(cgc.uH, lg.bw);
      this.a(cgc.uI, lg.bw);
      this.a(cgc.uJ, lg.bw);
      this.a(cgc.uK, lg.bw);
      this.a(cgc.uT, lg.bw);
      this.a(cgc.uL, lg.bw);
      this.a(cgc.uM, lg.bw);
      this.a(cgc.uP, lg.bw);
      this.a(cgc.uN, lg.bw);
      this.a(cgc.uQ, lg.bw);
      this.a(cgc.uR, lg.bw);
      this.a(cgc.uS, lg.bw);
      this.a(cgc.tT, lg.bv);
      this.a(cgc.tR, lg.bv);
      this.a(cgc.uX, lg.bv);
      this.a(cgc.oz, lg.bx);
      this.a(cgc.oA, lg.bx);
      this.a(cgc.nV, lg.bv);
      this.a(cgc.oy, lg.bx);
      this.a(cgc.nW, lg.bv);
      this.a(cgc.ox, lg.bx);
      this.a(cgc.ow, lg.bx);
      this.a(cgc.tD, lg.bv);
      this.a(cgc.ty, lg.bv);
      this.a(cgc.ni, lg.bv);
      this.a(cgc.nj, lg.bv);
      this.a(cgc.qv, lg.bv);
      this.a(cgc.pl, lg.bv);
      this.a(cgc.qa, lg.bv);
      this.a(cgc.uW, lg.bv);
      this.a(cgc.vh, lg.bv);
      this.a(cgc.qA, lg.bv);
      this.a(cgc.to, lg.bv);
      this.a(cgc.un, lg.bv);
      this.a(cgc.pj, lg.bv);
      this.a(cgc.pN, lg.bv);
      this.a(cgc.tF, lg.bv);
      this.a(cgc.tE, lg.bv);
      this.a(cgc.qo, lg.bv);
      this.a(cgc.pR, lg.bv);
      this.a(cgc.tz, lg.bv);
      this.a(cgc.qE, lg.bv);
      this.a(cgc.nN, lg.bv);
      this.a(cgc.tG, lg.bv);
      this.a(cgc.tJ, lg.bv);
      this.a(cgc.tK, lg.bv);
      this.a(cgc.tI, lg.bv);
      this.a(cgc.qI, lg.bv);
      this.a(cgc.rp, lg.bv);
      this.a(cgc.mZ, lg.bv);
      this.a(cgc.qm, lg.bv);
      this.a(cgc.pS, lg.bv);
      this.a(cgc.nD, lg.bv);
      this.a(cgc.rg, lg.bv);
      this.a(cgc.uA, lg.bv);
      this.a(cgc.ve, lg.bv);
      this.a(cgc.qc, lg.bv);
      this.a(cgc.pO, lg.bv);
      this.a(cgc.wu, lg.bv);
      this.a(cgc.uv, lg.bv);
      this.a(cgc.rx, lg.bv);
      this.a(cgc.nk, lg.bv);
      this.a(cgc.nl, lg.bv);
      this.a(cgc.qj, lg.bv);
      this.a(cgc.oB, lg.bx);
      this.a(cgc.of, lg.bx);
      this.a(cgc.og, lg.bx);
      this.a(cgc.oe, lg.bx);
      this.a(cgc.od, lg.bx);
      this.a(cgc.oc, lg.bx);
      this.a(cgc.qM, lg.bv);
      this.a(cgc.va, lg.bv);
      this.a(cgc.nd, lg.bv);
      this.a(cgc.uz, lg.bv);
      this.a(cgc.uV, lg.bv);
      this.a(cgc.qn, lg.bv);
      this.a(cgc.pU, lg.bv);
      this.a(cgc.pV, lg.bv);
      this.a(cgc.pW, lg.bv);
      this.a(cgc.pL, lg.bv);
      this.a(cgc.oI, lg.bv);
      this.a(cgc.qu, lg.bv);
      this.a(cgc.oa, lg.bx);
      this.a(cgc.ob, lg.bx);
      this.a(cgc.nZ, lg.bx);
      this.a(cgc.nY, lg.bx);
      this.a(cgc.nX, lg.bx);
      this.a(cgc.tg, lg.bv);
      this.a(cgc.th, lg.bv);
      this.a(cgc.qy, lg.bv);
      this.a(cgc.ww, lg.bv);
      this.a(cgc.wx, lg.bv);
      this.a(cgc.wy, lg.bv);
      this.a(cgc.wz, lg.bv);
      this.a(cgc.wA, lg.bv);
      this.a(cgc.wB, lg.bv);
      this.a(cgc.wC, lg.bv);
      this.a(cgc.wD, lg.bv);
      this.a(cgc.wE, lg.bv);
      this.a(cgc.wF, lg.bv);
      this.a(cgc.wG, lg.bv);
      this.a(cgc.wH, lg.bv);
      this.a(cgc.wI, lg.bv);
      this.a(cgc.wJ, lg.bv);
      this.a(cgc.wK, lg.bv);
      this.a(cgc.wL, lg.bv);
      this.a(cgc.wM, lg.bv);
      this.a(cgc.uD, cgc.oB, lg.bx);
      this.a(cgc.pn, cgc.pm, lg.bv);

      for (cfu $$0 : jb.i) {
         if ($$0 instanceof cdj $$1) {
            this.a($$1);
         }
      }

      this.a(cgc.wN, lg.bv);
      this.a(cgc.wO, lg.bv);
      this.a(cgc.wP, lg.bv);
      this.a(cgc.wQ, lg.bv);
      this.a(cgc.wR, lg.bv);
      this.a(cgc.wS, lg.bv);
      this.a(cgc.wT, lg.bv);
      this.a(cgc.wU, lg.bv);
      this.a(cgc.wV, lg.bv);
      this.a(cgc.wW, lg.bv);
      this.a(cgc.wX, lg.bv);
      this.a(cgc.wY, lg.bv);
      this.a(cgc.wZ, lg.bv);
      this.a(cgc.xa, lg.bv);
      this.a(cgc.xb, lg.bv);
      this.a(cgc.xc, lg.bv);
      this.a(cgc.xd, lg.bv);
      this.a(cgc.xe, lg.bv);
      this.a(cgc.xf, lg.bv);
      this.a(cgc.xg, lg.bv);
   }

   static record a(String a, float b, Map<cdk, String> c) {
      public String a(cdk $$0) {
         return this.c.getOrDefault($$0, this.a);
      }
   }
}
