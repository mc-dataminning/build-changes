import java.time.Duration;
import java.util.UUID;
import javax.annotation.Nullable;

public class gez {
   private final UUID a = UUID.randomUUID();
   private final geu b;
   private final gfd c;
   private final gff d = new gff();
   private final gfc e;
   private final gfe f;

   public gez(geu $$0, boolean $$1, @Nullable Duration $$2, @Nullable String $$3) {
      this.c = new gfd($$3);
      this.e = new gfc();
      this.f = new gfe($$1, $$2);
      this.b = $$0.decorate($$0x -> {
         this.c.a($$0x);
         $$0x.a(gex.i, this.a);
      });
   }

   public void a() {
      this.e.a(this.b);
   }

   public void a(cqw $$0, boolean $$1) {
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

   public void a(cqz $$0, af $$1) {
      afw $$2 = $$1.a();
      if ($$1.b().h() && "minecraft".equals($$2.b())) {
         long $$3 = $$0.V();
         this.b.send(gev.f, $$2x -> {
            $$2x.a(gex.D, $$2.toString());
            $$2x.a(gex.E, $$3);
         });
      }
   }
}
