import com.google.common.collect.Maps;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Lifecycle;
import com.mojang.serialization.MapCodec;
import java.util.Map;
import java.util.function.Supplier;
import org.apache.commons.lang3.Validate;
import org.slf4j.Logger;

public class lu {
   private static final Logger aA = LogUtils.getLogger();
   private static final Map<alb, Supplier<?>> aB = Maps.newLinkedHashMap();
   private static final kj<kj<?>> aC = new jv<>(ala.a(lv.a), Lifecycle.stable());
   public static final ji<dyx> a = a(lv.G, "step", dyx::a);
   public static final ka<awc> b = a(lv.al, $$0 -> awd.nD);
   public static final ji<eqa> c = b(lv.D, "empty", $$0 -> eqc.a);
   public static final ka<bso> d = a(lv.W, bss::a);
   public static final ji<dgv> e = b(lv.f, "air", $$0 -> dgx.a);
   public static final ji<btq<?>> f = b(lv.z, "pig", $$0 -> btq.az);
   public static final ji<cvg> g = b(lv.K, "air", $$0 -> cvo.a);
   public static final ka<cxl> h = a(lv.ad, cxo::a);
   public static final ka<lm<?>> i = a(lv.Y, $$0 -> ln.b);
   public static final ka<drg<?>> j = b(lv.h, $$0 -> drg.a);
   public static final ka<alb> k = a(lv.r, $$0 -> awn.E);
   public static final ji<dwx> l = a(lv.o, "empty", $$0 -> dwx.c);
   public static final ka<eol<?>> m = a(lv.ah, $$0 -> eol.a);
   public static final ka<eoz<?>> n = a(lv.ai, $$0 -> eoz.b);
   public static final ka<eoe<?>> o = a(lv.ac, $$0 -> eoe.a);
   public static final ka<crz<?>> p = a(lv.V, $$0 -> crz.i);
   public static final ka<czz<?>> q = a(lv.af, $$0 -> czz.a);
   public static final ka<czy<?>> r = a(lv.ae, $$0 -> czy.b);
   public static final ka<bvh> s = a(lv.c, bvm::a);
   public static final ka<dzc<?>> t = a(lv.ab, $$0 -> dzc.a);
   public static final ka<ip<?, ?>> u = a(lv.p, iq::a);
   public static final ka<awm<?>> v = a(lv.am, $$0 -> awn.c);
   public static final ji<cnh> w = a(lv.aw, "plains", $$0 -> cnh.c);
   public static final ji<cnf> x = a(lv.av, "none", $$0 -> cnf.b);
   public static final ka<cfl> y = a(lv.aa, cfm::a);
   public static final ji<cdi<?>> z = a(lv.U, "dummy", $$0 -> cdi.a);
   public static final ji<cep<?>> A = a(lv.ak, "dummy", $$0 -> cep.a);
   public static final ka<cpi> B = a(lv.aj, $$0 -> cpi.c);
   public static final ka<cpg> C = a(lv.b, $$0 -> cpg.b);
   public static final ka<etk> D = a(lv.Q, $$0 -> eth.b);
   public static final ka<eui<?>> E = a(lv.N, $$0 -> euj.e);
   public static final ka<ewf> F = a(lv.M, $$0 -> ewg.a);
   public static final ka<ewz> G = a(lv.P, $$0 -> exb.b);
   public static final ka<ewr> H = a(lv.O, $$0 -> ewt.c);
   public static final ka<exi> I = a(lv.R, $$0 -> exk.c);
   public static final ka<bqo<?>> J = a(lv.C, $$0 -> bqo.a);
   public static final ka<bqq<?>> K = a(lv.J, $$0 -> bqq.a);
   public static final ka<eiw<?>> L = a(lv.H, $$0 -> eiw.a);
   public static final ka<ebe<?>> M = a(lv.i, $$0 -> ebe.k);
   public static final ka<ecc<?>> N = a(lv.k, $$0 -> ecc.a);
   public static final ka<edc<?>> O = a(lv.A, $$0 -> edc.I);
   public static final ka<elm<?>> P = a(lv.ao, $$0 -> elm.a);
   public static final ka<elf> Q = a(lv.an, $$0 -> elf.c);
   public static final ka<ekx<?>> R = a(lv.as, $$0 -> ekx.f);
   public static final ka<ejw<?>> S = a(lv.Z, $$0 -> ejw.f);
   public static final ka<ehi<?>> T = a(lv.j, $$0 -> ehi.a);
   public static final ka<egt<?>> U = a(lv.E, $$0 -> egt.a);
   public static final ka<eil<?>> V = a(lv.au, $$0 -> eil.a);
   public static final ka<ehf<?>> W = a(lv.ag, $$0 -> ehf.a);
   public static final ka<ehz<?>> X = a(lv.at, $$0 -> ehz.b);
   public static final ka<egi<?>> Y = a(lv.B, $$0 -> egi.a);
   public static final ka<MapCodec<? extends dex>> Z = a(lv.e, dey::a);
   public static final ka<MapCodec<? extends dvx>> aa = a(lv.n, dvz::a);
   public static final ka<MapCodec<? extends ean.f>> ab = a(lv.S, ean.f::a);
   public static final ka<MapCodec<? extends ean.o>> ac = a(lv.T, ean.o::a);
   public static final ka<MapCodec<? extends dzp>> ad = a(lv.t, dzq::a);
   public static final ka<MapCodec<? extends dgv>> ae = a(lv.g, dgw::a);
   public static final ka<eop<?>> af = a(lv.ar, $$0 -> eop.e);
   public static final ka<elx<?>> ag = a(lv.ap, $$0 -> elx.d);
   public static final ka<MapCodec<? extends ema>> ah = a(lv.aq, emb::a);
   public static final ka<cfz> ai = a(lv.l, cfz::a);
   public static final ka<cgg> aj = a(lv.F, cgg::a);
   public static final ka<drv> ak = a(lv.ax, drw::a);
   public static final ka<ctw> al = a(lv.q, ctx::a);
   public static final ka<aq<?>> am = a(lv.aV, an::a);
   public static final ka<yu<?>> an = a(lv.ay, yv::a);
   public static final ka<ctd> ao = a(lv.az, cte::a);
   public static final ka<kq<?>> ap = a(lv.aA, kr::a);
   public static final ka<MapCodec<? extends bw>> aq = a(lv.aB, bx::a);
   public static final ka<ct.a<?>> ar = a(lv.aC, cu::a);
   public static final ka<erq> as = a(lv.aD, err::a);
   public static final ka<kq<?>> at = a(lv.aE, dax::a);
   public static final ka<MapCodec<? extends dbd>> au = a(lv.v, dbd::a);
   public static final ka<MapCodec<? extends dbn>> av = a(lv.u, dbn::a);
   public static final ka<MapCodec<? extends dbo>> aw = a(lv.w, dbo::b);
   public static final ka<MapCodec<? extends dbp>> ax = a(lv.y, dbp::a);
   public static final ka<MapCodec<? extends dce>> ay = a(lv.x, dcf::a);
   public static final ka<? extends ka<?>> az = aC;

