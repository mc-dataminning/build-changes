public class gmn<T extends btk, M extends ftv<T>> extends gne<T, M> {
   private static final alb a = new alb("textures/entity/elytra.png");
   private final fts<T> b;

   public gmn(gko<T, M> $$0, fwr $$1) {
      super($$0);
      this.b = new fts<>($$1.a(fwu.W));
   }

   public void a(ezt $$0, gdj $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      cuk $$10 = $$3.a(bsw.e);
      if ($$10.a(cun.nT)) {
         alb $$13;
         if ($$3 instanceof gci $$11) {
            gpu $$12 = $$11.b();
            if ($$12.d() != null) {
               $$13 = $$12.d();
            } else if ($$12.c() != null && $$11.a(cmt.a)) {
               $$13 = $$12.c();
            } else {
               $$13 = a;
            }
         } else {
            $$13 = a;
         }

         $$0.a();
         $$0.a(0.0F, 0.0F, 0.125F);
         this.c().a(this.b);
         this.b.a($$3, $$4, $$5, $$7, $$8, $$9);
         ezx $$17 = gjq.a($$1, gdr.a($$13), false, $$10.y());
         this.b.a($$0, $$17, $$2, gol.d, 1.0F, 1.0F, 1.0F, 1.0F);
         $$0.b();
      }
   }
}
