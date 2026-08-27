import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Supplier;

public class kv {
   public static final aex a = new aex("trim_type");
   private static final List<kv.a> b = List.of(
      new kv.a("quartz", 0.1F, Map.of()),
      new kv.a("iron", 0.2F, Map.of(cgr.c, "iron_darker")),
      new kv.a("netherite", 0.3F, Map.of(cgr.g, "netherite_darker")),
      new kv.a("redstone", 0.4F, Map.of()),
      new kv.a("copper", 0.5F, Map.of()),
      new kv.a("gold", 0.6F, Map.of(cgr.d, "gold_darker")),
      new kv.a("emerald", 0.7F, Map.of()),
      new kv.a("diamond", 0.8F, Map.of(cgr.e, "diamond_darker")),
      new kv.a("lapis", 0.9F, Map.of()),
      new kv.a("amethyst", 1.0F, Map.of())
   );
   private final BiConsumer<aex, Supplier<JsonElement>> c;

   public kv(BiConsumer<aex, Supplier<JsonElement>> $$0) {
      this.c = $$0;
   }

   private void a(cja $$0, lj $$1) {
      $$1.a(li.a($$0), ll.b($$0), this.c);
   }

   private void a(cja $$0, String $$1, lj $$2) {
      $$2.a(li.a($$0, $$1), ll.k(ll.a($$0, $$1)), this.c);
   }

   private void a(cja $$0, cja $$1, lj $$2) {
      $$2.a(li.a($$0), ll.b($$1), this.c);
   }

   private void a(cja $$0) {
      for (int $$1 = 0; $$1 < 32; $$1++) {
         if ($$1 != 16) {
            this.a($$0, String.format(Locale.ROOT, "_%02d", $$1), lk.bv);
         }
      }
   }

   private void b(cja $$0) {
      for (int $$1 = 1; $$1 < 64; $$1++) {
         this.a($$0, String.format(Locale.ROOT, "_%02d", $$1), lk.bv);
      }
   }

   private void a(aex $$0, aex $$1, aex $$2) {
      lk.bz.a($$0, ll.c($$1, $$2), this.c);
   }

   private void a(aex $$0, aex $$1, aex $$2, aex $$3) {
      lk.bA.a($$0, ll.a($$1, $$2, $$3), this.c);
   }

   private aex a(aex $$0, String $$1) {
      return $$0.e("_" + $$1 + "_trim");
   }

