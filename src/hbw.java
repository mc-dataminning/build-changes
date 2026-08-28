import java.time.Duration;
import java.util.UUID;
import javax.annotation.Nullable;

public class hbw {
   private final UUID a = UUID.randomUUID();
   private final hbr b;
   private final hca c;
   private final hcc d = new hcc();
   private final hbz e;
   private final hcb f;

   public hbw(hbr $$0, boolean $$1, @Nullable Duration $$2, @Nullable String $$3) {
      this.c = new hca($$3);
      this.e = new hbz();
      this.f = new hcb($$1, $$2);
      this.b = $$0.decorate($$0x -> {
         this.c.a($$0x);
         $$0x.a(hbu.i, this.a);
      });
   }

   public void a() {
      this.e.a(this.b);
   }

   public void a(ddp $$0, boolean $$1) {
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

   public void a(dds $$0, ag $$1) {
      alb $$2 = $$1.a();
      if ($$1.b().g() && "minecraft".equals($$2.b())) {
         long $$3 = $$0.aa();
         this.b.send(hbs.f, $$2x -> {
            $$2x.a(hbu.D, $$2.toString());
            $$2x.a(hbu.E, $$3);
         });
      }
   }
}
