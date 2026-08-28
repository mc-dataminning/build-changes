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
   protected final Set<dag> b;
   protected final cvs c;
   protected final Map<alq<fay>, fay.a> d;
   protected static final float[] e = new float[]{0.05F, 0.0625F, 0.083333336F, 0.1F};
   private static final float[] f = new float[]{0.02F, 0.022222223F, 0.025F, 0.033333335F, 0.1F};

   protected fec.a a() {
      return fej.a(cn.a.a().a(bo.a.a().a(kv.b, kw.a(List.of(new bu(this.a.e(mi.aR).b(dhc.v), cx.d.b(1))))).b()));
   }

   protected fec.a b() {
      return this.a().invert();
   }

   protected fec.a c() {
      return fej.a(cn.a.a().a(this.a.e(mi.K), dao.td));
   }

   private fec.a f() {
      return this.c().or(this.a());
   }

   private fec.a g() {
      return this.f().invert();
   }

   protected nj(Set<dag> $$0, cvs $$1, ji.a $$2) {
      this($$0, $$1, new HashMap<>(), $$2);
   }

   protected nj(Set<dag> $$0, cvs $$1, Map<alq<fay>, fay.a> $$2, ji.a $$3) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.a = $$3;
   }

   protected <T extends fcd<T>> T a(dki $$0, fcd<T> $$1) {
      return !this.b.contains($$0.h()) ? $$1.b(fbr.c()) : $$1.c();
   }

   protected <T extends fdu<T>> T a(dki $$0, fdu<T> $$1) {
      return !this.b.contains($$0.h()) ? $$1.b(fdy.c()) : $$1.d();
   }

   public fay.a a(dki $$0) {
      return fay.b().a(this.a($$0, fax.a().a(fev.a(1.0F)).a(fbg.a($$0))));
   }

   private static fay.a a(dno $$0, fec.a $$1, fbj.a<?> $$2) {
      return fay.b().a(fax.a().a(fev.a(1.0F)).a(fbg.a($$0).a($$1).a($$2)));
   }

   protected fay.a a(dno $$0, fbj.a<?> $$1) {
      return a($$0, this.a(), $$1);
   }

   protected fay.a b(dno $$0, fbj.a<?> $$1) {
      return a($$0, this.c(), $$1);
   }

   protected fay.a c(dno $$0, fbj.a<?> $$1) {
      return a($$0, this.f(), $$1);
   }

   protected fay.a a(dno $$0, dki $$1) {
      return this.a($$0, (fbj.a<?>)this.a((dki)$$0, fbg.a($$1)));
   }

   protected fay.a a(dki $$0, fey $$1) {
      return fay.b().a(fax.a().a(fev.a(1.0F)).a((fbj.a<?>)this.a($$0, fbg.a($$0).a(fcy.a($$1)))));
   }

   protected fay.a a(dno $$0, dki $$1, fey $$2) {
      return this.a($$0, (fbj.a<?>)this.a((dki)$$0, fbg.a($$1).a(fcy.a($$2))));
   }

   private fay.a d(dki $$0) {
      return fay.b().a(fax.a().a(this.a()).a(fev.a(1.0F)).a(fbg.a($$0)));
   }

   private fay.a e(dki $$0) {
      return fay.b().a(this.a(dnq.gq, fax.a().a(fev.a(1.0F)).a(fbg.a(dnq.gq)))).a(this.a($$0, fax.a().a(fev.a(1.0F)).a(fbg.a($$0))));
   }

   protected fay.a a(dno $$0) {
      return fay.b().a(fax.a().a(fev.a(1.0F)).a((fbj.a<?>)this.a((dki)$$0, fbg.a($$0).a(fcy.a(fev.a(2.0F)).a(feb.a($$0).a(ds.a.a().a(dvb.b, ecy.c)))))));
   }

   protected <T extends Comparable<T> & bax> fay.a a(dno $$0, ect<T> $$1, T $$2) {
      return fay.b().a(this.a($$0, fax.a().a(fev.a(1.0F)).a(fbg.a($$0).a(feb.a($$0).a(ds.a.a().a($$1, $$2))))));
   }

   protected fay.a b(dno $$0) {
      return fay.b().a(this.a($$0, fax.a().a(fev.a(1.0F)).a(fbg.a($$0).a(fbt.a(fbt.b.a).a(kl.g)))));
   }

   protected fay.a c(dno $$0) {
      return fay.b().a(this.a($$0, fax.a().a(fev.a(1.0F)).a(fbg.a($$0).a(fbt.a(fbt.b.a).a(kl.g).a(kl.ap).a(kl.as).a(kl.at)))));
   }

   protected fay.a d(dno $$0) {
      ji.b<dgx> $$1 = this.a.e(mi.aR);
      return this.a($$0, (fbj.a<?>)this.a((dki)$$0, fbg.a(dao.pu).a(fcy.a(ffc.a(2.0F, 5.0F))).a(fbq.a($$1.b(dhc.x)))));
   }

   protected fay.a e(dno $$0) {
      ji.b<dgx> $$1 = this.a.e(mi.aR);
      return this.a($$0, (fbj.a<?>)this.a((dki)$$0, fbg.a(dao.pp).a(fcy.a(ffc.a(4.0F, 9.0F))).a(fbq.a($$1.b(dhc.x)))));
   }

   protected fay.a f(dno $$0) {
      ji.b<dgx> $$1 = this.a.e(mi.aR);
      return this.a($$0, (fbj.a<?>)this.a((dki)$$0, fbg.a(dao.ml).a(fcy.a(ffc.a(4.0F, 5.0F))).a(fbq.b($$1.b(dhc.x)))));
   }

   protected fay.a g(dno $$0) {
      return fay.b().a(this.a($$0, fax.a().a(fev.a(1.0F)).a(fbg.a($$0).a(fbt.a(fbt.b.a).a(kl.g).a(kl.h).a(kl.q).a(kl.am).a(kl.k)))));
   }

   protected fay.a h(dno $$0) {
      return fay.b().a(fax.a().a(this.a()).a(fev.a(1.0F)).a(fbg.a($$0).a(fbt.a(fbt.b.a).a(kl.ar)).a(fbs.a($$0).a(dni.c))));
   }

   protected fay.a i(dno $$0) {
      return fay.b().a(fax.a().a(fev.a(1.0F)).a(fbg.a($$0).a(this.a()).a(fbt.a(fbt.b.a).a(kl.ar)).a(fbs.a($$0).a(dni.c)).a(fbg.a($$0))));
   }

   protected fay.a j(dno $$0) {
      return fay.b().a(fax.a().a(fbg.a(dao.xH)).a(feb.a($$0).a(ds.a.a().a(dom.r_, true))));
   }

   protected fay.a a(dno $$0, dag $$1) {
      ji.b<dgx> $$2 = this.a.e(mi.aR);
      return this.a($$0, (fbj.a<?>)this.a((dki)$$0, fbg.a($$1).a(fbq.a($$2.b(dhc.x)))));
   }

   protected fay.a b(dno $$0, dki $$1) {
      return this.a($$0, (fbj.a<?>)this.a((dki)$$0, fbg.a($$1).a(fcy.a(ffc.a(-6.0F, 2.0F))).a(fce.a(fas.b(0)))));
   }

   protected fay.a k(dno $$0) {
      ji.b<dgx> $$1 = this.a.e(mi.aR);
      return this.b($$0, (fbj.a<?>)this.a((dki)$$0, fbg.a(dao.qj).a(feh.a(0.125F)).a(fbq.a($$1.b(dhc.x), 2))));
   }

   public fay.a b(dno $$0, dag $$1) {
      return fay.b()
         .a(
            this.a(
               $$0,
               fax.a()
                  .a(fev.a(1.0F))
                  .a(fbg.a($$1).a(dvu.c.a(), $$1x -> fcy.a(feu.a(3, (float)($$1x + 1) / 15.0F)).a(feb.a($$0).a(ds.a.a().a(dvu.c, $$1x.intValue())))))
            )
         );
   }

   public fay.a c(dno $$0, dag $$1) {
      return fay.b().a(this.a($$0, fax.a().a(fev.a(1.0F)).a(fbg.a($$1).a(fcy.a(feu.a(3, 0.53333336F))))));
   }

   protected fay.a b(dki $$0) {
      return fay.b().a(fax.a().a(fev.a(1.0F)).a(this.c()).a(fbg.a($$0)));
   }

   protected fay.a c(dki $$0) {
      return fay.b().a(fax.a().a(fev.a(1.0F)).a(this.f()).a(fbg.a($$0)));
   }

   protected fay.a a(dno $$0, fec.a $$1) {
      return fay.b()
         .a(
            fax.a()
               .a(
                  (fbj.a<?>)this.a(
                     (dki)$$0,
                     fbg.a($$0)
                        .a($$1)
                        .a(jc.values(), $$1x -> fcy.a(fev.a(1.0F), true).a(feb.a($$0).a(ds.a.a().a(dsu.b($$1x), true))))
                        .a(fcy.a(fev.a(-1.0F), true))
                  )
               )
         );
   }

   protected fay.a l(dno $$0) {
      return fay.b()
         .a(
            fax.a()
               .a(
                  (fbj.a<?>)this.a(
                     (dki)$$0,
                     fbg.a($$0).a(jc.values(), $$1 -> fcy.a(fev.a(1.0F), true).a(feb.a($$0).a(ds.a.a().a(dsu.b($$1), true)))).a(fcy.a(fev.a(-1.0F), true))
                  )
               )
         );
   }

   protected fay.a m(dno $$0) {
      return fay.b().a(fax.a().a((fbj.a<?>)this.a($$0, fbg.a($$0).a(feb.a($$0).a(ds.a.a().a(dss.b, true))))));
   }

   protected fay.a a(dno $$0, dno $$1, float... $$2) {
      ji.b<dgx> $$3 = this.a.e(mi.aR);
      return this.c($$0, ((fbl.a)this.a((dki)$$0, fbg.a($$1))).a(fdr.a($$3.b(dhc.x), $$2)))
         .a(fax.a().a(fev.a(1.0F)).a(this.g()).a(((fbl.a)this.a((dki)$$0, fbg.a(dao.qe).a(fcy.a(ffc.a(1.0F, 2.0F))))).a(fdr.a($$3.b(dhc.x), f))));
   }

   protected fay.a b(dno $$0, dno $$1, float... $$2) {
      ji.b<dgx> $$3 = this.a.e(mi.aR);
      return this.a($$0, $$1, $$2)
         .a(
            fax.a()
               .a(fev.a(1.0F))
               .a(this.g())
               .a(((fbl.a)this.a((dki)$$0, fbg.a(dao.pi))).a(fdr.a($$3.b(dhc.x), 0.005F, 0.0055555557F, 0.00625F, 0.008333334F, 0.025F)))
         );
   }

   protected fay.a n(dno $$0) {
      ji.b<dgx> $$1 = this.a.e(mi.aR);
      return this.c($$0, ((fbl.a)this.a((dki)dnq.aS, fbg.a(dao.qe).a(fcy.a(ffc.a(1.0F, 2.0F))))).a(fdr.a($$1.b(dhc.x), f)));
   }

   protected fay.a a(dno $$0, dag $$1, dag $$2, fec.a $$3) {
      ji.b<dgx> $$4 = this.a.e(mi.aR);
      return this.a((dki)$$0, fay.b().a(fax.a().a(fbg.a($$1).a($$3).a(fbg.a($$2)))).a(fax.a().a($$3).a(fbg.a($$2).a(fbq.a($$4.b(dhc.x), 0.5714286F, 3)))));
   }

   protected fay.a o(dno $$0) {
      return fay.b().a(fax.a().a(this.c()).a(fbg.a($$0).a(fcy.a(fev.a(2.0F)))));
   }

   protected fay.a a(dno $$0, dno $$1) {
      ji.b<dno> $$2 = this.a.e(mi.i);
      fbj.a<?> $$3 = fbg.a($$1).a(fcy.a(fev.a(2.0F))).a(this.c()).a(((fbl.a)this.a((dki)$$0, fbg.a(dao.qj))).a(feh.a(0.125F)));
      return fay.b()
         .a(fax.a().a($$3).a(feb.a($$0).a(ds.a.a().a(dpx.b, ecm.b))).a(fea.a(cv.a.a().a(az.a.a().a($$2, $$0).a(ds.a.a().a(dpx.b, ecm.a))), new iw(0, 1, 0))))
         .a(fax.a().a($$3).a(feb.a($$0).a(ds.a.a().a(dpx.b, ecm.a))).a(fea.a(cv.a.a().a(az.a.a().a($$2, $$0).a(ds.a.a().a(dpx.b, ecm.b))), new iw(0, -1, 0))));
   }

   protected fay.a p(dno $$0) {
      return fay.b()
         .a(
            fax.a()
               .a(fev.a(1.0F))
               .a(
                  (fbj.a<?>)this.a(
                     $$0, fbg.a($$0).a(List.of(2, 3, 4), $$1 -> fcy.a(fev.a((float)$$1.intValue())).a(feb.a($$0).a(ds.a.a().a(dof.f, $$1.intValue()))))
                  )
               )
         );
   }

   public fay.a q(dno $$0) {
      return $$0 instanceof duv $$1
         ? fay.b()
            .a(
               fax.a()
                  .a(fev.a(1.0F))
                  .a(
                     (fbj.a<?>)this.a(
                        $$0,
                        fbg.a($$0)
                           .a(
                              IntStream.rangeClosed(1, 4).boxed().toList(),
                              $$2 -> fcy.a(fev.a((float)$$2.intValue())).a(feb.a($$0).a(ds.a.a().a($$1.c(), $$2.intValue())))
                           )
                     )
                  )
            )
         : d();
   }

   protected static fay.a r(dno $$0) {
      return fay.b().a(fax.a().a(fev.a(1.0F)).a(fbg.a($$0)));
   }

   public static fay.a d() {
      return fay.b();
   }

   protected abstract void e();

   @Override
   public void generate(BiConsumer<alq<fay>, fay.a> $$0) {
      this.e();
      Set<alq<fay>> $$1 = new HashSet<>();

      for (dno $$2 : mh.e) {
         if ($$2.a(this.c)) {
            $$2.u().ifPresent($$3 -> {
               if ($$1.add((alq<fay>)$$3)) {
                  fay.a $$4 = this.d.remove($$3);
                  if ($$4 == null) {
                     throw new IllegalStateException(String.format(Locale.ROOT, "Missing loottable '%s' for '%s'", $$3.a(), mh.e.b($$2)));
                  }

                  $$0.accept((alq<fay>)$$3, $$4);
               }
            });
         }
      }

      if (!this.d.isEmpty()) {
         throw new IllegalStateException("Created block loot tables for non-blocks: " + this.d.keySet());
      }
   }

   protected void b(dno $$0, dno $$1) {
      ji.b<dgx> $$2 = this.a.e(mi.aR);
      fay.a $$3 = this.c($$0, fbg.a($$0).a(fdr.a($$2.b(dhc.x), 0.33F, 0.55F, 0.77F, 1.0F)));
      this.a($$0, $$3);
      this.a($$1, $$3);
   }

   protected fay.a s(dno $$0) {
      return this.a($$0, dpv.c, ecm.b);
   }

   protected void t(dno $$0) {
      this.a($$0, $$0x -> this.e((dki)((dqv)$$0x).b()));
   }

   protected void c(dno $$0, dno $$1) {
      this.a($$0, this.d((dki)$$1));
   }

   protected void c(dno $$0, dki $$1) {
      this.a($$0, this.a($$1));
   }

   protected void u(dno $$0) {
      this.c($$0, $$0);
   }

   protected void v(dno $$0) {
      this.c($$0, (dki)$$0);
   }

   protected void a(dno $$0, Function<dno, fay.a> $$1) {
      this.a($$0, $$1.apply($$0));
   }

   protected void a(dno $$0, fay.a $$1) {
      this.d.put($$0.u().orElseThrow(() -> new IllegalStateException("Block " + $$0 + " does not have loot table")), $$1);
   }
}
