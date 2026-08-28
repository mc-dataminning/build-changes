import java.util.Optional;

public class ti implements sw.c {
   private static final int c = 5;
   private static final int d = 6;
   private final int e;
   private int f;
   private evu g;
   private final ja.a h;
   private final ja i;

   public ti(ja $$0, int $$1) {
      this.e = $$1;
      this.h = $$0.j();
      this.g = new evu(this.h);
      this.i = $$0;
   }

   @Override
   public Optional<st> spawnStructure(st $$0) {
      ja $$1 = new ja(this.h);
      $$0.b($$1);
      $$0.n();
      evu $$2 = tj.a($$0.e());
      this.g = this.g.b($$2);
      this.h.e((int)$$2.b() + 5, 0, 0);
      if (++this.f >= this.e) {
         this.f = 0;
         this.h.e(0, 0, (int)this.g.d() + 6);
         this.h.p(this.i.u());
         this.g = new evu(this.h);
      }

      return Optional.of($$0);
   }
}
