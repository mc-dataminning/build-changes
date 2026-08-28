import com.google.common.collect.Maps;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Lifecycle;
import com.mojang.serialization.MapCodec;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Supplier;
import org.apache.commons.lang3.Validate;
import org.slf4j.Logger;

public class mf {
   private static final Logger aG = LogUtils.getLogger();
   private static final Map<alg, Supplier<?>> aH = Maps.newLinkedHashMap();
   private static final ka<ka<?>> aI = new jm<>(alf.a(mg.a), Lifecycle.stable());
   public static final iz<eez> a = a(mg.H, "step", eez::a);
   public static final jr<awm> b = a(mg.ap, $$0 -> awn.og);
   public static final iz<ewf> c = b(mg.F, "empty", $$0 -> ewh.a);
   public static final jr<bvf> d = a(mg.W, bvj::a);
   public static final iz<dma> e = b(mg.i, "air", $$0 -> dmc.a);
   public static final iz<bwm<?>> f = b(mg.B, "pig", $$0 -> bwm.aQ);
   public static final iz<cyu> g = b(mg.K, "air", $$0 -> czc.a);
   public static final jr<das> h = a(mg.ae, dav::a);
   public static final jr<lw<?>> i = a(mg.Y, $$0 -> lx.b);
   public static final jr<dwz<?>> j = b(mg.e, $$0 -> dwz.a);
   public static final jr<alg> k = a(mg.p, $$0 -> awx.E);
   public static final iz<ecx> l = a(mg.l, "empty", $$0 -> ecx.c);
   public static final jr<euq<?>> m = a(mg.al, $$0 -> euq.a);
   public static final jr<eve<?>> n = a(mg.ak, $$0 -> eve.b);
   public static final jr<euj<?>> o = a(mg.ad, $$0 -> euj.a);
   public static final jr<cvz<?>> p = a(mg.V, $$0 -> cvz.i);
   public static final jr<dea<?>> q = a(mg.ai, $$0 -> dea.a);
   public static final jr<ddz<?>> r = a(mg.ah, $$0 -> ddz.b);
   public static final jr<byd> s = a(mg.c, byi::a);
   public static final jr<efe<?>> t = a(mg.ac, $$0 -> efe.a);
   public static final jr<ie<?, ?>> u = a(mg.m, ig::a);
   public static final jr<aww<?>> v = a(mg.ar, $$0 -> awx.c);
   public static final iz<cqp> w = a(mg.aE, "plains", cqp::a);
   public static final iz<cqn> x = a(mg.aD, "none", cqn::a);
   public static final jr<cih> y = a(mg.aa, cii::a);
   public static final iz<cge<?>> z = a(mg.U, "dummy", $$0 -> cge.a);
   public static final iz<chl<?>> A = a(mg.an, "dummy", $$0 -> chl.a);
   public static final jr<cst> B = a(mg.am, $$0 -> cst.c);
   public static final jr<csr> C = a(mg.b, $$0 -> csr.b);
   public static final jr<ezq> D = a(mg.P, $$0 -> ezn.b);
   public static final jr<fao<?>> E = a(mg.M, $$0 -> fap.e);
   public static final jr<fcj> F = a(mg.L, $$0 -> fck.a);
   public static final jr<fdd> G = a(mg.O, $$0 -> fdf.b);
   public static final jr<fcv> H = a(mg.N, $$0 -> fcx.c);
   public static final jr<fdm> I = a(mg.Q, $$0 -> fdo.c);
   public static final jr<btf<?>> J = a(mg.E, $$0 -> btf.a);
   public static final jr<bth<?>> K = a(mg.J, $$0 -> bth.a);
   public static final jr<epb<?>> L = a(mg.I, $$0 -> epb.a);
   public static final jr<ehg<?>> M = a(mg.f, $$0 -> ehg.k);
   public static final jr<eie<?>> N = a(mg.j, $$0 -> eie.a);
   public static final jr<eje<?>> O = a(mg.D, $$0 -> eje.I);
   public static final jr<err<?>> P = a(mg.at, $$0 -> err.a);
   public static final jr<erk> Q = a(mg.as, $$0 -> erk.c);
   public static final jr<erc<?>> R = a(mg.aw, $$0 -> erc.f);
   public static final jr<eqb<?>> S = a(mg.Z, $$0 -> eqb.f);
   public static final jr<enk<?>> T = a(mg.g, $$0 -> enk.a);
   public static final jr<emv<?>> U = a(mg.G, $$0 -> emv.a);
   public static final jr<eoq<?>> V = a(mg.aC, $$0 -> eoq.a);
   public static final jr<enh<?>> W = a(mg.aj, $$0 -> enh.a);
   public static final jr<eoe<?>> X = a(mg.aB, $$0 -> eoe.b);
   public static final jr<emk<?>> Y = a(mg.C, $$0 -> emk.a);
   public static final jr<MapCodec<? extends dkc>> Z = a(mg.d, dkd::a);
   public static final jr<MapCodec<? extends ebx>> aa = a(mg.k, ebz::a);
   public static final jr<MapCodec<? extends egp.f>> ab = a(mg.S, egp.f::a);
   public static final jr<MapCodec<? extends egp.o>> ac = a(mg.T, egp.o::a);
   public static final jr<MapCodec<? extends efr>> ad = a(mg.t, efs::a);
   public static final jr<MapCodec<? extends dma>> ae = a(mg.h, dmb::a);
   public static final jr<euu<?>> af = a(mg.av, $$0 -> euu.e);
   public static final jr<esc<?>> ag = a(mg.au, $$0 -> esc.d);
   public static final jr<MapCodec<? extends esf>> ah = a(mg.ab, esg::a);
   public static final jr<dxq> ai = a(mg.s, dxr::a);
   public static final jr<cxp> aj = a(mg.o, cxq::a);
   public static final jr<as<?>> ak = a(mg.bi, ap::a);
   public static final jr<yp<?>> al = a(mg.X, yq::a);
   public static final jr<ki<?>> am = a(mg.r, kj::a);
   public static final jr<MapCodec<? extends by>> an = a(mg.A, bz::a);
   public static final jr<ks.b<?>> ao = a(mg.q, kt::a);
   public static final jr<exw> ap = a(mg.R, exx::a);
   public static final jr<ki<?>> aq = a(mg.u, dfm::a);
   public static final jr<MapCodec<? extends dfs>> ar = a(mg.w, dfs::a);
   public static final jr<MapCodec<? extends dgc>> as = a(mg.v, dgc::a);
   public static final jr<MapCodec<? extends dgd>> at = a(mg.x, dgd::b);
   public static final jr<MapCodec<? extends dge>> au = a(mg.z, dge::a);
   public static final jr<MapCodec<? extends dgt>> av = a(mg.y, dgu::a);
   public static final jr<dcm.a<?>> aw = a(mg.n, $$0 -> dcm.a.a);
   public static final jr<dev.a<?>> ax = a(mg.ag, dey::a);
   public static final jr<dfb.i<?>> ay = a(mg.ao, dfd::a);
   public static final jr<dds> az = a(mg.af, ddr::a);
   public static final jr<arx> aA = a(mg.aA, $$0 -> arx.i);
   public static final jr<MapCodec<? extends tl>> aB = a(mg.ax, tl::a);
   public static final jr<MapCodec<? extends sr>> aC = a(mg.az, sr::a);
   public static final jr<MapCodec<? extends ctb>> aD = a(mg.aq, ctc::a);
   public static final jr<Consumer<sp>> aE = a(mg.ay, sd::a);
   public static final jr<? extends jr<?>> aF = aI;

