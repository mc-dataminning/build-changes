import java.time.Duration;
import java.util.UUID;
import javax.annotation.Nullable;

public class gje {
   private final UUID a = UUID.randomUUID();
   private final giz b;
   private final gji c;
   private final gjk d = new gjk();
   private final gjh e;
   private final gjj f;

   public gje(giz $$0, boolean $$1, @Nullable Duration $$2, @Nullable String $$3) {
      this.c = new gji($$3);
      this.e = new gjh();
      this.f = new gjj($$1, $$2);
      this.b = $$0.decorate($$0x -> {
         this.c.a($$0x);
         $$0x.a(gjc.i, this.a);
      });
   }

   public void a() {
      this.e.a(this.b);
   }

   public void a(ctf $$0, boolean $$1) {
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

   public void a(cti $$0, af $$1) {
      ahd $$2 = $$1.a();
      if ($$1.b().g() && "minecraft".equals($$2.b())) {
         long $$3 = $$0.X();
         this.b.send(gja.f, $$2x -> {
            $$2x.a(gjc.D, $$2.toString());
            $$2x.a(gjc.E, $$3);
         });
      }
   }
}
