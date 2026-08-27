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
   private static final Map<ahd, Supplier<?>> au = Maps.newLinkedHashMap();
   private static final jc<jc<?>> av = new ip<>(ahc.a(ke.a), Lifecycle.stable());
   public static final ib<dnk> a = b(ke.B, "step", $$0 -> dnk.P);
   public static final it<arl> b = a(ke.af, $$0 -> arm.mO);
   public static final ib<eej> c = b(ke.y, "empty", $$0 -> eel.a);
   public static final it<bla> d = b(ke.Q, $$0 -> ble.z);
   public static final ib<cwj> e = b(ke.f, "air", $$0 -> cwl.a);
   public static final it<crc> f = b(ke.t, $$0 -> crg.x);
   public static final ib<blt<?>> g = b(ke.u, "pig", $$0 -> blt.aw);
   public static final ib<cmm> h = b(ke.F, "air", $$0 -> cmu.a);
   public static final ib<cop> i = b(ke.X, "empty", $$0 -> cos.b);
   public static final it<jw<?>> j = a(ke.S, $$0 -> jx.c);
   public static final it<dgq<?>> k = b(ke.h, $$0 -> dgq.a);
   public static final ib<cbk> l = a(ke.R, "kebab", cbl::a);
   public static final it<ahd> m = a(ke.q, $$0 -> arw.E);
   public static final ib<dlb> n = a(ke.n, "empty", $$0 -> dlb.c);
   public static final it<ecu<?>> o = a(ke.ab, $$0 -> ecu.a);
   public static final it<edi<?>> p = a(ke.ac, $$0 -> edi.b);
   public static final it<ecn<?>> q = a(ke.W, $$0 -> ecn.a);
   public static final it<cjb<?>> r = a(ke.P, $$0 -> cjb.i);
   public static final it<cqa<?>> s = a(ke.Z, $$0 -> cqa.a);
   public static final it<cpz<?>> t = a(ke.Y, $$0 -> cpz.b);
   public static final it<bng> u = a(ke.c, $$0 -> bnl.j);
   public static final it<dnp<?>> v = a(ke.V, $$0 -> dnp.a);
   public static final it<hj<?, ?>> w = a(ke.o, hk::a);
   public static final it<arv<?>> x = a(ke.ag, $$0 -> arw.c);
   public static final ib<cet> y = a(ke.aq, "plains", $$0 -> cet.c);
   public static final ib<cer> z = a(ke.ap, "none", $$0 -> cer.b);
   public static final it<bxj> A = a(ke.U, bxk::a);
   public static final ib<bvh<?>> B = a(ke.O, "dummy", $$0 -> bvh.a);
   public static final ib<bwn<?>> C = a(ke.ae, "dummy", $$0 -> bwn.a);
   public static final it<cgp> D = a(ke.ad, $$0 -> cgp.c);
   public static final it<cgn> E = a(ke.b, $$0 -> cgn.b);
   public static final it<ehj> F = a(ke.K, $$0 -> ehg.b);
   public static final it<eid> G = a(ke.H, $$0 -> eie.c);
   public static final it<ejp> H = a(ke.G, $$0 -> ejq.b);
   public static final it<eki> I = a(ke.J, $$0 -> ekk.b);
   public static final it<ekb> J = a(ke.I, $$0 -> ekd.c);
   public static final it<ekq> K = a(ke.L, $$0 -> eks.c);
   public static final it<biz<?>> L = a(ke.x, $$0 -> biz.a);
   public static final it<bjb<?>> M = a(ke.E, $$0 -> bjb.a);
   public static final it<dxh<?>> N = a(ke.C, $$0 -> dxh.a);
   public static final it<dpr<?>> O = a(ke.i, $$0 -> dpr.k);
   public static final it<dqo<?>> P = a(ke.k, $$0 -> dqo.a);
   public static final it<drn<?>> Q = a(ke.v, $$0 -> drn.I);
   public static final it<dzx<?>> R = a(ke.ai, $$0 -> dzx.a);
   public static final it<dzq> S = a(ke.ah, $$0 -> dzq.c);
   public static final it<dzi<?>> T = a(ke.am, $$0 -> dzi.f);
   public static final it<dyh<?>> U = a(ke.T, $$0 -> dyh.f);
   public static final it<dvt<?>> V = a(ke.j, $$0 -> dvt.a);
   public static final it<dve<?>> W = a(ke.z, $$0 -> dve.a);
   public static final it<dww<?>> X = a(ke.ao, $$0 -> dww.a);
   public static final it<dvq<?>> Y = a(ke.aa, $$0 -> dvq.a);
   public static final it<dwk<?>> Z = a(ke.an, $$0 -> dwk.b);
   public static final it<dut<?>> aa = a(ke.w, $$0 -> dut.a);
   public static final it<Codec<? extends cul>> ab = a(ke.e, Lifecycle.stable(), cum::a);
   public static final it<Codec<? extends dkx>> ac = a(ke.m, Lifecycle.stable(), dkz::a);
   public static final it<Codec<? extends dpa.f>> ad = a(ke.M, dpa.f::a);
   public static final it<Codec<? extends dpa.o>> ae = a(ke.N, dpa.o::a);
   public static final it<Codec<? extends doc>> af = a(ke.s, dod::a);
   public static final it<MapCodec<? extends cwj>> ag = a(ke.g, cwk::a);
   public static final it<ecy<?>> ah = a(ke.al, $$0 -> ecy.e);
   public static final it<eah<?>> ai = a(ke.aj, $$0 -> eah.d);
   public static final it<Codec<? extends eak>> aj = a(ke.ak, eal::a);
   public static final it<bxw> ak = a(ke.l, bxw::a);
   public static final it<byd> al = a(ke.A, $$0 -> byd.a);
   public static final it<dgf> am = a(ke.d, dgg::a);
   public static final it<cmj> an = a(ke.D, cml::a);
   public static final it<String> ao = a(ke.ar, dhf::a);
   public static final it<ckx> ap = a(ke.p, cky::a);
   public static final it<ap<?>> aq = a(ke.aH, am::a);
   public static final it<wu<?>> ar = a(ke.as, wv::a);
   public static final it<? extends it<?>> as = av;

   private static <T> it<T> a(ahc<? extends it<T>> $$0, kd.a<T> $$1) {
      return a($$0, Lifecycle.stable(), $$1);
   }

   private static <T> it<T> b(ahc<? extends it<T>> $$0, kd.a<T> $$1) {
      return a($$0, new ip<>($$0, Lifecycle.stable(), true), $$1, Lifecycle.stable());
   }

   private static <T> ib<T> a(ahc<? extends it<T>> $$0, String $$1, kd.a<T> $$2) {
      return a($$0, $$1, Lifecycle.stable(), $$2);
   }

   private static <T> ib<T> b(ahc<? extends it<T>> $$0, String $$1, kd.a<T> $$2) {
      return b($$0, $$1, Lifecycle.stable(), $$2);
   }

   private static <T> it<T> a(ahc<? extends it<T>> $$0, Lifecycle $$1, kd.a<T> $$2) {
      return a($$0, new ip<>($$0, $$1, false), $$2, $$1);
   }

   private static <T> ib<T> a(ahc<? extends it<T>> $$0, String $$1, Lifecycle $$2, kd.a<T> $$3) {
      return a($$0, new ia<>($$1, $$0, $$2, false), $$3, $$2);
   }

   private static <T> ib<T> b(ahc<? extends it<T>> $$0, String $$1, Lifecycle $$2, kd.a<T> $$3) {
      return a($$0, new ia<>($$1, $$0, $$2, true), $$3, $$2);
   }

   private static <T, R extends jc<T>> R a(ahc<? extends it<T>> $$0, R $$1, kd.a<T> $$2, Lifecycle $$3) {
      ahf.a(() -> "registry " + $$0);
      ahd $$4 = $$0.a();
      au.put($$4, () -> $$2.run($$1));
      av.a((ahc<jc<?>>)$$0, $$1, $$3);
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
            ahd $$2 = ((ib)$$1).a();
            Validate.notNull($$1.a($$2), "Missing default of DefaultedMappedRegistry: " + $$2, new Object[0]);
         }
      });
   }

   @FunctionalInterface
   interface a<T> {
      T run(it<T> var1);
   }
}
