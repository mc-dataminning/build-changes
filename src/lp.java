import com.google.common.collect.Maps;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Lifecycle;
import com.mojang.serialization.MapCodec;
import java.util.Map;
import java.util.function.Supplier;
import org.apache.commons.lang3.Validate;
import org.slf4j.Logger;

public class lp {
   private static final Logger ax = LogUtils.getLogger();
   private static final Map<alf, Supplier<?>> ay = Maps.newLinkedHashMap();
   private static final ke<ke<?>> az = new jq<>(ale.a(lq.a), Lifecycle.stable());
   public static final jd<dww> a = a(lq.C, "step", dww::a);
   public static final jv<avz> b = a(lq.ag, $$0 -> awa.nC);
   public static final jd<env> c = b(lq.z, "empty", $$0 -> enx.a);
   public static final jv<bsb> d = a(lq.R, bsf::a);
   public static final jd<dfa> e = b(lq.f, "air", $$0 -> dfc.a);
   public static final jv<dab> f = b(lq.u, $$0 -> dae.x);
   public static final jd<btb<?>> g = b(lq.v, "pig", $$0 -> btb.az);
   public static final jd<cul> h = b(lq.G, "air", $$0 -> cut.a);
   public static final jv<cwp> i = a(lq.Y, cws::a);
   public static final jv<lh<?>> j = a(lq.T, $$0 -> li.b);
   public static final jv<dpk<?>> k = b(lq.h, $$0 -> dpk.a);
   public static final jd<cje> l = a(lq.S, "kebab", cjf::a);
   public static final jv<alf> m = a(lq.r, $$0 -> awk.E);
   public static final jd<duy> n = a(lq.o, "empty", $$0 -> duy.c);
   public static final jv<emg<?>> o = a(lq.ac, $$0 -> emg.a);
   public static final jv<emu<?>> p = a(lq.ad, $$0 -> emu.b);
   public static final jv<elz<?>> q = a(lq.X, $$0 -> elz.a);
   public static final jv<crc<?>> r = a(lq.Q, $$0 -> crc.i);
   public static final jv<czb<?>> s = a(lq.aa, $$0 -> czb.a);
   public static final jv<cza<?>> t = a(lq.Z, $$0 -> cza.b);
   public static final jv<but> u = a(lq.c, buy::a);
   public static final jv<dxb<?>> v = a(lq.W, $$0 -> dxb.a);
   public static final jv<ik<?, ?>> w = a(lq.p, il::a);
   public static final jv<awj<?>> x = a(lq.ah, $$0 -> awk.c);
   public static final jd<cmq> y = a(lq.ar, "plains", $$0 -> cmq.c);
   public static final jd<cmo> z = a(lq.aq, "none", $$0 -> cmo.b);
   public static final jv<cex> A = a(lq.V, cey::a);
   public static final jd<ccu<?>> B = a(lq.P, "dummy", $$0 -> ccu.a);
   public static final jd<ceb<?>> C = a(lq.af, "dummy", $$0 -> ceb.a);
   public static final jv<coq> D = a(lq.ae, $$0 -> coq.c);
   public static final jv<coo> E = a(lq.b, $$0 -> coo.b);
   public static final jv<era> F = a(lq.L, $$0 -> eqx.b);
   public static final jv<erx<?>> G = a(lq.I, $$0 -> ery.e);
   public static final jv<etu> H = a(lq.H, $$0 -> etv.c);
   public static final jv<eun> I = a(lq.K, $$0 -> eup.b);
   public static final jv<eug> J = a(lq.J, $$0 -> eui.c);
   public static final jv<euw> K = a(lq.M, $$0 -> euy.c);
   public static final jv<bpz<?>> L = a(lq.y, $$0 -> bpz.a);
   public static final jv<bqb<?>> M = a(lq.F, $$0 -> bqb.a);
   public static final jv<egt<?>> N = a(lq.D, $$0 -> egt.a);
   public static final jv<dzd<?>> O = a(lq.i, $$0 -> dzd.k);
   public static final jv<eaa<?>> P = a(lq.k, $$0 -> eaa.a);
   public static final jv<eaz<?>> Q = a(lq.w, $$0 -> eaz.I);
   public static final jv<ejj<?>> R = a(lq.aj, $$0 -> ejj.a);
   public static final jv<ejc> S = a(lq.ai, $$0 -> ejc.c);
   public static final jv<eiu<?>> T = a(lq.an, $$0 -> eiu.f);
   public static final jv<eht<?>> U = a(lq.U, $$0 -> eht.f);
   public static final jv<eff<?>> V = a(lq.j, $$0 -> eff.a);
   public static final jv<eeq<?>> W = a(lq.A, $$0 -> eeq.a);
   public static final jv<egi<?>> X = a(lq.ap, $$0 -> egi.a);
   public static final jv<efc<?>> Y = a(lq.ab, $$0 -> efc.a);
   public static final jv<efw<?>> Z = a(lq.ao, $$0 -> efw.b);
   public static final jv<eef<?>> aa = a(lq.x, $$0 -> eef.a);
   public static final jv<MapCodec<? extends ddc>> ab = a(lq.e, ddd::a);
   public static final jv<MapCodec<? extends dua>> ac = a(lq.n, duc::a);
   public static final jv<MapCodec<? extends dym.f>> ad = a(lq.N, dym.f::a);
   public static final jv<MapCodec<? extends dym.o>> ae = a(lq.O, dym.o::a);
   public static final jv<MapCodec<? extends dxo>> af = a(lq.t, dxp::a);
   public static final jv<MapCodec<? extends dfa>> ag = a(lq.g, dfb::a);
   public static final jv<emk<?>> ah = a(lq.am, $$0 -> emk.e);
   public static final jv<ejt<?>> ai = a(lq.ak, $$0 -> ejt.d);
   public static final jv<MapCodec<? extends ejw>> aj = a(lq.al, ejx::a);
   public static final jv<cfk> ak = a(lq.l, cfk::a);
   public static final jv<cfr> al = a(lq.B, cfr::a);
   public static final jv<cui> am = a(lq.E, cuk::a);
   public static final jv<String> an = a(lq.as, dpz::a);
   public static final jv<ctb> ao = a(lq.q, ctc::a);
   public static final jv<ap<?>> ap = a(lq.aN, am::a);
   public static final jv<zg<?>> aq = a(lq.at, zh::a);
   public static final jv<csg> ar = a(lq.au, csh::a);
   public static final jv<kl<?>> as = a(lq.av, km::a);
   public static final jv<MapCodec<? extends bv>> at = a(lq.aw, bw::a);
   public static final jv<cq.a<?>> au = a(lq.ax, cr::a);
   public static final jv<epg> av = a(lq.ay, eph::a);
   public static final jv<? extends jv<?>> aw = az;

