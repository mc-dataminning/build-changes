import java.util.Optional;

public class sh implements rv.c {
   private static final int c = 5;
   private static final int d = 6;
   private final int e;
   private int f;
   private enn g;
   private final hz.a h;
   private final hz i;

   public sh(hz $$0, int $$1) {
      this.e = $$1;
      this.h = $$0.j();
      this.g = new enn(this.h);
      this.i = $$0;
   }

   @Override
   public Optional<rs> spawnStructure(rs $$0) {
      hz $$1 = new hz(this.h);
      $$0.b($$1);
      $$0.n();
      enn $$2 = si.a($$0.e());
      this.g = this.g.b($$2);
      this.h.e((int)$$2.b() + 5, 0, 0);
      if (++this.f >= this.e) {
         this.f = 0;
         this.h.e(0, 0, (int)this.g.d() + 6);
         this.h.p(this.i.u());
         this.g = new enn(this.h);
      }

      return Optional.of($$0);
   }
}
