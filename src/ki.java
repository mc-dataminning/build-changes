import com.google.common.collect.Maps;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.Lifecycle;
import com.mojang.serialization.MapCodec;
import java.util.Map;
import java.util.function.Supplier;
import org.apache.commons.lang3.Validate;
import org.slf4j.Logger;

public class ki {
   private static final Logger au = LogUtils.getLogger();
   private static final Map<ajh, Supplier<?>> av = Maps.newLinkedHashMap();
   private static final jh<jh<?>> aw = new it<>(ajg.a(kj.a), Lifecycle.stable());
   public static final ig<drn> a = a(kj.B, "step", drn::a);
   public static final iy<atx> b = a(kj.af, $$0 -> aty.nh);
   public static final ig<eim> c = b(kj.y, "empty", $$0 -> eio.a);
   public static final iy<boh> d = a(kj.Q, bol::a);
   public static final ig<daa> e = b(kj.f, "air", $$0 -> dac.a);
   public static final iy<cuu> f = b(kj.t, $$0 -> cux.x);
   public static final ig<bpc<?>> g = b(kj.u, "pig", $$0 -> bpc.ay);
   public static final ig<cqf> h = b(kj.F, "air", $$0 -> cqn.a);
   public static final ig<csh> i = a(kj.X, "empty", csk::a);
   public static final iy<kb<?>> j = a(kj.S, $$0 -> kc.c);
   public static final iy<dki<?>> k = b(kj.h, $$0 -> dki.a);
   public static final ig<cez> l = a(kj.R, "kebab", cfa::a);
   public static final iy<ajh> m = a(kj.q, $$0 -> aui.E);
   public static final ig<dpa> n = a(kj.n, "empty", $$0 -> dpa.c);
   public static final iy<egx<?>> o = a(kj.ab, $$0 -> egx.a);
   public static final iy<ehl<?>> p = a(kj.ac, $$0 -> ehl.b);
   public static final iy<egq<?>> q = a(kj.W, $$0 -> egq.a);
   public static final iy<cmv<?>> r = a(kj.P, $$0 -> cmv.i);
   public static final iy<cts<?>> s = a(kj.Z, $$0 -> cts.a);
   public static final iy<ctr<?>> t = a(kj.Y, $$0 -> ctr.b);
   public static final iy<bqq> u = a(kj.c, bqv::a);
   public static final iy<drs<?>> v = a(kj.V, $$0 -> drs.a);
   public static final iy<hn<?, ?>> w = a(kj.o, ho::a);
   public static final iy<auh<?>> x = a(kj.ag, $$0 -> aui.c);
   public static final ig<cik> y = a(kj.aq, "plains", $$0 -> cik.c);
   public static final ig<cii> z = a(kj.ap, "none", $$0 -> cii.b);
   public static final iy<cau> A = a(kj.U, cav::a);
   public static final ig<byr<?>> B = a(kj.O, "dummy", $$0 -> byr.a);
   public static final ig<bzy<?>> C = a(kj.ae, "dummy", $$0 -> bzy.a);
   public static final iy<ckj> D = a(kj.ad, $$0 -> ckj.c);
   public static final iy<ckh> E = a(kj.b, $$0 -> ckh.b);
   public static final iy<elo> F = a(kj.K, $$0 -> ell.b);
   public static final iy<emi> G = a(kj.H, $$0 -> emj.c);
   public static final iy<enu> H = a(kj.G, $$0 -> env.b);
   public static final iy<eon> I = a(kj.J, $$0 -> eop.b);
   public static final iy<eog> J = a(kj.I, $$0 -> eoi.c);
   public static final iy<eov> K = a(kj.L, $$0 -> eox.c);
   public static final iy<bmg<?>> L = a(kj.x, $$0 -> bmg.a);
   public static final iy<bmi<?>> M = a(kj.E, $$0 -> bmi.a);
   public static final iy<ebk<?>> N = a(kj.C, $$0 -> ebk.a);
   public static final iy<dtu<?>> O = a(kj.i, $$0 -> dtu.k);
   public static final iy<dur<?>> P = a(kj.k, $$0 -> dur.a);
   public static final iy<dvq<?>> Q = a(kj.v, $$0 -> dvq.I);
   public static final iy<eea<?>> R = a(kj.ai, $$0 -> eea.a);
   public static final iy<edt> S = a(kj.ah, $$0 -> edt.c);
   public static final iy<edl<?>> T = a(kj.am, $$0 -> edl.f);
   public static final iy<eck<?>> U = a(kj.T, $$0 -> eck.f);
   public static final iy<dzw<?>> V = a(kj.j, $$0 -> dzw.a);
   public static final iy<dzh<?>> W = a(kj.z, $$0 -> dzh.a);
   public static final iy<eaz<?>> X = a(kj.ao, $$0 -> eaz.a);
   public static final iy<dzt<?>> Y = a(kj.aa, $$0 -> dzt.a);
   public static final iy<ean<?>> Z = a(kj.an, $$0 -> ean.b);
   public static final iy<dyw<?>> aa = a(kj.w, $$0 -> dyw.a);
   public static final iy<Codec<? extends cyc>> ab = a(kj.e, cyd::a);
   public static final iy<Codec<? extends dow>> ac = a(kj.m, doy::a);
   public static final iy<Codec<? extends dtd.f>> ad = a(kj.M, dtd.f::a);
   public static final iy<Codec<? extends dtd.o>> ae = a(kj.N, dtd.o::a);
   public static final iy<Codec<? extends dsf>> af = a(kj.s, dsg::a);
   public static final iy<MapCodec<? extends daa>> ag = a(kj.g, dab::a);
   public static final iy<ehb<?>> ah = a(kj.al, $$0 -> ehb.e);
   public static final iy<eek<?>> ai = a(kj.aj, $$0 -> eek.d);
   public static final iy<Codec<? extends een>> aj = a(kj.ak, eeo::a);
   public static final iy<cbh> ak = a(kj.l, cbh::a);
   public static final iy<cbo> al = a(kj.A, $$0 -> cbo.a);
   public static final iy<djx> am = a(kj.d, djy::a);
   public static final iy<cqc> an = a(kj.D, cqe::a);
   public static final iy<String> ao = a(kj.ar, dkx::a);
   public static final iy<cot> ap = a(kj.p, cou::a);
   public static final iy<ap<?>> aq = a(kj.aI, am::a);
   public static final iy<xl<?>> ar = a(kj.as, xm::a);
   public static final iy<cnx> as = a(kj.at, cny::a);
   public static final iy<? extends iy<?>> at = aw;

