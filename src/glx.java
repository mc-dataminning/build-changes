import java.time.Duration;
import java.util.UUID;
import javax.annotation.Nullable;

public class glx {
   private final UUID a = UUID.randomUUID();
   private final gls b;
   private final gmb c;
   private final gmd d = new gmd();
   private final gma e;
   private final gmc f;

   public glx(gls $$0, boolean $$1, @Nullable Duration $$2, @Nullable String $$3) {
      this.c = new gmb($$3);
      this.e = new gma();
      this.f = new gmc($$1, $$2);
      this.b = $$0.decorate($$0x -> {
         this.c.a($$0x);
         $$0x.a(glv.i, this.a);
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
         this.b.send(glt.f, $$2x -> {
            $$2x.a(glv.D, $$2.toString());
            $$2x.a(glv.E, $$3);
         });
      }
   }
}
