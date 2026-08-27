import com.google.common.collect.UnmodifiableIterator;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Supplier;

public class nj {
   public static final akt a = new akt("trim_type");
   private static final List<nj.a> b = List.of(
      new nj.a("quartz", 0.01F, Map.of()),
      new nj.a("iron", 0.02F, Map.of(crv.c, "iron_darker")),
      new nj.a("netherite", 0.03F, Map.of(crv.g, "netherite_darker")),
      new nj.a("redstone", 0.04F, Map.of()),
      new nj.a("copper", 0.05F, Map.of()),
      new nj.a("gold", 0.06F, Map.of(crv.d, "gold_darker")),
      new nj.a("emerald", 0.07F, Map.of()),
      new nj.a("diamond", 0.08F, Map.of(crv.e, "diamond_darker")),
      new nj.a("lapis", 0.09F, Map.of()),
      new nj.a("amethyst", 0.1F, Map.of()),
      new nj.a("amber", 1.0F, Map.of())
   );
   private final BiConsumer<akt, Supplier<JsonElement>> c;

   public nj(BiConsumer<akt, Supplier<JsonElement>> $$0) {
      this.c = $$0;
   }

   private void a(cuc $$0, nx $$1) {
      $$1.a(nw.a($$0), nz.b($$0), this.c);
   }

   private void a(cuc $$0, String $$1, nx $$2) {
      $$2.a(nw.a($$0, $$1), nz.k(nz.a($$0, $$1)), this.c);
   }

   private void a(cuc $$0, cuc $$1, nx $$2) {
      $$2.a(nw.a($$0), nz.b($$1), this.c);
   }

   private void a(cuc $$0) {
      this.a(nw.a($$0), nz.c($$0), nz.a($$0, "_overlay"));
   }

   private void b(cuc $$0) {
      for (int $$1 = 0; $$1 < 32; $$1++) {
         if ($$1 != 16) {
            this.a($$0, String.format(Locale.ROOT, "_%02d", $$1), ny.bB);
         }
      }
   }

   private void c(cuc $$0) {
      for (int $$1 = 1; $$1 < 64; $$1++) {
         this.a($$0, String.format(Locale.ROOT, "_%02d", $$1), ny.bB);
      }
   }

   private void a(akt $$0, akt $$1, akt $$2) {
      ny.bF.a($$0, nz.c($$1, $$2), this.c);
   }

   private void a(akt $$0, akt $$1, akt $$2, akt $$3) {
      ny.bG.a($$0, nz.a($$1, $$2, $$3), this.c);
   }

   private akt a(akt $$0, String $$1) {
      return $$0.e("_" + $$1 + "_trim");
   }

