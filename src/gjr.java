import java.time.Duration;
import java.util.UUID;
import javax.annotation.Nullable;

public class gjr {
   private final UUID a = UUID.randomUUID();
   private final gjm b;
   private final gjv c;
   private final gjx d = new gjx();
   private final gju e;
   private final gjw f;

   public gjr(gjm $$0, boolean $$1, @Nullable Duration $$2, @Nullable String $$3) {
      this.c = new gjv($$3);
      this.e = new gju();
      this.f = new gjw($$1, $$2);
      this.b = $$0.decorate($$0x -> {
         this.c.a($$0x);
         $$0x.a(gjp.i, this.a);
      });
   }

   public void a() {
      this.e.a(this.b);
   }

   public void a(ctm $$0, boolean $$1) {
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

   public void a(ctp $$0, af $$1) {
      ahg $$2 = $$1.a();
      if ($$1.b().g() && "minecraft".equals($$2.b())) {
         long $$3 = $$0.X();
         this.b.send(gjn.f, $$2x -> {
            $$2x.a(gjp.D, $$2.toString());
            $$2x.a(gjp.E, $$3);
         });
      }
   }
}
