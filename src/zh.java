import java.time.Instant;

public record zh(String a, Instant b, long c, dw d, tc.b e) implements uo<zb> {
   public zh(sf $$0) {
      this($$0.e(256), $$0.v(), $$0.readLong(), new dw($$0), new tc.b($$0));
   }

   @Override
   public void a(sf $$0) {
      $$0.a(this.a, 256);
      $$0.a(this.b);
      $$0.writeLong(this.c);
      this.d.a($$0);
      this.e.a($$0);
   }

   public void a(zb $$0) {
      $$0.a(this);
   }

   public Instant c() {
      return this.b;
   }

   public long d() {
      return this.c;
   }

   public dw e() {
      return this.d;
   }

   public tc.b f() {
      return this.e;
   }
}
