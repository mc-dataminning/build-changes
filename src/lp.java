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
   private static final Map<alb, Supplier<?>> ay = Maps.newLinkedHashMap();
   private static final ke<ke<?>> az = new jq<>(ala.a(lq.a), Lifecycle.stable());
   public static final jd<dwq> a = a(lq.C, "step", dwq::a);
   public static final jv<avv> b = a(lq.ag, $$0 -> avw.nC);
   public static final jd<enp> c = b(lq.z, "empty", $$0 -> enr.a);
   public static final jv<brv> d = a(lq.R, brz::a);
   public static final jd<deu> e = b(lq.f, "air", $$0 -> dew.a);
   public static final jv<czv> f = b(lq.u, $$0 -> czy.x);
   public static final jd<bsv<?>> g = b(lq.v, "pig", $$0 -> bsv.az);
   public static final jd<cuf> h = b(lq.G, "air", $$0 -> cun.a);
   public static final jv<cwj> i = a(lq.Y, cwm::a);
   public static final jv<li<?>> j = a(lq.T, $$0 -> lj.b);
   public static final jv<dpe<?>> k = b(lq.h, $$0 -> dpe.a);
   public static final jd<ciy> l = a(lq.S, "kebab", ciz::a);
   public static final jv<alb> m = a(lq.r, $$0 -> awg.E);
   public static final jd<dus> n = a(lq.o, "empty", $$0 -> dus.c);
   public static final jv<ema<?>> o = a(lq.ac, $$0 -> ema.a);
   public static final jv<emo<?>> p = a(lq.ad, $$0 -> emo.b);
   public static final jv<elt<?>> q = a(lq.X, $$0 -> elt.a);
   public static final jv<cqw<?>> r = a(lq.Q, $$0 -> cqw.i);
   public static final jv<cyv<?>> s = a(lq.aa, $$0 -> cyv.a);
   public static final jv<cyu<?>> t = a(lq.Z, $$0 -> cyu.b);
   public static final jv<bun> u = a(lq.c, bus::a);
   public static final jv<dwv<?>> v = a(lq.W, $$0 -> dwv.a);
   public static final jv<ik<?, ?>> w = a(lq.p, il::a);
   public static final jv<awf<?>> x = a(lq.ah, $$0 -> awg.c);
   public static final jd<cmk> y = a(lq.ar, "plains", $$0 -> cmk.c);
   public static final jd<cmi> z = a(lq.aq, "none", $$0 -> cmi.b);
   public static final jv<cer> A = a(lq.V, ces::a);
   public static final jd<cco<?>> B = a(lq.P, "dummy", $$0 -> cco.a);
   public static final jd<cdv<?>> C = a(lq.af, "dummy", $$0 -> cdv.a);
   public static final jv<coj> D = a(lq.ae, $$0 -> coj.c);
   public static final jv<coh> E = a(lq.b, $$0 -> coh.b);
   public static final jv<equ> F = a(lq.L, $$0 -> eqr.b);
   public static final jv<err<?>> G = a(lq.I, $$0 -> ers.e);
   public static final jv<eto> H = a(lq.H, $$0 -> etp.c);
   public static final jv<euh> I = a(lq.K, $$0 -> euj.b);
   public static final jv<eua> J = a(lq.J, $$0 -> euc.c);
   public static final jv<euq> K = a(lq.M, $$0 -> eus.c);
   public static final jv<bpt<?>> L = a(lq.y, $$0 -> bpt.a);
   public static final jv<bpv<?>> M = a(lq.F, $$0 -> bpv.a);
   public static final jv<egn<?>> N = a(lq.D, $$0 -> egn.a);
   public static final jv<dyx<?>> O = a(lq.i, $$0 -> dyx.k);
   public static final jv<dzu<?>> P = a(lq.k, $$0 -> dzu.a);
   public static final jv<eat<?>> Q = a(lq.w, $$0 -> eat.I);
   public static final jv<ejd<?>> R = a(lq.aj, $$0 -> ejd.a);
   public static final jv<eiw> S = a(lq.ai, $$0 -> eiw.c);
   public static final jv<eio<?>> T = a(lq.an, $$0 -> eio.f);
   public static final jv<ehn<?>> U = a(lq.U, $$0 -> ehn.f);
   public static final jv<eez<?>> V = a(lq.j, $$0 -> eez.a);
   public static final jv<eek<?>> W = a(lq.A, $$0 -> eek.a);
   public static final jv<egc<?>> X = a(lq.ap, $$0 -> egc.a);
   public static final jv<eew<?>> Y = a(lq.ab, $$0 -> eew.a);
   public static final jv<efq<?>> Z = a(lq.ao, $$0 -> efq.b);
   public static final jv<edz<?>> aa = a(lq.x, $$0 -> edz.a);
   public static final jv<MapCodec<? extends dcw>> ab = a(lq.e, dcx::a);
   public static final jv<MapCodec<? extends dtu>> ac = a(lq.n, dtw::a);
   public static final jv<MapCodec<? extends dyg.f>> ad = a(lq.N, dyg.f::a);
   public static final jv<MapCodec<? extends dyg.o>> ae = a(lq.O, dyg.o::a);
   public static final jv<MapCodec<? extends dxi>> af = a(lq.t, dxj::a);
   public static final jv<MapCodec<? extends deu>> ag = a(lq.g, dev::a);
   public static final jv<eme<?>> ah = a(lq.am, $$0 -> eme.e);
   public static final jv<ejn<?>> ai = a(lq.ak, $$0 -> ejn.d);
   public static final jv<MapCodec<? extends ejq>> aj = a(lq.al, ejr::a);
   public static final jv<cfe> ak = a(lq.l, cfe::a);
   public static final jv<cfl> al = a(lq.B, cfl::a);
   public static final jv<cuc> am = a(lq.E, cue::a);
   public static final jv<String> an = a(lq.as, dpt::a);
   public static final jv<csv> ao = a(lq.q, csw::a);
   public static final jv<ap<?>> ap = a(lq.aN, am::a);
   public static final jv<zc<?>> aq = a(lq.at, zd::a);
   public static final jv<csa> ar = a(lq.au, csb::a);
   public static final jv<kl<?>> as = a(lq.av, km::a);
   public static final jv<MapCodec<? extends bv>> at = a(lq.aw, bw::a);
   public static final jv<cq.a<?>> au = a(lq.ax, cr::a);
   public static final jv<epa> av = a(lq.ay, epb::a);
   public static final jv<? extends jv<?>> aw = az;

   private static <T> jv<T> a(ala<? extends jv<T>> $$0, lp.a<T> $$1) {
      return a($$0, new jq<>($$0, Lifecycle.stable(), false), $$1);
   }

   private static <T> jv<T> b(ala<? extends jv<T>> $$0, lp.a<T> $$1) {
      return a($$0, new jq<>($$0, Lifecycle.stable(), true), $$1);
   }

   private static <T> jd<T> a(ala<? extends jv<T>> $$0, String $$1, lp.a<T> $$2) {
      return a($$0, new jc<>($$1, $$0, Lifecycle.stable(), false), $$2);
   }

   private static <T> jd<T> b(ala<? extends jv<T>> $$0, String $$1, lp.a<T> $$2) {
      return a($$0, new jc<>($$1, $$0, Lifecycle.stable(), true), $$2);
   }

   private static <T, R extends ke<T>> R a(ala<? extends jv<T>> $$0, R $$1, lp.a<T> $$2) {
      ald.a(() -> "registry " + $$0);
      alb $$3 = $$0.a();
      ay.put($$3, () -> $$2.run($$1));
      az.a((ala<ke<?>>)$$0, $$1, ju.a);
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
            alb $$2 = ((jd)$$1).a();
            Validate.notNull($$1.a($$2), "Missing default of DefaultedMappedRegistry: " + $$2, new Object[0]);
         }
      });
   }

   @FunctionalInterface
   interface a<T> {
      Object run(jv<T> var1);
   }
}
