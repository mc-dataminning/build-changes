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
   private static final Map<aku, Supplier<?>> aE = Maps.newLinkedHashMap();
   private static final kn<kn<?>> aF = new jz<>(akt.a(mc.a), Lifecycle.stable());
   public static final jm<ebt> a = a(mc.G, "step", ebt::a);
   public static final ke<avz> b = a(mc.al, $$0 -> awa.oa);
   public static final jm<esy> c = b(mc.D, "empty", $$0 -> eta.a);
   public static final ke<btn> d = a(mc.W, btr::a);
   public static final jm<djm> e = b(mc.f, "air", $$0 -> djo.a);
   public static final jm<bur<?>> f = b(mc.z, "pig", $$0 -> bur.aR);
   public static final jm<cwl> g = b(mc.K, "air", $$0 -> cwt.a);
   public static final ke<cym> h = a(mc.ad, cyp::a);
   public static final ke<ls<?>> i = a(mc.Y, $$0 -> lt.b);
   public static final ke<dub<?>> j = b(mc.h, $$0 -> dub.a);
   public static final ke<aku> k = a(mc.r, $$0 -> awk.E);
   public static final jm<dzt> l = a(mc.o, "empty", $$0 -> dzt.c);
   public static final ke<erj<?>> m = a(mc.ah, $$0 -> erj.a);
   public static final ke<erx<?>> n = a(mc.ai, $$0 -> erx.b);
   public static final ke<erc<?>> o = a(mc.ac, $$0 -> erc.a);
   public static final ke<ctl<?>> p = a(mc.V, $$0 -> ctl.i);
   public static final ke<dbp<?>> q = a(mc.af, $$0 -> dbp.a);
   public static final ke<dbo<?>> r = a(mc.ae, $$0 -> dbo.b);
   public static final ke<bwj> s = a(mc.c, bwo::a);
   public static final ke<eby<?>> t = a(mc.ab, $$0 -> eby.a);
   public static final ke<it<?, ?>> u = a(mc.p, iu::a);
   public static final ke<awj<?>> v = a(mc.am, $$0 -> awk.c);
   public static final jm<coo> w = a(mc.aw, "plains", $$0 -> coo.c);
   public static final jm<col> x = a(mc.av, "none", $$0 -> col.b);
   public static final ke<cgn> y = a(mc.aa, cgo::a);
   public static final jm<cek<?>> z = a(mc.U, "dummy", $$0 -> cek.a);
   public static final jm<cfr<?>> A = a(mc.ak, "dummy", $$0 -> cfr.a);
   public static final ke<cqq> B = a(mc.aj, $$0 -> cqq.c);
   public static final ke<cqo> C = a(mc.b, $$0 -> cqo.b);
   public static final ke<ewi> D = a(mc.Q, $$0 -> ewf.b);
   public static final ke<exg<?>> E = a(mc.N, $$0 -> exh.e);
   public static final ke<ezb> F = a(mc.M, $$0 -> ezc.a);
   public static final ke<ezv> G = a(mc.P, $$0 -> ezx.b);
   public static final ke<ezn> H = a(mc.O, $$0 -> ezp.c);
   public static final ke<fae> I = a(mc.R, $$0 -> fag.c);
   public static final ke<brn<?>> J = a(mc.C, $$0 -> brn.a);
   public static final ke<brp<?>> K = a(mc.J, $$0 -> brp.a);
   public static final ke<elu<?>> L = a(mc.H, $$0 -> elu.a);
   public static final ke<eea<?>> M = a(mc.i, $$0 -> eea.k);
   public static final ke<eey<?>> N = a(mc.k, $$0 -> eey.a);
   public static final ke<efy<?>> O = a(mc.A, $$0 -> efy.I);
   public static final ke<eok<?>> P = a(mc.ao, $$0 -> eok.a);
   public static final ke<eod> Q = a(mc.an, $$0 -> eod.c);
   public static final ke<env<?>> R = a(mc.as, $$0 -> env.f);
   public static final ke<emu<?>> S = a(mc.Z, $$0 -> emu.f);
   public static final ke<eke<?>> T = a(mc.j, $$0 -> eke.a);
   public static final ke<ejp<?>> U = a(mc.E, $$0 -> ejp.a);
   public static final ke<elj<?>> V = a(mc.au, $$0 -> elj.a);
   public static final ke<ekb<?>> W = a(mc.ag, $$0 -> ekb.a);
   public static final ke<ekx<?>> X = a(mc.at, $$0 -> ekx.b);
   public static final ke<eje<?>> Y = a(mc.B, $$0 -> eje.a);
   public static final ke<MapCodec<? extends dho>> Z = a(mc.e, dhp::a);
   public static final ke<MapCodec<? extends dyt>> aa = a(mc.n, dyv::a);
   public static final ke<MapCodec<? extends edj.f>> ab = a(mc.S, edj.f::a);
   public static final ke<MapCodec<? extends edj.o>> ac = a(mc.T, edj.o::a);
   public static final ke<MapCodec<? extends ecl>> ad = a(mc.t, ecm::a);
   public static final ke<MapCodec<? extends djm>> ae = a(mc.g, djn::a);
   public static final ke<ern<?>> af = a(mc.ar, $$0 -> ern.e);
   public static final ke<eov<?>> ag = a(mc.ap, $$0 -> eov.d);
   public static final ke<MapCodec<? extends eoy>> ah = a(mc.aq, eoz::a);
   public static final ke<chb> ai = a(mc.l, chb::a);
   public static final ke<chi> aj = a(mc.F, chi::a);
   public static final ke<dur> ak = a(mc.ax, dus::a);
   public static final ke<cve> al = a(mc.q, cvf::a);
   public static final ke<as<?>> am = a(mc.aY, ap::a);
   public static final ke<yf<?>> an = a(mc.ay, yg::a);
   public static final ke<ku<?>> ao = a(mc.az, kv::a);
   public static final ke<MapCodec<? extends by>> ap = a(mc.aA, bz::a);
   public static final ke<cw.a<?>> aq = a(mc.aB, cx::a);
   public static final ke<euo> ar = a(mc.aC, eup::a);
   public static final ke<ku<?>> as = a(mc.aD, dda::a);
   public static final ke<MapCodec<? extends ddg>> at = a(mc.v, ddg::a);
   public static final ke<MapCodec<? extends ddq>> au = a(mc.u, ddq::a);
   public static final ke<MapCodec<? extends ddr>> av = a(mc.w, ddr::b);
   public static final ke<MapCodec<? extends dds>> aw = a(mc.y, dds::a);
   public static final ke<MapCodec<? extends deh>> ax = a(mc.x, dei::a);
   public static final ke<dab.a<?>> ay = a(mc.aE, $$0 -> dab.a.a);
   public static final ke<dcj.a<?>> az = a(mc.aF, dcm::a);
   public static final ke<dcp.i<?>> aA = a(mc.aG, dcr::a);
   public static final ke<dbh> aB = a(mc.aH, dbg::a);
   public static final ke<? extends ke<?>> aC = aF;

   private static <T> ke<T> a(akt<? extends ke<T>> $$0, mb.a<T> $$1) {
      return a($$0, new jz<>($$0, Lifecycle.stable(), false), $$1);
   }

   private static <T> ke<T> b(akt<? extends ke<T>> $$0, mb.a<T> $$1) {
      return a($$0, new jz<>($$0, Lifecycle.stable(), true), $$1);
   }

   private static <T> jm<T> a(akt<? extends ke<T>> $$0, String $$1, mb.a<T> $$2) {
      return a($$0, new jl<>($$1, $$0, Lifecycle.stable(), false), $$2);
   }

   private static <T> jm<T> b(akt<? extends ke<T>> $$0, String $$1, mb.a<T> $$2) {
      return a($$0, new jl<>($$1, $$0, Lifecycle.stable(), true), $$2);
   }

   private static <T, R extends kn<T>> R a(akt<? extends ke<T>> $$0, R $$1, mb.a<T> $$2) {
      akw.a(() -> "registry " + $$0.a());
      aku $$3 = $$0.a();
      aE.put($$3, () -> $$2.run($$1));
      aF.a((akt<kn<?>>)$$0, $$1, kd.a);
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
            aku $$2 = ((jm)$$1).b();
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
