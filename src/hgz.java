import java.time.Duration;
import java.util.UUID;
import javax.annotation.Nullable;

public class hgz {
   private final UUID a = UUID.randomUUID();
   private final hgu b;
   private final hhd c;
   private final hhf d = new hhf();
   private final hhc e;
   private final hhe f;

   public hgz(hgu $$0, boolean $$1, @Nullable Duration $$2, @Nullable String $$3) {
      this.c = new hhd($$3);
      this.e = new hhc();
      this.f = new hhe($$1, $$2);
      this.b = $$0.decorate($$0x -> {
         this.c.a($$0x);
         $$0x.a(hgx.i, this.a);
      });
   }

   public void a() {
      this.e.a(this.b);
   }

   public void a(dhe $$0, boolean $$1) {
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

   public void a(dhh $$0, ah $$1) {
      alz $$2 = $$1.a();
      if ($$1.b().g() && "minecraft".equals($$2.b())) {
         long $$3 = $$0.ac();
         this.b.send(hgv.f, $$2x -> {
            $$2x.a(hgx.D, $$2.toString());
            $$2x.a(hgx.E, $$3);
         });
      }
   }
}
