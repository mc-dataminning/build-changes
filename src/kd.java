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
   private static final Map<ahg, Supplier<?>> au = Maps.newLinkedHashMap();
   private static final jc<jc<?>> av = new ip<>(ahf.a(ke.a), Lifecycle.stable());
   public static final ib<dnr> a = b(ke.B, "step", $$0 -> dnr.P);
   public static final it<arr> b = a(ke.af, $$0 -> ars.mO);
   public static final ib<eeq> c = b(ke.y, "empty", $$0 -> ees.a);
   public static final it<blg> d = b(ke.Q, $$0 -> blk.z);
   public static final ib<cwq> e = b(ke.f, "air", $$0 -> cws.a);
   public static final it<crj> f = b(ke.t, $$0 -> crn.x);
   public static final ib<blz<?>> g = b(ke.u, "pig", $$0 -> blz.aw);
   public static final ib<cmt> h = b(ke.F, "air", $$0 -> cnb.a);
   public static final ib<cow> i = b(ke.X, "empty", $$0 -> coz.b);
   public static final it<jw<?>> j = a(ke.S, $$0 -> jx.c);
   public static final it<dgx<?>> k = b(ke.h, $$0 -> dgx.a);
   public static final ib<cbq> l = a(ke.R, "kebab", cbr::a);
   public static final it<ahg> m = a(ke.q, $$0 -> asc.E);
   public static final ib<dli> n = a(ke.n, "empty", $$0 -> dli.c);
   public static final it<edb<?>> o = a(ke.ab, $$0 -> edb.a);
   public static final it<edp<?>> p = a(ke.ac, $$0 -> edp.b);
   public static final it<ecu<?>> q = a(ke.W, $$0 -> ecu.a);
   public static final it<cji<?>> r = a(ke.P, $$0 -> cji.i);
   public static final it<cqh<?>> s = a(ke.Z, $$0 -> cqh.a);
   public static final it<cqg<?>> t = a(ke.Y, $$0 -> cqg.b);
   public static final it<bnm> u = a(ke.c, $$0 -> bnr.j);
   public static final it<dnw<?>> v = a(ke.V, $$0 -> dnw.a);
   public static final it<hj<?, ?>> w = a(ke.o, hk::a);
   public static final it<asb<?>> x = a(ke.ag, $$0 -> asc.c);
   public static final ib<cfa> y = a(ke.aq, "plains", $$0 -> cfa.c);
   public static final ib<cey> z = a(ke.ap, "none", $$0 -> cey.b);
   public static final it<bxp> A = a(ke.U, bxq::a);
   public static final ib<bvn<?>> B = a(ke.O, "dummy", $$0 -> bvn.a);
   public static final ib<bwt<?>> C = a(ke.ae, "dummy", $$0 -> bwt.a);
   public static final it<cgw> D = a(ke.ad, $$0 -> cgw.c);
   public static final it<cgu> E = a(ke.b, $$0 -> cgu.b);
   public static final it<ehq> F = a(ke.K, $$0 -> ehn.b);
   public static final it<eik> G = a(ke.H, $$0 -> eil.c);
   public static final it<ejw> H = a(ke.G, $$0 -> ejx.b);
   public static final it<ekp> I = a(ke.J, $$0 -> ekr.b);
   public static final it<eki> J = a(ke.I, $$0 -> ekk.c);
   public static final it<ekx> K = a(ke.L, $$0 -> ekz.c);
   public static final it<bjf<?>> L = a(ke.x, $$0 -> bjf.a);
   public static final it<bjh<?>> M = a(ke.E, $$0 -> bjh.a);
   public static final it<dxo<?>> N = a(ke.C, $$0 -> dxo.a);
   public static final it<dpy<?>> O = a(ke.i, $$0 -> dpy.k);
   public static final it<dqv<?>> P = a(ke.k, $$0 -> dqv.a);
   public static final it<dru<?>> Q = a(ke.v, $$0 -> dru.I);
   public static final it<eae<?>> R = a(ke.ai, $$0 -> eae.a);
   public static final it<dzx> S = a(ke.ah, $$0 -> dzx.c);
   public static final it<dzp<?>> T = a(ke.am, $$0 -> dzp.f);
   public static final it<dyo<?>> U = a(ke.T, $$0 -> dyo.f);
   public static final it<dwa<?>> V = a(ke.j, $$0 -> dwa.a);
   public static final it<dvl<?>> W = a(ke.z, $$0 -> dvl.a);
   public static final it<dxd<?>> X = a(ke.ao, $$0 -> dxd.a);
   public static final it<dvx<?>> Y = a(ke.aa, $$0 -> dvx.a);
   public static final it<dwr<?>> Z = a(ke.an, $$0 -> dwr.b);
   public static final it<dva<?>> aa = a(ke.w, $$0 -> dva.a);
   public static final it<Codec<? extends cus>> ab = a(ke.e, Lifecycle.stable(), cut::a);
   public static final it<Codec<? extends dle>> ac = a(ke.m, Lifecycle.stable(), dlg::a);
   public static final it<Codec<? extends dph.f>> ad = a(ke.M, dph.f::a);
   public static final it<Codec<? extends dph.o>> ae = a(ke.N, dph.o::a);
   public static final it<Codec<? extends doj>> af = a(ke.s, dok::a);
   public static final it<MapCodec<? extends cwq>> ag = a(ke.g, cwr::a);
   public static final it<edf<?>> ah = a(ke.al, $$0 -> edf.e);
   public static final it<eao<?>> ai = a(ke.aj, $$0 -> eao.d);
   public static final it<Codec<? extends ear>> aj = a(ke.ak, eas::a);
   public static final it<byc> ak = a(ke.l, byc::a);
   public static final it<byj> al = a(ke.A, $$0 -> byj.a);
   public static final it<dgm> am = a(ke.d, dgn::a);
   public static final it<cmq> an = a(ke.D, cms::a);
   public static final it<String> ao = a(ke.ar, dhm::a);
   public static final it<cle> ap = a(ke.p, clf::a);
   public static final it<ap<?>> aq = a(ke.aH, am::a);
   public static final it<ww<?>> ar = a(ke.as, wx::a);
   public static final it<? extends it<?>> as = av;

   private static <T> it<T> a(ahf<? extends it<T>> $$0, kd.a<T> $$1) {
      return a($$0, Lifecycle.stable(), $$1);
   }

   private static <T> it<T> b(ahf<? extends it<T>> $$0, kd.a<T> $$1) {
      return a($$0, new ip<>($$0, Lifecycle.stable(), true), $$1, Lifecycle.stable());
   }

   private static <T> ib<T> a(ahf<? extends it<T>> $$0, String $$1, kd.a<T> $$2) {
      return a($$0, $$1, Lifecycle.stable(), $$2);
   }

   private static <T> ib<T> b(ahf<? extends it<T>> $$0, String $$1, kd.a<T> $$2) {
      return b($$0, $$1, Lifecycle.stable(), $$2);
   }

   private static <T> it<T> a(ahf<? extends it<T>> $$0, Lifecycle $$1, kd.a<T> $$2) {
      return a($$0, new ip<>($$0, $$1, false), $$2, $$1);
   }

   private static <T> ib<T> a(ahf<? extends it<T>> $$0, String $$1, Lifecycle $$2, kd.a<T> $$3) {
      return a($$0, new ia<>($$1, $$0, $$2, false), $$3, $$2);
   }

   private static <T> ib<T> b(ahf<? extends it<T>> $$0, String $$1, Lifecycle $$2, kd.a<T> $$3) {
      return a($$0, new ia<>($$1, $$0, $$2, true), $$3, $$2);
   }

   private static <T, R extends jc<T>> R a(ahf<? extends it<T>> $$0, R $$1, kd.a<T> $$2, Lifecycle $$3) {
      ahi.a(() -> "registry " + $$0);
      ahg $$4 = $$0.a();
      au.put($$4, () -> $$2.run($$1));
      av.a((ahf<jc<?>>)$$0, $$1, $$3);
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
            ahg $$2 = ((ib)$$1).a();
            Validate.notNull($$1.a($$2), "Missing default of DefaultedMappedRegistry: " + $$2, new Object[0]);
         }
      });
   }

   @FunctionalInterface
   interface a<T> {
      T run(it<T> var1);
   }
}