   private static <T> iy<T> a(ajg<? extends iy<T>> $$0, ki.a<T> $$1) {
      return a($$0, new it<>($$0, Lifecycle.stable(), false), $$1);
   }

   private static <T> iy<T> b(ajg<? extends iy<T>> $$0, ki.a<T> $$1) {
      return a($$0, new it<>($$0, Lifecycle.stable(), true), $$1);
   }

   private static <T> ig<T> a(ajg<? extends iy<T>> $$0, String $$1, ki.a<T> $$2) {
      return a($$0, new ie<>($$1, $$0, Lifecycle.stable(), false), $$2);
   }

   private static <T> ig<T> b(ajg<? extends iy<T>> $$0, String $$1, ki.a<T> $$2) {
      return a($$0, new ie<>($$1, $$0, Lifecycle.stable(), true), $$2);
   }

   private static <T, R extends jh<T>> R a(ajg<? extends iy<T>> $$0, R $$1, ki.a<T> $$2) {
      ajj.a(() -> "registry " + $$0);
      ajh $$3 = $$0.a();
      av.put($$3, () -> $$2.run($$1));
      aw.a((ajg<jh<?>>)$$0, $$1, ix.a);
      return $$1;
   }

   public static void a() {
      b();
      c();
      a(at);
   }

   private static void b() {
      av.forEach(($$0, $$1) -> {
         if ($$1.get() == null) {
            au.error("Unable to bootstrap registry '{}'", $$0);
         }
      });
   }

   private static void c() {
      at.l();

      for (iy<?> $$0 : at) {
         $$0.l();
      }
   }

   private static <T extends iy<?>> void a(iy<T> $$0) {
      $$0.forEach($$1 -> {
         if ($$1.e().isEmpty()) {
            ac.a("Registry '" + $$0.b((T)$$1) + "' was empty after loading");
         }

         if ($$1 instanceof ig) {
            ajh $$2 = ((ig)$$1).a();
            Validate.notNull($$1.a($$2), "Missing default of DefaultedMappedRegistry: " + $$2, new Object[0]);
         }
      });
   }

   @FunctionalInterface
   interface a<T> {
      Object run(iy<T> var1);
   }
}
