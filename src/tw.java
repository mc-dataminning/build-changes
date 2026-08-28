import java.util.ArrayList;
import java.util.Collection;
import java.util.Optional;

public class tw implements tk.c {
   private static final int c = 5;
   private static final int d = 6;
   private final int e;
   private int f;
   private fbm g;
   private final jh.a h;
   private final jh i;
   private final boolean j;
   private float k = -1.0F;
   private final Collection<th> l = new ArrayList<>();

   public tw(jh $$0, int $$1, boolean $$2) {
      this.e = $$1;
      this.h = $$0.k();
      this.g = new fbm(this.h);
      this.i = $$0;
      this.j = $$2;
   }

   @Override
   public void a(arx $$0) {
      if (this.j) {
         this.l.forEach($$1 -> {
            env $$2 = tx.b($$1.f());
            tx.a($$2, $$0);
         });
         this.l.clear();
         this.g = new fbm(this.i);
         this.h.g(this.i);
      }
   }

   @Override
   public Optional<th> spawnStructure(th $$0) {
      jh $$1 = new jh(this.h);
      $$0.b($$1);
      $$0.o();
      fbm $$2 = tx.a($$0.f());
      this.g = this.g.b($$2);
      this.h.e((int)$$2.b() + 5, 0, 0);
      if ((float)this.h.u() > this.k) {
         this.k = (float)this.h.u();
      }

      if (++this.f >= this.e) {
         this.f = 0;
         this.h.e(0, 0, (int)this.g.d() + 6);
         this.h.p(this.i.u());
         this.g = new fbm(this.h);
      }

      this.l.add($$0);
      return Optional.of($$0);
   }
}
