import com.google.common.collect.Maps;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Lifecycle;
import com.mojang.serialization.MapCodec;
import java.util.Map;
import java.util.function.Supplier;
import org.apache.commons.lang3.Validate;
import org.slf4j.Logger;

public class mb {
   private static final Logger aD = LogUtils.getLogger();
   private static final Map<akv, Supplier<?>> aE = Maps.newLinkedHashMap();
   private static final kn<kn<?>> aF = new jz<>(aku.a(mc.a), Lifecycle.stable());
   public static final jm<ebs> a = a(mc.G, "step", ebs::a);
   public static final ke<avz> b = a(mc.al, $$0 -> awa.oa);
   public static final jm<esx> c = b(mc.D, "empty", $$0 -> esz.a);
   public static final ke<btn> d = a(mc.W, btr::a);
   public static final jm<djl> e = b(mc.f, "air", $$0 -> djn.a);
   public static final jm<bur<?>> f = b(mc.z, "pig", $$0 -> bur.aQ);
   public static final jm<cwk> g = b(mc.K, "air", $$0 -> cws.a);
   public static final ke<cyl> h = a(mc.ad, cyo::a);
   public static final ke<ls<?>> i = a(mc.Y, $$0 -> lt.b);
   public static final ke<dua<?>> j = b(mc.h, $$0 -> dua.a);
   public static final ke<akv> k = a(mc.r, $$0 -> awk.E);
   public static final jm<dzs> l = a(mc.o, "empty", $$0 -> dzs.c);
   public static final ke<eri<?>> m = a(mc.ah, $$0 -> eri.a);
   public static final ke<erw<?>> n = a(mc.ai, $$0 -> erw.b);
   public static final ke<erb<?>> o = a(mc.ac, $$0 -> erb.a);
   public static final ke<ctk<?>> p = a(mc.V, $$0 -> ctk.i);
   public static final ke<dbo<?>> q = a(mc.af, $$0 -> dbo.a);
   public static final ke<dbn<?>> r = a(mc.ae, $$0 -> dbn.b);
   public static final ke<bwj> s = a(mc.c, bwo::a);
   public static final ke<ebx<?>> t = a(mc.ab, $$0 -> ebx.a);
   public static final ke<it<?, ?>> u = a(mc.p, iu::a);
   public static final ke<awj<?>> v = a(mc.am, $$0 -> awk.c);
   public static final jm<com> w = a(mc.aw, "plains", $$0 -> com.c);
   public static final jm<cok> x = a(mc.av, "none", $$0 -> cok.b);
   public static final ke<cgn> y = a(mc.aa, cgo::a);
   public static final jm<cek<?>> z = a(mc.U, "dummy", $$0 -> cek.a);
   public static final jm<cfr<?>> A = a(mc.ak, "dummy", $$0 -> cfr.a);
   public static final ke<cqp> B = a(mc.aj, $$0 -> cqp.c);
   public static final ke<cqn> C = a(mc.b, $$0 -> cqn.b);
   public static final ke<ewh> D = a(mc.Q, $$0 -> ewe.b);
   public static final ke<exf<?>> E = a(mc.N, $$0 -> exg.e);
   public static final ke<eza> F = a(mc.M, $$0 -> ezb.a);
   public static final ke<ezu> G = a(mc.P, $$0 -> ezw.b);
   public static final ke<ezm> H = a(mc.O, $$0 -> ezo.c);
   public static final ke<fad> I = a(mc.R, $$0 -> faf.c);
   public static final ke<brn<?>> J = a(mc.C, $$0 -> brn.a);
   public static final ke<brp<?>> K = a(mc.J, $$0 -> brp.a);
   public static final ke<elt<?>> L = a(mc.H, $$0 -> elt.a);
   public static final ke<edz<?>> M = a(mc.i, $$0 -> edz.k);
   public static final ke<eex<?>> N = a(mc.k, $$0 -> eex.a);
   public static final ke<efx<?>> O = a(mc.A, $$0 -> efx.I);
   public static final ke<eoj<?>> P = a(mc.ao, $$0 -> eoj.a);
   public static final ke<eoc> Q = a(mc.an, $$0 -> eoc.c);
   public static final ke<enu<?>> R = a(mc.as, $$0 -> enu.f);
   public static final ke<emt<?>> S = a(mc.Z, $$0 -> emt.f);
   public static final ke<ekd<?>> T = a(mc.j, $$0 -> ekd.a);
   public static final ke<ejo<?>> U = a(mc.E, $$0 -> ejo.a);
   public static final ke<eli<?>> V = a(mc.au, $$0 -> eli.a);
   public static final ke<eka<?>> W = a(mc.ag, $$0 -> eka.a);
   public static final ke<ekw<?>> X = a(mc.at, $$0 -> ekw.b);
   public static final ke<ejd<?>> Y = a(mc.B, $$0 -> ejd.a);
   public static final ke<MapCodec<? extends dhn>> Z = a(mc.e, dho::a);
   public static final ke<MapCodec<? extends dys>> aa = a(mc.n, dyu::a);
   public static final ke<MapCodec<? extends edi.f>> ab = a(mc.S, edi.f::a);
   public static final ke<MapCodec<? extends edi.o>> ac = a(mc.T, edi.o::a);
   public static final ke<MapCodec<? extends eck>> ad = a(mc.t, ecl::a);
   public static final ke<MapCodec<? extends djl>> ae = a(mc.g, djm::a);
   public static final ke<erm<?>> af = a(mc.ar, $$0 -> erm.e);
   public static final ke<eou<?>> ag = a(mc.ap, $$0 -> eou.d);
   public static final ke<MapCodec<? extends eox>> ah = a(mc.aq, eoy::a);
   public static final ke<chb> ai = a(mc.l, chb::a);
   public static final ke<chi> aj = a(mc.F, chi::a);
   public static final ke<duq> ak = a(mc.ax, dur::a);
   public static final ke<cvd> al = a(mc.q, cve::a);
   public static final ke<as<?>> am = a(mc.aY, ap::a);
   public static final ke<yg<?>> an = a(mc.ay, yh::a);
   public static final ke<ku<?>> ao = a(mc.az, kv::a);
   public static final ke<MapCodec<? extends by>> ap = a(mc.aA, bz::a);
   public static final ke<cw.a<?>> aq = a(mc.aB, cx::a);
   public static final ke<eun> ar = a(mc.aC, euo::a);
   public static final ke<ku<?>> as = a(mc.aD, dcz::a);
   public static final ke<MapCodec<? extends ddf>> at = a(mc.v, ddf::a);
   public static final ke<MapCodec<? extends ddp>> au = a(mc.u, ddp::a);
   public static final ke<MapCodec<? extends ddq>> av = a(mc.w, ddq::b);
   public static final ke<MapCodec<? extends ddr>> aw = a(mc.y, ddr::a);
   public static final ke<MapCodec<? extends deg>> ax = a(mc.x, deh::a);
   public static final ke<daa.a<?>> ay = a(mc.aE, $$0 -> daa.a.a);
   public static final ke<dci.a<?>> az = a(mc.aF, dcl::a);
   public static final ke<dco.i<?>> aA = a(mc.aG, dcq::a);
   public static final ke<dbg> aB = a(mc.aH, dbf::a);
   public static final ke<? extends ke<?>> aC = aF;

