import com.google.common.collect.Maps;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.Lifecycle;
import com.mojang.serialization.MapCodec;
import java.util.Map;
import java.util.function.Supplier;
import org.apache.commons.lang3.Validate;
import org.slf4j.Logger;

public class kb {
   private static final Logger as = LogUtils.getLogger();
   private static final Map<agt, Supplier<?>> at = Maps.newLinkedHashMap();
   private static final ja<ja<?>> au = new in<>(ags.a(kc.a), Lifecycle.stable());
   public static final hz<dmz> a = b(kc.B, "step", $$0 -> dmz.P);
   public static final ir<arb> b = a(kc.af, $$0 -> arc.mO);
   public static final hz<edy> c = b(kc.y, "empty", $$0 -> eea.a);
   public static final ir<bkq> d = b(kc.Q, $$0 -> bku.z);
   public static final hz<cvz> e = b(kc.f, "air", $$0 -> cwb.a);
   public static final ir<cqs> f = b(kc.t, $$0 -> cqw.x);
   public static final hz<blj<?>> g = b(kc.u, "pig", $$0 -> blj.aw);
   public static final hz<cmc> h = b(kc.F, "air", $$0 -> cmk.a);
   public static final hz<coe> i = b(kc.X, "empty", $$0 -> coh.b);
   public static final ir<ju<?>> j = a(kc.S, $$0 -> jv.c);
   public static final ir<dgf<?>> k = b(kc.h, $$0 -> dgf.a);
   public static final hz<cba> l = a(kc.R, "kebab", cbb::a);
   public static final ir<agt> m = a(kc.q, $$0 -> arm.E);
   public static final hz<dkq> n = a(kc.n, "empty", $$0 -> dkq.c);
   public static final ir<ecj<?>> o = a(kc.ab, $$0 -> ecj.a);
   public static final ir<ecx<?>> p = a(kc.ac, $$0 -> ecx.b);
   public static final ir<ecc<?>> q = a(kc.W, $$0 -> ecc.a);
   public static final ir<cir<?>> r = a(kc.P, $$0 -> cir.i);
   public static final ir<cpq<?>> s = a(kc.Z, $$0 -> cpq.a);
   public static final ir<cpp<?>> t = a(kc.Y, $$0 -> cpp.b);
   public static final ir<bmw> u = a(kc.c, $$0 -> bnb.j);
   public static final ir<dne<?>> v = a(kc.V, $$0 -> dne.a);
   public static final ir<hh<?, ?>> w = a(kc.o, hi::a);
   public static final ir<arl<?>> x = a(kc.ag, $$0 -> arm.c);
   public static final hz<cej> y = a(kc.aq, "plains", $$0 -> cej.c);
   public static final hz<ceh> z = a(kc.ap, "none", $$0 -> ceh.b);
   public static final ir<bwz> A = a(kc.U, bxa::a);
   public static final hz<bux<?>> B = a(kc.O, "dummy", $$0 -> bux.a);
   public static final hz<bwd<?>> C = a(kc.ae, "dummy", $$0 -> bwd.a);
   public static final ir<cgf> D = a(kc.ad, $$0 -> cgf.c);
   public static final ir<cgd> E = a(kc.b, $$0 -> cgd.b);
   public static final ir<egy> F = a(kc.K, $$0 -> egv.b);
   public static final ir<ehs> G = a(kc.H, $$0 -> eht.c);
   public static final ir<eje> H = a(kc.G, $$0 -> ejf.b);
   public static final ir<ejx> I = a(kc.J, $$0 -> ejz.b);
   public static final ir<ejq> J = a(kc.I, $$0 -> ejs.c);
   public static final ir<ekf> K = a(kc.L, $$0 -> ekh.c);
   public static final ir<bip<?>> L = a(kc.x, $$0 -> bip.a);
   public static final ir<bir<?>> M = a(kc.E, $$0 -> bir.a);
   public static final ir<dww<?>> N = a(kc.C, $$0 -> dww.a);
   public static final ir<dpg<?>> O = a(kc.i, $$0 -> dpg.k);
   public static final ir<dqd<?>> P = a(kc.k, $$0 -> dqd.a);
   public static final ir<drc<?>> Q = a(kc.v, $$0 -> drc.I);
   public static final ir<dzm<?>> R = a(kc.ai, $$0 -> dzm.a);
   public static final ir<dzf> S = a(kc.ah, $$0 -> dzf.c);
   public static final ir<dyx<?>> T = a(kc.am, $$0 -> dyx.f);
   public static final ir<dxw<?>> U = a(kc.T, $$0 -> dxw.f);
   public static final ir<dvi<?>> V = a(kc.j, $$0 -> dvi.a);
   public static final ir<dut<?>> W = a(kc.z, $$0 -> dut.a);
   public static final ir<dwl<?>> X = a(kc.ao, $$0 -> dwl.a);
   public static final ir<dvf<?>> Y = a(kc.aa, $$0 -> dvf.a);
   public static final ir<dvz<?>> Z = a(kc.an, $$0 -> dvz.b);
   public static final ir<dui<?>> aa = a(kc.w, $$0 -> dui.a);
   public static final ir<Codec<? extends cub>> ab = a(kc.e, Lifecycle.stable(), cuc::a);
   public static final ir<Codec<? extends dkm>> ac = a(kc.m, Lifecycle.stable(), dko::a);
   public static final ir<Codec<? extends dop.f>> ad = a(kc.M, dop.f::a);
   public static final ir<Codec<? extends dop.o>> ae = a(kc.N, dop.o::a);
   public static final ir<Codec<? extends dnr>> af = a(kc.s, dns::a);
   public static final ir<MapCodec<? extends cvz>> ag = a(kc.g, cwa::a);
   public static final ir<ecn<?>> ah = a(kc.al, $$0 -> ecn.e);
   public static final ir<dzw<?>> ai = a(kc.aj, $$0 -> dzw.d);
   public static final ir<Codec<? extends dzz>> aj = a(kc.ak, eaa::a);
   public static final ir<bxm> ak = a(kc.l, bxm::a);
   public static final ir<bxt> al = a(kc.A, $$0 -> bxt.a);
   public static final ir<dfu> am = a(kc.d, dfv::a);
   public static final ir<clz> an = a(kc.D, cmb::a);
   public static final ir<String> ao = a(kc.ar, dgu::a);
   public static final ir<ckn> ap = a(kc.p, cko::a);
   public static final ir<ap<?>> aq = a(kc.aG, am::a);
   public static final ir<? extends ir<?>> ar = au;

