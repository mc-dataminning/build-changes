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
   protected final Set<czu> b;
   protected final cvh c;
   protected final Map<alh<fam>, fam.a> d;
   protected static final float[] e = new float[]{0.05F, 0.0625F, 0.083333336F, 0.1F};
   private static final float[] f = new float[]{0.02F, 0.022222223F, 0.025F, 0.033333335F, 0.1F};

   protected fdq.a a() {
      jh.b<dgl> $$0 = this.a.e(mh.aR);
      return fdx.a(cm.a.a().a(ku.b, kv.a(List.of(new bt($$0.b(dgq.v), cw.d.b(1))))));
   }

   protected fdq.a b() {
      return this.a().invert();
   }

   protected fdq.a c() {
      return fdx.a(cm.a.a().a(this.a.e(mh.K), dac.td));
   }

   private fdq.a f() {
      return this.c().or(this.a());
   }

   private fdq.a g() {
      return this.f().invert();
   }

   protected ni(Set<czu> $$0, cvh $$1, jh.a $$2) {
      this($$0, $$1, new HashMap<>(), $$2);
   }

   protected ni(Set<czu> $$0, cvh $$1, Map<alh<fam>, fam.a> $$2, jh.a $$3) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.a = $$3;
   }

   protected <T extends fbr<T>> T a(djw $$0, fbr<T> $$1) {
      return !this.b.contains($$0.h()) ? $$1.b(fbf.c()) : $$1.c();
   }

   protected <T extends fdi<T>> T a(djw $$0, fdi<T> $$1) {
      return !this.b.contains($$0.h()) ? $$1.b(fdm.c()) : $$1.d();
   }

   public fam.a a(djw $$0) {
      return fam.b().a(this.a($$0, fal.a().a(fej.a(1.0F)).a(fau.a($$0))));
   }

   private static fam.a a(dnc $$0, fdq.a $$1, fax.a<?> $$2) {
      return fam.b().a(fal.a().a(fej.a(1.0F)).a(fau.a($$0).a($$1).a($$2)));
   }

   protected fam.a a(dnc $$0, fax.a<?> $$1) {
      return a($$0, this.a(), $$1);
   }

   protected fam.a b(dnc $$0, fax.a<?> $$1) {
      return a($$0, this.c(), $$1);
   }

   protected fam.a c(dnc $$0, fax.a<?> $$1) {
      return a($$0, this.f(), $$1);
   }

   protected fam.a a(dnc $$0, djw $$1) {
      return this.a($$0, (fax.a<?>)this.a((djw)$$0, fau.a($$1)));
   }

   protected fam.a a(djw $$0, fem $$1) {
      return fam.b().a(fal.a().a(fej.a(1.0F)).a((fax.a<?>)this.a($$0, fau.a($$0).a(fcm.a($$1)))));
   }

   protected fam.a a(dnc $$0, djw $$1, fem $$2) {
      return this.a($$0, (fax.a<?>)this.a((djw)$$0, fau.a($$1).a(fcm.a($$2))));
   }

   private fam.a d(djw $$0) {
      return fam.b().a(fal.a().a(this.a()).a(fej.a(1.0F)).a(fau.a($$0)));
   }

   private fam.a e(djw $$0) {
      return fam.b().a(this.a(dne.gq, fal.a().a(fej.a(1.0F)).a(fau.a(dne.gq)))).a(this.a($$0, fal.a().a(fej.a(1.0F)).a(fau.a($$0))));
   }

   protected fam.a a(dnc $$0) {
      return fam.b().a(fal.a().a(fej.a(1.0F)).a((fax.a<?>)this.a((djw)$$0, fau.a($$0).a(fcm.a(fej.a(2.0F)).a(fdp.a($$0).a(dr.a.a().a(dup.b, ecm.c)))))));
   }

   protected <T extends Comparable<T> & bam> fam.a a(dnc $$0, ech<T> $$1, T $$2) {
      return fam.b().a(this.a($$0, fal.a().a(fej.a(1.0F)).a(fau.a($$0).a(fdp.a($$0).a(dr.a.a().a($$1, $$2))))));
   }

   protected fam.a b(dnc $$0) {
      return fam.b().a(this.a($$0, fal.a().a(fej.a(1.0F)).a(fau.a($$0).a(fbh.a(fbh.b.a).a(kk.g)))));
   }

   protected fam.a c(dnc $$0) {
      return fam.b().a(this.a($$0, fal.a().a(fej.a(1.0F)).a(fau.a($$0).a(fbh.a(fbh.b.a).a(kk.g).a(kk.ap).a(kk.as).a(kk.at)))));
   }

   protected fam.a d(dnc $$0) {
      jh.b<dgl> $$1 = this.a.e(mh.aR);
      return this.a($$0, (fax.a<?>)this.a((djw)$$0, fau.a(dac.pu).a(fcm.a(feq.a(2.0F, 5.0F))).a(fbe.a($$1.b(dgq.x)))));
   }

   protected fam.a e(dnc $$0) {
      jh.b<dgl> $$1 = this.a.e(mh.aR);
      return this.a($$0, (fax.a<?>)this.a((djw)$$0, fau.a(dac.pp).a(fcm.a(feq.a(4.0F, 9.0F))).a(fbe.a($$1.b(dgq.x)))));
   }

   protected fam.a f(dnc $$0) {
      jh.b<dgl> $$1 = this.a.e(mh.aR);
      return this.a($$0, (fax.a<?>)this.a((djw)$$0, fau.a(dac.ml).a(fcm.a(feq.a(4.0F, 5.0F))).a(fbe.b($$1.b(dgq.x)))));
   }

   protected fam.a g(dnc $$0) {
      return fam.b().a(this.a($$0, fal.a().a(fej.a(1.0F)).a(fau.a($$0).a(fbh.a(fbh.b.a).a(kk.g).a(kk.h).a(kk.q).a(kk.am).a(kk.k)))));
   }

   protected fam.a h(dnc $$0) {
      return fam.b().a(fal.a().a(this.a()).a(fej.a(1.0F)).a(fau.a($$0).a(fbh.a(fbh.b.a).a(kk.ar)).a(fbg.a($$0).a(dmw.c))));
   }

   protected fam.a i(dnc $$0) {
      return fam.b().a(fal.a().a(fej.a(1.0F)).a(fau.a($$0).a(this.a()).a(fbh.a(fbh.b.a).a(kk.ar)).a(fbg.a($$0).a(dmw.c)).a(fau.a($$0))));
   }

   protected fam.a j(dnc $$0) {
      return fam.b().a(fal.a().a(fau.a(dac.xH)).a(fdp.a($$0).a(dr.a.a().a(doa.r_, true))));
   }

   protected fam.a a(dnc $$0, czu $$1) {
      jh.b<dgl> $$2 = this.a.e(mh.aR);
      return this.a($$0, (fax.a<?>)this.a((djw)$$0, fau.a($$1).a(fbe.a($$2.b(dgq.x)))));
   }

   protected fam.a b(dnc $$0, djw $$1) {
      return this.a($$0, (fax.a<?>)this.a((djw)$$0, fau.a($$1).a(fcm.a(feq.a(-6.0F, 2.0F))).a(fbs.a(fag.b(0)))));
   }

   protected fam.a k(dnc $$0) {
      jh.b<dgl> $$1 = this.a.e(mh.aR);
      return this.b($$0, (fax.a<?>)this.a((djw)$$0, fau.a(dac.qj).a(fdv.a(0.125F)).a(fbe.a($$1.b(dgq.x), 2))));
   }

   public fam.a b(dnc $$0, czu $$1) {
      return fam.b()
         .a(
            this.a(
               $$0,
               fal.a()
                  .a(fej.a(1.0F))
                  .a(fau.a($$1).a(dvi.c.a(), $$1x -> fcm.a(fei.a(3, (float)($$1x + 1) / 15.0F)).a(fdp.a($$0).a(dr.a.a().a(dvi.c, $$1x.intValue())))))
            )
         );
   }

   public fam.a c(dnc $$0, czu $$1) {
      return fam.b().a(this.a($$0, fal.a().a(fej.a(1.0F)).a(fau.a($$1).a(fcm.a(fei.a(3, 0.53333336F))))));
   }

   protected fam.a b(djw $$0) {
      return fam.b().a(fal.a().a(fej.a(1.0F)).a(this.c()).a(fau.a($$0)));
   }

   protected fam.a c(djw $$0) {
      return fam.b().a(fal.a().a(fej.a(1.0F)).a(this.f()).a(fau.a($$0)));
   }

   protected fam.a a(dnc $$0, fdq.a $$1) {
      return fam.b()
         .a(
            fal.a()
               .a(
                  (fax.a<?>)this.a(
                     (djw)$$0,
                     fau.a($$0)
                        .a($$1)
                        .a(jb.values(), $$1x -> fcm.a(fej.a(1.0F), true).a(fdp.a($$0).a(dr.a.a().a(dsi.b($$1x), true))))
                        .a(fcm.a(fej.a(-1.0F), true))
                  )
               )
         );
   }

   protected fam.a l(dnc $$0) {
      return fam.b()
         .a(
            fal.a()
               .a(
                  (fax.a<?>)this.a(
                     (djw)$$0,
                     fau.a($$0).a(jb.values(), $$1 -> fcm.a(fej.a(1.0F), true).a(fdp.a($$0).a(dr.a.a().a(dsi.b($$1), true)))).a(fcm.a(fej.a(-1.0F), true))
                  )
               )
         );
   }

   protected fam.a m(dnc $$0) {
      return fam.b().a(fal.a().a((fax.a<?>)this.a($$0, fau.a($$0).a(fdp.a($$0).a(dr.a.a().a(dsg.b, true))))));
   }

   protected fam.a a(dnc $$0, dnc $$1, float... $$2) {
      jh.b<dgl> $$3 = this.a.e(mh.aR);
      return this.c($$0, ((faz.a)this.a((djw)$$0, fau.a($$1))).a(fdf.a($$3.b(dgq.x), $$2)))
         .a(fal.a().a(fej.a(1.0F)).a(this.g()).a(((faz.a)this.a((djw)$$0, fau.a(dac.qe).a(fcm.a(feq.a(1.0F, 2.0F))))).a(fdf.a($$3.b(dgq.x), f))));
   }

   protected fam.a b(dnc $$0, dnc $$1, float... $$2) {
      jh.b<dgl> $$3 = this.a.e(mh.aR);
      return this.a($$0, $$1, $$2)
         .a(
            fal.a()
               .a(fej.a(1.0F))
               .a(this.g())
               .a(((faz.a)this.a((djw)$$0, fau.a(dac.pi))).a(fdf.a($$3.b(dgq.x), 0.005F, 0.0055555557F, 0.00625F, 0.008333334F, 0.025F)))
         );
   }

   protected fam.a n(dnc $$0) {
      jh.b<dgl> $$1 = this.a.e(mh.aR);
      return this.c($$0, ((faz.a)this.a((djw)dne.aS, fau.a(dac.qe).a(fcm.a(feq.a(1.0F, 2.0F))))).a(fdf.a($$1.b(dgq.x), f)));
   }

   protected fam.a a(dnc $$0, czu $$1, czu $$2, fdq.a $$3) {
      jh.b<dgl> $$4 = this.a.e(mh.aR);
      return this.a((djw)$$0, fam.b().a(fal.a().a(fau.a($$1).a($$3).a(fau.a($$2)))).a(fal.a().a($$3).a(fau.a($$2).a(fbe.a($$4.b(dgq.x), 0.5714286F, 3)))));
   }

   protected fam.a o(dnc $$0) {
      return fam.b().a(fal.a().a(this.c()).a(fau.a($$0).a(fcm.a(fej.a(2.0F)))));
   }

   protected fam.a a(dnc $$0, dnc $$1) {
      jh.b<dnc> $$2 = this.a.e(mh.i);
      fax.a<?> $$3 = fau.a($$1).a(fcm.a(fej.a(2.0F))).a(this.c()).a(((faz.a)this.a((djw)$$0, fau.a(dac.qj))).a(fdv.a(0.125F)));
      return fam.b()
         .a(fal.a().a($$3).a(fdp.a($$0).a(dr.a.a().a(dpl.b, eca.b))).a(fdo.a(cu.a.a().a(az.a.a().a($$2, $$0).a(dr.a.a().a(dpl.b, eca.a))), new iv(0, 1, 0))))
         .a(fal.a().a($$3).a(fdp.a($$0).a(dr.a.a().a(dpl.b, eca.a))).a(fdo.a(cu.a.a().a(az.a.a().a($$2, $$0).a(dr.a.a().a(dpl.b, eca.b))), new iv(0, -1, 0))));
   }

   protected fam.a p(dnc $$0) {
      return fam.b()
         .a(
            fal.a()
               .a(fej.a(1.0F))
               .a(
                  (fax.a<?>)this.a(
                     $$0, fau.a($$0).a(List.of(2, 3, 4), $$1 -> fcm.a(fej.a((float)$$1.intValue())).a(fdp.a($$0).a(dr.a.a().a(dnt.f, $$1.intValue()))))
                  )
               )
         );
   }

   public fam.a q(dnc $$0) {
      return $$0 instanceof duj $$1
         ? fam.b()
            .a(
               fal.a()
                  .a(fej.a(1.0F))
                  .a(
                     (fax.a<?>)this.a(
                        $$0,
                        fau.a($$0)
                           .a(
                              IntStream.rangeClosed(1, 4).boxed().toList(),
                              $$2 -> fcm.a(fej.a((float)$$2.intValue())).a(fdp.a($$0).a(dr.a.a().a($$1.c(), $$2.intValue())))
                           )
                     )
                  )
            )
         : d();
   }

   protected static fam.a r(dnc $$0) {
      return fam.b().a(fal.a().a(fej.a(1.0F)).a(fau.a($$0)));
   }

   public static fam.a d() {
      return fam.b();
   }

   protected abstract void e();

   @Override
   public void generate(BiConsumer<alh<fam>, fam.a> $$0) {
      this.e();
      Set<alh<fam>> $$1 = new HashSet<>();

      for (dnc $$2 : mg.e) {
         if ($$2.a(this.c)) {
            $$2.u().ifPresent($$3 -> {
               if ($$1.add((alh<fam>)$$3)) {
                  fam.a $$4 = this.d.remove($$3);
                  if ($$4 == null) {
                     throw new IllegalStateException(String.format(Locale.ROOT, "Missing loottable '%s' for '%s'", $$3.a(), mg.e.b($$2)));
                  }

                  $$0.accept((alh<fam>)$$3, $$4);
               }
            });
         }
      }

      if (!this.d.isEmpty()) {
         throw new IllegalStateException("Created block loot tables for non-blocks: " + this.d.keySet());
      }
   }

   protected void b(dnc $$0, dnc $$1) {
      jh.b<dgl> $$2 = this.a.e(mh.aR);
      fam.a $$3 = this.c($$0, fau.a($$0).a(fdf.a($$2.b(dgq.x), 0.33F, 0.55F, 0.77F, 1.0F)));
      this.a($$0, $$3);
      this.a($$1, $$3);
   }

   protected fam.a s(dnc $$0) {
      return this.a($$0, dpj.c, eca.b);
   }

   protected void t(dnc $$0) {
      this.a($$0, $$0x -> this.e((djw)((dqj)$$0x).b()));
   }

   protected void c(dnc $$0, dnc $$1) {
      this.a($$0, this.d((djw)$$1));
   }

   protected void c(dnc $$0, djw $$1) {
      this.a($$0, this.a($$1));
   }

   protected void u(dnc $$0) {
      this.c($$0, $$0);
   }

   protected void v(dnc $$0) {
      this.c($$0, (djw)$$0);
   }

   protected void a(dnc $$0, Function<dnc, fam.a> $$1) {
      this.a($$0, $$1.apply($$0));
   }

   protected void a(dnc $$0, fam.a $$1) {
      this.d.put($$0.u().orElseThrow(() -> new IllegalStateException("Block " + $$0 + " does not have loot table")), $$1);
   }
}
