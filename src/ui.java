import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.EnumMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public enum ui {
   a("handshake", b().a(xh.b, new ui.b()).a(xh.a, new ui.b<afl>().a(afk.class, afk::new))),
   b(
      "play",
      b()
         .a(
            xh.b,
            new ui.b<zb>()
               .b(zm.class, zm::new)
               .a(zc.class, zc::new)
               .a(zd.class, zd::new)
               .a(ze.class, ze::new)
               .a(zf.class, zf::new)
               .a(zg.class, zg::new)
               .a(zh.class, zh::new)
               .a(zi.class, zi::new)
               .a(zj.class, zj::new)
               .a(zk.class, zk::new)
               .a(zl.class, zl::new)
               .a(zn.class, zn::new)
               .a(zo.class, zo::new)
               .a(zp.class, zp::new)
               .a(zq.class, zq::new)
               .a(zr.class, zr::new)
               .a(zs.class, zs::new)
               .a(zt.class, zt::new)
               .a(zu.class, zu::new)
               .a(zv.class, zv::new)
               .a(zw.class, zw::new)
               .a(zx.class, zx::new)
               .a(zy.class, zy::new)
               .a(zz.class, zz::new)
               .a(xk.class, xk::new)
               .a(aaa.class, aaa::new)
               .a(aab.class, aab::new)
               .a(xl.class, xl::new)
               .a(aac.class, aac::new)
               .a(aad.class, aad::new)
               .a(aae.class, aae::new)
               .a(aaf.class, aaf::new)
               .a(aag.class, aag::new)
               .a(aah.class, aah::new)
               .a(aai.class, aai::new)
               .a(aaj.class, aaj::new)
               .a(xm.class, xm::new)
               .a(aal.class, aal::new)
               .a(aam.class, aam::new)
               .a(aan.class, aan::new)
               .a(aao.class, aao::new)
               .a(aaq.class, aaq::new)
               .a(aar.class, aar::new)
               .a(aas.class, aas::new)
               .a(aat.a.class, aat.a::b)
               .a(aat.b.class, aat.b::b)
               .a(aat.c.class, aat.c::b)
               .a(aau.class, aau::new)
               .a(aav.class, aav::new)
               .a(aaw.class, aaw::new)
               .a(aax.class, aax::new)
               .a(xn.class, xn::new)
               .a(agg.class, agg::new)
               .a(aay.class, aay::new)
               .a(aaz.class, aaz::new)
               .a(aba.class, aba::new)
               .a(abb.class, abb::new)
               .a(abc.class, abc::new)
               .a(abd.class, abd::new)
               .a(abe.class, abe::new)
               .a(abf.class, abf::new)
               .a(abg.class, abg::new)
               .a(abh.class, abh::new)
               .a(abi.class, abi::new)
               .a(abj.class, abj::new)
               .a(abk.class, abk::new)
               .a(abl.class, abl::new)
               .a(xo.class, xo::new)
               .a(xp.class, xp::new)
               .a(abm.class, abm::new)
               .a(abn.class, abn::new)
               .a(abo.class, abo::new)
               .a(abp.class, abp::new)
               .a(abq.class, abq::new)
               .a(abr.class, abr::new)
               .a(abs.class, abs::new)
               .a(abt.class, abt::new)
               .a(abu.class, abu::new)
               .a(abv.class, abv::new)
               .a(abw.class, abw::new)
               .a(abx.class, abx::new)
               .a(aby.class, aby::new)
               .a(abz.class, abz::new)
               .a(aca.class, aca::new)
               .a(acb.class, acb::new)
               .a(acc.class, acc::new)
               .a(acd.class, acd::new)
               .a(ace.class, ace::new)
               .a(acf.class, acf::new)
               .a(acg.class, acg::new)
               .a(ach.class, ach::new)
               .a(aci.class, aci::new)
               .a(acj.class, acj::new)
               .a(ack.class, ack::new)
               .a(acl.class, acl::new)
               .a(acm.class, acm::new)
               .a(acn.class, acn::new)
               .a(aco.class, aco::new)
               .a(acp.class, acp::new)
               .a(acq.class, acq::new)
               .a(acr.class, acr::new)
               .a(acs.class, acs::new)
               .a(act.class, act::new)
               .a(acu.class, acu::new)
               .a(acv.class, acv::new)
               .a(acw.class, acw::new)
               .a(acx.class, acx::new)
               .a(acy.class, acy::new)
               .a(acz.class, acz::new)
               .a(ada.class, ada::new)
               .a(adb.class, adb::new)
               .a(adc.class, adc::new)
               .a(add.class, add::new)
               .a(ade.class, ade::new)
               .a(adf.class, adf::new)
               .a(adg.class, adg::new)
               .a(xq.class, xq::new)
         )
         .a(
            xh.a,
            new ui.b<adk>()
               .a(adn.class, adn::new)
               .a(ado.class, ado::new)
               .a(adp.class, adp::new)
               .a(adq.class, adq::new)
               .a(adr.class, adr::new)
               .a(ads.class, ads::new)
               .a(adt.class, adt::new)
               .a(adu.class, adu::new)
               .a(adv.class, adv::new)
               .a(xs.class, xs::new)
               .a(adw.class, adw::new)
               .a(adx.class, adx::new)
               .a(ady.class, ady::new)
               .a(adz.class, adz::new)
               .a(aea.class, aea::new)
               .a(aeb.class, aeb::new)
               .a(xt.class, xt::new)
               .a(aec.class, aec::new)
               .a(aed.class, aed::new)
               .a(aee.class, aee::new)
               .a(aef.class, aef::new)
               .a(xu.class, xu::new)
               .a(aeg.class, aeg::new)
               .a(aeh.a.class, aeh.a::b)
               .a(aeh.b.class, aeh.b::b)
               .a(aeh.c.class, aeh.c::b)
               .a(aeh.d.class, aeh.d::b)
               .a(aei.class, aei::new)
               .a(aej.class, aej::new)
               .a(aek.class, aek::new)
               .a(agk.class, agk::new)
               .a(ael.class, ael::new)
               .a(aem.class, aem::new)
               .a(aen.class, aen::new)
               .a(aeo.class, aeo::new)
               .a(aep.class, aep::new)
               .a(xv.class, xv::new)
               .a(aeq.class, aeq::new)
               .a(aer.class, aer::new)
               .a(aes.class, aes::new)
               .a(xw.class, xw::new)
               .a(aet.class, aet::new)
               .a(aeu.class, aeu::new)
               .a(aev.class, aev::new)
               .a(aew.class, aew::new)
               .a(aex.class, aex::new)
               .a(aey.class, aey::new)
               .a(aez.class, aez::new)
               .a(afa.class, afa::new)
               .a(afb.class, afb::new)
               .a(afc.class, afc::new)
               .a(afd.class, afd::new)
               .a(afe.class, afe::new)
               .a(aff.class, aff::new)
               .a(afg.class, afg::new)
         )
   ),
   c(
      "status",
      b().a(xh.a, new ui.b<agj>().a(agl.class, agl::new).a(agk.class, agk::new)).a(xh.b, new ui.b<agf>().a(agh.class, agh::new).a(agg.class, agg::new))
   ),
   d(
      "login",
      b()
         .a(xh.b, new ui.b<afn>().a(afs.class, afs::new).a(afq.class, afq::new).a(afp.class, afp::new).a(afr.class, afr::new).a(afo.class, afo::new))
         .a(xh.a, new ui.b<aft>().a(afv.class, afv::new).a(afw.class, afw::new).a(afu.class, afu::b).a(afx.class, afx::new))
   ),
   e(
      "configuration",
      b()
         .a(
            xh.b,
            new ui.b<xj>()
               .a(xk.class, xk::new)
               .a(xl.class, xl::new)
               .a(yv.class, yv::new)
               .a(xm.class, xm::new)
               .a(xn.class, xn::new)
               .a(yw.class, yw::new)
               .a(xo.class, xo::new)
               .a(xp.class, xp::new)
               .a(yx.class, yx::new)
               .a(xq.class, xq::new)
         )
         .a(xh.a, new ui.b<xr>().a(xs.class, xs::new).a(xt.class, xt::new).a(yz.class, yz::new).a(xu.class, xu::new).a(xv.class, xv::new).a(xw.class, xw::new))
   );

   public static final int f = -1;
   private final String g;
   private final Map<xh, ui.a<?>> h;

   private static ui.c b() {
      return new ui.c();
   }

   private ui(String $$0, ui.c $$1) {
      this.g = $$0;
      this.h = $$1.a(this);
   }

   @avu
   public Int2ObjectMap<Class<? extends xg<?>>> a(xh $$0) {
      return this.h.get($$0).d();
   }

   @avu
   public String a() {
      return this.g;
   }

   public ui.a<?> b(xh $$0) {
      return this.h.get($$0);
   }

   public static class a<T extends up> implements xf.b {
      private final ui a;
      private final xh b;
      private final ui.b<T> c;

      public a(ui $$0, xh $$1, ui.b<T> $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      public ui a() {
         return this.a;
      }

      public xh b() {
         return this.b;
      }

      public int a(xg<?> $$0) {
         return this.c.a($$0.getClass());
      }

      @Override
      public xf c() {
         return this.c.a();
      }

      Int2ObjectMap<Class<? extends xg<?>>> d() {
         Int2ObjectMap<Class<? extends xg<?>>> $$0 = new Int2ObjectOpenHashMap();
         this.c.b.forEach(($$1, $$2) -> $$0.put($$2, $$1));
         return $$0;
      }

      @Nullable
      public xg<?> a(int $$0, uj $$1) {
         return this.c.a($$0, $$1);
      }

      public boolean b(xg<?> $$0) {
         return this.c.b($$0.getClass());
      }
   }

   static class b<T extends up> {
      private static final Logger a = LogUtils.getLogger();
      final Object2IntMap<Class<? extends xg<? super T>>> b = ac.a(new Object2IntOpenHashMap(), $$0 -> $$0.defaultReturnValue(-1));
      private final List<Function<uj, ? extends xg<? super T>>> c = Lists.newArrayList();
      private xf d = xf.b;
      private final Set<Class<? extends xg<T>>> e = new HashSet<>();

      public <P extends xg<? super T>> ui.b<T> a(Class<P> $$0, Function<uj, P> $$1) {
         int $$2 = this.c.size();
         int $$3 = this.b.put($$0, $$2);
         if ($$3 != -1) {
            String $$4 = "Packet " + $$0 + " is already registered to ID " + $$3;
            a.error(LogUtils.FATAL_MARKER, $$4);
            throw new IllegalArgumentException($$4);
         } else {
            this.c.add($$1);
            return this;
         }
      }

      public <P extends xe<T>> ui.b<T> b(Class<P> $$0, Function<Iterable<xg<T>>, P> $$1) {
         if (this.d != xf.b) {
            throw new IllegalStateException("Bundle packet already configured");
         } else {
            xd<T> $$2 = new xd<>();
            this.a(xd.class, $$1x -> $$2);
            this.d = xf.a($$0, $$1, $$2);
            this.e.add($$0);
            return this;
         }
      }

      public int a(Class<?> $$0) {
         return this.b.getInt($$0);
      }

      public boolean b(Class<?> $$0) {
         return this.b.containsKey($$0) || this.e.contains($$0);
      }

      @Nullable
      public xg<?> a(int $$0, uj $$1) {
         Function<uj, ? extends xg<? super T>> $$2 = this.c.get($$0);
         return (xg<?>)($$2 != null ? $$2.apply($$1) : null);
      }

      public xf a() {
         return this.d;
      }
   }

   static class c {
      private final Map<xh, ui.b<?>> a = Maps.newEnumMap(xh.class);

      public <T extends up> ui.c a(xh $$0, ui.b<T> $$1) {
         this.a.put($$0, $$1);
         return this;
      }

      public Map<xh, ui.a<?>> a(ui $$0) {
         Map<xh, ui.a<?>> $$1 = new EnumMap<>(xh.class);

         for (xh $$2 : xh.values()) {
            ui.b<?> $$3 = this.a.get($$2);
            if ($$3 == null) {
               throw new IllegalStateException("Missing packets for flow " + $$2 + " in protocol " + $$0);
            }

            $$1.put($$2, new ui.a<>($$0, $$2, $$3));
         }

         return $$1;
      }
   }
}
