import com.google.common.collect.Maps;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Lifecycle;
import com.mojang.serialization.MapCodec;
import java.util.Map;
import java.util.function.Supplier;
import org.apache.commons.lang3.Validate;
import org.slf4j.Logger;

public class lq {
   private static final Logger aB = LogUtils.getLogger();
   private static final Map<akk, Supplier<?>> aC = Maps.newLinkedHashMap();
   private static final kf<kf<?>> aD = new jr<>(akj.a(lr.a), Lifecycle.stable());
   public static final je<dxh> a = a(lr.G, "step", dxh::a);
   public static final jw<avg> b = a(lr.ak, $$0 -> avh.nC);
   public static final je<eoi> c = b(lr.D, "empty", $$0 -> eok.a);
   public static final jw<brn> d = a(lr.V, brr::a);
   public static final je<dfi> e = b(lr.f, "air", $$0 -> dfk.a);
   public static final je<bsn<?>> f = b(lr.z, "pig", $$0 -> bsn.az);
   public static final je<cty> g = b(lr.K, "air", $$0 -> cug.a);
   public static final jw<cwc> h = a(lr.ac, cwf::a);
   public static final jw<li<?>> i = a(lr.X, $$0 -> lj.b);
   public static final jw<dps<?>> j = b(lr.h, $$0 -> dps.a);
   public static final jw<akk> k = a(lr.r, $$0 -> avr.E);
   public static final je<dvi> l = a(lr.o, "empty", $$0 -> dvi.c);
   public static final jw<emt<?>> m = a(lr.ag, $$0 -> emt.a);
   public static final jw<enh<?>> n = a(lr.ah, $$0 -> enh.b);
   public static final jw<emm<?>> o = a(lr.ab, $$0 -> emm.a);
   public static final jw<cqq<?>> p = a(lr.U, $$0 -> cqq.i);
   public static final jw<cyp<?>> q = a(lr.ae, $$0 -> cyp.a);
   public static final jw<cyo<?>> r = a(lr.ad, $$0 -> cyo.b);
   public static final jw<buf> s = a(lr.c, buk::a);
   public static final jw<dxm<?>> t = a(lr.aa, $$0 -> dxm.a);
   public static final jw<il<?, ?>> u = a(lr.p, im::a);
   public static final jw<avq<?>> v = a(lr.al, $$0 -> avr.c);
   public static final je<cmd> w = a(lr.av, "plains", $$0 -> cmd.c);
   public static final je<cmb> x = a(lr.au, "none", $$0 -> cmb.b);
   public static final jw<cej> y = a(lr.Z, cek::a);
   public static final je<ccg<?>> z = a(lr.T, "dummy", $$0 -> ccg.a);
   public static final je<cdn<?>> A = a(lr.aj, "dummy", $$0 -> cdn.a);
   public static final jw<coc> B = a(lr.ai, $$0 -> coc.c);
   public static final jw<coa> C = a(lr.b, $$0 -> coa.b);
   public static final jw<ern> D = a(lr.P, $$0 -> erk.b);
   public static final jw<esl<?>> E = a(lr.M, $$0 -> esm.e);
   public static final jw<eui> F = a(lr.L, $$0 -> euj.a);
   public static final jw<evc> G = a(lr.O, $$0 -> eve.b);
   public static final jw<euu> H = a(lr.N, $$0 -> euw.c);
   public static final jw<evl> I = a(lr.Q, $$0 -> evn.c);
   public static final jw<bpl<?>> J = a(lr.C, $$0 -> bpl.a);
   public static final jw<bpn<?>> K = a(lr.J, $$0 -> bpn.a);
   public static final jw<ehf<?>> L = a(lr.H, $$0 -> ehf.a);
   public static final jw<dzo<?>> M = a(lr.i, $$0 -> dzo.k);
   public static final jw<eam<?>> N = a(lr.k, $$0 -> eam.a);
   public static final jw<ebl<?>> O = a(lr.A, $$0 -> ebl.I);
   public static final jw<ejv<?>> P = a(lr.an, $$0 -> ejv.a);
   public static final jw<ejo> Q = a(lr.am, $$0 -> ejo.c);
   public static final jw<ejg<?>> R = a(lr.ar, $$0 -> ejg.f);
   public static final jw<eif<?>> S = a(lr.Y, $$0 -> eif.f);
   public static final jw<efr<?>> T = a(lr.j, $$0 -> efr.a);
   public static final jw<efc<?>> U = a(lr.E, $$0 -> efc.a);
   public static final jw<egu<?>> V = a(lr.at, $$0 -> egu.a);
   public static final jw<efo<?>> W = a(lr.af, $$0 -> efo.a);
   public static final jw<egi<?>> X = a(lr.as, $$0 -> egi.b);
   public static final jw<eer<?>> Y = a(lr.B, $$0 -> eer.a);
   public static final jw<MapCodec<? extends ddk>> Z = a(lr.e, ddl::a);
   public static final jw<MapCodec<? extends dui>> aa = a(lr.n, duk::a);
   public static final jw<MapCodec<? extends dyx.f>> ab = a(lr.R, dyx.f::a);
   public static final jw<MapCodec<? extends dyx.o>> ac = a(lr.S, dyx.o::a);
   public static final jw<MapCodec<? extends dxz>> ad = a(lr.t, dya::a);
   public static final jw<MapCodec<? extends dfi>> ae = a(lr.g, dfj::a);
   public static final jw<emx<?>> af = a(lr.aq, $$0 -> emx.e);
   public static final jw<ekg<?>> ag = a(lr.ao, $$0 -> ekg.d);
   public static final jw<MapCodec<? extends ekj>> ah = a(lr.ap, ekk::a);
   public static final jw<cew> ai = a(lr.l, cew::a);
   public static final jw<cfd> aj = a(lr.F, cfd::a);
   public static final jw<ctv> ak = a(lr.I, ctx::a);
   public static final jw<dqh> al = a(lr.aw, dqi::a);
   public static final jw<cso> am = a(lr.q, csp::a);
   public static final jw<ap<?>> an = a(lr.aU, am::a);
   public static final jw<yl<?>> ao = a(lr.ax, ym::a);
   public static final jw<cru> ap = a(lr.ay, crv::a);
   public static final jw<km<?>> aq = a(lr.az, kn::a);
   public static final jw<MapCodec<? extends bv>> ar = a(lr.aA, bw::a);
   public static final jw<cq.a<?>> as = a(lr.aB, cr::a);
   public static final jw<ept> at = a(lr.aC, epu::a);
   public static final jw<km<?>> au = a(lr.aD, czn::a);
   public static final jw<MapCodec<? extends czt>> av = a(lr.v, czt::a);
   public static final jw<MapCodec<? extends dac>> aw = a(lr.u, dac::a);
   public static final jw<MapCodec<? extends dad>> ax = a(lr.w, dad::b);
   public static final jw<MapCodec<? extends dae>> ay = a(lr.y, dae::a);
   public static final jw<MapCodec<? extends dat>> az = a(lr.x, dau::a);
   public static final jw<? extends jw<?>> aA = aD;

