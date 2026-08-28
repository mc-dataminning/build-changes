import java.time.Duration;
import java.util.UUID;
import javax.annotation.Nullable;

public class hkh {
   private final UUID a = UUID.randomUUID();
   private final hkc b;
   private final hkl c;
   private final hkn d = new hkn();
   private final hkk e;
   private final hkm f;

   public hkh(hkc $$0, boolean $$1, @Nullable Duration $$2, @Nullable String $$3) {
      this.c = new hkl($$3);
      this.e = new hkk();
      this.f = new hkm($$1, $$2);
      this.b = $$0.decorate($$0x -> {
         this.c.a($$0x);
         $$0x.a(hkf.i, this.a);
      });
   }

   public void a() {
      this.e.a(this.b);
   }

   public void a(dge $$0, boolean $$1) {
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

   public void a(dgh $$0, ai $$1) {
      akv $$2 = $$1.a();
      if ($$1.b().g() && "minecraft".equals($$2.b())) {
         long $$3 = $$0.ad();
         this.b.send(hkd.f, $$2x -> {
            $$2x.a(hkf.D, $$2.toString());
            $$2x.a(hkf.E, $$3);
         });
      }
   }
}
