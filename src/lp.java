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
   public static final jd<dwx> a = a(lq.C, "step", dwx::a);
   public static final jv<avz> b = a(lq.ag, $$0 -> awa.nC);
   public static final jd<enw> c = b(lq.z, "empty", $$0 -> eny.a);
   public static final jv<bsc> d = a(lq.R, bsg::a);
   public static final jd<dfb> e = b(lq.f, "air", $$0 -> dfd.a);
   public static final jv<dac> f = b(lq.u, $$0 -> daf.x);
   public static final jd<btc<?>> g = b(lq.v, "pig", $$0 -> btc.az);
   public static final jd<cum> h = b(lq.G, "air", $$0 -> cuu.a);
   public static final jv<cwq> i = a(lq.Y, cwt::a);
   public static final jv<lh<?>> j = a(lq.T, $$0 -> li.b);
   public static final jv<dpl<?>> k = b(lq.h, $$0 -> dpl.a);
   public static final jd<cjf> l = a(lq.S, "kebab", cjg::a);
   public static final jv<alf> m = a(lq.r, $$0 -> awk.E);
   public static final jd<duz> n = a(lq.o, "empty", $$0 -> duz.c);
   public static final jv<emh<?>> o = a(lq.ac, $$0 -> emh.a);
   public static final jv<emv<?>> p = a(lq.ad, $$0 -> emv.b);
   public static final jv<ema<?>> q = a(lq.X, $$0 -> ema.a);
   public static final jv<crd<?>> r = a(lq.Q, $$0 -> crd.i);
   public static final jv<czc<?>> s = a(lq.aa, $$0 -> czc.a);
   public static final jv<czb<?>> t = a(lq.Z, $$0 -> czb.b);
   public static final jv<buu> u = a(lq.c, buz::a);
   public static final jv<dxc<?>> v = a(lq.W, $$0 -> dxc.a);
   public static final jv<ik<?, ?>> w = a(lq.p, il::a);
   public static final jv<awj<?>> x = a(lq.ah, $$0 -> awk.c);
   public static final jd<cmr> y = a(lq.ar, "plains", $$0 -> cmr.c);
   public static final jd<cmp> z = a(lq.aq, "none", $$0 -> cmp.b);
   public static final jv<cey> A = a(lq.V, cez::a);
   public static final jd<ccv<?>> B = a(lq.P, "dummy", $$0 -> ccv.a);
   public static final jd<cec<?>> C = a(lq.af, "dummy", $$0 -> cec.a);
   public static final jv<cor> D = a(lq.ae, $$0 -> cor.c);
   public static final jv<cop> E = a(lq.b, $$0 -> cop.b);
   public static final jv<erb> F = a(lq.L, $$0 -> eqy.b);
   public static final jv<ery<?>> G = a(lq.I, $$0 -> erz.e);
   public static final jv<etv> H = a(lq.H, $$0 -> etw.c);
   public static final jv<euo> I = a(lq.K, $$0 -> euq.b);
   public static final jv<euh> J = a(lq.J, $$0 -> euj.c);
   public static final jv<eux> K = a(lq.M, $$0 -> euz.c);
   public static final jv<bqa<?>> L = a(lq.y, $$0 -> bqa.a);
   public static final jv<bqc<?>> M = a(lq.F, $$0 -> bqc.a);
   public static final jv<egu<?>> N = a(lq.D, $$0 -> egu.a);
   public static final jv<dze<?>> O = a(lq.i, $$0 -> dze.k);
   public static final jv<eab<?>> P = a(lq.k, $$0 -> eab.a);
   public static final jv<eba<?>> Q = a(lq.w, $$0 -> eba.I);
   public static final jv<ejk<?>> R = a(lq.aj, $$0 -> ejk.a);
   public static final jv<ejd> S = a(lq.ai, $$0 -> ejd.c);
   public static final jv<eiv<?>> T = a(lq.an, $$0 -> eiv.f);
   public static final jv<ehu<?>> U = a(lq.U, $$0 -> ehu.f);
   public static final jv<efg<?>> V = a(lq.j, $$0 -> efg.a);
   public static final jv<eer<?>> W = a(lq.A, $$0 -> eer.a);
   public static final jv<egj<?>> X = a(lq.ap, $$0 -> egj.a);
   public static final jv<efd<?>> Y = a(lq.ab, $$0 -> efd.a);
   public static final jv<efx<?>> Z = a(lq.ao, $$0 -> efx.b);
   public static final jv<eeg<?>> aa = a(lq.x, $$0 -> eeg.a);
   public static final jv<MapCodec<? extends ddd>> ab = a(lq.e, dde::a);
   public static final jv<MapCodec<? extends dub>> ac = a(lq.n, dud::a);
   public static final jv<MapCodec<? extends dyn.f>> ad = a(lq.N, dyn.f::a);
   public static final jv<MapCodec<? extends dyn.o>> ae = a(lq.O, dyn.o::a);
   public static final jv<MapCodec<? extends dxp>> af = a(lq.t, dxq::a);
   public static final jv<MapCodec<? extends dfb>> ag = a(lq.g, dfc::a);
   public static final jv<eml<?>> ah = a(lq.am, $$0 -> eml.e);
   public static final jv<eju<?>> ai = a(lq.ak, $$0 -> eju.d);
   public static final jv<MapCodec<? extends ejx>> aj = a(lq.al, ejy::a);
   public static final jv<cfl> ak = a(lq.l, cfl::a);
   public static final jv<cfs> al = a(lq.B, cfs::a);
   public static final jv<cuj> am = a(lq.E, cul::a);
   public static final jv<String> an = a(lq.as, dqa::a);
   public static final jv<ctc> ao = a(lq.q, ctd::a);
   public static final jv<ap<?>> ap = a(lq.aN, am::a);
   public static final jv<zg<?>> aq = a(lq.at, zh::a);
   public static final jv<csh> ar = a(lq.au, csi::a);
   public static final jv<kl<?>> as = a(lq.av, km::a);
   public static final jv<MapCodec<? extends bv>> at = a(lq.aw, bw::a);
   public static final jv<cq.a<?>> au = a(lq.ax, cr::a);
   public static final jv<eph> av = a(lq.ay, epi::a);
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
