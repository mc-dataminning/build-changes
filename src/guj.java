import java.time.Duration;
import java.util.UUID;
import javax.annotation.Nullable;

public class guj {
   private final UUID a = UUID.randomUUID();
   private final gue b;
   private final gun c;
   private final gup d = new gup();
   private final gum e;
   private final guo f;

   public guj(gue $$0, boolean $$1, @Nullable Duration $$2, @Nullable String $$3) {
      this.c = new gun($$3);
      this.e = new gum();
      this.f = new guo($$1, $$2);
      this.b = $$0.decorate($$0x -> {
         this.c.a($$0x);
         $$0x.a(guh.i, this.a);
      });
   }

   public void a() {
      this.e.a(this.b);
   }

   public void a(dbw $$0, boolean $$1) {
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

   public void a(dbz $$0, af $$1) {
      alf $$2 = $$1.a();
      if ($$1.b().g() && "minecraft".equals($$2.b())) {
         long $$3 = $$0.Z();
         this.b.send(guf.f, $$2x -> {
            $$2x.a(guh.D, $$2.toString());
            $$2x.a(guh.E, $$3);
         });
      }
   }
}
