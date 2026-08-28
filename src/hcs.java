import java.time.Duration;
import java.util.UUID;
import javax.annotation.Nullable;

public class hcs {
   private final UUID a = UUID.randomUUID();
   private final hcn b;
   private final hcw c;
   private final hcy d = new hcy();
   private final hcv e;
   private final hcx f;

   public hcs(hcn $$0, boolean $$1, @Nullable Duration $$2, @Nullable String $$3) {
      this.c = new hcw($$3);
      this.e = new hcv();
      this.f = new hcx($$1, $$2);
      this.b = $$0.decorate($$0x -> {
         this.c.a($$0x);
         $$0x.a(hcq.i, this.a);
      });
   }

   public void a() {
      this.e.a(this.b);
   }

   public void a(deg $$0, boolean $$1) {
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

   public void a(dej $$0, ag $$1) {
      ale $$2 = $$1.a();
      if ($$1.b().g() && "minecraft".equals($$2.b())) {
         long $$3 = $$0.aa();
         this.b.send(hco.f, $$2x -> {
            $$2x.a(hcq.D, $$2.toString());
            $$2x.a(hcq.E, $$3);
         });
      }
   }
}
