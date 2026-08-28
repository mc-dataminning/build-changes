import java.time.Duration;
import java.util.UUID;
import javax.annotation.Nullable;

public class hkj {
   private final UUID a = UUID.randomUUID();
   private final hke b;
   private final hkn c;
   private final hkp d = new hkp();
   private final hkm e;
   private final hko f;

   public hkj(hke $$0, boolean $$1, @Nullable Duration $$2, @Nullable String $$3) {
      this.c = new hkn($$3);
      this.e = new hkm();
      this.f = new hko($$1, $$2);
      this.b = $$0.decorate($$0x -> {
         this.c.a($$0x);
         $$0x.a(hkh.i, this.a);
      });
   }

   public void a() {
      this.e.a(this.b);
   }

   public void a(dgg $$0, boolean $$1) {
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

   public void a(dgj $$0, ai $$1) {
      akv $$2 = $$1.a();
      if ($$1.b().g() && "minecraft".equals($$2.b())) {
         long $$3 = $$0.ad();
         this.b.send(hkf.f, $$2x -> {
            $$2x.a(hkh.D, $$2.toString());
            $$2x.a(hkh.E, $$3);
         });
      }
   }
}
