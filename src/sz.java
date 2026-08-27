import java.util.Optional;

public class sz implements sn.c {
   private static final int c = 5;
   private static final int d = 6;
   private final int e;
   private int f;
   private ese g;
   private final id.a h;
   private final id i;

   public sz(id $$0, int $$1) {
      this.e = $$1;
      this.h = $$0.j();
      this.g = new ese(this.h);
      this.i = $$0;
   }

   @Override
   public Optional<sk> spawnStructure(sk $$0) {
      id $$1 = new id(this.h);
      $$0.b($$1);
      $$0.n();
      ese $$2 = ta.a($$0.e());
      this.g = this.g.b($$2);
      this.h.e((int)$$2.b() + 5, 0, 0);
      if (++this.f >= this.e) {
         this.f = 0;
         this.h.e(0, 0, (int)this.g.d() + 6);
         this.h.p(this.i.u());
         this.g = new ese(this.h);
      }

      return Optional.of($$0);
   }
}
