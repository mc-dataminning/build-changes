import java.time.Duration;
import java.util.UUID;
import javax.annotation.Nullable;

public class ged {
   private final UUID a = UUID.randomUUID();
   private final gdy b;
   private final geh c;
   private final gej d = new gej();
   private final geg e;
   private final gei f;

   public ged(gdy $$0, boolean $$1, @Nullable Duration $$2, @Nullable String $$3) {
      this.c = new geh($$3);
      this.e = new geg();
      this.f = new gei($$1, $$2);
      this.b = $$0.decorate($$0x -> {
         this.c.a($$0x);
         $$0x.a(geb.i, this.a);
      });
   }

   public void a() {
      this.e.a(this.b);
   }

   public void a(cps $$0, boolean $$1) {
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

   public void a(cpv $$0, af $$1) {
      aex $$2 = $$1.a();
      if ($$1.b().h() && "minecraft".equals($$2.b())) {
         long $$3 = $$0.V();
         this.b.send(gdz.f, $$2x -> {
            $$2x.a(geb.D, $$2.toString());
            $$2x.a(geb.E, $$3);
         });
      }
   }
}
