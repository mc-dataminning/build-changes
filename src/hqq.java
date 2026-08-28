import java.time.Duration;
import java.util.UUID;
import javax.annotation.Nullable;

public class hqq {
   private final UUID a = UUID.randomUUID();
   private final hql b;
   private final hqu c;
   private final hqw d = new hqw();
   private final hqt e;
   private final hqv f;

   public hqq(hql $$0, boolean $$1, @Nullable Duration $$2, @Nullable String $$3) {
      this.c = new hqu($$3);
      this.e = new hqt();
      this.f = new hqv($$1, $$2);
      this.b = $$0.decorate($$0x -> {
         this.c.a($$0x);
         $$0x.a(hqo.i, this.a);
      });
   }

   public void a() {
      this.e.a(this.b);
   }

   public void a(dju $$0, boolean $$1) {
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

   public void a(djx $$0, aj $$1) {
      ali $$2 = $$1.a();
      if ($$1.b().g() && "minecraft".equals($$2.b())) {
         long $$3 = $$0.ae();
         this.b.send(hqm.f, $$2x -> {
            $$2x.a(hqo.D, $$2.toString());
            $$2x.a(hqo.E, $$3);
         });
      }
   }
}
