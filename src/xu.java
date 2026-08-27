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

public record xu(xz d, @Nullable xq e, xx f, @Nullable xe g, xi h) {
   public static final MapCodec<xu> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               xz.a.fieldOf("link").forGetter(xu::k),
               xq.a.optionalFieldOf("signature").forGetter($$0x -> Optional.ofNullable($$0x.e)),
               xx.a.forGetter(xu::m),
               xg.a.optionalFieldOf("unsigned_content").forGetter($$0x -> Optional.ofNullable($$0x.g)),
               xi.a.optionalFieldOf("filter_mask", xi.c).forGetter(xu::o)
            )
            .apply($$0, ($$0x, $$1, $$2, $$3, $$4) -> new xu($$0x, (xq)$$1.orElse(null), $$2, (xe)$$3.orElse(null), $$4))
   );
   private static final UUID i = ad.e;
   public static final Duration b = Duration.ofMinutes(5L);
   public static final Duration c = b.plus(Duration.ofMinutes(2L));

   public static xu a(String $$0) {
      return a(i, $$0);
   }

   public static xu a(UUID $$0, String $$1) {
      xx $$2 = xx.a($$1);
      xz $$3 = xz.a($$0);
      return new xu($$3, null, $$2, null, xi.c);
   }

   public xu a(xe $$0) {
      xe $$1 = !$$0.equals(xe.b(this.c())) ? $$0 : null;
      return new xu(this.d, this.e, this.f, $$1, this.h);
   }

   public xu a() {
      return this.g != null ? new xu(this.d, this.e, this.f, null, this.h) : this;
   }

   public xu a(xi $$0) {
      return this.h.equals($$0) ? this : new xu(this.d, this.e, this.f, this.g, $$0);
   }

   public xu a(boolean $$0) {
      return this.a($$0 ? this.h : xi.c);
   }

   public xu b() {
      xx $$0 = xx.a(this.c());
      xz $$1 = xz.a(this.g());
      return new xu($$1, null, $$0, this.g, this.h);
   }

   public static void a(ayx.a $$0, xz $$1, xx $$2) throws SignatureException {
      $$0.update(Ints.toByteArray(1));
      $$1.a($$0);
      $$2.a($$0);
   }

   public boolean a(ayy $$0) {
      return this.e != null && this.e.a($$0, $$0x -> a($$0x, this.d, this.f));
   }

   public String c() {
      return this.f.a();
   }

   public xe d() {
      return Objects.requireNonNullElseGet(this.g, () -> xe.b(this.c()));
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

   public xz k() {
      return this.d;
   }

   @Nullable
   public xq l() {
      return this.e;
   }

   public xx m() {
      return this.f;
   }

   @Nullable
   public xe n() {
      return this.g;
   }

   public xi o() {
      return this.h;
   }
}
