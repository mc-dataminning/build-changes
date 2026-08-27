import com.google.common.collect.Maps;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.Lifecycle;
import com.mojang.serialization.MapCodec;
import java.util.Map;
import java.util.function.Supplier;
import org.apache.commons.lang3.Validate;
import org.slf4j.Logger;

public class jy {
   private static final Logger as = LogUtils.getLogger();
   private static final Map<agg, Supplier<?>> at = Maps.newLinkedHashMap();
   public static final agg a = new agg("root");
   private static final ix<ix<?>> au = new ik<>(agf.a(a), Lifecycle.stable());
   public static final hw<dlg> b = b(jz.A, "step", $$0 -> dlg.P);
   public static final io<aqm> c = a(jz.ae, $$0 -> aqn.me);
   public static final hw<ecf> d = b(jz.x, "empty", $$0 -> ech.a);
   public static final io<bjt> e = b(jz.P, $$0 -> bjx.z);
   public static final hw<cut> f = b(jz.e, "air", $$0 -> cuv.a);
   public static final io<cpm> g = b(jz.s, $$0 -> cpq.x);
   public static final hw<bkm<?>> h = b(jz.t, "pig", $$0 -> bkm.av);
   public static final hw<ckw> i = b(jz.E, "air", $$0 -> cle.a);
   public static final hw<cmy> j = b(jz.W, "empty", $$0 -> cnb.b);
   public static final io<jr<?>> k = a(jz.R, $$0 -> js.c);
   public static final io<det<?>> l = b(jz.g, $$0 -> det.a);
   public static final hw<cab> m = a(jz.Q, "kebab", cac::a);
   public static final io<agg> n = a(jz.p, $$0 -> aqx.E);
   public static final hw<dix> o = a(jz.m, "empty", $$0 -> dix.c);
   public static final io<eaq<?>> p = a(jz.aa, $$0 -> eaq.a);
   public static final io<ebe<?>> q = a(jz.ab, $$0 -> ebe.b);
   public static final io<eaj<?>> r = a(jz.V, $$0 -> eaj.a);
   public static final io<chl<?>> s = a(jz.O, $$0 -> chl.i);
   public static final io<cok<?>> t = a(jz.Y, $$0 -> cok.a);
   public static final io<coj<?>> u = a(jz.X, $$0 -> coj.b);
   public static final io<blz> v = a(jz.b, $$0 -> bme.j);
   public static final io<dll<?>> w = a(jz.U, $$0 -> dll.a);
   public static final io<hf<?, ?>> x = a(jz.n, hg::a);
   public static final io<aqw<?>> y = a(jz.af, $$0 -> aqx.c);
   public static final hw<cde> z = a(jz.ap, "plains", $$0 -> cde.c);
   public static final hw<cdc> A = a(jz.ao, "none", $$0 -> cdc.b);
   public static final io<bwa> B = a(jz.T, bwb::a);
   public static final hw<btz<?>> C = a(jz.N, "dummy", $$0 -> btz.a);
   public static final hw<bve<?>> D = a(jz.ad, "dummy", $$0 -> bve.a);
   public static final io<cez> E = a(jz.ac, $$0 -> cez.c);
   public static final io<cex> F = a(jz.a, $$0 -> cex.b);
   public static final io<eff> G = a(jz.J, $$0 -> efc.b);
   public static final io<efz> H = a(jz.G, $$0 -> ega.c);
   public static final io<ehl> I = a(jz.F, $$0 -> ehm.b);
   public static final io<eie> J = a(jz.I, $$0 -> eig.b);
   public static final io<ehx> K = a(jz.H, $$0 -> ehz.c);
   public static final io<eim> L = a(jz.K, $$0 -> eio.c);
   public static final io<bhu<?>> M = a(jz.w, $$0 -> bhu.a);
   public static final io<bhw<?>> N = a(jz.D, $$0 -> bhw.a);
   public static final io<dvd<?>> O = a(jz.B, $$0 -> dvd.a);
   public static final io<dnn<?>> P = a(jz.h, $$0 -> dnn.k);
   public static final io<dok<?>> Q = a(jz.j, $$0 -> dok.a);
   public static final io<dpj<?>> R = a(jz.u, $$0 -> dpj.I);
   public static final io<dxt<?>> S = a(jz.ah, $$0 -> dxt.a);
   public static final io<dxm> T = a(jz.ag, $$0 -> dxm.c);
   public static final io<dxe<?>> U = a(jz.al, $$0 -> dxe.f);
   public static final io<dwd<?>> V = a(jz.S, $$0 -> dwd.f);
   public static final io<dtp<?>> W = a(jz.i, $$0 -> dtp.a);
   public static final io<dta<?>> X = a(jz.y, $$0 -> dta.a);
   public static final io<dus<?>> Y = a(jz.an, $$0 -> dus.a);
   public static final io<dtm<?>> Z = a(jz.Z, $$0 -> dtm.a);
   public static final io<dug<?>> aa = a(jz.am, $$0 -> dug.b);
   public static final io<dsp<?>> ab = a(jz.v, $$0 -> dsp.a);
   public static final io<Codec<? extends csu>> ac = a(jz.d, Lifecycle.stable(), csv::a);
   public static final io<Codec<? extends dit>> ad = a(jz.l, Lifecycle.stable(), div::a);
   public static final io<Codec<? extends dmw.f>> ae = a(jz.L, dmw.f::a);
   public static final io<Codec<? extends dmw.o>> af = a(jz.M, dmw.o::a);
   public static final io<Codec<? extends dly>> ag = a(jz.r, dlz::a);
   public static final io<MapCodec<? extends cut>> ah = a(jz.f, cuu::a);
   public static final io<eau<?>> ai = a(jz.ak, $$0 -> eau.e);
   public static final io<dyd<?>> aj = a(jz.ai, $$0 -> dyd.d);
   public static final io<Codec<? extends dyg>> ak = a(jz.aj, dyh::a);
   public static final io<bwn> al = a(jz.k, bwn::a);
   public static final io<bwu> am = a(jz.z, $$0 -> bwu.a);
   public static final io<dei> an = a(jz.c, dej::a);
   public static final io<ckt> ao = a(jz.C, ckv::a);
   public static final io<String> ap = a(jz.aq, dfi::a);
   public static final io<cjh> aq = a(jz.o, cji::a);
   public static final io<? extends io<?>> ar = au;

