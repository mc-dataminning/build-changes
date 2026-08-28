import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.stream.IntStream;

public abstract class nj implements nm {
   protected final ji.a a;
   protected final Set<czw> b;
   protected final cvj c;
   protected final Map<alj<fao>, fao.a> d;
   protected static final float[] e = new float[]{0.05F, 0.0625F, 0.083333336F, 0.1F};
   private static final float[] f = new float[]{0.02F, 0.022222223F, 0.025F, 0.033333335F, 0.1F};

   protected fds.a a() {
      return fdz.a(cn.a.a().a(bo.a.a().a(kv.b, kw.a(List.of(new bu(this.a.e(mi.aR).b(dgs.v), cx.d.b(1))))).b()));
   }

   protected fds.a b() {
      return this.a().invert();
   }

   protected fds.a c() {
      return fdz.a(cn.a.a().a(this.a.e(mi.K), dae.td));
   }

   private fds.a f() {
      return this.c().or(this.a());
   }

   private fds.a g() {
      return this.f().invert();
   }

   protected nj(Set<czw> $$0, cvj $$1, ji.a $$2) {
      this($$0, $$1, new HashMap<>(), $$2);
   }

   protected nj(Set<czw> $$0, cvj $$1, Map<alj<fao>, fao.a> $$2, ji.a $$3) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.a = $$3;
   }

   protected <T extends fbt<T>> T a(djy $$0, fbt<T> $$1) {
      return !this.b.contains($$0.h()) ? $$1.b(fbh.c()) : $$1.c();
   }

   protected <T extends fdk<T>> T a(djy $$0, fdk<T> $$1) {
      return !this.b.contains($$0.h()) ? $$1.b(fdo.c()) : $$1.d();
   }

   public fao.a a(djy $$0) {
      return fao.b().a(this.a($$0, fan.a().a(fel.a(1.0F)).a(faw.a($$0))));
   }

   private static fao.a a(dne $$0, fds.a $$1, faz.a<?> $$2) {
      return fao.b().a(fan.a().a(fel.a(1.0F)).a(faw.a($$0).a($$1).a($$2)));
   }

   protected fao.a a(dne $$0, faz.a<?> $$1) {
      return a($$0, this.a(), $$1);
   }

   protected fao.a b(dne $$0, faz.a<?> $$1) {
      return a($$0, this.c(), $$1);
   }

   protected fao.a c(dne $$0, faz.a<?> $$1) {
      return a($$0, this.f(), $$1);
   }

   protected fao.a a(dne $$0, djy $$1) {
      return this.a($$0, (faz.a<?>)this.a((djy)$$0, faw.a($$1)));
   }

   protected fao.a a(djy $$0, feo $$1) {
      return fao.b().a(fan.a().a(fel.a(1.0F)).a((faz.a<?>)this.a($$0, faw.a($$0).a(fco.a($$1)))));
   }

   protected fao.a a(dne $$0, djy $$1, feo $$2) {
      return this.a($$0, (faz.a<?>)this.a((djy)$$0, faw.a($$1).a(fco.a($$2))));
   }

   private fao.a d(djy $$0) {
      return fao.b().a(fan.a().a(this.a()).a(fel.a(1.0F)).a(faw.a($$0)));
   }

   private fao.a e(djy $$0) {
      return fao.b().a(this.a(dng.gq, fan.a().a(fel.a(1.0F)).a(faw.a(dng.gq)))).a(this.a($$0, fan.a().a(fel.a(1.0F)).a(faw.a($$0))));
   }

   protected fao.a a(dne $$0) {
      return fao.b().a(fan.a().a(fel.a(1.0F)).a((faz.a<?>)this.a((djy)$$0, faw.a($$0).a(fco.a(fel.a(2.0F)).a(fdr.a($$0).a(ds.a.a().a(dur.b, eco.c)))))));
   }

   protected <T extends Comparable<T> & bao> fao.a a(dne $$0, ecj<T> $$1, T $$2) {
      return fao.b().a(this.a($$0, fan.a().a(fel.a(1.0F)).a(faw.a($$0).a(fdr.a($$0).a(ds.a.a().a($$1, $$2))))));
   }

   protected fao.a b(dne $$0) {
      return fao.b().a(this.a($$0, fan.a().a(fel.a(1.0F)).a(faw.a($$0).a(fbj.a(fbj.b.a).a(kl.g)))));
   }

   protected fao.a c(dne $$0) {
      return fao.b().a(this.a($$0, fan.a().a(fel.a(1.0F)).a(faw.a($$0).a(fbj.a(fbj.b.a).a(kl.g).a(kl.ap).a(kl.as).a(kl.at)))));
   }

   protected fao.a d(dne $$0) {
      ji.b<dgn> $$1 = this.a.e(mi.aR);
      return this.a($$0, (faz.a<?>)this.a((djy)$$0, faw.a(dae.pu).a(fco.a(fes.a(2.0F, 5.0F))).a(fbg.a($$1.b(dgs.x)))));
   }

   protected fao.a e(dne $$0) {
      ji.b<dgn> $$1 = this.a.e(mi.aR);
      return this.a($$0, (faz.a<?>)this.a((djy)$$0, faw.a(dae.pp).a(fco.a(fes.a(4.0F, 9.0F))).a(fbg.a($$1.b(dgs.x)))));
   }

   protected fao.a f(dne $$0) {
      ji.b<dgn> $$1 = this.a.e(mi.aR);
      return this.a($$0, (faz.a<?>)this.a((djy)$$0, faw.a(dae.ml).a(fco.a(fes.a(4.0F, 5.0F))).a(fbg.b($$1.b(dgs.x)))));
   }

   protected fao.a g(dne $$0) {
      return fao.b().a(this.a($$0, fan.a().a(fel.a(1.0F)).a(faw.a($$0).a(fbj.a(fbj.b.a).a(kl.g).a(kl.h).a(kl.q).a(kl.am).a(kl.k)))));
   }

   protected fao.a h(dne $$0) {
      return fao.b().a(fan.a().a(this.a()).a(fel.a(1.0F)).a(faw.a($$0).a(fbj.a(fbj.b.a).a(kl.ar)).a(fbi.a($$0).a(dmy.c))));
   }

   protected fao.a i(dne $$0) {
      return fao.b().a(fan.a().a(fel.a(1.0F)).a(faw.a($$0).a(this.a()).a(fbj.a(fbj.b.a).a(kl.ar)).a(fbi.a($$0).a(dmy.c)).a(faw.a($$0))));
   }

   protected fao.a j(dne $$0) {
      return fao.b().a(fan.a().a(faw.a(dae.xH)).a(fdr.a($$0).a(ds.a.a().a(doc.r_, true))));
   }

   protected fao.a a(dne $$0, czw $$1) {
      ji.b<dgn> $$2 = this.a.e(mi.aR);
      return this.a($$0, (faz.a<?>)this.a((djy)$$0, faw.a($$1).a(fbg.a($$2.b(dgs.x)))));
   }

   protected fao.a b(dne $$0, djy $$1) {
      return this.a($$0, (faz.a<?>)this.a((djy)$$0, faw.a($$1).a(fco.a(fes.a(-6.0F, 2.0F))).a(fbu.a(fai.b(0)))));
   }

   protected fao.a k(dne $$0) {
      ji.b<dgn> $$1 = this.a.e(mi.aR);
      return this.b($$0, (faz.a<?>)this.a((djy)$$0, faw.a(dae.qj).a(fdx.a(0.125F)).a(fbg.a($$1.b(dgs.x), 2))));
   }

   public fao.a b(dne $$0, czw $$1) {
      return fao.b()
         .a(
            this.a(
               $$0,
               fan.a()
                  .a(fel.a(1.0F))
                  .a(faw.a($$1).a(dvk.c.a(), $$1x -> fco.a(fek.a(3, (float)($$1x + 1) / 15.0F)).a(fdr.a($$0).a(ds.a.a().a(dvk.c, $$1x.intValue())))))
            )
         );
   }

   public fao.a c(dne $$0, czw $$1) {
      return fao.b().a(this.a($$0, fan.a().a(fel.a(1.0F)).a(faw.a($$1).a(fco.a(fek.a(3, 0.53333336F))))));
   }

   protected fao.a b(djy $$0) {
      return fao.b().a(fan.a().a(fel.a(1.0F)).a(this.c()).a(faw.a($$0)));
   }

   protected fao.a c(djy $$0) {
      return fao.b().a(fan.a().a(fel.a(1.0F)).a(this.f()).a(faw.a($$0)));
   }

   protected fao.a a(dne $$0, fds.a $$1) {
      return fao.b()
         .a(
            fan.a()
               .a(
                  (faz.a<?>)this.a(
                     (djy)$$0,
                     faw.a($$0)
                        .a($$1)
                        .a(jc.values(), $$1x -> fco.a(fel.a(1.0F), true).a(fdr.a($$0).a(ds.a.a().a(dsk.b($$1x), true))))
                        .a(fco.a(fel.a(-1.0F), true))
                  )
               )
         );
   }

   protected fao.a l(dne $$0) {
      return fao.b()
         .a(
            fan.a()
               .a(
                  (faz.a<?>)this.a(
                     (djy)$$0,
                     faw.a($$0).a(jc.values(), $$1 -> fco.a(fel.a(1.0F), true).a(fdr.a($$0).a(ds.a.a().a(dsk.b($$1), true)))).a(fco.a(fel.a(-1.0F), true))
                  )
               )
         );
   }

   protected fao.a m(dne $$0) {
      return fao.b().a(fan.a().a((faz.a<?>)this.a($$0, faw.a($$0).a(fdr.a($$0).a(ds.a.a().a(dsi.b, true))))));
   }

   protected fao.a a(dne $$0, dne $$1, float... $$2) {
      ji.b<dgn> $$3 = this.a.e(mi.aR);
      return this.c($$0, ((fbb.a)this.a((djy)$$0, faw.a($$1))).a(fdh.a($$3.b(dgs.x), $$2)))
         .a(fan.a().a(fel.a(1.0F)).a(this.g()).a(((fbb.a)this.a((djy)$$0, faw.a(dae.qe).a(fco.a(fes.a(1.0F, 2.0F))))).a(fdh.a($$3.b(dgs.x), f))));
   }

   protected fao.a b(dne $$0, dne $$1, float... $$2) {
      ji.b<dgn> $$3 = this.a.e(mi.aR);
      return this.a($$0, $$1, $$2)
         .a(
            fan.a()
               .a(fel.a(1.0F))
               .a(this.g())
               .a(((fbb.a)this.a((djy)$$0, faw.a(dae.pi))).a(fdh.a($$3.b(dgs.x), 0.005F, 0.0055555557F, 0.00625F, 0.008333334F, 0.025F)))
         );
   }

   protected fao.a n(dne $$0) {
      ji.b<dgn> $$1 = this.a.e(mi.aR);
      return this.c($$0, ((fbb.a)this.a((djy)dng.aS, faw.a(dae.qe).a(fco.a(fes.a(1.0F, 2.0F))))).a(fdh.a($$1.b(dgs.x), f)));
   }

   protected fao.a a(dne $$0, czw $$1, czw $$2, fds.a $$3) {
      ji.b<dgn> $$4 = this.a.e(mi.aR);
      return this.a((djy)$$0, fao.b().a(fan.a().a(faw.a($$1).a($$3).a(faw.a($$2)))).a(fan.a().a($$3).a(faw.a($$2).a(fbg.a($$4.b(dgs.x), 0.5714286F, 3)))));
   }

   protected fao.a o(dne $$0) {
      return fao.b().a(fan.a().a(this.c()).a(faw.a($$0).a(fco.a(fel.a(2.0F)))));
   }

   protected fao.a a(dne $$0, dne $$1) {
      ji.b<dne> $$2 = this.a.e(mi.i);
      faz.a<?> $$3 = faw.a($$1).a(fco.a(fel.a(2.0F))).a(this.c()).a(((fbb.a)this.a((djy)$$0, faw.a(dae.qj))).a(fdx.a(0.125F)));
      return fao.b()
         .a(fan.a().a($$3).a(fdr.a($$0).a(ds.a.a().a(dpn.b, ecc.b))).a(fdq.a(cv.a.a().a(az.a.a().a($$2, $$0).a(ds.a.a().a(dpn.b, ecc.a))), new iw(0, 1, 0))))
         .a(fan.a().a($$3).a(fdr.a($$0).a(ds.a.a().a(dpn.b, ecc.a))).a(fdq.a(cv.a.a().a(az.a.a().a($$2, $$0).a(ds.a.a().a(dpn.b, ecc.b))), new iw(0, -1, 0))));
   }

   protected fao.a p(dne $$0) {
      return fao.b()
         .a(
            fan.a()
               .a(fel.a(1.0F))
               .a(
                  (faz.a<?>)this.a(
                     $$0, faw.a($$0).a(List.of(2, 3, 4), $$1 -> fco.a(fel.a((float)$$1.intValue())).a(fdr.a($$0).a(ds.a.a().a(dnv.f, $$1.intValue()))))
                  )
               )
         );
   }

   public fao.a q(dne $$0) {
      return $$0 instanceof dul $$1
         ? fao.b()
            .a(
               fan.a()
                  .a(fel.a(1.0F))
                  .a(
                     (faz.a<?>)this.a(
                        $$0,
                        faw.a($$0)
                           .a(
                              IntStream.rangeClosed(1, 4).boxed().toList(),
                              $$2 -> fco.a(fel.a((float)$$2.intValue())).a(fdr.a($$0).a(ds.a.a().a($$1.c(), $$2.intValue())))
                           )
                     )
                  )
            )
         : d();
   }

   protected static fao.a r(dne $$0) {
      return fao.b().a(fan.a().a(fel.a(1.0F)).a(faw.a($$0)));
   }

   public static fao.a d() {
      return fao.b();
   }

   protected abstract void e();

   @Override
   public void generate(BiConsumer<alj<fao>, fao.a> $$0) {
      this.e();
      Set<alj<fao>> $$1 = new HashSet<>();

      for (dne $$2 : mh.e) {
         if ($$2.a(this.c)) {
            $$2.u().ifPresent($$3 -> {
               if ($$1.add((alj<fao>)$$3)) {
                  fao.a $$4 = this.d.remove($$3);
                  if ($$4 == null) {
                     throw new IllegalStateException(String.format(Locale.ROOT, "Missing loottable '%s' for '%s'", $$3.a(), mh.e.b($$2)));
                  }

                  $$0.accept((alj<fao>)$$3, $$4);
               }
            });
         }
      }

      if (!this.d.isEmpty()) {
         throw new IllegalStateException("Created block loot tables for non-blocks: " + this.d.keySet());
      }
   }

   protected void b(dne $$0, dne $$1) {
      ji.b<dgn> $$2 = this.a.e(mi.aR);
      fao.a $$3 = this.c($$0, faw.a($$0).a(fdh.a($$2.b(dgs.x), 0.33F, 0.55F, 0.77F, 1.0F)));
      this.a($$0, $$3);
      this.a($$1, $$3);
   }

   protected fao.a s(dne $$0) {
      return this.a($$0, dpl.c, ecc.b);
   }

   protected void t(dne $$0) {
      this.a($$0, $$0x -> this.e((djy)((dql)$$0x).b()));
   }

   protected void c(dne $$0, dne $$1) {
      this.a($$0, this.d((djy)$$1));
   }

   protected void c(dne $$0, djy $$1) {
      this.a($$0, this.a($$1));
   }

   protected void u(dne $$0) {
      this.c($$0, $$0);
   }

   protected void v(dne $$0) {
      this.c($$0, (djy)$$0);
   }

   protected void a(dne $$0, Function<dne, fao.a> $$1) {
      this.a($$0, $$1.apply($$0));
   }

   protected void a(dne $$0, fao.a $$1) {
      this.d.put($$0.u().orElseThrow(() -> new IllegalStateException("Block " + $$0 + " does not have loot table")), $$1);
   }
}
