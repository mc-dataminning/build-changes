import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Supplier;

public class lq {
   public static final afw a = new afw("trim_type");
   private static final List<lq.a> b = List.of(
      new lq.a("quartz", 0.1F, Map.of()),
      new lq.a("iron", 0.2F, Map.of(chv.c, "iron_darker")),
      new lq.a("netherite", 0.3F, Map.of(chv.g, "netherite_darker")),
      new lq.a("redstone", 0.4F, Map.of()),
      new lq.a("copper", 0.5F, Map.of()),
      new lq.a("gold", 0.6F, Map.of(chv.d, "gold_darker")),
      new lq.a("emerald", 0.7F, Map.of()),
      new lq.a("diamond", 0.8F, Map.of(chv.e, "diamond_darker")),
      new lq.a("lapis", 0.9F, Map.of()),
      new lq.a("amethyst", 1.0F, Map.of())
   );
   private final BiConsumer<afw, Supplier<JsonElement>> c;

   public lq(BiConsumer<afw, Supplier<JsonElement>> $$0) {
      this.c = $$0;
   }

   private void a(cke $$0, me $$1) {
      $$1.a(md.a($$0), mg.b($$0), this.c);
   }

   private void a(cke $$0, String $$1, me $$2) {
      $$2.a(md.a($$0, $$1), mg.k(mg.a($$0, $$1)), this.c);
   }

   private void a(cke $$0, cke $$1, me $$2) {
      $$2.a(md.a($$0), mg.b($$1), this.c);
   }

   private void a(cke $$0) {
      for (int $$1 = 0; $$1 < 32; $$1++) {
         if ($$1 != 16) {
            this.a($$0, String.format(Locale.ROOT, "_%02d", $$1), mf.bv);
         }
      }
   }

   private void b(cke $$0) {
      for (int $$1 = 1; $$1 < 64; $$1++) {
         this.a($$0, String.format(Locale.ROOT, "_%02d", $$1), mf.bv);
      }
   }

   private void a(afw $$0, afw $$1, afw $$2) {
      mf.bz.a($$0, mg.c($$1, $$2), this.c);
   }

   private void a(afw $$0, afw $$1, afw $$2, afw $$3) {
      mf.bA.a($$0, mg.a($$1, $$2, $$3), this.c);
   }

   private afw a(afw $$0, String $$1) {
      return $$0.e("_" + $$1 + "_trim");
   }

