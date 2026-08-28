import java.time.Duration;
import java.util.UUID;
import javax.annotation.Nullable;

public class het {
   private final UUID a = UUID.randomUUID();
   private final heo b;
   private final hex c;
   private final hez d = new hez();
   private final hew e;
   private final hey f;

   public het(heo $$0, boolean $$1, @Nullable Duration $$2, @Nullable String $$3) {
      this.c = new hex($$3);
      this.e = new hew();
      this.f = new hey($$1, $$2);
      this.b = $$0.decorate($$0x -> {
         this.c.a($$0x);
         $$0x.a(her.i, this.a);
      });
   }

   public void a() {
      this.e.a(this.b);
   }

   public void a(dfj $$0, boolean $$1) {
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

   public void a(dfm $$0, ah $$1) {
      alj $$2 = $$1.a();
      if ($$1.b().g() && "minecraft".equals($$2.b())) {
         long $$3 = $$0.ab();
         this.b.send(hep.f, $$2x -> {
            $$2x.a(her.D, $$2.toString());
            $$2x.a(her.E, $$3);
         });
      }
   }
}
