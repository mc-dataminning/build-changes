import java.time.Duration;
import java.util.UUID;
import javax.annotation.Nullable;

public class ggy {
   private final UUID a = UUID.randomUUID();
   private final ggt b;
   private final ghc c;
   private final ghe d = new ghe();
   private final ghb e;
   private final ghd f;

   public ggy(ggt $$0, boolean $$1, @Nullable Duration $$2, @Nullable String $$3) {
      this.c = new ghc($$3);
      this.e = new ghb();
      this.f = new ghd($$1, $$2);
      this.b = $$0.decorate($$0x -> {
         this.c.a($$0x);
         $$0x.a(ggw.i, this.a);
      });
   }

   public void a() {
      this.e.a(this.b);
   }

   public void a(csc $$0, boolean $$1) {
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

   public void a(csf $$0, af $$1) {
      agm $$2 = $$1.a();
      if ($$1.b().h() && "minecraft".equals($$2.b())) {
         long $$3 = $$0.W();
         this.b.send(ggu.f, $$2x -> {
            $$2x.a(ggw.D, $$2.toString());
            $$2x.a(ggw.E, $$3);
         });
      }
   }
}
