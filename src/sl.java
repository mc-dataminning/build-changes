import java.util.Optional;

public class sl implements rz.c {
   private static final int c = 5;
   private static final int d = 6;
   private final int e;
   private int f;
   private epm g;
   private final ib.a h;
   private final ib i;

   public sl(ib $$0, int $$1) {
      this.e = $$1;
      this.h = $$0.j();
      this.g = new epm(this.h);
      this.i = $$0;
   }

   @Override
   public Optional<rw> spawnStructure(rw $$0) {
      ib $$1 = new ib(this.h);
      $$0.b($$1);
      $$0.n();
      epm $$2 = sm.a($$0.e());
      this.g = this.g.b($$2);
      this.h.e((int)$$2.b() + 5, 0, 0);
      if (++this.f >= this.e) {
         this.f = 0;
         this.h.e(0, 0, (int)this.g.d() + 6);
         this.h.p(this.i.u());
         this.g = new epm(this.h);
      }

      return Optional.of($$0);
   }
}