   private static <T> io<T> a(agf<? extends io<T>> $$0, jy.a<T> $$1) {
      return a($$0, Lifecycle.stable(), $$1);
   }

   private static <T> io<T> b(agf<? extends io<T>> $$0, jy.a<T> $$1) {
      return a($$0, new ik<>($$0, Lifecycle.stable(), true), $$1, Lifecycle.stable());
   }

   private static <T> hw<T> a(agf<? extends io<T>> $$0, String $$1, jy.a<T> $$2) {
      return a($$0, $$1, Lifecycle.stable(), $$2);
   }

   private static <T> hw<T> b(agf<? extends io<T>> $$0, String $$1, jy.a<T> $$2) {
      return b($$0, $$1, Lifecycle.stable(), $$2);
   }

   private static <T> io<T> a(agf<? extends io<T>> $$0, Lifecycle $$1, jy.a<T> $$2) {
      return a($$0, new ik<>($$0, $$1, false), $$2, $$1);
   }

   private static <T> hw<T> a(agf<? extends io<T>> $$0, String $$1, Lifecycle $$2, jy.a<T> $$3) {
      return a($$0, new hv<>($$1, $$0, $$2, false), $$3, $$2);
   }

   private static <T> hw<T> b(agf<? extends io<T>> $$0, String $$1, Lifecycle $$2, jy.a<T> $$3) {
      return a($$0, new hv<>($$1, $$0, $$2, true), $$3, $$2);
   }

   private static <T, R extends ix<T>> R a(agf<? extends io<T>> $$0, R $$1, jy.a<T> $$2, Lifecycle $$3) {
      agg $$4 = $$0.a();
      at.put($$4, () -> $$2.run($$1));
      au.a((agf<ix<?>>)$$0, $$1, $$3);
      return $$1;
   }

   public static void a() {
      b();
      c();
      a(ar);
   }

   private static void b() {
      at.forEach(($$0, $$1) -> {
         if ($$1.get() == null) {
            as.error("Unable to bootstrap registry '{}'", $$0);
         }
      });
   }

   private static void c() {
      ar.l();

      for (io<?> $$0 : ar) {
         $$0.l();
      }
   }

   private static <T extends io<?>> void a(io<T> $$0) {
      $$0.forEach($$1 -> {
         if ($$1.e().isEmpty()) {
            ac.a("Registry '" + $$0.b((T)$$1) + "' was empty after loading");
         }

         if ($$1 instanceof hw) {
            agg $$2 = ((hw)$$1).a();
            Validate.notNull($$1.a($$2), "Missing default of DefaultedMappedRegistry: " + $$2, new Object[0]);
         }
      });
   }

   @FunctionalInterface
   interface a<T> {
      T run(io<T> var1);
   }
}
