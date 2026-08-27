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
   public static final ig<drp> a = a(kj.B, "step", drp::a);
   public static final iy<atx> b = a(kj.af, $$0 -> aty.nl);
   public static final ig<eio> c = b(kj.y, "empty", $$0 -> eiq.a);
   public static final iy<boi> d = a(kj.Q, bom::a);
   public static final ig<dac> e = b(kj.f, "air", $$0 -> dae.a);
   public static final iy<cuw> f = b(kj.t, $$0 -> cuz.x);
   public static final ig<bpd<?>> g = b(kj.u, "pig", $$0 -> bpd.az);
   public static final ig<cqh> h = b(kj.F, "air", $$0 -> cqp.a);
   public static final ig<csj> i = a(kj.X, "empty", csm::a);
   public static final iy<kb<?>> j = a(kj.S, $$0 -> kc.c);
   public static final iy<dkk<?>> k = b(kj.h, $$0 -> dkk.a);
   public static final ig<cfa> l = a(kj.R, "kebab", cfb::a);
   public static final iy<ajh> m = a(kj.q, $$0 -> aui.E);
   public static final ig<dpc> n = a(kj.n, "empty", $$0 -> dpc.c);
   public static final iy<egz<?>> o = a(kj.ab, $$0 -> egz.a);
   public static final iy<ehn<?>> p = a(kj.ac, $$0 -> ehn.b);
   public static final iy<egs<?>> q = a(kj.W, $$0 -> egs.a);
   public static final iy<cmx<?>> r = a(kj.P, $$0 -> cmx.i);
   public static final iy<ctu<?>> s = a(kj.Z, $$0 -> ctu.a);
   public static final iy<ctt<?>> t = a(kj.Y, $$0 -> ctt.b);
   public static final iy<bqr> u = a(kj.c, bqw::a);
   public static final iy<dru<?>> v = a(kj.V, $$0 -> dru.a);
   public static final iy<hn<?, ?>> w = a(kj.o, ho::a);
   public static final iy<auh<?>> x = a(kj.ag, $$0 -> aui.c);
   public static final ig<cim> y = a(kj.aq, "plains", $$0 -> cim.c);
   public static final ig<cik> z = a(kj.ap, "none", $$0 -> cik.b);
   public static final iy<cav> A = a(kj.U, caw::a);
   public static final ig<bys<?>> B = a(kj.O, "dummy", $$0 -> bys.a);
   public static final ig<bzz<?>> C = a(kj.ae, "dummy", $$0 -> bzz.a);
   public static final iy<ckl> D = a(kj.ad, $$0 -> ckl.c);
   public static final iy<ckj> E = a(kj.b, $$0 -> ckj.b);
   public static final iy<elq> F = a(kj.K, $$0 -> eln.b);
   public static final iy<emk> G = a(kj.H, $$0 -> eml.c);
   public static final iy<enw> H = a(kj.G, $$0 -> enx.b);
   public static final iy<eop> I = a(kj.J, $$0 -> eor.b);
   public static final iy<eoi> J = a(kj.I, $$0 -> eok.c);
   public static final iy<eox> K = a(kj.L, $$0 -> eoz.c);
   public static final iy<bmh<?>> L = a(kj.x, $$0 -> bmh.a);
   public static final iy<bmj<?>> M = a(kj.E, $$0 -> bmj.a);
   public static final iy<ebm<?>> N = a(kj.C, $$0 -> ebm.a);
   public static final iy<dtw<?>> O = a(kj.i, $$0 -> dtw.k);
   public static final iy<dut<?>> P = a(kj.k, $$0 -> dut.a);
   public static final iy<dvs<?>> Q = a(kj.v, $$0 -> dvs.I);
   public static final iy<eec<?>> R = a(kj.ai, $$0 -> eec.a);
   public static final iy<edv> S = a(kj.ah, $$0 -> edv.c);
   public static final iy<edn<?>> T = a(kj.am, $$0 -> edn.f);
   public static final iy<ecm<?>> U = a(kj.T, $$0 -> ecm.f);
   public static final iy<dzy<?>> V = a(kj.j, $$0 -> dzy.a);
   public static final iy<dzj<?>> W = a(kj.z, $$0 -> dzj.a);
   public static final iy<ebb<?>> X = a(kj.ao, $$0 -> ebb.a);
   public static final iy<dzv<?>> Y = a(kj.aa, $$0 -> dzv.a);
   public static final iy<eap<?>> Z = a(kj.an, $$0 -> eap.b);
   public static final iy<dyy<?>> aa = a(kj.w, $$0 -> dyy.a);
   public static final iy<Codec<? extends cye>> ab = a(kj.e, cyf::a);
   public static final iy<Codec<? extends doy>> ac = a(kj.m, dpa::a);
   public static final iy<Codec<? extends dtf.f>> ad = a(kj.M, dtf.f::a);
   public static final iy<Codec<? extends dtf.o>> ae = a(kj.N, dtf.o::a);
   public static final iy<Codec<? extends dsh>> af = a(kj.s, dsi::a);
   public static final iy<MapCodec<? extends dac>> ag = a(kj.g, dad::a);
   public static final iy<ehd<?>> ah = a(kj.al, $$0 -> ehd.e);
   public static final iy<eem<?>> ai = a(kj.aj, $$0 -> eem.d);
   public static final iy<Codec<? extends eep>> aj = a(kj.ak, eeq::a);
   public static final iy<cbi> ak = a(kj.l, cbi::a);
   public static final iy<cbp> al = a(kj.A, $$0 -> cbp.a);
   public static final iy<djz> am = a(kj.d, dka::a);
   public static final iy<cqe> an = a(kj.D, cqg::a);
   public static final iy<String> ao = a(kj.ar, dkz::a);
   public static final iy<cov> ap = a(kj.p, cow::a);
   public static final iy<ap<?>> aq = a(kj.aI, am::a);
   public static final iy<xl<?>> ar = a(kj.as, xm::a);
   public static final iy<cnz> as = a(kj.at, coa::a);
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
