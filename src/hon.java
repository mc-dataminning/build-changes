import java.time.Duration;
import java.util.UUID;
import javax.annotation.Nullable;

public class hon {
   private final UUID a = UUID.randomUUID();
   private final hoi b;
   private final hor c;
   private final hot d = new hot();
   private final hoq e;
   private final hos f;

   public hon(hoi $$0, boolean $$1, @Nullable Duration $$2, @Nullable String $$3) {
      this.c = new hor($$3);
      this.e = new hoq();
      this.f = new hos($$1, $$2);
      this.b = $$0.decorate($$0x -> {
         this.c.a($$0x);
         $$0x.a(hol.i, this.a);
      });
   }

   public void a() {
      this.e.a(this.b);
   }

   public void a(dix $$0, boolean $$1) {
      this.c.a($$0, $$1);
      this.d.a();
      this.b();
   }

   public void a(String $$0) {
      this.c.a($$0);
      this.b();
   }

   public void a(long $$0) {
      this.d.a($$0);
   }

   public void b() {
      if (this.c.a(this.b)) {
         this.f.a(this.b);
         this.e.a();
      }
   }

   public void c() {
      this.c.a(this.b);
      this.e.d();
      this.d.a(this.b);
   }

   public void a(dja $$0, ai $$1) {
      alg $$2 = $$1.a();
      if ($$1.b().g() && "minecraft".equals($$2.b())) {
         long $$3 = $$0.ae();
         this.b.send(hoj.f, $$2x -> {
            $$2x.a(hol.D, $$2.toString());
            $$2x.a(hol.E, $$3);
         });
      }
   }
}
