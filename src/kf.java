import com.google.common.collect.Maps;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.Lifecycle;
import com.mojang.serialization.MapCodec;
import java.util.Map;
import java.util.function.Supplier;
import org.apache.commons.lang3.Validate;
import org.slf4j.Logger;

public class kf {
   private static final Logger at = LogUtils.getLogger();
   private static final Map<aiy, Supplier<?>> au = Maps.newLinkedHashMap();
   private static final je<je<?>> av = new ir<>(aix.a(kg.a), Lifecycle.stable());
   public static final id<dpp> a = a(kg.B, "step", dpp::a);
   public static final iv<atj> b = a(kg.af, $$0 -> atk.nd);
   public static final id<ego> c = b(kg.y, "empty", $$0 -> egq.a);
   public static final iv<bmz> d = a(kg.Q, bnd::a);
   public static final id<cyo> e = b(kg.f, "air", $$0 -> cyq.a);
   public static final iv<cti> f = b(kg.t, $$0 -> ctl.x);
   public static final id<bnu<?>> g = b(kg.u, "pig", $$0 -> bnu.ax);
   public static final id<cou> h = b(kg.F, "air", $$0 -> cpc.a);
   public static final id<cqv> i = a(kg.X, "empty", cqy::a);
   public static final iv<jy<?>> j = a(kg.S, $$0 -> jz.c);
   public static final iv<div<?>> k = b(kg.h, $$0 -> div.a);
   public static final id<cdo> l = a(kg.R, "kebab", cdp::a);
   public static final iv<aiy> m = a(kg.q, $$0 -> atu.E);
   public static final id<dng> n = a(kg.n, "empty", $$0 -> dng.c);
   public static final iv<eez<?>> o = a(kg.ab, $$0 -> eez.a);
   public static final iv<efn<?>> p = a(kg.ac, $$0 -> efn.b);
   public static final iv<ees<?>> q = a(kg.W, $$0 -> ees.a);
   public static final iv<cli<?>> r = a(kg.P, $$0 -> cli.i);
   public static final iv<csg<?>> s = a(kg.Z, $$0 -> csg.a);
   public static final iv<csf<?>> t = a(kg.Y, $$0 -> csf.b);
   public static final iv<bpg> u = a(kg.c, bpl::a);
   public static final iv<dpu<?>> v = a(kg.V, $$0 -> dpu.a);
   public static final iv<hl<?, ?>> w = a(kg.o, hm::a);
   public static final iv<att<?>> x = a(kg.ag, $$0 -> atu.c);
   public static final id<cgz> y = a(kg.aq, "plains", $$0 -> cgz.c);
   public static final id<cgx> z = a(kg.ap, "none", $$0 -> cgx.b);
   public static final iv<bzk> A = a(kg.U, bzl::a);
   public static final id<bxh<?>> B = a(kg.O, "dummy", $$0 -> bxh.a);
   public static final id<byo<?>> C = a(kg.ae, "dummy", $$0 -> byo.a);
   public static final iv<ciw> D = a(kg.ad, $$0 -> ciw.c);
   public static final iv<ciu> E = a(kg.b, $$0 -> ciu.b);
   public static final iv<ejp> F = a(kg.K, $$0 -> ejm.b);
   public static final iv<ekj> G = a(kg.H, $$0 -> ekk.c);
   public static final iv<elv> H = a(kg.G, $$0 -> elw.b);
   public static final iv<emo> I = a(kg.J, $$0 -> emq.b);
   public static final iv<emh> J = a(kg.I, $$0 -> emj.c);
   public static final iv<emw> K = a(kg.L, $$0 -> emy.c);
   public static final iv<bky<?>> L = a(kg.x, $$0 -> bky.a);
   public static final iv<bla<?>> M = a(kg.E, $$0 -> bla.a);
   public static final iv<dzm<?>> N = a(kg.C, $$0 -> dzm.a);
   public static final iv<drw<?>> O = a(kg.i, $$0 -> drw.k);
   public static final iv<dst<?>> P = a(kg.k, $$0 -> dst.a);
   public static final iv<dts<?>> Q = a(kg.v, $$0 -> dts.I);
   public static final iv<ecc<?>> R = a(kg.ai, $$0 -> ecc.a);
   public static final iv<ebv> S = a(kg.ah, $$0 -> ebv.c);
   public static final iv<ebn<?>> T = a(kg.am, $$0 -> ebn.f);
   public static final iv<eam<?>> U = a(kg.T, $$0 -> eam.f);
   public static final iv<dxy<?>> V = a(kg.j, $$0 -> dxy.a);
   public static final iv<dxj<?>> W = a(kg.z, $$0 -> dxj.a);
   public static final iv<dzb<?>> X = a(kg.ao, $$0 -> dzb.a);
   public static final iv<dxv<?>> Y = a(kg.aa, $$0 -> dxv.a);
   public static final iv<dyp<?>> Z = a(kg.an, $$0 -> dyp.b);
   public static final iv<dwy<?>> aa = a(kg.w, $$0 -> dwy.a);
   public static final iv<Codec<? extends cwq>> ab = a(kg.e, Lifecycle.stable(), cwr::a);
   public static final iv<Codec<? extends dnc>> ac = a(kg.m, Lifecycle.stable(), dne::a);
   public static final iv<Codec<? extends drf.f>> ad = a(kg.M, drf.f::a);
   public static final iv<Codec<? extends drf.o>> ae = a(kg.N, drf.o::a);
   public static final iv<Codec<? extends dqh>> af = a(kg.s, dqi::a);
   public static final iv<MapCodec<? extends cyo>> ag = a(kg.g, cyp::a);
   public static final iv<efd<?>> ah = a(kg.al, $$0 -> efd.e);
   public static final iv<ecm<?>> ai = a(kg.aj, $$0 -> ecm.d);
   public static final iv<Codec<? extends ecp>> aj = a(kg.ak, ecq::a);
   public static final iv<bzx> ak = a(kg.l, bzx::a);
   public static final iv<cae> al = a(kg.A, $$0 -> cae.a);
   public static final iv<dik> am = a(kg.d, dil::a);
   public static final iv<cor> an = a(kg.D, cot::a);
   public static final iv<String> ao = a(kg.ar, djk::a);
   public static final iv<cnf> ap = a(kg.p, cng::a);
   public static final iv<ap<?>> aq = a(kg.aH, am::a);
   public static final iv<xh<?>> ar = a(kg.as, xi::a);
   public static final iv<? extends iv<?>> as = av;

