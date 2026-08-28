import java.time.Duration;
import java.util.UUID;
import javax.annotation.Nullable;

public class hgt {
   private final UUID a = UUID.randomUUID();
   private final hgo b;
   private final hgx c;
   private final hgz d = new hgz();
   private final hgw e;
   private final hgy f;

   public hgt(hgo $$0, boolean $$1, @Nullable Duration $$2, @Nullable String $$3) {
      this.c = new hgx($$3);
      this.e = new hgw();
      this.f = new hgy($$1, $$2);
      this.b = $$0.decorate($$0x -> {
         this.c.a($$0x);
         $$0x.a(hgr.i, this.a);
      });
   }

   public void a() {
      this.e.a(this.b);
   }

   public void a(dgx $$0, boolean $$1) {
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

   public void a(dha $$0, ah $$1) {
      alz $$2 = $$1.a();
      if ($$1.b().g() && "minecraft".equals($$2.b())) {
         long $$3 = $$0.ac();
         this.b.send(hgp.f, $$2x -> {
            $$2x.a(hgr.D, $$2.toString());
            $$2x.a(hgr.E, $$3);
         });
      }
   }
}
