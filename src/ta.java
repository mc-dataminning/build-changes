import java.util.ArrayList;
import java.util.Collection;
import java.util.Optional;

public class ta implements so.c {
   private static final int c = 5;
   private static final int d = 6;
   private final int e;
   private int f;
   private fav g;
   private final ji.a h;
   private final ji i;
   private final boolean j;
   private float k = -1.0F;
   private final Collection<sl> l = new ArrayList<>();

   public ta(ji $$0, int $$1, boolean $$2) {
      this.e = $$1;
      this.h = $$0.k();
      this.g = new fav(this.h);
      this.i = $$0;
      this.j = $$2;
   }

   @Override
   public void a(ard $$0) {
      if (this.j) {
         this.l.forEach($$1 -> {
            ene $$2 = tb.b($$1.f());
            tb.a($$2, $$0);
         });
         this.l.clear();
         this.g = new fav(this.i);
         this.h.g(this.i);
      }
   }

   @Override
   public Optional<sl> spawnStructure(sl $$0) {
      ji $$1 = new ji(this.h);
      $$0.b($$1);
      $$0.o();
      fav $$2 = tb.a($$0.f());
      this.g = this.g.b($$2);
      this.h.e((int)$$2.b() + 5, 0, 0);
      if ((float)this.h.u() > this.k) {
         this.k = (float)this.h.u();
      }

      if (++this.f >= this.e) {
         this.f = 0;
         this.h.e(0, 0, (int)this.g.d() + 6);
         this.h.p(this.i.u());
         this.g = new fav(this.h);
      }

      this.l.add($$0);
      return Optional.of($$0);
   }
}