   private static <T> iv<T> a(aix<? extends iv<T>> $$0, kf.a<T> $$1) {
      return a($$0, Lifecycle.stable(), $$1);
   }

   private static <T> iv<T> b(aix<? extends iv<T>> $$0, kf.a<T> $$1) {
      return a($$0, new ir<>($$0, Lifecycle.stable(), true), $$1, Lifecycle.stable());
   }

   private static <T> id<T> a(aix<? extends iv<T>> $$0, String $$1, kf.a<T> $$2) {
      return a($$0, $$1, Lifecycle.stable(), $$2);
   }

   private static <T> id<T> b(aix<? extends iv<T>> $$0, String $$1, kf.a<T> $$2) {
      return b($$0, $$1, Lifecycle.stable(), $$2);
   }

   private static <T> iv<T> a(aix<? extends iv<T>> $$0, Lifecycle $$1, kf.a<T> $$2) {
      return a($$0, new ir<>($$0, $$1, false), $$2, $$1);
   }

   private static <T> id<T> a(aix<? extends iv<T>> $$0, String $$1, Lifecycle $$2, kf.a<T> $$3) {
      return a($$0, new ic<>($$1, $$0, $$2, false), $$3, $$2);
   }

   private static <T> id<T> b(aix<? extends iv<T>> $$0, String $$1, Lifecycle $$2, kf.a<T> $$3) {
      return a($$0, new ic<>($$1, $$0, $$2, true), $$3, $$2);
   }

   private static <T, R extends je<T>> R a(aix<? extends iv<T>> $$0, R $$1, kf.a<T> $$2, Lifecycle $$3) {
      aja.a(() -> "registry " + $$0);
      aiy $$4 = $$0.a();
      au.put($$4, () -> $$2.run($$1));
      av.a((aix<je<?>>)$$0, $$1, $$3);
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

      for (iv<?> $$0 : as) {
         $$0.l();
      }
   }

   private static <T extends iv<?>> void a(iv<T> $$0) {
      $$0.forEach($$1 -> {
         if ($$1.e().isEmpty()) {
            ac.a("Registry '" + $$0.b((T)$$1) + "' was empty after loading");
         }

         if ($$1 instanceof id) {
            aiy $$2 = ((id)$$1).a();
            Validate.notNull($$1.a($$2), "Missing default of DefaultedMappedRegistry: " + $$2, new Object[0]);
         }
      });
   }

   @FunctionalInterface
   interface a<T> {
      Object run(iv<T> var1);
   }
}
