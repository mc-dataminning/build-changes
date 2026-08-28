import java.time.Duration;
import java.util.UUID;
import javax.annotation.Nullable;

public class guu {
   private final UUID a = UUID.randomUUID();
   private final gup b;
   private final guy c;
   private final gva d = new gva();
   private final gux e;
   private final guz f;

   public guu(gup $$0, boolean $$1, @Nullable Duration $$2, @Nullable String $$3) {
      this.c = new guy($$3);
      this.e = new gux();
      this.f = new guz($$1, $$2);
      this.b = $$0.decorate($$0x -> {
         this.c.a($$0x);
         $$0x.a(gus.i, this.a);
      });
   }

   public void a() {
      this.e.a(this.b);
   }

   public void a(dcc $$0, boolean $$1) {
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

   public void a(dcf $$0, af $$1) {
      akk $$2 = $$1.a();
      if ($$1.b().g() && "minecraft".equals($$2.b())) {
         long $$3 = $$0.Z();
         this.b.send(guq.f, $$2x -> {
            $$2x.a(gus.D, $$2.toString());
            $$2x.a(gus.E, $$3);
         });
      }
   }
}