   private static <T> jv<T> a(ale<? extends jv<T>> $$0, lp.a<T> $$1) {
      return a($$0, new jq<>($$0, Lifecycle.stable(), false), $$1);
   }

   private static <T> jv<T> b(ale<? extends jv<T>> $$0, lp.a<T> $$1) {
      return a($$0, new jq<>($$0, Lifecycle.stable(), true), $$1);
   }

   private static <T> jd<T> a(ale<? extends jv<T>> $$0, String $$1, lp.a<T> $$2) {
      return a($$0, new jc<>($$1, $$0, Lifecycle.stable(), false), $$2);
   }

   private static <T> jd<T> b(ale<? extends jv<T>> $$0, String $$1, lp.a<T> $$2) {
      return a($$0, new jc<>($$1, $$0, Lifecycle.stable(), true), $$2);
   }

   private static <T, R extends ke<T>> R a(ale<? extends jv<T>> $$0, R $$1, lp.a<T> $$2) {
      alh.a(() -> "registry " + $$0);
      alf $$3 = $$0.a();
      ay.put($$3, () -> $$2.run($$1));
      az.a((ale<ke<?>>)$$0, $$1, ju.a);
      return $$1;
   }

   public static void a() {
      b();
      c();
      a(aw);
   }

   private static void b() {
      ay.forEach(($$0, $$1) -> {
         if ($$1.get() == null) {
            ax.error("Unable to bootstrap registry '{}'", $$0);
         }
      });
   }

   private static void c() {
      aw.l();

      for (jv<?> $$0 : aw) {
         $$0.l();
      }
   }

   private static <T extends jv<?>> void a(jv<T> $$0) {
      $$0.forEach($$1 -> {
         if ($$1.e().isEmpty()) {
            ac.a("Registry '" + $$0.b((T)$$1) + "' was empty after loading");
         }

         if ($$1 instanceof jd) {
            alf $$2 = ((jd)$$1).a();
            Validate.notNull($$1.a($$2), "Missing default of DefaultedMappedRegistry: " + $$2, new Object[0]);
         }
      });
   }

   @FunctionalInterface
   interface a<T> {
      Object run(jv<T> var1);
   }
}
