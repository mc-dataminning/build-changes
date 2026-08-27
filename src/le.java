import com.google.common.collect.Maps;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Lifecycle;
import com.mojang.serialization.MapCodec;
import java.util.Map;
import java.util.function.Supplier;
import org.apache.commons.lang3.Validate;
import org.slf4j.Logger;

public class le {
   private static final Logger ax = LogUtils.getLogger();
   private static final Map<akn, Supplier<?>> ay = Maps.newLinkedHashMap();
   private static final jt<jt<?>> az = new jf<>(akm.a(lf.a), Lifecycle.stable());
   public static final is<dvw> a = a(lf.C, "step", dvw::a);
   public static final jk<avh> b = a(lf.ag, $$0 -> avi.nC);
   public static final is<emv> c = b(lf.z, "empty", $$0 -> emx.a);
   public static final jk<brc> d = a(lf.R, brg::a);
   public static final is<dea> e = b(lf.f, "air", $$0 -> dec.a);
   public static final jk<czb> f = b(lf.u, $$0 -> cze.x);
   public static final is<bsc<?>> g = b(lf.v, "pig", $$0 -> bsc.az);
   public static final is<ctl> h = b(lf.G, "air", $$0 -> ctt.a);
   public static final jk<cvp> i = a(lf.Y, cvs::a);
   public static final jk<kx<?>> j = a(lf.T, $$0 -> ky.b);
   public static final jk<dok<?>> k = b(lf.h, $$0 -> dok.a);
   public static final is<cie> l = a(lf.S, "kebab", cif::a);
   public static final jk<akn> m = a(lf.r, $$0 -> avs.E);
   public static final is<dty> n = a(lf.o, "empty", $$0 -> dty.c);
   public static final jk<elg<?>> o = a(lf.ac, $$0 -> elg.a);
   public static final jk<elu<?>> p = a(lf.ad, $$0 -> elu.b);
   public static final jk<ekz<?>> q = a(lf.X, $$0 -> ekz.a);
   public static final jk<cqc<?>> r = a(lf.Q, $$0 -> cqc.i);
   public static final jk<cyb<?>> s = a(lf.aa, $$0 -> cyb.a);
   public static final jk<cya<?>> t = a(lf.Z, $$0 -> cya.b);
   public static final jk<btt> u = a(lf.c, bty::a);
   public static final jk<dwb<?>> v = a(lf.W, $$0 -> dwb.a);
   public static final jk<hy<?, ?>> w = a(lf.p, hz::a);
   public static final jk<avr<?>> x = a(lf.ah, $$0 -> avs.c);
   public static final is<clq> y = a(lf.ar, "plains", $$0 -> clq.c);
   public static final is<clo> z = a(lf.aq, "none", $$0 -> clo.b);
   public static final jk<cdx> A = a(lf.V, cdy::a);
   public static final is<cbu<?>> B = a(lf.P, "dummy", $$0 -> cbu.a);
   public static final is<cdb<?>> C = a(lf.af, "dummy", $$0 -> cdb.a);
   public static final jk<cnp> D = a(lf.ae, $$0 -> cnp.c);
   public static final jk<cnn> E = a(lf.b, $$0 -> cnn.b);
   public static final jk<epy> F = a(lf.L, $$0 -> epv.b);
   public static final jk<equ> G = a(lf.I, $$0 -> eqv.e);
   public static final jk<eso> H = a(lf.H, $$0 -> esp.c);
   public static final jk<eth> I = a(lf.K, $$0 -> etj.b);
   public static final jk<eta> J = a(lf.J, $$0 -> etc.c);
   public static final jk<etq> K = a(lf.M, $$0 -> ets.c);
   public static final jk<bpa<?>> L = a(lf.y, $$0 -> bpa.a);
   public static final jk<bpc<?>> M = a(lf.F, $$0 -> bpc.a);
   public static final jk<eft<?>> N = a(lf.D, $$0 -> eft.a);
   public static final jk<dyd<?>> O = a(lf.i, $$0 -> dyd.k);
   public static final jk<dza<?>> P = a(lf.k, $$0 -> dza.a);
   public static final jk<dzz<?>> Q = a(lf.w, $$0 -> dzz.I);
   public static final jk<eij<?>> R = a(lf.aj, $$0 -> eij.a);
   public static final jk<eic> S = a(lf.ai, $$0 -> eic.c);
   public static final jk<ehu<?>> T = a(lf.an, $$0 -> ehu.f);
   public static final jk<egt<?>> U = a(lf.U, $$0 -> egt.f);
   public static final jk<eef<?>> V = a(lf.j, $$0 -> eef.a);
   public static final jk<edq<?>> W = a(lf.A, $$0 -> edq.a);
   public static final jk<efi<?>> X = a(lf.ap, $$0 -> efi.a);
   public static final jk<eec<?>> Y = a(lf.ab, $$0 -> eec.a);
   public static final jk<eew<?>> Z = a(lf.ao, $$0 -> eew.b);
   public static final jk<edf<?>> aa = a(lf.x, $$0 -> edf.a);
   public static final jk<MapCodec<? extends dcc>> ab = a(lf.e, dcd::a);
   public static final jk<MapCodec<? extends dta>> ac = a(lf.n, dtc::a);
   public static final jk<MapCodec<? extends dxm.f>> ad = a(lf.N, dxm.f::a);
   public static final jk<MapCodec<? extends dxm.o>> ae = a(lf.O, dxm.o::a);
   public static final jk<MapCodec<? extends dwo>> af = a(lf.t, dwp::a);
   public static final jk<MapCodec<? extends dea>> ag = a(lf.g, deb::a);
   public static final jk<elk<?>> ah = a(lf.am, $$0 -> elk.e);
   public static final jk<eit<?>> ai = a(lf.ak, $$0 -> eit.d);
   public static final jk<MapCodec<? extends eiw>> aj = a(lf.al, eix::a);
   public static final jk<cek> ak = a(lf.l, cek::a);
   public static final jk<cer> al = a(lf.B, cer::a);
   public static final jk<cti> am = a(lf.E, ctk::a);
   public static final jk<String> an = a(lf.as, doz::a);
   public static final jk<csb> ao = a(lf.q, csc::a);
   public static final jk<ap<?>> ap = a(lf.aN, am::a);
   public static final jk<yo<?>> aq = a(lf.at, yp::a);
   public static final jk<crg> ar = a(lf.au, crh::a);
   public static final jk<ka<?>> as = a(lf.av, kb::a);
   public static final jk<MapCodec<? extends bs>> at = a(lf.aw, bt::a);
   public static final jk<ci.a<?>> au = a(lf.ax, cj::a);
   public static final jk<eog> av = a(lf.ay, eoh::a);
   public static final jk<? extends jk<?>> aw = az;

