import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Supplier;

public class ks {
   public static final aep a = new aep("trim_type");
   private static final List<ks.a> b = List.of(
      new ks.a("quartz", 0.1F, Map.of()),
      new ks.a("iron", 0.2F, Map.of(cgi.c, "iron_darker")),
      new ks.a("netherite", 0.3F, Map.of(cgi.g, "netherite_darker")),
      new ks.a("redstone", 0.4F, Map.of()),
      new ks.a("copper", 0.5F, Map.of()),
      new ks.a("gold", 0.6F, Map.of(cgi.d, "gold_darker")),
      new ks.a("emerald", 0.7F, Map.of()),
      new ks.a("diamond", 0.8F, Map.of(cgi.e, "diamond_darker")),
      new ks.a("lapis", 0.9F, Map.of()),
      new ks.a("amethyst", 1.0F, Map.of())
   );
   private final BiConsumer<aep, Supplier<JsonElement>> c;

   public ks(BiConsumer<aep, Supplier<JsonElement>> $$0) {
      this.c = $$0;
   }

   private void a(cir $$0, lg $$1) {
      $$1.a(lf.a($$0), li.b($$0), this.c);
   }

   private void a(cir $$0, String $$1, lg $$2) {
      $$2.a(lf.a($$0, $$1), li.k(li.a($$0, $$1)), this.c);
   }

   private void a(cir $$0, cir $$1, lg $$2) {
      $$2.a(lf.a($$0), li.b($$1), this.c);
   }

   private void a(cir $$0) {
      for (int $$1 = 0; $$1 < 32; $$1++) {
         if ($$1 != 16) {
            this.a($$0, String.format(Locale.ROOT, "_%02d", $$1), lh.bv);
         }
      }
   }

   private void b(cir $$0) {
      for (int $$1 = 1; $$1 < 64; $$1++) {
         this.a($$0, String.format(Locale.ROOT, "_%02d", $$1), lh.bv);
      }
   }

   private void a(aep $$0, aep $$1, aep $$2) {
      lh.bz.a($$0, li.c($$1, $$2), this.c);
   }

   private void a(aep $$0, aep $$1, aep $$2, aep $$3) {
      lh.bA.a($$0, li.a($$1, $$2, $$3), this.c);
   }

   private aep a(aep $$0, String $$1) {
      return $$0.e("_" + $$1 + "_trim");
   }

