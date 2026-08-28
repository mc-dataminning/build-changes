import java.time.Duration;
import java.util.UUID;
import javax.annotation.Nullable;

public class hqg {
   private final UUID a = UUID.randomUUID();
   private final hqb b;
   private final hqk c;
   private final hqm d = new hqm();
   private final hqj e;
   private final hql f;

   public hqg(hqb $$0, boolean $$1, @Nullable Duration $$2, @Nullable String $$3) {
      this.c = new hqk($$3);
      this.e = new hqj();
      this.f = new hql($$1, $$2);
      this.b = $$0.decorate($$0x -> {
         this.c.a($$0x);
         $$0x.a(hqe.i, this.a);
      });
   }

   public void a() {
      this.e.a(this.b);
   }

   public void a(dkg $$0, boolean $$1) {
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

   public void a(dkj $$0, aj $$1) {
      alr $$2 = $$1.a();
      if ($$1.b().g() && "minecraft".equals($$2.b())) {
         long $$3 = $$0.ae();
         this.b.send(hqc.f, $$2x -> {
            $$2x.a(hqe.D, $$2.toString());
            $$2x.a(hqe.E, $$3);
         });
      }
   }
}
