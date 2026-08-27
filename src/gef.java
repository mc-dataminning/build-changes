import java.time.Duration;
import java.util.UUID;
import javax.annotation.Nullable;

public class gef {
   private final UUID a = UUID.randomUUID();
   private final gea b;
   private final gej c;
   private final gel d = new gel();
   private final gei e;
   private final gek f;

   public gef(gea $$0, boolean $$1, @Nullable Duration $$2, @Nullable String $$3) {
      this.c = new gej($$3);
      this.e = new gei();
      this.f = new gek($$1, $$2);
      this.b = $$0.decorate($$0x -> {
         this.c.a($$0x);
         $$0x.a(ged.i, this.a);
      });
   }

   public void a() {
      this.e.a(this.b);
   }

   public void a(cpu $$0, boolean $$1) {
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

   public void a(cpx $$0, af $$1) {
      aey $$2 = $$1.a();
      if ($$1.b().h() && "minecraft".equals($$2.b())) {
         long $$3 = $$0.V();
         this.b.send(geb.f, $$2x -> {
            $$2x.a(ged.D, $$2.toString());
            $$2x.a(ged.E, $$3);
         });
      }
   }
}
