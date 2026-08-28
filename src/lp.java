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
   public static final jd<dwu> a = a(lq.C, "step", dwu::a);
   public static final jv<avy> b = a(lq.ag, $$0 -> avz.nC);
   public static final jd<ent> c = b(lq.z, "empty", $$0 -> env.a);
   public static final jv<brz> d = a(lq.R, bsd::a);
   public static final jd<dey> e = b(lq.f, "air", $$0 -> dfa.a);
   public static final jv<czz> f = b(lq.u, $$0 -> dac.x);
   public static final jd<bsz<?>> g = b(lq.v, "pig", $$0 -> bsz.az);
   public static final jd<cuj> h = b(lq.G, "air", $$0 -> cur.a);
   public static final jv<cwn> i = a(lq.Y, cwq::a);
   public static final jv<lh<?>> j = a(lq.T, $$0 -> li.b);
   public static final jv<dpi<?>> k = b(lq.h, $$0 -> dpi.a);
   public static final jd<cjc> l = a(lq.S, "kebab", cjd::a);
   public static final jv<ale> m = a(lq.r, $$0 -> awj.E);
   public static final jd<duw> n = a(lq.o, "empty", $$0 -> duw.c);
   public static final jv<eme<?>> o = a(lq.ac, $$0 -> eme.a);
   public static final jv<ems<?>> p = a(lq.ad, $$0 -> ems.b);
   public static final jv<elx<?>> q = a(lq.X, $$0 -> elx.a);
   public static final jv<cra<?>> r = a(lq.Q, $$0 -> cra.i);
   public static final jv<cyz<?>> s = a(lq.aa, $$0 -> cyz.a);
   public static final jv<cyy<?>> t = a(lq.Z, $$0 -> cyy.b);
   public static final jv<bur> u = a(lq.c, buw::a);
   public static final jv<dwz<?>> v = a(lq.W, $$0 -> dwz.a);
   public static final jv<ik<?, ?>> w = a(lq.p, il::a);
   public static final jv<awi<?>> x = a(lq.ah, $$0 -> awj.c);
   public static final jd<cmo> y = a(lq.ar, "plains", $$0 -> cmo.c);
   public static final jd<cmm> z = a(lq.aq, "none", $$0 -> cmm.b);
   public static final jv<cev> A = a(lq.V, cew::a);
   public static final jd<ccs<?>> B = a(lq.P, "dummy", $$0 -> ccs.a);
   public static final jd<cdz<?>> C = a(lq.af, "dummy", $$0 -> cdz.a);
   public static final jv<coo> D = a(lq.ae, $$0 -> coo.c);
   public static final jv<col> E = a(lq.b, $$0 -> col.b);
   public static final jv<eqy> F = a(lq.L, $$0 -> eqv.b);
   public static final jv<erv<?>> G = a(lq.I, $$0 -> erw.e);
   public static final jv<ets> H = a(lq.H, $$0 -> ett.c);
   public static final jv<eul> I = a(lq.K, $$0 -> eun.b);
   public static final jv<eue> J = a(lq.J, $$0 -> eug.c);
   public static final jv<euu> K = a(lq.M, $$0 -> euw.c);
   public static final jv<bpx<?>> L = a(lq.y, $$0 -> bpx.a);
   public static final jv<bpz<?>> M = a(lq.F, $$0 -> bpz.a);
   public static final jv<egr<?>> N = a(lq.D, $$0 -> egr.a);
   public static final jv<dzb<?>> O = a(lq.i, $$0 -> dzb.k);
   public static final jv<dzy<?>> P = a(lq.k, $$0 -> dzy.a);
   public static final jv<eax<?>> Q = a(lq.w, $$0 -> eax.I);
   public static final jv<ejh<?>> R = a(lq.aj, $$0 -> ejh.a);
   public static final jv<eja> S = a(lq.ai, $$0 -> eja.c);
   public static final jv<eis<?>> T = a(lq.an, $$0 -> eis.f);
   public static final jv<ehr<?>> U = a(lq.U, $$0 -> ehr.f);
   public static final jv<efd<?>> V = a(lq.j, $$0 -> efd.a);
   public static final jv<eeo<?>> W = a(lq.A, $$0 -> eeo.a);
   public static final jv<egg<?>> X = a(lq.ap, $$0 -> egg.a);
   public static final jv<efa<?>> Y = a(lq.ab, $$0 -> efa.a);
   public static final jv<efu<?>> Z = a(lq.ao, $$0 -> efu.b);
   public static final jv<eed<?>> aa = a(lq.x, $$0 -> eed.a);
   public static final jv<MapCodec<? extends dda>> ab = a(lq.e, ddb::a);
   public static final jv<MapCodec<? extends dty>> ac = a(lq.n, dua::a);
   public static final jv<MapCodec<? extends dyk.f>> ad = a(lq.N, dyk.f::a);
   public static final jv<MapCodec<? extends dyk.o>> ae = a(lq.O, dyk.o::a);
   public static final jv<MapCodec<? extends dxm>> af = a(lq.t, dxn::a);
   public static final jv<MapCodec<? extends dey>> ag = a(lq.g, dez::a);
   public static final jv<emi<?>> ah = a(lq.am, $$0 -> emi.e);
   public static final jv<ejr<?>> ai = a(lq.ak, $$0 -> ejr.d);
   public static final jv<MapCodec<? extends eju>> aj = a(lq.al, ejv::a);
   public static final jv<cfi> ak = a(lq.l, cfi::a);
   public static final jv<cfp> al = a(lq.B, cfp::a);
   public static final jv<cug> am = a(lq.E, cui::a);
   public static final jv<String> an = a(lq.as, dpx::a);
   public static final jv<csz> ao = a(lq.q, cta::a);
   public static final jv<ap<?>> ap = a(lq.aN, am::a);
   public static final jv<zf<?>> aq = a(lq.at, zg::a);
   public static final jv<cse> ar = a(lq.au, csf::a);
   public static final jv<kl<?>> as = a(lq.av, km::a);
   public static final jv<MapCodec<? extends bv>> at = a(lq.aw, bw::a);
   public static final jv<cq.a<?>> au = a(lq.ax, cr::a);
   public static final jv<epe> av = a(lq.ay, epf::a);
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
