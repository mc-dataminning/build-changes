import com.google.common.collect.Maps;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.Lifecycle;
import com.mojang.serialization.MapCodec;
import java.util.Map;
import java.util.function.Supplier;
import org.apache.commons.lang3.Validate;
import org.slf4j.Logger;

public class kd {
   private static final Logger at = LogUtils.getLogger();
   private static final Map<ahh, Supplier<?>> au = Maps.newLinkedHashMap();
   private static final jc<jc<?>> av = new ip<>(ahg.a(ke.a), Lifecycle.stable());
   public static final ib<dnz> a = a(ke.B, "step", dnz::a);
   public static final it<ars> b = a(ke.af, $$0 -> art.nd);
   public static final ib<eey> c = b(ke.y, "empty", $$0 -> efa.a);
   public static final it<blh> d = a(ke.Q, bll::a);
   public static final ib<cwy> e = b(ke.f, "air", $$0 -> cxa.a);
   public static final it<crr> f = b(ke.t, $$0 -> crv.x);
   public static final ib<bmc<?>> g = b(ke.u, "pig", $$0 -> bmc.ax);
   public static final ib<cnb> h = b(ke.F, "air", $$0 -> cnj.a);
   public static final ib<cpe> i = a(ke.X, "empty", cph::a);
   public static final it<jw<?>> j = a(ke.S, $$0 -> jx.c);
   public static final it<dhf<?>> k = b(ke.h, $$0 -> dhf.a);
   public static final ib<cbx> l = a(ke.R, "kebab", cby::a);
   public static final it<ahh> m = a(ke.q, $$0 -> asd.E);
   public static final ib<dlq> n = a(ke.n, "empty", $$0 -> dlq.c);
   public static final it<edj<?>> o = a(ke.ab, $$0 -> edj.a);
   public static final it<edx<?>> p = a(ke.ac, $$0 -> edx.b);
   public static final it<edc<?>> q = a(ke.W, $$0 -> edc.a);
   public static final it<cjq<?>> r = a(ke.P, $$0 -> cjq.i);
   public static final it<cqp<?>> s = a(ke.Z, $$0 -> cqp.a);
   public static final it<cqo<?>> t = a(ke.Y, $$0 -> cqo.b);
   public static final it<bnp> u = a(ke.c, bnu::a);
   public static final it<doe<?>> v = a(ke.V, $$0 -> doe.a);
   public static final it<hj<?, ?>> w = a(ke.o, hk::a);
   public static final it<asc<?>> x = a(ke.ag, $$0 -> asd.c);
   public static final ib<cfi> y = a(ke.aq, "plains", $$0 -> cfi.c);
   public static final ib<cfg> z = a(ke.ap, "none", $$0 -> cfg.b);
   public static final it<bxt> A = a(ke.U, bxu::a);
   public static final ib<bvq<?>> B = a(ke.O, "dummy", $$0 -> bvq.a);
   public static final ib<bwx<?>> C = a(ke.ae, "dummy", $$0 -> bwx.a);
   public static final it<che> D = a(ke.ad, $$0 -> che.c);
   public static final it<chc> E = a(ke.b, $$0 -> chc.b);
   public static final it<ehz> F = a(ke.K, $$0 -> ehw.b);
   public static final it<eit> G = a(ke.H, $$0 -> eiu.c);
   public static final it<ekf> H = a(ke.G, $$0 -> ekg.b);
   public static final it<eky> I = a(ke.J, $$0 -> ela.b);
   public static final it<ekr> J = a(ke.I, $$0 -> ekt.c);
   public static final it<elg> K = a(ke.L, $$0 -> eli.c);
   public static final it<bjg<?>> L = a(ke.x, $$0 -> bjg.a);
   public static final it<bji<?>> M = a(ke.E, $$0 -> bji.a);
   public static final it<dxw<?>> N = a(ke.C, $$0 -> dxw.a);
   public static final it<dqg<?>> O = a(ke.i, $$0 -> dqg.k);
   public static final it<drd<?>> P = a(ke.k, $$0 -> drd.a);
   public static final it<dsc<?>> Q = a(ke.v, $$0 -> dsc.I);
   public static final it<eam<?>> R = a(ke.ai, $$0 -> eam.a);
   public static final it<eaf> S = a(ke.ah, $$0 -> eaf.c);
   public static final it<dzx<?>> T = a(ke.am, $$0 -> dzx.f);
   public static final it<dyw<?>> U = a(ke.T, $$0 -> dyw.f);
   public static final it<dwi<?>> V = a(ke.j, $$0 -> dwi.a);
   public static final it<dvt<?>> W = a(ke.z, $$0 -> dvt.a);
   public static final it<dxl<?>> X = a(ke.ao, $$0 -> dxl.a);
   public static final it<dwf<?>> Y = a(ke.aa, $$0 -> dwf.a);
   public static final it<dwz<?>> Z = a(ke.an, $$0 -> dwz.b);
   public static final it<dvi<?>> aa = a(ke.w, $$0 -> dvi.a);
   public static final it<Codec<? extends cva>> ab = a(ke.e, Lifecycle.stable(), cvb::a);
   public static final it<Codec<? extends dlm>> ac = a(ke.m, Lifecycle.stable(), dlo::a);
   public static final it<Codec<? extends dpp.f>> ad = a(ke.M, dpp.f::a);
   public static final it<Codec<? extends dpp.o>> ae = a(ke.N, dpp.o::a);
   public static final it<Codec<? extends dor>> af = a(ke.s, dos::a);
   public static final it<MapCodec<? extends cwy>> ag = a(ke.g, cwz::a);
   public static final it<edn<?>> ah = a(ke.al, $$0 -> edn.e);
   public static final it<eaw<?>> ai = a(ke.aj, $$0 -> eaw.d);
   public static final it<Codec<? extends eaz>> aj = a(ke.ak, eba::a);
   public static final it<byg> ak = a(ke.l, byg::a);
   public static final it<byn> al = a(ke.A, $$0 -> byn.a);
   public static final it<dgu> am = a(ke.d, dgv::a);
   public static final it<cmy> an = a(ke.D, cna::a);
   public static final it<String> ao = a(ke.ar, dhu::a);
   public static final it<cln> ap = a(ke.p, clo::a);
   public static final it<ap<?>> aq = a(ke.aH, am::a);
   public static final it<wx<?>> ar = a(ke.as, wy::a);
   public static final it<? extends it<?>> as = av;

