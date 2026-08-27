import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Supplier;

public class ls {
   public static final agg a = new agg("trim_type");
   private static final List<ls.a> b = List.of(
      new ls.a("quartz", 0.1F, Map.of()),
      new ls.a("iron", 0.2F, Map.of(cin.c, "iron_darker")),
      new ls.a("netherite", 0.3F, Map.of(cin.g, "netherite_darker")),
      new ls.a("redstone", 0.4F, Map.of()),
      new ls.a("copper", 0.5F, Map.of()),
      new ls.a("gold", 0.6F, Map.of(cin.d, "gold_darker")),
      new ls.a("emerald", 0.7F, Map.of()),
      new ls.a("diamond", 0.8F, Map.of(cin.e, "diamond_darker")),
      new ls.a("lapis", 0.9F, Map.of()),
      new ls.a("amethyst", 1.0F, Map.of())
   );
   private final BiConsumer<agg, Supplier<JsonElement>> c;

   public ls(BiConsumer<agg, Supplier<JsonElement>> $$0) {
      this.c = $$0;
   }

   private void a(ckw $$0, mg $$1) {
      $$1.a(mf.a($$0), mi.b($$0), this.c);
   }

   private void a(ckw $$0, String $$1, mg $$2) {
      $$2.a(mf.a($$0, $$1), mi.k(mi.a($$0, $$1)), this.c);
   }

   private void a(ckw $$0, ckw $$1, mg $$2) {
      $$2.a(mf.a($$0), mi.b($$1), this.c);
   }

   private void a(ckw $$0) {
      for (int $$1 = 0; $$1 < 32; $$1++) {
         if ($$1 != 16) {
            this.a($$0, String.format(Locale.ROOT, "_%02d", $$1), mh.bv);
         }
      }
   }

   private void b(ckw $$0) {
      for (int $$1 = 1; $$1 < 64; $$1++) {
         this.a($$0, String.format(Locale.ROOT, "_%02d", $$1), mh.bv);
      }
   }

   private void a(agg $$0, agg $$1, agg $$2) {
      mh.bz.a($$0, mi.c($$1, $$2), this.c);
   }

   private void a(agg $$0, agg $$1, agg $$2, agg $$3) {
      mh.bA.a($$0, mi.a($$1, $$2, $$3), this.c);
   }

   private agg a(agg $$0, String $$1) {
      return $$0.e("_" + $$1 + "_trim");
   }

