import java.util.Optional;

public class ud implements tr.c {
   private static final int c = 5;
   private static final int d = 6;
   private final int e;
   private int f;
   private evm g;
   private final iz.a h;
   private final iz i;

   public ud(iz $$0, int $$1) {
      this.e = $$1;
      this.h = $$0.j();
      this.g = new evm(this.h);
      this.i = $$0;
   }

   @Override
   public Optional<to> spawnStructure(to $$0) {
      iz $$1 = new iz(this.h);
      $$0.b($$1);
      $$0.n();
      evm $$2 = ue.a($$0.e());
      this.g = this.g.b($$2);
      this.h.e((int)$$2.b() + 5, 0, 0);
      if (++this.f >= this.e) {
         this.f = 0;
         this.h.e(0, 0, (int)this.g.d() + 6);
         this.h.p(this.i.u());
         this.g = new evm(this.h);
      }

      return Optional.of($$0);
   }
}
