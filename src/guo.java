import java.time.Duration;
import java.util.UUID;
import javax.annotation.Nullable;

public class guo {
   private final UUID a = UUID.randomUUID();
   private final guj b;
   private final gus c;
   private final guu d = new guu();
   private final gur e;
   private final gut f;

   public guo(guj $$0, boolean $$1, @Nullable Duration $$2, @Nullable String $$3) {
      this.c = new gus($$3);
      this.e = new gur();
      this.f = new gut($$1, $$2);
      this.b = $$0.decorate($$0x -> {
         this.c.a($$0x);
         $$0x.a(gum.i, this.a);
      });
   }

   public void a() {
      this.e.a(this.b);
   }

   public void a(dca $$0, boolean $$1) {
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

   public void a(dcd $$0, af $$1) {
      akk $$2 = $$1.a();
      if ($$1.b().g() && "minecraft".equals($$2.b())) {
         long $$3 = $$0.Z();
         this.b.send(guk.f, $$2x -> {
            $$2x.a(gum.D, $$2.toString());
            $$2x.a(gum.E, $$3);
         });
      }
   }
}
