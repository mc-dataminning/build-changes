import java.util.Optional;

public class to implements tc.c {
   private static final int c = 5;
   private static final int d = 6;
   private final int e;
   private int f;
   private euf g;
   private final io.a h;
   private final io i;

   public to(io $$0, int $$1) {
      this.e = $$1;
      this.h = $$0.j();
      this.g = new euf(this.h);
      this.i = $$0;
   }

   @Override
   public Optional<sz> spawnStructure(sz $$0) {
      io $$1 = new io(this.h);
      $$0.b($$1);
      $$0.n();
      euf $$2 = tp.a($$0.e());
      this.g = this.g.b($$2);
      this.h.e((int)$$2.b() + 5, 0, 0);
      if (++this.f >= this.e) {
         this.f = 0;
         this.h.e(0, 0, (int)this.g.d() + 6);
         this.h.p(this.i.u());
         this.g = new euf(this.h);
      }

      return Optional.of($$0);
   }
}
