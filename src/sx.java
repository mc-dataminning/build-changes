import java.util.Optional;

public class sx implements sl.c {
   private static final int c = 5;
   private static final int d = 6;
   private final int e;
   private int f;
   private erv g;
   private final ib.a h;
   private final ib i;

   public sx(ib $$0, int $$1) {
      this.e = $$1;
      this.h = $$0.j();
      this.g = new erv(this.h);
      this.i = $$0;
   }

   @Override
   public Optional<si> spawnStructure(si $$0) {
      ib $$1 = new ib(this.h);
      $$0.b($$1);
      $$0.n();
      erv $$2 = sy.a($$0.e());
      this.g = this.g.b($$2);
      this.h.e((int)$$2.b() + 5, 0, 0);
      if (++this.f >= this.e) {
         this.f = 0;
         this.h.e(0, 0, (int)this.g.d() + 6);
         this.h.p(this.i.u());
         this.g = new erv(this.h);
      }

      return Optional.of($$0);
   }
}
