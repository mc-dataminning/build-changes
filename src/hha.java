import java.time.Duration;
import java.util.UUID;
import javax.annotation.Nullable;

public class hha {
   private final UUID a = UUID.randomUUID();
   private final hgv b;
   private final hhe c;
   private final hhg d = new hhg();
   private final hhd e;
   private final hhf f;

   public hha(hgv $$0, boolean $$1, @Nullable Duration $$2, @Nullable String $$3) {
      this.c = new hhe($$3);
      this.e = new hhd();
      this.f = new hhf($$1, $$2);
      this.b = $$0.decorate($$0x -> {
         this.c.a($$0x);
         $$0x.a(hgy.i, this.a);
      });
   }

   public void a() {
      this.e.a(this.b);
   }

   public void a(dhf $$0, boolean $$1) {
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

   public void a(dhi $$0, ah $$1) {
      alz $$2 = $$1.a();
      if ($$1.b().g() && "minecraft".equals($$2.b())) {
         long $$3 = $$0.ac();
         this.b.send(hgw.f, $$2x -> {
            $$2x.a(hgy.D, $$2.toString());
            $$2x.a(hgy.E, $$3);
         });
      }
   }
}
