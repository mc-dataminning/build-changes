import com.google.common.collect.Maps;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Lifecycle;
import com.mojang.serialization.MapCodec;
import java.util.Map;
import java.util.function.Supplier;
import org.apache.commons.lang3.Validate;
import org.slf4j.Logger;

public class lq {
   private static final Logger aB = LogUtils.getLogger();
   private static final Map<akk, Supplier<?>> aC = Maps.newLinkedHashMap();
   private static final kf<kf<?>> aD = new jr<>(akj.a(lr.a), Lifecycle.stable());
   public static final je<dxa> a = a(lr.G, "step", dxa::a);
   public static final jw<ave> b = a(lr.ak, $$0 -> avf.nC);
   public static final je<eoa> c = b(lr.D, "empty", $$0 -> eoc.a);
   public static final jw<brj> d = a(lr.V, brn::a);
   public static final je<dff> e = b(lr.f, "air", $$0 -> dfh.a);
   public static final je<bsj<?>> f = b(lr.z, "pig", $$0 -> bsj.az);
   public static final je<ctv> g = b(lr.K, "air", $$0 -> cud.a);
   public static final jw<cvz> h = a(lr.ac, cwc::a);
   public static final jw<li<?>> i = a(lr.X, $$0 -> lj.b);
   public static final jw<dpp<?>> j = b(lr.h, $$0 -> dpp.a);
   public static final jw<akk> k = a(lr.r, $$0 -> avp.E);
   public static final je<dvc> l = a(lr.o, "empty", $$0 -> dvc.c);
   public static final jw<eml<?>> m = a(lr.ag, $$0 -> eml.a);
   public static final jw<emz<?>> n = a(lr.ah, $$0 -> emz.b);
   public static final jw<eme<?>> o = a(lr.ab, $$0 -> eme.a);
   public static final jw<cqm<?>> p = a(lr.U, $$0 -> cqm.i);
   public static final jw<cym<?>> q = a(lr.ae, $$0 -> cym.a);
   public static final jw<cyl<?>> r = a(lr.ad, $$0 -> cyl.b);
   public static final jw<bub> s = a(lr.c, bug::a);
   public static final jw<dxf<?>> t = a(lr.aa, $$0 -> dxf.a);
   public static final jw<il<?, ?>> u = a(lr.p, im::a);
   public static final jw<avo<?>> v = a(lr.al, $$0 -> avp.c);
   public static final je<clz> w = a(lr.av, "plains", $$0 -> clz.c);
   public static final je<clx> x = a(lr.au, "none", $$0 -> clx.b);
   public static final jw<cef> y = a(lr.Z, ceg::a);
   public static final je<ccc<?>> z = a(lr.T, "dummy", $$0 -> ccc.a);
   public static final je<cdj<?>> A = a(lr.aj, "dummy", $$0 -> cdj.a);
   public static final jw<cny> B = a(lr.ai, $$0 -> cny.c);
   public static final jw<cnw> C = a(lr.b, $$0 -> cnw.b);
   public static final jw<erf> D = a(lr.P, $$0 -> erc.b);
   public static final jw<esd<?>> E = a(lr.M, $$0 -> ese.e);
   public static final jw<eua> F = a(lr.L, $$0 -> eub.a);
   public static final jw<euu> G = a(lr.O, $$0 -> euw.b);
   public static final jw<eum> H = a(lr.N, $$0 -> euo.c);
   public static final jw<evd> I = a(lr.Q, $$0 -> evf.c);
   public static final jw<bph<?>> J = a(lr.C, $$0 -> bph.a);
   public static final jw<bpj<?>> K = a(lr.J, $$0 -> bpj.a);
   public static final jw<egy<?>> L = a(lr.H, $$0 -> egy.a);
   public static final jw<dzh<?>> M = a(lr.i, $$0 -> dzh.k);
   public static final jw<eaf<?>> N = a(lr.k, $$0 -> eaf.a);
   public static final jw<ebe<?>> O = a(lr.A, $$0 -> ebe.I);
   public static final jw<ejo<?>> P = a(lr.an, $$0 -> ejo.a);
   public static final jw<ejh> Q = a(lr.am, $$0 -> ejh.c);
   public static final jw<eiz<?>> R = a(lr.ar, $$0 -> eiz.f);
   public static final jw<ehy<?>> S = a(lr.Y, $$0 -> ehy.f);
   public static final jw<efk<?>> T = a(lr.j, $$0 -> efk.a);
   public static final jw<eev<?>> U = a(lr.E, $$0 -> eev.a);
   public static final jw<egn<?>> V = a(lr.at, $$0 -> egn.a);
   public static final jw<efh<?>> W = a(lr.af, $$0 -> efh.a);
   public static final jw<egb<?>> X = a(lr.as, $$0 -> egb.b);
   public static final jw<eek<?>> Y = a(lr.B, $$0 -> eek.a);
   public static final jw<MapCodec<? extends ddh>> Z = a(lr.e, ddi::a);
   public static final jw<MapCodec<? extends due>> aa = a(lr.n, dug::a);
   public static final jw<MapCodec<? extends dyq.f>> ab = a(lr.R, dyq.f::a);
   public static final jw<MapCodec<? extends dyq.o>> ac = a(lr.S, dyq.o::a);
   public static final jw<MapCodec<? extends dxs>> ad = a(lr.t, dxt::a);
   public static final jw<MapCodec<? extends dff>> ae = a(lr.g, dfg::a);
   public static final jw<emp<?>> af = a(lr.aq, $$0 -> emp.e);
   public static final jw<ejy<?>> ag = a(lr.ao, $$0 -> ejy.d);
   public static final jw<MapCodec<? extends ekb>> ah = a(lr.ap, ekc::a);
   public static final jw<ces> ai = a(lr.l, ces::a);
   public static final jw<cez> aj = a(lr.F, cez::a);
   public static final jw<cts> ak = a(lr.I, ctu::a);
   public static final jw<String> al = a(lr.aw, dqe::a);
   public static final jw<csl> am = a(lr.q, csm::a);
   public static final jw<ap<?>> an = a(lr.aU, am::a);
   public static final jw<yl<?>> ao = a(lr.ax, ym::a);
   public static final jw<crq> ap = a(lr.ay, crr::a);
   public static final jw<km<?>> aq = a(lr.az, kn::a);
   public static final jw<MapCodec<? extends bv>> ar = a(lr.aA, bw::a);
   public static final jw<cq.a<?>> as = a(lr.aB, cr::a);
   public static final jw<epl> at = a(lr.aC, epm::a);
   public static final jw<km<?>> au = a(lr.aD, czk::a);
   public static final jw<MapCodec<? extends czq>> av = a(lr.v, czq::a);
   public static final jw<MapCodec<? extends czz>> aw = a(lr.u, czz::a);
   public static final jw<MapCodec<? extends daa>> ax = a(lr.w, daa::b);
   public static final jw<MapCodec<? extends dab>> ay = a(lr.y, dab::a);
   public static final jw<MapCodec<? extends daq>> az = a(lr.x, dar::a);
   public static final jw<? extends jw<?>> aA = aD;

