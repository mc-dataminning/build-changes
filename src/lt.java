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
   private static final Map<akr, Supplier<?>> aC = Maps.newLinkedHashMap();
   private static final ki<ki<?>> aD = new ju<>(akq.a(lu.a), Lifecycle.stable());
   public static final jh<dxz> a = a(lu.G, "step", dxz::a);
   public static final jz<avo> b = a(lu.al, $$0 -> avp.nC);
   public static final jh<epb> c = b(lu.D, "empty", $$0 -> epd.a);
   public static final jz<brx> d = a(lu.W, bsb::a);
   public static final jh<dfy> e = b(lu.f, "air", $$0 -> dga.a);
   public static final jh<bsx<?>> f = b(lu.z, "pig", $$0 -> bsx.az);
   public static final jh<cul> g = b(lu.K, "air", $$0 -> cut.a);
   public static final jz<cws> h = a(lu.ad, cwv::a);
   public static final jz<ll<?>> i = a(lu.Y, $$0 -> lm.b);
   public static final jz<dqj<?>> j = b(lu.h, $$0 -> dqj.a);
   public static final jz<akr> k = a(lu.r, $$0 -> avz.E);
   public static final jh<dvz> l = a(lu.o, "empty", $$0 -> dvz.c);
   public static final jz<enm<?>> m = a(lu.ah, $$0 -> enm.a);
   public static final jz<eoa<?>> n = a(lu.ai, $$0 -> eoa.b);
   public static final jz<enf<?>> o = a(lu.ac, $$0 -> enf.a);
   public static final jz<crc<?>> p = a(lu.V, $$0 -> crc.i);
   public static final jz<czf<?>> q = a(lu.af, $$0 -> czf.a);
   public static final jz<cze<?>> r = a(lu.ae, $$0 -> cze.b);
   public static final jz<bur> s = a(lu.c, buw::a);
   public static final jz<dye<?>> t = a(lu.ab, $$0 -> dye.a);
   public static final jz<io<?, ?>> u = a(lu.p, ip::a);
   public static final jz<avy<?>> v = a(lu.am, $$0 -> avz.c);
   public static final jh<cmp> w = a(lu.aw, "plains", $$0 -> cmp.c);
   public static final jh<cmn> x = a(lu.av, "none", $$0 -> cmn.b);
   public static final jz<cev> y = a(lu.aa, cew::a);
   public static final jh<ccs<?>> z = a(lu.U, "dummy", $$0 -> ccs.a);
   public static final jh<cdz<?>> A = a(lu.ak, "dummy", $$0 -> cdz.a);
   public static final jz<cop> B = a(lu.aj, $$0 -> cop.c);
   public static final jz<com> C = a(lu.b, $$0 -> com.b);
   public static final jz<esg> D = a(lu.Q, $$0 -> esd.b);
   public static final jz<ete<?>> E = a(lu.N, $$0 -> etf.e);
   public static final jz<evb> F = a(lu.M, $$0 -> evc.a);
   public static final jz<evv> G = a(lu.P, $$0 -> evx.b);
   public static final jz<evn> H = a(lu.O, $$0 -> evp.c);
   public static final jz<ewe> I = a(lu.R, $$0 -> ewg.c);
   public static final jz<bpv<?>> J = a(lu.C, $$0 -> bpv.a);
   public static final jz<bpx<?>> K = a(lu.J, $$0 -> bpx.a);
   public static final jz<ehx<?>> L = a(lu.H, $$0 -> ehx.a);
   public static final jz<eag<?>> M = a(lu.i, $$0 -> eag.k);
   public static final jz<ebe<?>> N = a(lu.k, $$0 -> ebe.a);
   public static final jz<ecd<?>> O = a(lu.A, $$0 -> ecd.I);
   public static final jz<ekn<?>> P = a(lu.ao, $$0 -> ekn.a);
   public static final jz<ekg> Q = a(lu.an, $$0 -> ekg.c);
   public static final jz<ejy<?>> R = a(lu.as, $$0 -> ejy.f);
   public static final jz<eix<?>> S = a(lu.Z, $$0 -> eix.f);
   public static final jz<egj<?>> T = a(lu.j, $$0 -> egj.a);
   public static final jz<efu<?>> U = a(lu.E, $$0 -> efu.a);
   public static final jz<ehm<?>> V = a(lu.au, $$0 -> ehm.a);
   public static final jz<egg<?>> W = a(lu.ag, $$0 -> egg.a);
   public static final jz<eha<?>> X = a(lu.at, $$0 -> eha.b);
   public static final jz<efj<?>> Y = a(lu.B, $$0 -> efj.a);
   public static final jz<MapCodec<? extends dea>> Z = a(lu.e, deb::a);
   public static final jz<MapCodec<? extends duz>> aa = a(lu.n, dvb::a);
   public static final jz<MapCodec<? extends dzp.f>> ab = a(lu.S, dzp.f::a);
   public static final jz<MapCodec<? extends dzp.o>> ac = a(lu.T, dzp.o::a);
   public static final jz<MapCodec<? extends dyr>> ad = a(lu.t, dys::a);
   public static final jz<MapCodec<? extends dfy>> ae = a(lu.g, dfz::a);
   public static final jz<enq<?>> af = a(lu.ar, $$0 -> enq.e);
   public static final jz<eky<?>> ag = a(lu.ap, $$0 -> eky.d);
   public static final jz<MapCodec<? extends elb>> ah = a(lu.aq, elc::a);
   public static final jz<cfi> ai = a(lu.l, cfi::a);
   public static final jz<cfp> aj = a(lu.F, cfp::a);
   public static final jz<cui> ak = a(lu.I, cuk::a);
   public static final jz<dqy> al = a(lu.ax, dqz::a);
   public static final jz<cta> am = a(lu.q, ctb::a);
   public static final jz<aq<?>> an = a(lu.aV, an::a);
   public static final jz<yq<?>> ao = a(lu.ay, yr::a);
   public static final jz<csg> ap = a(lu.az, csh::a);
   public static final jz<kp<?>> aq = a(lu.aA, kq::a);
   public static final jz<MapCodec<? extends bw>> ar = a(lu.aB, bx::a);
   public static final jz<ct.a<?>> as = a(lu.aC, cu::a);
   public static final jz<eqm> at = a(lu.aD, eqn::a);
   public static final jz<kp<?>> au = a(lu.aE, dad::a);
   public static final jz<MapCodec<? extends daj>> av = a(lu.v, daj::a);
   public static final jz<MapCodec<? extends das>> aw = a(lu.u, das::a);
   public static final jz<MapCodec<? extends dat>> ax = a(lu.w, dat::b);
   public static final jz<MapCodec<? extends dau>> ay = a(lu.y, dau::a);
   public static final jz<MapCodec<? extends dbj>> az = a(lu.x, dbk::a);
   public static final jz<? extends jz<?>> aA = aD;

   private static <T> jz<T> a(akq<? extends jz<T>> $$0, lt.a<T> $$1) {
      return a($$0, new ju<>($$0, Lifecycle.stable(), false), $$1);
   }

   private static <T> jz<T> b(akq<? extends jz<T>> $$0, lt.a<T> $$1) {
      return a($$0, new ju<>($$0, Lifecycle.stable(), true), $$1);
   }

   private static <T> jh<T> a(akq<? extends jz<T>> $$0, String $$1, lt.a<T> $$2) {
      return a($$0, new jg<>($$1, $$0, Lifecycle.stable(), false), $$2);
   }

   private static <T> jh<T> b(akq<? extends jz<T>> $$0, String $$1, lt.a<T> $$2) {
      return a($$0, new jg<>($$1, $$0, Lifecycle.stable(), true), $$2);
   }

   private static <T, R extends ki<T>> R a(akq<? extends jz<T>> $$0, R $$1, lt.a<T> $$2) {
      akt.a(() -> "registry " + $$0);
      akr $$3 = $$0.a();
      aC.put($$3, () -> $$2.run($$1));
      aD.a((akq<ki<?>>)$$0, $$1, jy.a);
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
            ad.b("Registry '" + $$0.b((T)$$1) + "' was empty after loading");
         }

         if ($$1 instanceof jh) {
            akr $$2 = ((jh)$$1).b();
            Validate.notNull($$1.a($$2), "Missing default of DefaultedMappedRegistry: " + $$2, new Object[0]);
         }
      });
   }

   @FunctionalInterface
   interface a<T> {
      Object run(jz<T> var1);
   }
}
