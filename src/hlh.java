import java.time.Duration;
import java.util.UUID;
import javax.annotation.Nullable;

public class hlh {
   private final UUID a = UUID.randomUUID();
   private final hlc b;
   private final hll c;
   private final hln d = new hln();
   private final hlk e;
   private final hlm f;

   public hlh(hlc $$0, boolean $$1, @Nullable Duration $$2, @Nullable String $$3) {
      this.c = new hll($$3);
      this.e = new hlk();
      this.f = new hlm($$1, $$2);
      this.b = $$0.decorate($$0x -> {
         this.c.a($$0x);
         $$0x.a(hlf.i, this.a);
      });
   }

   public void a() {
      this.e.a(this.b);
   }

   public void a(dgw $$0, boolean $$1) {
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

   public void a(dgz $$0, ai $$1) {
      aku $$2 = $$1.a();
      if ($$1.b().g() && "minecraft".equals($$2.b())) {
         long $$3 = $$0.ae();
         this.b.send(hld.f, $$2x -> {
            $$2x.a(hlf.D, $$2.toString());
            $$2x.a(hlf.E, $$3);
         });
      }
   }
}
