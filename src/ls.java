import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Supplier;

public class ls {
   public static final agi a = new agi("trim_type");
   private static final List<ls.a> b = List.of(
      new ls.a("quartz", 0.1F, Map.of()),
      new ls.a("iron", 0.2F, Map.of(civ.c, "iron_darker")),
      new ls.a("netherite", 0.3F, Map.of(civ.g, "netherite_darker")),
      new ls.a("redstone", 0.4F, Map.of()),
      new ls.a("copper", 0.5F, Map.of()),
      new ls.a("gold", 0.6F, Map.of(civ.d, "gold_darker")),
      new ls.a("emerald", 0.7F, Map.of()),
      new ls.a("diamond", 0.8F, Map.of(civ.e, "diamond_darker")),
      new ls.a("lapis", 0.9F, Map.of()),
      new ls.a("amethyst", 1.0F, Map.of())
   );
   private final BiConsumer<agi, Supplier<JsonElement>> c;

   public ls(BiConsumer<agi, Supplier<JsonElement>> $$0) {
      this.c = $$0;
   }

   private void a(cle $$0, mg $$1) {
      $$1.a(mf.a($$0), mi.b($$0), this.c);
   }

   private void a(cle $$0, String $$1, mg $$2) {
      $$2.a(mf.a($$0, $$1), mi.k(mi.a($$0, $$1)), this.c);
   }

   private void a(cle $$0, cle $$1, mg $$2) {
      $$2.a(mf.a($$0), mi.b($$1), this.c);
   }

   private void a(cle $$0) {
      for (int $$1 = 0; $$1 < 32; $$1++) {
         if ($$1 != 16) {
            this.a($$0, String.format(Locale.ROOT, "_%02d", $$1), mh.bv);
         }
      }
   }

   private void b(cle $$0) {
      for (int $$1 = 1; $$1 < 64; $$1++) {
         this.a($$0, String.format(Locale.ROOT, "_%02d", $$1), mh.bv);
      }
   }

   private void a(agi $$0, agi $$1, agi $$2) {
      mh.bz.a($$0, mi.c($$1, $$2), this.c);
   }

   private void a(agi $$0, agi $$1, agi $$2, agi $$3) {
      mh.bA.a($$0, mi.a($$1, $$2, $$3), this.c);
   }

   private agi a(agi $$0, String $$1) {
      return $$0.e("_" + $$1 + "_trim");
   }

