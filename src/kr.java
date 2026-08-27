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
      new kr.a("iron", 0.2F, Map.of(cgj.c, "iron_darker")),
      new kr.a("netherite", 0.3F, Map.of(cgj.g, "netherite_darker")),
      new kr.a("redstone", 0.4F, Map.of()),
      new kr.a("copper", 0.5F, Map.of()),
      new kr.a("gold", 0.6F, Map.of(cgj.d, "gold_darker")),
      new kr.a("emerald", 0.7F, Map.of()),
      new kr.a("diamond", 0.8F, Map.of(cgj.e, "diamond_darker")),
      new kr.a("lapis", 0.9F, Map.of()),
      new kr.a("amethyst", 1.0F, Map.of())
   );
   private final BiConsumer<aer, Supplier<JsonElement>> c;

   public kr(BiConsumer<aer, Supplier<JsonElement>> $$0) {
      this.c = $$0;
   }

   private void a(cis $$0, lf $$1) {
      $$1.a(le.a($$0), lh.b($$0), this.c);
   }

   private void a(cis $$0, String $$1, lf $$2) {
      $$2.a(le.a($$0, $$1), lh.k(lh.a($$0, $$1)), this.c);
   }

   private void a(cis $$0, cis $$1, lf $$2) {
      $$2.a(le.a($$0), lh.b($$1), this.c);
   }

   private void a(cis $$0) {
      for (int $$1 = 0; $$1 < 32; $$1++) {
         if ($$1 != 16) {
            this.a($$0, String.format(Locale.ROOT, "_%02d", $$1), lg.bv);
         }
      }
   }

   private void b(cis $$0) {
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

   private JsonObject a(aer $$0, Map<li, aer> $$1, cgi $$2) {
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

   private void a(cgh $$0) {
      aer $$1 = le.a($$0);
      aer $$2 = lh.c($$0);
      aer $$3 = lh.a($$0, "_overlay");
      if ($$0.d() == cgj.a) {
         lg.bz.a($$1, lh.c($$2, $$3), this.c, ($$1x, $$2x) -> this.a($$1x, $$2x, $$0.d()));
      } else {
         lg.bv.a($$1, lh.k($$2), this.c, ($$1x, $$2x) -> this.a($$1x, $$2x, $$0.d()));
      }

      for (kr.a $$4 : b) {
         String $$5 = $$4.a($$0.d());
         aer $$6 = this.a($$1, $$5);
         String $$7 = $$0.b().b() + "_trim_" + $$5;
         aer $$8 = new aer($$7).d("trims/items/");
         if ($$0.d() == cgj.a) {
            this.a($$6, $$2, $$3, $$8);
         } else {
            this.a($$6, $$2, $$8);
         }
      }
   }

   public void a() {
      this.a(cja.nq, lg.bv);
      this.a(cja.ns, lg.bv);
      this.a(cja.nr, lg.bv);
      this.a(cja.nt, lg.bv);
      this.a(cja.nO, lg.bv);
      this.a(cja.nF, lg.bv);
      this.a(cja.tL, lg.bv);
      this.a(cja.nH, lg.bv);
      this.a(cja.tn, lg.bv);
      this.a(cja.dv, lg.bx);
      this.a(cja.rl, lg.bv);
      this.a(cja.uq, lg.bv);
      this.a(cja.us, lg.bv);
      this.a(cja.nm, lg.bv);
      this.a(cja.nn, lg.bv);
      this.a(cja.qJ, lg.bv);
      this.a(cja.rz, lg.bv);
      this.a(cja.rr, lg.bx);
      this.a(cja.qF, lg.bv);
      this.a(cja.qK, lg.bv);
      this.a(cja.qb, lg.bv);
      this.a(cja.oC, lg.bv);
      this.a(cja.oJ, lg.bv);
      this.a(cja.pX, lg.bv);
      this.a(cja.qG, lg.bv);
      this.a(cja.pK, lg.bv);
      this.a(cja.nf, lg.by);
      this.a(cja.ng, lg.by);
      this.a(cja.nJ, lg.bv);
      this.a(cja.nb, lg.bv);
      this.a(cja.rn, lg.bv);
      this.a(cja.um, lg.bv);
      this.a(cja.pY, lg.bv);
      this.b(cja.qi);
      this.a(cja.nI, lg.bv);
      this.a(cja.pT, lg.bv);
      this.a(cja.tS, lg.bv);
      this.a(cja.qe);
      this.a(cja.qf);
      this.a(cja.rm, lg.bv);
      this.a(cja.ro, lg.bv);
      this.a(cja.qp, lg.bv);
      this.a(cja.tU, lg.bv);
      this.a(cja.pk, lg.bv);
      this.a(cja.tH, lg.bv);
      this.a(cja.qq, lg.bv);
      this.a(cja.re, lg.bv);
      this.a(cja.nR, lg.bv);
      this.a(cja.nS, lg.bv);
      this.a(cja.vd, lg.bv);
      this.a(cja.qD, lg.bv);
      this.a(cja.nu, lg.bv);
      this.a(cja.nv, lg.bv);
      this.a(cja.nK, lg.bv);
      this.a(cja.ou, lg.bx);
      this.a(cja.ov, lg.bx);
      this.a(cja.tO, lg.bv);
      this.a(cja.ot, lg.bx);
      this.a(cja.os, lg.bx);
      this.a(cja.or, lg.bx);
      this.a(cja.ut, lg.bv);
      this.a(cja.ri, lg.bv);
      this.a(cja.qd, lg.bv);
      this.a(cja.nL, lg.bv);
      this.a(cja.tC, lg.bv);
      this.a(cja.rD, lg.bv);
      this.a(cja.rq, lg.bv);
      this.a(cja.ul, lg.bv);
      this.a(cja.te, lg.bv);
      this.a(cja.ry, lg.bv);
      this.a(cja.tA, lg.bv);
      this.a(cja.tf, lg.bv);
      this.a(cja.pi, lg.bv);
      this.a(cja.nE, lg.bv);
      this.a(cja.vc, lg.bv);
      this.a(cja.nc, lg.bv);
      this.a(cja.rs, lg.bv);
      this.a(cja.rw, lg.bv);
      this.a(cja.rE, lg.bv);
      this.a(cja.vg, lg.bv);
      this.a(cja.vw, lg.bv);
      this.a(cja.qk, lg.bv);
      this.a(cja.qs, lg.bv);
      this.a(cja.tj, lg.bv);
      this.a(cja.nT, lg.bv);
      this.a(cja.pm, lg.bv);
      this.a(cja.ok, lg.bx);
      this.a(cja.tq, lg.bv);
      this.a(cja.ol, lg.bx);
      this.a(cja.tN, lg.bv);
      this.a(cja.oj, lg.bx);
      this.a(cja.oi, lg.bx);
      this.a(cja.oh, lg.bx);
      this.a(cja.nU, lg.bv);
      this.a(cja.rt, lg.bv);
      this.a(cja.qB, lg.bv);
      this.a(cja.qH, lg.bv);
      this.a(cja.oG, lg.bv);
      this.a(cja.uY, lg.bv);
      this.a(cja.vA, lg.bv);
      this.a(cja.vD, lg.bv);
      this.a(cja.ne, lg.bv);
      this.a(cja.qr, lg.bv);
      this.a(cja.nP, lg.bv);
      this.a(cja.op, lg.bx);
      this.a(cja.oq, lg.bx);
      this.a(cja.tM, lg.bv);
      this.a(cja.nQ, lg.bv);
      this.a(cja.uB, lg.bv);
      this.a(cja.oo, lg.bx);
      this.a(cja.on, lg.bx);
      this.a(cja.om, lg.bx);
      this.a(cja.ti, lg.bv);
      this.a(cja.no, lg.bv);
      this.a(cja.np, lg.bv);
      this.a(cja.uC, lg.bv);
      this.a(cja.nM, lg.bv);
      this.a(cja.pM, lg.bv);
      this.a(cja.pP, lg.bv);
      this.a(cja.tP, lg.bv);
      this.a(cja.qx, lg.bv);
      this.a(cja.qC, lg.bv);
      this.a(cja.qz, lg.bv);
      this.a(cja.qw, lg.bv);
      this.a(cja.rA, lg.bv);
      this.a(cja.nw, lg.bv);
      this.a(cja.nx, lg.bv);
      this.a(cja.ny, lg.bv);
      this.a(cja.nz, lg.bv);
      this.a(cja.tp, lg.bv);
      this.a(cja.rh, lg.bv);
      this.a(cja.pQ, lg.bv);
      this.a(cja.na, lg.bv);
      this.a(cja.vf, lg.bv);
      this.a(cja.oD, lg.bv);
      this.a(cja.uU, lg.bv);
      this.a(cja.uO, lg.bw);
      this.a(cja.uE, lg.bw);
      this.a(cja.uG, lg.bw);
      this.a(cja.uF, lg.bw);
      this.a(cja.uH, lg.bw);
      this.a(cja.uI, lg.bw);
      this.a(cja.uJ, lg.bw);
      this.a(cja.uK, lg.bw);
      this.a(cja.uT, lg.bw);
      this.a(cja.uL, lg.bw);
      this.a(cja.uM, lg.bw);
      this.a(cja.uP, lg.bw);
      this.a(cja.uN, lg.bw);
      this.a(cja.uQ, lg.bw);
      this.a(cja.uR, lg.bw);
      this.a(cja.uS, lg.bw);
      this.a(cja.tT, lg.bv);
      this.a(cja.tR, lg.bv);
      this.a(cja.uX, lg.bv);
      this.a(cja.oz, lg.bx);
      this.a(cja.oA, lg.bx);
      this.a(cja.nV, lg.bv);
      this.a(cja.oy, lg.bx);
      this.a(cja.nW, lg.bv);
      this.a(cja.ox, lg.bx);
      this.a(cja.ow, lg.bx);
      this.a(cja.tD, lg.bv);
      this.a(cja.ty, lg.bv);
      this.a(cja.ni, lg.bv);
      this.a(cja.nj, lg.bv);
      this.a(cja.qv, lg.bv);
      this.a(cja.pl, lg.bv);
      this.a(cja.qa, lg.bv);
      this.a(cja.uW, lg.bv);
      this.a(cja.vh, lg.bv);
      this.a(cja.qA, lg.bv);
      this.a(cja.to, lg.bv);
      this.a(cja.un, lg.bv);
      this.a(cja.pj, lg.bv);
      this.a(cja.pN, lg.bv);
      this.a(cja.tF, lg.bv);
      this.a(cja.tE, lg.bv);
      this.a(cja.qo, lg.bv);
      this.a(cja.pR, lg.bv);
      this.a(cja.tz, lg.bv);
      this.a(cja.qE, lg.bv);
      this.a(cja.nN, lg.bv);
      this.a(cja.tG, lg.bv);
      this.a(cja.tJ, lg.bv);
      this.a(cja.tK, lg.bv);
      this.a(cja.tI, lg.bv);
      this.a(cja.qI, lg.bv);
      this.a(cja.rp, lg.bv);
      this.a(cja.mZ, lg.bv);
      this.a(cja.qm, lg.bv);
      this.a(cja.pS, lg.bv);
      this.a(cja.nD, lg.bv);
      this.a(cja.rg, lg.bv);
      this.a(cja.uA, lg.bv);
      this.a(cja.ve, lg.bv);
      this.a(cja.qc, lg.bv);
      this.a(cja.pO, lg.bv);
      this.a(cja.wu, lg.bv);
      this.a(cja.uv, lg.bv);
      this.a(cja.rx, lg.bv);
      this.a(cja.nk, lg.bv);
      this.a(cja.nl, lg.bv);
      this.a(cja.qj, lg.bv);
      this.a(cja.oB, lg.bx);
      this.a(cja.of, lg.bx);
      this.a(cja.og, lg.bx);
      this.a(cja.oe, lg.bx);
      this.a(cja.od, lg.bx);
      this.a(cja.oc, lg.bx);
      this.a(cja.qM, lg.bv);
      this.a(cja.va, lg.bv);
      this.a(cja.nd, lg.bv);
      this.a(cja.uz, lg.bv);
      this.a(cja.uV, lg.bv);
      this.a(cja.qn, lg.bv);
      this.a(cja.pU, lg.bv);
      this.a(cja.pV, lg.bv);
      this.a(cja.pW, lg.bv);
      this.a(cja.pL, lg.bv);
      this.a(cja.oI, lg.bv);
      this.a(cja.qu, lg.bv);
      this.a(cja.oa, lg.bx);
      this.a(cja.ob, lg.bx);
      this.a(cja.nZ, lg.bx);
      this.a(cja.nY, lg.bx);
      this.a(cja.nX, lg.bx);
      this.a(cja.tg, lg.bv);
      this.a(cja.th, lg.bv);
      this.a(cja.qy, lg.bv);
      this.a(cja.ww, lg.bv);
      this.a(cja.wx, lg.bv);
      this.a(cja.wy, lg.bv);
      this.a(cja.wz, lg.bv);
      this.a(cja.wA, lg.bv);
      this.a(cja.wB, lg.bv);
      this.a(cja.wC, lg.bv);
      this.a(cja.wD, lg.bv);
      this.a(cja.wE, lg.bv);
      this.a(cja.wF, lg.bv);
      this.a(cja.wG, lg.bv);
      this.a(cja.wH, lg.bv);
      this.a(cja.wI, lg.bv);
      this.a(cja.wJ, lg.bv);
      this.a(cja.wK, lg.bv);
      this.a(cja.wL, lg.bv);
      this.a(cja.wM, lg.bv);
      this.a(cja.uD, cja.oB, lg.bx);
      this.a(cja.pn, cja.pm, lg.bv);

      for (cis $$0 : jb.i) {
         if ($$0 instanceof cgh $$1) {
            this.a($$1);
         }
      }

      this.a(cja.wN, lg.bv);
      this.a(cja.wO, lg.bv);
      this.a(cja.wP, lg.bv);
      this.a(cja.wQ, lg.bv);
      this.a(cja.wR, lg.bv);
      this.a(cja.wS, lg.bv);
      this.a(cja.wT, lg.bv);
      this.a(cja.wU, lg.bv);
      this.a(cja.wV, lg.bv);
      this.a(cja.wW, lg.bv);
      this.a(cja.wX, lg.bv);
      this.a(cja.wY, lg.bv);
      this.a(cja.wZ, lg.bv);
      this.a(cja.xa, lg.bv);
      this.a(cja.xb, lg.bv);
      this.a(cja.xc, lg.bv);
      this.a(cja.xd, lg.bv);
      this.a(cja.xe, lg.bv);
      this.a(cja.xf, lg.bv);
      this.a(cja.xg, lg.bv);
   }

   static record a(String a, float b, Map<cgi, String> c) {
      public String a(cgi $$0) {
         return this.c.getOrDefault($$0, this.a);
      }
   }
}
