import java.time.Duration;
import java.util.UUID;
import javax.annotation.Nullable;

public class gdz {
   private final UUID a = UUID.randomUUID();
   private final gdu b;
   private final ged c;
   private final gef d = new gef();
   private final gec e;
   private final gee f;

   public gdz(gdu $$0, boolean $$1, @Nullable Duration $$2, @Nullable String $$3) {
      this.c = new ged($$3);
      this.e = new gec();
      this.f = new gee($$1, $$2);
      this.b = $$0.decorate($$0x -> {
         this.c.a($$0x);
         $$0x.a(gdx.i, this.a);
      });
   }

   public void a() {
      this.e.a(this.b);
   }

   public void a(cpy $$0, boolean $$1) {
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

   public void a(cqb $$0, af $$1) {
      aez $$2 = $$1.a();
      if ($$1.b().h() && "minecraft".equals($$2.b())) {
         long $$3 = $$0.V();
         this.b.send(gdv.f, $$2x -> {
            $$2x.a(gdx.D, $$2.toString());
            $$2x.a(gdx.E, $$3);
         });
      }
   }
}
