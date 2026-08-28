import java.time.Duration;
import java.util.UUID;
import javax.annotation.Nullable;

public class hmi {
   private final UUID a = UUID.randomUUID();
   private final hmd b;
   private final hmm c;
   private final hmo d = new hmo();
   private final hml e;
   private final hmn f;

   public hmi(hmd $$0, boolean $$1, @Nullable Duration $$2, @Nullable String $$3) {
      this.c = new hmm($$3);
      this.e = new hml();
      this.f = new hmn($$1, $$2);
      this.b = $$0.decorate($$0x -> {
         this.c.a($$0x);
         $$0x.a(hmg.i, this.a);
      });
   }

   public void a() {
      this.e.a(this.b);
   }

   public void a(dhm $$0, boolean $$1) {
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

   public void a(dhp $$0, ai $$1) {
      ald $$2 = $$1.a();
      if ($$1.b().g() && "minecraft".equals($$2.b())) {
         long $$3 = $$0.ae();
         this.b.send(hme.f, $$2x -> {
            $$2x.a(hmg.D, $$2.toString());
            $$2x.a(hmg.E, $$3);
         });
      }
   }
}
