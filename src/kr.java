import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Supplier;

public class kr {
   public static final aer a = new aer("trim_type");
   private static final List<kr.a> b = List.of(
      new kr.a("quartz", 0.1F, Map.of()),
      new kr.a("iron", 0.2F, Map.of(cgk.c, "iron_darker")),
      new kr.a("netherite", 0.3F, Map.of(cgk.g, "netherite_darker")),
      new kr.a("redstone", 0.4F, Map.of()),
      new kr.a("copper", 0.5F, Map.of()),
      new kr.a("gold", 0.6F, Map.of(cgk.d, "gold_darker")),
      new kr.a("emerald", 0.7F, Map.of()),
      new kr.a("diamond", 0.8F, Map.of(cgk.e, "diamond_darker")),
      new kr.a("lapis", 0.9F, Map.of()),
      new kr.a("amethyst", 1.0F, Map.of())
   );
   private final BiConsumer<aer, Supplier<JsonElement>> c;

   public kr(BiConsumer<aer, Supplier<JsonElement>> $$0) {
      this.c = $$0;
   }

   private void a(cit $$0, lf $$1) {
      $$1.a(le.a($$0), lh.b($$0), this.c);
   }

   private void a(cit $$0, String $$1, lf $$2) {
      $$2.a(le.a($$0, $$1), lh.k(lh.a($$0, $$1)), this.c);
   }

   private void a(cit $$0, cit $$1, lf $$2) {
      $$2.a(le.a($$0), lh.b($$1), this.c);
   }

   private void a(cit $$0) {
      for (int $$1 = 0; $$1 < 32; $$1++) {
         if ($$1 != 16) {
            this.a($$0, String.format(Locale.ROOT, "_%02d", $$1), lg.bv);
         }
      }
   }

   private void b(cit $$0) {
      for (int $$1 = 1; $$1 < 64; $$1++) {
         this.a($$0, String.format(Locale.ROOT, "_%02d", $$1), lg.bv);
      }
   }

   private void a(aer $$0, aer $$1, aer $$2) {
      lg.bz.a($$0, lh.c($$1, $$2), this.c);
   }

   private void a(aer $$0, aer $$1, aer $$2, aer $$3) {
      lg.bA.a($$0, lh.a($$1, $$2, $$3), this.c);
   }

   private aer a(aer $$0, String $$1) {
      return $$0.e("_" + $$1 + "_trim");
   }

