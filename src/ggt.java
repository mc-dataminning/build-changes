import java.time.Duration;
import java.util.UUID;
import javax.annotation.Nullable;

public class ggt {
   private final UUID a = UUID.randomUUID();
   private final ggo b;
   private final ggx c;
   private final ggz d = new ggz();
   private final ggw e;
   private final ggy f;

   public ggt(ggo $$0, boolean $$1, @Nullable Duration $$2, @Nullable String $$3) {
      this.c = new ggx($$3);
      this.e = new ggw();
      this.f = new ggy($$1, $$2);
      this.b = $$0.decorate($$0x -> {
         this.c.a($$0x);
         $$0x.a(ggr.i, this.a);
      });
   }

   public void a() {
      this.e.a(this.b);
   }

   public void a(crx $$0, boolean $$1) {
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

   public void a(csa $$0, af $$1) {
      agi $$2 = $$1.a();
      if ($$1.b().h() && "minecraft".equals($$2.b())) {
         long $$3 = $$0.W();
         this.b.send(ggp.f, $$2x -> {
            $$2x.a(ggr.D, $$2.toString());
            $$2x.a(ggr.E, $$3);
         });
      }
   }
}
