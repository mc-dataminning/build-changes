import java.time.Duration;
import java.util.UUID;
import javax.annotation.Nullable;

public class hnp {
   private final UUID a = UUID.randomUUID();
   private final hnk b;
   private final hnt c;
   private final hnv d = new hnv();
   private final hns e;
   private final hnu f;

   public hnp(hnk $$0, boolean $$1, @Nullable Duration $$2, @Nullable String $$3) {
      this.c = new hnt($$3);
      this.e = new hns();
      this.f = new hnu($$1, $$2);
      this.b = $$0.decorate($$0x -> {
         this.c.a($$0x);
         $$0x.a(hnn.i, this.a);
      });
   }

   public void a() {
      this.e.a(this.b);
   }

   public void a(dim $$0, boolean $$1) {
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

   public void a(dip $$0, ai $$1) {
      ale $$2 = $$1.a();
      if ($$1.b().g() && "minecraft".equals($$2.b())) {
         long $$3 = $$0.ae();
         this.b.send(hnl.f, $$2x -> {
            $$2x.a(hnn.D, $$2.toString());
            $$2x.a(hnn.E, $$3);
         });
      }
   }
}