   private JsonObject a(agi $$0, Map<mj, agi> $$1, ciu $$2) {
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

   private void a(cit $$0) {
      agi $$1 = mf.a($$0);
      agi $$2 = mi.c($$0);
      agi $$3 = mi.a($$0, "_overlay");
      if ($$0.d() == civ.a) {
         mh.bz.a($$1, mi.c($$2, $$3), this.c, ($$1x, $$2x) -> this.a($$1x, $$2x, $$0.d()));
      } else {
         mh.bv.a($$1, mi.k($$2), this.c, ($$1x, $$2x) -> this.a($$1x, $$2x, $$0.d()));
      }

      for (ls.a $$4 : b) {
         String $$5 = $$4.a($$0.d());
         agi $$6 = this.a($$1, $$5);
         String $$7 = $$0.b().b() + "_trim_" + $$5;
         agi $$8 = new agi($$7).d("trims/items/");
         if ($$0.d() == civ.a) {
            this.a($$6, $$2, $$3, $$8);
         } else {
            this.a($$6, $$2, $$8);
         }
      }
   }

   public void a() {
      this.a(clm.ob, mh.bv);
      this.a(clm.od, mh.bv);
      this.a(clm.oc, mh.bv);
      this.a(clm.oe, mh.bv);
      this.a(clm.oz, mh.bv);
      this.a(clm.oq, mh.bv);
      this.a(clm.ux, mh.bv);
      this.a(clm.os, mh.bv);
      this.a(clm.tZ, mh.bv);
      this.a(clm.dQ, mh.bx);
      this.a(clm.rX, mh.bv);
      this.a(clm.vc, mh.bv);
      this.a(clm.ve, mh.bv);
      this.a(clm.nX, mh.bv);
      this.a(clm.nY, mh.bv);
      this.a(clm.ru, mh.bv);
      this.a(clm.sl, mh.bv);
      this.a(clm.sd, mh.bx);
      this.a(clm.rq, mh.bv);
      this.a(clm.rv, mh.bv);
      this.a(clm.qM, mh.bv);
      this.a(clm.pn, mh.bv);
      this.a(clm.pu, mh.bv);
      this.a(clm.qI, mh.bv);
      this.a(clm.rr, mh.bv);
      this.a(clm.qv, mh.bv);
      this.a(clm.nQ, mh.by);
      this.a(clm.nR, mh.by);
      this.a(clm.ou, mh.bv);
      this.a(clm.nM, mh.bv);
      this.a(clm.rZ, mh.bv);
      this.a(clm.uY, mh.bv);
      this.a(clm.qJ, mh.bv);
      this.b(clm.qT);
      this.a(clm.ot, mh.bv);
      this.a(clm.qE, mh.bv);
      this.a(clm.uE, mh.bv);
      this.a(clm.qP);
      this.a(clm.qQ);
      this.a(clm.rY, mh.bv);
      this.a(clm.sa, mh.bv);
      this.a(clm.ra, mh.bv);
      this.a(clm.uG, mh.bv);
      this.a(clm.pV, mh.bv);
      this.a(clm.ut, mh.bv);
      this.a(clm.rb, mh.bv);
      this.a(clm.rP, mh.bv);
      this.a(clm.oC, mh.bv);
      this.a(clm.oD, mh.bv);
      this.a(clm.vP, mh.bv);
      this.a(clm.ro, mh.bv);
      this.a(clm.of, mh.bv);
      this.a(clm.og, mh.bv);
      this.a(clm.ov, mh.bv);
      this.a(clm.pf, mh.bx);
      this.a(clm.pg, mh.bx);
      this.a(clm.uA, mh.bv);
      this.a(clm.pe, mh.bx);
      this.a(clm.pd, mh.bx);
      this.a(clm.pc, mh.bx);
      this.a(clm.vf, mh.bv);
      this.a(clm.rU, mh.bv);
      this.a(clm.qO, mh.bv);
      this.a(clm.ow, mh.bv);
      this.a(clm.uo, mh.bv);
      this.a(clm.sp, mh.bv);
      this.a(clm.sc, mh.bv);
      this.a(clm.uX, mh.bv);
      this.a(clm.tQ, mh.bv);
      this.a(clm.sk, mh.bv);
      this.a(clm.um, mh.bv);
      this.a(clm.tR, mh.bv);
      this.a(clm.pT, mh.bv);
      this.a(clm.op, mh.bv);
      this.a(clm.vO, mh.bv);
      this.a(clm.nN, mh.bv);
      this.a(clm.se, mh.bv);
      this.a(clm.si, mh.bv);
      this.a(clm.sq, mh.bv);
      this.a(clm.vS, mh.bv);
      this.a(clm.wi, mh.bv);
      this.a(clm.qV, mh.bv);
      this.a(clm.rd, mh.bv);
      this.a(clm.tV, mh.bv);
      this.a(clm.oE, mh.bv);
      this.a(clm.pX, mh.bv);
      this.a(clm.oV, mh.bx);
      this.a(clm.uc, mh.bv);
      this.a(clm.oW, mh.bx);
      this.a(clm.uz, mh.bv);
      this.a(clm.oU, mh.bx);
      this.a(clm.oT, mh.bx);
      this.a(clm.oS, mh.bx);
      this.a(clm.oF, mh.bv);
      this.a(clm.sf, mh.bv);
      this.a(clm.rm, mh.bv);
      this.a(clm.rs, mh.bv);
      this.a(clm.pr, mh.bv);
      this.a(clm.vK, mh.bv);
      this.a(clm.wm, mh.bv);
      this.a(clm.wp, mh.bv);
      this.a(clm.nP, mh.bv);
      this.a(clm.rc, mh.bv);
      this.a(clm.oA, mh.bv);
      this.a(clm.pa, mh.bx);
      this.a(clm.pb, mh.bx);
      this.a(clm.uy, mh.bv);
      this.a(clm.oB, mh.bv);
      this.a(clm.vn, mh.bv);
      this.a(clm.oZ, mh.bx);
      this.a(clm.oY, mh.bx);
      this.a(clm.oX, mh.bx);
      this.a(clm.tU, mh.bv);
      this.a(clm.nZ, mh.bv);
      this.a(clm.oa, mh.bv);
      this.a(clm.vo, mh.bv);
      this.a(clm.ox, mh.bv);
      this.a(clm.qx, mh.bv);
      this.a(clm.qA, mh.bv);
      this.a(clm.uB, mh.bv);
      this.a(clm.ri, mh.bv);
      this.a(clm.rn, mh.bv);
      this.a(clm.rk, mh.bv);
      this.a(clm.rh, mh.bv);
      this.a(clm.sm, mh.bv);
      this.a(clm.oh, mh.bv);
      this.a(clm.oi, mh.bv);
      this.a(clm.oj, mh.bv);
      this.a(clm.ok, mh.bv);
      this.a(clm.ub, mh.bv);
      this.a(clm.rT, mh.bv);
      this.a(clm.qB, mh.bv);
      this.a(clm.nL, mh.bv);
      this.a(clm.vR, mh.bv);
      this.a(clm.po, mh.bv);
      this.a(clm.vG, mh.bv);
      this.a(clm.vA, mh.bw);
      this.a(clm.vq, mh.bw);
      this.a(clm.vs, mh.bw);
      this.a(clm.vr, mh.bw);
      this.a(clm.vt, mh.bw);
      this.a(clm.vu, mh.bw);
      this.a(clm.vv, mh.bw);
      this.a(clm.vw, mh.bw);
      this.a(clm.vF, mh.bw);
      this.a(clm.vx, mh.bw);
      this.a(clm.vy, mh.bw);
      this.a(clm.vB, mh.bw);
      this.a(clm.vz, mh.bw);
      this.a(clm.vC, mh.bw);
      this.a(clm.vD, mh.bw);
      this.a(clm.vE, mh.bw);
      this.a(clm.uF, mh.bv);
      this.a(clm.uD, mh.bv);
      this.a(clm.vJ, mh.bv);
      this.a(clm.pk, mh.bx);
      this.a(clm.pl, mh.bx);
      this.a(clm.oG, mh.bv);
      this.a(clm.pj, mh.bx);
      this.a(clm.oH, mh.bv);
      this.a(clm.pi, mh.bx);
      this.a(clm.ph, mh.bx);
      this.a(clm.up, mh.bv);
      this.a(clm.uk, mh.bv);
      this.a(clm.nT, mh.bv);
      this.a(clm.nU, mh.bv);
      this.a(clm.rg, mh.bv);
      this.a(clm.pW, mh.bv);
      this.a(clm.qL, mh.bv);
      this.a(clm.vI, mh.bv);
      this.a(clm.vT, mh.bv);
      this.a(clm.rl, mh.bv);
      this.a(clm.ua, mh.bv);
      this.a(clm.uZ, mh.bv);
      this.a(clm.pU, mh.bv);
      this.a(clm.qy, mh.bv);
      this.a(clm.ur, mh.bv);
      this.a(clm.uq, mh.bv);
      this.a(clm.qZ, mh.bv);
      this.a(clm.qC, mh.bv);
      this.a(clm.ul, mh.bv);
      this.a(clm.rp, mh.bv);
      this.a(clm.oy, mh.bv);
      this.a(clm.us, mh.bv);
      this.a(clm.uv, mh.bv);
      this.a(clm.uw, mh.bv);
      this.a(clm.uu, mh.bv);
      this.a(clm.rt, mh.bv);
      this.a(clm.sb, mh.bv);
      this.a(clm.nK, mh.bv);
      this.a(clm.qX, mh.bv);
      this.a(clm.qD, mh.bv);
      this.a(clm.oo, mh.bv);
      this.a(clm.rS, mh.bv);
      this.a(clm.vm, mh.bv);
      this.a(clm.vQ, mh.bv);
      this.a(clm.qN, mh.bv);
      this.a(clm.qz, mh.bv);
      this.a(clm.xg, mh.bv);
      this.a(clm.vh, mh.bv);
      this.a(clm.sj, mh.bv);
      this.a(clm.nV, mh.bv);
      this.a(clm.nW, mh.bv);
      this.a(clm.qU, mh.bv);
      this.a(clm.pm, mh.bx);
      this.a(clm.oQ, mh.bx);
      this.a(clm.oR, mh.bx);
      this.a(clm.oP, mh.bx);
      this.a(clm.oO, mh.bx);
      this.a(clm.oN, mh.bx);
      this.a(clm.rx, mh.bv);
      this.a(clm.vM, mh.bv);
      this.a(clm.nO, mh.bv);
      this.a(clm.vl, mh.bv);
      this.a(clm.vH, mh.bv);
      this.a(clm.qY, mh.bv);
      this.a(clm.qF, mh.bv);
      this.a(clm.qG, mh.bv);
      this.a(clm.qH, mh.bv);
      this.a(clm.qw, mh.bv);
      this.a(clm.pt, mh.bv);
      this.a(clm.rf, mh.bv);
      this.a(clm.oL, mh.bx);
      this.a(clm.oM, mh.bx);
      this.a(clm.oK, mh.bx);
      this.a(clm.oJ, mh.bx);
      this.a(clm.oI, mh.bx);
      this.a(clm.tS, mh.bv);
      this.a(clm.tT, mh.bv);
      this.a(clm.rj, mh.bv);
      this.a(clm.xi, mh.bv);
      this.a(clm.xj, mh.bv);
      this.a(clm.xk, mh.bv);
      this.a(clm.xl, mh.bv);
      this.a(clm.xm, mh.bv);
      this.a(clm.xn, mh.bv);
      this.a(clm.xo, mh.bv);
      this.a(clm.xp, mh.bv);
      this.a(clm.xq, mh.bv);
      this.a(clm.xr, mh.bv);
      this.a(clm.xs, mh.bv);
      this.a(clm.xt, mh.bv);
      this.a(clm.xu, mh.bv);
      this.a(clm.xv, mh.bv);
      this.a(clm.xw, mh.bv);
      this.a(clm.xx, mh.bv);
      this.a(clm.xy, mh.bv);
      this.a(clm.vp, clm.pm, mh.bx);
      this.a(clm.pY, clm.pX, mh.bv);

      for (cle $$0 : jy.i) {
         if ($$0 instanceof cit $$1) {
            this.a($$1);
         }
      }

      this.a(clm.xz, mh.bv);
      this.a(clm.xA, mh.bv);
      this.a(clm.xB, mh.bv);
      this.a(clm.xC, mh.bv);
      this.a(clm.xD, mh.bv);
      this.a(clm.xE, mh.bv);
      this.a(clm.xF, mh.bv);
      this.a(clm.xG, mh.bv);
      this.a(clm.xH, mh.bv);
      this.a(clm.xI, mh.bv);
      this.a(clm.xJ, mh.bv);
      this.a(clm.xK, mh.bv);
      this.a(clm.xL, mh.bv);
      this.a(clm.xM, mh.bv);
      this.a(clm.xN, mh.bv);
      this.a(clm.xO, mh.bv);
      this.a(clm.xP, mh.bv);
      this.a(clm.xQ, mh.bv);
      this.a(clm.xR, mh.bv);
      this.a(clm.xS, mh.bv);
   }

   static record a(String a, float b, Map<ciu, String> c) {
      public String a(ciu $$0) {
         return this.c.getOrDefault($$0, this.a);
      }
   }
}
