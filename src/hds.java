import java.time.Duration;
import java.util.UUID;
import javax.annotation.Nullable;

public class hds {
   private final UUID a = UUID.randomUUID();
   private final hdn b;
   private final hdw c;
   private final hdy d = new hdy();
   private final hdv e;
   private final hdx f;

   public hds(hdn $$0, boolean $$1, @Nullable Duration $$2, @Nullable String $$3) {
      this.c = new hdw($$3);
      this.e = new hdv();
      this.f = new hdx($$1, $$2);
      this.b = $$0.decorate($$0x -> {
         this.c.a($$0x);
         $$0x.a(hdq.i, this.a);
      });
   }

   public void a() {
      this.e.a(this.b);
   }

   public void a(dey $$0, boolean $$1) {
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

   public void a(dfb $$0, ah $$1) {
      ali $$2 = $$1.a();
      if ($$1.b().g() && "minecraft".equals($$2.b())) {
         long $$3 = $$0.aa();
         this.b.send(hdo.f, $$2x -> {
            $$2x.a(hdq.D, $$2.toString());
            $$2x.a(hdq.E, $$3);
         });
      }
   }
}