   private static <T> jk<T> a(akm<? extends jk<T>> $$0, le.a<T> $$1) {
      return a($$0, new jf<>($$0, Lifecycle.stable(), false), $$1);
   }

   private static <T> jk<T> b(akm<? extends jk<T>> $$0, le.a<T> $$1) {
      return a($$0, new jf<>($$0, Lifecycle.stable(), true), $$1);
   }

   private static <T> is<T> a(akm<? extends jk<T>> $$0, String $$1, le.a<T> $$2) {
      return a($$0, new ir<>($$1, $$0, Lifecycle.stable(), false), $$2);
   }

   private static <T> is<T> b(akm<? extends jk<T>> $$0, String $$1, le.a<T> $$2) {
      return a($$0, new ir<>($$1, $$0, Lifecycle.stable(), true), $$2);
   }

   private static <T, R extends jt<T>> R a(akm<? extends jk<T>> $$0, R $$1, le.a<T> $$2) {
      akp.a(() -> "registry " + $$0);
      akn $$3 = $$0.a();
      ay.put($$3, () -> $$2.run($$1));
      az.a((akm<jt<?>>)$$0, $$1, jj.a);
      return $$1;
   }

   public static void a() {
      b();
      c();
      a(aw);
   }

   private static void b() {
      ay.forEach(($$0, $$1) -> {
         if ($$1.get() == null) {
            ax.error("Unable to bootstrap registry '{}'", $$0);
         }
      });
   }

   private static void c() {
      aw.l();

      for (jk<?> $$0 : aw) {
         $$0.l();
      }
   }

   private static <T extends jk<?>> void a(jk<T> $$0) {
      $$0.forEach($$1 -> {
         if ($$1.e().isEmpty()) {
            ac.a("Registry '" + $$0.b((T)$$1) + "' was empty after loading");
         }

         if ($$1 instanceof is) {
            akn $$2 = ((is)$$1).a();
            Validate.notNull($$1.a($$2), "Missing default of DefaultedMappedRegistry: " + $$2, new Object[0]);
         }
      });
   }

   @FunctionalInterface
   interface a<T> {
      Object run(jk<T> var1);
   }
}
