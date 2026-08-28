import java.time.Duration;
import java.util.UUID;
import javax.annotation.Nullable;

public class hof {
   private final UUID a = UUID.randomUUID();
   private final hoa b;
   private final hoj c;
   private final hol d = new hol();
   private final hoi e;
   private final hok f;

   public hof(hoa $$0, boolean $$1, @Nullable Duration $$2, @Nullable String $$3) {
      this.c = new hoj($$3);
      this.e = new hoi();
      this.f = new hok($$1, $$2);
      this.b = $$0.decorate($$0x -> {
         this.c.a($$0x);
         $$0x.a(hod.i, this.a);
      });
   }

   public void a() {
      this.e.a(this.b);
   }

   public void a(dis $$0, boolean $$1) {
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

   public void a(div $$0, ai $$1) {
      alg $$2 = $$1.a();
      if ($$1.b().g() && "minecraft".equals($$2.b())) {
         long $$3 = $$0.ae();
         this.b.send(hob.f, $$2x -> {
            $$2x.a(hod.D, $$2.toString());
            $$2x.a(hod.E, $$3);
         });
      }
   }
}
