import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Supplier;

public class kt {
   public static final aew a = new aew("trim_type");
   private static final List<kt.a> b = List.of(
      new kt.a("quartz", 0.1F, Map.of()),
      new kt.a("iron", 0.2F, Map.of(cgr.c, "iron_darker")),
      new kt.a("netherite", 0.3F, Map.of(cgr.g, "netherite_darker")),
      new kt.a("redstone", 0.4F, Map.of()),
      new kt.a("copper", 0.5F, Map.of()),
      new kt.a("gold", 0.6F, Map.of(cgr.d, "gold_darker")),
      new kt.a("emerald", 0.7F, Map.of()),
      new kt.a("diamond", 0.8F, Map.of(cgr.e, "diamond_darker")),
      new kt.a("lapis", 0.9F, Map.of()),
      new kt.a("amethyst", 1.0F, Map.of())
   );
   private final BiConsumer<aew, Supplier<JsonElement>> c;

   public kt(BiConsumer<aew, Supplier<JsonElement>> $$0) {
      this.c = $$0;
   }

   private void a(cja $$0, lh $$1) {
      $$1.a(lg.a($$0), lj.b($$0), this.c);
   }

   private void a(cja $$0, String $$1, lh $$2) {
      $$2.a(lg.a($$0, $$1), lj.k(lj.a($$0, $$1)), this.c);
   }

   private void a(cja $$0, cja $$1, lh $$2) {
      $$2.a(lg.a($$0), lj.b($$1), this.c);
   }

   private void a(cja $$0) {
      for (int $$1 = 0; $$1 < 32; $$1++) {
         if ($$1 != 16) {
            this.a($$0, String.format(Locale.ROOT, "_%02d", $$1), li.bv);
         }
      }
   }

   private void b(cja $$0) {
      for (int $$1 = 1; $$1 < 64; $$1++) {
         this.a($$0, String.format(Locale.ROOT, "_%02d", $$1), li.bv);
      }
   }

   private void a(aew $$0, aew $$1, aew $$2) {
      li.bz.a($$0, lj.c($$1, $$2), this.c);
   }

   private void a(aew $$0, aew $$1, aew $$2, aew $$3) {
      li.bA.a($$0, lj.a($$1, $$2, $$3), this.c);
   }

   private aew a(aew $$0, String $$1) {
      return $$0.e("_" + $$1 + "_trim");
   }