   private static <T> ir<T> a(ags<? extends ir<T>> $$0, kb.a<T> $$1) {
      return a($$0, Lifecycle.stable(), $$1);
   }

   private static <T> ir<T> b(ags<? extends ir<T>> $$0, kb.a<T> $$1) {
      return a($$0, new in<>($$0, Lifecycle.stable(), true), $$1, Lifecycle.stable());
   }

   private static <T> hz<T> a(ags<? extends ir<T>> $$0, String $$1, kb.a<T> $$2) {
      return a($$0, $$1, Lifecycle.stable(), $$2);
   }

   private static <T> hz<T> b(ags<? extends ir<T>> $$0, String $$1, kb.a<T> $$2) {
      return b($$0, $$1, Lifecycle.stable(), $$2);
   }

   private static <T> ir<T> a(ags<? extends ir<T>> $$0, Lifecycle $$1, kb.a<T> $$2) {
      return a($$0, new in<>($$0, $$1, false), $$2, $$1);
   }

   private static <T> hz<T> a(ags<? extends ir<T>> $$0, String $$1, Lifecycle $$2, kb.a<T> $$3) {
      return a($$0, new hy<>($$1, $$0, $$2, false), $$3, $$2);
   }

   private static <T> hz<T> b(ags<? extends ir<T>> $$0, String $$1, Lifecycle $$2, kb.a<T> $$3) {
      return a($$0, new hy<>($$1, $$0, $$2, true), $$3, $$2);
   }

   private static <T, R extends ja<T>> R a(ags<? extends ir<T>> $$0, R $$1, kb.a<T> $$2, Lifecycle $$3) {
      agv.a(() -> "registry " + $$0);
      agt $$4 = $$0.a();
      at.put($$4, () -> $$2.run($$1));
      au.a((ags<ja<?>>)$$0, $$1, $$3);
      return $$1;
   }

   public static void a() {
      b();
      c();
      a(ar);
   }

   private static void b() {
      at.forEach(($$0, $$1) -> {
         if ($$1.get() == null) {
            as.error("Unable to bootstrap registry '{}'", $$0);
         }
      });
   }

   private static void c() {
      ar.l();

      for (ir<?> $$0 : ar) {
         $$0.l();
      }
   }

   private static <T extends ir<?>> void a(ir<T> $$0) {
      $$0.forEach($$1 -> {
         if ($$1.e().isEmpty()) {
            ac.a("Registry '" + $$0.b((T)$$1) + "' was empty after loading");
         }

         if ($$1 instanceof hz) {
            agt $$2 = ((hz)$$1).a();
            Validate.notNull($$1.a($$2), "Missing default of DefaultedMappedRegistry: " + $$2, new Object[0]);
         }
      });
   }

   @FunctionalInterface
   interface a<T> {
      T run(ir<T> var1);
   }
}
