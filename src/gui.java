import java.time.Duration;
import java.util.UUID;
import javax.annotation.Nullable;

public class gui {
   private final UUID a = UUID.randomUUID();
   private final gud b;
   private final gum c;
   private final guo d = new guo();
   private final gul e;
   private final gun f;

   public gui(gud $$0, boolean $$1, @Nullable Duration $$2, @Nullable String $$3) {
      this.c = new gum($$3);
      this.e = new gul();
      this.f = new gun($$1, $$2);
      this.b = $$0.decorate($$0x -> {
         this.c.a($$0x);
         $$0x.a(gug.i, this.a);
      });
   }

   public void a() {
      this.e.a(this.b);
   }

   public void a(dbv $$0, boolean $$1) {
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

   public void a(dby $$0, af $$1) {
      alf $$2 = $$1.a();
      if ($$1.b().g() && "minecraft".equals($$2.b())) {
         long $$3 = $$0.Z();
         this.b.send(gue.f, $$2x -> {
            $$2x.a(gug.D, $$2.toString());
            $$2x.a(gug.E, $$3);
         });
      }
   }
}