   private static <T> it<T> a(ahg<? extends it<T>> $$0, kd.a<T> $$1) {
      return a($$0, Lifecycle.stable(), $$1);
   }

   private static <T> it<T> b(ahg<? extends it<T>> $$0, kd.a<T> $$1) {
      return a($$0, new ip<>($$0, Lifecycle.stable(), true), $$1, Lifecycle.stable());
   }

   private static <T> ib<T> a(ahg<? extends it<T>> $$0, String $$1, kd.a<T> $$2) {
      return a($$0, $$1, Lifecycle.stable(), $$2);
   }

   private static <T> ib<T> b(ahg<? extends it<T>> $$0, String $$1, kd.a<T> $$2) {
      return b($$0, $$1, Lifecycle.stable(), $$2);
   }

   private static <T> it<T> a(ahg<? extends it<T>> $$0, Lifecycle $$1, kd.a<T> $$2) {
      return a($$0, new ip<>($$0, $$1, false), $$2, $$1);
   }

   private static <T> ib<T> a(ahg<? extends it<T>> $$0, String $$1, Lifecycle $$2, kd.a<T> $$3) {
      return a($$0, new ia<>($$1, $$0, $$2, false), $$3, $$2);
   }

   private static <T> ib<T> b(ahg<? extends it<T>> $$0, String $$1, Lifecycle $$2, kd.a<T> $$3) {
      return a($$0, new ia<>($$1, $$0, $$2, true), $$3, $$2);
   }

   private static <T, R extends jc<T>> R a(ahg<? extends it<T>> $$0, R $$1, kd.a<T> $$2, Lifecycle $$3) {
      ahj.a(() -> "registry " + $$0);
      ahh $$4 = $$0.a();
      au.put($$4, () -> $$2.run($$1));
      av.a((ahg<jc<?>>)$$0, $$1, $$3);
      return $$1;
   }

   public static void a() {
      b();
      c();
      a(as);
   }

   private static void b() {
      au.forEach(($$0, $$1) -> {
         if ($$1.get() == null) {
            at.error("Unable to bootstrap registry '{}'", $$0);
         }
      });
   }

   private static void c() {
      as.l();

      for (it<?> $$0 : as) {
         $$0.l();
      }
   }

   private static <T extends it<?>> void a(it<T> $$0) {
      $$0.forEach($$1 -> {
         if ($$1.e().isEmpty()) {
            ac.a("Registry '" + $$0.b((T)$$1) + "' was empty after loading");
         }

         if ($$1 instanceof ib) {
            ahh $$2 = ((ib)$$1).a();
            Validate.notNull($$1.a($$2), "Missing default of DefaultedMappedRegistry: " + $$2, new Object[0]);
         }
      });
   }

   @FunctionalInterface
   interface a<T> {
      Object run(it<T> var1);
   }
}
