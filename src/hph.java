import java.time.Duration;
import java.util.UUID;
import javax.annotation.Nullable;

public class hph {
   private final UUID a = UUID.randomUUID();
   private final hpc b;
   private final hpl c;
   private final hpn d = new hpn();
   private final hpk e;
   private final hpm f;

   public hph(hpc $$0, boolean $$1, @Nullable Duration $$2, @Nullable String $$3) {
      this.c = new hpl($$3);
      this.e = new hpk();
      this.f = new hpm($$1, $$2);
      this.b = $$0.decorate($$0x -> {
         this.c.a($$0x);
         $$0x.a(hpf.i, this.a);
      });
   }

   public void a() {
      this.e.a(this.b);
   }

   public void a(djj $$0, boolean $$1) {
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

   public void a(djm $$0, aj $$1) {
      alg $$2 = $$1.a();
      if ($$1.b().g() && "minecraft".equals($$2.b())) {
         long $$3 = $$0.ae();
         this.b.send(hpd.f, $$2x -> {
            $$2x.a(hpf.D, $$2.toString());
            $$2x.a(hpf.E, $$3);
         });
      }
   }
}
