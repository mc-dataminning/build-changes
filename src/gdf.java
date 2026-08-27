import java.time.Duration;
import java.util.UUID;
import javax.annotation.Nullable;

public class gdf {
   private final UUID a = UUID.randomUUID();
   private final gda b;
   private final gdj c;
   private final gdl d = new gdl();
   private final gdi e;
   private final gdk f;

   public gdf(gda $$0, boolean $$1, @Nullable Duration $$2, @Nullable String $$3) {
      this.c = new gdj($$3);
      this.e = new gdi();
      this.f = new gdk($$1, $$2);
      this.b = $$0.decorate($$0x -> {
         this.c.a($$0x);
         $$0x.a(gdd.i, this.a);
      });
   }

   public void a() {
      this.e.a(this.b);
   }

   public void a(cph $$0, boolean $$1) {
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

   public void a(cpk $$0, ae $$1) {
      aep $$2 = $$1.j();
      if ($$1.e() && "minecraft".equals($$2.b())) {
         long $$3 = $$0.V();
         this.b.send(gdb.f, $$2x -> {
            $$2x.a(gdd.D, $$2.toString());
            $$2x.a(gdd.E, $$3);
         });
      }
   }
}
