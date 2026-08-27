import java.time.Instant;
import javax.annotation.Nullable;

public record zi(String a, Instant b, long c, @Nullable th d, tc.b e) implements uo<zb> {
   public zi(sf $$0) {
      this($$0.e(256), $$0.v(), $$0.readLong(), $$0.c(th::a), new tc.b($$0));
   }

   @Override
   public void a(sf $$0) {
      $$0.a(this.a, 256);
      $$0.a(this.b);
      $$0.writeLong(this.c);
      $$0.a(this.d, th::a);
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

   @Nullable
   public th e() {
      return this.d;
   }

   public tc.b f() {
      return this.e;
   }
}
