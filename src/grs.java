import java.time.Duration;
import java.util.UUID;
import javax.annotation.Nullable;

public class grs {
   private final UUID a = UUID.randomUUID();
   private final grn b;
   private final grw c;
   private final gry d = new gry();
   private final grv e;
   private final grx f;

   public grs(grn $$0, boolean $$1, @Nullable Duration $$2, @Nullable String $$3) {
      this.c = new grw($$3);
      this.e = new grv();
      this.f = new grx($$1, $$2);
      this.b = $$0.decorate($$0x -> {
         this.c.a($$0x);
         $$0x.a(grq.i, this.a);
      });
   }

   public void a() {
      this.e.a(this.b);
   }

   public void a(czr $$0, boolean $$1) {
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

   public void a(czu $$0, af $$1) {
      akf $$2 = $$1.a();
      if ($$1.b().g() && "minecraft".equals($$2.b())) {
         long $$3 = $$0.Y();
         this.b.send(gro.f, $$2x -> {
            $$2x.a(grq.D, $$2.toString());
            $$2x.a(grq.E, $$3);
         });
      }
   }
}
