import java.util.Optional;

public class tl implements sz.c {
   private static final int c = 5;
   private static final int d = 6;
   private final int e;
   private int f;
   private etk g;
   private final in.a h;
   private final in i;

   public tl(in $$0, int $$1) {
      this.e = $$1;
      this.h = $$0.j();
      this.g = new etk(this.h);
      this.i = $$0;
   }

   @Override
   public Optional<sw> spawnStructure(sw $$0) {
      in $$1 = new in(this.h);
      $$0.b($$1);
      $$0.n();
      etk $$2 = tm.a($$0.e());
      this.g = this.g.b($$2);
      this.h.e((int)$$2.b() + 5, 0, 0);
      if (++this.f >= this.e) {
         this.f = 0;
         this.h.e(0, 0, (int)this.g.d() + 6);
         this.h.p(this.i.u());
         this.g = new etk(this.h);
      }

      return Optional.of($$0);
   }
}
