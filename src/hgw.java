import java.time.Duration;
import java.util.UUID;
import javax.annotation.Nullable;

public class hgw {
   private final UUID a = UUID.randomUUID();
   private final hgr b;
   private final hha c;
   private final hhc d = new hhc();
   private final hgz e;
   private final hhb f;

   public hgw(hgr $$0, boolean $$1, @Nullable Duration $$2, @Nullable String $$3) {
      this.c = new hha($$3);
      this.e = new hgz();
      this.f = new hhb($$1, $$2);
      this.b = $$0.decorate($$0x -> {
         this.c.a($$0x);
         $$0x.a(hgu.i, this.a);
      });
   }

   public void a() {
      this.e.a(this.b);
   }

   public void a(dgw $$0, boolean $$1) {
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

   public void a(dgz $$0, ah $$1) {
      alp $$2 = $$1.a();
      if ($$1.b().g() && "minecraft".equals($$2.b())) {
         long $$3 = $$0.ad();
         this.b.send(hgs.f, $$2x -> {
            $$2x.a(hgu.D, $$2.toString());
            $$2x.a(hgu.E, $$3);
         });
      }
   }
}
