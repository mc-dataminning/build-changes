import java.time.Duration;
import java.util.UUID;
import javax.annotation.Nullable;

public class hei {
   private final UUID a = UUID.randomUUID();
   private final hed b;
   private final hem c;
   private final heo d = new heo();
   private final hel e;
   private final hen f;

   public hei(hed $$0, boolean $$1, @Nullable Duration $$2, @Nullable String $$3) {
      this.c = new hem($$3);
      this.e = new hel();
      this.f = new hen($$1, $$2);
      this.b = $$0.decorate($$0x -> {
         this.c.a($$0x);
         $$0x.a(heg.i, this.a);
      });
   }

   public void a() {
      this.e.a(this.b);
   }

   public void a(dfc $$0, boolean $$1) {
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

   public void a(dff $$0, ah $$1) {
      all $$2 = $$1.a();
      if ($$1.b().g() && "minecraft".equals($$2.b())) {
         long $$3 = $$0.aa();
         this.b.send(hee.f, $$2x -> {
            $$2x.a(heg.D, $$2.toString());
            $$2x.a(heg.E, $$3);
         });
      }
   }
}
