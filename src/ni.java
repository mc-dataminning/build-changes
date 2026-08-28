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
   protected final Set<czg> b;
   protected final cut c;
   protected final Map<alf<ezt>, ezt.a> d;
   protected static final float[] e = new float[]{0.05F, 0.0625F, 0.083333336F, 0.1F};
   private static final float[] f = new float[]{0.02F, 0.022222223F, 0.025F, 0.033333335F, 0.1F};

   protected fcx.a a() {
      jh.b<dfx> $$0 = this.a.e(mh.aR);
      return fde.a(cm.a.a().a(ku.b, kv.a(List.of(new bt($$0.b(dgc.v), cw.d.b(1))))));
   }

   protected fcx.a b() {
      return this.a().invert();
   }

   protected fcx.a c() {
      return fde.a(cm.a.a().a(this.a.e(mh.K), czo.td));
   }

   private fcx.a f() {
      return this.c().or(this.a());
   }

   private fcx.a g() {
      return this.f().invert();
   }

   protected ni(Set<czg> $$0, cut $$1, jh.a $$2) {
      this($$0, $$1, new HashMap<>(), $$2);
   }

   protected ni(Set<czg> $$0, cut $$1, Map<alf<ezt>, ezt.a> $$2, jh.a $$3) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.a = $$3;
   }

   protected <T extends fay<T>> T a(djg $$0, fay<T> $$1) {
      return !this.b.contains($$0.h()) ? $$1.b(fam.c()) : $$1.c();
   }

   protected <T extends fcp<T>> T a(djg $$0, fcp<T> $$1) {
      return !this.b.contains($$0.h()) ? $$1.b(fct.c()) : $$1.d();
   }

   public ezt.a a(djg $$0) {
      return ezt.b().a(this.a($$0, ezs.a().a(fdq.a(1.0F)).a(fab.a($$0))));
   }

   private static ezt.a a(dmm $$0, fcx.a $$1, fae.a<?> $$2) {
      return ezt.b().a(ezs.a().a(fdq.a(1.0F)).a(fab.a($$0).a($$1).a($$2)));
   }

   protected ezt.a a(dmm $$0, fae.a<?> $$1) {
      return a($$0, this.a(), $$1);
   }

   protected ezt.a b(dmm $$0, fae.a<?> $$1) {
      return a($$0, this.c(), $$1);
   }

   protected ezt.a c(dmm $$0, fae.a<?> $$1) {
      return a($$0, this.f(), $$1);
   }

   protected ezt.a a(dmm $$0, djg $$1) {
      return this.a($$0, (fae.a<?>)this.a((djg)$$0, fab.a($$1)));
   }

   protected ezt.a a(djg $$0, fdt $$1) {
      return ezt.b().a(ezs.a().a(fdq.a(1.0F)).a((fae.a<?>)this.a($$0, fab.a($$0).a(fbt.a($$1)))));
   }

   protected ezt.a a(dmm $$0, djg $$1, fdt $$2) {
      return this.a($$0, (fae.a<?>)this.a((djg)$$0, fab.a($$1).a(fbt.a($$2))));
   }

   private ezt.a d(djg $$0) {
      return ezt.b().a(ezs.a().a(this.a()).a(fdq.a(1.0F)).a(fab.a($$0)));
   }

   private ezt.a e(djg $$0) {
      return ezt.b().a(this.a(dmo.gq, ezs.a().a(fdq.a(1.0F)).a(fab.a(dmo.gq)))).a(this.a($$0, ezs.a().a(fdq.a(1.0F)).a(fab.a($$0))));
   }

   protected ezt.a a(dmm $$0) {
      return ezt.b().a(ezs.a().a(fdq.a(1.0F)).a((fae.a<?>)this.a((djg)$$0, fab.a($$0).a(fbt.a(fdq.a(2.0F)).a(fcw.a($$0).a(dr.a.a().a(dtz.b, ebw.c)))))));
   }

   protected <T extends Comparable<T> & bak> ezt.a a(dmm $$0, ebr<T> $$1, T $$2) {
      return ezt.b().a(this.a($$0, ezs.a().a(fdq.a(1.0F)).a(fab.a($$0).a(fcw.a($$0).a(dr.a.a().a($$1, $$2))))));
   }

   protected ezt.a b(dmm $$0) {
      return ezt.b().a(this.a($$0, ezs.a().a(fdq.a(1.0F)).a(fab.a($$0).a(fao.a(fao.b.a).a(kk.g)))));
   }

   protected ezt.a c(dmm $$0) {
      return ezt.b().a(this.a($$0, ezs.a().a(fdq.a(1.0F)).a(fab.a($$0).a(fao.a(fao.b.a).a(kk.g).a(kk.ap).a(kk.as).a(kk.at)))));
   }

   protected ezt.a d(dmm $$0) {
      jh.b<dfx> $$1 = this.a.e(mh.aR);
      return this.a($$0, (fae.a<?>)this.a((djg)$$0, fab.a(czo.pu).a(fbt.a(fdx.a(2.0F, 5.0F))).a(fal.a($$1.b(dgc.x)))));
   }

   protected ezt.a e(dmm $$0) {
      jh.b<dfx> $$1 = this.a.e(mh.aR);
      return this.a($$0, (fae.a<?>)this.a((djg)$$0, fab.a(czo.pp).a(fbt.a(fdx.a(4.0F, 9.0F))).a(fal.a($$1.b(dgc.x)))));
   }

   protected ezt.a f(dmm $$0) {
      jh.b<dfx> $$1 = this.a.e(mh.aR);
      return this.a($$0, (fae.a<?>)this.a((djg)$$0, fab.a(czo.ml).a(fbt.a(fdx.a(4.0F, 5.0F))).a(fal.b($$1.b(dgc.x)))));
   }

   protected ezt.a g(dmm $$0) {
      return ezt.b().a(this.a($$0, ezs.a().a(fdq.a(1.0F)).a(fab.a($$0).a(fao.a(fao.b.a).a(kk.g).a(kk.h).a(kk.q).a(kk.am).a(kk.k)))));
   }

   protected ezt.a h(dmm $$0) {
      return ezt.b().a(ezs.a().a(this.a()).a(fdq.a(1.0F)).a(fab.a($$0).a(fao.a(fao.b.a).a(kk.ar)).a(fan.a($$0).a(dmg.c))));
   }

   protected ezt.a i(dmm $$0) {
      return ezt.b().a(ezs.a().a(fdq.a(1.0F)).a(fab.a($$0).a(this.a()).a(fao.a(fao.b.a).a(kk.ar)).a(fan.a($$0).a(dmg.c)).a(fab.a($$0))));
   }

   protected ezt.a j(dmm $$0) {
      return ezt.b().a(ezs.a().a(fab.a(czo.xH)).a(fcw.a($$0).a(dr.a.a().a(dnk.t_, true))));
   }

   protected ezt.a a(dmm $$0, czg $$1) {
      jh.b<dfx> $$2 = this.a.e(mh.aR);
      return this.a($$0, (fae.a<?>)this.a((djg)$$0, fab.a($$1).a(fal.a($$2.b(dgc.x)))));
   }

   protected ezt.a b(dmm $$0, djg $$1) {
      return this.a($$0, (fae.a<?>)this.a((djg)$$0, fab.a($$1).a(fbt.a(fdx.a(-6.0F, 2.0F))).a(faz.a(ezn.b(0)))));
   }

   protected ezt.a k(dmm $$0) {
      jh.b<dfx> $$1 = this.a.e(mh.aR);
      return this.b($$0, (fae.a<?>)this.a((djg)$$0, fab.a(czo.qj).a(fdc.a(0.125F)).a(fal.a($$1.b(dgc.x), 2))));
   }

   public ezt.a b(dmm $$0, czg $$1) {
      return ezt.b()
         .a(
            this.a(
               $$0,
               ezs.a()
                  .a(fdq.a(1.0F))
                  .a(fab.a($$1).a(dus.c.a(), $$1x -> fbt.a(fdp.a(3, (float)($$1x + 1) / 15.0F)).a(fcw.a($$0).a(dr.a.a().a(dus.c, $$1x.intValue())))))
            )
         );
   }

   public ezt.a c(dmm $$0, czg $$1) {
      return ezt.b().a(this.a($$0, ezs.a().a(fdq.a(1.0F)).a(fab.a($$1).a(fbt.a(fdp.a(3, 0.53333336F))))));
   }

   protected ezt.a b(djg $$0) {
      return ezt.b().a(ezs.a().a(fdq.a(1.0F)).a(this.c()).a(fab.a($$0)));
   }

   protected ezt.a c(djg $$0) {
      return ezt.b().a(ezs.a().a(fdq.a(1.0F)).a(this.f()).a(fab.a($$0)));
   }

   protected ezt.a a(dmm $$0, fcx.a $$1) {
      return ezt.b()
         .a(
            ezs.a()
               .a(
                  (fae.a<?>)this.a(
                     (djg)$$0,
                     fab.a($$0)
                        .a($$1)
                        .a(jb.values(), $$1x -> fbt.a(fdq.a(1.0F), true).a(fcw.a($$0).a(dr.a.a().a(drs.b($$1x), true))))
                        .a(fbt.a(fdq.a(-1.0F), true))
                  )
               )
         );
   }

   protected ezt.a l(dmm $$0) {
      return ezt.b()
         .a(
            ezs.a()
               .a(
                  (fae.a<?>)this.a(
                     (djg)$$0,
                     fab.a($$0).a(jb.values(), $$1 -> fbt.a(fdq.a(1.0F), true).a(fcw.a($$0).a(dr.a.a().a(drs.b($$1), true)))).a(fbt.a(fdq.a(-1.0F), true))
                  )
               )
         );
   }

   protected ezt.a m(dmm $$0) {
      return ezt.b().a(ezs.a().a((fae.a<?>)this.a($$0, fab.a($$0).a(fcw.a($$0).a(dr.a.a().a(drq.b, true))))));
   }

   protected ezt.a a(dmm $$0, dmm $$1, float... $$2) {
      jh.b<dfx> $$3 = this.a.e(mh.aR);
      return this.c($$0, ((fag.a)this.a((djg)$$0, fab.a($$1))).a(fcm.a($$3.b(dgc.x), $$2)))
         .a(ezs.a().a(fdq.a(1.0F)).a(this.g()).a(((fag.a)this.a((djg)$$0, fab.a(czo.qe).a(fbt.a(fdx.a(1.0F, 2.0F))))).a(fcm.a($$3.b(dgc.x), f))));
   }

   protected ezt.a b(dmm $$0, dmm $$1, float... $$2) {
      jh.b<dfx> $$3 = this.a.e(mh.aR);
      return this.a($$0, $$1, $$2)
         .a(
            ezs.a()
               .a(fdq.a(1.0F))
               .a(this.g())
               .a(((fag.a)this.a((djg)$$0, fab.a(czo.pi))).a(fcm.a($$3.b(dgc.x), 0.005F, 0.0055555557F, 0.00625F, 0.008333334F, 0.025F)))
         );
   }

   protected ezt.a n(dmm $$0) {
      jh.b<dfx> $$1 = this.a.e(mh.aR);
      return this.c($$0, ((fag.a)this.a((djg)dmo.aS, fab.a(czo.qe).a(fbt.a(fdx.a(1.0F, 2.0F))))).a(fcm.a($$1.b(dgc.x), f)));
   }

   protected ezt.a a(dmm $$0, czg $$1, czg $$2, fcx.a $$3) {
      jh.b<dfx> $$4 = this.a.e(mh.aR);
      return this.a((djg)$$0, ezt.b().a(ezs.a().a(fab.a($$1).a($$3).a(fab.a($$2)))).a(ezs.a().a($$3).a(fab.a($$2).a(fal.a($$4.b(dgc.x), 0.5714286F, 3)))));
   }

   protected ezt.a o(dmm $$0) {
      return ezt.b().a(ezs.a().a(this.c()).a(fab.a($$0).a(fbt.a(fdq.a(2.0F)))));
   }

   protected ezt.a a(dmm $$0, dmm $$1) {
      jh.b<dmm> $$2 = this.a.e(mh.i);
      fae.a<?> $$3 = fab.a($$1).a(fbt.a(fdq.a(2.0F))).a(this.c()).a(((fag.a)this.a((djg)$$0, fab.a(czo.qj))).a(fdc.a(0.125F)));
      return ezt.b()
         .a(ezs.a().a($$3).a(fcw.a($$0).a(dr.a.a().a(dov.b, ebk.b))).a(fcv.a(cu.a.a().a(az.a.a().a($$2, $$0).a(dr.a.a().a(dov.b, ebk.a))), new iv(0, 1, 0))))
         .a(ezs.a().a($$3).a(fcw.a($$0).a(dr.a.a().a(dov.b, ebk.a))).a(fcv.a(cu.a.a().a(az.a.a().a($$2, $$0).a(dr.a.a().a(dov.b, ebk.b))), new iv(0, -1, 0))));
   }

   protected ezt.a p(dmm $$0) {
      return ezt.b()
         .a(
            ezs.a()
               .a(fdq.a(1.0F))
               .a(
                  (fae.a<?>)this.a(
                     $$0, fab.a($$0).a(List.of(2, 3, 4), $$1 -> fbt.a(fdq.a((float)$$1.intValue())).a(fcw.a($$0).a(dr.a.a().a(dnd.f, $$1.intValue()))))
                  )
               )
         );
   }

   public ezt.a q(dmm $$0) {
      return $$0 instanceof dtt $$1
         ? ezt.b()
            .a(
               ezs.a()
                  .a(fdq.a(1.0F))
                  .a(
                     (fae.a<?>)this.a(
                        $$0,
                        fab.a($$0)
                           .a(
                              IntStream.rangeClosed(1, 4).boxed().toList(),
                              $$2 -> fbt.a(fdq.a((float)$$2.intValue())).a(fcw.a($$0).a(dr.a.a().a($$1.c(), $$2.intValue())))
                           )
                     )
                  )
            )
         : d();
   }

   protected static ezt.a r(dmm $$0) {
      return ezt.b().a(ezs.a().a(fdq.a(1.0F)).a(fab.a($$0)));
   }

   public static ezt.a d() {
      return ezt.b();
   }

   protected abstract void e();

   @Override
   public void generate(BiConsumer<alf<ezt>, ezt.a> $$0) {
      this.e();
      Set<alf<ezt>> $$1 = new HashSet<>();

      for (dmm $$2 : mg.e) {
         if ($$2.a(this.c)) {
            $$2.u().ifPresent($$3 -> {
               if ($$1.add((alf<ezt>)$$3)) {
                  ezt.a $$4 = this.d.remove($$3);
                  if ($$4 == null) {
                     throw new IllegalStateException(String.format(Locale.ROOT, "Missing loottable '%s' for '%s'", $$3.a(), mg.e.b($$2)));
                  }

                  $$0.accept((alf<ezt>)$$3, $$4);
               }
            });
         }
      }

      if (!this.d.isEmpty()) {
         throw new IllegalStateException("Created block loot tables for non-blocks: " + this.d.keySet());
      }
   }

   protected void b(dmm $$0, dmm $$1) {
      jh.b<dfx> $$2 = this.a.e(mh.aR);
      ezt.a $$3 = this.c($$0, fab.a($$0).a(fcm.a($$2.b(dgc.x), 0.33F, 0.55F, 0.77F, 1.0F)));
      this.a($$0, $$3);
      this.a($$1, $$3);
   }

   protected ezt.a s(dmm $$0) {
      return this.a($$0, dot.c, ebk.b);
   }

   protected void t(dmm $$0) {
      this.a($$0, $$0x -> this.e((djg)((dpt)$$0x).b()));
   }

   protected void c(dmm $$0, dmm $$1) {
      this.a($$0, this.d((djg)$$1));
   }

   protected void c(dmm $$0, djg $$1) {
      this.a($$0, this.a($$1));
   }

   protected void u(dmm $$0) {
      this.c($$0, $$0);
   }

   protected void v(dmm $$0) {
      this.c($$0, (djg)$$0);
   }

   protected void a(dmm $$0, Function<dmm, ezt.a> $$1) {
      this.a($$0, $$1.apply($$0));
   }

   protected void a(dmm $$0, ezt.a $$1) {
      this.d.put($$0.u().orElseThrow(() -> new IllegalStateException("Block " + $$0 + " does not have loot table")), $$1);
   }
}