   private static <T> jw<T> a(akj<? extends jw<T>> $$0, lq.a<T> $$1) {
      return a($$0, new jr<>($$0, Lifecycle.stable(), false), $$1);
   }

   private static <T> jw<T> b(akj<? extends jw<T>> $$0, lq.a<T> $$1) {
      return a($$0, new jr<>($$0, Lifecycle.stable(), true), $$1);
   }

   private static <T> je<T> a(akj<? extends jw<T>> $$0, String $$1, lq.a<T> $$2) {
      return a($$0, new jd<>($$1, $$0, Lifecycle.stable(), false), $$2);
   }

   private static <T> je<T> b(akj<? extends jw<T>> $$0, String $$1, lq.a<T> $$2) {
      return a($$0, new jd<>($$1, $$0, Lifecycle.stable(), true), $$2);
   }

   private static <T, R extends kf<T>> R a(akj<? extends jw<T>> $$0, R $$1, lq.a<T> $$2) {
      akm.a(() -> "registry " + $$0);
      akk $$3 = $$0.a();
      aC.put($$3, () -> $$2.run($$1));
      aD.a((akj<kf<?>>)$$0, $$1, jv.a);
      return $$1;
   }

   public static void a() {
      b();
      c();
      a(aA);
   }

   private static void b() {
      aC.forEach(($$0, $$1) -> {
         if ($$1.get() == null) {
            aB.error("Unable to bootstrap registry '{}'", $$0);
         }
      });
   }

   private static void c() {
      aA.m();

      for (jw<?> $$0 : aA) {
         $$0.m();
      }
   }

   private static <T extends jw<?>> void a(jw<T> $$0) {
      $$0.forEach($$1 -> {
         if ($$1.f().isEmpty()) {
            ac.a("Registry '" + $$0.b((T)$$1) + "' was empty after loading");
         }

         if ($$1 instanceof je) {
            akk $$2 = ((je)$$1).b();
            Validate.notNull($$1.a($$2), "Missing default of DefaultedMappedRegistry: " + $$2, new Object[0]);
         }
      });
   }

   @FunctionalInterface
   interface a<T> {
      Object run(jw<T> var1);
   }
}
