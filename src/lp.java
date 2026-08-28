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
   private static final Map<ale, Supplier<?>> ay = Maps.newLinkedHashMap();
   private static final ke<ke<?>> az = new jq<>(ald.a(lq.a), Lifecycle.stable());
   public static final jd<dwt> a = a(lq.C, "step", dwt::a);
   public static final jv<avy> b = a(lq.ag, $$0 -> avz.nC);
   public static final jd<ens> c = b(lq.z, "empty", $$0 -> enu.a);
   public static final jv<bry> d = a(lq.R, bsc::a);
   public static final jd<dex> e = b(lq.f, "air", $$0 -> dez.a);
   public static final jv<czy> f = b(lq.u, $$0 -> dab.x);
   public static final jd<bsy<?>> g = b(lq.v, "pig", $$0 -> bsy.az);
   public static final jd<cui> h = b(lq.G, "air", $$0 -> cuq.a);
   public static final jv<cwm> i = a(lq.Y, cwp::a);
   public static final jv<lh<?>> j = a(lq.T, $$0 -> li.b);
   public static final jv<dph<?>> k = b(lq.h, $$0 -> dph.a);
   public static final jd<cjb> l = a(lq.S, "kebab", cjc::a);
   public static final jv<ale> m = a(lq.r, $$0 -> awj.E);
   public static final jd<duv> n = a(lq.o, "empty", $$0 -> duv.c);
   public static final jv<emd<?>> o = a(lq.ac, $$0 -> emd.a);
   public static final jv<emr<?>> p = a(lq.ad, $$0 -> emr.b);
   public static final jv<elw<?>> q = a(lq.X, $$0 -> elw.a);
   public static final jv<cqz<?>> r = a(lq.Q, $$0 -> cqz.i);
   public static final jv<cyy<?>> s = a(lq.aa, $$0 -> cyy.a);
   public static final jv<cyx<?>> t = a(lq.Z, $$0 -> cyx.b);
   public static final jv<buq> u = a(lq.c, buv::a);
   public static final jv<dwy<?>> v = a(lq.W, $$0 -> dwy.a);
   public static final jv<ik<?, ?>> w = a(lq.p, il::a);
   public static final jv<awi<?>> x = a(lq.ah, $$0 -> awj.c);
   public static final jd<cmn> y = a(lq.ar, "plains", $$0 -> cmn.c);
   public static final jd<cml> z = a(lq.aq, "none", $$0 -> cml.b);
   public static final jv<ceu> A = a(lq.V, cev::a);
   public static final jd<ccr<?>> B = a(lq.P, "dummy", $$0 -> ccr.a);
   public static final jd<cdy<?>> C = a(lq.af, "dummy", $$0 -> cdy.a);
   public static final jv<com> D = a(lq.ae, $$0 -> com.c);
   public static final jv<cok> E = a(lq.b, $$0 -> cok.b);
   public static final jv<eqx> F = a(lq.L, $$0 -> equ.b);
   public static final jv<eru<?>> G = a(lq.I, $$0 -> erv.e);
   public static final jv<etr> H = a(lq.H, $$0 -> ets.c);
   public static final jv<euk> I = a(lq.K, $$0 -> eum.b);
   public static final jv<eud> J = a(lq.J, $$0 -> euf.c);
   public static final jv<eut> K = a(lq.M, $$0 -> euv.c);
   public static final jv<bpw<?>> L = a(lq.y, $$0 -> bpw.a);
   public static final jv<bpy<?>> M = a(lq.F, $$0 -> bpy.a);
   public static final jv<egq<?>> N = a(lq.D, $$0 -> egq.a);
   public static final jv<dza<?>> O = a(lq.i, $$0 -> dza.k);
   public static final jv<dzx<?>> P = a(lq.k, $$0 -> dzx.a);
   public static final jv<eaw<?>> Q = a(lq.w, $$0 -> eaw.I);
   public static final jv<ejg<?>> R = a(lq.aj, $$0 -> ejg.a);
   public static final jv<eiz> S = a(lq.ai, $$0 -> eiz.c);
   public static final jv<eir<?>> T = a(lq.an, $$0 -> eir.f);
   public static final jv<ehq<?>> U = a(lq.U, $$0 -> ehq.f);
   public static final jv<efc<?>> V = a(lq.j, $$0 -> efc.a);
   public static final jv<een<?>> W = a(lq.A, $$0 -> een.a);
   public static final jv<egf<?>> X = a(lq.ap, $$0 -> egf.a);
   public static final jv<eez<?>> Y = a(lq.ab, $$0 -> eez.a);
   public static final jv<eft<?>> Z = a(lq.ao, $$0 -> eft.b);
   public static final jv<eec<?>> aa = a(lq.x, $$0 -> eec.a);
   public static final jv<MapCodec<? extends dcz>> ab = a(lq.e, dda::a);
   public static final jv<MapCodec<? extends dtx>> ac = a(lq.n, dtz::a);
   public static final jv<MapCodec<? extends dyj.f>> ad = a(lq.N, dyj.f::a);
   public static final jv<MapCodec<? extends dyj.o>> ae = a(lq.O, dyj.o::a);
   public static final jv<MapCodec<? extends dxl>> af = a(lq.t, dxm::a);
   public static final jv<MapCodec<? extends dex>> ag = a(lq.g, dey::a);
   public static final jv<emh<?>> ah = a(lq.am, $$0 -> emh.e);
   public static final jv<ejq<?>> ai = a(lq.ak, $$0 -> ejq.d);
   public static final jv<MapCodec<? extends ejt>> aj = a(lq.al, eju::a);
   public static final jv<cfh> ak = a(lq.l, cfh::a);
   public static final jv<cfo> al = a(lq.B, cfo::a);
   public static final jv<cuf> am = a(lq.E, cuh::a);
   public static final jv<String> an = a(lq.as, dpw::a);
   public static final jv<csy> ao = a(lq.q, csz::a);
   public static final jv<ap<?>> ap = a(lq.aN, am::a);
   public static final jv<zf<?>> aq = a(lq.at, zg::a);
   public static final jv<csd> ar = a(lq.au, cse::a);
   public static final jv<kl<?>> as = a(lq.av, km::a);
   public static final jv<MapCodec<? extends bv>> at = a(lq.aw, bw::a);
   public static final jv<cq.a<?>> au = a(lq.ax, cr::a);
   public static final jv<epd> av = a(lq.ay, epe::a);
   public static final jv<? extends jv<?>> aw = az;

   private static <T> jv<T> a(ald<? extends jv<T>> $$0, lp.a<T> $$1) {
      return a($$0, new jq<>($$0, Lifecycle.stable(), false), $$1);
   }

   private static <T> jv<T> b(ald<? extends jv<T>> $$0, lp.a<T> $$1) {
      return a($$0, new jq<>($$0, Lifecycle.stable(), true), $$1);
   }

   private static <T> jd<T> a(ald<? extends jv<T>> $$0, String $$1, lp.a<T> $$2) {
      return a($$0, new jc<>($$1, $$0, Lifecycle.stable(), false), $$2);
   }

   private static <T> jd<T> b(ald<? extends jv<T>> $$0, String $$1, lp.a<T> $$2) {
      return a($$0, new jc<>($$1, $$0, Lifecycle.stable(), true), $$2);
   }

   private static <T, R extends ke<T>> R a(ald<? extends jv<T>> $$0, R $$1, lp.a<T> $$2) {
      alg.a(() -> "registry " + $$0);
      ale $$3 = $$0.a();
      ay.put($$3, () -> $$2.run($$1));
      az.a((ald<ke<?>>)$$0, $$1, ju.a);
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
            ale $$2 = ((jd)$$1).a();
            Validate.notNull($$1.a($$2), "Missing default of DefaultedMappedRegistry: " + $$2, new Object[0]);
         }
      });
   }

   @FunctionalInterface
   interface a<T> {
      Object run(jv<T> var1);
   }
}