   private JsonObject a(agg $$0, Map<mj, agg> $$1, cim $$2) {
      JsonObject $$3 = mh.bz.a($$0, $$1);
      JsonArray $$4 = new JsonArray();

      for (ls.a $$5 : b) {
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

   private void a(cil $$0) {
      agg $$1 = mf.a($$0);
      agg $$2 = mi.c($$0);
      agg $$3 = mi.a($$0, "_overlay");
      if ($$0.d() == cin.a) {
         mh.bz.a($$1, mi.c($$2, $$3), this.c, ($$1x, $$2x) -> this.a($$1x, $$2x, $$0.d()));
      } else {
         mh.bv.a($$1, mi.k($$2), this.c, ($$1x, $$2x) -> this.a($$1x, $$2x, $$0.d()));
      }

      for (ls.a $$4 : b) {
         String $$5 = $$4.a($$0.d());
         agg $$6 = this.a($$1, $$5);
         String $$7 = $$0.b().b() + "_trim_" + $$5;
         agg $$8 = new agg($$7).d("trims/items/");
         if ($$0.d() == cin.a) {
            this.a($$6, $$2, $$3, $$8);
         } else {
            this.a($$6, $$2, $$8);
         }
      }
   }

   public void a() {
      this.a(cle.nq, mh.bv);
      this.a(cle.ns, mh.bv);
      this.a(cle.nr, mh.bv);
      this.a(cle.nt, mh.bv);
      this.a(cle.nO, mh.bv);
      this.a(cle.nF, mh.bv);
      this.a(cle.tM, mh.bv);
      this.a(cle.nH, mh.bv);
      this.a(cle.to, mh.bv);
      this.a(cle.dv, mh.bx);
      this.a(cle.rm, mh.bv);
      this.a(cle.ur, mh.bv);
      this.a(cle.ut, mh.bv);
      this.a(cle.nm, mh.bv);
      this.a(cle.nn, mh.bv);
      this.a(cle.qJ, mh.bv);
      this.a(cle.rA, mh.bv);
      this.a(cle.rs, mh.bx);
      this.a(cle.qF, mh.bv);
      this.a(cle.qK, mh.bv);
      this.a(cle.qb, mh.bv);
      this.a(cle.oC, mh.bv);
      this.a(cle.oJ, mh.bv);
      this.a(cle.pX, mh.bv);
      this.a(cle.qG, mh.bv);
      this.a(cle.pK, mh.bv);
      this.a(cle.nf, mh.by);
      this.a(cle.ng, mh.by);
      this.a(cle.nJ, mh.bv);
      this.a(cle.nb, mh.bv);
      this.a(cle.ro, mh.bv);
      this.a(cle.un, mh.bv);
      this.a(cle.pY, mh.bv);
      this.b(cle.qi);
      this.a(cle.nI, mh.bv);
      this.a(cle.pT, mh.bv);
      this.a(cle.tT, mh.bv);
      this.a(cle.qe);
      this.a(cle.qf);
      this.a(cle.rn, mh.bv);
      this.a(cle.rp, mh.bv);
      this.a(cle.qp, mh.bv);
      this.a(cle.tV, mh.bv);
      this.a(cle.pk, mh.bv);
      this.a(cle.tI, mh.bv);
      this.a(cle.qq, mh.bv);
      this.a(cle.re, mh.bv);
      this.a(cle.nR, mh.bv);
      this.a(cle.nS, mh.bv);
      this.a(cle.ve, mh.bv);
      this.a(cle.qD, mh.bv);
      this.a(cle.nu, mh.bv);
      this.a(cle.nv, mh.bv);
      this.a(cle.nK, mh.bv);
      this.a(cle.ou, mh.bx);
      this.a(cle.ov, mh.bx);
      this.a(cle.tP, mh.bv);
      this.a(cle.ot, mh.bx);
      this.a(cle.os, mh.bx);
      this.a(cle.or, mh.bx);
      this.a(cle.uu, mh.bv);
      this.a(cle.rj, mh.bv);
      this.a(cle.qd, mh.bv);
      this.a(cle.nL, mh.bv);
      this.a(cle.tD, mh.bv);
      this.a(cle.rE, mh.bv);
      this.a(cle.rr, mh.bv);
      this.a(cle.um, mh.bv);
      this.a(cle.tf, mh.bv);
      this.a(cle.rz, mh.bv);
      this.a(cle.tB, mh.bv);
      this.a(cle.tg, mh.bv);
      this.a(cle.pi, mh.bv);
      this.a(cle.nE, mh.bv);
      this.a(cle.vd, mh.bv);
      this.a(cle.nc, mh.bv);
      this.a(cle.rt, mh.bv);
      this.a(cle.rx, mh.bv);
      this.a(cle.rF, mh.bv);
      this.a(cle.vh, mh.bv);
      this.a(cle.vx, mh.bv);
      this.a(cle.qk, mh.bv);
      this.a(cle.qs, mh.bv);
      this.a(cle.tk, mh.bv);
      this.a(cle.nT, mh.bv);
      this.a(cle.pm, mh.bv);
      this.a(cle.ok, mh.bx);
      this.a(cle.tr, mh.bv);
      this.a(cle.ol, mh.bx);
      this.a(cle.tO, mh.bv);
      this.a(cle.oj, mh.bx);
      this.a(cle.oi, mh.bx);
      this.a(cle.oh, mh.bx);
      this.a(cle.nU, mh.bv);
      this.a(cle.ru, mh.bv);
      this.a(cle.qB, mh.bv);
      this.a(cle.qH, mh.bv);
      this.a(cle.oG, mh.bv);
      this.a(cle.uZ, mh.bv);
      this.a(cle.vB, mh.bv);
      this.a(cle.vE, mh.bv);
      this.a(cle.ne, mh.bv);
      this.a(cle.qr, mh.bv);
      this.a(cle.nP, mh.bv);
      this.a(cle.op, mh.bx);
      this.a(cle.oq, mh.bx);
      this.a(cle.tN, mh.bv);
      this.a(cle.nQ, mh.bv);
      this.a(cle.uC, mh.bv);
      this.a(cle.oo, mh.bx);
      this.a(cle.on, mh.bx);
      this.a(cle.om, mh.bx);
      this.a(cle.tj, mh.bv);
      this.a(cle.no, mh.bv);
      this.a(cle.np, mh.bv);
      this.a(cle.uD, mh.bv);
      this.a(cle.nM, mh.bv);
      this.a(cle.pM, mh.bv);
      this.a(cle.pP, mh.bv);
      this.a(cle.tQ, mh.bv);
      this.a(cle.qx, mh.bv);
      this.a(cle.qC, mh.bv);
      this.a(cle.qz, mh.bv);
      this.a(cle.qw, mh.bv);
      this.a(cle.rB, mh.bv);
      this.a(cle.nw, mh.bv);
      this.a(cle.nx, mh.bv);
      this.a(cle.ny, mh.bv);
      this.a(cle.nz, mh.bv);
      this.a(cle.tq, mh.bv);
      this.a(cle.ri, mh.bv);
      this.a(cle.pQ, mh.bv);
      this.a(cle.na, mh.bv);
      this.a(cle.vg, mh.bv);
      this.a(cle.oD, mh.bv);
      this.a(cle.uV, mh.bv);
      this.a(cle.uP, mh.bw);
      this.a(cle.uF, mh.bw);
      this.a(cle.uH, mh.bw);
      this.a(cle.uG, mh.bw);
      this.a(cle.uI, mh.bw);
      this.a(cle.uJ, mh.bw);
      this.a(cle.uK, mh.bw);
      this.a(cle.uL, mh.bw);
      this.a(cle.uU, mh.bw);
      this.a(cle.uM, mh.bw);
      this.a(cle.uN, mh.bw);
      this.a(cle.uQ, mh.bw);
      this.a(cle.uO, mh.bw);
      this.a(cle.uR, mh.bw);
      this.a(cle.uS, mh.bw);
      this.a(cle.uT, mh.bw);
      this.a(cle.tU, mh.bv);
      this.a(cle.tS, mh.bv);
      this.a(cle.uY, mh.bv);
      this.a(cle.oz, mh.bx);
      this.a(cle.oA, mh.bx);
      this.a(cle.nV, mh.bv);
      this.a(cle.oy, mh.bx);
      this.a(cle.nW, mh.bv);
      this.a(cle.ox, mh.bx);
      this.a(cle.ow, mh.bx);
      this.a(cle.tE, mh.bv);
      this.a(cle.tz, mh.bv);
      this.a(cle.ni, mh.bv);
      this.a(cle.nj, mh.bv);
      this.a(cle.qv, mh.bv);
      this.a(cle.pl, mh.bv);
      this.a(cle.qa, mh.bv);
      this.a(cle.uX, mh.bv);
      this.a(cle.vi, mh.bv);
      this.a(cle.qA, mh.bv);
      this.a(cle.tp, mh.bv);
      this.a(cle.uo, mh.bv);
      this.a(cle.pj, mh.bv);
      this.a(cle.pN, mh.bv);
      this.a(cle.tG, mh.bv);
      this.a(cle.tF, mh.bv);
      this.a(cle.qo, mh.bv);
      this.a(cle.pR, mh.bv);
      this.a(cle.tA, mh.bv);
      this.a(cle.qE, mh.bv);
      this.a(cle.nN, mh.bv);
      this.a(cle.tH, mh.bv);
      this.a(cle.tK, mh.bv);
      this.a(cle.tL, mh.bv);
      this.a(cle.tJ, mh.bv);
      this.a(cle.qI, mh.bv);
      this.a(cle.rq, mh.bv);
      this.a(cle.mZ, mh.bv);
      this.a(cle.qm, mh.bv);
      this.a(cle.pS, mh.bv);
      this.a(cle.nD, mh.bv);
      this.a(cle.rh, mh.bv);
      this.a(cle.uB, mh.bv);
      this.a(cle.vf, mh.bv);
      this.a(cle.qc, mh.bv);
      this.a(cle.pO, mh.bv);
      this.a(cle.wv, mh.bv);
      this.a(cle.uw, mh.bv);
      this.a(cle.ry, mh.bv);
      this.a(cle.nk, mh.bv);
      this.a(cle.nl, mh.bv);
      this.a(cle.qj, mh.bv);
      this.a(cle.oB, mh.bx);
      this.a(cle.of, mh.bx);
      this.a(cle.og, mh.bx);
      this.a(cle.oe, mh.bx);
      this.a(cle.od, mh.bx);
      this.a(cle.oc, mh.bx);
      this.a(cle.qM, mh.bv);
      this.a(cle.vb, mh.bv);
      this.a(cle.nd, mh.bv);
      this.a(cle.uA, mh.bv);
      this.a(cle.uW, mh.bv);
      this.a(cle.qn, mh.bv);
      this.a(cle.pU, mh.bv);
      this.a(cle.pV, mh.bv);
      this.a(cle.pW, mh.bv);
      this.a(cle.pL, mh.bv);
      this.a(cle.oI, mh.bv);
      this.a(cle.qu, mh.bv);
      this.a(cle.oa, mh.bx);
      this.a(cle.ob, mh.bx);
      this.a(cle.nZ, mh.bx);
      this.a(cle.nY, mh.bx);
      this.a(cle.nX, mh.bx);
      this.a(cle.th, mh.bv);
      this.a(cle.ti, mh.bv);
      this.a(cle.qy, mh.bv);
      this.a(cle.wx, mh.bv);
      this.a(cle.wy, mh.bv);
      this.a(cle.wz, mh.bv);
      this.a(cle.wA, mh.bv);
      this.a(cle.wB, mh.bv);
      this.a(cle.wC, mh.bv);
      this.a(cle.wD, mh.bv);
      this.a(cle.wE, mh.bv);
      this.a(cle.wF, mh.bv);
      this.a(cle.wG, mh.bv);
      this.a(cle.wH, mh.bv);
      this.a(cle.wI, mh.bv);
      this.a(cle.wJ, mh.bv);
      this.a(cle.wK, mh.bv);
      this.a(cle.wL, mh.bv);
      this.a(cle.wM, mh.bv);
      this.a(cle.wN, mh.bv);
      this.a(cle.uE, cle.oB, mh.bx);
      this.a(cle.pn, cle.pm, mh.bv);

      for (ckw $$0 : jy.i) {
         if ($$0 instanceof cil $$1) {
            this.a($$1);
         }
      }

      this.a(cle.wO, mh.bv);
      this.a(cle.wP, mh.bv);
      this.a(cle.wQ, mh.bv);
      this.a(cle.wR, mh.bv);
      this.a(cle.wS, mh.bv);
      this.a(cle.wT, mh.bv);
      this.a(cle.wU, mh.bv);
      this.a(cle.wV, mh.bv);
      this.a(cle.wW, mh.bv);
      this.a(cle.wX, mh.bv);
      this.a(cle.wY, mh.bv);
      this.a(cle.wZ, mh.bv);
      this.a(cle.xa, mh.bv);
      this.a(cle.xb, mh.bv);
      this.a(cle.xc, mh.bv);
      this.a(cle.xd, mh.bv);
      this.a(cle.xe, mh.bv);
      this.a(cle.xf, mh.bv);
      this.a(cle.xg, mh.bv);
      this.a(cle.xh, mh.bv);
   }

   static record a(String a, float b, Map<cim, String> c) {
      public String a(cim $$0) {
         return this.c.getOrDefault($$0, this.a);
      }
   }
}
