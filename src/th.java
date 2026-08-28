import java.util.ArrayList;
import java.util.Collection;
import java.util.Optional;

public class th implements sv.c {
   private static final int c = 5;
   private static final int d = 6;
   private final int e;
   private int f;
   private fed g;
   private final iu.a h;
   private final iu i;
   private final boolean j;
   private float k = -1.0F;
   private final Collection<sq> l = new ArrayList<>();

   public th(iu $$0, int $$1, boolean $$2) {
      this.e = $$1;
      this.h = $$0.k();
      this.g = new fed(this.h);
      this.i = $$0;
      this.j = $$2;
   }

   @Override
   public void a(arq $$0) {
      if (this.j) {
         this.l.forEach($$1 -> {
            eql $$2 = $$1.f().d();
            ti.a($$2, $$0);
         });
         this.l.clear();
         this.g = new fed(this.i);
         this.h.g(this.i);
      }
   }

   @Override
   public Optional<sq> spawnStructure(sq $$0) {
      iu $$1 = new iu(this.h);
      $$0.a($$1);
      $$0.o().a(1);
      fed $$2 = $$0.f().f();
      this.g = this.g.b($$2);
      this.h.e((int)$$2.b() + 5, 0, 0);
      if ((float)this.h.u() > this.k) {
         this.k = (float)this.h.u();
      }

      if (++this.f >= this.e) {
         this.f = 0;
         this.h.e(0, 0, (int)this.g.d() + 6);
         this.h.p(this.i.u());
         this.g = new fed(this.h);
      }

      this.l.add($$0);
      return Optional.of($$0);
   }
}
