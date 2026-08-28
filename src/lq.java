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
   public static final je<dxg> a = a(lr.G, "step", dxg::a);
   public static final jw<avg> b = a(lr.ak, $$0 -> avh.nC);
   public static final je<eog> c = b(lr.D, "empty", $$0 -> eoi.a);
   public static final jw<brm> d = a(lr.V, brq::a);
   public static final je<dfh> e = b(lr.f, "air", $$0 -> dfj.a);
   public static final je<bsm<?>> f = b(lr.z, "pig", $$0 -> bsm.az);
   public static final je<ctx> g = b(lr.K, "air", $$0 -> cuf.a);
   public static final jw<cwb> h = a(lr.ac, cwe::a);
   public static final jw<li<?>> i = a(lr.X, $$0 -> lj.b);
   public static final jw<dpr<?>> j = b(lr.h, $$0 -> dpr.a);
   public static final jw<akk> k = a(lr.r, $$0 -> avr.E);
   public static final je<dvh> l = a(lr.o, "empty", $$0 -> dvh.c);
   public static final jw<emr<?>> m = a(lr.ag, $$0 -> emr.a);
   public static final jw<enf<?>> n = a(lr.ah, $$0 -> enf.b);
   public static final jw<emk<?>> o = a(lr.ab, $$0 -> emk.a);
   public static final jw<cqp<?>> p = a(lr.U, $$0 -> cqp.i);
   public static final jw<cyo<?>> q = a(lr.ae, $$0 -> cyo.a);
   public static final jw<cyn<?>> r = a(lr.ad, $$0 -> cyn.b);
   public static final jw<bue> s = a(lr.c, buj::a);
   public static final jw<dxl<?>> t = a(lr.aa, $$0 -> dxl.a);
   public static final jw<il<?, ?>> u = a(lr.p, im::a);
   public static final jw<avq<?>> v = a(lr.al, $$0 -> avr.c);
   public static final je<cmc> w = a(lr.av, "plains", $$0 -> cmc.c);
   public static final je<cma> x = a(lr.au, "none", $$0 -> cma.b);
   public static final jw<cei> y = a(lr.Z, cej::a);
   public static final je<ccf<?>> z = a(lr.T, "dummy", $$0 -> ccf.a);
   public static final je<cdm<?>> A = a(lr.aj, "dummy", $$0 -> cdm.a);
   public static final jw<cob> B = a(lr.ai, $$0 -> cob.c);
   public static final jw<cnz> C = a(lr.b, $$0 -> cnz.b);
   public static final jw<erl> D = a(lr.P, $$0 -> eri.b);
   public static final jw<esj<?>> E = a(lr.M, $$0 -> esk.e);
   public static final jw<eug> F = a(lr.L, $$0 -> euh.a);
   public static final jw<eva> G = a(lr.O, $$0 -> evc.b);
   public static final jw<eus> H = a(lr.N, $$0 -> euu.c);
   public static final jw<evj> I = a(lr.Q, $$0 -> evl.c);
   public static final jw<bpk<?>> J = a(lr.C, $$0 -> bpk.a);
   public static final jw<bpm<?>> K = a(lr.J, $$0 -> bpm.a);
   public static final jw<ehe<?>> L = a(lr.H, $$0 -> ehe.a);
   public static final jw<dzn<?>> M = a(lr.i, $$0 -> dzn.k);
   public static final jw<eal<?>> N = a(lr.k, $$0 -> eal.a);
   public static final jw<ebk<?>> O = a(lr.A, $$0 -> ebk.I);
   public static final jw<eju<?>> P = a(lr.an, $$0 -> eju.a);
   public static final jw<ejn> Q = a(lr.am, $$0 -> ejn.c);
   public static final jw<ejf<?>> R = a(lr.ar, $$0 -> ejf.f);
   public static final jw<eie<?>> S = a(lr.Y, $$0 -> eie.f);
   public static final jw<efq<?>> T = a(lr.j, $$0 -> efq.a);
   public static final jw<efb<?>> U = a(lr.E, $$0 -> efb.a);
   public static final jw<egt<?>> V = a(lr.at, $$0 -> egt.a);
   public static final jw<efn<?>> W = a(lr.af, $$0 -> efn.a);
   public static final jw<egh<?>> X = a(lr.as, $$0 -> egh.b);
   public static final jw<eeq<?>> Y = a(lr.B, $$0 -> eeq.a);
   public static final jw<MapCodec<? extends ddj>> Z = a(lr.e, ddk::a);
   public static final jw<MapCodec<? extends duh>> aa = a(lr.n, duj::a);
   public static final jw<MapCodec<? extends dyw.f>> ab = a(lr.R, dyw.f::a);
   public static final jw<MapCodec<? extends dyw.o>> ac = a(lr.S, dyw.o::a);
   public static final jw<MapCodec<? extends dxy>> ad = a(lr.t, dxz::a);
   public static final jw<MapCodec<? extends dfh>> ae = a(lr.g, dfi::a);
   public static final jw<emv<?>> af = a(lr.aq, $$0 -> emv.e);
   public static final jw<eke<?>> ag = a(lr.ao, $$0 -> eke.d);
   public static final jw<MapCodec<? extends ekh>> ah = a(lr.ap, eki::a);
   public static final jw<cev> ai = a(lr.l, cev::a);
   public static final jw<cfc> aj = a(lr.F, cfc::a);
   public static final jw<ctu> ak = a(lr.I, ctw::a);
   public static final jw<dqg> al = a(lr.aw, dqh::a);
   public static final jw<csn> am = a(lr.q, cso::a);
   public static final jw<ap<?>> an = a(lr.aU, am::a);
   public static final jw<yl<?>> ao = a(lr.ax, ym::a);
   public static final jw<crt> ap = a(lr.ay, cru::a);
   public static final jw<km<?>> aq = a(lr.az, kn::a);
   public static final jw<MapCodec<? extends bv>> ar = a(lr.aA, bw::a);
   public static final jw<cq.a<?>> as = a(lr.aB, cr::a);
   public static final jw<epr> at = a(lr.aC, eps::a);
   public static final jw<km<?>> au = a(lr.aD, czm::a);
   public static final jw<MapCodec<? extends czs>> av = a(lr.v, czs::a);
   public static final jw<MapCodec<? extends dab>> aw = a(lr.u, dab::a);
   public static final jw<MapCodec<? extends dac>> ax = a(lr.w, dac::b);
   public static final jw<MapCodec<? extends dad>> ay = a(lr.y, dad::a);
   public static final jw<MapCodec<? extends das>> az = a(lr.x, dat::a);
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
