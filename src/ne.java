import java.util.function.BiConsumer;

public record ne(jo.a a) implements mw {
   @Override
   public void generate(BiConsumer<akp<erq>, erq.a> $$0) {
      jo.b<cwy> $$1 = this.a.a(lu.aX).orElseThrow();
      jo.b<cww> $$2 = this.a.a(lu.aW).orElseThrow();
      jo.b<daa> $$3 = this.a.b(lu.aL);
      cwv $$4 = new cwv($$2.a(cwx.e).orElseThrow(), $$1.a(cwz.q).orElseThrow());
      cwv $$5 = new cwv($$2.a(cwx.e).orElseThrow(), $$1.a(cwz.r).orElseThrow());
      $$0.accept(
         erh.aj,
         erq.b()
            .a(
               erp.a()
                  .a(evp.a(1.0F))
                  .a(ese.a(a(cur.pC, cur.pD, $$5, $$3).b()).a(4))
                  .a(ese.a(a(cur.pG, cur.pH, $$4, $$3).b()).a(2))
                  .a(ese.a(a(cur.pK, cur.pL, $$4, $$3).b()).a(1))
            )
      );
      $$0.accept(
         erh.al,
         erq.b()
            .a(erp.a().a(evp.a(1.0F)).a(ese.a(erh.aj)))
            .a(
               erp.a()
                  .a(evp.a(1.0F))
                  .a(ery.a(cur.pb).a(4))
                  .a(ery.a(cur.pb).a(new etm.a().a($$3.b(daf.n), evp.a(1.0F))))
                  .a(ery.a(cur.pb).a(new etm.a().a($$3.b(daf.q), evp.a(1.0F))))
                  .a(ery.a(cur.pg))
            )
      );
      $$0.accept(
         erh.ak,
         erq.b()
            .a(erp.a().a(evp.a(1.0F)).a(ese.a(erh.aj)))
            .a(
               erp.a()
                  .a(evp.a(1.0F))
                  .a(ery.a(cur.ov).a(2))
                  .a(ery.a(cur.ov).a(new etm.a().a($$3.b(daf.y), evp.a(1.0F))))
                  .a(ery.a(cur.ov).a(new etm.a().a($$3.b(daf.z), evp.a(1.0F))))
            )
      );
   }

   public static erq.a a(cuj $$0, cuj $$1, cwv $$2, jo.b<daa> $$3) {
      return erq.b()
         .a(
            erp.a()
               .a(evp.a(1.0F))
               .a(evb.a(0.5F))
               .a(ery.a($$0).a(eth.a(kq.K, $$2)).a(new etm.a().a($$3.b(daf.a), evp.a(4.0F)).a($$3.b(daf.e), evp.a(4.0F)).a($$3.b(daf.b), evp.a(4.0F))))
         )
         .a(
            erp.a()
               .a(evp.a(1.0F))
               .a(evb.a(0.5F))
               .a(ery.a($$1).a(eth.a(kq.K, $$2)).a(new etm.a().a($$3.b(daf.a), evp.a(4.0F)).a($$3.b(daf.e), evp.a(4.0F)).a($$3.b(daf.b), evp.a(4.0F))))
         );
   }
}
