import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Supplier;

public class kt {
   public static final aeu a = new aeu("trim_type");
   private static final List<kt.a> b = List.of(
      new kt.a("quartz", 0.1F, Map.of()),
      new kt.a("iron", 0.2F, Map.of(cgm.c, "iron_darker")),
      new kt.a("netherite", 0.3F, Map.of(cgm.g, "netherite_darker")),
      new kt.a("redstone", 0.4F, Map.of()),
      new kt.a("copper", 0.5F, Map.of()),
      new kt.a("gold", 0.6F, Map.of(cgm.d, "gold_darker")),
      new kt.a("emerald", 0.7F, Map.of()),
      new kt.a("diamond", 0.8F, Map.of(cgm.e, "diamond_darker")),
      new kt.a("lapis", 0.9F, Map.of()),
      new kt.a("amethyst", 1.0F, Map.of())
   );
   private final BiConsumer<aeu, Supplier<JsonElement>> c;

   public kt(BiConsumer<aeu, Supplier<JsonElement>> $$0) {
      this.c = $$0;
   }

   private void a(civ $$0, lh $$1) {
      $$1.a(lg.a($$0), lj.b($$0), this.c);
   }

   private void a(civ $$0, String $$1, lh $$2) {
      $$2.a(lg.a($$0, $$1), lj.k(lj.a($$0, $$1)), this.c);
   }

   private void a(civ $$0, civ $$1, lh $$2) {
      $$2.a(lg.a($$0), lj.b($$1), this.c);
   }

   private void a(civ $$0) {
      for (int $$1 = 0; $$1 < 32; $$1++) {
         if ($$1 != 16) {
            this.a($$0, String.format(Locale.ROOT, "_%02d", $$1), li.bv);
         }
      }
   }

   private void b(civ $$0) {
      for (int $$1 = 1; $$1 < 64; $$1++) {
         this.a($$0, String.format(Locale.ROOT, "_%02d", $$1), li.bv);
      }
   }

   private void a(aeu $$0, aeu $$1, aeu $$2) {
      li.bz.a($$0, lj.c($$1, $$2), this.c);
   }

   private void a(aeu $$0, aeu $$1, aeu $$2, aeu $$3) {
      li.bA.a($$0, lj.a($$1, $$2, $$3), this.c);
   }

   private aeu a(aeu $$0, String $$1) {
      return $$0.e("_" + $$1 + "_trim");
   }

