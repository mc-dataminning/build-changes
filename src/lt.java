import com.google.common.collect.Maps;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Lifecycle;
import com.mojang.serialization.MapCodec;
import java.util.Map;
import java.util.function.Supplier;
import org.apache.commons.lang3.Validate;
import org.slf4j.Logger;

public class lt {
   private static final Logger aB = LogUtils.getLogger();
   private static final Map<akq, Supplier<?>> aC = Maps.newLinkedHashMap();
   private static final ki<ki<?>> aD = new ju<>(akp.a(lu.a), Lifecycle.stable());
   public static final jh<dxw> a = a(lu.G, "step", dxw::a);
   public static final jz<avn> b = a(lu.al, $$0 -> avo.nC);
   public static final jh<eox> c = b(lu.D, "empty", $$0 -> eoz.a);
   public static final jz<brw> d = a(lu.W, bsa::a);
   public static final jh<dfw> e = b(lu.f, "air", $$0 -> dfy.a);
   public static final jh<bsw<?>> f = b(lu.z, "pig", $$0 -> bsw.az);
   public static final jh<cuj> g = b(lu.K, "air", $$0 -> cur.a);
   public static final jz<cwq> h = a(lu.ad, cwt::a);
   public static final jz<ll<?>> i = a(lu.Y, $$0 -> lm.b);
   public static final jz<dqh<?>> j = b(lu.h, $$0 -> dqh.a);
   public static final jz<akq> k = a(lu.r, $$0 -> avy.E);
   public static final jh<dvx> l = a(lu.o, "empty", $$0 -> dvx.c);
   public static final jz<eni<?>> m = a(lu.ah, $$0 -> eni.a);
   public static final jz<enw<?>> n = a(lu.ai, $$0 -> enw.b);
   public static final jz<enb<?>> o = a(lu.ac, $$0 -> enb.a);
   public static final jz<cra<?>> p = a(lu.V, $$0 -> cra.i);
   public static final jz<czd<?>> q = a(lu.af, $$0 -> czd.a);
   public static final jz<czc<?>> r = a(lu.ae, $$0 -> czc.b);
   public static final jz<bup> s = a(lu.c, buu::a);
   public static final jz<dyb<?>> t = a(lu.ab, $$0 -> dyb.a);
   public static final jz<io<?, ?>> u = a(lu.p, ip::a);
   public static final jz<avx<?>> v = a(lu.am, $$0 -> avy.c);
   public static final jh<cmn> w = a(lu.aw, "plains", $$0 -> cmn.c);
   public static final jh<cml> x = a(lu.av, "none", $$0 -> cml.b);
   public static final jz<cet> y = a(lu.aa, ceu::a);
   public static final jh<ccq<?>> z = a(lu.U, "dummy", $$0 -> ccq.a);
   public static final jh<cdx<?>> A = a(lu.ak, "dummy", $$0 -> cdx.a);
   public static final jz<com> B = a(lu.aj, $$0 -> com.c);
   public static final jz<cok> C = a(lu.b, $$0 -> cok.b);
   public static final jz<esc> D = a(lu.Q, $$0 -> erz.b);
   public static final jz<eta<?>> E = a(lu.N, $$0 -> etb.e);
   public static final jz<eux> F = a(lu.M, $$0 -> euy.a);
   public static final jz<evr> G = a(lu.P, $$0 -> evt.b);
   public static final jz<evj> H = a(lu.O, $$0 -> evl.c);
   public static final jz<ewa> I = a(lu.R, $$0 -> ewc.c);
   public static final jz<bpu<?>> J = a(lu.C, $$0 -> bpu.a);
   public static final jz<bpw<?>> K = a(lu.J, $$0 -> bpw.a);
   public static final jz<ehu<?>> L = a(lu.H, $$0 -> ehu.a);
   public static final jz<ead<?>> M = a(lu.i, $$0 -> ead.k);
   public static final jz<ebb<?>> N = a(lu.k, $$0 -> ebb.a);
   public static final jz<eca<?>> O = a(lu.A, $$0 -> eca.I);
   public static final jz<ekk<?>> P = a(lu.ao, $$0 -> ekk.a);
   public static final jz<ekd> Q = a(lu.an, $$0 -> ekd.c);
   public static final jz<ejv<?>> R = a(lu.as, $$0 -> ejv.f);
   public static final jz<eiu<?>> S = a(lu.Z, $$0 -> eiu.f);
   public static final jz<egg<?>> T = a(lu.j, $$0 -> egg.a);
   public static final jz<efr<?>> U = a(lu.E, $$0 -> efr.a);
   public static final jz<ehj<?>> V = a(lu.au, $$0 -> ehj.a);
   public static final jz<egd<?>> W = a(lu.ag, $$0 -> egd.a);
   public static final jz<egx<?>> X = a(lu.at, $$0 -> egx.b);
   public static final jz<efg<?>> Y = a(lu.B, $$0 -> efg.a);
   public static final jz<MapCodec<? extends ddy>> Z = a(lu.e, ddz::a);
   public static final jz<MapCodec<? extends dux>> aa = a(lu.n, duz::a);
   public static final jz<MapCodec<? extends dzm.f>> ab = a(lu.S, dzm.f::a);
   public static final jz<MapCodec<? extends dzm.o>> ac = a(lu.T, dzm.o::a);
   public static final jz<MapCodec<? extends dyo>> ad = a(lu.t, dyp::a);
   public static final jz<MapCodec<? extends dfw>> ae = a(lu.g, dfx::a);
   public static final jz<enm<?>> af = a(lu.ar, $$0 -> enm.e);
   public static final jz<ekv<?>> ag = a(lu.ap, $$0 -> ekv.d);
   public static final jz<MapCodec<? extends eky>> ah = a(lu.aq, ekz::a);
   public static final jz<cfg> ai = a(lu.l, cfg::a);
   public static final jz<cfn> aj = a(lu.F, cfn::a);
   public static final jz<cug> ak = a(lu.I, cui::a);
   public static final jz<dqw> al = a(lu.ax, dqx::a);
   public static final jz<csy> am = a(lu.q, csz::a);
   public static final jz<aq<?>> an = a(lu.aV, an::a);
   public static final jz<yp<?>> ao = a(lu.ay, yq::a);
   public static final jz<cse> ap = a(lu.az, csf::a);
   public static final jz<kp<?>> aq = a(lu.aA, kq::a);
   public static final jz<MapCodec<? extends bw>> ar = a(lu.aB, bx::a);
   public static final jz<ct.a<?>> as = a(lu.aC, cu::a);
   public static final jz<eqi> at = a(lu.aD, eqj::a);
   public static final jz<kp<?>> au = a(lu.aE, dab::a);
   public static final jz<MapCodec<? extends dah>> av = a(lu.v, dah::a);
   public static final jz<MapCodec<? extends daq>> aw = a(lu.u, daq::a);
   public static final jz<MapCodec<? extends dar>> ax = a(lu.w, dar::b);
   public static final jz<MapCodec<? extends das>> ay = a(lu.y, das::a);
   public static final jz<MapCodec<? extends dbh>> az = a(lu.x, dbi::a);
   public static final jz<? extends jz<?>> aA = aD;