   private JsonObject a(aew $$0, Map<lk, aew> $$1, cgq $$2) {
      JsonObject $$3 = li.bz.a($$0, $$1);
      JsonArray $$4 = new JsonArray();

      for (kt.a $$5 : b) {
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

   private void a(cgp $$0) {
      aew $$1 = lg.a($$0);
      aew $$2 = lj.c($$0);
      aew $$3 = lj.a($$0, "_overlay");
      if ($$0.d() == cgr.a) {
         li.bz.a($$1, lj.c($$2, $$3), this.c, ($$1x, $$2x) -> this.a($$1x, $$2x, $$0.d()));
      } else {
         li.bv.a($$1, lj.k($$2), this.c, ($$1x, $$2x) -> this.a($$1x, $$2x, $$0.d()));
      }

      for (kt.a $$4 : b) {
         String $$5 = $$4.a($$0.d());
         aew $$6 = this.a($$1, $$5);
         String $$7 = $$0.b().b() + "_trim_" + $$5;
         aew $$8 = new aew($$7).d("trims/items/");
         if ($$0.d() == cgr.a) {
            this.a($$6, $$2, $$3, $$8);
         } else {
            this.a($$6, $$2, $$8);
         }
      }
   }

   public void a() {
      this.a(cji.nq, li.bv);
      this.a(cji.ns, li.bv);
      this.a(cji.nr, li.bv);
      this.a(cji.nt, li.bv);
      this.a(cji.nO, li.bv);
      this.a(cji.nF, li.bv);
      this.a(cji.tL, li.bv);
      this.a(cji.nH, li.bv);
      this.a(cji.tn, li.bv);
      this.a(cji.dv, li.bx);
      this.a(cji.rl, li.bv);
      this.a(cji.uq, li.bv);
      this.a(cji.us, li.bv);
      this.a(cji.nm, li.bv);
      this.a(cji.nn, li.bv);
      this.a(cji.qJ, li.bv);
      this.a(cji.rz, li.bv);
      this.a(cji.rr, li.bx);
      this.a(cji.qF, li.bv);
      this.a(cji.qK, li.bv);
      this.a(cji.qb, li.bv);
      this.a(cji.oC, li.bv);
      this.a(cji.oJ, li.bv);
      this.a(cji.pX, li.bv);
      this.a(cji.qG, li.bv);
      this.a(cji.pK, li.bv);
      this.a(cji.nf, li.by);
      this.a(cji.ng, li.by);
      this.a(cji.nJ, li.bv);
      this.a(cji.nb, li.bv);
      this.a(cji.rn, li.bv);
      this.a(cji.um, li.bv);
      this.a(cji.pY, li.bv);
      this.b(cji.qi);
      this.a(cji.nI, li.bv);
      this.a(cji.pT, li.bv);
      this.a(cji.tS, li.bv);
      this.a(cji.qe);
      this.a(cji.qf);
      this.a(cji.rm, li.bv);
      this.a(cji.ro, li.bv);
      this.a(cji.qp, li.bv);
      this.a(cji.tU, li.bv);
      this.a(cji.pk, li.bv);
      this.a(cji.tH, li.bv);
      this.a(cji.qq, li.bv);
      this.a(cji.re, li.bv);
      this.a(cji.nR, li.bv);
      this.a(cji.nS, li.bv);
      this.a(cji.vd, li.bv);
      this.a(cji.qD, li.bv);
      this.a(cji.nu, li.bv);
      this.a(cji.nv, li.bv);
      this.a(cji.nK, li.bv);
      this.a(cji.ou, li.bx);
      this.a(cji.ov, li.bx);
      this.a(cji.tO, li.bv);
      this.a(cji.ot, li.bx);
      this.a(cji.os, li.bx);
      this.a(cji.or, li.bx);
      this.a(cji.ut, li.bv);
      this.a(cji.ri, li.bv);
      this.a(cji.qd, li.bv);
      this.a(cji.nL, li.bv);
      this.a(cji.tC, li.bv);
      this.a(cji.rD, li.bv);
      this.a(cji.rq, li.bv);
      this.a(cji.ul, li.bv);
      this.a(cji.te, li.bv);
      this.a(cji.ry, li.bv);
      this.a(cji.tA, li.bv);
      this.a(cji.tf, li.bv);
      this.a(cji.pi, li.bv);
      this.a(cji.nE, li.bv);
      this.a(cji.vc, li.bv);
      this.a(cji.nc, li.bv);
      this.a(cji.rs, li.bv);
      this.a(cji.rw, li.bv);
      this.a(cji.rE, li.bv);
      this.a(cji.vg, li.bv);
      this.a(cji.vw, li.bv);
      this.a(cji.qk, li.bv);
      this.a(cji.qs, li.bv);
      this.a(cji.tj, li.bv);
      this.a(cji.nT, li.bv);
      this.a(cji.pm, li.bv);
      this.a(cji.ok, li.bx);
      this.a(cji.tq, li.bv);
      this.a(cji.ol, li.bx);
      this.a(cji.tN, li.bv);
      this.a(cji.oj, li.bx);
      this.a(cji.oi, li.bx);
      this.a(cji.oh, li.bx);
      this.a(cji.nU, li.bv);
      this.a(cji.rt, li.bv);
      this.a(cji.qB, li.bv);
      this.a(cji.qH, li.bv);
      this.a(cji.oG, li.bv);
      this.a(cji.uY, li.bv);
      this.a(cji.vA, li.bv);
      this.a(cji.vD, li.bv);
      this.a(cji.ne, li.bv);
      this.a(cji.qr, li.bv);
      this.a(cji.nP, li.bv);
      this.a(cji.op, li.bx);
      this.a(cji.oq, li.bx);
      this.a(cji.tM, li.bv);
      this.a(cji.nQ, li.bv);
      this.a(cji.uB, li.bv);
      this.a(cji.oo, li.bx);
      this.a(cji.on, li.bx);
      this.a(cji.om, li.bx);
      this.a(cji.ti, li.bv);
      this.a(cji.no, li.bv);
      this.a(cji.np, li.bv);
      this.a(cji.uC, li.bv);
      this.a(cji.nM, li.bv);
      this.a(cji.pM, li.bv);
      this.a(cji.pP, li.bv);
      this.a(cji.tP, li.bv);
      this.a(cji.qx, li.bv);
      this.a(cji.qC, li.bv);
      this.a(cji.qz, li.bv);
      this.a(cji.qw, li.bv);
      this.a(cji.rA, li.bv);
      this.a(cji.nw, li.bv);
      this.a(cji.nx, li.bv);
      this.a(cji.ny, li.bv);
      this.a(cji.nz, li.bv);
      this.a(cji.tp, li.bv);
      this.a(cji.rh, li.bv);
      this.a(cji.pQ, li.bv);
      this.a(cji.na, li.bv);
      this.a(cji.vf, li.bv);
      this.a(cji.oD, li.bv);
      this.a(cji.uU, li.bv);
      this.a(cji.uO, li.bw);
      this.a(cji.uE, li.bw);
      this.a(cji.uG, li.bw);
      this.a(cji.uF, li.bw);
      this.a(cji.uH, li.bw);
      this.a(cji.uI, li.bw);
      this.a(cji.uJ, li.bw);
      this.a(cji.uK, li.bw);
      this.a(cji.uT, li.bw);
      this.a(cji.uL, li.bw);
      this.a(cji.uM, li.bw);
      this.a(cji.uP, li.bw);
      this.a(cji.uN, li.bw);
      this.a(cji.uQ, li.bw);
      this.a(cji.uR, li.bw);
      this.a(cji.uS, li.bw);
      this.a(cji.tT, li.bv);
      this.a(cji.tR, li.bv);
      this.a(cji.uX, li.bv);
      this.a(cji.oz, li.bx);
      this.a(cji.oA, li.bx);
      this.a(cji.nV, li.bv);
      this.a(cji.oy, li.bx);
      this.a(cji.nW, li.bv);
      this.a(cji.ox, li.bx);
      this.a(cji.ow, li.bx);
      this.a(cji.tD, li.bv);
      this.a(cji.ty, li.bv);
      this.a(cji.ni, li.bv);
      this.a(cji.nj, li.bv);
      this.a(cji.qv, li.bv);
      this.a(cji.pl, li.bv);
      this.a(cji.qa, li.bv);
      this.a(cji.uW, li.bv);
      this.a(cji.vh, li.bv);
      this.a(cji.qA, li.bv);
      this.a(cji.to, li.bv);
      this.a(cji.un, li.bv);
      this.a(cji.pj, li.bv);
      this.a(cji.pN, li.bv);
      this.a(cji.tF, li.bv);
      this.a(cji.tE, li.bv);
      this.a(cji.qo, li.bv);
      this.a(cji.pR, li.bv);
      this.a(cji.tz, li.bv);
      this.a(cji.qE, li.bv);
      this.a(cji.nN, li.bv);
      this.a(cji.tG, li.bv);
      this.a(cji.tJ, li.bv);
      this.a(cji.tK, li.bv);
      this.a(cji.tI, li.bv);
      this.a(cji.qI, li.bv);
      this.a(cji.rp, li.bv);
      this.a(cji.mZ, li.bv);
      this.a(cji.qm, li.bv);
      this.a(cji.pS, li.bv);
      this.a(cji.nD, li.bv);
      this.a(cji.rg, li.bv);
      this.a(cji.uA, li.bv);
      this.a(cji.ve, li.bv);
      this.a(cji.qc, li.bv);
      this.a(cji.pO, li.bv);
      this.a(cji.wu, li.bv);
      this.a(cji.uv, li.bv);
      this.a(cji.rx, li.bv);
      this.a(cji.nk, li.bv);
      this.a(cji.nl, li.bv);
      this.a(cji.qj, li.bv);
      this.a(cji.oB, li.bx);
      this.a(cji.of, li.bx);
      this.a(cji.og, li.bx);
      this.a(cji.oe, li.bx);
      this.a(cji.od, li.bx);
      this.a(cji.oc, li.bx);
      this.a(cji.qM, li.bv);
      this.a(cji.va, li.bv);
      this.a(cji.nd, li.bv);
      this.a(cji.uz, li.bv);
      this.a(cji.uV, li.bv);
      this.a(cji.qn, li.bv);
      this.a(cji.pU, li.bv);
      this.a(cji.pV, li.bv);
      this.a(cji.pW, li.bv);
      this.a(cji.pL, li.bv);
      this.a(cji.oI, li.bv);
      this.a(cji.qu, li.bv);
      this.a(cji.oa, li.bx);
      this.a(cji.ob, li.bx);
      this.a(cji.nZ, li.bx);
      this.a(cji.nY, li.bx);
      this.a(cji.nX, li.bx);
      this.a(cji.tg, li.bv);
      this.a(cji.th, li.bv);
      this.a(cji.qy, li.bv);
      this.a(cji.ww, li.bv);
      this.a(cji.wx, li.bv);
      this.a(cji.wy, li.bv);
      this.a(cji.wz, li.bv);
      this.a(cji.wA, li.bv);
      this.a(cji.wB, li.bv);
      this.a(cji.wC, li.bv);
      this.a(cji.wD, li.bv);
      this.a(cji.wE, li.bv);
      this.a(cji.wF, li.bv);
      this.a(cji.wG, li.bv);
      this.a(cji.wH, li.bv);
      this.a(cji.wI, li.bv);
      this.a(cji.wJ, li.bv);
      this.a(cji.wK, li.bv);
      this.a(cji.wL, li.bv);
      this.a(cji.wM, li.bv);
      this.a(cji.uD, cji.oB, li.bx);
      this.a(cji.pn, cji.pm, li.bv);

      for (cja $$0 : jb.i) {
         if ($$0 instanceof cgp $$1) {
            this.a($$1);
         }
      }

      this.a(cji.wN, li.bv);
      this.a(cji.wO, li.bv);
      this.a(cji.wP, li.bv);
      this.a(cji.wQ, li.bv);
      this.a(cji.wR, li.bv);
      this.a(cji.wS, li.bv);
      this.a(cji.wT, li.bv);
      this.a(cji.wU, li.bv);
      this.a(cji.wV, li.bv);
      this.a(cji.wW, li.bv);
      this.a(cji.wX, li.bv);
      this.a(cji.wY, li.bv);
      this.a(cji.wZ, li.bv);
      this.a(cji.xa, li.bv);
      this.a(cji.xb, li.bv);
      this.a(cji.xc, li.bv);
      this.a(cji.xd, li.bv);
      this.a(cji.xe, li.bv);
      this.a(cji.xf, li.bv);
      this.a(cji.xg, li.bv);
   }

   static record a(String a, float b, Map<cgq, String> c) {
      public String a(cgq $$0) {
         return this.c.getOrDefault($$0, this.a);
      }
   }
}
