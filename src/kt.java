import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Supplier;

public class kt {
   public static final aez a = new aez("trim_type");
   private static final List<kt.a> b = List.of(
      new kt.a("quartz", 0.1F, Map.of()),
      new kt.a("iron", 0.2F, Map.of(cgx.c, "iron_darker")),
      new kt.a("netherite", 0.3F, Map.of(cgx.g, "netherite_darker")),
      new kt.a("redstone", 0.4F, Map.of()),
      new kt.a("copper", 0.5F, Map.of()),
      new kt.a("gold", 0.6F, Map.of(cgx.d, "gold_darker")),
      new kt.a("emerald", 0.7F, Map.of()),
      new kt.a("diamond", 0.8F, Map.of(cgx.e, "diamond_darker")),
      new kt.a("lapis", 0.9F, Map.of()),
      new kt.a("amethyst", 1.0F, Map.of())
   );
   private final BiConsumer<aez, Supplier<JsonElement>> c;

   public kt(BiConsumer<aez, Supplier<JsonElement>> $$0) {
      this.c = $$0;
   }

   private void a(cjg $$0, lh $$1) {
      $$1.a(lg.a($$0), lj.b($$0), this.c);
   }

   private void a(cjg $$0, String $$1, lh $$2) {
      $$2.a(lg.a($$0, $$1), lj.k(lj.a($$0, $$1)), this.c);
   }

   private void a(cjg $$0, cjg $$1, lh $$2) {
      $$2.a(lg.a($$0), lj.b($$1), this.c);
   }

   private void a(cjg $$0) {
      for (int $$1 = 0; $$1 < 32; $$1++) {
         if ($$1 != 16) {
            this.a($$0, String.format(Locale.ROOT, "_%02d", $$1), li.bv);
         }
      }
   }

   private void b(cjg $$0) {
      for (int $$1 = 1; $$1 < 64; $$1++) {
         this.a($$0, String.format(Locale.ROOT, "_%02d", $$1), li.bv);
      }
   }

   private void a(aez $$0, aez $$1, aez $$2) {
      li.bz.a($$0, lj.c($$1, $$2), this.c);
   }

   private void a(aez $$0, aez $$1, aez $$2, aez $$3) {
      li.bA.a($$0, lj.a($$1, $$2, $$3), this.c);
   }

   private aez a(aez $$0, String $$1) {
      return $$0.e("_" + $$1 + "_trim");
   }

