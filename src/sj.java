import java.util.Optional;

public class sj implements rx.c {
   private static final int c = 5;
   private static final int d = 6;
   private final int e;
   private int f;
   private eoq g;
   private final ib.a h;
   private final ib i;

   public sj(ib $$0, int $$1) {
      this.e = $$1;
      this.h = $$0.j();
      this.g = new eoq(this.h);
      this.i = $$0;
   }

   @Override
   public Optional<ru> spawnStructure(ru $$0) {
      ib $$1 = new ib(this.h);
      $$0.b($$1);
      $$0.n();
      eoq $$2 = sk.a($$0.e());
      this.g = this.g.b($$2);
      this.h.e((int)$$2.b() + 5, 0, 0);
      if (++this.f >= this.e) {
         this.f = 0;
         this.h.e(0, 0, (int)this.g.d() + 6);
         this.h.p(this.i.u());
         this.g = new eoq(this.h);
      }

      return Optional.of($$0);
   }
}
