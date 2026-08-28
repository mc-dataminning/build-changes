import java.time.Duration;
import java.util.UUID;
import javax.annotation.Nullable;

public class gug {
   private final UUID a = UUID.randomUUID();
   private final gub b;
   private final guk c;
   private final gum d = new gum();
   private final guj e;
   private final gul f;

   public gug(gub $$0, boolean $$1, @Nullable Duration $$2, @Nullable String $$3) {
      this.c = new guk($$3);
      this.e = new guj();
      this.f = new gul($$1, $$2);
      this.b = $$0.decorate($$0x -> {
         this.c.a($$0x);
         $$0x.a(gue.i, this.a);
      });
   }

   public void a() {
      this.e.a(this.b);
   }

   public void a(dbt $$0, boolean $$1) {
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

   public void a(dbw $$0, af $$1) {
      ale $$2 = $$1.a();
      if ($$1.b().g() && "minecraft".equals($$2.b())) {
         long $$3 = $$0.Z();
         this.b.send(guc.f, $$2x -> {
            $$2x.a(gue.D, $$2.toString());
            $$2x.a(gue.E, $$3);
         });
      }
   }
}
