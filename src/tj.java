import java.util.Optional;

public class tj implements sx.c {
   private static final int c = 5;
   private static final int d = 6;
   private final int e;
   private int f;
   private eta g;
   private final im.a h;
   private final im i;

   public tj(im $$0, int $$1) {
      this.e = $$1;
      this.h = $$0.j();
      this.g = new eta(this.h);
      this.i = $$0;
   }

   @Override
   public Optional<su> spawnStructure(su $$0) {
      im $$1 = new im(this.h);
      $$0.b($$1);
      $$0.n();
      eta $$2 = tk.a($$0.e());
      this.g = this.g.b($$2);
      this.h.e((int)$$2.b() + 5, 0, 0);
      if (++this.f >= this.e) {
         this.f = 0;
         this.h.e(0, 0, (int)this.g.d() + 6);
         this.h.p(this.i.u());
         this.g = new eta(this.h);
      }

      return Optional.of($$0);
   }
}
