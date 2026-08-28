import java.time.Duration;
import java.util.UUID;
import javax.annotation.Nullable;

public class hkb {
   private final UUID a = UUID.randomUUID();
   private final hjw b;
   private final hkf c;
   private final hkh d = new hkh();
   private final hke e;
   private final hkg f;

   public hkb(hjw $$0, boolean $$1, @Nullable Duration $$2, @Nullable String $$3) {
      this.c = new hkf($$3);
      this.e = new hke();
      this.f = new hkg($$1, $$2);
      this.b = $$0.decorate($$0x -> {
         this.c.a($$0x);
         $$0x.a(hjz.i, this.a);
      });
   }

   public void a() {
      this.e.a(this.b);
   }

   public void a(dgf $$0, boolean $$1) {
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

   public void a(dgi $$0, ai $$1) {
      aku $$2 = $$1.a();
      if ($$1.b().g() && "minecraft".equals($$2.b())) {
         long $$3 = $$0.ad();
         this.b.send(hjx.f, $$2x -> {
            $$2x.a(hjz.D, $$2.toString());
            $$2x.a(hjz.E, $$3);
         });
      }
   }
}
