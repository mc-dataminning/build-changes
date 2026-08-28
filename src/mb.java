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
   public static final jm<ebr> a = a(mc.G, "step", ebr::a);
   public static final ke<avy> b = a(mc.al, $$0 -> avz.oa);
   public static final jm<esw> c = b(mc.D, "empty", $$0 -> esy.a);
   public static final ke<btm> d = a(mc.W, btq::a);
   public static final jm<djk> e = b(mc.f, "air", $$0 -> djm.a);
   public static final jm<buq<?>> f = b(mc.z, "pig", $$0 -> buq.aQ);
   public static final jm<cwj> g = b(mc.K, "air", $$0 -> cwr.a);
   public static final ke<cyk> h = a(mc.ad, cyn::a);
   public static final ke<ls<?>> i = a(mc.Y, $$0 -> lt.b);
   public static final ke<dtz<?>> j = b(mc.h, $$0 -> dtz.a);
   public static final ke<aku> k = a(mc.r, $$0 -> awj.E);
   public static final jm<dzr> l = a(mc.o, "empty", $$0 -> dzr.c);
   public static final ke<erh<?>> m = a(mc.ah, $$0 -> erh.a);
   public static final ke<erv<?>> n = a(mc.ai, $$0 -> erv.b);
   public static final ke<era<?>> o = a(mc.ac, $$0 -> era.a);
   public static final ke<ctj<?>> p = a(mc.V, $$0 -> ctj.i);
   public static final ke<dbn<?>> q = a(mc.af, $$0 -> dbn.a);
   public static final ke<dbm<?>> r = a(mc.ae, $$0 -> dbm.b);
   public static final ke<bwi> s = a(mc.c, bwn::a);
   public static final ke<ebw<?>> t = a(mc.ab, $$0 -> ebw.a);
   public static final ke<it<?, ?>> u = a(mc.p, iu::a);
   public static final ke<awi<?>> v = a(mc.am, $$0 -> awj.c);
   public static final jm<col> w = a(mc.aw, "plains", $$0 -> col.c);
   public static final jm<coj> x = a(mc.av, "none", $$0 -> coj.b);
   public static final ke<cgm> y = a(mc.aa, cgn::a);
   public static final jm<cej<?>> z = a(mc.U, "dummy", $$0 -> cej.a);
   public static final jm<cfq<?>> A = a(mc.ak, "dummy", $$0 -> cfq.a);
   public static final ke<cqo> B = a(mc.aj, $$0 -> cqo.c);
   public static final ke<cqm> C = a(mc.b, $$0 -> cqm.b);
   public static final ke<ewg> D = a(mc.Q, $$0 -> ewd.b);
   public static final ke<exe<?>> E = a(mc.N, $$0 -> exf.e);
   public static final ke<eyz> F = a(mc.M, $$0 -> eza.a);
   public static final ke<ezt> G = a(mc.P, $$0 -> ezv.b);
   public static final ke<ezl> H = a(mc.O, $$0 -> ezn.c);
   public static final ke<fac> I = a(mc.R, $$0 -> fae.c);
   public static final ke<brm<?>> J = a(mc.C, $$0 -> brm.a);
   public static final ke<bro<?>> K = a(mc.J, $$0 -> bro.a);
   public static final ke<els<?>> L = a(mc.H, $$0 -> els.a);
   public static final ke<edy<?>> M = a(mc.i, $$0 -> edy.k);
   public static final ke<eew<?>> N = a(mc.k, $$0 -> eew.a);
   public static final ke<efw<?>> O = a(mc.A, $$0 -> efw.I);
   public static final ke<eoi<?>> P = a(mc.ao, $$0 -> eoi.a);
   public static final ke<eob> Q = a(mc.an, $$0 -> eob.c);
   public static final ke<ent<?>> R = a(mc.as, $$0 -> ent.f);
   public static final ke<ems<?>> S = a(mc.Z, $$0 -> ems.f);
   public static final ke<ekc<?>> T = a(mc.j, $$0 -> ekc.a);
   public static final ke<ejn<?>> U = a(mc.E, $$0 -> ejn.a);
   public static final ke<elh<?>> V = a(mc.au, $$0 -> elh.a);
   public static final ke<ejz<?>> W = a(mc.ag, $$0 -> ejz.a);
   public static final ke<ekv<?>> X = a(mc.at, $$0 -> ekv.b);
   public static final ke<ejc<?>> Y = a(mc.B, $$0 -> ejc.a);
   public static final ke<MapCodec<? extends dhm>> Z = a(mc.e, dhn::a);
   public static final ke<MapCodec<? extends dyr>> aa = a(mc.n, dyt::a);
   public static final ke<MapCodec<? extends edh.f>> ab = a(mc.S, edh.f::a);
   public static final ke<MapCodec<? extends edh.o>> ac = a(mc.T, edh.o::a);
   public static final ke<MapCodec<? extends ecj>> ad = a(mc.t, eck::a);
   public static final ke<MapCodec<? extends djk>> ae = a(mc.g, djl::a);
   public static final ke<erl<?>> af = a(mc.ar, $$0 -> erl.e);
   public static final ke<eot<?>> ag = a(mc.ap, $$0 -> eot.d);
   public static final ke<MapCodec<? extends eow>> ah = a(mc.aq, eox::a);
   public static final ke<cha> ai = a(mc.l, cha::a);
   public static final ke<chh> aj = a(mc.F, chh::a);
   public static final ke<dup> ak = a(mc.ax, duq::a);
   public static final ke<cvc> al = a(mc.q, cvd::a);
   public static final ke<as<?>> am = a(mc.aY, ap::a);
   public static final ke<yf<?>> an = a(mc.ay, yg::a);
   public static final ke<ku<?>> ao = a(mc.az, kv::a);
   public static final ke<MapCodec<? extends by>> ap = a(mc.aA, bz::a);
   public static final ke<cw.a<?>> aq = a(mc.aB, cx::a);
   public static final ke<eum> ar = a(mc.aC, eun::a);
   public static final ke<ku<?>> as = a(mc.aD, dcy::a);
   public static final ke<MapCodec<? extends dde>> at = a(mc.v, dde::a);
   public static final ke<MapCodec<? extends ddo>> au = a(mc.u, ddo::a);
   public static final ke<MapCodec<? extends ddp>> av = a(mc.w, ddp::b);
   public static final ke<MapCodec<? extends ddq>> aw = a(mc.y, ddq::a);
   public static final ke<MapCodec<? extends def>> ax = a(mc.x, deg::a);
   public static final ke<czz.a<?>> ay = a(mc.aE, $$0 -> czz.a.a);
   public static final ke<dch.a<?>> az = a(mc.aF, dck::a);
   public static final ke<dcn.i<?>> aA = a(mc.aG, dcp::a);
   public static final ke<dbf> aB = a(mc.aH, dbe::a);
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