   private JsonObject a(aep $$0, Map<lj, aep> $$1, cgh $$2) {
      JsonObject $$3 = lh.bz.a($$0, $$1);
      JsonArray $$4 = new JsonArray();

      for (ks.a $$5 : b) {
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

   private void a(cgg $$0) {
      aep $$1 = lf.a($$0);
      aep $$2 = li.c($$0);
      aep $$3 = li.a($$0, "_overlay");
      if ($$0.d() == cgi.a) {
         lh.bz.a($$1, li.c($$2, $$3), this.c, ($$1x, $$2x) -> this.a($$1x, $$2x, $$0.d()));
      } else {
         lh.bv.a($$1, li.k($$2), this.c, ($$1x, $$2x) -> this.a($$1x, $$2x, $$0.d()));
      }

      for (ks.a $$4 : b) {
         String $$5 = $$4.a($$0.d());
         aep $$6 = this.a($$1, $$5);
         String $$7 = $$0.b().b() + "_trim_" + $$5;
         aep $$8 = new aep($$7).d("trims/items/");
         if ($$0.d() == cgi.a) {
            this.a($$6, $$2, $$3, $$8);
         } else {
            this.a($$6, $$2, $$8);
         }
      }
   }

   public void a() {
      this.a(ciz.nq, lh.bv);
      this.a(ciz.ns, lh.bv);
      this.a(ciz.nr, lh.bv);
      this.a(ciz.nt, lh.bv);
      this.a(ciz.nO, lh.bv);
      this.a(ciz.nF, lh.bv);
      this.a(ciz.tL, lh.bv);
      this.a(ciz.nH, lh.bv);
      this.a(ciz.tn, lh.bv);
      this.a(ciz.dv, lh.bx);
      this.a(ciz.rl, lh.bv);
      this.a(ciz.uq, lh.bv);
      this.a(ciz.us, lh.bv);
      this.a(ciz.nm, lh.bv);
      this.a(ciz.nn, lh.bv);
      this.a(ciz.qJ, lh.bv);
      this.a(ciz.rz, lh.bv);
      this.a(ciz.rr, lh.bx);
      this.a(ciz.qF, lh.bv);
      this.a(ciz.qK, lh.bv);
      this.a(ciz.qb, lh.bv);
      this.a(ciz.oC, lh.bv);
      this.a(ciz.oJ, lh.bv);
      this.a(ciz.pX, lh.bv);
      this.a(ciz.qG, lh.bv);
      this.a(ciz.pK, lh.bv);
      this.a(ciz.nf, lh.by);
      this.a(ciz.ng, lh.by);
      this.a(ciz.nJ, lh.bv);
      this.a(ciz.nb, lh.bv);
      this.a(ciz.rn, lh.bv);
      this.a(ciz.um, lh.bv);
      this.a(ciz.pY, lh.bv);
      this.b(ciz.qi);
      this.a(ciz.nI, lh.bv);
      this.a(ciz.pT, lh.bv);
      this.a(ciz.tS, lh.bv);
      this.a(ciz.qe);
      this.a(ciz.qf);
      this.a(ciz.rm, lh.bv);
      this.a(ciz.ro, lh.bv);
      this.a(ciz.qp, lh.bv);
      this.a(ciz.tU, lh.bv);
      this.a(ciz.pk, lh.bv);
      this.a(ciz.tH, lh.bv);
      this.a(ciz.qq, lh.bv);
      this.a(ciz.re, lh.bv);
      this.a(ciz.nR, lh.bv);
      this.a(ciz.nS, lh.bv);
      this.a(ciz.vd, lh.bv);
      this.a(ciz.qD, lh.bv);
      this.a(ciz.nu, lh.bv);
      this.a(ciz.nv, lh.bv);
      this.a(ciz.nK, lh.bv);
      this.a(ciz.ou, lh.bx);
      this.a(ciz.ov, lh.bx);
      this.a(ciz.tO, lh.bv);
      this.a(ciz.ot, lh.bx);
      this.a(ciz.os, lh.bx);
      this.a(ciz.or, lh.bx);
      this.a(ciz.ut, lh.bv);
      this.a(ciz.ri, lh.bv);
      this.a(ciz.qd, lh.bv);
      this.a(ciz.nL, lh.bv);
      this.a(ciz.tC, lh.bv);
      this.a(ciz.rD, lh.bv);
      this.a(ciz.rq, lh.bv);
      this.a(ciz.ul, lh.bv);
      this.a(ciz.te, lh.bv);
      this.a(ciz.ry, lh.bv);
      this.a(ciz.tA, lh.bv);
      this.a(ciz.tf, lh.bv);
      this.a(ciz.pi, lh.bv);
      this.a(ciz.nE, lh.bv);
      this.a(ciz.vc, lh.bv);
      this.a(ciz.nc, lh.bv);
      this.a(ciz.rs, lh.bv);
      this.a(ciz.rw, lh.bv);
      this.a(ciz.rE, lh.bv);
      this.a(ciz.vg, lh.bv);
      this.a(ciz.vw, lh.bv);
      this.a(ciz.qk, lh.bv);
      this.a(ciz.qs, lh.bv);
      this.a(ciz.tj, lh.bv);
      this.a(ciz.nT, lh.bv);
      this.a(ciz.pm, lh.bv);
      this.a(ciz.ok, lh.bx);
      this.a(ciz.tq, lh.bv);
      this.a(ciz.ol, lh.bx);
      this.a(ciz.tN, lh.bv);
      this.a(ciz.oj, lh.bx);
      this.a(ciz.oi, lh.bx);
      this.a(ciz.oh, lh.bx);
      this.a(ciz.nU, lh.bv);
      this.a(ciz.rt, lh.bv);
      this.a(ciz.qB, lh.bv);
      this.a(ciz.qH, lh.bv);
      this.a(ciz.oG, lh.bv);
      this.a(ciz.uY, lh.bv);
      this.a(ciz.vA, lh.bv);
      this.a(ciz.vD, lh.bv);
      this.a(ciz.ne, lh.bv);
      this.a(ciz.qr, lh.bv);
      this.a(ciz.nP, lh.bv);
      this.a(ciz.op, lh.bx);
      this.a(ciz.oq, lh.bx);
      this.a(ciz.tM, lh.bv);
      this.a(ciz.nQ, lh.bv);
      this.a(ciz.uB, lh.bv);
      this.a(ciz.oo, lh.bx);
      this.a(ciz.on, lh.bx);
      this.a(ciz.om, lh.bx);
      this.a(ciz.ti, lh.bv);
      this.a(ciz.no, lh.bv);
      this.a(ciz.np, lh.bv);
      this.a(ciz.uC, lh.bv);
      this.a(ciz.nM, lh.bv);
      this.a(ciz.pM, lh.bv);
      this.a(ciz.pP, lh.bv);
      this.a(ciz.tP, lh.bv);
      this.a(ciz.qx, lh.bv);
      this.a(ciz.qC, lh.bv);
      this.a(ciz.qz, lh.bv);
      this.a(ciz.qw, lh.bv);
      this.a(ciz.rA, lh.bv);
      this.a(ciz.nw, lh.bv);
      this.a(ciz.nx, lh.bv);
      this.a(ciz.ny, lh.bv);
      this.a(ciz.nz, lh.bv);
      this.a(ciz.tp, lh.bv);
      this.a(ciz.rh, lh.bv);
      this.a(ciz.pQ, lh.bv);
      this.a(ciz.na, lh.bv);
      this.a(ciz.vf, lh.bv);
      this.a(ciz.oD, lh.bv);
      this.a(ciz.uU, lh.bv);
      this.a(ciz.uO, lh.bw);
      this.a(ciz.uE, lh.bw);
      this.a(ciz.uG, lh.bw);
      this.a(ciz.uF, lh.bw);
      this.a(ciz.uH, lh.bw);
      this.a(ciz.uI, lh.bw);
      this.a(ciz.uJ, lh.bw);
      this.a(ciz.uK, lh.bw);
      this.a(ciz.uT, lh.bw);
      this.a(ciz.uL, lh.bw);
      this.a(ciz.uM, lh.bw);
      this.a(ciz.uP, lh.bw);
      this.a(ciz.uN, lh.bw);
      this.a(ciz.uQ, lh.bw);
      this.a(ciz.uR, lh.bw);
      this.a(ciz.uS, lh.bw);
      this.a(ciz.tT, lh.bv);
      this.a(ciz.tR, lh.bv);
      this.a(ciz.uX, lh.bv);
      this.a(ciz.oz, lh.bx);
      this.a(ciz.oA, lh.bx);
      this.a(ciz.nV, lh.bv);
      this.a(ciz.oy, lh.bx);
      this.a(ciz.nW, lh.bv);
      this.a(ciz.ox, lh.bx);
      this.a(ciz.ow, lh.bx);
      this.a(ciz.tD, lh.bv);
      this.a(ciz.ty, lh.bv);
      this.a(ciz.ni, lh.bv);
      this.a(ciz.nj, lh.bv);
      this.a(ciz.qv, lh.bv);
      this.a(ciz.pl, lh.bv);
      this.a(ciz.qa, lh.bv);
      this.a(ciz.uW, lh.bv);
      this.a(ciz.vh, lh.bv);
      this.a(ciz.qA, lh.bv);
      this.a(ciz.to, lh.bv);
      this.a(ciz.un, lh.bv);
      this.a(ciz.pj, lh.bv);
      this.a(ciz.pN, lh.bv);
      this.a(ciz.tF, lh.bv);
      this.a(ciz.tE, lh.bv);
      this.a(ciz.qo, lh.bv);
      this.a(ciz.pR, lh.bv);
      this.a(ciz.tz, lh.bv);
      this.a(ciz.qE, lh.bv);
      this.a(ciz.nN, lh.bv);
      this.a(ciz.tG, lh.bv);
      this.a(ciz.tJ, lh.bv);
      this.a(ciz.tK, lh.bv);
      this.a(ciz.tI, lh.bv);
      this.a(ciz.qI, lh.bv);
      this.a(ciz.rp, lh.bv);
      this.a(ciz.mZ, lh.bv);
      this.a(ciz.qm, lh.bv);
      this.a(ciz.pS, lh.bv);
      this.a(ciz.nD, lh.bv);
      this.a(ciz.rg, lh.bv);
      this.a(ciz.uA, lh.bv);
      this.a(ciz.ve, lh.bv);
      this.a(ciz.qc, lh.bv);
      this.a(ciz.pO, lh.bv);
      this.a(ciz.wu, lh.bv);
      this.a(ciz.uv, lh.bv);
      this.a(ciz.rx, lh.bv);
      this.a(ciz.nk, lh.bv);
      this.a(ciz.nl, lh.bv);
      this.a(ciz.qj, lh.bv);
      this.a(ciz.oB, lh.bx);
      this.a(ciz.of, lh.bx);
      this.a(ciz.og, lh.bx);
      this.a(ciz.oe, lh.bx);
      this.a(ciz.od, lh.bx);
      this.a(ciz.oc, lh.bx);
      this.a(ciz.qM, lh.bv);
      this.a(ciz.va, lh.bv);
      this.a(ciz.nd, lh.bv);
      this.a(ciz.uz, lh.bv);
      this.a(ciz.uV, lh.bv);
      this.a(ciz.qn, lh.bv);
      this.a(ciz.pU, lh.bv);
      this.a(ciz.pV, lh.bv);
      this.a(ciz.pW, lh.bv);
      this.a(ciz.pL, lh.bv);
      this.a(ciz.oI, lh.bv);
      this.a(ciz.qu, lh.bv);
      this.a(ciz.oa, lh.bx);
      this.a(ciz.ob, lh.bx);
      this.a(ciz.nZ, lh.bx);
      this.a(ciz.nY, lh.bx);
      this.a(ciz.nX, lh.bx);
      this.a(ciz.tg, lh.bv);
      this.a(ciz.th, lh.bv);
      this.a(ciz.qy, lh.bv);
      this.a(ciz.ww, lh.bv);
      this.a(ciz.wx, lh.bv);
      this.a(ciz.wy, lh.bv);
      this.a(ciz.wz, lh.bv);
      this.a(ciz.wA, lh.bv);
      this.a(ciz.wB, lh.bv);
      this.a(ciz.wC, lh.bv);
      this.a(ciz.wD, lh.bv);
      this.a(ciz.wE, lh.bv);
      this.a(ciz.wF, lh.bv);
      this.a(ciz.wG, lh.bv);
      this.a(ciz.wH, lh.bv);
      this.a(ciz.wI, lh.bv);
      this.a(ciz.wJ, lh.bv);
      this.a(ciz.wK, lh.bv);
      this.a(ciz.wL, lh.bv);
      this.a(ciz.wM, lh.bv);
      this.a(ciz.uD, ciz.oB, lh.bx);
      this.a(ciz.pn, ciz.pm, lh.bv);

      for (cir $$0 : jc.i) {
         if ($$0 instanceof cgg $$1) {
            this.a($$1);
         }
      }

      this.a(ciz.wN, lh.bv);
      this.a(ciz.wO, lh.bv);
      this.a(ciz.wP, lh.bv);
      this.a(ciz.wQ, lh.bv);
      this.a(ciz.wR, lh.bv);
      this.a(ciz.wS, lh.bv);
      this.a(ciz.wT, lh.bv);
      this.a(ciz.wU, lh.bv);
      this.a(ciz.wV, lh.bv);
      this.a(ciz.wW, lh.bv);
      this.a(ciz.wX, lh.bv);
      this.a(ciz.wY, lh.bv);
      this.a(ciz.wZ, lh.bv);
      this.a(ciz.xa, lh.bv);
      this.a(ciz.xb, lh.bv);
      this.a(ciz.xc, lh.bv);
      this.a(ciz.xd, lh.bv);
      this.a(ciz.xe, lh.bv);
      this.a(ciz.xf, lh.bv);
      this.a(ciz.xg, lh.bv);
   }

   static record a(String a, float b, Map<cgh, String> c) {
      public String a(cgh $$0) {
         return this.c.getOrDefault($$0, this.a);
      }
   }
}
