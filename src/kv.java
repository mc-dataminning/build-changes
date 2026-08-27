import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Supplier;

public class kv {
   public static final aey a = new aey("trim_type");
   private static final List<kv.a> b = List.of(
      new kv.a("quartz", 0.1F, Map.of()),
      new kv.a("iron", 0.2F, Map.of(cgt.c, "iron_darker")),
      new kv.a("netherite", 0.3F, Map.of(cgt.g, "netherite_darker")),
      new kv.a("redstone", 0.4F, Map.of()),
      new kv.a("copper", 0.5F, Map.of()),
      new kv.a("gold", 0.6F, Map.of(cgt.d, "gold_darker")),
      new kv.a("emerald", 0.7F, Map.of()),
      new kv.a("diamond", 0.8F, Map.of(cgt.e, "diamond_darker")),
      new kv.a("lapis", 0.9F, Map.of()),
      new kv.a("amethyst", 1.0F, Map.of())
   );
   private final BiConsumer<aey, Supplier<JsonElement>> c;

   public kv(BiConsumer<aey, Supplier<JsonElement>> $$0) {
      this.c = $$0;
   }

   private void a(cjc $$0, lj $$1) {
      $$1.a(li.a($$0), ll.b($$0), this.c);
   }

   private void a(cjc $$0, String $$1, lj $$2) {
      $$2.a(li.a($$0, $$1), ll.k(ll.a($$0, $$1)), this.c);
   }

   private void a(cjc $$0, cjc $$1, lj $$2) {
      $$2.a(li.a($$0), ll.b($$1), this.c);
   }

   private void a(cjc $$0) {
      for (int $$1 = 0; $$1 < 32; $$1++) {
         if ($$1 != 16) {
            this.a($$0, String.format(Locale.ROOT, "_%02d", $$1), lk.bv);
         }
      }
   }

   private void b(cjc $$0) {
      for (int $$1 = 1; $$1 < 64; $$1++) {
         this.a($$0, String.format(Locale.ROOT, "_%02d", $$1), lk.bv);
      }
   }

   private void a(aey $$0, aey $$1, aey $$2) {
      lk.bz.a($$0, ll.c($$1, $$2), this.c);
   }

   private void a(aey $$0, aey $$1, aey $$2, aey $$3) {
      lk.bA.a($$0, ll.a($$1, $$2, $$3), this.c);
   }

   private aey a(aey $$0, String $$1) {
      return $$0.e("_" + $$1 + "_trim");
   }