   private JsonObject a(aer $$0, Map<li, aer> $$1, cgj $$2) {
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

   private void a(cgi $$0) {
      aer $$1 = le.a($$0);
      aer $$2 = lh.c($$0);
      aer $$3 = lh.a($$0, "_overlay");
      if ($$0.d() == cgk.a) {
         lg.bz.a($$1, lh.c($$2, $$3), this.c, ($$1x, $$2x) -> this.a($$1x, $$2x, $$0.d()));
      } else {
         lg.bv.a($$1, lh.k($$2), this.c, ($$1x, $$2x) -> this.a($$1x, $$2x, $$0.d()));
      }

      for (kr.a $$4 : b) {
         String $$5 = $$4.a($$0.d());
         aer $$6 = this.a($$1, $$5);
         String $$7 = $$0.b().b() + "_trim_" + $$5;
         aer $$8 = new aer($$7).d("trims/items/");
         if ($$0.d() == cgk.a) {
            this.a($$6, $$2, $$3, $$8);
         } else {
            this.a($$6, $$2, $$8);
         }
      }
   }

   public void a() {
      this.a(cjb.nq, lg.bv);
      this.a(cjb.ns, lg.bv);
      this.a(cjb.nr, lg.bv);
      this.a(cjb.nt, lg.bv);
      this.a(cjb.nO, lg.bv);
      this.a(cjb.nF, lg.bv);
      this.a(cjb.tL, lg.bv);
      this.a(cjb.nH, lg.bv);
      this.a(cjb.tn, lg.bv);
      this.a(cjb.dv, lg.bx);
      this.a(cjb.rl, lg.bv);
      this.a(cjb.uq, lg.bv);
      this.a(cjb.us, lg.bv);
      this.a(cjb.nm, lg.bv);
      this.a(cjb.nn, lg.bv);
      this.a(cjb.qJ, lg.bv);
      this.a(cjb.rz, lg.bv);
      this.a(cjb.rr, lg.bx);
      this.a(cjb.qF, lg.bv);
      this.a(cjb.qK, lg.bv);
      this.a(cjb.qb, lg.bv);
      this.a(cjb.oC, lg.bv);
      this.a(cjb.oJ, lg.bv);
      this.a(cjb.pX, lg.bv);
      this.a(cjb.qG, lg.bv);
      this.a(cjb.pK, lg.bv);
      this.a(cjb.nf, lg.by);
      this.a(cjb.ng, lg.by);
      this.a(cjb.nJ, lg.bv);
      this.a(cjb.nb, lg.bv);
      this.a(cjb.rn, lg.bv);
      this.a(cjb.um, lg.bv);
      this.a(cjb.pY, lg.bv);
      this.b(cjb.qi);
      this.a(cjb.nI, lg.bv);
      this.a(cjb.pT, lg.bv);
      this.a(cjb.tS, lg.bv);
      this.a(cjb.qe);
      this.a(cjb.qf);
      this.a(cjb.rm, lg.bv);
      this.a(cjb.ro, lg.bv);
      this.a(cjb.qp, lg.bv);
      this.a(cjb.tU, lg.bv);
      this.a(cjb.pk, lg.bv);
      this.a(cjb.tH, lg.bv);
      this.a(cjb.qq, lg.bv);
      this.a(cjb.re, lg.bv);
      this.a(cjb.nR, lg.bv);
      this.a(cjb.nS, lg.bv);
      this.a(cjb.vd, lg.bv);
      this.a(cjb.qD, lg.bv);
      this.a(cjb.nu, lg.bv);
      this.a(cjb.nv, lg.bv);
      this.a(cjb.nK, lg.bv);
      this.a(cjb.ou, lg.bx);
      this.a(cjb.ov, lg.bx);
      this.a(cjb.tO, lg.bv);
      this.a(cjb.ot, lg.bx);
      this.a(cjb.os, lg.bx);
      this.a(cjb.or, lg.bx);
      this.a(cjb.ut, lg.bv);
      this.a(cjb.ri, lg.bv);
      this.a(cjb.qd, lg.bv);
      this.a(cjb.nL, lg.bv);
      this.a(cjb.tC, lg.bv);
      this.a(cjb.rD, lg.bv);
      this.a(cjb.rq, lg.bv);
      this.a(cjb.ul, lg.bv);
      this.a(cjb.te, lg.bv);
      this.a(cjb.ry, lg.bv);
      this.a(cjb.tA, lg.bv);
      this.a(cjb.tf, lg.bv);
      this.a(cjb.pi, lg.bv);
      this.a(cjb.nE, lg.bv);
      this.a(cjb.vc, lg.bv);
      this.a(cjb.nc, lg.bv);
      this.a(cjb.rs, lg.bv);
      this.a(cjb.rw, lg.bv);
      this.a(cjb.rE, lg.bv);
      this.a(cjb.vg, lg.bv);
      this.a(cjb.vw, lg.bv);
      this.a(cjb.qk, lg.bv);
      this.a(cjb.qs, lg.bv);
      this.a(cjb.tj, lg.bv);
      this.a(cjb.nT, lg.bv);
      this.a(cjb.pm, lg.bv);
      this.a(cjb.ok, lg.bx);
      this.a(cjb.tq, lg.bv);
      this.a(cjb.ol, lg.bx);
      this.a(cjb.tN, lg.bv);
      this.a(cjb.oj, lg.bx);
      this.a(cjb.oi, lg.bx);
      this.a(cjb.oh, lg.bx);
      this.a(cjb.nU, lg.bv);
      this.a(cjb.rt, lg.bv);
      this.a(cjb.qB, lg.bv);
      this.a(cjb.qH, lg.bv);
      this.a(cjb.oG, lg.bv);
      this.a(cjb.uY, lg.bv);
      this.a(cjb.vA, lg.bv);
      this.a(cjb.vD, lg.bv);
      this.a(cjb.ne, lg.bv);
      this.a(cjb.qr, lg.bv);
      this.a(cjb.nP, lg.bv);
      this.a(cjb.op, lg.bx);
      this.a(cjb.oq, lg.bx);
      this.a(cjb.tM, lg.bv);
      this.a(cjb.nQ, lg.bv);
      this.a(cjb.uB, lg.bv);
      this.a(cjb.oo, lg.bx);
      this.a(cjb.on, lg.bx);
      this.a(cjb.om, lg.bx);
      this.a(cjb.ti, lg.bv);
      this.a(cjb.no, lg.bv);
      this.a(cjb.np, lg.bv);
      this.a(cjb.uC, lg.bv);
      this.a(cjb.nM, lg.bv);
      this.a(cjb.pM, lg.bv);
      this.a(cjb.pP, lg.bv);
      this.a(cjb.tP, lg.bv);
      this.a(cjb.qx, lg.bv);
      this.a(cjb.qC, lg.bv);
      this.a(cjb.qz, lg.bv);
      this.a(cjb.qw, lg.bv);
      this.a(cjb.rA, lg.bv);
      this.a(cjb.nw, lg.bv);
      this.a(cjb.nx, lg.bv);
      this.a(cjb.ny, lg.bv);
      this.a(cjb.nz, lg.bv);
      this.a(cjb.tp, lg.bv);
      this.a(cjb.rh, lg.bv);
      this.a(cjb.pQ, lg.bv);
      this.a(cjb.na, lg.bv);
      this.a(cjb.vf, lg.bv);
      this.a(cjb.oD, lg.bv);
      this.a(cjb.uU, lg.bv);
      this.a(cjb.uO, lg.bw);
      this.a(cjb.uE, lg.bw);
      this.a(cjb.uG, lg.bw);
      this.a(cjb.uF, lg.bw);
      this.a(cjb.uH, lg.bw);
      this.a(cjb.uI, lg.bw);
      this.a(cjb.uJ, lg.bw);
      this.a(cjb.uK, lg.bw);
      this.a(cjb.uT, lg.bw);
      this.a(cjb.uL, lg.bw);
      this.a(cjb.uM, lg.bw);
      this.a(cjb.uP, lg.bw);
      this.a(cjb.uN, lg.bw);
      this.a(cjb.uQ, lg.bw);
      this.a(cjb.uR, lg.bw);
      this.a(cjb.uS, lg.bw);
      this.a(cjb.tT, lg.bv);
      this.a(cjb.tR, lg.bv);
      this.a(cjb.uX, lg.bv);
      this.a(cjb.oz, lg.bx);
      this.a(cjb.oA, lg.bx);
      this.a(cjb.nV, lg.bv);
      this.a(cjb.oy, lg.bx);
      this.a(cjb.nW, lg.bv);
      this.a(cjb.ox, lg.bx);
      this.a(cjb.ow, lg.bx);
      this.a(cjb.tD, lg.bv);
      this.a(cjb.ty, lg.bv);
      this.a(cjb.ni, lg.bv);
      this.a(cjb.nj, lg.bv);
      this.a(cjb.qv, lg.bv);
      this.a(cjb.pl, lg.bv);
      this.a(cjb.qa, lg.bv);
      this.a(cjb.uW, lg.bv);
      this.a(cjb.vh, lg.bv);
      this.a(cjb.qA, lg.bv);
      this.a(cjb.to, lg.bv);
      this.a(cjb.un, lg.bv);
      this.a(cjb.pj, lg.bv);
      this.a(cjb.pN, lg.bv);
      this.a(cjb.tF, lg.bv);
      this.a(cjb.tE, lg.bv);
      this.a(cjb.qo, lg.bv);
      this.a(cjb.pR, lg.bv);
      this.a(cjb.tz, lg.bv);
      this.a(cjb.qE, lg.bv);
      this.a(cjb.nN, lg.bv);
      this.a(cjb.tG, lg.bv);
      this.a(cjb.tJ, lg.bv);
      this.a(cjb.tK, lg.bv);
      this.a(cjb.tI, lg.bv);
      this.a(cjb.qI, lg.bv);
      this.a(cjb.rp, lg.bv);
      this.a(cjb.mZ, lg.bv);
      this.a(cjb.qm, lg.bv);
      this.a(cjb.pS, lg.bv);
      this.a(cjb.nD, lg.bv);
      this.a(cjb.rg, lg.bv);
      this.a(cjb.uA, lg.bv);
      this.a(cjb.ve, lg.bv);
      this.a(cjb.qc, lg.bv);
      this.a(cjb.pO, lg.bv);
      this.a(cjb.wu, lg.bv);
      this.a(cjb.uv, lg.bv);
      this.a(cjb.rx, lg.bv);
      this.a(cjb.nk, lg.bv);
      this.a(cjb.nl, lg.bv);
      this.a(cjb.qj, lg.bv);
      this.a(cjb.oB, lg.bx);
      this.a(cjb.of, lg.bx);
      this.a(cjb.og, lg.bx);
      this.a(cjb.oe, lg.bx);
      this.a(cjb.od, lg.bx);
      this.a(cjb.oc, lg.bx);
      this.a(cjb.qM, lg.bv);
      this.a(cjb.va, lg.bv);
      this.a(cjb.nd, lg.bv);
      this.a(cjb.uz, lg.bv);
      this.a(cjb.uV, lg.bv);
      this.a(cjb.qn, lg.bv);
      this.a(cjb.pU, lg.bv);
      this.a(cjb.pV, lg.bv);
      this.a(cjb.pW, lg.bv);
      this.a(cjb.pL, lg.bv);
      this.a(cjb.oI, lg.bv);
      this.a(cjb.qu, lg.bv);
      this.a(cjb.oa, lg.bx);
      this.a(cjb.ob, lg.bx);
      this.a(cjb.nZ, lg.bx);
      this.a(cjb.nY, lg.bx);
      this.a(cjb.nX, lg.bx);
      this.a(cjb.tg, lg.bv);
      this.a(cjb.th, lg.bv);
      this.a(cjb.qy, lg.bv);
      this.a(cjb.ww, lg.bv);
      this.a(cjb.wx, lg.bv);
      this.a(cjb.wy, lg.bv);
      this.a(cjb.wz, lg.bv);
      this.a(cjb.wA, lg.bv);
      this.a(cjb.wB, lg.bv);
      this.a(cjb.wC, lg.bv);
      this.a(cjb.wD, lg.bv);
      this.a(cjb.wE, lg.bv);
      this.a(cjb.wF, lg.bv);
      this.a(cjb.wG, lg.bv);
      this.a(cjb.wH, lg.bv);
      this.a(cjb.wI, lg.bv);
      this.a(cjb.wJ, lg.bv);
      this.a(cjb.wK, lg.bv);
      this.a(cjb.wL, lg.bv);
      this.a(cjb.wM, lg.bv);
      this.a(cjb.uD, cjb.oB, lg.bx);
      this.a(cjb.pn, cjb.pm, lg.bv);

      for (cit $$0 : jb.i) {
         if ($$0 instanceof cgi $$1) {
            this.a($$1);
         }
      }

      this.a(cjb.wN, lg.bv);
      this.a(cjb.wO, lg.bv);
      this.a(cjb.wP, lg.bv);
      this.a(cjb.wQ, lg.bv);
      this.a(cjb.wR, lg.bv);
      this.a(cjb.wS, lg.bv);
      this.a(cjb.wT, lg.bv);
      this.a(cjb.wU, lg.bv);
      this.a(cjb.wV, lg.bv);
      this.a(cjb.wW, lg.bv);
      this.a(cjb.wX, lg.bv);
      this.a(cjb.wY, lg.bv);
      this.a(cjb.wZ, lg.bv);
      this.a(cjb.xa, lg.bv);
      this.a(cjb.xb, lg.bv);
      this.a(cjb.xc, lg.bv);
      this.a(cjb.xd, lg.bv);
      this.a(cjb.xe, lg.bv);
      this.a(cjb.xf, lg.bv);
      this.a(cjb.xg, lg.bv);
   }

   static record a(String a, float b, Map<cgj, String> c) {
      public String a(cgj $$0) {
         return this.c.getOrDefault($$0, this.a);
      }
   }
}
