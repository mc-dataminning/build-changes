import java.time.Duration;
import java.util.UUID;
import javax.annotation.Nullable;

public class gin {
   private final UUID a = UUID.randomUUID();
   private final gii b;
   private final gir c;
   private final git d = new git();
   private final giq e;
   private final gis f;

   public gin(gii $$0, boolean $$1, @Nullable Duration $$2, @Nullable String $$3) {
      this.c = new gir($$3);
      this.e = new giq();
      this.f = new gis($$1, $$2);
      this.b = $$0.decorate($$0x -> {
         this.c.a($$0x);
         $$0x.a(gil.i, this.a);
      });
   }

   public void a() {
      this.e.a(this.b);
   }

   public void a(csv $$0, boolean $$1) {
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

   public void a(csy $$0, af $$1) {
      agt $$2 = $$1.a();
      if ($$1.b().g() && "minecraft".equals($$2.b())) {
         long $$3 = $$0.W();
         this.b.send(gij.f, $$2x -> {
            $$2x.a(gil.D, $$2.toString());
            $$2x.a(gil.E, $$3);
         });
      }
   }
}
