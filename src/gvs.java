import java.time.Duration;
import java.util.UUID;
import javax.annotation.Nullable;

public class gvs {
   private final UUID a = UUID.randomUUID();
   private final gvn b;
   private final gvw c;
   private final gvy d = new gvy();
   private final gvv e;
   private final gvx f;

   public gvs(gvn $$0, boolean $$1, @Nullable Duration $$2, @Nullable String $$3) {
      this.c = new gvw($$3);
      this.e = new gvv();
      this.f = new gvx($$1, $$2);
      this.b = $$0.decorate($$0x -> {
         this.c.a($$0x);
         $$0x.a(gvq.i, this.a);
      });
   }

   public void a() {
      this.e.a(this.b);
   }

   public void a(dct $$0, boolean $$1) {
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

   public void a(dcw $$0, ag $$1) {
      akr $$2 = $$1.a();
      if ($$1.b().g() && "minecraft".equals($$2.b())) {
         long $$3 = $$0.Z();
         this.b.send(gvo.f, $$2x -> {
            $$2x.a(gvq.D, $$2.toString());
            $$2x.a(gvq.E, $$3);
         });
      }
   }
}