   private static <T> ke<T> a(aku<? extends ke<T>> $$0, mb.a<T> $$1) {
      return a($$0, new jz<>($$0, Lifecycle.stable(), false), $$1);
   }

   private static <T> ke<T> b(aku<? extends ke<T>> $$0, mb.a<T> $$1) {
      return a($$0, new jz<>($$0, Lifecycle.stable(), true), $$1);
   }

   private static <T> jm<T> a(aku<? extends ke<T>> $$0, String $$1, mb.a<T> $$2) {
      return a($$0, new jl<>($$1, $$0, Lifecycle.stable(), false), $$2);
   }

   private static <T> jm<T> b(aku<? extends ke<T>> $$0, String $$1, mb.a<T> $$2) {
      return a($$0, new jl<>($$1, $$0, Lifecycle.stable(), true), $$2);
   }

   private static <T, R extends kn<T>> R a(aku<? extends ke<T>> $$0, R $$1, mb.a<T> $$2) {
      akx.a(() -> "registry " + $$0.a());
      akv $$3 = $$0.a();
      aE.put($$3, () -> $$2.run($$1));
      aF.a((aku<kn<?>>)$$0, $$1, kd.a);
      return $$1;
   }

   public static void a() {
      b();
      c();
      b(aC);
   }

   private static void b() {
      aE.forEach(($$0, $$1) -> {
         if ($$1.get() == null) {
            aD.error("Unable to bootstrap registry '{}'", $$0);
         }
      });
   }

   private static void c() {
      aC.n();

      for (ke<?> $$0 : aC) {
         c($$0);
         $$0.n();
      }
   }

   private static <T extends ke<?>> void b(ke<T> $$0) {
      $$0.forEach($$1 -> {
         if ($$1.i().isEmpty()) {
            af.b("Registry '" + $$0.b((T)$$1) + "' was empty after loading");
         }

         if ($$1 instanceof jm) {
            akv $$2 = ((jm)$$1).b();
            Validate.notNull($$1.a($$2), "Missing default of DefaultedMappedRegistry: " + $$2, new Object[0]);
         }
      });
   }

   public static <T> js<T> a(ke<T> $$0) {
      return ((kn)$$0).p();
   }

   private static void c(ke<?> $$0) {
      ((jz)$$0).o();
   }

   @FunctionalInterface
   interface a<T> {
      Object run(ke<T> var1);
   }
}
