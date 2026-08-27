import java.time.Duration;
import java.util.UUID;
import javax.annotation.Nullable;

public class gdy {
   private final UUID a = UUID.randomUUID();
   private final gdt b;
   private final gec c;
   private final gee d = new gee();
   private final geb e;
   private final ged f;

   public gdy(gdt $$0, boolean $$1, @Nullable Duration $$2, @Nullable String $$3) {
      this.c = new gec($$3);
      this.e = new geb();
      this.f = new ged($$1, $$2);
      this.b = $$0.decorate($$0x -> {
         this.c.a($$0x);
         $$0x.a(gdw.i, this.a);
      });
   }

   public void a() {
      this.e.a(this.b);
   }

   public void a(cpn $$0, boolean $$1) {
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

   public void a(cpq $$0, af $$1) {
      aeu $$2 = $$1.a();
      if ($$1.b().h() && "minecraft".equals($$2.b())) {
         long $$3 = $$0.V();
         this.b.send(gdu.f, $$2x -> {
            $$2x.a(gdw.D, $$2.toString());
            $$2x.a(gdw.E, $$3);
         });
      }
   }
}
