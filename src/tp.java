import java.util.ArrayList;
import java.util.Collection;
import java.util.Optional;

public class tp implements td.c {
   private static final int c = 5;
   private static final int d = 6;
   private final int e;
   private int f;
   private eyn g;
   private final je.a h;
   private final je i;
   private final boolean j;
   private float k = -1.0F;
   private final Collection<ta> l = new ArrayList<>();

   public tp(je $$0, int $$1, boolean $$2) {
      this.e = $$1;
      this.h = $$0.k();
      this.g = new eyn(this.h);
      this.i = $$0;
      this.j = $$2;
   }

   @Override
   public void a(arh $$0) {
      if (this.j) {
         this.l.forEach($$1 -> {
            eku $$2 = tq.b($$1.e());
            tq.a($$2, $$0);
         });
         this.l.clear();
         this.g = new eyn(this.i);
         this.h.g(this.i);
      }
   }

   @Override
   public Optional<ta> spawnStructure(ta $$0) {
      je $$1 = new je(this.h);
      $$0.b($$1);
      $$0.n();
      eyn $$2 = tq.a($$0.e());
      this.g = this.g.b($$2);
      this.h.e((int)$$2.b() + 5, 0, 0);
      if ((float)this.h.u() > this.k) {
         this.k = (float)this.h.u();
      }

      if (++this.f >= this.e) {
         this.f = 0;
         this.h.e(0, 0, (int)this.g.d() + 6);
         this.h.p(this.i.u());
         this.g = new eyn(this.h);
      }

      this.l.add($$0);
      return Optional.of($$0);
   }
}
