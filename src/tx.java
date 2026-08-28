import java.util.ArrayList;
import java.util.Collection;
import java.util.Optional;

public class tx implements tl.c {
   private static final int c = 5;
   private static final int d = 6;
   private final int e;
   private int f;
   private ezm g;
   private final jh.a h;
   private final jh i;
   private final boolean j;
   private float k = -1.0F;
   private final Collection<ti> l = new ArrayList<>();

   public tx(jh $$0, int $$1, boolean $$2) {
      this.e = $$1;
      this.h = $$0.k();
      this.g = new ezm(this.h);
      this.i = $$0;
      this.j = $$2;
   }

   @Override
   public void a(arq $$0) {
      if (this.j) {
         this.l.forEach($$1 -> {
            elt $$2 = ty.b($$1.f());
            ty.a($$2, $$0);
         });
         this.l.clear();
         this.g = new ezm(this.i);
         this.h.g(this.i);
      }
   }

   @Override
   public Optional<ti> spawnStructure(ti $$0) {
      jh $$1 = new jh(this.h);
      $$0.b($$1);
      $$0.o();
      ezm $$2 = ty.a($$0.f());
      this.g = this.g.b($$2);
      this.h.e((int)$$2.b() + 5, 0, 0);
      if ((float)this.h.u() > this.k) {
         this.k = (float)this.h.u();
      }

      if (++this.f >= this.e) {
         this.f = 0;
         this.h.e(0, 0, (int)this.g.d() + 6);
         this.h.p(this.i.u());
         this.g = new ezm(this.h);
      }

      this.l.add($$0);
      return Optional.of($$0);
   }
}
