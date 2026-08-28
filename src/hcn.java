import java.time.Duration;
import java.util.UUID;
import javax.annotation.Nullable;

public class hcn {
   private final UUID a = UUID.randomUUID();
   private final hci b;
   private final hcr c;
   private final hct d = new hct();
   private final hcq e;
   private final hcs f;

   public hcn(hci $$0, boolean $$1, @Nullable Duration $$2, @Nullable String $$3) {
      this.c = new hcr($$3);
      this.e = new hcq();
      this.f = new hcs($$1, $$2);
      this.b = $$0.decorate($$0x -> {
         this.c.a($$0x);
         $$0x.a(hcl.i, this.a);
      });
   }

   public void a() {
      this.e.a(this.b);
   }

   public void a(ded $$0, boolean $$1) {
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

   public void a(deg $$0, ag $$1) {
      alc $$2 = $$1.a();
      if ($$1.b().g() && "minecraft".equals($$2.b())) {
         long $$3 = $$0.aa();
         this.b.send(hcj.f, $$2x -> {
            $$2x.a(hcl.D, $$2.toString());
            $$2x.a(hcl.E, $$3);
         });
      }
   }
}