   private JsonObject a(afw $$0, Map<mh, afw> $$1, chu $$2) {
      JsonObject $$3 = mf.bz.a($$0, $$1);
      JsonArray $$4 = new JsonArray();

      for (lq.a $$5 : b) {
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

   private void a(cht $$0) {
      afw $$1 = md.a($$0);
      afw $$2 = mg.c($$0);
      afw $$3 = mg.a($$0, "_overlay");
      if ($$0.d() == chv.a) {
         mf.bz.a($$1, mg.c($$2, $$3), this.c, ($$1x, $$2x) -> this.a($$1x, $$2x, $$0.d()));
      } else {
         mf.bv.a($$1, mg.k($$2), this.c, ($$1x, $$2x) -> this.a($$1x, $$2x, $$0.d()));
      }

      for (lq.a $$4 : b) {
         String $$5 = $$4.a($$0.d());
         afw $$6 = this.a($$1, $$5);
         String $$7 = $$0.b().b() + "_trim_" + $$5;
         afw $$8 = new afw($$7).d("trims/items/");
         if ($$0.d() == chv.a) {
            this.a($$6, $$2, $$3, $$8);
         } else {
            this.a($$6, $$2, $$8);
         }
      }
   }

   public void a() {
      this.a(ckm.nq, mf.bv);
      this.a(ckm.ns, mf.bv);
      this.a(ckm.nr, mf.bv);
      this.a(ckm.nt, mf.bv);
      this.a(ckm.nO, mf.bv);
      this.a(ckm.nF, mf.bv);
      this.a(ckm.tL, mf.bv);
      this.a(ckm.nH, mf.bv);
      this.a(ckm.tn, mf.bv);
      this.a(ckm.dv, mf.bx);
      this.a(ckm.rl, mf.bv);
      this.a(ckm.uq, mf.bv);
      this.a(ckm.us, mf.bv);
      this.a(ckm.nm, mf.bv);
      this.a(ckm.nn, mf.bv);
      this.a(ckm.qJ, mf.bv);
      this.a(ckm.rz, mf.bv);
      this.a(ckm.rr, mf.bx);
      this.a(ckm.qF, mf.bv);
      this.a(ckm.qK, mf.bv);
      this.a(ckm.qb, mf.bv);
      this.a(ckm.oC, mf.bv);
      this.a(ckm.oJ, mf.bv);
      this.a(ckm.pX, mf.bv);
      this.a(ckm.qG, mf.bv);
      this.a(ckm.pK, mf.bv);
      this.a(ckm.nf, mf.by);
      this.a(ckm.ng, mf.by);
      this.a(ckm.nJ, mf.bv);
      this.a(ckm.nb, mf.bv);
      this.a(ckm.rn, mf.bv);
      this.a(ckm.um, mf.bv);
      this.a(ckm.pY, mf.bv);
      this.b(ckm.qi);
      this.a(ckm.nI, mf.bv);
      this.a(ckm.pT, mf.bv);
      this.a(ckm.tS, mf.bv);
      this.a(ckm.qe);
      this.a(ckm.qf);
      this.a(ckm.rm, mf.bv);
      this.a(ckm.ro, mf.bv);
      this.a(ckm.qp, mf.bv);
      this.a(ckm.tU, mf.bv);
      this.a(ckm.pk, mf.bv);
      this.a(ckm.tH, mf.bv);
      this.a(ckm.qq, mf.bv);
      this.a(ckm.re, mf.bv);
      this.a(ckm.nR, mf.bv);
      this.a(ckm.nS, mf.bv);
      this.a(ckm.vd, mf.bv);
      this.a(ckm.qD, mf.bv);
      this.a(ckm.nu, mf.bv);
      this.a(ckm.nv, mf.bv);
      this.a(ckm.nK, mf.bv);
      this.a(ckm.ou, mf.bx);
      this.a(ckm.ov, mf.bx);
      this.a(ckm.tO, mf.bv);
      this.a(ckm.ot, mf.bx);
      this.a(ckm.os, mf.bx);
      this.a(ckm.or, mf.bx);
      this.a(ckm.ut, mf.bv);
      this.a(ckm.ri, mf.bv);
      this.a(ckm.qd, mf.bv);
      this.a(ckm.nL, mf.bv);
      this.a(ckm.tC, mf.bv);
      this.a(ckm.rD, mf.bv);
      this.a(ckm.rq, mf.bv);
      this.a(ckm.ul, mf.bv);
      this.a(ckm.te, mf.bv);
      this.a(ckm.ry, mf.bv);
      this.a(ckm.tA, mf.bv);
      this.a(ckm.tf, mf.bv);
      this.a(ckm.pi, mf.bv);
      this.a(ckm.nE, mf.bv);
      this.a(ckm.vc, mf.bv);
      this.a(ckm.nc, mf.bv);
      this.a(ckm.rs, mf.bv);
      this.a(ckm.rw, mf.bv);
      this.a(ckm.rE, mf.bv);
      this.a(ckm.vg, mf.bv);
      this.a(ckm.vw, mf.bv);
      this.a(ckm.qk, mf.bv);
      this.a(ckm.qs, mf.bv);
      this.a(ckm.tj, mf.bv);
      this.a(ckm.nT, mf.bv);
      this.a(ckm.pm, mf.bv);
      this.a(ckm.ok, mf.bx);
      this.a(ckm.tq, mf.bv);
      this.a(ckm.ol, mf.bx);
      this.a(ckm.tN, mf.bv);
      this.a(ckm.oj, mf.bx);
      this.a(ckm.oi, mf.bx);
      this.a(ckm.oh, mf.bx);
      this.a(ckm.nU, mf.bv);
      this.a(ckm.rt, mf.bv);
      this.a(ckm.qB, mf.bv);
      this.a(ckm.qH, mf.bv);
      this.a(ckm.oG, mf.bv);
      this.a(ckm.uY, mf.bv);
      this.a(ckm.vA, mf.bv);
      this.a(ckm.vD, mf.bv);
      this.a(ckm.ne, mf.bv);
      this.a(ckm.qr, mf.bv);
      this.a(ckm.nP, mf.bv);
      this.a(ckm.op, mf.bx);
      this.a(ckm.oq, mf.bx);
      this.a(ckm.tM, mf.bv);
      this.a(ckm.nQ, mf.bv);
      this.a(ckm.uB, mf.bv);
      this.a(ckm.oo, mf.bx);
      this.a(ckm.on, mf.bx);
      this.a(ckm.om, mf.bx);
      this.a(ckm.ti, mf.bv);
      this.a(ckm.no, mf.bv);
      this.a(ckm.np, mf.bv);
      this.a(ckm.uC, mf.bv);
      this.a(ckm.nM, mf.bv);
      this.a(ckm.pM, mf.bv);
      this.a(ckm.pP, mf.bv);
      this.a(ckm.tP, mf.bv);
      this.a(ckm.qx, mf.bv);
      this.a(ckm.qC, mf.bv);
      this.a(ckm.qz, mf.bv);
      this.a(ckm.qw, mf.bv);
      this.a(ckm.rA, mf.bv);
      this.a(ckm.nw, mf.bv);
      this.a(ckm.nx, mf.bv);
      this.a(ckm.ny, mf.bv);
      this.a(ckm.nz, mf.bv);
      this.a(ckm.tp, mf.bv);
      this.a(ckm.rh, mf.bv);
      this.a(ckm.pQ, mf.bv);
      this.a(ckm.na, mf.bv);
      this.a(ckm.vf, mf.bv);
      this.a(ckm.oD, mf.bv);
      this.a(ckm.uU, mf.bv);
      this.a(ckm.uO, mf.bw);
      this.a(ckm.uE, mf.bw);
      this.a(ckm.uG, mf.bw);
      this.a(ckm.uF, mf.bw);
      this.a(ckm.uH, mf.bw);
      this.a(ckm.uI, mf.bw);
      this.a(ckm.uJ, mf.bw);
      this.a(ckm.uK, mf.bw);
      this.a(ckm.uT, mf.bw);
      this.a(ckm.uL, mf.bw);
      this.a(ckm.uM, mf.bw);
      this.a(ckm.uP, mf.bw);
      this.a(ckm.uN, mf.bw);
      this.a(ckm.uQ, mf.bw);
      this.a(ckm.uR, mf.bw);
      this.a(ckm.uS, mf.bw);
      this.a(ckm.tT, mf.bv);
      this.a(ckm.tR, mf.bv);
      this.a(ckm.uX, mf.bv);
      this.a(ckm.oz, mf.bx);
      this.a(ckm.oA, mf.bx);
      this.a(ckm.nV, mf.bv);
      this.a(ckm.oy, mf.bx);
      this.a(ckm.nW, mf.bv);
      this.a(ckm.ox, mf.bx);
      this.a(ckm.ow, mf.bx);
      this.a(ckm.tD, mf.bv);
      this.a(ckm.ty, mf.bv);
      this.a(ckm.ni, mf.bv);
      this.a(ckm.nj, mf.bv);
      this.a(ckm.qv, mf.bv);
      this.a(ckm.pl, mf.bv);
      this.a(ckm.qa, mf.bv);
      this.a(ckm.uW, mf.bv);
      this.a(ckm.vh, mf.bv);
      this.a(ckm.qA, mf.bv);
      this.a(ckm.to, mf.bv);
      this.a(ckm.un, mf.bv);
      this.a(ckm.pj, mf.bv);
      this.a(ckm.pN, mf.bv);
      this.a(ckm.tF, mf.bv);
      this.a(ckm.tE, mf.bv);
      this.a(ckm.qo, mf.bv);
      this.a(ckm.pR, mf.bv);
      this.a(ckm.tz, mf.bv);
      this.a(ckm.qE, mf.bv);
      this.a(ckm.nN, mf.bv);
      this.a(ckm.tG, mf.bv);
      this.a(ckm.tJ, mf.bv);
      this.a(ckm.tK, mf.bv);
      this.a(ckm.tI, mf.bv);
      this.a(ckm.qI, mf.bv);
      this.a(ckm.rp, mf.bv);
      this.a(ckm.mZ, mf.bv);
      this.a(ckm.qm, mf.bv);
      this.a(ckm.pS, mf.bv);
      this.a(ckm.nD, mf.bv);
      this.a(ckm.rg, mf.bv);
      this.a(ckm.uA, mf.bv);
      this.a(ckm.ve, mf.bv);
      this.a(ckm.qc, mf.bv);
      this.a(ckm.pO, mf.bv);
      this.a(ckm.wu, mf.bv);
      this.a(ckm.uv, mf.bv);
      this.a(ckm.rx, mf.bv);
      this.a(ckm.nk, mf.bv);
      this.a(ckm.nl, mf.bv);
      this.a(ckm.qj, mf.bv);
      this.a(ckm.oB, mf.bx);
      this.a(ckm.of, mf.bx);
      this.a(ckm.og, mf.bx);
      this.a(ckm.oe, mf.bx);
      this.a(ckm.od, mf.bx);
      this.a(ckm.oc, mf.bx);
      this.a(ckm.qM, mf.bv);
      this.a(ckm.va, mf.bv);
      this.a(ckm.nd, mf.bv);
      this.a(ckm.uz, mf.bv);
      this.a(ckm.uV, mf.bv);
      this.a(ckm.qn, mf.bv);
      this.a(ckm.pU, mf.bv);
      this.a(ckm.pV, mf.bv);
      this.a(ckm.pW, mf.bv);
      this.a(ckm.pL, mf.bv);
      this.a(ckm.oI, mf.bv);
      this.a(ckm.qu, mf.bv);
      this.a(ckm.oa, mf.bx);
      this.a(ckm.ob, mf.bx);
      this.a(ckm.nZ, mf.bx);
      this.a(ckm.nY, mf.bx);
      this.a(ckm.nX, mf.bx);
      this.a(ckm.tg, mf.bv);
      this.a(ckm.th, mf.bv);
      this.a(ckm.qy, mf.bv);
      this.a(ckm.ww, mf.bv);
      this.a(ckm.wx, mf.bv);
      this.a(ckm.wy, mf.bv);
      this.a(ckm.wz, mf.bv);
      this.a(ckm.wA, mf.bv);
      this.a(ckm.wB, mf.bv);
      this.a(ckm.wC, mf.bv);
      this.a(ckm.wD, mf.bv);
      this.a(ckm.wE, mf.bv);
      this.a(ckm.wF, mf.bv);
      this.a(ckm.wG, mf.bv);
      this.a(ckm.wH, mf.bv);
      this.a(ckm.wI, mf.bv);
      this.a(ckm.wJ, mf.bv);
      this.a(ckm.wK, mf.bv);
      this.a(ckm.wL, mf.bv);
      this.a(ckm.wM, mf.bv);
      this.a(ckm.uD, ckm.oB, mf.bx);
      this.a(ckm.pn, ckm.pm, mf.bv);

      for (cke $$0 : jy.i) {
         if ($$0 instanceof cht $$1) {
            this.a($$1);
         }
      }

      this.a(ckm.wN, mf.bv);
      this.a(ckm.wO, mf.bv);
      this.a(ckm.wP, mf.bv);
      this.a(ckm.wQ, mf.bv);
      this.a(ckm.wR, mf.bv);
      this.a(ckm.wS, mf.bv);
      this.a(ckm.wT, mf.bv);
      this.a(ckm.wU, mf.bv);
      this.a(ckm.wV, mf.bv);
      this.a(ckm.wW, mf.bv);
      this.a(ckm.wX, mf.bv);
      this.a(ckm.wY, mf.bv);
      this.a(ckm.wZ, mf.bv);
      this.a(ckm.xa, mf.bv);
      this.a(ckm.xb, mf.bv);
      this.a(ckm.xc, mf.bv);
      this.a(ckm.xd, mf.bv);
      this.a(ckm.xe, mf.bv);
      this.a(ckm.xf, mf.bv);
      this.a(ckm.xg, mf.bv);
   }

   static record a(String a, float b, Map<chu, String> c) {
      public String a(chu $$0) {
         return this.c.getOrDefault($$0, this.a);
      }
   }
}
