import com.google.common.primitives.Ints;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.security.SignatureException;
import java.time.Duration;
import java.time.Instant;
import java.util.Objects;
import java.util.Optional;
import java.util.UUID;
import javax.annotation.Nullable;

public record ye(yj d, @Nullable ya e, yh f, @Nullable xo g, xs h) {
   public static final MapCodec<ye> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               yj.a.fieldOf("link").forGetter(ye::k),
               ya.a.optionalFieldOf("signature").forGetter($$0x -> Optional.ofNullable($$0x.e)),
               yh.a.forGetter(ye::m),
               xq.a.optionalFieldOf("unsigned_content").forGetter($$0x -> Optional.ofNullable($$0x.g)),
               xs.a.optionalFieldOf("filter_mask", xs.c).forGetter(ye::o)
            )
            .apply($$0, ($$0x, $$1, $$2, $$3, $$4) -> new ye($$0x, (ya)$$1.orElse(null), $$2, (xo)$$3.orElse(null), $$4))
   );
   private static final UUID i = ac.e;
   public static final Duration b = Duration.ofMinutes(5L);
   public static final Duration c = b.plus(Duration.ofMinutes(2L));

   public static ye a(String $$0) {
      return a(i, $$0);
   }

   public static ye a(UUID $$0, String $$1) {
      yh $$2 = yh.a($$1);
      yj $$3 = yj.a($$0);
      return new ye($$3, null, $$2, null, xs.c);
   }

   public ye a(xo $$0) {
      xo $$1 = !$$0.equals(xo.b(this.c())) ? $$0 : null;
      return new ye(this.d, this.e, this.f, $$1, this.h);
   }

   public ye a() {
      return this.g != null ? new ye(this.d, this.e, this.f, null, this.h) : this;
   }

   public ye a(xs $$0) {
      return this.h.equals($$0) ? this : new ye(this.d, this.e, this.f, this.g, $$0);
   }

   public ye a(boolean $$0) {
      return this.a($$0 ? this.h : xs.c);
   }

   public ye b() {
      yh $$0 = yh.a(this.c());
      yj $$1 = yj.a(this.g());
      return new ye($$1, null, $$0, this.g, this.h);
   }

   public static void a(azj.a $$0, yj $$1, yh $$2) throws SignatureException {
      $$0.update(Ints.toByteArray(1));
      $$1.a($$0);
      $$2.a($$0);
   }

   public boolean a(azk $$0) {
      return this.e != null && this.e.a($$0, $$0x -> a($$0x, this.d, this.f));
   }

   public String c() {
      return this.f.a();
   }

   public xo d() {
      return Objects.requireNonNullElseGet(this.g, () -> xo.b(this.c()));
   }

   public Instant e() {
      return this.f.b();
   }

   public long f() {
      return this.f.c();
   }

   public boolean a(Instant $$0) {
      return $$0.isAfter(this.e().plus(b));
   }

   public boolean b(Instant $$0) {
      return $$0.isAfter(this.e().plus(c));
   }

   public UUID g() {
      return this.d.c();
   }

   public boolean h() {
      return this.g().equals(i);
   }

   public boolean i() {
      return this.e != null;
   }

   public boolean a(UUID $$0) {
      return this.i() && this.d.c().equals($$0);
   }

   public boolean j() {
      return this.h.b();
   }

   public yj k() {
      return this.d;
   }

   @Nullable
   public ya l() {
      return this.e;
   }

   public yh m() {
      return this.f;
   }

   @Nullable
   public xo n() {
      return this.g;
   }

   public xs o() {
      return this.h;
   }
}
