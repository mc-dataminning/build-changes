import java.util.Optional;

public class tl implements sz.c {
   private static final int c = 5;
   private static final int d = 6;
   private final int e;
   private int f;
   private ewr g;
   private final jd.a h;
   private final jd i;

   public tl(jd $$0, int $$1) {
      this.e = $$1;
      this.h = $$0.j();
      this.g = new ewr(this.h);
      this.i = $$0;
   }

   @Override
   public Optional<sw> spawnStructure(sw $$0) {
      jd $$1 = new jd(this.h);
      $$0.b($$1);
      $$0.n();
      ewr $$2 = tm.a($$0.e());
      this.g = this.g.b($$2);
      this.h.e((int)$$2.b() + 5, 0, 0);
      if (++this.f >= this.e) {
         this.f = 0;
         this.h.e(0, 0, (int)this.g.d() + 6);
         this.h.p(this.i.u());
         this.g = new ewr(this.h);
      }

      return Optional.of($$0);
   }
}