   private static <T> jw<T> a(akj<? extends jw<T>> $$0, lq.a<T> $$1) {
      return a($$0, new jr<>($$0, Lifecycle.stable(), false), $$1);
   }

   private static <T> jw<T> b(akj<? extends jw<T>> $$0, lq.a<T> $$1) {
      return a($$0, new jr<>($$0, Lifecycle.stable(), true), $$1);
   }

   private static <T> je<T> a(akj<? extends jw<T>> $$0, String $$1, lq.a<T> $$2) {
      return a($$0, new jd<>($$1, $$0, Lifecycle.stable(), false), $$2);
   }

   private static <T> je<T> b(akj<? extends jw<T>> $$0, String $$1, lq.a<T> $$2) {
      return a($$0, new jd<>($$1, $$0, Lifecycle.stable(), true), $$2);
   }

   private static <T, R extends kf<T>> R a(akj<? extends jw<T>> $$0, R $$1, lq.a<T> $$2) {
      akm.a(() -> "registry " + $$0);
      akk $$3 = $$0.a();
      aC.put($$3, () -> $$2.run($$1));
      aD.a((akj<kf<?>>)$$0, $$1, jv.a);
      return $$1;
   }

   public static void a() {
      b();
      c();
      a(aA);
   }

   private static void b() {
      aC.forEach(($$0, $$1) -> {
         if ($$1.get() == null) {
            aB.error("Unable to bootstrap registry '{}'", $$0);
         }
      });
   }

   private static void c() {
      aA.m();

      for (jw<?> $$0 : aA) {
         $$0.m();
      }
   }

   private static <T extends jw<?>> void a(jw<T> $$0) {
      $$0.forEach($$1 -> {
         if ($$1.f().isEmpty()) {
            ac.a("Registry '" + $$0.b((T)$$1) + "' was empty after loading");
         }

         if ($$1 instanceof je) {
            akk $$2 = ((je)$$1).b();
            Validate.notNull($$1.a($$2), "Missing default of DefaultedMappedRegistry: " + $$2, new Object[0]);
         }
      });
   }

   @FunctionalInterface
   interface a<T> {
      Object run(jw<T> var1);
   }
}