   private static <T> ka<T> a(ala<? extends ka<T>> $$0, lu.a<T> $$1) {
      return a($$0, new jv<>($$0, Lifecycle.stable(), false), $$1);
   }

   private static <T> ka<T> b(ala<? extends ka<T>> $$0, lu.a<T> $$1) {
      return a($$0, new jv<>($$0, Lifecycle.stable(), true), $$1);
   }

   private static <T> ji<T> a(ala<? extends ka<T>> $$0, String $$1, lu.a<T> $$2) {
      return a($$0, new jh<>($$1, $$0, Lifecycle.stable(), false), $$2);
   }

   private static <T> ji<T> b(ala<? extends ka<T>> $$0, String $$1, lu.a<T> $$2) {
      return a($$0, new jh<>($$1, $$0, Lifecycle.stable(), true), $$2);
   }

   private static <T, R extends kj<T>> R a(ala<? extends ka<T>> $$0, R $$1, lu.a<T> $$2) {
      ald.a(() -> "registry " + $$0);
      alb $$3 = $$0.a();
      aB.put($$3, () -> $$2.run($$1));
      aC.a((ala<kj<?>>)$$0, $$1, jz.a);
      return $$1;
   }

   public static void a() {
      b();
      c();
      b(az);
   }

   private static void b() {
      aB.forEach(($$0, $$1) -> {
         if ($$1.get() == null) {
            aA.error("Unable to bootstrap registry '{}'", $$0);
         }
      });
   }

   private static void c() {
      az.l();

      for (ka<?> $$0 : az) {
         c($$0);
         $$0.l();
      }
   }

   private static <T extends ka<?>> void b(ka<T> $$0) {
      $$0.forEach($$1 -> {
         if ($$1.f().isEmpty()) {
            ad.b("Registry '" + $$0.b((T)$$1) + "' was empty after loading");
         }

         if ($$1 instanceof ji) {
            alb $$2 = ((ji)$$1).b();
            Validate.notNull($$1.a($$2), "Missing default of DefaultedMappedRegistry: " + $$2, new Object[0]);
         }
      });
   }

   public static <T> jo<T> a(ka<T> $$0) {
      return ((kj)$$0).n();
   }

   private static void c(ka<?> $$0) {
      ((jv)$$0).m();
   }

   @FunctionalInterface
   interface a<T> {
      Object run(ka<T> var1);
   }
}
