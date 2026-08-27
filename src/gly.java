import java.time.Duration;
import java.util.UUID;
import javax.annotation.Nullable;

public class gly {
   private final UUID a = UUID.randomUUID();
   private final glt b;
   private final gmc c;
   private final gme d = new gme();
   private final gmb e;
   private final gmd f;

   public gly(glt $$0, boolean $$1, @Nullable Duration $$2, @Nullable String $$3) {
      this.c = new gmc($$3);
      this.e = new gmb();
      this.f = new gmd($$1, $$2);
      this.b = $$0.decorate($$0x -> {
         this.c.a($$0x);
         $$0x.a(glw.i, this.a);
      });
   }

   public void a() {
      this.e.a(this.b);
   }

   public void a(cvk $$0, boolean $$1) {
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

   public void a(cvn $$0, af $$1) {
      aiy $$2 = $$1.a();
      if ($$1.b().g() && "minecraft".equals($$2.b())) {
         long $$3 = $$0.X();
         this.b.send(glu.f, $$2x -> {
            $$2x.a(glw.D, $$2.toString());
            $$2x.a(glw.E, $$3);
         });
      }
   }
}
