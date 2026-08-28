import java.time.Duration;
import java.util.UUID;
import javax.annotation.Nullable;

public class guw {
   private final UUID a = UUID.randomUUID();
   private final gur b;
   private final gva c;
   private final gvc d = new gvc();
   private final guz e;
   private final gvb f;

   public guw(gur $$0, boolean $$1, @Nullable Duration $$2, @Nullable String $$3) {
      this.c = new gva($$3);
      this.e = new guz();
      this.f = new gvb($$1, $$2);
      this.b = $$0.decorate($$0x -> {
         this.c.a($$0x);
         $$0x.a(guu.i, this.a);
      });
   }

   public void a() {
      this.e.a(this.b);
   }

   public void a(dcd $$0, boolean $$1) {
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

   public void a(dcg $$0, af $$1) {
      akk $$2 = $$1.a();
      if ($$1.b().g() && "minecraft".equals($$2.b())) {
         long $$3 = $$0.Z();
         this.b.send(gus.f, $$2x -> {
            $$2x.a(guu.D, $$2.toString());
            $$2x.a(guu.E, $$3);
         });
      }
   }
}