   private JsonObject a(akt $$0, Map<oa, akt> $$1, ja<cru> $$2) {
      JsonObject $$3 = ny.bF.a($$0, $$1);
      JsonArray $$4 = new JsonArray();

      for (nj.a $$5 : b) {
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

   private void a(crt $$0) {
      if ($$0.f().d()) {
         akt $$1 = nw.a($$0);
         akt $$2 = nz.c($$0);
         akt $$3 = nz.a($$0, "_overlay");
         if ($$0.h().a(crv.a)) {
            ny.bF.a($$1, nz.c($$2, $$3), this.c, ($$1x, $$2x) -> this.a($$1x, $$2x, $$0.h()));
         } else {
            ny.bB.a($$1, nz.k($$2), this.c, ($$1x, $$2x) -> this.a($$1x, $$2x, $$0.h()));
         }

         for (nj.a $$4 : b) {
            String $$5 = $$4.a($$0.h());
            akt $$6 = this.a($$1, $$5);
            String $$7 = $$0.f().b() + "_trim_" + $$5;
            akt $$8 = new akt($$7).d("trims/items/");
            if ($$0.h().a(crv.a)) {
               this.a($$6, $$2, $$3, $$8);
            } else {
               this.a($$6, $$2, $$8);
            }
         }
      }
   }

   public void a() {
      this.a(cuk.ps, ny.bB);
      this.a(cuk.pu, ny.bB);
      this.a(cuk.pt, ny.bB);
      this.a(cuk.pv, ny.bB);
      this.a(cuk.pV, ny.bB);
      this.a(cuk.pJ, ny.bB);
      this.a(cuk.pG, ny.bB);
      this.a(cuk.wq, ny.bB);
      this.a(cuk.pL, ny.bB);
      this.a(cuk.vJ, ny.bB);
      this.a(cuk.vK, ny.bB);
      this.a(cuk.eZ, ny.bD);
      this.a(cuk.tx, ny.bB);
      this.a(cuk.wV, ny.bB);
      this.a(cuk.wX, ny.bB);
      this.a(cuk.po, ny.bB);
      this.a(cuk.pp, ny.bB);
      this.a(cuk.sU, ny.bB);
      this.a(cuk.tL, ny.bB);
      this.a(cuk.tD, ny.bD);
      this.a(cuk.sQ, ny.bB);
      this.a(cuk.sV, ny.bB);
      this.a(cuk.sm, ny.bB);
      this.a(cuk.qJ, ny.bB);
      this.a(cuk.qQ, ny.bB);
      this.a(cuk.si, ny.bB);
      this.a(cuk.Ao, ny.bB);
      this.a(cuk.sR, ny.bB);
      this.a(cuk.rV, ny.bB);
      this.a(cuk.ph, ny.bE);
      this.a(cuk.pi, ny.bE);
      this.a(cuk.pN, ny.bB);
      this.a(cuk.pd, ny.bB);
      this.a(cuk.tz, ny.bB);
      this.a(cuk.wR, ny.bB);
      this.a(cuk.sj, ny.bB);
      this.a(cuk.cI, ny.bB);
      this.c(cuk.st);
      this.a(cuk.pM, ny.bB);
      this.a(cuk.se, ny.bB);
      this.a(cuk.wx, ny.bB);
      this.b(cuk.sp);
      this.b(cuk.sq);
      this.a(cuk.Ar, "_extended", ny.bD);
      this.a(cuk.Aq, ny.bB);
      this.a(cuk.ty, ny.bB);
      this.a(cuk.tA, ny.bB);
      this.a(cuk.sA, ny.bB);
      this.a(cuk.wz, ny.bB);
      this.a(cuk.rt, ny.bB);
      this.a(cuk.wm, ny.bB);
      this.a(cuk.sB, ny.bB);
      this.a(cuk.tp, ny.bB);
      this.a(cuk.pY, ny.bB);
      this.a(cuk.pZ, ny.bB);
      this.a(cuk.xI, ny.bB);
      this.a(cuk.sO, ny.bB);
      this.a(cuk.pw, ny.bB);
      this.a(cuk.px, ny.bB);
      this.a(cuk.pO, ny.bB);
      this.a(cuk.qB, ny.bD);
      this.a(cuk.qC, ny.bD);
      this.a(cuk.wt, ny.bB);
      this.a(cuk.qA, ny.bD);
      this.a(cuk.qz, ny.bD);
      this.a(cuk.qy, ny.bD);
      this.a(cuk.wY, ny.bB);
      this.a(cuk.tu, ny.bB);
      this.a(cuk.so, ny.bB);
      this.a(cuk.pP, ny.bB);
      this.a(cuk.wh, ny.bB);
      this.a(cuk.tP, ny.bB);
      this.a(cuk.tC, ny.bB);
      this.a(cuk.wQ, ny.bB);
      this.a(cuk.vy, ny.bB);
      this.a(cuk.tK, ny.bB);
      this.a(cuk.wf, ny.bB);
      this.a(cuk.vz, ny.bB);
      this.a(cuk.rr, ny.bB);
      this.a(cuk.pI, ny.bB);
      this.a(cuk.xN, ny.bB);
      this.a(cuk.xH, ny.bB);
      this.a(cuk.pe, ny.bB);
      this.a(cuk.tE, ny.bB);
      this.a(cuk.tI, ny.bB);
      this.a(cuk.tQ, ny.bB);
      this.a(cuk.xL, ny.bB);
      this.a(cuk.ye, ny.bB);
      this.a(cuk.sv, ny.bB);
      this.a(cuk.sD, ny.bB);
      this.a(cuk.vF, ny.bB);
      this.a(cuk.qa, ny.bB);
      this.a(cuk.rv, ny.bB);
      this.a(cuk.rx, ny.bB);
      this.a(cuk.qr, ny.bD);
      this.a(cuk.vV, ny.bB);
      this.a(cuk.qs, ny.bD);
      this.a(cuk.ws, ny.bB);
      this.a(cuk.qq, ny.bD);
      this.a(cuk.qp, ny.bD);
      this.a(cuk.qo, ny.bD);
      this.a(cuk.qb, ny.bB);
      this.a(cuk.tF, ny.bB);
      this.a(cuk.sM, ny.bB);
      this.a(cuk.sS, ny.bB);
      this.a(cuk.qN, ny.bB);
      this.a(cuk.xO, ny.bB);
      this.a(cuk.xD, ny.bB);
      this.a(cuk.yj, ny.bB);
      this.a(cuk.ym, ny.bB);
      this.a(cuk.pg, ny.bB);
      this.a(cuk.sC, ny.bB);
      this.a(cuk.pW, ny.bB);
      this.a(cuk.qw, ny.bD);
      this.a(cuk.qx, ny.bD);
      this.a(cuk.wr, ny.bB);
      this.a(cuk.pX, ny.bB);
      this.a(cuk.xg, ny.bB);
      this.a(cuk.qv, ny.bD);
      this.a(cuk.qu, ny.bD);
      this.a(cuk.qt, ny.bD);
      this.a(cuk.vE, ny.bB);
      this.a(cuk.pq, ny.bB);
      this.a(cuk.pr, ny.bB);
      this.a(cuk.xh, ny.bB);
      this.a(cuk.pQ, ny.bB);
      this.a(cuk.pR, ny.bB);
      this.a(cuk.pS, ny.bB);
      this.a(cuk.pT, ny.bB);
      this.a(cuk.rX, ny.bB);
      this.a(cuk.sa, ny.bB);
      this.a(cuk.wu, ny.bB);
      this.a(cuk.sI, ny.bB);
      this.a(cuk.sN, ny.bB);
      this.a(cuk.sK, ny.bB);
      this.a(cuk.sH, ny.bB);
      this.a(cuk.tM, ny.bB);
      this.a(cuk.py, ny.bB);
      this.a(cuk.pz, ny.bB);
      this.a(cuk.pA, ny.bB);
      this.a(cuk.pB, ny.bB);
      this.a(cuk.vU, ny.bB);
      this.a(cuk.tt, ny.bB);
      this.a(cuk.sb, ny.bB);
      this.a(cuk.pc, ny.bB);
      this.a(cuk.xK, ny.bB);
      this.a(cuk.qK, ny.bB);
      this.a(cuk.xz, ny.bB);
      this.a(cuk.xt, ny.bC);
      this.a(cuk.xj, ny.bC);
      this.a(cuk.xl, ny.bC);
      this.a(cuk.xk, ny.bC);
      this.a(cuk.xm, ny.bC);
      this.a(cuk.xn, ny.bC);
      this.a(cuk.xo, ny.bC);
      this.a(cuk.xp, ny.bC);
      this.a(cuk.xy, ny.bC);
      this.a(cuk.xq, ny.bC);
      this.a(cuk.xr, ny.bC);
      this.a(cuk.xu, ny.bC);
      this.a(cuk.xs, ny.bC);
      this.a(cuk.xv, ny.bC);
      this.a(cuk.xw, ny.bC);
      this.a(cuk.xx, ny.bC);
      this.a(cuk.wy, ny.bB);
      this.a(cuk.ww, ny.bB);
      this.a(cuk.xC, ny.bB);
      this.a(cuk.qG, ny.bD);
      this.a(cuk.qH, ny.bD);
      this.a(cuk.qc, ny.bB);
      this.a(cuk.qF, ny.bD);
      this.a(cuk.qd, ny.bB);
      this.a(cuk.qE, ny.bD);
      this.a(cuk.qD, ny.bD);
      this.a(cuk.wi, ny.bB);
      this.a(cuk.wd, ny.bB);
      this.a(cuk.pk, ny.bB);
      this.a(cuk.pl, ny.bB);
      this.a(cuk.sG, ny.bB);
      this.a(cuk.ru, ny.bB);
      this.a(cuk.sl, ny.bB);
      this.a(cuk.xB, ny.bB);
      this.a(cuk.xM, ny.bB);
      this.a(cuk.sL, ny.bB);
      this.a(cuk.vT, ny.bB);
      this.a(cuk.wS, ny.bB);
      this.a(cuk.rs, ny.bB);
      this.a(cuk.rY, ny.bB);
      this.a(cuk.wk, ny.bB);
      this.a(cuk.wj, ny.bB);
      this.a(cuk.sz, ny.bB);
      this.a(cuk.sc, ny.bB);
      this.a(cuk.we, ny.bB);
      this.a(cuk.sP, ny.bB);
      this.a(cuk.pU, ny.bB);
      this.a(cuk.wl, ny.bB);
      this.a(cuk.wo, ny.bB);
      this.a(cuk.wp, ny.bB);
      this.a(cuk.wn, ny.bB);
      this.a(cuk.sT, ny.bB);
      this.a(cuk.tB, ny.bB);
      this.a(cuk.pb, ny.bB);
      this.a(cuk.sx, ny.bB);
      this.a(cuk.sd, ny.bB);
      this.a(cuk.pF, ny.bB);
      this.a(cuk.ts, ny.bB);
      this.a(cuk.xf, ny.bB);
      this.a(cuk.xJ, ny.bB);
      this.a(cuk.sn, ny.bB);
      this.a(cuk.rZ, ny.bB);
      this.a(cuk.zd, ny.bB);
      this.a(cuk.xa, ny.bB);
      this.a(cuk.tJ, ny.bB);
      this.a(cuk.pm, ny.bB);
      this.a(cuk.pn, ny.bB);
      this.a(cuk.su, ny.bB);
      this.a(cuk.qI, ny.bD);
      this.a(cuk.qm, ny.bD);
      this.a(cuk.qn, ny.bD);
      this.a(cuk.ql, ny.bD);
      this.a(cuk.qk, ny.bD);
      this.a(cuk.qj, ny.bD);
      this.a(cuk.sX, ny.bB);
      this.a(cuk.xF, ny.bB);
      this.a(cuk.pf, ny.bB);
      this.a(cuk.xe, ny.bB);
      this.a(cuk.xA, ny.bB);
      this.a(cuk.sy, ny.bB);
      this.a(cuk.sf, ny.bB);
      this.a(cuk.sg, ny.bB);
      this.a(cuk.sh, ny.bB);
      this.a(cuk.rW, ny.bB);
      this.a(cuk.qP, ny.bB);
      this.a(cuk.sF, ny.bB);
      this.a(cuk.vA, ny.bB);
      this.a(cuk.vD, ny.bT);
      this.a(cuk.pH);
      this.a(cuk.qh, ny.bD);
      this.a(cuk.qi, ny.bD);
      this.a(cuk.qg, ny.bD);
      this.a(cuk.qf, ny.bD);
      this.a(cuk.qe, ny.bD);
      this.a(cuk.vB, ny.bB);
      this.a(cuk.vC, ny.bB);
      this.a(cuk.sJ, ny.bB);
      this.a(cuk.zf, ny.bB);
      this.a(cuk.zg, ny.bB);
      this.a(cuk.zh, ny.bB);
      this.a(cuk.zi, ny.bB);
      this.a(cuk.zj, ny.bB);
      this.a(cuk.zk, ny.bB);
      this.a(cuk.zl, ny.bB);
      this.a(cuk.zm, ny.bB);
      this.a(cuk.zn, ny.bB);
      this.a(cuk.zo, ny.bB);
      this.a(cuk.zp, ny.bB);
      this.a(cuk.zq, ny.bB);
      this.a(cuk.zr, ny.bB);
      this.a(cuk.zs, ny.bB);
      this.a(cuk.zt, ny.bB);
      this.a(cuk.zu, ny.bB);
      this.a(cuk.zv, ny.bB);
      this.a(cuk.zw, ny.bB);
      this.a(cuk.zx, ny.bB);
      this.a(cuk.xi, cuk.qI, ny.bD);
      this.a(cuk.rw, cuk.rv, ny.bB);
      this.a(cuk.ry, cuk.rx, ny.bB);

      for (cuc $$0 : lh.h) {
         if ($$0 instanceof crt) {
            crt $$1 = (crt)$$0;
            if ($$0 != cuk.AH) {
               this.a($$1);
            }
         }
      }

      this.a(cuk.zy, ny.bB);
      this.a(cuk.zz, ny.bB);
      this.a(cuk.zA, ny.bB);
      this.a(cuk.zB, ny.bB);
      this.a(cuk.zC, ny.bB);
      this.a(cuk.zD, ny.bB);
      this.a(cuk.zE, ny.bB);
      this.a(cuk.zF, ny.bB);
      this.a(cuk.zG, ny.bB);
      this.a(cuk.zH, ny.bB);
      this.a(cuk.zI, ny.bB);
      this.a(cuk.zJ, ny.bB);
      this.a(cuk.zK, ny.bB);
      this.a(cuk.zL, ny.bB);
      this.a(cuk.zM, ny.bB);
      this.a(cuk.zN, ny.bB);
      this.a(cuk.zO, ny.bB);
      this.a(cuk.zP, ny.bB);
      this.a(cuk.zQ, ny.bB);
      this.a(cuk.zR, ny.bB);
      this.a(cuk.zS, ny.bB);
      this.a(cuk.zT, ny.bB);
      this.a(cuk.zU, ny.bB);
      this.a(cuk.Am, ny.bB);
      this.a(cuk.As, ny.bB);
      this.a(cuk.Ax, ny.bB);
      this.a(cuk.vM, ny.bB);
      this.a(cuk.vN, ny.bB);
      this.a(cuk.vL, ny.bB);
      this.a(cuk.vO, ny.bB);
      this.a(cuk.Az, ny.bB);
      this.a(cuk.AA, ny.bD);
      UnmodifiableIterator var4 = cuk.AD.values().iterator();

      while (var4.hasNext()) {
         cuc $$2 = (cuc)var4.next();
         this.a($$2, ny.bB);
      }

      this.a(cuk.AF, ny.bB);
      this.a(cuk.AG, ny.bB);
      this.a(cuk.AB, ny.bB);
   }

   static record a(String a, float b, Map<ja<cru>, String> c) {
      public String a(ja<cru> $$0) {
         return this.c.getOrDefault($$0, this.a);
      }
   }
}
