import java.time.Duration;
import java.util.UUID;
import javax.annotation.Nullable;

public class gud {
   private final UUID a = UUID.randomUUID();
   private final gty b;
   private final guh c;
   private final guj d = new guj();
   private final gug e;
   private final gui f;

   public gud(gty $$0, boolean $$1, @Nullable Duration $$2, @Nullable String $$3) {
      this.c = new guh($$3);
      this.e = new gug();
      this.f = new gui($$1, $$2);
      this.b = $$0.decorate($$0x -> {
         this.c.a($$0x);
         $$0x.a(gub.i, this.a);
      });
   }

   public void a() {
      this.e.a(this.b);
   }

   public void a(dbq $$0, boolean $$1) {
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

   public void a(dbt $$0, af $$1) {
      alb $$2 = $$1.a();
      if ($$1.b().g() && "minecraft".equals($$2.b())) {
         long $$3 = $$0.Z();
         this.b.send(gtz.f, $$2x -> {
            $$2x.a(gub.D, $$2.toString());
            $$2x.a(gub.E, $$3);
         });
      }
   }
}
