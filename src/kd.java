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
   public static final ib<dnq> a = b(ke.B, "step", $$0 -> dnq.P);
   public static final it<arq> b = a(ke.af, $$0 -> arr.mO);
   public static final ib<eep> c = b(ke.y, "empty", $$0 -> eer.a);
   public static final it<blf> d = b(ke.Q, $$0 -> blj.z);
   public static final ib<cwp> e = b(ke.f, "air", $$0 -> cwr.a);
   public static final it<cri> f = b(ke.t, $$0 -> crm.x);
   public static final ib<bly<?>> g = b(ke.u, "pig", $$0 -> bly.aw);
   public static final ib<cms> h = b(ke.F, "air", $$0 -> cna.a);
   public static final ib<cov> i = b(ke.X, "empty", $$0 -> coy.b);
   public static final it<jw<?>> j = a(ke.S, $$0 -> jx.c);
   public static final it<dgw<?>> k = b(ke.h, $$0 -> dgw.a);
   public static final ib<cbp> l = a(ke.R, "kebab", cbq::a);
   public static final it<ahg> m = a(ke.q, $$0 -> asb.E);
   public static final ib<dlh> n = a(ke.n, "empty", $$0 -> dlh.c);
   public static final it<eda<?>> o = a(ke.ab, $$0 -> eda.a);
   public static final it<edo<?>> p = a(ke.ac, $$0 -> edo.b);
   public static final it<ect<?>> q = a(ke.W, $$0 -> ect.a);
   public static final it<cjh<?>> r = a(ke.P, $$0 -> cjh.i);
   public static final it<cqg<?>> s = a(ke.Z, $$0 -> cqg.a);
   public static final it<cqf<?>> t = a(ke.Y, $$0 -> cqf.b);
   public static final it<bnl> u = a(ke.c, $$0 -> bnq.j);
   public static final it<dnv<?>> v = a(ke.V, $$0 -> dnv.a);
   public static final it<hj<?, ?>> w = a(ke.o, hk::a);
   public static final it<asa<?>> x = a(ke.ag, $$0 -> asb.c);
   public static final ib<cez> y = a(ke.aq, "plains", $$0 -> cez.c);
   public static final ib<cex> z = a(ke.ap, "none", $$0 -> cex.b);
   public static final it<bxo> A = a(ke.U, bxp::a);
   public static final ib<bvm<?>> B = a(ke.O, "dummy", $$0 -> bvm.a);
   public static final ib<bws<?>> C = a(ke.ae, "dummy", $$0 -> bws.a);
   public static final it<cgv> D = a(ke.ad, $$0 -> cgv.c);
   public static final it<cgt> E = a(ke.b, $$0 -> cgt.b);
   public static final it<ehp> F = a(ke.K, $$0 -> ehm.b);
   public static final it<eij> G = a(ke.H, $$0 -> eik.c);
   public static final it<ejv> H = a(ke.G, $$0 -> ejw.b);
   public static final it<eko> I = a(ke.J, $$0 -> ekq.b);
   public static final it<ekh> J = a(ke.I, $$0 -> ekj.c);
   public static final it<ekw> K = a(ke.L, $$0 -> eky.c);
   public static final it<bje<?>> L = a(ke.x, $$0 -> bje.a);
   public static final it<bjg<?>> M = a(ke.E, $$0 -> bjg.a);
   public static final it<dxn<?>> N = a(ke.C, $$0 -> dxn.a);
   public static final it<dpx<?>> O = a(ke.i, $$0 -> dpx.k);
   public static final it<dqu<?>> P = a(ke.k, $$0 -> dqu.a);
   public static final it<drt<?>> Q = a(ke.v, $$0 -> drt.I);
   public static final it<ead<?>> R = a(ke.ai, $$0 -> ead.a);
   public static final it<dzw> S = a(ke.ah, $$0 -> dzw.c);
   public static final it<dzo<?>> T = a(ke.am, $$0 -> dzo.f);
   public static final it<dyn<?>> U = a(ke.T, $$0 -> dyn.f);
   public static final it<dvz<?>> V = a(ke.j, $$0 -> dvz.a);
   public static final it<dvk<?>> W = a(ke.z, $$0 -> dvk.a);
   public static final it<dxc<?>> X = a(ke.ao, $$0 -> dxc.a);
   public static final it<dvw<?>> Y = a(ke.aa, $$0 -> dvw.a);
   public static final it<dwq<?>> Z = a(ke.an, $$0 -> dwq.b);
   public static final it<duz<?>> aa = a(ke.w, $$0 -> duz.a);
   public static final it<Codec<? extends cur>> ab = a(ke.e, Lifecycle.stable(), cus::a);
   public static final it<Codec<? extends dld>> ac = a(ke.m, Lifecycle.stable(), dlf::a);
   public static final it<Codec<? extends dpg.f>> ad = a(ke.M, dpg.f::a);
   public static final it<Codec<? extends dpg.o>> ae = a(ke.N, dpg.o::a);
   public static final it<Codec<? extends doi>> af = a(ke.s, doj::a);
   public static final it<MapCodec<? extends cwp>> ag = a(ke.g, cwq::a);
   public static final it<ede<?>> ah = a(ke.al, $$0 -> ede.e);
   public static final it<ean<?>> ai = a(ke.aj, $$0 -> ean.d);
   public static final it<Codec<? extends eaq>> aj = a(ke.ak, ear::a);
   public static final it<byb> ak = a(ke.l, byb::a);
   public static final it<byi> al = a(ke.A, $$0 -> byi.a);
   public static final it<dgl> am = a(ke.d, dgm::a);
   public static final it<cmp> an = a(ke.D, cmr::a);
   public static final it<String> ao = a(ke.ar, dhl::a);
   public static final it<cld> ap = a(ke.p, cle::a);
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