   private JsonObject a(aey $$0, Map<lm, aey> $$1, cgs $$2) {
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

   private void a(cgr $$0) {
      aey $$1 = li.a($$0);
      aey $$2 = ll.c($$0);
      aey $$3 = ll.a($$0, "_overlay");
      if ($$0.d() == cgt.a) {
         lk.bz.a($$1, ll.c($$2, $$3), this.c, ($$1x, $$2x) -> this.a($$1x, $$2x, $$0.d()));
      } else {
         lk.bv.a($$1, ll.k($$2), this.c, ($$1x, $$2x) -> this.a($$1x, $$2x, $$0.d()));
      }

      for (kv.a $$4 : b) {
         String $$5 = $$4.a($$0.d());
         aey $$6 = this.a($$1, $$5);
         String $$7 = $$0.b().b() + "_trim_" + $$5;
         aey $$8 = new aey($$7).d("trims/items/");
         if ($$0.d() == cgt.a) {
            this.a($$6, $$2, $$3, $$8);
         } else {
            this.a($$6, $$2, $$8);
         }
      }
   }

   public void a() {
      this.a(cjk.nq, lk.bv);
      this.a(cjk.ns, lk.bv);
      this.a(cjk.nr, lk.bv);
      this.a(cjk.nt, lk.bv);
      this.a(cjk.nO, lk.bv);
      this.a(cjk.nF, lk.bv);
      this.a(cjk.tL, lk.bv);
      this.a(cjk.nH, lk.bv);
      this.a(cjk.tn, lk.bv);
      this.a(cjk.dv, lk.bx);
      this.a(cjk.rl, lk.bv);
      this.a(cjk.uq, lk.bv);
      this.a(cjk.us, lk.bv);
      this.a(cjk.nm, lk.bv);
      this.a(cjk.nn, lk.bv);
      this.a(cjk.qJ, lk.bv);
      this.a(cjk.rz, lk.bv);
      this.a(cjk.rr, lk.bx);
      this.a(cjk.qF, lk.bv);
      this.a(cjk.qK, lk.bv);
      this.a(cjk.qb, lk.bv);
      this.a(cjk.oC, lk.bv);
      this.a(cjk.oJ, lk.bv);
      this.a(cjk.pX, lk.bv);
      this.a(cjk.qG, lk.bv);
      this.a(cjk.pK, lk.bv);
      this.a(cjk.nf, lk.by);
      this.a(cjk.ng, lk.by);
      this.a(cjk.nJ, lk.bv);
      this.a(cjk.nb, lk.bv);
      this.a(cjk.rn, lk.bv);
      this.a(cjk.um, lk.bv);
      this.a(cjk.pY, lk.bv);
      this.b(cjk.qi);
      this.a(cjk.nI, lk.bv);
      this.a(cjk.pT, lk.bv);
      this.a(cjk.tS, lk.bv);
      this.a(cjk.qe);
      this.a(cjk.qf);
      this.a(cjk.rm, lk.bv);
      this.a(cjk.ro, lk.bv);
      this.a(cjk.qp, lk.bv);
      this.a(cjk.tU, lk.bv);
      this.a(cjk.pk, lk.bv);
      this.a(cjk.tH, lk.bv);
      this.a(cjk.qq, lk.bv);
      this.a(cjk.re, lk.bv);
      this.a(cjk.nR, lk.bv);
      this.a(cjk.nS, lk.bv);
      this.a(cjk.vd, lk.bv);
      this.a(cjk.qD, lk.bv);
      this.a(cjk.nu, lk.bv);
      this.a(cjk.nv, lk.bv);
      this.a(cjk.nK, lk.bv);
      this.a(cjk.ou, lk.bx);
      this.a(cjk.ov, lk.bx);
      this.a(cjk.tO, lk.bv);
      this.a(cjk.ot, lk.bx);
      this.a(cjk.os, lk.bx);
      this.a(cjk.or, lk.bx);
      this.a(cjk.ut, lk.bv);
      this.a(cjk.ri, lk.bv);
      this.a(cjk.qd, lk.bv);
      this.a(cjk.nL, lk.bv);
      this.a(cjk.tC, lk.bv);
      this.a(cjk.rD, lk.bv);
      this.a(cjk.rq, lk.bv);
      this.a(cjk.ul, lk.bv);
      this.a(cjk.te, lk.bv);
      this.a(cjk.ry, lk.bv);
      this.a(cjk.tA, lk.bv);
      this.a(cjk.tf, lk.bv);
      this.a(cjk.pi, lk.bv);
      this.a(cjk.nE, lk.bv);
      this.a(cjk.vc, lk.bv);
      this.a(cjk.nc, lk.bv);
      this.a(cjk.rs, lk.bv);
      this.a(cjk.rw, lk.bv);
      this.a(cjk.rE, lk.bv);
      this.a(cjk.vg, lk.bv);
      this.a(cjk.vw, lk.bv);
      this.a(cjk.qk, lk.bv);
      this.a(cjk.qs, lk.bv);
      this.a(cjk.tj, lk.bv);
      this.a(cjk.nT, lk.bv);
      this.a(cjk.pm, lk.bv);
      this.a(cjk.ok, lk.bx);
      this.a(cjk.tq, lk.bv);
      this.a(cjk.ol, lk.bx);
      this.a(cjk.tN, lk.bv);
      this.a(cjk.oj, lk.bx);
      this.a(cjk.oi, lk.bx);
      this.a(cjk.oh, lk.bx);
      this.a(cjk.nU, lk.bv);
      this.a(cjk.rt, lk.bv);
      this.a(cjk.qB, lk.bv);
      this.a(cjk.qH, lk.bv);
      this.a(cjk.oG, lk.bv);
      this.a(cjk.uY, lk.bv);
      this.a(cjk.vA, lk.bv);
      this.a(cjk.vD, lk.bv);
      this.a(cjk.ne, lk.bv);
      this.a(cjk.qr, lk.bv);
      this.a(cjk.nP, lk.bv);
      this.a(cjk.op, lk.bx);
      this.a(cjk.oq, lk.bx);
      this.a(cjk.tM, lk.bv);
      this.a(cjk.nQ, lk.bv);
      this.a(cjk.uB, lk.bv);
      this.a(cjk.oo, lk.bx);
      this.a(cjk.on, lk.bx);
      this.a(cjk.om, lk.bx);
      this.a(cjk.ti, lk.bv);
      this.a(cjk.no, lk.bv);
      this.a(cjk.np, lk.bv);
      this.a(cjk.uC, lk.bv);
      this.a(cjk.nM, lk.bv);
      this.a(cjk.pM, lk.bv);
      this.a(cjk.pP, lk.bv);
      this.a(cjk.tP, lk.bv);
      this.a(cjk.qx, lk.bv);
      this.a(cjk.qC, lk.bv);
      this.a(cjk.qz, lk.bv);
      this.a(cjk.qw, lk.bv);
      this.a(cjk.rA, lk.bv);
      this.a(cjk.nw, lk.bv);
      this.a(cjk.nx, lk.bv);
      this.a(cjk.ny, lk.bv);
      this.a(cjk.nz, lk.bv);
      this.a(cjk.tp, lk.bv);
      this.a(cjk.rh, lk.bv);
      this.a(cjk.pQ, lk.bv);
      this.a(cjk.na, lk.bv);
      this.a(cjk.vf, lk.bv);
      this.a(cjk.oD, lk.bv);
      this.a(cjk.uU, lk.bv);
      this.a(cjk.uO, lk.bw);
      this.a(cjk.uE, lk.bw);
      this.a(cjk.uG, lk.bw);
      this.a(cjk.uF, lk.bw);
      this.a(cjk.uH, lk.bw);
      this.a(cjk.uI, lk.bw);
      this.a(cjk.uJ, lk.bw);
      this.a(cjk.uK, lk.bw);
      this.a(cjk.uT, lk.bw);
      this.a(cjk.uL, lk.bw);
      this.a(cjk.uM, lk.bw);
      this.a(cjk.uP, lk.bw);
      this.a(cjk.uN, lk.bw);
      this.a(cjk.uQ, lk.bw);
      this.a(cjk.uR, lk.bw);
      this.a(cjk.uS, lk.bw);
      this.a(cjk.tT, lk.bv);
      this.a(cjk.tR, lk.bv);
      this.a(cjk.uX, lk.bv);
      this.a(cjk.oz, lk.bx);
      this.a(cjk.oA, lk.bx);
      this.a(cjk.nV, lk.bv);
      this.a(cjk.oy, lk.bx);
      this.a(cjk.nW, lk.bv);
      this.a(cjk.ox, lk.bx);
      this.a(cjk.ow, lk.bx);
      this.a(cjk.tD, lk.bv);
      this.a(cjk.ty, lk.bv);
      this.a(cjk.ni, lk.bv);
      this.a(cjk.nj, lk.bv);
      this.a(cjk.qv, lk.bv);
      this.a(cjk.pl, lk.bv);
      this.a(cjk.qa, lk.bv);
      this.a(cjk.uW, lk.bv);
      this.a(cjk.vh, lk.bv);
      this.a(cjk.qA, lk.bv);
      this.a(cjk.to, lk.bv);
      this.a(cjk.un, lk.bv);
      this.a(cjk.pj, lk.bv);
      this.a(cjk.pN, lk.bv);
      this.a(cjk.tF, lk.bv);
      this.a(cjk.tE, lk.bv);
      this.a(cjk.qo, lk.bv);
      this.a(cjk.pR, lk.bv);
      this.a(cjk.tz, lk.bv);
      this.a(cjk.qE, lk.bv);
      this.a(cjk.nN, lk.bv);
      this.a(cjk.tG, lk.bv);
      this.a(cjk.tJ, lk.bv);
      this.a(cjk.tK, lk.bv);
      this.a(cjk.tI, lk.bv);
      this.a(cjk.qI, lk.bv);
      this.a(cjk.rp, lk.bv);
      this.a(cjk.mZ, lk.bv);
      this.a(cjk.qm, lk.bv);
      this.a(cjk.pS, lk.bv);
      this.a(cjk.nD, lk.bv);
      this.a(cjk.rg, lk.bv);
      this.a(cjk.uA, lk.bv);
      this.a(cjk.ve, lk.bv);
      this.a(cjk.qc, lk.bv);
      this.a(cjk.pO, lk.bv);
      this.a(cjk.wu, lk.bv);
      this.a(cjk.uv, lk.bv);
      this.a(cjk.rx, lk.bv);
      this.a(cjk.nk, lk.bv);
      this.a(cjk.nl, lk.bv);
      this.a(cjk.qj, lk.bv);
      this.a(cjk.oB, lk.bx);
      this.a(cjk.of, lk.bx);
      this.a(cjk.og, lk.bx);
      this.a(cjk.oe, lk.bx);
      this.a(cjk.od, lk.bx);
      this.a(cjk.oc, lk.bx);
      this.a(cjk.qM, lk.bv);
      this.a(cjk.va, lk.bv);
      this.a(cjk.nd, lk.bv);
      this.a(cjk.uz, lk.bv);
      this.a(cjk.uV, lk.bv);
      this.a(cjk.qn, lk.bv);
      this.a(cjk.pU, lk.bv);
      this.a(cjk.pV, lk.bv);
      this.a(cjk.pW, lk.bv);
      this.a(cjk.pL, lk.bv);
      this.a(cjk.oI, lk.bv);
      this.a(cjk.qu, lk.bv);
      this.a(cjk.oa, lk.bx);
      this.a(cjk.ob, lk.bx);
      this.a(cjk.nZ, lk.bx);
      this.a(cjk.nY, lk.bx);
      this.a(cjk.nX, lk.bx);
      this.a(cjk.tg, lk.bv);
      this.a(cjk.th, lk.bv);
      this.a(cjk.qy, lk.bv);
      this.a(cjk.ww, lk.bv);
      this.a(cjk.wx, lk.bv);
      this.a(cjk.wy, lk.bv);
      this.a(cjk.wz, lk.bv);
      this.a(cjk.wA, lk.bv);
      this.a(cjk.wB, lk.bv);
      this.a(cjk.wC, lk.bv);
      this.a(cjk.wD, lk.bv);
      this.a(cjk.wE, lk.bv);
      this.a(cjk.wF, lk.bv);
      this.a(cjk.wG, lk.bv);
      this.a(cjk.wH, lk.bv);
      this.a(cjk.wI, lk.bv);
      this.a(cjk.wJ, lk.bv);
      this.a(cjk.wK, lk.bv);
      this.a(cjk.wL, lk.bv);
      this.a(cjk.wM, lk.bv);
      this.a(cjk.uD, cjk.oB, lk.bx);
      this.a(cjk.pn, cjk.pm, lk.bv);

      for (cjc $$0 : jd.i) {
         if ($$0 instanceof cgr $$1) {
            this.a($$1);
         }
      }

      this.a(cjk.wN, lk.bv);
      this.a(cjk.wO, lk.bv);
      this.a(cjk.wP, lk.bv);
      this.a(cjk.wQ, lk.bv);
      this.a(cjk.wR, lk.bv);
      this.a(cjk.wS, lk.bv);
      this.a(cjk.wT, lk.bv);
      this.a(cjk.wU, lk.bv);
      this.a(cjk.wV, lk.bv);
      this.a(cjk.wW, lk.bv);
      this.a(cjk.wX, lk.bv);
      this.a(cjk.wY, lk.bv);
      this.a(cjk.wZ, lk.bv);
      this.a(cjk.xa, lk.bv);
      this.a(cjk.xb, lk.bv);
      this.a(cjk.xc, lk.bv);
      this.a(cjk.xd, lk.bv);
      this.a(cjk.xe, lk.bv);
      this.a(cjk.xf, lk.bv);
      this.a(cjk.xg, lk.bv);
   }

   static record a(String a, float b, Map<cgs, String> c) {
      public String a(cgs $$0) {
         return this.c.getOrDefault($$0, this.a);
      }
   }
}