   private JsonObject a(aex $$0, Map<lm, aex> $$1, cgq $$2) {
      JsonObject $$3 = lk.bz.a($$0, $$1);
      JsonArray $$4 = new JsonArray();

      for (kv.a $$5 : b) {
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
      aex $$1 = li.a($$0);
      aex $$2 = ll.c($$0);
      aex $$3 = ll.a($$0, "_overlay");
      if ($$0.d() == cgr.a) {
         lk.bz.a($$1, ll.c($$2, $$3), this.c, ($$1x, $$2x) -> this.a($$1x, $$2x, $$0.d()));
      } else {
         lk.bv.a($$1, ll.k($$2), this.c, ($$1x, $$2x) -> this.a($$1x, $$2x, $$0.d()));
      }

      for (kv.a $$4 : b) {
         String $$5 = $$4.a($$0.d());
         aex $$6 = this.a($$1, $$5);
         String $$7 = $$0.b().b() + "_trim_" + $$5;
         aex $$8 = new aex($$7).d("trims/items/");
         if ($$0.d() == cgr.a) {
            this.a($$6, $$2, $$3, $$8);
         } else {
            this.a($$6, $$2, $$8);
         }
      }
   }

   public void a() {
      this.a(cji.nq, lk.bv);
      this.a(cji.ns, lk.bv);
      this.a(cji.nr, lk.bv);
      this.a(cji.nt, lk.bv);
      this.a(cji.nO, lk.bv);
      this.a(cji.nF, lk.bv);
      this.a(cji.tL, lk.bv);
      this.a(cji.nH, lk.bv);
      this.a(cji.tn, lk.bv);
      this.a(cji.dv, lk.bx);
      this.a(cji.rl, lk.bv);
      this.a(cji.uq, lk.bv);
      this.a(cji.us, lk.bv);
      this.a(cji.nm, lk.bv);
      this.a(cji.nn, lk.bv);
      this.a(cji.qJ, lk.bv);
      this.a(cji.rz, lk.bv);
      this.a(cji.rr, lk.bx);
      this.a(cji.qF, lk.bv);
      this.a(cji.qK, lk.bv);
      this.a(cji.qb, lk.bv);
      this.a(cji.oC, lk.bv);
      this.a(cji.oJ, lk.bv);
      this.a(cji.pX, lk.bv);
      this.a(cji.qG, lk.bv);
      this.a(cji.pK, lk.bv);
      this.a(cji.nf, lk.by);
      this.a(cji.ng, lk.by);
      this.a(cji.nJ, lk.bv);
      this.a(cji.nb, lk.bv);
      this.a(cji.rn, lk.bv);
      this.a(cji.um, lk.bv);
      this.a(cji.pY, lk.bv);
      this.b(cji.qi);
      this.a(cji.nI, lk.bv);
      this.a(cji.pT, lk.bv);
      this.a(cji.tS, lk.bv);
      this.a(cji.qe);
      this.a(cji.qf);
      this.a(cji.rm, lk.bv);
      this.a(cji.ro, lk.bv);
      this.a(cji.qp, lk.bv);
      this.a(cji.tU, lk.bv);
      this.a(cji.pk, lk.bv);
      this.a(cji.tH, lk.bv);
      this.a(cji.qq, lk.bv);
      this.a(cji.re, lk.bv);
      this.a(cji.nR, lk.bv);
      this.a(cji.nS, lk.bv);
      this.a(cji.vd, lk.bv);
      this.a(cji.qD, lk.bv);
      this.a(cji.nu, lk.bv);
      this.a(cji.nv, lk.bv);
      this.a(cji.nK, lk.bv);
      this.a(cji.ou, lk.bx);
      this.a(cji.ov, lk.bx);
      this.a(cji.tO, lk.bv);
      this.a(cji.ot, lk.bx);
      this.a(cji.os, lk.bx);
      this.a(cji.or, lk.bx);
      this.a(cji.ut, lk.bv);
      this.a(cji.ri, lk.bv);
      this.a(cji.qd, lk.bv);
      this.a(cji.nL, lk.bv);
      this.a(cji.tC, lk.bv);
      this.a(cji.rD, lk.bv);
      this.a(cji.rq, lk.bv);
      this.a(cji.ul, lk.bv);
      this.a(cji.te, lk.bv);
      this.a(cji.ry, lk.bv);
      this.a(cji.tA, lk.bv);
      this.a(cji.tf, lk.bv);
      this.a(cji.pi, lk.bv);
      this.a(cji.nE, lk.bv);
      this.a(cji.vc, lk.bv);
      this.a(cji.nc, lk.bv);
      this.a(cji.rs, lk.bv);
      this.a(cji.rw, lk.bv);
      this.a(cji.rE, lk.bv);
      this.a(cji.vg, lk.bv);
      this.a(cji.vw, lk.bv);
      this.a(cji.qk, lk.bv);
      this.a(cji.qs, lk.bv);
      this.a(cji.tj, lk.bv);
      this.a(cji.nT, lk.bv);
      this.a(cji.pm, lk.bv);
      this.a(cji.ok, lk.bx);
      this.a(cji.tq, lk.bv);
      this.a(cji.ol, lk.bx);
      this.a(cji.tN, lk.bv);
      this.a(cji.oj, lk.bx);
      this.a(cji.oi, lk.bx);
      this.a(cji.oh, lk.bx);
      this.a(cji.nU, lk.bv);
      this.a(cji.rt, lk.bv);
      this.a(cji.qB, lk.bv);
      this.a(cji.qH, lk.bv);
      this.a(cji.oG, lk.bv);
      this.a(cji.uY, lk.bv);
      this.a(cji.vA, lk.bv);
      this.a(cji.vD, lk.bv);
      this.a(cji.ne, lk.bv);
      this.a(cji.qr, lk.bv);
      this.a(cji.nP, lk.bv);
      this.a(cji.op, lk.bx);
      this.a(cji.oq, lk.bx);
      this.a(cji.tM, lk.bv);
      this.a(cji.nQ, lk.bv);
      this.a(cji.uB, lk.bv);
      this.a(cji.oo, lk.bx);
      this.a(cji.on, lk.bx);
      this.a(cji.om, lk.bx);
      this.a(cji.ti, lk.bv);
      this.a(cji.no, lk.bv);
      this.a(cji.np, lk.bv);
      this.a(cji.uC, lk.bv);
      this.a(cji.nM, lk.bv);
      this.a(cji.pM, lk.bv);
      this.a(cji.pP, lk.bv);
      this.a(cji.tP, lk.bv);
      this.a(cji.qx, lk.bv);
      this.a(cji.qC, lk.bv);
      this.a(cji.qz, lk.bv);
      this.a(cji.qw, lk.bv);
      this.a(cji.rA, lk.bv);
      this.a(cji.nw, lk.bv);
      this.a(cji.nx, lk.bv);
      this.a(cji.ny, lk.bv);
      this.a(cji.nz, lk.bv);
      this.a(cji.tp, lk.bv);
      this.a(cji.rh, lk.bv);
      this.a(cji.pQ, lk.bv);
      this.a(cji.na, lk.bv);
      this.a(cji.vf, lk.bv);
      this.a(cji.oD, lk.bv);
      this.a(cji.uU, lk.bv);
      this.a(cji.uO, lk.bw);
      this.a(cji.uE, lk.bw);
      this.a(cji.uG, lk.bw);
      this.a(cji.uF, lk.bw);
      this.a(cji.uH, lk.bw);
      this.a(cji.uI, lk.bw);
      this.a(cji.uJ, lk.bw);
      this.a(cji.uK, lk.bw);
      this.a(cji.uT, lk.bw);
      this.a(cji.uL, lk.bw);
      this.a(cji.uM, lk.bw);
      this.a(cji.uP, lk.bw);
      this.a(cji.uN, lk.bw);
      this.a(cji.uQ, lk.bw);
      this.a(cji.uR, lk.bw);
      this.a(cji.uS, lk.bw);
      this.a(cji.tT, lk.bv);
      this.a(cji.tR, lk.bv);
      this.a(cji.uX, lk.bv);
      this.a(cji.oz, lk.bx);
      this.a(cji.oA, lk.bx);
      this.a(cji.nV, lk.bv);
      this.a(cji.oy, lk.bx);
      this.a(cji.nW, lk.bv);
      this.a(cji.ox, lk.bx);
      this.a(cji.ow, lk.bx);
      this.a(cji.tD, lk.bv);
      this.a(cji.ty, lk.bv);
      this.a(cji.ni, lk.bv);
      this.a(cji.nj, lk.bv);
      this.a(cji.qv, lk.bv);
      this.a(cji.pl, lk.bv);
      this.a(cji.qa, lk.bv);
      this.a(cji.uW, lk.bv);
      this.a(cji.vh, lk.bv);
      this.a(cji.qA, lk.bv);
      this.a(cji.to, lk.bv);
      this.a(cji.un, lk.bv);
      this.a(cji.pj, lk.bv);
      this.a(cji.pN, lk.bv);
      this.a(cji.tF, lk.bv);
      this.a(cji.tE, lk.bv);
      this.a(cji.qo, lk.bv);
      this.a(cji.pR, lk.bv);
      this.a(cji.tz, lk.bv);
      this.a(cji.qE, lk.bv);
      this.a(cji.nN, lk.bv);
      this.a(cji.tG, lk.bv);
      this.a(cji.tJ, lk.bv);
      this.a(cji.tK, lk.bv);
      this.a(cji.tI, lk.bv);
      this.a(cji.qI, lk.bv);
      this.a(cji.rp, lk.bv);
      this.a(cji.mZ, lk.bv);
      this.a(cji.qm, lk.bv);
      this.a(cji.pS, lk.bv);
      this.a(cji.nD, lk.bv);
      this.a(cji.rg, lk.bv);
      this.a(cji.uA, lk.bv);
      this.a(cji.ve, lk.bv);
      this.a(cji.qc, lk.bv);
      this.a(cji.pO, lk.bv);
      this.a(cji.wu, lk.bv);
      this.a(cji.uv, lk.bv);
      this.a(cji.rx, lk.bv);
      this.a(cji.nk, lk.bv);
      this.a(cji.nl, lk.bv);
      this.a(cji.qj, lk.bv);
      this.a(cji.oB, lk.bx);
      this.a(cji.of, lk.bx);
      this.a(cji.og, lk.bx);
      this.a(cji.oe, lk.bx);
      this.a(cji.od, lk.bx);
      this.a(cji.oc, lk.bx);
      this.a(cji.qM, lk.bv);
      this.a(cji.va, lk.bv);
      this.a(cji.nd, lk.bv);
      this.a(cji.uz, lk.bv);
      this.a(cji.uV, lk.bv);
      this.a(cji.qn, lk.bv);
      this.a(cji.pU, lk.bv);
      this.a(cji.pV, lk.bv);
      this.a(cji.pW, lk.bv);
      this.a(cji.pL, lk.bv);
      this.a(cji.oI, lk.bv);
      this.a(cji.qu, lk.bv);
      this.a(cji.oa, lk.bx);
      this.a(cji.ob, lk.bx);
      this.a(cji.nZ, lk.bx);
      this.a(cji.nY, lk.bx);
      this.a(cji.nX, lk.bx);
      this.a(cji.tg, lk.bv);
      this.a(cji.th, lk.bv);
      this.a(cji.qy, lk.bv);
      this.a(cji.ww, lk.bv);
      this.a(cji.wx, lk.bv);
      this.a(cji.wy, lk.bv);
      this.a(cji.wz, lk.bv);
      this.a(cji.wA, lk.bv);
      this.a(cji.wB, lk.bv);
      this.a(cji.wC, lk.bv);
      this.a(cji.wD, lk.bv);
      this.a(cji.wE, lk.bv);
      this.a(cji.wF, lk.bv);
      this.a(cji.wG, lk.bv);
      this.a(cji.wH, lk.bv);
      this.a(cji.wI, lk.bv);
      this.a(cji.wJ, lk.bv);
      this.a(cji.wK, lk.bv);
      this.a(cji.wL, lk.bv);
      this.a(cji.wM, lk.bv);
      this.a(cji.uD, cji.oB, lk.bx);
      this.a(cji.pn, cji.pm, lk.bv);

      for (cja $$0 : jd.i) {
         if ($$0 instanceof cgp $$1) {
            this.a($$1);
         }
      }

      this.a(cji.wN, lk.bv);
      this.a(cji.wO, lk.bv);
      this.a(cji.wP, lk.bv);
      this.a(cji.wQ, lk.bv);
      this.a(cji.wR, lk.bv);
      this.a(cji.wS, lk.bv);
      this.a(cji.wT, lk.bv);
      this.a(cji.wU, lk.bv);
      this.a(cji.wV, lk.bv);
      this.a(cji.wW, lk.bv);
      this.a(cji.wX, lk.bv);
      this.a(cji.wY, lk.bv);
      this.a(cji.wZ, lk.bv);
      this.a(cji.xa, lk.bv);
      this.a(cji.xb, lk.bv);
      this.a(cji.xc, lk.bv);
      this.a(cji.xd, lk.bv);
      this.a(cji.xe, lk.bv);
      this.a(cji.xf, lk.bv);
      this.a(cji.xg, lk.bv);
   }

   static record a(String a, float b, Map<cgq, String> c) {
      public String a(cgq $$0) {
         return this.c.getOrDefault($$0, this.a);
      }
   }
}
