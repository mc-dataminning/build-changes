import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.stream.IntStream;

public abstract class ni implements nl {
   protected final jh.a a;
   protected final Set<czj> b;
   protected final cuw c;
   protected final Map<alf<ezy>, ezy.a> d;
   protected static final float[] e = new float[]{0.05F, 0.0625F, 0.083333336F, 0.1F};
   private static final float[] f = new float[]{0.02F, 0.022222223F, 0.025F, 0.033333335F, 0.1F};

   protected fdc.a a() {
      jh.b<dga> $$0 = this.a.e(mh.aR);
      return fdj.a(cm.a.a().a(ku.b, kv.a(List.of(new bt($$0.b(dgf.v), cw.d.b(1))))));
   }

   protected fdc.a b() {
      return this.a().invert();
   }

   protected fdc.a c() {
      return fdj.a(cm.a.a().a(this.a.e(mh.K), czr.td));
   }

   private fdc.a f() {
      return this.c().or(this.a());
   }

   private fdc.a g() {
      return this.f().invert();
   }

   protected ni(Set<czj> $$0, cuw $$1, jh.a $$2) {
      this($$0, $$1, new HashMap<>(), $$2);
   }

   protected ni(Set<czj> $$0, cuw $$1, Map<alf<ezy>, ezy.a> $$2, jh.a $$3) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.a = $$3;
   }

   protected <T extends fbd<T>> T a(djl $$0, fbd<T> $$1) {
      return !this.b.contains($$0.h()) ? $$1.b(far.c()) : $$1.c();
   }

   protected <T extends fcu<T>> T a(djl $$0, fcu<T> $$1) {
      return !this.b.contains($$0.h()) ? $$1.b(fcy.c()) : $$1.d();
   }

   public ezy.a a(djl $$0) {
      return ezy.b().a(this.a($$0, ezx.a().a(fdv.a(1.0F)).a(fag.a($$0))));
   }

   private static ezy.a a(dmr $$0, fdc.a $$1, faj.a<?> $$2) {
      return ezy.b().a(ezx.a().a(fdv.a(1.0F)).a(fag.a($$0).a($$1).a($$2)));
   }

   protected ezy.a a(dmr $$0, faj.a<?> $$1) {
      return a($$0, this.a(), $$1);
   }

   protected ezy.a b(dmr $$0, faj.a<?> $$1) {
      return a($$0, this.c(), $$1);
   }

   protected ezy.a c(dmr $$0, faj.a<?> $$1) {
      return a($$0, this.f(), $$1);
   }

   protected ezy.a a(dmr $$0, djl $$1) {
      return this.a($$0, (faj.a<?>)this.a((djl)$$0, fag.a($$1)));
   }

   protected ezy.a a(djl $$0, fdy $$1) {
      return ezy.b().a(ezx.a().a(fdv.a(1.0F)).a((faj.a<?>)this.a($$0, fag.a($$0).a(fby.a($$1)))));
   }

   protected ezy.a a(dmr $$0, djl $$1, fdy $$2) {
      return this.a($$0, (faj.a<?>)this.a((djl)$$0, fag.a($$1).a(fby.a($$2))));
   }

   private ezy.a d(djl $$0) {
      return ezy.b().a(ezx.a().a(this.a()).a(fdv.a(1.0F)).a(fag.a($$0)));
   }

   private ezy.a e(djl $$0) {
      return ezy.b().a(this.a(dmt.gq, ezx.a().a(fdv.a(1.0F)).a(fag.a(dmt.gq)))).a(this.a($$0, ezx.a().a(fdv.a(1.0F)).a(fag.a($$0))));
   }

   protected ezy.a a(dmr $$0) {
      return ezy.b().a(ezx.a().a(fdv.a(1.0F)).a((faj.a<?>)this.a((djl)$$0, fag.a($$0).a(fby.a(fdv.a(2.0F)).a(fdb.a($$0).a(dr.a.a().a(due.b, ecb.c)))))));
   }

   protected <T extends Comparable<T> & bak> ezy.a a(dmr $$0, ebw<T> $$1, T $$2) {
      return ezy.b().a(this.a($$0, ezx.a().a(fdv.a(1.0F)).a(fag.a($$0).a(fdb.a($$0).a(dr.a.a().a($$1, $$2))))));
   }

   protected ezy.a b(dmr $$0) {
      return ezy.b().a(this.a($$0, ezx.a().a(fdv.a(1.0F)).a(fag.a($$0).a(fat.a(fat.b.a).a(kk.g)))));
   }

   protected ezy.a c(dmr $$0) {
      return ezy.b().a(this.a($$0, ezx.a().a(fdv.a(1.0F)).a(fag.a($$0).a(fat.a(fat.b.a).a(kk.g).a(kk.ap).a(kk.as).a(kk.at)))));
   }

   protected ezy.a d(dmr $$0) {
      jh.b<dga> $$1 = this.a.e(mh.aR);
      return this.a($$0, (faj.a<?>)this.a((djl)$$0, fag.a(czr.pu).a(fby.a(fec.a(2.0F, 5.0F))).a(faq.a($$1.b(dgf.x)))));
   }

   protected ezy.a e(dmr $$0) {
      jh.b<dga> $$1 = this.a.e(mh.aR);
      return this.a($$0, (faj.a<?>)this.a((djl)$$0, fag.a(czr.pp).a(fby.a(fec.a(4.0F, 9.0F))).a(faq.a($$1.b(dgf.x)))));
   }

   protected ezy.a f(dmr $$0) {
      jh.b<dga> $$1 = this.a.e(mh.aR);
      return this.a($$0, (faj.a<?>)this.a((djl)$$0, fag.a(czr.ml).a(fby.a(fec.a(4.0F, 5.0F))).a(faq.b($$1.b(dgf.x)))));
   }

   protected ezy.a g(dmr $$0) {
      return ezy.b().a(this.a($$0, ezx.a().a(fdv.a(1.0F)).a(fag.a($$0).a(fat.a(fat.b.a).a(kk.g).a(kk.h).a(kk.q).a(kk.am).a(kk.k)))));
   }

   protected ezy.a h(dmr $$0) {
      return ezy.b().a(ezx.a().a(this.a()).a(fdv.a(1.0F)).a(fag.a($$0).a(fat.a(fat.b.a).a(kk.ar)).a(fas.a($$0).a(dml.c))));
   }

   protected ezy.a i(dmr $$0) {
      return ezy.b().a(ezx.a().a(fdv.a(1.0F)).a(fag.a($$0).a(this.a()).a(fat.a(fat.b.a).a(kk.ar)).a(fas.a($$0).a(dml.c)).a(fag.a($$0))));
   }

   protected ezy.a j(dmr $$0) {
      return ezy.b().a(ezx.a().a(fag.a(czr.xH)).a(fdb.a($$0).a(dr.a.a().a(dnp.t_, true))));
   }

   protected ezy.a a(dmr $$0, czj $$1) {
      jh.b<dga> $$2 = this.a.e(mh.aR);
      return this.a($$0, (faj.a<?>)this.a((djl)$$0, fag.a($$1).a(faq.a($$2.b(dgf.x)))));
   }

   protected ezy.a b(dmr $$0, djl $$1) {
      return this.a($$0, (faj.a<?>)this.a((djl)$$0, fag.a($$1).a(fby.a(fec.a(-6.0F, 2.0F))).a(fbe.a(ezs.b(0)))));
   }

   protected ezy.a k(dmr $$0) {
      jh.b<dga> $$1 = this.a.e(mh.aR);
      return this.b($$0, (faj.a<?>)this.a((djl)$$0, fag.a(czr.qj).a(fdh.a(0.125F)).a(faq.a($$1.b(dgf.x), 2))));
   }

   public ezy.a b(dmr $$0, czj $$1) {
      return ezy.b()
         .a(
            this.a(
               $$0,
               ezx.a()
                  .a(fdv.a(1.0F))
                  .a(fag.a($$1).a(dux.c.a(), $$1x -> fby.a(fdu.a(3, (float)($$1x + 1) / 15.0F)).a(fdb.a($$0).a(dr.a.a().a(dux.c, $$1x.intValue())))))
            )
         );
   }

   public ezy.a c(dmr $$0, czj $$1) {
      return ezy.b().a(this.a($$0, ezx.a().a(fdv.a(1.0F)).a(fag.a($$1).a(fby.a(fdu.a(3, 0.53333336F))))));
   }

   protected ezy.a b(djl $$0) {
      return ezy.b().a(ezx.a().a(fdv.a(1.0F)).a(this.c()).a(fag.a($$0)));
   }

   protected ezy.a c(djl $$0) {
      return ezy.b().a(ezx.a().a(fdv.a(1.0F)).a(this.f()).a(fag.a($$0)));
   }

   protected ezy.a a(dmr $$0, fdc.a $$1) {
      return ezy.b()
         .a(
            ezx.a()
               .a(
                  (faj.a<?>)this.a(
                     (djl)$$0,
                     fag.a($$0)
                        .a($$1)
                        .a(jb.values(), $$1x -> fby.a(fdv.a(1.0F), true).a(fdb.a($$0).a(dr.a.a().a(drx.b($$1x), true))))
                        .a(fby.a(fdv.a(-1.0F), true))
                  )
               )
         );
   }

   protected ezy.a l(dmr $$0) {
      return ezy.b()
         .a(
            ezx.a()
               .a(
                  (faj.a<?>)this.a(
                     (djl)$$0,
                     fag.a($$0).a(jb.values(), $$1 -> fby.a(fdv.a(1.0F), true).a(fdb.a($$0).a(dr.a.a().a(drx.b($$1), true)))).a(fby.a(fdv.a(-1.0F), true))
                  )
               )
         );
   }

   protected ezy.a m(dmr $$0) {
      return ezy.b().a(ezx.a().a((faj.a<?>)this.a($$0, fag.a($$0).a(fdb.a($$0).a(dr.a.a().a(drv.b, true))))));
   }

   protected ezy.a a(dmr $$0, dmr $$1, float... $$2) {
      jh.b<dga> $$3 = this.a.e(mh.aR);
      return this.c($$0, ((fal.a)this.a((djl)$$0, fag.a($$1))).a(fcr.a($$3.b(dgf.x), $$2)))
         .a(ezx.a().a(fdv.a(1.0F)).a(this.g()).a(((fal.a)this.a((djl)$$0, fag.a(czr.qe).a(fby.a(fec.a(1.0F, 2.0F))))).a(fcr.a($$3.b(dgf.x), f))));
   }

   protected ezy.a b(dmr $$0, dmr $$1, float... $$2) {
      jh.b<dga> $$3 = this.a.e(mh.aR);
      return this.a($$0, $$1, $$2)
         .a(
            ezx.a()
               .a(fdv.a(1.0F))
               .a(this.g())
               .a(((fal.a)this.a((djl)$$0, fag.a(czr.pi))).a(fcr.a($$3.b(dgf.x), 0.005F, 0.0055555557F, 0.00625F, 0.008333334F, 0.025F)))
         );
   }

   protected ezy.a n(dmr $$0) {
      jh.b<dga> $$1 = this.a.e(mh.aR);
      return this.c($$0, ((fal.a)this.a((djl)dmt.aS, fag.a(czr.qe).a(fby.a(fec.a(1.0F, 2.0F))))).a(fcr.a($$1.b(dgf.x), f)));
   }

   protected ezy.a a(dmr $$0, czj $$1, czj $$2, fdc.a $$3) {
      jh.b<dga> $$4 = this.a.e(mh.aR);
      return this.a((djl)$$0, ezy.b().a(ezx.a().a(fag.a($$1).a($$3).a(fag.a($$2)))).a(ezx.a().a($$3).a(fag.a($$2).a(faq.a($$4.b(dgf.x), 0.5714286F, 3)))));
   }

   protected ezy.a o(dmr $$0) {
      return ezy.b().a(ezx.a().a(this.c()).a(fag.a($$0).a(fby.a(fdv.a(2.0F)))));
   }

   protected ezy.a a(dmr $$0, dmr $$1) {
      jh.b<dmr> $$2 = this.a.e(mh.i);
      faj.a<?> $$3 = fag.a($$1).a(fby.a(fdv.a(2.0F))).a(this.c()).a(((fal.a)this.a((djl)$$0, fag.a(czr.qj))).a(fdh.a(0.125F)));
      return ezy.b()
         .a(ezx.a().a($$3).a(fdb.a($$0).a(dr.a.a().a(dpa.b, ebp.b))).a(fda.a(cu.a.a().a(az.a.a().a($$2, $$0).a(dr.a.a().a(dpa.b, ebp.a))), new iv(0, 1, 0))))
         .a(ezx.a().a($$3).a(fdb.a($$0).a(dr.a.a().a(dpa.b, ebp.a))).a(fda.a(cu.a.a().a(az.a.a().a($$2, $$0).a(dr.a.a().a(dpa.b, ebp.b))), new iv(0, -1, 0))));
   }

   protected ezy.a p(dmr $$0) {
      return ezy.b()
         .a(
            ezx.a()
               .a(fdv.a(1.0F))
               .a(
                  (faj.a<?>)this.a(
                     $$0, fag.a($$0).a(List.of(2, 3, 4), $$1 -> fby.a(fdv.a((float)$$1.intValue())).a(fdb.a($$0).a(dr.a.a().a(dni.f, $$1.intValue()))))
                  )
               )
         );
   }

   public ezy.a q(dmr $$0) {
      return $$0 instanceof dty $$1
         ? ezy.b()
            .a(
               ezx.a()
                  .a(fdv.a(1.0F))
                  .a(
                     (faj.a<?>)this.a(
                        $$0,
                        fag.a($$0)
                           .a(
                              IntStream.rangeClosed(1, 4).boxed().toList(),
                              $$2 -> fby.a(fdv.a((float)$$2.intValue())).a(fdb.a($$0).a(dr.a.a().a($$1.c(), $$2.intValue())))
                           )
                     )
                  )
            )
         : d();
   }

   protected static ezy.a r(dmr $$0) {
      return ezy.b().a(ezx.a().a(fdv.a(1.0F)).a(fag.a($$0)));
   }

   public static ezy.a d() {
      return ezy.b();
   }

   protected abstract void e();

   @Override
   public void generate(BiConsumer<alf<ezy>, ezy.a> $$0) {
      this.e();
      Set<alf<ezy>> $$1 = new HashSet<>();

      for (dmr $$2 : mg.e) {
         if ($$2.a(this.c)) {
            $$2.u().ifPresent($$3 -> {
               if ($$1.add((alf<ezy>)$$3)) {
                  ezy.a $$4 = this.d.remove($$3);
                  if ($$4 == null) {
                     throw new IllegalStateException(String.format(Locale.ROOT, "Missing loottable '%s' for '%s'", $$3.a(), mg.e.b($$2)));
                  }

                  $$0.accept((alf<ezy>)$$3, $$4);
               }
            });
         }
      }

      if (!this.d.isEmpty()) {
         throw new IllegalStateException("Created block loot tables for non-blocks: " + this.d.keySet());
      }
   }

   protected void b(dmr $$0, dmr $$1) {
      jh.b<dga> $$2 = this.a.e(mh.aR);
      ezy.a $$3 = this.c($$0, fag.a($$0).a(fcr.a($$2.b(dgf.x), 0.33F, 0.55F, 0.77F, 1.0F)));
      this.a($$0, $$3);
      this.a($$1, $$3);
   }

   protected ezy.a s(dmr $$0) {
      return this.a($$0, doy.c, ebp.b);
   }

   protected void t(dmr $$0) {
      this.a($$0, $$0x -> this.e((djl)((dpy)$$0x).b()));
   }

   protected void c(dmr $$0, dmr $$1) {
      this.a($$0, this.d((djl)$$1));
   }

   protected void c(dmr $$0, djl $$1) {
      this.a($$0, this.a($$1));
   }

   protected void u(dmr $$0) {
      this.c($$0, $$0);
   }

   protected void v(dmr $$0) {
      this.c($$0, (djl)$$0);
   }

   protected void a(dmr $$0, Function<dmr, ezy.a> $$1) {
      this.a($$0, $$1.apply($$0));
   }

   protected void a(dmr $$0, ezy.a $$1) {
      this.d.put($$0.u().orElseThrow(() -> new IllegalStateException("Block " + $$0 + " does not have loot table")), $$1);
   }
}