   private static <T> jz<T> a(akp<? extends jz<T>> $$0, lt.a<T> $$1) {
      return a($$0, new ju<>($$0, Lifecycle.stable(), false), $$1);
   }

   private static <T> jz<T> b(akp<? extends jz<T>> $$0, lt.a<T> $$1) {
      return a($$0, new ju<>($$0, Lifecycle.stable(), true), $$1);
   }

   private static <T> jh<T> a(akp<? extends jz<T>> $$0, String $$1, lt.a<T> $$2) {
      return a($$0, new jg<>($$1, $$0, Lifecycle.stable(), false), $$2);
   }

   private static <T> jh<T> b(akp<? extends jz<T>> $$0, String $$1, lt.a<T> $$2) {
      return a($$0, new jg<>($$1, $$0, Lifecycle.stable(), true), $$2);
   }

   private static <T, R extends ki<T>> R a(akp<? extends jz<T>> $$0, R $$1, lt.a<T> $$2) {
      aks.a(() -> "registry " + $$0);
      akq $$3 = $$0.a();
      aC.put($$3, () -> $$2.run($$1));
      aD.a((akp<ki<?>>)$$0, $$1, jy.a);
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

      for (jz<?> $$0 : aA) {
         $$0.m();
      }
   }

   private static <T extends jz<?>> void a(jz<T> $$0) {
      $$0.forEach($$1 -> {
         if ($$1.f().isEmpty()) {
            ad.a("Registry '" + $$0.b((T)$$1) + "' was empty after loading");
         }

         if ($$1 instanceof jh) {
            akq $$2 = ((jh)$$1).b();
            Validate.notNull($$1.a($$2), "Missing default of DefaultedMappedRegistry: " + $$2, new Object[0]);
         }
      });
   }

   @FunctionalInterface
   interface a<T> {
      Object run(jz<T> var1);
   }
}
