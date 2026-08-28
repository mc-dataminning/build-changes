import java.util.ArrayList;
import java.util.Collection;
import java.util.Optional;

public class tm implements ta.c {
   private static final int c = 5;
   private static final int d = 6;
   private final int e;
   private int f;
   private ewv g;
   private final jd.a h;
   private final jd i;
   private final boolean j;
   private float k = -1.0F;
   private final Collection<sx> l = new ArrayList<>();

   public tm(jd $$0, int $$1, boolean $$2) {
      this.e = $$1;
      this.h = $$0.k();
      this.g = new ewv(this.h);
      this.i = $$0;
      this.j = $$2;
   }

   @Override
   public void a(aqu $$0) {
      if (this.j) {
         this.l.forEach($$1 -> {
            ejh $$2 = tn.b($$1.e());
            tn.a($$2, $$0);
         });
         this.l.clear();
         this.g = new ewv(this.i);
         this.h.g(this.i);
      }
   }

   @Override
   public Optional<sx> spawnStructure(sx $$0) {
      jd $$1 = new jd(this.h);
      $$0.b($$1);
      $$0.n();
      ewv $$2 = tn.a($$0.e());
      this.g = this.g.b($$2);
      this.h.e((int)$$2.b() + 5, 0, 0);
      if ((float)this.h.u() > this.k) {
         this.k = (float)this.h.u();
      }

      if (++this.f >= this.e) {
         this.f = 0;
         this.h.e(0, 0, (int)this.g.d() + 6);
         this.h.p(this.i.u());
         this.g = new ewv(this.h);
      }

      this.l.add($$0);
      return Optional.of($$0);
   }
}
