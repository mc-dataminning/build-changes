import java.time.Duration;
import java.util.UUID;
import javax.annotation.Nullable;

public class gdt {
   private final UUID a = UUID.randomUUID();
   private final gdo b;
   private final gdx c;
   private final gdz d = new gdz();
   private final gdw e;
   private final gdy f;

   public gdt(gdo $$0, boolean $$1, @Nullable Duration $$2, @Nullable String $$3) {
      this.c = new gdx($$3);
      this.e = new gdw();
      this.f = new gdy($$1, $$2);
      this.b = $$0.decorate($$0x -> {
         this.c.a($$0x);
         $$0x.a(gdr.i, this.a);
      });
   }

   public void a() {
      this.e.a(this.b);
   }

   public void a(cpi $$0, boolean $$1) {
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

   public void a(cpl $$0, ae $$1) {
      aer $$2 = $$1.j();
      if ($$1.e() && "minecraft".equals($$2.b())) {
         long $$3 = $$0.V();
         this.b.send(gdp.f, $$2x -> {
            $$2x.a(gdr.D, $$2.toString());
            $$2x.a(gdr.E, $$3);
         });
      }
   }
}