   private JsonObject a(aeu $$0, Map<lk, aeu> $$1, cgl $$2) {
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

   private void a(cgk $$0) {
      aeu $$1 = lg.a($$0);
      aeu $$2 = lj.c($$0);
      aeu $$3 = lj.a($$0, "_overlay");
      if ($$0.d() == cgm.a) {
         li.bz.a($$1, lj.c($$2, $$3), this.c, ($$1x, $$2x) -> this.a($$1x, $$2x, $$0.d()));
      } else {
         li.bv.a($$1, lj.k($$2), this.c, ($$1x, $$2x) -> this.a($$1x, $$2x, $$0.d()));
      }

      for (kt.a $$4 : b) {
         String $$5 = $$4.a($$0.d());
         aeu $$6 = this.a($$1, $$5);
         String $$7 = $$0.b().b() + "_trim_" + $$5;
         aeu $$8 = new aeu($$7).d("trims/items/");
         if ($$0.d() == cgm.a) {
            this.a($$6, $$2, $$3, $$8);
         } else {
            this.a($$6, $$2, $$8);
         }
      }
   }

   public void a() {
      this.a(cjd.nq, li.bv);
      this.a(cjd.ns, li.bv);
      this.a(cjd.nr, li.bv);
      this.a(cjd.nt, li.bv);
      this.a(cjd.nO, li.bv);
      this.a(cjd.nF, li.bv);
      this.a(cjd.tL, li.bv);
      this.a(cjd.nH, li.bv);
      this.a(cjd.tn, li.bv);
      this.a(cjd.dv, li.bx);
      this.a(cjd.rl, li.bv);
      this.a(cjd.uq, li.bv);
      this.a(cjd.us, li.bv);
      this.a(cjd.nm, li.bv);
      this.a(cjd.nn, li.bv);
      this.a(cjd.qJ, li.bv);
      this.a(cjd.rz, li.bv);
      this.a(cjd.rr, li.bx);
      this.a(cjd.qF, li.bv);
      this.a(cjd.qK, li.bv);
      this.a(cjd.qb, li.bv);
      this.a(cjd.oC, li.bv);
      this.a(cjd.oJ, li.bv);
      this.a(cjd.pX, li.bv);
      this.a(cjd.qG, li.bv);
      this.a(cjd.pK, li.bv);
      this.a(cjd.nf, li.by);
      this.a(cjd.ng, li.by);
      this.a(cjd.nJ, li.bv);
      this.a(cjd.nb, li.bv);
      this.a(cjd.rn, li.bv);
      this.a(cjd.um, li.bv);
      this.a(cjd.pY, li.bv);
      this.b(cjd.qi);
      this.a(cjd.nI, li.bv);
      this.a(cjd.pT, li.bv);
      this.a(cjd.tS, li.bv);
      this.a(cjd.qe);
      this.a(cjd.qf);
      this.a(cjd.rm, li.bv);
      this.a(cjd.ro, li.bv);
      this.a(cjd.qp, li.bv);
      this.a(cjd.tU, li.bv);
      this.a(cjd.pk, li.bv);
      this.a(cjd.tH, li.bv);
      this.a(cjd.qq, li.bv);
      this.a(cjd.re, li.bv);
      this.a(cjd.nR, li.bv);
      this.a(cjd.nS, li.bv);
      this.a(cjd.vd, li.bv);
      this.a(cjd.qD, li.bv);
      this.a(cjd.nu, li.bv);
      this.a(cjd.nv, li.bv);
      this.a(cjd.nK, li.bv);
      this.a(cjd.ou, li.bx);
      this.a(cjd.ov, li.bx);
      this.a(cjd.tO, li.bv);
      this.a(cjd.ot, li.bx);
      this.a(cjd.os, li.bx);
      this.a(cjd.or, li.bx);
      this.a(cjd.ut, li.bv);
      this.a(cjd.ri, li.bv);
      this.a(cjd.qd, li.bv);
      this.a(cjd.nL, li.bv);
      this.a(cjd.tC, li.bv);
      this.a(cjd.rD, li.bv);
      this.a(cjd.rq, li.bv);
      this.a(cjd.ul, li.bv);
      this.a(cjd.te, li.bv);
      this.a(cjd.ry, li.bv);
      this.a(cjd.tA, li.bv);
      this.a(cjd.tf, li.bv);
      this.a(cjd.pi, li.bv);
      this.a(cjd.nE, li.bv);
      this.a(cjd.vc, li.bv);
      this.a(cjd.nc, li.bv);
      this.a(cjd.rs, li.bv);
      this.a(cjd.rw, li.bv);
      this.a(cjd.rE, li.bv);
      this.a(cjd.vg, li.bv);
      this.a(cjd.vw, li.bv);
      this.a(cjd.qk, li.bv);
      this.a(cjd.qs, li.bv);
      this.a(cjd.tj, li.bv);
      this.a(cjd.nT, li.bv);
      this.a(cjd.pm, li.bv);
      this.a(cjd.ok, li.bx);
      this.a(cjd.tq, li.bv);
      this.a(cjd.ol, li.bx);
      this.a(cjd.tN, li.bv);
      this.a(cjd.oj, li.bx);
      this.a(cjd.oi, li.bx);
      this.a(cjd.oh, li.bx);
      this.a(cjd.nU, li.bv);
      this.a(cjd.rt, li.bv);
      this.a(cjd.qB, li.bv);
      this.a(cjd.qH, li.bv);
      this.a(cjd.oG, li.bv);
      this.a(cjd.uY, li.bv);
      this.a(cjd.vA, li.bv);
      this.a(cjd.vD, li.bv);
      this.a(cjd.ne, li.bv);
      this.a(cjd.qr, li.bv);
      this.a(cjd.nP, li.bv);
      this.a(cjd.op, li.bx);
      this.a(cjd.oq, li.bx);
      this.a(cjd.tM, li.bv);
      this.a(cjd.nQ, li.bv);
      this.a(cjd.uB, li.bv);
      this.a(cjd.oo, li.bx);
      this.a(cjd.on, li.bx);
      this.a(cjd.om, li.bx);
      this.a(cjd.ti, li.bv);
      this.a(cjd.no, li.bv);
      this.a(cjd.np, li.bv);
      this.a(cjd.uC, li.bv);
      this.a(cjd.nM, li.bv);
      this.a(cjd.pM, li.bv);
      this.a(cjd.pP, li.bv);
      this.a(cjd.tP, li.bv);
      this.a(cjd.qx, li.bv);
      this.a(cjd.qC, li.bv);
      this.a(cjd.qz, li.bv);
      this.a(cjd.qw, li.bv);
      this.a(cjd.rA, li.bv);
      this.a(cjd.nw, li.bv);
      this.a(cjd.nx, li.bv);
      this.a(cjd.ny, li.bv);
      this.a(cjd.nz, li.bv);
      this.a(cjd.tp, li.bv);
      this.a(cjd.rh, li.bv);
      this.a(cjd.pQ, li.bv);
      this.a(cjd.na, li.bv);
      this.a(cjd.vf, li.bv);
      this.a(cjd.oD, li.bv);
      this.a(cjd.uU, li.bv);
      this.a(cjd.uO, li.bw);
      this.a(cjd.uE, li.bw);
      this.a(cjd.uG, li.bw);
      this.a(cjd.uF, li.bw);
      this.a(cjd.uH, li.bw);
      this.a(cjd.uI, li.bw);
      this.a(cjd.uJ, li.bw);
      this.a(cjd.uK, li.bw);
      this.a(cjd.uT, li.bw);
      this.a(cjd.uL, li.bw);
      this.a(cjd.uM, li.bw);
      this.a(cjd.uP, li.bw);
      this.a(cjd.uN, li.bw);
      this.a(cjd.uQ, li.bw);
      this.a(cjd.uR, li.bw);
      this.a(cjd.uS, li.bw);
      this.a(cjd.tT, li.bv);
      this.a(cjd.tR, li.bv);
      this.a(cjd.uX, li.bv);
      this.a(cjd.oz, li.bx);
      this.a(cjd.oA, li.bx);
      this.a(cjd.nV, li.bv);
      this.a(cjd.oy, li.bx);
      this.a(cjd.nW, li.bv);
      this.a(cjd.ox, li.bx);
      this.a(cjd.ow, li.bx);
      this.a(cjd.tD, li.bv);
      this.a(cjd.ty, li.bv);
      this.a(cjd.ni, li.bv);
      this.a(cjd.nj, li.bv);
      this.a(cjd.qv, li.bv);
      this.a(cjd.pl, li.bv);
      this.a(cjd.qa, li.bv);
      this.a(cjd.uW, li.bv);
      this.a(cjd.vh, li.bv);
      this.a(cjd.qA, li.bv);
      this.a(cjd.to, li.bv);
      this.a(cjd.un, li.bv);
      this.a(cjd.pj, li.bv);
      this.a(cjd.pN, li.bv);
      this.a(cjd.tF, li.bv);
      this.a(cjd.tE, li.bv);
      this.a(cjd.qo, li.bv);
      this.a(cjd.pR, li.bv);
      this.a(cjd.tz, li.bv);
      this.a(cjd.qE, li.bv);
      this.a(cjd.nN, li.bv);
      this.a(cjd.tG, li.bv);
      this.a(cjd.tJ, li.bv);
      this.a(cjd.tK, li.bv);
      this.a(cjd.tI, li.bv);
      this.a(cjd.qI, li.bv);
      this.a(cjd.rp, li.bv);
      this.a(cjd.mZ, li.bv);
      this.a(cjd.qm, li.bv);
      this.a(cjd.pS, li.bv);
      this.a(cjd.nD, li.bv);
      this.a(cjd.rg, li.bv);
      this.a(cjd.uA, li.bv);
      this.a(cjd.ve, li.bv);
      this.a(cjd.qc, li.bv);
      this.a(cjd.pO, li.bv);
      this.a(cjd.wu, li.bv);
      this.a(cjd.uv, li.bv);
      this.a(cjd.rx, li.bv);
      this.a(cjd.nk, li.bv);
      this.a(cjd.nl, li.bv);
      this.a(cjd.qj, li.bv);
      this.a(cjd.oB, li.bx);
      this.a(cjd.of, li.bx);
      this.a(cjd.og, li.bx);
      this.a(cjd.oe, li.bx);
      this.a(cjd.od, li.bx);
      this.a(cjd.oc, li.bx);
      this.a(cjd.qM, li.bv);
      this.a(cjd.va, li.bv);
      this.a(cjd.nd, li.bv);
      this.a(cjd.uz, li.bv);
      this.a(cjd.uV, li.bv);
      this.a(cjd.qn, li.bv);
      this.a(cjd.pU, li.bv);
      this.a(cjd.pV, li.bv);
      this.a(cjd.pW, li.bv);
      this.a(cjd.pL, li.bv);
      this.a(cjd.oI, li.bv);
      this.a(cjd.qu, li.bv);
      this.a(cjd.oa, li.bx);
      this.a(cjd.ob, li.bx);
      this.a(cjd.nZ, li.bx);
      this.a(cjd.nY, li.bx);
      this.a(cjd.nX, li.bx);
      this.a(cjd.tg, li.bv);
      this.a(cjd.th, li.bv);
      this.a(cjd.qy, li.bv);
      this.a(cjd.ww, li.bv);
      this.a(cjd.wx, li.bv);
      this.a(cjd.wy, li.bv);
      this.a(cjd.wz, li.bv);
      this.a(cjd.wA, li.bv);
      this.a(cjd.wB, li.bv);
      this.a(cjd.wC, li.bv);
      this.a(cjd.wD, li.bv);
      this.a(cjd.wE, li.bv);
      this.a(cjd.wF, li.bv);
      this.a(cjd.wG, li.bv);
      this.a(cjd.wH, li.bv);
      this.a(cjd.wI, li.bv);
      this.a(cjd.wJ, li.bv);
      this.a(cjd.wK, li.bv);
      this.a(cjd.wL, li.bv);
      this.a(cjd.wM, li.bv);
      this.a(cjd.uD, cjd.oB, li.bx);
      this.a(cjd.pn, cjd.pm, li.bv);

      for (civ $$0 : jd.i) {
         if ($$0 instanceof cgk $$1) {
            this.a($$1);
         }
      }

      this.a(cjd.wN, li.bv);
      this.a(cjd.wO, li.bv);
      this.a(cjd.wP, li.bv);
      this.a(cjd.wQ, li.bv);
      this.a(cjd.wR, li.bv);
      this.a(cjd.wS, li.bv);
      this.a(cjd.wT, li.bv);
      this.a(cjd.wU, li.bv);
      this.a(cjd.wV, li.bv);
      this.a(cjd.wW, li.bv);
      this.a(cjd.wX, li.bv);
      this.a(cjd.wY, li.bv);
      this.a(cjd.wZ, li.bv);
      this.a(cjd.xa, li.bv);
      this.a(cjd.xb, li.bv);
      this.a(cjd.xc, li.bv);
      this.a(cjd.xd, li.bv);
      this.a(cjd.xe, li.bv);
      this.a(cjd.xf, li.bv);
      this.a(cjd.xg, li.bv);
   }

   static record a(String a, float b, Map<cgl, String> c) {
      public String a(cgl $$0) {
         return this.c.getOrDefault($$0, this.a);
      }
   }
}