   private static <T> jr<T> a(alf<? extends jr<T>> $$0, mf.a<T> $$1) {
      return a($$0, new jm<>($$0, Lifecycle.stable(), false), $$1);
   }

   private static <T> jr<T> b(alf<? extends jr<T>> $$0, mf.a<T> $$1) {
      return a($$0, new jm<>($$0, Lifecycle.stable(), true), $$1);
   }

   private static <T> iz<T> a(alf<? extends jr<T>> $$0, String $$1, mf.a<T> $$2) {
      return a($$0, new iy<>($$1, $$0, Lifecycle.stable(), false), $$2);
   }

   private static <T> iz<T> b(alf<? extends jr<T>> $$0, String $$1, mf.a<T> $$2) {
      return a($$0, new iy<>($$1, $$0, Lifecycle.stable(), true), $$2);
   }

   private static <T, R extends ka<T>> R a(alf<? extends jr<T>> $$0, R $$1, mf.a<T> $$2) {
      ali.a(() -> "registry " + $$0.a());
      alg $$3 = $$0.a();
      aH.put($$3, () -> $$2.run($$1));
      aI.a((alf<ka<?>>)$$0, $$1, jq.a);
      return $$1;
   }

   public static void a() {
      b();
      c();
      b(aF);
   }

   private static void b() {
      aH.forEach(($$0, $$1) -> {
         if ($$1.get() == null) {
            aG.error("Unable to bootstrap registry '{}'", $$0);
         }
      });
   }

   private static void c() {
      aF.n();

      for (jr<?> $$0 : aF) {
         c($$0);
         $$0.n();
      }
   }

   private static <T extends jr<?>> void b(jr<T> $$0) {
      $$0.forEach($$1 -> {
         if ($$1.i().isEmpty()) {
            af.b("Registry '" + $$0.b((T)$$1) + "' was empty after loading");
         }

         if ($$1 instanceof iz) {
            alg $$2 = ((iz)$$1).b();
            Validate.notNull($$1.a($$2), "Missing default of DefaultedMappedRegistry: " + $$2, new Object[0]);
         }
      });
   }

   public static <T> jf<T> a(jr<T> $$0) {
      return ((ka)$$0).p();
   }

   private static void c(jr<?> $$0) {
      ((jm)$$0).o();
   }

   @FunctionalInterface
   interface a<T> {
      Object run(jr<T> var1);
   }
}