   private JsonObject a(aez $$0, Map<lk, aez> $$1, cgw $$2) {
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

   private void a(cgv $$0) {
      aez $$1 = lg.a($$0);
      aez $$2 = lj.c($$0);
      aez $$3 = lj.a($$0, "_overlay");
      if ($$0.d() == cgx.a) {
         li.bz.a($$1, lj.c($$2, $$3), this.c, ($$1x, $$2x) -> this.a($$1x, $$2x, $$0.d()));
      } else {
         li.bv.a($$1, lj.k($$2), this.c, ($$1x, $$2x) -> this.a($$1x, $$2x, $$0.d()));
      }

      for (kt.a $$4 : b) {
         String $$5 = $$4.a($$0.d());
         aez $$6 = this.a($$1, $$5);
         String $$7 = $$0.b().b() + "_trim_" + $$5;
         aez $$8 = new aez($$7).d("trims/items/");
         if ($$0.d() == cgx.a) {
            this.a($$6, $$2, $$3, $$8);
         } else {
            this.a($$6, $$2, $$8);
         }
      }
   }

   public void a() {
      this.a(cjo.nq, li.bv);
      this.a(cjo.ns, li.bv);
      this.a(cjo.nr, li.bv);
      this.a(cjo.nt, li.bv);
      this.a(cjo.nO, li.bv);
      this.a(cjo.nF, li.bv);
      this.a(cjo.tL, li.bv);
      this.a(cjo.nH, li.bv);
      this.a(cjo.tn, li.bv);
      this.a(cjo.dv, li.bx);
      this.a(cjo.rl, li.bv);
      this.a(cjo.uq, li.bv);
      this.a(cjo.us, li.bv);
      this.a(cjo.nm, li.bv);
      this.a(cjo.nn, li.bv);
      this.a(cjo.qJ, li.bv);
      this.a(cjo.rz, li.bv);
      this.a(cjo.rr, li.bx);
      this.a(cjo.qF, li.bv);
      this.a(cjo.qK, li.bv);
      this.a(cjo.qb, li.bv);
      this.a(cjo.oC, li.bv);
      this.a(cjo.oJ, li.bv);
      this.a(cjo.pX, li.bv);
      this.a(cjo.qG, li.bv);
      this.a(cjo.pK, li.bv);
      this.a(cjo.nf, li.by);
      this.a(cjo.ng, li.by);
      this.a(cjo.nJ, li.bv);
      this.a(cjo.nb, li.bv);
      this.a(cjo.rn, li.bv);
      this.a(cjo.um, li.bv);
      this.a(cjo.pY, li.bv);
      this.b(cjo.qi);
      this.a(cjo.nI, li.bv);
      this.a(cjo.pT, li.bv);
      this.a(cjo.tS, li.bv);
      this.a(cjo.qe);
      this.a(cjo.qf);
      this.a(cjo.rm, li.bv);
      this.a(cjo.ro, li.bv);
      this.a(cjo.qp, li.bv);
      this.a(cjo.tU, li.bv);
      this.a(cjo.pk, li.bv);
      this.a(cjo.tH, li.bv);
      this.a(cjo.qq, li.bv);
      this.a(cjo.re, li.bv);
      this.a(cjo.nR, li.bv);
      this.a(cjo.nS, li.bv);
      this.a(cjo.vd, li.bv);
      this.a(cjo.qD, li.bv);
      this.a(cjo.nu, li.bv);
      this.a(cjo.nv, li.bv);
      this.a(cjo.nK, li.bv);
      this.a(cjo.ou, li.bx);
      this.a(cjo.ov, li.bx);
      this.a(cjo.tO, li.bv);
      this.a(cjo.ot, li.bx);
      this.a(cjo.os, li.bx);
      this.a(cjo.or, li.bx);
      this.a(cjo.ut, li.bv);
      this.a(cjo.ri, li.bv);
      this.a(cjo.qd, li.bv);
      this.a(cjo.nL, li.bv);
      this.a(cjo.tC, li.bv);
      this.a(cjo.rD, li.bv);
      this.a(cjo.rq, li.bv);
      this.a(cjo.ul, li.bv);
      this.a(cjo.te, li.bv);
      this.a(cjo.ry, li.bv);
      this.a(cjo.tA, li.bv);
      this.a(cjo.tf, li.bv);
      this.a(cjo.pi, li.bv);
      this.a(cjo.nE, li.bv);
      this.a(cjo.vc, li.bv);
      this.a(cjo.nc, li.bv);
      this.a(cjo.rs, li.bv);
      this.a(cjo.rw, li.bv);
      this.a(cjo.rE, li.bv);
      this.a(cjo.vg, li.bv);
      this.a(cjo.vw, li.bv);
      this.a(cjo.qk, li.bv);
      this.a(cjo.qs, li.bv);
      this.a(cjo.tj, li.bv);
      this.a(cjo.nT, li.bv);
      this.a(cjo.pm, li.bv);
      this.a(cjo.ok, li.bx);
      this.a(cjo.tq, li.bv);
      this.a(cjo.ol, li.bx);
      this.a(cjo.tN, li.bv);
      this.a(cjo.oj, li.bx);
      this.a(cjo.oi, li.bx);
      this.a(cjo.oh, li.bx);
      this.a(cjo.nU, li.bv);
      this.a(cjo.rt, li.bv);
      this.a(cjo.qB, li.bv);
      this.a(cjo.qH, li.bv);
      this.a(cjo.oG, li.bv);
      this.a(cjo.uY, li.bv);
      this.a(cjo.vA, li.bv);
      this.a(cjo.vD, li.bv);
      this.a(cjo.ne, li.bv);
      this.a(cjo.qr, li.bv);
      this.a(cjo.nP, li.bv);
      this.a(cjo.op, li.bx);
      this.a(cjo.oq, li.bx);
      this.a(cjo.tM, li.bv);
      this.a(cjo.nQ, li.bv);
      this.a(cjo.uB, li.bv);
      this.a(cjo.oo, li.bx);
      this.a(cjo.on, li.bx);
      this.a(cjo.om, li.bx);
      this.a(cjo.ti, li.bv);
      this.a(cjo.no, li.bv);
      this.a(cjo.np, li.bv);
      this.a(cjo.uC, li.bv);
      this.a(cjo.nM, li.bv);
      this.a(cjo.pM, li.bv);
      this.a(cjo.pP, li.bv);
      this.a(cjo.tP, li.bv);
      this.a(cjo.qx, li.bv);
      this.a(cjo.qC, li.bv);
      this.a(cjo.qz, li.bv);
      this.a(cjo.qw, li.bv);
      this.a(cjo.rA, li.bv);
      this.a(cjo.nw, li.bv);
      this.a(cjo.nx, li.bv);
      this.a(cjo.ny, li.bv);
      this.a(cjo.nz, li.bv);
      this.a(cjo.tp, li.bv);
      this.a(cjo.rh, li.bv);
      this.a(cjo.pQ, li.bv);
      this.a(cjo.na, li.bv);
      this.a(cjo.vf, li.bv);
      this.a(cjo.oD, li.bv);
      this.a(cjo.uU, li.bv);
      this.a(cjo.uO, li.bw);
      this.a(cjo.uE, li.bw);
      this.a(cjo.uG, li.bw);
      this.a(cjo.uF, li.bw);
      this.a(cjo.uH, li.bw);
      this.a(cjo.uI, li.bw);
      this.a(cjo.uJ, li.bw);
      this.a(cjo.uK, li.bw);
      this.a(cjo.uT, li.bw);
      this.a(cjo.uL, li.bw);
      this.a(cjo.uM, li.bw);
      this.a(cjo.uP, li.bw);
      this.a(cjo.uN, li.bw);
      this.a(cjo.uQ, li.bw);
      this.a(cjo.uR, li.bw);
      this.a(cjo.uS, li.bw);
      this.a(cjo.tT, li.bv);
      this.a(cjo.tR, li.bv);
      this.a(cjo.uX, li.bv);
      this.a(cjo.oz, li.bx);
      this.a(cjo.oA, li.bx);
      this.a(cjo.nV, li.bv);
      this.a(cjo.oy, li.bx);
      this.a(cjo.nW, li.bv);
      this.a(cjo.ox, li.bx);
      this.a(cjo.ow, li.bx);
      this.a(cjo.tD, li.bv);
      this.a(cjo.ty, li.bv);
      this.a(cjo.ni, li.bv);
      this.a(cjo.nj, li.bv);
      this.a(cjo.qv, li.bv);
      this.a(cjo.pl, li.bv);
      this.a(cjo.qa, li.bv);
      this.a(cjo.uW, li.bv);
      this.a(cjo.vh, li.bv);
      this.a(cjo.qA, li.bv);
      this.a(cjo.to, li.bv);
      this.a(cjo.un, li.bv);
      this.a(cjo.pj, li.bv);
      this.a(cjo.pN, li.bv);
      this.a(cjo.tF, li.bv);
      this.a(cjo.tE, li.bv);
      this.a(cjo.qo, li.bv);
      this.a(cjo.pR, li.bv);
      this.a(cjo.tz, li.bv);
      this.a(cjo.qE, li.bv);
      this.a(cjo.nN, li.bv);
      this.a(cjo.tG, li.bv);
      this.a(cjo.tJ, li.bv);
      this.a(cjo.tK, li.bv);
      this.a(cjo.tI, li.bv);
      this.a(cjo.qI, li.bv);
      this.a(cjo.rp, li.bv);
      this.a(cjo.mZ, li.bv);
      this.a(cjo.qm, li.bv);
      this.a(cjo.pS, li.bv);
      this.a(cjo.nD, li.bv);
      this.a(cjo.rg, li.bv);
      this.a(cjo.uA, li.bv);
      this.a(cjo.ve, li.bv);
      this.a(cjo.qc, li.bv);
      this.a(cjo.pO, li.bv);
      this.a(cjo.wu, li.bv);
      this.a(cjo.uv, li.bv);
      this.a(cjo.rx, li.bv);
      this.a(cjo.nk, li.bv);
      this.a(cjo.nl, li.bv);
      this.a(cjo.qj, li.bv);
      this.a(cjo.oB, li.bx);
      this.a(cjo.of, li.bx);
      this.a(cjo.og, li.bx);
      this.a(cjo.oe, li.bx);
      this.a(cjo.od, li.bx);
      this.a(cjo.oc, li.bx);
      this.a(cjo.qM, li.bv);
      this.a(cjo.va, li.bv);
      this.a(cjo.nd, li.bv);
      this.a(cjo.uz, li.bv);
      this.a(cjo.uV, li.bv);
      this.a(cjo.qn, li.bv);
      this.a(cjo.pU, li.bv);
      this.a(cjo.pV, li.bv);
      this.a(cjo.pW, li.bv);
      this.a(cjo.pL, li.bv);
      this.a(cjo.oI, li.bv);
      this.a(cjo.qu, li.bv);
      this.a(cjo.oa, li.bx);
      this.a(cjo.ob, li.bx);
      this.a(cjo.nZ, li.bx);
      this.a(cjo.nY, li.bx);
      this.a(cjo.nX, li.bx);
      this.a(cjo.tg, li.bv);
      this.a(cjo.th, li.bv);
      this.a(cjo.qy, li.bv);
      this.a(cjo.ww, li.bv);
      this.a(cjo.wx, li.bv);
      this.a(cjo.wy, li.bv);
      this.a(cjo.wz, li.bv);
      this.a(cjo.wA, li.bv);
      this.a(cjo.wB, li.bv);
      this.a(cjo.wC, li.bv);
      this.a(cjo.wD, li.bv);
      this.a(cjo.wE, li.bv);
      this.a(cjo.wF, li.bv);
      this.a(cjo.wG, li.bv);
      this.a(cjo.wH, li.bv);
      this.a(cjo.wI, li.bv);
      this.a(cjo.wJ, li.bv);
      this.a(cjo.wK, li.bv);
      this.a(cjo.wL, li.bv);
      this.a(cjo.wM, li.bv);
      this.a(cjo.uD, cjo.oB, li.bx);
      this.a(cjo.pn, cjo.pm, li.bv);

      for (cjg $$0 : jb.i) {
         if ($$0 instanceof cgv $$1) {
            this.a($$1);
         }
      }

      this.a(cjo.wN, li.bv);
      this.a(cjo.wO, li.bv);
      this.a(cjo.wP, li.bv);
      this.a(cjo.wQ, li.bv);
      this.a(cjo.wR, li.bv);
      this.a(cjo.wS, li.bv);
      this.a(cjo.wT, li.bv);
      this.a(cjo.wU, li.bv);
      this.a(cjo.wV, li.bv);
      this.a(cjo.wW, li.bv);
      this.a(cjo.wX, li.bv);
      this.a(cjo.wY, li.bv);
      this.a(cjo.wZ, li.bv);
      this.a(cjo.xa, li.bv);
      this.a(cjo.xb, li.bv);
      this.a(cjo.xc, li.bv);
      this.a(cjo.xd, li.bv);
      this.a(cjo.xe, li.bv);
      this.a(cjo.xf, li.bv);
      this.a(cjo.xg, li.bv);
   }

   static record a(String a, float b, Map<cgw, String> c) {
      public String a(cgw $$0) {
         return this.c.getOrDefault($$0, this.a);
      }
   }
}
