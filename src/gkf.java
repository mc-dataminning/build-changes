import java.time.Duration;
import java.util.UUID;
import javax.annotation.Nullable;

public class gkf {
   private final UUID a = UUID.randomUUID();
   private final gka b;
   private final gkj c;
   private final gkl d = new gkl();
   private final gki e;
   private final gkk f;

   public gkf(gka $$0, boolean $$1, @Nullable Duration $$2, @Nullable String $$3) {
      this.c = new gkj($$3);
      this.e = new gki();
      this.f = new gkk($$1, $$2);
      this.b = $$0.decorate($$0x -> {
         this.c.a($$0x);
         $$0x.a(gkd.i, this.a);
      });
   }

   public void a() {
      this.e.a(this.b);
   }

   public void a(ctu $$0, boolean $$1) {
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

   public void a(ctx $$0, af $$1) {
      ahh $$2 = $$1.a();
      if ($$1.b().g() && "minecraft".equals($$2.b())) {
         long $$3 = $$0.X();
         this.b.send(gkb.f, $$2x -> {
            $$2x.a(gkd.D, $$2.toString());
            $$2x.a(gkd.E, $$3);
         });
      }
   }
}
