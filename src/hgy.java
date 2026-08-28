import java.time.Duration;
import java.util.UUID;
import javax.annotation.Nullable;

public class hgy {
   private final UUID a = UUID.randomUUID();
   private final hgt b;
   private final hhc c;
   private final hhe d = new hhe();
   private final hhb e;
   private final hhd f;

   public hgy(hgt $$0, boolean $$1, @Nullable Duration $$2, @Nullable String $$3) {
      this.c = new hhc($$3);
      this.e = new hhb();
      this.f = new hhd($$1, $$2);
      this.b = $$0.decorate($$0x -> {
         this.c.a($$0x);
         $$0x.a(hgw.i, this.a);
      });
   }

   public void a() {
      this.e.a(this.b);
   }

   public void a(dhe $$0, boolean $$1) {
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

   public void a(dhh $$0, ah $$1) {
      alz $$2 = $$1.a();
      if ($$1.b().g() && "minecraft".equals($$2.b())) {
         long $$3 = $$0.ac();
         this.b.send(hgu.f, $$2x -> {
            $$2x.a(hgw.D, $$2.toString());
            $$2x.a(hgw.E, $$3);
         });
      }
   }
}
