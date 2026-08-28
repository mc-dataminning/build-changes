import java.util.ArrayList;
import java.util.Collection;
import java.util.Optional;

public class tq implements te.c {
   private static final int c = 5;
   private static final int d = 6;
   private final int e;
   private int f;
   private eyr g;
   private final jf.a h;
   private final jf i;
   private final boolean j;
   private float k = -1.0F;
   private final Collection<tb> l = new ArrayList<>();

   public tq(jf $$0, int $$1, boolean $$2) {
      this.e = $$1;
      this.h = $$0.k();
      this.g = new eyr(this.h);
      this.i = $$0;
      this.j = $$2;
   }

   @Override
   public void a(arj $$0) {
      if (this.j) {
         this.l.forEach($$1 -> {
            eky $$2 = tr.b($$1.e());
            tr.a($$2, $$0);
         });
         this.l.clear();
         this.g = new eyr(this.i);
         this.h.g(this.i);
      }
   }

   @Override
   public Optional<tb> spawnStructure(tb $$0) {
      jf $$1 = new jf(this.h);
      $$0.b($$1);
      $$0.n();
      eyr $$2 = tr.a($$0.e());
      this.g = this.g.b($$2);
      this.h.e((int)$$2.b() + 5, 0, 0);
      if ((float)this.h.u() > this.k) {
         this.k = (float)this.h.u();
      }

      if (++this.f >= this.e) {
         this.f = 0;
         this.h.e(0, 0, (int)this.g.d() + 6);
         this.h.p(this.i.u());
         this.g = new eyr(this.h);
      }

      this.l.add($$0);
      return Optional.of($$0);
   }
}
