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
   public static final jm<ebu> a = a(mc.G, "step", ebu::a);
   public static final ke<avz> b = a(mc.al, $$0 -> awa.oa);
   public static final jm<esz> c = b(mc.D, "empty", $$0 -> etb.a);
   public static final ke<btp> d = a(mc.W, btt::a);
   public static final jm<djn> e = b(mc.f, "air", $$0 -> djp.a);
   public static final jm<but<?>> f = b(mc.z, "pig", $$0 -> but.aQ);
   public static final jm<cwm> g = b(mc.K, "air", $$0 -> cwu.a);
   public static final ke<cyn> h = a(mc.ad, cyq::a);
   public static final ke<ls<?>> i = a(mc.Y, $$0 -> lt.b);
   public static final ke<duc<?>> j = b(mc.h, $$0 -> duc.a);
   public static final ke<akv> k = a(mc.r, $$0 -> awk.E);
   public static final jm<dzu> l = a(mc.o, "empty", $$0 -> dzu.c);
   public static final ke<erk<?>> m = a(mc.ah, $$0 -> erk.a);
   public static final ke<ery<?>> n = a(mc.ai, $$0 -> ery.b);
   public static final ke<erd<?>> o = a(mc.ac, $$0 -> erd.a);
   public static final ke<ctm<?>> p = a(mc.V, $$0 -> ctm.i);
   public static final ke<dbq<?>> q = a(mc.af, $$0 -> dbq.a);
   public static final ke<dbp<?>> r = a(mc.ae, $$0 -> dbp.b);
   public static final ke<bwl> s = a(mc.c, bwq::a);
   public static final ke<ebz<?>> t = a(mc.ab, $$0 -> ebz.a);
   public static final ke<it<?, ?>> u = a(mc.p, iu::a);
   public static final ke<awj<?>> v = a(mc.am, $$0 -> awk.c);
   public static final jm<cop> w = a(mc.aw, "plains", $$0 -> cop.c);
   public static final jm<com> x = a(mc.av, "none", $$0 -> com.b);
   public static final ke<cgp> y = a(mc.aa, cgq::a);
   public static final jm<cem<?>> z = a(mc.U, "dummy", $$0 -> cem.a);
   public static final jm<cft<?>> A = a(mc.ak, "dummy", $$0 -> cft.a);
   public static final ke<cqr> B = a(mc.aj, $$0 -> cqr.c);
   public static final ke<cqp> C = a(mc.b, $$0 -> cqp.b);
   public static final ke<ewj> D = a(mc.Q, $$0 -> ewg.b);
   public static final ke<exh<?>> E = a(mc.N, $$0 -> exi.e);
   public static final ke<ezc> F = a(mc.M, $$0 -> ezd.a);
   public static final ke<ezw> G = a(mc.P, $$0 -> ezy.b);
   public static final ke<ezo> H = a(mc.O, $$0 -> ezq.c);
   public static final ke<faf> I = a(mc.R, $$0 -> fah.c);
   public static final ke<brp<?>> J = a(mc.C, $$0 -> brp.a);
   public static final ke<brr<?>> K = a(mc.J, $$0 -> brr.a);
   public static final ke<elv<?>> L = a(mc.H, $$0 -> elv.a);
   public static final ke<eeb<?>> M = a(mc.i, $$0 -> eeb.k);
   public static final ke<eez<?>> N = a(mc.k, $$0 -> eez.a);
   public static final ke<efz<?>> O = a(mc.A, $$0 -> efz.I);
   public static final ke<eol<?>> P = a(mc.ao, $$0 -> eol.a);
   public static final ke<eoe> Q = a(mc.an, $$0 -> eoe.c);
   public static final ke<enw<?>> R = a(mc.as, $$0 -> enw.f);
   public static final ke<emv<?>> S = a(mc.Z, $$0 -> emv.f);
   public static final ke<ekf<?>> T = a(mc.j, $$0 -> ekf.a);
   public static final ke<ejq<?>> U = a(mc.E, $$0 -> ejq.a);
   public static final ke<elk<?>> V = a(mc.au, $$0 -> elk.a);
   public static final ke<ekc<?>> W = a(mc.ag, $$0 -> ekc.a);
   public static final ke<eky<?>> X = a(mc.at, $$0 -> eky.b);
   public static final ke<ejf<?>> Y = a(mc.B, $$0 -> ejf.a);
   public static final ke<MapCodec<? extends dhp>> Z = a(mc.e, dhq::a);
   public static final ke<MapCodec<? extends dyu>> aa = a(mc.n, dyw::a);
   public static final ke<MapCodec<? extends edk.f>> ab = a(mc.S, edk.f::a);
   public static final ke<MapCodec<? extends edk.o>> ac = a(mc.T, edk.o::a);
   public static final ke<MapCodec<? extends ecm>> ad = a(mc.t, ecn::a);
   public static final ke<MapCodec<? extends djn>> ae = a(mc.g, djo::a);
   public static final ke<ero<?>> af = a(mc.ar, $$0 -> ero.e);
   public static final ke<eow<?>> ag = a(mc.ap, $$0 -> eow.d);
   public static final ke<MapCodec<? extends eoz>> ah = a(mc.aq, epa::a);
   public static final ke<chd> ai = a(mc.l, chd::a);
   public static final ke<chk> aj = a(mc.F, chk::a);
   public static final ke<dus> ak = a(mc.ax, dut::a);
   public static final ke<cvf> al = a(mc.q, cvg::a);
   public static final ke<as<?>> am = a(mc.aY, ap::a);
   public static final ke<yg<?>> an = a(mc.ay, yh::a);
   public static final ke<ku<?>> ao = a(mc.az, kv::a);
   public static final ke<MapCodec<? extends by>> ap = a(mc.aA, bz::a);
   public static final ke<cw.a<?>> aq = a(mc.aB, cx::a);
   public static final ke<eup> ar = a(mc.aC, euq::a);
   public static final ke<ku<?>> as = a(mc.aD, ddb::a);
   public static final ke<MapCodec<? extends ddh>> at = a(mc.v, ddh::a);
   public static final ke<MapCodec<? extends ddr>> au = a(mc.u, ddr::a);
   public static final ke<MapCodec<? extends dds>> av = a(mc.w, dds::b);
   public static final ke<MapCodec<? extends ddt>> aw = a(mc.y, ddt::a);
   public static final ke<MapCodec<? extends dei>> ax = a(mc.x, dej::a);
   public static final ke<dac.a<?>> ay = a(mc.aE, $$0 -> dac.a.a);
   public static final ke<dck.a<?>> az = a(mc.aF, dcn::a);
   public static final ke<dcq.i<?>> aA = a(mc.aG, dcs::a);
   public static final ke<dbi> aB = a(mc.aH, dbh::a);
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
